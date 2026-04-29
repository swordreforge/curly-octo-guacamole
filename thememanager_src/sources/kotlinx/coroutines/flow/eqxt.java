package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.miui.maml.folme.AnimatedProperty;
import kotlinx.coroutines.flow.internal.C6592s;
import kotlinx.coroutines.internal.C6679l;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000H\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a%\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\"\u001a\u0010\u001c\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u0012\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {C0846k.zaso, "", "replay", "extraBufferCapacity", "Lkotlinx/coroutines/channels/qrj;", "onBufferOverflow", "Lkotlinx/coroutines/flow/jk;", "k", "", "", "", "index", C7704k.y.toq.f95579toq, "([Ljava/lang/Object;J)Ljava/lang/Object;", "item", "Lkotlin/was;", AnimatedProperty.PROPERTY_NAME_Y, "([Ljava/lang/Object;JLjava/lang/Object;)V", "Lkotlinx/coroutines/flow/d3;", "Lkotlin/coroutines/f7l8;", "context", "capacity", "Lkotlinx/coroutines/flow/s;", "n", "Lkotlinx/coroutines/internal/l;", "Lkotlinx/coroutines/internal/l;", "getNO_VALUE$annotations", "()V", "NO_VALUE", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class eqxt {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final C6679l f36949k = new C6679l("NO_VALUE");

    public static /* synthetic */ void f7l8() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Object m24083g(Object[] objArr, long j2) {
        return objArr[((int) j2) & (objArr.length - 1)];
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <T> jk<T> m24084k(int i2, int i3, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        boolean z2 = true;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.d2ok.mcp("replay cannot be negative, but was ", Integer.valueOf(i2)).toString());
        }
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.d2ok.mcp("extraBufferCapacity cannot be negative, but was ", Integer.valueOf(i3)).toString());
        }
        if (i2 <= 0 && i3 <= 0 && qrjVar != kotlinx.coroutines.channels.qrj.SUSPEND) {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalArgumentException(kotlin.jvm.internal.d2ok.mcp("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", qrjVar).toString());
        }
        int i4 = i3 + i2;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        return new oc(i2, i4, qrjVar);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final <T> InterfaceC6622s<T> m24085n(@InterfaceC7396q d3<? extends T> d3Var, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        return ((i2 == 0 || i2 == -3) && qrjVar == kotlinx.coroutines.channels.qrj.SUSPEND) ? d3Var : new C6592s(d3Var, f7l8Var, i2, qrjVar);
    }

    public static /* synthetic */ jk toq(int i2, int i3, kotlinx.coroutines.channels.qrj qrjVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            qrjVar = kotlinx.coroutines.channels.qrj.SUSPEND;
        }
        return m24084k(i2, i3, qrjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m24087y(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }
}
