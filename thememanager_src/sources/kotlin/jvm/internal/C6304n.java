package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.jvm.internal.n */
/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes3.dex */
final class C6304n extends kotlin.collections.fti {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final double[] f36428k;

    /* JADX INFO: renamed from: q */
    private int f36429q;

    public C6304n(@InterfaceC7396q double[] array) {
        d2ok.m23075h(array, "array");
        this.f36428k = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36429q < this.f36428k.length;
    }

    @Override // kotlin.collections.fti
    public double nextDouble() {
        try {
            double[] dArr = this.f36428k;
            int i2 = this.f36429q;
            this.f36429q = i2 + 1;
            return dArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f36429q--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }
}
