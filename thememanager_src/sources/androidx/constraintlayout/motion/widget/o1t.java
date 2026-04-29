package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.C0284q;
import androidx.constraintlayout.motion.widget.t8r;
import androidx.constraintlayout.widget.C0394g;
import androidx.constraintlayout.widget.C0397q;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: ViewTransition.java */
/* JADX INFO: loaded from: classes.dex */
public class o1t {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final int f48170a9 = 1;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    static final int f48171d2ok = 2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final int f48172d3 = 5;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    static final int f48173dd = 0;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    static final int f48174eqxt = 1;

    /* JADX INFO: renamed from: f */
    static final int f2332f = 6;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final int f48175fti = 2;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static String f48176fu4 = "ViewTransition";

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final int f48177gvn7 = 4;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    static final int f48178hyr = 5;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final int f48179jk = -1;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final int f48180jp0y = 3;

    /* JADX INFO: renamed from: l */
    static final int f2333l = 3;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final int f48181lvui = -1;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final String f48182mcp = "CustomMethod";

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    static final int f48183n5r1 = 4;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    static final int f48184ncyb = 2;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final String f48185o1t = "KeyFrameSet";

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    static final int f48186oc = 0;

    /* JADX INFO: renamed from: r */
    private static final int f2334r = -2;

    /* JADX INFO: renamed from: t */
    public static final String f2335t = "CustomAttribute";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final String f48187wvg = "ConstraintOverride";

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    static final int f48188x9kr = 1;

    /* JADX INFO: renamed from: z */
    public static final String f2336z = "ViewTransition";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    C0378s f48190f7l8;

    /* JADX INFO: renamed from: g */
    int f2337g;

    /* JADX INFO: renamed from: h */
    Context f2338h;

    /* JADX INFO: renamed from: k */
    C0397q f2340k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f48194ld6;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f48199toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private String f48200x2;

    /* JADX INFO: renamed from: y */
    C0397q.k f2345y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f48202zy = -1;

    /* JADX INFO: renamed from: q */
    private boolean f2343q = false;

    /* JADX INFO: renamed from: n */
    private int f2341n = 0;

    /* JADX INFO: renamed from: s */
    private int f2344s = -1;

    /* JADX INFO: renamed from: p */
    private int f2342p = -1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f48197qrj = 0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private String f48195n7h = null;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private int f48193kja0 = -1;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f48189cdj = -1;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f48192ki = -1;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f48198t8r = -1;

    /* JADX INFO: renamed from: i */
    private int f2339i = -1;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private int f48191fn3e = -1;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private int f48201zurt = -1;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private int f48196ni7 = -1;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.o1t$k */
    /* JADX INFO: compiled from: ViewTransition.java */
    class InterpolatorC0374k implements Interpolator {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C0284q f2346k;

        InterpolatorC0374k(final o1t this$0, final C0284q val$easing) {
            this.f2346k = val$easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float v2) {
            return (float) this.f2346k.mo986k(v2);
        }
    }

    /* JADX INFO: compiled from: ViewTransition.java */
    static class toq {

        /* JADX INFO: renamed from: g */
        int f2347g;

        /* JADX INFO: renamed from: k */
        private final int f2348k;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        boolean f48204kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        float f48205ld6;

        /* JADX INFO: renamed from: n */
        int f2349n;

        /* JADX INFO: renamed from: q */
        kja0 f2351q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        long f48207qrj;

        /* JADX INFO: renamed from: s */
        Interpolator f2352s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f48208toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        float f48209x2;

        /* JADX INFO: renamed from: y */
        wvg f2353y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        long f48210zy;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        androidx.constraintlayout.core.motion.utils.f7l8 f48203f7l8 = new androidx.constraintlayout.core.motion.utils.f7l8();

        /* JADX INFO: renamed from: p */
        boolean f2350p = false;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        Rect f48206n7h = new Rect();

        toq(wvg controller, kja0 motionController, int duration, int upDuration, int mode, Interpolator interpolator, int setTag, int clearTag) {
            this.f48204kja0 = false;
            this.f2353y = controller;
            this.f2351q = motionController;
            this.f2349n = duration;
            this.f2347g = upDuration;
            long jNanoTime = System.nanoTime();
            this.f48210zy = jNanoTime;
            this.f48207qrj = jNanoTime;
            this.f2353y.zy(this);
            this.f2352s = interpolator;
            this.f2348k = setTag;
            this.f48208toq = clearTag;
            if (mode == 3) {
                this.f48204kja0 = true;
            }
            this.f48209x2 = duration == 0 ? Float.MAX_VALUE : 1.0f / duration;
            m1497k();
        }

        /* JADX INFO: renamed from: k */
        void m1497k() {
            if (this.f2350p) {
                zy();
            } else {
                toq();
            }
        }

        /* JADX INFO: renamed from: n */
        void m1498n(boolean dir) {
            int i2;
            this.f2350p = dir;
            if (dir && (i2 = this.f2347g) != -1) {
                this.f48209x2 = i2 == 0 ? Float.MAX_VALUE : 1.0f / i2;
            }
            this.f2353y.f7l8();
            this.f48207qrj = System.nanoTime();
        }

        /* JADX INFO: renamed from: q */
        public void m1499q(int action, float x3, float y3) {
            if (action == 1) {
                if (this.f2350p) {
                    return;
                }
                m1498n(true);
            } else {
                if (action != 2) {
                    return;
                }
                this.f2351q.oc().getHitRect(this.f48206n7h);
                if (this.f48206n7h.contains((int) x3, (int) y3) || this.f2350p) {
                    return;
                }
                m1498n(true);
            }
        }

        void toq() {
            long jNanoTime = System.nanoTime();
            long j2 = jNanoTime - this.f48207qrj;
            this.f48207qrj = jNanoTime;
            float f2 = this.f48205ld6 + (((float) (j2 * 1.0E-6d)) * this.f48209x2);
            this.f48205ld6 = f2;
            if (f2 >= 1.0f) {
                this.f48205ld6 = 1.0f;
            }
            Interpolator interpolator = this.f2352s;
            float interpolation = interpolator == null ? this.f48205ld6 : interpolator.getInterpolation(this.f48205ld6);
            kja0 kja0Var = this.f2351q;
            boolean zD2ok = kja0Var.d2ok(kja0Var.f48161toq, interpolation, jNanoTime, this.f48203f7l8);
            if (this.f48205ld6 >= 1.0f) {
                if (this.f2348k != -1) {
                    this.f2351q.oc().setTag(this.f2348k, Long.valueOf(System.nanoTime()));
                }
                if (this.f48208toq != -1) {
                    this.f2351q.oc().setTag(this.f48208toq, null);
                }
                if (!this.f48204kja0) {
                    this.f2353y.ld6(this);
                }
            }
            if (this.f48205ld6 < 1.0f || zD2ok) {
                this.f2353y.f7l8();
            }
        }

        void zy() {
            long jNanoTime = System.nanoTime();
            long j2 = jNanoTime - this.f48207qrj;
            this.f48207qrj = jNanoTime;
            float f2 = this.f48205ld6 - (((float) (j2 * 1.0E-6d)) * this.f48209x2);
            this.f48205ld6 = f2;
            if (f2 < 0.0f) {
                this.f48205ld6 = 0.0f;
            }
            Interpolator interpolator = this.f2352s;
            float interpolation = interpolator == null ? this.f48205ld6 : interpolator.getInterpolation(this.f48205ld6);
            kja0 kja0Var = this.f2351q;
            boolean zD2ok = kja0Var.d2ok(kja0Var.f48161toq, interpolation, jNanoTime, this.f48203f7l8);
            if (this.f48205ld6 <= 0.0f) {
                if (this.f2348k != -1) {
                    this.f2351q.oc().setTag(this.f2348k, Long.valueOf(System.nanoTime()));
                }
                if (this.f48208toq != -1) {
                    this.f2351q.oc().setTag(this.f48208toq, null);
                }
                this.f2353y.ld6(this);
            }
            if (this.f48205ld6 > 0.0f || zD2ok) {
                this.f2353y.f7l8();
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    o1t(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.o1t.<init>(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    private void n7h(Context context, XmlPullParser parser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), C0394g.qrj.wjj2);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == C0394g.qrj.i55) {
                this.f48199toq = typedArrayObtainStyledAttributes.getResourceId(index, this.f48199toq);
            } else if (index == C0394g.qrj.x9e) {
                if (MotionLayout.faqz) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f48194ld6);
                    this.f48194ld6 = resourceId;
                    if (resourceId == -1) {
                        this.f48200x2 = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f48200x2 = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f48194ld6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f48194ld6);
                }
            } else if (index == C0394g.qrj.tpl) {
                this.f48202zy = typedArrayObtainStyledAttributes.getInt(index, this.f48202zy);
            } else if (index == C0394g.qrj.jk2) {
                this.f2343q = typedArrayObtainStyledAttributes.getBoolean(index, this.f2343q);
            } else if (index == C0394g.qrj.b1ty) {
                this.f2341n = typedArrayObtainStyledAttributes.getInt(index, this.f2341n);
            } else if (index == C0394g.qrj.ta9a) {
                this.f2344s = typedArrayObtainStyledAttributes.getInt(index, this.f2344s);
            } else if (index == C0394g.qrj.dqa) {
                this.f2342p = typedArrayObtainStyledAttributes.getInt(index, this.f2342p);
            } else if (index == C0394g.qrj.im) {
                this.f2337g = typedArrayObtainStyledAttributes.getInt(index, this.f2337g);
            } else if (index == C0394g.qrj.hx5d) {
                int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i3 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f48193kja0 = resourceId2;
                    if (resourceId2 != -1) {
                        this.f48197qrj = -2;
                    }
                } else if (i3 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f48195n7h = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f48197qrj = -1;
                    } else {
                        this.f48193kja0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f48197qrj = -2;
                    }
                } else {
                    this.f48197qrj = typedArrayObtainStyledAttributes.getInteger(index, this.f48197qrj);
                }
            } else if (index == C0394g.qrj.khz) {
                this.f48189cdj = typedArrayObtainStyledAttributes.getResourceId(index, this.f48189cdj);
            } else if (index == C0394g.qrj.j8wd) {
                this.f48192ki = typedArrayObtainStyledAttributes.getResourceId(index, this.f48192ki);
            } else if (index == C0394g.qrj.tn4) {
                this.f48198t8r = typedArrayObtainStyledAttributes.getResourceId(index, this.f48198t8r);
            } else if (index == C0394g.qrj.v5fy) {
                this.f2339i = typedArrayObtainStyledAttributes.getResourceId(index, this.f2339i);
            } else if (index == C0394g.qrj.a4) {
                this.f48201zurt = typedArrayObtainStyledAttributes.getResourceId(index, this.f48201zurt);
            } else if (index == C0394g.qrj.vqy) {
                this.f48191fn3e = typedArrayObtainStyledAttributes.getInteger(index, this.f48191fn3e);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x2(View[] viewArr) {
        if (this.f48189cdj != -1) {
            for (View view : viewArr) {
                view.setTag(this.f48189cdj, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.f48192ki != -1) {
            for (View view2 : viewArr) {
                view2.setTag(this.f48192ki, null);
            }
        }
    }

    private void zurt(t8r.toq transition, View view) {
        int i2 = this.f2344s;
        if (i2 != -1) {
            transition.dd(i2);
        }
        transition.m1549c(this.f2341n);
        transition.m1552l(this.f48197qrj, this.f48195n7h, this.f48193kja0);
        int id = view.getId();
        C0378s c0378s = this.f48190f7l8;
        if (c0378s != null) {
            ArrayList<AbstractC0368g> arrayListM1516q = c0378s.m1516q(-1);
            C0378s c0378s2 = new C0378s();
            Iterator<AbstractC0368g> it = arrayListM1516q.iterator();
            while (it.hasNext()) {
                c0378s2.zy(it.next().clone().ld6(id));
            }
            transition.m1551i(c0378s2);
        }
    }

    public void cdj(int sharedValue) {
        this.f48191fn3e = sharedValue;
    }

    public int f7l8() {
        return this.f48191fn3e;
    }

    boolean fn3e(int action) {
        int i2 = this.f48202zy;
        return i2 == 1 ? action == 0 : i2 == 2 ? action == 1 : i2 == 3 && action == 0;
    }

    /* JADX INFO: renamed from: g */
    Interpolator m1489g(Context context) {
        int i2 = this.f48197qrj;
        if (i2 == -2) {
            return AnimationUtils.loadInterpolator(context, this.f48193kja0);
        }
        if (i2 == -1) {
            return new InterpolatorC0374k(this, C0284q.zy(this.f48195n7h));
        }
        if (i2 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i2 == 1) {
            return new AccelerateInterpolator();
        }
        if (i2 == 2) {
            return new DecelerateInterpolator();
        }
        if (i2 == 4) {
            return new BounceInterpolator();
        }
        if (i2 == 5) {
            return new OvershootInterpolator();
        }
        if (i2 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    /* JADX INFO: renamed from: h */
    void m1490h(int id) {
        this.f48199toq = id;
    }

    /* JADX INFO: renamed from: i */
    public void m1491i(int stateTransition) {
        this.f48202zy = stateTransition;
    }

    public void ki(int sharedValueCurrent) {
        this.f48196ni7 = sharedValueCurrent;
    }

    void kja0(boolean enable) {
        this.f2343q = !enable;
    }

    boolean ld6() {
        return !this.f2343q;
    }

    /* JADX INFO: renamed from: n */
    int m1492n() {
        return this.f48199toq;
    }

    /* JADX INFO: renamed from: p */
    public int m1493p() {
        return this.f48202zy;
    }

    /* JADX INFO: renamed from: q */
    boolean m1494q(View view) {
        int i2 = this.f48198t8r;
        boolean z2 = i2 == -1 || view.getTag(i2) != null;
        int i3 = this.f2339i;
        return z2 && (i3 == -1 || view.getTag(i3) == null);
    }

    boolean qrj(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f48194ld6 == -1 && this.f48200x2 == null) || !m1494q(view)) {
            return false;
        }
        if (view.getId() == this.f48194ld6) {
            return true;
        }
        return this.f48200x2 != null && (view.getLayoutParams() instanceof ConstraintLayout.toq) && (str = ((ConstraintLayout.toq) view.getLayoutParams()).f2644j) != null && str.matches(this.f48200x2);
    }

    /* JADX INFO: renamed from: s */
    public int m1495s() {
        return this.f48201zurt;
    }

    public void t8r(int sharedValueID) {
        this.f48201zurt = sharedValueID;
    }

    public String toString() {
        return "ViewTransition(" + zy.m1601s(this.f2338h, this.f48199toq) + ")";
    }

    void toq(wvg controller, MotionLayout motionLayout, View view) {
        kja0 kja0Var = new kja0(view);
        kja0Var.m1473l(view);
        this.f48190f7l8.m1514k(kja0Var);
        kja0Var.nn86(motionLayout.getWidth(), motionLayout.getHeight(), this.f2344s, System.nanoTime());
        new toq(controller, kja0Var, this.f2344s, this.f2342p, this.f48202zy, m1489g(motionLayout.getContext()), this.f48189cdj, this.f48192ki);
    }

    /* JADX INFO: renamed from: y */
    public int m1496y() {
        return this.f48196ni7;
    }

    void zy(wvg controller, MotionLayout layout, int fromId, C0397q current, final View... views) {
        if (this.f2343q) {
            return;
        }
        int i2 = this.f2337g;
        if (i2 == 2) {
            toq(controller, layout, views[0]);
            return;
        }
        if (i2 == 1) {
            for (int i3 : layout.getConstraintSetIds()) {
                if (i3 != fromId) {
                    C0397q c0397qV0af = layout.v0af(i3);
                    for (View view : views) {
                        C0397q.k kVarI1 = c0397qV0af.i1(view.getId());
                        C0397q.k kVar = this.f2345y;
                        if (kVar != null) {
                            kVar.m1691y(kVarI1);
                            kVarI1.f49832f7l8.putAll(this.f2345y.f49832f7l8);
                        }
                    }
                }
            }
        }
        C0397q c0397q = new C0397q();
        c0397q.d3(current);
        for (View view2 : views) {
            C0397q.k kVarI12 = c0397q.i1(view2.getId());
            C0397q.k kVar2 = this.f2345y;
            if (kVar2 != null) {
                kVar2.m1691y(kVarI12);
                kVarI12.f49832f7l8.putAll(this.f2345y.f49832f7l8);
            }
        }
        layout.n2t(fromId, c0397q);
        int i4 = C0394g.f7l8.zxq;
        layout.n2t(i4, current);
        layout.setState(i4, -1, -1);
        t8r.toq toqVar = new t8r.toq(-1, layout.bl, i4, fromId);
        for (View view3 : views) {
            zurt(toqVar, view3);
        }
        layout.setTransition(toqVar);
        layout.m28240do(new Runnable() { // from class: androidx.constraintlayout.motion.widget.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f2475k.x2(views);
            }
        });
    }
}
