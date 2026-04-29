package kotlinx.coroutines.internal;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import com.xiaomi.onetrack.p013b.C5717e;
import cyoe.InterfaceC5981k;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C6303m;
import kotlinx.coroutines.C6551e;
import kotlinx.coroutines.tfm;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.z */
/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001:\u0005JKLMNB\u0007¢\u0006\u0004\bI\u00102J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00060\u0000j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0000j\u0002`\u0005H\u0082\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082\u0010¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0016\u001a\u00020\u00152\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0081\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u001a\u0010\fJ)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\f\b\u0000\u0010\u001b*\u00060\u0000j\u0002`\u00052\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\u001f\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086\b¢\u0006\u0004\b\u001f\u0010 J4\u0010#\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u0016\u0010\"\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0005\u0012\u0004\u0012\u00020\u00130!H\u0086\b¢\u0006\u0004\b#\u0010$JD\u0010%\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u0016\u0010\"\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0005\u0012\u0004\u0012\u00020\u00130!2\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086\b¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0001¢\u0006\u0004\b'\u0010(J/\u0010+\u001a\u00020*2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u00052\u0006\u0010)\u001a\u00020\u0015H\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0001¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\n¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\nH\u0001¢\u0006\u0004\b3\u00102J\u0015\u00104\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b4\u00100J\u0017\u00106\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u000505¢\u0006\u0004\b6\u00107J.\u00108\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001b\u0018\u00012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130!H\u0086\b¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0014¢\u0006\u0004\b:\u00100J'\u0010<\u001a\u00020\n2\n\u0010;\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0000¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010.R\u0011\u0010\t\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0015\u0010F\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\bE\u00100R\u0015\u0010H\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\bG\u00100¨\u0006O"}, d2 = {"Lkotlinx/coroutines/internal/z;", "", "Lkotlinx/coroutines/internal/d2ok;", "m", "()Lkotlinx/coroutines/internal/d2ok;", "Lkotlinx/coroutines/internal/Node;", "current", "ncyb", "(Lkotlinx/coroutines/internal/z;)Lkotlinx/coroutines/internal/z;", "next", "Lkotlin/was;", C5717e.f31929a, "(Lkotlinx/coroutines/internal/z;)V", "Lkotlinx/coroutines/internal/oc;", "op", "d2ok", "(Lkotlinx/coroutines/internal/oc;)Lkotlinx/coroutines/internal/z;", "node", "Lkotlin/Function0;", "", "condition", "Lkotlinx/coroutines/internal/z$zy;", "vyq", "(Lkotlinx/coroutines/internal/z;Lcyoe/k;)Lkotlinx/coroutines/internal/z$zy;", "eqxt", "(Lkotlinx/coroutines/internal/z;)Z", "fti", C0846k.zaso, "Lkotlinx/coroutines/internal/z$toq;", "dd", "(Lkotlinx/coroutines/internal/z;)Lkotlinx/coroutines/internal/z$toq;", "jp0y", "(Lkotlinx/coroutines/internal/z;Lcyoe/k;)Z", "Lkotlin/Function1;", "predicate", "gvn7", "(Lkotlinx/coroutines/internal/z;Lcyoe/x2;)Z", "d3", "(Lkotlinx/coroutines/internal/z;Lcyoe/x2;Lcyoe/k;)Z", "oc", "(Lkotlinx/coroutines/internal/z;Lkotlinx/coroutines/internal/z;)Z", "condAdd", "", "ek5k", "(Lkotlinx/coroutines/internal/z;Lkotlinx/coroutines/internal/z;Lkotlinx/coroutines/internal/z$zy;)I", "nn86", "()Z", "o", "()Lkotlinx/coroutines/internal/z;", "c", "()V", "lrht", "j", "Lkotlinx/coroutines/internal/z$n;", "x9kr", "()Lkotlinx/coroutines/internal/z$n;", "hb", "(Lcyoe/x2;)Ljava/lang/Object;", "e", "prev", "yz", "(Lkotlinx/coroutines/internal/z;Lkotlinx/coroutines/internal/z;)V", "", "toString", "()Ljava/lang/String;", "uv6", "isRemoved", "n5r1", "()Ljava/lang/Object;", "hyr", "nextNode", "f", "prevNode", C4991s.f28129n, "k", "toq", "zy", "q", "n", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@tfm
public class C6694z {

    @InterfaceC7396q
    volatile /* synthetic */ Object _next = this;

    @InterfaceC7396q
    volatile /* synthetic */ Object _prev = this;

    @InterfaceC7396q
    private volatile /* synthetic */ Object _removedRef = null;

    /* JADX INFO: renamed from: k */
    static final /* synthetic */ AtomicReferenceFieldUpdater f37266k = AtomicReferenceFieldUpdater.newUpdater(C6694z.class, Object.class, "_next");

    /* JADX INFO: renamed from: q */
    static final /* synthetic */ AtomicReferenceFieldUpdater f37268q = AtomicReferenceFieldUpdater.newUpdater(C6694z.class, Object.class, "_prev");

    /* JADX INFO: renamed from: n */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f37267n = AtomicReferenceFieldUpdater.newUpdater(C6694z.class, Object.class, "_removedRef");

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.z$g */
    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/internal/z$g", "Lkotlinx/coroutines/internal/z$zy;", "Lkotlinx/coroutines/internal/z;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "ld6", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class g extends zy {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ InterfaceC5981k<Boolean> f37269n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC5981k<Boolean> interfaceC5981k) {
            super(C6694z.this);
            this.f37269n = interfaceC5981k;
        }

        @Override // kotlinx.coroutines.internal.AbstractC6689q
        @InterfaceC7395n
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public Object mo23910s(@InterfaceC7396q C6694z c6694z) {
            if (this.f37269n.invoke().booleanValue()) {
                return null;
            }
            return fu4.m24339k();
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.z$k */
    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0016\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0014J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\bH\u0014J \u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H$J \u0010\u000f\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H&J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u0014\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0015J\u001c\u0010\u0018\u001a\u00020\r2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\bR\u001c\u0010\u001b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006 "}, d2 = {"Lkotlinx/coroutines/internal/z$k;", "Lkotlinx/coroutines/internal/toq;", "Lkotlinx/coroutines/internal/oc;", "op", "Lkotlinx/coroutines/internal/z;", "Lkotlinx/coroutines/internal/Node;", "qrj", "affected", "", "n", "next", "", "x2", "Lkotlin/was;", C7704k.y.toq.f95579toq, "n7h", "Lkotlinx/coroutines/internal/z$q;", "prepareOp", "f7l8", "p", "ld6", "Lkotlinx/coroutines/internal/q;", "zy", "failure", "k", AnimatedProperty.PROPERTY_NAME_Y, "()Lkotlinx/coroutines/internal/z;", "affectedNode", C7704k.y.toq.f44691k, "originalNext", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static abstract class k extends kotlinx.coroutines.internal.toq {
        public abstract void f7l8(@InterfaceC7396q q qVar);

        /* JADX INFO: renamed from: g */
        protected abstract void mo24447g(@InterfaceC7396q C6694z c6694z, @InterfaceC7396q C6694z c6694z2);

        @Override // kotlinx.coroutines.internal.toq
        /* JADX INFO: renamed from: k */
        public final void mo24414k(@InterfaceC7396q AbstractC6689q<?> abstractC6689q, @InterfaceC7395n Object obj) {
            C6694z c6694zMo24448s;
            boolean z2 = obj == null;
            C6694z c6694zMo24449y = mo24449y();
            if (c6694zMo24449y == null || (c6694zMo24448s = mo24448s()) == null) {
                return;
            }
            if (androidx.concurrent.futures.toq.m906k(C6694z.f37266k, c6694zMo24449y, abstractC6689q, z2 ? n7h(c6694zMo24449y, c6694zMo24448s) : c6694zMo24448s) && z2) {
                mo24447g(c6694zMo24449y, c6694zMo24448s);
            }
        }

        public void ld6(@InterfaceC7396q C6694z c6694z) {
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: n */
        protected Object mo23903n(@InterfaceC7396q C6694z c6694z) {
            return null;
        }

        @InterfaceC7396q
        public abstract Object n7h(@InterfaceC7396q C6694z c6694z, @InterfaceC7396q C6694z c6694z2);

        @InterfaceC7395n
        /* JADX INFO: renamed from: p */
        public Object mo23904p(@InterfaceC7396q q qVar) {
            f7l8(qVar);
            return null;
        }

        @InterfaceC7395n
        protected C6694z qrj(@InterfaceC7396q oc ocVar) {
            C6694z c6694zMo24449y = mo24449y();
            kotlin.jvm.internal.d2ok.qrj(c6694zMo24449y);
            return c6694zMo24449y;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: s */
        protected abstract C6694z mo24448s();

        protected boolean x2(@InterfaceC7396q C6694z c6694z, @InterfaceC7396q Object obj) {
            return false;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: y */
        protected abstract C6694z mo24449y();

        @Override // kotlinx.coroutines.internal.toq
        @InterfaceC7395n
        public final Object zy(@InterfaceC7396q AbstractC6689q<?> abstractC6689q) {
            while (true) {
                C6694z c6694zQrj = qrj(abstractC6689q);
                if (c6694zQrj == null) {
                    return kotlinx.coroutines.internal.zy.f82050toq;
                }
                Object obj = c6694zQrj._next;
                if (obj == abstractC6689q || abstractC6689q.m24398y()) {
                    return null;
                }
                if (obj instanceof oc) {
                    oc ocVar = (oc) obj;
                    if (abstractC6689q.toq(ocVar)) {
                        return kotlinx.coroutines.internal.zy.f82050toq;
                    }
                    ocVar.zy(c6694zQrj);
                } else {
                    Object objMo23903n = mo23903n(c6694zQrj);
                    if (objMo23903n != null) {
                        return objMo23903n;
                    }
                    if (x2(c6694zQrj, obj)) {
                        continue;
                    } else {
                        q qVar = new q(c6694zQrj, (C6694z) obj, this);
                        if (androidx.concurrent.futures.toq.m906k(C6694z.f37266k, c6694zQrj, obj, qVar)) {
                            try {
                                if (qVar.zy(c6694zQrj) != o1t.f37233k) {
                                    return null;
                                }
                            } catch (Throwable th) {
                                androidx.concurrent.futures.toq.m906k(C6694z.f37266k, c6694zQrj, qVar, obj);
                                throw th;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.z$n */
    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\u0010\u001c\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b'\u0010(J\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u000e2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\r\u001a\u00020\nH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00132\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u00060\u0005j\u0002`\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010!\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010&\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006)"}, d2 = {"Lkotlinx/coroutines/internal/z$n;", C0846k.zaso, "Lkotlinx/coroutines/internal/z$k;", "Lkotlinx/coroutines/internal/oc;", "op", "Lkotlinx/coroutines/internal/z;", "Lkotlinx/coroutines/internal/Node;", "qrj", "(Lkotlinx/coroutines/internal/oc;)Lkotlinx/coroutines/internal/z;", "affected", "", "n", "(Lkotlinx/coroutines/internal/z;)Ljava/lang/Object;", "next", "", "x2", "(Lkotlinx/coroutines/internal/z;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/z$q;", "prepareOp", "Lkotlin/was;", "f7l8", "(Lkotlinx/coroutines/internal/z$q;)V", "n7h", "(Lkotlinx/coroutines/internal/z;Lkotlinx/coroutines/internal/z;)Ljava/lang/Object;", C7704k.y.toq.f95579toq, "(Lkotlinx/coroutines/internal/z;Lkotlinx/coroutines/internal/z;)V", "toq", "Lkotlinx/coroutines/internal/z;", "queue", "kja0", "()Ljava/lang/Object;", "getResult$annotations", "()V", "result", AnimatedProperty.PROPERTY_NAME_Y, "()Lkotlinx/coroutines/internal/z;", "affectedNode", C7704k.y.toq.f44691k, "originalNext", C4991s.f28129n, "(Lkotlinx/coroutines/internal/z;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static class n<T> extends k {

        @InterfaceC7396q
        private volatile /* synthetic */ Object _affectedNode = null;

        @InterfaceC7396q
        private volatile /* synthetic */ Object _originalNext = null;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        @InterfaceC6765n
        public final C6694z f82043toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f82042zy = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_affectedNode");

        /* JADX INFO: renamed from: q */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f37271q = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_originalNext");

        public n(@InterfaceC7396q C6694z c6694z) {
            this.f82043toq = c6694z;
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m24450h() {
        }

        @Override // kotlinx.coroutines.internal.C6694z.k
        public void f7l8(@InterfaceC7396q q qVar) {
            androidx.concurrent.futures.toq.m906k(f82042zy, this, null, qVar.f37272k);
            androidx.concurrent.futures.toq.m906k(f37271q, this, null, qVar.f82044toq);
        }

        @Override // kotlinx.coroutines.internal.C6694z.k
        /* JADX INFO: renamed from: g */
        protected final void mo24447g(@InterfaceC7396q C6694z c6694z, @InterfaceC7396q C6694z c6694z2) {
            c6694z2.d2ok(null);
        }

        public final T kja0() {
            T t2 = (T) mo24449y();
            kotlin.jvm.internal.d2ok.qrj(t2);
            return t2;
        }

        @Override // kotlinx.coroutines.internal.C6694z.k
        @InterfaceC7395n
        /* JADX INFO: renamed from: n */
        protected Object mo23903n(@InterfaceC7396q C6694z c6694z) {
            if (c6694z == this.f82043toq) {
                return fu4.m24341q();
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.C6694z.k
        @InterfaceC7396q
        public final Object n7h(@InterfaceC7396q C6694z c6694z, @InterfaceC7396q C6694z c6694z2) {
            return c6694z2.m24441m();
        }

        @Override // kotlinx.coroutines.internal.C6694z.k
        @InterfaceC7395n
        protected final C6694z qrj(@InterfaceC7396q oc ocVar) {
            C6694z c6694z = this.f82043toq;
            while (true) {
                Object obj = c6694z._next;
                if (!(obj instanceof oc)) {
                    return (C6694z) obj;
                }
                oc ocVar2 = (oc) obj;
                if (ocVar.toq(ocVar2)) {
                    return null;
                }
                ocVar2.zy(this.f82043toq);
            }
        }

        @Override // kotlinx.coroutines.internal.C6694z.k
        @InterfaceC7395n
        /* JADX INFO: renamed from: s */
        protected final C6694z mo24448s() {
            return (C6694z) this._originalNext;
        }

        @Override // kotlinx.coroutines.internal.C6694z.k
        protected final boolean x2(@InterfaceC7396q C6694z c6694z, @InterfaceC7396q Object obj) {
            if (!(obj instanceof d2ok)) {
                return false;
            }
            ((d2ok) obj).f37207k.lrht();
            return true;
        }

        @Override // kotlinx.coroutines.internal.C6694z.k
        @InterfaceC7395n
        /* JADX INFO: renamed from: y */
        protected final C6694z mo24449y() {
            return (C6694z) this._affectedNode;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.z$q */
    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.d3(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0003\u001a\u00060\tj\u0002`\n\u0012\n\u0010\u000e\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0018\u0010\u0003\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/internal/z$q;", "Lkotlinx/coroutines/internal/oc;", "", "affected", "zy", "Lkotlin/was;", "q", "", "toString", "Lkotlinx/coroutines/internal/z;", "Lkotlinx/coroutines/internal/Node;", "k", "Lkotlinx/coroutines/internal/z;", "toq", "next", "Lkotlinx/coroutines/internal/z$k;", "Lkotlinx/coroutines/internal/z$k;", "desc", "Lkotlinx/coroutines/internal/q;", "()Lkotlinx/coroutines/internal/q;", "atomicOp", C4991s.f28129n, "(Lkotlinx/coroutines/internal/z;Lkotlinx/coroutines/internal/z;Lkotlinx/coroutines/internal/z$k;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class q extends oc {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        @InterfaceC6765n
        public final C6694z f37272k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        @InterfaceC6765n
        public final C6694z f82044toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        @InterfaceC6765n
        public final k f82045zy;

        public q(@InterfaceC7396q C6694z c6694z, @InterfaceC7396q C6694z c6694z2, @InterfaceC7396q k kVar) {
            this.f37272k = c6694z;
            this.f82044toq = c6694z2;
            this.f82045zy = kVar;
        }

        @Override // kotlinx.coroutines.internal.oc
        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public AbstractC6689q<?> mo24394k() {
            return this.f82045zy.toq();
        }

        /* JADX INFO: renamed from: q */
        public final void m24451q() {
            this.f82045zy.f7l8(this);
        }

        @Override // kotlinx.coroutines.internal.oc
        @InterfaceC7396q
        public String toString() {
            return "PrepareOp(op=" + mo24394k() + ')';
        }

        @Override // kotlinx.coroutines.internal.oc
        @InterfaceC7395n
        public Object zy(@InterfaceC7395n Object obj) {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            }
            C6694z c6694z = (C6694z) obj;
            Object objMo23904p = this.f82045zy.mo23904p(this);
            Object obj2 = o1t.f37233k;
            if (objMo23904p != obj2) {
                Object objM24396n = objMo23904p != null ? mo24394k().m24396n(objMo23904p) : mo24394k().m24395g();
                androidx.concurrent.futures.toq.m906k(C6694z.f37266k, c6694z, this, objM24396n == kotlinx.coroutines.internal.zy.f37274k ? mo24394k() : objM24396n == null ? this.f82045zy.n7h(c6694z, this.f82044toq) : this.f82044toq);
                return null;
            }
            C6694z c6694z2 = this.f82044toq;
            if (androidx.concurrent.futures.toq.m906k(C6694z.f37266k, c6694z, this, c6694z2.m24441m())) {
                this.f82045zy.ld6(c6694z);
                c6694z2.d2ok(null);
            }
            return obj2;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.z$toq */
    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.d3(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020\u0004B\u001b\u0012\n\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010\u0017J\u001f\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00112\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u00060\u0001j\u0002`\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u00060\u0001j\u0002`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lkotlinx/coroutines/internal/z$toq;", "Lkotlinx/coroutines/internal/z;", "Lkotlinx/coroutines/internal/Node;", C0846k.zaso, "Lkotlinx/coroutines/internal/z$k;", "Lkotlinx/coroutines/internal/oc;", "op", "qrj", "(Lkotlinx/coroutines/internal/oc;)Lkotlinx/coroutines/internal/z;", "affected", "", "next", "", "x2", "(Lkotlinx/coroutines/internal/z;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/z$q;", "prepareOp", "Lkotlin/was;", "f7l8", "(Lkotlinx/coroutines/internal/z$q;)V", "n7h", "(Lkotlinx/coroutines/internal/z;Lkotlinx/coroutines/internal/z;)Ljava/lang/Object;", C7704k.y.toq.f95579toq, "(Lkotlinx/coroutines/internal/z;Lkotlinx/coroutines/internal/z;)V", "toq", "Lkotlinx/coroutines/internal/z;", "queue", "zy", "node", AnimatedProperty.PROPERTY_NAME_Y, "()Lkotlinx/coroutines/internal/z;", "affectedNode", C7704k.y.toq.f44691k, "originalNext", C4991s.f28129n, "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static class toq<T extends C6694z> extends k {

        /* JADX INFO: renamed from: q */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f37273q = AtomicReferenceFieldUpdater.newUpdater(toq.class, Object.class, "_affectedNode");

        @InterfaceC7396q
        private volatile /* synthetic */ Object _affectedNode = null;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        @InterfaceC6765n
        public final C6694z f82046toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        @InterfaceC6765n
        public final T f82047zy;

        public toq(@InterfaceC7396q C6694z c6694z, @InterfaceC7396q T t2) {
            this.f82046toq = c6694z;
            this.f82047zy = t2;
        }

        @Override // kotlinx.coroutines.internal.C6694z.k
        public void f7l8(@InterfaceC7396q q qVar) {
            androidx.concurrent.futures.toq.m906k(f37273q, this, null, qVar.f37272k);
        }

        @Override // kotlinx.coroutines.internal.C6694z.k
        /* JADX INFO: renamed from: g */
        protected void mo24447g(@InterfaceC7396q C6694z c6694z, @InterfaceC7396q C6694z c6694z2) {
            this.f82047zy.m24440l(this.f82046toq);
        }

        @Override // kotlinx.coroutines.internal.C6694z.k
        @InterfaceC7396q
        public Object n7h(@InterfaceC7396q C6694z c6694z, @InterfaceC7396q C6694z c6694z2) {
            T t2 = this.f82047zy;
            androidx.concurrent.futures.toq.m906k(C6694z.f37268q, t2, t2, c6694z);
            T t3 = this.f82047zy;
            androidx.concurrent.futures.toq.m906k(C6694z.f37266k, t3, t3, this.f82046toq);
            return this.f82047zy;
        }

        @Override // kotlinx.coroutines.internal.C6694z.k
        @InterfaceC7395n
        protected final C6694z qrj(@InterfaceC7396q oc ocVar) {
            return this.f82046toq.d2ok(ocVar);
        }

        @Override // kotlinx.coroutines.internal.C6694z.k
        @InterfaceC7396q
        /* JADX INFO: renamed from: s */
        protected final C6694z mo24448s() {
            return this.f82046toq;
        }

        @Override // kotlinx.coroutines.internal.C6694z.k
        protected boolean x2(@InterfaceC7396q C6694z c6694z, @InterfaceC7396q Object obj) {
            return obj != this.f82046toq;
        }

        @Override // kotlinx.coroutines.internal.C6694z.k
        @InterfaceC7395n
        /* JADX INFO: renamed from: y */
        protected final C6694z mo24449y() {
            return (C6694z) this._affectedNode;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.z$zy */
    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.nn86
    @kotlin.d3(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0018\u0010\u000b\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/internal/z$zy;", "Lkotlinx/coroutines/internal/q;", "Lkotlinx/coroutines/internal/z;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "failure", "Lkotlin/was;", "p", "toq", "Lkotlinx/coroutines/internal/z;", "newNode", "zy", "oldNext", C4991s.f28129n, "(Lkotlinx/coroutines/internal/z;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static abstract class zy extends AbstractC6689q<C6694z> {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        @InterfaceC6765n
        public final C6694z f82048toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC6765n
        @InterfaceC7395n
        public C6694z f82049zy;

        public zy(@InterfaceC7396q C6694z c6694z) {
            this.f82048toq = c6694z;
        }

        @Override // kotlinx.coroutines.internal.AbstractC6689q
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo24397q(@InterfaceC7396q C6694z c6694z, @InterfaceC7395n Object obj) {
            boolean z2 = obj == null;
            C6694z c6694z2 = z2 ? this.f82048toq : this.f82049zy;
            if (c6694z2 != null && androidx.concurrent.futures.toq.m906k(C6694z.f37266k, c6694z, this, c6694z2) && z2) {
                C6694z c6694z3 = this.f82048toq;
                C6694z c6694z4 = this.f82049zy;
                kotlin.jvm.internal.d2ok.qrj(c6694z4);
                c6694z3.m24440l(c6694z4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (androidx.concurrent.futures.toq.m906k(kotlinx.coroutines.internal.C6694z.f37266k, r3, r2, ((kotlinx.coroutines.internal.d2ok) r4).f37207k) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.internal.C6694z d2ok(kotlinx.coroutines.internal.oc r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.z r0 = (kotlinx.coroutines.internal.C6694z) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.C6694z.f37268q
            boolean r0 = androidx.concurrent.futures.toq.m906k(r1, r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.uv6()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.oc
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            kotlinx.coroutines.internal.oc r0 = (kotlinx.coroutines.internal.oc) r0
            boolean r0 = r8.toq(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            kotlinx.coroutines.internal.oc r4 = (kotlinx.coroutines.internal.oc) r4
            r4.zy(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.d2ok
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.C6694z.f37266k
            kotlinx.coroutines.internal.d2ok r4 = (kotlinx.coroutines.internal.d2ok) r4
            kotlinx.coroutines.internal.z r4 = r4.f37207k
            boolean r2 = androidx.concurrent.futures.toq.m906k(r5, r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.z r2 = (kotlinx.coroutines.internal.C6694z) r2
            goto L7
        L52:
            r3 = r4
            kotlinx.coroutines.internal.z r3 = (kotlinx.coroutines.internal.C6694z) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C6694z.d2ok(kotlinx.coroutines.internal.oc):kotlinx.coroutines.internal.z");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final void m24440l(C6694z c6694z) {
        C6694z c6694z2;
        do {
            c6694z2 = (C6694z) c6694z._prev;
            if (n5r1() != c6694z) {
                return;
            }
        } while (!androidx.concurrent.futures.toq.m906k(f37268q, c6694z, c6694z2, this));
        if (uv6()) {
            c6694z.d2ok(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final d2ok m24441m() {
        d2ok d2okVar = (d2ok) this._removedRef;
        if (d2okVar != null) {
            return d2okVar;
        }
        d2ok d2okVar2 = new d2ok(this);
        f37267n.lazySet(this, d2okVar2);
        return d2okVar2;
    }

    private final C6694z ncyb(C6694z c6694z) {
        while (c6694z.uv6()) {
            c6694z = (C6694z) c6694z._prev;
        }
        return c6694z;
    }

    /* JADX INFO: renamed from: c */
    public final void m24443c() {
        ((d2ok) n5r1()).f37207k.lrht();
    }

    public final boolean d3(@InterfaceC7396q C6694z c6694z, @InterfaceC7396q cyoe.x2<? super C6694z, Boolean> x2Var, @InterfaceC7396q InterfaceC5981k<Boolean> interfaceC5981k) {
        int iEk5k;
        g gVar = c6694z.new g(interfaceC5981k);
        do {
            C6694z c6694zM24444f = m24444f();
            if (!x2Var.invoke(c6694zM24444f).booleanValue()) {
                return false;
            }
            iEk5k = c6694zM24444f.ek5k(c6694z, this, gVar);
            if (iEk5k == 1) {
                return true;
            }
        } while (iEk5k != 2);
        return false;
    }

    @InterfaceC7396q
    public final <T extends C6694z> toq<T> dd(@InterfaceC7396q T t2) {
        return new toq<>(this, t2);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: e */
    protected C6694z mo24384e() {
        Object objN5r1 = n5r1();
        d2ok d2okVar = objN5r1 instanceof d2ok ? (d2ok) objN5r1 : null;
        if (d2okVar == null) {
            return null;
        }
        return d2okVar.f37207k;
    }

    @kotlin.nn86
    public final int ek5k(@InterfaceC7396q C6694z c6694z, @InterfaceC7396q C6694z c6694z2, @InterfaceC7396q zy zyVar) {
        f37268q.lazySet(c6694z, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37266k;
        atomicReferenceFieldUpdater.lazySet(c6694z, c6694z2);
        zyVar.f82049zy = c6694z2;
        if (androidx.concurrent.futures.toq.m906k(atomicReferenceFieldUpdater, this, c6694z2, zyVar)) {
            return zyVar.zy(this) == null ? 1 : 2;
        }
        return 0;
    }

    public final boolean eqxt(@InterfaceC7396q C6694z c6694z) {
        f37268q.lazySet(c6694z, this);
        f37266k.lazySet(c6694z, this);
        while (n5r1() == this) {
            if (androidx.concurrent.futures.toq.m906k(f37266k, this, this, c6694z)) {
                c6694z.m24440l(this);
                return true;
            }
        }
        return false;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: f */
    public final C6694z m24444f() {
        C6694z c6694zD2ok = d2ok(null);
        return c6694zD2ok == null ? ncyb((C6694z) this._prev) : c6694zD2ok;
    }

    public final void fti(@InterfaceC7396q C6694z c6694z) {
        while (!m24444f().oc(c6694z, this)) {
        }
    }

    public final boolean gvn7(@InterfaceC7396q C6694z c6694z, @InterfaceC7396q cyoe.x2<? super C6694z, Boolean> x2Var) {
        C6694z c6694zM24444f;
        do {
            c6694zM24444f = m24444f();
            if (!x2Var.invoke(c6694zM24444f).booleanValue()) {
                return false;
            }
        } while (!c6694zM24444f.oc(c6694z, this));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object, kotlinx.coroutines.internal.z] */
    public final /* synthetic */ <T> T hb(cyoe.x2<? super T, Boolean> x2Var) {
        while (true) {
            C6694z c6694z = (C6694z) n5r1();
            if (c6694z == this) {
                return null;
            }
            kotlin.jvm.internal.d2ok.m23086z(3, C0846k.zaso);
            if (!(c6694z instanceof Object)) {
                return null;
            }
            if (x2Var.invoke(c6694z).booleanValue() && !c6694z.uv6()) {
                return c6694z;
            }
            C6694z c6694zM24446o = c6694z.m24446o();
            if (c6694zM24446o == null) {
                return c6694z;
            }
            c6694zM24446o.lrht();
        }
    }

    @InterfaceC7396q
    public final C6694z hyr() {
        return fu4.m24342y(n5r1());
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: j */
    public final C6694z m24445j() {
        while (true) {
            C6694z c6694z = (C6694z) n5r1();
            if (c6694z == this) {
                return null;
            }
            if (c6694z.nn86()) {
                return c6694z;
            }
            c6694z.m24443c();
        }
    }

    public final boolean jp0y(@InterfaceC7396q C6694z c6694z, @InterfaceC7396q InterfaceC5981k<Boolean> interfaceC5981k) {
        int iEk5k;
        g gVar = c6694z.new g(interfaceC5981k);
        do {
            iEk5k = m24444f().ek5k(c6694z, this, gVar);
            if (iEk5k == 1) {
                return true;
            }
        } while (iEk5k != 2);
        return false;
    }

    @kotlin.nn86
    public final void lrht() {
        C6694z c6694z = this;
        while (true) {
            Object objN5r1 = c6694z.n5r1();
            if (!(objN5r1 instanceof d2ok)) {
                c6694z.d2ok(null);
                return;
            }
            c6694z = ((d2ok) objN5r1).f37207k;
        }
    }

    @InterfaceC7396q
    public final Object n5r1() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof oc)) {
                return obj;
            }
            ((oc) obj).zy(this);
        }
    }

    public boolean nn86() {
        return m24446o() == null;
    }

    @kotlin.nn86
    @InterfaceC7395n
    /* JADX INFO: renamed from: o */
    public final C6694z m24446o() {
        Object objN5r1;
        C6694z c6694z;
        do {
            objN5r1 = n5r1();
            if (objN5r1 instanceof d2ok) {
                return ((d2ok) objN5r1).f37207k;
            }
            if (objN5r1 == this) {
                return (C6694z) objN5r1;
            }
            c6694z = (C6694z) objN5r1;
        } while (!androidx.concurrent.futures.toq.m906k(f37266k, this, objN5r1, c6694z.m24441m()));
        c6694z.d2ok(null);
        return null;
    }

    @kotlin.nn86
    public final boolean oc(@InterfaceC7396q C6694z c6694z, @InterfaceC7396q C6694z c6694z2) {
        f37268q.lazySet(c6694z, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37266k;
        atomicReferenceFieldUpdater.lazySet(c6694z, c6694z2);
        if (!androidx.concurrent.futures.toq.m906k(atomicReferenceFieldUpdater, this, c6694z2, c6694z)) {
            return false;
        }
        c6694z.m24440l(c6694z2);
        return true;
    }

    @InterfaceC7396q
    public String toString() {
        return new C6303m(this) { // from class: kotlinx.coroutines.internal.z.f7l8
            @Override // kotlin.jvm.internal.C6303m, kotlin.reflect.InterfaceC6364h
            @InterfaceC7395n
            public Object get() {
                return C6551e.m24040k(this.receiver);
            }
        } + '@' + C6551e.toq(this);
    }

    public boolean uv6() {
        return n5r1() instanceof d2ok;
    }

    @kotlin.nn86
    @InterfaceC7396q
    public final zy vyq(@InterfaceC7396q C6694z c6694z, @InterfaceC7396q InterfaceC5981k<Boolean> interfaceC5981k) {
        return c6694z.new g(interfaceC5981k);
    }

    @InterfaceC7396q
    public final n<C6694z> x9kr() {
        return new n<>(this);
    }

    public final void yz(@InterfaceC7396q C6694z c6694z, @InterfaceC7396q C6694z c6694z2) {
    }
}
