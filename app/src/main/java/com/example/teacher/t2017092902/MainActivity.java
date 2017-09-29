package com.example.teacher.t2017092902;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb = (ProgressBar) findViewById(R.id.progressBar);
    }
    public void click1(View v)
    {
        pb.setVisibility(View.VISIBLE);
    }
    public void click2(View v)
    {
        pb.setVisibility(View.INVISIBLE);
    }
    public void click3(View v)
    {
        pb.setVisibility(View.VISIBLE);
        new Thread(){
            @Override
            public void run()
            {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                pb.setVisibility(View.INVISIBLE);
            }
        }.start();


    }
}
