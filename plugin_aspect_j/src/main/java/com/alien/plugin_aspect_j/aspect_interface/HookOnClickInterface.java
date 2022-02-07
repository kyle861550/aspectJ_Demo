package com.alien.plugin_aspect_j.aspect_interface;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class HookOnClickInterface {
    // Around & Before & After 不能一起使用 ??
//    @Before("execution(* android.view.View.OnClickListener.onClick(android.view.View))")
//    @Before("execution(* android.view.View.OnClickListener.onClick(..))")
//    public void beforeClick(JoinPoint joinPoint) {
//        Log.i("TEST123", "HookOnClick#beforeClick ~~~ before method :D");
//    }

//    @After("execution(* android.view.View.OnClickListener.onClick(..))")
//    public void afterClick() {
//        Log.i("TEST123", "HookOnClick#afterClick ~~~ after method :D");
//    }

    @Around("execution(* android.view.View.OnClickListener.onClick(..))")
    public void executionClick(ProceedingJoinPoint joinPoint) {
        Log.i("TEST123", "HookOnClick#executionClick ~~~ Around method :D");
        try {
            joinPoint.proceed(joinPoint.getArgs());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
