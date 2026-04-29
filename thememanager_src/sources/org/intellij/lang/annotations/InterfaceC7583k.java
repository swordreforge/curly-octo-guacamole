package org.intellij.lang.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: org.intellij.lang.annotations.k */
/* JADX INFO: compiled from: Flow.java */
/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC7583k {

    /* JADX INFO: renamed from: a */
    @mub.zy
    public static final String f43864a = "The return value of this method";

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    @mub.zy
    public static final String f94310a98o = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    @mub.zy
    public static final String f94311bf2 = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    @mub.zy
    public static final String f94312i1 = "this";

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    @mub.zy
    public static final String f94313zp = "this";

    String source() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    boolean sourceIsContainer() default false;

    String target() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    boolean targetIsContainer() default false;
}
