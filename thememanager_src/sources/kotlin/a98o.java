package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kiv.EnumC6118k;
import kiv.InterfaceC6117g;
import kiv.InterfaceC6119n;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@InterfaceC6117g(allowedTargets = {kiv.toq.CLASS, kiv.toq.ANNOTATION_CLASS, kiv.toq.TYPE_PARAMETER, kiv.toq.PROPERTY, kiv.toq.FIELD, kiv.toq.LOCAL_VARIABLE, kiv.toq.VALUE_PARAMETER, kiv.toq.CONSTRUCTOR, kiv.toq.FUNCTION, kiv.toq.PROPERTY_GETTER, kiv.toq.PROPERTY_SETTER, kiv.toq.TYPE, kiv.toq.EXPRESSION, kiv.toq.FILE, kiv.toq.TYPEALIAS})
@Retention(RetentionPolicy.SOURCE)
@InterfaceC6119n(EnumC6118k.SOURCE)
public @interface a98o {
    String[] names();
}
