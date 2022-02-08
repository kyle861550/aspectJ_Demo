package com.alien.plugin_aspect_j.aspect_call;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

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

    @Before("call(* *..*.testStudentBean(..))")
    public void callClickBefore(JoinPoint joinPoint) {
        Log.i("TEST123", "HookMethodByCall#callClickBefore ~~~ call method :D");
    }
}
