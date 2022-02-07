package com.alien.plugin_aspect_j.aspect_cflow;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;

//@Aspect
public class MyCallFlow {

    // 會調用本身
//    @Around("execution(* *(..)) && cflow(execution(* com.alien.demo_aspectj.MainActivity.flowFunction()))")
    // 不會調用本身
    @Around("execution(* *(..)) && cflowbelow(execution(* com.alien.demo_aspectj.MainActivity.*()))")
    public void catchFunctionFlow(ProceedingJoinPoint point) {
        String name = point.getSignature().getName();
        Object[] args = point.getArgs();

        try {
            Object proceed = point.proceed();

            Log.i("TEST123", name + ", result: " + proceed);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        Log.i("TEST123",
                "Catch function of: " + name +
                ", args: " + Arrays.toString(args)
        );

    }

}
