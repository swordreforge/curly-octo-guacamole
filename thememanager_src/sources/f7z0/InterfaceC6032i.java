package f7z0;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: f7z0.i */
/* JADX INFO: compiled from: Query.java */
/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC6032i {
    boolean encoded() default false;

    String value();
}
