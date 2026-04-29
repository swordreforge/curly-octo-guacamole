package kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kiv.InterfaceC6117g;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@InterfaceC6117g(allowedTargets = {kiv.toq.CLASS, kiv.toq.FUNCTION, kiv.toq.PROPERTY, kiv.toq.ANNOTATION_CLASS, kiv.toq.CONSTRUCTOR, kiv.toq.PROPERTY_SETTER, kiv.toq.PROPERTY_GETTER, kiv.toq.TYPEALIAS})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@yz(version = "1.4")
@kiv.zy
public @interface x2 {
    String errorSince() default "";

    String hiddenSince() default "";

    String warningSince() default "";
}
