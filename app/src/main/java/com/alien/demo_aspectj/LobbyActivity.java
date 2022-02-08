package com.alien.demo_aspectj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class LobbyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);

        MainActivity.testStaticFunction();

        Log.i("TEST123", "~~~~~: " + MainActivity.testStaticFunctionWithReturn() + ", Thread: " + Thread.currentThread().getName());

        findViewById(R.id.Test_Lobby_Btn).setOnClickListener((__) -> {

            Log.i("TEST123", "LobbyActivity#onClick start");

            int[] test = new int[5];

            Toast.makeText(this, "Lobby Activity: " + test.length, Toast.LENGTH_SHORT).show();

            Log.i("TEST123", "LobbyActivity#onClick finish");
        });
    }

}