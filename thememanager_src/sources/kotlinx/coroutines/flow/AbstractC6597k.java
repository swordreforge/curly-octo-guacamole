package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import kotlinx.coroutines.mu;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.k */
/* JADX INFO: compiled from: Flow.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/flow/k;", C0846k.zaso, "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/zy;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", AnimatedProperty.PROPERTY_NAME_Y, C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@mu
public abstract class AbstractC6597k<T> implements InterfaceC6622s<T>, zy<T> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.k$k */
    /* JADX INFO: compiled from: Flow.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.AbstractFlow", m22756f = "Flow.kt", m22757i = {0}, m22758l = {230}, m22759m = "collect", m22760n = {"safeCollector"}, m22761s = {"L$0"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class k extends AbstractC6209q {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AbstractC6597k<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(AbstractC6597k<T> abstractC6597k, InterfaceC6216q<? super k> interfaceC6216q) {
            super(interfaceC6216q);
            this.this$0 = abstractC6597k;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo5262k(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC6622s
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5262k(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6618p<? super T> r6, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.AbstractC6597k.k
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.k$k r0 = (kotlinx.coroutines.flow.AbstractC6597k.k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.k$k r0 = new kotlinx.coroutines.flow.k$k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.flow.internal.zurt r6 = (kotlinx.coroutines.flow.internal.zurt) r6
            kotlin.C6318m.n7h(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.C6318m.n7h(r7)
            kotlinx.coroutines.flow.internal.zurt r7 = new kotlinx.coroutines.flow.internal.zurt
            kotlin.coroutines.f7l8 r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L55
            r0.label = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.mo24107y(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            kotlin.was r6 = kotlin.was.f36763k
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractC6597k.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public abstract Object mo24107y(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q);
}
