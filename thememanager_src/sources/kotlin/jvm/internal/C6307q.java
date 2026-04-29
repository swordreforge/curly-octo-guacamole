package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.AbstractC6145i;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.jvm.internal.q */
/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes3.dex */
final class C6307q extends AbstractC6145i {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final char[] f36439k;

    /* JADX INFO: renamed from: q */
    private int f36440q;

    public C6307q(@InterfaceC7396q char[] array) {
        d2ok.m23075h(array, "array");
        this.f36439k = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36440q < this.f36439k.length;
    }

    @Override // kotlin.collections.AbstractC6145i
    public char toq() {
        try {
            char[] cArr = this.f36439k;
            int i2 = this.f36440q;
            this.f36440q = i2 + 1;
            return cArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f36440q--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }
}
