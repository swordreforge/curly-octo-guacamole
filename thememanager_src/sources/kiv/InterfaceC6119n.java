package kiv;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: kiv.n */
/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.ANNOTATION_TYPE})
@InterfaceC6117g(allowedTargets = {toq.ANNOTATION_CLASS})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC6119n {
    EnumC6118k value() default EnumC6118k.RUNTIME;
}
