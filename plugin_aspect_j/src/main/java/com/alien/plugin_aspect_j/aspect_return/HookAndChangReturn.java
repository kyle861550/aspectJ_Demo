package com.alien.plugin_aspect_j.aspect_return;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Map;

@Aspect
public class HookAndChangReturn {

//    @Around("execution(* *..*.getFirebaseMap())")
//    public void hookAndChangMap(ProceedingJoinPoint point) throws Throwable {
//        Log.i("TEST123", "hookAndChangMap start");
//
//        //TODO:
//
//        Map<String, Integer> map = (Map<String, Integer>) point.proceed();
//
//        Log.i("TEST123", "hookAndChangMap finish: " + map.toString());
//    }

}
