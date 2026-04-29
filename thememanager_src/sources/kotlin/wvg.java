package kotlin;

import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: KotlinVersion.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.1")
public final class wvg implements Comparable<wvg> {

    /* JADX INFO: renamed from: s */
    public static final int f36765s = 255;

    /* JADX INFO: renamed from: g */
    private final int f36767g;

    /* JADX INFO: renamed from: k */
    private final int f36768k;

    /* JADX INFO: renamed from: n */
    private final int f36769n;

    /* JADX INFO: renamed from: q */
    private final int f36770q;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    public static final C6477k f36766y = new C6477k(null);

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final wvg f36764p = C6426t.m23502k();

    /* JADX INFO: renamed from: kotlin.wvg$k */
    /* JADX INFO: compiled from: KotlinVersion.kt */
    public static final class C6477k {
        private C6477k() {
        }

        public /* synthetic */ C6477k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }
    }

    public wvg(int i2, int i3, int i4) {
        this.f36768k = i2;
        this.f36770q = i3;
        this.f36769n = i4;
        this.f36767g = m23799p(i2, i3, i4);
    }

    /* JADX INFO: renamed from: p */
    private final int m23799p(int i2, int i3, int i4) {
        boolean z2 = false;
        if (new kotlin.ranges.x2(0, 255).x2(i2) && new kotlin.ranges.x2(0, 255).x2(i3) && new kotlin.ranges.x2(0, 255).x2(i4)) {
            z2 = true;
        }
        if (z2) {
            return (i2 << 16) + (i3 << 8) + i4;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i2 + '.' + i3 + '.' + i4).toString());
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        wvg wvgVar = obj instanceof wvg ? (wvg) obj : null;
        return wvgVar != null && this.f36767g == wvgVar.f36767g;
    }

    public final boolean f7l8(int i2, int i3) {
        int i4 = this.f36768k;
        return i4 > i2 || (i4 == i2 && this.f36770q >= i3);
    }

    public int hashCode() {
        return this.f36767g;
    }

    /* JADX INFO: renamed from: n */
    public final int m23800n() {
        return this.f36769n;
    }

    /* JADX INFO: renamed from: q */
    public final int m23801q() {
        return this.f36770q;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m23802s(int i2, int i3, int i4) {
        int i5;
        int i6 = this.f36768k;
        return i6 > i2 || (i6 == i2 && ((i5 = this.f36770q) > i3 || (i5 == i3 && this.f36769n >= i4)));
    }

    @InterfaceC7396q
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f36768k);
        sb.append('.');
        sb.append(this.f36770q);
        sb.append('.');
        sb.append(this.f36769n);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public int compareTo(@InterfaceC7396q wvg other) {
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        return this.f36767g - other.f36767g;
    }

    public final int zy() {
        return this.f36768k;
    }

    public wvg(int i2, int i3) {
        this(i2, i3, 0);
    }
}
