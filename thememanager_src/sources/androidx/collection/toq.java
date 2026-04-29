package androidx.collection;

import kotlin.C6227f;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ArrayMap.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0086\b\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"K", "V", "Landroidx/collection/k;", "k", "", "Lkotlin/f;", "pairs", "toq", "([Lkotlin/f;)Landroidx/collection/k;", "collection-ktx"}, m22787k = 2, mv = {1, 4, 0})
public final class toq {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <K, V> C0247k<K, V> m885k() {
        return new C0247k<>();
    }

    @InterfaceC7396q
    public static final <K, V> C0247k<K, V> toq(@InterfaceC7396q C6227f<? extends K, ? extends V>... pairs) {
        d2ok.cdj(pairs, "pairs");
        C0247k<K, V> c0247k = new C0247k<>(pairs.length);
        for (C6227f<? extends K, ? extends V> c6227f : pairs) {
            c0247k.put(c6227f.getFirst(), c6227f.getSecond());
        }
        return c0247k;
    }
}
