package com.alien.plugin_aspect_j.point_cut;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCutAroundThrow {

    @Pointcut("execution(* *..*.testPointCutThrow())")
    public void myCutPointThrow() {
        Log.i("TEST123", "PointCutAroundThrow#myCutPointThrow ~~~");
    }

    // 抓取自身的 myCutPoint 函數
    @Around("myCutPointThrow()")
    public void myAroundThrow(ProceedingJoinPoint point) throws Throwable {
        Log.i("TEST123", "PointCutAroundThrow#myAroundThrow start");

        try {
            point.proceed();
        } catch (Exception e) {
            e.printStackTrace();

            Log.e("TEST123", "PointCutAroundThrow#myAroundThrow Exception!!: " + e.getMessage());
        }

        Log.i("TEST123", "PointCutAroundThrow#myAroundThrow finish");
    }

}
