package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.AbstractC0287y;
import androidx.constraintlayout.core.motion.utils.kja0;
import androidx.constraintlayout.core.motion.utils.ni7;
import androidx.constraintlayout.core.motion.utils.zurt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.constraintlayout.core.motion.key.q */
/* JADX INFO: compiled from: MotionKeyCycle.java */
/* JADX INFO: loaded from: classes.dex */
public class C0270q extends toq {

    /* JADX INFO: renamed from: c */
    public static final String f1486c = "wavePhase";

    /* JADX INFO: renamed from: e */
    public static final int f1487e = 2;

    /* JADX INFO: renamed from: f */
    public static final String f1488f = "waveOffset";

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    public static final int f47194hb = 4;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    public static final String f47195hyr = "wavePeriod";

    /* JADX INFO: renamed from: j */
    public static final int f1489j = 5;

    /* JADX INFO: renamed from: l */
    private static final String f1490l = "KeyCycle";

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    public static final String f47196lrht = "waveShape";

    /* JADX INFO: renamed from: m */
    public static final int f1491m = 4;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    static final String f47197n5r1 = "KeyCycle";

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    public static final int f47198nn86 = 3;

    /* JADX INFO: renamed from: o */
    public static final int f1492o = 6;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    public static final int f47199uv6 = 0;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    public static final int f47200vyq = 1;

    /* JADX INFO: renamed from: z */
    private String f1495z = null;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private int f47213o1t = 0;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private int f47215wvg = -1;

    /* JADX INFO: renamed from: t */
    private String f1494t = null;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private float f47211mcp = Float.NaN;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private float f47208jk = 0.0f;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private float f47201a9 = 0.0f;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private float f47206fti = Float.NaN;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private float f47209jp0y = Float.NaN;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private float f47207gvn7 = Float.NaN;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private float f47203d3 = Float.NaN;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private float f47214oc = Float.NaN;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private float f47205eqxt = Float.NaN;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private float f47202d2ok = Float.NaN;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private float f47210lvui = Float.NaN;

    /* JADX INFO: renamed from: r */
    private float f1493r = Float.NaN;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private float f47204dd = Float.NaN;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private float f47216x9kr = Float.NaN;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private float f47212ncyb = Float.NaN;

    public C0270q() {
        this.f47227ld6 = 4;
        this.f47228x2 = new HashMap<>();
    }

    @Override // androidx.constraintlayout.core.motion.key.toq
    /* JADX INFO: renamed from: f7l8 */
    public toq clone() {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public float fu4(String str) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    b2 = 0;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b2 = 1;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    b2 = 2;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b2 = 3;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b2 = 4;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b2 = 5;
                }
                break;
            case -1019779949:
                if (str.equals(zurt.zy.f1775l)) {
                    b2 = 6;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    b2 = 7;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b2 = 8;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b2 = 9;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b2 = 10;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b2 = com.google.common.base.zy.f68132qrj;
                }
                break;
            case 106629499:
                if (str.equals(zurt.zy.f47501n5r1)) {
                    b2 = com.google.common.base.zy.f68128n7h;
                }
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    b2 = com.google.common.base.zy.f68124kja0;
                }
                break;
        }
        switch (b2) {
            case 0:
                return this.f47205eqxt;
            case 1:
                return this.f47202d2ok;
            case 2:
                return this.f47203d3;
            case 3:
                return this.f47204dd;
            case 4:
                return this.f47216x9kr;
            case 5:
                return this.f47212ncyb;
            case 6:
                return this.f47208jk;
            case 7:
                return this.f47206fti;
            case 8:
                return this.f47210lvui;
            case 9:
                return this.f1493r;
            case 10:
                return this.f47207gvn7;
            case 11:
                return this.f47209jp0y;
            case 12:
                return this.f47201a9;
            case 13:
                return this.f47214oc;
            default:
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.toq
    /* JADX INFO: renamed from: g */
    public void mo950g(HashMap<String, kja0> map) {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.core.motion.utils.zurt
    /* JADX INFO: renamed from: k */
    public int mo933k(String str) {
        byte b2;
        str.hashCode();
        switch (str.hashCode()) {
            case -1581616630:
                b2 = !str.equals(zurt.zy.f47512x9kr) ? (byte) -1 : (byte) 0;
                break;
            case -1310311125:
                b2 = !str.equals("easing") ? (byte) -1 : (byte) 1;
                break;
            case -1249320806:
                b2 = !str.equals("rotationX") ? (byte) -1 : (byte) 2;
                break;
            case -1249320805:
                b2 = !str.equals("rotationY") ? (byte) -1 : (byte) 3;
                break;
            case -1249320804:
                b2 = !str.equals("rotationZ") ? (byte) -1 : (byte) 4;
                break;
            case -1225497657:
                b2 = !str.equals("translationX") ? (byte) -1 : (byte) 5;
                break;
            case -1225497656:
                b2 = !str.equals("translationY") ? (byte) -1 : (byte) 6;
                break;
            case -1225497655:
                b2 = !str.equals("translationZ") ? (byte) -1 : (byte) 7;
                break;
            case -1019779949:
                b2 = !str.equals(zurt.zy.f1775l) ? (byte) -1 : (byte) 8;
                break;
            case -1001078227:
                b2 = !str.equals("progress") ? (byte) -1 : (byte) 9;
                break;
            case -991726143:
                b2 = !str.equals(zurt.zy.f47503ncyb) ? (byte) -1 : (byte) 10;
                break;
            case -987906986:
                b2 = !str.equals("pivotX") ? (byte) -1 : com.google.common.base.zy.f68132qrj;
                break;
            case -987906985:
                b2 = !str.equals("pivotY") ? (byte) -1 : com.google.common.base.zy.f68128n7h;
                break;
            case -908189618:
                b2 = !str.equals("scaleX") ? (byte) -1 : com.google.common.base.zy.f68124kja0;
                break;
            case -908189617:
                b2 = !str.equals("scaleY") ? (byte) -1 : com.google.common.base.zy.f25751h;
                break;
            case 92909918:
                b2 = !str.equals("alpha") ? (byte) -1 : com.google.common.base.zy.f68111cdj;
                break;
            case 106629499:
                b2 = !str.equals(zurt.zy.f47501n5r1) ? (byte) -1 : (byte) 16;
                break;
            case 579057826:
                b2 = !str.equals("curveFit") ? (byte) -1 : (byte) 17;
                break;
            case 803192288:
                b2 = !str.equals("pathRotate") ? (byte) -1 : (byte) 18;
                break;
            case 1532805160:
                b2 = !str.equals("waveShape") ? (byte) -1 : (byte) 19;
                break;
            case 1941332754:
                b2 = !str.equals("visibility") ? (byte) -1 : com.google.common.base.zy.f68119fu4;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return zurt.zy.f1773i;
            case 1:
                return zurt.zy.f47496ki;
            case 2:
                return 308;
            case 3:
                return 309;
            case 4:
                return 310;
            case 5:
                return 304;
            case 6:
                return 305;
            case 7:
                return 306;
            case 8:
                return 424;
            case 9:
                return 315;
            case 10:
                return zurt.zy.f47489fn3e;
            case 11:
                return 313;
            case 12:
                return 314;
            case 13:
                return 311;
            case 14:
                return 312;
            case 15:
                return 403;
            case 16:
                return 425;
            case 17:
                return 401;
            case 18:
                return zurt.zy.f47483cdj;
            case 19:
                return 421;
            case 20:
                return 402;
            default:
                return -1;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.toq, androidx.constraintlayout.core.motion.utils.zurt
    /* JADX INFO: renamed from: n */
    public boolean mo935n(int i2, String str) {
        if (i2 == 420) {
            this.f1495z = str;
            return true;
        }
        if (i2 != 422) {
            return super.mo935n(i2, str);
        }
        this.f1494t = str;
        return true;
    }

    public void ni7() {
        System.out.println("MotionKeyCycle{mWaveShape=" + this.f47215wvg + ", mWavePeriod=" + this.f47211mcp + ", mWaveOffset=" + this.f47208jk + ", mWavePhase=" + this.f47201a9 + ", mRotation=" + this.f47203d3 + '}');
    }

    @Override // androidx.constraintlayout.core.motion.key.toq
    /* JADX INFO: renamed from: s */
    public void mo951s(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f47209jp0y)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f47207gvn7)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f47203d3)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f47205eqxt)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f47202d2ok)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f47210lvui)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f1493r)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f47214oc)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f47204dd)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f47216x9kr)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f47212ncyb)) {
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
        if (i2 == 401) {
            this.f47213o1t = i3;
            return true;
        }
        if (i2 == 421) {
            this.f47215wvg = i3;
            return true;
        }
        if (zy(i2, i3)) {
            return true;
        }
        return super.toq(i2, i3);
    }

    /* JADX INFO: renamed from: z */
    public void m955z() {
        HashSet<String> hashSet = new HashSet<>();
        mo951s(hashSet);
        ni7.zy(" ------------- " + this.f1500y + " -------------");
        ni7.zy("MotionKeyCycle{Shape=" + this.f47215wvg + ", Period=" + this.f47211mcp + ", Offset=" + this.f47208jk + ", Phase=" + this.f47201a9 + '}');
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            zurt.InterfaceC0290k.m1087k(strArr[i2]);
            ni7.zy(strArr[i2] + ":" + fu4(strArr[i2]));
        }
    }

    public void zurt(HashMap<String, AbstractC0287y> map) {
        AbstractC0287y abstractC0287y;
        AbstractC0287y abstractC0287y2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.core.motion.toq toqVar = this.f47228x2.get(str.substring(7));
                if (toqVar != null && toqVar.qrj() == 901 && (abstractC0287y = map.get(str)) != null) {
                    abstractC0287y.f7l8(this.f1500y, this.f47215wvg, this.f1494t, -1, this.f47211mcp, this.f47208jk, this.f47201a9, toqVar.n7h(), toqVar);
                }
            } else {
                float fFu4 = fu4(str);
                if (!Float.isNaN(fFu4) && (abstractC0287y2 = map.get(str)) != null) {
                    abstractC0287y2.m1073g(this.f1500y, this.f47215wvg, this.f1494t, -1, this.f47211mcp, this.f47208jk, this.f47201a9, fFu4);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.toq, androidx.constraintlayout.core.motion.utils.zurt
    public boolean zy(int i2, float f2) {
        if (i2 == 315) {
            this.f47206fti = f2;
            return true;
        }
        if (i2 == 403) {
            this.f47209jp0y = f2;
            return true;
        }
        if (i2 == 416) {
            this.f47214oc = f2;
            return true;
        }
        switch (i2) {
            case 304:
                this.f47204dd = f2;
                return true;
            case 305:
                this.f47216x9kr = f2;
                return true;
            case 306:
                this.f47212ncyb = f2;
                return true;
            case 307:
                this.f47207gvn7 = f2;
                return true;
            case 308:
                this.f47205eqxt = f2;
                return true;
            case 309:
                this.f47202d2ok = f2;
                return true;
            case 310:
                this.f47203d3 = f2;
                return true;
            case 311:
                this.f47210lvui = f2;
                return true;
            case 312:
                this.f1493r = f2;
                return true;
            default:
                switch (i2) {
                    case zurt.zy.f47489fn3e /* 423 */:
                        this.f47211mcp = f2;
                        return true;
                    case 424:
                        this.f47208jk = f2;
                        return true;
                    case 425:
                        this.f47201a9 = f2;
                        return true;
                    default:
                        return super.zy(i2, f2);
                }
        }
    }
}
