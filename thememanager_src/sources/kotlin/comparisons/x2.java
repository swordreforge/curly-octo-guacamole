package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes3.dex */
final class x2<T> implements Comparator<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final Comparator<T> f36245k;

    public x2(@InterfaceC7396q Comparator<T> comparator) {
        d2ok.m23075h(comparator, "comparator");
        this.f36245k = comparator;
    }

    @Override // java.util.Comparator
    public int compare(T t2, T t3) {
        return this.f36245k.compare(t3, t2);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final Comparator<T> m22710k() {
        return this.f36245k;
    }

    @Override // java.util.Comparator
    @InterfaceC7396q
    public final Comparator<T> reversed() {
        return this.f36245k;
    }
}
