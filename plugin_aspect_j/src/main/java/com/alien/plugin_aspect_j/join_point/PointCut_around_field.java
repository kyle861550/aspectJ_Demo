package com.alien.plugin_aspect_j.join_point;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCut_around_field {

    // 注意 AspectJ 的語法
    @Pointcut("get(* *..*.AspectJBean_1.name)")
    public void cutGet() {
    }

    @Around("cutGet()")
    public Object adviceWithAround_1(ProceedingJoinPoint point) throws Throwable {
        Log.i("cutGet", "Get name, adviceWithAround ~~~~ !");

        return point.proceed(point.getArgs());
    }

    // ------------------------------------------------------------------------------

    // 注意 AspectJ 的語法
    @Pointcut("set(* *..*.AspectJBean_1.phone)")
    public void cutSet() {
    }

    @Around("cutSet()")
    public Object adviceWithAround_2(ProceedingJoinPoint point) throws Throwable {
        Log.i("Yoyo123", "Set phone, adviceWithAround ~~~~ !");

        return point.proceed(point.getArgs());
    }
}
