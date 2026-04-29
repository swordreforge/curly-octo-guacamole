package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.C0341n;

/* JADX INFO: compiled from: Dimension.java */
/* JADX INFO: loaded from: classes.dex */
public class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    Object f47680f7l8;

    /* JADX INFO: renamed from: g */
    String f1936g;

    /* JADX INFO: renamed from: k */
    private final int f1937k;

    /* JADX INFO: renamed from: n */
    int f1938n;

    /* JADX INFO: renamed from: q */
    float f1939q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    int f47681toq;

    /* JADX INFO: renamed from: y */
    boolean f1940y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    int f47682zy;

    /* JADX INFO: renamed from: s */
    public static final Object f1935s = new Object();

    /* JADX INFO: renamed from: p */
    public static final Object f1934p = new Object();

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final Object f47676ld6 = new Object();

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final Object f47679x2 = new Object();

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final Object f47678qrj = new Object();

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final Object f47677n7h = new Object();

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.toq$k */
    /* JADX INFO: compiled from: Dimension.java */
    public enum EnumC0323k {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    private toq() {
        this.f1937k = -2;
        this.f47681toq = 0;
        this.f47682zy = Integer.MAX_VALUE;
        this.f1939q = 1.0f;
        this.f1938n = 0;
        this.f1936g = null;
        this.f47680f7l8 = f1934p;
        this.f1940y = false;
    }

    public static toq f7l8(int i2) {
        toq toqVar = new toq();
        toqVar.zurt(i2);
        return toqVar;
    }

    /* JADX INFO: renamed from: g */
    public static toq m1225g() {
        return new toq(f47676ld6);
    }

    /* JADX INFO: renamed from: k */
    public static toq m1226k(int i2) {
        toq toqVar = new toq(f1935s);
        toqVar.x2(i2);
        return toqVar;
    }

    /* JADX INFO: renamed from: n */
    public static toq m1227n(String str) {
        toq toqVar = new toq(f47677n7h);
        toqVar.m1232i(str);
        return toqVar;
    }

    /* JADX INFO: renamed from: q */
    public static toq m1228q(Object obj, float f2) {
        toq toqVar = new toq(f47678qrj);
        toqVar.t8r(obj, f2);
        return toqVar;
    }

    /* JADX INFO: renamed from: s */
    public static toq m1229s() {
        return new toq(f1934p);
    }

    public static toq toq(Object obj) {
        toq toqVar = new toq(f1935s);
        toqVar.qrj(obj);
        return toqVar;
    }

    /* JADX INFO: renamed from: y */
    public static toq m1230y(Object obj) {
        toq toqVar = new toq();
        toqVar.ni7(obj);
        return toqVar;
    }

    public static toq zy() {
        return new toq(f47679x2);
    }

    public toq cdj(int i2) {
        if (i2 >= 0) {
            this.f47681toq = i2;
        }
        return this;
    }

    void fn3e(int i2) {
        this.f1940y = false;
        this.f47680f7l8 = null;
        this.f1938n = i2;
    }

    /* JADX INFO: renamed from: h */
    public toq m1231h(Object obj) {
        Object obj2 = f1934p;
        if (obj == obj2 && this.f1940y) {
            this.f47680f7l8 = obj2;
            this.f47682zy = Integer.MAX_VALUE;
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public toq m1232i(String str) {
        this.f1936g = str;
        return this;
    }

    public toq ki(Object obj) {
        if (obj == f1934p) {
            this.f47681toq = -2;
        }
        return this;
    }

    public toq kja0(int i2) {
        if (this.f47682zy >= 0) {
            this.f47682zy = i2;
        }
        return this;
    }

    public boolean ld6(int i2) {
        return this.f47680f7l8 == null && this.f1938n == i2;
    }

    int n7h() {
        return this.f1938n;
    }

    public toq ni7(Object obj) {
        this.f47680f7l8 = obj;
        this.f1940y = true;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public void m1233p(C0324y c0324y, C0341n c0341n, int i2) {
        String str = this.f1936g;
        if (str != null) {
            c0341n.h7am(str);
        }
        int i3 = 2;
        if (i2 == 0) {
            if (this.f1940y) {
                c0341n.pjz9(C0341n.toq.MATCH_CONSTRAINT);
                Object obj = this.f47680f7l8;
                if (obj == f1934p) {
                    i3 = 1;
                } else if (obj != f47678qrj) {
                    i3 = 0;
                }
                c0341n.ngy(i3, this.f47681toq, this.f47682zy, this.f1939q);
                return;
            }
            int i4 = this.f47681toq;
            if (i4 > 0) {
                c0341n.gcp(i4);
            }
            int i5 = this.f47682zy;
            if (i5 < Integer.MAX_VALUE) {
                c0341n.vy(i5);
            }
            Object obj2 = this.f47680f7l8;
            if (obj2 == f1934p) {
                c0341n.pjz9(C0341n.toq.WRAP_CONTENT);
                return;
            }
            if (obj2 == f47679x2) {
                c0341n.pjz9(C0341n.toq.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    c0341n.pjz9(C0341n.toq.FIXED);
                    c0341n.m2t(this.f1938n);
                    return;
                }
                return;
            }
        }
        if (this.f1940y) {
            c0341n.ew(C0341n.toq.MATCH_CONSTRAINT);
            Object obj3 = this.f47680f7l8;
            if (obj3 == f1934p) {
                i3 = 1;
            } else if (obj3 != f47678qrj) {
                i3 = 0;
            }
            c0341n.ix(i3, this.f47681toq, this.f47682zy, this.f1939q);
            return;
        }
        int i6 = this.f47681toq;
        if (i6 > 0) {
            c0341n.lw(i6);
        }
        int i7 = this.f47682zy;
        if (i7 < Integer.MAX_VALUE) {
            c0341n.dxef(i7);
        }
        Object obj4 = this.f47680f7l8;
        if (obj4 == f1934p) {
            c0341n.ew(C0341n.toq.WRAP_CONTENT);
            return;
        }
        if (obj4 == f47679x2) {
            c0341n.ew(C0341n.toq.MATCH_PARENT);
        } else if (obj4 == null) {
            c0341n.ew(C0341n.toq.FIXED);
            c0341n.pc(this.f1938n);
        }
    }

    public toq qrj(Object obj) {
        this.f47680f7l8 = obj;
        if (obj instanceof Integer) {
            this.f1938n = ((Integer) obj).intValue();
            this.f47680f7l8 = null;
        }
        return this;
    }

    public toq t8r(Object obj, float f2) {
        this.f1939q = f2;
        return this;
    }

    public toq x2(int i2) {
        this.f47680f7l8 = null;
        this.f1938n = i2;
        return this;
    }

    public toq zurt(int i2) {
        this.f1940y = true;
        if (i2 >= 0) {
            this.f47682zy = i2;
        }
        return this;
    }

    private toq(Object obj) {
        this.f1937k = -2;
        this.f47681toq = 0;
        this.f47682zy = Integer.MAX_VALUE;
        this.f1939q = 1.0f;
        this.f1938n = 0;
        this.f1936g = null;
        this.f1940y = false;
        this.f47680f7l8 = obj;
    }
}
