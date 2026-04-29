package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.utils.AbstractC0352q;
import androidx.constraintlayout.widget.C0394g;
import androidx.constraintlayout.widget.C0395k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: KeyAttributes.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 extends AbstractC0368g {

    /* JADX INFO: renamed from: c */
    private static final String f2219c = "KeyAttributes";

    /* JADX INFO: renamed from: f */
    static final String f2220f = "KeyAttribute";

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private static final boolean f48038lrht = false;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    public static final int f48039uv6 = 1;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private String f48048jk;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private int f48040a9 = -1;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private boolean f48045fti = false;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private float f48049jp0y = Float.NaN;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private float f48046gvn7 = Float.NaN;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private float f48042d3 = Float.NaN;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private float f48053oc = Float.NaN;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private float f48044eqxt = Float.NaN;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private float f48041d2ok = Float.NaN;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private float f48050lvui = Float.NaN;

    /* JADX INFO: renamed from: r */
    private float f2222r = Float.NaN;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private float f48043dd = Float.NaN;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private float f48054x9kr = Float.NaN;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private float f48052ncyb = Float.NaN;

    /* JADX INFO: renamed from: l */
    private float f2221l = Float.NaN;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private float f48051n5r1 = Float.NaN;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private float f48047hyr = Float.NaN;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.f7l8$k */
    /* JADX INFO: compiled from: KeyAttributes.java */
    private static class C0367k {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private static final int f48055cdj = 19;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final int f48056f7l8 = 7;

        /* JADX INFO: renamed from: g */
        private static final int f2223g = 8;

        /* JADX INFO: renamed from: h */
        private static final int f2224h = 18;

        /* JADX INFO: renamed from: k */
        private static final int f2225k = 1;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private static final int f48057ki = 20;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private static final int f48058kja0 = 17;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private static final int f48059ld6 = 13;

        /* JADX INFO: renamed from: n */
        private static final int f2226n = 6;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private static final int f48060n7h = 16;

        /* JADX INFO: renamed from: p */
        private static final int f2227p = 12;

        /* JADX INFO: renamed from: q */
        private static final int f2228q = 5;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private static final int f48061qrj = 15;

        /* JADX INFO: renamed from: s */
        private static final int f2229s = 10;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private static SparseIntArray f48062t8r = null;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final int f48063toq = 2;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private static final int f48064x2 = 14;

        /* JADX INFO: renamed from: y */
        private static final int f2230y = 9;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final int f48065zy = 4;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f48062t8r = sparseIntArray;
            sparseIntArray.append(C0394g.qrj.ihy, 1);
            f48062t8r.append(C0394g.qrj.q8d, 2);
            f48062t8r.append(C0394g.qrj.iobz, 4);
            f48062t8r.append(C0394g.qrj.kes, 5);
            f48062t8r.append(C0394g.qrj.l8s, 6);
            f48062t8r.append(C0394g.qrj.m7, 19);
            f48062t8r.append(C0394g.qrj.s4pb, 20);
            f48062t8r.append(C0394g.qrj.wj7e, 7);
            f48062t8r.append(C0394g.qrj.t00, 8);
            f48062t8r.append(C0394g.qrj.ygmb, 9);
            f48062t8r.append(C0394g.qrj.xxxc, 10);
            f48062t8r.append(C0394g.qrj.xa, 12);
            f48062t8r.append(C0394g.qrj.upz, 13);
            f48062t8r.append(C0394g.qrj.que, 14);
            f48062t8r.append(C0394g.qrj.u9l, 15);
            f48062t8r.append(C0394g.qrj.frtx, 16);
            f48062t8r.append(C0394g.qrj.jv24, 17);
            f48062t8r.append(C0394g.qrj.y1, 18);
        }

        private C0367k() {
        }

        /* JADX INFO: renamed from: k */
        public static void m1436k(f7l8 c2, TypedArray a2) {
            int indexCount = a2.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = a2.getIndex(i2);
                switch (f48062t8r.get(index)) {
                    case 1:
                        c2.f48049jp0y = a2.getFloat(index, c2.f48049jp0y);
                        break;
                    case 2:
                        c2.f48046gvn7 = a2.getDimension(index, c2.f48046gvn7);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e(f7l8.f2220f, "unused attribute 0x" + Integer.toHexString(index) + "   " + f48062t8r.get(index));
                        break;
                    case 4:
                        c2.f48042d3 = a2.getFloat(index, c2.f48042d3);
                        break;
                    case 5:
                        c2.f48053oc = a2.getFloat(index, c2.f48053oc);
                        break;
                    case 6:
                        c2.f48044eqxt = a2.getFloat(index, c2.f48044eqxt);
                        break;
                    case 7:
                        c2.f48043dd = a2.getFloat(index, c2.f48043dd);
                        break;
                    case 8:
                        c2.f2222r = a2.getFloat(index, c2.f2222r);
                        break;
                    case 9:
                        c2.f48048jk = a2.getString(index);
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
                        c2.f48040a9 = a2.getInteger(index, c2.f48040a9);
                        break;
                    case 14:
                        c2.f48054x9kr = a2.getFloat(index, c2.f48054x9kr);
                        break;
                    case 15:
                        c2.f48052ncyb = a2.getDimension(index, c2.f48052ncyb);
                        break;
                    case 16:
                        c2.f2221l = a2.getDimension(index, c2.f2221l);
                        break;
                    case 17:
                        c2.f48051n5r1 = a2.getDimension(index, c2.f48051n5r1);
                        break;
                    case 18:
                        c2.f48047hyr = a2.getFloat(index, c2.f48047hyr);
                        break;
                    case 19:
                        c2.f48041d2ok = a2.getDimension(index, c2.f48041d2ok);
                        break;
                    case 20:
                        c2.f48050lvui = a2.getDimension(index, c2.f48050lvui);
                        break;
                }
            }
        }
    }

    public f7l8() {
        this.f2242q = 1;
        this.f2241n = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: g */
    public void mo1431g(Context context, AttributeSet attrs) {
        C0367k.m1436k(this, context.obtainStyledAttributes(attrs, C0394g.qrj.mdr));
    }

    int hyr() {
        return this.f48040a9;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: k */
    public void mo1432k(HashMap<String, AbstractC0352q> splines) {
        for (String str : splines.keySet()) {
            AbstractC0352q abstractC0352q = splines.get(str);
            if (abstractC0352q != null) {
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
                        case -760884510:
                            b2 = str.equals(AbstractC0368g.f48080x2) ? (byte) 8 : (byte) -1;
                            break;
                        case -760884509:
                            b2 = str.equals(AbstractC0368g.f48077qrj) ? (byte) 9 : (byte) -1;
                            break;
                        case -40300674:
                            b2 = str.equals("rotation") ? (byte) 10 : (byte) -1;
                            break;
                        case -4379043:
                            b2 = str.equals("elevation") ? com.google.common.base.zy.f68132qrj : (byte) -1;
                            break;
                        case 37232917:
                            b2 = str.equals("transitionPathRotate") ? com.google.common.base.zy.f68128n7h : (byte) -1;
                            break;
                        case 92909918:
                            b2 = str.equals("alpha") ? com.google.common.base.zy.f68124kja0 : (byte) -1;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                            if (!Float.isNaN(this.f48053oc)) {
                                abstractC0352q.f7l8(this.f2240k, this.f48053oc);
                            }
                            break;
                        case 1:
                            if (!Float.isNaN(this.f48044eqxt)) {
                                abstractC0352q.f7l8(this.f2240k, this.f48044eqxt);
                            }
                            break;
                        case 2:
                            if (!Float.isNaN(this.f48052ncyb)) {
                                abstractC0352q.f7l8(this.f2240k, this.f48052ncyb);
                            }
                            break;
                        case 3:
                            if (!Float.isNaN(this.f2221l)) {
                                abstractC0352q.f7l8(this.f2240k, this.f2221l);
                            }
                            break;
                        case 4:
                            if (!Float.isNaN(this.f48051n5r1)) {
                                abstractC0352q.f7l8(this.f2240k, this.f48051n5r1);
                            }
                            break;
                        case 5:
                            if (!Float.isNaN(this.f48047hyr)) {
                                abstractC0352q.f7l8(this.f2240k, this.f48047hyr);
                            }
                            break;
                        case 6:
                            if (!Float.isNaN(this.f48043dd)) {
                                abstractC0352q.f7l8(this.f2240k, this.f48043dd);
                            }
                            break;
                        case 7:
                            if (!Float.isNaN(this.f48054x9kr)) {
                                abstractC0352q.f7l8(this.f2240k, this.f48054x9kr);
                            }
                            break;
                        case 8:
                            if (!Float.isNaN(this.f48053oc)) {
                                abstractC0352q.f7l8(this.f2240k, this.f48041d2ok);
                            }
                            break;
                        case 9:
                            if (!Float.isNaN(this.f48044eqxt)) {
                                abstractC0352q.f7l8(this.f2240k, this.f48050lvui);
                            }
                            break;
                        case 10:
                            if (!Float.isNaN(this.f48042d3)) {
                                abstractC0352q.f7l8(this.f2240k, this.f48042d3);
                            }
                            break;
                        case 11:
                            if (!Float.isNaN(this.f48046gvn7)) {
                                abstractC0352q.f7l8(this.f2240k, this.f48046gvn7);
                            }
                            break;
                        case 12:
                            if (!Float.isNaN(this.f2222r)) {
                                abstractC0352q.f7l8(this.f2240k, this.f2222r);
                            }
                            break;
                        case 13:
                            if (!Float.isNaN(this.f48049jp0y)) {
                                abstractC0352q.f7l8(this.f2240k, this.f48049jp0y);
                            }
                            break;
                    }
                } else {
                    C0395k c0395k = this.f2241n.get(str.substring(7));
                    if (c0395k != null) {
                        ((AbstractC0352q.toq) abstractC0352q).n7h(this.f2240k, c0395k);
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
            case -760884510:
                if (tag.equals(AbstractC0368g.f48080x2)) {
                    b2 = 9;
                }
                break;
            case -760884509:
                if (tag.equals(AbstractC0368g.f48077qrj)) {
                    b2 = 10;
                }
                break;
            case -40300674:
                if (tag.equals("rotation")) {
                    b2 = com.google.common.base.zy.f68132qrj;
                }
                break;
            case -4379043:
                if (tag.equals("elevation")) {
                    b2 = com.google.common.base.zy.f68128n7h;
                }
                break;
            case 37232917:
                if (tag.equals("transitionPathRotate")) {
                    b2 = com.google.common.base.zy.f68124kja0;
                }
                break;
            case 92909918:
                if (tag.equals("alpha")) {
                    b2 = com.google.common.base.zy.f25751h;
                }
                break;
            case 579057826:
                if (tag.equals("curveFit")) {
                    b2 = com.google.common.base.zy.f68111cdj;
                }
                break;
            case 1941332754:
                if (tag.equals("visibility")) {
                    b2 = 16;
                }
                break;
        }
        switch (b2) {
            case 0:
                this.f48047hyr = qrj(value);
                break;
            case 1:
                this.f48048jk = value.toString();
                break;
            case 2:
                this.f48053oc = qrj(value);
                break;
            case 3:
                this.f48044eqxt = qrj(value);
                break;
            case 4:
                this.f48052ncyb = qrj(value);
                break;
            case 5:
                this.f2221l = qrj(value);
                break;
            case 6:
                this.f48051n5r1 = qrj(value);
                break;
            case 7:
                this.f48043dd = qrj(value);
                break;
            case 8:
                this.f48054x9kr = qrj(value);
                break;
            case 9:
                this.f48041d2ok = qrj(value);
                break;
            case 10:
                this.f48050lvui = qrj(value);
                break;
            case 11:
                this.f48042d3 = qrj(value);
                break;
            case 12:
                this.f48046gvn7 = qrj(value);
                break;
            case 13:
                this.f2222r = qrj(value);
                break;
            case 14:
                this.f48049jp0y = qrj(value);
                break;
            case 15:
                this.f48040a9 = n7h(value);
                break;
            case 16:
                this.f48045fti = x2(value);
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: q */
    public void mo1434q(HashSet<String> attributes) {
        if (!Float.isNaN(this.f48049jp0y)) {
            attributes.add("alpha");
        }
        if (!Float.isNaN(this.f48046gvn7)) {
            attributes.add("elevation");
        }
        if (!Float.isNaN(this.f48042d3)) {
            attributes.add("rotation");
        }
        if (!Float.isNaN(this.f48053oc)) {
            attributes.add("rotationX");
        }
        if (!Float.isNaN(this.f48044eqxt)) {
            attributes.add("rotationY");
        }
        if (!Float.isNaN(this.f48041d2ok)) {
            attributes.add(AbstractC0368g.f48080x2);
        }
        if (!Float.isNaN(this.f48050lvui)) {
            attributes.add(AbstractC0368g.f48077qrj);
        }
        if (!Float.isNaN(this.f48052ncyb)) {
            attributes.add("translationX");
        }
        if (!Float.isNaN(this.f2221l)) {
            attributes.add("translationY");
        }
        if (!Float.isNaN(this.f48051n5r1)) {
            attributes.add("translationZ");
        }
        if (!Float.isNaN(this.f2222r)) {
            attributes.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f48043dd)) {
            attributes.add("scaleX");
        }
        if (!Float.isNaN(this.f48054x9kr)) {
            attributes.add("scaleY");
        }
        if (!Float.isNaN(this.f48047hyr)) {
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
        if (this.f48040a9 == -1) {
            return;
        }
        if (!Float.isNaN(this.f48049jp0y)) {
            interpolation.put("alpha", Integer.valueOf(this.f48040a9));
        }
        if (!Float.isNaN(this.f48046gvn7)) {
            interpolation.put("elevation", Integer.valueOf(this.f48040a9));
        }
        if (!Float.isNaN(this.f48042d3)) {
            interpolation.put("rotation", Integer.valueOf(this.f48040a9));
        }
        if (!Float.isNaN(this.f48053oc)) {
            interpolation.put("rotationX", Integer.valueOf(this.f48040a9));
        }
        if (!Float.isNaN(this.f48044eqxt)) {
            interpolation.put("rotationY", Integer.valueOf(this.f48040a9));
        }
        if (!Float.isNaN(this.f48041d2ok)) {
            interpolation.put(AbstractC0368g.f48080x2, Integer.valueOf(this.f48040a9));
        }
        if (!Float.isNaN(this.f48050lvui)) {
            interpolation.put(AbstractC0368g.f48077qrj, Integer.valueOf(this.f48040a9));
        }
        if (!Float.isNaN(this.f48052ncyb)) {
            interpolation.put("translationX", Integer.valueOf(this.f48040a9));
        }
        if (!Float.isNaN(this.f2221l)) {
            interpolation.put("translationY", Integer.valueOf(this.f48040a9));
        }
        if (!Float.isNaN(this.f48051n5r1)) {
            interpolation.put("translationZ", Integer.valueOf(this.f48040a9));
        }
        if (!Float.isNaN(this.f2222r)) {
            interpolation.put("transitionPathRotate", Integer.valueOf(this.f48040a9));
        }
        if (!Float.isNaN(this.f48043dd)) {
            interpolation.put("scaleX", Integer.valueOf(this.f48040a9));
        }
        if (!Float.isNaN(this.f48054x9kr)) {
            interpolation.put("scaleY", Integer.valueOf(this.f48040a9));
        }
        if (!Float.isNaN(this.f48047hyr)) {
            interpolation.put("progress", Integer.valueOf(this.f48040a9));
        }
        if (this.f2241n.size() > 0) {
            Iterator<String> it = this.f2241n.keySet().iterator();
            while (it.hasNext()) {
                interpolation.put("CUSTOM," + it.next(), Integer.valueOf(this.f48040a9));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: toq */
    public AbstractC0368g clone() {
        return new f7l8().zy(this);
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    public AbstractC0368g zy(AbstractC0368g src) {
        super.zy(src);
        f7l8 f7l8Var = (f7l8) src;
        this.f48040a9 = f7l8Var.f48040a9;
        this.f48045fti = f7l8Var.f48045fti;
        this.f48049jp0y = f7l8Var.f48049jp0y;
        this.f48046gvn7 = f7l8Var.f48046gvn7;
        this.f48042d3 = f7l8Var.f48042d3;
        this.f48053oc = f7l8Var.f48053oc;
        this.f48044eqxt = f7l8Var.f48044eqxt;
        this.f48041d2ok = f7l8Var.f48041d2ok;
        this.f48050lvui = f7l8Var.f48050lvui;
        this.f2222r = f7l8Var.f2222r;
        this.f48043dd = f7l8Var.f48043dd;
        this.f48054x9kr = f7l8Var.f48054x9kr;
        this.f48052ncyb = f7l8Var.f48052ncyb;
        this.f2221l = f7l8Var.f2221l;
        this.f48051n5r1 = f7l8Var.f48051n5r1;
        this.f48047hyr = f7l8Var.f48047hyr;
        return this;
    }
}
