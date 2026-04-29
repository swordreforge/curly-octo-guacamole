package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0263g;
import androidx.constraintlayout.core.C0296n;
import androidx.constraintlayout.core.C0307s;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.analyzer.C0330n;
import androidx.constraintlayout.core.widgets.analyzer.toq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.g */
/* JADX INFO: compiled from: ConstraintWidgetContainer.java */
/* JADX INFO: loaded from: classes.dex */
public class C0339g extends kja0 {

    /* JADX INFO: renamed from: kiv, reason: collision with root package name */
    static final boolean f47777kiv = false;

    /* JADX INFO: renamed from: nnh, reason: collision with root package name */
    private static final boolean f47778nnh = false;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static final int f47779ra = 8;

    /* JADX INFO: renamed from: uf, reason: collision with root package name */
    private static final boolean f47780uf = false;

    /* JADX INFO: renamed from: z4t, reason: collision with root package name */
    static int f47781z4t;

    /* JADX INFO: renamed from: a5id, reason: collision with root package name */
    public int f47782a5id;

    /* JADX INFO: renamed from: b8, reason: collision with root package name */
    private int f47783b8;

    /* JADX INFO: renamed from: b9ub, reason: collision with root package name */
    public int f47784b9ub;

    /* JADX INFO: renamed from: bap7, reason: collision with root package name */
    public C0263g f47785bap7;

    /* JADX INFO: renamed from: cnbm, reason: collision with root package name */
    public int f47786cnbm;

    /* JADX INFO: renamed from: dxef, reason: collision with root package name */
    int f47787dxef;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    int f47788e5;

    /* JADX INFO: renamed from: ew, reason: collision with root package name */
    private boolean f47789ew;

    /* JADX INFO: renamed from: ga, reason: collision with root package name */
    int f47790ga;

    /* JADX INFO: renamed from: gcp, reason: collision with root package name */
    zy[] f47791gcp;

    /* JADX INFO: renamed from: h4b, reason: collision with root package name */
    protected C0296n f47792h4b;

    /* JADX INFO: renamed from: ix, reason: collision with root package name */
    int f47793ix;

    /* JADX INFO: renamed from: kx3, reason: collision with root package name */
    private WeakReference<C0343q> f47794kx3;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private boolean f47795lh;

    /* JADX INFO: renamed from: lw, reason: collision with root package name */
    zy[] f47796lw;

    /* JADX INFO: renamed from: m2t, reason: collision with root package name */
    private WeakReference<C0343q> f47797m2t;

    /* JADX INFO: renamed from: m58i, reason: collision with root package name */
    public boolean f47798m58i;

    /* JADX INFO: renamed from: n2t, reason: collision with root package name */
    public C0330n f47799n2t;

    /* JADX INFO: renamed from: ngy, reason: collision with root package name */
    protected toq.InterfaceC7855toq f47800ngy;

    /* JADX INFO: renamed from: nme, reason: collision with root package name */
    public boolean f47801nme;

    /* JADX INFO: renamed from: o05, reason: collision with root package name */
    public boolean f47802o05;

    /* JADX INFO: renamed from: oki, reason: collision with root package name */
    public boolean f47803oki;

    /* JADX INFO: renamed from: pjz9, reason: collision with root package name */
    private int f47804pjz9;

    /* JADX INFO: renamed from: ps, reason: collision with root package name */
    HashSet<C0341n> f47805ps;

    /* JADX INFO: renamed from: r25n, reason: collision with root package name */
    private boolean f47806r25n;

    /* JADX INFO: renamed from: u38j, reason: collision with root package name */
    private WeakReference<C0343q> f47807u38j;

    /* JADX INFO: renamed from: v5yj, reason: collision with root package name */
    public toq.C0335k f47808v5yj;

    /* JADX INFO: renamed from: vy, reason: collision with root package name */
    public int f47809vy;

    /* JADX INFO: renamed from: w */
    private WeakReference<C0343q> f2031w;

    /* JADX INFO: renamed from: wlev, reason: collision with root package name */
    int f47810wlev;

    /* JADX INFO: renamed from: zwy, reason: collision with root package name */
    androidx.constraintlayout.core.widgets.analyzer.toq f47811zwy;

    public C0339g() {
        this.f47811zwy = new androidx.constraintlayout.core.widgets.analyzer.toq(this);
        this.f47799n2t = new C0330n(this);
        this.f47800ngy = null;
        this.f47795lh = false;
        this.f47792h4b = new C0296n();
        this.f47809vy = 0;
        this.f47782a5id = 0;
        this.f47796lw = new zy[4];
        this.f47791gcp = new zy[4];
        this.f47803oki = false;
        this.f47802o05 = false;
        this.f47798m58i = false;
        this.f47786cnbm = 0;
        this.f47784b9ub = 0;
        this.f47783b8 = 257;
        this.f47801nme = false;
        this.f47806r25n = false;
        this.f47789ew = false;
        this.f47793ix = 0;
        this.f47794kx3 = null;
        this.f2031w = null;
        this.f47797m2t = null;
        this.f47807u38j = null;
        this.f47805ps = new HashSet<>();
        this.f47808v5yj = new toq.C0335k();
    }

    private void el(C0343q c0343q, C0307s c0307s) {
        this.f47792h4b.m1124s(c0307s, this.f47792h4b.fn3e(c0343q), 0, 5);
    }

    private void g0ad(C0341n c0341n) {
        int i2 = this.f47782a5id + 1;
        zy[] zyVarArr = this.f47796lw;
        if (i2 >= zyVarArr.length) {
            this.f47796lw = (zy[]) Arrays.copyOf(zyVarArr, zyVarArr.length * 2);
        }
        this.f47796lw[this.f47782a5id] = new zy(c0341n, 1, xblq());
        this.f47782a5id++;
    }

    private void lk() {
        this.f47809vy = 0;
        this.f47782a5id = 0;
    }

    public static boolean mi1u(int i2, C0341n c0341n, toq.InterfaceC7855toq interfaceC7855toq, toq.C0335k c0335k, int i3) {
        int i4;
        int i5;
        if (interfaceC7855toq == null) {
            return false;
        }
        if (c0341n.a98o() == 8 || (c0341n instanceof C0345y) || (c0341n instanceof C0340k)) {
            c0335k.f2012n = 0;
            c0335k.f2010g = 0;
            return false;
        }
        c0335k.f2011k = c0341n.gvn7();
        c0335k.f47725toq = c0341n.bf2();
        c0335k.f47726zy = c0341n.m1313a();
        c0335k.f2014q = c0341n.jk();
        c0335k.f2015s = false;
        c0335k.f2013p = i3;
        C0341n.toq toqVar = c0335k.f2011k;
        C0341n.toq toqVar2 = C0341n.toq.MATCH_CONSTRAINT;
        boolean z2 = toqVar == toqVar2;
        boolean z3 = c0335k.f47725toq == toqVar2;
        boolean z5 = z2 && c0341n.f47875ek5k > 0.0f;
        boolean z6 = z3 && c0341n.f47875ek5k > 0.0f;
        if (z2 && c0341n.lv5(0) && c0341n.f47906ni7 == 0 && !z5) {
            c0335k.f2011k = C0341n.toq.WRAP_CONTENT;
            if (z3 && c0341n.f47881fu4 == 0) {
                c0335k.f2011k = C0341n.toq.FIXED;
            }
            z2 = false;
        }
        if (z3 && c0341n.lv5(1) && c0341n.f47881fu4 == 0 && !z6) {
            c0335k.f47725toq = C0341n.toq.WRAP_CONTENT;
            if (z2 && c0341n.f47906ni7 == 0) {
                c0335k.f47725toq = C0341n.toq.FIXED;
            }
            z3 = false;
        }
        if (c0341n.fnq8()) {
            c0335k.f2011k = C0341n.toq.FIXED;
            z2 = false;
        }
        if (c0341n.qo()) {
            c0335k.f47725toq = C0341n.toq.FIXED;
            z3 = false;
        }
        if (z5) {
            if (c0341n.f2064z[0] == 4) {
                c0335k.f2011k = C0341n.toq.FIXED;
            } else if (!z3) {
                C0341n.toq toqVar3 = c0335k.f47725toq;
                C0341n.toq toqVar4 = C0341n.toq.FIXED;
                if (toqVar3 == toqVar4) {
                    i5 = c0335k.f2014q;
                } else {
                    c0335k.f2011k = C0341n.toq.WRAP_CONTENT;
                    interfaceC7855toq.toq(c0341n, c0335k);
                    i5 = c0335k.f2010g;
                }
                c0335k.f2011k = toqVar4;
                c0335k.f47726zy = (int) (c0341n.wvg() * i5);
            }
        }
        if (z6) {
            if (c0341n.f2064z[1] == 4) {
                c0335k.f47725toq = C0341n.toq.FIXED;
            } else if (!z2) {
                C0341n.toq toqVar5 = c0335k.f2011k;
                C0341n.toq toqVar6 = C0341n.toq.FIXED;
                if (toqVar5 == toqVar6) {
                    i4 = c0335k.f47726zy;
                } else {
                    c0335k.f47725toq = C0341n.toq.WRAP_CONTENT;
                    interfaceC7855toq.toq(c0341n, c0335k);
                    i4 = c0335k.f2012n;
                }
                c0335k.f47725toq = toqVar6;
                if (c0341n.m1327t() == -1) {
                    c0335k.f2014q = (int) (i4 / c0341n.wvg());
                } else {
                    c0335k.f2014q = (int) (c0341n.wvg() * i4);
                }
            }
        }
        interfaceC7855toq.toq(c0341n, c0335k);
        c0341n.m2t(c0335k.f2012n);
        c0341n.pc(c0335k.f2010g);
        c0341n.ebn(c0335k.f2016y);
        c0341n.bz2(c0335k.f47724f7l8);
        c0335k.f2013p = toq.C0335k.f47721ld6;
        return c0335k.f2015s;
    }

    private void r6ty(C0341n c0341n) {
        int i2 = this.f47809vy + 1;
        zy[] zyVarArr = this.f47791gcp;
        if (i2 >= zyVarArr.length) {
            this.f47791gcp = (zy[]) Arrays.copyOf(zyVarArr, zyVarArr.length * 2);
        }
        this.f47791gcp[this.f47809vy] = new zy(c0341n, 0, xblq());
        this.f47809vy++;
    }

    private void wt(C0343q c0343q, C0307s c0307s) {
        this.f47792h4b.m1124s(this.f47792h4b.fn3e(c0343q), c0307s, 0, 5);
    }

    public void ab(int i2) {
        this.f47804pjz9 = i2;
    }

    void bqie(C0343q c0343q) {
        WeakReference<C0343q> weakReference = this.f47794kx3;
        if (weakReference == null || weakReference.get() == null || c0343q.m1334g() > this.f47794kx3.get().m1334g()) {
            this.f47794kx3 = new WeakReference<>(c0343q);
        }
    }

    public ArrayList<C0345y> btvn() {
        ArrayList<C0345y> arrayList = new ArrayList<>();
        int size = this.f47822nsb.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0341n c0341n = this.f47822nsb.get(i2);
            if (c0341n instanceof C0345y) {
                C0345y c0345y = (C0345y) c0341n;
                if (c0345y.ec() == 0) {
                    arrayList.add(c0345y);
                }
            }
        }
        return arrayList;
    }

    public void c25(boolean z2) {
        this.f47795lh = z2;
    }

    public ArrayList<C0345y> cn02() {
        ArrayList<C0345y> arrayList = new ArrayList<>();
        int size = this.f47822nsb.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0341n c0341n = this.f47822nsb.get(i2);
            if (c0341n instanceof C0345y) {
                C0345y c0345y = (C0345y) c0341n;
                if (c0345y.ec() == 1) {
                    arrayList.add(c0345y);
                }
            }
        }
        return arrayList;
    }

    public boolean cyoe(C0296n c0296n) {
        boolean zVwb = vwb(64);
        f7l8(c0296n, zVwb);
        int size = this.f47822nsb.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0341n c0341n = this.f47822nsb.get(i2);
            c0341n.bap7(0, false);
            c0341n.bap7(1, false);
            if (c0341n instanceof C0340k) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                C0341n c0341n2 = this.f47822nsb.get(i3);
                if (c0341n2 instanceof C0340k) {
                    ((C0340k) c0341n2).r6ty();
                }
            }
        }
        this.f47805ps.clear();
        for (int i4 = 0; i4 < size; i4++) {
            C0341n c0341n3 = this.f47822nsb.get(i4);
            if (c0341n3.m1319g()) {
                if (c0341n3 instanceof n7h) {
                    this.f47805ps.add(c0341n3);
                } else {
                    c0341n3.f7l8(c0296n, zVwb);
                }
            }
        }
        while (this.f47805ps.size() > 0) {
            int size2 = this.f47805ps.size();
            Iterator<C0341n> it = this.f47805ps.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                n7h n7hVar = (n7h) it.next();
                if (n7hVar.yw(this.f47805ps)) {
                    n7hVar.f7l8(c0296n, zVwb);
                    this.f47805ps.remove(n7hVar);
                    break;
                }
            }
            if (size2 == this.f47805ps.size()) {
                Iterator<C0341n> it2 = this.f47805ps.iterator();
                while (it2.hasNext()) {
                    it2.next().f7l8(c0296n, zVwb);
                }
                this.f47805ps.clear();
            }
        }
        if (C0296n.f47572zurt) {
            HashSet<C0341n> hashSet = new HashSet<>();
            for (int i5 = 0; i5 < size; i5++) {
                C0341n c0341n4 = this.f47822nsb.get(i5);
                if (!c0341n4.m1319g()) {
                    hashSet.add(c0341n4);
                }
            }
            m1324n(this, c0296n, hashSet, gvn7() == C0341n.toq.WRAP_CONTENT ? 0 : 1, false);
            for (C0341n c0341n5 : hashSet) {
                ld6.m1308k(this, c0296n, c0341n5);
                c0341n5.f7l8(c0296n, zVwb);
            }
        } else {
            for (int i6 = 0; i6 < size; i6++) {
                C0341n c0341n6 = this.f47822nsb.get(i6);
                if (c0341n6 instanceof C0339g) {
                    C0341n.toq[] toqVarArr = c0341n6.f47886hb;
                    C0341n.toq toqVar = toqVarArr[0];
                    C0341n.toq toqVar2 = toqVarArr[1];
                    C0341n.toq toqVar3 = C0341n.toq.WRAP_CONTENT;
                    if (toqVar == toqVar3) {
                        c0341n6.pjz9(C0341n.toq.FIXED);
                    }
                    if (toqVar2 == toqVar3) {
                        c0341n6.ew(C0341n.toq.FIXED);
                    }
                    c0341n6.f7l8(c0296n, zVwb);
                    if (toqVar == toqVar3) {
                        c0341n6.pjz9(toqVar);
                    }
                    if (toqVar2 == toqVar3) {
                        c0341n6.ew(toqVar2);
                    }
                } else {
                    ld6.m1308k(this, c0296n, c0341n6);
                    if (!c0341n6.m1319g()) {
                        c0341n6.f7l8(c0296n, zVwb);
                    }
                }
            }
        }
        if (this.f47809vy > 0) {
            toq.toq(this, c0296n, null, 0);
        }
        if (this.f47782a5id > 0) {
            toq.toq(this, c0296n, null, 1);
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    public String ek5k() {
        return "ConstraintLayout";
    }

    public void exv8() {
        this.f47799n2t.kja0();
    }

    public void f1bi() {
        this.f47799n2t.m1277g(gvn7(), bf2());
    }

    public void f3f() {
        this.f47811zwy.m1289n(this);
    }

    public void gb(C0263g c0263g) {
        this.f47785bap7 = c0263g;
        this.f47792h4b.fti(c0263g);
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    public void hb(StringBuilder sb) {
        sb.append(this.f47894kja0 + ":{\n");
        sb.append("  actualWidth:" + this.f2054o);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f2052m);
        sb.append("\n");
        Iterator<C0341n> it = bih().iterator();
        while (it.hasNext()) {
            it.next().hb(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public boolean hyow() {
        return this.f47789ew;
    }

    void imd(C0343q c0343q) {
        WeakReference<C0343q> weakReference = this.f47797m2t;
        if (weakReference == null || weakReference.get() == null || c0343q.m1334g() > this.f47797m2t.get().m1334g()) {
            this.f47797m2t = new WeakReference<>(c0343q);
        }
    }

    public boolean kbj(boolean z2, int i2) {
        return this.f47799n2t.m1280s(z2, i2);
    }

    public toq.InterfaceC7855toq kq2f() {
        return this.f47800ngy;
    }

    void l05(C0341n c0341n, int i2) {
        if (i2 == 0) {
            r6ty(c0341n);
        } else if (i2 == 1) {
            g0ad(c0341n);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.kja0, androidx.constraintlayout.core.widgets.C0341n
    public void ltg8() {
        this.f47792h4b.vyq();
        this.f47810wlev = 0;
        this.f47788e5 = 0;
        this.f47790ga = 0;
        this.f47787dxef = 0;
        this.f47801nme = false;
        super.ltg8();
    }

    public C0296n mj() {
        return this.f47792h4b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0314 A[PHI: r2 r16
      0x0314: PHI (r2v15 ??) = (r2v14 ??), (r2v19 ??), (r2v19 ??), (r2v19 ??) binds: [B:142:0x02d5, B:150:0x02fa, B:151:0x02fc, B:153:0x0302] A[DONT_GENERATE, DONT_INLINE]
      0x0314: PHI (r16v4 boolean) = (r16v3 boolean), (r16v5 boolean), (r16v5 boolean), (r16v5 boolean) binds: [B:142:0x02d5, B:150:0x02fa, B:151:0x02fc, B:153:0x0302] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // androidx.constraintlayout.core.widgets.kja0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o5() {
        /*
            Method dump skipped, instruction units count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C0339g.o5():void");
    }

    public boolean ob(boolean z2) {
        return this.f47799n2t.m1281y(z2);
    }

    public boolean ovdh() {
        return false;
    }

    public boolean pnt2() {
        return this.f47806r25n;
    }

    public void qh4d() {
        this.f47799n2t.m1278h();
    }

    public boolean tjz5(C0296n c0296n, boolean[] zArr) {
        zArr[2] = false;
        boolean zVwb = vwb(64);
        kiv(c0296n, zVwb);
        int size = this.f47822nsb.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0341n c0341n = this.f47822nsb.get(i2);
            c0341n.kiv(c0296n, zVwb);
            if (c0341n.m1328u()) {
                z2 = true;
            }
        }
        return z2;
    }

    public boolean tww7(boolean z2) {
        return this.f47799n2t.f7l8(z2);
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    public void uf(boolean z2, boolean z3) {
        super.uf(z2, z3);
        int size = this.f47822nsb.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f47822nsb.get(i2).uf(z2, z3);
        }
    }

    public boolean vwb(int i2) {
        return (this.f47783b8 & i2) == i2;
    }

    public void wtop(int i2, int i3, int i4, int i5) {
        this.f47810wlev = i2;
        this.f47790ga = i3;
        this.f47788e5 = i4;
        this.f47787dxef = i5;
    }

    public boolean xblq() {
        return this.f47795lh;
    }

    public int xm() {
        return this.f47783b8;
    }

    public long xtb7(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f47810wlev = i9;
        this.f47790ga = i10;
        return this.f47811zwy.m1290q(this, i2, i9, i10, i3, i4, i5, i6, i7, i8);
    }

    public void xzl(int i2) {
        this.f47783b8 = i2;
        C0296n.f47572zurt = vwb(512);
    }

    public void yp31(C0343q c0343q) {
        WeakReference<C0343q> weakReference = this.f47807u38j;
        if (weakReference == null || weakReference.get() == null || c0343q.m1334g() > this.f47807u38j.get().m1334g()) {
            this.f47807u38j = new WeakReference<>(c0343q);
        }
    }

    public void z617(toq.InterfaceC7855toq interfaceC7855toq) {
        this.f47800ngy = interfaceC7855toq;
        this.f47799n2t.fn3e(interfaceC7855toq);
    }

    public void zff0(C0343q c0343q) {
        WeakReference<C0343q> weakReference = this.f2031w;
        if (weakReference == null || weakReference.get() == null || c0343q.m1334g() > this.f2031w.get().m1334g()) {
            this.f2031w = new WeakReference<>(c0343q);
        }
    }

    public C0339g(int i2, int i3, int i4, int i5) {
        super(i2, i3, i4, i5);
        this.f47811zwy = new androidx.constraintlayout.core.widgets.analyzer.toq(this);
        this.f47799n2t = new C0330n(this);
        this.f47800ngy = null;
        this.f47795lh = false;
        this.f47792h4b = new C0296n();
        this.f47809vy = 0;
        this.f47782a5id = 0;
        this.f47796lw = new zy[4];
        this.f47791gcp = new zy[4];
        this.f47803oki = false;
        this.f47802o05 = false;
        this.f47798m58i = false;
        this.f47786cnbm = 0;
        this.f47784b9ub = 0;
        this.f47783b8 = 257;
        this.f47801nme = false;
        this.f47806r25n = false;
        this.f47789ew = false;
        this.f47793ix = 0;
        this.f47794kx3 = null;
        this.f2031w = null;
        this.f47797m2t = null;
        this.f47807u38j = null;
        this.f47805ps = new HashSet<>();
        this.f47808v5yj = new toq.C0335k();
    }

    public C0339g(int i2, int i3) {
        super(i2, i3);
        this.f47811zwy = new androidx.constraintlayout.core.widgets.analyzer.toq(this);
        this.f47799n2t = new C0330n(this);
        this.f47800ngy = null;
        this.f47795lh = false;
        this.f47792h4b = new C0296n();
        this.f47809vy = 0;
        this.f47782a5id = 0;
        this.f47796lw = new zy[4];
        this.f47791gcp = new zy[4];
        this.f47803oki = false;
        this.f47802o05 = false;
        this.f47798m58i = false;
        this.f47786cnbm = 0;
        this.f47784b9ub = 0;
        this.f47783b8 = 257;
        this.f47801nme = false;
        this.f47806r25n = false;
        this.f47789ew = false;
        this.f47793ix = 0;
        this.f47794kx3 = null;
        this.f2031w = null;
        this.f47797m2t = null;
        this.f47807u38j = null;
        this.f47805ps = new HashSet<>();
        this.f47808v5yj = new toq.C0335k();
    }

    public C0339g(String str, int i2, int i3) {
        super(i2, i3);
        this.f47811zwy = new androidx.constraintlayout.core.widgets.analyzer.toq(this);
        this.f47799n2t = new C0330n(this);
        this.f47800ngy = null;
        this.f47795lh = false;
        this.f47792h4b = new C0296n();
        this.f47809vy = 0;
        this.f47782a5id = 0;
        this.f47796lw = new zy[4];
        this.f47791gcp = new zy[4];
        this.f47803oki = false;
        this.f47802o05 = false;
        this.f47798m58i = false;
        this.f47786cnbm = 0;
        this.f47784b9ub = 0;
        this.f47783b8 = 257;
        this.f47801nme = false;
        this.f47806r25n = false;
        this.f47789ew = false;
        this.f47793ix = 0;
        this.f47794kx3 = null;
        this.f2031w = null;
        this.f47797m2t = null;
        this.f47807u38j = null;
        this.f47805ps = new HashSet<>();
        this.f47808v5yj = new toq.C0335k();
        ktq(str);
    }
}
