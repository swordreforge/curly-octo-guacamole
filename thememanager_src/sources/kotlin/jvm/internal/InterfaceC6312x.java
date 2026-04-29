package kotlin.jvm.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kiv.EnumC6118k;
import kiv.InterfaceC6117g;
import kiv.InterfaceC6119n;
import l05.InterfaceC6769y;

/* JADX INFO: renamed from: kotlin.jvm.internal.x */
/* JADX INFO: compiled from: SerializedIr.kt */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE})
@InterfaceC6117g(allowedTargets = {kiv.toq.CLASS})
@Retention(RetentionPolicy.CLASS)
@InterfaceC6119n(EnumC6118k.BINARY)
@kotlin.yz(version = "1.6")
public @interface InterfaceC6312x {
    @InterfaceC6769y(name = "b")
    /* JADX INFO: renamed from: b */
    String[] m23161b() default {};
}
