package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.AbstractC6145i;
import kotlin.jvm.internal.d2ok;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class toq extends AbstractC6145i {

    /* JADX INFO: renamed from: g */
    private int f36546g;

    /* JADX INFO: renamed from: k */
    private final int f36547k;

    /* JADX INFO: renamed from: n */
    private boolean f36548n;

    /* JADX INFO: renamed from: q */
    private final int f36549q;

    public toq(char c2, char c3, int i2) {
        this.f36547k = i2;
        this.f36549q = c3;
        boolean z2 = true;
        if (i2 <= 0 ? d2ok.m23076i(c2, c3) < 0 : d2ok.m23076i(c2, c3) > 0) {
            z2 = false;
        }
        this.f36548n = z2;
        this.f36546g = z2 ? c2 : c3;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36548n;
    }

    @Override // kotlin.collections.AbstractC6145i
    public char toq() {
        int i2 = this.f36546g;
        if (i2 != this.f36549q) {
            this.f36546g = this.f36547k + i2;
        } else {
            if (!this.f36548n) {
                throw new NoSuchElementException();
            }
            this.f36548n = false;
        }
        return (char) i2;
    }

    public final int zy() {
        return this.f36547k;
    }
}
