package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes3.dex */
final class f7l8 extends kotlin.collections.n5r1 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final int[] f36395k;

    /* JADX INFO: renamed from: q */
    private int f36396q;

    public f7l8(@InterfaceC7396q int[] array) {
        d2ok.m23075h(array, "array");
        this.f36395k = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36396q < this.f36395k.length;
    }

    @Override // kotlin.collections.n5r1
    public int nextInt() {
        try {
            int[] iArr = this.f36395k;
            int i2 = this.f36396q;
            this.f36396q = i2 + 1;
            return iArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f36396q--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }
}
