package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.C3400s;
import com.google.android.exoplayer2.util.gvn7;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.flv.q */
/* JADX INFO: compiled from: ScriptTagPayloadReader.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3346q extends AbstractC3345n {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f63731cdj = 11;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f63732f7l8 = "keyframes";

    /* JADX INFO: renamed from: g */
    private static final String f19798g = "duration";

    /* JADX INFO: renamed from: h */
    private static final int f19799h = 10;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f63733kja0 = 9;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f63734ld6 = 1;

    /* JADX INFO: renamed from: n */
    private static final String f19800n = "onMetaData";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f63735n7h = 8;

    /* JADX INFO: renamed from: p */
    private static final int f19801p = 0;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f63736qrj = 3;

    /* JADX INFO: renamed from: s */
    private static final String f19802s = "times";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f63737x2 = 2;

    /* JADX INFO: renamed from: y */
    private static final String f19803y = "filepositions";

    /* JADX INFO: renamed from: q */
    private long[] f19804q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f63738toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long[] f63739zy;

    public C3346q() {
        super(new C3400s());
        this.f63738toq = C3548p.f65257toq;
        this.f63739zy = new long[0];
        this.f19804q = new long[0];
    }

    /* JADX INFO: renamed from: h */
    private static int m11713h(gvn7 gvn7Var) {
        return gvn7Var.jp0y();
    }

    private static String kja0(gvn7 gvn7Var) {
        int iLvui = gvn7Var.lvui();
        int iM13596n = gvn7Var.m13596n();
        gvn7Var.hyr(iLvui);
        return new String(gvn7Var.m13598q(), iM13596n, iLvui);
    }

    private static Double ld6(gvn7 gvn7Var) {
        return Double.valueOf(Double.longBitsToDouble(gvn7Var.o1t()));
    }

    private static ArrayList<Object> n7h(gvn7 gvn7Var) {
        int iEqxt = gvn7Var.eqxt();
        ArrayList<Object> arrayList = new ArrayList<>(iEqxt);
        for (int i2 = 0; i2 < iEqxt; i2++) {
            Object objM11715s = m11715s(gvn7Var, m11713h(gvn7Var));
            if (objM11715s != null) {
                arrayList.add(objM11715s);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    private static Date m11714p(gvn7 gvn7Var) {
        Date date = new Date((long) ld6(gvn7Var).doubleValue());
        gvn7Var.hyr(2);
        return date;
    }

    private static HashMap<String, Object> qrj(gvn7 gvn7Var) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strKja0 = kja0(gvn7Var);
            int iM11713h = m11713h(gvn7Var);
            if (iM11713h == 9) {
                return map;
            }
            Object objM11715s = m11715s(gvn7Var, iM11713h);
            if (objM11715s != null) {
                map.put(strKja0, objM11715s);
            }
        }
    }

    @dd
    /* JADX INFO: renamed from: s */
    private static Object m11715s(gvn7 gvn7Var, int i2) {
        if (i2 == 0) {
            return ld6(gvn7Var);
        }
        if (i2 == 1) {
            return m11716y(gvn7Var);
        }
        if (i2 == 2) {
            return kja0(gvn7Var);
        }
        if (i2 == 3) {
            return qrj(gvn7Var);
        }
        if (i2 == 8) {
            return x2(gvn7Var);
        }
        if (i2 == 10) {
            return n7h(gvn7Var);
        }
        if (i2 != 11) {
            return null;
        }
        return m11714p(gvn7Var);
    }

    private static HashMap<String, Object> x2(gvn7 gvn7Var) {
        int iEqxt = gvn7Var.eqxt();
        HashMap<String, Object> map = new HashMap<>(iEqxt);
        for (int i2 = 0; i2 < iEqxt; i2++) {
            String strKja0 = kja0(gvn7Var);
            Object objM11715s = m11715s(gvn7Var, m11713h(gvn7Var));
            if (objM11715s != null) {
                map.put(strKja0, objM11715s);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: y */
    private static Boolean m11716y(gvn7 gvn7Var) {
        return Boolean.valueOf(gvn7Var.jp0y() == 1);
    }

    public long[] f7l8() {
        return this.f63739zy;
    }

    /* JADX INFO: renamed from: g */
    public long[] m11717g() {
        return this.f19804q;
    }

    /* JADX INFO: renamed from: n */
    public long m11718n() {
        return this.f63738toq;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.AbstractC3345n
    /* JADX INFO: renamed from: q */
    public void mo11711q() {
    }

    @Override // com.google.android.exoplayer2.extractor.flv.AbstractC3345n
    protected boolean toq(gvn7 gvn7Var) {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.AbstractC3345n
    protected boolean zy(gvn7 gvn7Var, long j2) {
        if (m11713h(gvn7Var) != 2 || !f19800n.equals(kja0(gvn7Var)) || m11713h(gvn7Var) != 8) {
            return false;
        }
        HashMap<String, Object> mapX2 = x2(gvn7Var);
        Object obj = mapX2.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f63738toq = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapX2.get(f63732f7l8);
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get(f19803y);
            Object obj4 = map.get(f19802s);
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f63739zy = new long[size];
                this.f19804q = new long[size];
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj5 = list.get(i2);
                    Object obj6 = list2.get(i2);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f63739zy = new long[0];
                        this.f19804q = new long[0];
                        break;
                    }
                    this.f63739zy[i2] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f19804q[i2] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }
}
