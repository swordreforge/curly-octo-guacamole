package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.q */
/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/q;", C0846k.zaso, "Lkotlinx/coroutines/flow/zy;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/s;", "flow", C4991s.f28129n, "(Lkotlinx/coroutines/flow/s;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class C6619q<T> implements zy<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final InterfaceC6622s<T> f37072k;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.q$k */
    /* JADX INFO: compiled from: Context.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {C0846k.zaso, "it", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class k<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6618p<T> f37073k;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.q$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Context.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", m22756f = "Context.kt", m22757i = {}, m22758l = {275}, m22759m = "emit", m22760n = {}, m22761s = {})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        static final class C8084k extends AbstractC6209q {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ k<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C8084k(k<? super T> kVar, InterfaceC6216q<? super C8084k> interfaceC6216q) {
                super(interfaceC6216q);
                this.this$0 = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        k(InterfaceC6618p<? super T> interfaceC6618p) {
            this.f37073k = interfaceC6618p;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.C6619q.k.C8084k
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.q$k$k r0 = (kotlinx.coroutines.flow.C6619q.k.C8084k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.q$k$k r0 = new kotlinx.coroutines.flow.q$k$k
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C6318m.n7h(r6)
                goto L46
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C6318m.n7h(r6)
                kotlin.coroutines.f7l8 r6 = r0.getContext()
                kotlinx.coroutines.ltg8.o1t(r6)
                kotlinx.coroutines.flow.p<T> r6 = r4.f37073k
                r0.label = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L46
                return r1
            L46:
                kotlin.was r5 = kotlin.was.f36763k
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6619q.k.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6619q(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s) {
        this.f37072k = interfaceC6622s;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6622s
    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        Object objMo5262k = this.f37072k.mo5262k(new k(interfaceC6618p), interfaceC6216q);
        return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
    }
}
