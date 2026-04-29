package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.AbstractC6212k;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.was;
import kotlinx.coroutines.AbstractC6696k;
import kotlinx.coroutines.C6481a;
import kotlinx.coroutines.C6490c;
import kotlinx.coroutines.C6710r;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.etdu;
import kotlinx.coroutines.gc3c;
import kotlinx.coroutines.lrht;
import kotlinx.coroutines.vq;
import kotlinx.coroutines.x9kr;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Broadcast.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u001a \u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042-\b\u0002\u0010\u0012\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bj\u0004\u0018\u0001`\u00112/\b\u0001\u0010\u0018\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {C0846k.d9i, "Lkotlinx/coroutines/channels/d3;", "", "capacity", "Lkotlinx/coroutines/lrht;", "start", "Lkotlinx/coroutines/channels/s;", "toq", "Lkotlinx/coroutines/f;", "Lkotlin/coroutines/f7l8;", "context", "Lkotlin/Function1;", "", "Lkotlin/c;", "name", "cause", "Lkotlin/was;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/jp0y;", "Lkotlin/coroutines/q;", "", "Lkotlin/fn3e;", "block", "k", "(Lkotlinx/coroutines/f;Lkotlin/coroutines/f7l8;ILkotlinx/coroutines/lrht;Lcyoe/x2;Lcyoe/h;)Lkotlinx/coroutines/channels/s;", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class x2 {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.x2$k */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/l$k", "Lkotlin/coroutines/k;", "Lkotlinx/coroutines/x9kr;", "Lkotlin/coroutines/f7l8;", "context", "", "exception", "Lkotlin/was;", "handleException", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6513k extends AbstractC6212k implements kotlinx.coroutines.x9kr {
        public C6513k(x9kr.toq toqVar) {
            super(toqVar);
        }

        @Override // kotlinx.coroutines.x9kr
        public void handleException(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Throwable th) {
        }
    }

    /* JADX INFO: compiled from: Broadcast.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {C0846k.d9i, "", "it", "Lkotlin/was;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class toq extends AbstractC6308r implements cyoe.x2<Throwable, was> {
        final /* synthetic */ d3<E> $this_broadcast;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        toq(d3<? extends E> d3Var) {
            super(1);
            this.$this_broadcast = d3Var;
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Throwable th) {
            invoke2(th);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7395n Throwable th) {
            t8r.toq(this.$this_broadcast, th);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: compiled from: Broadcast.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", m22756f = "Broadcast.kt", m22757i = {0, 1}, m22758l = {53, 54}, m22759m = "invokeSuspend", m22760n = {"$this$broadcast", "$this$broadcast"}, m22761s = {"L$0", "L$0"})
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {C0846k.d9i, "Lkotlinx/coroutines/channels/jp0y;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class zy<E> extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<jp0y<? super E>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ d3<E> $this_broadcast;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        zy(d3<? extends E> d3Var, InterfaceC6216q<? super zy> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$this_broadcast = d3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            zy zyVar = new zy(this.$this_broadcast, interfaceC6216q);
            zyVar.L$0 = obj;
            return zyVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q jp0y<? super E> jp0yVar, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((zy) create(jp0yVar, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0068 -> B:12:0x003e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.L$1
                kotlinx.coroutines.channels.h r1 = (kotlinx.coroutines.channels.InterfaceC6497h) r1
                java.lang.Object r4 = r7.L$0
                kotlinx.coroutines.channels.jp0y r4 = (kotlinx.coroutines.channels.jp0y) r4
                kotlin.C6318m.n7h(r8)
                r8 = r4
                goto L3d
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                java.lang.Object r1 = r7.L$1
                kotlinx.coroutines.channels.h r1 = (kotlinx.coroutines.channels.InterfaceC6497h) r1
                java.lang.Object r4 = r7.L$0
                kotlinx.coroutines.channels.jp0y r4 = (kotlinx.coroutines.channels.jp0y) r4
                kotlin.C6318m.n7h(r8)
                r5 = r7
                goto L4f
            L30:
                kotlin.C6318m.n7h(r8)
                java.lang.Object r8 = r7.L$0
                kotlinx.coroutines.channels.jp0y r8 = (kotlinx.coroutines.channels.jp0y) r8
                kotlinx.coroutines.channels.d3<E> r1 = r7.$this_broadcast
                kotlinx.coroutines.channels.h r1 = r1.iterator()
            L3d:
                r4 = r7
            L3e:
                r4.L$0 = r8
                r4.L$1 = r1
                r4.label = r3
                java.lang.Object r5 = r1.toq(r4)
                if (r5 != r0) goto L4b
                return r0
            L4b:
                r6 = r4
                r4 = r8
                r8 = r5
                r5 = r6
            L4f:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L6b
                java.lang.Object r8 = r1.next()
                r5.L$0 = r4
                r5.L$1 = r1
                r5.label = r2
                java.lang.Object r8 = r4.d3(r8, r5)
                if (r8 != r0) goto L68
                return r0
            L68:
                r8 = r4
                r4 = r5
                goto L3e
            L6b:
                kotlin.was r8 = kotlin.was.f36763k
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.x2.zy.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC7396q
    @gc3c
    /* JADX INFO: renamed from: k */
    public static final <E> InterfaceC6511s<E> m23964k(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q lrht lrhtVar, @InterfaceC7395n cyoe.x2<? super Throwable, was> x2Var, @InterfaceC7396q @kotlin.toq InterfaceC5979h<? super jp0y<? super E>, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
        kotlin.coroutines.f7l8 f7l8VarM24526n = C6710r.m24526n(interfaceC6556f, f7l8Var);
        InterfaceC6511s interfaceC6511sM23935k = C6508p.m23935k(i2);
        ld6 mcpVar = lrhtVar.isLazy() ? new mcp(f7l8VarM24526n, interfaceC6511sM23935k, interfaceC5979h) : new ld6(f7l8VarM24526n, interfaceC6511sM23935k, true);
        if (x2Var != null) {
            ((etdu) mcpVar).yz(x2Var);
        }
        ((AbstractC6696k) mcpVar).ukdy(lrhtVar, mcpVar, interfaceC5979h);
        return (InterfaceC6511s<E>) mcpVar;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ InterfaceC6511s m23965q(d3 d3Var, int i2, lrht lrhtVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 1;
        }
        if ((i3 & 2) != 0) {
            lrhtVar = lrht.LAZY;
        }
        return toq(d3Var, i2, lrhtVar);
    }

    @InterfaceC7396q
    @gc3c
    public static final <E> InterfaceC6511s<E> toq(@InterfaceC7396q d3<? extends E> d3Var, int i2, @InterfaceC7396q lrht lrhtVar) {
        return zy(C6490c.qrj(C6490c.qrj(vq.f37472k, C6481a.f7l8()), new C6513k(kotlinx.coroutines.x9kr.mdr8)), null, i2, lrhtVar, new toq(d3Var), new zy(d3Var, null), 1, null);
    }

    public static /* synthetic */ InterfaceC6511s zy(InterfaceC6556f interfaceC6556f, kotlin.coroutines.f7l8 f7l8Var, int i2, lrht lrhtVar, cyoe.x2 x2Var, InterfaceC5979h interfaceC5979h, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f7l8Var = C6217s.INSTANCE;
        }
        kotlin.coroutines.f7l8 f7l8Var2 = f7l8Var;
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            lrhtVar = lrht.LAZY;
        }
        lrht lrhtVar2 = lrhtVar;
        if ((i3 & 8) != 0) {
            x2Var = null;
        }
        return m23964k(interfaceC6556f, f7l8Var2, i4, lrhtVar2, x2Var, interfaceC5979h);
    }
}
