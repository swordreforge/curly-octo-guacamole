package miuix.miuixbasewidget.widget;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.constraintlayout.widget.C0397q;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.property.ViewProperty;
import miuix.view.C7380g;
import miuix.view.C7385p;
import miuix.view.HapticCompat;
import vwb.toq;

/* JADX INFO: loaded from: classes3.dex */
public class FilterSortView extends ConstraintLayout {
    private static final String aj = "miuix:FilterSortView";
    public static final int bs = 0;
    public static final int k0 = 8;
    private boolean ac;
    private boolean ad;
    private int am;
    private int as;
    private final int ax;
    private TabView.InterfaceC7190q ay;
    private boolean az;
    private View ba;
    private TabView.zy be;
    private TabView bg;
    private List<Integer> bl;
    private boolean bq;

    public static class TabView extends LinearLayout {

        /* JADX INFO: renamed from: g */
        private boolean f40558g;

        /* JADX INFO: renamed from: h */
        private Drawable f40559h;

        /* JADX INFO: renamed from: i */
        private ColorStateList f40560i;

        /* JADX INFO: renamed from: k */
        private TextView f40561k;

        /* JADX INFO: renamed from: n */
        private boolean f40562n;

        /* JADX INFO: renamed from: p */
        private FilterSortView f40563p;

        /* JADX INFO: renamed from: q */
        private ImageView f40564q;

        /* JADX INFO: renamed from: r */
        private miuix.util.toq f40565r;

        /* JADX INFO: renamed from: s */
        private int f40566s;

        /* JADX INFO: renamed from: t */
        private zy f40567t;

        /* JADX INFO: renamed from: y */
        private boolean f40568y;

        /* JADX INFO: renamed from: z */
        private InterfaceC7190q f40569z;

        /* JADX INFO: renamed from: miuix.miuixbasewidget.widget.FilterSortView$TabView$k */
        class RunnableC7189k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ boolean f40570k;

            RunnableC7189k(boolean z2) {
                this.f40570k = z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (TabView.this.f40569z == null || !this.f40570k) {
                    return;
                }
                TabView.this.f40569z.mo26080k(TabView.this, this.f40570k);
            }
        }

        /* JADX INFO: renamed from: miuix.miuixbasewidget.widget.FilterSortView$TabView$q */
        public interface InterfaceC7190q {
            /* JADX INFO: renamed from: k */
            void mo26080k(TabView tabView, boolean z2);
        }

        class toq implements View.OnClickListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ View.OnClickListener f40572k;

            toq(View.OnClickListener onClickListener) {
                this.f40572k = onClickListener;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!TabView.this.f40562n) {
                    TabView.this.setFiltered(true);
                } else if (TabView.this.f40568y) {
                    TabView tabView = TabView.this;
                    tabView.setDescending(true ^ tabView.f40558g);
                }
                this.f40572k.onClick(view);
                if (HapticCompat.zy(HapticCompat.InterfaceC7379k.f42262b)) {
                    TabView.this.getHapticFeedbackCompat().zy(204);
                } else {
                    HapticCompat.performHapticFeedback(view, C7385p.f92251qrj);
                }
            }
        }

        private interface zy {
            /* JADX INFO: renamed from: k */
            void mo26081k();

            /* JADX INFO: renamed from: q */
            void mo26082q();

            void toq();

            void zy(float f2, float f3);
        }

        public TabView(Context context) {
            this(context, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public miuix.util.toq getHapticFeedbackCompat() {
            if (this.f40565r == null) {
                this.f40565r = new miuix.util.toq(getContext());
            }
            return this.f40565r;
        }

        private Drawable n7h() {
            return getResources().getDrawable(toq.C7715y.nc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean qrj(View view, MotionEvent motionEvent) {
            if (this.f40567t == null || motionEvent.getSource() == 4098) {
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 9) {
                if (this.f40562n) {
                    this.f40567t.toq();
                }
                this.f40567t.mo26082q();
                return true;
            }
            if (actionMasked != 10) {
                return true;
            }
            if (this.f40562n) {
                this.f40567t.mo26081k();
            }
            this.f40567t.zy(motionEvent.getX() + getLeft(), motionEvent.getY());
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescending(boolean z2) {
            this.f40558g = z2;
            if (z2) {
                this.f40564q.setRotationX(0.0f);
            } else {
                this.f40564q.setRotationX(180.0f);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFiltered(boolean z2) {
            TabView tabView;
            FilterSortView filterSortView = (FilterSortView) getParent();
            this.f40563p = filterSortView;
            if (z2 && filterSortView != null) {
                int childCount = filterSortView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = this.f40563p.getChildAt(i2);
                    if ((childAt instanceof TabView) && (tabView = (TabView) childAt) != this && tabView.f40562n) {
                        tabView.setFiltered(false);
                    }
                }
            }
            this.f40562n = z2;
            this.f40561k.setSelected(z2);
            this.f40564q.setSelected(z2);
            setSelected(z2);
            this.f40563p.setNeedAnim(true);
            this.f40563p.post(new RunnableC7189k(z2));
        }

        public View getArrowView() {
            return this.f40564q;
        }

        public boolean getDescendingEnabled() {
            return this.f40568y;
        }

        public ImageView getIconView() {
            return this.f40564q;
        }

        protected int getTabLayoutResource() {
            return toq.x2.f96812fti;
        }

        public TextView getTextView() {
            return this.f40561k;
        }

        protected void ld6(CharSequence charSequence, boolean z2) {
            setGravity(17);
            if (getBackground() == null) {
                setBackground(n7h());
            }
            this.f40564q.setBackground(this.f40559h);
            ColorStateList colorStateList = this.f40560i;
            if (colorStateList != null) {
                this.f40561k.setTextColor(colorStateList);
            }
            this.f40561k.setText(charSequence);
            setDescending(z2);
            setOnHoverListener(new View.OnHoverListener() { // from class: miuix.miuixbasewidget.widget.q
                @Override // android.view.View.OnHoverListener
                public final boolean onHover(View view, MotionEvent motionEvent) {
                    return this.f40643k.qrj(view, motionEvent);
                }
            });
        }

        public void setDescendingEnabled(boolean z2) {
            this.f40568y = z2;
        }

        @Override // android.view.View
        public void setEnabled(boolean z2) {
            super.setEnabled(z2);
            this.f40561k.setEnabled(z2);
        }

        public void setFilterHoverListener(zy zyVar) {
            this.f40567t = zyVar;
        }

        public void setIconView(ImageView imageView) {
            this.f40564q = imageView;
        }

        public void setIndicatorVisibility(int i2) {
            this.f40564q.setVisibility(i2);
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(new toq(onClickListener));
        }

        public void setOnFilteredListener(InterfaceC7190q interfaceC7190q) {
            this.f40569z = interfaceC7190q;
        }

        public void setTextView(TextView textView) {
            this.f40561k = textView;
        }

        public boolean x2() {
            return this.f40558g;
        }

        public TabView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public TabView(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.f40568y = true;
            int tabLayoutResource = getTabLayoutResource();
            LayoutInflater.from(context).inflate(tabLayoutResource, (ViewGroup) this, true);
            this.f40561k = (TextView) findViewById(R.id.text1);
            this.f40564q = (ImageView) findViewById(toq.C7714s.f96715nmn5);
            if (attributeSet != null && tabLayoutResource == toq.x2.f96812fti) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.kja0.zx, i2, toq.n7h.xknm);
                String string = typedArrayObtainStyledAttributes.getString(toq.kja0.ooto);
                boolean z2 = typedArrayObtainStyledAttributes.getBoolean(toq.kja0.vce, true);
                this.f40566s = typedArrayObtainStyledAttributes.getInt(toq.kja0.nd9, 0);
                this.f40559h = typedArrayObtainStyledAttributes.getDrawable(toq.kja0.l2gr);
                this.f40560i = typedArrayObtainStyledAttributes.getColorStateList(toq.kja0.b0);
                typedArrayObtainStyledAttributes.recycle();
                ld6(string, z2);
            }
            this.f40564q.setVisibility(this.f40566s);
            if (getId() == -1) {
                setId(View.generateViewId());
            }
        }
    }

    /* JADX INFO: renamed from: miuix.miuixbasewidget.widget.FilterSortView$k */
    class C7191k implements TabView.InterfaceC7190q {
        C7191k() {
        }

        @Override // miuix.miuixbasewidget.widget.FilterSortView.TabView.InterfaceC7190q
        /* JADX INFO: renamed from: k */
        public void mo26080k(TabView tabView, boolean z2) {
            FilterSortView.this.m26072x();
            if (z2 && FilterSortView.this.bg.getVisibility() == 0 && FilterSortView.this.ac && !FilterSortView.this.ad) {
                Folme.useAt(FilterSortView.this.bg).state().setFlags(1L).to(new AnimState(zurt.InterfaceC0290k.f47416lvui).add(ViewProperty.f38713X, tabView.getX()).add(ViewProperty.WIDTH, tabView.getWidth()), new AnimConfig[0]);
                FilterSortView.this.ac = false;
                FilterSortView.this.ad = true;
            }
            if (z2) {
                FilterSortView.this.as = tabView.getId();
            }
        }
    }

    class toq implements TabView.zy {
        toq() {
        }

        @Override // miuix.miuixbasewidget.widget.FilterSortView.TabView.zy
        /* JADX INFO: renamed from: k */
        public void mo26081k() {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(FilterSortView.this.bg, "scaleX", FilterSortView.this.bg.getScaleX(), 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(FilterSortView.this.bg, "scaleY", FilterSortView.this.bg.getScaleY(), 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(350L);
            animatorSet.setInterpolator(new DecelerateInterpolator(1.5f));
            animatorSet.start();
        }

        @Override // miuix.miuixbasewidget.widget.FilterSortView.TabView.zy
        /* JADX INFO: renamed from: q */
        public void mo26082q() {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(FilterSortView.this.ba, "alpha", FilterSortView.this.ba.getAlpha(), 1.0f);
            objectAnimatorOfFloat.setDuration(350L);
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.5f));
            objectAnimatorOfFloat.start();
        }

        @Override // miuix.miuixbasewidget.widget.FilterSortView.TabView.zy
        public void toq() {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(FilterSortView.this.bg, "scaleX", FilterSortView.this.bg.getScaleX(), 1.05f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(FilterSortView.this.bg, "scaleY", FilterSortView.this.bg.getScaleY(), 1.05f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(350L);
            animatorSet.setInterpolator(new DecelerateInterpolator(1.5f));
            animatorSet.start();
        }

        @Override // miuix.miuixbasewidget.widget.FilterSortView.TabView.zy
        public void zy(float f2, float f3) {
            if (f2 < FilterSortView.this.ax || f3 < 0.0f || f2 > (FilterSortView.this.getRight() - FilterSortView.this.getLeft()) - (FilterSortView.this.ax * 2) || f3 > (FilterSortView.this.getBottom() - FilterSortView.this.getTop()) - (FilterSortView.this.ax * 2)) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(FilterSortView.this.ba, "alpha", FilterSortView.this.ba.getAlpha(), 0.0f);
                objectAnimatorOfFloat.setDuration(350L);
                objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.5f));
                objectAnimatorOfFloat.start();
            }
        }
    }

    public FilterSortView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bo(ConstraintLayout.toq toqVar) {
        this.bg.setLayoutParams(toqVar);
    }

    private TabView lv5() {
        return (TabView) LayoutInflater.from(getContext()).inflate(toq.x2.f96815jk, (ViewGroup) null);
    }

    private void t8iq(Drawable drawable) {
        TabView tabViewLv5 = lv5();
        this.bg = tabViewLv5;
        tabViewLv5.setBackground(drawable);
        this.bg.f40564q.setVisibility(8);
        this.bg.f40561k.setVisibility(8);
        this.bg.setVisibility(4);
        this.bg.setEnabled(this.az);
        addView(this.bg);
    }

    /* JADX INFO: renamed from: u */
    private void m26069u() {
        ConstraintLayout.toq toqVar = new ConstraintLayout.toq(0, 0);
        View view = new View(getContext());
        this.ba = view;
        view.setLayoutParams(toqVar);
        this.ba.setId(View.generateViewId());
        this.ba.setBackgroundResource(toq.C7715y.f97000vwb);
        this.ba.setAlpha(0.0f);
        addView(this.ba);
        C0397q c0397q = new C0397q();
        c0397q.gvn7(this);
        c0397q.eqxt(this.ba.getId(), 3, getId(), 3);
        c0397q.eqxt(this.ba.getId(), 4, getId(), 4);
        c0397q.eqxt(this.ba.getId(), 6, getId(), 6);
        c0397q.eqxt(this.ba.getId(), 7, getId(), 7);
        c0397q.ki(this);
    }

    /* JADX INFO: renamed from: v */
    private void m26070v(TabView tabView) {
        if (this.bg.getVisibility() != 0) {
            this.bg.setVisibility(0);
        }
        final ConstraintLayout.toq toqVar = (ConstraintLayout.toq) this.bg.getLayoutParams();
        this.bg.setX(tabView.getX());
        this.bg.setY(this.ax);
        post(new Runnable() { // from class: miuix.miuixbasewidget.widget.zy
            @Override // java.lang.Runnable
            public final void run() {
                this.f40652k.bo(toqVar);
            }
        });
    }

    private void y2() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof TabView) {
                ((TabView) childAt).setEnabled(this.az);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m26071a(TabView tabView, int i2) {
        if (tabView != null) {
            if (i2 > this.am || i2 < 0) {
                addView(tabView);
            } else {
                addView(tabView, (getChildCount() - this.am) + i2);
            }
            this.am++;
        }
    }

    public TabView a98o(CharSequence charSequence, boolean z2) {
        TabView tabViewLv5 = lv5();
        tabViewLv5.setOnFilteredListener(this.ay);
        tabViewLv5.setEnabled(this.az);
        tabViewLv5.setFilterHoverListener(this.be);
        this.bq = false;
        this.ac = false;
        addView(tabViewLv5);
        this.am++;
        this.bl.add(Integer.valueOf(tabViewLv5.getId()));
        C0397q c0397q = new C0397q();
        c0397q.gvn7(this);
        ikck(c0397q);
        c0397q.ki(this);
        tabViewLv5.ld6(charSequence, z2);
        return tabViewLv5;
    }

    protected void c8jq() {
        removeAllViews();
        this.am = 0;
    }

    public void ch() {
        this.bl.clear();
    }

    public void dr(int i2) {
        this.bl.remove(Integer.valueOf(i2));
    }

    public boolean getEnabled() {
        return this.az;
    }

    public TabView.zy getFilterHoverListener() {
        return this.be;
    }

    public TabView.InterfaceC7190q getOnFilteredListener() {
        return this.ay;
    }

    protected int getTabCount() {
        return this.am;
    }

    protected void gyi(int i2) {
        if (i2 <= -1) {
            return;
        }
        int childCount = (getChildCount() - this.am) + i2;
        if (getChildAt(childCount) instanceof TabView) {
            removeViewAt(childCount);
        }
        this.am--;
    }

    public TabView i1(CharSequence charSequence) {
        return a98o(charSequence, true);
    }

    protected void ikck(C0397q c0397q) {
        int i2 = 0;
        while (i2 < this.bl.size()) {
            int iIntValue = this.bl.get(i2).intValue();
            c0397q.lrht(iIntValue, 0);
            c0397q.x9kr(iIntValue, -2);
            c0397q.uj2j(iIntValue, 1.0f);
            int iIntValue2 = i2 == 0 ? 0 : this.bl.get(i2 - 1).intValue();
            int iIntValue3 = i2 == this.bl.size() + (-1) ? 0 : this.bl.get(i2 + 1).intValue();
            c0397q.mcp(iIntValue, 0);
            c0397q.d2ok(iIntValue, 6, iIntValue2, iIntValue2 == 0 ? 6 : 7, iIntValue2 == 0 ? this.ax : 0);
            c0397q.d2ok(iIntValue, 7, iIntValue3, iIntValue3 == 0 ? 7 : 6, iIntValue3 == 0 ? this.ax : 0);
            c0397q.d2ok(iIntValue, 3, 0, 3, this.ax);
            c0397q.d2ok(iIntValue, 4, 0, 4, this.ax);
            i2++;
        }
    }

    protected TabView nmn5(int i2) {
        if (i2 <= -1) {
            return null;
        }
        View childAt = getChildAt((getChildCount() - this.am) + i2);
        if (childAt instanceof TabView) {
            return (TabView) childAt;
        }
        return null;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.bq = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        TabView tabView;
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.bg.getVisibility() != 8) {
            int left = this.bg.getLeft();
            int i6 = this.ax;
            this.bg.layout(left, i6, this.bg.getMeasuredWidth() + left, this.bg.getMeasuredHeight() + i6);
        }
        int i7 = this.as;
        if (i7 == -1 || this.bq || (tabView = (TabView) findViewById(i7)) == null) {
            return;
        }
        m26070v(tabView);
        if (tabView.getWidth() > 0) {
            this.bq = true;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.as == -1 || this.bg.getVisibility() == 8) {
            return;
        }
        this.bg.measure(View.MeasureSpec.makeMeasureSpec(((TabView) findViewById(this.as)).getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - (this.ax * 2), 1073741824));
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (this.az != z2) {
            this.az = z2;
            y2();
        }
    }

    public void setFilteredTab(TabView tabView) {
        if (this.as != tabView.getId()) {
            this.ac = this.as != -1;
            this.ad = false;
            this.as = tabView.getId();
        } else if (this.ad) {
            this.ac = false;
        }
        tabView.setFiltered(true);
        xwq3();
    }

    protected void setFilteredUpdated(boolean z2) {
        this.bq = z2;
    }

    protected void setNeedAnim(boolean z2) {
        this.ac = z2;
        this.ad = false;
    }

    public void setTabIncatorVisibility(int i2) {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof TabView) {
                ((TabView) childAt).setIndicatorVisibility(i2);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m26072x() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == this.bg) {
                return;
            }
        }
        addView(this.bg, 0);
    }

    protected void xwq3() {
        if (this.bl.size() == 0) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof TabView) {
                    TabView tabView = (TabView) childAt;
                    if (tabView.getId() != this.bg.getId()) {
                        tabView.setOnFilteredListener(this.ay);
                        this.bl.add(Integer.valueOf(tabView.getId()));
                        tabView.setFilterHoverListener(this.be);
                    }
                }
            }
            C0397q c0397q = new C0397q();
            c0397q.gvn7(this);
            ikck(c0397q);
            c0397q.ki(this);
        }
    }

    public void zp(int i2) {
        this.bl.add(Integer.valueOf(i2));
    }

    public FilterSortView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FilterSortView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.bl = new ArrayList();
        this.as = -1;
        this.az = true;
        this.bq = false;
        this.ac = false;
        this.ad = false;
        this.am = 0;
        this.ay = new C7191k();
        this.be = new toq();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.kja0.qlt6, i2, toq.n7h.ff8y);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(toq.kja0.ja);
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(toq.kja0.t2d);
        this.az = typedArrayObtainStyledAttributes.getBoolean(toq.kja0.nxzp, true);
        typedArrayObtainStyledAttributes.recycle();
        this.ax = getResources().getDimensionPixelSize(toq.f7l8.f95629ebn);
        setBackground(drawable);
        m26069u();
        t8iq(drawable2);
        C7380g.toq(this, false);
    }

    public void setFilteredTab(int i2) {
        TabView tabViewNmn5 = nmn5(i2);
        if (tabViewNmn5 != null) {
            if (this.as != tabViewNmn5.getId()) {
                this.ac = this.as != -1;
                this.ad = false;
                this.as = tabViewNmn5.getId();
            } else if (this.ad) {
                this.ac = false;
            }
            tabViewNmn5.setFiltered(true);
        }
        xwq3();
    }
}
