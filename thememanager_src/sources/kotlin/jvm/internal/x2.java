package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes3.dex */
final class x2 extends kotlin.collections.zp {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final short[] f36453k;

    /* JADX INFO: renamed from: q */
    private int f36454q;

    public x2(@InterfaceC7396q short[] array) {
        d2ok.m23075h(array, "array");
        this.f36453k = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36454q < this.f36453k.length;
    }

    @Override // kotlin.collections.zp
    public short toq() {
        try {
            short[] sArr = this.f36453k;
            int i2 = this.f36454q;
            this.f36454q = i2 + 1;
            return sArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f36454q--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }
}
