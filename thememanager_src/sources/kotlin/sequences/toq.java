package kotlin.sequences;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes3.dex */
final class toq<T, K> extends kotlin.collections.toq<T> {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final cyoe.x2<T, K> f36636g;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final Iterator<T> f36637n;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final HashSet<K> f36638y;

    /* JADX WARN: Multi-variable type inference failed */
    public toq(@InterfaceC7396q Iterator<? extends T> source, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector) {
        d2ok.m23075h(source, "source");
        d2ok.m23075h(keySelector, "keySelector");
        this.f36637n = source;
        this.f36636g = keySelector;
        this.f36638y = new HashSet<>();
    }

    @Override // kotlin.collections.toq
    /* JADX INFO: renamed from: k */
    protected void mo22435k() {
        while (this.f36637n.hasNext()) {
            T next = this.f36637n.next();
            if (this.f36638y.add(this.f36636g.invoke(next))) {
                zy(next);
                return;
            }
        }
        toq();
    }
}
