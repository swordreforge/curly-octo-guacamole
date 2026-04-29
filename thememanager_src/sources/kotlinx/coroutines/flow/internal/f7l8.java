package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import kotlin.C6318m;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.channels.a9;
import kotlinx.coroutines.channels.jp0y;
import kotlinx.coroutines.flow.InterfaceC6618p;
import kotlinx.coroutines.flow.InterfaceC6622s;
import kotlinx.coroutines.gbni;
import kotlinx.coroutines.sync.C6737y;
import kotlinx.coroutines.sync.InterfaceC6732g;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BA\u0012\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0014R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/flow/internal/f7l8;", C0846k.zaso, "Lkotlinx/coroutines/flow/internal/n;", "Lkotlin/coroutines/f7l8;", "context", "", "capacity", "Lkotlinx/coroutines/channels/qrj;", "onBufferOverflow", "ld6", "Lkotlinx/coroutines/f;", "scope", "Lkotlinx/coroutines/channels/d3;", "kja0", "Lkotlinx/coroutines/channels/jp0y;", "Lkotlin/was;", "p", "(Lkotlinx/coroutines/channels/jp0y;Lkotlin/coroutines/q;)Ljava/lang/Object;", "", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlinx/coroutines/flow/s;", C7704k.y.toq.f95579toq, "Lkotlinx/coroutines/flow/s;", "flow", com.market.sdk.reflect.toq.f28131g, "concurrency", C4991s.f28129n, "(Lkotlinx/coroutines/flow/s;ILkotlin/coroutines/f7l8;ILkotlinx/coroutines/channels/qrj;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class f7l8<T> extends AbstractC6584n<T> {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final InterfaceC6622s<InterfaceC6622s<T>> f36981g;

    /* JADX INFO: renamed from: y */
    private final int f36982y;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.f7l8$k */
    /* JADX INFO: compiled from: Merge.kt */
    @d3(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/flow/s;", com.android.thememanager.basemodule.analysis.toq.bp0b, "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/s;Lkotlin/coroutines/q;)Ljava/lang/Object;"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6575k<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ C6595z<T> f36983g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ gbni f36984k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ jp0y<T> f36985n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC6732g f36986q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.f7l8$k$k */
        /* JADX INFO: compiled from: Merge.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", m22756f = "Merge.kt", m22757i = {}, m22758l = {69}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @d3(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ C6595z<T> $collector;
            final /* synthetic */ InterfaceC6622s<T> $inner;
            final /* synthetic */ InterfaceC6732g $semaphore;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            k(InterfaceC6622s<? extends T> interfaceC6622s, C6595z<T> c6595z, InterfaceC6732g interfaceC6732g, InterfaceC6216q<? super k> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.$inner = interfaceC6622s;
                this.$collector = c6595z;
                this.$semaphore = interfaceC6732g;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new k(this.$inner, this.$collector, this.$semaphore, interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                return ((k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                try {
                    if (i2 == 0) {
                        C6318m.n7h(obj);
                        InterfaceC6622s<T> interfaceC6622s = this.$inner;
                        C6595z<T> c6595z = this.$collector;
                        this.label = 1;
                        if (interfaceC6622s.mo5262k(c6595z, this) == objX2) {
                            return objX2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6318m.n7h(obj);
                    }
                    this.$semaphore.release();
                    return was.f36763k;
                } catch (Throwable th) {
                    this.$semaphore.release();
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.f7l8$k$toq */
        /* JADX INFO: compiled from: Merge.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", m22756f = "Merge.kt", m22757i = {0, 0}, m22758l = {66}, m22759m = "emit", m22760n = {"this", com.android.thememanager.basemodule.analysis.toq.bp0b}, m22761s = {"L$0", "L$1"})
        @d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        static final class toq extends AbstractC6209q {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C6575k<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            toq(C6575k<? super T> c6575k, InterfaceC6216q<? super toq> interfaceC6216q) {
                super(interfaceC6216q);
                this.this$0 = c6575k;
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
        C6575k(gbni gbniVar, InterfaceC6732g interfaceC6732g, jp0y<? super T> jp0yVar, C6595z<T> c6595z) {
            this.f36984k = gbniVar;
            this.f36986q = interfaceC6732g;
            this.f36985n = jp0yVar;
            this.f36983g = c6595z;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @mub.InterfaceC7395n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6622s<? extends T> r8, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.f7l8.C6575k.toq
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.internal.f7l8$k$toq r0 = (kotlinx.coroutines.flow.internal.f7l8.C6575k.toq) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.internal.f7l8$k$toq r0 = new kotlinx.coroutines.flow.internal.f7l8$k$toq
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r8 = r0.L$1
                kotlinx.coroutines.flow.s r8 = (kotlinx.coroutines.flow.InterfaceC6622s) r8
                java.lang.Object r0 = r0.L$0
                kotlinx.coroutines.flow.internal.f7l8$k r0 = (kotlinx.coroutines.flow.internal.f7l8.C6575k) r0
                kotlin.C6318m.n7h(r9)
                goto L54
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                kotlin.C6318m.n7h(r9)
                kotlinx.coroutines.gbni r9 = r7.f36984k
                if (r9 != 0) goto L41
                goto L44
            L41:
                kotlinx.coroutines.ltg8.wvg(r9)
            L44:
                kotlinx.coroutines.sync.g r9 = r7.f36986q
                r0.L$0 = r7
                r0.L$1 = r8
                r0.label = r3
                java.lang.Object r9 = r9.zy(r0)
                if (r9 != r1) goto L53
                return r1
            L53:
                r0 = r7
            L54:
                kotlinx.coroutines.channels.jp0y<T> r1 = r0.f36985n
                r2 = 0
                r3 = 0
                kotlinx.coroutines.flow.internal.f7l8$k$k r4 = new kotlinx.coroutines.flow.internal.f7l8$k$k
                kotlinx.coroutines.flow.internal.z<T> r9 = r0.f36983g
                kotlinx.coroutines.sync.g r0 = r0.f36986q
                r5 = 0
                r4.<init>(r8, r9, r0, r5)
                r5 = 3
                r6 = 0
                kotlinx.coroutines.C6708p.m24521n(r1, r2, r3, r4, r5, r6)
                kotlin.was r8 = kotlin.was.f36763k
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.f7l8.C6575k.emit(kotlinx.coroutines.flow.s, kotlin.coroutines.q):java.lang.Object");
        }
    }

    public /* synthetic */ f7l8(InterfaceC6622s interfaceC6622s, int i2, kotlin.coroutines.f7l8 f7l8Var, int i3, kotlinx.coroutines.channels.qrj qrjVar, int i4, kotlin.jvm.internal.ni7 ni7Var) {
        this(interfaceC6622s, i2, (i4 & 4) != 0 ? C6217s.INSTANCE : f7l8Var, (i4 & 8) != 0 ? -2 : i3, (i4 & 16) != 0 ? kotlinx.coroutines.channels.qrj.SUSPEND : qrjVar);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6584n
    @InterfaceC7396q
    public kotlinx.coroutines.channels.d3<T> kja0(@InterfaceC7396q InterfaceC6556f interfaceC6556f) {
        return a9.zy(interfaceC6556f, this.f36992k, this.f36994q, qrj());
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6584n
    @InterfaceC7396q
    protected AbstractC6584n<T> ld6(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        return new f7l8(this.f36981g, this.f36982y, f7l8Var, i2, qrjVar);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6584n
    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    protected Object mo24106p(@InterfaceC7396q jp0y<? super T> jp0yVar, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        Object objMo5262k = this.f36981g.mo5262k(new C6575k((gbni) interfaceC6216q.getContext().get(gbni.ygy), C6737y.toq(this.f36982y, 0, 2, null), jp0yVar, new C6595z(jp0yVar)), interfaceC6216q);
        return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6584n
    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    protected String mo24122y() {
        return d2ok.mcp("concurrency=", Integer.valueOf(this.f36982y));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f7l8(@InterfaceC7396q InterfaceC6622s<? extends InterfaceC6622s<? extends T>> interfaceC6622s, int i2, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i3, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        super(f7l8Var, i3, qrjVar);
        this.f36981g = interfaceC6622s;
        this.f36982y = i2;
    }
}
