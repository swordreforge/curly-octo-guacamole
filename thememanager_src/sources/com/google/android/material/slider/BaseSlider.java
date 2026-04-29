package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.core.view.C0683f;
import androidx.core.view.accessibility.ki;
import androidx.customview.widget.AbstractC0778k;
import com.google.android.material.animation.C3910k;
import com.google.android.material.internal.C4052q;
import com.google.android.material.internal.C4058z;
import com.google.android.material.internal.cdj;
import com.google.android.material.internal.fu4;
import com.google.android.material.shape.C4108p;
import com.google.android.material.shape.kja0;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.InterfaceC4120k;
import com.google.android.material.slider.toq;
import com.google.android.material.tooltip.C4182k;
import h4b.C6070k;
import ij.C6095k;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ki.C6116k;
import n2t.C7398k;
import p023g.C6045k;
import zy.InterfaceC7829h;
import zy.a9;
import zy.dd;
import zy.fn3e;
import zy.lvui;
import zy.n7h;
import zy.x2;
import zy.yz;

/* JADX INFO: loaded from: classes2.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends InterfaceC4120k<S>, T extends com.google.android.material.slider.toq<S>> extends View {
    private static final String dy = "minSeparation(%s) must be greater or equal to 0";
    private static final double hp = 1.0E-4d;
    private static final String k6e = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";
    private static final int mjvl = 63;
    private static final long ndjo = 117;
    private static final long q7k9 = 83;
    private static final int s8y = 200;
    private static final String sk1t = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final String tgs = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    static final int th6 = 0;
    private static final String vb6 = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";
    private static final String w97r = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final String xk5 = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
    static final int xy8 = 1;
    private static final String yl25 = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final String zmmu = "valueTo(%s) must be greater than valueFrom(%s)";

    /* JADX INFO: renamed from: a */
    private int f25015a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private float f67863ab;
    private boolean ac;
    private boolean ad;

    @lvui
    private ColorStateList aj;

    @lvui
    private ColorStateList am;
    private float an;

    @dd
    private Drawable ar;
    private int as;
    private int ax;

    @lvui
    private ColorStateList ay;
    private float[] az;

    /* JADX INFO: renamed from: b */
    private int f25016b;
    private boolean ba;
    private MotionEvent bb;

    @lvui
    private List<Drawable> bc;
    private int bd;

    @lvui
    private ColorStateList be;
    private float bg;
    private int bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private int f67864bo;
    private InterfaceC4121q bp;
    private boolean bq;

    @lvui
    private ColorStateList bs;
    private float bu;
    private boolean bv;

    /* JADX INFO: renamed from: c */
    private ValueAnimator f25017c;

    /* JADX INFO: renamed from: d */
    private int f25018d;

    /* JADX INFO: renamed from: e */
    private ValueAnimator f25019e;

    /* JADX INFO: renamed from: f */
    private boolean f25020f;

    /* JADX INFO: renamed from: g */
    @lvui
    private final Paint f25021g;

    /* JADX INFO: renamed from: h */
    private final AccessibilityManager f25022h;

    /* JADX INFO: renamed from: i */
    private BaseSlider<S, L, T>.RunnableC4116q f25023i;
    private float id;
    private ArrayList<Float> in;

    /* JADX INFO: renamed from: j */
    private final int f25024j;

    /* JADX INFO: renamed from: k */
    @lvui
    private final Paint f25025k;

    @lvui
    private final C4108p k0;

    /* JADX INFO: renamed from: l */
    @lvui
    private final List<T> f25026l;

    /* JADX INFO: renamed from: m */
    private int f25027m;

    /* JADX INFO: renamed from: n */
    @lvui
    private final Paint f25028n;

    /* JADX INFO: renamed from: o */
    private int f25029o;

    /* JADX INFO: renamed from: p */
    @lvui
    private final C4115n f25030p;

    /* JADX INFO: renamed from: q */
    @lvui
    private final Paint f25031q;

    /* JADX INFO: renamed from: r */
    @lvui
    private final List<L> f25032r;

    /* JADX INFO: renamed from: s */
    @lvui
    private final Paint f25033s;

    /* JADX INFO: renamed from: t */
    @lvui
    private final List<C4182k> f25034t;

    /* JADX INFO: renamed from: u */
    private int f25035u;

    /* JADX INFO: renamed from: v */
    private int f25036v;

    /* JADX INFO: renamed from: w */
    private int f25037w;

    /* JADX INFO: renamed from: x */
    private int f25038x;

    /* JADX INFO: renamed from: y */
    @lvui
    private final Paint f25039y;

    /* JADX INFO: renamed from: z */
    @lvui
    private final InterfaceC4113g f25040z;
    private static final String tlhn = BaseSlider.class.getSimpleName();
    static final int cw14 = C6095k.n7h.rz;

    static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new Parcelable.Creator<SliderState>() { // from class: com.google.android.material.slider.BaseSlider.SliderState.1
            @Override // android.os.Parcelable.Creator
            @lvui
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SliderState createFromParcel(@lvui Parcel parcel) {
                return new SliderState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @lvui
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SliderState[] newArray(int i2) {
                return new SliderState[i2];
            }
        };

        /* JADX INFO: renamed from: g */
        float f25041g;

        /* JADX INFO: renamed from: k */
        float f25042k;

        /* JADX INFO: renamed from: n */
        ArrayList<Float> f25043n;

        /* JADX INFO: renamed from: q */
        float f25044q;

        /* JADX INFO: renamed from: y */
        boolean f25045y;

        /* synthetic */ SliderState(Parcel parcel, C4114k c4114k) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@lvui Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeFloat(this.f25042k);
            parcel.writeFloat(this.f25044q);
            parcel.writeList(this.f25043n);
            parcel.writeFloat(this.f25041g);
            parcel.writeBooleanArray(new boolean[]{this.f25045y});
        }

        SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(@lvui Parcel parcel) {
            super(parcel);
            this.f25042k = parcel.readFloat();
            this.f25044q = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f25043n = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f25041g = parcel.readFloat();
            this.f25045y = parcel.createBooleanArray()[0];
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.slider.BaseSlider$g */
    private interface InterfaceC4113g {
        /* JADX INFO: renamed from: k */
        C4182k mo14898k();
    }

    /* JADX INFO: renamed from: com.google.android.material.slider.BaseSlider$k */
    class C4114k implements InterfaceC4113g {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ AttributeSet f25046k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ int f67865toq;

        C4114k(AttributeSet attributeSet, int i2) {
            this.f25046k = attributeSet;
            this.f67865toq = i2;
        }

        @Override // com.google.android.material.slider.BaseSlider.InterfaceC4113g
        /* JADX INFO: renamed from: k */
        public C4182k mo14898k() {
            TypedArray typedArrayM14534p = cdj.m14534p(BaseSlider.this.getContext(), this.f25046k, C6095k.kja0.xkf, this.f67865toq, BaseSlider.cw14, new int[0]);
            C4182k c4182kHb = BaseSlider.hb(BaseSlider.this.getContext(), typedArrayM14534p);
            typedArrayM14534p.recycle();
            return c4182kHb;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.slider.BaseSlider$n */
    private static class C4115n extends AbstractC0778k {

        /* JADX INFO: renamed from: k */
        private final BaseSlider<?, ?, ?> f25047k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Rect f67867toq;

        C4115n(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f67867toq = new Rect();
            this.f25047k = baseSlider;
        }

        @lvui
        /* JADX INFO: renamed from: k */
        private String m14899k(int i2) {
            return i2 == this.f25047k.getValues().size() + (-1) ? this.f25047k.getContext().getString(C6095k.qrj.f79827lv5) : i2 == 0 ? this.f25047k.getContext().getString(C6095k.qrj.f79848t8iq) : "";
        }

        @Override // androidx.customview.widget.AbstractC0778k
        protected int getVirtualViewAt(float f2, float f3) {
            for (int i2 = 0; i2 < this.f25047k.getValues().size(); i2++) {
                this.f25047k.ch(i2, this.f67867toq);
                if (this.f67867toq.contains((int) f2, (int) f3)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.AbstractC0778k
        protected void getVisibleVirtualViews(List<Integer> list) {
            for (int i2 = 0; i2 < this.f25047k.getValues().size(); i2++) {
                list.add(Integer.valueOf(i2));
            }
        }

        @Override // androidx.customview.widget.AbstractC0778k
        protected boolean onPerformActionForVirtualView(int i2, int i3, Bundle bundle) {
            if (!this.f25047k.isEnabled()) {
                return false;
            }
            if (i3 != 4096 && i3 != 8192) {
                if (i3 == 16908349 && bundle != null && bundle.containsKey(ki.f50674lrht)) {
                    if (this.f25047k.zp(i2, bundle.getFloat(ki.f50674lrht))) {
                        this.f25047k.nmn5();
                        this.f25047k.postInvalidate();
                        invalidateVirtualView(i2);
                        return true;
                    }
                }
                return false;
            }
            float fN7h = this.f25047k.n7h(20);
            if (i3 == 8192) {
                fN7h = -fN7h;
            }
            if (this.f25047k.dd()) {
                fN7h = -fN7h;
            }
            if (!this.f25047k.zp(i2, C6116k.m22396q(this.f25047k.getValues().get(i2).floatValue() + fN7h, this.f25047k.getValueFrom(), this.f25047k.getValueTo()))) {
                return false;
            }
            this.f25047k.nmn5();
            this.f25047k.postInvalidate();
            invalidateVirtualView(i2);
            return true;
        }

        @Override // androidx.customview.widget.AbstractC0778k
        protected void onPopulateNodeForVirtualView(int i2, ki kiVar) {
            kiVar.toq(ki.C0656k.f50712lvui);
            List<Float> values = this.f25047k.getValues();
            float fFloatValue = values.get(i2).floatValue();
            float valueFrom = this.f25047k.getValueFrom();
            float valueTo = this.f25047k.getValueTo();
            if (this.f25047k.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    kiVar.m3052k(8192);
                }
                if (fFloatValue < valueTo) {
                    kiVar.m3052k(4096);
                }
            }
            kiVar.n2t(ki.C0658q.m3066n(1, valueFrom, valueTo, fFloatValue));
            kiVar.sok(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f25047k.getContentDescription() != null) {
                sb.append(this.f25047k.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                sb.append(m14899k(i2));
                sb.append(this.f25047k.fti(fFloatValue));
            }
            kiVar.yqrt(sb.toString());
            this.f25047k.ch(i2, this.f67867toq);
            kiVar.ltg8(this.f67867toq);
        }
    }

    class toq implements ValueAnimator.AnimatorUpdateListener {
        toq() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            Iterator it = BaseSlider.this.f25034t.iterator();
            while (it.hasNext()) {
                ((C4182k) it.next()).bek6(fFloatValue);
            }
            C0683f.h7am(BaseSlider.this);
        }
    }

    class zy extends AnimatorListenerAdapter {
        zy() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Iterator it = BaseSlider.this.f25034t.iterator();
            while (it.hasNext()) {
                C4058z.m14628y(BaseSlider.this).toq((C4182k) it.next());
            }
        }
    }

    public BaseSlider(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    private double m14873a(float f2) {
        float f3 = this.bg;
        if (f3 <= 0.0f) {
            return f2;
        }
        int i2 = (int) ((this.id - this.an) / f3);
        return ((double) Math.round(f2 * i2)) / ((double) i2);
    }

    private boolean a98o(float f2) {
        return zp(this.bl, f2);
    }

    /* JADX INFO: renamed from: b */
    private void m14874b(C4182k c4182k, float f2) {
        c4182k.cv06(fti(f2));
        int iUv6 = (this.f25035u + ((int) (uv6(f2) * this.ax))) - (c4182k.getIntrinsicWidth() / 2);
        int iKja0 = kja0() - (this.f25037w + this.f25036v);
        c4182k.setBounds(iUv6, iKja0 - c4182k.getIntrinsicHeight(), c4182k.getIntrinsicWidth() + iUv6, iKja0);
        Rect rect = new Rect(c4182k.getBounds());
        C4052q.zy(C4058z.f7l8(this), this, rect);
        c4182k.setBounds(rect);
        C4058z.m14628y(this).mo14541k(c4182k);
    }

    private boolean bf2() {
        return this.f25015a == 3;
    }

    private void bo() {
        if (this.bg > 0.0f && !dr(this.id)) {
            throw new IllegalStateException(String.format(sk1t, Float.valueOf(this.bg), Float.valueOf(this.an), Float.valueOf(this.id)));
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m14875c(int i2) {
        int i3 = this.as;
        int iM22391g = (int) C6116k.m22391g(((long) i3) + ((long) i2), 0L, this.in.size() - 1);
        this.as = iM22391g;
        if (iM22391g == i3) {
            return false;
        }
        if (this.bl != -1) {
            this.bl = iM22391g;
        }
        nmn5();
        postInvalidate();
        return true;
    }

    private void c8jq() {
        if (this.id <= this.an) {
            throw new IllegalStateException(String.format(zmmu, Float.valueOf(this.id), Float.valueOf(this.an)));
        }
    }

    private void d2ok() {
        this.f25025k.setStrokeWidth(this.f25038x);
        this.f25031q.setStrokeWidth(this.f25038x);
        this.f25039y.setStrokeWidth(this.f25038x / 2.0f);
        this.f25033s.setStrokeWidth(this.f25038x / 2.0f);
    }

    @x2
    private int d3(@lvui ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private boolean dr(float f2) {
        return m14887r(f2 - this.an);
    }

    /* JADX INFO: renamed from: e */
    private void m14876e() {
        Iterator<T> it = this.f25026l.iterator();
        while (it.hasNext()) {
            it.next().zy(this);
        }
    }

    private Drawable eqxt(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        m14885p(drawableNewDrawable);
        return drawableNewDrawable;
    }

    /* JADX INFO: renamed from: f */
    private void m14877f() {
        this.f25035u = this.f25029o + Math.max(this.f25036v - this.f25027m, 0);
        if (C0683f.v0af(this)) {
            lv5(getWidth());
        }
    }

    private float fn3e(float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        float f3 = (f2 - this.f25035u) / this.ax;
        float f4 = this.an;
        return (f3 * (f4 - this.id)) + f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String fti(float f2) {
        if (oc()) {
            return this.bp.mo14908k(f2);
        }
        return String.format(((float) ((int) f2)) == f2 ? "%.0f" : "%.2f", Float.valueOf(f2));
    }

    private void fu4(@lvui Canvas canvas, int i2, int i3) {
        float[] activeRange = getActiveRange();
        int i4 = this.f25035u;
        float f2 = i2;
        float f3 = i3;
        canvas.drawLine(i4 + (activeRange[0] * f2), f3, i4 + (activeRange[1] * f2), f3, this.f25031q);
    }

    private float[] getActiveRange() {
        float fFloatValue = ((Float) Collections.max(getValues())).floatValue();
        float fFloatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.in.size() == 1) {
            fFloatValue2 = this.an;
        }
        float fUv6 = uv6(fFloatValue2);
        float fUv62 = uv6(fFloatValue);
        return dd() ? new float[]{fUv62, fUv6} : new float[]{fUv6, fUv62};
    }

    private float getValueOfTouchPosition() {
        double dM14873a = m14873a(this.bu);
        if (dd()) {
            dM14873a = 1.0d - dM14873a;
        }
        float f2 = this.id;
        float f3 = this.an;
        return (float) ((dM14873a * ((double) (f2 - f3))) + ((double) f3));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f2 = this.bu;
        if (dd()) {
            f2 = 1.0f - f2;
        }
        float f3 = this.id;
        float f4 = this.an;
        return (f2 * (f3 - f4)) + f4;
    }

    private float gvn7(int i2, float f2) {
        float minSeparation = getMinSeparation();
        if (this.bd == 0) {
            minSeparation = fn3e(minSeparation);
        }
        if (dd()) {
            minSeparation = -minSeparation;
        }
        int i3 = i2 + 1;
        int i4 = i2 - 1;
        return C6116k.m22396q(f2, i4 < 0 ? this.an : this.in.get(i4).floatValue() + minSeparation, i3 >= this.in.size() ? this.id : this.in.get(i3).floatValue() - minSeparation);
    }

    private void gyi() {
        for (Float f2 : this.in) {
            if (f2.floatValue() < this.an || f2.floatValue() > this.id) {
                throw new IllegalStateException(String.format(w97r, f2, Float.valueOf(this.an), Float.valueOf(this.id)));
            }
            if (this.bg > 0.0f && !dr(f2.floatValue())) {
                throw new IllegalStateException(String.format(tgs, f2, Float.valueOf(this.an), Float.valueOf(this.bg), Float.valueOf(this.bg)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @lvui
    public static C4182k hb(@lvui Context context, @lvui TypedArray typedArray) {
        return C4182k.etdu(context, null, 0, typedArray.getResourceId(C6095k.kja0.ar, C6095k.n7h.xd));
    }

    private void hyr(@lvui Canvas canvas) {
        if (!this.ba || this.bg <= 0.0f) {
            return;
        }
        float[] activeRange = getActiveRange();
        int iM14884o = m14884o(this.az, activeRange[0]);
        int iM14884o2 = m14884o(this.az, activeRange[1]);
        int i2 = iM14884o * 2;
        canvas.drawPoints(this.az, 0, i2, this.f25039y);
        int i3 = iM14884o2 * 2;
        canvas.drawPoints(this.az, i2, i3 - i2, this.f25033s);
        float[] fArr = this.az;
        canvas.drawPoints(fArr, i3, fArr.length - i3, this.f25039y);
    }

    /* JADX INFO: renamed from: i */
    private void m14879i(C4182k c4182k) {
        fu4 fu4VarM14628y = C4058z.m14628y(this);
        if (fu4VarM14628y != null) {
            fu4VarM14628y.toq(c4182k);
            c4182k.cfr(C4058z.f7l8(this));
        }
    }

    private boolean i1() {
        return this.bq || !(getBackground() instanceof RippleDrawable);
    }

    private void jk(int i2) {
        if (i2 == 1) {
            m14875c(Integer.MAX_VALUE);
            return;
        }
        if (i2 == 2) {
            m14875c(Integer.MIN_VALUE);
        } else if (i2 == 17) {
            lrht(Integer.MAX_VALUE);
        } else {
            if (i2 != 66) {
                return;
            }
            lrht(Integer.MIN_VALUE);
        }
    }

    private static float jp0y(ValueAnimator valueAnimator, float f2) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f2;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return fFloatValue;
    }

    private ValueAnimator ki(boolean z2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(jp0y(z2 ? this.f25019e : this.f25017c, z2 ? 0.0f : 1.0f), z2 ? 1.0f : 0.0f);
        valueAnimatorOfFloat.setDuration(z2 ? q7k9 : ndjo);
        valueAnimatorOfFloat.setInterpolator(z2 ? C3910k.f23772n : C3910k.f67313zy);
        valueAnimatorOfFloat.addUpdateListener(new toq());
        return valueAnimatorOfFloat;
    }

    private int kja0() {
        return this.f67864bo + ((this.f25015a == 1 || bf2()) ? this.f25034t.get(0).getIntrinsicHeight() : 0);
    }

    /* JADX INFO: renamed from: l */
    private void m14881l() {
        if (this.bg <= 0.0f) {
            return;
        }
        t8iq();
        int iMin = Math.min((int) (((this.id - this.an) / this.bg) + 1.0f), (this.ax / (this.f25038x * 2)) + 1);
        float[] fArr = this.az;
        if (fArr == null || fArr.length != iMin * 2) {
            this.az = new float[iMin * 2];
        }
        float f2 = this.ax / (iMin - 1);
        for (int i2 = 0; i2 < iMin * 2; i2 += 2) {
            float[] fArr2 = this.az;
            fArr2[i2] = this.f25035u + ((i2 / 2) * f2);
            fArr2[i2 + 1] = kja0();
        }
    }

    private void ld6(C4182k c4182k) {
        c4182k.b3e(C4058z.f7l8(this));
    }

    private boolean lrht(int i2) {
        if (dd()) {
            i2 = i2 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i2;
        }
        return m14875c(i2);
    }

    private void lv5(int i2) {
        this.ax = Math.max(i2 - (this.f25035u * 2), 0);
        m14881l();
    }

    private boolean lvui() {
        ViewParent parent = getParent();
        while (true) {
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    /* JADX INFO: renamed from: m */
    private void m14882m(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayM14534p = cdj.m14534p(context, attributeSet, C6095k.kja0.xkf, i2, cw14, new int[0]);
        this.an = typedArrayM14534p.getFloat(C6095k.kja0.il, 0.0f);
        this.id = typedArrayM14534p.getFloat(C6095k.kja0.dsx, 1.0f);
        setValues(Float.valueOf(this.an));
        this.bg = typedArrayM14534p.getFloat(C6095k.kja0.pxz, 0.0f);
        int i3 = C6095k.kja0.rp0;
        boolean zHasValue = typedArrayM14534p.hasValue(i3);
        int i4 = zHasValue ? i3 : C6095k.kja0.vx4g;
        if (!zHasValue) {
            i3 = C6095k.kja0.rax;
        }
        ColorStateList colorStateListM14753k = com.google.android.material.resources.zy.m14753k(context, typedArrayM14534p, i4);
        if (colorStateListM14753k == null) {
            colorStateListM14753k = C6045k.m22274k(context, C6095k.n.lv7);
        }
        setTrackInactiveTintList(colorStateListM14753k);
        ColorStateList colorStateListM14753k2 = com.google.android.material.resources.zy.m14753k(context, typedArrayM14534p, i3);
        if (colorStateListM14753k2 == null) {
            colorStateListM14753k2 = C6045k.m22274k(context, C6095k.n.dgmt);
        }
        setTrackActiveTintList(colorStateListM14753k2);
        this.k0.m14867x(com.google.android.material.resources.zy.m14753k(context, typedArrayM14534p, C6095k.kja0.lqk8));
        int i5 = C6095k.kja0.im8v;
        if (typedArrayM14534p.hasValue(i5)) {
            setThumbStrokeColor(com.google.android.material.resources.zy.m14753k(context, typedArrayM14534p, i5));
        }
        setThumbStrokeWidth(typedArrayM14534p.getDimension(C6095k.kja0.o6t, 0.0f));
        ColorStateList colorStateListM14753k3 = com.google.android.material.resources.zy.m14753k(context, typedArrayM14534p, C6095k.kja0.lro);
        if (colorStateListM14753k3 == null) {
            colorStateListM14753k3 = C6045k.m22274k(context, C6095k.n.hs6);
        }
        setHaloTintList(colorStateListM14753k3);
        this.ba = typedArrayM14534p.getBoolean(C6095k.kja0.tlc, true);
        int i6 = C6095k.kja0.wg;
        boolean zHasValue2 = typedArrayM14534p.hasValue(i6);
        int i7 = zHasValue2 ? i6 : C6095k.kja0.wwa;
        if (!zHasValue2) {
            i6 = C6095k.kja0.k7;
        }
        ColorStateList colorStateListM14753k4 = com.google.android.material.resources.zy.m14753k(context, typedArrayM14534p, i7);
        if (colorStateListM14753k4 == null) {
            colorStateListM14753k4 = C6045k.m22274k(context, C6095k.n.qyp);
        }
        setTickInactiveTintList(colorStateListM14753k4);
        ColorStateList colorStateListM14753k5 = com.google.android.material.resources.zy.m14753k(context, typedArrayM14534p, i6);
        if (colorStateListM14753k5 == null) {
            colorStateListM14753k5 = C6045k.m22274k(context, C6095k.n.lflh);
        }
        setTickActiveTintList(colorStateListM14753k5);
        setThumbRadius(typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.bb9p, 0));
        setHaloRadius(typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.uqa, 0));
        setThumbElevation(typedArrayM14534p.getDimension(C6095k.kja0.nnx, 0.0f));
        setTrackHeight(typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.c4zs, 0));
        setLabelBehavior(typedArrayM14534p.getInt(C6095k.kja0.fmq, 0));
        if (!typedArrayM14534p.getBoolean(C6095k.kja0.oeke, true)) {
            setEnabled(false);
        }
        typedArrayM14534p.recycle();
    }

    private void mcp() {
        if (this.f25020f) {
            this.f25020f = false;
            ValueAnimator valueAnimatorKi = ki(false);
            this.f25019e = valueAnimatorKi;
            this.f25017c = null;
            valueAnimatorKi.addListener(new zy());
            this.f25019e.start();
        }
    }

    private void n5r1(@lvui Canvas canvas, int i2, int i3) {
        if (i1()) {
            int iUv6 = (int) (this.f25035u + (uv6(this.in.get(this.as).floatValue()) * i2));
            if (Build.VERSION.SDK_INT < 28) {
                int i4 = this.f25018d;
                canvas.clipRect(iUv6 - i4, i3 - i4, iUv6 + i4, i4 + i3, Region.Op.UNION);
            }
            canvas.drawCircle(iUv6, i3, this.f25018d, this.f25021g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n7h(int i2) {
        float fQrj = qrj();
        return (this.id - this.an) / fQrj <= i2 ? fQrj : Math.round(r1 / r4) * fQrj;
    }

    private void ncyb(@lvui Resources resources) {
        this.f25016b = resources.getDimensionPixelSize(C6095k.g.ume);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C6095k.g.w8);
        this.f25029o = dimensionPixelOffset;
        this.f25035u = dimensionPixelOffset;
        this.f25027m = resources.getDimensionPixelSize(C6095k.g.wd);
        this.f67864bo = resources.getDimensionPixelOffset(C6095k.g.mzno);
        this.f25037w = resources.getDimensionPixelSize(C6095k.g.fu7m);
    }

    private void ni7() {
        for (L l2 : this.f25032r) {
            Iterator<Float> it = this.in.iterator();
            while (it.hasNext()) {
                l2.toq(this, it.next().floatValue(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nmn5() {
        if (i1() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iUv6 = (int) ((uv6(this.in.get(this.as).floatValue()) * this.ax) + this.f25035u);
            int iKja0 = kja0();
            int i2 = this.f25018d;
            androidx.core.graphics.drawable.zy.x2(background, iUv6 - i2, iKja0 - i2, iUv6 + i2, iKja0 + i2);
        }
    }

    private void nn86() {
        Iterator<T> it = this.f25026l.iterator();
        while (it.hasNext()) {
            it.next().m14909g(this);
        }
    }

    /* JADX INFO: renamed from: o */
    private static int m14884o(float[] fArr, float f2) {
        return Math.round(f2 * ((fArr.length / 2) - 1));
    }

    private void o1t(@lvui Canvas canvas, int i2, int i3, float f2, @lvui Drawable drawable) {
        canvas.save();
        canvas.translate((this.f25035u + ((int) (uv6(f2) * i2))) - (drawable.getBounds().width() / 2.0f), i3 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: p */
    private void m14885p(Drawable drawable) {
        int i2 = this.f25036v * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i2, i2);
        } else {
            float fMax = i2 / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    private float qrj() {
        float f2 = this.bg;
        if (f2 == 0.0f) {
            return 1.0f;
        }
        return f2;
    }

    /* JADX INFO: renamed from: r */
    private boolean m14887r(float f2) {
        double dDoubleValue = new BigDecimal(Float.toString(f2)).divide(new BigDecimal(Float.toString(this.bg)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < hp;
    }

    private void setValuesInternal(@lvui ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.in.size() == arrayList.size() && this.in.equals(arrayList)) {
            return;
        }
        this.in = arrayList;
        this.ad = true;
        this.as = 0;
        nmn5();
        t8r();
        ni7();
        postInvalidate();
    }

    /* JADX INFO: renamed from: t */
    private void m14888t() {
        if (this.f25015a == 2) {
            return;
        }
        if (!this.f25020f) {
            this.f25020f = true;
            ValueAnimator valueAnimatorKi = ki(true);
            this.f25017c = valueAnimatorKi;
            this.f25019e = null;
            valueAnimatorKi.start();
        }
        Iterator<C4182k> it = this.f25034t.iterator();
        for (int i2 = 0; i2 < this.in.size() && it.hasNext(); i2++) {
            if (i2 != this.as) {
                m14874b(it.next(), this.in.get(i2).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.f25034t.size()), Integer.valueOf(this.in.size())));
        }
        m14874b(it.next(), this.in.get(this.as).floatValue());
    }

    private void t8iq() {
        if (this.ad) {
            y2();
            c8jq();
            bo();
            gyi();
            m14889u();
            m14890v();
            this.ad = false;
        }
    }

    private void t8r() {
        if (this.f25034t.size() > this.in.size()) {
            List<C4182k> listSubList = this.f25034t.subList(this.in.size(), this.f25034t.size());
            for (C4182k c4182k : listSubList) {
                if (C0683f.zsr0(this)) {
                    m14879i(c4182k);
                }
            }
            listSubList.clear();
        }
        while (this.f25034t.size() < this.in.size()) {
            C4182k c4182kMo14898k = this.f25040z.mo14898k();
            this.f25034t.add(c4182kMo14898k);
            if (C0683f.zsr0(this)) {
                ld6(c4182kMo14898k);
            }
        }
        int i2 = this.f25034t.size() == 1 ? 0 : 1;
        Iterator<C4182k> it = this.f25034t.iterator();
        while (it.hasNext()) {
            it.next().tfm(i2);
        }
    }

    /* JADX INFO: renamed from: u */
    private void m14889u() {
        float minSeparation = getMinSeparation();
        if (minSeparation < 0.0f) {
            throw new IllegalStateException(String.format(dy, Float.valueOf(minSeparation)));
        }
        float f2 = this.bg;
        if (f2 <= 0.0f || minSeparation <= 0.0f) {
            return;
        }
        if (this.bd != 1) {
            throw new IllegalStateException(String.format(vb6, Float.valueOf(minSeparation), Float.valueOf(this.bg)));
        }
        if (minSeparation < f2 || !m14887r(minSeparation)) {
            throw new IllegalStateException(String.format(k6e, Float.valueOf(minSeparation), Float.valueOf(this.bg), Float.valueOf(this.bg)));
        }
    }

    private float uv6(float f2) {
        float f3 = this.an;
        float f4 = (f2 - f3) / (this.id - f3);
        return dd() ? 1.0f - f4 : f4;
    }

    /* JADX INFO: renamed from: v */
    private void m14890v() {
        float f2 = this.bg;
        if (f2 == 0.0f) {
            return;
        }
        if (((int) f2) != f2) {
            Log.w(tlhn, String.format(xk5, "stepSize", Float.valueOf(f2)));
        }
        float f3 = this.an;
        if (((int) f3) != f3) {
            Log.w(tlhn, String.format(xk5, "valueFrom", Float.valueOf(f3)));
        }
        float f4 = this.id;
        if (((int) f4) != f4) {
            Log.w(tlhn, String.format(xk5, "valueTo", Float.valueOf(f4)));
        }
    }

    private Boolean vyq(int i2, @lvui KeyEvent keyEvent) {
        if (i2 == 61) {
            return keyEvent.hasNoModifiers() ? Boolean.valueOf(m14875c(1)) : keyEvent.isShiftPressed() ? Boolean.valueOf(m14875c(-1)) : Boolean.FALSE;
        }
        if (i2 != 66) {
            if (i2 != 81) {
                if (i2 == 69) {
                    m14875c(-1);
                    return Boolean.TRUE;
                }
                if (i2 != 70) {
                    switch (i2) {
                        case 21:
                            lrht(-1);
                            break;
                        case 22:
                            lrht(1);
                            break;
                    }
                    return Boolean.TRUE;
                }
            }
            m14875c(1);
            return Boolean.TRUE;
        }
        this.bl = this.as;
        postInvalidate();
        return Boolean.TRUE;
    }

    private void wvg(@lvui Canvas canvas, int i2, int i3) {
        for (int i4 = 0; i4 < this.in.size(); i4++) {
            float fFloatValue = this.in.get(i4).floatValue();
            Drawable drawable = this.ar;
            if (drawable != null) {
                o1t(canvas, i2, i3, fFloatValue, drawable);
            } else if (i4 < this.bc.size()) {
                o1t(canvas, i2, i3, fFloatValue, this.bc.get(i4));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle(this.f25035u + (uv6(fFloatValue) * i2), i3, this.f25036v, this.f25028n);
                }
                o1t(canvas, i2, i3, fFloatValue, this.k0);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    private boolean m14891x() {
        return a98o(getValueOfTouchPosition());
    }

    private Float x2(int i2) {
        float fN7h = this.ac ? n7h(20) : qrj();
        if (i2 == 21) {
            if (!dd()) {
                fN7h = -fN7h;
            }
            return Float.valueOf(fN7h);
        }
        if (i2 == 22) {
            if (dd()) {
                fN7h = -fN7h;
            }
            return Float.valueOf(fN7h);
        }
        if (i2 == 69) {
            return Float.valueOf(-fN7h);
        }
        if (i2 == 70 || i2 == 81) {
            return Float.valueOf(fN7h);
        }
        return null;
    }

    private float xwq3(float f2) {
        return (uv6(f2) * this.ax) + this.f25035u;
    }

    private void y2() {
        if (this.an >= this.id) {
            throw new IllegalStateException(String.format(yl25, Float.valueOf(this.an), Float.valueOf(this.id)));
        }
    }

    private void y9n(int i2) {
        BaseSlider<S, L, T>.RunnableC4116q runnableC4116q = this.f25023i;
        if (runnableC4116q == null) {
            this.f25023i = new RunnableC4116q(this, null);
        } else {
            removeCallbacks(runnableC4116q);
        }
        this.f25023i.m14900k(i2);
        postDelayed(this.f25023i, 200L);
    }

    /* JADX INFO: renamed from: z */
    private void m14892z(@lvui Canvas canvas, int i2, int i3) {
        float[] activeRange = getActiveRange();
        float f2 = i2;
        float f3 = this.f25035u + (activeRange[1] * f2);
        if (f3 < r1 + i2) {
            float f4 = i3;
            canvas.drawLine(f3, f4, r1 + i2, f4, this.f25025k);
        }
        int i4 = this.f25035u;
        float f5 = i4 + (activeRange[0] * f2);
        if (f5 > i4) {
            float f6 = i3;
            canvas.drawLine(i4, f6, f5, f6, this.f25025k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zp(int i2, float f2) {
        this.as = i2;
        if (Math.abs(f2 - this.in.get(i2).floatValue()) < hp) {
            return false;
        }
        this.in.set(i2, Float.valueOf(gvn7(i2, f2)));
        zurt(i2);
        return true;
    }

    private void zurt(int i2) {
        Iterator<L> it = this.f25032r.iterator();
        while (it.hasNext()) {
            it.next().toq(this, this.in.get(i2).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f25022h;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        y9n(i2);
    }

    @yz
    void a9(boolean z2) {
        this.bq = z2;
    }

    public void cdj() {
        this.f25026l.clear();
    }

    void ch(int i2, Rect rect) {
        int iUv6 = this.f25035u + ((int) (uv6(getValues().get(i2).floatValue()) * this.ax));
        int iKja0 = kja0();
        int i3 = this.f25036v;
        rect.set(iUv6 - i3, iKja0 - i3, iUv6 + i3, iKja0 + i3);
    }

    final boolean dd() {
        return C0683f.m3159e(this) == 1;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@lvui MotionEvent motionEvent) {
        return this.f25030p.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@lvui KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f25025k.setColor(d3(this.bs));
        this.f25031q.setColor(d3(this.aj));
        this.f25039y.setColor(d3(this.be));
        this.f25033s.setColor(d3(this.ay));
        for (C4182k c4182k : this.f25034t) {
            if (c4182k.isStateful()) {
                c4182k.setState(getDrawableState());
            }
        }
        if (this.k0.isStateful()) {
            this.k0.setState(getDrawableState());
        }
        this.f25021g.setColor(d3(this.am));
        this.f25021g.setAlpha(63);
    }

    public void ek5k(@lvui L l2) {
        this.f25032r.remove(l2);
    }

    @Override // android.view.View
    @lvui
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @yz
    final int getAccessibilityFocusedVirtualViewId() {
        return this.f25030p.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.bl;
    }

    public int getFocusedThumbIndex() {
        return this.as;
    }

    @zy.cdj
    public int getHaloRadius() {
        return this.f25018d;
    }

    @lvui
    public ColorStateList getHaloTintList() {
        return this.am;
    }

    public int getLabelBehavior() {
        return this.f25015a;
    }

    protected float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.bg;
    }

    public float getThumbElevation() {
        return this.k0.fu4();
    }

    @zy.cdj
    public int getThumbRadius() {
        return this.f25036v;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.k0.m14863r();
    }

    public float getThumbStrokeWidth() {
        return this.k0.ncyb();
    }

    @lvui
    public ColorStateList getThumbTintList() {
        return this.k0.m14869z();
    }

    @lvui
    public ColorStateList getTickActiveTintList() {
        return this.ay;
    }

    @lvui
    public ColorStateList getTickInactiveTintList() {
        return this.be;
    }

    @lvui
    public ColorStateList getTickTintList() {
        if (this.be.equals(this.ay)) {
            return this.ay;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @lvui
    public ColorStateList getTrackActiveTintList() {
        return this.aj;
    }

    @zy.cdj
    public int getTrackHeight() {
        return this.f25038x;
    }

    @lvui
    public ColorStateList getTrackInactiveTintList() {
        return this.bs;
    }

    @zy.cdj
    public int getTrackSidePadding() {
        return this.f25035u;
    }

    @lvui
    public ColorStateList getTrackTintList() {
        if (this.bs.equals(this.aj)) {
            return this.aj;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @zy.cdj
    public int getTrackWidth() {
        return this.ax;
    }

    public float getValueFrom() {
        return this.an;
    }

    public float getValueTo() {
        return this.id;
    }

    @lvui
    List<Float> getValues() {
        return new ArrayList(this.in);
    }

    /* JADX INFO: renamed from: h */
    public void mo14893h() {
        this.f25032r.clear();
    }

    /* JADX INFO: renamed from: j */
    protected boolean mo14894j() {
        if (this.bl != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float fXwq3 = xwq3(valueOfTouchPositionAbsolute);
        this.bl = 0;
        float fAbs = Math.abs(this.in.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i2 = 1; i2 < this.in.size(); i2++) {
            float fAbs2 = Math.abs(this.in.get(i2).floatValue() - valueOfTouchPositionAbsolute);
            float fXwq32 = xwq3(this.in.get(i2).floatValue());
            if (Float.compare(fAbs2, fAbs) > 1) {
                break;
            }
            boolean z2 = !dd() ? fXwq32 - fXwq3 >= 0.0f : fXwq32 - fXwq3 <= 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.bl = i2;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fXwq32 - fXwq3) < this.f25024j) {
                        this.bl = -1;
                        return false;
                    }
                    if (z2) {
                        this.bl = i2;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.bl != -1;
    }

    public boolean oc() {
        return this.bp != null;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator<C4182k> it = this.f25034t.iterator();
        while (it.hasNext()) {
            ld6(it.next());
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        BaseSlider<S, L, T>.RunnableC4116q runnableC4116q = this.f25023i;
        if (runnableC4116q != null) {
            removeCallbacks(runnableC4116q);
        }
        this.f25020f = false;
        Iterator<C4182k> it = this.f25034t.iterator();
        while (it.hasNext()) {
            m14879i(it.next());
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(@lvui Canvas canvas) {
        if (this.ad) {
            t8iq();
            m14881l();
        }
        super.onDraw(canvas);
        int iKja0 = kja0();
        m14892z(canvas, this.ax, iKja0);
        if (((Float) Collections.max(getValues())).floatValue() > this.an) {
            fu4(canvas, this.ax, iKja0);
        }
        hyr(canvas);
        if ((this.bv || isFocused() || bf2()) && isEnabled()) {
            n5r1(canvas, this.ax, iKja0);
            if (this.bl != -1 || bf2()) {
                m14888t();
            } else {
                mcp();
            }
        } else {
            mcp();
        }
        wvg(canvas, this.ax, iKja0);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z2, int i2, @dd Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (z2) {
            jk(i2);
            this.f25030p.requestKeyboardFocusForVirtualView(this.as);
        } else {
            this.bl = -1;
            this.f25030p.clearKeyboardFocusForVirtualView(this.as);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, @lvui KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (this.in.size() == 1) {
            this.bl = 0;
        }
        if (this.bl == -1) {
            Boolean boolVyq = vyq(i2, keyEvent);
            return boolVyq != null ? boolVyq.booleanValue() : super.onKeyDown(i2, keyEvent);
        }
        this.ac |= keyEvent.isLongPress();
        Float fX2 = x2(i2);
        if (fX2 != null) {
            if (a98o(this.in.get(this.bl).floatValue() + fX2.floatValue())) {
                nmn5();
                postInvalidate();
            }
            return true;
        }
        if (i2 != 23) {
            if (i2 == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m14875c(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return m14875c(-1);
                }
                return false;
            }
            if (i2 != 66) {
                return super.onKeyDown(i2, keyEvent);
            }
        }
        this.bl = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, @lvui KeyEvent keyEvent) {
        this.ac = false;
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(this.f25016b + ((this.f25015a == 1 || bf2()) ? this.f25034t.get(0).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.an = sliderState.f25042k;
        this.id = sliderState.f25044q;
        setValuesInternal(sliderState.f25043n);
        this.bg = sliderState.f25041g;
        if (sliderState.f25045y) {
            requestFocus();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f25042k = this.an;
        sliderState.f25044q = this.id;
        sliderState.f25043n = new ArrayList<>(this.in);
        sliderState.f25041g = this.bg;
        sliderState.f25045y = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        lv5(i2);
        nmn5();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@lvui MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x3 = motionEvent.getX();
        float f2 = (x3 - this.f25035u) / this.ax;
        this.bu = f2;
        float fMax = Math.max(0.0f, f2);
        this.bu = fMax;
        this.bu = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f67863ab = x3;
            if (!lvui()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (mo14894j()) {
                    requestFocus();
                    this.bv = true;
                    m14891x();
                    nmn5();
                    invalidate();
                    m14876e();
                }
            }
        } else if (actionMasked == 1) {
            this.bv = false;
            MotionEvent motionEvent2 = this.bb;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.bb.getX() - motionEvent.getX()) <= this.f25024j && Math.abs(this.bb.getY() - motionEvent.getY()) <= this.f25024j && mo14894j()) {
                m14876e();
            }
            if (this.bl != -1) {
                m14891x();
                this.bl = -1;
                nn86();
            }
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.bv) {
                if (lvui() && Math.abs(x3 - this.f67863ab) < this.f25024j) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                m14876e();
            }
            if (mo14894j()) {
                this.bv = true;
                m14891x();
                nmn5();
                invalidate();
            }
        }
        setPressed(this.bv);
        this.bb = MotionEvent.obtain(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public void mo14895s(@lvui T t2) {
        this.f25026l.add(t2);
    }

    protected void setActiveThumbIndex(int i2) {
        this.bl = i2;
    }

    void setCustomThumbDrawable(@fn3e int i2) {
        setCustomThumbDrawable(getResources().getDrawable(i2));
    }

    void setCustomThumbDrawablesForValues(@lvui @fn3e int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            drawableArr[i2] = getResources().getDrawable(iArr[i2]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        setLayerType(z2 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i2) {
        if (i2 < 0 || i2 >= this.in.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.as = i2;
        this.f25030p.requestKeyboardFocusForVirtualView(i2);
        postInvalidate();
    }

    public void setHaloRadius(@zy.cdj @a9(from = 0) int i2) {
        if (i2 == this.f25018d) {
            return;
        }
        this.f25018d = i2;
        Drawable background = getBackground();
        if (i1() || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            C7398k.toq((RippleDrawable) background, this.f25018d);
        }
    }

    public void setHaloRadiusResource(@InterfaceC7829h int i2) {
        setHaloRadius(getResources().getDimensionPixelSize(i2));
    }

    public void setHaloTintList(@lvui ColorStateList colorStateList) {
        if (colorStateList.equals(this.am)) {
            return;
        }
        this.am = colorStateList;
        Drawable background = getBackground();
        if (!i1() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f25021g.setColor(d3(colorStateList));
        this.f25021g.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i2) {
        if (this.f25015a != i2) {
            this.f25015a = i2;
            requestLayout();
        }
    }

    public void setLabelFormatter(@dd InterfaceC4121q interfaceC4121q) {
        this.bp = interfaceC4121q;
    }

    protected void setSeparationUnit(int i2) {
        this.bd = i2;
        this.ad = true;
        postInvalidate();
    }

    public void setStepSize(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException(String.format(sk1t, Float.valueOf(f2), Float.valueOf(this.an), Float.valueOf(this.id)));
        }
        if (this.bg != f2) {
            this.bg = f2;
            this.ad = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f2) {
        this.k0.zp(f2);
    }

    public void setThumbElevationResource(@InterfaceC7829h int i2) {
        setThumbElevation(getResources().getDimension(i2));
    }

    public void setThumbRadius(@zy.cdj @a9(from = 0) int i2) {
        if (i2 == this.f25036v) {
            return;
        }
        this.f25036v = i2;
        m14877f();
        this.k0.setShapeAppearanceModel(kja0.m14819k().cdj(0, this.f25036v).qrj());
        C4108p c4108p = this.k0;
        int i3 = this.f25036v;
        c4108p.setBounds(0, 0, i3 * 2, i3 * 2);
        Drawable drawable = this.ar;
        if (drawable != null) {
            m14885p(drawable);
        }
        Iterator<Drawable> it = this.bc.iterator();
        while (it.hasNext()) {
            m14885p(it.next());
        }
        postInvalidate();
    }

    public void setThumbRadiusResource(@InterfaceC7829h int i2) {
        setThumbRadius(getResources().getDimensionPixelSize(i2));
    }

    public void setThumbStrokeColor(@dd ColorStateList colorStateList) {
        this.k0.qkj8(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@n7h int i2) {
        if (i2 != 0) {
            setThumbStrokeColor(C6045k.m22274k(getContext(), i2));
        }
    }

    public void setThumbStrokeWidth(float f2) {
        this.k0.tfm(f2);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@InterfaceC7829h int i2) {
        if (i2 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i2));
        }
    }

    public void setThumbTintList(@lvui ColorStateList colorStateList) {
        if (colorStateList.equals(this.k0.m14869z())) {
            return;
        }
        this.k0.m14867x(colorStateList);
        invalidate();
    }

    public void setTickActiveTintList(@lvui ColorStateList colorStateList) {
        if (colorStateList.equals(this.ay)) {
            return;
        }
        this.ay = colorStateList;
        this.f25033s.setColor(d3(colorStateList));
        invalidate();
    }

    public void setTickInactiveTintList(@lvui ColorStateList colorStateList) {
        if (colorStateList.equals(this.be)) {
            return;
        }
        this.be = colorStateList;
        this.f25039y.setColor(d3(colorStateList));
        invalidate();
    }

    public void setTickTintList(@lvui ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z2) {
        if (this.ba != z2) {
            this.ba = z2;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@lvui ColorStateList colorStateList) {
        if (colorStateList.equals(this.aj)) {
            return;
        }
        this.aj = colorStateList;
        this.f25031q.setColor(d3(colorStateList));
        invalidate();
    }

    public void setTrackHeight(@zy.cdj @a9(from = 0) int i2) {
        if (this.f25038x != i2) {
            this.f25038x = i2;
            d2ok();
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(@lvui ColorStateList colorStateList) {
        if (colorStateList.equals(this.bs)) {
            return;
        }
        this.bs = colorStateList;
        this.f25025k.setColor(d3(colorStateList));
        invalidate();
    }

    public void setTrackTintList(@lvui ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f2) {
        this.an = f2;
        this.ad = true;
        postInvalidate();
    }

    public void setValueTo(float f2) {
        this.id = f2;
        this.ad = true;
        postInvalidate();
    }

    void setValues(@lvui Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public boolean x9kr() {
        return this.ba;
    }

    /* JADX INFO: renamed from: y */
    public void mo14896y(@lvui L l2) {
        this.f25032r.add(l2);
    }

    public void yz(@lvui T t2) {
        this.f25026l.remove(t2);
    }

    /* JADX INFO: renamed from: com.google.android.material.slider.BaseSlider$q */
    private class RunnableC4116q implements Runnable {

        /* JADX INFO: renamed from: k */
        int f25048k;

        private RunnableC4116q() {
            this.f25048k = -1;
        }

        /* JADX INFO: renamed from: k */
        void m14900k(int i2) {
            this.f25048k = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.f25030p.sendEventForVirtualView(this.f25048k, 4);
        }

        /* synthetic */ RunnableC4116q(BaseSlider baseSlider, C4114k c4114k) {
            this();
        }
    }

    public BaseSlider(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.dkp2);
    }

    void setCustomThumbDrawable(@lvui Drawable drawable) {
        this.ar = eqxt(drawable);
        this.bc.clear();
        postInvalidate();
    }

    public BaseSlider(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(C6070k.zy(context, attributeSet, i2, cw14), attributeSet, i2);
        this.f25034t = new ArrayList();
        this.f25032r = new ArrayList();
        this.f25026l = new ArrayList();
        this.f25020f = false;
        this.bv = false;
        this.in = new ArrayList<>();
        this.bl = -1;
        this.as = -1;
        this.bg = 0.0f;
        this.ba = true;
        this.ac = false;
        C4108p c4108p = new C4108p();
        this.k0 = c4108p;
        this.bc = Collections.emptyList();
        this.bd = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f25025k = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f25031q = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.f25028n = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f25021g = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.f25039y = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.f25033s = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        ncyb(context2.getResources());
        this.f25040z = new C4114k(attributeSet, i2);
        m14882m(context2, attributeSet, i2);
        setFocusable(true);
        setClickable(true);
        c4108p.gyi(2);
        this.f25024j = ViewConfiguration.get(context2).getScaledTouchSlop();
        C4115n c4115n = new C4115n(this);
        this.f25030p = c4115n;
        C0683f.zwy(this, c4115n);
        this.f25022h = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    void setValues(@lvui List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    void setCustomThumbDrawablesForValues(@lvui Drawable... drawableArr) {
        this.ar = null;
        this.bc = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.bc.add(eqxt(drawable));
        }
        postInvalidate();
    }
}
