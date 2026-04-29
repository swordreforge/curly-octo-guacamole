package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import gb.toq;
import miuix.appcompat.internal.view.menu.action.ActionMenuView;
import miuix.internal.util.C7162g;
import miuix.internal.util.n7h;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class EndActionMenuView extends ActionMenuView {

    /* JADX INFO: renamed from: h */
    private int f39425h;

    /* JADX INFO: renamed from: i */
    private int f39426i;

    /* JADX INFO: renamed from: p */
    private int f39427p;

    /* JADX INFO: renamed from: r */
    private int f39428r;

    /* JADX INFO: renamed from: s */
    private Context f39429s;

    /* JADX INFO: renamed from: t */
    private int f39430t;

    /* JADX INFO: renamed from: z */
    private int f39431z;

    public EndActionMenuView(Context context) {
        this(context, null);
    }

    private int getActionMenuItemCount() {
        return getChildCount();
    }

    /* JADX INFO: renamed from: z */
    private boolean m25297z(View view) {
        return false;
    }

    @Override // miuix.view.toq
    /* JADX INFO: renamed from: g */
    public void mo25100g(boolean z2) {
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public int getCollapsedHeight() {
        return this.f39425h;
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, miuix.appcompat.internal.view.menu.x2
    /* JADX INFO: renamed from: k */
    public boolean mo25264k(int i2) {
        ActionMenuView.toq toqVar;
        View childAt = getChildAt(i2);
        return (!m25297z(childAt) && ((toqVar = (ActionMenuView.toq) childAt.getLayoutParams()) == null || !toqVar.f39413k)) && super.mo25264k(i2);
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public ActionMenuView.toq kja0(@lvui View view) {
        ActionMenuView.toq toqVarGenerateLayoutParams = generateLayoutParams(view.getLayoutParams());
        toqVarGenerateLayoutParams.f39413k = true;
        return toqVarGenerateLayoutParams;
    }

    @Override // miuix.view.toq
    /* JADX INFO: renamed from: n */
    public boolean mo25102n() {
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = i5 - i3;
        int childCount = getChildCount();
        int measuredWidth = this.f39430t;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (!m25297z(childAt)) {
                n7h.kja0(this, childAt, measuredWidth, 0, measuredWidth + childAt.getMeasuredWidth(), i6);
                measuredWidth += childAt.getMeasuredWidth() + this.f39431z;
            }
        }
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int childCount = getChildCount();
        int actionMenuItemCount = getActionMenuItemCount();
        this.f39428r = actionMenuItemCount;
        if (childCount == 0 || actionMenuItemCount == 0) {
            this.f39425h = 0;
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        int iMin = Math.min(size / this.f39428r, this.f39426i);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        int iMin2 = 0;
        int iMax = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (!m25297z(childAt)) {
                measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i3, 0);
                iMin2 += Math.min(childAt.getMeasuredWidth(), iMin);
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
            }
        }
        int i5 = this.f39431z * (this.f39428r - 1);
        int i6 = this.f39430t;
        if (i6 + iMin2 + i5 > size) {
            this.f39431z = 0;
        }
        int i7 = iMin2 + i5 + i6;
        this.f39427p = i7;
        this.f39425h = iMax;
        setMeasuredDimension(i7, iMax);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // miuix.view.toq
    /* JADX INFO: renamed from: q */
    public boolean mo25103q() {
        return false;
    }

    @Override // miuix.view.toq
    public void setEnableBlur(boolean z2) {
    }

    @Override // miuix.view.toq
    public void setSupportBlur(boolean z2) {
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public void t8r(int i2, float f2, boolean z2, boolean z3) {
        if (C7162g.m25943k()) {
            setAlpha(m25291p(f2, z2, z3));
        }
        float fLd6 = ld6(f2, z2, z3);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (!m25297z(childAt)) {
                childAt.setTranslationY(fLd6);
            }
        }
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, miuix.appcompat.internal.view.menu.x2
    /* JADX INFO: renamed from: y */
    public boolean mo25265y() {
        return false;
    }

    @Override // miuix.view.toq
    public boolean zy() {
        return false;
    }

    public EndActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39426i = 0;
        this.f39431z = 0;
        this.f39430t = 0;
        this.f39428r = 0;
        super.setBackground(null);
        this.f39429s = context;
        this.f39431z = context.getResources().getDimensionPixelSize(toq.f7l8.f34753w);
        this.f39430t = context.getResources().getDimensionPixelSize(toq.f7l8.f75469m2t);
        this.f39426i = context.getResources().getDimensionPixelSize(toq.f7l8.f75410ew);
    }
}
