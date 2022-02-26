package com.alien.plugin_aspect_j.aspect_cflow;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target({
//        ElementType.LOCAL_VARIABLE, ElementType.
//})
//@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface FlowBelow {
}
