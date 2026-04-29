package kotlin.ranges;

import kotlin.collections.n5r1;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: renamed from: kotlin.ranges.p */
/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes3.dex */
public class C6349p implements Iterable<Integer>, InterfaceC7625k {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    public static final k f36534g = new k(null);

    /* JADX INFO: renamed from: k */
    private final int f36535k;

    /* JADX INFO: renamed from: n */
    private final int f36536n;

    /* JADX INFO: renamed from: q */
    private final int f36537q;

    /* JADX INFO: renamed from: kotlin.ranges.p$k */
    /* JADX INFO: compiled from: Progressions.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final C6349p m23354k(int i2, int i3, int i4) {
            return new C6349p(i2, i3, i4);
        }
    }

    public C6349p(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f36535k = i2;
        this.f36537q = kotlin.internal.n7h.zy(i2, i3, i4);
        this.f36536n = i4;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof C6349p) {
            if (!isEmpty() || !((C6349p) obj).isEmpty()) {
                C6349p c6349p = (C6349p) obj;
                if (this.f36535k != c6349p.f36535k || this.f36537q != c6349p.f36537q || this.f36536n != c6349p.f36536n) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f7l8() {
        return this.f36535k;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f36535k * 31) + this.f36537q) * 31) + this.f36536n;
    }

    public boolean isEmpty() {
        if (this.f36536n > 0) {
            if (this.f36535k > this.f36537q) {
                return true;
            }
        } else if (this.f36535k < this.f36537q) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @InterfaceC7396q
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public n5r1 iterator() {
        return new ld6(this.f36535k, this.f36537q, this.f36536n);
    }

    /* JADX INFO: renamed from: s */
    public final int m23352s() {
        return this.f36536n;
    }

    @InterfaceC7396q
    public String toString() {
        StringBuilder sb;
        int i2;
        if (this.f36536n > 0) {
            sb = new StringBuilder();
            sb.append(this.f36535k);
            sb.append("..");
            sb.append(this.f36537q);
            sb.append(" step ");
            i2 = this.f36536n;
        } else {
            sb = new StringBuilder();
            sb.append(this.f36535k);
            sb.append(" downTo ");
            sb.append(this.f36537q);
            sb.append(" step ");
            i2 = -this.f36536n;
        }
        sb.append(i2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: y */
    public final int m23353y() {
        return this.f36537q;
    }
}
