package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.kja0;
import androidx.constraintlayout.core.motion.utils.zurt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: MotionKeyAttributes.java */
/* JADX INFO: loaded from: classes.dex */
public class zy extends toq {

    /* JADX INFO: renamed from: l */
    private static final boolean f1501l = false;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    public static final int f47229n5r1 = 1;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private static final String f47230ncyb = "KeyAttributes";

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    static final String f47231x9kr = "KeyAttribute";

    /* JADX INFO: renamed from: z */
    private String f1504z;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private int f47243o1t = -1;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private int f47245wvg = 0;

    /* JADX INFO: renamed from: t */
    private float f1503t = Float.NaN;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private float f47242mcp = Float.NaN;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private float f47239jk = Float.NaN;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private float f47232a9 = Float.NaN;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private float f47237fti = Float.NaN;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private float f47240jp0y = Float.NaN;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private float f47238gvn7 = Float.NaN;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private float f47234d3 = Float.NaN;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private float f47244oc = Float.NaN;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private float f47236eqxt = Float.NaN;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private float f47233d2ok = Float.NaN;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private float f47241lvui = Float.NaN;

    /* JADX INFO: renamed from: r */
    private float f1502r = Float.NaN;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private float f47235dd = Float.NaN;

    public zy() {
        this.f47227ld6 = 1;
        this.f47228x2 = new HashMap<>();
    }

    private float ni7(int i2) {
        if (i2 == 100) {
            return this.f1500y;
        }
        switch (i2) {
            case 303:
                return this.f1503t;
            case 304:
                return this.f47233d2ok;
            case 305:
                return this.f47241lvui;
            case 306:
                return this.f1502r;
            case 307:
                return this.f47242mcp;
            case 308:
                return this.f47232a9;
            case 309:
                return this.f47237fti;
            case 310:
                return this.f47239jk;
            case 311:
                return this.f47244oc;
            case 312:
                return this.f47236eqxt;
            case 313:
                return this.f47240jp0y;
            case 314:
                return this.f47238gvn7;
            case 315:
                return this.f47235dd;
            case zurt.InterfaceC0290k.f47401cdj /* 316 */:
                return this.f47234d3;
            default:
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.toq
    public void cdj(HashMap<String, Integer> map) {
        if (!Float.isNaN(this.f1503t)) {
            map.put("alpha", Integer.valueOf(this.f47243o1t));
        }
        if (!Float.isNaN(this.f47242mcp)) {
            map.put("elevation", Integer.valueOf(this.f47243o1t));
        }
        if (!Float.isNaN(this.f47239jk)) {
            map.put("rotationZ", Integer.valueOf(this.f47243o1t));
        }
        if (!Float.isNaN(this.f47232a9)) {
            map.put("rotationX", Integer.valueOf(this.f47243o1t));
        }
        if (!Float.isNaN(this.f47237fti)) {
            map.put("rotationY", Integer.valueOf(this.f47243o1t));
        }
        if (!Float.isNaN(this.f47240jp0y)) {
            map.put("pivotX", Integer.valueOf(this.f47243o1t));
        }
        if (!Float.isNaN(this.f47238gvn7)) {
            map.put("pivotY", Integer.valueOf(this.f47243o1t));
        }
        if (!Float.isNaN(this.f47233d2ok)) {
            map.put("translationX", Integer.valueOf(this.f47243o1t));
        }
        if (!Float.isNaN(this.f47241lvui)) {
            map.put("translationY", Integer.valueOf(this.f47243o1t));
        }
        if (!Float.isNaN(this.f1502r)) {
            map.put("translationZ", Integer.valueOf(this.f47243o1t));
        }
        if (!Float.isNaN(this.f47234d3)) {
            map.put("pathRotate", Integer.valueOf(this.f47243o1t));
        }
        if (!Float.isNaN(this.f47244oc)) {
            map.put("scaleX", Integer.valueOf(this.f47243o1t));
        }
        if (!Float.isNaN(this.f47236eqxt)) {
            map.put("scaleY", Integer.valueOf(this.f47243o1t));
        }
        if (!Float.isNaN(this.f47235dd)) {
            map.put("progress", Integer.valueOf(this.f47243o1t));
        }
        if (this.f47228x2.size() > 0) {
            Iterator<String> it = this.f47228x2.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), Integer.valueOf(this.f47243o1t));
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.toq
    /* JADX INFO: renamed from: f7l8 */
    public toq clone() {
        return null;
    }

    public void fu4() {
        HashSet<String> hashSet = new HashSet<>();
        mo951s(hashSet);
        System.out.println(" ------------- " + this.f1500y + " -------------");
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            int iM1087k = zurt.InterfaceC0290k.m1087k(strArr[i2]);
            System.out.println(strArr[i2] + ":" + ni7(iM1087k));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.core.motion.key.toq
    /* JADX INFO: renamed from: g */
    public void mo950g(HashMap<String, kja0> map) {
        for (String str : map.keySet()) {
            kja0 kja0Var = map.get(str);
            if (kja0Var != null) {
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
                        case -987906986:
                            if (!str.equals("pivotX")) {
                                b2 = -1;
                            }
                            break;
                        case -987906985:
                            b2 = str.equals("pivotY") ? (byte) 8 : (byte) -1;
                            break;
                        case -908189618:
                            b2 = str.equals("scaleX") ? (byte) 9 : (byte) -1;
                            break;
                        case -908189617:
                            b2 = str.equals("scaleY") ? (byte) 10 : (byte) -1;
                            break;
                        case -4379043:
                            b2 = str.equals("elevation") ? com.google.common.base.zy.f68132qrj : (byte) -1;
                            break;
                        case 92909918:
                            b2 = str.equals("alpha") ? com.google.common.base.zy.f68128n7h : (byte) -1;
                            break;
                        case 803192288:
                            b2 = str.equals("pathRotate") ? com.google.common.base.zy.f68124kja0 : (byte) -1;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                            if (!Float.isNaN(this.f47232a9)) {
                                kja0Var.f7l8(this.f1500y, this.f47232a9);
                            }
                            break;
                        case 1:
                            if (!Float.isNaN(this.f47237fti)) {
                                kja0Var.f7l8(this.f1500y, this.f47237fti);
                            }
                            break;
                        case 2:
                            if (!Float.isNaN(this.f47239jk)) {
                                kja0Var.f7l8(this.f1500y, this.f47239jk);
                            }
                            break;
                        case 3:
                            if (!Float.isNaN(this.f47233d2ok)) {
                                kja0Var.f7l8(this.f1500y, this.f47233d2ok);
                            }
                            break;
                        case 4:
                            if (!Float.isNaN(this.f47241lvui)) {
                                kja0Var.f7l8(this.f1500y, this.f47241lvui);
                            }
                            break;
                        case 5:
                            if (!Float.isNaN(this.f1502r)) {
                                kja0Var.f7l8(this.f1500y, this.f1502r);
                            }
                            break;
                        case 6:
                            if (!Float.isNaN(this.f47235dd)) {
                                kja0Var.f7l8(this.f1500y, this.f47235dd);
                            }
                            break;
                        case 7:
                            if (!Float.isNaN(this.f47232a9)) {
                                kja0Var.f7l8(this.f1500y, this.f47240jp0y);
                            }
                            break;
                        case 8:
                            if (!Float.isNaN(this.f47237fti)) {
                                kja0Var.f7l8(this.f1500y, this.f47238gvn7);
                            }
                            break;
                        case 9:
                            if (!Float.isNaN(this.f47244oc)) {
                                kja0Var.f7l8(this.f1500y, this.f47244oc);
                            }
                            break;
                        case 10:
                            if (!Float.isNaN(this.f47236eqxt)) {
                                kja0Var.f7l8(this.f1500y, this.f47236eqxt);
                            }
                            break;
                        case 11:
                            if (!Float.isNaN(this.f47242mcp)) {
                                kja0Var.f7l8(this.f1500y, this.f47242mcp);
                            }
                            break;
                        case 12:
                            if (!Float.isNaN(this.f1503t)) {
                                kja0Var.f7l8(this.f1500y, this.f1503t);
                            }
                            break;
                        case 13:
                            if (!Float.isNaN(this.f47234d3)) {
                                kja0Var.f7l8(this.f1500y, this.f47234d3);
                            }
                            break;
                        default:
                            System.err.println("not supported by KeyAttributes " + str);
                            break;
                    }
                } else {
                    androidx.constraintlayout.core.motion.toq toqVar = this.f47228x2.get(str.substring(7));
                    if (toqVar != null) {
                        ((kja0.zy) kja0Var).ld6(this.f1500y, toqVar);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.zurt
    /* JADX INFO: renamed from: k */
    public int mo933k(String str) {
        return zurt.InterfaceC0290k.m1087k(str);
    }

    @Override // androidx.constraintlayout.core.motion.key.toq, androidx.constraintlayout.core.motion.utils.zurt
    /* JADX INFO: renamed from: n */
    public boolean mo935n(int i2, String str) {
        if (i2 == 101) {
            this.f1498p = str;
            return true;
        }
        if (i2 != 317) {
            return super.mo935n(i2, str);
        }
        this.f1504z = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.toq
    /* JADX INFO: renamed from: s */
    public void mo951s(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f1503t)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f47242mcp)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f47239jk)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f47232a9)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f47237fti)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f47240jp0y)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.f47238gvn7)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.f47233d2ok)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f47241lvui)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f1502r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f47234d3)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f47244oc)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f47236eqxt)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f47235dd)) {
            hashSet.add("progress");
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
        if (i2 == 301) {
            this.f47243o1t = i3;
            return true;
        }
        if (i2 == 302) {
            this.f47245wvg = i3;
            return true;
        }
        if (toq(i2, i3)) {
            return true;
        }
        return super.toq(i2, i3);
    }

    public int zurt() {
        return this.f47243o1t;
    }

    @Override // androidx.constraintlayout.core.motion.key.toq, androidx.constraintlayout.core.motion.utils.zurt
    public boolean zy(int i2, float f2) {
        if (i2 == 100) {
            this.f47234d3 = f2;
            return true;
        }
        switch (i2) {
            case 303:
                this.f1503t = f2;
                return true;
            case 304:
                this.f47233d2ok = f2;
                return true;
            case 305:
                this.f47241lvui = f2;
                return true;
            case 306:
                this.f1502r = f2;
                return true;
            case 307:
                this.f47242mcp = f2;
                return true;
            case 308:
                this.f47232a9 = f2;
                return true;
            case 309:
                this.f47237fti = f2;
                return true;
            case 310:
                this.f47239jk = f2;
                return true;
            case 311:
                this.f47244oc = f2;
                return true;
            case 312:
                this.f47236eqxt = f2;
                return true;
            case 313:
                this.f47240jp0y = f2;
                return true;
            case 314:
                this.f47238gvn7 = f2;
                return true;
            case 315:
                this.f47235dd = f2;
                return true;
            case zurt.InterfaceC0290k.f47401cdj /* 316 */:
                this.f47234d3 = f2;
                return true;
            default:
                return super.zy(i2, f2);
        }
    }
}
