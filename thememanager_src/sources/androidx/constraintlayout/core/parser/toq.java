package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: CLContainer.java */
/* JADX INFO: loaded from: classes.dex */
public class toq extends zy {

    /* JADX INFO: renamed from: h */
    ArrayList<zy> f1840h;

    public toq(char[] cArr) {
        super(cArr);
        this.f1840h = new ArrayList<>();
    }

    public static zy zurt(char[] cArr) {
        return new toq(cArr);
    }

    public float a9(String str) throws C0305y {
        zy zyVarFu4 = fu4(str);
        if (zyVarFu4 != null) {
            return zyVarFu4.f7l8();
        }
        throw new C0305y("no float found for key <" + str + ">, found [" + zyVarFu4.ld6() + "] : " + zyVarFu4, this);
    }

    /* JADX INFO: renamed from: c */
    public void m1138c(String str) {
        ArrayList arrayList = new ArrayList();
        for (zy zyVar : this.f1840h) {
            if (((C0303q) zyVar).toq().equals(str)) {
                arrayList.add(zyVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f1840h.remove((zy) it.next());
        }
    }

    public zy d2ok(int i2) {
        if (i2 < 0 || i2 >= this.f1840h.size()) {
            return null;
        }
        return this.f1840h.get(i2);
    }

    public C0299g d3(int i2) throws C0305y {
        zy zyVarNi7 = ni7(i2);
        if (zyVarNi7 instanceof C0299g) {
            return (C0299g) zyVarNi7;
        }
        throw new C0305y("no object at index " + i2, this);
    }

    public String dd(String str) throws C0305y {
        zy zyVarFu4 = fu4(str);
        if (zyVarFu4 instanceof C0304s) {
            return zyVarFu4.toq();
        }
        throw new C0305y("no string found for key <" + str + ">, found [" + (zyVarFu4 != null ? zyVarFu4.ld6() : null) + "] : " + zyVarFu4, this);
    }

    public C0299g eqxt(String str) {
        zy zyVarLvui = lvui(str);
        if (zyVarLvui instanceof C0299g) {
            return (C0299g) zyVarLvui;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public void m1139f(String str, float f2) {
        hyr(str, new C0301n(f2));
    }

    public void fn3e(zy zyVar) {
        this.f1840h.add(zyVar);
        if (f7l8.f1824q) {
            System.out.println("added element " + zyVar + " to " + this);
        }
    }

    public float fti(String str) {
        zy zyVarLvui = lvui(str);
        if (zyVarLvui instanceof C0301n) {
            return zyVarLvui.f7l8();
        }
        return Float.NaN;
    }

    public zy fu4(String str) throws C0305y {
        Iterator<zy> it = this.f1840h.iterator();
        while (it.hasNext()) {
            C0303q c0303q = (C0303q) it.next();
            if (c0303q.toq().equals(str)) {
                return c0303q.vyq();
            }
        }
        throw new C0305y("no element for key <" + str + ">", this);
    }

    public int gvn7(String str) throws C0305y {
        zy zyVarFu4 = fu4(str);
        if (zyVarFu4 != null) {
            return zyVarFu4.mo1135y();
        }
        throw new C0305y("no int found for key <" + str + ">, found [" + zyVarFu4.ld6() + "] : " + zyVarFu4, this);
    }

    public void hyr(String str, zy zyVar) {
        Iterator<zy> it = this.f1840h.iterator();
        while (it.hasNext()) {
            C0303q c0303q = (C0303q) it.next();
            if (c0303q.toq().equals(str)) {
                c0303q.m1137e(zyVar);
                return;
            }
        }
        this.f1840h.add((C0303q) C0303q.lrht(str, zyVar));
    }

    public float jk(int i2) throws C0305y {
        zy zyVarNi7 = ni7(i2);
        if (zyVarNi7 != null) {
            return zyVarNi7.f7l8();
        }
        throw new C0305y("no float at index " + i2, this);
    }

    public int jp0y(int i2) throws C0305y {
        zy zyVarNi7 = ni7(i2);
        if (zyVarNi7 != null) {
            return zyVarNi7.mo1135y();
        }
        throw new C0305y("no int at index " + i2, this);
    }

    /* JADX INFO: renamed from: l */
    public boolean m1140l(String str) {
        for (zy zyVar : this.f1840h) {
            if ((zyVar instanceof C0303q) && ((C0303q) zyVar).toq().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public zy lvui(String str) {
        Iterator<zy> it = this.f1840h.iterator();
        while (it.hasNext()) {
            C0303q c0303q = (C0303q) it.next();
            if (c0303q.toq().equals(str)) {
                return c0303q.vyq();
            }
        }
        return null;
    }

    public boolean mcp(String str) throws C0305y {
        zy zyVarFu4 = fu4(str);
        if (zyVarFu4 instanceof C0302p) {
            return ((C0302p) zyVarFu4).zurt();
        }
        throw new C0305y("no boolean found for key <" + str + ">, found [" + zyVarFu4.ld6() + "] : " + zyVarFu4, this);
    }

    public ArrayList<String> n5r1() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (zy zyVar : this.f1840h) {
            if (zyVar instanceof C0303q) {
                arrayList.add(((C0303q) zyVar).toq());
            }
        }
        return arrayList;
    }

    public String ncyb(String str) {
        zy zyVarLvui = lvui(str);
        if (zyVarLvui instanceof C0304s) {
            return zyVarLvui.toq();
        }
        return null;
    }

    public zy ni7(int i2) throws C0305y {
        if (i2 >= 0 && i2 < this.f1840h.size()) {
            return this.f1840h.get(i2);
        }
        throw new C0305y("no element at index " + i2, this);
    }

    public C0300k o1t(String str) throws C0305y {
        zy zyVarFu4 = fu4(str);
        if (zyVarFu4 instanceof C0300k) {
            return (C0300k) zyVarFu4;
        }
        throw new C0305y("no array found for key <" + str + ">, found [" + zyVarFu4.ld6() + "] : " + zyVarFu4, this);
    }

    public C0299g oc(String str) throws C0305y {
        zy zyVarFu4 = fu4(str);
        if (zyVarFu4 instanceof C0299g) {
            return (C0299g) zyVarFu4;
        }
        throw new C0305y("no object found for key <" + str + ">, found [" + zyVarFu4.ld6() + "] : " + zyVarFu4, this);
    }

    /* JADX INFO: renamed from: r */
    public String m1141r(int i2) throws C0305y {
        zy zyVarNi7 = ni7(i2);
        if (zyVarNi7 instanceof C0304s) {
            return zyVarNi7.toq();
        }
        throw new C0305y("no string at index " + i2, this);
    }

    public int size() {
        return this.f1840h.size();
    }

    /* JADX INFO: renamed from: t */
    public boolean m1142t(int i2) throws C0305y {
        zy zyVarNi7 = ni7(i2);
        if (zyVarNi7 instanceof C0302p) {
            return ((C0302p) zyVarNi7).zurt();
        }
        throw new C0305y("no boolean at index " + i2, this);
    }

    @Override // androidx.constraintlayout.core.parser.zy
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (zy zyVar : this.f1840h) {
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(zyVar);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    public C0300k wvg(String str) {
        zy zyVarLvui = lvui(str);
        if (zyVarLvui instanceof C0300k) {
            return (C0300k) zyVarLvui;
        }
        return null;
    }

    public String x9kr(int i2) {
        zy zyVarD2ok = d2ok(i2);
        if (zyVarD2ok instanceof C0304s) {
            return zyVarD2ok.toq();
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public C0300k m1143z(int i2) throws C0305y {
        zy zyVarNi7 = ni7(i2);
        if (zyVarNi7 instanceof C0300k) {
            return (C0300k) zyVarNi7;
        }
        throw new C0305y("no array at index " + i2, this);
    }
}
