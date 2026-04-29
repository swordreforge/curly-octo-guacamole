package com.android.thememanager.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.android.thememanager.R;
import java.security.InvalidParameterException;

/* JADX INFO: loaded from: classes2.dex */
public class ScreenView extends ViewGroup {
    private static final int afw = -1;
    public static final int cw14 = 4;
    public static final int d1cy = 9;
    public static final int dy = 2;
    private static final float eht = 0.75f;
    private static final int ei = 48;
    private static final float fn2 = 2500.0f;
    public static final int hp = 3;
    public static final int k6e = 4;
    protected static final int ls9 = 4;
    private static final int lw58 = 300;
    public static final int mjvl = 2;
    public static final int ndjo = 8;
    private static final float nq0z = 1.3f;
    private static final float oyp = 1.0E9f;
    public static final int q7k9 = 7;
    private static final int qns = 300;
    public static final int s8y = 1;
    public static final int sk1t = 1;
    public static final int tgs = 1;
    public static final int th6 = 6;
    private static final float us2t = 0.4f;
    protected static final int ut = 1;
    public static final int vb6 = 3;
    public static final int w97r = 0;
    protected static final int wh6 = 3;
    private static final int xhv = 500;
    public static final int xk5 = 0;
    private static final String xqx = "ScreenView";
    public static final int xy8 = 5;
    public static final int yl25 = 2;
    protected static final int zm = 0;
    public static final int zmmu = 3;
    private static final int zr5t = -1;
    private static final int zsl = 1000;

    /* JADX INFO: renamed from: a */
    protected int f17790a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    protected int f61576ab;
    private boolean ac;
    private int ad;
    private float aj;
    private int am;
    private boolean an;
    private f7l8 ar;
    private ScaleGestureDetector as;
    private boolean ax;
    private int ay;
    protected float az;

    /* JADX INFO: renamed from: b */
    protected int f17791b;
    private int ba;
    private int bb;
    private int bc;
    private InterfaceC2958p bd;
    private float be;
    protected float bg;
    private int bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    protected int f61577bo;
    protected float bp;
    private boolean bq;
    private float bs;
    private float bu;
    protected boolean bv;

    /* JADX INFO: renamed from: c */
    private Runnable f17792c;

    /* JADX INFO: renamed from: d */
    protected int f17793d;

    /* JADX INFO: renamed from: e */
    private int f17794e;

    /* JADX INFO: renamed from: f */
    private boolean f17795f;

    /* JADX INFO: renamed from: g */
    private int f17796g;

    /* JADX INFO: renamed from: h */
    private int f17797h;

    /* JADX INFO: renamed from: i */
    private zy f17798i;
    private Scroller id;
    private float in;

    /* JADX INFO: renamed from: j */
    private int f17799j;

    /* JADX INFO: renamed from: k */
    private final float f17800k;
    private int k0;

    /* JADX INFO: renamed from: l */
    private C2961y f17801l;

    /* JADX INFO: renamed from: m */
    protected int f17802m;

    /* JADX INFO: renamed from: n */
    private int f17803n;

    /* JADX INFO: renamed from: o */
    protected int f17804o;

    /* JADX INFO: renamed from: p */
    private int f17805p;

    /* JADX INFO: renamed from: q */
    private boolean f17806q;

    /* JADX INFO: renamed from: r */
    private boolean f17807r;

    /* JADX INFO: renamed from: s */
    private int f17808s;

    /* JADX INFO: renamed from: t */
    protected SeekBarIndicator f17809t;
    private C2959q tlhn;

    /* JADX INFO: renamed from: u */
    protected int f17810u;

    /* JADX INFO: renamed from: v */
    protected int f17811v;

    /* JADX INFO: renamed from: w */
    private int f17812w;

    /* JADX INFO: renamed from: x */
    protected int f17813x;

    /* JADX INFO: renamed from: y */
    private int f17814y;

    /* JADX INFO: renamed from: z */
    private zy f17815z;
    protected static final LinearLayout.LayoutParams wra = new LinearLayout.LayoutParams(-1, -1, 1.0f);
    private static final float n5ij = (float) (0.016d / Math.log(0.75d));

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.android.thememanager.widget.ScreenView.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel in) {
                return new SavedState(in, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        };

        /* JADX INFO: renamed from: k */
        int f17816k;

        /* synthetic */ SavedState(Parcel parcel, RunnableC2956k runnableC2956k) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f17816k);
        }

        SavedState(Parcelable superState) {
            super(superState);
            this.f17816k = -1;
        }

        private SavedState(Parcel in) {
            super(in);
            this.f17816k = -1;
            this.f17816k = in.readInt();
        }
    }

    public class SeekBarIndicator extends LinearLayout implements InterfaceC2957n {
        public SeekBarIndicator(Context context) {
            super(context);
        }

        @Override // com.android.thememanager.widget.ScreenView.InterfaceC2957n
        /* JADX INFO: renamed from: k */
        public boolean mo10510k(int offset) {
            if (getLeft() == offset) {
                return false;
            }
            setRight((getRight() + offset) - getLeft());
            setLeft(offset);
            return true;
        }
    }

    private class f7l8 implements Interpolator {

        /* JADX INFO: renamed from: k */
        private float f17818k;

        public f7l8() {
            this.f17818k = ScreenView.this.bu;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float t2) {
            float f2 = t2 - 1.0f;
            float f3 = this.f17818k;
            return (f2 * f2 * (((f3 + 1.0f) * f2) + f3)) + 1.0f;
        }

        public void toq() {
            this.f17818k = 0.0f;
        }

        public void zy(int distance, int velocity) {
            this.f17818k = distance > 0 ? ScreenView.this.bu / distance : ScreenView.this.bu;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.widget.ScreenView$g */
    private class ScaleGestureDetectorOnScaleGestureListenerC2955g implements ScaleGestureDetector.OnScaleGestureListener {

        /* JADX INFO: renamed from: n */
        private static final float f17819n = 1.2f;

        /* JADX INFO: renamed from: q */
        private static final float f17820q = 0.8f;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final float f61579toq = 200.0f;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final float f61580zy = 0.95f;

        private ScaleGestureDetectorOnScaleGestureListenerC2955g() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            float scaleFactor = detector.getScaleFactor();
            if (ScreenView.this.ba == 0 && (detector.getTimeDelta() > 200.0f || scaleFactor < f61580zy || scaleFactor > 1.0526316f)) {
                ScreenView.this.d2ok(null, 4);
            }
            if (scaleFactor < f17820q) {
                ScreenView.this.cdj(detector);
                return true;
            }
            if (scaleFactor <= f17819n) {
                return false;
            }
            ScreenView.this.ki(detector);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector detector) {
            return ScreenView.this.ba == 0;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector detector) {
            ScreenView.this.x2();
        }

        /* synthetic */ ScaleGestureDetectorOnScaleGestureListenerC2955g(ScreenView screenView, RunnableC2956k runnableC2956k) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.widget.ScreenView$k */
    class RunnableC2956k implements Runnable {
        RunnableC2956k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ScreenView.this.m10496f();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.widget.ScreenView$n */
    private interface InterfaceC2957n {
        /* JADX INFO: renamed from: k */
        boolean mo10510k(int offset);
    }

    /* JADX INFO: renamed from: com.android.thememanager.widget.ScreenView$p */
    public interface InterfaceC2958p {
        /* JADX INFO: renamed from: k */
        void m10512k(ScreenView screenView);

        void toq(ScreenView screenView);
    }

    /* JADX INFO: renamed from: com.android.thememanager.widget.ScreenView$s */
    private class ViewOnTouchListenerC2960s implements View.OnTouchListener {
        private ViewOnTouchListenerC2960s() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
            /*
                r6 = this;
                int r7 = r7.getWidth()
                float r0 = r8.getX()
                int r1 = r7 + (-1)
                float r1 = (float) r1
                float r0 = java.lang.Math.min(r0, r1)
                r1 = 0
                float r0 = java.lang.Math.max(r1, r0)
                com.android.thememanager.widget.ScreenView r1 = com.android.thememanager.widget.ScreenView.this
                int r1 = r1.getScreenCount()
                float r2 = (float) r1
                float r2 = r2 * r0
                float r7 = (float) r7
                float r2 = r2 / r7
                double r2 = (double) r2
                double r2 = java.lang.Math.floor(r2)
                int r2 = (int) r2
                int r3 = r8.getAction()
                r4 = 3
                r5 = 1
                if (r3 == 0) goto L5b
                if (r3 == r5) goto L4a
                r8 = 2
                if (r3 == r8) goto L34
                if (r3 == r4) goto L4a
                goto L75
            L34:
                com.android.thememanager.widget.ScreenView r3 = com.android.thememanager.widget.ScreenView.this
                r3.setCurrentScreenInner(r2)
                com.android.thememanager.widget.ScreenView r2 = com.android.thememanager.widget.ScreenView.this
                int r3 = r2.f17813x
                int r1 = r1 * r3
                float r1 = (float) r1
                float r1 = r1 * r0
                float r1 = r1 / r7
                int r3 = r3 / r8
                float r7 = (float) r3
                float r1 = r1 - r7
                int r7 = (int) r1
                r8 = 0
                r2.scrollTo(r7, r8)
                goto L75
            L4a:
                com.android.thememanager.widget.ScreenView r7 = com.android.thememanager.widget.ScreenView.this
                r7.x9kr(r2)
                com.android.thememanager.widget.ScreenView r7 = com.android.thememanager.widget.ScreenView.this
                int r8 = r7.f17793d
                int r0 = com.android.thememanager.widget.ScreenView.m10497g(r7)
                r7.hb(r8, r0)
                goto L75
            L5b:
                com.android.thememanager.widget.ScreenView r7 = com.android.thememanager.widget.ScreenView.this
                android.widget.Scroller r7 = com.android.thememanager.widget.ScreenView.m10500n(r7)
                boolean r7 = r7.isFinished()
                if (r7 != 0) goto L70
                com.android.thememanager.widget.ScreenView r7 = com.android.thememanager.widget.ScreenView.this
                android.widget.Scroller r7 = com.android.thememanager.widget.ScreenView.m10500n(r7)
                r7.abortAnimation()
            L70:
                com.android.thememanager.widget.ScreenView r7 = com.android.thememanager.widget.ScreenView.this
                r7.d2ok(r8, r4)
            L75:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.widget.ScreenView.ViewOnTouchListenerC2960s.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }

        /* synthetic */ ViewOnTouchListenerC2960s(ScreenView screenView, RunnableC2956k runnableC2956k) {
            this();
        }
    }

    class toq extends AnimatorListenerAdapter {
        toq() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            ScreenView.this.f17801l.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.widget.ScreenView$y */
    private class C2961y extends FrameLayout implements InterfaceC2957n {

        /* JADX INFO: renamed from: g */
        private Rect f17829g;

        /* JADX INFO: renamed from: k */
        private Bitmap f17830k;

        /* JADX INFO: renamed from: n */
        private Rect f17831n;

        /* JADX INFO: renamed from: q */
        private NinePatch f17832q;

        public C2961y(Context context, int slideDrawableId, int backgroundDrawableId) {
            byte[] ninePatchChunk;
            super(context);
            this.f17831n = new Rect();
            this.f17829g = new Rect();
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), slideDrawableId);
            this.f17830k = bitmapDecodeResource;
            if (bitmapDecodeResource == null || (ninePatchChunk = bitmapDecodeResource.getNinePatchChunk()) == null) {
                return;
            }
            this.f17832q = new NinePatch(this.f17830k, ninePatchChunk, null);
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setBackgroundResource(backgroundDrawableId);
            addView(frameLayout, new FrameLayout.LayoutParams(-1, -2, 80));
            this.f17829g.left = frameLayout.getPaddingLeft();
            this.f17829g.top = frameLayout.getPaddingTop();
            this.f17829g.right = frameLayout.getPaddingRight();
            this.f17829g.bottom = frameLayout.getPaddingBottom();
            Rect rect = this.f17831n;
            int i2 = this.f17829g.top;
            rect.top = i2;
            rect.bottom = i2 + this.f17830k.getHeight();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            NinePatch ninePatch = this.f17832q;
            if (ninePatch != null) {
                ninePatch.draw(canvas, this.f17831n);
            }
        }

        @Override // android.view.View
        protected int getSuggestedMinimumHeight() {
            return Math.max(this.f17830k.getHeight(), super.getSuggestedMinimumHeight());
        }

        @Override // com.android.thememanager.widget.ScreenView.InterfaceC2957n
        /* JADX INFO: renamed from: k */
        public boolean mo10510k(int offset) {
            if (getLeft() == offset) {
                return false;
            }
            setRight((getRight() + offset) - getLeft());
            setLeft(offset);
            return true;
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
            super.onLayout(changed, left, top, right, bottom);
            NinePatch ninePatch = this.f17832q;
            if (ninePatch != null) {
                Rect rect = this.f17831n;
                int i2 = (bottom - top) - this.f17829g.bottom;
                rect.bottom = i2;
                rect.top = i2 - ninePatch.getHeight();
            }
        }

        public int toq() {
            int measuredWidth = getMeasuredWidth();
            Rect rect = this.f17829g;
            return (measuredWidth - rect.left) - rect.right;
        }

        public void zy(int left, int right) {
            Rect rect = this.f17831n;
            Rect rect2 = this.f17829g;
            rect.left = left + rect2.left;
            rect.right = right + rect2.left;
        }
    }

    private class zy extends ImageView implements InterfaceC2957n {
        public zy(Context context) {
            super(context);
        }

        @Override // com.android.thememanager.widget.ScreenView.InterfaceC2957n
        /* JADX INFO: renamed from: k */
        public boolean mo10510k(int offset) {
            if (getLeft() == offset) {
                return false;
            }
            setRight((getRight() + offset) - getLeft());
            setLeft(offset);
            return true;
        }
    }

    public ScreenView(Context context) {
        super(context);
        this.f17800k = Resources.getSystem().getDisplayMetrics().density * 1280.0f;
        this.f17806q = true;
        this.f17796g = R.drawable.screen_view_arrow_left;
        this.f17814y = R.drawable.screen_view_arrow_left_gray;
        this.f17808s = R.drawable.screen_view_arrow_right;
        this.f17805p = R.drawable.screen_view_arrow_right_gray;
        this.f17797h = R.drawable.screen_view_seek_point_selector;
        this.f17792c = new RunnableC2956k();
        this.f17790a = 1;
        this.f17810u = 0;
        this.f17812w = -1;
        this.bp = 0.33333334f;
        this.in = 0.0f;
        this.bl = 0;
        this.ba = 0;
        this.ac = true;
        this.ay = -1;
        this.bs = 0.5f;
        this.k0 = 300;
        this.bc = 0;
        this.bu = nq0z;
        this.tlhn = new C2959q(this, null);
        kja0();
    }

    /* JADX INFO: renamed from: c */
    private void m10494c(int x3) {
        zy zyVar = this.f17798i;
        if (zyVar != null) {
            zyVar.setImageResource(x3 <= 0 ? this.f17814y : this.f17796g);
            this.f17815z.setImageResource(x3 >= ((getScreenCount() * this.f17813x) - this.f17810u) - this.f17791b ? this.f17805p : this.f17808s);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m10495e(int r13, boolean r14) {
        /*
            r12 = this;
            int r0 = r12.getWidth()
            if (r0 <= 0) goto L9e
            int r0 = r12.getScreenCount()
            int r1 = r12.getWidth()
            int r2 = r12.getHeight()
            r3 = 0
            r4 = r3
        L14:
            int r5 = r12.f17803n
            if (r4 >= r5) goto L9e
            int r5 = r4 + r0
            android.view.View r5 = r12.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6
            int r7 = r5.getMeasuredWidth()
            int r8 = r5.getMeasuredHeight()
            int r9 = r6.gravity
            r10 = -1
            if (r9 == r10) goto L76
            r10 = r9 & 7
            r9 = r9 & 112(0x70, float:1.57E-43)
            r11 = 1
            if (r10 == r11) goto L49
            r11 = 3
            if (r10 == r11) goto L46
            r11 = 5
            if (r10 == r11) goto L41
            int r10 = r6.leftMargin
            goto L53
        L41:
            int r10 = r1 - r7
            int r11 = r6.rightMargin
            goto L52
        L46:
            int r10 = r6.leftMargin
            goto L53
        L49:
            int r10 = r1 - r7
            int r10 = r10 / 2
            int r11 = r6.leftMargin
            int r10 = r10 + r11
            int r11 = r6.rightMargin
        L52:
            int r10 = r10 - r11
        L53:
            r11 = 16
            if (r9 == r11) goto L6a
            r11 = 48
            if (r9 == r11) goto L67
            r11 = 80
            if (r9 == r11) goto L62
            int r6 = r6.topMargin
            goto L78
        L62:
            int r9 = r2 - r8
            int r6 = r6.bottomMargin
            goto L73
        L67:
            int r6 = r6.topMargin
            goto L78
        L6a:
            int r9 = r2 - r8
            int r9 = r9 / 2
            int r11 = r6.topMargin
            int r9 = r9 + r11
            int r6 = r6.bottomMargin
        L73:
            int r6 = r9 - r6
            goto L78
        L76:
            r6 = r3
            r10 = r6
        L78:
            if (r14 != 0) goto L94
            int r9 = r5.getHeight()
            if (r9 <= 0) goto L94
            int r9 = r5.getWidth()
            if (r9 <= 0) goto L94
            r6 = r5
            com.android.thememanager.widget.ScreenView$n r6 = (com.android.thememanager.widget.ScreenView.InterfaceC2957n) r6
            int r10 = r10 + r13
            boolean r6 = r6.mo10510k(r10)
            if (r6 == 0) goto L9a
            r5.invalidate()
            goto L9a
        L94:
            int r10 = r10 + r13
            int r7 = r7 + r10
            int r8 = r8 + r6
            r5.layout(r10, r6, r7, r8)
        L9a:
            int r4 = r4 + 1
            goto L14
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.widget.ScreenView.m10495e(int, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m10496f() {
        if (this.f17795f) {
            this.f17801l.animate().setDuration(500L).alpha(0.0f).setListener(new toq());
        }
    }

    private void fu4() {
        int i2 = this.f17813x;
        this.bb = ((int) ((-i2) * this.bp)) - this.f17791b;
        if (!this.bv || this.an) {
            this.f61576ab = ((int) ((i2 * (getScreenCount() + this.bp)) - this.f17810u)) + this.f17791b;
        } else {
            this.f61576ab = (int) ((((getScreenCount() - 1) / this.f17790a) * this.f17810u) + (this.f17813x * this.bp));
        }
        if (this.f61576ab < 0) {
            this.f61576ab = 0;
        }
    }

    /* JADX INFO: renamed from: j */
    private void m10498j(int scrollX) {
        int screenCount = getScreenCount();
        C2961y c2961y = this.f17801l;
        if (c2961y == null || screenCount <= 0) {
            return;
        }
        int qVar = c2961y.toq();
        int iMax = Math.max((qVar / screenCount) * this.f17790a, 48);
        int i2 = this.f17813x * screenCount;
        int i3 = i2 <= qVar ? 0 : ((qVar - iMax) * scrollX) / (i2 - qVar);
        this.f17801l.zy(i3, iMax + i3);
        if (isHardwareAccelerated()) {
            this.f17801l.invalidate();
        }
    }

    private void kja0() {
        setAlwaysDrawnWithCacheEnabled(true);
        setClipToPadding(true);
        this.ar = new f7l8();
        this.id = new Scroller(getContext(), this.ar);
        setCurrentScreenInner(0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.ad = viewConfiguration.getScaledTouchSlop();
        setMaximumSnapVelocity(viewConfiguration.getScaledMaximumFlingVelocity());
        this.as = new ScaleGestureDetector(getContext(), new ScaleGestureDetectorOnScaleGestureListenerC2955g(this, null));
    }

    private void lvui() {
        if (this.f17801l == null || !this.f17795f) {
            return;
        }
        removeCallbacks(this.f17792c);
        this.f17801l.animate().cancel();
        this.f17801l.setAlpha(1.0f);
        this.f17801l.setVisibility(0);
        if (this.ba == 0) {
            postDelayed(this.f17792c, 1000L);
        }
    }

    private void ni7(MotionEvent ev) {
        this.tlhn.m10514k(ev);
        int i2 = this.ba;
        if (i2 == 0 || 4 == i2) {
            this.as.onTouchEvent(ev);
        }
    }

    private void nn86() {
        int i2 = this.f17804o;
        if (i2 == 0) {
            this.f17791b = this.f17802m;
        } else if (i2 == 1) {
            this.f17791b = 0;
        } else if (i2 == 2) {
            this.f17791b = (this.f17810u - this.f17813x) / 2;
        } else if (i2 == 3) {
            this.f17791b = this.f17810u - this.f17813x;
        }
        this.f17791b += getPaddingLeft();
    }

    private boolean oc(MotionEvent ev) {
        float fAbs = Math.abs(ev.getX(0) - this.bg);
        return fAbs > Math.abs(ev.getY(0) - this.az) * this.bs && fAbs > ((float) (this.ad * ev.getPointerCount()));
    }

    /* JADX INFO: renamed from: r */
    private void m10502r(int pointerId) {
        if (this.f17813x <= 0 || getCurrentScreen() == null) {
            return;
        }
        dd((int) this.tlhn.zy(1000, this.am, pointerId), this.tlhn.toq(Math.abs(r4)));
    }

    private void uv6(View child) {
        if (child instanceof InterfaceC2957n) {
        }
        float measuredWidth = child.getMeasuredWidth();
        float measuredHeight = child.getMeasuredHeight();
        float f2 = measuredWidth / 2.0f;
        float f3 = measuredHeight / 2.0f;
        float scrollX = (((getScrollX() + (getMeasuredWidth() / 2.0f)) - child.getLeft()) - f2) / measuredWidth;
        switch (this.bc) {
            case 1:
                mcp(child);
                break;
            case 2:
                if (scrollX != 0.0f && Math.abs(scrollX) <= 1.0f) {
                    child.setAlpha(((1.0f - Math.abs(scrollX)) * 0.7f) + 0.3f);
                    child.setTranslationX(0.0f);
                    child.setTranslationY(0.0f);
                    child.setScaleX(1.0f);
                    child.setScaleY(1.0f);
                    child.setPivotX(0.0f);
                    child.setPivotY(0.0f);
                    child.setRotation(0.0f);
                    child.setRotationX(0.0f);
                    child.setRotationY(0.0f);
                    child.setCameraDistance(this.f17800k);
                } else {
                    mcp(child);
                }
                break;
            case 3:
                if (scrollX != 0.0f && Math.abs(scrollX) <= 1.0f) {
                    child.setAlpha(1.0f);
                    child.setTranslationX(0.0f);
                    child.setTranslationY(0.0f);
                    child.setScaleX(1.0f);
                    child.setScaleY(1.0f);
                    child.setPivotX(f2);
                    child.setPivotY(measuredHeight);
                    child.setRotation((-scrollX) * 30.0f);
                    child.setRotationX(0.0f);
                    child.setRotationY(0.0f);
                    child.setCameraDistance(this.f17800k);
                } else {
                    mcp(child);
                }
                break;
            case 4:
                if (scrollX != 0.0f && Math.abs(scrollX) <= 1.0f) {
                    child.setAlpha(1.0f);
                    child.setTranslationX(0.0f);
                    child.setTranslationY(0.0f);
                    child.setScaleX(1.0f);
                    child.setScaleY(1.0f);
                    if (scrollX < 0.0f) {
                        measuredWidth = 0.0f;
                    }
                    child.setPivotX(measuredWidth);
                    child.setPivotY(f3);
                    child.setRotation(0.0f);
                    child.setRotationX(0.0f);
                    child.setRotationY(scrollX * (-90.0f));
                    child.setCameraDistance(5000.0f);
                } else {
                    mcp(child);
                }
                break;
            case 5:
                if (scrollX != 0.0f && Math.abs(scrollX) <= 1.0f) {
                    child.setAlpha(1.0f - Math.abs(scrollX));
                    child.setTranslationY(0.0f);
                    child.setTranslationX((measuredWidth * scrollX) - ((measuredWidth * Math.abs(scrollX)) * 0.3f));
                    float f4 = (0.3f * scrollX) + 1.0f;
                    child.setScaleX(f4);
                    child.setScaleY(f4);
                    child.setPivotX(0.0f);
                    child.setPivotY(f3);
                    child.setRotation(0.0f);
                    child.setRotationX(0.0f);
                    child.setRotationY((-scrollX) * 45.0f);
                    child.setCameraDistance(5000.0f);
                } else {
                    mcp(child);
                }
                break;
            case 7:
                if (scrollX > 0.0f) {
                    float f5 = 1.0f - scrollX;
                    child.setAlpha(f5);
                    float f6 = (f5 * us2t) + 0.6f;
                    float f7 = 1.0f - f6;
                    child.setTranslationX(measuredWidth * f7 * 3.0f);
                    child.setTranslationY(measuredHeight * f7 * 0.5f);
                    child.setScaleX(f6);
                    child.setScaleY(f6);
                    child.setPivotX(0.0f);
                    child.setPivotY(0.0f);
                    child.setRotation(0.0f);
                    child.setRotationX(0.0f);
                    child.setRotationY(0.0f);
                    child.setCameraDistance(this.f17800k);
                } else {
                    mcp(child);
                }
                break;
            case 8:
                if (scrollX != 0.0f && Math.abs(scrollX) <= 1.0f) {
                    child.setAlpha(1.0f - Math.abs(scrollX));
                    child.setTranslationX(measuredWidth * scrollX);
                    child.setTranslationY(0.0f);
                    child.setScaleX(1.0f);
                    child.setScaleY(1.0f);
                    child.setPivotX(f2);
                    child.setPivotY(f3);
                    child.setRotation(0.0f);
                    child.setRotationX(0.0f);
                    child.setRotationY((-scrollX) * 90.0f);
                    child.setCameraDistance(5000.0f);
                } else {
                    mcp(child);
                }
                break;
            case 9:
                vyq(child, scrollX);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        int screenCount = getScreenCount();
        if (index >= 0) {
            screenCount = Math.min(index, screenCount);
        }
        SeekBarIndicator seekBarIndicator = this.f17809t;
        if (seekBarIndicator != null) {
            seekBarIndicator.addView(ld6(), screenCount, wra);
        }
        this.bl++;
        fu4();
        super.addView(child, screenCount, params);
    }

    protected void cdj(ScaleGestureDetector detector) {
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.id.computeScrollOffset()) {
            this.aj = this.id.getCurrX();
            setScrollX(this.id.getCurrX());
            this.be = System.nanoTime() / oyp;
            setScrollY(this.id.getCurrY());
            postInvalidateOnAnimation();
        } else {
            int i2 = this.f17812w;
            if (i2 != -1) {
                setCurrentScreenInner(Math.max(0, Math.min(i2, getScreenCount() - 1)));
                this.f17812w = -1;
                InterfaceC2958p interfaceC2958p = this.bd;
                if (interfaceC2958p != null) {
                    interfaceC2958p.toq(this);
                    this.bd = null;
                }
            } else if (this.ba == 1) {
                float fNanoTime = System.nanoTime() / oyp;
                float fExp = (float) Math.exp((fNanoTime - this.be) / n5ij);
                float scrollX = this.aj - getScrollX();
                setScrollX((int) (getScrollX() + (fExp * scrollX)));
                this.be = fNanoTime;
                if (scrollX > 1.0f || scrollX < -1.0f) {
                    postInvalidate();
                }
            }
        }
        m10495e(getScrollX(), false);
        m10498j(getScrollX());
        m10494c(getScrollX());
    }

    protected void d2ok(MotionEvent ev, int touchState) {
        this.ba = touchState;
        getParent().requestDisallowInterceptTouchEvent(this.ba != 0);
        if (this.ba == 0) {
            this.ay = -1;
            this.ac = false;
            this.tlhn.m10515n();
        } else {
            if (ev != null) {
                int pointerId = ev.getPointerId(0);
                this.ay = pointerId;
                this.bg = ev.getX(ev.findPointerIndex(pointerId));
            }
            if (this.ac) {
                this.ac = false;
                View childAt = getChildAt(this.f17793d);
                if (childAt != null) {
                    childAt.cancelLongPress();
                }
            }
            if (this.ba == 1) {
                this.aj = getScrollX();
                this.be = System.nanoTime() / oyp;
            }
        }
        lvui();
    }

    protected void dd(int velocity, int flingDirection) {
        int screenCount;
        int i2;
        int i3;
        int i4;
        if (this.bv) {
            i2 = this.f17790a;
            screenCount = getScreenCount() - 1;
        } else {
            screenCount = (getScreenCount() - this.f17790a) - 1;
            i2 = 1;
        }
        if (flingDirection == 1 && (i4 = this.f17793d) > 0) {
            ncyb(i4 - i2, velocity, true);
            return;
        }
        if (flingDirection == 2 && (i3 = this.f17793d) < screenCount) {
            ncyb(i3 + i2, velocity, true);
            return;
        }
        if (flingDirection == 3) {
            ncyb(this.f17793d, velocity, true);
            return;
        }
        int i5 = this.f17813x * i2;
        int scrollX = (!this.bv || !this.an || getScreenCount() % i2 <= 0 || getScrollX() <= 0) ? (getScrollX() + (this.f17810u % i5)) / this.f17813x : ((getScrollX() + (this.f17810u % i5)) + i5) / this.f17813x;
        if (flingDirection == 2 && this.f17793d == screenCount) {
            int i6 = this.f17810u;
            if (i6 % i5 <= i6 / 2) {
                scrollX = ((getScrollX() + (this.f17810u % i5)) + i5) / this.f17813x;
            }
        }
        ncyb(scrollX, 0, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchUnhandledMove(View focused, int direction) {
        if (direction == 17) {
            int i2 = this.f17793d;
            if (i2 > 0) {
                x9kr(i2 - 1);
                return true;
            }
        } else if (direction == 66 && this.f17793d < getScreenCount() - 1) {
            x9kr(this.f17793d + 1);
            return true;
        }
        return super.dispatchUnhandledMove(focused, direction);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View child, long drawingTime) {
        uv6(child);
        return super.drawChild(canvas, child, drawingTime);
    }

    public void fn3e() {
    }

    public View getCurrentScreen() {
        return qrj(this.f17793d);
    }

    public int getCurrentScreenIndex() {
        int i2 = this.f17812w;
        return i2 != -1 ? i2 : this.f17793d;
    }

    public final int getScreenCount() {
        return this.bl;
    }

    public int getScreenTransitionType() {
        return this.bc;
    }

    protected int getTouchState() {
        return this.ba;
    }

    public int getVisibleRange() {
        return this.f17790a;
    }

    /* JADX INFO: renamed from: h */
    public void m10503h() {
        if (this.id.isFinished()) {
            return;
        }
        int currX = this.id.getCurrX();
        int i2 = this.f17813x;
        setCurrentScreen((int) Math.floor((currX + (i2 / 2)) / i2));
        this.id.abortAnimation();
    }

    protected void hb(int fromIndex, int toIndex) {
        if (this.f17809t != null) {
            int i2 = this.f17807r ? this.f17790a : 1;
            int iMax = Math.max(0, Math.min(toIndex, getScreenCount() - i2));
            int screenCount = getScreenCount();
            for (int i3 = 0; i3 < screenCount; i3++) {
                View childAt = this.f17809t.getChildAt(i3);
                if (iMax > i3 || i3 >= iMax + i2) {
                    childAt.setSelected(false);
                } else {
                    childAt.setSelected(true);
                }
            }
        }
    }

    public void jk(int index) {
        int i2;
        if (this.bv) {
            if (!this.an || getScreenCount() <= this.f17790a || index <= getScreenCount() - this.f17790a) {
                i2 = index % this.f17790a;
            } else {
                index = getScreenCount();
                i2 = this.f17790a;
            }
            index -= i2;
        }
        measure(this.f61577bo, this.f17811v);
        scrollTo((this.f17813x * index) - this.f17791b, 0);
    }

    protected void ki(ScaleGestureDetector detector) {
    }

    /* JADX INFO: renamed from: l */
    protected void mo10292l(int whichScreen, int velocity, boolean settle, InterfaceC2958p notification) {
        int screenCount;
        int i2;
        if (this.f17810u <= 0) {
            return;
        }
        if (this.bv) {
            int iMax = Math.max(0, Math.min(whichScreen, getScreenCount() - 1));
            this.f17812w = iMax;
            this.f17812w = iMax - (iMax % this.f17790a);
        } else {
            this.f17812w = Math.max(0, Math.min(whichScreen, getScreenCount() - 1));
        }
        int iMax2 = Math.max(1, Math.abs(this.f17812w - this.f17793d));
        if (!this.id.isFinished()) {
            InterfaceC2958p interfaceC2958p = this.bd;
            if (interfaceC2958p != null) {
                interfaceC2958p.m10512k(this);
            }
            this.id.abortAnimation();
        }
        this.bd = notification;
        int iAbs = Math.abs(velocity);
        if (settle) {
            this.ar.zy(iMax2, iAbs);
        } else {
            this.ar.toq();
        }
        int paddingRight = this.f17791b;
        if (this.f17804o != 2 && !this.bv) {
            int i3 = this.f17812w;
            int screenCount2 = getScreenCount();
            int i4 = this.f17790a;
            if (i3 == screenCount2 - i4 && this.f17812w != 0) {
                paddingRight = (this.f17810u - (this.f17813x * i4)) + getPaddingRight();
            }
        }
        if (!this.bv || !this.an || getScreenCount() <= this.f17790a || whichScreen <= getScreenCount() - this.f17790a) {
            screenCount = this.f17812w;
            i2 = this.f17813x;
        } else {
            screenCount = getScreenCount() - this.f17790a;
            i2 = this.f17813x;
        }
        int scrollX = ((screenCount * i2) - paddingRight) - getScrollX();
        if (scrollX == 0) {
            return;
        }
        int iAbs2 = Math.abs(scrollX);
        int i5 = this.k0;
        int i6 = (iAbs2 * i5) / this.f17810u;
        if (iAbs > 0) {
            i6 += (int) ((i6 / (iAbs / fn2)) * us2t);
        }
        int iMax3 = Math.max(i5, i6);
        if (iMax2 <= 1) {
            iMax3 = Math.min(iMax3, this.k0 * 2);
        }
        this.id.startScroll(getScrollX(), 0, scrollX, 0, iMax3);
        invalidate();
    }

    protected ImageView ld6() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(this.f17797h);
        return imageView;
    }

    protected void mcp(View child) {
        child.setAlpha(1.0f);
        child.setTranslationX(0.0f);
        child.setTranslationY(0.0f);
        child.setPivotX(0.0f);
        child.setPivotY(0.0f);
        child.setRotation(0.0f);
        child.setRotationX(0.0f);
        child.setRotationY(0.0f);
        child.setCameraDistance(this.f17800k);
        child.setScaleX(1.0f);
        child.setScaleY(1.0f);
    }

    public void n5r1(int whichScreen, InterfaceC2958p notification) {
        mo10292l(whichScreen, 0, false, notification);
    }

    public ImageView n7h(int index) {
        return (ImageView) this.f17809t.getChildAt(index);
    }

    protected void ncyb(int whichScreen, int velocity, boolean settle) {
        mo10292l(whichScreen, velocity, settle, null);
    }

    protected void o1t(View indicator) {
        int iIndexOfChild = indexOfChild(indicator);
        if (iIndexOfChild < getScreenCount()) {
            throw new InvalidParameterException("The view passed through the parameter must be indicator.");
        }
        this.f17803n--;
        super.removeViewAt(iIndexOfChild);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        computeScroll();
        lvui();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 2
            r2 = 3
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L2f
            if (r0 == r4) goto L2b
            if (r0 == r1) goto L13
            if (r0 == r2) goto L2b
            goto L5d
        L13:
            r5.ni7(r6)
            int r0 = r5.ba
            if (r0 != 0) goto L5d
            boolean r0 = r5.oc(r6)
            if (r0 == 0) goto L5d
            float r0 = r5.bg
            r5.d2ok(r6, r4)
            r5.bg = r0
            r5.onTouchEvent(r6)
            goto L5d
        L2b:
            r5.d2ok(r6, r3)
            goto L5d
        L2f:
            r6.setAction(r2)
            android.view.ScaleGestureDetector r0 = r5.as
            r0.onTouchEvent(r6)
            r6.setAction(r3)
            r5.bq = r3
            r5.ax = r3
            float r0 = r6.getX()
            r5.bg = r0
            float r0 = r6.getY()
            r5.az = r0
            android.widget.Scroller r0 = r5.id
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L55
            r5.ac = r4
            goto L5d
        L55:
            android.widget.Scroller r0 = r5.id
            r0.abortAnimation()
            r5.d2ok(r6, r4)
        L5d:
            int r0 = r6.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L68
            r5.ni7(r6)
        L68:
            boolean r6 = r5.bq
            if (r6 != 0) goto L72
            int r6 = r5.ba
            if (r6 == 0) goto L73
            if (r6 == r2) goto L73
        L72:
            r3 = r4
        L73:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.widget.ScreenView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        m10495e(getScrollX(), true);
        int screenCount = getScreenCount();
        int measuredWidth = 0;
        for (int i2 = 0; i2 < screenCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                childAt.layout(measuredWidth, getPaddingTop() + this.f17794e, childAt.getMeasuredWidth() + measuredWidth, getPaddingTop() + this.f17794e + childAt.getMeasuredHeight());
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
        if (this.bv) {
            int i3 = this.f17793d;
            int i4 = this.f17790a;
            if (i3 % i4 > 0) {
                setCurrentScreen(i3 - (i3 % i4));
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        this.f61577bo = widthMeasureSpec;
        this.f17811v = heightMeasureSpec;
        int screenCount = getScreenCount();
        int iMax = 0;
        int iMax2 = 0;
        for (int i2 = 0; i2 < this.f17803n; i2++) {
            View childAt = getChildAt(i2 + screenCount);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            childAt.measure(ViewGroup.getChildMeasureSpec(widthMeasureSpec, getPaddingLeft() + getPaddingRight(), layoutParams.width), ViewGroup.getChildMeasureSpec(heightMeasureSpec, getPaddingTop() + this.f17794e + getPaddingBottom() + this.f17799j, layoutParams.height));
            iMax = Math.max(iMax, childAt.getMeasuredWidth());
            iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
        }
        int iMax3 = 0;
        int iMax4 = 0;
        for (int i3 = 0; i3 < screenCount; i3++) {
            View childAt2 = getChildAt(i3);
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            childAt2.measure(ViewGroup.getChildMeasureSpec(widthMeasureSpec, getPaddingLeft() + getPaddingRight(), layoutParams2.width), ViewGroup.getChildMeasureSpec(heightMeasureSpec, getPaddingTop() + this.f17794e + getPaddingBottom() + this.f17799j, layoutParams2.height));
            iMax3 = Math.max(iMax3, childAt2.getMeasuredWidth());
            iMax4 = Math.max(iMax4, childAt2.getMeasuredHeight());
        }
        setMeasuredDimension(View.resolveSize(Math.max(iMax3, iMax) + getPaddingLeft() + getPaddingRight(), widthMeasureSpec), View.resolveSize(Math.max(iMax4, iMax2) + getPaddingTop() + this.f17794e + getPaddingBottom() + this.f17799j, heightMeasureSpec));
        if (screenCount > 0) {
            this.f17813x = iMax3;
            this.f17810u = (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight();
            nn86();
            int i4 = this.f17813x;
            if (i4 > 0) {
                this.f17790a = Math.max(1, (this.f17810u + ((int) (i4 * this.in))) / i4);
            }
            setOverScrollRatio(this.bp);
        }
        if (!this.f17806q || this.f17790a <= 0) {
            return;
        }
        this.f17806q = false;
        setHorizontalScrollBarEnabled(false);
        setCurrentScreen(this.f17793d);
        setHorizontalScrollBarEnabled(true);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i2 = savedState.f17816k;
        if (i2 != -1) {
            setCurrentScreen(i2);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f17816k = this.f17793d;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.bq
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r5.ax
            if (r0 == 0) goto Ld
            r5.ni7(r6)
        Ld:
            int r0 = r6.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = 0
            if (r0 == r1) goto L89
            r3 = 2
            if (r0 == r3) goto L48
            r3 = 3
            if (r0 == r3) goto L89
            r3 = 6
            if (r0 == r3) goto L21
            goto L95
        L21:
            int r0 = r6.getAction()
            r3 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r3
            int r0 = r0 >> 8
            int r3 = r6.getPointerId(r0)
            int r4 = r5.ay
            if (r3 != r4) goto L95
            if (r0 != 0) goto L36
            r2 = r1
        L36:
            float r0 = r6.getX(r2)
            r5.bg = r0
            int r6 = r6.getPointerId(r2)
            r5.ay = r6
            com.android.thememanager.widget.ScreenView$q r0 = r5.tlhn
            r0.m10516q(r6)
            goto L95
        L48:
            int r0 = r5.ba
            if (r0 != 0) goto L55
            boolean r0 = r5.oc(r6)
            if (r0 == 0) goto L55
            r5.d2ok(r6, r1)
        L55:
            int r0 = r5.ba
            if (r0 != r1) goto L95
            int r0 = r5.ay
            int r0 = r6.findPointerIndex(r0)
            r3 = -1
            if (r0 != r3) goto L6c
            r5.d2ok(r6, r1)
            int r0 = r6.getPointerId(r2)
            r5.ay = r0
            r0 = r2
        L6c:
            float r6 = r6.getX(r0)
            float r0 = r5.bg
            float r0 = r0 - r6
            r5.bg = r6
            r6 = 0
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L85
            float r6 = r5.aj
            float r6 = r6 + r0
            int r6 = java.lang.Math.round(r6)
            r5.scrollTo(r6, r2)
            goto L95
        L85:
            r5.awakenScrollBars()
            goto L95
        L89:
            int r0 = r5.ba
            if (r0 != r1) goto L92
            int r0 = r5.ay
            r5.m10502r(r0)
        L92:
            r5.d2ok(r6, r2)
        L95:
            r5.ax = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.widget.ScreenView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: p */
    public boolean m10504p() {
        return this.ac;
    }

    public View qrj(int screenIndex) {
        if (screenIndex < 0 || screenIndex >= getScreenCount()) {
            return null;
        }
        return getChildAt(screenIndex);
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        this.f17803n = 0;
        this.bl = 0;
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        throw new UnsupportedOperationException("ScreenView doesn't support remove view directly.");
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int index) {
        throw new UnsupportedOperationException("ScreenView doesn't support remove view directly.");
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        throw new UnsupportedOperationException("ScreenView doesn't support remove view directly.");
    }

    @Override // android.view.ViewGroup
    public void removeViews(int start, int count) {
        throw new UnsupportedOperationException("ScreenView doesn't support remove view directly.");
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int start, int count) {
        throw new UnsupportedOperationException("ScreenView doesn't support remove view directly.");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
        int iIndexOfChild = indexOfChild(child);
        if (iIndexOfChild >= getScreenCount()) {
            return super.requestChildRectangleOnScreen(child, rectangle, immediate);
        }
        if (iIndexOfChild == this.f17793d && this.id.isFinished()) {
            return false;
        }
        x9kr(iIndexOfChild);
        return true;
    }

    /* JADX INFO: renamed from: s */
    protected void m10505s(View indicator, FrameLayout.LayoutParams params, int index) {
        int iMax = Math.max(-1, Math.min(index, this.f17803n));
        if (iMax >= 0) {
            iMax += getScreenCount();
        }
        this.f17803n++;
        super.addView(indicator, iMax, params);
    }

    @Override // android.view.View
    public void scrollTo(int x3, int y3) {
        this.aj = Math.max(this.bb, Math.min(x3, this.f61576ab));
        this.be = System.nanoTime() / oyp;
        super.scrollTo((int) this.aj, y3);
    }

    public void setAllowLongPress(boolean allowLongPress) {
        this.ac = allowLongPress;
    }

    public void setArrowIndicatorMarginRect(Rect margin) {
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        if (margin == null) {
            zy zyVar = this.f17798i;
            if (zyVar != null) {
                o1t(zyVar);
                o1t(this.f17815z);
                this.f17798i = null;
                this.f17815z = null;
                return;
            }
            return;
        }
        zy zyVar2 = this.f17798i;
        if (zyVar2 == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 19);
            zy zyVar3 = new zy(getContext());
            this.f17798i = zyVar3;
            zyVar3.setImageResource(this.f17796g);
            m10507y(this.f17798i, layoutParams);
            layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 21);
            zy zyVar4 = new zy(getContext());
            this.f17815z = zyVar4;
            zyVar4.setImageResource(this.f17808s);
            m10507y(this.f17815z, layoutParams2);
        } else {
            layoutParams = (FrameLayout.LayoutParams) zyVar2.getLayoutParams();
            layoutParams2 = (FrameLayout.LayoutParams) this.f17815z.getLayoutParams();
        }
        layoutParams.setMargins(margin.left, margin.top, 0, margin.bottom);
        layoutParams2.setMargins(0, margin.top, margin.right, margin.bottom);
    }

    public void setArrowIndicatorResource(int leftOn, int leftOff, int rightOn, int rightOff) {
        this.f17796g = leftOn;
        this.f17814y = leftOff;
        this.f17808s = rightOn;
        this.f17805p = rightOff;
    }

    public void setConfirmHorizontalScrollRatio(float ratio) {
        this.bs = ratio;
    }

    public void setCurrentScreen(int screenIndex) {
        int iMax;
        if (this.bv) {
            int iMax2 = Math.max(0, Math.min(screenIndex, getScreenCount() - 1));
            iMax = iMax2 - (iMax2 % this.f17790a);
        } else {
            iMax = Math.max(0, Math.min(screenIndex, getScreenCount() - this.f17790a));
        }
        setCurrentScreenInner(iMax);
        if (this.f17806q) {
            return;
        }
        if (!this.id.isFinished()) {
            this.id.abortAnimation();
        }
        jk(this.f17793d);
        invalidate();
    }

    protected void setCurrentScreenInner(int screenIndex) {
        hb(this.f17793d, screenIndex);
        this.f17793d = screenIndex;
        this.f17812w = -1;
    }

    public void setIndicatorBarVisibility(int visibility) {
        setSeekBarVisibility(visibility);
        setSlideBarVisibility(visibility);
    }

    public void setMaximumSnapVelocity(int velocity) {
        this.am = velocity;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l2) {
        int screenCount = getScreenCount();
        for (int i2 = 0; i2 < screenCount; i2++) {
            getChildAt(i2).setOnLongClickListener(l2);
        }
    }

    public void setOverScrollRatio(float ratio) {
        this.bp = ratio;
        fu4();
    }

    public void setOvershootTension(float tension) {
        this.bu = tension;
        f7l8 f7l8Var = this.ar;
        if (f7l8Var != null) {
            f7l8Var.f17818k = tension;
        }
    }

    public void setScreenAlignment(int alignment) {
        this.f17804o = alignment;
    }

    public void setScreenOffset(int offset) {
        this.f17802m = offset;
        this.f17804o = 0;
        requestLayout();
    }

    public void setScreenPadding(Rect padding) {
        if (padding == null) {
            throw new InvalidParameterException("The padding parameter can not be null.");
        }
        this.f17794e = padding.top;
        this.f17799j = padding.bottom;
        setPaddingRelative(padding.left, 0, padding.right, 0);
    }

    public void setScreenSnapDuration(int duration) {
        this.k0 = duration;
    }

    public void setScreenTransitionType(int type) {
        if (type != this.bc) {
            this.bc = type;
            switch (type) {
                case 0:
                    setOvershootTension(nq0z);
                    setScreenSnapDuration(300);
                    break;
                case 1:
                case 2:
                    setOvershootTension(0.0f);
                    setScreenSnapDuration(270);
                    break;
                case 3:
                    setOvershootTension(nq0z);
                    setScreenSnapDuration(300);
                    break;
                case 4:
                    setOvershootTension(0.0f);
                    setScreenSnapDuration(330);
                    break;
                case 5:
                    setOvershootTension(0.0f);
                    setScreenSnapDuration(330);
                    break;
                case 7:
                    setOvershootTension(0.0f);
                    setScreenSnapDuration(270);
                    break;
                case 8:
                    setOvershootTension(nq0z);
                    setScreenSnapDuration(330);
                    break;
            }
        }
    }

    public void setScrollWholeScreen(boolean wholeScreen) {
        this.bv = wholeScreen;
    }

    public void setScrollWholeScreenWithoutEmpty(boolean wholeScreenWithoutEmpty) {
        this.an = wholeScreenWithoutEmpty;
    }

    public void setSeekBarPosition(FrameLayout.LayoutParams params) {
        if (params == null) {
            SeekBarIndicator seekBarIndicator = this.f17809t;
            if (seekBarIndicator != null) {
                o1t(seekBarIndicator);
                this.f17809t = null;
                return;
            }
            return;
        }
        SeekBarIndicator seekBarIndicator2 = this.f17809t;
        if (seekBarIndicator2 != null) {
            seekBarIndicator2.setLayoutParams(params);
            return;
        }
        SeekBarIndicator seekBarIndicator3 = new SeekBarIndicator(getContext());
        this.f17809t = seekBarIndicator3;
        seekBarIndicator3.setGravity(16);
        this.f17809t.setAnimationCacheEnabled(false);
        m10507y(this.f17809t, params);
    }

    public void setSeekBarVisibility(int visibility) {
        SeekBarIndicator seekBarIndicator = this.f17809t;
        if (seekBarIndicator == null) {
            return;
        }
        seekBarIndicator.setVisibility(visibility);
    }

    public void setSeekPointResource(int seekPointResId) {
        this.f17797h = seekPointResId;
    }

    public void setShowAllVisibleIndicators(boolean showAll) {
        this.f17807r = showAll;
    }

    public void setSlideBarPosition(FrameLayout.LayoutParams params) {
        setSlideBarPosition(params, R.drawable.screen_view_slide_bar, R.drawable.screen_view_slide_bar_bg, false);
    }

    public void setSlideBarVisibility(int visibility) {
        C2961y c2961y = this.f17801l;
        if (c2961y == null) {
            return;
        }
        c2961y.setVisibility(visibility);
    }

    public void setTouchSlop(int slop) {
        this.ad = slop;
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        if (visibility == 0) {
            lvui();
        }
        super.setVisibility(visibility);
    }

    public void setVisibleExtentionRatio(float ratio) {
        this.in = ratio;
    }

    /* JADX INFO: renamed from: t */
    public void m10506t(int start, int count) {
        if (start < 0 || start >= getScreenCount()) {
            return;
        }
        int iMin = Math.min(count, getScreenCount() - start);
        SeekBarIndicator seekBarIndicator = this.f17809t;
        if (seekBarIndicator != null) {
            seekBarIndicator.removeViewsInLayout(start, iMin);
        }
        this.bl = 0;
        super.removeViewsInLayout(start, iMin);
    }

    protected void vyq(View child, float interpolation) {
    }

    public void wvg(int screenIndex) {
        if (screenIndex >= getScreenCount()) {
            throw new InvalidParameterException("The view specified by the index must be a screen.");
        }
        if (screenIndex == this.f17793d) {
            if (!this.bv) {
                setCurrentScreen(Math.max(0, screenIndex - 1));
            } else if (screenIndex != 0 && screenIndex == getScreenCount() - 1) {
                x9kr(screenIndex - 1);
            }
        }
        SeekBarIndicator seekBarIndicator = this.f17809t;
        if (seekBarIndicator != null) {
            seekBarIndicator.removeViewAt(screenIndex);
        }
        this.bl--;
        super.removeViewAt(screenIndex);
    }

    protected void x2() {
        this.bq = true;
        d2ok(null, 0);
    }

    public void x9kr(int whichScreen) {
        ncyb(whichScreen, 0, false);
    }

    /* JADX INFO: renamed from: y */
    protected void m10507y(View indicator, FrameLayout.LayoutParams params) {
        this.f17803n++;
        super.addView(indicator, -1, params);
    }

    /* JADX INFO: renamed from: z */
    public void m10508z() {
        m10506t(0, getScreenCount());
        requestLayout();
        invalidate();
    }

    public void setSlideBarPosition(FrameLayout.LayoutParams params, int slideDrawableId, int backgroundDrawableId, boolean isAutoHide) {
        this.f17795f = isAutoHide;
        RunnableC2956k runnableC2956k = null;
        if (params == null) {
            C2961y c2961y = this.f17801l;
            if (c2961y != null) {
                o1t(c2961y);
                this.f17801l = null;
                return;
            }
            return;
        }
        C2961y c2961y2 = this.f17801l;
        if (c2961y2 != null) {
            c2961y2.setLayoutParams(params);
            return;
        }
        C2961y c2961y3 = new C2961y(getContext(), slideDrawableId, backgroundDrawableId);
        this.f17801l = c2961y3;
        c2961y3.setOnTouchListener(new ViewOnTouchListenerC2960s(this, runnableC2956k));
        this.f17801l.setAnimationCacheEnabled(false);
        m10507y(this.f17801l, params);
    }

    /* JADX INFO: renamed from: com.android.thememanager.widget.ScreenView$q */
    private class C2959q {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final float f61581f7l8 = 3.0f;

        /* JADX INFO: renamed from: k */
        private VelocityTracker f17824k;

        /* JADX INFO: renamed from: n */
        private float f17825n;

        /* JADX INFO: renamed from: q */
        private float f17826q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f61582toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private float f61583zy;

        private C2959q() {
            this.f61582toq = -1;
            this.f61583zy = -1.0f;
            this.f17826q = -1.0f;
            this.f17825n = -1.0f;
        }

        /* JADX INFO: renamed from: g */
        private void m10513g() {
            this.f61582toq = -1;
            float f2 = -1;
            this.f61583zy = f2;
            this.f17826q = f2;
            this.f17825n = f2;
        }

        /* JADX INFO: renamed from: k */
        public void m10514k(MotionEvent ev) {
            if (this.f17824k == null) {
                this.f17824k = VelocityTracker.obtain();
            }
            this.f17824k.addMovement(ev);
            float x3 = ev.getX();
            int i2 = this.f61582toq;
            if (i2 != -1) {
                int iFindPointerIndex = ev.findPointerIndex(i2);
                if (iFindPointerIndex != -1) {
                    x3 = ev.getX(iFindPointerIndex);
                } else {
                    this.f61582toq = -1;
                }
            }
            float f2 = this.f61583zy;
            if (f2 < 0.0f) {
                this.f61583zy = x3;
                return;
            }
            float f3 = this.f17825n;
            if (f3 < 0.0f) {
                this.f17825n = x3;
                return;
            }
            float f4 = this.f17826q;
            if (f4 < 0.0f) {
                if (((f3 > f2 && x3 < f3) || (f3 < f2 && x3 > f3)) && Math.abs(x3 - f2) > f61581f7l8) {
                    this.f17826q = this.f17825n;
                }
            } else if (f4 != f3 && (((f3 > f4 && x3 < f3) || (f3 < f4 && x3 > f3)) && Math.abs(x3 - f4) > f61581f7l8)) {
                this.f61583zy = this.f17826q;
                this.f17826q = this.f17825n;
            }
            this.f17825n = x3;
        }

        /* JADX INFO: renamed from: n */
        public void m10515n() {
            VelocityTracker velocityTracker = this.f17824k;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f17824k = null;
            }
            m10513g();
        }

        /* JADX INFO: renamed from: q */
        public void m10516q(int pointerId) {
            VelocityTracker velocityTracker = this.f17824k;
            if (velocityTracker == null) {
                this.f17824k = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            m10513g();
            this.f61582toq = pointerId;
        }

        public int toq(float velocity) {
            if (velocity <= 300.0f) {
                return 4;
            }
            float f2 = this.f17826q;
            if (f2 < 0.0f) {
                return this.f17825n > this.f61583zy ? 1 : 2;
            }
            float f3 = this.f17825n;
            return f3 < f2 ? ScreenView.this.getScrollX() < ScreenView.this.getCurrentScreen().getLeft() ? 3 : 2 : (f3 <= f2 || ScreenView.this.getScrollX() > ScreenView.this.getCurrentScreen().getLeft()) ? 3 : 1;
        }

        public float zy(int units, int maxVelocity, int pointerId) {
            this.f17824k.computeCurrentVelocity(units, maxVelocity);
            return this.f17824k.getXVelocity(pointerId);
        }

        /* synthetic */ C2959q(ScreenView screenView, RunnableC2956k runnableC2956k) {
            this();
        }
    }

    public ScreenView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ScreenView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f17800k = Resources.getSystem().getDisplayMetrics().density * 1280.0f;
        this.f17806q = true;
        this.f17796g = R.drawable.screen_view_arrow_left;
        this.f17814y = R.drawable.screen_view_arrow_left_gray;
        this.f17808s = R.drawable.screen_view_arrow_right;
        this.f17805p = R.drawable.screen_view_arrow_right_gray;
        this.f17797h = R.drawable.screen_view_seek_point_selector;
        this.f17792c = new RunnableC2956k();
        this.f17790a = 1;
        this.f17810u = 0;
        this.f17812w = -1;
        this.bp = 0.33333334f;
        this.in = 0.0f;
        this.bl = 0;
        this.ba = 0;
        this.ac = true;
        this.ay = -1;
        this.bs = 0.5f;
        this.k0 = 300;
        this.bc = 0;
        this.bu = nq0z;
        this.tlhn = new C2959q(this, null);
        kja0();
    }
}
