package uc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: uc.q */
/* JADX INFO: compiled from: GlideOption.java */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC7686q {

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    public static final int f94994ch = 1;

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    public static final int f94995nmn5 = 2;

    /* JADX INFO: renamed from: x */
    public static final int f44435x = 0;

    boolean memoizeStaticMethod() default false;

    int override() default 0;

    boolean skipStaticMethod() default false;

    String staticMethodName() default "";
}
