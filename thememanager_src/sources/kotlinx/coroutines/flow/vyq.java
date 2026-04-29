package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.clock.module.toq;
import cyoe.InterfaceC5979h;
import java.util.List;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0002\b\u000eø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR>\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0002\b\u000e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/flow/vyq;", C0846k.zaso, "Lkotlinx/coroutines/flow/d3;", "Lkotlinx/coroutines/flow/p;", "collector", "", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/d3;", "sharedFlow", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "Lkotlin/was;", "", "Lkotlin/fn3e;", "q", "Lcyoe/h;", "action", "", "n", "()Ljava/util/List;", "replayCache", C4991s.f28129n, "(Lkotlinx/coroutines/flow/d3;Lcyoe/h;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class vyq<T> implements d3<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final d3<T> f37096k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final InterfaceC5979h<InterfaceC6618p<? super T>, InterfaceC6216q<? super was>, Object> f37097q;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.vyq$k */
    /* JADX INFO: compiled from: Share.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.SubscribedSharedFlow", m22756f = "Share.kt", m22757i = {}, m22758l = {toq.f7l8.f29214p}, m22759m = "collect", m22760n = {}, m22761s = {})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class C6627k extends AbstractC6209q {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ vyq<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6627k(vyq<T> vyqVar, InterfaceC6216q<? super C6627k> interfaceC6216q) {
            super(interfaceC6216q);
            this.this$0 = vyqVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo5262k(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vyq(@InterfaceC7396q d3<? extends T> d3Var, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6618p<? super T>, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
        this.f37096k = d3Var;
        this.f37097q = interfaceC5979h;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.d3, kotlinx.coroutines.flow.InterfaceC6622s
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo5262k(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6618p<? super T> r6, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.vyq.C6627k
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.vyq$k r0 = (kotlinx.coroutines.flow.vyq.C6627k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.vyq$k r0 = new kotlinx.coroutines.flow.vyq$k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            kotlin.C6318m.n7h(r7)
            goto L46
        L31:
            kotlin.C6318m.n7h(r7)
            kotlinx.coroutines.flow.d3<T> r7 = r5.f37096k
            kotlinx.coroutines.flow.uv6 r2 = new kotlinx.coroutines.flow.uv6
            cyoe.h<kotlinx.coroutines.flow.p<? super T>, kotlin.coroutines.q<? super kotlin.was>, java.lang.Object> r4 = r5.f37097q
            r2.<init>(r6, r4)
            r0.label = r3
            java.lang.Object r6 = r7.mo5262k(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            kotlin.z r6 = new kotlin.z
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.vyq.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.d3
    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public List<T> mo24079n() {
        return this.f37096k.mo24079n();
    }
}
