package kotlin.ranges;

import kotlin.collections.hyr;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes3.dex */
public class qrj implements Iterable<Long>, InterfaceC7625k {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    public static final C6351k f36540g = new C6351k(null);

    /* JADX INFO: renamed from: k */
    private final long f36541k;

    /* JADX INFO: renamed from: n */
    private final long f36542n;

    /* JADX INFO: renamed from: q */
    private final long f36543q;

    /* JADX INFO: renamed from: kotlin.ranges.qrj$k */
    /* JADX INFO: compiled from: Progressions.kt */
    public static final class C6351k {
        private C6351k() {
        }

        public /* synthetic */ C6351k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final qrj m23361k(long j2, long j3, long j4) {
            return new qrj(j2, j3, j4);
        }
    }

    public qrj(long j2, long j3, long j4) {
        if (j4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j4 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f36541k = j2;
        this.f36543q = kotlin.internal.n7h.m22877q(j2, j3, j4);
        this.f36542n = j4;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof qrj) {
            if (!isEmpty() || !((qrj) obj).isEmpty()) {
                qrj qrjVar = (qrj) obj;
                if (this.f36541k != qrjVar.f36541k || this.f36543q != qrjVar.f36543q || this.f36542n != qrjVar.f36542n) {
                }
            }
            return true;
        }
        return false;
    }

    public final long f7l8() {
        return this.f36541k;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j2 = 31;
        long j3 = this.f36541k;
        long j4 = this.f36543q;
        long j5 = j2 * (((j3 ^ (j3 >>> 32)) * j2) + (j4 ^ (j4 >>> 32)));
        long j6 = this.f36542n;
        return (int) (j5 + (j6 ^ (j6 >>> 32)));
    }

    public boolean isEmpty() {
        long j2 = this.f36542n;
        long j3 = this.f36541k;
        long j4 = this.f36543q;
        if (j2 > 0) {
            if (j3 > j4) {
                return true;
            }
        } else if (j3 < j4) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @InterfaceC7396q
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public hyr iterator() {
        return new n7h(this.f36541k, this.f36543q, this.f36542n);
    }

    /* JADX INFO: renamed from: s */
    public final long m23359s() {
        return this.f36542n;
    }

    @InterfaceC7396q
    public String toString() {
        StringBuilder sb;
        long j2;
        if (this.f36542n > 0) {
            sb = new StringBuilder();
            sb.append(this.f36541k);
            sb.append("..");
            sb.append(this.f36543q);
            sb.append(" step ");
            j2 = this.f36542n;
        } else {
            sb = new StringBuilder();
            sb.append(this.f36541k);
            sb.append(" downTo ");
            sb.append(this.f36543q);
            sb.append(" step ");
            j2 = -this.f36542n;
        }
        sb.append(j2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: y */
    public final long m23360y() {
        return this.f36543q;
    }
}
