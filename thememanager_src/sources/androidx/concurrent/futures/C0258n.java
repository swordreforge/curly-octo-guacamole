package androidx.concurrent.futures;

import com.google.common.util.concurrent.InterfaceFutureC4792c;
import zy.dd;
import zy.uv6;

/* JADX INFO: renamed from: androidx.concurrent.futures.n */
/* JADX INFO: compiled from: ResolvableFuture.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public final class C0258n<V> extends AbstractC0257k<V> {
    private C0258n() {
    }

    public static <V> C0258n<V> fu4() {
        return new C0258n<>();
    }

    @Override // androidx.concurrent.futures.AbstractC0257k
    public boolean fn3e(InterfaceFutureC4792c<? extends V> interfaceFutureC4792c) {
        return super.fn3e(interfaceFutureC4792c);
    }

    @Override // androidx.concurrent.futures.AbstractC0257k
    /* JADX INFO: renamed from: i */
    public boolean mo901i(Throwable th) {
        return super.mo901i(th);
    }

    @Override // androidx.concurrent.futures.AbstractC0257k
    public boolean t8r(@dd V v2) {
        return super.t8r(v2);
    }
}
