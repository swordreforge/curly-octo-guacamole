package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.sequences.k */
/* JADX INFO: compiled from: SequencesJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6403k<T> implements qrj<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final AtomicReference<qrj<T>> f36609k;

    public C6403k(@InterfaceC7396q qrj<? extends T> sequence) {
        d2ok.m23075h(sequence, "sequence");
        this.f36609k = new AtomicReference<>(sequence);
    }

    @Override // kotlin.sequences.qrj
    @InterfaceC7396q
    public Iterator<T> iterator() {
        qrj<T> andSet = this.f36609k.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
