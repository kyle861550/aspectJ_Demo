package com.alien.plugin_aspect_j.aspect_bean;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

public class UseWithinCode {

    // TODO:
    @Pointcut("!withincode(com.alien.demo_aspectj.StudentBean.new())")
    public void newStudentObj() { }

    // 不使用 new 的 set 方式
    @Around("set(* com.alien.demo_aspectj.StudentBean.age) && !newStudentObj()")
    public void hookSetNameField(ProceedingJoinPoint point) {
        Log.d("TEST123", "UseWithinCode: " + point.getTarget().toString());
    }

}
