package kotlinx.coroutines.internal;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.InterfaceC6207n;
import kotlin.was;
import kotlinx.coroutines.AbstractC6741u;
import kotlinx.coroutines.C6551e;
import kotlinx.coroutines.C6710r;
import kotlinx.coroutines.bf2;
import kotlinx.coroutines.gbni;
import kotlinx.coroutines.ixz;
import kotlinx.coroutines.n2t;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010;\u001a\u000208\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bL\u0010MJ\u0017\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"JH\u0010'\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2%\b\b\u0010&\u001a\u001f\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\r\u0018\u00010#H\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u0016H\u0010¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\u0086\b¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\b/\u0010\"J\u001f\u00103\u001a\u00020\r2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00028\u0000H\u0000¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010<R\u001e\u0010?\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u000e\u0010=\u0012\u0004\b>\u0010\u000fR\u0014\u0010A\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b@\u0010=R\u001a\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0013R\u0014\u00101\u001a\u0002008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001c\u0010H\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, d2 = {"Lkotlinx/coroutines/internal/x2;", C0846k.zaso, "Lkotlinx/coroutines/bf2;", "Lkotlin/coroutines/jvm/internal/n;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/q;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "t8r", "()Z", "Lkotlin/was;", C7704k.y.toq.f44691k, "()V", "fn3e", "Lkotlinx/coroutines/ki;", "ld6", "()Lkotlinx/coroutines/ki;", "Lkotlinx/coroutines/cdj;", "continuation", "", "o1t", "(Lkotlinx/coroutines/cdj;)Ljava/lang/Throwable;", "cause", "i", "(Ljava/lang/Throwable;)Z", "", AnimatedProperty.PROPERTY_NAME_Y, "()Ljava/lang/Object;", "Lkotlin/o;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lkotlin/c;", "name", "onCancellation", "zurt", "(Ljava/lang/Object;Lcyoe/x2;)V", "takenState", "zy", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "fu4", "(Ljava/lang/Object;)Z", "z", "Lkotlin/coroutines/f7l8;", "context", "value", "x2", "(Lkotlin/coroutines/f7l8;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/dd;", C7704k.y.toq.f95579toq, "Lkotlinx/coroutines/dd;", "dispatcher", "Lkotlin/coroutines/q;", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "p", "countOrElement", AnimatedProperty.PROPERTY_NAME_H, "reusableCancellableContinuation", "getContext", "()Lkotlin/coroutines/f7l8;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/n;", "callerFrame", "q", "()Lkotlin/coroutines/q;", "delegate", C4991s.f28129n, "(Lkotlinx/coroutines/dd;Lkotlin/coroutines/q;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class x2<T> extends bf2<T> implements InterfaceC6207n, InterfaceC6216q<T> {

    /* JADX INFO: renamed from: h */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f37259h = AtomicReferenceFieldUpdater.newUpdater(x2.class, Object.class, "_reusableCancellableContinuation");

    @InterfaceC7396q
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    @InterfaceC6765n
    public final kotlinx.coroutines.dd f37260g;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    @InterfaceC6765n
    public final Object f37261p;

    /* JADX INFO: renamed from: s */
    @InterfaceC6765n
    @InterfaceC7395n
    public Object f37262s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    @InterfaceC6765n
    public final InterfaceC6216q<T> f37263y;

    /* JADX WARN: Multi-variable type inference failed */
    public x2(@InterfaceC7396q kotlinx.coroutines.dd ddVar, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        super(-1);
        this.f37260g = ddVar;
        this.f37263y = interfaceC6216q;
        this.f37262s = qrj.f37236k;
        this.f37261p = lrht.toq(getContext());
        this._reusableCancellableContinuation = null;
    }

    /* JADX INFO: renamed from: h */
    private final kotlinx.coroutines.ki<?> m24422h() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof kotlinx.coroutines.ki) {
            return (kotlinx.coroutines.ki) obj;
        }
        return null;
    }

    public static /* synthetic */ void ki() {
    }

    public final void fn3e() {
        m24424s();
        kotlinx.coroutines.ki<?> kiVarM24422h = m24422h();
        if (kiVarM24422h == null) {
            return;
        }
        kiVarM24422h.m24473i();
    }

    public final boolean fu4(@InterfaceC7395n Object obj) {
        gbni gbniVar = (gbni) getContext().get(gbni.ygy);
        if (gbniVar == null || gbniVar.isActive()) {
            return false;
        }
        CancellationException cancellationExceptionD2ok = gbniVar.d2ok();
        zy(obj, cancellationExceptionD2ok);
        C6323o.k kVar = C6323o.Companion;
        resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(cancellationExceptionD2ok)));
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6207n
    @InterfaceC7395n
    public InterfaceC6207n getCallerFrame() {
        InterfaceC6216q<T> interfaceC6216q = this.f37263y;
        if (interfaceC6216q instanceof InterfaceC6207n) {
            return (InterfaceC6207n) interfaceC6216q;
        }
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 getContext() {
        return this.f37263y.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6207n
    @InterfaceC7395n
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m24423i(@InterfaceC7396q Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C6679l c6679l = qrj.f82026toq;
            if (kotlin.jvm.internal.d2ok.f7l8(obj, c6679l)) {
                if (androidx.concurrent.futures.toq.m906k(f37259h, this, c6679l, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.toq.m906k(f37259h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @InterfaceC7395n
    public final kotlinx.coroutines.ki<T> ld6() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = qrj.f82026toq;
                return null;
            }
            if (obj instanceof kotlinx.coroutines.ki) {
                if (androidx.concurrent.futures.toq.m906k(f37259h, this, obj, qrj.f82026toq)) {
                    return (kotlinx.coroutines.ki) obj;
                }
            } else if (obj != qrj.f82026toq && !(obj instanceof Throwable)) {
                throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Inconsistent state ", obj).toString());
            }
        }
    }

    @InterfaceC7395n
    public final Throwable o1t(@InterfaceC7396q kotlinx.coroutines.cdj<?> cdjVar) {
        C6679l c6679l;
        do {
            Object obj = this._reusableCancellableContinuation;
            c6679l = qrj.f82026toq;
            if (obj != c6679l) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Inconsistent state ", obj).toString());
                }
                if (androidx.concurrent.futures.toq.m906k(f37259h, this, obj, null)) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } while (!androidx.concurrent.futures.toq.m906k(f37259h, this, c6679l, cdjVar));
        return null;
    }

    @Override // kotlinx.coroutines.bf2
    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public InterfaceC6216q<T> mo23829q() {
        return this;
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    public void resumeWith(@InterfaceC7396q Object obj) {
        kotlin.coroutines.f7l8 context = this.f37263y.getContext();
        Object objM24047q = kotlinx.coroutines.eqxt.m24047q(obj, null, 1, null);
        if (this.f37260g.wlev(context)) {
            this.f37262s = objM24047q;
            this.f36789n = 0;
            this.f37260g.bap7(context, this);
            return;
        }
        AbstractC6741u qVar = ixz.f37275k.toq();
        if (qVar.cnbm()) {
            this.f37262s = objM24047q;
            this.f36789n = 0;
            qVar.lw(this);
            return;
        }
        qVar.oki(true);
        try {
            kotlin.coroutines.f7l8 context2 = getContext();
            Object objZy = lrht.zy(context2, this.f37261p);
            try {
                this.f37263y.resumeWith(obj);
                was wasVar = was.f36763k;
                while (qVar.nme()) {
                }
            } finally {
                lrht.m24365k(context2, objZy);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m24424s() {
        while (this._reusableCancellableContinuation == qrj.f82026toq) {
        }
    }

    public final boolean t8r() {
        return this._reusableCancellableContinuation != null;
    }

    @InterfaceC7396q
    public String toString() {
        return "DispatchedContinuation[" + this.f37260g + ", " + C6551e.zy(this.f37263y) + ']';
    }

    public final void x2(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, T t2) {
        this.f37262s = t2;
        this.f36789n = 1;
        this.f37260g.h4b(f7l8Var, this);
    }

    @Override // kotlinx.coroutines.bf2
    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public Object mo23830y() {
        Object obj = this.f37262s;
        this.f37262s = qrj.f37236k;
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[DONT_GENERATE] */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m24425z(@mub.InterfaceC7396q java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.q<T> r0 = r5.f37263y
            java.lang.Object r1 = r5.f37261p
            kotlin.coroutines.f7l8 r2 = r0.getContext()
            java.lang.Object r1 = kotlinx.coroutines.internal.lrht.zy(r2, r1)
            kotlinx.coroutines.internal.l r3 = kotlinx.coroutines.internal.lrht.f37225k
            if (r1 == r3) goto L15
            kotlinx.coroutines.n2t r0 = kotlinx.coroutines.C6710r.f7l8(r0, r2, r1)
            goto L16
        L15:
            r0 = 0
        L16:
            r3 = 1
            kotlin.coroutines.q<T> r4 = r5.f37263y     // Catch: java.lang.Throwable -> L30
            r4.resumeWith(r6)     // Catch: java.lang.Throwable -> L30
            kotlin.was r6 = kotlin.was.f36763k     // Catch: java.lang.Throwable -> L30
            kotlin.jvm.internal.d3.m23090q(r3)
            if (r0 == 0) goto L29
            boolean r6 = r0.pc()
            if (r6 == 0) goto L2c
        L29:
            kotlinx.coroutines.internal.lrht.m24365k(r2, r1)
        L2c:
            kotlin.jvm.internal.d3.zy(r3)
            return
        L30:
            r6 = move-exception
            kotlin.jvm.internal.d3.m23090q(r3)
            if (r0 == 0) goto L3c
            boolean r0 = r0.pc()
            if (r0 == 0) goto L3f
        L3c:
            kotlinx.coroutines.internal.lrht.m24365k(r2, r1)
        L3f:
            kotlin.jvm.internal.d3.zy(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.x2.m24425z(java.lang.Object):void");
    }

    /* JADX WARN: Finally extract failed */
    public final void zurt(@InterfaceC7396q Object obj, @InterfaceC7395n cyoe.x2<? super Throwable, was> x2Var) {
        boolean z2;
        Object qVar = kotlinx.coroutines.eqxt.toq(obj, x2Var);
        if (this.f37260g.wlev(getContext())) {
            this.f37262s = qVar;
            this.f36789n = 1;
            this.f37260g.bap7(getContext(), this);
            return;
        }
        AbstractC6741u qVar2 = ixz.f37275k.toq();
        if (qVar2.cnbm()) {
            this.f37262s = qVar;
            this.f36789n = 1;
            qVar2.lw(this);
            return;
        }
        qVar2.oki(true);
        try {
            gbni gbniVar = (gbni) getContext().get(gbni.ygy);
            if (gbniVar == null || gbniVar.isActive()) {
                z2 = false;
            } else {
                CancellationException cancellationExceptionD2ok = gbniVar.d2ok();
                zy(qVar, cancellationExceptionD2ok);
                C6323o.k kVar = C6323o.Companion;
                resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(cancellationExceptionD2ok)));
                z2 = true;
            }
            if (!z2) {
                InterfaceC6216q<T> interfaceC6216q = this.f37263y;
                Object obj2 = this.f37261p;
                kotlin.coroutines.f7l8 context = interfaceC6216q.getContext();
                Object objZy = lrht.zy(context, obj2);
                n2t<?> n2tVarF7l8 = objZy != lrht.f37225k ? C6710r.f7l8(interfaceC6216q, context, objZy) : null;
                try {
                    this.f37263y.resumeWith(obj);
                    was wasVar = was.f36763k;
                    kotlin.jvm.internal.d3.m23090q(1);
                    if (n2tVarF7l8 == null || n2tVarF7l8.pc()) {
                        lrht.m24365k(context, objZy);
                    }
                    kotlin.jvm.internal.d3.zy(1);
                } catch (Throwable th) {
                    kotlin.jvm.internal.d3.m23090q(1);
                    if (n2tVarF7l8 == null || n2tVarF7l8.pc()) {
                        lrht.m24365k(context, objZy);
                    }
                    kotlin.jvm.internal.d3.zy(1);
                    throw th;
                }
            }
            while (qVar2.nme()) {
            }
            kotlin.jvm.internal.d3.m23090q(1);
        } catch (Throwable th2) {
            try {
                f7l8(th2, null);
                kotlin.jvm.internal.d3.m23090q(1);
            } catch (Throwable th3) {
                kotlin.jvm.internal.d3.m23090q(1);
                qVar2.dxef(true);
                kotlin.jvm.internal.d3.zy(1);
                throw th3;
            }
        }
        qVar2.dxef(true);
        kotlin.jvm.internal.d3.zy(1);
    }

    @Override // kotlinx.coroutines.bf2
    public void zy(@InterfaceC7395n Object obj, @InterfaceC7396q Throwable th) {
        if (obj instanceof kotlinx.coroutines.fti) {
            ((kotlinx.coroutines.fti) obj).f81999toq.invoke(th);
        }
    }
}
