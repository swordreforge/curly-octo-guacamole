package kotlinx.coroutines.android;

import com.market.sdk.reflect.C4991s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.f7l8;
import kotlin.d3;
import kotlin.jvm.internal.ni7;
import kotlin.ld6;
import kotlin.qrj;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6699m;
import kotlinx.coroutines.ch;
import kotlinx.coroutines.z4;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/android/zy;", "Lkotlinx/coroutines/z4;", "Lkotlinx/coroutines/m;", "a5id", "()Lkotlinx/coroutines/android/zy;", "immediate", C4991s.f28129n, "()V", "Lkotlinx/coroutines/android/toq;", "kotlinx-coroutines-android"}, m22787k = 1, mv = {1, 6, 0})
public abstract class zy extends z4 implements InterfaceC6699m {
    private zy() {
    }

    public /* synthetic */ zy(ni7 ni7Var) {
        this();
    }

    @InterfaceC7396q
    public abstract zy a5id();

    @Override // kotlinx.coroutines.InterfaceC6699m
    @InterfaceC7395n
    @ld6(level = qrj.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object bek6(long j2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        return InterfaceC6699m.k.m24489k(this, j2, interfaceC6216q);
    }

    @InterfaceC7396q
    public ch i1(long j2, @InterfaceC7396q Runnable runnable, @InterfaceC7396q f7l8 f7l8Var) {
        return InterfaceC6699m.k.toq(this, j2, runnable, f7l8Var);
    }
}
