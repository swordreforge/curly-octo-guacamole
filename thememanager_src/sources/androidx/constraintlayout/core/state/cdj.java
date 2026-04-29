package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.C0265g;
import androidx.constraintlayout.core.motion.key.C0269n;
import androidx.constraintlayout.core.motion.key.C0270q;
import androidx.constraintlayout.core.motion.utils.C0284q;
import androidx.constraintlayout.core.motion.utils.fn3e;
import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.constraintlayout.core.widgets.C0339g;
import androidx.constraintlayout.core.widgets.C0341n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: Transition.java */
/* JADX INFO: loaded from: classes.dex */
public class cdj implements zurt {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f47594cdj = 0;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    static final int f47595fn3e = 1;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    static final int f47596fu4 = 4;

    /* JADX INFO: renamed from: i */
    static final int f1876i = 0;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f47597ki = 1;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    static final int f47598ni7 = 3;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    static final int f47599o1t = 6;

    /* JADX INFO: renamed from: t */
    private static final int f1877t = -2;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f47600t8r = 2;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f47601wvg = -1;

    /* JADX INFO: renamed from: z */
    static final int f1878z = 5;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    static final int f47602zurt = 2;

    /* JADX INFO: renamed from: y */
    HashMap<Integer, HashMap<String, C0308k>> f1882y = new HashMap<>();

    /* JADX INFO: renamed from: s */
    private HashMap<String, toq> f1881s = new HashMap<>();

    /* JADX INFO: renamed from: p */
    fn3e f1880p = new fn3e();

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f47604ld6 = 0;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private String f47607x2 = null;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private C0284q f47606qrj = null;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f47605n7h = 0;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private int f47603kja0 = 400;

    /* JADX INFO: renamed from: h */
    private float f1879h = 0.0f;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.cdj$k */
    /* JADX INFO: compiled from: Transition.java */
    static class C0308k {

        /* JADX INFO: renamed from: k */
        int f1883k;

        /* JADX INFO: renamed from: n */
        float f1884n;

        /* JADX INFO: renamed from: q */
        float f1885q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        String f47608toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f47609zy;

        public C0308k(String str, int i2, int i3, float f2, float f3) {
            this.f47608toq = str;
            this.f1883k = i2;
            this.f47609zy = i3;
            this.f1885q = f2;
            this.f1884n = f3;
        }
    }

    /* JADX INFO: compiled from: Transition.java */
    static class toq {

        /* JADX INFO: renamed from: q */
        androidx.constraintlayout.core.motion.zy f1890q;

        /* JADX INFO: renamed from: y */
        androidx.constraintlayout.core.motion.utils.f7l8 f1892y = new androidx.constraintlayout.core.motion.utils.f7l8();

        /* JADX INFO: renamed from: s */
        int f1891s = -1;

        /* JADX INFO: renamed from: p */
        int f1889p = -1;

        /* JADX INFO: renamed from: k */
        ki f1887k = new ki();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        ki f47611toq = new ki();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        ki f47612zy = new ki();

        /* JADX INFO: renamed from: n */
        C0265g f1888n = new C0265g(this.f1887k);

        /* JADX INFO: renamed from: g */
        C0265g f1886g = new C0265g(this.f47611toq);

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        C0265g f47610f7l8 = new C0265g(this.f47612zy);

        public toq() {
            androidx.constraintlayout.core.motion.zy zyVar = new androidx.constraintlayout.core.motion.zy(this.f1888n);
            this.f1890q = zyVar;
            zyVar.m1096e(this.f1888n);
            this.f1890q.uv6(this.f1886g);
        }

        /* JADX INFO: renamed from: g */
        public void m1168g(C0341n c0341n, int i2) {
            if (i2 == 0) {
                this.f1887k.mcp(c0341n);
                this.f1890q.m1096e(this.f1888n);
            } else if (i2 == 1) {
                this.f47611toq.mcp(c0341n);
                this.f1890q.uv6(this.f1886g);
            }
            this.f1889p = -1;
        }

        /* JADX INFO: renamed from: k */
        public ki m1169k(int i2) {
            return i2 == 0 ? this.f1887k : i2 == 1 ? this.f47611toq : this.f47612zy;
        }

        /* JADX INFO: renamed from: n */
        public void m1170n(fn3e fn3eVar) {
            C0269n c0269n = new C0269n();
            fn3eVar.f7l8(c0269n);
            this.f1890q.m1098g(c0269n);
        }

        /* JADX INFO: renamed from: q */
        public void m1171q(fn3e fn3eVar) {
            C0270q c0270q = new C0270q();
            fn3eVar.f7l8(c0270q);
            this.f1890q.m1098g(c0270q);
        }

        public void toq(int i2, int i3, float f2, cdj cdjVar) {
            this.f1891s = i3;
            this.f1889p = i2;
            this.f1890q.m1104o(i2, i3, 1.0f, System.nanoTime());
            ki.n7h(i2, i3, this.f47612zy, this.f1887k, this.f47611toq, cdjVar, f2);
            this.f47612zy.f47665cdj = f2;
            this.f1890q.ncyb(this.f47610f7l8, f2, System.nanoTime(), this.f1892y);
        }

        public void zy(fn3e fn3eVar) {
            androidx.constraintlayout.core.motion.key.zy zyVar = new androidx.constraintlayout.core.motion.key.zy();
            fn3eVar.f7l8(zyVar);
            this.f1890q.m1098g(zyVar);
        }
    }

    public static InterfaceC0321q a9(int i2, final String str) {
        switch (i2) {
            case -1:
                return new InterfaceC0321q() { // from class: androidx.constraintlayout.core.state.s
                    @Override // androidx.constraintlayout.core.state.InterfaceC0321q
                    public final float getInterpolation(float f2) {
                        return cdj.ncyb(str, f2);
                    }
                };
            case 0:
                return new InterfaceC0321q() { // from class: androidx.constraintlayout.core.state.p
                    @Override // androidx.constraintlayout.core.state.InterfaceC0321q
                    public final float getInterpolation(float f2) {
                        return cdj.m1158l(f2);
                    }
                };
            case 1:
                return new InterfaceC0321q() { // from class: androidx.constraintlayout.core.state.ld6
                    @Override // androidx.constraintlayout.core.state.InterfaceC0321q
                    public final float getInterpolation(float f2) {
                        return cdj.n5r1(f2);
                    }
                };
            case 2:
                return new InterfaceC0321q() { // from class: androidx.constraintlayout.core.state.x2
                    @Override // androidx.constraintlayout.core.state.InterfaceC0321q
                    public final float getInterpolation(float f2) {
                        return cdj.hyr(f2);
                    }
                };
            case 3:
                return new InterfaceC0321q() { // from class: androidx.constraintlayout.core.state.qrj
                    @Override // androidx.constraintlayout.core.state.InterfaceC0321q
                    public final float getInterpolation(float f2) {
                        return cdj.m1156f(f2);
                    }
                };
            case 4:
                return new InterfaceC0321q() { // from class: androidx.constraintlayout.core.state.h
                    @Override // androidx.constraintlayout.core.state.InterfaceC0321q
                    public final float getInterpolation(float f2) {
                        return cdj.uv6(f2);
                    }
                };
            case 5:
                return new InterfaceC0321q() { // from class: androidx.constraintlayout.core.state.kja0
                    @Override // androidx.constraintlayout.core.state.InterfaceC0321q
                    public final float getInterpolation(float f2) {
                        return cdj.lrht(f2);
                    }
                };
            case 6:
                return new InterfaceC0321q() { // from class: androidx.constraintlayout.core.state.n7h
                    @Override // androidx.constraintlayout.core.state.InterfaceC0321q
                    public final float getInterpolation(float f2) {
                        return cdj.m1155c(f2);
                    }
                };
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ float m1155c(float f2) {
        return (float) C0284q.zy("anticipate").mo986k(f2);
    }

    private toq d2ok(String str) {
        return this.f1881s.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ float m1156f(float f2) {
        return (float) C0284q.zy("linear").mo986k(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float hyr(float f2) {
        return (float) C0284q.zy("decelerate").mo986k(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ float m1158l(float f2) {
        return (float) C0284q.zy("standard").mo986k(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lrht(float f2) {
        return (float) C0284q.zy("overshoot").mo986k(f2);
    }

    private toq lvui(String str, C0341n c0341n, int i2) {
        toq toqVar = this.f1881s.get(str);
        if (toqVar == null) {
            toqVar = new toq();
            this.f1880p.f7l8(toqVar.f1890q);
            this.f1881s.put(str, toqVar);
            if (c0341n != null) {
                toqVar.m1168g(c0341n, i2);
            }
        }
        return toqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float n5r1(float f2) {
        return (float) C0284q.zy("accelerate").mo986k(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float ncyb(String str, float f2) {
        return (float) C0284q.zy(str).mo986k(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float uv6(float f2) {
        return (float) C0284q.zy("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").mo986k(f2);
    }

    public void cdj(String str, fn3e fn3eVar) {
        lvui(str, null, 0).m1171q(fn3eVar);
    }

    public float[] d3(String str) {
        float[] fArr = new float[124];
        this.f1881s.get(str).f1890q.ld6(fArr, 62);
        return fArr;
    }

    public void dd(int i2, int i3, float f2) {
        C0284q c0284q = this.f47606qrj;
        if (c0284q != null) {
            f2 = (float) c0284q.mo986k(f2);
        }
        Iterator<String> it = this.f1881s.keySet().iterator();
        while (it.hasNext()) {
            this.f1881s.get(it.next()).toq(i2, i3, f2, this);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m1162e(C0339g c0339g, int i2) {
        ArrayList<C0341n> arrayListBih = c0339g.bih();
        int size = arrayListBih.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0341n c0341n = arrayListBih.get(i3);
            lvui(c0341n.f47894kja0, null, i2).m1168g(c0341n, i2);
        }
    }

    public ki eqxt(String str) {
        toq toqVar = this.f1881s.get(str);
        if (toqVar == null) {
            return null;
        }
        return toqVar.f1887k;
    }

    public boolean fn3e(String str) {
        return this.f1881s.containsKey(str);
    }

    public int fti(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.f1881s.get(str).f1890q.m1105p(fArr, iArr, iArr2);
    }

    public C0308k fu4(String str, int i2) {
        C0308k c0308k;
        while (i2 >= 0) {
            HashMap<String, C0308k> map = this.f1882y.get(Integer.valueOf(i2));
            if (map != null && (c0308k = map.get(str)) != null) {
                return c0308k;
            }
            i2--;
        }
        return null;
    }

    public int gvn7(ki kiVar) {
        int i2 = 0;
        for (int i3 = 0; i3 <= 100; i3++) {
            HashMap<String, C0308k> map = this.f1882y.get(Integer.valueOf(i3));
            if (map != null && map.get(kiVar.f1927k.f47894kja0) != null) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: h */
    public void m1163h(String str, fn3e fn3eVar) {
        lvui(str, null, 0).zy(fn3eVar);
    }

    /* JADX INFO: renamed from: i */
    public void m1164i() {
        this.f1881s.clear();
    }

    public InterfaceC0321q jk() {
        return a9(this.f47604ld6, this.f47607x2);
    }

    public androidx.constraintlayout.core.motion.zy jp0y(String str) {
        return lvui(str, null, 0).f1890q;
    }

    @Override // androidx.constraintlayout.core.motion.utils.zurt
    /* JADX INFO: renamed from: k */
    public int mo933k(String str) {
        return 0;
    }

    public void ki(String str, int i2, int i3, float f2, float f3) {
        fn3e fn3eVar = new fn3e();
        fn3eVar.toq(zurt.f7l8.f47377ki, 2);
        fn3eVar.toq(100, i2);
        fn3eVar.m989k(506, f2);
        fn3eVar.m989k(507, f3);
        lvui(str, null, 0).m1170n(fn3eVar);
        C0308k c0308k = new C0308k(str, i2, i3, f2, f3);
        HashMap<String, C0308k> map = this.f1882y.get(Integer.valueOf(i2));
        if (map == null) {
            map = new HashMap<>();
            this.f1882y.put(Integer.valueOf(i2), map);
        }
        map.put(str, c0308k);
    }

    public void kja0(int i2, String str, String str2, float f2) {
        lvui(str, null, i2).m1169k(i2).m1220q(str2, f2);
    }

    public ki mcp(String str) {
        toq toqVar = this.f1881s.get(str);
        if (toqVar == null) {
            return null;
        }
        return toqVar.f47612zy;
    }

    @Override // androidx.constraintlayout.core.motion.utils.zurt
    /* JADX INFO: renamed from: n */
    public boolean mo935n(int i2, String str) {
        if (i2 != 705) {
            return false;
        }
        this.f47607x2 = str;
        this.f47606qrj = C0284q.zy(str);
        return false;
    }

    public void n7h(int i2, String str, String str2, int i3) {
        lvui(str, null, i2).m1169k(i2).zy(str2, i3);
    }

    public C0308k ni7(String str, int i2) {
        C0308k c0308k;
        while (i2 <= 100) {
            HashMap<String, C0308k> map = this.f1882y.get(Integer.valueOf(i2));
            if (map != null && (c0308k = map.get(str)) != null) {
                return c0308k;
            }
            i2++;
        }
        return null;
    }

    public ki o1t(C0341n c0341n) {
        return lvui(c0341n.f47894kja0, null, 1).f47611toq;
    }

    public ki oc(C0341n c0341n) {
        return lvui(c0341n.f47894kja0, null, 0).f1887k;
    }

    @Override // androidx.constraintlayout.core.motion.utils.zurt
    /* JADX INFO: renamed from: q */
    public boolean mo937q(int i2, boolean z2) {
        return false;
    }

    /* JADX INFO: renamed from: r */
    public boolean m1165r() {
        return this.f1882y.size() > 0;
    }

    /* JADX INFO: renamed from: t */
    public ki m1166t(C0341n c0341n) {
        return lvui(c0341n.f47894kja0, null, 2).f47612zy;
    }

    public void t8r(String str, fn3e fn3eVar) {
        lvui(str, null, 0).m1170n(fn3eVar);
    }

    @Override // androidx.constraintlayout.core.motion.utils.zurt
    public boolean toq(int i2, int i3) {
        return false;
    }

    public void vyq(fn3e fn3eVar) {
        fn3eVar.m988g(this.f1880p);
        fn3eVar.f7l8(this);
    }

    public ki wvg(String str) {
        toq toqVar = this.f1881s.get(str);
        if (toqVar == null) {
            return null;
        }
        return toqVar.f47611toq;
    }

    public boolean x9kr() {
        return this.f1881s.isEmpty();
    }

    /* JADX INFO: renamed from: z */
    public int m1167z() {
        return this.f47605n7h;
    }

    public void zurt(ki kiVar, float[] fArr, float[] fArr2, float[] fArr3) {
        C0308k c0308k;
        int i2 = 0;
        for (int i3 = 0; i3 <= 100; i3++) {
            HashMap<String, C0308k> map = this.f1882y.get(Integer.valueOf(i3));
            if (map != null && (c0308k = map.get(kiVar.f1927k.f47894kja0)) != null) {
                fArr[i2] = c0308k.f1885q;
                fArr2[i2] = c0308k.f1884n;
                fArr3[i2] = c0308k.f1883k;
                i2++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.zurt
    public boolean zy(int i2, float f2) {
        if (i2 != 706) {
            return false;
        }
        this.f1879h = f2;
        return false;
    }
}
