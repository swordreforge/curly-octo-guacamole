package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.C0284q;
import androidx.constraintlayout.motion.utils.AbstractC0349g;
import androidx.constraintlayout.motion.utils.AbstractC0352q;
import androidx.constraintlayout.motion.utils.C0350k;
import androidx.constraintlayout.motion.utils.C0351n;
import androidx.constraintlayout.motion.utils.zy;
import androidx.constraintlayout.widget.C0395k;
import androidx.constraintlayout.widget.C0397q;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import y9n.C7780k;

/* JADX INFO: compiled from: MotionController.java */
/* JADX INFO: loaded from: classes.dex */
public class kja0 {

    /* JADX INFO: renamed from: a */
    private static final int f2284a = -2;

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    private static final int f48121a98o = -1;

    /* JADX INFO: renamed from: b */
    static final int f2285b = 3;

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    static final int f48122bf2 = 4;

    /* JADX INFO: renamed from: c */
    public static final int f2286c = 2;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final int f48123dd = 1;

    /* JADX INFO: renamed from: e */
    public static final int f2287e = 6;

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    static final int f48124ek5k = 0;

    /* JADX INFO: renamed from: f */
    public static final int f2288f = 1;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    public static final int f48125hb = 2;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    public static final int f48126hyr = 0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    static final int f48127i1 = 5;

    /* JADX INFO: renamed from: j */
    private static final String f2289j = "MotionController";

    /* JADX INFO: renamed from: l */
    public static final int f2290l = 4;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    public static final int f48128lrht = 3;

    /* JADX INFO: renamed from: m */
    private static final boolean f2291m = false;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    public static final int f48129n5r1 = 5;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    public static final int f48130ncyb = 3;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    public static final int f48131nn86 = 1;

    /* JADX INFO: renamed from: o */
    private static final boolean f2292o = false;

    /* JADX INFO: renamed from: r */
    public static final int f2293r = 0;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    public static final int f48132uv6 = 4;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    public static final int f48133vyq = 5;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    public static final int f48134x9kr = 2;

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    static final int f48135y9n = 2;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    static final int f48136yz = 1;

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    private static final int f48137zp = -3;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private qrj[] f48138a9;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    float f48139cdj;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private boolean f48140d2ok;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private int f48141d3;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private Interpolator f48142eqxt;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private String[] f48144fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private int f48145fti;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private View f48147gvn7;

    /* JADX INFO: renamed from: h */
    float f2295h;

    /* JADX INFO: renamed from: i */
    private double[] f2296i;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.motion.utils.zy> f48148jk;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private int f48149jp0y;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int[] f48150ki;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.toq[] f48152ld6;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    String[] f48153lvui;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private HashMap<String, AbstractC0352q> f48154mcp;

    /* JADX INFO: renamed from: n */
    String f2298n;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private float f48158oc;

    /* JADX INFO: renamed from: t */
    private HashMap<String, AbstractC0349g> f2302t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private double[] f48160t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    View f48161toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.toq f48163x2;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private int[] f48164zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    int f48165zy;

    /* JADX INFO: renamed from: k */
    Rect f2297k = new Rect();

    /* JADX INFO: renamed from: q */
    boolean f2300q = false;

    /* JADX INFO: renamed from: g */
    private int f2294g = -1;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private ki f48143f7l8 = new ki();

    /* JADX INFO: renamed from: y */
    private ki f2303y = new ki();

    /* JADX INFO: renamed from: s */
    private n7h f2301s = new n7h();

    /* JADX INFO: renamed from: p */
    private n7h f2299p = new n7h();

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    float f48159qrj = Float.NaN;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    float f48155n7h = 0.0f;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    float f48151kja0 = 1.0f;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private int f48156ni7 = 4;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private float[] f48146fu4 = new float[4];

    /* JADX INFO: renamed from: z */
    private ArrayList<ki> f2304z = new ArrayList<>();

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private float[] f48157o1t = new float[1];

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private ArrayList<AbstractC0368g> f48162wvg = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.kja0$k */
    /* JADX INFO: compiled from: MotionController.java */
    class InterpolatorC0372k implements Interpolator {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C0284q f2305k;

        InterpolatorC0372k(final C0284q val$easing) {
            this.f2305k = val$easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float v2) {
            return (float) this.f2305k.mo986k(v2);
        }
    }

    kja0(View view) {
        int i2 = AbstractC0368g.f2232g;
        this.f48145fti = i2;
        this.f48149jp0y = i2;
        this.f48147gvn7 = null;
        this.f48141d3 = i2;
        this.f48158oc = Float.NaN;
        this.f48142eqxt = null;
        this.f48140d2ok = false;
        m1467e(view);
    }

    private void dd(ki motionPaths) {
        motionPaths.ni7((int) this.f48161toq.getX(), (int) this.f48161toq.getY(), this.f48161toq.getWidth(), this.f48161toq.getHeight());
    }

    private void eqxt(ki point) {
        if (Collections.binarySearch(this.f2304z, point) == 0) {
            Log.e(f2289j, " KeyPath position \"" + point.f2268g + "\" outside of range");
        }
        this.f2304z.add((-r0) - 1, point);
    }

    private float jk() {
        char c2;
        float fHypot;
        float[] fArr = new float[2];
        float f2 = 1.0f / 99;
        double d2 = 0.0d;
        double d4 = 0.0d;
        float f3 = 0.0f;
        int i2 = 0;
        while (i2 < 100) {
            float f4 = i2 * f2;
            double dMo986k = f4;
            C0284q c0284q = this.f48143f7l8.f2272k;
            float f5 = Float.NaN;
            float f6 = 0.0f;
            for (ki kiVar : this.f2304z) {
                C0284q c0284q2 = kiVar.f2272k;
                if (c0284q2 != null) {
                    float f7 = kiVar.f2275n;
                    if (f7 < f4) {
                        c0284q = c0284q2;
                        f6 = f7;
                    } else if (Float.isNaN(f5)) {
                        f5 = kiVar.f2275n;
                    }
                }
            }
            if (c0284q != null) {
                if (Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                dMo986k = (((float) c0284q.mo986k((f4 - f6) / r17)) * (f5 - f6)) + f6;
            }
            this.f48152ld6[0].mo1018q(dMo986k, this.f48160t8r);
            float f8 = f3;
            int i3 = i2;
            this.f48143f7l8.ld6(dMo986k, this.f48150ki, this.f48160t8r, fArr, 0);
            if (i3 > 0) {
                c2 = 0;
                fHypot = (float) (((double) f8) + Math.hypot(d4 - ((double) fArr[1]), d2 - ((double) fArr[0])));
            } else {
                c2 = 0;
                fHypot = f8;
            }
            d2 = fArr[c2];
            i2 = i3 + 1;
            f3 = fHypot;
            d4 = fArr[1];
        }
        return f3;
    }

    /* JADX INFO: renamed from: p */
    private float m1465p(float position, float[] velocity) {
        float f2 = 0.0f;
        if (velocity != null) {
            velocity[0] = 1.0f;
        } else {
            float f3 = this.f48151kja0;
            if (f3 != 1.0d) {
                float f4 = this.f48155n7h;
                if (position < f4) {
                    position = 0.0f;
                }
                if (position > f4 && position < 1.0d) {
                    position = Math.min((position - f4) * f3, 1.0f);
                }
            }
        }
        C0284q c0284q = this.f48143f7l8.f2272k;
        float f5 = Float.NaN;
        for (ki kiVar : this.f2304z) {
            C0284q c0284q2 = kiVar.f2272k;
            if (c0284q2 != null) {
                float f6 = kiVar.f2275n;
                if (f6 < position) {
                    c0284q = c0284q2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = kiVar.f2275n;
                }
            }
        }
        if (c0284q != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d2 = (position - f2) / f7;
            position = (((float) c0284q.mo986k(d2)) * f7) + f2;
            if (velocity != null) {
                velocity[0] = (float) c0284q.toq(d2);
            }
        }
        return position;
    }

    private static Interpolator zurt(Context context, int type, String interpolatorString, int id) {
        if (type == -2) {
            return AnimationUtils.loadInterpolator(context, id);
        }
        if (type == -1) {
            return new InterpolatorC0372k(C0284q.zy(interpolatorString));
        }
        if (type == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (type == 1) {
            return new AccelerateInterpolator();
        }
        if (type == 2) {
            return new DecelerateInterpolator();
        }
        if (type == 4) {
            return new BounceInterpolator();
        }
        if (type != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    public float a9() {
        return this.f48143f7l8.f2269h;
    }

    /* JADX INFO: renamed from: c */
    void m1466c(View v2) {
        ki kiVar = this.f48143f7l8;
        kiVar.f2275n = 0.0f;
        kiVar.f2268g = 0.0f;
        kiVar.ni7(v2.getX(), v2.getY(), v2.getWidth(), v2.getHeight());
        this.f2301s.ki(v2);
    }

    public int cdj() {
        int iMax = this.f48143f7l8.f2278q;
        Iterator<ki> it = this.f2304z.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f2278q);
        }
        return Math.max(iMax, this.f2303y.f2278q);
    }

    boolean d2ok(View child, float global_position, long time, androidx.constraintlayout.core.motion.utils.f7l8 keyCache) {
        AbstractC0349g.q qVar;
        boolean zLd6;
        int i2;
        double d2;
        float fM1465p = m1465p(global_position, null);
        int i3 = this.f48141d3;
        if (i3 != AbstractC0368g.f2232g) {
            float f2 = 1.0f / i3;
            float fFloor = ((float) Math.floor(fM1465p / f2)) * f2;
            float f3 = (fM1465p % f2) / f2;
            if (!Float.isNaN(this.f48158oc)) {
                f3 = (f3 + this.f48158oc) % 1.0f;
            }
            Interpolator interpolator = this.f48142eqxt;
            fM1465p = ((interpolator != null ? interpolator.getInterpolation(f3) : ((double) f3) > 0.5d ? 1.0f : 0.0f) * f2) + fFloor;
        }
        float f4 = fM1465p;
        HashMap<String, AbstractC0352q> map = this.f48154mcp;
        if (map != null) {
            Iterator<AbstractC0352q> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().qrj(child, f4);
            }
        }
        HashMap<String, AbstractC0349g> map2 = this.f2302t;
        if (map2 != null) {
            AbstractC0349g.q qVar2 = null;
            boolean zMo1378p = false;
            for (AbstractC0349g abstractC0349g : map2.values()) {
                if (abstractC0349g instanceof AbstractC0349g.q) {
                    qVar2 = (AbstractC0349g.q) abstractC0349g;
                } else {
                    zMo1378p |= abstractC0349g.mo1378p(child, f4, time, keyCache);
                }
            }
            zLd6 = zMo1378p;
            qVar = qVar2;
        } else {
            qVar = null;
            zLd6 = false;
        }
        androidx.constraintlayout.core.motion.utils.toq[] toqVarArr = this.f48152ld6;
        if (toqVarArr != null) {
            double d4 = f4;
            toqVarArr[0].mo1018q(d4, this.f48160t8r);
            this.f48152ld6[0].f7l8(d4, this.f2296i);
            androidx.constraintlayout.core.motion.utils.toq toqVar = this.f48163x2;
            if (toqVar != null) {
                double[] dArr = this.f48160t8r;
                if (dArr.length > 0) {
                    toqVar.mo1018q(d4, dArr);
                    this.f48163x2.f7l8(d4, this.f2296i);
                }
            }
            if (this.f48140d2ok) {
                d2 = d4;
            } else {
                d2 = d4;
                this.f48143f7l8.m1464z(f4, child, this.f48150ki, this.f48160t8r, this.f2296i, null, this.f2300q);
                this.f2300q = false;
            }
            if (this.f48149jp0y != AbstractC0368g.f2232g) {
                if (this.f48147gvn7 == null) {
                    this.f48147gvn7 = ((View) child.getParent()).findViewById(this.f48149jp0y);
                }
                if (this.f48147gvn7 != null) {
                    float top = (r1.getTop() + this.f48147gvn7.getBottom()) / 2.0f;
                    float left = (this.f48147gvn7.getLeft() + this.f48147gvn7.getRight()) / 2.0f;
                    if (child.getRight() - child.getLeft() > 0 && child.getBottom() - child.getTop() > 0) {
                        child.setPivotX(left - child.getLeft());
                        child.setPivotY(top - child.getTop());
                    }
                }
            }
            HashMap<String, AbstractC0352q> map3 = this.f48154mcp;
            if (map3 != null) {
                for (AbstractC0352q abstractC0352q : map3.values()) {
                    if (abstractC0352q instanceof AbstractC0352q.q) {
                        double[] dArr2 = this.f2296i;
                        if (dArr2.length > 1) {
                            ((AbstractC0352q.q) abstractC0352q).n7h(child, f4, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (qVar != null) {
                double[] dArr3 = this.f2296i;
                i2 = 1;
                zLd6 |= qVar.ld6(child, keyCache, f4, time, dArr3[0], dArr3[1]);
            } else {
                i2 = 1;
            }
            int i4 = i2;
            while (true) {
                androidx.constraintlayout.core.motion.utils.toq[] toqVarArr2 = this.f48152ld6;
                if (i4 >= toqVarArr2.length) {
                    break;
                }
                toqVarArr2[i4].mo1017n(d2, this.f48146fu4);
                C0350k.toq(this.f48143f7l8.f2265c.get(this.f48144fn3e[i4 - 1]), child, this.f48146fu4);
                i4++;
            }
            n7h n7hVar = this.f2301s;
            if (n7hVar.f2322q == 0) {
                if (f4 <= 0.0f) {
                    child.setVisibility(n7hVar.f2319n);
                } else if (f4 >= 1.0f) {
                    child.setVisibility(this.f2299p.f2319n);
                } else if (this.f2299p.f2319n != n7hVar.f2319n) {
                    child.setVisibility(0);
                }
            }
            if (this.f48138a9 != null) {
                int i5 = 0;
                while (true) {
                    qrj[] qrjVarArr = this.f48138a9;
                    if (i5 >= qrjVarArr.length) {
                        break;
                    }
                    qrjVarArr[i5].wvg(f4, child);
                    i5++;
                }
            }
        } else {
            i2 = 1;
            ki kiVar = this.f48143f7l8;
            float f5 = kiVar.f2282y;
            ki kiVar2 = this.f2303y;
            float f6 = f5 + ((kiVar2.f2282y - f5) * f4);
            float f7 = kiVar.f2280s;
            float f8 = f7 + ((kiVar2.f2280s - f7) * f4);
            float f9 = kiVar.f2277p;
            float f10 = kiVar2.f2277p;
            float f11 = kiVar.f2269h;
            float f12 = kiVar2.f2269h;
            float f13 = f6 + 0.5f;
            int i6 = (int) f13;
            float f14 = f8 + 0.5f;
            int i7 = (int) f14;
            int i8 = (int) (f13 + ((f10 - f9) * f4) + f9);
            int i9 = (int) (f14 + ((f12 - f11) * f4) + f11);
            int i10 = i8 - i6;
            int i11 = i9 - i7;
            if (f10 != f9 || f12 != f11 || this.f2300q) {
                child.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                this.f2300q = false;
            }
            child.layout(i6, i7, i8, i9);
        }
        HashMap<String, androidx.constraintlayout.motion.utils.zy> map4 = this.f48148jk;
        if (map4 != null) {
            for (androidx.constraintlayout.motion.utils.zy zyVar : map4.values()) {
                if (zyVar instanceof zy.C0357q) {
                    double[] dArr4 = this.f2296i;
                    ((zy.C0357q) zyVar).n7h(child, f4, dArr4[0], dArr4[i2]);
                } else {
                    zyVar.qrj(child, f4);
                }
            }
        }
        return zLd6;
    }

    public int d3() {
        return this.f48149jp0y;
    }

    /* JADX INFO: renamed from: e */
    public void m1467e(View view) {
        this.f48161toq = view;
        this.f48165zy = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.toq) {
            this.f2298n = ((ConstraintLayout.toq) layoutParams).m1624k();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1468f(int arc) {
        this.f48145fti = arc;
    }

    void f7l8(float p2, float[] path, int offset) {
        this.f48152ld6[0].mo1018q(m1465p(p2, null), this.f48160t8r);
        this.f48143f7l8.m1459h(this.f48150ki, this.f48160t8r, path, offset);
    }

    public float fn3e() {
        return this.f2303y.f2280s;
    }

    public float fti() {
        return this.f48143f7l8.f2277p;
    }

    public int fu4(int type, int[] info) {
        float[] fArr = new float[2];
        int i2 = 0;
        int i3 = 0;
        for (AbstractC0368g abstractC0368g : this.f48162wvg) {
            int i4 = abstractC0368g.f2242q;
            if (i4 == type || type != -1) {
                info[i3] = 0;
                int i5 = i3 + 1;
                info[i5] = i4;
                int i6 = i5 + 1;
                int i7 = abstractC0368g.f2240k;
                info[i6] = i7;
                double d2 = i7 / 100.0f;
                this.f48152ld6[0].mo1018q(d2, this.f48160t8r);
                this.f48143f7l8.ld6(d2, this.f48150ki, this.f48160t8r, fArr, 0);
                int i8 = i6 + 1;
                info[i8] = Float.floatToIntBits(fArr[0]);
                int i9 = i8 + 1;
                info[i9] = Float.floatToIntBits(fArr[1]);
                if (abstractC0368g instanceof C0375p) {
                    C0375p c0375p = (C0375p) abstractC0368g;
                    int i10 = i9 + 1;
                    info[i10] = c0375p.f48220dd;
                    int i11 = i10 + 1;
                    info[i11] = Float.floatToIntBits(c0375p.f48221eqxt);
                    i9 = i11 + 1;
                    info[i9] = Float.floatToIntBits(c0375p.f48218d2ok);
                }
                int i12 = i9 + 1;
                info[i3] = i12 - i3;
                i2++;
                i3 = i12;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: g */
    void m1469g(float[] points, int pointCount) {
        double dMo986k;
        float f2 = 1.0f;
        float f3 = 1.0f / (pointCount - 1);
        HashMap<String, AbstractC0352q> map = this.f48154mcp;
        AbstractC0352q abstractC0352q = map == null ? null : map.get("translationX");
        HashMap<String, AbstractC0352q> map2 = this.f48154mcp;
        AbstractC0352q abstractC0352q2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, androidx.constraintlayout.motion.utils.zy> map3 = this.f48148jk;
        androidx.constraintlayout.motion.utils.zy zyVar = map3 == null ? null : map3.get("translationX");
        HashMap<String, androidx.constraintlayout.motion.utils.zy> map4 = this.f48148jk;
        androidx.constraintlayout.motion.utils.zy zyVar2 = map4 != null ? map4.get("translationY") : null;
        int i2 = 0;
        while (i2 < pointCount) {
            float fMin = i2 * f3;
            float f4 = this.f48151kja0;
            if (f4 != f2) {
                float f5 = this.f48155n7h;
                if (fMin < f5) {
                    fMin = 0.0f;
                }
                if (fMin > f5 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f5) * f4, f2);
                }
            }
            float f6 = fMin;
            double d2 = f6;
            C0284q c0284q = this.f48143f7l8.f2272k;
            float f7 = Float.NaN;
            float f8 = 0.0f;
            for (ki kiVar : this.f2304z) {
                C0284q c0284q2 = kiVar.f2272k;
                double d4 = d2;
                if (c0284q2 != null) {
                    float f9 = kiVar.f2275n;
                    if (f9 < f6) {
                        f8 = f9;
                        c0284q = c0284q2;
                    } else if (Float.isNaN(f7)) {
                        f7 = kiVar.f2275n;
                    }
                }
                d2 = d4;
            }
            double d5 = d2;
            if (c0284q != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                dMo986k = (((float) c0284q.mo986k((f6 - f8) / r5)) * (f7 - f8)) + f8;
            } else {
                dMo986k = d5;
            }
            this.f48152ld6[0].mo1018q(dMo986k, this.f48160t8r);
            androidx.constraintlayout.core.motion.utils.toq toqVar = this.f48163x2;
            if (toqVar != null) {
                double[] dArr = this.f48160t8r;
                if (dArr.length > 0) {
                    toqVar.mo1018q(dMo986k, dArr);
                }
            }
            int i3 = i2 * 2;
            int i4 = i2;
            this.f48143f7l8.ld6(dMo986k, this.f48150ki, this.f48160t8r, points, i3);
            if (zyVar != null) {
                points[i3] = points[i3] + zyVar.m1074k(f6);
            } else if (abstractC0352q != null) {
                points[i3] = points[i3] + abstractC0352q.m1030k(f6);
            }
            if (zyVar2 != null) {
                int i5 = i3 + 1;
                points[i5] = points[i5] + zyVar2.m1074k(f6);
            } else if (abstractC0352q2 != null) {
                int i6 = i3 + 1;
                points[i6] = points[i6] + abstractC0352q2.m1030k(f6);
            }
            i2 = i4 + 1;
            f2 = 1.0f;
        }
    }

    public float gvn7() {
        return this.f48143f7l8.f2280s;
    }

    /* JADX INFO: renamed from: h */
    void m1470h(float position, float locationX, float locationY, float[] mAnchorDpDt) {
        double[] dArr;
        float fM1465p = m1465p(position, this.f48157o1t);
        androidx.constraintlayout.core.motion.utils.toq[] toqVarArr = this.f48152ld6;
        int i2 = 0;
        if (toqVarArr == null) {
            ki kiVar = this.f2303y;
            float f2 = kiVar.f2282y;
            ki kiVar2 = this.f48143f7l8;
            float f3 = f2 - kiVar2.f2282y;
            float f4 = kiVar.f2280s - kiVar2.f2280s;
            float f5 = (kiVar.f2277p - kiVar2.f2277p) + f3;
            float f6 = (kiVar.f2269h - kiVar2.f2269h) + f4;
            mAnchorDpDt[0] = (f3 * (1.0f - locationX)) + (f5 * locationX);
            mAnchorDpDt[1] = (f4 * (1.0f - locationY)) + (f6 * locationY);
            return;
        }
        double d2 = fM1465p;
        toqVarArr[0].f7l8(d2, this.f2296i);
        this.f48152ld6[0].mo1018q(d2, this.f48160t8r);
        float f7 = this.f48157o1t[0];
        while (true) {
            dArr = this.f2296i;
            if (i2 >= dArr.length) {
                break;
            }
            dArr[i2] = dArr[i2] * ((double) f7);
            i2++;
        }
        androidx.constraintlayout.core.motion.utils.toq toqVar = this.f48163x2;
        if (toqVar == null) {
            this.f48143f7l8.fu4(locationX, locationY, mAnchorDpDt, this.f48150ki, dArr, this.f48160t8r);
            return;
        }
        double[] dArr2 = this.f48160t8r;
        if (dArr2.length > 0) {
            toqVar.mo1018q(d2, dArr2);
            this.f48163x2.f7l8(d2, this.f2296i);
            this.f48143f7l8.fu4(locationX, locationY, mAnchorDpDt, this.f48150ki, this.f2296i, this.f48160t8r);
        }
    }

    public void hb(kja0 motionController) {
        this.f48143f7l8.o1t(motionController, motionController.f48143f7l8);
        this.f2303y.o1t(motionController, motionController.f2303y);
    }

    void hyr(Rect cw, C0397q constraintSet, int parentWidth, int parentHeight) {
        int i2 = constraintSet.f2947q;
        if (i2 != 0) {
            ncyb(cw, this.f2297k, i2, parentWidth, parentHeight);
            cw = this.f2297k;
        }
        ki kiVar = this.f2303y;
        kiVar.f2275n = 1.0f;
        kiVar.f2268g = 1.0f;
        dd(kiVar);
        this.f2303y.ni7(cw.left, cw.top, cw.width(), cw.height());
        this.f2303y.toq(constraintSet.nmn5(this.f48165zy));
        this.f2299p.cdj(cw, constraintSet, i2, this.f48165zy);
    }

    /* JADX INFO: renamed from: i */
    public float m1471i() {
        return this.f2303y.f2282y;
    }

    public float jp0y() {
        return this.f48143f7l8.f2282y;
    }

    /* JADX INFO: renamed from: k */
    public void m1472k(AbstractC0368g key) {
        this.f48162wvg.add(key);
    }

    public float ki() {
        return this.f2303y.f2269h;
    }

    public float kja0() {
        return this.f48139cdj;
    }

    /* JADX INFO: renamed from: l */
    void m1473l(View v2) {
        ki kiVar = this.f48143f7l8;
        kiVar.f2275n = 0.0f;
        kiVar.f2268g = 0.0f;
        this.f48140d2ok = true;
        kiVar.ni7(v2.getX(), v2.getY(), v2.getWidth(), v2.getHeight());
        this.f2303y.ni7(v2.getX(), v2.getY(), v2.getWidth(), v2.getHeight());
        this.f2301s.ki(v2);
        this.f2299p.ki(v2);
    }

    public int ld6() {
        return this.f48143f7l8.f2279r;
    }

    void lrht(Rect cw, C0397q constraintSet, int parentWidth, int parentHeight) {
        int i2 = constraintSet.f2947q;
        if (i2 != 0) {
            ncyb(cw, this.f2297k, i2, parentWidth, parentHeight);
        }
        ki kiVar = this.f48143f7l8;
        kiVar.f2275n = 0.0f;
        kiVar.f2268g = 0.0f;
        dd(kiVar);
        this.f48143f7l8.ni7(cw.left, cw.top, cw.width(), cw.height());
        C0397q.k kVarNmn5 = constraintSet.nmn5(this.f48165zy);
        this.f48143f7l8.toq(kVarNmn5);
        this.f48159qrj = kVarNmn5.f2965q.f49986f7l8;
        this.f2301s.cdj(cw, constraintSet, i2, this.f48165zy);
        this.f48149jp0y = kVarNmn5.f2962g.f2983s;
        C0397q.zy zyVar = kVarNmn5.f2965q;
        this.f48141d3 = zyVar.f49987ld6;
        this.f48158oc = zyVar.f3020p;
        Context context = this.f48161toq.getContext();
        C0397q.zy zyVar2 = kVarNmn5.f2965q;
        this.f48142eqxt = zurt(context, zyVar2.f49989qrj, zyVar2.f49991x2, zyVar2.f49988n7h);
    }

    String lvui() {
        return this.f48161toq.getContext().getResources().getResourceEntryName(this.f48161toq.getId());
    }

    void mcp(float position, int width, int height, float locationX, float locationY, float[] mAnchorDpDt) {
        float fM1465p = m1465p(position, this.f48157o1t);
        HashMap<String, AbstractC0352q> map = this.f48154mcp;
        AbstractC0352q abstractC0352q = map == null ? null : map.get("translationX");
        HashMap<String, AbstractC0352q> map2 = this.f48154mcp;
        AbstractC0352q abstractC0352q2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, AbstractC0352q> map3 = this.f48154mcp;
        AbstractC0352q abstractC0352q3 = map3 == null ? null : map3.get("rotation");
        HashMap<String, AbstractC0352q> map4 = this.f48154mcp;
        AbstractC0352q abstractC0352q4 = map4 == null ? null : map4.get("scaleX");
        HashMap<String, AbstractC0352q> map5 = this.f48154mcp;
        AbstractC0352q abstractC0352q5 = map5 == null ? null : map5.get("scaleY");
        HashMap<String, androidx.constraintlayout.motion.utils.zy> map6 = this.f48148jk;
        androidx.constraintlayout.motion.utils.zy zyVar = map6 == null ? null : map6.get("translationX");
        HashMap<String, androidx.constraintlayout.motion.utils.zy> map7 = this.f48148jk;
        androidx.constraintlayout.motion.utils.zy zyVar2 = map7 == null ? null : map7.get("translationY");
        HashMap<String, androidx.constraintlayout.motion.utils.zy> map8 = this.f48148jk;
        androidx.constraintlayout.motion.utils.zy zyVar3 = map8 == null ? null : map8.get("rotation");
        HashMap<String, androidx.constraintlayout.motion.utils.zy> map9 = this.f48148jk;
        androidx.constraintlayout.motion.utils.zy zyVar4 = map9 == null ? null : map9.get("scaleX");
        HashMap<String, androidx.constraintlayout.motion.utils.zy> map10 = this.f48148jk;
        androidx.constraintlayout.motion.utils.zy zyVar5 = map10 != null ? map10.get("scaleY") : null;
        androidx.constraintlayout.core.motion.utils.fu4 fu4Var = new androidx.constraintlayout.core.motion.utils.fu4();
        fu4Var.toq();
        fu4Var.m997q(abstractC0352q3, fM1465p);
        fu4Var.m998y(abstractC0352q, abstractC0352q2, fM1465p);
        fu4Var.m994g(abstractC0352q4, abstractC0352q5, fM1465p);
        fu4Var.zy(zyVar3, fM1465p);
        fu4Var.f7l8(zyVar, zyVar2, fM1465p);
        fu4Var.m996n(zyVar4, zyVar5, fM1465p);
        androidx.constraintlayout.core.motion.utils.toq toqVar = this.f48163x2;
        if (toqVar != null) {
            double[] dArr = this.f48160t8r;
            if (dArr.length > 0) {
                double d2 = fM1465p;
                toqVar.mo1018q(d2, dArr);
                this.f48163x2.f7l8(d2, this.f2296i);
                this.f48143f7l8.fu4(locationX, locationY, mAnchorDpDt, this.f48150ki, this.f2296i, this.f48160t8r);
            }
            fu4Var.m995k(locationX, locationY, width, height, mAnchorDpDt);
            return;
        }
        int i2 = 0;
        if (this.f48152ld6 == null) {
            ki kiVar = this.f2303y;
            float f2 = kiVar.f2282y;
            ki kiVar2 = this.f48143f7l8;
            float f3 = f2 - kiVar2.f2282y;
            androidx.constraintlayout.motion.utils.zy zyVar6 = zyVar5;
            float f4 = kiVar.f2280s - kiVar2.f2280s;
            androidx.constraintlayout.motion.utils.zy zyVar7 = zyVar4;
            float f5 = (kiVar.f2277p - kiVar2.f2277p) + f3;
            float f6 = (kiVar.f2269h - kiVar2.f2269h) + f4;
            mAnchorDpDt[0] = (f3 * (1.0f - locationX)) + (f5 * locationX);
            mAnchorDpDt[1] = (f4 * (1.0f - locationY)) + (f6 * locationY);
            fu4Var.toq();
            fu4Var.m997q(abstractC0352q3, fM1465p);
            fu4Var.m998y(abstractC0352q, abstractC0352q2, fM1465p);
            fu4Var.m994g(abstractC0352q4, abstractC0352q5, fM1465p);
            fu4Var.zy(zyVar3, fM1465p);
            fu4Var.f7l8(zyVar, zyVar2, fM1465p);
            fu4Var.m996n(zyVar7, zyVar6, fM1465p);
            fu4Var.m995k(locationX, locationY, width, height, mAnchorDpDt);
            return;
        }
        double dM1465p = m1465p(fM1465p, this.f48157o1t);
        this.f48152ld6[0].f7l8(dM1465p, this.f2296i);
        this.f48152ld6[0].mo1018q(dM1465p, this.f48160t8r);
        float f7 = this.f48157o1t[0];
        while (true) {
            double[] dArr2 = this.f2296i;
            if (i2 >= dArr2.length) {
                this.f48143f7l8.fu4(locationX, locationY, mAnchorDpDt, this.f48150ki, dArr2, this.f48160t8r);
                fu4Var.m995k(locationX, locationY, width, height, mAnchorDpDt);
                return;
            } else {
                dArr2[i2] = dArr2[i2] * ((double) f7);
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    int m1474n(float[] keyFrames, int[] mode) {
        if (keyFrames == null) {
            return 0;
        }
        double[] dArrMo1019y = this.f48152ld6[0].mo1019y();
        if (mode != null) {
            Iterator<ki> it = this.f2304z.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                mode[i2] = it.next().f2266e;
                i2++;
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < dArrMo1019y.length; i4++) {
            this.f48152ld6[0].mo1018q(dArrMo1019y[i4], this.f48160t8r);
            this.f48143f7l8.ld6(dArrMo1019y[i4], this.f48150ki, this.f48160t8r, keyFrames, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    public void n5r1(int debugMode) {
        this.f48143f7l8.f2278q = debugMode;
    }

    public float n7h() {
        return this.f2295h;
    }

    void ncyb(Rect rect, Rect out, int rotation, int preHeight, int preWidth) {
        if (rotation == 1) {
            int i2 = rect.left + rect.right;
            out.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            out.top = preWidth - ((i2 + rect.height()) / 2);
            out.right = out.left + rect.width();
            out.bottom = out.top + rect.height();
            return;
        }
        if (rotation == 2) {
            int i3 = rect.left + rect.right;
            out.left = preHeight - (((rect.top + rect.bottom) + rect.width()) / 2);
            out.top = (i3 - rect.height()) / 2;
            out.right = out.left + rect.width();
            out.bottom = out.top + rect.height();
            return;
        }
        if (rotation == 3) {
            int i4 = rect.left + rect.right;
            out.left = ((rect.height() / 2) + rect.top) - (i4 / 2);
            out.top = preWidth - ((i4 + rect.height()) / 2);
            out.right = out.left + rect.width();
            out.bottom = out.top + rect.height();
            return;
        }
        if (rotation != 4) {
            return;
        }
        int i5 = rect.left + rect.right;
        out.left = preHeight - (((rect.bottom + rect.top) + rect.width()) / 2);
        out.top = (i5 - rect.height()) / 2;
        out.right = out.left + rect.width();
        out.bottom = out.top + rect.height();
    }

    ki ni7(int i2) {
        return this.f2304z.get(i2);
    }

    public void nn86(int parentWidth, int parentHeight, float transitionDuration, long currentTime) {
        ArrayList arrayList;
        String[] strArr;
        C0395k c0395k;
        AbstractC0349g abstractC0349gM1376s;
        C0395k c0395k2;
        Integer num;
        AbstractC0352q abstractC0352qX2;
        C0395k c0395k3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i2 = this.f48145fti;
        if (i2 != AbstractC0368g.f2232g) {
            this.f48143f7l8.f2281t = i2;
        }
        this.f2301s.m1487s(this.f2299p, hashSet2);
        ArrayList<AbstractC0368g> arrayList2 = this.f48162wvg;
        if (arrayList2 != null) {
            arrayList = null;
            for (AbstractC0368g abstractC0368g : arrayList2) {
                if (abstractC0368g instanceof C0375p) {
                    C0375p c0375p = (C0375p) abstractC0368g;
                    eqxt(new ki(parentWidth, parentHeight, c0375p, this.f48143f7l8, this.f2303y));
                    int i3 = c0375p.f48167jk;
                    if (i3 != AbstractC0368g.f2232g) {
                        this.f2294g = i3;
                    }
                } else if (abstractC0368g instanceof C0383y) {
                    abstractC0368g.mo1434q(hashSet3);
                } else if (abstractC0368g instanceof x2) {
                    abstractC0368g.mo1434q(hashSet);
                } else if (abstractC0368g instanceof qrj) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((qrj) abstractC0368g);
                } else {
                    abstractC0368g.mo1435s(map);
                    abstractC0368g.mo1434q(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        int i4 = 0;
        if (arrayList != null) {
            this.f48138a9 = (qrj[]) arrayList.toArray(new qrj[0]);
        }
        char c2 = 1;
        if (!hashSet2.isEmpty()) {
            this.f48154mcp = new HashMap<>();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    for (AbstractC0368g abstractC0368g2 : this.f48162wvg) {
                        HashMap<String, C0395k> map2 = abstractC0368g2.f2241n;
                        if (map2 != null && (c0395k3 = map2.get(str2)) != null) {
                            sparseArray.append(abstractC0368g2.f2240k, c0395k3);
                        }
                    }
                    abstractC0352qX2 = AbstractC0352q.ld6(str, sparseArray);
                } else {
                    abstractC0352qX2 = AbstractC0352q.x2(str);
                }
                if (abstractC0352qX2 != null) {
                    abstractC0352qX2.m1032s(str);
                    this.f48154mcp.put(str, abstractC0352qX2);
                }
            }
            ArrayList<AbstractC0368g> arrayList3 = this.f48162wvg;
            if (arrayList3 != null) {
                for (AbstractC0368g abstractC0368g3 : arrayList3) {
                    if (abstractC0368g3 instanceof f7l8) {
                        abstractC0368g3.mo1432k(this.f48154mcp);
                    }
                }
            }
            this.f2301s.toq(this.f48154mcp, 0);
            this.f2299p.toq(this.f48154mcp, 100);
            for (String str3 : this.f48154mcp.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = map.get(str3)) == null) ? 0 : num.intValue();
                AbstractC0352q abstractC0352q = this.f48154mcp.get(str3);
                if (abstractC0352q != null) {
                    abstractC0352q.mo1031p(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f2302t == null) {
                this.f2302t = new HashMap<>();
            }
            for (String str4 : hashSet) {
                if (!this.f2302t.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(",")[1];
                        for (AbstractC0368g abstractC0368g4 : this.f48162wvg) {
                            HashMap<String, C0395k> map3 = abstractC0368g4.f2241n;
                            if (map3 != null && (c0395k2 = map3.get(str5)) != null) {
                                sparseArray2.append(abstractC0368g4.f2240k, c0395k2);
                            }
                        }
                        abstractC0349gM1376s = AbstractC0349g.m1377y(str4, sparseArray2);
                    } else {
                        abstractC0349gM1376s = AbstractC0349g.m1376s(str4, currentTime);
                    }
                    if (abstractC0349gM1376s != null) {
                        abstractC0349gM1376s.m1011n(str4);
                        this.f2302t.put(str4, abstractC0349gM1376s);
                    }
                }
            }
            ArrayList<AbstractC0368g> arrayList4 = this.f48162wvg;
            if (arrayList4 != null) {
                for (AbstractC0368g abstractC0368g5 : arrayList4) {
                    if (abstractC0368g5 instanceof x2) {
                        ((x2) abstractC0368g5).lrht(this.f2302t);
                    }
                }
            }
            for (String str6 : this.f2302t.keySet()) {
                this.f2302t.get(str6).mo1009g(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int i5 = 2;
        int size = this.f2304z.size() + 2;
        ki[] kiVarArr = new ki[size];
        kiVarArr[0] = this.f48143f7l8;
        kiVarArr[size - 1] = this.f2303y;
        if (this.f2304z.size() > 0 && this.f2294g == -1) {
            this.f2294g = 0;
        }
        Iterator<ki> it = this.f2304z.iterator();
        int i6 = 1;
        while (it.hasNext()) {
            kiVarArr[i6] = it.next();
            i6++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.f2303y.f2265c.keySet()) {
            if (this.f48143f7l8.f2265c.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f48144fn3e = strArr2;
        this.f48164zurt = new int[strArr2.length];
        int i7 = 0;
        while (true) {
            strArr = this.f48144fn3e;
            if (i7 >= strArr.length) {
                break;
            }
            String str8 = strArr[i7];
            this.f48164zurt[i7] = 0;
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    break;
                }
                if (kiVarArr[i8].f2265c.containsKey(str8) && (c0395k = kiVarArr[i8].f2265c.get(str8)) != null) {
                    int[] iArr = this.f48164zurt;
                    iArr[i7] = iArr[i7] + c0395k.m1637h();
                    break;
                }
                i8++;
            }
            i7++;
        }
        boolean z2 = kiVarArr[0].f2281t != AbstractC0368g.f2232g;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i9 = 1; i9 < size; i9++) {
            kiVarArr[i9].f7l8(kiVarArr[i9 - 1], zArr, this.f48144fn3e, z2);
        }
        int i10 = 0;
        for (int i11 = 1; i11 < length; i11++) {
            if (zArr[i11]) {
                i10++;
            }
        }
        this.f48150ki = new int[i10];
        int iMax = Math.max(2, i10);
        this.f48160t8r = new double[iMax];
        this.f2296i = new double[iMax];
        int i12 = 0;
        for (int i13 = 1; i13 < length; i13++) {
            if (zArr[i13]) {
                this.f48150ki[i12] = i13;
                i12++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, this.f48150ki.length);
        double[] dArr2 = new double[size];
        for (int i14 = 0; i14 < size; i14++) {
            kiVarArr[i14].m1463s(dArr[i14], this.f48150ki);
            dArr2[i14] = kiVarArr[i14].f2275n;
        }
        int i15 = 0;
        while (true) {
            int[] iArr2 = this.f48150ki;
            if (i15 >= iArr2.length) {
                break;
            }
            if (iArr2[i15] < ki.an.length) {
                String str9 = ki.an[this.f48150ki[i15]] + " [";
                for (int i16 = 0; i16 < size; i16++) {
                    str9 = str9 + dArr[i16][i15];
                }
            }
            i15++;
        }
        this.f48152ld6 = new androidx.constraintlayout.core.motion.utils.toq[this.f48144fn3e.length + 1];
        int i17 = 0;
        while (true) {
            String[] strArr3 = this.f48144fn3e;
            if (i17 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i17];
            int i18 = i4;
            int i19 = i18;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i18 < size) {
                if (kiVarArr[i18].cdj(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr3 = new int[i5];
                        iArr3[c2] = kiVarArr[i18].kja0(str10);
                        iArr3[i4] = size;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr3);
                    }
                    ki kiVar = kiVarArr[i18];
                    dArr3[i19] = kiVar.f2275n;
                    kiVar.n7h(str10, dArr4[i19], 0);
                    i19++;
                }
                i18++;
                i5 = 2;
                i4 = 0;
                c2 = 1;
            }
            i17++;
            this.f48152ld6[i17] = androidx.constraintlayout.core.motion.utils.toq.m1067k(this.f2294g, Arrays.copyOf(dArr3, i19), (double[][]) Arrays.copyOf(dArr4, i19));
            i5 = 2;
            i4 = 0;
            c2 = 1;
        }
        this.f48152ld6[0] = androidx.constraintlayout.core.motion.utils.toq.m1067k(this.f2294g, dArr2, dArr);
        if (kiVarArr[0].f2281t != AbstractC0368g.f2232g) {
            int[] iArr4 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 2);
            for (int i20 = 0; i20 < size; i20++) {
                iArr4[i20] = kiVarArr[i20].f2281t;
                dArr5[i20] = r8.f2275n;
                double[] dArr7 = dArr6[i20];
                dArr7[0] = r8.f2282y;
                dArr7[1] = r8.f2280s;
            }
            this.f48163x2 = androidx.constraintlayout.core.motion.utils.toq.toq(iArr4, dArr5, dArr6);
        }
        float fJk = Float.NaN;
        this.f48148jk = new HashMap<>();
        if (this.f48162wvg != null) {
            for (String str11 : hashSet3) {
                androidx.constraintlayout.motion.utils.zy zyVarX2 = androidx.constraintlayout.motion.utils.zy.x2(str11);
                if (zyVarX2 != null) {
                    if (zyVarX2.ld6() && Float.isNaN(fJk)) {
                        fJk = jk();
                    }
                    zyVarX2.m1077s(str11);
                    this.f48148jk.put(str11, zyVarX2);
                }
            }
            for (AbstractC0368g abstractC0368g6 : this.f48162wvg) {
                if (abstractC0368g6 instanceof C0383y) {
                    ((C0383y) abstractC0368g6).nn86(this.f48148jk);
                }
            }
            Iterator<androidx.constraintlayout.motion.utils.zy> it2 = this.f48148jk.values().iterator();
            while (it2.hasNext()) {
                it2.next().m1076p(fJk);
            }
        }
    }

    public int o1t(int[] type, float[] pos) {
        int i2 = 0;
        int i3 = 0;
        for (AbstractC0368g abstractC0368g : this.f48162wvg) {
            int i4 = abstractC0368g.f2240k;
            type[i2] = (abstractC0368g.f2242q * 1000) + i4;
            double d2 = i4 / 100.0f;
            this.f48152ld6[0].mo1018q(d2, this.f48160t8r);
            this.f48143f7l8.ld6(d2, this.f48150ki, this.f48160t8r, pos, i3);
            i3 += 2;
            i2++;
        }
        return i2;
    }

    public View oc() {
        return this.f48161toq;
    }

    /* JADX INFO: renamed from: q */
    int m1475q(float[] keyBounds, int[] mode) {
        if (keyBounds == null) {
            return 0;
        }
        double[] dArrMo1019y = this.f48152ld6[0].mo1019y();
        if (mode != null) {
            Iterator<ki> it = this.f2304z.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                mode[i2] = it.next().f2266e;
                i2++;
            }
        }
        int i3 = 0;
        for (double d2 : dArrMo1019y) {
            this.f48152ld6[0].mo1018q(d2, this.f48160t8r);
            this.f48143f7l8.m1461p(this.f48150ki, this.f48160t8r, keyBounds, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    public void qrj(double p2, float[] pos, float[] vel) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f48152ld6[0].mo1018q(p2, dArr);
        this.f48152ld6[0].f7l8(p2, dArr2);
        Arrays.fill(vel, 0.0f);
        this.f48143f7l8.x2(p2, this.f48150ki, dArr, pos, dArr2, vel);
    }

    /* JADX INFO: renamed from: r */
    void m1476r(View view, ld6 key, float x3, float y3, String[] attribute, float[] value) {
        RectF rectF = new RectF();
        ki kiVar = this.f48143f7l8;
        float f2 = kiVar.f2282y;
        rectF.left = f2;
        float f3 = kiVar.f2280s;
        rectF.top = f3;
        rectF.right = f2 + kiVar.f2277p;
        rectF.bottom = f3 + kiVar.f2269h;
        RectF rectF2 = new RectF();
        ki kiVar2 = this.f2303y;
        float f4 = kiVar2.f2282y;
        rectF2.left = f4;
        float f5 = kiVar2.f2280s;
        rectF2.top = f5;
        rectF2.right = f4 + kiVar2.f2277p;
        rectF2.bottom = f5 + kiVar2.f2269h;
        key.t8r(view, rectF, rectF2, x3, y3, attribute, value);
    }

    /* JADX INFO: renamed from: s */
    void m1477s(boolean start) {
        if (!C7780k.f100596yz.equals(zy.ld6(this.f48161toq)) || this.f48138a9 == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            qrj[] qrjVarArr = this.f48138a9;
            if (i2 >= qrjVarArr.length) {
                return;
            }
            qrjVarArr[i2].wvg(start ? -100.0f : 100.0f, this.f48161toq);
            i2++;
        }
    }

    /* JADX INFO: renamed from: t */
    ld6 m1478t(int layoutWidth, int layoutHeight, float x3, float y3) {
        RectF rectF = new RectF();
        ki kiVar = this.f48143f7l8;
        float f2 = kiVar.f2282y;
        rectF.left = f2;
        float f3 = kiVar.f2280s;
        rectF.top = f3;
        rectF.right = f2 + kiVar.f2277p;
        rectF.bottom = f3 + kiVar.f2269h;
        RectF rectF2 = new RectF();
        ki kiVar2 = this.f2303y;
        float f4 = kiVar2.f2282y;
        rectF2.left = f4;
        float f5 = kiVar2.f2280s;
        rectF2.top = f5;
        rectF2.right = f4 + kiVar2.f2277p;
        rectF2.bottom = f5 + kiVar2.f2269h;
        for (AbstractC0368g abstractC0368g : this.f48162wvg) {
            if (abstractC0368g instanceof ld6) {
                ld6 ld6Var = (ld6) abstractC0368g;
                if (ld6Var.ki(layoutWidth, layoutHeight, rectF, rectF2, x3, y3)) {
                    return ld6Var;
                }
            }
        }
        return null;
    }

    public float t8r() {
        return this.f2303y.f2277p;
    }

    public String toString() {
        return " start: x: " + this.f48143f7l8.f2282y + " y: " + this.f48143f7l8.f2280s + " end: x: " + this.f2303y.f2282y + " y: " + this.f2303y.f2280s;
    }

    void toq(ArrayList<AbstractC0368g> list) {
        this.f48162wvg.addAll(list);
    }

    public void uv6(C0351n rect, View v2, int rotation, int preWidth, int preHeight) {
        ki kiVar = this.f48143f7l8;
        kiVar.f2275n = 0.0f;
        kiVar.f2268g = 0.0f;
        Rect rect2 = new Rect();
        if (rotation == 1) {
            int i2 = rect.f48010toq + rect.f2178q;
            rect2.left = ((rect.f48011zy + rect.f2177n) - rect.zy()) / 2;
            rect2.top = preWidth - ((i2 + rect.toq()) / 2);
            rect2.right = rect2.left + rect.zy();
            rect2.bottom = rect2.top + rect.toq();
        } else if (rotation == 2) {
            int i3 = rect.f48010toq + rect.f2178q;
            rect2.left = preHeight - (((rect.f48011zy + rect.f2177n) + rect.zy()) / 2);
            rect2.top = (i3 - rect.toq()) / 2;
            rect2.right = rect2.left + rect.zy();
            rect2.bottom = rect2.top + rect.toq();
        }
        this.f48143f7l8.ni7(rect2.left, rect2.top, rect2.width(), rect2.height());
        this.f2301s.m1483h(rect2, v2, rotation, rect.f2176k);
    }

    public void vyq(int transformPivotTarget) {
        this.f48149jp0y = transformPivotTarget;
        this.f48147gvn7 = null;
    }

    double[] wvg(double position) {
        this.f48152ld6[0].mo1018q(position, this.f48160t8r);
        androidx.constraintlayout.core.motion.utils.toq toqVar = this.f48163x2;
        if (toqVar != null) {
            double[] dArr = this.f48160t8r;
            if (dArr.length > 0) {
                toqVar.mo1018q(position, dArr);
            }
        }
        return this.f48160t8r;
    }

    int x2(String attributeType, float[] points, int pointCount) {
        AbstractC0352q abstractC0352q = this.f48154mcp.get(attributeType);
        if (abstractC0352q == null) {
            return -1;
        }
        for (int i2 = 0; i2 < points.length; i2++) {
            points[i2] = abstractC0352q.m1030k(i2 / (points.length - 1));
        }
        return points.length;
    }

    public void x9kr() {
        this.f2300q = true;
    }

    /* JADX INFO: renamed from: y */
    void m1479y(float[] path, int pointCount) {
        float f2 = 1.0f / (pointCount - 1);
        for (int i2 = 0; i2 < pointCount; i2++) {
            this.f48152ld6[0].mo1018q(m1465p(i2 * f2, null), this.f48160t8r);
            this.f48143f7l8.m1459h(this.f48150ki, this.f48160t8r, path, i2 * 8);
        }
    }

    /* JADX INFO: renamed from: z */
    float m1480z(int type, float x3, float y3) {
        ki kiVar = this.f2303y;
        float f2 = kiVar.f2282y;
        ki kiVar2 = this.f48143f7l8;
        float f3 = kiVar2.f2282y;
        float f4 = f2 - f3;
        float f5 = kiVar.f2280s;
        float f6 = kiVar2.f2280s;
        float f7 = f5 - f6;
        float f8 = f3 + (kiVar2.f2277p / 2.0f);
        float f9 = f6 + (kiVar2.f2269h / 2.0f);
        float fHypot = (float) Math.hypot(f4, f7);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f10 = x3 - f8;
        float f11 = y3 - f9;
        if (((float) Math.hypot(f10, f11)) == 0.0f) {
            return 0.0f;
        }
        float f12 = (f10 * f4) + (f11 * f7);
        if (type == 0) {
            return f12 / fHypot;
        }
        if (type == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f12 * f12));
        }
        if (type == 2) {
            return f10 / f4;
        }
        if (type == 3) {
            return f11 / f4;
        }
        if (type == 4) {
            return f10 / f7;
        }
        if (type != 5) {
            return 0.0f;
        }
        return f11 / f7;
    }

    void zy(float[] bounds, int pointCount) {
        float f2 = 1.0f / (pointCount - 1);
        HashMap<String, AbstractC0352q> map = this.f48154mcp;
        if (map != null) {
            map.get("translationX");
        }
        HashMap<String, AbstractC0352q> map2 = this.f48154mcp;
        if (map2 != null) {
            map2.get("translationY");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.zy> map3 = this.f48148jk;
        if (map3 != null) {
            map3.get("translationX");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.zy> map4 = this.f48148jk;
        if (map4 != null) {
            map4.get("translationY");
        }
        for (int i2 = 0; i2 < pointCount; i2++) {
            float fMin = i2 * f2;
            float f3 = this.f48151kja0;
            float f4 = 0.0f;
            if (f3 != 1.0f) {
                float f5 = this.f48155n7h;
                if (fMin < f5) {
                    fMin = 0.0f;
                }
                if (fMin > f5 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f5) * f3, 1.0f);
                }
            }
            double dMo986k = fMin;
            C0284q c0284q = this.f48143f7l8.f2272k;
            float f6 = Float.NaN;
            for (ki kiVar : this.f2304z) {
                C0284q c0284q2 = kiVar.f2272k;
                if (c0284q2 != null) {
                    float f7 = kiVar.f2275n;
                    if (f7 < fMin) {
                        c0284q = c0284q2;
                        f4 = f7;
                    } else if (Float.isNaN(f6)) {
                        f6 = kiVar.f2275n;
                    }
                }
            }
            if (c0284q != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                dMo986k = (((float) c0284q.mo986k((fMin - f4) / r11)) * (f6 - f4)) + f4;
            }
            this.f48152ld6[0].mo1018q(dMo986k, this.f48160t8r);
            androidx.constraintlayout.core.motion.utils.toq toqVar = this.f48163x2;
            if (toqVar != null) {
                double[] dArr = this.f48160t8r;
                if (dArr.length > 0) {
                    toqVar.mo1018q(dMo986k, dArr);
                }
            }
            this.f48143f7l8.m1461p(this.f48150ki, this.f48160t8r, bounds, i2 * 2);
        }
    }
}
