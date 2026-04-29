package kotlinx.coroutines.internal;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\u0004\b\u0001\u0010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/internal/wvg;", "", C0846k.d9i, "Lkotlin/was;", "toq", "()V", "element", "", "k", "(Ljava/lang/Object;)Z", "f7l8", "()Ljava/lang/Object;", "R", "Lkotlin/Function1;", "transform", "", C7704k.y.toq.f95579toq, "(Lcyoe/x2;)Ljava/util/List;", "q", "()Z", "n", "isEmpty", "", "zy", "()I", "size", "singleConsumer", C4991s.f28129n, "(Z)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public class wvg<E> {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f37258k = AtomicReferenceFieldUpdater.newUpdater(wvg.class, Object.class, "_cur");

    @InterfaceC7396q
    private volatile /* synthetic */ Object _cur;

    public wvg(boolean z2) {
        this._cur = new C6692t(8, z2);
    }

    @InterfaceC7395n
    public final E f7l8() {
        while (true) {
            C6692t c6692t = (C6692t) this._cur;
            E e2 = (E) c6692t.x2();
            if (e2 != C6692t.f37240i) {
                return e2;
            }
            androidx.concurrent.futures.toq.m906k(f37258k, this, c6692t, c6692t.ld6());
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public final <R> List<R> m24418g(@InterfaceC7396q cyoe.x2<? super E, ? extends R> x2Var) {
        return ((C6692t) this._cur).m24409s(x2Var);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m24419k(@InterfaceC7396q E e2) {
        while (true) {
            C6692t c6692t = (C6692t) this._cur;
            int iM24407k = c6692t.m24407k(e2);
            if (iM24407k == 0) {
                return true;
            }
            if (iM24407k == 1) {
                androidx.concurrent.futures.toq.m906k(f37258k, this, c6692t, c6692t.ld6());
            } else if (iM24407k == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m24420n() {
        return ((C6692t) this._cur).m24410y();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m24421q() {
        return ((C6692t) this._cur).f7l8();
    }

    public final void toq() {
        while (true) {
            C6692t c6692t = (C6692t) this._cur;
            if (c6692t.m24408q()) {
                return;
            } else {
                androidx.concurrent.futures.toq.m906k(f37258k, this, c6692t, c6692t.ld6());
            }
        }
    }

    public final int zy() {
        return ((C6692t) this._cur).m24406g();
    }
}
