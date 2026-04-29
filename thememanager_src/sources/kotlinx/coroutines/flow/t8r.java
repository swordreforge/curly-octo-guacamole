package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.miui.clock.module.AbstractC5074q;
import cyoe.InterfaceC5979h;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.bo;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Distinct.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\u001a\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aT\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\t\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u001a6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u001aw\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f2:\u0010\t\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"*\u0010\u0015\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\"0\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u0012\u0004\b\u0017\u0010\u0014¨\u0006\u0019"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/flow/s;", "k", "Lkotlin/Function2;", "Lkotlin/c;", "name", AbstractC5074q.f29194r, "new", "", "areEquivalent", "toq", "K", "Lkotlin/Function1;", "keySelector", "zy", "", "q", "(Lkotlinx/coroutines/flow/s;Lcyoe/x2;Lcyoe/h;)Lkotlinx/coroutines/flow/s;", "Lcyoe/x2;", "getDefaultKeySelector$annotations$FlowKt__DistinctKt", "()V", "defaultKeySelector", "Lcyoe/h;", "getDefaultAreEquivalent$annotations$FlowKt__DistinctKt", "defaultAreEquivalent", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class t8r {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final cyoe.x2<Object, Object> f37092k = toq.INSTANCE;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final InterfaceC5979h<Object, Object, Boolean> f81997toq = C6624k.INSTANCE;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t8r$k */
    /* JADX INFO: compiled from: Distinct.kt */
    @kotlin.d3(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", AbstractC5074q.f29194r, "", "new", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class C6624k extends AbstractC6308r implements InterfaceC5979h<Object, Object, Boolean> {
        public static final C6624k INSTANCE = new C6624k();

        C6624k() {
            super(2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.InterfaceC5979h
        @InterfaceC7396q
        public final Boolean invoke(@InterfaceC7395n Object obj, @InterfaceC7395n Object obj2) {
            return Boolean.valueOf(kotlin.jvm.internal.d2ok.f7l8(obj, obj2));
        }
    }

    /* JADX INFO: compiled from: Distinct.kt */
    @kotlin.d3(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class toq extends AbstractC6308r implements cyoe.x2<Object, Object> {
        public static final toq INSTANCE = new toq();

        toq() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7395n Object obj) {
            return obj;
        }
    }

    /* JADX INFO: renamed from: g */
    private static /* synthetic */ void m24241g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <T> InterfaceC6622s<T> m24242k(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s) {
        return interfaceC6622s instanceof hyr ? interfaceC6622s : m24244q(interfaceC6622s, f37092k, f81997toq);
    }

    /* JADX INFO: renamed from: n */
    private static /* synthetic */ void m24243n() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    private static final <T> InterfaceC6622s<T> m24244q(InterfaceC6622s<? extends T> interfaceC6622s, cyoe.x2<? super T, ? extends Object> x2Var, InterfaceC5979h<Object, Object, Boolean> interfaceC5979h) {
        if (interfaceC6622s instanceof f7l8) {
            f7l8 f7l8Var = (f7l8) interfaceC6622s;
            if (f7l8Var.f36953q == x2Var && f7l8Var.f36952n == interfaceC5979h) {
                return interfaceC6622s;
            }
        }
        return new f7l8(interfaceC6622s, x2Var, interfaceC5979h);
    }

    @InterfaceC7396q
    public static final <T> InterfaceC6622s<T> toq(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC5979h<? super T, ? super T, Boolean> interfaceC5979h) {
        return m24244q(interfaceC6622s, f37092k, (InterfaceC5979h) bo.cdj(interfaceC5979h, 2));
    }

    @InterfaceC7396q
    public static final <T, K> InterfaceC6622s<T> zy(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q cyoe.x2<? super T, ? extends K> x2Var) {
        return m24244q(interfaceC6622s, x2Var, f81997toq);
    }
}
