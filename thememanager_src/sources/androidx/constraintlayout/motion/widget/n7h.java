package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.C0284q;
import androidx.constraintlayout.motion.utils.AbstractC0352q;
import androidx.constraintlayout.widget.C0395k;
import androidx.constraintlayout.widget.C0397q;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.miui.maml.folme.AnimatedProperty;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: MotionConstrainedPoint.java */
/* JADX INFO: loaded from: classes.dex */
class n7h implements Comparable<n7h> {
    static final int an = 1;
    public static final String bp = "MotionPaths";
    public static final boolean bv = false;
    static final int id = 2;
    static String[] in = {"position", AnimatedProperty.PROPERTY_NAME_X, AnimatedProperty.PROPERTY_NAME_Y, "width", InterfaceC1925p.byf, "pathRotate"};

    /* JADX INFO: renamed from: a */
    private float f2306a;

    /* JADX INFO: renamed from: b */
    private float f2307b;

    /* JADX INFO: renamed from: e */
    private C0284q f2310e;

    /* JADX INFO: renamed from: m */
    private float f2318m;

    /* JADX INFO: renamed from: n */
    int f2319n;

    /* JADX INFO: renamed from: o */
    private float f2320o;

    /* JADX INFO: renamed from: x */
    private float f2329x;

    /* JADX INFO: renamed from: k */
    private float f2316k = 1.0f;

    /* JADX INFO: renamed from: q */
    int f2322q = 0;

    /* JADX INFO: renamed from: g */
    private boolean f2312g = false;

    /* JADX INFO: renamed from: y */
    private float f2330y = 0.0f;

    /* JADX INFO: renamed from: s */
    private float f2324s = 0.0f;

    /* JADX INFO: renamed from: p */
    private float f2321p = 0.0f;

    /* JADX INFO: renamed from: h */
    public float f2313h = 0.0f;

    /* JADX INFO: renamed from: i */
    private float f2314i = 1.0f;

    /* JADX INFO: renamed from: z */
    private float f2331z = 1.0f;

    /* JADX INFO: renamed from: t */
    private float f2325t = Float.NaN;

    /* JADX INFO: renamed from: r */
    private float f2323r = Float.NaN;

    /* JADX INFO: renamed from: l */
    private float f2317l = 0.0f;

    /* JADX INFO: renamed from: f */
    private float f2311f = 0.0f;

    /* JADX INFO: renamed from: c */
    private float f2308c = 0.0f;

    /* JADX INFO: renamed from: j */
    private int f2315j = 0;

    /* JADX INFO: renamed from: u */
    private float f2326u = Float.NaN;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private float f48169bo = Float.NaN;

    /* JADX INFO: renamed from: v */
    private int f2327v = -1;

    /* JADX INFO: renamed from: d */
    LinkedHashMap<String, C0395k> f2309d = new LinkedHashMap<>();

    /* JADX INFO: renamed from: w */
    int f2328w = 0;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    double[] f48168ab = new double[18];
    double[] bb = new double[18];

    private boolean f7l8(float a2, float b2) {
        return (Float.isNaN(a2) || Float.isNaN(b2)) ? Float.isNaN(a2) != Float.isNaN(b2) : Math.abs(a2 - b2) > 1.0E-6f;
    }

    public void cdj(Rect cw, C0397q constraintSet, int rotation, int viewId) {
        kja0(cw.left, cw.top, cw.width(), cw.height());
        m1486q(constraintSet.nmn5(viewId));
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    if (rotation != 4) {
                        return;
                    }
                }
            }
            float f2 = this.f2324s + 90.0f;
            this.f2324s = f2;
            if (f2 > 180.0f) {
                this.f2324s = f2 - 360.0f;
                return;
            }
            return;
        }
        this.f2324s -= 90.0f;
    }

    /* JADX INFO: renamed from: h */
    public void m1483h(Rect rect, View view, int rotation, float prevous) {
        kja0(rect.left, rect.top, rect.width(), rect.height());
        zy(view);
        this.f2325t = Float.NaN;
        this.f2323r = Float.NaN;
        if (rotation == 1) {
            this.f2324s = prevous - 90.0f;
        } else {
            if (rotation != 2) {
                return;
            }
            this.f2324s = prevous + 90.0f;
        }
    }

    public void ki(View view) {
        kja0(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        zy(view);
    }

    void kja0(float x3, float y3, float w2, float h2) {
        this.f2318m = x3;
        this.f2307b = y3;
        this.f2306a = w2;
        this.f2329x = h2;
    }

    void ld6(double[] data, int[] toUse) {
        float[] fArr = {this.f2320o, this.f2318m, this.f2307b, this.f2306a, this.f2329x, this.f2316k, this.f2330y, this.f2324s, this.f2321p, this.f2313h, this.f2314i, this.f2331z, this.f2325t, this.f2323r, this.f2317l, this.f2311f, this.f2308c, this.f2326u};
        int i2 = 0;
        for (int i3 : toUse) {
            if (i3 < 18) {
                data[i2] = fArr[r4];
                i2++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(n7h o2) {
        return Float.compare(this.f2320o, o2.f2320o);
    }

    boolean n7h(String name) {
        return this.f2309d.containsKey(name);
    }

    /* JADX INFO: renamed from: p */
    void m1485p(n7h points, boolean[] mask, String[] custom) {
        mask[0] = mask[0] | f7l8(this.f2320o, points.f2320o);
        mask[1] = mask[1] | f7l8(this.f2318m, points.f2318m);
        mask[2] = mask[2] | f7l8(this.f2307b, points.f2307b);
        mask[3] = mask[3] | f7l8(this.f2306a, points.f2306a);
        mask[4] = f7l8(this.f2329x, points.f2329x) | mask[4];
    }

    /* JADX INFO: renamed from: q */
    public void m1486q(C0397q.k c2) {
        C0397q.q qVar = c2.f49834zy;
        int i2 = qVar.f49861zy;
        this.f2322q = i2;
        int i3 = qVar.f49860toq;
        this.f2319n = i3;
        this.f2316k = (i3 == 0 || i2 != 0) ? qVar.f2987q : 0.0f;
        C0397q.n nVar = c2.f2962g;
        this.f2312g = nVar.f49856qrj;
        this.f2330y = nVar.f49855n7h;
        this.f2324s = nVar.f49857toq;
        this.f2321p = nVar.f49859zy;
        this.f2313h = nVar.f2982q;
        this.f2314i = nVar.f2980n;
        this.f2331z = nVar.f2978g;
        this.f2325t = nVar.f49853f7l8;
        this.f2323r = nVar.f2984y;
        this.f2317l = nVar.f2981p;
        this.f2311f = nVar.f49854ld6;
        this.f2308c = nVar.f49858x2;
        this.f2310e = C0284q.zy(c2.f2965q.f3021q);
        C0397q.zy zyVar = c2.f2965q;
        this.f2326u = zyVar.f3022s;
        this.f2315j = zyVar.f3017g;
        this.f2327v = zyVar.f49990toq;
        this.f48169bo = c2.f49834zy.f2986n;
        for (String str : c2.f49832f7l8.keySet()) {
            C0395k c0395k = c2.f49832f7l8.get(str);
            if (c0395k.n7h()) {
                this.f2309d.put(str, c0395k);
            }
        }
    }

    int qrj(String name) {
        return this.f2309d.get(name).m1637h();
    }

    /* JADX INFO: renamed from: s */
    void m1487s(n7h points, HashSet<String> keySet) {
        if (f7l8(this.f2316k, points.f2316k)) {
            keySet.add("alpha");
        }
        if (f7l8(this.f2330y, points.f2330y)) {
            keySet.add("elevation");
        }
        int i2 = this.f2319n;
        int i3 = points.f2319n;
        if (i2 != i3 && this.f2322q == 0 && (i2 == 0 || i3 == 0)) {
            keySet.add("alpha");
        }
        if (f7l8(this.f2324s, points.f2324s)) {
            keySet.add("rotation");
        }
        if (!Float.isNaN(this.f2326u) || !Float.isNaN(points.f2326u)) {
            keySet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f48169bo) || !Float.isNaN(points.f48169bo)) {
            keySet.add("progress");
        }
        if (f7l8(this.f2321p, points.f2321p)) {
            keySet.add("rotationX");
        }
        if (f7l8(this.f2313h, points.f2313h)) {
            keySet.add("rotationY");
        }
        if (f7l8(this.f2325t, points.f2325t)) {
            keySet.add(AbstractC0368g.f48080x2);
        }
        if (f7l8(this.f2323r, points.f2323r)) {
            keySet.add(AbstractC0368g.f48077qrj);
        }
        if (f7l8(this.f2314i, points.f2314i)) {
            keySet.add("scaleX");
        }
        if (f7l8(this.f2331z, points.f2331z)) {
            keySet.add("scaleY");
        }
        if (f7l8(this.f2317l, points.f2317l)) {
            keySet.add("translationX");
        }
        if (f7l8(this.f2311f, points.f2311f)) {
            keySet.add("translationY");
        }
        if (f7l8(this.f2308c, points.f2308c)) {
            keySet.add("translationZ");
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void toq(HashMap<String, AbstractC0352q> splines, int mFramePosition) {
        for (String str : splines.keySet()) {
            AbstractC0352q abstractC0352q = splines.get(str);
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
                case -760884510:
                    if (str.equals(AbstractC0368g.f48080x2)) {
                        b2 = 8;
                    }
                    break;
                case -760884509:
                    if (str.equals(AbstractC0368g.f48077qrj)) {
                        b2 = 9;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        b2 = 10;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        b2 = com.google.common.base.zy.f68132qrj;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        b2 = com.google.common.base.zy.f68128n7h;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        b2 = com.google.common.base.zy.f68124kja0;
                    }
                    break;
            }
            switch (b2) {
                case 0:
                    abstractC0352q.f7l8(mFramePosition, Float.isNaN(this.f2321p) ? 0.0f : this.f2321p);
                    break;
                case 1:
                    abstractC0352q.f7l8(mFramePosition, Float.isNaN(this.f2313h) ? 0.0f : this.f2313h);
                    break;
                case 2:
                    abstractC0352q.f7l8(mFramePosition, Float.isNaN(this.f2317l) ? 0.0f : this.f2317l);
                    break;
                case 3:
                    abstractC0352q.f7l8(mFramePosition, Float.isNaN(this.f2311f) ? 0.0f : this.f2311f);
                    break;
                case 4:
                    abstractC0352q.f7l8(mFramePosition, Float.isNaN(this.f2308c) ? 0.0f : this.f2308c);
                    break;
                case 5:
                    abstractC0352q.f7l8(mFramePosition, Float.isNaN(this.f48169bo) ? 0.0f : this.f48169bo);
                    break;
                case 6:
                    abstractC0352q.f7l8(mFramePosition, Float.isNaN(this.f2314i) ? 1.0f : this.f2314i);
                    break;
                case 7:
                    abstractC0352q.f7l8(mFramePosition, Float.isNaN(this.f2331z) ? 1.0f : this.f2331z);
                    break;
                case 8:
                    abstractC0352q.f7l8(mFramePosition, Float.isNaN(this.f2325t) ? 0.0f : this.f2325t);
                    break;
                case 9:
                    abstractC0352q.f7l8(mFramePosition, Float.isNaN(this.f2323r) ? 0.0f : this.f2323r);
                    break;
                case 10:
                    abstractC0352q.f7l8(mFramePosition, Float.isNaN(this.f2324s) ? 0.0f : this.f2324s);
                    break;
                case 11:
                    abstractC0352q.f7l8(mFramePosition, Float.isNaN(this.f2330y) ? 0.0f : this.f2330y);
                    break;
                case 12:
                    abstractC0352q.f7l8(mFramePosition, Float.isNaN(this.f2326u) ? 0.0f : this.f2326u);
                    break;
                case 13:
                    abstractC0352q.f7l8(mFramePosition, Float.isNaN(this.f2316k) ? 1.0f : this.f2316k);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.f2309d.containsKey(str2)) {
                            C0395k c0395k = this.f2309d.get(str2);
                            if (abstractC0352q instanceof AbstractC0352q.toq) {
                                ((AbstractC0352q.toq) abstractC0352q).n7h(mFramePosition, c0395k);
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + mFramePosition + ", value" + c0395k.ld6() + abstractC0352q);
                            }
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline " + str);
                    }
                    break;
            }
        }
    }

    int x2(String name, double[] value, int offset) {
        C0395k c0395k = this.f2309d.get(name);
        if (c0395k.m1637h() == 1) {
            value[offset] = c0395k.ld6();
            return 1;
        }
        int iM1637h = c0395k.m1637h();
        c0395k.x2(new float[iM1637h]);
        int i2 = 0;
        while (i2 < iM1637h) {
            value[offset] = r1[i2];
            i2++;
            offset++;
        }
        return iM1637h;
    }

    public void zy(View view) {
        this.f2319n = view.getVisibility();
        this.f2316k = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f2312g = false;
        this.f2330y = view.getElevation();
        this.f2324s = view.getRotation();
        this.f2321p = view.getRotationX();
        this.f2313h = view.getRotationY();
        this.f2314i = view.getScaleX();
        this.f2331z = view.getScaleY();
        this.f2325t = view.getPivotX();
        this.f2323r = view.getPivotY();
        this.f2317l = view.getTranslationX();
        this.f2311f = view.getTranslationY();
        this.f2308c = view.getTranslationZ();
    }
}
