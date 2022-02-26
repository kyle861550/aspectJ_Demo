package com.alien.demo_aspectj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AspectJActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aspect_jactivity);

        call();

        execution();

        execution_around();
    }

    private void call() {
        System.out.println("call");

        call_around();
    }

    private void call_around() {
        System.out.println("call_around");
    }

    private void execution() {
        System.out.println("execution");
    }

    private void execution_around() {
        System.out.println("execution_around");
    }

    private void ttt() {
        new AspectJBean_1(9527);
    }
}