package kotlinx.coroutines.flow;

import com.market.sdk.reflect.C4991s;
import cyoe.InterfaceC5979h;
import kotlin.C6318m;
import kotlin.C6480z;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.jvm.internal.i1;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.l */
/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/flow/l;", "Lkotlinx/coroutines/flow/dd;", "Lkotlinx/coroutines/flow/hyr;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/lvui;", "k", "", "toString", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class C6604l implements dd {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.l$k */
    /* JADX INFO: compiled from: SharingStarted.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.StartedLazily$command$1", m22756f = "SharingStarted.kt", m22757i = {}, m22758l = {155}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/p;", "Lkotlinx/coroutines/flow/lvui;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6618p<? super lvui>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ hyr<Integer> $subscriptionCount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.l$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SharingStarted.kt */
        @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "count", "Lkotlin/was;", "k", "(ILkotlin/coroutines/q;)Ljava/lang/Object;"}, m22787k = 3, mv = {1, 6, 0})
        static final class C8081k<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ i1.C6295k f37033k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ InterfaceC6618p<lvui> f37034q;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.l$k$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: SharingStarted.kt */
            @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", m22756f = "SharingStarted.kt", m22757i = {}, m22758l = {158}, m22759m = "emit", m22760n = {}, m22761s = {})
            @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
            static final class C8082k extends AbstractC6209q {
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C8081k<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C8082k(C8081k<? super T> c8081k, InterfaceC6216q<? super C8082k> interfaceC6216q) {
                    super(interfaceC6216q);
                    this.this$0 = c8081k;
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
                @InterfaceC7395n
                public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.m24154k(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C8081k(i1.C6295k c6295k, InterfaceC6618p<? super lvui> interfaceC6618p) {
                this.f37033k = c6295k;
                this.f37034q = interfaceC6618p;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC6618p
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC6216q interfaceC6216q) {
                return m24154k(((Number) obj).intValue(), interfaceC6216q);
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @mub.InterfaceC7395n
            /* JADX INFO: renamed from: k */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object m24154k(int r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.C6604l.k.C8081k.C8082k
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.l$k$k$k r0 = (kotlinx.coroutines.flow.C6604l.k.C8081k.C8082k) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.l$k$k$k r0 = new kotlinx.coroutines.flow.l$k$k$k
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C6318m.n7h(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C6318m.n7h(r6)
                    if (r5 <= 0) goto L4e
                    kotlin.jvm.internal.i1$k r5 = r4.f37033k
                    boolean r6 = r5.element
                    if (r6 != 0) goto L4e
                    r5.element = r3
                    kotlinx.coroutines.flow.p<kotlinx.coroutines.flow.lvui> r5 = r4.f37034q
                    kotlinx.coroutines.flow.lvui r6 = kotlinx.coroutines.flow.lvui.START
                    r0.label = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    kotlin.was r5 = kotlin.was.f36763k
                    return r5
                L4e:
                    kotlin.was r5 = kotlin.was.f36763k
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6604l.k.C8081k.m24154k(int, kotlin.coroutines.q):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(hyr<Integer> hyrVar, InterfaceC6216q<? super k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$subscriptionCount = hyrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            k kVar = new k(this.$subscriptionCount, interfaceC6216q);
            kVar.L$0 = obj;
            return kVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super lvui> interfaceC6618p, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((k) create(interfaceC6618p, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
                i1.C6295k c6295k = new i1.C6295k();
                hyr<Integer> hyrVar = this.$subscriptionCount;
                C8081k c8081k = new C8081k(c6295k, interfaceC6618p);
                this.label = 1;
                if (hyrVar.mo5262k(c8081k, this) == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            throw new C6480z();
        }
    }

    @Override // kotlinx.coroutines.flow.dd
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public InterfaceC6622s<lvui> mo24080k(@InterfaceC7396q hyr<Integer> hyrVar) {
        return ld6.tfm(new k(hyrVar, null));
    }

    @InterfaceC7396q
    public String toString() {
        return "SharingStarted.Lazily";
    }
}
