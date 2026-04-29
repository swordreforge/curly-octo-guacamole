package kotlinx.coroutines.debug.internal;

import androidx.constraintlayout.core.motion.utils.zurt;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6318m;
import kotlin.collections.ni7;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.coroutines.jvm.internal.InterfaceC6207n;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.sequences.cdj;
import kotlin.sequences.fn3e;
import kotlin.sequences.kja0;
import kotlin.was;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.n */
/* JADX INFO: compiled from: DebugCoroutineInfoImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010)\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b3\u00104J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J'\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0082Pø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J#\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\fH\u0016R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001eR\u0013\u0010)\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010(R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010*R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b,\u0010-R(\u00102\u001a\u0004\u0018\u00010\u00062\b\u0010.\u001a\u0004\u0018\u00010\u00068@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b&\u0010/\"\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lkotlinx/coroutines/debug/internal/n;", "", "", "Ljava/lang/StackTraceElement;", "toq", "Lkotlin/sequences/kja0;", "Lkotlin/coroutines/jvm/internal/n;", zurt.InterfaceC0290k.f47402d2ok, "Lkotlin/was;", "ld6", "(Lkotlin/sequences/kja0;Lkotlin/coroutines/jvm/internal/n;Lkotlin/coroutines/q;)Ljava/lang/Object;", AnimatedProperty.PROPERTY_NAME_Y, "", "state", "Lkotlin/coroutines/q;", "p", "(Ljava/lang/String;Lkotlin/coroutines/q;)V", "toString", "Lkotlinx/coroutines/debug/internal/qrj;", "k", "Lkotlinx/coroutines/debug/internal/qrj;", "q", "()Lkotlinx/coroutines/debug/internal/qrj;", "creationStackBottom", "", com.market.sdk.reflect.toq.f68928f7l8, "sequenceNumber", "Ljava/lang/ref/WeakReference;", "Lkotlin/coroutines/f7l8;", "zy", "Ljava/lang/ref/WeakReference;", "_context", "Ljava/lang/String;", "_state", "Ljava/lang/Thread;", "n", "Ljava/lang/Thread;", "lastObservedThread", C7704k.y.toq.f95579toq, "_lastObservedFrame", "()Lkotlin/coroutines/f7l8;", "context", "()Ljava/util/List;", "creationStackTrace", "f7l8", "()Ljava/lang/String;", "value", "()Lkotlin/coroutines/jvm/internal/n;", C7704k.y.toq.f44691k, "(Lkotlin/coroutines/jvm/internal/n;)V", "lastObservedFrame", C4991s.f28129n, "(Lkotlin/coroutines/f7l8;Lkotlinx/coroutines/debug/internal/qrj;J)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class C6543n {

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private WeakReference<InterfaceC6207n> f36896g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private final qrj f36897k;

    /* JADX INFO: renamed from: n */
    @InterfaceC6765n
    @InterfaceC7395n
    public Thread f36898n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private String f36899q = C6541g.f36893k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC6765n
    public final long f81975toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final WeakReference<kotlin.coroutines.f7l8> f81976zy;

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.n$k */
    /* JADX INFO: compiled from: DebugCoroutineInfoImpl.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", m22756f = "DebugCoroutineInfoImpl.kt", m22757i = {}, m22758l = {75}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/sequences/kja0;", "Ljava/lang/StackTraceElement;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class k extends kotlin.coroutines.jvm.internal.ld6 implements InterfaceC5979h<kja0<? super StackTraceElement>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ qrj $bottom;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(qrj qrjVar, InterfaceC6216q<? super k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$bottom = qrjVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            k kVar = C6543n.this.new k(this.$bottom, interfaceC6216q);
            kVar.L$0 = obj;
            return kVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q kja0<? super StackTraceElement> kja0Var, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((k) create(kja0Var, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                kja0 kja0Var = (kja0) this.L$0;
                C6543n c6543n = C6543n.this;
                InterfaceC6207n callerFrame = this.$bottom.getCallerFrame();
                this.label = 1;
                if (c6543n.ld6(kja0Var, callerFrame, this) == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.n$toq */
    /* JADX INFO: compiled from: DebugCoroutineInfoImpl.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", m22756f = "DebugCoroutineInfoImpl.kt", m22757i = {}, m22758l = {80}, m22759m = "yieldFrames", m22760n = {}, m22761s = {})
    @d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class toq extends AbstractC6209q {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        toq(InterfaceC6216q<? super toq> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C6543n.this.ld6(null, null, this);
        }
    }

    public C6543n(@InterfaceC7395n kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7395n qrj qrjVar, long j2) {
        this.f36897k = qrjVar;
        this.f81975toq = j2;
        this.f81976zy = new WeakReference<>(f7l8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004a -> B:26:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005c -> B:25:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ld6(kotlin.sequences.kja0<? super java.lang.StackTraceElement> r6, kotlin.coroutines.jvm.internal.InterfaceC6207n r7, kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.debug.internal.C6543n.toq
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.debug.internal.n$toq r0 = (kotlinx.coroutines.debug.internal.C6543n.toq) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.debug.internal.n$toq r0 = new kotlinx.coroutines.debug.internal.n$toq
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.L$2
            kotlin.coroutines.jvm.internal.n r6 = (kotlin.coroutines.jvm.internal.InterfaceC6207n) r6
            java.lang.Object r7 = r0.L$1
            kotlin.sequences.kja0 r7 = (kotlin.sequences.kja0) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.debug.internal.n r2 = (kotlinx.coroutines.debug.internal.C6543n) r2
            kotlin.C6318m.n7h(r8)
            goto L5f
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            kotlin.C6318m.n7h(r8)
            r2 = r5
        L41:
            if (r7 != 0) goto L46
            kotlin.was r6 = kotlin.was.f36763k
            return r6
        L46:
            java.lang.StackTraceElement r8 = r7.getStackTraceElement()
            if (r8 != 0) goto L4d
            goto L62
        L4d:
            r0.L$0 = r2
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r8 = r6.toq(r8, r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            r4 = r7
            r7 = r6
            r6 = r4
        L5f:
            r4 = r7
            r7 = r6
            r6 = r4
        L62:
            kotlin.coroutines.jvm.internal.n r7 = r7.getCallerFrame()
            if (r7 == 0) goto L69
            goto L41
        L69:
            kotlin.was r6 = kotlin.was.f36763k
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.C6543n.ld6(kotlin.sequences.kja0, kotlin.coroutines.jvm.internal.n, kotlin.coroutines.q):java.lang.Object");
    }

    private final List<StackTraceElement> toq() {
        qrj qrjVar = this.f36897k;
        return qrjVar == null ? ni7.a9() : fn3e.nyj(cdj.toq(new k(qrjVar, null)));
    }

    @InterfaceC7396q
    public final String f7l8() {
        return this.f36899q;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public final InterfaceC6207n m24015g() {
        WeakReference<InterfaceC6207n> weakReference = this.f36896g;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public final List<StackTraceElement> m24016n() {
        return toq();
    }

    /* JADX INFO: renamed from: p */
    public final void m24017p(@InterfaceC7396q String str, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
        if (d2ok.f7l8(this.f36899q, str) && d2ok.f7l8(str, C6541g.f81973zy) && m24015g() != null) {
            return;
        }
        this.f36899q = str;
        m24019s(interfaceC6216q instanceof InterfaceC6207n ? (InterfaceC6207n) interfaceC6216q : null);
        this.f36898n = d2ok.f7l8(str, C6541g.f81972toq) ? Thread.currentThread() : null;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public final qrj m24018q() {
        return this.f36897k;
    }

    /* JADX INFO: renamed from: s */
    public final void m24019s(@InterfaceC7395n InterfaceC6207n interfaceC6207n) {
        this.f36896g = interfaceC6207n == null ? null : new WeakReference<>(interfaceC6207n);
    }

    @InterfaceC7396q
    public String toString() {
        return "DebugCoroutineInfo(state=" + f7l8() + ",context=" + zy() + ')';
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public final List<StackTraceElement> m24020y() {
        InterfaceC6207n interfaceC6207nM24015g = m24015g();
        if (interfaceC6207nM24015g == null) {
            return ni7.a9();
        }
        ArrayList arrayList = new ArrayList();
        while (interfaceC6207nM24015g != null) {
            StackTraceElement stackTraceElement = interfaceC6207nM24015g.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            interfaceC6207nM24015g = interfaceC6207nM24015g.getCallerFrame();
        }
        return arrayList;
    }

    @InterfaceC7395n
    public final kotlin.coroutines.f7l8 zy() {
        return this.f81976zy.get();
    }
}
