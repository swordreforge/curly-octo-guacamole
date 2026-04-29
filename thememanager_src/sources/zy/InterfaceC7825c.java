package zy;

import com.market.sdk.reflect.C4991s;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kiv.EnumC6118k;
import kiv.InterfaceC6117g;
import kiv.InterfaceC6119n;

/* JADX INFO: renamed from: zy.c */
/* JADX INFO: compiled from: RequiresOptIn.kt */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE})
@InterfaceC6117g(allowedTargets = {kiv.toq.ANNOTATION_CLASS})
@kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lzy/c;", "", "Lzy/c$k;", "level", "()Lzy/c$k;", "k", "annotation-experimental_release"}, m22787k = 1, mv = {1, 4, 2})
@Retention(RetentionPolicy.CLASS)
@InterfaceC6119n(EnumC6118k.BINARY)
public @interface InterfaceC7825c {

    /* JADX INFO: renamed from: zy.c$k */
    /* JADX INFO: compiled from: RequiresOptIn.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lzy/c$k;", "", C4991s.f28129n, "(Ljava/lang/String;I)V", "WARNING", "ERROR", "annotation-experimental_release"}, m22787k = 1, mv = {1, 4, 2})
    public enum k {
        WARNING,
        ERROR
    }

    k level() default k.ERROR;
}
