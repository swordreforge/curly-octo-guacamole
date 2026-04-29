package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.AbstractC0277i;
import androidx.constraintlayout.core.motion.utils.kja0;
import androidx.constraintlayout.core.motion.utils.ni7;
import androidx.constraintlayout.core.motion.utils.zurt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.constraintlayout.core.motion.key.g */
/* JADX INFO: compiled from: MotionKeyTimeCycle.java */
/* JADX INFO: loaded from: classes.dex */
public class C0267g extends toq {

    /* JADX INFO: renamed from: l */
    private static final String f1472l = "KeyTimeCycle";

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    public static final int f47155n5r1 = 3;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    static final String f47156ncyb = "KeyTimeCycle";

    /* JADX INFO: renamed from: z */
    private String f1475z;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private int f47168o1t = -1;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private float f47170wvg = Float.NaN;

    /* JADX INFO: renamed from: t */
    private float f1474t = Float.NaN;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private float f47167mcp = Float.NaN;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private float f47164jk = Float.NaN;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private float f47157a9 = Float.NaN;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private float f47162fti = Float.NaN;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private float f47165jp0y = Float.NaN;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private float f47163gvn7 = Float.NaN;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private float f47159d3 = Float.NaN;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private float f47169oc = Float.NaN;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private float f47161eqxt = Float.NaN;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private float f47158d2ok = Float.NaN;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private int f47166lvui = 0;

    /* JADX INFO: renamed from: r */
    private String f1473r = null;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private float f47160dd = Float.NaN;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private float f47171x9kr = 0.0f;

    public C0267g() {
        this.f47227ld6 = 3;
        this.f47228x2 = new HashMap<>();
    }

    @Override // androidx.constraintlayout.core.motion.key.toq
    /* JADX INFO: renamed from: f7l8 */
    public toq clone() {
        return new C0267g().mo952y(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.toq
    /* JADX INFO: renamed from: g */
    public void mo950g(HashMap<String, kja0> map) {
    }

    @Override // androidx.constraintlayout.core.motion.utils.zurt
    /* JADX INFO: renamed from: k */
    public int mo933k(String str) {
        return zurt.zy.m1093k(str);
    }

    @Override // androidx.constraintlayout.core.motion.key.toq, androidx.constraintlayout.core.motion.utils.zurt
    /* JADX INFO: renamed from: n */
    public boolean mo935n(int i2, String str) {
        if (i2 == 420) {
            this.f1475z = str;
            return true;
        }
        if (i2 != 421) {
            return super.mo935n(i2, str);
        }
        this.f47166lvui = 7;
        this.f1473r = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.toq
    /* JADX INFO: renamed from: ni7, reason: merged with bridge method [inline-methods] */
    public C0267g mo952y(toq toqVar) {
        super.mo952y(toqVar);
        C0267g c0267g = (C0267g) toqVar;
        this.f1475z = c0267g.f1475z;
        this.f47168o1t = c0267g.f47168o1t;
        this.f47166lvui = c0267g.f47166lvui;
        this.f47160dd = c0267g.f47160dd;
        this.f47171x9kr = c0267g.f47171x9kr;
        this.f47158d2ok = c0267g.f47158d2ok;
        this.f47170wvg = c0267g.f47170wvg;
        this.f1474t = c0267g.f1474t;
        this.f47167mcp = c0267g.f47167mcp;
        this.f47162fti = c0267g.f47162fti;
        this.f47164jk = c0267g.f47164jk;
        this.f47157a9 = c0267g.f47157a9;
        this.f47165jp0y = c0267g.f47165jp0y;
        this.f47163gvn7 = c0267g.f47163gvn7;
        this.f47159d3 = c0267g.f47159d3;
        this.f47169oc = c0267g.f47169oc;
        this.f47161eqxt = c0267g.f47161eqxt;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.toq, androidx.constraintlayout.core.motion.utils.zurt
    /* JADX INFO: renamed from: q */
    public boolean mo937q(int i2, boolean z2) {
        return super.mo937q(i2, z2);
    }

    @Override // androidx.constraintlayout.core.motion.key.toq
    /* JADX INFO: renamed from: s */
    public void mo951s(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f47170wvg)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f1474t)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f47167mcp)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f47164jk)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f47157a9)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f47165jp0y)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f47163gvn7)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f47162fti)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f47159d3)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f47169oc)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f47161eqxt)) {
            hashSet.add("translationZ");
        }
        if (this.f47228x2.size() > 0) {
            Iterator<String> it = this.f47228x2.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.toq, androidx.constraintlayout.core.motion.utils.zurt
    public boolean toq(int i2, int i3) {
        if (i2 == 100) {
            this.f1500y = i3;
            return true;
        }
        if (i2 != 421) {
            return super.toq(i2, i3);
        }
        this.f47166lvui = i3;
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void zurt(HashMap<String, AbstractC0277i> map) {
        for (String str : map.keySet()) {
            AbstractC0277i abstractC0277i = map.get(str);
            if (abstractC0277i != null) {
                byte b2 = 7;
                if (!str.startsWith("CUSTOM")) {
                    switch (str.hashCode()) {
                        case -1249320806:
                            b2 = str.equals("rotationX") ? (byte) 0 : (byte) -1;
                            break;
                        case -1249320805:
                            b2 = str.equals("rotationY") ? (byte) 1 : (byte) -1;
                            break;
                        case -1249320804:
                            b2 = str.equals("rotationZ") ? (byte) 2 : (byte) -1;
                            break;
                        case -1225497657:
                            b2 = str.equals("translationX") ? (byte) 3 : (byte) -1;
                            break;
                        case -1225497656:
                            b2 = str.equals("translationY") ? (byte) 4 : (byte) -1;
                            break;
                        case -1225497655:
                            b2 = str.equals("translationZ") ? (byte) 5 : (byte) -1;
                            break;
                        case -1001078227:
                            b2 = str.equals("progress") ? (byte) 6 : (byte) -1;
                            break;
                        case -908189618:
                            if (!str.equals("scaleX")) {
                                b2 = -1;
                            }
                            break;
                        case -908189617:
                            b2 = str.equals("scaleY") ? (byte) 8 : (byte) -1;
                            break;
                        case -4379043:
                            b2 = str.equals("elevation") ? (byte) 9 : (byte) -1;
                            break;
                        case 92909918:
                            b2 = str.equals("alpha") ? (byte) 10 : (byte) -1;
                            break;
                        case 803192288:
                            b2 = str.equals("pathRotate") ? com.google.common.base.zy.f68132qrj : (byte) -1;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                            if (!Float.isNaN(this.f47164jk)) {
                                abstractC0277i.zy(this.f1500y, this.f47164jk, this.f47160dd, this.f47166lvui, this.f47171x9kr);
                            }
                            break;
                        case 1:
                            if (!Float.isNaN(this.f47157a9)) {
                                abstractC0277i.zy(this.f1500y, this.f47157a9, this.f47160dd, this.f47166lvui, this.f47171x9kr);
                            }
                            break;
                        case 2:
                            if (!Float.isNaN(this.f47167mcp)) {
                                abstractC0277i.zy(this.f1500y, this.f47167mcp, this.f47160dd, this.f47166lvui, this.f47171x9kr);
                            }
                            break;
                        case 3:
                            if (!Float.isNaN(this.f47159d3)) {
                                abstractC0277i.zy(this.f1500y, this.f47159d3, this.f47160dd, this.f47166lvui, this.f47171x9kr);
                            }
                            break;
                        case 4:
                            if (!Float.isNaN(this.f47169oc)) {
                                abstractC0277i.zy(this.f1500y, this.f47169oc, this.f47160dd, this.f47166lvui, this.f47171x9kr);
                            }
                            break;
                        case 5:
                            if (!Float.isNaN(this.f47161eqxt)) {
                                abstractC0277i.zy(this.f1500y, this.f47161eqxt, this.f47160dd, this.f47166lvui, this.f47171x9kr);
                            }
                            break;
                        case 6:
                            if (!Float.isNaN(this.f47158d2ok)) {
                                abstractC0277i.zy(this.f1500y, this.f47158d2ok, this.f47160dd, this.f47166lvui, this.f47171x9kr);
                            }
                            break;
                        case 7:
                            if (!Float.isNaN(this.f47165jp0y)) {
                                abstractC0277i.zy(this.f1500y, this.f47165jp0y, this.f47160dd, this.f47166lvui, this.f47171x9kr);
                            }
                            break;
                        case 8:
                            if (!Float.isNaN(this.f47163gvn7)) {
                                abstractC0277i.zy(this.f1500y, this.f47163gvn7, this.f47160dd, this.f47166lvui, this.f47171x9kr);
                            }
                            break;
                        case 9:
                            if (!Float.isNaN(this.f47161eqxt)) {
                                abstractC0277i.zy(this.f1500y, this.f47161eqxt, this.f47160dd, this.f47166lvui, this.f47171x9kr);
                            }
                            break;
                        case 10:
                            if (!Float.isNaN(this.f47170wvg)) {
                                abstractC0277i.zy(this.f1500y, this.f47170wvg, this.f47160dd, this.f47166lvui, this.f47171x9kr);
                            }
                            break;
                        case 11:
                            if (!Float.isNaN(this.f47162fti)) {
                                abstractC0277i.zy(this.f1500y, this.f47162fti, this.f47160dd, this.f47166lvui, this.f47171x9kr);
                            }
                            break;
                        default:
                            ni7.m1040g("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    androidx.constraintlayout.core.motion.toq toqVar = this.f47228x2.get(str.substring(7));
                    if (toqVar != null) {
                        ((AbstractC0277i.toq) abstractC0277i).f7l8(this.f1500y, toqVar, this.f47160dd, this.f47166lvui, this.f47171x9kr);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.toq, androidx.constraintlayout.core.motion.utils.zurt
    public boolean zy(int i2, float f2) {
        if (i2 == 315) {
            this.f47158d2ok = m957i(Float.valueOf(f2));
            return true;
        }
        if (i2 == 401) {
            this.f47168o1t = fn3e(Float.valueOf(f2));
            return true;
        }
        if (i2 == 403) {
            this.f47170wvg = f2;
            return true;
        }
        if (i2 == 416) {
            this.f47162fti = m957i(Float.valueOf(f2));
            return true;
        }
        if (i2 == 423) {
            this.f47160dd = m957i(Float.valueOf(f2));
            return true;
        }
        if (i2 == 424) {
            this.f47171x9kr = m957i(Float.valueOf(f2));
            return true;
        }
        switch (i2) {
            case 304:
                this.f47159d3 = m957i(Float.valueOf(f2));
                return true;
            case 305:
                this.f47169oc = m957i(Float.valueOf(f2));
                return true;
            case 306:
                this.f47161eqxt = m957i(Float.valueOf(f2));
                return true;
            case 307:
                this.f1474t = m957i(Float.valueOf(f2));
                return true;
            case 308:
                this.f47164jk = m957i(Float.valueOf(f2));
                return true;
            case 309:
                this.f47157a9 = m957i(Float.valueOf(f2));
                return true;
            case 310:
                this.f47167mcp = m957i(Float.valueOf(f2));
                return true;
            case 311:
                this.f47165jp0y = m957i(Float.valueOf(f2));
                return true;
            case 312:
                this.f47163gvn7 = m957i(Float.valueOf(f2));
                return true;
            default:
                return super.zy(i2, f2);
        }
    }
}
