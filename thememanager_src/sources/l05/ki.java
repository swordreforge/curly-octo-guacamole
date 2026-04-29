package l05;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kiv.EnumC6118k;
import kiv.InterfaceC6117g;
import kiv.InterfaceC6119n;

/* JADX INFO: compiled from: PurelyImplements.kt */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE})
@InterfaceC6117g(allowedTargets = {kiv.toq.CLASS})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@InterfaceC6119n(EnumC6118k.RUNTIME)
@kiv.zy
public @interface ki {
    String value();
}
