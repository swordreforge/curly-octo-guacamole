package zy;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Dimension.java */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface cdj {

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    public static final int f100929lv5 = 0;

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    public static final int f100930t8iq = 1;

    /* JADX INFO: renamed from: u */
    public static final int f46157u = 2;

    int unit() default 1;
}
