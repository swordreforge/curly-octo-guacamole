package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import kotlin.C6323o;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.was;
import kotlinx.coroutines.C6710r;
import kotlinx.coroutines.InterfaceC6533d;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.lrht;
import kotlinx.coroutines.tfm;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001ag\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a \u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00132-\b\u0002\u0010\u001b\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015j\u0004\u0018\u0001`\u001a2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aª\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0014\u001a\u00020\u00132-\b\u0002\u0010\u001b\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015j\u0004\u0018\u0001`\u001a2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lkotlinx/coroutines/channels/jp0y;", "Lkotlin/Function0;", "Lkotlin/was;", "block", "k", "(Lkotlinx/coroutines/channels/jp0y;Lcyoe/k;Lkotlin/coroutines/q;)Ljava/lang/Object;", C0846k.d9i, "Lkotlinx/coroutines/f;", "Lkotlin/coroutines/f7l8;", "context", "", "capacity", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "", "Lkotlin/fn3e;", "Lkotlinx/coroutines/channels/d3;", "zy", "(Lkotlinx/coroutines/f;Lkotlin/coroutines/f7l8;ILcyoe/h;)Lkotlinx/coroutines/channels/d3;", "Lkotlinx/coroutines/lrht;", "start", "Lkotlin/Function1;", "", "Lkotlin/c;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "q", "(Lkotlinx/coroutines/f;Lkotlin/coroutines/f7l8;ILkotlinx/coroutines/lrht;Lcyoe/x2;Lcyoe/h;)Lkotlinx/coroutines/channels/d3;", "Lkotlinx/coroutines/channels/qrj;", "onBufferOverflow", "n", "(Lkotlinx/coroutines/f;Lkotlin/coroutines/f7l8;ILkotlinx/coroutines/channels/qrj;Lkotlinx/coroutines/lrht;Lcyoe/x2;Lcyoe/h;)Lkotlinx/coroutines/channels/d3;", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class a9 {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.a9$k */
    /* JADX INFO: compiled from: Produce.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.channels.ProduceKt", m22756f = "Produce.kt", m22757i = {0, 0}, m22758l = {153}, m22759m = "awaitClose", m22760n = {"$this$awaitClose", "block"}, m22761s = {"L$0", "L$1"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class C6492k extends AbstractC6209q {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C6492k(InterfaceC6216q<? super C6492k> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a9.m23851k(null, null, this);
        }
    }

    /* JADX INFO: compiled from: Produce.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/was;", "invoke", "()V", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class toq extends AbstractC6308r implements InterfaceC5981k<was> {
        public static final toq INSTANCE = new toq();

        toq() {
            super(0);
        }

        @Override // cyoe.InterfaceC5981k
        public /* bridge */ /* synthetic */ was invoke() {
            invoke2();
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: compiled from: Produce.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/was;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class zy extends AbstractC6308r implements cyoe.x2<Throwable, was> {
        final /* synthetic */ kotlinx.coroutines.cdj<was> $cont;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        zy(kotlinx.coroutines.cdj<? super was> cdjVar) {
            super(1);
            this.$cont = cdjVar;
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Throwable th) {
            invoke2(th);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7395n Throwable th) {
            kotlinx.coroutines.cdj<was> cdjVar = this.$cont;
            C6323o.k kVar = C6323o.Companion;
            cdjVar.resumeWith(C6323o.m28280constructorimpl(was.f36763k));
        }
    }

    public static /* synthetic */ d3 f7l8(InterfaceC6556f interfaceC6556f, kotlin.coroutines.f7l8 f7l8Var, int i2, lrht lrhtVar, cyoe.x2 x2Var, InterfaceC5979h interfaceC5979h, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f7l8Var = C6217s.INSTANCE;
        }
        kotlin.coroutines.f7l8 f7l8Var2 = f7l8Var;
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            lrhtVar = lrht.DEFAULT;
        }
        lrht lrhtVar2 = lrhtVar;
        if ((i3 & 8) != 0) {
            x2Var = null;
        }
        return m23853q(interfaceC6556f, f7l8Var2, i4, lrhtVar2, x2Var, interfaceC5979h);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ d3 m23850g(InterfaceC6556f interfaceC6556f, kotlin.coroutines.f7l8 f7l8Var, int i2, InterfaceC5979h interfaceC5979h, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f7l8Var = C6217s.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return zy(interfaceC6556f, f7l8Var, i2, interfaceC5979h);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m23851k(@mub.InterfaceC7396q kotlinx.coroutines.channels.jp0y<?> r4, @mub.InterfaceC7396q cyoe.InterfaceC5981k<kotlin.was> r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.a9.C6492k
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.a9$k r0 = (kotlinx.coroutines.channels.a9.C6492k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.a9$k r0 = new kotlinx.coroutines.channels.a9$k
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.L$1
            r5 = r4
            cyoe.k r5 = (cyoe.InterfaceC5981k) r5
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.jp0y r4 = (kotlinx.coroutines.channels.jp0y) r4
            kotlin.C6318m.n7h(r6)     // Catch: java.lang.Throwable -> L32
            goto L7a
        L32:
            r4 = move-exception
            goto L80
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.C6318m.n7h(r6)
            kotlin.coroutines.f7l8 r6 = r0.getContext()
            kotlinx.coroutines.gbni$toq r2 = kotlinx.coroutines.gbni.ygy
            kotlin.coroutines.f7l8$toq r6 = r6.get(r2)
            if (r6 != r4) goto L4d
            r6 = r3
            goto L4e
        L4d:
            r6 = 0
        L4e:
            if (r6 == 0) goto L84
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L32
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L32
            r0.label = r3     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.ki r6 = new kotlinx.coroutines.ki     // Catch: java.lang.Throwable -> L32
            kotlin.coroutines.q r2 = kotlin.coroutines.intrinsics.toq.m22744n(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.a9()     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.channels.a9$zy r2 = new kotlinx.coroutines.channels.a9$zy     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.mo23920n(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.m24474z()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = kotlin.coroutines.intrinsics.toq.x2()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L77
            kotlin.coroutines.jvm.internal.C6211y.zy(r0)     // Catch: java.lang.Throwable -> L32
        L77:
            if (r4 != r1) goto L7a
            return r1
        L7a:
            r5.invoke()
            kotlin.was r4 = kotlin.was.f36763k
            return r4
        L80:
            r5.invoke()
            throw r4
        L84:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.a9.m23851k(kotlinx.coroutines.channels.jp0y, cyoe.k, kotlin.coroutines.q):java.lang.Object");
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final <E> d3<E> m23852n(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q qrj qrjVar, @InterfaceC7396q lrht lrhtVar, @InterfaceC7395n cyoe.x2<? super Throwable, was> x2Var, @InterfaceC7396q @kotlin.toq InterfaceC5979h<? super jp0y<? super E>, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
        fti ftiVar = new fti(C6710r.m24526n(interfaceC6556f, f7l8Var), cdj.m23858q(i2, qrjVar, null, 4, null));
        if (x2Var != null) {
            ftiVar.yz(x2Var);
        }
        ftiVar.ukdy(lrhtVar, ftiVar, interfaceC5979h);
        return ftiVar;
    }

    @InterfaceC7396q
    @tfm
    /* JADX INFO: renamed from: q */
    public static final <E> d3<E> m23853q(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q lrht lrhtVar, @InterfaceC7395n cyoe.x2<? super Throwable, was> x2Var, @InterfaceC7396q @kotlin.toq InterfaceC5979h<? super jp0y<? super E>, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
        return m23852n(interfaceC6556f, f7l8Var, i2, qrj.SUSPEND, lrhtVar, x2Var, interfaceC5979h);
    }

    public static /* synthetic */ Object toq(jp0y jp0yVar, InterfaceC5981k interfaceC5981k, InterfaceC6216q interfaceC6216q, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC5981k = toq.INSTANCE;
        }
        return m23851k(jp0yVar, interfaceC5981k, interfaceC6216q);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ d3 m23854y(InterfaceC6556f interfaceC6556f, kotlin.coroutines.f7l8 f7l8Var, int i2, qrj qrjVar, lrht lrhtVar, cyoe.x2 x2Var, InterfaceC5979h interfaceC5979h, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f7l8Var = C6217s.INSTANCE;
        }
        kotlin.coroutines.f7l8 f7l8Var2 = f7l8Var;
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            qrjVar = qrj.SUSPEND;
        }
        qrj qrjVar2 = qrjVar;
        if ((i3 & 8) != 0) {
            lrhtVar = lrht.DEFAULT;
        }
        lrht lrhtVar2 = lrhtVar;
        if ((i3 & 16) != 0) {
            x2Var = null;
        }
        return m23852n(interfaceC6556f, f7l8Var2, i4, qrjVar2, lrhtVar2, x2Var, interfaceC5979h);
    }

    @InterfaceC7396q
    @InterfaceC6533d
    public static final <E> d3<E> zy(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q @kotlin.toq InterfaceC5979h<? super jp0y<? super E>, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
        return m23852n(interfaceC6556f, f7l8Var, i2, qrj.SUSPEND, lrht.DEFAULT, null, interfaceC5979h);
    }
}
