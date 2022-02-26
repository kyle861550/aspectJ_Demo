package com.alien.plugin_aspect_j.aspect_cflow;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

@Aspect
public class MyCallFlow {

//    @Pointcut("execution(@com.alien.plugin_aspect_j.aspect_cflow.FlowBelow * *())")
//    public void cutFlowBelow() {
//    }

    // 會調用本身
//    @Around("execution(* *(..)) && cflow(execution(* com.alien.demo_aspectj.MainActivity.flowFunction()))")
    // 不會調用本身
//    @Around("execution(* *(..)) && cflowbelow(execution(* com.alien.demo_aspectj.MainActivity.flowFunction()))")
//    @Around("cflowbelow(execution(* com.alien.demo_aspectj.MainActivity.flowFunction())) && !within(MyCallFlow)")
//    @Around("within(com.alien.demo_aspectj.MainActivity.testImpl.testImpl)")


//    @Around("call(* com.alien.demo_aspectj.MainActivity.testImpl.onTest(..))")


    //    @Around("cflowbelow(cutFlowBelow()) && !within(MyCallFlow)")
    @Around("call(* *..*.onStart())")
    public Object catchFunctionFlow(ProceedingJoinPoint point) throws Throwable {
        String name = point.getSignature().getName();
        Object[] args = point.getArgs();

        try {
            Object proceed = point.proceed();

            Log.i("TEST123", name + ", result: " + proceed);

            return proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        Log.i("TEST123",
                "Catch function of: " + name +
                ", args: " + Arrays.toString(args)
        );

        return point.proceed(args);
    }

}
