package kt06;

import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: ResponsiveState.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f82100cdj = 4096;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f82101fn3e = 4098;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f82102fu4 = 8193;

    /* JADX INFO: renamed from: h */
    @Deprecated
    public static final int f37521h = 2;

    /* JADX INFO: renamed from: i */
    public static final int f37522i = 4097;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f82103ki = 8192;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @Deprecated
    public static final int f82104kja0 = 1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f82105ld6 = 1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @Deprecated
    public static final int f82106n7h = 0;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f82107ni7 = 8192;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f82108o1t = 8195;

    /* JADX INFO: renamed from: p */
    public static final int f37523p = 0;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f82109qrj = 3;

    /* JADX INFO: renamed from: s */
    public static final int f37524s = -1;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f82110t8r = 4103;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f82111wvg = 8196;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f82112x2 = 2;

    /* JADX INFO: renamed from: z */
    public static final int f37525z = 8194;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f82113zurt = 4100;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f82114f7l8;

    /* JADX INFO: renamed from: g */
    private int f37526g;

    /* JADX INFO: renamed from: k */
    private volatile int f37527k;

    /* JADX INFO: renamed from: n */
    private int f37528n;

    /* JADX INFO: renamed from: q */
    private int f37529q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private volatile int f82115toq;

    /* JADX INFO: renamed from: y */
    private float f37530y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @Deprecated
    private volatile int f82116zy;

    /* JADX INFO: renamed from: kt06.toq$k */
    /* JADX INFO: compiled from: ResponsiveState.java */
    public static class C6755k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public float f82117f7l8;

        /* JADX INFO: renamed from: g */
        public int f37531g;

        /* JADX INFO: renamed from: k */
        public int f37532k;

        /* JADX INFO: renamed from: n */
        public int f37533n;

        /* JADX INFO: renamed from: q */
        public int f37534q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f82118toq;

        /* JADX INFO: renamed from: y */
        @Deprecated
        public int f37535y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f82119zy;
    }

    public toq() {
        n7h(-1);
        x2(f82110t8r);
        ld6(0);
        m24686h(0);
        cdj(0);
        m24689p(0);
        m24691s(0);
    }

    public void cdj(int i2) {
        this.f37526g = i2;
    }

    public boolean equals(@dd Object obj) {
        if (!(obj instanceof toq)) {
            return false;
        }
        toq toqVar = (toq) obj;
        return this.f82116zy == toqVar.f82116zy && this.f37527k == toqVar.f37527k && this.f37529q == toqVar.f37529q && this.f37528n == toqVar.f37528n;
    }

    public int f7l8() {
        return this.f82114f7l8;
    }

    /* JADX INFO: renamed from: g */
    public float m24685g() {
        return this.f37530y;
    }

    /* JADX INFO: renamed from: h */
    public void m24686h(int i2) {
        this.f82114f7l8 = i2;
    }

    /* JADX INFO: renamed from: k */
    public int m24687k() {
        return this.f37528n;
    }

    public void ki(C6753n c6753n) {
        c6753n.f37516k = m24688n();
        c6753n.f82096toq = zy();
        c6753n.f82097zy = m24690q();
        c6753n.f37518q = m24692y();
        c6753n.f37517n = f7l8();
        c6753n.f37515g = toq();
        c6753n.f82095f7l8 = m24687k();
    }

    public void kja0(float f2) {
        this.f37530y = f2;
    }

    @Deprecated
    public void ld6(int i2) {
        this.f82116zy = i2;
    }

    /* JADX INFO: renamed from: n */
    public int m24688n() {
        return this.f82115toq;
    }

    public void n7h(int i2) {
        this.f82115toq = i2;
    }

    /* JADX INFO: renamed from: p */
    public void m24689p(int i2) {
        this.f37529q = i2;
    }

    /* JADX INFO: renamed from: q */
    public int m24690q() {
        return this.f37527k;
    }

    public void qrj(@dd toq toqVar) {
        if (toqVar != null) {
            this.f82115toq = toqVar.f82115toq;
            this.f37527k = toqVar.f37527k;
            this.f37526g = toqVar.f37526g;
            this.f82114f7l8 = toqVar.f82114f7l8;
            this.f37529q = toqVar.f37529q;
            this.f37528n = toqVar.f37528n;
            this.f82116zy = toqVar.f82116zy;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m24691s(int i2) {
        this.f37528n = i2;
    }

    public void t8r(C6755k c6755k) {
        n7h(c6755k.f37532k);
        x2(c6755k.f82118toq);
        cdj(c6755k.f37533n);
        m24686h(c6755k.f37531g);
        m24689p(c6755k.f82119zy);
        m24691s(c6755k.f37534q);
        kja0(c6755k.f82117f7l8);
        ld6(c6755k.f37535y);
    }

    @lvui
    public String toString() {
        return "ResponsiveState@" + hashCode() + "( type = " + this.f82115toq + ", mode = " + this.f37527k + ", windowDensity " + this.f37530y + ", wWidthDp " + this.f37526g + ", wHeightDp " + this.f82114f7l8 + ", wWidth " + this.f37529q + ", wHeight " + this.f37528n + " )";
    }

    public int toq() {
        return this.f37529q;
    }

    public void x2(int i2) {
        this.f37527k = i2;
    }

    /* JADX INFO: renamed from: y */
    public int m24692y() {
        return this.f37526g;
    }

    @Deprecated
    public int zy() {
        return this.f82116zy;
    }
}
