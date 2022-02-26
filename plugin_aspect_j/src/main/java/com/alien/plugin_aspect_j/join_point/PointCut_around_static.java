package com.alien.plugin_aspect_j.join_point;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCut_around_static {

    // 注意 AspectJ 的語法
    @Pointcut("staticinitialization(*..*.AspectJBean_1)")
    public void cutStatic() {
    }

    @Around("cutStatic()")
    public Object adviceWithAround(ProceedingJoinPoint point) throws Throwable {
        Log.i("Yoyo123", "adviceWithAround ~~~~ !");

        return point.proceed(point.getArgs());
    }
}
