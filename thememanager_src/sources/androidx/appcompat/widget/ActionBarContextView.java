package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C0683f;
import androidx.core.view.gyi;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class ActionBarContextView extends AbstractC0197k {

    /* JADX INFO: renamed from: a */
    private int f609a;

    /* JADX INFO: renamed from: b */
    private boolean f610b;

    /* JADX INFO: renamed from: c */
    private LinearLayout f611c;

    /* JADX INFO: renamed from: e */
    private TextView f612e;

    /* JADX INFO: renamed from: f */
    private View f613f;

    /* JADX INFO: renamed from: j */
    private TextView f614j;

    /* JADX INFO: renamed from: l */
    private View f615l;

    /* JADX INFO: renamed from: m */
    private int f616m;

    /* JADX INFO: renamed from: o */
    private int f617o;

    /* JADX INFO: renamed from: r */
    private View f618r;

    /* JADX INFO: renamed from: t */
    private CharSequence f619t;

    /* JADX INFO: renamed from: z */
    private CharSequence f620z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarContextView$k */
    class ViewOnClickListenerC0140k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ androidx.appcompat.view.toq f621k;

        ViewOnClickListenerC0140k(androidx.appcompat.view.toq toqVar) {
            this.f621k = toqVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f621k.zy();
        }
    }

    public ActionBarContextView(@zy.lvui Context context) {
        this(context, null);
    }

    private void ki() {
        if (this.f611c == null) {
            LayoutInflater.from(getContext()).inflate(C7397k.p.f42414k, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f611c = linearLayout;
            this.f612e = (TextView) linearLayout.findViewById(C7397k.f7l8.f92315f7l8);
            this.f614j = (TextView) this.f611c.findViewById(C7397k.f7l8.f42323g);
            if (this.f617o != 0) {
                this.f612e.setTextAppearance(getContext(), this.f617o);
            }
            if (this.f616m != 0) {
                this.f614j.setTextAppearance(getContext(), this.f616m);
            }
        }
        this.f612e.setText(this.f620z);
        this.f614j.setText(this.f619t);
        boolean z2 = !TextUtils.isEmpty(this.f620z);
        boolean z3 = !TextUtils.isEmpty(this.f619t);
        int i2 = 0;
        this.f614j.setVisibility(z3 ? 0 : 8);
        LinearLayout linearLayout2 = this.f611c;
        if (!z2 && !z3) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f611c.getParent() == null) {
            addView(this.f611c);
        }
    }

    public void cdj(androidx.appcompat.view.toq toqVar) {
        View view = this.f618r;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f609a, (ViewGroup) this, false);
            this.f618r = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f618r);
        }
        View viewFindViewById = this.f618r.findViewById(C7397k.f7l8.f92341qrj);
        this.f615l = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0140k(toqVar));
        androidx.appcompat.view.menu.f7l8 f7l8Var = (androidx.appcompat.view.menu.f7l8) toqVar.mo188n();
        ActionMenuPresenter actionMenuPresenter = this.f1073g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m430t();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f1073g = actionMenuPresenter2;
        actionMenuPresenter2.dd(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        f7l8Var.zy(this.f1073g, this.f1078q);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1073g.toq(this);
        this.f1076n = actionMenuView;
        C0683f.wlev(actionMenuView, null);
        addView(this.f1076n, layoutParams);
    }

    @Override // androidx.appcompat.widget.AbstractC0197k
    public /* bridge */ /* synthetic */ boolean f7l8() {
        return super.f7l8();
    }

    @Override // androidx.appcompat.widget.AbstractC0197k
    /* JADX INFO: renamed from: g */
    public boolean mo409g() {
        ActionMenuPresenter actionMenuPresenter = this.f1073g;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.a9();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC0197k
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0197k
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f619t;
    }

    public CharSequence getTitle() {
        return this.f620z;
    }

    /* JADX INFO: renamed from: h */
    public void m410h() {
        if (this.f618r == null) {
            m411i();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m411i() {
        removeAllViews();
        this.f613f = null;
        this.f1076n = null;
        this.f1073g = null;
        View view = this.f615l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0197k
    public boolean kja0() {
        ActionMenuPresenter actionMenuPresenter = this.f1073g;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.ncyb();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AbstractC0197k
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ void mo412n() {
        super.mo412n();
    }

    @Override // androidx.appcompat.widget.AbstractC0197k
    public /* bridge */ /* synthetic */ gyi n7h(int i2, long j2) {
        return super.n7h(i2, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1073g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.a9();
            this.f1073g.fti();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0197k, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean qVar = nmn5.toq(this);
        int paddingRight = qVar ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f618r;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f618r.getLayoutParams();
            int i6 = qVar ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = qVar ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iLd6 = AbstractC0197k.ld6(paddingRight, i6, qVar);
            paddingRight = AbstractC0197k.ld6(iLd6 + x2(this.f618r, iLd6, paddingTop, paddingTop2, qVar), i7, qVar);
        }
        int iX2 = paddingRight;
        LinearLayout linearLayout = this.f611c;
        if (linearLayout != null && this.f613f == null && linearLayout.getVisibility() != 8) {
            iX2 += x2(this.f611c, iX2, paddingTop, paddingTop2, qVar);
        }
        int i8 = iX2;
        View view2 = this.f613f;
        if (view2 != null) {
            x2(view2, i8, paddingTop, paddingTop2, qVar);
        }
        int paddingLeft = qVar ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1076n;
        if (actionMenuView != null) {
            x2(actionMenuView, paddingLeft, paddingTop, paddingTop2, !qVar);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.f1080y;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i3);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f618r;
        if (view != null) {
            int iM623p = m623p(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f618r.getLayoutParams();
            paddingLeft = iM623p - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1076n;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m623p(this.f1076n, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f611c;
        if (linearLayout != null && this.f613f == null) {
            if (this.f610b) {
                this.f611c.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f611c.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f611c.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = m623p(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f613f;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            int i7 = i6 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.f613f.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.f1080y > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i8) {
                i8 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i8);
    }

    @Override // androidx.appcompat.widget.AbstractC0197k, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC0197k
    /* JADX INFO: renamed from: q */
    public /* bridge */ /* synthetic */ boolean mo413q() {
        return super.mo413q();
    }

    @Override // androidx.appcompat.widget.AbstractC0197k
    public /* bridge */ /* synthetic */ void qrj() {
        super.qrj();
    }

    @Override // androidx.appcompat.widget.AbstractC0197k
    /* JADX INFO: renamed from: s */
    public /* bridge */ /* synthetic */ boolean mo414s() {
        return super.mo414s();
    }

    @Override // androidx.appcompat.widget.AbstractC0197k
    public void setContentHeight(int i2) {
        this.f1080y = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f613f;
        if (view2 != null) {
            removeView(view2);
        }
        this.f613f = view;
        if (view != null && (linearLayout = this.f611c) != null) {
            removeView(linearLayout);
            this.f611c = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f619t = charSequence;
        ki();
    }

    public void setTitle(CharSequence charSequence) {
        this.f620z = charSequence;
        ki();
        C0683f.ngy(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f610b) {
            requestLayout();
        }
        this.f610b = z2;
    }

    @Override // androidx.appcompat.widget.AbstractC0197k, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean t8r() {
        return this.f610b;
    }

    @Override // androidx.appcompat.widget.AbstractC0197k
    /* JADX INFO: renamed from: y */
    public boolean mo415y() {
        ActionMenuPresenter actionMenuPresenter = this.f1073g;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.gvn7();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AbstractC0197k
    public /* bridge */ /* synthetic */ void zy(int i2) {
        super.zy(i2);
    }

    public ActionBarContextView(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, C7397k.toq.f92915mcp);
    }

    public ActionBarContextView(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C0184b c0184bJp0y = C0184b.jp0y(context, attributeSet, C7397k.qrj.f92721nmn5, i2, 0);
        C0683f.wlev(this, c0184bJp0y.m553y(C7397k.qrj.f92636dr));
        this.f617o = c0184bJp0y.fn3e(C7397k.qrj.f92768vq, 0);
        this.f616m = c0184bJp0y.fn3e(C7397k.qrj.f92712mu, 0);
        this.f1080y = c0184bJp0y.cdj(C7397k.qrj.f42450d, 0);
        this.f609a = c0184bJp0y.fn3e(C7397k.qrj.f42468v, C7397k.p.f42411g);
        c0184bJp0y.d3();
    }
}
