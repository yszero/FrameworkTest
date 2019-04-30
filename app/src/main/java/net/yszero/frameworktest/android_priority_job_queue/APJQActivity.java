package net.yszero.frameworktest.android_priority_job_queue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.birbit.android.jobqueue.JobManager;

import net.yszero.frameworktest.App;
import net.yszero.frameworktest.R;

public class APJQActivity extends AppCompatActivity {

    private JobManager jobManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apjq);

        jobManager = App.getInstance().getJobManager();
        findViewById(R.id.activity_apjq_btn_run_job).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 10; i++) {
                    //将任务加入后台队列中
                    jobManager.addJobInBackground(new MyJob("" + i));
                }

            }
        });
    }
}
