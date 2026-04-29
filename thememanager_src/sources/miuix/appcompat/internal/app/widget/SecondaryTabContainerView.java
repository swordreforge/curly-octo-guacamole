package miuix.appcompat.internal.app.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0096k;
import gb.toq;
import java.lang.ref.WeakReference;
import miuix.appcompat.app.AbstractC6946k;
import miuix.appcompat.widget.C7061k;
import miuix.internal.util.C7164n;
import miuix.miuixbasewidget.widget.FilterSortView2;

/* JADX INFO: loaded from: classes3.dex */
public class SecondaryTabContainerView extends FilterSortView2 implements AbstractC6946k.k {

    /* JADX INFO: renamed from: i */
    private ViewOnClickListenerC6987k f39222i;

    /* JADX INFO: renamed from: l */
    private int f39223l;

    /* JADX INFO: renamed from: r */
    private int f39224r;

    /* JADX INFO: renamed from: t */
    private boolean f39225t;

    /* JADX INFO: renamed from: z */
    private int f39226z;

    public static class SecondaryTabView extends FilterSortView2.TabView {

        /* JADX INFO: renamed from: c */
        private final C7061k f39227c;

        /* JADX INFO: renamed from: e */
        private boolean f39228e;

        /* JADX INFO: renamed from: f */
        private View f39229f;

        /* JADX INFO: renamed from: j */
        private boolean f39230j;

        /* JADX INFO: renamed from: l */
        private SecondaryTabContainerView f39231l;

        /* JADX INFO: renamed from: r */
        private AbstractC0096k.g f39232r;

        public SecondaryTabView(Context context) {
            this(context, null);
        }

        private void cdj() {
            C7061k c7061k = this.f39227c;
            if (c7061k != null) {
                c7061k.m25484q();
            }
        }

        private void fn3e() {
            ImageView iconView = getIconView();
            if (iconView != null) {
                iconView.setImageDrawable(this.f39232r.zy());
            }
        }

        /* JADX INFO: renamed from: i */
        private void m25205i() {
            if (this.f39228e) {
                kja0();
            } else {
                cdj();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ki(CharSequence charSequence) {
            super.m26095q(charSequence, true);
        }

        private void kja0() {
            C7061k c7061k = this.f39227c;
            if (c7061k != null) {
                c7061k.m25482k(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBadgeDisappearOnClick(boolean z2) {
            this.f39230j = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBadgeNeeded(boolean z2) {
            this.f39228e = z2;
            m25205i();
        }

        public AbstractC0096k.g getTab() {
            return this.f39232r;
        }

        /* JADX INFO: renamed from: h */
        public void m25207h(AbstractC0096k.g gVar) {
            this.f39232r = gVar;
            t8r();
        }

        void n7h(SecondaryTabContainerView secondaryTabContainerView, AbstractC0096k.g gVar) {
            this.f39231l = secondaryTabContainerView;
            this.f39232r = gVar;
            t8r();
        }

        @Override // android.view.View
        protected void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            fn3e();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            m25205i();
        }

        public void t8r() {
            AbstractC0096k.g gVar = this.f39232r;
            View qVar = gVar.toq();
            ImageView iconView = getIconView();
            TextView textView = getTextView();
            if (qVar != null) {
                this.f39229f = this.f39231l.m25204t(this, qVar, textView, iconView);
                return;
            }
            View view = this.f39229f;
            if (view != null) {
                removeView(view);
                this.f39229f = null;
            }
            Context context = getContext();
            Drawable drawableZy = gVar.zy();
            CharSequence charSequenceMo177g = gVar.mo177g();
            if (drawableZy != null) {
                if (iconView == null) {
                    ImageView imageView = new ImageView(context);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    imageView.setLayoutParams(layoutParams);
                    addView(imageView, 0);
                    setIconView(imageView);
                } else {
                    iconView.setImageDrawable(drawableZy);
                    iconView.setVisibility(0);
                }
            } else if (iconView != null) {
                iconView.setVisibility(8);
                iconView.setImageDrawable(null);
            }
            if (charSequenceMo177g != null) {
                if (textView == null) {
                    TextView textView2 = new TextView(context);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    textView2.setLayoutParams(layoutParams2);
                    addView(textView2);
                    setTextView(textView2);
                } else {
                    textView.setText(charSequenceMo177g);
                    textView.setVisibility(0);
                }
            } else if (textView != null) {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            }
            if (iconView != null) {
                iconView.setContentDescription(gVar.mo179k());
            }
        }

        public SecondaryTabView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public SecondaryTabView(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.f39228e = false;
            this.f39230j = true;
            this.f39227c = new C7061k(context, 2);
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.SecondaryTabContainerView$k */
    private static class ViewOnClickListenerC6987k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        private WeakReference<SecondaryTabContainerView> f39233k;

        ViewOnClickListenerC6987k(SecondaryTabContainerView secondaryTabContainerView) {
            this.f39233k = new WeakReference<>(secondaryTabContainerView);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WeakReference<SecondaryTabContainerView> weakReference = this.f39233k;
            SecondaryTabContainerView secondaryTabContainerView = weakReference != null ? weakReference.get() : null;
            if (secondaryTabContainerView == null) {
                return;
            }
            SecondaryTabView secondaryTabView = (SecondaryTabView) view;
            secondaryTabView.getTab().f7l8();
            int tabCount = secondaryTabContainerView.getTabCount();
            for (int i2 = 0; i2 < tabCount; i2++) {
                FilterSortView2.TabView tabViewLd6 = secondaryTabContainerView.ld6(i2);
                tabViewLd6.setActivated(tabViewLd6 == view);
            }
            if (secondaryTabView.f39230j) {
                secondaryTabView.setBadgeNeeded(false);
            }
        }
    }

    public SecondaryTabContainerView(Context context) {
        super(context);
        m25203z(context);
    }

    /* JADX INFO: renamed from: z */
    private void m25203z(Context context) {
        this.f39224r = C7164n.zy(context, getDefaultTabTextStyle());
        this.f39223l = C7164n.zy(context, getTabActivatedTextStyle());
    }

    @Override // miuix.appcompat.app.AbstractC6946k.k
    public void d3(int i2, float f2, boolean z2, boolean z3) {
    }

    public SecondaryTabView fn3e(AbstractC0096k.g gVar, int i2, boolean z2) {
        SecondaryTabView secondaryTabViewFu4 = fu4(gVar);
        f7l8(secondaryTabViewFu4, i2);
        m26089y(secondaryTabViewFu4.getId());
        secondaryTabViewFu4.ki(gVar.mo177g());
        secondaryTabViewFu4.setSelected(this.f40583y);
        if (z2) {
            setFilteredTab(secondaryTabViewFu4);
            secondaryTabViewFu4.setActivated(true);
        }
        requestLayout();
        return secondaryTabViewFu4;
    }

    protected SecondaryTabView fu4(AbstractC0096k.g gVar) {
        SecondaryTabView secondaryTabView = (SecondaryTabView) LayoutInflater.from(getContext()).inflate(toq.qrj.f76690d3, (ViewGroup) null);
        secondaryTabView.n7h(this, gVar);
        secondaryTabView.setFocusable(true);
        if (this.f39222i == null) {
            this.f39222i = new ViewOnClickListenerC6987k(this);
        }
        secondaryTabView.setOnClickListener(this.f39222i);
        secondaryTabView.setEnabled(getEnabled());
        secondaryTabView.setTextAppearance(this.f39224r);
        secondaryTabView.setActivatedTextAppearance(this.f39223l);
        return secondaryTabView;
    }

    protected int getDefaultTabTextStyle() {
        return toq.C6055q.f76475a98o;
    }

    protected int getTabActivatedTextStyle() {
        return toq.C6055q.f34927o;
    }

    int getTabContainerHeight() {
        return -2;
    }

    @Override // miuix.appcompat.app.AbstractC6946k.k
    /* JADX INFO: renamed from: k */
    public void mo6476k(int i2) {
    }

    public void mcp(int i2) {
        FilterSortView2.TabView tabViewLd6 = ld6(i2);
        if (tabViewLd6 instanceof SecondaryTabView) {
            ((SecondaryTabView) tabViewLd6).t8r();
        }
        if (this.f39225t) {
            requestLayout();
        }
    }

    public void ni7(int i2) {
        setFilteredTab(i2);
    }

    public void o1t() {
        kja0();
        m26087p();
        if (this.f39225t) {
            requestLayout();
        }
    }

    @Override // miuix.miuixbasewidget.widget.FilterSortView2, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4 = this.f39226z;
        if (i4 != -2) {
            i3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    public void setAllowCollapse(boolean z2) {
        this.f39225t = z2;
    }

    public void setBadgeVisibility(int i2, boolean z2) {
        if (i2 >= getTabCount()) {
            return;
        }
        FilterSortView2.TabView tabViewLd6 = ld6(i2);
        if (tabViewLd6 instanceof SecondaryTabView) {
            ((SecondaryTabView) tabViewLd6).setBadgeNeeded(z2);
        }
    }

    protected void setContentHeight(int i2) {
        if (this.f39226z != i2) {
            this.f39226z = i2;
            requestLayout();
        }
    }

    public void setTabBadgeDisappearOnClick(int i2, boolean z2) {
        if (i2 >= getTabCount()) {
            return;
        }
        FilterSortView2.TabView tabViewLd6 = ld6(i2);
        if (tabViewLd6 instanceof SecondaryTabView) {
            ((SecondaryTabView) tabViewLd6).setBadgeDisappearOnClick(z2);
        }
    }

    public void setTabIconWithPosition(int i2, int i3, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        FilterSortView2.TabView tabViewLd6;
        TextView textView;
        if (i2 > getChildCount() - 1 || (tabViewLd6 = ld6(i2)) == null || (textView = tabViewLd6.getTextView()) == null) {
            return;
        }
        textView.setCompoundDrawablePadding(i3);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public void setTabSelected(int i2) {
        setFilteredTab(i2);
    }

    @Deprecated
    public void setTextAppearance(int i2, int i3) {
        setTextAppearance(i2, i3, i3);
    }

    /* JADX INFO: renamed from: t */
    protected View m25204t(ViewGroup viewGroup, View view, TextView textView, ImageView imageView) {
        return null;
    }

    @Override // miuix.appcompat.app.AbstractC6946k.k
    public void toq(int i2) {
        FilterSortView2.TabView tabViewLd6 = ld6(i2);
        if (tabViewLd6 instanceof SecondaryTabView) {
            setFilteredTab(tabViewLd6);
        }
    }

    public void wvg(int i2) {
        FilterSortView2.TabView tabViewLd6 = ld6(i2);
        if (tabViewLd6 instanceof SecondaryTabView) {
            m26086h(i2);
            cdj(tabViewLd6.getId());
        }
        if (this.f39225t) {
            requestLayout();
        }
    }

    public SecondaryTabView zurt(AbstractC0096k.g gVar, boolean z2) {
        SecondaryTabView secondaryTabViewFu4 = fu4(gVar);
        f7l8(secondaryTabViewFu4, -1);
        m26089y(secondaryTabViewFu4.getId());
        secondaryTabViewFu4.ki(gVar.mo177g());
        secondaryTabViewFu4.setSelected(this.f40583y);
        if (z2) {
            setFilteredTab(secondaryTabViewFu4);
            secondaryTabViewFu4.setActivated(true);
        }
        requestLayout();
        return secondaryTabViewFu4;
    }

    public void setTextAppearance(int i2, int i3, int i4) {
        FilterSortView2.TabView tabViewLd6;
        if (i2 < 0 || i2 >= getTabCount() || (tabViewLd6 = ld6(i2)) == null) {
            return;
        }
        tabViewLd6.setTextAppearance(i3);
        tabViewLd6.setActivatedTextAppearance(i4);
    }

    public SecondaryTabContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25203z(context);
    }

    public SecondaryTabContainerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        m25203z(context);
    }
}
