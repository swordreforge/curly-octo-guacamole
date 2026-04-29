package kotlin.jvm.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kiv.EnumC6118k;
import kiv.InterfaceC6117g;
import kiv.InterfaceC6119n;

/* JADX INFO: compiled from: SourceDebugExtension.kt */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE})
@InterfaceC6117g(allowedTargets = {kiv.toq.CLASS})
@Retention(RetentionPolicy.CLASS)
@InterfaceC6119n(EnumC6118k.BINARY)
@kotlin.yz(version = "1.8")
public @interface lv5 {
    String[] value();
}
