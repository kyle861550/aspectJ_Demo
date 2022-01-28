package com.alien.plugin_aspect_j.aspect_bean;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;

@Aspect
public class ArgLimitSetBean {

    // args 需要配合 execution
    @Around("execution(* com.alien.demo_aspectj.StudentBean.set*(..)) && args(long,String)")
    public void hookSetLimitArg(ProceedingJoinPoint point) {
        Log.d("TEST123", "ArgLimitSetBean: " + Arrays.toString(point.getArgs()));
    }

}
