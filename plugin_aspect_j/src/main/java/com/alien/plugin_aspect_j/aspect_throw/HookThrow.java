package com.alien.plugin_aspect_j.aspect_throw;

import android.util.Log;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class HookThrow {

    // 仍會拋出，無法防止 crush
    @AfterThrowing(pointcut = "call(* *..*.testThrowException())", throwing = "throwable")
    public void catchFunctionException(Throwable throwable) {
        Log.e("TEST123", "catchFunctionException !!!??? : " + throwable.getMessage());
    }

}
