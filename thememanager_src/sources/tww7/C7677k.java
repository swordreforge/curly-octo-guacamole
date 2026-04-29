package tww7;

import androidx.exifinterface.media.C0846k;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import cyoe.x2;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.zy;
import kotlin.d3;
import kotlin.was;
import kotlinx.coroutines.internal.qrj;
import kotlinx.coroutines.tfm;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: tww7.k */
/* JADX INFO: compiled from: Cancellable.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a{\u0010\u0010\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0013\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00022\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000\u001a#\u0010\u0016\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0082\b\u001a\u001c\u0010\u0018\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0017\u001a\u00020\u000bH\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {C0846k.zaso, "Lkotlin/Function1;", "Lkotlin/coroutines/q;", "", "completion", "Lkotlin/was;", "zy", "(Lcyoe/x2;Lkotlin/coroutines/q;)V", "R", "Lkotlin/Function2;", "receiver", "", "Lkotlin/c;", "name", "cause", "onCancellation", "q", "(Lcyoe/h;Ljava/lang/Object;Lkotlin/coroutines/q;Lcyoe/x2;)V", "fatalCompletion", "n", "Lkotlin/Function0;", "block", "toq", "e", "k", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class C7677k {
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m28034g(InterfaceC5979h interfaceC5979h, Object obj, InterfaceC6216q interfaceC6216q, x2 x2Var, int i2, Object obj2) throws Throwable {
        if ((i2 & 4) != 0) {
            x2Var = null;
        }
        m28037q(interfaceC5979h, obj, interfaceC6216q, x2Var);
    }

    /* JADX INFO: renamed from: k */
    private static final void m28035k(InterfaceC6216q<?> interfaceC6216q, Throwable th) throws Throwable {
        C6323o.k kVar = C6323o.Companion;
        interfaceC6216q.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(th)));
        throw th;
    }

    /* JADX INFO: renamed from: n */
    public static final void m28036n(@InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q2) throws Throwable {
        try {
            InterfaceC6216q interfaceC6216qM22747n = zy.m22747n(interfaceC6216q);
            C6323o.k kVar = C6323o.Companion;
            qrj.f7l8(interfaceC6216qM22747n, C6323o.m28280constructorimpl(was.f36763k), null, 2, null);
        } catch (Throwable th) {
            m28035k(interfaceC6216q2, th);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final <R, T> void m28037q(@InterfaceC7396q InterfaceC5979h<? super R, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, R r2, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q, @InterfaceC7395n x2<? super Throwable, was> x2Var) throws Throwable {
        try {
            InterfaceC6216q interfaceC6216qM22747n = zy.m22747n(zy.zy(interfaceC5979h, r2, interfaceC6216q));
            C6323o.k kVar = C6323o.Companion;
            qrj.m24399g(interfaceC6216qM22747n, C6323o.m28280constructorimpl(was.f36763k), x2Var);
        } catch (Throwable th) {
            m28035k(interfaceC6216q, th);
        }
    }

    private static final void toq(InterfaceC6216q<?> interfaceC6216q, InterfaceC5981k<was> interfaceC5981k) throws Throwable {
        try {
            interfaceC5981k.invoke();
        } catch (Throwable th) {
            m28035k(interfaceC6216q, th);
        }
    }

    @tfm
    public static final <T> void zy(@InterfaceC7396q x2<? super InterfaceC6216q<? super T>, ? extends Object> x2Var, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) throws Throwable {
        try {
            InterfaceC6216q interfaceC6216qM22747n = zy.m22747n(zy.toq(x2Var, interfaceC6216q));
            C6323o.k kVar = C6323o.Companion;
            qrj.f7l8(interfaceC6216qM22747n, C6323o.m28280constructorimpl(was.f36763k), null, 2, null);
        } catch (Throwable th) {
            m28035k(interfaceC6216q, th);
        }
    }
}
