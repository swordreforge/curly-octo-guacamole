package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.constraintlayout.motion.utils.AbstractC0352q;
import androidx.constraintlayout.widget.C0394g;
import androidx.constraintlayout.widget.C0395k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.y */
/* JADX INFO: compiled from: KeyCycle.java */
/* JADX INFO: loaded from: classes.dex */
public class C0383y extends AbstractC0368g {

    /* JADX INFO: renamed from: b */
    public static final int f2457b = 5;

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    public static final int f48367bf2 = 6;

    /* JADX INFO: renamed from: e */
    public static final String f2458e = "wavePeriod";

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    public static final int f48368ek5k = 2;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    public static final String f48369hb = "wavePhase";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f48370i1 = 4;

    /* JADX INFO: renamed from: j */
    public static final String f2459j = "waveShape";

    /* JADX INFO: renamed from: m */
    public static final int f2460m = 1;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    public static final String f48371nn86 = "waveOffset";

    /* JADX INFO: renamed from: o */
    public static final int f2461o = 0;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private static final String f48372uv6 = "KeyCycle";

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    static final String f48373vyq = "KeyCycle";

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    public static final int f48374y9n = 4;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    public static final int f48375yz = 3;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private String f48384jk = null;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private int f48376a9 = 0;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private int f48381fti = -1;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private String f48385jp0y = null;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private float f48382gvn7 = Float.NaN;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private float f48378d3 = 0.0f;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private float f48390oc = 0.0f;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private float f48380eqxt = Float.NaN;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private int f48377d2ok = -1;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private float f48387lvui = Float.NaN;

    /* JADX INFO: renamed from: r */
    private float f2465r = Float.NaN;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private float f48379dd = Float.NaN;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private float f48391x9kr = Float.NaN;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private float f48389ncyb = Float.NaN;

    /* JADX INFO: renamed from: l */
    private float f2464l = Float.NaN;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private float f48388n5r1 = Float.NaN;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private float f48383hyr = Float.NaN;

    /* JADX INFO: renamed from: f */
    private float f2463f = Float.NaN;

    /* JADX INFO: renamed from: c */
    private float f2462c = Float.NaN;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private float f48386lrht = Float.NaN;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.y$k */
    /* JADX INFO: compiled from: KeyCycle.java */
    private static class k {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private static final int f48392cdj = 17;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final int f48393f7l8 = 7;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        private static final int f48394fn3e = 21;

        /* JADX INFO: renamed from: g */
        private static final int f2466g = 6;

        /* JADX INFO: renamed from: h */
        private static final int f2467h = 16;

        /* JADX INFO: renamed from: i */
        private static final int f2468i = 20;

        /* JADX INFO: renamed from: k */
        private static final int f2469k = 1;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private static final int f48395ki = 18;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private static final int f48396kja0 = 15;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private static final int f48397ld6 = 11;

        /* JADX INFO: renamed from: n */
        private static final int f2470n = 5;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private static final int f48398n7h = 14;

        /* JADX INFO: renamed from: p */
        private static final int f2471p = 10;

        /* JADX INFO: renamed from: q */
        private static final int f2472q = 4;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private static final int f48399qrj = 13;

        /* JADX INFO: renamed from: s */
        private static final int f2473s = 9;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private static final int f48400t8r = 19;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final int f48401toq = 2;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private static final int f48402x2 = 12;

        /* JADX INFO: renamed from: y */
        private static final int f2474y = 8;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        private static SparseIntArray f48403zurt = null;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final int f48404zy = 3;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f48403zurt = sparseIntArray;
            sparseIntArray.append(C0394g.qrj.gvs2, 1);
            f48403zurt.append(C0394g.qrj.tma, 2);
            f48403zurt.append(C0394g.qrj.q5aq, 3);
            f48403zurt.append(C0394g.qrj.a77c, 4);
            f48403zurt.append(C0394g.qrj.ihvk, 5);
            f48403zurt.append(C0394g.qrj.gek, 6);
            f48403zurt.append(C0394g.qrj.w3, 7);
            f48403zurt.append(C0394g.qrj.onm, 8);
            f48403zurt.append(C0394g.qrj.sval, 9);
            f48403zurt.append(C0394g.qrj.iy, 10);
            f48403zurt.append(C0394g.qrj.d0q9, 11);
            f48403zurt.append(C0394g.qrj.cub, 12);
            f48403zurt.append(C0394g.qrj.zrx, 13);
            f48403zurt.append(C0394g.qrj.krop, 14);
            f48403zurt.append(C0394g.qrj.hli, 15);
            f48403zurt.append(C0394g.qrj.luud, 16);
            f48403zurt.append(C0394g.qrj.zio, 17);
            f48403zurt.append(C0394g.qrj.ku, 18);
            f48403zurt.append(C0394g.qrj.g9o6, 19);
            f48403zurt.append(C0394g.qrj.b37y, 20);
            f48403zurt.append(C0394g.qrj.jn, 21);
        }

        private k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void toq(C0383y c2, TypedArray a2) {
            int indexCount = a2.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = a2.getIndex(i2);
                switch (f48403zurt.get(index)) {
                    case 1:
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
                    case 2:
                        c2.f2240k = a2.getInt(index, c2.f2240k);
                        break;
                    case 3:
                        c2.f48384jk = a2.getString(index);
                        break;
                    case 4:
                        c2.f48376a9 = a2.getInteger(index, c2.f48376a9);
                        break;
                    case 5:
                        if (a2.peekValue(index).type == 3) {
                            c2.f48385jp0y = a2.getString(index);
                            c2.f48381fti = 7;
                        } else {
                            c2.f48381fti = a2.getInt(index, c2.f48381fti);
                        }
                        break;
                    case 6:
                        c2.f48382gvn7 = a2.getFloat(index, c2.f48382gvn7);
                        break;
                    case 7:
                        if (a2.peekValue(index).type == 5) {
                            c2.f48378d3 = a2.getDimension(index, c2.f48378d3);
                        } else {
                            c2.f48378d3 = a2.getFloat(index, c2.f48378d3);
                        }
                        break;
                    case 8:
                        c2.f48377d2ok = a2.getInt(index, c2.f48377d2ok);
                        break;
                    case 9:
                        c2.f48387lvui = a2.getFloat(index, c2.f48387lvui);
                        break;
                    case 10:
                        c2.f2465r = a2.getDimension(index, c2.f2465r);
                        break;
                    case 11:
                        c2.f48379dd = a2.getFloat(index, c2.f48379dd);
                        break;
                    case 12:
                        c2.f48389ncyb = a2.getFloat(index, c2.f48389ncyb);
                        break;
                    case 13:
                        c2.f2464l = a2.getFloat(index, c2.f2464l);
                        break;
                    case 14:
                        c2.f48391x9kr = a2.getFloat(index, c2.f48391x9kr);
                        break;
                    case 15:
                        c2.f48388n5r1 = a2.getFloat(index, c2.f48388n5r1);
                        break;
                    case 16:
                        c2.f48383hyr = a2.getFloat(index, c2.f48383hyr);
                        break;
                    case 17:
                        c2.f2463f = a2.getDimension(index, c2.f2463f);
                        break;
                    case 18:
                        c2.f2462c = a2.getDimension(index, c2.f2462c);
                        break;
                    case 19:
                        c2.f48386lrht = a2.getDimension(index, c2.f48386lrht);
                        break;
                    case 20:
                        c2.f48380eqxt = a2.getFloat(index, c2.f48380eqxt);
                        break;
                    case 21:
                        c2.f48390oc = a2.getFloat(index, c2.f48390oc) / 360.0f;
                        break;
                    default:
                        Log.e(zurt.zy.f1774k, "unused attribute 0x" + Integer.toHexString(index) + "   " + f48403zurt.get(index));
                        break;
                }
            }
        }
    }

    public C0383y() {
        this.f2242q = 4;
        this.f2241n = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: g */
    public void mo1431g(Context context, AttributeSet attrs) {
        k.toq(this, context.obtainStyledAttributes(attrs, C0394g.qrj.ba));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public float hb(String key) {
        key.hashCode();
        byte b2 = -1;
        switch (key.hashCode()) {
            case -1249320806:
                if (key.equals("rotationX")) {
                    b2 = 0;
                }
                break;
            case -1249320805:
                if (key.equals("rotationY")) {
                    b2 = 1;
                }
                break;
            case -1225497657:
                if (key.equals("translationX")) {
                    b2 = 2;
                }
                break;
            case -1225497656:
                if (key.equals("translationY")) {
                    b2 = 3;
                }
                break;
            case -1225497655:
                if (key.equals("translationZ")) {
                    b2 = 4;
                }
                break;
            case -1001078227:
                if (key.equals("progress")) {
                    b2 = 5;
                }
                break;
            case -908189618:
                if (key.equals("scaleX")) {
                    b2 = 6;
                }
                break;
            case -908189617:
                if (key.equals("scaleY")) {
                    b2 = 7;
                }
                break;
            case -40300674:
                if (key.equals("rotation")) {
                    b2 = 8;
                }
                break;
            case -4379043:
                if (key.equals("elevation")) {
                    b2 = 9;
                }
                break;
            case 37232917:
                if (key.equals("transitionPathRotate")) {
                    b2 = 10;
                }
                break;
            case 92909918:
                if (key.equals("alpha")) {
                    b2 = com.google.common.base.zy.f68132qrj;
                }
                break;
            case 156108012:
                if (key.equals("waveOffset")) {
                    b2 = com.google.common.base.zy.f68128n7h;
                }
                break;
            case 1530034690:
                if (key.equals("wavePhase")) {
                    b2 = com.google.common.base.zy.f68124kja0;
                }
                break;
        }
        switch (b2) {
            case 0:
                return this.f48389ncyb;
            case 1:
                return this.f2464l;
            case 2:
                return this.f2463f;
            case 3:
                return this.f2462c;
            case 4:
                return this.f48386lrht;
            case 5:
                return this.f48380eqxt;
            case 6:
                return this.f48388n5r1;
            case 7:
                return this.f48383hyr;
            case 8:
                return this.f48379dd;
            case 9:
                return this.f2465r;
            case 10:
                return this.f48391x9kr;
            case 11:
                return this.f48387lvui;
            case 12:
                return this.f48378d3;
            case 13:
                return this.f48390oc;
            default:
                if (key.startsWith("CUSTOM")) {
                    return Float.NaN;
                }
                Log.v("WARNING! KeyCycle", "  UNKNOWN  " + key);
                return Float.NaN;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: k */
    public void mo1432k(HashMap<String, AbstractC0352q> splines) {
        zy.n7h(zurt.zy.f1774k, "add " + splines.size() + " values", 2);
        for (String str : splines.keySet()) {
            AbstractC0352q abstractC0352q = splines.get(str);
            if (abstractC0352q != null) {
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
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b2 = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b2 = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b2 = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b2 = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b2 = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b2 = 7;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b2 = 8;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b2 = 9;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b2 = 10;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b2 = com.google.common.base.zy.f68132qrj;
                        }
                        break;
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            b2 = com.google.common.base.zy.f68128n7h;
                        }
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
                            b2 = com.google.common.base.zy.f68124kja0;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                        abstractC0352q.f7l8(this.f2240k, this.f48389ncyb);
                        break;
                    case 1:
                        abstractC0352q.f7l8(this.f2240k, this.f2464l);
                        break;
                    case 2:
                        abstractC0352q.f7l8(this.f2240k, this.f2463f);
                        break;
                    case 3:
                        abstractC0352q.f7l8(this.f2240k, this.f2462c);
                        break;
                    case 4:
                        abstractC0352q.f7l8(this.f2240k, this.f48386lrht);
                        break;
                    case 5:
                        abstractC0352q.f7l8(this.f2240k, this.f48380eqxt);
                        break;
                    case 6:
                        abstractC0352q.f7l8(this.f2240k, this.f48388n5r1);
                        break;
                    case 7:
                        abstractC0352q.f7l8(this.f2240k, this.f48383hyr);
                        break;
                    case 8:
                        abstractC0352q.f7l8(this.f2240k, this.f48379dd);
                        break;
                    case 9:
                        abstractC0352q.f7l8(this.f2240k, this.f2465r);
                        break;
                    case 10:
                        abstractC0352q.f7l8(this.f2240k, this.f48391x9kr);
                        break;
                    case 11:
                        abstractC0352q.f7l8(this.f2240k, this.f48387lvui);
                        break;
                    case 12:
                        abstractC0352q.f7l8(this.f2240k, this.f48378d3);
                        break;
                    case 13:
                        abstractC0352q.f7l8(this.f2240k, this.f48390oc);
                        break;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  " + str);
                        }
                        break;
                }
            }
        }
    }

    public void nn86(HashMap<String, androidx.constraintlayout.motion.utils.zy> oscSet) {
        androidx.constraintlayout.motion.utils.zy zyVar;
        androidx.constraintlayout.motion.utils.zy zyVar2;
        for (String str : oscSet.keySet()) {
            if (str.startsWith("CUSTOM")) {
                C0395k c0395k = this.f2241n.get(str.substring(7));
                if (c0395k != null && c0395k.m1641p() == C0395k.toq.FLOAT_TYPE && (zyVar = oscSet.get(str)) != null) {
                    zyVar.f7l8(this.f2240k, this.f48381fti, this.f48385jp0y, this.f48377d2ok, this.f48382gvn7, this.f48378d3, this.f48390oc, c0395k.ld6(), c0395k);
                }
            } else {
                float fHb = hb(str);
                if (!Float.isNaN(fHb) && (zyVar2 = oscSet.get(str)) != null) {
                    zyVar2.m1073g(this.f2240k, this.f48381fti, this.f48385jp0y, this.f48377d2ok, this.f48382gvn7, this.f48378d3, this.f48390oc, fHb);
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
            case 1530034690:
                if (tag.equals("wavePhase")) {
                    b2 = 16;
                }
                break;
            case 1532805160:
                if (tag.equals("waveShape")) {
                    b2 = 17;
                }
                break;
        }
        switch (b2) {
            case 0:
                this.f48380eqxt = qrj(value);
                break;
            case 1:
                this.f48384jk = value.toString();
                break;
            case 2:
                this.f48389ncyb = qrj(value);
                break;
            case 3:
                this.f2464l = qrj(value);
                break;
            case 4:
                this.f2463f = qrj(value);
                break;
            case 5:
                this.f2462c = qrj(value);
                break;
            case 6:
                this.f48386lrht = qrj(value);
                break;
            case 7:
                this.f48388n5r1 = qrj(value);
                break;
            case 8:
                this.f48383hyr = qrj(value);
                break;
            case 9:
                this.f48379dd = qrj(value);
                break;
            case 10:
                this.f2465r = qrj(value);
                break;
            case 11:
                this.f48391x9kr = qrj(value);
                break;
            case 12:
                this.f48387lvui = qrj(value);
                break;
            case 13:
                this.f48378d3 = qrj(value);
                break;
            case 14:
                this.f48382gvn7 = qrj(value);
                break;
            case 15:
                this.f48376a9 = n7h(value);
                break;
            case 16:
                this.f48390oc = qrj(value);
                break;
            case 17:
                if (!(value instanceof Integer)) {
                    this.f48381fti = 7;
                    this.f48385jp0y = value.toString();
                } else {
                    this.f48381fti = n7h(value);
                }
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: q */
    public void mo1434q(HashSet<String> attributes) {
        if (!Float.isNaN(this.f48387lvui)) {
            attributes.add("alpha");
        }
        if (!Float.isNaN(this.f2465r)) {
            attributes.add("elevation");
        }
        if (!Float.isNaN(this.f48379dd)) {
            attributes.add("rotation");
        }
        if (!Float.isNaN(this.f48389ncyb)) {
            attributes.add("rotationX");
        }
        if (!Float.isNaN(this.f2464l)) {
            attributes.add("rotationY");
        }
        if (!Float.isNaN(this.f48388n5r1)) {
            attributes.add("scaleX");
        }
        if (!Float.isNaN(this.f48383hyr)) {
            attributes.add("scaleY");
        }
        if (!Float.isNaN(this.f48391x9kr)) {
            attributes.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f2463f)) {
            attributes.add("translationX");
        }
        if (!Float.isNaN(this.f2462c)) {
            attributes.add("translationY");
        }
        if (!Float.isNaN(this.f48386lrht)) {
            attributes.add("translationZ");
        }
        if (this.f2241n.size() > 0) {
            Iterator<String> it = this.f2241n.keySet().iterator();
            while (it.hasNext()) {
                attributes.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: toq */
    public AbstractC0368g clone() {
        return new C0383y().zy(this);
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    public AbstractC0368g zy(AbstractC0368g src) {
        super.zy(src);
        C0383y c0383y = (C0383y) src;
        this.f48384jk = c0383y.f48384jk;
        this.f48376a9 = c0383y.f48376a9;
        this.f48381fti = c0383y.f48381fti;
        this.f48385jp0y = c0383y.f48385jp0y;
        this.f48382gvn7 = c0383y.f48382gvn7;
        this.f48378d3 = c0383y.f48378d3;
        this.f48390oc = c0383y.f48390oc;
        this.f48380eqxt = c0383y.f48380eqxt;
        this.f48377d2ok = c0383y.f48377d2ok;
        this.f48387lvui = c0383y.f48387lvui;
        this.f2465r = c0383y.f2465r;
        this.f48379dd = c0383y.f48379dd;
        this.f48391x9kr = c0383y.f48391x9kr;
        this.f48389ncyb = c0383y.f48389ncyb;
        this.f2464l = c0383y.f2464l;
        this.f48388n5r1 = c0383y.f48388n5r1;
        this.f48383hyr = c0383y.f48383hyr;
        this.f2463f = c0383y.f2463f;
        this.f2462c = c0383y.f2462c;
        this.f48386lrht = c0383y.f48386lrht;
        return this;
    }
}
