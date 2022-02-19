package com.alien.plugin_aspect_j.aspect_interface;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.SourceLocation;

@Aspect
public class HookOnClickInterface {

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
