package com.alien.plugin_aspect_j.aspect_call;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class HookMethodByCall {

    @Around("call(* *..*.testStudentBean(..))")
    public void callClick(ProceedingJoinPoint joinPoint) {
        Log.i("TEST123", "HookMethodByCall#callClick ~~~ call method :D");
        try {
            joinPoint.proceed(joinPoint.getArgs());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
