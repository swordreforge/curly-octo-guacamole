package kotlin.ranges;

import kotlin.i9jn;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class x2 extends C6349p implements f7l8<Integer>, ki<Integer> {

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    public static final C6355k f36553y = new C6355k(null);

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private static final x2 f36552s = new x2(1, 0);

    /* JADX INFO: renamed from: kotlin.ranges.x2$k */
    /* JADX INFO: compiled from: PrimitiveRanges.kt */
    public static final class C6355k {
        private C6355k() {
        }

        public /* synthetic */ C6355k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final x2 m23368k() {
            return x2.f36552s;
        }
    }

    public x2(int i2, int i3) {
        super(i2, i3, 1);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @kotlin.ld6(message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @yz(version = "1.9")
    public static /* synthetic */ void n7h() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.f7l8
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return x2(((Number) comparable).intValue());
    }

    @Override // kotlin.ranges.C6349p
    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof x2) {
            if (!isEmpty() || !((x2) obj).isEmpty()) {
                x2 x2Var = (x2) obj;
                if (f7l8() != x2Var.f7l8() || m23353y() != x2Var.m23353y()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.f7l8
    @InterfaceC7396q
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Integer mo2951k() {
        return Integer.valueOf(f7l8());
    }

    @Override // kotlin.ranges.C6349p
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (f7l8() * 31) + m23353y();
    }

    @Override // kotlin.ranges.C6349p, kotlin.ranges.f7l8
    public boolean isEmpty() {
        return f7l8() > m23353y();
    }

    @Override // kotlin.ranges.f7l8
    @InterfaceC7396q
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public Integer zy() {
        return Integer.valueOf(m23353y());
    }

    @Override // kotlin.ranges.ki
    @InterfaceC7396q
    /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
    public Integer mo23287g() {
        if (m23353y() != Integer.MAX_VALUE) {
            return Integer.valueOf(m23353y() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // kotlin.ranges.C6349p
    @InterfaceC7396q
    public String toString() {
        return f7l8() + ".." + m23353y();
    }

    public boolean x2(int i2) {
        return f7l8() <= i2 && i2 <= m23353y();
    }
}
