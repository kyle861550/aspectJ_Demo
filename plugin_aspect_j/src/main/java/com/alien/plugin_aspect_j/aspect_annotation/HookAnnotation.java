package com.alien.plugin_aspect_j.aspect_annotation;

import android.content.Context;
import android.util.Log;

import androidx.fragment.app.Fragment;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.lang.reflect.Method;
import java.util.Arrays;

@Aspect
public class HookAnnotation {

    @Pointcut("execution(@com.alien.plugin_aspect_j.aspect_annotation.MyHook * *(..)) && @annotation(myHook)")
    public void cutAnnotation(MyHook myHook) {
        Log.d("TEST123", "HookAnnotation#cutAnnotation !!~~");
    }

    // 如果你要 Hook 的參數有返回值，擬就也要有返回值，可以使用 Object (Object 包含 void)
    @Around("cutAnnotation(myHook)")
    public Object proceedingJoinPoint(final ProceedingJoinPoint point, MyHook myHook) throws IllegalAccessException {
        Context context = null;

        final Object thisObject = point.getThis();

        if (thisObject instanceof Context) {
            context = (Context) thisObject;
        } else if (thisObject instanceof Fragment) {
            context = ((Fragment) thisObject).getActivity();
        }
//        if (null == context || myHook == null) {
//            throw new IllegalAccessException("null == context || myHook == null is null");
//        }

        Log.d("TEST123", "HookAnnotation#proceedingJoinPoint: message=" + myHook.message() + ", value=" + Arrays.toString(myHook.value()));

//        Method[] declaredMethods = context.getClass().getDeclaredMethods();
//        for(Method method : declaredMethods) {
//            Log.i("TEST123", "HookAnnotation#proceedingJoinPoint: " + method.getName());
//        }

        try {
            point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        return 222;

    }
}
