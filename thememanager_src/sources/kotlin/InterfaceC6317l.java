package kotlin;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kiv.EnumC6118k;
import kiv.InterfaceC6117g;
import kiv.InterfaceC6119n;

/* JADX INFO: renamed from: kotlin.l */
/* JADX INFO: compiled from: OptIn.kt */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@InterfaceC6117g(allowedTargets = {kiv.toq.CLASS, kiv.toq.PROPERTY, kiv.toq.LOCAL_VARIABLE, kiv.toq.VALUE_PARAMETER, kiv.toq.CONSTRUCTOR, kiv.toq.FUNCTION, kiv.toq.PROPERTY_GETTER, kiv.toq.PROPERTY_SETTER, kiv.toq.EXPRESSION, kiv.toq.FILE, kiv.toq.TYPEALIAS})
@Retention(RetentionPolicy.SOURCE)
@InterfaceC6119n(EnumC6118k.SOURCE)
@yz(version = "1.3")
public @interface InterfaceC6317l {
    Class<? extends Annotation>[] markerClass();
}
