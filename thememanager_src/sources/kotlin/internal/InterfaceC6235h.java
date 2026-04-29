package kotlin.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kiv.EnumC6118k;
import kiv.InterfaceC6117g;
import kiv.InterfaceC6119n;
import kiv.InterfaceC6120q;
import kotlin.jvm.internal.zp;
import kotlin.yz;

/* JADX INFO: renamed from: kotlin.internal.h */
/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@InterfaceC6120q
@Retention(RetentionPolicy.SOURCE)
@yz(version = "1.2")
@InterfaceC6117g(allowedTargets = {kiv.toq.CLASS, kiv.toq.FUNCTION, kiv.toq.PROPERTY, kiv.toq.CONSTRUCTOR, kiv.toq.TYPEALIAS})
@Repeatable(k.class)
@InterfaceC6119n(EnumC6118k.SOURCE)
public @interface InterfaceC6235h {

    /* JADX INFO: renamed from: kotlin.internal.h$k */
    /* JADX INFO: compiled from: Annotations.kt */
    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @InterfaceC6117g(allowedTargets = {kiv.toq.CLASS, kiv.toq.FUNCTION, kiv.toq.PROPERTY, kiv.toq.CONSTRUCTOR, kiv.toq.TYPEALIAS})
    @Retention(RetentionPolicy.SOURCE)
    @InterfaceC6119n(EnumC6118k.SOURCE)
    @zp
    public @interface k {
        InterfaceC6235h[] value();
    }

    int errorCode() default -1;

    kotlin.qrj level() default kotlin.qrj.ERROR;

    String message() default "";

    String version();

    cdj versionKind() default cdj.LANGUAGE_VERSION;
}
