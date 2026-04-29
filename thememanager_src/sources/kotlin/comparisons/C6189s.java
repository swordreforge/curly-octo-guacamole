package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.d2ok;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.comparisons.s */
/* JADX INFO: compiled from: _Comparisons.kt */
/* JADX INFO: loaded from: classes3.dex */
class C6189s extends C6190y {
    @yz(version = "1.1")
    /* JADX INFO: renamed from: d */
    public static final <T> T m22708d(T t2, T t3, @InterfaceC7396q Comparator<? super T> comparator) {
        d2ok.m23075h(comparator, "comparator");
        return comparator.compare(t2, t3) <= 0 ? t2 : t3;
    }

    @yz(version = "1.1")
    public static final <T> T dr(T t2, T t3, T t4, @InterfaceC7396q Comparator<? super T> comparator) {
        d2ok.m23075h(comparator, "comparator");
        return (T) xwq3(t2, xwq3(t3, t4, comparator), comparator);
    }

    @yz(version = "1.1")
    public static final <T> T ikck(T t2, T t3, T t4, @InterfaceC7396q Comparator<? super T> comparator) {
        d2ok.m23075h(comparator, "comparator");
        return (T) m22708d(t2, m22708d(t3, t4, comparator), comparator);
    }

    @yz(version = "1.4")
    public static final <T> T mu(T t2, @InterfaceC7396q T[] other, @InterfaceC7396q Comparator<? super T> comparator) {
        d2ok.m23075h(other, "other");
        d2ok.m23075h(comparator, "comparator");
        for (T t3 : other) {
            if (comparator.compare(t2, t3) > 0) {
                t2 = t3;
            }
        }
        return t2;
    }

    @yz(version = "1.4")
    /* JADX INFO: renamed from: v */
    public static final <T> T m22709v(T t2, @InterfaceC7396q T[] other, @InterfaceC7396q Comparator<? super T> comparator) {
        d2ok.m23075h(other, "other");
        d2ok.m23075h(comparator, "comparator");
        for (T t3 : other) {
            if (comparator.compare(t2, t3) < 0) {
                t2 = t3;
            }
        }
        return t2;
    }

    @yz(version = "1.1")
    public static final <T> T xwq3(T t2, T t3, @InterfaceC7396q Comparator<? super T> comparator) {
        d2ok.m23075h(comparator, "comparator");
        return comparator.compare(t2, t3) >= 0 ? t2 : t3;
    }
}
