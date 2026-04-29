package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.helpers.C0312g;
import androidx.constraintlayout.core.state.helpers.C0313k;
import androidx.constraintlayout.core.state.helpers.C0316y;
import androidx.constraintlayout.core.widgets.C0339g;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0342p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.constraintlayout.core.state.y */
/* JADX INFO: compiled from: State.java */
/* JADX INFO: loaded from: classes.dex */
public class C0324y {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    static final int f47683f7l8 = 0;

    /* JADX INFO: renamed from: g */
    static final int f1942g = -1;

    /* JADX INFO: renamed from: p */
    public static final Integer f1943p = 0;

    /* JADX INFO: renamed from: s */
    static final int f1944s = 2;

    /* JADX INFO: renamed from: y */
    static final int f1945y = 1;

    /* JADX INFO: renamed from: n */
    private int f1947n;

    /* JADX INFO: renamed from: q */
    public final C0318k f1948q;

    /* JADX INFO: renamed from: k */
    protected HashMap<Object, InterfaceC0319n> f1946k = new HashMap<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected HashMap<Object, androidx.constraintlayout.core.state.zy> f47684toq = new HashMap<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    HashMap<String, ArrayList<String>> f47685zy = new HashMap<>();

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.y$k */
    /* JADX INFO: compiled from: State.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f1949k;

        static {
            int[] iArr = new int[n.values().length];
            f1949k = iArr;
            try {
                iArr[n.HORIZONTAL_CHAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1949k[n.VERTICAL_CHAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1949k[n.ALIGN_HORIZONTALLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1949k[n.ALIGN_VERTICALLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1949k[n.BARRIER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.y$n */
    /* JADX INFO: compiled from: State.java */
    public enum n {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.y$q */
    /* JADX INFO: compiled from: State.java */
    public enum q {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.y$toq */
    /* JADX INFO: compiled from: State.java */
    public enum toq {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.y$zy */
    /* JADX INFO: compiled from: State.java */
    public enum zy {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    public C0324y() {
        C0318k c0318k = new C0318k(this);
        this.f1948q = c0318k;
        this.f1947n = 0;
        this.f1946k.put(f1943p, c0318k);
    }

    /* JADX INFO: renamed from: y */
    private String m1234y() {
        StringBuilder sb = new StringBuilder();
        sb.append("__HELPER_KEY_");
        int i2 = this.f1947n;
        this.f1947n = i2 + 1;
        sb.append(i2);
        sb.append("__");
        return sb.toString();
    }

    public void cdj(Object obj, Object obj2) {
        C0318k c0318kM1239n = m1239n(obj);
        if (c0318kM1239n instanceof C0318k) {
            c0318kM1239n.c8jq(obj2);
        }
    }

    public C0318k f7l8(Object obj) {
        return new C0318k(this);
    }

    public boolean fn3e(int i2) {
        return this.f1948q.m1195c().ld6(i2);
    }

    public C0324y fu4(androidx.constraintlayout.core.state.toq toqVar) {
        this.f1948q.gyi(toqVar);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public int m1235g(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public C0312g m1236h(Object obj) {
        return ld6(obj, 0);
    }

    /* JADX INFO: renamed from: i */
    public boolean m1237i(int i2) {
        return this.f1948q.jk().ld6(i2);
    }

    /* JADX INFO: renamed from: k */
    public void m1238k(C0339g c0339g) {
        androidx.constraintlayout.core.state.zy zyVar;
        C0342p c0342pWas;
        C0342p c0342pWas2;
        c0339g.rp();
        this.f1948q.m1195c().m1233p(this, c0339g, 0);
        this.f1948q.jk().m1233p(this, c0339g, 1);
        for (Object obj : this.f47684toq.keySet()) {
            C0342p c0342pWas3 = this.f47684toq.get(obj).was();
            if (c0342pWas3 != null) {
                InterfaceC0319n interfaceC0319nM1239n = this.f1946k.get(obj);
                if (interfaceC0319nM1239n == null) {
                    interfaceC0319nM1239n = m1239n(obj);
                }
                interfaceC0319nM1239n.toq(c0342pWas3);
            }
        }
        for (Object obj2 : this.f1946k.keySet()) {
            InterfaceC0319n interfaceC0319n = this.f1946k.get(obj2);
            if (interfaceC0319n != this.f1948q && (interfaceC0319n.mo1187q() instanceof androidx.constraintlayout.core.state.zy) && (c0342pWas2 = ((androidx.constraintlayout.core.state.zy) interfaceC0319n.mo1187q()).was()) != null) {
                InterfaceC0319n interfaceC0319nM1239n2 = this.f1946k.get(obj2);
                if (interfaceC0319nM1239n2 == null) {
                    interfaceC0319nM1239n2 = m1239n(obj2);
                }
                interfaceC0319nM1239n2.toq(c0342pWas2);
            }
        }
        Iterator<Object> it = this.f1946k.keySet().iterator();
        while (it.hasNext()) {
            InterfaceC0319n interfaceC0319n2 = this.f1946k.get(it.next());
            if (interfaceC0319n2 != this.f1948q) {
                C0341n c0341nMo1185k = interfaceC0319n2.mo1185k();
                c0341nMo1185k.ktq(interfaceC0319n2.getKey().toString());
                c0341nMo1185k.m58i(null);
                if (interfaceC0319n2.mo1187q() instanceof C0312g) {
                    interfaceC0319n2.apply();
                }
                c0339g.m1307k(c0341nMo1185k);
            } else {
                interfaceC0319n2.toq(c0339g);
            }
        }
        Iterator<Object> it2 = this.f47684toq.keySet().iterator();
        while (it2.hasNext()) {
            androidx.constraintlayout.core.state.zy zyVar2 = this.f47684toq.get(it2.next());
            if (zyVar2.was() != null) {
                Iterator<Object> it3 = zyVar2.f47686a98o.iterator();
                while (it3.hasNext()) {
                    zyVar2.was().mo1333k(this.f1946k.get(it3.next()).mo1185k());
                }
                zyVar2.apply();
            } else {
                zyVar2.apply();
            }
        }
        Iterator<Object> it4 = this.f1946k.keySet().iterator();
        while (it4.hasNext()) {
            InterfaceC0319n interfaceC0319n3 = this.f1946k.get(it4.next());
            if (interfaceC0319n3 != this.f1948q && (interfaceC0319n3.mo1187q() instanceof androidx.constraintlayout.core.state.zy) && (c0342pWas = (zyVar = (androidx.constraintlayout.core.state.zy) interfaceC0319n3.mo1187q()).was()) != null) {
                for (Object obj3 : zyVar.f47686a98o) {
                    InterfaceC0319n interfaceC0319n4 = this.f1946k.get(obj3);
                    if (interfaceC0319n4 != null) {
                        c0342pWas.mo1333k(interfaceC0319n4.mo1185k());
                    } else if (obj3 instanceof InterfaceC0319n) {
                        c0342pWas.mo1333k(((InterfaceC0319n) obj3).mo1185k());
                    } else {
                        System.out.println("couldn't find reference for " + obj3);
                    }
                }
                interfaceC0319n3.apply();
            }
        }
        for (Object obj4 : this.f1946k.keySet()) {
            InterfaceC0319n interfaceC0319n5 = this.f1946k.get(obj4);
            interfaceC0319n5.apply();
            C0341n c0341nMo1185k2 = interfaceC0319n5.mo1185k();
            if (c0341nMo1185k2 != null && obj4 != null) {
                c0341nMo1185k2.f47894kja0 = obj4.toString();
            }
        }
    }

    InterfaceC0319n ki(Object obj) {
        return this.f1946k.get(obj);
    }

    public androidx.constraintlayout.core.state.helpers.f7l8 kja0(Object... objArr) {
        androidx.constraintlayout.core.state.helpers.f7l8 f7l8Var = (androidx.constraintlayout.core.state.helpers.f7l8) qrj(null, n.HORIZONTAL_CHAIN);
        f7l8Var.g1(objArr);
        return f7l8Var;
    }

    public C0312g ld6(Object obj, int i2) {
        C0318k c0318kM1239n = m1239n(obj);
        if (c0318kM1239n.mo1187q() == null || !(c0318kM1239n.mo1187q() instanceof C0312g)) {
            C0312g c0312g = new C0312g(this);
            c0312g.m1189y(i2);
            c0312g.zy(obj);
            c0318kM1239n.ch(c0312g);
        }
        return (C0312g) c0318kM1239n.mo1187q();
    }

    /* JADX INFO: renamed from: n */
    public C0318k m1239n(Object obj) {
        InterfaceC0319n interfaceC0319nF7l8 = this.f1946k.get(obj);
        if (interfaceC0319nF7l8 == null) {
            interfaceC0319nF7l8 = f7l8(obj);
            this.f1946k.put(obj, interfaceC0319nF7l8);
            interfaceC0319nF7l8.zy(obj);
        }
        if (interfaceC0319nF7l8 instanceof C0318k) {
            return (C0318k) interfaceC0319nF7l8;
        }
        return null;
    }

    public androidx.constraintlayout.core.state.helpers.f7l8 n7h() {
        return (androidx.constraintlayout.core.state.helpers.f7l8) qrj(null, n.HORIZONTAL_CHAIN);
    }

    public void ni7(String str, String str2) {
        ArrayList<String> arrayList;
        C0318k c0318kM1239n = m1239n(str);
        if (c0318kM1239n instanceof C0318k) {
            c0318kM1239n.m1209u(str2);
            if (this.f47685zy.containsKey(str2)) {
                arrayList = this.f47685zy.get(str2);
            } else {
                arrayList = new ArrayList<>();
                this.f47685zy.put(str2, arrayList);
            }
            arrayList.add(str);
        }
    }

    public C0316y o1t(Object... objArr) {
        C0316y c0316y = (C0316y) qrj(null, n.VERTICAL_CHAIN);
        c0316y.g1(objArr);
        return c0316y;
    }

    /* JADX INFO: renamed from: p */
    public ArrayList<String> m1240p(String str) {
        if (this.f47685zy.containsKey(str)) {
            return this.f47685zy.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public androidx.constraintlayout.core.state.helpers.toq m1241q(Object... objArr) {
        androidx.constraintlayout.core.state.helpers.toq toqVar = (androidx.constraintlayout.core.state.helpers.toq) qrj(null, n.ALIGN_VERTICALLY);
        toqVar.g1(objArr);
        return toqVar;
    }

    public androidx.constraintlayout.core.state.zy qrj(Object obj, n nVar) {
        androidx.constraintlayout.core.state.zy f7l8Var;
        if (obj == null) {
            obj = m1234y();
        }
        androidx.constraintlayout.core.state.zy zyVar = this.f47684toq.get(obj);
        if (zyVar == null) {
            int i2 = k.f1949k[nVar.ordinal()];
            if (i2 == 1) {
                f7l8Var = new androidx.constraintlayout.core.state.helpers.f7l8(this);
            } else if (i2 == 2) {
                f7l8Var = new C0316y(this);
            } else if (i2 == 3) {
                f7l8Var = new C0313k(this);
            } else if (i2 == 4) {
                f7l8Var = new androidx.constraintlayout.core.state.helpers.toq(this);
            } else if (i2 != 5) {
                zyVar = new androidx.constraintlayout.core.state.zy(this, nVar);
                zyVar.zy(obj);
                this.f47684toq.put(obj, zyVar);
            } else {
                f7l8Var = new androidx.constraintlayout.core.state.helpers.zy(this);
            }
            zyVar = f7l8Var;
            zyVar.zy(obj);
            this.f47684toq.put(obj, zyVar);
        }
        return zyVar;
    }

    /* JADX INFO: renamed from: s */
    public void m1242s() {
        for (Object obj : this.f1946k.keySet()) {
            C0318k c0318kM1239n = m1239n(obj);
            if (c0318kM1239n instanceof C0318k) {
                c0318kM1239n.c8jq(obj);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public C0324y m1243t(androidx.constraintlayout.core.state.toq toqVar) {
        return fu4(toqVar);
    }

    public void t8r() {
        this.f47684toq.clear();
        this.f47685zy.clear();
    }

    public androidx.constraintlayout.core.state.helpers.zy toq(Object obj, q qVar) {
        C0318k c0318kM1239n = m1239n(obj);
        if (c0318kM1239n.mo1187q() == null || !(c0318kM1239n.mo1187q() instanceof androidx.constraintlayout.core.state.helpers.zy)) {
            androidx.constraintlayout.core.state.helpers.zy zyVar = new androidx.constraintlayout.core.state.helpers.zy(this);
            zyVar.py(qVar);
            c0318kM1239n.ch(zyVar);
        }
        return (androidx.constraintlayout.core.state.helpers.zy) c0318kM1239n.mo1187q();
    }

    public C0312g wvg(Object obj) {
        return ld6(obj, 1);
    }

    public C0324y x2(androidx.constraintlayout.core.state.toq toqVar) {
        return zurt(toqVar);
    }

    /* JADX INFO: renamed from: z */
    public C0316y m1244z() {
        return (C0316y) qrj(null, n.VERTICAL_CHAIN);
    }

    public C0324y zurt(androidx.constraintlayout.core.state.toq toqVar) {
        this.f1948q.nmn5(toqVar);
        return this;
    }

    public C0313k zy(Object... objArr) {
        C0313k c0313k = (C0313k) qrj(null, n.ALIGN_HORIZONTALLY);
        c0313k.g1(objArr);
        return c0313k;
    }
}
