package com.alien.demo_aspectj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.Test_Btn).setOnClickListener(this);

//        testThrowException();
        testPointCutThrow();

        testStudentBean();

        flowFunction();
    }

    private void testStudentBean() {
        StudentBean studentBean1 = new StudentBean("Alien", 18);
        studentBean1.setName("Pan");
        studentBean1.setAge(19);
        studentBean1.setId(123456789);
        studentBean1.setOther(987654321, "Universal");

        String name = studentBean1.getName();
        Log.i("TEST123", "MainActivity#testStudentBean: " + name);
    }

    private void flowFunction() {
        logFunction();

        List<String> list = new ArrayList<>();

//        list = getList();

        getString();

        list.add(getString());


        Map<String, Integer> map = new HashMap<>();

        for(String str: list) {
            addInMap(map, str);
        }
    }

    private void logFunction() {
        Log.i("TEST123", "MainActivity#function1");
    }

    private List<String> getList() {
        return new ArrayList<String>() {
            {
                add("Hello");
                add("World");
            }
        };
    }

    private String getString() {
        return "HelloWorld";
    }

    private void addInMap(Map<String, Integer> map, String key) {
        map.put(key, Objects.hash(Math.random()));
    }

    @Override
    public void onClick(View v) {
        Log.i("TEST123", "MainActivity#onClick start");

        Map<String, Integer> firebaseMap = getFirebaseMap();

//        Intent intent = new Intent(this, LobbyActivity.class);
//        startActivity(intent);
//
//        testPointCut();

        Log.i("TEST123", "MainActivity#onClick finish");
    }

    private void testPointCutThrow() {
        testThrowException();
    }

    public Map<String, Integer> getFirebaseMap() {
        Log.i("TEST123", "MainActivity#getFirebaseMap start");

        Map<String, Integer> map = new HashMap<>();

        map.put("Hello", 1);
        map.put("World", 2);

        Log.i("TEST123", "MainActivity#getFirebaseMap start");

        return map;
    }

    private void testThrowException() {
        Log.i("TEST123", "MainActivity#testThrowException");

        int i = 0;
        int b = 100;

        int result = b / i;

        Log.i("TEST123", "MainActivity#testThrowException result: " + result);
    }


    private void testPointCut() {
        Log.i("TEST123", "MainActivity#testPointCut");
    }

}