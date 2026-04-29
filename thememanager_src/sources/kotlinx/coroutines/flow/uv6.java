package kotlinx.coroutines.flow;

import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b¢\u0006\u0002\b\u000eø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR>\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b¢\u0006\u0002\b\u000e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/flow/uv6;", C0846k.zaso, "Lkotlinx/coroutines/flow/p;", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "k", "(Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "", "Lkotlin/fn3e;", "q", "Lcyoe/h;", "action", C4991s.f28129n, "(Lkotlinx/coroutines/flow/p;Lcyoe/h;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class uv6<T> implements InterfaceC6618p<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final InterfaceC6618p<T> f37094k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final InterfaceC5979h<InterfaceC6618p<? super T>, InterfaceC6216q<? super was>, Object> f37095q;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.uv6$k */
    /* JADX INFO: compiled from: Share.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m22756f = "Share.kt", m22757i = {0, 0}, m22758l = {419, zurt.zy.f47489fn3e}, m22759m = "onSubscription", m22760n = {"this", "safeCollector"}, m22761s = {"L$0", "L$1"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class C6626k extends AbstractC6209q {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ uv6<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6626k(uv6<T> uv6Var, InterfaceC6216q<? super C6626k> interfaceC6216q) {
            super(interfaceC6216q);
            this.this$0 = uv6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.m24245k(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public uv6(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6618p<? super T>, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
        this.f37094k = interfaceC6618p;
        this.f37095q = interfaceC5979h;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6618p
    @InterfaceC7395n
    public Object emit(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        return this.f37094k.emit(t2, interfaceC6216q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.internal.zurt] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m24245k(@mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.uv6.C6626k
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.uv6$k r0 = (kotlinx.coroutines.flow.uv6.C6626k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.uv6$k r0 = new kotlinx.coroutines.flow.uv6$k
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C6318m.n7h(r7)
            goto L77
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.internal.zurt r2 = (kotlinx.coroutines.flow.internal.zurt) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.uv6 r4 = (kotlinx.coroutines.flow.uv6) r4
            kotlin.C6318m.n7h(r7)     // Catch: java.lang.Throwable -> L7d
            goto L5e
        L40:
            kotlin.C6318m.n7h(r7)
            kotlinx.coroutines.flow.internal.zurt r2 = new kotlinx.coroutines.flow.internal.zurt
            kotlinx.coroutines.flow.p<T> r7 = r6.f37094k
            kotlin.coroutines.f7l8 r5 = r0.getContext()
            r2.<init>(r7, r5)
            cyoe.h<kotlinx.coroutines.flow.p<? super T>, kotlin.coroutines.q<? super kotlin.was>, java.lang.Object> r7 = r6.f37095q     // Catch: java.lang.Throwable -> L7d
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L7d
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L7d
            r0.label = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L7d
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r4 = r6
        L5e:
            r2.releaseIntercepted()
            kotlinx.coroutines.flow.p<T> r7 = r4.f37094k
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.uv6
            if (r2 == 0) goto L7a
            kotlinx.coroutines.flow.uv6 r7 = (kotlinx.coroutines.flow.uv6) r7
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r7.m24245k(r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            kotlin.was r7 = kotlin.was.f36763k
            return r7
        L7a:
            kotlin.was r7 = kotlin.was.f36763k
            return r7
        L7d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.uv6.m24245k(kotlin.coroutines.q):java.lang.Object");
    }
}
