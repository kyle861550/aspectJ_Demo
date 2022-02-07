package com.alien.plugin_aspect_j.aspect_bean;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class UseWithinCode {

    @Pointcut("!withincode(com.alien.demo_aspectj.StudentBean.new())")
    public void newStudentObj() {
        Log.d("TEST123", "UseWithinCode#newStudentObj !!");
    }

    // 不使用 new 的 set 方式
    @Around("set(* com.alien.demo_aspectj.StudentBean.age) && newStudentObj()")
    public void hookSetNameField(ProceedingJoinPoint point) {
        Log.d("TEST123", "UseWithinCode#hookSetNameField: " + point.getTarget().toString() + "#" + point.getSignature().getName());
    }

}
