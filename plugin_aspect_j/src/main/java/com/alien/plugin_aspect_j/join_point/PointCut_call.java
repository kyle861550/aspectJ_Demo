package com.alien.plugin_aspect_j.join_point;

import android.util.Log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCut_call {

    @Pointcut("call(void com.alien.demo_aspectj.AspectJActivity.call(..))")
    public void cutMethod() {
    }

    @Before("cutMethod()")
    public void adviceWithBefore() {
        Log.i("Yoyo123", "call, Before ~~~~ !");
    }

    @After("cutMethod()")
    public void adviceWithAfter() {
        Log.i("Yoyo123", "call, After ~~~~ !");
    }

    @AfterReturning("cutMethod()")
    public void adviceWithAfterReturning() {
        Log.i("Yoyo123", "call, AfterReturning ~~~~ !");
    }

    @AfterThrowing("cutMethod()")
    public void adviceWithAfterThrowing() {
        Log.i("Yoyo123", "call, AfterThrowing ~~~~ !");
    }

}
