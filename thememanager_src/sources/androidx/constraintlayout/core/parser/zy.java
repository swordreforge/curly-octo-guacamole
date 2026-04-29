package androidx.constraintlayout.core.parser;

import com.xiaomi.mipush.sdk.C5658n;

/* JADX INFO: compiled from: CLElement.java */
/* JADX INFO: loaded from: classes.dex */
public class zy {

    /* JADX INFO: renamed from: p */
    protected static int f1841p = 2;

    /* JADX INFO: renamed from: s */
    protected static int f1842s = 80;

    /* JADX INFO: renamed from: g */
    protected toq f1843g;

    /* JADX INFO: renamed from: k */
    private final char[] f1844k;

    /* JADX INFO: renamed from: y */
    private int f1847y;

    /* JADX INFO: renamed from: q */
    protected long f1846q = -1;

    /* JADX INFO: renamed from: n */
    protected long f1845n = Long.MAX_VALUE;

    public zy(char[] cArr) {
        this.f1844k = cArr;
    }

    public void cdj(int i2) {
        this.f1847y = i2;
    }

    public float f7l8() {
        if (this instanceof C0301n) {
            return ((C0301n) this).f7l8();
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: g */
    public long m1144g() {
        return this.f1845n;
    }

    /* JADX INFO: renamed from: h */
    public void m1145h(long j2) {
        if (this.f1845n != Long.MAX_VALUE) {
            return;
        }
        this.f1845n = j2;
        if (f7l8.f1824q) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        toq toqVar = this.f1843g;
        if (toqVar != null) {
            toqVar.fn3e(this);
        }
    }

    /* JADX INFO: renamed from: i */
    protected String mo1134i() {
        return "";
    }

    /* JADX INFO: renamed from: k */
    protected void m1146k(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(' ');
        }
    }

    public void ki(long j2) {
        this.f1846q = j2;
    }

    public void kja0(toq toqVar) {
        this.f1843g = toqVar;
    }

    protected String ld6() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    /* JADX INFO: renamed from: n */
    protected String m1147n() {
        if (!f7l8.f1824q) {
            return "";
        }
        return ld6() + " -> ";
    }

    public boolean n7h() {
        return this.f1846q == -1;
    }

    /* JADX INFO: renamed from: p */
    public long m1148p() {
        return this.f1846q;
    }

    public boolean qrj() {
        return this.f1846q > -1;
    }

    /* JADX INFO: renamed from: s */
    public int m1149s() {
        return this.f1847y;
    }

    protected String t8r(int i2, int i3) {
        return "";
    }

    public String toString() {
        long j2 = this.f1846q;
        long j3 = this.f1845n;
        if (j2 > j3 || j3 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.f1846q + C5658n.f73185t8r + this.f1845n + ")";
        }
        return ld6() + " (" + this.f1846q + " : " + this.f1845n + ") <<" + new String(this.f1844k).substring((int) this.f1846q, ((int) this.f1845n) + 1) + ">>";
    }

    public String toq() {
        String str = new String(this.f1844k);
        long j2 = this.f1845n;
        if (j2 != Long.MAX_VALUE) {
            long j3 = this.f1846q;
            if (j2 >= j3) {
                return str.substring((int) j3, ((int) j2) + 1);
            }
        }
        long j4 = this.f1846q;
        return str.substring((int) j4, ((int) j4) + 1);
    }

    public boolean x2() {
        return this.f1845n != Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: y */
    public int mo1135y() {
        if (this instanceof C0301n) {
            return ((C0301n) this).mo1135y();
        }
        return 0;
    }

    public zy zy() {
        return this.f1843g;
    }
}
