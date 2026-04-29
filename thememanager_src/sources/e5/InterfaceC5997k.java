package e5;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: e5.k */
/* JADX INFO: compiled from: Expose.java */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC5997k {
    boolean deserialize() default true;

    boolean serialize() default true;
}
