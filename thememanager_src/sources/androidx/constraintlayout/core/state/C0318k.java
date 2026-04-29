package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.constraintlayout.core.state.C0324y;
import androidx.constraintlayout.core.state.helpers.InterfaceC0314n;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0343q;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.constraintlayout.core.state.k */
/* JADX INFO: compiled from: ConstraintReference.java */
/* JADX INFO: loaded from: classes.dex */
public class C0318k implements InterfaceC0319n {

    /* JADX INFO: renamed from: b */
    private HashMap<String, Float> f1903b;

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    private Object f47627ek5k;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    private float f47634hb;

    /* JADX INFO: renamed from: k */
    private Object f1911k;

    /* JADX INFO: renamed from: m */
    androidx.constraintlayout.core.state.toq f1913m;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    private float f47648nn86;

    /* JADX INFO: renamed from: o */
    androidx.constraintlayout.core.state.toq f1915o;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final C0324y f47653toq;

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    private HashMap<String, Integer> f47659y9n;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    private C0341n f47660yz;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    String f47662zy = null;

    /* JADX INFO: renamed from: q */
    InterfaceC0314n f1917q = null;

    /* JADX INFO: renamed from: n */
    int f1914n = 0;

    /* JADX INFO: renamed from: g */
    int f1907g = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    float f47629f7l8 = -1.0f;

    /* JADX INFO: renamed from: y */
    float f1921y = -1.0f;

    /* JADX INFO: renamed from: s */
    float f1919s = 0.5f;

    /* JADX INFO: renamed from: p */
    float f1916p = 0.5f;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    protected int f47640ld6 = 0;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    protected int f47657x2 = 0;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    protected int f47651qrj = 0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    protected int f47645n7h = 0;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    protected int f47639kja0 = 0;

    /* JADX INFO: renamed from: h */
    protected int f1908h = 0;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    protected int f47623cdj = 0;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    protected int f47638ki = 0;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    protected int f47652t8r = 0;

    /* JADX INFO: renamed from: i */
    protected int f1909i = 0;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    protected int f47630fn3e = 0;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    protected int f47661zurt = 0;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    int f47647ni7 = 0;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    int f47632fu4 = 0;

    /* JADX INFO: renamed from: z */
    float f1922z = Float.NaN;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    float f47649o1t = Float.NaN;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    float f47656wvg = Float.NaN;

    /* JADX INFO: renamed from: t */
    float f1920t = Float.NaN;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    float f47643mcp = Float.NaN;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    float f47636jk = Float.NaN;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    float f47622a9 = Float.NaN;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    float f47631fti = Float.NaN;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    float f47637jp0y = Float.NaN;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    float f47633gvn7 = Float.NaN;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    float f47625d3 = Float.NaN;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    int f47650oc = 0;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    protected Object f47628eqxt = null;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    protected Object f47624d2ok = null;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    protected Object f47642lvui = null;

    /* JADX INFO: renamed from: r */
    protected Object f1918r = null;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    protected Object f47626dd = null;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    protected Object f47658x9kr = null;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    protected Object f47646ncyb = null;

    /* JADX INFO: renamed from: l */
    protected Object f1912l = null;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    protected Object f47644n5r1 = null;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    protected Object f47635hyr = null;

    /* JADX INFO: renamed from: f */
    protected Object f1906f = null;

    /* JADX INFO: renamed from: c */
    protected Object f1904c = null;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    Object f47641lrht = null;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    Object f47654uv6 = null;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    Object f47655vyq = null;

    /* JADX INFO: renamed from: e */
    Object f1905e = null;

    /* JADX INFO: renamed from: j */
    C0324y.zy f1910j = null;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.k$k */
    /* JADX INFO: compiled from: ConstraintReference.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f1923k;

        static {
            int[] iArr = new int[C0324y.zy.values().length];
            f1923k = iArr;
            try {
                iArr[C0324y.zy.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1923k[C0324y.zy.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1923k[C0324y.zy.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1923k[C0324y.zy.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1923k[C0324y.zy.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1923k[C0324y.zy.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1923k[C0324y.zy.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1923k[C0324y.zy.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1923k[C0324y.zy.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1923k[C0324y.zy.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1923k[C0324y.zy.BOTTOM_TO_TOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1923k[C0324y.zy.BOTTOM_TO_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1923k[C0324y.zy.BASELINE_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f1923k[C0324y.zy.BASELINE_TO_TOP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f1923k[C0324y.zy.BASELINE_TO_BASELINE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f1923k[C0324y.zy.CIRCULAR_CONSTRAINT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f1923k[C0324y.zy.CENTER_HORIZONTALLY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f1923k[C0324y.zy.CENTER_VERTICALLY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.k$toq */
    /* JADX INFO: compiled from: ConstraintReference.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        C0318k m1213k(C0324y c0324y);
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.k$zy */
    /* JADX INFO: compiled from: ConstraintReference.java */
    static class zy extends Exception {
        private final ArrayList<String> mErrors;

        public zy(ArrayList<String> arrayList) {
            this.mErrors = arrayList;
        }

        public ArrayList<String> getErrors() {
            return this.mErrors;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IncorrectConstraintException: " + this.mErrors.toString();
        }
    }

    public C0318k(C0324y c0324y) {
        Object obj = androidx.constraintlayout.core.state.toq.f1934p;
        this.f1915o = androidx.constraintlayout.core.state.toq.toq(obj);
        this.f1913m = androidx.constraintlayout.core.state.toq.toq(obj);
        this.f47659y9n = new HashMap<>();
        this.f1903b = new HashMap<>();
        this.f47653toq = c0324y;
    }

    private C0341n dd(Object obj) {
        if (obj instanceof InterfaceC0319n) {
            return ((InterfaceC0319n) obj).mo1185k();
        }
        return null;
    }

    private void fu4() {
        this.f47628eqxt = m1191t(this.f47628eqxt);
        this.f47624d2ok = m1191t(this.f47624d2ok);
        this.f47642lvui = m1191t(this.f47642lvui);
        this.f1918r = m1191t(this.f1918r);
        this.f47626dd = m1191t(this.f47626dd);
        this.f47658x9kr = m1191t(this.f47658x9kr);
        this.f47646ncyb = m1191t(this.f47646ncyb);
        this.f1912l = m1191t(this.f1912l);
        this.f47644n5r1 = m1191t(this.f47644n5r1);
        this.f47635hyr = m1191t(this.f47635hyr);
        this.f1906f = m1191t(this.f1906f);
        this.f1904c = m1191t(this.f1904c);
        this.f47641lrht = m1191t(this.f47641lrht);
        this.f47654uv6 = m1191t(this.f47654uv6);
        this.f47655vyq = m1191t(this.f47655vyq);
    }

    /* JADX INFO: renamed from: t */
    private Object m1191t(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof C0318k) ? this.f47653toq.ki(obj) : obj;
    }

    /* JADX INFO: renamed from: y */
    private void m1192y(C0341n c0341n, Object obj, C0324y.zy zyVar) {
        C0341n c0341nDd = dd(obj);
        if (c0341nDd == null) {
        }
        int[] iArr = k.f1923k;
        int i2 = iArr[zyVar.ordinal()];
        switch (iArr[zyVar.ordinal()]) {
            case 1:
                C0343q.toq toqVar = C0343q.toq.LEFT;
                c0341n.ki(toqVar).toq(c0341nDd.ki(toqVar), this.f47640ld6, this.f47623cdj, false);
                break;
            case 2:
                c0341n.ki(C0343q.toq.LEFT).toq(c0341nDd.ki(C0343q.toq.RIGHT), this.f47640ld6, this.f47623cdj, false);
                break;
            case 3:
                c0341n.ki(C0343q.toq.RIGHT).toq(c0341nDd.ki(C0343q.toq.LEFT), this.f47657x2, this.f47638ki, false);
                break;
            case 4:
                C0343q.toq toqVar2 = C0343q.toq.RIGHT;
                c0341n.ki(toqVar2).toq(c0341nDd.ki(toqVar2), this.f47657x2, this.f47638ki, false);
                break;
            case 5:
                C0343q.toq toqVar3 = C0343q.toq.LEFT;
                c0341n.ki(toqVar3).toq(c0341nDd.ki(toqVar3), this.f47651qrj, this.f47652t8r, false);
                break;
            case 6:
                c0341n.ki(C0343q.toq.LEFT).toq(c0341nDd.ki(C0343q.toq.RIGHT), this.f47651qrj, this.f47652t8r, false);
                break;
            case 7:
                c0341n.ki(C0343q.toq.RIGHT).toq(c0341nDd.ki(C0343q.toq.LEFT), this.f47645n7h, this.f1909i, false);
                break;
            case 8:
                C0343q.toq toqVar4 = C0343q.toq.RIGHT;
                c0341n.ki(toqVar4).toq(c0341nDd.ki(toqVar4), this.f47645n7h, this.f1909i, false);
                break;
            case 9:
                C0343q.toq toqVar5 = C0343q.toq.TOP;
                c0341n.ki(toqVar5).toq(c0341nDd.ki(toqVar5), this.f47639kja0, this.f47630fn3e, false);
                break;
            case 10:
                c0341n.ki(C0343q.toq.TOP).toq(c0341nDd.ki(C0343q.toq.BOTTOM), this.f47639kja0, this.f47630fn3e, false);
                break;
            case 11:
                c0341n.ki(C0343q.toq.BOTTOM).toq(c0341nDd.ki(C0343q.toq.TOP), this.f1908h, this.f47661zurt, false);
                break;
            case 12:
                C0343q.toq toqVar6 = C0343q.toq.BOTTOM;
                c0341n.ki(toqVar6).toq(c0341nDd.ki(toqVar6), this.f1908h, this.f47661zurt, false);
                break;
            case 13:
                c0341n.y2(C0343q.toq.BASELINE, c0341nDd, C0343q.toq.BOTTOM, this.f47647ni7, this.f47632fu4);
                break;
            case 14:
                c0341n.y2(C0343q.toq.BASELINE, c0341nDd, C0343q.toq.TOP, this.f47647ni7, this.f47632fu4);
                break;
            case 15:
                C0343q.toq toqVar7 = C0343q.toq.BASELINE;
                c0341n.y2(toqVar7, c0341nDd, toqVar7, this.f47647ni7, this.f47632fu4);
                break;
            case 16:
                c0341n.qrj(c0341nDd, this.f47648nn86, (int) this.f47634hb);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public C0318k m1193a(float f2) {
        this.f47643mcp = f2;
        return this;
    }

    public int a9() {
        return this.f1914n;
    }

    public C0318k a98o(float f2) {
        this.f1920t = f2;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.InterfaceC0319n, androidx.constraintlayout.core.state.helpers.InterfaceC0314n
    public void apply() {
        if (this.f47660yz == null) {
            return;
        }
        InterfaceC0314n interfaceC0314n = this.f1917q;
        if (interfaceC0314n != null) {
            interfaceC0314n.apply();
        }
        this.f1915o.m1233p(this.f47653toq, this.f47660yz, 0);
        this.f1913m.m1233p(this.f47653toq, this.f47660yz, 1);
        fu4();
        m1192y(this.f47660yz, this.f47628eqxt, C0324y.zy.LEFT_TO_LEFT);
        m1192y(this.f47660yz, this.f47624d2ok, C0324y.zy.LEFT_TO_RIGHT);
        m1192y(this.f47660yz, this.f47642lvui, C0324y.zy.RIGHT_TO_LEFT);
        m1192y(this.f47660yz, this.f1918r, C0324y.zy.RIGHT_TO_RIGHT);
        m1192y(this.f47660yz, this.f47626dd, C0324y.zy.START_TO_START);
        m1192y(this.f47660yz, this.f47658x9kr, C0324y.zy.START_TO_END);
        m1192y(this.f47660yz, this.f47646ncyb, C0324y.zy.END_TO_START);
        m1192y(this.f47660yz, this.f1912l, C0324y.zy.END_TO_END);
        m1192y(this.f47660yz, this.f47644n5r1, C0324y.zy.TOP_TO_TOP);
        m1192y(this.f47660yz, this.f47635hyr, C0324y.zy.TOP_TO_BOTTOM);
        m1192y(this.f47660yz, this.f1906f, C0324y.zy.BOTTOM_TO_TOP);
        m1192y(this.f47660yz, this.f1904c, C0324y.zy.BOTTOM_TO_BOTTOM);
        m1192y(this.f47660yz, this.f47641lrht, C0324y.zy.BASELINE_TO_BASELINE);
        m1192y(this.f47660yz, this.f47654uv6, C0324y.zy.BASELINE_TO_TOP);
        m1192y(this.f47660yz, this.f47655vyq, C0324y.zy.BASELINE_TO_BOTTOM);
        m1192y(this.f47660yz, this.f1905e, C0324y.zy.CIRCULAR_CONSTRAINT);
        int i2 = this.f1914n;
        if (i2 != 0) {
            this.f47660yz.zwy(i2);
        }
        int i3 = this.f1907g;
        if (i3 != 0) {
            this.f47660yz.nme(i3);
        }
        float f2 = this.f47629f7l8;
        if (f2 != -1.0f) {
            this.f47660yz.lh(f2);
        }
        float f3 = this.f1921y;
        if (f3 != -1.0f) {
            this.f47660yz.kx3(f3);
        }
        this.f47660yz.nsb(this.f1919s);
        this.f47660yz.b8(this.f1916p);
        C0341n c0341n = this.f47660yz;
        ki kiVar = c0341n.f47904n7h;
        kiVar.f1924g = this.f1922z;
        kiVar.f47666f7l8 = this.f47649o1t;
        kiVar.f1932y = this.f47656wvg;
        kiVar.f1931s = this.f1920t;
        kiVar.f1929p = this.f47643mcp;
        kiVar.f47669ld6 = this.f47636jk;
        kiVar.f47674x2 = this.f47622a9;
        kiVar.f47671qrj = this.f47631fti;
        kiVar.f47670n7h = this.f47633gvn7;
        kiVar.f47668kja0 = this.f47625d3;
        kiVar.f1925h = this.f47637jp0y;
        int i4 = this.f47650oc;
        kiVar.f47667ki = i4;
        c0341n.m1330w(i4);
        HashMap<String, Integer> map = this.f47659y9n;
        if (map != null) {
            for (String str : map.keySet()) {
                this.f47660yz.f47904n7h.ni7(str, zurt.toq.f47470x2, this.f47659y9n.get(str).intValue());
            }
        }
        HashMap<String, Float> map2 = this.f1903b;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                this.f47660yz.f47904n7h.zurt(str2, zurt.toq.f47466ld6, this.f1903b.get(str2).floatValue());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public C0318k m1194b(Object obj) {
        this.f1910j = C0324y.zy.RIGHT_TO_LEFT;
        this.f47642lvui = obj;
        return this;
    }

    public C0318k bf2(Object obj) {
        this.f1910j = C0324y.zy.RIGHT_TO_RIGHT;
        this.f1918r = obj;
        return this;
    }

    public void bo(int i2) {
        this.f1907g = i2;
    }

    /* JADX INFO: renamed from: c */
    public androidx.constraintlayout.core.state.toq m1195c() {
        return this.f1915o;
    }

    public void c8jq(Object obj) {
        this.f47627ek5k = obj;
        C0341n c0341n = this.f47660yz;
        if (c0341n != null) {
            c0341n.uj2j(obj);
        }
    }

    public C0318k cdj(Object obj) {
        Object objM1191t = m1191t(obj);
        this.f47626dd = objM1191t;
        this.f1912l = objM1191t;
        this.f1910j = C0324y.zy.CENTER_HORIZONTALLY;
        this.f1919s = 0.5f;
        return this;
    }

    public void ch(InterfaceC0314n interfaceC0314n) {
        this.f1917q = interfaceC0314n;
        if (interfaceC0314n != null) {
            toq(interfaceC0314n.mo1185k());
        }
    }

    /* JADX INFO: renamed from: d */
    public C0318k m1196d(Object obj) {
        this.f1910j = C0324y.zy.TOP_TO_BOTTOM;
        this.f47635hyr = obj;
        return this;
    }

    public float d2ok() {
        return this.f47633gvn7;
    }

    public float d3() {
        return this.f47656wvg;
    }

    public C0318k d8wk(androidx.constraintlayout.core.state.toq toqVar) {
        return gyi(toqVar);
    }

    public C0318k dr() {
        if (this.f47626dd != null) {
            this.f1910j = C0324y.zy.START_TO_START;
        } else {
            this.f1910j = C0324y.zy.START_TO_END;
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C0318k m1197e(Object obj) {
        this.f1910j = C0324y.zy.LEFT_TO_LEFT;
        this.f47628eqxt = obj;
        return this;
    }

    public C0318k ek5k(float f2) {
        this.f1922z = f2;
        return this;
    }

    public float eqxt() {
        return this.f47643mcp;
    }

    /* JADX INFO: renamed from: f */
    public Object m1198f() {
        return this.f47627ek5k;
    }

    public C0318k f7l8(float f2) {
        this.f47637jp0y = f2;
        return this;
    }

    public C0318k fn3e() {
        dr().m1201i();
        m1212z().m1201i();
        vyq().m1201i();
        y9n().m1201i();
        return this;
    }

    public C0318k fnq8(float f2) {
        this.f47631fti = f2;
        return this;
    }

    public float fti() {
        return this.f47629f7l8;
    }

    /* JADX INFO: renamed from: g */
    public void m1199g(String str, float f2) {
        if (this.f1903b == null) {
            this.f1903b = new HashMap<>();
        }
        this.f1903b.put(str, Float.valueOf(f2));
    }

    @Override // androidx.constraintlayout.core.state.InterfaceC0319n
    public Object getKey() {
        return this.f1911k;
    }

    public float gvn7() {
        return this.f47649o1t;
    }

    public C0318k gyi(androidx.constraintlayout.core.state.toq toqVar) {
        this.f1915o = toqVar;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C0318k m1200h(Object obj) {
        this.f1910j = C0324y.zy.BOTTOM_TO_TOP;
        this.f1906f = obj;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C0318k hb(int i2) {
        C0324y.zy zyVar = this.f1910j;
        if (zyVar != null) {
            switch (k.f1923k[zyVar.ordinal()]) {
                case 1:
                case 2:
                    this.f47640ld6 = i2;
                    break;
                case 3:
                case 4:
                    this.f47657x2 = i2;
                    break;
                case 5:
                case 6:
                    this.f47651qrj = i2;
                    break;
                case 7:
                case 8:
                    this.f47645n7h = i2;
                    break;
                case 9:
                case 10:
                    this.f47639kja0 = i2;
                    break;
                case 11:
                case 12:
                    this.f1908h = i2;
                    break;
                case 13:
                case 14:
                case 15:
                    this.f47647ni7 = i2;
                    break;
                case 16:
                    this.f47634hb = i2;
                    break;
            }
        } else {
            this.f47640ld6 = i2;
            this.f47657x2 = i2;
            this.f47651qrj = i2;
            this.f47645n7h = i2;
            this.f47639kja0 = i2;
            this.f1908h = i2;
        }
        return this;
    }

    public float hyr() {
        return this.f1921y;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: i */
    public C0318k m1201i() {
        C0324y.zy zyVar = this.f1910j;
        if (zyVar != null) {
            switch (k.f1923k[zyVar.ordinal()]) {
                case 1:
                case 2:
                    this.f47628eqxt = null;
                    this.f47624d2ok = null;
                    this.f47640ld6 = 0;
                    this.f47623cdj = 0;
                    break;
                case 3:
                case 4:
                    this.f47642lvui = null;
                    this.f1918r = null;
                    this.f47657x2 = 0;
                    this.f47638ki = 0;
                    break;
                case 5:
                case 6:
                    this.f47626dd = null;
                    this.f47658x9kr = null;
                    this.f47651qrj = 0;
                    this.f47652t8r = 0;
                    break;
                case 7:
                case 8:
                    this.f47646ncyb = null;
                    this.f1912l = null;
                    this.f47645n7h = 0;
                    this.f1909i = 0;
                    break;
                case 9:
                case 10:
                    this.f47644n5r1 = null;
                    this.f47635hyr = null;
                    this.f47639kja0 = 0;
                    this.f47630fn3e = 0;
                    break;
                case 11:
                case 12:
                    this.f1906f = null;
                    this.f1904c = null;
                    this.f1908h = 0;
                    this.f47661zurt = 0;
                    break;
                case 15:
                    this.f47641lrht = null;
                    break;
                case 16:
                    this.f1905e = null;
                    break;
            }
        } else {
            this.f47628eqxt = null;
            this.f47624d2ok = null;
            this.f47640ld6 = 0;
            this.f47642lvui = null;
            this.f1918r = null;
            this.f47657x2 = 0;
            this.f47626dd = null;
            this.f47658x9kr = null;
            this.f47651qrj = 0;
            this.f47646ncyb = null;
            this.f1912l = null;
            this.f47645n7h = 0;
            this.f47644n5r1 = null;
            this.f47635hyr = null;
            this.f47639kja0 = 0;
            this.f1906f = null;
            this.f1904c = null;
            this.f1908h = 0;
            this.f47641lrht = null;
            this.f1905e = null;
            this.f1919s = 0.5f;
            this.f1916p = 0.5f;
            this.f47623cdj = 0;
            this.f47638ki = 0;
            this.f47652t8r = 0;
            this.f1909i = 0;
            this.f47630fn3e = 0;
            this.f47661zurt = 0;
        }
        return this;
    }

    public C0318k i1(float f2) {
        this.f47656wvg = f2;
        return this;
    }

    public C0318k ikck() {
        if (this.f47644n5r1 != null) {
            this.f1910j = C0324y.zy.TOP_TO_TOP;
        } else {
            this.f1910j = C0324y.zy.TOP_TO_BOTTOM;
        }
        return this;
    }

    /* JADX INFO: renamed from: j */
    public C0318k mo1190j(Object obj) {
        return hb(this.f47653toq.m1235g(obj));
    }

    public androidx.constraintlayout.core.state.toq jk() {
        return this.f1913m;
    }

    public float jp0y() {
        return this.f1922z;
    }

    @Override // androidx.constraintlayout.core.state.InterfaceC0319n
    /* JADX INFO: renamed from: k */
    public C0341n mo1185k() {
        if (this.f47660yz == null) {
            C0341n c0341nNi7 = ni7();
            this.f47660yz = c0341nNi7;
            c0341nNi7.uj2j(this.f47627ek5k);
        }
        return this.f47660yz;
    }

    public C0318k ki(Object obj) {
        Object objM1191t = m1191t(obj);
        this.f47644n5r1 = objM1191t;
        this.f1904c = objM1191t;
        this.f1910j = C0324y.zy.CENTER_VERTICALLY;
        this.f1916p = 0.5f;
        return this;
    }

    public C0318k kja0(Object obj) {
        this.f1910j = C0324y.zy.BOTTOM_TO_BOTTOM;
        this.f1904c = obj;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public float m1202l() {
        return this.f47631fti;
    }

    public C0318k ld6(Object obj) {
        this.f1910j = C0324y.zy.BASELINE_TO_BOTTOM;
        this.f47655vyq = obj;
        return this;
    }

    public C0318k lrht(androidx.constraintlayout.core.state.toq toqVar) {
        return nmn5(toqVar);
    }

    public void lv5(int i2) {
        this.f1914n = i2;
    }

    public float lvui() {
        return this.f47625d3;
    }

    /* JADX INFO: renamed from: m */
    public C0318k m1203m(Object obj) {
        return m1205o(this.f47653toq.m1235g(obj));
    }

    public float mcp() {
        return this.f47637jp0y;
    }

    public C0318k mu(Object obj) {
        this.f1910j = C0324y.zy.TOP_TO_TOP;
        this.f47644n5r1 = obj;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public void m1204n(String str, int i2) {
        this.f47659y9n.put(str, Integer.valueOf(i2));
    }

    public int n5r1(int i2) {
        return this.f1907g;
    }

    public C0318k n7h() {
        if (this.f1906f != null) {
            this.f1910j = C0324y.zy.BOTTOM_TO_TOP;
        } else {
            this.f1910j = C0324y.zy.BOTTOM_TO_BOTTOM;
        }
        return this;
    }

    public float ncyb() {
        return this.f47622a9;
    }

    public C0341n ni7() {
        return new C0341n(m1195c().n7h(), jk().n7h());
    }

    public C0318k nmn5(androidx.constraintlayout.core.state.toq toqVar) {
        this.f1913m = toqVar;
        return this;
    }

    public C0318k nn86(Object obj) {
        this.f1910j = C0324y.zy.LEFT_TO_RIGHT;
        this.f47624d2ok = obj;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: o */
    public C0318k m1205o(int i2) {
        C0324y.zy zyVar = this.f1910j;
        if (zyVar != null) {
            switch (k.f1923k[zyVar.ordinal()]) {
                case 1:
                case 2:
                    this.f47623cdj = i2;
                    break;
                case 3:
                case 4:
                    this.f47638ki = i2;
                    break;
                case 5:
                case 6:
                    this.f47652t8r = i2;
                    break;
                case 7:
                case 8:
                    this.f1909i = i2;
                    break;
                case 9:
                case 10:
                    this.f47630fn3e = i2;
                    break;
                case 11:
                case 12:
                    this.f47661zurt = i2;
                    break;
                case 13:
                case 14:
                case 15:
                    this.f47632fu4 = i2;
                    break;
            }
        } else {
            this.f47623cdj = i2;
            this.f47638ki = i2;
            this.f47652t8r = i2;
            this.f1909i = i2;
            this.f47630fn3e = i2;
            this.f47661zurt = i2;
        }
        return this;
    }

    public C0318k o1t(Object obj) {
        this.f1910j = C0324y.zy.END_TO_END;
        this.f1912l = obj;
        return this;
    }

    public float oc() {
        return this.f1920t;
    }

    /* JADX INFO: renamed from: p */
    public C0318k m1206p(Object obj) {
        this.f1910j = C0324y.zy.BASELINE_TO_BASELINE;
        this.f47641lrht = obj;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.InterfaceC0319n
    /* JADX INFO: renamed from: q */
    public InterfaceC0314n mo1187q() {
        return this.f1917q;
    }

    public C0318k qkj8(float f2) {
        this.f47622a9 = f2;
        return this;
    }

    public void qo() throws zy {
        ArrayList arrayList = new ArrayList();
        if (this.f47628eqxt != null && this.f47624d2ok != null) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (this.f47642lvui != null && this.f1918r != null) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (this.f47626dd != null && this.f47658x9kr != null) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (this.f47646ncyb != null && this.f1912l != null) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if ((this.f47628eqxt != null || this.f47624d2ok != null || this.f47642lvui != null || this.f1918r != null) && (this.f47626dd != null || this.f47658x9kr != null || this.f47646ncyb != null || this.f1912l != null)) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() > 0) {
            throw new zy(arrayList);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.constraintlayout.core.state.C0318k qrj(float r3) {
        /*
            r2 = this;
            androidx.constraintlayout.core.state.y$zy r0 = r2.f1910j
            if (r0 != 0) goto L5
            return r2
        L5:
            int[] r1 = androidx.constraintlayout.core.state.C0318k.k.f1923k
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 17
            if (r0 == r1) goto L1c
            r1 = 18
            if (r0 == r1) goto L19
            switch(r0) {
                case 1: goto L1c;
                case 2: goto L1c;
                case 3: goto L1c;
                case 4: goto L1c;
                case 5: goto L1c;
                case 6: goto L1c;
                case 7: goto L1c;
                case 8: goto L1c;
                case 9: goto L19;
                case 10: goto L19;
                case 11: goto L19;
                case 12: goto L19;
                default: goto L18;
            }
        L18:
            goto L1e
        L19:
            r2.f1916p = r3
            goto L1e
        L1c:
            r2.f1919s = r3
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.C0318k.qrj(float):androidx.constraintlayout.core.state.k");
    }

    /* JADX INFO: renamed from: r */
    public String m1207r() {
        return this.f47662zy;
    }

    /* JADX INFO: renamed from: s */
    public C0318k m1208s() {
        this.f1910j = C0324y.zy.BASELINE_TO_BASELINE;
        return this;
    }

    public void t8iq(float f2) {
        this.f47629f7l8 = f2;
    }

    public C0318k t8r(Object obj, float f2, float f3) {
        this.f1905e = m1191t(obj);
        this.f47648nn86 = f2;
        this.f47634hb = f3;
        this.f1910j = C0324y.zy.CIRCULAR_CONSTRAINT;
        return this;
    }

    public C0318k tfm(float f2) {
        this.f1916p = f2;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.InterfaceC0319n
    public void toq(C0341n c0341n) {
        if (c0341n == null) {
            return;
        }
        this.f47660yz = c0341n;
        c0341n.uj2j(this.f47627ek5k);
    }

    /* JADX INFO: renamed from: u */
    public void m1209u(String str) {
        this.f47662zy = str;
    }

    public C0318k uv6(float f2) {
        this.f1919s = f2;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public C0318k m1210v(Object obj) {
        this.f1910j = C0324y.zy.START_TO_START;
        this.f47626dd = obj;
        return this;
    }

    public C0318k vq(float f2) {
        this.f47636jk = f2;
        return this;
    }

    public C0318k vyq() {
        if (this.f47628eqxt != null) {
            this.f1910j = C0324y.zy.LEFT_TO_LEFT;
        } else {
            this.f1910j = C0324y.zy.LEFT_TO_RIGHT;
        }
        return this;
    }

    public C0318k wo(int i2) {
        this.f47650oc = i2;
        return this;
    }

    public C0318k wvg(Object obj) {
        this.f1910j = C0324y.zy.END_TO_START;
        this.f47646ncyb = obj;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public C0318k m1211x(float f2) {
        this.f47625d3 = f2;
        return this;
    }

    public C0318k x2(Object obj) {
        this.f1910j = C0324y.zy.BASELINE_TO_TOP;
        this.f47654uv6 = obj;
        return this;
    }

    public float x9kr() {
        return this.f47636jk;
    }

    public C0318k xwq3(Object obj) {
        this.f1910j = C0324y.zy.START_TO_END;
        this.f47658x9kr = obj;
        return this;
    }

    public void y2(float f2) {
        this.f1921y = f2;
    }

    public C0318k y9n() {
        if (this.f47642lvui != null) {
            this.f1910j = C0324y.zy.RIGHT_TO_LEFT;
        } else {
            this.f1910j = C0324y.zy.RIGHT_TO_RIGHT;
        }
        return this;
    }

    public C0318k yz(float f2) {
        this.f47649o1t = f2;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public C0318k m1212z() {
        if (this.f47646ncyb != null) {
            this.f1910j = C0324y.zy.END_TO_START;
        } else {
            this.f1910j = C0324y.zy.END_TO_END;
        }
        return this;
    }

    public C0318k zp(float f2) {
        this.f47633gvn7 = f2;
        return this;
    }

    public C0318k zurt() {
        ikck().m1201i();
        m1208s().m1201i();
        n7h().m1201i();
        return this;
    }

    @Override // androidx.constraintlayout.core.state.InterfaceC0319n
    public void zy(Object obj) {
        this.f1911k = obj;
    }
}
