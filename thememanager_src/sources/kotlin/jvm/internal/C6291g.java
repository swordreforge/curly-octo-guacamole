package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.jvm.internal.g */
/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes3.dex */
final class C6291g extends kotlin.collections.eqxt {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final float[] f36409k;

    /* JADX INFO: renamed from: q */
    private int f36410q;

    public C6291g(@InterfaceC7396q float[] array) {
        d2ok.m23075h(array, "array");
        this.f36409k = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36410q < this.f36409k.length;
    }

    @Override // kotlin.collections.eqxt
    public float toq() {
        try {
            float[] fArr = this.f36409k;
            int i2 = this.f36410q;
            this.f36410q = i2 + 1;
            return fArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f36410q--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }
}
