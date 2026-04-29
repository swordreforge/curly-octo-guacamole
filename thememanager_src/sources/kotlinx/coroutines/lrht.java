package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.C6197g;
import kotlin.coroutines.InterfaceC6216q;
import mub.InterfaceC7396q;
import tww7.C7677k;

/* JADX INFO: compiled from: CoroutineStart.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ^\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u00022'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/lrht;", "", C0846k.zaso, "Lkotlin/Function1;", "Lkotlin/coroutines/q;", "", "block", "completion", "Lkotlin/was;", "invoke", "(Lcyoe/x2;Lkotlin/coroutines/q;)V", "R", "Lkotlin/Function2;", "Lkotlin/fn3e;", "receiver", "(Lcyoe/h;Ljava/lang/Object;Lkotlin/coroutines/q;)V", "", "isLazy", "()Z", "isLazy$annotations", "()V", C4991s.f28129n, "(Ljava/lang/String;I)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public enum lrht {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* JADX INFO: renamed from: kotlinx.coroutines.lrht$k */
    /* JADX INFO: compiled from: CoroutineStart.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class C6698k {

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int[] f37292k;

        static {
            int[] iArr = new int[lrht.values().length];
            iArr[lrht.DEFAULT.ordinal()] = 1;
            iArr[lrht.ATOMIC.ordinal()] = 2;
            iArr[lrht.UNDISPATCHED.ordinal()] = 3;
            iArr[lrht.LAZY.ordinal()] = 4;
            f37292k = iArr;
        }
    }

    @tfm
    public static /* synthetic */ void isLazy$annotations() {
    }

    @tfm
    public final <T> void invoke(@InterfaceC7396q cyoe.x2<? super InterfaceC6216q<? super T>, ? extends Object> x2Var, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) throws Throwable {
        int i2 = C6698k.f37292k[ordinal()];
        if (i2 == 1) {
            C7677k.zy(x2Var, interfaceC6216q);
            return;
        }
        if (i2 == 2) {
            C6197g.m22743y(x2Var, interfaceC6216q);
        } else if (i2 == 3) {
            tww7.toq.m28039k(x2Var, interfaceC6216q);
        } else if (i2 != 4) {
            throw new kotlin.oc();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    @tfm
    public final <R, T> void invoke(@InterfaceC7396q InterfaceC5979h<? super R, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, R r2, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) throws Throwable {
        int i2 = C6698k.f37292k[ordinal()];
        if (i2 == 1) {
            C7677k.m28034g(interfaceC5979h, r2, interfaceC6216q, null, 4, null);
            return;
        }
        if (i2 == 2) {
            C6197g.m22742s(interfaceC5979h, r2, interfaceC6216q);
        } else if (i2 == 3) {
            tww7.toq.toq(interfaceC5979h, r2, interfaceC6216q);
        } else if (i2 != 4) {
            throw new kotlin.oc();
        }
    }
}
