package net.yszero.frameworktest;

import android.app.Application;
import android.util.Log;

import com.birbit.android.jobqueue.JobManager;
import com.birbit.android.jobqueue.config.Configuration;
import com.birbit.android.jobqueue.log.CustomLogger;

import net.yszero.frameworktest.android_priority_job_queue.MyJobManager;

public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;    //1. Application的实例

        myJobManager = new MyJobManager(this);  //初始化
    }

    private static App instance;

    public static App getInstance() {
        return instance;
    }

    private MyJobManager myJobManager;

    public JobManager getJobManager() {
        return myJobManager.getJobManager();
    }


}
