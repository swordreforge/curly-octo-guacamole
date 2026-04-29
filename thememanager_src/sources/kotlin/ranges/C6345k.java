package kotlin.ranges;

import kotlin.collections.AbstractC6145i;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: renamed from: kotlin.ranges.k */
/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes3.dex */
public class C6345k implements Iterable<Character>, InterfaceC7625k {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    public static final k f36510g = new k(null);

    /* JADX INFO: renamed from: k */
    private final char f36511k;

    /* JADX INFO: renamed from: n */
    private final int f36512n;

    /* JADX INFO: renamed from: q */
    private final char f36513q;

    /* JADX INFO: renamed from: kotlin.ranges.k$k */
    /* JADX INFO: compiled from: Progressions.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final C6345k m23325k(char c2, char c3, int i2) {
            return new C6345k(c2, c3, i2);
        }
    }

    public C6345k(char c2, char c3, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i2 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f36511k = c2;
        this.f36513q = (char) kotlin.internal.n7h.zy(c2, c3, i2);
        this.f36512n = i2;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof C6345k) {
            if (!isEmpty() || !((C6345k) obj).isEmpty()) {
                C6345k c6345k = (C6345k) obj;
                if (this.f36511k != c6345k.f36511k || this.f36513q != c6345k.f36513q || this.f36512n != c6345k.f36512n) {
                }
            }
            return true;
        }
        return false;
    }

    public final char f7l8() {
        return this.f36511k;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f36511k * 31) + this.f36513q) * 31) + this.f36512n;
    }

    public boolean isEmpty() {
        if (this.f36512n > 0) {
            if (d2ok.m23076i(this.f36511k, this.f36513q) > 0) {
                return true;
            }
        } else if (d2ok.m23076i(this.f36511k, this.f36513q) < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @InterfaceC7396q
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC6145i iterator() {
        return new toq(this.f36511k, this.f36513q, this.f36512n);
    }

    /* JADX INFO: renamed from: s */
    public final int m23323s() {
        return this.f36512n;
    }

    @InterfaceC7396q
    public String toString() {
        StringBuilder sb;
        int i2;
        if (this.f36512n > 0) {
            sb = new StringBuilder();
            sb.append(this.f36511k);
            sb.append("..");
            sb.append(this.f36513q);
            sb.append(" step ");
            i2 = this.f36512n;
        } else {
            sb = new StringBuilder();
            sb.append(this.f36511k);
            sb.append(" downTo ");
            sb.append(this.f36513q);
            sb.append(" step ");
            i2 = -this.f36512n;
        }
        sb.append(i2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: y */
    public final char m23324y() {
        return this.f36513q;
    }
}
