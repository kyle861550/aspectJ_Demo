package com.alien.plugin_aspect_j.aspect_return;

import android.util.Log;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import java.util.Map;

@Aspect
public class HookReturnValue {

    // 取得所有名為 getFirebaseMap 的函數
    // 若 function 沒有被呼叫，則不會觸發
    @AfterReturning(
            pointcut = "execution(* *..*.getFirebaseMap(..))",
            returning = "map"
    )
    public void getHashMap(Map<String, Integer> map) {
        Log.i("TEST123", "getHashMap~~: " + map.toString());
    }

}
