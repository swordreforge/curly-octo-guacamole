package f7z0;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: f7z0.y */
/* JADX INFO: compiled from: HTTP.java */
/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC6038y {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
