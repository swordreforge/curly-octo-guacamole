package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0130p;
import androidx.appcompat.view.menu.f7l8;
import androidx.appcompat.view.menu.n7h;
import androidx.appcompat.widget.LinearLayoutCompat;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements f7l8.toq, androidx.appcompat.view.menu.kja0 {
    static final int ac = 4;
    private static final String ax = "ActionMenuView";
    static final int bq = 56;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private androidx.appcompat.view.menu.f7l8 f46816ab;
    private ActionMenuPresenter an;
    private int as;
    private int az;
    InterfaceC0150n ba;
    private Context bb;
    private int bg;
    private boolean bl;
    private int bp;
    private boolean bv;
    private n7h.InterfaceC0129k id;
    f7l8.InterfaceC0118k in;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$k */
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC0149k {
        /* JADX INFO: renamed from: q */
        boolean mo311q();

        boolean zy();
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$n */
    public interface InterfaceC0150n {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$q */
    private class C0151q implements f7l8.InterfaceC0118k {
        C0151q() {
        }

        @Override // androidx.appcompat.view.menu.f7l8.InterfaceC0118k
        /* JADX INFO: renamed from: k */
        public boolean mo117k(@zy.lvui androidx.appcompat.view.menu.f7l8 f7l8Var, @zy.lvui MenuItem menuItem) {
            InterfaceC0150n interfaceC0150n = ActionMenuView.this.ba;
            return interfaceC0150n != null && interfaceC0150n.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.f7l8.InterfaceC0118k
        public void toq(@zy.lvui androidx.appcompat.view.menu.f7l8 f7l8Var) {
            f7l8.InterfaceC0118k interfaceC0118k = ActionMenuView.this.in;
            if (interfaceC0118k != null) {
                interfaceC0118k.toq(f7l8Var);
            }
        }
    }

    private static class toq implements n7h.InterfaceC0129k {
        toq() {
        }

        @Override // androidx.appcompat.view.menu.n7h.InterfaceC0129k
        public void f7l8(@zy.lvui androidx.appcompat.view.menu.f7l8 f7l8Var, boolean z2) {
        }

        @Override // androidx.appcompat.view.menu.n7h.InterfaceC0129k
        /* JADX INFO: renamed from: y */
        public boolean mo143y(@zy.lvui androidx.appcompat.view.menu.f7l8 f7l8Var) {
            return false;
        }
    }

    public static class zy extends LinearLayoutCompat.toq {

        /* JADX INFO: renamed from: g */
        boolean f677g;

        /* JADX INFO: renamed from: k */
        @ViewDebug.ExportedProperty
        public boolean f678k;

        /* JADX INFO: renamed from: n */
        @ViewDebug.ExportedProperty
        public boolean f679n;

        /* JADX INFO: renamed from: q */
        @ViewDebug.ExportedProperty
        public boolean f680q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f46817toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f46818zy;

        public zy(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public zy(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public zy(zy zyVar) {
            super((ViewGroup.LayoutParams) zyVar);
            this.f678k = zyVar.f678k;
        }

        public zy(int i2, int i3) {
            super(i2, i3);
            this.f678k = false;
        }

        zy(int i2, int i3, boolean z2) {
            super(i2, i3);
            this.f678k = z2;
        }
    }

    public ActionMenuView(@zy.lvui Context context) {
        this(context, null);
    }

    static int lvui(View view, int i2, int i3, int i4, int i5) {
        zy zyVar = (zy) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.m312y();
        int i6 = 2;
        if (i3 <= 0 || (z2 && i3 < 2)) {
            i6 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, Integer.MIN_VALUE), iMakeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i7 = measuredWidth / i2;
            if (measuredWidth % i2 != 0) {
                i7++;
            }
            if (!z2 || i7 >= 2) {
                i6 = i7;
            }
        }
        zyVar.f680q = !zyVar.f678k && z2;
        zyVar.f46817toq = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, 1073741824), iMakeMeasureSpec);
        return i6;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX INFO: renamed from: r */
    private void m433r(int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        boolean z3;
        boolean z5;
        int i8;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
        int i9 = size - paddingLeft;
        int i10 = this.bg;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = i10 + (i12 / i11);
        int childCount = getChildCount();
        int iMax = 0;
        int i14 = 0;
        boolean z6 = false;
        int i15 = 0;
        int iMax2 = 0;
        int i16 = 0;
        long j2 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            int i17 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i18 = i15 + 1;
                if (z7) {
                    int i19 = this.az;
                    i8 = i18;
                    r14 = 0;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    i8 = i18;
                    r14 = 0;
                }
                zy zyVar = (zy) childAt.getLayoutParams();
                zyVar.f677g = r14;
                zyVar.f46818zy = r14;
                zyVar.f46817toq = r14;
                zyVar.f680q = r14;
                ((LinearLayout.LayoutParams) zyVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) zyVar).rightMargin = r14;
                zyVar.f679n = z7 && ((ActionMenuItemView) childAt).m312y();
                int iLvui = lvui(childAt, i13, zyVar.f678k ? 1 : i11, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iLvui);
                if (zyVar.f680q) {
                    i16++;
                }
                if (zyVar.f678k) {
                    z6 = true;
                }
                i11 -= iLvui;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iLvui == 1) {
                    j2 |= (long) (1 << i14);
                    iMax = iMax;
                }
                i15 = i8;
            }
            i14++;
            size2 = i17;
        }
        int i20 = size2;
        boolean z8 = z6 && i15 == 2;
        boolean z9 = false;
        while (i16 > 0 && i11 > 0) {
            int i21 = Integer.MAX_VALUE;
            int i22 = 0;
            int i23 = 0;
            long j3 = 0;
            while (i23 < childCount) {
                boolean z10 = z9;
                zy zyVar2 = (zy) getChildAt(i23).getLayoutParams();
                int i24 = iMax;
                if (zyVar2.f680q) {
                    int i25 = zyVar2.f46817toq;
                    if (i25 < i21) {
                        j3 = 1 << i23;
                        i21 = i25;
                        i22 = 1;
                    } else if (i25 == i21) {
                        i22++;
                        j3 |= 1 << i23;
                    }
                }
                i23++;
                iMax = i24;
                z9 = z10;
            }
            z2 = z9;
            i6 = iMax;
            j2 |= j3;
            if (i22 > i11) {
                i4 = mode;
                i5 = i9;
                break;
            }
            int i26 = i21 + 1;
            int i27 = 0;
            while (i27 < childCount) {
                View childAt2 = getChildAt(i27);
                zy zyVar3 = (zy) childAt2.getLayoutParams();
                int i28 = i9;
                int i29 = mode;
                long j4 = 1 << i27;
                if ((j3 & j4) == 0) {
                    if (zyVar3.f46817toq == i26) {
                        j2 |= j4;
                    }
                    z5 = z8;
                } else {
                    if (z8 && zyVar3.f679n && i11 == 1) {
                        int i30 = this.az;
                        z5 = z8;
                        childAt2.setPadding(i30 + i13, 0, i30, 0);
                    } else {
                        z5 = z8;
                    }
                    zyVar3.f46817toq++;
                    zyVar3.f677g = true;
                    i11--;
                }
                i27++;
                mode = i29;
                i9 = i28;
                z8 = z5;
            }
            iMax = i6;
            z9 = true;
        }
        i4 = mode;
        i5 = i9;
        z2 = z9;
        i6 = iMax;
        boolean z11 = !z6 && i15 == 1;
        if (i11 <= 0 || j2 == 0 || (i11 >= i15 - 1 && !z11 && iMax2 <= 1)) {
            i7 = 0;
            z3 = z2;
        } else {
            float fBitCount = Long.bitCount(j2);
            if (z11) {
                i7 = 0;
            } else {
                i7 = 0;
                if ((j2 & 1) != 0 && !((zy) getChildAt(0).getLayoutParams()).f679n) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount - 1;
                if ((j2 & ((long) (1 << i31))) != 0 && !((zy) getChildAt(i31).getLayoutParams()).f679n) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i11 * i13) / fBitCount) : i7;
            z3 = z2;
            for (int i33 = i7; i33 < childCount; i33++) {
                if ((j2 & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    zy zyVar4 = (zy) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        zyVar4.f46818zy = i32;
                        zyVar4.f677g = true;
                        if (i33 == 0 && !zyVar4.f679n) {
                            ((LinearLayout.LayoutParams) zyVar4).leftMargin = (-i32) / 2;
                        }
                        z3 = true;
                    } else if (zyVar4.f678k) {
                        zyVar4.f46818zy = i32;
                        zyVar4.f677g = true;
                        ((LinearLayout.LayoutParams) zyVar4).rightMargin = (-i32) / 2;
                        z3 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) zyVar4).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount - 1) {
                            ((LinearLayout.LayoutParams) zyVar4).rightMargin = i32 / 2;
                        }
                    }
                }
            }
        }
        if (z3) {
            for (int i34 = i7; i34 < childCount; i34++) {
                View childAt4 = getChildAt(i34);
                zy zyVar5 = (zy) childAt4.getLayoutParams();
                if (zyVar5.f677g) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((zyVar5.f46817toq * i13) + zyVar5.f46818zy, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i5, i4 != 1073741824 ? i6 : i20);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: a9, reason: merged with bridge method [inline-methods] */
    public zy generateLayoutParams(AttributeSet attributeSet) {
        return new zy(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof zy;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public boolean d2ok() {
        return this.bv;
    }

    public boolean d3() {
        ActionMenuPresenter actionMenuPresenter = this.an;
        return actionMenuPresenter != null && actionMenuPresenter.a9();
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.view.menu.f7l8 dd() {
        return this.f46816ab;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public boolean eqxt() {
        ActionMenuPresenter actionMenuPresenter = this.an;
        return actionMenuPresenter != null && actionMenuPresenter.gvn7();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: fti, reason: merged with bridge method [inline-methods] */
    public zy generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        zy zyVar = layoutParams instanceof zy ? new zy((zy) layoutParams) : new zy(layoutParams);
        if (((LinearLayout.LayoutParams) zyVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) zyVar).gravity = 16;
        }
        return zyVar;
    }

    public Menu getMenu() {
        if (this.f46816ab == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.f7l8 f7l8Var = new androidx.appcompat.view.menu.f7l8(context);
            this.f46816ab = f7l8Var;
            f7l8Var.uv6(new C0151q());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.an = actionMenuPresenter;
            actionMenuPresenter.dd(true);
            ActionMenuPresenter actionMenuPresenter2 = this.an;
            n7h.InterfaceC0129k toqVar = this.id;
            if (toqVar == null) {
                toqVar = new toq();
            }
            actionMenuPresenter2.mo356s(toqVar);
            this.f46816ab.zy(this.an, this.bb);
            this.an.lvui(this);
        }
        return this.f46816ab;
    }

    @zy.dd
    public Drawable getOverflowIcon() {
        getMenu();
        return this.an.jk();
    }

    public int getPopupTheme() {
        return this.bp;
    }

    @Override // androidx.appcompat.view.menu.kja0
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    protected boolean gvn7(int i2) {
        boolean zZy = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof InterfaceC0149k)) {
            zZy = false | ((InterfaceC0149k) childAt).zy();
        }
        return (i2 <= 0 || !(childAt2 instanceof InterfaceC0149k)) ? zZy : zZy | ((InterfaceC0149k) childAt2).mo311q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: jk, reason: merged with bridge method [inline-methods] */
    public zy generateDefaultLayoutParams() {
        zy zyVar = new zy(-2, -2);
        ((LinearLayout.LayoutParams) zyVar).gravity = 16;
        return zyVar;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public zy jp0y() {
        zy zyVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        zyVarGenerateDefaultLayoutParams.f678k = true;
        return zyVarGenerateDefaultLayoutParams;
    }

    public void mcp() {
        ActionMenuPresenter actionMenuPresenter = this.an;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m430t();
        }
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public boolean oc() {
        ActionMenuPresenter actionMenuPresenter = this.an;
        return actionMenuPresenter != null && actionMenuPresenter.jp0y();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.an;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo355q(false);
            if (this.an.gvn7()) {
                this.an.a9();
                this.an.ncyb();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mcp();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int width;
        int paddingLeft;
        if (!this.bl) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i4 - i2;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean qVar = nmn5.toq(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                zy zyVar = (zy) childAt.getLayoutParams();
                if (zyVar.f678k) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (gvn7(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (qVar) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) zyVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) zyVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) zyVar).leftMargin) + ((LinearLayout.LayoutParams) zyVar).rightMargin;
                    gvn7(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int iMax = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (qVar) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                zy zyVar2 = (zy) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !zyVar2.f678k) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) zyVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) zyVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            zy zyVar3 = (zy) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !zyVar3.f678k) {
                int i19 = paddingLeft2 + ((LinearLayout.LayoutParams) zyVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = i19 + measuredWidth4 + ((LinearLayout.LayoutParams) zyVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i2, int i3) {
        androidx.appcompat.view.menu.f7l8 f7l8Var;
        boolean z2 = this.bl;
        boolean z3 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.bl = z3;
        if (z2 != z3) {
            this.as = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.bl && (f7l8Var = this.f46816ab) != null && size != this.as) {
            this.as = size;
            f7l8Var.mo336r(true);
        }
        int childCount = getChildCount();
        if (this.bl && childCount > 0) {
            m433r(i2, i3);
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            zy zyVar = (zy) getChildAt(i4).getLayoutParams();
            ((LinearLayout.LayoutParams) zyVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) zyVar).leftMargin = 0;
        }
        super.onMeasure(i2, i3);
    }

    @Override // androidx.appcompat.view.menu.f7l8.toq
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: q */
    public boolean mo314q(C0130p c0130p) {
        return this.f46816ab.dd(c0130p, 0);
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z2) {
        this.an.eqxt(z2);
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(n7h.InterfaceC0129k interfaceC0129k, f7l8.InterfaceC0118k interfaceC0118k) {
        this.id = interfaceC0129k;
        this.in = interfaceC0118k;
    }

    public void setOnMenuItemClickListener(InterfaceC0150n interfaceC0150n) {
        this.ba = interfaceC0150n;
    }

    public void setOverflowIcon(@zy.dd Drawable drawable) {
        getMenu();
        this.an.m429r(drawable);
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z2) {
        this.bv = z2;
    }

    public void setPopupTheme(@zy.hb int i2) {
        if (this.bp != i2) {
            this.bp = i2;
            if (i2 == 0) {
                this.bb = getContext();
            } else {
                this.bb = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.an = actionMenuPresenter;
        actionMenuPresenter.lvui(this);
    }

    public boolean x9kr() {
        ActionMenuPresenter actionMenuPresenter = this.an;
        return actionMenuPresenter != null && actionMenuPresenter.ncyb();
    }

    @Override // androidx.appcompat.view.menu.kja0
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void zy(androidx.appcompat.view.menu.f7l8 f7l8Var) {
        this.f46816ab = f7l8Var;
    }

    public ActionMenuView(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.bg = (int) (56.0f * f2);
        this.az = (int) (f2 * 4.0f);
        this.bb = context;
        this.bp = 0;
    }
}
