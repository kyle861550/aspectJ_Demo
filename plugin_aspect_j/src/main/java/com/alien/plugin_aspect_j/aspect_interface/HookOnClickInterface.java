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
    // Around & Before & After 不能一起使用 ??
//    @Before("execution(* android.view.View.OnClickListener.onClick(android.view.View))")
//    @Before("execution(* android.view.View.OnClickListener.onClick(..))")
//    public void beforeClick(JoinPoint joinPoint) {
//        Log.i("TEST123", "HookOnClick#beforeClick ~~~ before method :D");
//        SourceLocation sourceLocation = joinPoint.getSourceLocation();
//
//        String s = joinPoint.getSignature().toString();
//        Log.i("TEST123", "HookOnClick#Before: " + s + ", fileName: " + sourceLocation.getFileName() +
//                ", getKind : " + joinPoint.getKind() + ", target: " + joinPoint.getTarget());
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

    // Interface 好像不能用 Hook
    @Before("call(* android.view.View.OnClickListener.onClick(..))")
    public void callBeforeClick(JoinPoint joinPoint) {
        Log.i("TEST123", "HookOnClick#callBeforeClick ~~~ before method :D");
        SourceLocation sourceLocation = joinPoint.getSourceLocation();

        String s = joinPoint.getSignature().toString();
        Log.i("TEST123", "HookOnClick#callBeforeClick: " + s + ", fileName: " + sourceLocation.getFileName() +
                ", getKind : " + joinPoint.getKind() + ", target: " + joinPoint.getTarget());
    }

}
