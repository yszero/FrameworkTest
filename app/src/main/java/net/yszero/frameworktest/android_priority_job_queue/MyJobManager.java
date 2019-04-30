package net.yszero.frameworktest.android_priority_job_queue;

import android.content.Context;
import android.util.Log;

import com.birbit.android.jobqueue.JobManager;
import com.birbit.android.jobqueue.config.Configuration;
import com.birbit.android.jobqueue.log.CustomLogger;

public class MyJobManager {

    private JobManager jobManager;

    public MyJobManager(Context context) {
        configureJobManager(context);  //2. 配置JobMananger
    }


    public JobManager getJobManager() {

        return jobManager;
    }

    private void configureJobManager(Context context) {
        //3. JobManager的配置器，利用Builder模式
        Configuration configuration = new Configuration.Builder(context).customLogger(new CustomLogger() {

            private static final String TAG = "JOBS";

            @Override
            public boolean isDebugEnabled() {
                return true;
            }

            @Override
            public void d(String text, Object... args) {
                Log.d(TAG, String.format(text, args));
            }

            @Override
            public void e(Throwable t, String text, Object... args) {
                Log.e(TAG, String.format(text, args), t);
            }

            @Override
            public void e(String text, Object... args) {
                Log.e(TAG, String.format(text, args));
            }

            @Override
            public void v(String text, Object... args) {
                Log.v(TAG, String.format(text, args));
            }
        }).minConsumerCount(1)      //always keep at least one consumer alive
                .maxConsumerCount(3)    //up to 3 consumers at a time
                .loadFactor(3)      //3 jobs per consumer
                .consumerKeepAlive(120) //wait 2 minute
                .build();

        jobManager = new JobManager(configuration);
    }

}
