package com.alien.plugin_aspect_j.join_point;

import android.util.Log;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCut_call_around {

    @Pointcut("call(void *..*.AspectJActivity.call_around(..))")
    public void cutMethod() {
    }

    @Around("cutMethod()")
    public void adviceWithAround() {
        Log.i("Yoyo123", "call, Around ~~~~ !");
    }

}
