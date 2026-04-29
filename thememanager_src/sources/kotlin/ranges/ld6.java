package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.n5r1;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ld6 extends n5r1 {

    /* JADX INFO: renamed from: g */
    private int f36516g;

    /* JADX INFO: renamed from: k */
    private final int f36517k;

    /* JADX INFO: renamed from: n */
    private boolean f36518n;

    /* JADX INFO: renamed from: q */
    private final int f36519q;

    public ld6(int i2, int i3, int i4) {
        this.f36517k = i4;
        this.f36519q = i3;
        boolean z2 = true;
        if (i4 <= 0 ? i2 < i3 : i2 > i3) {
            z2 = false;
        }
        this.f36518n = z2;
        this.f36516g = z2 ? i2 : i3;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36518n;
    }

    /* JADX INFO: renamed from: k */
    public final int m23329k() {
        return this.f36517k;
    }

    @Override // kotlin.collections.n5r1
    public int nextInt() {
        int i2 = this.f36516g;
        if (i2 != this.f36519q) {
            this.f36516g = this.f36517k + i2;
        } else {
            if (!this.f36518n) {
                throw new NoSuchElementException();
            }
            this.f36518n = false;
        }
        return i2;
    }
}
