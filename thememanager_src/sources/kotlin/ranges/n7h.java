package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.hyr;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class n7h extends hyr {

    /* JADX INFO: renamed from: g */
    private long f36522g;

    /* JADX INFO: renamed from: k */
    private final long f36523k;

    /* JADX INFO: renamed from: n */
    private boolean f36524n;

    /* JADX INFO: renamed from: q */
    private final long f36525q;

    public n7h(long j2, long j3, long j4) {
        this.f36523k = j4;
        this.f36525q = j3;
        boolean z2 = true;
        if (j4 <= 0 ? j2 < j3 : j2 > j3) {
            z2 = false;
        }
        this.f36524n = z2;
        this.f36522g = z2 ? j2 : j3;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36524n;
    }

    /* JADX INFO: renamed from: k */
    public final long m23348k() {
        return this.f36523k;
    }

    @Override // kotlin.collections.hyr
    public long nextLong() {
        long j2 = this.f36522g;
        if (j2 != this.f36525q) {
            this.f36522g = this.f36523k + j2;
        } else {
            if (!this.f36524n) {
                throw new NoSuchElementException();
            }
            this.f36524n = false;
        }
        return j2;
    }
}
