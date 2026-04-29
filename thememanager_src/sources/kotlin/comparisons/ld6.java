package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes3.dex */
final class ld6 implements Comparator<Comparable<? super Object>> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final ld6 f36238k = new ld6();

    private ld6() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public int compare(@InterfaceC7396q Comparable<Object> a2, @InterfaceC7396q Comparable<Object> b2) {
        d2ok.m23075h(a2, "a");
        d2ok.m23075h(b2, "b");
        return b2.compareTo(a2);
    }

    @Override // java.util.Comparator
    @InterfaceC7396q
    public final Comparator<Comparable<? super Object>> reversed() {
        return C6187p.f36240k;
    }
}
