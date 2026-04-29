package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.utils.AbstractC0349g;
import androidx.constraintlayout.motion.utils.AbstractC0352q;
import androidx.constraintlayout.widget.C0394g;
import androidx.constraintlayout.widget.C0395k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: KeyTimeCycle.java */
/* JADX INFO: loaded from: classes.dex */
public class x2 extends AbstractC0368g {

    /* JADX INFO: renamed from: c */
    static final String f2440c = "KeyTimeCycle";

    /* JADX INFO: renamed from: e */
    public static final String f2441e = "waveShape";

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    public static final int f48333ek5k = 5;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    public static final int f48334hb = 1;

    /* JADX INFO: renamed from: j */
    public static final int f2442j = 2;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private static final String f48335lrht = "KeyTimeCycle";

    /* JADX INFO: renamed from: m */
    public static final int f2443m = 4;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    public static final int f48336nn86 = 0;

    /* JADX INFO: renamed from: o */
    public static final int f2444o = 3;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    public static final String f48337uv6 = "wavePeriod";

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    public static final String f48338vyq = "waveOffset";

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    public static final int f48339y9n = 3;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    public static final int f48340yz = 6;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private String f48349jk;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private int f48341a9 = -1;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private float f48346fti = Float.NaN;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private float f48350jp0y = Float.NaN;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private float f48347gvn7 = Float.NaN;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private float f48343d3 = Float.NaN;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private float f48354oc = Float.NaN;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private float f48345eqxt = Float.NaN;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private float f48342d2ok = Float.NaN;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private float f48351lvui = Float.NaN;

    /* JADX INFO: renamed from: r */
    private float f2447r = Float.NaN;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private float f48344dd = Float.NaN;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private float f48355x9kr = Float.NaN;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private float f48353ncyb = Float.NaN;

    /* JADX INFO: renamed from: l */
    private int f2446l = 0;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private String f48352n5r1 = null;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private float f48348hyr = Float.NaN;

    /* JADX INFO: renamed from: f */
    private float f2445f = 0.0f;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.x2$k */
    /* JADX INFO: compiled from: KeyTimeCycle.java */
    private static class C0382k {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private static final int f48356cdj = 19;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final int f48357f7l8 = 7;

        /* JADX INFO: renamed from: g */
        private static final int f2448g = 8;

        /* JADX INFO: renamed from: h */
        private static final int f2449h = 18;

        /* JADX INFO: renamed from: i */
        private static SparseIntArray f2450i = null;

        /* JADX INFO: renamed from: k */
        private static final int f2451k = 1;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private static final int f48358ki = 20;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private static final int f48359kja0 = 17;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private static final int f48360ld6 = 13;

        /* JADX INFO: renamed from: n */
        private static final int f2452n = 6;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private static final int f48361n7h = 16;

        /* JADX INFO: renamed from: p */
        private static final int f2453p = 12;

        /* JADX INFO: renamed from: q */
        private static final int f2454q = 5;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private static final int f48362qrj = 15;

        /* JADX INFO: renamed from: s */
        private static final int f2455s = 10;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private static final int f48363t8r = 21;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final int f48364toq = 2;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private static final int f48365x2 = 14;

        /* JADX INFO: renamed from: y */
        private static final int f2456y = 9;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final int f48366zy = 4;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2450i = sparseIntArray;
            sparseIntArray.append(C0394g.qrj.kncy, 1);
            f2450i.append(C0394g.qrj.x0yo, 2);
            f2450i.append(C0394g.qrj.n7, 4);
            f2450i.append(C0394g.qrj.cax, 5);
            f2450i.append(C0394g.qrj.ytul, 6);
            f2450i.append(C0394g.qrj.anfo, 7);
            f2450i.append(C0394g.qrj.q6x, 8);
            f2450i.append(C0394g.qrj.he, 9);
            f2450i.append(C0394g.qrj.zvv, 10);
            f2450i.append(C0394g.qrj.q28p, 12);
            f2450i.append(C0394g.qrj.q92d, 13);
            f2450i.append(C0394g.qrj.nyhr, 14);
            f2450i.append(C0394g.qrj.re5, 15);
            f2450i.append(C0394g.qrj.zn, 16);
            f2450i.append(C0394g.qrj.lo8, 17);
            f2450i.append(C0394g.qrj.xwma, 18);
            f2450i.append(C0394g.qrj.ik8, 20);
            f2450i.append(C0394g.qrj.gm3, 21);
            f2450i.append(C0394g.qrj.k8s, 19);
        }

        private C0382k() {
        }

        /* JADX INFO: renamed from: k */
        public static void m1574k(x2 c2, TypedArray a2) {
            int indexCount = a2.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = a2.getIndex(i2);
                switch (f2450i.get(index)) {
                    case 1:
                        c2.f48346fti = a2.getFloat(index, c2.f48346fti);
                        break;
                    case 2:
                        c2.f48350jp0y = a2.getDimension(index, c2.f48350jp0y);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2450i.get(index));
                        break;
                    case 4:
                        c2.f48347gvn7 = a2.getFloat(index, c2.f48347gvn7);
                        break;
                    case 5:
                        c2.f48343d3 = a2.getFloat(index, c2.f48343d3);
                        break;
                    case 6:
                        c2.f48354oc = a2.getFloat(index, c2.f48354oc);
                        break;
                    case 7:
                        c2.f48342d2ok = a2.getFloat(index, c2.f48342d2ok);
                        break;
                    case 8:
                        c2.f48345eqxt = a2.getFloat(index, c2.f48345eqxt);
                        break;
                    case 9:
                        c2.f48349jk = a2.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.faqz) {
                            int resourceId = a2.getResourceId(index, c2.f48082toq);
                            c2.f48082toq = resourceId;
                            if (resourceId == -1) {
                                c2.f48083zy = a2.getString(index);
                            }
                        } else if (a2.peekValue(index).type == 3) {
                            c2.f48083zy = a2.getString(index);
                        } else {
                            c2.f48082toq = a2.getResourceId(index, c2.f48082toq);
                        }
                        break;
                    case 12:
                        c2.f2240k = a2.getInt(index, c2.f2240k);
                        break;
                    case 13:
                        c2.f48341a9 = a2.getInteger(index, c2.f48341a9);
                        break;
                    case 14:
                        c2.f48351lvui = a2.getFloat(index, c2.f48351lvui);
                        break;
                    case 15:
                        c2.f2447r = a2.getDimension(index, c2.f2447r);
                        break;
                    case 16:
                        c2.f48344dd = a2.getDimension(index, c2.f48344dd);
                        break;
                    case 17:
                        c2.f48355x9kr = a2.getDimension(index, c2.f48355x9kr);
                        break;
                    case 18:
                        c2.f48353ncyb = a2.getFloat(index, c2.f48353ncyb);
                        break;
                    case 19:
                        if (a2.peekValue(index).type == 3) {
                            c2.f48352n5r1 = a2.getString(index);
                            c2.f2446l = 7;
                        } else {
                            c2.f2446l = a2.getInt(index, c2.f2446l);
                        }
                        break;
                    case 20:
                        c2.f48348hyr = a2.getFloat(index, c2.f48348hyr);
                        break;
                    case 21:
                        if (a2.peekValue(index).type == 5) {
                            c2.f2445f = a2.getDimension(index, c2.f2445f);
                        } else {
                            c2.f2445f = a2.getFloat(index, c2.f2445f);
                        }
                        break;
                }
            }
        }
    }

    public x2() {
        this.f2242q = 3;
        this.f2241n = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: g */
    public void mo1431g(Context context, AttributeSet attrs) {
        C0382k.m1574k(this, context.obtainStyledAttributes(attrs, C0394g.qrj.a2lv));
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: k */
    public void mo1432k(HashMap<String, AbstractC0352q> splines) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void lrht(HashMap<String, AbstractC0349g> splines) {
        for (String str : splines.keySet()) {
            AbstractC0349g abstractC0349g = splines.get(str);
            if (abstractC0349g != null) {
                byte b2 = 7;
                if (!str.startsWith("CUSTOM")) {
                    switch (str.hashCode()) {
                        case -1249320806:
                            b2 = str.equals("rotationX") ? (byte) 0 : (byte) -1;
                            break;
                        case -1249320805:
                            b2 = str.equals("rotationY") ? (byte) 1 : (byte) -1;
                            break;
                        case -1225497657:
                            b2 = str.equals("translationX") ? (byte) 2 : (byte) -1;
                            break;
                        case -1225497656:
                            b2 = str.equals("translationY") ? (byte) 3 : (byte) -1;
                            break;
                        case -1225497655:
                            b2 = str.equals("translationZ") ? (byte) 4 : (byte) -1;
                            break;
                        case -1001078227:
                            b2 = str.equals("progress") ? (byte) 5 : (byte) -1;
                            break;
                        case -908189618:
                            b2 = str.equals("scaleX") ? (byte) 6 : (byte) -1;
                            break;
                        case -908189617:
                            if (!str.equals("scaleY")) {
                                b2 = -1;
                            }
                            break;
                        case -40300674:
                            b2 = str.equals("rotation") ? (byte) 8 : (byte) -1;
                            break;
                        case -4379043:
                            b2 = str.equals("elevation") ? (byte) 9 : (byte) -1;
                            break;
                        case 37232917:
                            b2 = str.equals("transitionPathRotate") ? (byte) 10 : (byte) -1;
                            break;
                        case 92909918:
                            b2 = str.equals("alpha") ? com.google.common.base.zy.f68132qrj : (byte) -1;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                            if (!Float.isNaN(this.f48343d3)) {
                                abstractC0349g.zy(this.f2240k, this.f48343d3, this.f48348hyr, this.f2446l, this.f2445f);
                            }
                            break;
                        case 1:
                            if (!Float.isNaN(this.f48354oc)) {
                                abstractC0349g.zy(this.f2240k, this.f48354oc, this.f48348hyr, this.f2446l, this.f2445f);
                            }
                            break;
                        case 2:
                            if (!Float.isNaN(this.f2447r)) {
                                abstractC0349g.zy(this.f2240k, this.f2447r, this.f48348hyr, this.f2446l, this.f2445f);
                            }
                            break;
                        case 3:
                            if (!Float.isNaN(this.f48344dd)) {
                                abstractC0349g.zy(this.f2240k, this.f48344dd, this.f48348hyr, this.f2446l, this.f2445f);
                            }
                            break;
                        case 4:
                            if (!Float.isNaN(this.f48355x9kr)) {
                                abstractC0349g.zy(this.f2240k, this.f48355x9kr, this.f48348hyr, this.f2446l, this.f2445f);
                            }
                            break;
                        case 5:
                            if (!Float.isNaN(this.f48353ncyb)) {
                                abstractC0349g.zy(this.f2240k, this.f48353ncyb, this.f48348hyr, this.f2446l, this.f2445f);
                            }
                            break;
                        case 6:
                            if (!Float.isNaN(this.f48342d2ok)) {
                                abstractC0349g.zy(this.f2240k, this.f48342d2ok, this.f48348hyr, this.f2446l, this.f2445f);
                            }
                            break;
                        case 7:
                            if (!Float.isNaN(this.f48351lvui)) {
                                abstractC0349g.zy(this.f2240k, this.f48351lvui, this.f48348hyr, this.f2446l, this.f2445f);
                            }
                            break;
                        case 8:
                            if (!Float.isNaN(this.f48347gvn7)) {
                                abstractC0349g.zy(this.f2240k, this.f48347gvn7, this.f48348hyr, this.f2446l, this.f2445f);
                            }
                            break;
                        case 9:
                            if (!Float.isNaN(this.f48350jp0y)) {
                                abstractC0349g.zy(this.f2240k, this.f48350jp0y, this.f48348hyr, this.f2446l, this.f2445f);
                            }
                            break;
                        case 10:
                            if (!Float.isNaN(this.f48345eqxt)) {
                                abstractC0349g.zy(this.f2240k, this.f48345eqxt, this.f48348hyr, this.f2446l, this.f2445f);
                            }
                            break;
                        case 11:
                            if (!Float.isNaN(this.f48346fti)) {
                                abstractC0349g.zy(this.f2240k, this.f48346fti, this.f48348hyr, this.f2446l, this.f2445f);
                            }
                            break;
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    C0395k c0395k = this.f2241n.get(str.substring(7));
                    if (c0395k != null) {
                        ((AbstractC0349g.toq) abstractC0349g).ld6(this.f2240k, c0395k, this.f48348hyr, this.f2446l, this.f2445f);
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: p */
    public void mo1433p(String tag, Object value) {
        tag.hashCode();
        byte b2 = -1;
        switch (tag.hashCode()) {
            case -1913008125:
                if (tag.equals(AbstractC0368g.f48079wvg)) {
                    b2 = 0;
                }
                break;
            case -1812823328:
                if (tag.equals("transitionEasing")) {
                    b2 = 1;
                }
                break;
            case -1249320806:
                if (tag.equals("rotationX")) {
                    b2 = 2;
                }
                break;
            case -1249320805:
                if (tag.equals("rotationY")) {
                    b2 = 3;
                }
                break;
            case -1225497657:
                if (tag.equals("translationX")) {
                    b2 = 4;
                }
                break;
            case -1225497656:
                if (tag.equals("translationY")) {
                    b2 = 5;
                }
                break;
            case -1225497655:
                if (tag.equals("translationZ")) {
                    b2 = 6;
                }
                break;
            case -908189618:
                if (tag.equals("scaleX")) {
                    b2 = 7;
                }
                break;
            case -908189617:
                if (tag.equals("scaleY")) {
                    b2 = 8;
                }
                break;
            case -40300674:
                if (tag.equals("rotation")) {
                    b2 = 9;
                }
                break;
            case -4379043:
                if (tag.equals("elevation")) {
                    b2 = 10;
                }
                break;
            case 37232917:
                if (tag.equals("transitionPathRotate")) {
                    b2 = com.google.common.base.zy.f68132qrj;
                }
                break;
            case 92909918:
                if (tag.equals("alpha")) {
                    b2 = com.google.common.base.zy.f68128n7h;
                }
                break;
            case 156108012:
                if (tag.equals("waveOffset")) {
                    b2 = com.google.common.base.zy.f68124kja0;
                }
                break;
            case 184161818:
                if (tag.equals("wavePeriod")) {
                    b2 = com.google.common.base.zy.f25751h;
                }
                break;
            case 579057826:
                if (tag.equals("curveFit")) {
                    b2 = com.google.common.base.zy.f68111cdj;
                }
                break;
            case 1532805160:
                if (tag.equals("waveShape")) {
                    b2 = 16;
                }
                break;
        }
        switch (b2) {
            case 0:
                this.f48353ncyb = qrj(value);
                break;
            case 1:
                this.f48349jk = value.toString();
                break;
            case 2:
                this.f48343d3 = qrj(value);
                break;
            case 3:
                this.f48354oc = qrj(value);
                break;
            case 4:
                this.f2447r = qrj(value);
                break;
            case 5:
                this.f48344dd = qrj(value);
                break;
            case 6:
                this.f48355x9kr = qrj(value);
                break;
            case 7:
                this.f48342d2ok = qrj(value);
                break;
            case 8:
                this.f48351lvui = qrj(value);
                break;
            case 9:
                this.f48347gvn7 = qrj(value);
                break;
            case 10:
                this.f48350jp0y = qrj(value);
                break;
            case 11:
                this.f48345eqxt = qrj(value);
                break;
            case 12:
                this.f48346fti = qrj(value);
                break;
            case 13:
                this.f2445f = qrj(value);
                break;
            case 14:
                this.f48348hyr = qrj(value);
                break;
            case 15:
                this.f48341a9 = n7h(value);
                break;
            case 16:
                if (!(value instanceof Integer)) {
                    this.f2446l = 7;
                    this.f48352n5r1 = value.toString();
                } else {
                    this.f2446l = n7h(value);
                }
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: q */
    public void mo1434q(HashSet<String> attributes) {
        if (!Float.isNaN(this.f48346fti)) {
            attributes.add("alpha");
        }
        if (!Float.isNaN(this.f48350jp0y)) {
            attributes.add("elevation");
        }
        if (!Float.isNaN(this.f48347gvn7)) {
            attributes.add("rotation");
        }
        if (!Float.isNaN(this.f48343d3)) {
            attributes.add("rotationX");
        }
        if (!Float.isNaN(this.f48354oc)) {
            attributes.add("rotationY");
        }
        if (!Float.isNaN(this.f2447r)) {
            attributes.add("translationX");
        }
        if (!Float.isNaN(this.f48344dd)) {
            attributes.add("translationY");
        }
        if (!Float.isNaN(this.f48355x9kr)) {
            attributes.add("translationZ");
        }
        if (!Float.isNaN(this.f48345eqxt)) {
            attributes.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f48342d2ok)) {
            attributes.add("scaleX");
        }
        if (!Float.isNaN(this.f48351lvui)) {
            attributes.add("scaleY");
        }
        if (!Float.isNaN(this.f48353ncyb)) {
            attributes.add("progress");
        }
        if (this.f2241n.size() > 0) {
            Iterator<String> it = this.f2241n.keySet().iterator();
            while (it.hasNext()) {
                attributes.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: s */
    public void mo1435s(HashMap<String, Integer> interpolation) {
        if (this.f48341a9 == -1) {
            return;
        }
        if (!Float.isNaN(this.f48346fti)) {
            interpolation.put("alpha", Integer.valueOf(this.f48341a9));
        }
        if (!Float.isNaN(this.f48350jp0y)) {
            interpolation.put("elevation", Integer.valueOf(this.f48341a9));
        }
        if (!Float.isNaN(this.f48347gvn7)) {
            interpolation.put("rotation", Integer.valueOf(this.f48341a9));
        }
        if (!Float.isNaN(this.f48343d3)) {
            interpolation.put("rotationX", Integer.valueOf(this.f48341a9));
        }
        if (!Float.isNaN(this.f48354oc)) {
            interpolation.put("rotationY", Integer.valueOf(this.f48341a9));
        }
        if (!Float.isNaN(this.f2447r)) {
            interpolation.put("translationX", Integer.valueOf(this.f48341a9));
        }
        if (!Float.isNaN(this.f48344dd)) {
            interpolation.put("translationY", Integer.valueOf(this.f48341a9));
        }
        if (!Float.isNaN(this.f48355x9kr)) {
            interpolation.put("translationZ", Integer.valueOf(this.f48341a9));
        }
        if (!Float.isNaN(this.f48345eqxt)) {
            interpolation.put("transitionPathRotate", Integer.valueOf(this.f48341a9));
        }
        if (!Float.isNaN(this.f48342d2ok)) {
            interpolation.put("scaleX", Integer.valueOf(this.f48341a9));
        }
        if (!Float.isNaN(this.f48342d2ok)) {
            interpolation.put("scaleY", Integer.valueOf(this.f48341a9));
        }
        if (!Float.isNaN(this.f48353ncyb)) {
            interpolation.put("progress", Integer.valueOf(this.f48341a9));
        }
        if (this.f2241n.size() > 0) {
            Iterator<String> it = this.f2241n.keySet().iterator();
            while (it.hasNext()) {
                interpolation.put("CUSTOM," + it.next(), Integer.valueOf(this.f48341a9));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: toq */
    public AbstractC0368g clone() {
        return new x2().zy(this);
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    public AbstractC0368g zy(AbstractC0368g src) {
        super.zy(src);
        x2 x2Var = (x2) src;
        this.f48349jk = x2Var.f48349jk;
        this.f48341a9 = x2Var.f48341a9;
        this.f2446l = x2Var.f2446l;
        this.f48348hyr = x2Var.f48348hyr;
        this.f2445f = x2Var.f2445f;
        this.f48353ncyb = x2Var.f48353ncyb;
        this.f48346fti = x2Var.f48346fti;
        this.f48350jp0y = x2Var.f48350jp0y;
        this.f48347gvn7 = x2Var.f48347gvn7;
        this.f48345eqxt = x2Var.f48345eqxt;
        this.f48343d3 = x2Var.f48343d3;
        this.f48354oc = x2Var.f48354oc;
        this.f48342d2ok = x2Var.f48342d2ok;
        this.f48351lvui = x2Var.f48351lvui;
        this.f2447r = x2Var.f2447r;
        this.f48344dd = x2Var.f48344dd;
        this.f48355x9kr = x2Var.f48355x9kr;
        return this;
    }
}
