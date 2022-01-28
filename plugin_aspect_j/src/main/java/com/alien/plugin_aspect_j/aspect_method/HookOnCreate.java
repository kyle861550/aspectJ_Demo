package com.alien.plugin_aspect_j.aspect_method;

import android.os.Trace;
import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class HookOnCreate {

    // + child of Activity && Activity self
    @Before("execution(* android.app.Activity+.onCreate(..))")
    public void beforeOnCreate(JoinPoint joinPoint) {

        String s = joinPoint.getSignature().toString();

        Log.i("TEST123", "HookOnCreate#Before: " + s);

        Trace.beginSection(s);
    }

    @After("execution(* android.app.Activity+.onCreate(..))")
    public void afterOnCreate() {

        Log.i("TEST123", "HookOnCreate#After");

        Trace.endSection();
    }

}
