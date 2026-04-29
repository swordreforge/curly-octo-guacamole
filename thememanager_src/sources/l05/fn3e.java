package l05;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kiv.EnumC6118k;
import kiv.InterfaceC6117g;
import kiv.InterfaceC6119n;

/* JADX INFO: compiled from: JvmPlatformAnnotations.kt */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@InterfaceC6117g(allowedTargets = {kiv.toq.FUNCTION, kiv.toq.PROPERTY_GETTER, kiv.toq.PROPERTY_SETTER, kiv.toq.CONSTRUCTOR})
@Retention(RetentionPolicy.SOURCE)
@InterfaceC6119n(EnumC6118k.SOURCE)
public @interface fn3e {
    Class<? extends Throwable>[] exceptionClasses();
}
