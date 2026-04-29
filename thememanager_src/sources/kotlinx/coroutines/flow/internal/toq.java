package kotlinx.coroutines.flow.internal;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.Arrays;
import kotlin.C6323o;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import kotlinx.coroutines.flow.hyr;
import kotlinx.coroutines.flow.internal.AbstractC6587q;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b+\u0010\u001aJ\u000f\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t2\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0011H\u0084\bR>\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t2\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t8\u0004@BX\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00078\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070'8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lkotlinx/coroutines/flow/internal/toq;", "Lkotlinx/coroutines/flow/internal/q;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "ld6", "()Lkotlinx/coroutines/flow/internal/q;", "", "size", "", "x2", "(I)[Lkotlinx/coroutines/flow/internal/q;", "p", "slot", "Lkotlin/was;", "n7h", "(Lkotlinx/coroutines/flow/internal/q;)V", "Lkotlin/Function1;", "block", "qrj", "<set-?>", "k", "[Lkotlinx/coroutines/flow/internal/q;", AnimatedProperty.PROPERTY_NAME_H, "()[Lkotlinx/coroutines/flow/internal/q;", "getSlots$annotations", "()V", "slots", "q", com.market.sdk.reflect.toq.f28131g, "kja0", "()I", "nCollectors", "n", "nextIndex", "Lkotlinx/coroutines/flow/internal/wvg;", C7704k.y.toq.f95579toq, "Lkotlinx/coroutines/flow/internal/wvg;", "_subscriptionCount", "Lkotlinx/coroutines/flow/hyr;", "zy", "()Lkotlinx/coroutines/flow/hyr;", "subscriptionCount", C4991s.f28129n, "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public abstract class toq<S extends AbstractC6587q<?>> {

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private wvg f37021g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private S[] f37022k;

    /* JADX INFO: renamed from: n */
    private int f37023n;

    /* JADX INFO: renamed from: q */
    private int f37024q;

    protected static /* synthetic */ void cdj() {
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: h */
    protected final S[] m24138h() {
        return this.f37022k;
    }

    protected final int kja0() {
        return this.f37024q;
    }

    @InterfaceC7396q
    protected abstract S ld6();

    protected final void n7h(@InterfaceC7396q S s2) {
        wvg wvgVar;
        int i2;
        InterfaceC6216q<was>[] qVar;
        synchronized (this) {
            this.f37024q = kja0() - 1;
            wvgVar = this.f37021g;
            i2 = 0;
            if (kja0() == 0) {
                this.f37023n = 0;
            }
            qVar = s2.toq(this);
        }
        int length = qVar.length;
        while (i2 < length) {
            InterfaceC6216q<was> interfaceC6216q = qVar[i2];
            i2++;
            if (interfaceC6216q != null) {
                C6323o.k kVar = C6323o.Companion;
                interfaceC6216q.resumeWith(C6323o.m28280constructorimpl(was.f36763k));
            }
        }
        if (wvgVar == null) {
            return;
        }
        wvgVar.yz(-1);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    protected final S m24139p() {
        S s2;
        wvg wvgVar;
        synchronized (this) {
            S[] sArr = (S[]) m24138h();
            if (sArr == null) {
                sArr = (S[]) x2(2);
                this.f37022k = sArr;
            } else if (kja0() >= sArr.length) {
                Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                d2ok.kja0(objArrCopyOf, "copyOf(this, newSize)");
                this.f37022k = (S[]) ((AbstractC6587q[]) objArrCopyOf);
                sArr = (S[]) ((AbstractC6587q[]) objArrCopyOf);
            }
            int i2 = this.f37023n;
            do {
                s2 = sArr[i2];
                if (s2 == null) {
                    s2 = (S) ld6();
                    sArr[i2] = s2;
                }
                i2++;
                if (i2 >= sArr.length) {
                    i2 = 0;
                }
            } while (!s2.mo24077k(this));
            this.f37023n = i2;
            this.f37024q = kja0() + 1;
            wvgVar = this.f37021g;
        }
        if (wvgVar != null) {
            wvgVar.yz(1);
        }
        return s2;
    }

    protected final void qrj(@InterfaceC7396q cyoe.x2<? super S, was> x2Var) {
        AbstractC6587q[] abstractC6587qArr;
        if (this.f37024q == 0 || (abstractC6587qArr = this.f37022k) == null) {
            return;
        }
        int i2 = 0;
        int length = abstractC6587qArr.length;
        while (i2 < length) {
            AbstractC6587q abstractC6587q = abstractC6587qArr[i2];
            i2++;
            if (abstractC6587q != null) {
                x2Var.invoke(abstractC6587q);
            }
        }
    }

    @InterfaceC7396q
    protected abstract S[] x2(int i2);

    @InterfaceC7396q
    public final hyr<Integer> zy() {
        wvg wvgVar;
        synchronized (this) {
            wvgVar = this.f37021g;
            if (wvgVar == null) {
                wvgVar = new wvg(kja0());
                this.f37021g = wvgVar;
            }
        }
        return wvgVar;
    }
}
