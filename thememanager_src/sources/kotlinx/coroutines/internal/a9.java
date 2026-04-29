package kotlinx.coroutines.internal;

import com.market.sdk.reflect.C4991s;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.z4;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/internal/a9;", "", "Lkotlinx/coroutines/z4;", "k", "", "toq", com.market.sdk.reflect.toq.f68929toq, "FAST_SERVICE_LOADER_ENABLED", "zy", "Lkotlinx/coroutines/z4;", "dispatcher", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class a9 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final a9 f37205k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final boolean f82006toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final z4 f82007zy;

    static {
        a9 a9Var = new a9();
        f37205k = a9Var;
        f82006toq = hyr.m24349n("kotlinx.coroutines.fast.service.loader", true);
        f82007zy = a9Var.m24314k();
    }

    private a9() {
    }

    /* JADX INFO: renamed from: k */
    private final z4 m24314k() {
        Object next;
        try {
            List<jk> listM24362q = f82006toq ? kja0.f37223k.m24362q() : kotlin.sequences.fn3e.nyj(kotlin.sequences.t8r.m23475n(ServiceLoader.load(jk.class, jk.class.getClassLoader()).iterator()));
            Iterator<T> it = listM24362q.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((jk) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((jk) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            jk jkVar = (jk) next;
            z4 z4VarM24334g = jkVar == null ? null : fti.m24334g(jkVar, listM24362q);
            return z4VarM24334g == null ? fti.toq(null, null, 3, null) : z4VarM24334g;
        } catch (Throwable th) {
            return fti.toq(th, null, 2, null);
        }
    }
}
