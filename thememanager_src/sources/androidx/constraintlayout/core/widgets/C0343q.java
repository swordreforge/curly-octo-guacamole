package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0307s;
import androidx.constraintlayout.core.widgets.analyzer.C0334s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.q */
/* JADX INFO: compiled from: ConstraintAnchor.java */
/* JADX INFO: loaded from: classes.dex */
public class C0343q {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f47952ld6 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: p */
    private static final boolean f2067p = false;

    /* JADX INFO: renamed from: g */
    public C0343q f2068g;

    /* JADX INFO: renamed from: n */
    public final toq f2070n;

    /* JADX INFO: renamed from: q */
    public final C0341n f2071q;

    /* JADX INFO: renamed from: s */
    C0307s f2072s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f47954toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f47955zy;

    /* JADX INFO: renamed from: k */
    private HashSet<C0343q> f2069k = null;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public int f47953f7l8 = 0;

    /* JADX INFO: renamed from: y */
    int f2073y = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.q$k */
    /* JADX INFO: compiled from: ConstraintAnchor.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f2074k;

        static {
            int[] iArr = new int[toq.values().length];
            f2074k = iArr;
            try {
                iArr[toq.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2074k[toq.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2074k[toq.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2074k[toq.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2074k[toq.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2074k[toq.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2074k[toq.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2074k[toq.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2074k[toq.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.q$toq */
    /* JADX INFO: compiled from: ConstraintAnchor.java */
    public enum toq {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0343q(C0341n c0341n, toq toqVar) {
        this.f2071q = c0341n;
        this.f2070n = toqVar;
    }

    private boolean t8r(C0341n c0341n, HashSet<C0341n> hashSet) {
        if (hashSet.contains(c0341n)) {
            return false;
        }
        hashSet.add(c0341n);
        if (c0341n == m1341s()) {
            return true;
        }
        ArrayList<C0343q> arrayListT8r = c0341n.t8r();
        int size = arrayListT8r.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0343q c0343q = arrayListT8r.get(i2);
            if (c0343q.fn3e(this) && c0343q.m1335h() && t8r(c0343q.ld6().m1341s(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public boolean cdj(C0341n c0341n) {
        if (t8r(c0341n, new HashSet<>())) {
            return false;
        }
        C0341n c0341nM1318f = m1341s().m1318f();
        return c0341nM1318f == c0341n || c0341n.m1318f() == c0341nM1318f;
    }

    public int f7l8() {
        C0343q c0343q;
        if (this.f2071q.a98o() == 8) {
            return 0;
        }
        return (this.f2073y == Integer.MIN_VALUE || (c0343q = this.f2068g) == null || c0343q.f2071q.a98o() != 8) ? this.f47953f7l8 : this.f2073y;
    }

    public boolean fn3e(C0343q c0343q) {
        toq toqVarX2 = c0343q.x2();
        toq toqVar = this.f2070n;
        if (toqVarX2 == toqVar) {
            return true;
        }
        switch (k.f2074k[toqVar.ordinal()]) {
            case 1:
                return toqVarX2 != toq.BASELINE;
            case 2:
            case 3:
            case 7:
                return toqVarX2 == toq.LEFT || toqVarX2 == toq.RIGHT || toqVarX2 == toq.CENTER_X;
            case 4:
            case 5:
            case 6:
            case 8:
                return toqVarX2 == toq.TOP || toqVarX2 == toq.BOTTOM || toqVarX2 == toq.CENTER_Y || toqVarX2 == toq.BASELINE;
            case 9:
                return false;
            default:
                throw new AssertionError(this.f2070n.name());
        }
    }

    public void fu4() {
        HashSet<C0343q> hashSet;
        C0343q c0343q = this.f2068g;
        if (c0343q != null && (hashSet = c0343q.f2069k) != null) {
            hashSet.remove(this);
            if (this.f2068g.f2069k.size() == 0) {
                this.f2068g.f2069k = null;
            }
        }
        this.f2069k = null;
        this.f2068g = null;
        this.f47953f7l8 = 0;
        this.f2073y = Integer.MIN_VALUE;
        this.f47955zy = false;
        this.f47954toq = 0;
    }

    /* JADX INFO: renamed from: g */
    public int m1334g() {
        if (this.f47955zy) {
            return this.f47954toq;
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public boolean m1335h() {
        return this.f2068g != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m1336i() {
        switch (k.f2074k[this.f2070n.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new AssertionError(this.f2070n.name());
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean m1337k(C0343q c0343q, int i2) {
        return toq(c0343q, i2, Integer.MIN_VALUE, false);
    }

    public boolean ki(C0341n c0341n, C0343q c0343q) {
        return cdj(c0341n);
    }

    public boolean kja0() {
        return this.f47955zy;
    }

    public C0343q ld6() {
        return this.f2068g;
    }

    public void mcp(int i2) {
        if (m1335h()) {
            this.f47953f7l8 = i2;
        }
    }

    /* JADX INFO: renamed from: n */
    public HashSet<C0343q> m1338n() {
        return this.f2069k;
    }

    public boolean n7h() {
        HashSet<C0343q> hashSet = this.f2069k;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean ni7() {
        switch (k.f2074k[this.f2070n.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
                return true;
            default:
                throw new AssertionError(this.f2070n.name());
        }
    }

    public void o1t(androidx.constraintlayout.core.zy zyVar) {
        C0307s c0307s = this.f2072s;
        if (c0307s == null) {
            this.f2072s = new C0307s(C0307s.toq.UNRESTRICTED, (String) null);
        } else {
            c0307s.ld6();
        }
    }

    /* JADX INFO: renamed from: p */
    public C0307s m1339p() {
        return this.f2072s;
    }

    /* JADX INFO: renamed from: q */
    public void m1340q(int i2, ArrayList<androidx.constraintlayout.core.widgets.analyzer.kja0> arrayList, androidx.constraintlayout.core.widgets.analyzer.kja0 kja0Var) {
        HashSet<C0343q> hashSet = this.f2069k;
        if (hashSet != null) {
            Iterator<C0343q> it = hashSet.iterator();
            while (it.hasNext()) {
                C0334s.m1286k(it.next().f2071q, i2, arrayList, kja0Var);
            }
        }
    }

    public boolean qrj() {
        HashSet<C0343q> hashSet = this.f2069k;
        if (hashSet == null) {
            return false;
        }
        Iterator<C0343q> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m1343y().m1335h()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public C0341n m1341s() {
        return this.f2071q;
    }

    /* JADX INFO: renamed from: t */
    public void m1342t(int i2) {
        if (m1335h()) {
            this.f2073y = i2;
        }
    }

    public String toString() {
        return this.f2071q.m1332z() + ":" + this.f2070n.toString();
    }

    public boolean toq(C0343q c0343q, int i2, int i3, boolean z2) {
        if (c0343q == null) {
            fu4();
            return true;
        }
        if (!z2 && !zurt(c0343q)) {
            return false;
        }
        this.f2068g = c0343q;
        if (c0343q.f2069k == null) {
            c0343q.f2069k = new HashSet<>();
        }
        HashSet<C0343q> hashSet = this.f2068g.f2069k;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f47953f7l8 = i2;
        this.f2073y = i3;
        return true;
    }

    public void wvg(int i2) {
        this.f47954toq = i2;
        this.f47955zy = true;
    }

    public toq x2() {
        return this.f2070n;
    }

    /* JADX INFO: renamed from: y */
    public final C0343q m1343y() {
        switch (k.f2074k[this.f2070n.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f2071q.f47903n5r1;
            case 3:
                return this.f2071q.f47905ncyb;
            case 4:
                return this.f2071q.f47887hyr;
            case 5:
                return this.f2071q.f2051l;
            default:
                throw new AssertionError(this.f2070n.name());
        }
    }

    /* JADX INFO: renamed from: z */
    public void m1344z() {
        this.f47955zy = false;
        this.f47954toq = 0;
    }

    public boolean zurt(C0343q c0343q) {
        if (c0343q == null) {
            return false;
        }
        toq toqVarX2 = c0343q.x2();
        toq toqVar = this.f2070n;
        if (toqVarX2 == toqVar) {
            return toqVar != toq.BASELINE || (c0343q.m1341s().nmn5() && m1341s().nmn5());
        }
        switch (k.f2074k[toqVar.ordinal()]) {
            case 1:
                return (toqVarX2 == toq.BASELINE || toqVarX2 == toq.CENTER_X || toqVarX2 == toq.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = toqVarX2 == toq.LEFT || toqVarX2 == toq.RIGHT;
                if (c0343q.m1341s() instanceof C0345y) {
                    return z2 || toqVarX2 == toq.CENTER_X;
                }
                return z2;
            case 4:
            case 5:
                boolean z3 = toqVarX2 == toq.TOP || toqVarX2 == toq.BOTTOM;
                if (c0343q.m1341s() instanceof C0345y) {
                    return z3 || toqVarX2 == toq.CENTER_Y;
                }
                return z3;
            case 6:
                return (toqVarX2 == toq.LEFT || toqVarX2 == toq.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f2070n.name());
        }
    }

    public void zy(C0343q c0343q, HashMap<C0341n, C0341n> map) {
        HashSet<C0343q> hashSet;
        C0343q c0343q2 = this.f2068g;
        if (c0343q2 != null && (hashSet = c0343q2.f2069k) != null) {
            hashSet.remove(this);
        }
        C0343q c0343q3 = c0343q.f2068g;
        if (c0343q3 != null) {
            this.f2068g = map.get(c0343q.f2068g.f2071q).ki(c0343q3.x2());
        } else {
            this.f2068g = null;
        }
        C0343q c0343q4 = this.f2068g;
        if (c0343q4 != null) {
            if (c0343q4.f2069k == null) {
                c0343q4.f2069k = new HashSet<>();
            }
            this.f2068g.f2069k.add(this);
        }
        this.f47953f7l8 = c0343q.f47953f7l8;
        this.f2073y = c0343q.f2073y;
    }
}
