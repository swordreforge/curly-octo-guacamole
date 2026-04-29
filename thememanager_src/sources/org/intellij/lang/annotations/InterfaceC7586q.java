package org.intellij.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: org.intellij.lang.annotations.q */
/* JADX INFO: compiled from: Language.java */
/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC7586q {
    @mub.zy
    String prefix() default "";

    @mub.zy
    String suffix() default "";

    @mub.zy
    String value();
}
