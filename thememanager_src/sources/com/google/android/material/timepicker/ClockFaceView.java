package com.google.android.material.timepicker;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import androidx.core.view.accessibility.ki;
import com.google.android.material.timepicker.ClockHandView;
import ij.C6095k;
import java.util.Arrays;
import p023g.C6045k;
import zy.dd;
import zy.lvui;
import zy.nn86;
import zy.zurt;

/* JADX INFO: loaded from: classes2.dex */
class ClockFaceView extends C4177q implements ClockHandView.InterfaceC4166q {
    private static final float bd = 0.001f;
    private static final int tlhn = 12;
    private static final String w97r = "";
    private final SparseArray<TextView> ac;
    private final C0701k ad;
    private final int aj;
    private final int[] am;
    private String[] ar;
    private final Rect ax;
    private final float[] ay;
    private final ClockHandView ba;
    private float bc;
    private final int be;
    private final RectF bq;
    private final int bs;
    private final ColorStateList bu;
    private final int k0;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockFaceView$k */
    class ViewTreeObserverOnPreDrawListenerC4164k implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC4164k() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.mo15106o(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.ba.f7l8()) - ClockFaceView.this.be);
            return true;
        }
    }

    class toq extends C0701k {
        toq() {
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, @lvui ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            int iIntValue = ((Integer) view.getTag(C6095k.y.f80021lk)).intValue();
            if (iIntValue > 0) {
                kiVar.oki((View) ClockFaceView.this.ac.get(iIntValue - 1));
            }
            kiVar.z4(ki.zy.m3073y(0, 1, iIntValue, 1, false, view.isSelected()));
            kiVar.cfr(true);
            kiVar.toq(ki.C0656k.f3942p);
        }

        @Override // androidx.core.view.C0701k
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            if (i2 != 16) {
                return super.performAccessibilityAction(view, i2, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            float x3 = view.getX() + (view.getWidth() / 2.0f);
            float height = (view.getHeight() / 2.0f) + view.getY();
            ClockFaceView.this.ba.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, x3, height, 0));
            ClockFaceView.this.ba.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, x3, height, 0));
            return true;
        }
    }

    public ClockFaceView(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    private static float m15103a(float f2, float f3, float f4) {
        return Math.max(Math.max(f2, f3), f4);
    }

    @dd
    private RadialGradient a98o(RectF rectF, Rect rect, TextView textView) {
        this.bq.set(rect);
        this.bq.offset(textView.getPaddingLeft(), textView.getPaddingTop());
        if (RectF.intersects(rectF, this.bq)) {
            return new RadialGradient(rectF.centerX() - this.bq.left, rectF.centerY() - this.bq.top, rectF.width() * 0.5f, this.am, this.ay, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private void i1() {
        RectF rectFM15113q = this.ba.m15113q();
        for (int i2 = 0; i2 < this.ac.size(); i2++) {
            TextView textView = this.ac.get(i2);
            if (textView != null) {
                textView.getDrawingRect(this.ax);
                offsetDescendantRectToMyCoords(textView, this.ax);
                textView.setSelected(rectFM15113q.contains(this.ax.centerX(), this.ax.centerY()));
                textView.getPaint().setShader(a98o(rectFM15113q, this.ax, textView));
                textView.invalidate();
            }
        }
    }

    private void zp(@nn86 int i2) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.ac.size();
        for (int i3 = 0; i3 < Math.max(this.ar.length, size); i3++) {
            TextView textView = this.ac.get(i3);
            if (i3 >= this.ar.length) {
                removeView(textView);
                this.ac.remove(i3);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(C6095k.ld6.f79306hb, (ViewGroup) this, false);
                    this.ac.put(i3, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.ar[i3]);
                textView.setTag(C6095k.y.f80021lk, Integer.valueOf(i3));
                C0683f.zwy(textView, this.ad);
                textView.setTextColor(this.bu);
                if (i2 != 0) {
                    textView.setContentDescription(getResources().getString(i2, this.ar[i3]));
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m15105g(String[] strArr, @nn86 int i2) {
        this.ar = strArr;
        zp(i2);
    }

    @Override // com.google.android.material.timepicker.C4177q
    /* JADX INFO: renamed from: o */
    public void mo15106o(int i2) {
        if (i2 != m15138j()) {
            super.mo15106o(i2);
            this.ba.ld6(m15138j());
        }
    }

    public void o1t(@zurt(from = 0.0d, to = 360.0d) float f2) {
        this.ba.x2(f2);
        i1();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@lvui AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ki.r25n(accessibilityNodeInfo).w831(ki.toq.m3069g(1, this.ar.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        i1();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iM15103a = (int) (this.k0 / m15103a(this.aj / displayMetrics.heightPixels, this.bs / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iM15103a, 1073741824);
        setMeasuredDimension(iM15103a, iM15103a);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC4166q
    public void zurt(float f2, boolean z2) {
        if (Math.abs(this.bc - f2) > bd) {
            this.bc = f2;
            i1();
        }
    }

    public ClockFaceView(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.jhn);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.ax = new Rect();
        this.bq = new RectF();
        this.ac = new SparseArray<>();
        this.ay = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6095k.kja0.p1t5, i2, C6095k.n7h.klnv);
        Resources resources = getResources();
        ColorStateList colorStateListM14753k = com.google.android.material.resources.zy.m14753k(context, typedArrayObtainStyledAttributes, C6095k.kja0.cun);
        this.bu = colorStateListM14753k;
        LayoutInflater.from(context).inflate(C6095k.ld6.f35604j, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C6095k.y.f80006kbj);
        this.ba = clockHandView;
        this.be = resources.getDimensionPixelSize(C6095k.g.c2);
        int colorForState = colorStateListM14753k.getColorForState(new int[]{R.attr.state_selected}, colorStateListM14753k.getDefaultColor());
        this.am = new int[]{colorForState, colorForState, colorStateListM14753k.getDefaultColor()};
        clockHandView.toq(this);
        int defaultColor = C6045k.m22274k(context, C6095k.n.w0qe).getDefaultColor();
        ColorStateList colorStateListM14753k2 = com.google.android.material.resources.zy.m14753k(context, typedArrayObtainStyledAttributes, C6095k.kja0.t57j);
        setBackgroundColor(colorStateListM14753k2 != null ? colorStateListM14753k2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC4164k());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.ad = new toq();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        m15105g(strArr, 0);
        this.aj = resources.getDimensionPixelSize(C6095k.g.k2b8);
        this.bs = resources.getDimensionPixelSize(C6095k.g.g41);
        this.k0 = resources.getDimensionPixelSize(C6095k.g.py7);
    }
}
