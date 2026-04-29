package kotlin.ranges;

import kotlin.i9jn;
import kotlin.jvm.internal.d2ok;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class zy extends C6345k implements f7l8<Character>, ki<Character> {

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    public static final C6359k f36565y = new C6359k(null);

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private static final zy f36564s = new zy(1, 0);

    /* JADX INFO: renamed from: kotlin.ranges.zy$k */
    /* JADX INFO: compiled from: PrimitiveRanges.kt */
    public static final class C6359k {
        private C6359k() {
        }

        public /* synthetic */ C6359k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final zy m23376k() {
            return zy.f36564s;
        }
    }

    public zy(char c2, char c3) {
        super(c2, c3, 1);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @kotlin.ld6(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @yz(version = "1.9")
    public static /* synthetic */ void n7h() {
    }

    @Override // kotlin.ranges.f7l8
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return x2(((Character) comparable).charValue());
    }

    @Override // kotlin.ranges.C6345k
    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof zy) {
            if (!isEmpty() || !((zy) obj).isEmpty()) {
                zy zyVar = (zy) obj;
                if (f7l8() != zyVar.f7l8() || m23324y() != zyVar.m23324y()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.f7l8
    @InterfaceC7396q
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Character mo2951k() {
        return Character.valueOf(f7l8());
    }

    @Override // kotlin.ranges.C6345k
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (f7l8() * 31) + m23324y();
    }

    @Override // kotlin.ranges.C6345k, kotlin.ranges.f7l8
    public boolean isEmpty() {
        return d2ok.m23076i(f7l8(), m23324y()) > 0;
    }

    @Override // kotlin.ranges.f7l8
    @InterfaceC7396q
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public Character zy() {
        return Character.valueOf(m23324y());
    }

    @Override // kotlin.ranges.ki
    @InterfaceC7396q
    /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
    public Character mo23287g() {
        if (m23324y() != 65535) {
            return Character.valueOf((char) (m23324y() + 1));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // kotlin.ranges.C6345k
    @InterfaceC7396q
    public String toString() {
        return f7l8() + ".." + m23324y();
    }

    public boolean x2(char c2) {
        return d2ok.m23076i(f7l8(), c2) <= 0 && d2ok.m23076i(c2, m23324y()) <= 0;
    }
}
