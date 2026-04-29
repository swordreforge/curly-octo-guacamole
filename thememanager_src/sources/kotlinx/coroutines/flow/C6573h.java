package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.miui.maml.folme.AnimatedProperty;
import kotlin.coroutines.C6217s;
import kotlinx.coroutines.flow.internal.C6592s;
import kotlinx.coroutines.flow.internal.ki;
import kotlinx.coroutines.gbni;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.h */
/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\n\u001a\u00020\t\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/flow/s;", "", "capacity", "Lkotlinx/coroutines/channels/qrj;", "onBufferOverflow", "toq", "k", "f7l8", "Lkotlin/coroutines/f7l8;", "context", AnimatedProperty.PROPERTY_NAME_Y, "n", "Lkotlin/was;", C7704k.y.toq.f95579toq, "(Lkotlin/coroutines/f7l8;)V", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class C6573h {
    @InterfaceC7396q
    public static final <T> InterfaceC6622s<T> f7l8(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s) {
        return m24111q(interfaceC6622s, -1, null, 2, null);
    }

    /* JADX INFO: renamed from: g */
    private static final void m24108g(kotlin.coroutines.f7l8 f7l8Var) {
        if (!(f7l8Var.get(gbni.ygy) == null)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.d2ok.mcp("Flow context cannot contain job in it. Had ", f7l8Var).toString());
        }
    }

    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ InterfaceC6622s m24109k(InterfaceC6622s interfaceC6622s, int i2) {
        return m24111q(interfaceC6622s, i2, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final <T> InterfaceC6622s<T> m24110n(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s) {
        return interfaceC6622s instanceof zy ? interfaceC6622s : new C6619q(interfaceC6622s);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ InterfaceC6622s m24111q(InterfaceC6622s interfaceC6622s, int i2, kotlinx.coroutines.channels.qrj qrjVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = -2;
        }
        if ((i3 & 2) != 0) {
            qrjVar = kotlinx.coroutines.channels.qrj.SUSPEND;
        }
        return ld6.kja0(interfaceC6622s, i2, qrjVar);
    }

    @InterfaceC7396q
    public static final <T> InterfaceC6622s<T> toq(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        int i3;
        kotlinx.coroutines.channels.qrj qrjVar2;
        boolean z2 = true;
        if (!(i2 >= 0 || i2 == -2 || i2 == -1)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.d2ok.mcp("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", Integer.valueOf(i2)).toString());
        }
        if (i2 == -1 && qrjVar != kotlinx.coroutines.channels.qrj.SUSPEND) {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i2 == -1) {
            qrjVar2 = kotlinx.coroutines.channels.qrj.DROP_OLDEST;
            i3 = 0;
        } else {
            i3 = i2;
            qrjVar2 = qrjVar;
        }
        return interfaceC6622s instanceof kotlinx.coroutines.flow.internal.ki ? ki.C6582k.m24131k((kotlinx.coroutines.flow.internal.ki) interfaceC6622s, null, i3, qrjVar2, 1, null) : new C6592s(interfaceC6622s, null, i3, qrjVar2, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final <T> InterfaceC6622s<T> m24112y(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        m24108g(f7l8Var);
        return kotlin.jvm.internal.d2ok.f7l8(f7l8Var, C6217s.INSTANCE) ? interfaceC6622s : interfaceC6622s instanceof kotlinx.coroutines.flow.internal.ki ? ki.C6582k.m24131k((kotlinx.coroutines.flow.internal.ki) interfaceC6622s, f7l8Var, 0, null, 6, null) : new C6592s(interfaceC6622s, f7l8Var, 0, null, 12, null);
    }

    public static /* synthetic */ InterfaceC6622s zy(InterfaceC6622s interfaceC6622s, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = -2;
        }
        return m24109k(interfaceC6622s, i2);
    }
}
