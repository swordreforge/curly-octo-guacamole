package miuix.miuixbasewidget.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.t8r;
import java.util.ArrayList;
import miuix.miuixbasewidget.widget.internal.TabViewContainerView;
import miuix.view.C7385p;
import miuix.view.HapticCompat;
import vwb.toq;

/* JADX INFO: loaded from: classes3.dex */
public class FilterSortView2 extends HorizontalScrollView {

    /* JADX INFO: renamed from: g */
    private TabViewContainerView f40576g;

    /* JADX INFO: renamed from: h */
    private final int f40577h;

    /* JADX INFO: renamed from: k */
    private final ArrayList<Integer> f40578k;

    /* JADX INFO: renamed from: n */
    private boolean f40579n;

    /* JADX INFO: renamed from: p */
    @f7l8
    private int f40580p;

    /* JADX INFO: renamed from: q */
    private int f40581q;

    /* JADX INFO: renamed from: s */
    private int f40582s;

    /* JADX INFO: renamed from: y */
    protected boolean f40583y;

    public static class TabView extends FrameLayout {

        /* JADX INFO: renamed from: g */
        private boolean f40584g;

        /* JADX INFO: renamed from: h */
        private InterfaceC7192k f40585h;

        /* JADX INFO: renamed from: i */
        private miuix.util.toq f40586i;

        /* JADX INFO: renamed from: k */
        private TextView f40587k;

        /* JADX INFO: renamed from: n */
        private boolean f40588n;

        /* JADX INFO: renamed from: p */
        private Drawable f40589p;

        /* JADX INFO: renamed from: q */
        private ImageView f40590q;

        /* JADX INFO: renamed from: s */
        private int f40591s;

        /* JADX INFO: renamed from: t */
        private int f40592t;

        /* JADX INFO: renamed from: y */
        private boolean f40593y;

        /* JADX INFO: renamed from: z */
        private int f40594z;

        /* JADX INFO: renamed from: miuix.miuixbasewidget.widget.FilterSortView2$TabView$k */
        public interface InterfaceC7192k {
            /* JADX INFO: renamed from: k */
            void m26096k(TabView tabView, boolean z2);
        }

        public TabView(Context context) {
            this(context, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f7l8() {
            InterfaceC7192k interfaceC7192k = this.f40585h;
            if (interfaceC7192k != null) {
                interfaceC7192k.m26096k(this, true);
            }
        }

        private miuix.util.toq getHapticFeedbackCompat() {
            if (this.f40586i == null) {
                this.f40586i = new miuix.util.toq(getContext());
            }
            return this.f40586i;
        }

        /* JADX INFO: renamed from: s */
        private void m26091s() {
            if (this.f40587k != null) {
                if (m26093g()) {
                    t8r.a9(this.f40587k, this.f40592t);
                } else {
                    t8r.a9(this.f40587k, this.f40594z);
                }
                requestLayout();
            }
        }

        private void setDescending(boolean z2) {
            this.f40584g = z2;
            if (z2) {
                this.f40590q.setRotationX(0.0f);
            } else {
                this.f40590q.setRotationX(180.0f);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFiltered(boolean z2) {
            TabView tabView;
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (z2 && viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if ((childAt instanceof TabView) && (tabView = (TabView) childAt) != this && tabView.f40588n) {
                        tabView.setFiltered(false);
                    }
                }
            }
            this.f40588n = z2;
            m26091s();
            this.f40587k.setActivated(z2);
            this.f40590q.setActivated(z2);
            setActivated(z2);
            if (viewGroup != null && z2) {
                viewGroup.post(new Runnable() { // from class: miuix.miuixbasewidget.widget.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40619k.f7l8();
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: y */
        public /* synthetic */ void m26092y(View.OnClickListener onClickListener, View view) {
            if (!this.f40588n) {
                setFiltered(true);
            } else if (this.f40593y) {
                setDescending(!this.f40584g);
            }
            onClickListener.onClick(view);
            if (HapticCompat.zy(HapticCompat.InterfaceC7379k.f42262b)) {
                getHapticFeedbackCompat().zy(204);
            } else {
                HapticCompat.performHapticFeedback(view, C7385p.f92251qrj);
            }
        }

        /* JADX INFO: renamed from: g */
        public boolean m26093g() {
            return this.f40588n;
        }

        public View getArrowView() {
            return this.f40590q;
        }

        public boolean getDescendingEnabled() {
            return this.f40593y;
        }

        public ImageView getIconView() {
            return this.f40590q;
        }

        protected int getTabLayoutResource() {
            return toq.x2.f96816jp0y;
        }

        public TextView getTextView() {
            return this.f40587k;
        }

        /* JADX INFO: renamed from: n */
        public boolean m26094n() {
            return this.f40584g;
        }

        /* JADX INFO: renamed from: q */
        protected void m26095q(CharSequence charSequence, boolean z2) {
            this.f40590q.setBackground(this.f40589p);
            this.f40587k.setText(charSequence);
            this.f40590q.setVisibility(this.f40591s);
            setDescending(z2);
            m26091s();
        }

        public void setActivatedTextAppearance(int i2) {
            this.f40592t = i2;
            m26091s();
        }

        public void setDescendingEnabled(boolean z2) {
            this.f40593y = z2;
        }

        @Override // android.view.View
        public void setEnabled(boolean z2) {
            super.setEnabled(z2);
            this.f40587k.setEnabled(z2);
        }

        public void setIconView(ImageView imageView) {
            this.f40590q = imageView;
        }

        public void setIndicatorVisibility(int i2) {
            this.f40590q.setVisibility(i2);
        }

        @Override // android.view.View
        public void setOnClickListener(final View.OnClickListener onClickListener) {
            super.setOnClickListener(new View.OnClickListener() { // from class: miuix.miuixbasewidget.widget.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f40641k.m26092y(onClickListener, view);
                }
            });
        }

        public void setOnFilteredListener(InterfaceC7192k interfaceC7192k) {
            this.f40585h = interfaceC7192k;
        }

        public void setTextAppearance(int i2) {
            this.f40594z = i2;
            m26091s();
        }

        public void setTextView(TextView textView) {
            this.f40587k = textView;
        }

        public TabView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, toq.C7713q.f96391c25);
        }

        public TabView(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.f40593y = true;
            LayoutInflater.from(context).inflate(getTabLayoutResource(), (ViewGroup) this, true);
            TextView textView = (TextView) findViewById(R.id.text1);
            this.f40587k = textView;
            textView.setMaxLines(1);
            this.f40587k.setEllipsize(TextUtils.TruncateAt.END);
            this.f40590q = (ImageView) findViewById(toq.C7714s.f96715nmn5);
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.kja0.vj, i2, toq.n7h.ze);
                String string = typedArrayObtainStyledAttributes.getString(toq.kja0.kqdm);
                boolean z2 = typedArrayObtainStyledAttributes.getBoolean(toq.kja0.mo, true);
                this.f40591s = typedArrayObtainStyledAttributes.getInt(toq.kja0.tkle, 0);
                this.f40589p = typedArrayObtainStyledAttributes.getDrawable(toq.kja0.bp0b);
                setBackground(typedArrayObtainStyledAttributes.getDrawable(toq.kja0.gpgg));
                setForeground(typedArrayObtainStyledAttributes.getDrawable(toq.kja0.u2a8));
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.kja0.of0c, toq.f7l8.f95647h7am);
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.kja0.wime, toq.f7l8.f95718vep5);
                findViewById(toq.C7714s.f96699m4).setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
                this.f40594z = typedArrayObtainStyledAttributes.getResourceId(toq.kja0.a800, 0);
                this.f40592t = typedArrayObtainStyledAttributes.getResourceId(toq.kja0.mg, 0);
                typedArrayObtainStyledAttributes.recycle();
                m26095q(string, z2);
            }
            if (getId() == -1) {
                setId(View.generateViewId());
            }
        }
    }

    public FilterSortView2(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: g */
    private void m26083g(TabView tabView, int i2) {
        tabView.setEnabled(this.f40579n);
        tabView.setSelected(this.f40583y);
        f7l8(tabView, i2);
        this.f40578k.add(Integer.valueOf(tabView.getId()));
    }

    /* JADX INFO: renamed from: n */
    private void m26084n(TabView tabView) {
        m26083g(tabView, -1);
    }

    private void n7h() {
        for (int i2 = 0; i2 < this.f40576g.getChildCount(); i2++) {
            View childAt = this.f40576g.getChildAt(i2);
            if (childAt instanceof TabView) {
                ((TabView) childAt).setEnabled(this.f40579n);
            }
        }
    }

    private void qrj() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        TabViewContainerView tabViewContainerView = new TabViewContainerView(getContext());
        this.f40576g = tabViewContainerView;
        tabViewContainerView.setLayoutParams(layoutParams);
        this.f40576g.setHorizontalScrollBarEnabled(false);
        addView(this.f40576g);
    }

    /* JADX INFO: renamed from: s */
    private void m26085s(View view) {
        if (!(view instanceof TabView)) {
            throw new IllegalArgumentException("Illegal View! Only support TabView!");
        }
    }

    private TabView x2() {
        return (TabView) LayoutInflater.from(getContext()).inflate(toq.x2.f96804a9, (ViewGroup) null);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        addView(view, -1);
    }

    public void cdj(int i2) {
        this.f40578k.remove(Integer.valueOf(i2));
    }

    protected void f7l8(TabView tabView, int i2) {
        if (tabView != null) {
            if (i2 > this.f40582s || i2 < 0) {
                this.f40576g.addView(tabView, -1, new FrameLayout.LayoutParams(-2, -2));
            } else {
                this.f40576g.addView(tabView, i2, new FrameLayout.LayoutParams(-2, -2));
            }
            this.f40582s++;
        }
    }

    public boolean getEnabled() {
        return this.f40579n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getTabCount() {
        return this.f40582s;
    }

    /* JADX INFO: renamed from: h */
    protected void m26086h(int i2) {
        if (i2 <= -1) {
            return;
        }
        View childAt = this.f40576g.getChildAt(i2);
        if (childAt instanceof TabView) {
            this.f40576g.removeView(childAt);
            this.f40582s--;
            cdj(childAt.getId());
        }
    }

    protected void ki() {
        if (this.f40578k.isEmpty()) {
            int childCount = this.f40576g.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f40576g.getChildAt(i2);
                if (childAt instanceof TabView) {
                    this.f40578k.add(Integer.valueOf(((TabView) childAt).getId()));
                }
            }
            requestLayout();
        }
    }

    protected void kja0() {
        this.f40576g.removeAllViews();
        m26087p();
        this.f40582s = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TabView ld6(int i2) {
        if (i2 <= -1) {
            return null;
        }
        View childAt = this.f40576g.getChildAt((this.f40576g.getChildCount() - this.f40582s) + i2);
        if (childAt instanceof TabView) {
            return (TabView) childAt;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r9)
            android.content.Context r1 = r8.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            int r2 = r8.f40580p
            r3 = 640(0x280, float:8.97E-43)
            r4 = 2
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1
            r7 = 0
            if (r2 != 0) goto L3a
            float r0 = (float) r0
            float r0 = r0 * r5
            float r0 = r0 / r1
            int r0 = (int) r0
            android.content.Context r2 = r8.getContext()
            android.graphics.Point r2 = miuix.core.util.C7085q.n7h(r2)
            int r2 = r2.x
            float r2 = (float) r2
            float r2 = r2 * r5
            float r2 = r2 / r1
            int r1 = (int) r2
            int r2 = r8.f40577h
            if (r2 != r4) goto L5a
            r2 = 410(0x19a, float:5.75E-43)
            if (r0 <= r2) goto L5a
            if (r1 <= r3) goto L5a
            goto L54
        L3a:
            if (r2 != r6) goto L51
            android.content.Context r0 = r8.getContext()
            android.graphics.Point r0 = miuix.core.util.C7085q.n7h(r0)
            int r0 = r0.x
            float r0 = (float) r0
            float r0 = r0 * r5
            float r0 = r0 / r1
            int r0 = (int) r0
            int r1 = r8.f40577h
            if (r1 != r4) goto L5a
            if (r0 <= r3) goto L5a
            goto L54
        L51:
            r0 = 3
            if (r2 != r0) goto L56
        L54:
            r4 = r6
            goto L5b
        L56:
            r0 = 4
            if (r2 != r0) goto L5a
            goto L5b
        L5a:
            r4 = r7
        L5b:
            miuix.miuixbasewidget.widget.internal.TabViewContainerView r0 = r8.f40576g
            r0.setTabViewLayoutMode(r4)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.miuixbasewidget.widget.FilterSortView2.onMeasure(int, int):void");
    }

    /* JADX INFO: renamed from: p */
    public void m26087p() {
        this.f40578k.clear();
    }

    /* JADX INFO: renamed from: q */
    public TabView m26088q(CharSequence charSequence, boolean z2) {
        TabView tabViewX2 = x2();
        m26084n(tabViewX2);
        tabViewX2.m26095q(charSequence, z2);
        return tabViewX2;
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (this.f40579n != z2) {
            this.f40579n = z2;
            n7h();
        }
    }

    public void setFilteredTab(TabView tabView) {
        if (this.f40581q != tabView.getId()) {
            this.f40581q = tabView.getId();
        }
        tabView.setFiltered(true);
        ki();
    }

    public void setLayoutConfig(@f7l8 int i2) {
        if (this.f40580p != i2) {
            this.f40580p = i2;
            requestLayout();
        }
    }

    public void setParentApplyBlur(boolean z2) {
        if (this.f40583y != z2) {
            this.f40583y = z2;
        }
        TabViewContainerView tabViewContainerView = this.f40576g;
        if (tabViewContainerView != null) {
            int childCount = tabViewContainerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = tabViewContainerView.getChildAt(i2);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).setSelected(z2);
                }
            }
        }
    }

    public void setTabIndicatorVisibility(int i2) {
        for (int i3 = 0; i3 < this.f40576g.getChildCount(); i3++) {
            View childAt = this.f40576g.getChildAt(i3);
            if (childAt instanceof TabView) {
                ((TabView) childAt).setIndicatorVisibility(i2);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m26089y(int i2) {
        this.f40578k.add(Integer.valueOf(i2));
    }

    public TabView zy(CharSequence charSequence) {
        return m26088q(charSequence, true);
    }

    public FilterSortView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, toq.C7713q.f96532uo);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        if (view == null) {
            throw new IllegalArgumentException("Cannot add a null child view to a ViewGroup");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i2, layoutParams);
    }

    public FilterSortView2(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f40578k = new ArrayList<>();
        this.f40581q = -1;
        this.f40583y = false;
        this.f40582s = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.kja0.ta, i2, toq.n7h.s9de);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(toq.kja0.az);
        this.f40579n = typedArrayObtainStyledAttributes.getBoolean(toq.kja0.gue, true);
        this.f40580p = typedArrayObtainStyledAttributes.getInt(toq.kja0.pku, 0);
        typedArrayObtainStyledAttributes.recycle();
        qrj();
        setBackground(drawable);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f40577h = miuix.os.zy.m26179k(context);
        setOverScrollMode(2);
    }

    public void setFilteredTab(int i2) {
        TabView tabViewLd6 = ld6(i2);
        if (tabViewLd6 != null) {
            if (this.f40581q != tabViewLd6.getId()) {
                this.f40581q = tabViewLd6.getId();
            }
            tabViewLd6.setFiltered(true);
        }
        ki();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, (ViewGroup.LayoutParams) null);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (this.f40576g == view) {
            super.addView(view, i2, layoutParams);
        } else {
            m26085s(view);
            m26083g((TabView) view, i2);
        }
    }
}
