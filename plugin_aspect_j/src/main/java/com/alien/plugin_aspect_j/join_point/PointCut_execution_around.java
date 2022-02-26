package com.alien.plugin_aspect_j.join_point;

import android.util.Log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCut_execution_around {

    @Pointcut("execution(void *..*.AspectJActivity.execution_around(..))")
    public void cutMethod() {
    }

    @Around("cutMethod()")
    public void adviceWithAround() {
        Log.i("Yoyo123", "execution, Around ~~~~ !");
    }

}
