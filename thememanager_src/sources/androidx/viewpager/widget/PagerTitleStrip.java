package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.view.C0683f;
import androidx.core.widget.t8r;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;
import zy.dd;
import zy.lvui;
import zy.x2;
import zy.zurt;

/* JADX INFO: loaded from: classes.dex */
@ViewPager.InterfaceC1283n
public class PagerTitleStrip extends ViewGroup {

    /* JADX INFO: renamed from: c */
    private static final int[] f6984c = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* JADX INFO: renamed from: e */
    private static final int[] f6985e = {R.attr.textAllCaps};

    /* JADX INFO: renamed from: j */
    private static final float f6986j = 0.6f;

    /* JADX INFO: renamed from: o */
    private static final int f6987o = 16;

    /* JADX INFO: renamed from: f */
    int f6988f;

    /* JADX INFO: renamed from: g */
    TextView f6989g;

    /* JADX INFO: renamed from: h */
    private int f6990h;

    /* JADX INFO: renamed from: i */
    private boolean f6991i;

    /* JADX INFO: renamed from: k */
    ViewPager f6992k;

    /* JADX INFO: renamed from: l */
    private int f6993l;

    /* JADX INFO: renamed from: n */
    TextView f6994n;

    /* JADX INFO: renamed from: p */
    private int f6995p;

    /* JADX INFO: renamed from: q */
    TextView f6996q;

    /* JADX INFO: renamed from: r */
    private WeakReference<AbstractC1288k> f6997r;

    /* JADX INFO: renamed from: s */
    float f6998s;

    /* JADX INFO: renamed from: t */
    private final C1279k f6999t;

    /* JADX INFO: renamed from: y */
    private int f7000y;

    /* JADX INFO: renamed from: z */
    private boolean f7001z;

    /* JADX INFO: renamed from: androidx.viewpager.widget.PagerTitleStrip$k */
    private class C1279k extends DataSetObserver implements ViewPager.InterfaceC1284p, ViewPager.InterfaceC1286s {

        /* JADX INFO: renamed from: k */
        private int f7002k;

        C1279k() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        /* JADX INFO: renamed from: k */
        public void mo5550k(int i2) {
            this.f7002k = i2;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.toq(pagerTitleStrip.f6992k.getCurrentItem(), PagerTitleStrip.this.f6992k.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f2 = pagerTitleStrip2.f6998s;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            pagerTitleStrip2.zy(pagerTitleStrip2.f6992k.getCurrentItem(), f2, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1286s
        /* JADX INFO: renamed from: q */
        public void mo5551q(ViewPager viewPager, AbstractC1288k abstractC1288k, AbstractC1288k abstractC1288k2) {
            PagerTitleStrip.this.m5549k(abstractC1288k, abstractC1288k2);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void toq(int i2) {
            if (this.f7002k == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.toq(pagerTitleStrip.f6992k.getCurrentItem(), PagerTitleStrip.this.f6992k.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f2 = pagerTitleStrip2.f6998s;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                pagerTitleStrip2.zy(pagerTitleStrip2.f6992k.getCurrentItem(), f2, true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void zy(int i2, float f2, int i3) {
            if (f2 > 0.5f) {
                i2++;
            }
            PagerTitleStrip.this.zy(i2, f2, false);
        }
    }

    private static class toq extends SingleLineTransformationMethod {

        /* JADX INFO: renamed from: k */
        private Locale f7004k;

        toq(Context context) {
            this.f7004k = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f7004k);
            }
            return null;
        }
    }

    public PagerTitleStrip(@lvui Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new toq(textView.getContext()));
    }

    int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f6995p;
    }

    /* JADX INFO: renamed from: k */
    void m5549k(AbstractC1288k abstractC1288k, AbstractC1288k abstractC1288k2) {
        if (abstractC1288k != null) {
            abstractC1288k.fn3e(this.f6999t);
            this.f6997r = null;
        }
        if (abstractC1288k2 != null) {
            abstractC1288k2.qrj(this.f6999t);
            this.f6997r = new WeakReference<>(abstractC1288k2);
        }
        ViewPager viewPager = this.f6992k;
        if (viewPager != null) {
            this.f7000y = -1;
            this.f6998s = -1.0f;
            toq(viewPager.getCurrentItem(), abstractC1288k2);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        AbstractC1288k adapter = viewPager.getAdapter();
        viewPager.m5557f(this.f6999t);
        viewPager.toq(this.f6999t);
        this.f6992k = viewPager;
        WeakReference<AbstractC1288k> weakReference = this.f6997r;
        m5549k(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f6992k;
        if (viewPager != null) {
            m5549k(viewPager.getAdapter(), null);
            this.f6992k.m5557f(null);
            this.f6992k.m5563r(this.f6999t);
            this.f6992k = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (this.f6992k != null) {
            float f2 = this.f6998s;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            zy(this.f7000y, f2, true);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int iMax;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i2);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, (int) (size * 0.2f), -2);
        this.f6996q.measure(childMeasureSpec2, childMeasureSpec);
        this.f6994n.measure(childMeasureSpec2, childMeasureSpec);
        this.f6989g.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i3) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i3);
        } else {
            iMax = Math.max(getMinHeight(), this.f6994n.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i3, this.f6994n.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f6991i) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i2) {
        this.f6990h = i2;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@zurt(from = 0.0d, to = 1.0d) float f2) {
        int i2 = ((int) (f2 * 255.0f)) & 255;
        this.f6993l = i2;
        int i3 = (i2 << 24) | (this.f6988f & C0683f.f50797t8r);
        this.f6996q.setTextColor(i3);
        this.f6989g.setTextColor(i3);
    }

    public void setTextColor(@x2 int i2) {
        this.f6988f = i2;
        this.f6994n.setTextColor(i2);
        int i3 = (this.f6993l << 24) | (this.f6988f & C0683f.f50797t8r);
        this.f6996q.setTextColor(i3);
        this.f6989g.setTextColor(i3);
    }

    public void setTextSize(int i2, float f2) {
        this.f6996q.setTextSize(i2, f2);
        this.f6994n.setTextSize(i2, f2);
        this.f6989g.setTextSize(i2, f2);
    }

    public void setTextSpacing(int i2) {
        this.f6995p = i2;
        requestLayout();
    }

    void toq(int i2, AbstractC1288k abstractC1288k) {
        int iMo5575n = abstractC1288k != null ? abstractC1288k.mo5575n() : 0;
        this.f6991i = true;
        CharSequence charSequenceF7l8 = null;
        this.f6996q.setText((i2 < 1 || abstractC1288k == null) ? null : abstractC1288k.f7l8(i2 - 1));
        this.f6994n.setText((abstractC1288k == null || i2 >= iMo5575n) ? null : abstractC1288k.f7l8(i2));
        int i3 = i2 + 1;
        if (i3 < iMo5575n && abstractC1288k != null) {
            charSequenceF7l8 = abstractC1288k.f7l8(i3);
        }
        this.f6989g.setText(charSequenceF7l8);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f6996q.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f6994n.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f6989g.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f7000y = i2;
        if (!this.f7001z) {
            zy(i2, this.f6998s, false);
        }
        this.f6991i = false;
    }

    void zy(int i2, float f2, boolean z2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (i2 != this.f7000y) {
            toq(i2, this.f6992k.getAdapter());
        } else if (!z2 && f2 == this.f6998s) {
            return;
        }
        this.f7001z = true;
        int measuredWidth = this.f6996q.getMeasuredWidth();
        int measuredWidth2 = this.f6994n.getMeasuredWidth();
        int measuredWidth3 = this.f6989g.getMeasuredWidth();
        int i7 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i8 = paddingRight + i7;
        int i9 = (width - (paddingLeft + i7)) - i8;
        float f3 = 0.5f + f2;
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        int i10 = ((width - i8) - ((int) (i9 * f3))) - i7;
        int i11 = measuredWidth2 + i10;
        int baseline = this.f6996q.getBaseline();
        int baseline2 = this.f6994n.getBaseline();
        int baseline3 = this.f6989g.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i12 = iMax - baseline;
        int i13 = iMax - baseline2;
        int i14 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(this.f6996q.getMeasuredHeight() + i12, this.f6994n.getMeasuredHeight() + i13), this.f6989g.getMeasuredHeight() + i14);
        int i15 = this.f6990h & 112;
        if (i15 == 16) {
            i3 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        } else {
            if (i15 != 80) {
                i4 = i12 + paddingTop;
                i5 = i13 + paddingTop;
                i6 = paddingTop + i14;
                TextView textView = this.f6994n;
                textView.layout(i10, i5, i11, textView.getMeasuredHeight() + i5);
                int iMin = Math.min(paddingLeft, (i10 - this.f6995p) - measuredWidth);
                TextView textView2 = this.f6996q;
                textView2.layout(iMin, i4, measuredWidth + iMin, textView2.getMeasuredHeight() + i4);
                int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i11 + this.f6995p);
                TextView textView3 = this.f6989g;
                textView3.layout(iMax3, i6, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i6);
                this.f6998s = f2;
                this.f7001z = false;
            }
            i3 = (height - paddingBottom) - iMax2;
        }
        i4 = i12 + i3;
        i5 = i13 + i3;
        i6 = i3 + i14;
        TextView textView4 = this.f6994n;
        textView4.layout(i10, i5, i11, textView4.getMeasuredHeight() + i5);
        int iMin2 = Math.min(paddingLeft, (i10 - this.f6995p) - measuredWidth);
        TextView textView22 = this.f6996q;
        textView22.layout(iMin2, i4, measuredWidth + iMin2, textView22.getMeasuredHeight() + i4);
        int iMax32 = Math.max((width - paddingRight) - measuredWidth3, i11 + this.f6995p);
        TextView textView32 = this.f6989g;
        textView32.layout(iMax32, i6, iMax32 + measuredWidth3, textView32.getMeasuredHeight() + i6);
        this.f6998s = f2;
        this.f7001z = false;
    }

    public PagerTitleStrip(@lvui Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7000y = -1;
        this.f6998s = -1.0f;
        this.f6999t = new C1279k();
        TextView textView = new TextView(context);
        this.f6996q = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f6994n = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f6989g = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6984c);
        boolean z2 = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            t8r.a9(this.f6996q, resourceId);
            t8r.a9(this.f6994n, resourceId);
            t8r.a9(this.f6989g, resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.f6996q.setTextColor(color);
            this.f6994n.setTextColor(color);
            this.f6989g.setTextColor(color);
        }
        this.f6990h = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.f6988f = this.f6994n.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(f6986j);
        this.f6996q.setEllipsize(TextUtils.TruncateAt.END);
        this.f6994n.setEllipsize(TextUtils.TruncateAt.END);
        this.f6989g.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f6985e);
            z2 = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z2) {
            setSingleLineAllCaps(this.f6996q);
            setSingleLineAllCaps(this.f6994n);
            setSingleLineAllCaps(this.f6989g);
        } else {
            this.f6996q.setSingleLine();
            this.f6994n.setSingleLine();
            this.f6989g.setSingleLine();
        }
        this.f6995p = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
