package net.yszero.frameworktest.rxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import net.yszero.frameworktest.R;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import static java.lang.Thread.sleep;

public class RxJavaActivity extends AppCompatActivity {

    private final String TAG = "RxJavaActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_java);


        novel.subscribe(reader);//一行代码搞定
    }


    //被观察者
    Observable novel = Observable.create(new ObservableOnSubscribe<String>() {
        @Override
        public void subscribe(ObservableEmitter<String> emitter) throws Exception {
            emitter.onNext("连载1");

            for (int i = 0; i < 5; i++) {
                sleep(1000);            //注意，这里是主线程
                Log.e(TAG, i + "");
            }
            emitter.onNext("连载2");
            emitter.onNext("连载3");
            emitter.onComplete();
        }
    });

    private Disposable mDisposable;

    //观察者
    Observer<String> reader = new Observer<String>() {
        @Override
        public void onSubscribe(Disposable d) {     //开始
            mDisposable = d;
            Log.e(TAG, "onSubscribe");
        }

        @Override
        public void onNext(String value) {
            if ("2".equals(value)) {
                mDisposable.dispose();
                return;
            }
            Log.e(TAG, "onNext:" + value);
        }

        @Override
        public void onError(Throwable e) {      //出错
            Log.e(TAG, "onError=" + e.getMessage());
        }

        @Override
        public void onComplete() {      //结束
            Log.e(TAG, "onComplete()");
        }
    };


    //Observable c = Observable.just().subscribeOn()

}
