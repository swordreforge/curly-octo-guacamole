package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.comparisons.p */
/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes3.dex */
final class C6187p implements Comparator<Comparable<? super Object>> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C6187p f36240k = new C6187p();

    private C6187p() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public int compare(@InterfaceC7396q Comparable<Object> a2, @InterfaceC7396q Comparable<Object> b2) {
        d2ok.m23075h(a2, "a");
        d2ok.m23075h(b2, "b");
        return a2.compareTo(b2);
    }

    @Override // java.util.Comparator
    @InterfaceC7396q
    public final Comparator<Comparable<? super Object>> reversed() {
        return ld6.f36238k;
    }
}
