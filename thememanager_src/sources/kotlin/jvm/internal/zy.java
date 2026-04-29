package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes3.dex */
final class zy extends kotlin.collections.t8r {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final byte[] f36466k;

    /* JADX INFO: renamed from: q */
    private int f36467q;

    public zy(@InterfaceC7396q byte[] array) {
        d2ok.m23075h(array, "array");
        this.f36466k = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36467q < this.f36466k.length;
    }

    @Override // kotlin.collections.t8r
    public byte toq() {
        try {
            byte[] bArr = this.f36466k;
            int i2 = this.f36467q;
            this.f36467q = i2 + 1;
            return bArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f36467q--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }
}
