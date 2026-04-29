package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import kotlinx.coroutines.flow.internal.AbstractC6584n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BW\u0012-\u0010\u0016\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010¢\u0006\u0002\b\u0013\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014R>\u0010\u0016\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010¢\u0006\u0002\b\u00138\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/flow/toq;", C0846k.zaso, "Lkotlinx/coroutines/flow/g;", "Lkotlinx/coroutines/channels/jp0y;", "scope", "Lkotlin/was;", "p", "(Lkotlinx/coroutines/channels/jp0y;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlin/coroutines/f7l8;", "context", "", "capacity", "Lkotlinx/coroutines/channels/qrj;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/n;", "ld6", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "", "Lkotlin/fn3e;", AnimatedProperty.PROPERTY_NAME_Y, "Lcyoe/h;", "block", C4991s.f28129n, "(Lcyoe/h;Lkotlin/coroutines/f7l8;ILkotlinx/coroutines/channels/qrj;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class toq<T> extends C6572g<T> {

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final InterfaceC5979h<kotlinx.coroutines.channels.jp0y<? super T>, InterfaceC6216q<? super was>, Object> f37093y;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.toq$k */
    /* JADX INFO: compiled from: Builders.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.CallbackFlowBuilder", m22756f = "Builders.kt", m22757i = {0}, m22758l = {336}, m22759m = "collectTo", m22760n = {"scope"}, m22761s = {"L$0"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class C6625k extends AbstractC6209q {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ toq<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6625k(toq<T> toqVar, InterfaceC6216q<? super C6625k> interfaceC6216q) {
            super(interfaceC6216q);
            this.this$0 = toqVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo24106p(null, this);
        }
    }

    public /* synthetic */ toq(InterfaceC5979h interfaceC5979h, kotlin.coroutines.f7l8 f7l8Var, int i2, kotlinx.coroutines.channels.qrj qrjVar, int i3, kotlin.jvm.internal.ni7 ni7Var) {
        this(interfaceC5979h, (i3 & 2) != 0 ? C6217s.INSTANCE : f7l8Var, (i3 & 4) != 0 ? -2 : i2, (i3 & 8) != 0 ? kotlinx.coroutines.channels.qrj.SUSPEND : qrjVar);
    }

    @Override // kotlinx.coroutines.flow.C6572g, kotlinx.coroutines.flow.internal.AbstractC6584n
    @InterfaceC7396q
    protected AbstractC6584n<T> ld6(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        return new toq(this.f37093y, f7l8Var, i2, qrjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.C6572g, kotlinx.coroutines.flow.internal.AbstractC6584n
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object mo24106p(@mub.InterfaceC7396q kotlinx.coroutines.channels.jp0y<? super T> r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.toq.C6625k
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.toq$k r0 = (kotlinx.coroutines.flow.toq.C6625k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.toq$k r0 = new kotlinx.coroutines.flow.toq$k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.jp0y r5 = (kotlinx.coroutines.channels.jp0y) r5
            kotlin.C6318m.n7h(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C6318m.n7h(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = super.mo24106p(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.oc()
            if (r5 == 0) goto L4c
            kotlin.was r5 = kotlin.was.f36763k
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.toq.mo24106p(kotlinx.coroutines.channels.jp0y, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public toq(@InterfaceC7396q InterfaceC5979h<? super kotlinx.coroutines.channels.jp0y<? super T>, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        super(interfaceC5979h, f7l8Var, i2, qrjVar);
        this.f37093y = interfaceC5979h;
    }
}
