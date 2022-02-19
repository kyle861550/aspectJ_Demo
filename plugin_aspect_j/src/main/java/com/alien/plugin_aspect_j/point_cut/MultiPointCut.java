package com.alien.plugin_aspect_j.point_cut;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MultiPointCut {

    // Join Point -> execution
    @Pointcut("execution(com.alien.plugin_aspect_j.point_cut.TestBean.new(..))")
    public void cutInstance() {
    }

    @Pointcut("args(java.lang.String)")
    public void cutSpecialArgs() {
    }

    @Around("cutInstance() && cutSpecialArgs()")
    public void hookNewStudent() {

    }

}
