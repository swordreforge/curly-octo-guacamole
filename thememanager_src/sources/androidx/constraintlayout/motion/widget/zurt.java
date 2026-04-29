package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0394g;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: TouchResponse.java */
/* JADX INFO: loaded from: classes.dex */
class zurt {

    /* JADX INFO: renamed from: c */
    private static final int f2477c = 3;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final int f48406d3 = 1000;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final int f48407dd = 2;

    /* JADX INFO: renamed from: e */
    static final int f2478e = 1;

    /* JADX INFO: renamed from: f */
    private static final int f2479f = 2;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final boolean f48409gvn7 = false;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    static final int f48410hb = 4;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private static final int f48411hyr = 1;

    /* JADX INFO: renamed from: j */
    public static final int f2480j = 0;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final String f48412jp0y = "TouchResponse";

    /* JADX INFO: renamed from: l */
    private static final int f2481l = 5;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private static final int f48413lrht = 4;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final int f48414lvui = 0;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private static final int f48415n5r1 = 0;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private static final int f48416ncyb = 4;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    static final int f48417nn86 = 2;

    /* JADX INFO: renamed from: o */
    public static final int f2482o = 1;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final float f48418oc = 1.0E-7f;

    /* JADX INFO: renamed from: r */
    private static final int f2483r = 1;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private static final int f48419uv6 = 5;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private static final int f48420vyq = 6;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private static final int f48421x9kr = 3;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private int f48422a9;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int[] f48423cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private float f48424f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private float f48425fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private int f48426fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private float f48427fu4;

    /* JADX INFO: renamed from: g */
    private int f2484g;

    /* JADX INFO: renamed from: h */
    private float[] f2485h;

    /* JADX INFO: renamed from: i */
    private final MotionLayout f2486i;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private float f48428jk;

    /* JADX INFO: renamed from: k */
    private int f2487k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private float f48429ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private boolean f48430kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f48431ld6;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private float f48432mcp;

    /* JADX INFO: renamed from: n */
    private int f2488n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private float f48433n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private boolean f48434ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private float f48435o1t;

    /* JADX INFO: renamed from: p */
    float f2489p;

    /* JADX INFO: renamed from: q */
    private int f2490q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private float f48436qrj;

    /* JADX INFO: renamed from: s */
    float f2491s;

    /* JADX INFO: renamed from: t */
    private float f2492t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private float f48437t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f48438toq;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private float f48439wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    boolean f48440x2;

    /* JADX INFO: renamed from: y */
    private float f2493y;

    /* JADX INFO: renamed from: z */
    private int f2494z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private float f48441zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f48442zy;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final float[][] f48408eqxt = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final float[][] f48405d2ok = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.zurt$k */
    /* JADX INFO: compiled from: TouchResponse.java */
    class ViewOnTouchListenerC0385k implements View.OnTouchListener {
        ViewOnTouchListenerC0385k(final zurt this$0) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: compiled from: TouchResponse.java */
    class toq implements NestedScrollView.zy {
        toq(final zurt this$0) {
        }

        @Override // androidx.core.widget.NestedScrollView.zy
        /* JADX INFO: renamed from: k */
        public void mo103k(NestedScrollView v2, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
        }
    }

    zurt(Context context, MotionLayout layout, XmlPullParser parser) {
        this.f2487k = 0;
        this.f48438toq = 0;
        this.f48442zy = 0;
        this.f2490q = -1;
        this.f2488n = -1;
        this.f2484g = -1;
        this.f48424f7l8 = 0.5f;
        this.f2493y = 0.5f;
        this.f2491s = 0.5f;
        this.f2489p = 0.5f;
        this.f48431ld6 = -1;
        this.f48440x2 = false;
        this.f48436qrj = 0.0f;
        this.f48433n7h = 1.0f;
        this.f48430kja0 = false;
        this.f2485h = new float[2];
        this.f48423cdj = new int[2];
        this.f48425fn3e = 4.0f;
        this.f48441zurt = 1.2f;
        this.f48434ni7 = true;
        this.f48427fu4 = 1.0f;
        this.f2494z = 0;
        this.f48435o1t = 10.0f;
        this.f48439wvg = 10.0f;
        this.f2492t = 1.0f;
        this.f48432mcp = Float.NaN;
        this.f48428jk = Float.NaN;
        this.f48422a9 = 0;
        this.f48426fti = 0;
        this.f2486i = layout;
        zy(context, Xml.asAttributeSet(parser));
    }

    private void toq(TypedArray a2) {
        int indexCount = a2.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = a2.getIndex(i2);
            if (index == C0394g.qrj.z2) {
                this.f2490q = a2.getResourceId(index, this.f2490q);
            } else if (index == C0394g.qrj.cp2) {
                int i3 = a2.getInt(index, this.f2487k);
                this.f2487k = i3;
                float[] fArr = f48408eqxt[i3];
                this.f2493y = fArr[0];
                this.f48424f7l8 = fArr[1];
            } else if (index == C0394g.qrj.jzp) {
                int i4 = a2.getInt(index, this.f48438toq);
                this.f48438toq = i4;
                float[][] fArr2 = f48405d2ok;
                if (i4 < fArr2.length) {
                    float[] fArr3 = fArr2[i4];
                    this.f48436qrj = fArr3[0];
                    this.f48433n7h = fArr3[1];
                } else {
                    this.f48433n7h = Float.NaN;
                    this.f48436qrj = Float.NaN;
                    this.f48440x2 = true;
                }
            } else if (index == C0394g.qrj.vllq) {
                this.f48425fn3e = a2.getFloat(index, this.f48425fn3e);
            } else if (index == C0394g.qrj.q0) {
                this.f48441zurt = a2.getFloat(index, this.f48441zurt);
            } else if (index == C0394g.qrj.avdu) {
                this.f48434ni7 = a2.getBoolean(index, this.f48434ni7);
            } else if (index == C0394g.qrj.ym5) {
                this.f48427fu4 = a2.getFloat(index, this.f48427fu4);
            } else if (index == C0394g.qrj.txs) {
                this.f48435o1t = a2.getFloat(index, this.f48435o1t);
            } else if (index == C0394g.qrj.e1v) {
                this.f2488n = a2.getResourceId(index, this.f2488n);
            } else if (index == C0394g.qrj.zg) {
                this.f48442zy = a2.getInt(index, this.f48442zy);
            } else if (index == C0394g.qrj.g2h) {
                this.f2494z = a2.getInteger(index, 0);
            } else if (index == C0394g.qrj.g0) {
                this.f2484g = a2.getResourceId(index, 0);
            } else if (index == C0394g.qrj.yv44) {
                this.f48431ld6 = a2.getResourceId(index, this.f48431ld6);
            } else if (index == C0394g.qrj.luqn) {
                this.f48439wvg = a2.getFloat(index, this.f48439wvg);
            } else if (index == C0394g.qrj.sq2k) {
                this.f2492t = a2.getFloat(index, this.f2492t);
            } else if (index == C0394g.qrj.kc) {
                this.f48432mcp = a2.getFloat(index, this.f48432mcp);
            } else if (index == C0394g.qrj.tosv) {
                this.f48428jk = a2.getFloat(index, this.f48428jk);
            } else if (index == C0394g.qrj.v6) {
                this.f48422a9 = a2.getInt(index, this.f48422a9);
            } else if (index == C0394g.qrj.g74f) {
                this.f48426fti = a2.getInt(index, this.f48426fti);
            }
        }
    }

    private void zy(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C0394g.qrj.ts4);
        toq(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void a9(float x3, float y3) {
        this.f2493y = x3;
        this.f48424f7l8 = y3;
    }

    public float cdj() {
        return this.f48428jk;
    }

    RectF f7l8(ViewGroup layout, RectF rect) {
        View viewFindViewById;
        int i2 = this.f2484g;
        if (i2 == -1 || (viewFindViewById = layout.findViewById(i2)) == null) {
            return null;
        }
        rect.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rect;
    }

    void fn3e(MotionEvent event, MotionLayout.InterfaceC0365s velocityTracker, int currentState, t8r motionScene) {
        int i2;
        if (this.f48440x2) {
            zurt(event, velocityTracker, currentState, motionScene);
            return;
        }
        velocityTracker.mo1415q(event);
        int action = event.getAction();
        if (action == 0) {
            this.f48429ki = event.getRawX();
            this.f48437t8r = event.getRawY();
            this.f48430kja0 = false;
            return;
        }
        if (action == 1) {
            this.f48430kja0 = false;
            velocityTracker.mo1416s(1000);
            float fMo1413g = velocityTracker.mo1413g();
            float fMo1414n = velocityTracker.mo1414n();
            float progress = this.f2486i.getProgress();
            int i3 = this.f2490q;
            if (i3 != -1) {
                this.f2486i.m4(i3, progress, this.f2493y, this.f48424f7l8, this.f2485h);
            } else {
                float fMin = Math.min(this.f2486i.getWidth(), this.f2486i.getHeight());
                float[] fArr = this.f2485h;
                fArr[1] = this.f48433n7h * fMin;
                fArr[0] = fMin * this.f48436qrj;
            }
            float f2 = this.f48436qrj;
            float[] fArr2 = this.f2485h;
            float fAbs = f2 != 0.0f ? fMo1413g / fArr2[0] : fMo1414n / fArr2[1];
            float f3 = !Float.isNaN(fAbs) ? (fAbs / 3.0f) + progress : progress;
            if (f3 == 0.0f || f3 == 1.0f || (i2 = this.f48442zy) == 3) {
                if (0.0f >= f3 || 1.0f <= f3) {
                    this.f2486i.setState(MotionLayout.qrj.FINISHED);
                    return;
                }
                return;
            }
            float f4 = ((double) f3) < 0.5d ? 0.0f : 1.0f;
            if (i2 == 6) {
                if (progress + fAbs < 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                f4 = 1.0f;
            }
            if (this.f48442zy == 7) {
                if (progress + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f4 = 0.0f;
            }
            this.f2486i.uc(this.f48442zy, f4, fAbs);
            if (0.0f >= progress || 1.0f <= progress) {
                this.f2486i.setState(MotionLayout.qrj.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = event.getRawY() - this.f48437t8r;
        float rawX = event.getRawX() - this.f48429ki;
        if (Math.abs((this.f48436qrj * rawX) + (this.f48433n7h * rawY)) > this.f48435o1t || this.f48430kja0) {
            float progress2 = this.f2486i.getProgress();
            if (!this.f48430kja0) {
                this.f48430kja0 = true;
                this.f2486i.setProgress(progress2);
            }
            int i4 = this.f2490q;
            if (i4 != -1) {
                this.f2486i.m4(i4, progress2, this.f2493y, this.f48424f7l8, this.f2485h);
            } else {
                float fMin2 = Math.min(this.f2486i.getWidth(), this.f2486i.getHeight());
                float[] fArr3 = this.f2485h;
                fArr3[1] = this.f48433n7h * fMin2;
                fArr3[0] = fMin2 * this.f48436qrj;
            }
            float f5 = this.f48436qrj;
            float[] fArr4 = this.f2485h;
            if (Math.abs(((f5 * fArr4[0]) + (this.f48433n7h * fArr4[1])) * this.f48427fu4) < 0.01d) {
                float[] fArr5 = this.f2485h;
                fArr5[0] = 0.01f;
                fArr5[1] = 0.01f;
            }
            float fMax = Math.max(Math.min(progress2 + (this.f48436qrj != 0.0f ? rawX / this.f2485h[0] : rawY / this.f2485h[1]), 1.0f), 0.0f);
            if (this.f48442zy == 6) {
                fMax = Math.max(fMax, 0.01f);
            }
            if (this.f48442zy == 7) {
                fMax = Math.min(fMax, 0.99f);
            }
            float progress3 = this.f2486i.getProgress();
            if (fMax != progress3) {
                if (progress3 == 0.0f || progress3 == 1.0f) {
                    this.f2486i.was(progress3 == 0.0f);
                }
                this.f2486i.setProgress(fMax);
                velocityTracker.mo1416s(1000);
                this.f2486i.az = this.f48436qrj != 0.0f ? velocityTracker.mo1413g() / this.f2485h[0] : velocityTracker.mo1414n() / this.f2485h[1];
            } else {
                this.f2486i.az = 0.0f;
            }
            this.f48429ki = event.getRawX();
            this.f48437t8r = event.getRawY();
        }
    }

    public void fti(int touchUpMode) {
        this.f48442zy = touchUpMode;
    }

    void fu4(float dx, float dy) {
        this.f48430kja0 = false;
        float progress = this.f2486i.getProgress();
        this.f2486i.m4(this.f2490q, progress, this.f2493y, this.f48424f7l8, this.f2485h);
        float f2 = this.f48436qrj;
        float[] fArr = this.f2485h;
        float f3 = f2 != 0.0f ? (dx * f2) / fArr[0] : (dy * this.f48433n7h) / fArr[1];
        if (!Float.isNaN(f3)) {
            progress += f3 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z2 = progress != 1.0f;
            int i2 = this.f48442zy;
            if ((i2 != 3) && z2) {
                this.f2486i.uc(i2, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f3);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public int m1585g() {
        return this.f2494z;
    }

    void gvn7() {
        View viewFindViewById;
        int i2 = this.f2490q;
        if (i2 != -1) {
            viewFindViewById = this.f2486i.findViewById(i2);
            if (viewFindViewById == null) {
                Log.e(f48412jp0y, "cannot find TouchAnchorId @id/" + zy.m1601s(this.f2486i.getContext(), this.f2490q));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new ViewOnTouchListenerC0385k(this));
            nestedScrollView.setOnScrollChangeListener(new toq(this));
        }
    }

    /* JADX INFO: renamed from: h */
    public float m1586h() {
        return this.f48432mcp;
    }

    /* JADX INFO: renamed from: i */
    boolean m1587i() {
        return this.f48430kja0;
    }

    public void jk(boolean rtl) {
        if (rtl) {
            float[][] fArr = f48405d2ok;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f48408eqxt;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f48405d2ok;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f48408eqxt;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f48408eqxt[this.f2487k];
        this.f2493y = fArr5[0];
        this.f48424f7l8 = fArr5[1];
        int i2 = this.f48438toq;
        float[][] fArr6 = f48405d2ok;
        if (i2 >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i2];
        this.f48436qrj = fArr7[0];
        this.f48433n7h = fArr7[1];
    }

    void jp0y(float lastTouchX, float lastTouchY) {
        this.f48429ki = lastTouchX;
        this.f48437t8r = lastTouchY;
        this.f48430kja0 = false;
    }

    /* JADX INFO: renamed from: k */
    float m1588k(float dx, float dy) {
        return (dx * this.f48436qrj) + (dy * this.f48433n7h);
    }

    RectF ki(ViewGroup layout, RectF rect) {
        View viewFindViewById;
        int i2 = this.f2488n;
        if (i2 == -1 || (viewFindViewById = layout.findViewById(i2)) == null) {
            return null;
        }
        rect.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rect;
    }

    public float kja0() {
        return this.f2492t;
    }

    boolean ld6() {
        return this.f48434ni7;
    }

    public void mcp(float velocity) {
        this.f48425fn3e = velocity;
    }

    /* JADX INFO: renamed from: n */
    public int m1589n() {
        return this.f48426fti;
    }

    public float n7h() {
        return this.f48439wvg;
    }

    void ni7(float dx, float dy) {
        float progress = this.f2486i.getProgress();
        if (!this.f48430kja0) {
            this.f48430kja0 = true;
            this.f2486i.setProgress(progress);
        }
        this.f2486i.m4(this.f2490q, progress, this.f2493y, this.f48424f7l8, this.f2485h);
        float f2 = this.f48436qrj;
        float[] fArr = this.f2485h;
        if (Math.abs((f2 * fArr[0]) + (this.f48433n7h * fArr[1])) < 0.01d) {
            float[] fArr2 = this.f2485h;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f3 = this.f48436qrj;
        float fMax = Math.max(Math.min(progress + (f3 != 0.0f ? (dx * f3) / this.f2485h[0] : (dy * this.f48433n7h) / this.f2485h[1]), 1.0f), 0.0f);
        if (fMax != this.f2486i.getProgress()) {
            this.f2486i.setProgress(fMax);
        }
    }

    void o1t(int autoCompleteMode) {
        this.f48426fti = autoCompleteMode;
    }

    /* JADX INFO: renamed from: p */
    public float m1590p() {
        return this.f48425fn3e;
    }

    /* JADX INFO: renamed from: q */
    public int m1591q() {
        return this.f2490q;
    }

    public int qrj() {
        return this.f48422a9;
    }

    /* JADX INFO: renamed from: s */
    float m1592s() {
        return this.f48441zurt;
    }

    /* JADX INFO: renamed from: t */
    public void m1593t(float acceleration) {
        this.f48441zurt = acceleration;
    }

    int t8r() {
        return this.f2488n;
    }

    public String toString() {
        if (Float.isNaN(this.f48436qrj)) {
            return "rotation";
        }
        return this.f48436qrj + " , " + this.f48433n7h;
    }

    void wvg(float lastTouchX, float lastTouchY) {
        this.f48429ki = lastTouchX;
        this.f48437t8r = lastTouchY;
    }

    float x2(float dx, float dy) {
        this.f2486i.m4(this.f2490q, this.f2486i.getProgress(), this.f2493y, this.f48424f7l8, this.f2485h);
        float f2 = this.f48436qrj;
        if (f2 != 0.0f) {
            float[] fArr = this.f2485h;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (dx * f2) / fArr[0];
        }
        float[] fArr2 = this.f2485h;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (dy * this.f48433n7h) / fArr2[1];
    }

    /* JADX INFO: renamed from: y */
    int m1594y() {
        return this.f2484g;
    }

    /* JADX INFO: renamed from: z */
    public void m1595z(int id) {
        this.f2490q = id;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void zurt(android.view.MotionEvent r24, androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0365s r25, int r26, androidx.constraintlayout.motion.widget.t8r r27) {
        /*
            Method dump skipped, instruction units count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.zurt.zurt(android.view.MotionEvent, androidx.constraintlayout.motion.widget.MotionLayout$s, int, androidx.constraintlayout.motion.widget.t8r):void");
    }

    public zurt(MotionLayout layout, C0370i onSwipe) {
        this.f2487k = 0;
        this.f48438toq = 0;
        this.f48442zy = 0;
        this.f2490q = -1;
        this.f2488n = -1;
        this.f2484g = -1;
        this.f48424f7l8 = 0.5f;
        this.f2493y = 0.5f;
        this.f2491s = 0.5f;
        this.f2489p = 0.5f;
        this.f48431ld6 = -1;
        this.f48440x2 = false;
        this.f48436qrj = 0.0f;
        this.f48433n7h = 1.0f;
        this.f48430kja0 = false;
        this.f2485h = new float[2];
        this.f48423cdj = new int[2];
        this.f48425fn3e = 4.0f;
        this.f48441zurt = 1.2f;
        this.f48434ni7 = true;
        this.f48427fu4 = 1.0f;
        this.f2494z = 0;
        this.f48435o1t = 10.0f;
        this.f48439wvg = 10.0f;
        this.f2492t = 1.0f;
        this.f48432mcp = Float.NaN;
        this.f48428jk = Float.NaN;
        this.f48422a9 = 0;
        this.f48426fti = 0;
        this.f2486i = layout;
        this.f2490q = onSwipe.cdj();
        int iKi = onSwipe.ki();
        this.f2487k = iKi;
        if (iKi != -1) {
            float[] fArr = f48408eqxt[iKi];
            this.f2493y = fArr[0];
            this.f48424f7l8 = fArr[1];
        }
        int qVar = onSwipe.toq();
        this.f48438toq = qVar;
        float[][] fArr2 = f48405d2ok;
        if (qVar < fArr2.length) {
            float[] fArr3 = fArr2[qVar];
            this.f48436qrj = fArr3[0];
            this.f48433n7h = fArr3[1];
        } else {
            this.f48433n7h = Float.NaN;
            this.f48436qrj = Float.NaN;
            this.f48440x2 = true;
        }
        this.f48425fn3e = onSwipe.f7l8();
        this.f48441zurt = onSwipe.m1446g();
        this.f48434ni7 = onSwipe.m1455y();
        this.f48427fu4 = onSwipe.zy();
        this.f48435o1t = onSwipe.m1452q();
        this.f2488n = onSwipe.t8r();
        this.f48442zy = onSwipe.m1451p();
        this.f2494z = onSwipe.m1453s();
        this.f2484g = onSwipe.m1450n();
        this.f48431ld6 = onSwipe.ld6();
        this.f48422a9 = onSwipe.x2();
        this.f48439wvg = onSwipe.qrj();
        this.f2492t = onSwipe.n7h();
        this.f48432mcp = onSwipe.kja0();
        this.f48428jk = onSwipe.m1447h();
        this.f48426fti = onSwipe.m1449k();
    }
}
