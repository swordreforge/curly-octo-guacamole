package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.collections.o */
/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6158o<E> extends zy<E> implements RandomAccess {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final List<E> f36182k;

    /* JADX INFO: renamed from: n */
    private int f36183n;

    /* JADX INFO: renamed from: q */
    private int f36184q;

    /* JADX WARN: Multi-variable type inference failed */
    public C6158o(@InterfaceC7396q List<? extends E> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "list");
        this.f36182k = list;
    }

    @Override // kotlin.collections.zy, java.util.List
    public E get(int i2) {
        zy.Companion.toq(i2, this.f36183n);
        return this.f36182k.get(this.f36184q + i2);
    }

    @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k
    public int getSize() {
        return this.f36183n;
    }

    /* JADX INFO: renamed from: k */
    public final void m22592k(int i2, int i3) {
        zy.Companion.m22683q(i2, i3, this.f36182k.size());
        this.f36184q = i2;
        this.f36183n = i3 - i2;
    }
}
