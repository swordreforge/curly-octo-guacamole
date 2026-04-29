package eqxt;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.market.sdk.reflect.C4991s;
import eqxt.AbstractC6008k;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: eqxt.n */
/* JADX INFO: compiled from: CreationExtras.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Leqxt/n;", "Leqxt/k;", C0846k.zaso, "Leqxt/k$toq;", InterfaceC1925p.qn, "t", "Lkotlin/was;", "zy", "(Leqxt/k$toq;Ljava/lang/Object;)V", "k", "(Leqxt/k$toq;)Ljava/lang/Object;", "initialExtras", C4991s.f28129n, "(Leqxt/k;)V", "lifecycle-viewmodel_release"}, m22787k = 1, mv = {1, 6, 0})
public final class C6009n extends AbstractC6008k {
    /* JADX WARN: Multi-variable type inference failed */
    public C6009n() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C6009n(@InterfaceC7396q AbstractC6008k initialExtras) {
        d2ok.m23075h(initialExtras, "initialExtras");
        toq().putAll(initialExtras.toq());
    }

    @Override // eqxt.AbstractC6008k
    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public <T> T mo22253k(@InterfaceC7396q AbstractC6008k.toq<T> key) {
        d2ok.m23075h(key, "key");
        return (T) toq().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void zy(@InterfaceC7396q AbstractC6008k.toq<T> key, T t2) {
        d2ok.m23075h(key, "key");
        toq().put(key, t2);
    }

    public /* synthetic */ C6009n(AbstractC6008k abstractC6008k, int i2, ni7 ni7Var) {
        this((i2 & 1) != 0 ? AbstractC6008k.k.f73818toq : abstractC6008k);
    }
}
