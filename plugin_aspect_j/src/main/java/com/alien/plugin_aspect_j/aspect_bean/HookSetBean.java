package com.alien.plugin_aspect_j.aspect_bean;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;

@Aspect
public class HookSetBean {

    @Around("set(* com.alien.demo_aspectj.StudentBean.name)")
    public void hookSetNameField(ProceedingJoinPoint point) throws Throwable {
        Log.d("TEST123", "hookSetNameField: " + point.proceed());
//        Log.d("TEST123", "hookSetNameField#getKind: " + point.getKind());
//        Log.d("TEST123", "hookSetNameField#getSignature: " + point.getSignature().toString());
//        Log.d("TEST123", "hookSetNameField#getTarget: " + point.getTarget());
//        Log.d("TEST123", "hookSetNameField#getArgs: " + Arrays.toString(point.getArgs()));
    }

}
