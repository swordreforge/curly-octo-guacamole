package com.airbnb.lottie.model.layer;

import com.airbnb.lottie.model.animatable.C1445p;
import com.airbnb.lottie.model.animatable.ld6;
import com.airbnb.lottie.model.animatable.x2;
import com.airbnb.lottie.model.content.C1452k;
import com.airbnb.lottie.model.content.C1459y;
import com.airbnb.lottie.parser.C1494p;
import com.airbnb.lottie.value.C1515k;
import java.util.List;
import java.util.Locale;
import zy.dd;

/* JADX INFO: renamed from: com.airbnb.lottie.model.layer.n */
/* JADX INFO: compiled from: Layer.java */
/* JADX INFO: loaded from: classes.dex */
public class C1464n {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    @dd
    private final C1445p f56031cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @dd
    private final String f56032f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private final toq f56033fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    @dd
    private final C1494p f56034fu4;

    /* JADX INFO: renamed from: g */
    private final long f8053g;

    /* JADX INFO: renamed from: h */
    private final int f8054h;

    /* JADX INFO: renamed from: i */
    private final List<C1515k<Float>> f8055i;

    /* JADX INFO: renamed from: k */
    private final List<com.airbnb.lottie.model.content.zy> f8056k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @dd
    private final ld6 f56035ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final int f56036kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final int f56037ld6;

    /* JADX INFO: renamed from: n */
    private final k f8057n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final float f56038n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    @dd
    private final C1452k f56039ni7;

    /* JADX INFO: renamed from: p */
    private final int f8058p;

    /* JADX INFO: renamed from: q */
    private final long f8059q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final float f56040qrj;

    /* JADX INFO: renamed from: s */
    private final x2 f8060s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    @dd
    private final com.airbnb.lottie.model.animatable.toq f56041t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final com.airbnb.lottie.ld6 f56042toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final int f56043x2;

    /* JADX INFO: renamed from: y */
    private final List<C1459y> f8061y;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private final boolean f56044zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final String f56045zy;

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.n$k */
    /* JADX INFO: compiled from: Layer.java */
    public enum k {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.n$toq */
    /* JADX INFO: compiled from: Layer.java */
    public enum toq {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public C1464n(List<com.airbnb.lottie.model.content.zy> list, com.airbnb.lottie.ld6 ld6Var, String str, long j2, k kVar, long j3, @dd String str2, List<C1459y> list2, x2 x2Var, int i2, int i3, int i4, float f2, float f3, int i5, int i6, @dd C1445p c1445p, @dd ld6 ld6Var2, List<C1515k<Float>> list3, toq toqVar, @dd com.airbnb.lottie.model.animatable.toq toqVar2, boolean z2, @dd C1452k c1452k, @dd C1494p c1494p) {
        this.f8056k = list;
        this.f56042toq = ld6Var;
        this.f56045zy = str;
        this.f8059q = j2;
        this.f8057n = kVar;
        this.f8053g = j3;
        this.f56032f7l8 = str2;
        this.f8061y = list2;
        this.f8060s = x2Var;
        this.f8058p = i2;
        this.f56037ld6 = i3;
        this.f56043x2 = i4;
        this.f56040qrj = f2;
        this.f56038n7h = f3;
        this.f56036kja0 = i5;
        this.f8054h = i6;
        this.f56031cdj = c1445p;
        this.f56035ki = ld6Var2;
        this.f8055i = list3;
        this.f56033fn3e = toqVar;
        this.f56041t8r = toqVar2;
        this.f56044zurt = z2;
        this.f56039ni7 = c1452k;
        this.f56034fu4 = c1494p;
    }

    int cdj() {
        return this.f8058p;
    }

    List<C1459y> f7l8() {
        return this.f8061y;
    }

    @dd
    com.airbnb.lottie.model.animatable.toq fn3e() {
        return this.f56041t8r;
    }

    public boolean fu4() {
        return this.f56044zurt;
    }

    /* JADX INFO: renamed from: g */
    public k m6065g() {
        return this.f8057n;
    }

    /* JADX INFO: renamed from: h */
    int m6066h() {
        return this.f56037ld6;
    }

    @dd
    /* JADX INFO: renamed from: i */
    ld6 m6067i() {
        return this.f56035ki;
    }

    @dd
    /* JADX INFO: renamed from: k */
    public C1452k m6068k() {
        return this.f56039ni7;
    }

    float ki() {
        return this.f56038n7h / this.f56042toq.m5975n();
    }

    int kja0() {
        return this.f56043x2;
    }

    int ld6() {
        return this.f8054h;
    }

    /* JADX INFO: renamed from: n */
    List<C1515k<Float>> m6069n() {
        return this.f8055i;
    }

    List<com.airbnb.lottie.model.content.zy> n7h() {
        return this.f8056k;
    }

    x2 ni7() {
        return this.f8060s;
    }

    /* JADX INFO: renamed from: p */
    long m6070p() {
        return this.f8053g;
    }

    /* JADX INFO: renamed from: q */
    public long m6071q() {
        return this.f8059q;
    }

    @dd
    String qrj() {
        return this.f56032f7l8;
    }

    /* JADX INFO: renamed from: s */
    String m6072s() {
        return this.f56045zy;
    }

    @dd
    C1445p t8r() {
        return this.f56031cdj;
    }

    public String toString() {
        return m6074z("");
    }

    com.airbnb.lottie.ld6 toq() {
        return this.f56042toq;
    }

    int x2() {
        return this.f56036kja0;
    }

    /* JADX INFO: renamed from: y */
    toq m6073y() {
        return this.f56033fn3e;
    }

    /* JADX INFO: renamed from: z */
    public String m6074z(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(m6072s());
        sb.append("\n");
        C1464n c1464nFu4 = this.f56042toq.fu4(m6070p());
        if (c1464nFu4 != null) {
            sb.append("\t\tParents: ");
            sb.append(c1464nFu4.m6072s());
            C1464n c1464nFu42 = this.f56042toq.fu4(c1464nFu4.m6070p());
            while (c1464nFu42 != null) {
                sb.append("->");
                sb.append(c1464nFu42.m6072s());
                c1464nFu42 = this.f56042toq.fu4(c1464nFu42.m6070p());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!f7l8().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(f7l8().size());
            sb.append("\n");
        }
        if (cdj() != 0 && m6066h() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(cdj()), Integer.valueOf(m6066h()), Integer.valueOf(kja0())));
        }
        if (!this.f8056k.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (com.airbnb.lottie.model.content.zy zyVar : this.f8056k) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(zyVar);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    float zurt() {
        return this.f56040qrj;
    }

    @dd
    public C1494p zy() {
        return this.f56034fu4;
    }
}
