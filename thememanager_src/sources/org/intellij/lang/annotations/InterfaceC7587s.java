package org.intellij.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: org.intellij.lang.annotations.s */
/* JADX INFO: compiled from: RegExp.java */
/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@InterfaceC7586q("RegExp")
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC7587s {
    String prefix() default "";

    String suffix() default "";
}
