package com.alien.plugin_aspect_j.join_point;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCut_around_construct {

    // 注意 AspectJ 的語法
    @Pointcut("call(*..*.AspectJBean_1.new(..))")
    public void cutCallConstruct() {
    }

    @Around("cutCallConstruct()")
    public Object adviceWithAround_1(ProceedingJoinPoint point) throws Throwable {
        Log.i("Yoyo123", "call, Around ~~~~ !");

        return point.proceed(point.getArgs());
    }

    // ------------------------------------------------------------------------------------

    // 注意 AspectJ 的語法
    @Pointcut("execution(*..*.AspectJBean_1.new(..))")
    public void cutExecutionConstruct() {
    }

    @Around("cutExecutionConstruct()")
    public Object adviceWithAround_2(ProceedingJoinPoint point) throws Throwable {
        Log.i("Yoyo123", "call, Around ~~~~ !");

        return point.proceed(point.getArgs());
    }
}
