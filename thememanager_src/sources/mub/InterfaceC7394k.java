package mub;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: mub.k */
/* JADX INFO: compiled from: Contract.java */
/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC7394k {
    boolean pure() default false;

    String value() default "";
}
