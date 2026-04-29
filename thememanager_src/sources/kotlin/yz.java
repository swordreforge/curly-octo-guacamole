package kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kiv.EnumC6118k;
import kiv.InterfaceC6117g;
import kiv.InterfaceC6119n;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
@InterfaceC6117g(allowedTargets = {kiv.toq.CLASS, kiv.toq.PROPERTY, kiv.toq.FIELD, kiv.toq.CONSTRUCTOR, kiv.toq.FUNCTION, kiv.toq.PROPERTY_GETTER, kiv.toq.PROPERTY_SETTER, kiv.toq.TYPEALIAS})
@Documented
@Retention(RetentionPolicy.CLASS)
@InterfaceC6119n(EnumC6118k.BINARY)
@kiv.zy
public @interface yz {
    String version();
}
