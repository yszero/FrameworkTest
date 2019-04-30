package net.yszero.frameworktest.android_priority_job_queue;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import com.birbit.android.jobqueue.Job;
import com.birbit.android.jobqueue.Params;
import com.birbit.android.jobqueue.RetryConstraint;

public class MyJob extends Job {

    public static final int PRIORITY = 1;
    private String text;
    String TAG = "Myjob";
    int sleepTime;

    protected MyJob(String text) {
        // A job should be persisted in case the application exits
        // before job is completed.
        super(new Params(PRIORITY).persist());

        this.text = text;
        sleepTime = 5;
        Log.i(TAG, text + "  goin");
    }


    @Override
    public void onAdded() {
        //任务加入队列并被保存在硬盘上，定义此时要处理的逻辑；
        // Job has been saved to disk.
        // This is a good place to dispatch a UI event
        // to indicate the job will eventually run.
        Log.i(TAG, text + "  Onadded");
    }

    @Override
    public void onRun() throws Throwable {
        //任务开始执执行，在此定义任务的主题逻辑，当执行完毕后，任务将被从任务队列中删除；
        // Job logic goes here.
        // All work done here should be synchronous,
        // a job is removed from the queue once onRun() finishes.
        Thread.sleep(sleepTime * 1000);
        Log.i(TAG, text + "  onRun");
    }

    @Override
    protected void onCancel(int cancelReason, @Nullable Throwable throwable) {
        //任务取消的时候要执行的逻辑；
    }

    @Override
    protected RetryConstraint shouldReRunOnThrowable(@NonNull Throwable throwable, int runCount, int maxRunCount) {
        //当onRun()方法中抛出异常时，就会调用该函数，该函数返回Job类在执行发生异常时的应对策略，是重新执行还是取消，或者是一定时间之后再尝试。
        // An error occurred in onRun.
        // Return value determines whether this job should retry or cancel. You can further
        // specify a backoff strategy or change the job's priority. You can also apply the
        // delay to the whole group to preserve jobs' running order.
        return RetryConstraint.createExponentialBackoff(runCount, 10);
    }
}
