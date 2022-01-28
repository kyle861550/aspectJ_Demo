package com.alien.plugin_aspect_j.point_cut;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCutAround {

    @Pointcut("execution(* *..*.testPointCut())")
    public void myCutPoint() {
    }

    // 響應 自身的 myCutPoint 函數
    @Around("myCutPoint()")
    public void myAround(ProceedingJoinPoint point) throws Throwable {
        Log.i("TEST123", "PointCutAround#myAround start");

        Object aThis = point.getThis();

        if(aThis instanceof Context) {
            Toast.makeText((Context) aThis, "Hook by myAround", Toast.LENGTH_SHORT).show();
        }

        point.proceed();

        Log.i("TEST123", "PointCutAround#myAround finish");
    }

}
