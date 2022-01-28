package com.alien.plugin_aspect_j.aspect_interface;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class HookLambdaOnClickInterface {
    @After("execution(* *..lambda$*(android.view.View))")
    public void afterClick() {
        Log.i("TEST123", "Lambda Lambda Lambda Lambda ~~~ after method :D");
    }

    @Around("execution(* *..lambda$*(android.view.View))")
    public void executionClick(ProceedingJoinPoint joinPoint) { // just execution have 'ProceedingJoinPoint'
        Log.i("TEST123", "Lambda Lambda Lambda Lambda ~~~ execution method :D");

        try {
            joinPoint.proceed();    // call lambda doesn't need params
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }


}
