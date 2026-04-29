package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes3.dex */
final class toq extends kotlin.collections.ki {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final boolean[] f36445k;

    /* JADX INFO: renamed from: q */
    private int f36446q;

    public toq(@InterfaceC7396q boolean[] array) {
        d2ok.m23075h(array, "array");
        this.f36445k = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36446q < this.f36445k.length;
    }

    @Override // kotlin.collections.ki
    public boolean toq() {
        try {
            boolean[] zArr = this.f36445k;
            int i2 = this.f36446q;
            this.f36446q = i2 + 1;
            return zArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f36446q--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }
}
