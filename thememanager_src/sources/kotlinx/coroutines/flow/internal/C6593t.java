package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.clock.module.toq;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.d3;
import kotlin.was;
import kotlinx.coroutines.flow.InterfaceC6618p;
import kotlinx.coroutines.internal.lrht;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.t */
/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR3\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/flow/internal/t;", C0846k.zaso, "Lkotlinx/coroutines/flow/p;", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlin/coroutines/f7l8;", "k", "Lkotlin/coroutines/f7l8;", "emitContext", "", "q", "Ljava/lang/Object;", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "n", "Lcyoe/h;", "emitRef", "downstream", C4991s.f28129n, "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/f7l8;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class C6593t<T> implements InterfaceC6618p<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final kotlin.coroutines.f7l8 f37016k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final InterfaceC5979h<T, InterfaceC6216q<? super was>, Object> f37017n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final Object f37018q;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.t$k */
    /* JADX INFO: compiled from: ChannelFlow.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", m22756f = "ChannelFlow.kt", m22757i = {}, m22758l = {toq.zy.f72002qrj}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @d3(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {C0846k.zaso, "it", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<T, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC6618p<T> $downstream;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(InterfaceC6618p<? super T> interfaceC6618p, InterfaceC6216q<? super k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$downstream = interfaceC6618p;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            k kVar = new k(this.$downstream, interfaceC6216q);
            kVar.L$0 = obj;
            return kVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(T t2, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((k) create(t2, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.q to kotlinx.coroutines.flow.internal.t$k for r3v1 'this'  kotlin.coroutines.q
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.C6318m.n7h(r4)
                goto L27
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.C6318m.n7h(r4)
                java.lang.Object r4 = r3.L$0
                kotlinx.coroutines.flow.p<T> r1 = r3.$downstream
                r3.label = r2
                java.lang.Object r4 = r1.emit(r4, r3)
                if (r4 != r0) goto L27
                return r0
            L27:
                kotlin.was r4 = kotlin.was.f36763k
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.C6593t.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C6593t(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        this.f37016k = f7l8Var;
        this.f37018q = lrht.toq(f7l8Var);
        this.f37017n = new k(interfaceC6618p, null);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6618p
    @InterfaceC7395n
    public Object emit(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        Object objZy = C6578g.zy(this.f37016k, t2, this.f37018q, this.f37017n, interfaceC6216q);
        return objZy == C6199q.x2() ? objZy : was.f36763k;
    }
}
