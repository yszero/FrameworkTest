package net.yszero.frameworktest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import net.yszero.frameworktest.butterknife.ButterknifeActivity;
import net.yszero.frameworktest.rxjava.RxJavaActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.activity_main_go_rxjava).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RxJavaActivity.class));
            }
        });

        findViewById(R.id.activity_main_go_butterknife).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ButterknifeActivity.class));
            }
        });
    }
}
