package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes3.dex */
final class ld6 extends kotlin.collections.hyr {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final long[] f36426k;

    /* JADX INFO: renamed from: q */
    private int f36427q;

    public ld6(@InterfaceC7396q long[] array) {
        d2ok.m23075h(array, "array");
        this.f36426k = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36427q < this.f36426k.length;
    }

    @Override // kotlin.collections.hyr
    public long nextLong() {
        try {
            long[] jArr = this.f36426k;
            int i2 = this.f36427q;
            this.f36427q = i2 + 1;
            return jArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f36427q--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }
}
