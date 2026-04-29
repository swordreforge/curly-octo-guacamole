package kotlin.ranges;

import java.util.Iterator;
import kotlin.InterfaceC6232i;
import kotlin.gyi;
import kotlin.i9jn;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: UIntRange.kt */
/* JADX INFO: loaded from: classes3.dex */
@i9jn(markerClass = {InterfaceC6232i.class})
@yz(version = "1.5")
public class zurt implements Iterable<gyi>, InterfaceC7625k {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    public static final C6358k f36560g = new C6358k(null);

    /* JADX INFO: renamed from: k */
    private final int f36561k;

    /* JADX INFO: renamed from: n */
    private final int f36562n;

    /* JADX INFO: renamed from: q */
    private final int f36563q;

    /* JADX INFO: renamed from: kotlin.ranges.zurt$k */
    /* JADX INFO: compiled from: UIntRange.kt */
    public static final class C6358k {
        private C6358k() {
        }

        public /* synthetic */ C6358k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final zurt m23374k(int i2, int i3, int i4) {
            return new zurt(i2, i3, i4, null);
        }
    }

    private zurt(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f36561k = i2;
        this.f36563q = kotlin.internal.ki.m22873q(i2, i3, i4);
        this.f36562n = i4;
    }

    public /* synthetic */ zurt(int i2, int i3, int i4, kotlin.jvm.internal.ni7 ni7Var) {
        this(i2, i3, i4);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof zurt) {
            if (!isEmpty() || !((zurt) obj).isEmpty()) {
                zurt zurtVar = (zurt) obj;
                if (this.f36561k != zurtVar.f36561k || this.f36563q != zurtVar.f36563q || this.f36562n != zurtVar.f36562n) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f7l8() {
        return this.f36561k;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f36561k * 31) + this.f36563q) * 31) + this.f36562n;
    }

    public boolean isEmpty() {
        if (this.f36562n > 0) {
            if (Integer.compareUnsigned(this.f36561k, this.f36563q) > 0) {
                return true;
            }
        } else if (Integer.compareUnsigned(this.f36561k, this.f36563q) < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @InterfaceC7396q
    public final Iterator<gyi> iterator() {
        return new ni7(this.f36561k, this.f36563q, this.f36562n, null);
    }

    /* JADX INFO: renamed from: s */
    public final int m23372s() {
        return this.f36562n;
    }

    @InterfaceC7396q
    public String toString() {
        StringBuilder sb;
        int i2;
        if (this.f36562n > 0) {
            sb = new StringBuilder();
            sb.append((Object) gyi.yz(this.f36561k));
            sb.append("..");
            sb.append((Object) gyi.yz(this.f36563q));
            sb.append(" step ");
            i2 = this.f36562n;
        } else {
            sb = new StringBuilder();
            sb.append((Object) gyi.yz(this.f36561k));
            sb.append(" downTo ");
            sb.append((Object) gyi.yz(this.f36563q));
            sb.append(" step ");
            i2 = -this.f36562n;
        }
        sb.append(i2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: y */
    public final int m23373y() {
        return this.f36563q;
    }
}
