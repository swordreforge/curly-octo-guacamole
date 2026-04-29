package zy;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: zy.p */
/* JADX INFO: compiled from: CheckResult.java */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC7839p {
    String suggest() default "";
}
