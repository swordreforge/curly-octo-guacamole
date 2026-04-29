package miuix.popupwidget.internal.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import c25.toq;
import miuix.popupwidget.widget.f7l8;

/* JADX INFO: loaded from: classes3.dex */
public class GuidePopupView extends FrameLayout implements View.OnTouchListener {
    public static final int an = 2;
    public static final int as = 6;
    public static final int bb = -1;
    public static final int bg = 7;
    public static final int bl = 5;
    public static final int bp = 0;
    public static final int bv = 1;
    public static final int id = 3;
    public static final int in = 4;

    /* JADX INFO: renamed from: a */
    private int f41016a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private int f88011ab;

    /* JADX INFO: renamed from: b */
    private float f41017b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private final Paint f88012bo;

    /* JADX INFO: renamed from: c */
    private int f41018c;

    /* JADX INFO: renamed from: d */
    private Animator.AnimatorListener f41019d;

    /* JADX INFO: renamed from: e */
    private int f41020e;

    /* JADX INFO: renamed from: f */
    private int f41021f;

    /* JADX INFO: renamed from: g */
    private LinearLayout f41022g;

    /* JADX INFO: renamed from: h */
    private int f41023h;

    /* JADX INFO: renamed from: i */
    private f7l8 f41024i;

    /* JADX INFO: renamed from: j */
    private int f41025j;

    /* JADX INFO: renamed from: k */
    private Context f41026k;

    /* JADX INFO: renamed from: l */
    private int f41027l;

    /* JADX INFO: renamed from: m */
    private float f41028m;

    /* JADX INFO: renamed from: n */
    private LinearLayout f41029n;

    /* JADX INFO: renamed from: o */
    private float f41030o;

    /* JADX INFO: renamed from: p */
    private boolean f41031p;

    /* JADX INFO: renamed from: q */
    private View f41032q;

    /* JADX INFO: renamed from: r */
    private boolean f41033r;

    /* JADX INFO: renamed from: s */
    private int f41034s;

    /* JADX INFO: renamed from: t */
    private ObjectAnimator f41035t;

    /* JADX INFO: renamed from: u */
    private ColorStateList f41036u;

    /* JADX INFO: renamed from: v */
    private boolean f41037v;

    /* JADX INFO: renamed from: w */
    private Animator.AnimatorListener f41038w;

    /* JADX INFO: renamed from: x */
    private int f41039x;

    /* JADX INFO: renamed from: y */
    private int f41040y;

    /* JADX INFO: renamed from: z */
    private View.OnTouchListener f41041z;

    /* JADX INFO: renamed from: miuix.popupwidget.internal.widget.GuidePopupView$k */
    class C7259k extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        private boolean f41042k;

        C7259k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f41042k = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f41042k) {
                return;
            }
            GuidePopupView.this.f41035t = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f41042k = false;
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.internal.widget.GuidePopupView$q */
    class ViewOnClickListenerC7260q implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        public View.OnClickListener f41044k;

        ViewOnClickListenerC7260q() {
        }

        /* JADX INFO: renamed from: k */
        public void m26406k(View.OnClickListener onClickListener) {
            this.f41044k = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            View.OnClickListener onClickListener = this.f41044k;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            GuidePopupView.this.f41024i.m26416k(true);
        }
    }

    class toq extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        private boolean f41046k;

        toq() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f41046k = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f41046k) {
                return;
            }
            GuidePopupView.this.f41033r = false;
            GuidePopupView.this.f41035t = null;
            GuidePopupView.this.f41024i.dismiss();
            GuidePopupView.this.setArrowMode(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f41046k = false;
            GuidePopupView.this.f41033r = true;
        }
    }

    class zy implements ViewTreeObserver.OnPreDrawListener {
        zy() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            GuidePopupView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            if (GuidePopupView.this.f41035t != null) {
                GuidePopupView.this.f41035t.cancel();
            }
            GuidePopupView guidePopupView = GuidePopupView.this;
            guidePopupView.f41035t = ObjectAnimator.ofFloat(guidePopupView, (Property<GuidePopupView, Float>) View.ALPHA, 1.0f);
            GuidePopupView.this.f41035t.setDuration(300L);
            GuidePopupView.this.f41035t.addListener(GuidePopupView.this.f41019d);
            GuidePopupView.this.f41035t.start();
            return true;
        }
    }

    public GuidePopupView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f7l8() {
        /*
            r14 = this;
            int r0 = r14.getWidth()
            int r1 = r14.getHeight()
            r2 = 4
            int[] r3 = new int[r2]
            int r4 = r14.f41018c
            r5 = 0
            r3[r5] = r4
            int r6 = r1 - r4
            int r7 = r14.f41025j
            int r6 = r6 - r7
            r8 = 1
            r3[r8] = r6
            int r6 = r14.f41021f
            r9 = 2
            r3[r9] = r6
            int r10 = r0 - r6
            int r11 = r14.f41020e
            int r10 = r10 - r11
            r12 = 3
            r3[r12] = r10
            int r11 = r11 / r9
            int r6 = r6 + r11
            int r7 = r7 / r9
            int r4 = r4 + r7
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r7
            r7 = r5
        L2d:
            if (r5 >= r2) goto L3d
            r11 = r3[r5]
            int r13 = r14.f41027l
            if (r11 < r13) goto L36
            goto L3e
        L36:
            if (r11 <= r10) goto L3a
            r7 = r5
            r10 = r11
        L3a:
            int r5 = r5 + 1
            goto L2d
        L3d:
            r5 = r7
        L3e:
            r3 = 5
            r7 = 6
            r10 = 7
            if (r5 == 0) goto L78
            if (r5 == r8) goto L69
            if (r5 == r9) goto L59
            if (r5 == r12) goto L4a
            goto L89
        L4a:
            float r0 = (float) r4
            float r3 = r14.f41017b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L52
            goto L8a
        L52:
            int r1 = r1 - r4
            float r0 = (float) r1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L89
            goto L7f
        L59:
            float r0 = (float) r4
            float r2 = r14.f41017b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L62
        L60:
            r2 = r7
            goto L8a
        L62:
            int r1 = r1 - r4
            float r0 = (float) r1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L89
            goto L87
        L69:
            float r1 = (float) r6
            float r3 = r14.f41017b
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L71
            goto L8a
        L71:
            int r0 = r0 - r6
            float r0 = (float) r0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L89
            goto L60
        L78:
            float r1 = (float) r6
            float r2 = r14.f41017b
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L81
        L7f:
            r2 = r10
            goto L8a
        L81:
            int r0 = r0 - r6
            float r0 = (float) r0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L89
        L87:
            r2 = r3
            goto L8a
        L89:
            r2 = r5
        L8a:
            r14.setArrowMode(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.popupwidget.internal.widget.GuidePopupView.f7l8():void");
    }

    private int getMirroredMode() {
        int i2 = this.f88011ab;
        if (i2 == -1) {
            return -1;
        }
        return i2 % 2 == 0 ? i2 + 1 : i2 - 1;
    }

    private void ld6() {
        if (!this.f41031p) {
            this.f41023h = 0;
            return;
        }
        int i2 = this.f41020e / 2;
        int i3 = this.f41025j / 2;
        int iSqrt = (int) Math.sqrt(Math.pow(i2, 2.0d) + Math.pow(i3, 2.0d));
        int i4 = this.f88011ab;
        if (i4 == 0 || i4 == 1) {
            this.f41023h = i3;
        } else if (i4 == 2 || i4 == 3) {
            this.f41023h = i2;
        } else {
            this.f41023h = iSqrt;
        }
    }

    private void n7h(int i2, LinearLayout linearLayout, int i3, int i4) {
        float f2;
        int measuredHeight;
        int i5;
        int measuredHeight2;
        float f3 = this.f41023h + this.f41028m + this.f41017b;
        int i6 = this.f41021f + (this.f41020e / 2);
        int i7 = this.f41018c + (this.f41025j / 2);
        int measuredWidth = 0;
        switch (i2) {
            case 0:
            case 5:
            case 7:
                measuredWidth = i6 - (linearLayout.getMeasuredWidth() / 2);
                f2 = i7 - f3;
                measuredHeight = linearLayout.getMeasuredHeight() / 2;
                i5 = (int) (f2 - measuredHeight);
                break;
            case 1:
            case 4:
            case 6:
                measuredWidth = i6 - (linearLayout.getMeasuredWidth() / 2);
                f2 = i7 + f3;
                measuredHeight = linearLayout.getMeasuredHeight() / 2;
                i5 = (int) (f2 - measuredHeight);
                break;
            case 2:
                measuredWidth = (int) ((i6 - f3) - (linearLayout.getMeasuredWidth() / 2));
                measuredHeight2 = linearLayout.getMeasuredHeight() / 2;
                i5 = i7 - measuredHeight2;
                break;
            case 3:
                measuredWidth = (int) ((i6 + f3) - (linearLayout.getMeasuredWidth() / 2));
                measuredHeight2 = linearLayout.getMeasuredHeight() / 2;
                i5 = i7 - measuredHeight2;
                break;
            default:
                i5 = 0;
                break;
        }
        int iSin = (int) (((double) f3) * Math.sin(0.7853981633974483d));
        int i8 = (int) (f3 - iSin);
        if (i2 != 4) {
            if (i2 == 5) {
                measuredWidth -= iSin;
            } else {
                if (i2 != 6) {
                    if (i2 == 7) {
                        measuredWidth += iSin;
                    }
                    int i9 = measuredWidth + i3;
                    int i10 = i5 + i4;
                    linearLayout.layout(i9, i10, linearLayout.getMeasuredWidth() + i9, linearLayout.getMeasuredHeight() + i10);
                }
                measuredWidth -= iSin;
            }
            i5 += i8;
            int i92 = measuredWidth + i3;
            int i102 = i5 + i4;
            linearLayout.layout(i92, i102, linearLayout.getMeasuredWidth() + i92, linearLayout.getMeasuredHeight() + i102);
        }
        measuredWidth += iSin;
        i5 -= i8;
        int i922 = measuredWidth + i3;
        int i1022 = i5 + i4;
        linearLayout.layout(i922, i1022, linearLayout.getMeasuredWidth() + i922, linearLayout.getMeasuredHeight() + i1022);
    }

    /* JADX INFO: renamed from: p */
    private void m26401p() {
        ld6();
        n7h(this.f88011ab, this.f41029n, this.f41040y, this.f41034s);
        if (this.f41037v) {
            n7h(getMirroredMode(), this.f41022g, -this.f41040y, -this.f41034s);
        }
    }

    private void qrj(Canvas canvas, int i2, int i3, int i4) {
        float f2;
        this.f88012bo.setAntiAlias(true);
        this.f88012bo.setStyle(Paint.Style.FILL);
        float f3 = this.f41021f + (this.f41020e / 2) + i3;
        float f4 = this.f41018c + (this.f41025j / 2) + i4;
        switch (i2) {
            case 0:
                f2 = 180.0f;
                break;
            case 1:
            default:
                f2 = 0.0f;
                break;
            case 2:
                f2 = 90.0f;
                break;
            case 3:
                f2 = -90.0f;
                break;
            case 4:
                f2 = -45.0f;
                break;
            case 5:
                f2 = 135.0f;
                break;
            case 6:
                f2 = 45.0f;
                break;
            case 7:
                f2 = -135.0f;
                break;
        }
        canvas.save();
        canvas.rotate(f2, f3, f4);
        canvas.translate(0.0f, this.f41023h);
        int iSave = canvas.save();
        canvas.clipRect(f3 - 2.0f, f4, f3 + 2.0f, f4 + this.f41030o, Region.Op.DIFFERENCE);
        canvas.drawCircle(f3, f4, this.f41030o, this.f88012bo);
        canvas.restoreToCount(iSave);
        this.f88012bo.setStyle(Paint.Style.STROKE);
        this.f88012bo.setStrokeWidth(4.0f);
        canvas.drawLine(f3, f4, f3, f4 + this.f41028m, this.f88012bo);
        float f5 = f4 + this.f41028m + this.f41017b;
        this.f88012bo.setStyle(Paint.Style.STROKE);
        this.f88012bo.setStrokeWidth(4.0f);
        canvas.drawCircle(f3, f5, this.f41017b, this.f88012bo);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.save();
        canvas.translate(this.f41021f, this.f41018c);
        this.f41032q.setDrawingCacheEnabled(true);
        this.f41032q.buildDrawingCache();
        canvas.drawBitmap(this.f41032q.getDrawingCache(), 0.0f, 0.0f, (Paint) null);
        this.f41032q.setDrawingCacheEnabled(false);
        canvas.restore();
        qrj(canvas, this.f88011ab, this.f41040y, this.f41034s);
        if (this.f41037v) {
            qrj(canvas, getMirroredMode(), -this.f41040y, -this.f41034s);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m26403g(LinearLayout linearLayout, String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str) || (strArrSplit = str.split("\n")) == null || strArrSplit.length == 0) {
            return;
        }
        for (String str2 : strArrSplit) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) View.inflate(this.f41026k, toq.x2.f55348jp0y, null);
            appCompatTextView.setText(str2);
            appCompatTextView.setTextSize(0, this.f41039x);
            ColorStateList colorStateList = this.f41036u;
            if (colorStateList != null) {
                appCompatTextView.setTextColor(colorStateList);
            }
            linearLayout.addView(appCompatTextView);
        }
    }

    public int getArrowMode() {
        return this.f88011ab;
    }

    public int getColorBackground() {
        return this.f41016a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f41029n = (LinearLayout) findViewById(toq.C1390s.f55289ra);
        this.f41022g = (LinearLayout) findViewById(toq.C1390s.f55312wo);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (this.f41020e == 0 || this.f41025j == 0) {
            setAnchor(this.f41032q);
        }
        this.f41017b = (float) Math.max(Math.sqrt(Math.pow(this.f41029n.getMeasuredWidth(), 2.0d) + Math.pow(this.f41029n.getMeasuredHeight(), 2.0d)) / 2.0d, this.f41017b);
        if (this.f41037v) {
            this.f41017b = (float) Math.max(Math.sqrt(Math.pow(this.f41022g.getMeasuredWidth(), 2.0d) + Math.pow(this.f41022g.getMeasuredHeight(), 2.0d)) / 2.0d, this.f41017b);
        }
        if (this.f88011ab == -1) {
            f7l8();
        } else {
            m26401p();
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int i2 = this.f41021f;
        Rect rect = new Rect(i2, this.f41018c, this.f41032q.getWidth() + i2, this.f41018c + this.f41032q.getHeight());
        if (motionEvent.getAction() == 0 && rect.contains(x3, y3)) {
            this.f41032q.callOnClick();
            return true;
        }
        this.f41024i.m26416k(true);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public void m26404s() {
        setAlpha(0.0f);
        invalidate();
        getViewTreeObserver().addOnPreDrawListener(new zy());
    }

    public void setAnchor(View view) {
        this.f41032q = view;
        this.f41020e = view.getWidth();
        this.f41025j = this.f41032q.getHeight();
        int[] iArr = new int[2];
        this.f41032q.getLocationInWindow(iArr);
        this.f41021f = iArr[0];
        this.f41018c = iArr[1];
    }

    public void setArrowMode(int i2) {
        this.f88011ab = i2;
    }

    public void setGuidePopupWindow(f7l8 f7l8Var) {
        this.f41024i = f7l8Var;
    }

    public void setOffset(int i2, int i3) {
        this.f41040y = i2;
        this.f41034s = i3;
        this.f41031p = false;
    }

    public void setTouchInterceptor(View.OnTouchListener onTouchListener) {
        this.f41041z = onTouchListener;
    }

    public void x2() {
        setOffset(0, 0);
        this.f41031p = true;
    }

    /* JADX INFO: renamed from: y */
    public void m26405y() {
        if (this.f41033r) {
            return;
        }
        ObjectAnimator objectAnimator = this.f41035t;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<GuidePopupView, Float>) View.ALPHA, 0.0f);
        this.f41035t = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        this.f41035t.addListener(this.f41038w);
        this.f41035t.start();
    }

    public GuidePopupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, toq.zy.f55450kiv);
    }

    public void setArrowMode(int i2, boolean z2) {
        setArrowMode(i2);
        this.f41037v = z2;
        if (z2) {
            this.f41022g.setVisibility(0);
        } else {
            this.f41022g.setVisibility(8);
        }
    }

    public GuidePopupView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f41031p = true;
        this.f41036u = null;
        Paint paint = new Paint();
        this.f88012bo = paint;
        this.f41019d = new C7259k();
        this.f41038w = new toq();
        this.f88011ab = -1;
        this.f41026k = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.kja0.gg7, i2, toq.n7h.wtm);
        this.f41030o = typedArrayObtainStyledAttributes.getDimension(toq.kja0.jp, 0.0f);
        this.f41028m = typedArrayObtainStyledAttributes.getDimension(toq.kja0.ym, 0.0f);
        this.f41017b = typedArrayObtainStyledAttributes.getDimension(toq.kja0.b972, 0.0f);
        this.f41016a = typedArrayObtainStyledAttributes.getColor(toq.kja0.ff8y, 0);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(toq.kja0.qyk, -1));
        this.f41039x = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.kja0.te, 15);
        this.f41036u = typedArrayObtainStyledAttributes.getColorStateList(toq.kja0.t8o);
        typedArrayObtainStyledAttributes.recycle();
        this.f41027l = (int) (this.f41028m + (this.f41017b * 2.5f));
    }
}
