package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import kotlin.coroutines.AbstractC6212k;
import kotlin.coroutines.InterfaceC6214n;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.f7l8;
import kotlin.jvm.internal.AbstractC6308r;
import kotlinx.coroutines.internal.C6675i;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH&J\u001c\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0017J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0012\u0010\u0014\u001a\u00020\r2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011J\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0087\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/dd;", "Lkotlin/coroutines/k;", "Lkotlin/coroutines/n;", "Lkotlin/coroutines/f7l8;", "context", "", "wlev", "", "parallelism", "ga", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/was;", "bap7", "h4b", C0846k.zaso, "Lkotlin/coroutines/q;", "continuation", "ki", "x2", C2690k.k.f61039ld6, "e5", "", "toString", C4991s.f28129n, "()V", "k", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public abstract class dd extends AbstractC6212k implements InterfaceC6214n {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C6535k f36882k = new C6535k(null);

    /* JADX INFO: renamed from: kotlinx.coroutines.dd$k */
    /* JADX INFO: compiled from: CoroutineDispatcher.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/dd$k;", "Lkotlin/coroutines/toq;", "Lkotlin/coroutines/n;", "Lkotlinx/coroutines/dd;", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    @kotlin.ki
    public static final class C6535k extends kotlin.coroutines.toq<InterfaceC6214n, dd> {

        /* JADX INFO: renamed from: kotlinx.coroutines.dd$k$k */
        /* JADX INFO: compiled from: CoroutineDispatcher.kt */
        @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/coroutines/f7l8$toq;", "it", "Lkotlinx/coroutines/dd;", "invoke", "(Lkotlin/coroutines/f7l8$toq;)Lkotlinx/coroutines/dd;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class k extends AbstractC6308r implements cyoe.x2<f7l8.toq, dd> {
            public static final k INSTANCE = new k();

            k() {
                super(1);
            }

            @Override // cyoe.x2
            @InterfaceC7395n
            public final dd invoke(@InterfaceC7396q f7l8.toq toqVar) {
                if (toqVar instanceof dd) {
                    return (dd) toqVar;
                }
                return null;
            }
        }

        private C6535k() {
            super(InterfaceC6214n.ep, k.INSTANCE);
        }

        public /* synthetic */ C6535k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }
    }

    public dd() {
        super(InterfaceC6214n.ep);
    }

    public abstract void bap7(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Runnable runnable);

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    public final dd e5(@InterfaceC7396q dd ddVar) {
        return ddVar;
    }

    @InterfaceC7396q
    @InterfaceC6533d
    public dd ga(int i2) {
        C6675i.m24351k(i2);
        return new kotlinx.coroutines.internal.t8r(this, i2);
    }

    @Override // kotlin.coroutines.AbstractC6212k, kotlin.coroutines.f7l8.toq, kotlin.coroutines.f7l8
    @InterfaceC7395n
    public <E extends f7l8.toq> E get(@InterfaceC7396q f7l8.zy<E> zyVar) {
        return (E) InterfaceC6214n.k.toq(this, zyVar);
    }

    @tfm
    public void h4b(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Runnable runnable) {
        bap7(f7l8Var, runnable);
    }

    @Override // kotlin.coroutines.InterfaceC6214n
    @InterfaceC7396q
    public final <T> InterfaceC6216q<T> ki(@InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        return new kotlinx.coroutines.internal.x2(this, interfaceC6216q);
    }

    @Override // kotlin.coroutines.AbstractC6212k, kotlin.coroutines.f7l8.toq, kotlin.coroutines.f7l8
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 minusKey(@InterfaceC7396q f7l8.zy<?> zyVar) {
        return InterfaceC6214n.k.zy(this, zyVar);
    }

    @InterfaceC7396q
    public String toString() {
        return C6551e.m24040k(this) + '@' + C6551e.toq(this);
    }

    public boolean wlev(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        return true;
    }

    @Override // kotlin.coroutines.InterfaceC6214n
    public final void x2(@InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
        ((kotlinx.coroutines.internal.x2) interfaceC6216q).fn3e();
    }
}
