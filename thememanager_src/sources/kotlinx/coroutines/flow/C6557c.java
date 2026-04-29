package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.miui.maml.folme.AnimatedProperty;
import kotlinx.coroutines.internal.C6679l;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.c */
/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000>\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a4\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a4\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b\u001a6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000\"\u001a\u0010\u0019\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001c\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u0012\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, d2 = {C0846k.zaso, "value", "Lkotlinx/coroutines/flow/a9;", "k", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/a9;", "Lkotlin/Function1;", "function", C7704k.y.toq.f44691k, "(Lkotlinx/coroutines/flow/a9;Lcyoe/x2;)Ljava/lang/Object;", "n", "Lkotlin/was;", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlinx/coroutines/flow/hyr;", "Lkotlin/coroutines/f7l8;", "context", "", "capacity", "Lkotlinx/coroutines/channels/qrj;", "onBufferOverflow", "Lkotlinx/coroutines/flow/s;", "q", "Lkotlinx/coroutines/internal/l;", "Lkotlinx/coroutines/internal/l;", "getNONE$annotations", "()V", "NONE", "toq", "getPENDING$annotations", "PENDING", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class C6557c {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final C6679l f36941k = new C6679l("NONE");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final C6679l f81987toq = new C6679l("PENDING");

    private static /* synthetic */ void f7l8() {
    }

    /* JADX INFO: renamed from: g */
    private static /* synthetic */ void m24070g() {
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <T> a9<T> m24071k(T t2) {
        if (t2 == null) {
            t2 = (T) kotlinx.coroutines.flow.internal.fn3e.f36987k;
        }
        return new C6562f(t2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: n */
    public static final <T> T m24072n(@InterfaceC7396q a9<T> a9Var, @InterfaceC7396q cyoe.x2<? super T, ? extends T> x2Var) {
        ?? r0;
        do {
            r0 = (Object) a9Var.getValue();
        } while (!a9Var.mo24069g(r0, x2Var.invoke(r0)));
        return r0;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final <T> InterfaceC6622s<T> m24073q(@InterfaceC7396q hyr<? extends T> hyrVar, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        boolean z2 = false;
        if (i2 >= 0 && i2 < 2) {
            z2 = true;
        }
        return ((z2 || i2 == -2) && qrjVar == kotlinx.coroutines.channels.qrj.DROP_OLDEST) ? hyrVar : eqxt.m24085n(hyrVar, f7l8Var, i2, qrjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static final <T> T m24074s(@InterfaceC7396q a9<T> a9Var, @InterfaceC7396q cyoe.x2<? super T, ? extends T> x2Var) {
        a98o.zy zyVar;
        T tInvoke;
        do {
            zyVar = (Object) a9Var.getValue();
            tInvoke = x2Var.invoke(zyVar);
        } while (!a9Var.mo24069g(zyVar, tInvoke));
        return tInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public static final <T> void m24075y(@InterfaceC7396q a9<T> a9Var, @InterfaceC7396q cyoe.x2<? super T, ? extends T> x2Var) {
        a98o.zy zyVar;
        do {
            zyVar = (Object) a9Var.getValue();
        } while (!a9Var.mo24069g(zyVar, x2Var.invoke(zyVar)));
    }
}
