package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class zy<T, K> implements qrj<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final qrj<T> f36656k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final cyoe.x2<T, K> f81885toq;

    /* JADX WARN: Multi-variable type inference failed */
    public zy(@InterfaceC7396q qrj<? extends T> source, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector) {
        d2ok.m23075h(source, "source");
        d2ok.m23075h(keySelector, "keySelector");
        this.f36656k = source;
        this.f81885toq = keySelector;
    }

    @Override // kotlin.sequences.qrj
    @InterfaceC7396q
    public Iterator<T> iterator() {
        return new toq(this.f36656k.iterator(), this.f81885toq);
    }
}
