package com.android.thememanager.view;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.util.bek6;
import miuix.animation.Folme;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.ViewProperty;
import miuix.smooth.SmoothFrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class PickerDragLayer extends DraggableFrameLayout {

    /* JADX INFO: renamed from: d */
    private static final String f17361d = "PickerDragLayer";

    /* JADX INFO: renamed from: a */
    private boolean f17362a;

    /* JADX INFO: renamed from: b */
    private int f17363b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private boolean f61496bo;

    /* JADX INFO: renamed from: c */
    private final int[] f17364c;

    /* JADX INFO: renamed from: e */
    private int f17365e;

    /* JADX INFO: renamed from: f */
    private InterfaceC2893k f17366f;

    /* JADX INFO: renamed from: j */
    private float f17367j;

    /* JADX INFO: renamed from: l */
    private C2946z f17368l;

    /* JADX INFO: renamed from: m */
    private MotionEvent f17369m;

    /* JADX INFO: renamed from: o */
    private float f17370o;

    /* JADX INFO: renamed from: r */
    private o1t f17371r;

    /* JADX INFO: renamed from: t */
    private final int[] f17372t;

    /* JADX INFO: renamed from: u */
    private SmoothFrameLayout f17373u;

    /* JADX INFO: renamed from: v */
    private boolean f17374v;

    /* JADX INFO: renamed from: x */
    private boolean f17375x;

    /* JADX INFO: renamed from: z */
    private final ImageView f17376z;

    /* JADX INFO: renamed from: com.android.thememanager.view.PickerDragLayer$k */
    public interface InterfaceC2893k {
        /* JADX INFO: renamed from: k */
        void m10277k();

        void toq(o1t dragEvent);
    }

    public PickerDragLayer(@zy.lvui Context context, @zy.dd AttributeSet attrs) {
        super(context, attrs);
        this.f17363b = -1;
        this.f17375x = false;
        this.f61496bo = false;
        this.f17376z = new ImageView(context);
        this.f17372t = new int[2];
        this.f17364c = new int[2];
    }

    /* JADX INFO: renamed from: g */
    private void m10272g(MotionEvent ev) {
        if (this.f17362a) {
            float rawX = ev.getRawX() - this.f17367j;
            float rawY = ev.getRawY() - this.f17370o;
            ImageView imageView = this.f17376z;
            imageView.setTranslationX(imageView.getTranslationX() + rawX);
            ImageView imageView2 = this.f17376z;
            imageView2.setTranslationY(imageView2.getTranslationY() + rawY);
            this.f17376z.getLocationInWindow(this.f17364c);
            o1t o1tVar = this.f17371r;
            int[] iArr = this.f17364c;
            o1tVar.f61532toq = iArr[0];
            o1tVar.f61533zy = iArr[1];
            o1tVar.f17659q = ev;
            this.f17368l.toq(this.f17365e, o1tVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ld6(View view) {
        x2(view);
        this.f17362a = true;
    }

    /* JADX INFO: renamed from: p */
    private boolean m10274p() {
        return this.f17371r == null && zy();
    }

    private void x2(View targetView) {
        getLocationInWindow(this.f17372t);
        this.f17376z.setTranslationX((this.f17364c[0] - this.f17372t[0]) - r4.getLeft());
        this.f17376z.setTranslationY(this.f17364c[1] - this.f17372t[1]);
    }

    @Override // com.android.thememanager.view.DraggableFrameLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@zy.lvui MotionEvent ev) {
        if (this.f17374v || m10274p()) {
            return true;
        }
        boolean z2 = ev.getAction() == 0;
        if (z2) {
            this.f17375x = this.f17371r == null && getChildCount() > 0 && !bek6.m9619y(getChildAt(0), ev);
        }
        if (this.f17375x) {
            return true;
        }
        boolean z3 = this.f17371r != null || super.dispatchTouchEvent(ev);
        if (!this.f17375x) {
            this.f17260y = true;
        }
        if (ev.getAction() == 0) {
            this.f17367j = ev.getRawX();
            this.f17370o = ev.getRawY();
            this.f17369m = ev;
        }
        if (this.f17371r != null) {
            int action = ev.getAction() & 255;
            if (action == 1) {
                o1t o1tVar = this.f17371r;
                o1tVar.f17659q = ev;
                InterfaceC2893k interfaceC2893k = this.f17366f;
                if (interfaceC2893k != null) {
                    interfaceC2893k.toq(o1tVar);
                }
            } else if (action != 2) {
                if (action == 5) {
                    this.f17363b = ev.getPointerId(ev.getActionIndex());
                    this.f17368l.m10456n(ev);
                } else if (action == 6) {
                    this.f17363b = -1;
                    this.f17368l.m10456n(ev);
                }
            } else if (ev.findPointerIndex(this.f17363b) == 1) {
                this.f17368l.m10456n(ev);
            } else {
                m10272g(ev);
                this.f17367j = ev.getRawX();
                this.f17370o = ev.getRawY();
            }
            z3 = true;
        }
        if (!z2 || z3) {
            return z3;
        }
        return true;
    }

    public void n7h(final View dragView, Drawable drawable, int dragTo) {
        View view = dragView;
        while (view.getScaleX() == 1.0f && view.getParent() != null) {
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            } else {
                view = (View) parent;
            }
        }
        Folme.clean(view);
        Folme.useAt(view).state().setup("dragReset").add((FloatProperty) ViewProperty.SCALE_Y, 1.0f).add((FloatProperty) ViewProperty.SCALE_X, 1.0f).setTo("dragReset");
        dragView.getLocationInWindow(this.f17364c);
        o1t o1tVar = new o1t();
        this.f17371r = o1tVar;
        o1tVar.f17660y = 0;
        o1tVar.f17657k = dragView;
        o1tVar.f17658n = drawable;
        int[] iArr = this.f17364c;
        o1tVar.f17656g = iArr[0];
        o1tVar.f61531f7l8 = iArr[1];
        if (this.f17376z.getParent() == null) {
            addView(this.f17376z, new FrameLayout.LayoutParams(dragView.getWidth(), dragView.getHeight()));
        }
        o1t o1tVar2 = this.f17371r;
        o1tVar2.f17659q = this.f17369m;
        this.f17368l.m10457q(o1tVar2, dragTo);
        this.f17365e = dragTo;
        this.f17366f.m10277k();
        post(new Runnable() { // from class: com.android.thememanager.view.wvg
            @Override // java.lang.Runnable
            public final void run() {
                this.f17717k.ld6(dragView);
            }
        });
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.f61496bo = true;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f17373u = (SmoothFrameLayout) findViewById(R.id.smooth_container);
    }

    @Override // com.android.thememanager.view.DraggableFrameLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        float rawX = ev.getRawX() - this.f17367j;
        float rawY = ev.getRawY() - this.f17370o;
        boolean z2 = (this.f17371r == null) && super.m10235q(ev) && ((Math.abs(rawY) > ((float) ViewConfiguration.get(getContext()).getScaledTouchSlop()) ? 1 : (Math.abs(rawY) == ((float) ViewConfiguration.get(getContext()).getScaledTouchSlop()) ? 0 : -1)) > 0 && (Math.abs(rawX) > Math.abs(rawY) ? 1 : (Math.abs(rawX) == Math.abs(rawY) ? 0 : -1)) < 0 && (rawY > 0.0f ? 1 : (rawY == 0.0f ? 0 : -1)) > 0);
        this.f17257p = z2;
        return z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        SmoothFrameLayout smoothFrameLayout = this.f17373u;
        int top2 = (smoothFrameLayout == null || this.f61496bo) ? 0 : smoothFrameLayout.getTop();
        super.onLayout(changed, left, top, right, bottom);
        SmoothFrameLayout smoothFrameLayout2 = this.f17373u;
        if (smoothFrameLayout2 != null) {
            int top3 = top2 != 0 ? top2 - smoothFrameLayout2.getTop() : 0;
            if (top3 != 0) {
                this.f17373u.offsetTopAndBottom(top3);
            }
        }
        this.f61496bo = false;
    }

    /* JADX INFO: renamed from: s */
    public void m10275s() {
        this.f17362a = false;
        o1t o1tVar = this.f17371r;
        if (o1tVar != null) {
            this.f17368l.zy(this.f17365e, o1tVar);
            this.f17371r = null;
            this.f17374v = false;
            removeView(this.f17376z);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m10276y() {
        this.f17362a = false;
        this.f17374v = false;
        this.f17371r = null;
        if (this.f17376z.getParent() == this) {
            removeView(this.f17376z);
        }
    }
}
