package p033q;

import com.market.sdk.reflect.C4991s;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kiv.EnumC6118k;
import kiv.InterfaceC6117g;
import kiv.InterfaceC6119n;
import kiv.toq;
import kotlin.d3;
import kotlin.hb;
import kotlin.ld6;

/* JADX INFO: renamed from: q.k */
/* JADX INFO: compiled from: Experimental.kt */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE})
@InterfaceC6117g(allowedTargets = {toq.ANNOTATION_CLASS})
@d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lq/k;", "", "Lq/k$k;", "level", "()Lq/k$k;", "k", "annotation-experimental_release"}, m22787k = 1, mv = {1, 4, 2})
@Retention(RetentionPolicy.CLASS)
@InterfaceC6119n(EnumC6118k.BINARY)
@ld6(message = "This annotation has been replaced by `@RequiresOptIn`", replaceWith = @hb(expression = "RequiresOptIn", imports = {"androidx.annotation.RequiresOptIn"}))
public @interface InterfaceC7612k {

    /* JADX INFO: renamed from: q.k$k */
    /* JADX INFO: compiled from: Experimental.kt */
    @d3(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lq/k$k;", "", C4991s.f28129n, "(Ljava/lang/String;I)V", "WARNING", "ERROR", "annotation-experimental_release"}, m22787k = 1, mv = {1, 4, 2})
    public enum k {
        WARNING,
        ERROR
    }

    k level() default k.ERROR;
}
