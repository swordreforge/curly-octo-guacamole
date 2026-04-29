package l05;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kiv.EnumC6118k;
import kiv.InterfaceC6117g;
import kiv.InterfaceC6119n;

/* JADX INFO: compiled from: JvmPlatformAnnotations.kt */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE, ElementType.METHOD})
@InterfaceC6117g(allowedTargets = {kiv.toq.CLASS, kiv.toq.FUNCTION, kiv.toq.PROPERTY, kiv.toq.TYPE})
@Documented
@Retention(RetentionPolicy.CLASS)
@InterfaceC6119n(EnumC6118k.BINARY)
@kiv.zy
public @interface n7h {
    boolean suppress() default true;
}
