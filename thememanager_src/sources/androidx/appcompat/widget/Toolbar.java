package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0096k;
import androidx.appcompat.view.menu.C0130p;
import androidx.appcompat.view.menu.f7l8;
import androidx.appcompat.view.menu.n7h;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.C0683f;
import androidx.customview.view.AbsSavedState;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.kja0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p023g.C6045k;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements androidx.core.view.fn3e {
    private static final String am = "Toolbar";

    /* JADX INFO: renamed from: a */
    private int f911a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private boolean f46827ab;
    private boolean ac;
    private final Runnable ad;
    private final int[] an;
    private final ActionMenuView.InterfaceC0150n as;
    private n7h.InterfaceC0129k ax;
    private ActionMenuPresenter az;

    /* JADX INFO: renamed from: b */
    private vyq f912b;
    private C0180q ba;
    private boolean bb;
    private a98o bg;
    InterfaceC0177g bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private CharSequence f46828bo;
    private final ArrayList<View> bp;
    private f7l8.InterfaceC0118k bq;
    private final ArrayList<View> bv;

    /* JADX INFO: renamed from: c */
    private int f913c;

    /* JADX INFO: renamed from: d */
    private ColorStateList f914d;

    /* JADX INFO: renamed from: e */
    private int f915e;

    /* JADX INFO: renamed from: f */
    int f916f;

    /* JADX INFO: renamed from: g */
    private ImageButton f917g;

    /* JADX INFO: renamed from: h */
    ImageButton f918h;

    /* JADX INFO: renamed from: i */
    View f919i;
    final androidx.core.view.fu4 id;
    private ArrayList<MenuItem> in;

    /* JADX INFO: renamed from: j */
    private int f920j;

    /* JADX INFO: renamed from: k */
    private ActionMenuView f921k;

    /* JADX INFO: renamed from: l */
    private int f922l;

    /* JADX INFO: renamed from: m */
    private int f923m;

    /* JADX INFO: renamed from: n */
    private TextView f924n;

    /* JADX INFO: renamed from: o */
    private int f925o;

    /* JADX INFO: renamed from: p */
    private CharSequence f926p;

    /* JADX INFO: renamed from: q */
    private TextView f927q;

    /* JADX INFO: renamed from: r */
    private int f928r;

    /* JADX INFO: renamed from: s */
    private Drawable f929s;

    /* JADX INFO: renamed from: t */
    private int f930t;

    /* JADX INFO: renamed from: u */
    private int f931u;

    /* JADX INFO: renamed from: v */
    private CharSequence f932v;

    /* JADX INFO: renamed from: w */
    private ColorStateList f933w;

    /* JADX INFO: renamed from: x */
    private int f934x;

    /* JADX INFO: renamed from: y */
    private ImageView f935y;

    /* JADX INFO: renamed from: z */
    private Context f936z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.appcompat.widget.Toolbar.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: n */
        boolean f937n;

        /* JADX INFO: renamed from: q */
        int f938q;

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f938q);
            parcel.writeInt(this.f937n ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f938q = parcel.readInt();
            this.f937n = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$g */
    public interface InterfaceC0177g {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$k */
    class C0178k implements ActionMenuView.InterfaceC0150n {
        C0178k() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0150n
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.id.m3272p(menuItem)) {
                return true;
            }
            InterfaceC0177g interfaceC0177g = Toolbar.this.bl;
            if (interfaceC0177g != null) {
                return interfaceC0177g.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$q */
    private class C0180q implements androidx.appcompat.view.menu.n7h {

        /* JADX INFO: renamed from: k */
        androidx.appcompat.view.menu.f7l8 f942k;

        /* JADX INFO: renamed from: q */
        C0130p f944q;

        C0180q() {
        }

        @Override // androidx.appcompat.view.menu.n7h
        public void f7l8(androidx.appcompat.view.menu.f7l8 f7l8Var, boolean z2) {
        }

        @Override // androidx.appcompat.view.menu.n7h
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.n7h
        /* JADX INFO: renamed from: k */
        public void mo352k(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.n7h
        public boolean ld6(androidx.appcompat.view.menu.f7l8 f7l8Var, C0130p c0130p) {
            KeyEvent.Callback callback = Toolbar.this.f919i;
            if (callback instanceof androidx.appcompat.view.zy) {
                ((androidx.appcompat.view.zy) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f919i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f918h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f919i = null;
            toolbar3.m515g();
            this.f944q = null;
            Toolbar.this.requestLayout();
            c0130p.m371i(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.n7h
        /* JADX INFO: renamed from: n */
        public boolean mo353n() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n7h
        /* JADX INFO: renamed from: p */
        public boolean mo354p(androidx.appcompat.view.menu.t8r t8rVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n7h
        /* JADX INFO: renamed from: q */
        public void mo355q(boolean z2) {
            if (this.f944q != null) {
                androidx.appcompat.view.menu.f7l8 f7l8Var = this.f942k;
                boolean z3 = false;
                if (f7l8Var != null) {
                    int size = f7l8Var.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        if (this.f942k.getItem(i2) == this.f944q) {
                            z3 = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (z3) {
                    return;
                }
                ld6(this.f942k, this.f944q);
            }
        }

        @Override // androidx.appcompat.view.menu.n7h
        /* JADX INFO: renamed from: s */
        public void mo356s(n7h.InterfaceC0129k interfaceC0129k) {
        }

        @Override // androidx.appcompat.view.menu.n7h
        public androidx.appcompat.view.menu.kja0 toq(ViewGroup viewGroup) {
            return null;
        }

        @Override // androidx.appcompat.view.menu.n7h
        public void x2(Context context, androidx.appcompat.view.menu.f7l8 f7l8Var) {
            C0130p c0130p;
            androidx.appcompat.view.menu.f7l8 f7l8Var2 = this.f942k;
            if (f7l8Var2 != null && (c0130p = this.f944q) != null) {
                f7l8Var2.f7l8(c0130p);
            }
            this.f942k = f7l8Var;
        }

        @Override // androidx.appcompat.view.menu.n7h
        /* JADX INFO: renamed from: y */
        public boolean mo367y(androidx.appcompat.view.menu.f7l8 f7l8Var, C0130p c0130p) {
            Toolbar.this.x2();
            ViewParent parent = Toolbar.this.f918h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f918h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f918h);
            }
            Toolbar.this.f919i = c0130p.getActionView();
            this.f944q = c0130p;
            ViewParent parent2 = Toolbar.this.f919i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f919i);
                }
                C0179n c0179nGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                c0179nGenerateDefaultLayoutParams.f281k = 8388611 | (toolbar4.f916f & 112);
                c0179nGenerateDefaultLayoutParams.f46830toq = 2;
                toolbar4.f919i.setLayoutParams(c0179nGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f919i);
            }
            Toolbar.this.m521r();
            Toolbar.this.requestLayout();
            c0130p.m371i(true);
            KeyEvent.Callback callback = Toolbar.this.f919i;
            if (callback instanceof androidx.appcompat.view.zy) {
                ((androidx.appcompat.view.zy) callback).onActionViewExpanded();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.n7h
        public Parcelable zy() {
            return null;
        }
    }

    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.ncyb();
        }
    }

    class zy implements View.OnClickListener {
        zy() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.m519p();
        }
    }

    public Toolbar(@zy.lvui Context context) {
        this(context, null);
    }

    private void cdj() {
        if (this.f917g == null) {
            this.f917g = new AppCompatImageButton(getContext(), null, C7397k.toq.iz);
            C0179n c0179nGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0179nGenerateDefaultLayoutParams.f281k = 8388611 | (this.f916f & 112);
            this.f917g.setLayoutParams(c0179nGenerateDefaultLayoutParams);
        }
    }

    private void d2ok() {
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.id.m3275y(getMenu(), getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.in = currentMenuItems2;
    }

    private int d3(View view, int i2, int[] iArr, int i3) {
        C0179n c0179n = (C0179n) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) c0179n).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int iZurt = zurt(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iZurt, iMax, view.getMeasuredHeight() + iZurt);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0179n).leftMargin);
    }

    private boolean dd() {
        if (!this.ac) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (x9kr(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private void eqxt(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void f7l8(List<View> list, int i2) {
        boolean z2 = C0683f.m3159e(this) == 1;
        int childCount = getChildCount();
        int iM3432q = androidx.core.view.qrj.m3432q(i2, C0683f.m3159e(this));
        list.clear();
        if (!z2) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C0179n c0179n = (C0179n) childAt.getLayoutParams();
                if (c0179n.f46830toq == 0 && x9kr(childAt) && fn3e(c0179n.f281k) == iM3432q) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            C0179n c0179n2 = (C0179n) childAt2.getLayoutParams();
            if (c0179n2.f46830toq == 0 && x9kr(childAt2) && fn3e(c0179n2.f281k) == iM3432q) {
                list.add(childAt2);
            }
        }
    }

    private int fn3e(int i2) {
        int iM3159e = C0683f.m3159e(this);
        int iM3432q = androidx.core.view.qrj.m3432q(i2, iM3159e) & 7;
        return (iM3432q == 1 || iM3432q == 3 || iM3432q == 5) ? iM3432q : iM3159e == 1 ? 5 : 3;
    }

    private int fu4(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.ki.zy(marginLayoutParams) + androidx.core.view.ki.toq(marginLayoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.f7l8(getContext());
    }

    private int gvn7(View view, int i2, int[] iArr, int i3) {
        C0179n c0179n = (C0179n) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) c0179n).leftMargin - iArr[0];
        int iMax = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int iZurt = zurt(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iZurt, iMax + measuredWidth, view.getMeasuredHeight() + iZurt);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) c0179n).rightMargin;
    }

    /* JADX INFO: renamed from: h */
    private void m512h() {
        if (this.f921k == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f921k = actionMenuView;
            actionMenuView.setPopupTheme(this.f930t);
            this.f921k.setOnMenuItemClickListener(this.as);
            this.f921k.setMenuCallbacks(this.ax, this.bq);
            C0179n c0179nGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0179nGenerateDefaultLayoutParams.f281k = 8388613 | (this.f916f & 112);
            this.f921k.setLayoutParams(c0179nGenerateDefaultLayoutParams);
            m513y(this.f921k, false);
        }
    }

    private boolean jk(View view) {
        return view.getParent() == this || this.bv.contains(view);
    }

    private void kja0() {
        m512h();
        if (this.f921k.dd() == null) {
            androidx.appcompat.view.menu.f7l8 f7l8Var = (androidx.appcompat.view.menu.f7l8) this.f921k.getMenu();
            if (this.ba == null) {
                this.ba = new C0180q();
            }
            this.f921k.setExpandedActionViewsExclusive(true);
            f7l8Var.zy(this.ba, this.f936z);
        }
    }

    private void lvui() {
        removeCallbacks(this.ad);
        post(this.ad);
    }

    private void n7h() {
        if (this.f935y == null) {
            this.f935y = new AppCompatImageView(getContext());
        }
    }

    private int ni7(int i2) {
        int i3 = i2 & 112;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.f931u & 112;
    }

    private int o1t(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        int measuredWidth = 0;
        while (i4 < size) {
            View view = list.get(i4);
            C0179n c0179n = (C0179n) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) c0179n).leftMargin - i2;
            int i6 = ((ViewGroup.MarginLayoutParams) c0179n).rightMargin - i3;
            int iMax = Math.max(0, i5);
            int iMax2 = Math.max(0, i6);
            int iMax3 = Math.max(0, -i5);
            int iMax4 = Math.max(0, -i6);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i4++;
            i3 = iMax4;
            i2 = iMax3;
        }
        return measuredWidth;
    }

    private int oc(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void qrj() {
        if (this.f912b == null) {
            this.f912b = new vyq();
        }
    }

    private boolean x9kr(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: y */
    private void m513y(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0179n c0179nGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0179n) layoutParams;
        c0179nGenerateDefaultLayoutParams.f46830toq = 1;
        if (!z2 || this.f919i == null) {
            addView(view, c0179nGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(c0179nGenerateDefaultLayoutParams);
            this.bv.add(view);
        }
    }

    /* JADX INFO: renamed from: z */
    private int m514z(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int zurt(View view, int i2) {
        C0179n c0179n = (C0179n) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int iNi7 = ni7(c0179n.f281k);
        if (iNi7 == 48) {
            return getPaddingTop() - i3;
        }
        if (iNi7 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0179n).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c0179n).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c0179n).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public boolean a9() {
        ActionMenuView actionMenuView = this.f921k;
        return actionMenuView != null && actionMenuView.oc();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0179n);
    }

    public boolean fti() {
        ActionMenuView actionMenuView = this.f921k;
        return actionMenuView != null && actionMenuView.eqxt();
    }

    /* JADX INFO: renamed from: g */
    void m515g() {
        for (int size = this.bv.size() - 1; size >= 0; size--) {
            addView(this.bv.get(size));
        }
        this.bv.clear();
    }

    @zy.dd
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f918h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @zy.dd
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f918h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        vyq vyqVar = this.f912b;
        if (vyqVar != null) {
            return vyqVar.m731k();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f934x;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        vyq vyqVar = this.f912b;
        if (vyqVar != null) {
            return vyqVar.toq();
        }
        return 0;
    }

    public int getContentInsetRight() {
        vyq vyqVar = this.f912b;
        if (vyqVar != null) {
            return vyqVar.zy();
        }
        return 0;
    }

    public int getContentInsetStart() {
        vyq vyqVar = this.f912b;
        if (vyqVar != null) {
            return vyqVar.m733q();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f911a;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.f7l8 f7l8VarDd;
        ActionMenuView actionMenuView = this.f921k;
        return actionMenuView != null && (f7l8VarDd = actionMenuView.dd()) != null && f7l8VarDd.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f934x, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return C0683f.m3159e(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0683f.m3159e(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f911a, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f935y;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f935y;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        kja0();
        return this.f921k.getMenu();
    }

    @zy.dd
    @zy.uv6({uv6.EnumC7844k.TESTS})
    View getNavButtonView() {
        return this.f917g;
    }

    @zy.dd
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f917g;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @zy.dd
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f917g;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.az;
    }

    @zy.dd
    public Drawable getOverflowIcon() {
        kja0();
        return this.f921k.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f936z;
    }

    @zy.hb
    public int getPopupTheme() {
        return this.f930t;
    }

    public CharSequence getSubtitle() {
        return this.f932v;
    }

    @zy.dd
    @zy.uv6({uv6.EnumC7844k.TESTS})
    final TextView getSubtitleTextView() {
        return this.f924n;
    }

    public CharSequence getTitle() {
        return this.f46828bo;
    }

    public int getTitleMarginBottom() {
        return this.f923m;
    }

    public int getTitleMarginEnd() {
        return this.f920j;
    }

    public int getTitleMarginStart() {
        return this.f915e;
    }

    public int getTitleMarginTop() {
        return this.f925o;
    }

    @zy.dd
    @zy.uv6({uv6.EnumC7844k.TESTS})
    final TextView getTitleTextView() {
        return this.f927q;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public d3 getWrapper() {
        if (this.bg == null) {
            this.bg = new a98o(this, true);
        }
        return this.bg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0179n generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0179n ? new C0179n((C0179n) layoutParams) : layoutParams instanceof AbstractC0096k.toq ? new C0179n((AbstractC0096k.toq) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0179n((ViewGroup.MarginLayoutParams) layoutParams) : new C0179n(layoutParams);
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public boolean jp0y() {
        Layout layout;
        TextView textView = this.f927q;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (layout.getEllipsisCount(i2) > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.view.fn3e
    @SuppressLint({"LambdaLast"})
    @zy.oc
    /* JADX INFO: renamed from: k */
    public void mo517k(@zy.lvui androidx.core.view.wvg wvgVar, @zy.lvui InterfaceC0954z interfaceC0954z, @zy.lvui kja0.zy zyVar) {
        this.id.m3271n(wvgVar, interfaceC0954z, zyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
    public C0179n generateDefaultLayoutParams() {
        return new C0179n(-2, -2);
    }

    public void ld6() {
        ActionMenuView actionMenuView = this.f921k;
        if (actionMenuView != null) {
            actionMenuView.mcp();
        }
    }

    public void mcp(@zy.eqxt int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    @Override // androidx.core.view.fn3e
    @zy.oc
    /* JADX INFO: renamed from: n */
    public void mo518n() {
        Iterator<MenuItem> it = this.in.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        d2ok();
    }

    public boolean ncyb() {
        ActionMenuView actionMenuView = this.f921k;
        return actionMenuView != null && actionMenuView.x9kr();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.ad);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.bb = false;
        }
        if (!this.bb) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.bb = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.bb = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x029f A[LOOP:0: B:104:0x029d->B:105:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c1 A[LOOP:1: B:107:0x02bf->B:108:0x02c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fa A[LOOP:2: B:116:0x02f8->B:117:0x02fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.an;
        boolean qVar = nmn5.toq(this);
        int i4 = !qVar ? 1 : 0;
        if (x9kr(this.f917g)) {
            eqxt(this.f917g, i2, 0, i3, 0, this.f913c);
            measuredWidth = this.f917g.getMeasuredWidth() + fu4(this.f917g);
            iMax = Math.max(0, this.f917g.getMeasuredHeight() + m514z(this.f917g));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f917g.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (x9kr(this.f918h)) {
            eqxt(this.f918h, i2, 0, i3, 0, this.f913c);
            measuredWidth = this.f918h.getMeasuredWidth() + fu4(this.f918h);
            iMax = Math.max(iMax, this.f918h.getMeasuredHeight() + m514z(this.f918h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f918h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = 0 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[qVar ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (x9kr(this.f921k)) {
            eqxt(this.f921k, i2, iMax3, i3, 0, this.f913c);
            measuredWidth2 = this.f921k.getMeasuredWidth() + fu4(this.f921k);
            iMax = Math.max(iMax, this.f921k.getMeasuredHeight() + m514z(this.f921k));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f921k.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i4] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (x9kr(this.f919i)) {
            iMax4 += oc(this.f919i, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.f919i.getMeasuredHeight() + m514z(this.f919i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f919i.getMeasuredState());
        }
        if (x9kr(this.f935y)) {
            iMax4 += oc(this.f935y, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.f935y.getMeasuredHeight() + m514z(this.f935y));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f935y.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (((C0179n) childAt.getLayoutParams()).f46830toq == 0 && x9kr(childAt)) {
                iMax4 += oc(childAt, i2, iMax4, i3, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + m514z(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i6 = this.f925o + this.f923m;
        int i7 = this.f915e + this.f920j;
        if (x9kr(this.f927q)) {
            oc(this.f927q, i2, iMax4 + i7, i3, i6, iArr);
            int measuredWidth3 = this.f927q.getMeasuredWidth() + fu4(this.f927q);
            measuredHeight = this.f927q.getMeasuredHeight() + m514z(this.f927q);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f927q.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (x9kr(this.f924n)) {
            iMax2 = Math.max(iMax2, oc(this.f924n, i2, iMax4 + i7, i3, measuredHeight + i6, iArr));
            measuredHeight += this.f924n.getMeasuredHeight() + m514z(this.f924n);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f924n.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2), dd() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ActionMenuView actionMenuView = this.f921k;
        androidx.appcompat.view.menu.f7l8 f7l8VarDd = actionMenuView != null ? actionMenuView.dd() : null;
        int i2 = savedState.f938q;
        if (i2 != 0 && this.ba != null && f7l8VarDd != null && (menuItemFindItem = f7l8VarDd.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f937n) {
            lvui();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        qrj();
        this.f912b.m730g(i2 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0130p c0130p;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0180q c0180q = this.ba;
        if (c0180q != null && (c0130p = c0180q.f944q) != null) {
            savedState.f938q = c0130p.getItemId();
        }
        savedState.f937n = fti();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f46827ab = false;
        }
        if (!this.f46827ab) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f46827ab = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f46827ab = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m519p() {
        C0180q c0180q = this.ba;
        C0130p c0130p = c0180q == null ? null : c0180q.f944q;
        if (c0130p != null) {
            c0130p.collapseActionView();
        }
    }

    @Override // androidx.core.view.fn3e
    @zy.oc
    /* JADX INFO: renamed from: q */
    public void mo520q(@zy.lvui androidx.core.view.wvg wvgVar) {
        this.id.zy(wvgVar);
    }

    /* JADX INFO: renamed from: r */
    void m521r() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C0179n) childAt.getLayoutParams()).f46830toq != 2 && childAt != this.f921k) {
                removeViewAt(childCount);
                this.bv.add(childAt);
            }
        }
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: s */
    public boolean m522s() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f921k) != null && actionMenuView.d2ok();
    }

    public void setCollapseContentDescription(@zy.nn86 int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(@zy.fn3e int i2) {
        setCollapseIcon(C6045k.toq(getContext(), i2));
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z2) {
        this.ac = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f934x) {
            this.f934x = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f911a) {
            this.f911a = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i2, int i3) {
        qrj();
        this.f912b.m732n(i2, i3);
    }

    public void setContentInsetsRelative(int i2, int i3) {
        qrj();
        this.f912b.f7l8(i2, i3);
    }

    public void setLogo(@zy.fn3e int i2) {
        setLogo(C6045k.toq(getContext(), i2));
    }

    public void setLogoDescription(@zy.nn86 int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY})
    public void setMenu(androidx.appcompat.view.menu.f7l8 f7l8Var, ActionMenuPresenter actionMenuPresenter) {
        if (f7l8Var == null && this.f921k == null) {
            return;
        }
        m512h();
        androidx.appcompat.view.menu.f7l8 f7l8VarDd = this.f921k.dd();
        if (f7l8VarDd == f7l8Var) {
            return;
        }
        if (f7l8VarDd != null) {
            f7l8VarDd.n5r1(this.az);
            f7l8VarDd.n5r1(this.ba);
        }
        if (this.ba == null) {
            this.ba = new C0180q();
        }
        actionMenuPresenter.eqxt(true);
        if (f7l8Var != null) {
            f7l8Var.zy(actionMenuPresenter, this.f936z);
            f7l8Var.zy(this.ba, this.f936z);
        } else {
            actionMenuPresenter.x2(this.f936z, null);
            this.ba.x2(this.f936z, null);
            actionMenuPresenter.mo355q(true);
            this.ba.mo355q(true);
        }
        this.f921k.setPopupTheme(this.f930t);
        this.f921k.setPresenter(actionMenuPresenter);
        this.az = actionMenuPresenter;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(n7h.InterfaceC0129k interfaceC0129k, f7l8.InterfaceC0118k interfaceC0118k) {
        this.ax = interfaceC0129k;
        this.bq = interfaceC0118k;
        ActionMenuView actionMenuView = this.f921k;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(interfaceC0129k, interfaceC0118k);
        }
    }

    public void setNavigationContentDescription(@zy.nn86 int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(@zy.fn3e int i2) {
        setNavigationIcon(C6045k.toq(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        cdj();
        this.f917g.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0177g interfaceC0177g) {
        this.bl = interfaceC0177g;
    }

    public void setOverflowIcon(@zy.dd Drawable drawable) {
        kja0();
        this.f921k.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@zy.hb int i2) {
        if (this.f930t != i2) {
            this.f930t = i2;
            if (i2 == 0) {
                this.f936z = getContext();
            } else {
                this.f936z = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(@zy.nn86 int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextAppearance(Context context, @zy.hb int i2) {
        this.f922l = i2;
        TextView textView = this.f924n;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void setSubtitleTextColor(@zy.x2 int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(@zy.nn86 int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMargin(int i2, int i3, int i4, int i5) {
        this.f915e = i2;
        this.f925o = i3;
        this.f920j = i4;
        this.f923m = i5;
        requestLayout();
    }

    public void setTitleMarginBottom(int i2) {
        this.f923m = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f920j = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f915e = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f925o = i2;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, @zy.hb int i2) {
        this.f928r = i2;
        TextView textView = this.f927q;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void setTitleTextColor(@zy.x2 int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    /* JADX INFO: renamed from: t */
    public boolean m523t() {
        ActionMenuView actionMenuView = this.f921k;
        return actionMenuView != null && actionMenuView.d3();
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: t8r, reason: merged with bridge method [inline-methods] */
    public C0179n generateLayoutParams(AttributeSet attributeSet) {
        return new C0179n(getContext(), attributeSet);
    }

    @Override // androidx.core.view.fn3e
    @zy.oc
    public void toq(@zy.lvui androidx.core.view.wvg wvgVar, @zy.lvui InterfaceC0954z interfaceC0954z) {
        this.id.m3273q(wvgVar, interfaceC0954z);
    }

    public boolean wvg() {
        C0180q c0180q = this.ba;
        return (c0180q == null || c0180q.f944q == null) ? false : true;
    }

    void x2() {
        if (this.f918h == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, C7397k.toq.iz);
            this.f918h = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f929s);
            this.f918h.setContentDescription(this.f926p);
            C0179n c0179nGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0179nGenerateDefaultLayoutParams.f281k = 8388611 | (this.f916f & 112);
            c0179nGenerateDefaultLayoutParams.f46830toq = 2;
            this.f918h.setLayoutParams(c0179nGenerateDefaultLayoutParams);
            this.f918h.setOnClickListener(new zy());
        }
    }

    @Override // androidx.core.view.fn3e
    @zy.oc
    public void zy(@zy.lvui androidx.core.view.wvg wvgVar) {
        this.id.x2(wvgVar);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$n */
    public static class C0179n extends AbstractC0096k.toq {

        /* JADX INFO: renamed from: n */
        static final int f940n = 2;

        /* JADX INFO: renamed from: q */
        static final int f941q = 1;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        static final int f46829zy = 0;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f46830toq;

        public C0179n(@zy.lvui Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f46830toq = 0;
        }

        /* JADX INFO: renamed from: k */
        void m525k(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0179n(int i2, int i3) {
            super(i2, i3);
            this.f46830toq = 0;
            this.f281k = 8388627;
        }

        public C0179n(int i2, int i3, int i4) {
            super(i2, i3);
            this.f46830toq = 0;
            this.f281k = i4;
        }

        public C0179n(int i2) {
            this(-2, -1, i2);
        }

        public C0179n(C0179n c0179n) {
            super((AbstractC0096k.toq) c0179n);
            this.f46830toq = 0;
            this.f46830toq = c0179n.f46830toq;
        }

        public C0179n(AbstractC0096k.toq toqVar) {
            super(toqVar);
            this.f46830toq = 0;
        }

        public C0179n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f46830toq = 0;
            m525k(marginLayoutParams);
        }

        public C0179n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f46830toq = 0;
        }
    }

    public Toolbar(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, C7397k.toq.anw);
    }

    public void setCollapseContentDescription(@zy.dd CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            x2();
        }
        ImageButton imageButton = this.f918h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@zy.dd Drawable drawable) {
        if (drawable != null) {
            x2();
            this.f918h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f918h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f929s);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            n7h();
            if (!jk(this.f935y)) {
                m513y(this.f935y, true);
            }
        } else {
            ImageView imageView = this.f935y;
            if (imageView != null && jk(imageView)) {
                removeView(this.f935y);
                this.bv.remove(this.f935y);
            }
        }
        ImageView imageView2 = this.f935y;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            n7h();
        }
        ImageView imageView = this.f935y;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@zy.dd CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            cdj();
        }
        ImageButton imageButton = this.f917g;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C0182a.m528k(this.f917g, charSequence);
        }
    }

    public void setNavigationIcon(@zy.dd Drawable drawable) {
        if (drawable != null) {
            cdj();
            if (!jk(this.f917g)) {
                m513y(this.f917g, true);
            }
        } else {
            ImageButton imageButton = this.f917g;
            if (imageButton != null && jk(imageButton)) {
                removeView(this.f917g);
                this.bv.remove(this.f917g);
            }
        }
        ImageButton imageButton2 = this.f917g;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f924n;
            if (textView != null && jk(textView)) {
                removeView(this.f924n);
                this.bv.remove(this.f924n);
            }
        } else {
            if (this.f924n == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f924n = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f924n.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f922l;
                if (i2 != 0) {
                    this.f924n.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f933w;
                if (colorStateList != null) {
                    this.f924n.setTextColor(colorStateList);
                }
            }
            if (!jk(this.f924n)) {
                m513y(this.f924n, true);
            }
        }
        TextView textView2 = this.f924n;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f932v = charSequence;
    }

    public void setSubtitleTextColor(@zy.lvui ColorStateList colorStateList) {
        this.f933w = colorStateList;
        TextView textView = this.f924n;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f927q;
            if (textView != null && jk(textView)) {
                removeView(this.f927q);
                this.bv.remove(this.f927q);
            }
        } else {
            if (this.f927q == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f927q = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f927q.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f928r;
                if (i2 != 0) {
                    this.f927q.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f914d;
                if (colorStateList != null) {
                    this.f927q.setTextColor(colorStateList);
                }
            }
            if (!jk(this.f927q)) {
                m513y(this.f927q, true);
            }
        }
        TextView textView2 = this.f927q;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f46828bo = charSequence;
    }

    public void setTitleTextColor(@zy.lvui ColorStateList colorStateList) {
        this.f914d = colorStateList;
        TextView textView = this.f927q;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f931u = 8388627;
        this.bp = new ArrayList<>();
        this.bv = new ArrayList<>();
        this.an = new int[2];
        this.id = new androidx.core.view.fu4(new Runnable() { // from class: androidx.appcompat.widget.bf2
            @Override // java.lang.Runnable
            public final void run() {
                this.f965k.mo518n();
            }
        });
        this.in = new ArrayList<>();
        this.as = new C0178k();
        this.ad = new toq();
        Context context2 = getContext();
        int[] iArr = C7397k.qrj.zalf;
        C0184b c0184bJp0y = C0184b.jp0y(context2, attributeSet, iArr, i2, 0);
        C0683f.ij(this, context, iArr, attributeSet, c0184bJp0y.m552t(), i2, 0);
        this.f928r = c0184bJp0y.fn3e(C7397k.qrj.mru, 0);
        this.f922l = c0184bJp0y.fn3e(C7397k.qrj.lz, 0);
        this.f931u = c0184bJp0y.m545h(C7397k.qrj.aq2a, this.f931u);
        this.f916f = c0184bJp0y.m545h(C7397k.qrj.fjcj, 48);
        int iM544g = c0184bJp0y.m544g(C7397k.qrj.jut, 0);
        int i3 = C7397k.qrj.hzl;
        iM544g = c0184bJp0y.mcp(i3) ? c0184bJp0y.m544g(i3, iM544g) : iM544g;
        this.f923m = iM544g;
        this.f925o = iM544g;
        this.f920j = iM544g;
        this.f915e = iM544g;
        int iM544g2 = c0184bJp0y.m544g(C7397k.qrj.thtw, -1);
        if (iM544g2 >= 0) {
            this.f915e = iM544g2;
        }
        int iM544g3 = c0184bJp0y.m544g(C7397k.qrj.vd, -1);
        if (iM544g3 >= 0) {
            this.f920j = iM544g3;
        }
        int iM544g4 = c0184bJp0y.m544g(C7397k.qrj.nm, -1);
        if (iM544g4 >= 0) {
            this.f925o = iM544g4;
        }
        int iM544g5 = c0184bJp0y.m544g(C7397k.qrj.irh, -1);
        if (iM544g5 >= 0) {
            this.f923m = iM544g5;
        }
        this.f913c = c0184bJp0y.f7l8(C7397k.qrj.mqs, -1);
        int iM544g6 = c0184bJp0y.m544g(C7397k.qrj.ym8, Integer.MIN_VALUE);
        int iM544g7 = c0184bJp0y.m544g(C7397k.qrj.dhzo, Integer.MIN_VALUE);
        int iF7l8 = c0184bJp0y.f7l8(C7397k.qrj.crha, 0);
        int iF7l82 = c0184bJp0y.f7l8(C7397k.qrj.fai, 0);
        qrj();
        this.f912b.m732n(iF7l8, iF7l82);
        if (iM544g6 != Integer.MIN_VALUE || iM544g7 != Integer.MIN_VALUE) {
            this.f912b.f7l8(iM544g6, iM544g7);
        }
        this.f911a = c0184bJp0y.m544g(C7397k.qrj.n358, Integer.MIN_VALUE);
        this.f934x = c0184bJp0y.m544g(C7397k.qrj.f1, Integer.MIN_VALUE);
        this.f929s = c0184bJp0y.m553y(C7397k.qrj.ue);
        this.f926p = c0184bJp0y.fu4(C7397k.qrj.m4ll);
        CharSequence charSequenceFu4 = c0184bJp0y.fu4(C7397k.qrj.bbg);
        if (!TextUtils.isEmpty(charSequenceFu4)) {
            setTitle(charSequenceFu4);
        }
        CharSequence charSequenceFu42 = c0184bJp0y.fu4(C7397k.qrj.cun);
        if (!TextUtils.isEmpty(charSequenceFu42)) {
            setSubtitle(charSequenceFu42);
        }
        this.f936z = getContext();
        setPopupTheme(c0184bJp0y.fn3e(C7397k.qrj.t57j, 0));
        Drawable drawableM553y = c0184bJp0y.m553y(C7397k.qrj.p1t5);
        if (drawableM553y != null) {
            setNavigationIcon(drawableM553y);
        }
        CharSequence charSequenceFu43 = c0184bJp0y.fu4(C7397k.qrj.mn);
        if (!TextUtils.isEmpty(charSequenceFu43)) {
            setNavigationContentDescription(charSequenceFu43);
        }
        Drawable drawableM553y2 = c0184bJp0y.m553y(C7397k.qrj.a5rs);
        if (drawableM553y2 != null) {
            setLogo(drawableM553y2);
        }
        CharSequence charSequenceFu44 = c0184bJp0y.fu4(C7397k.qrj.rb7);
        if (!TextUtils.isEmpty(charSequenceFu44)) {
            setLogoDescription(charSequenceFu44);
        }
        int i4 = C7397k.qrj.g6i;
        if (c0184bJp0y.mcp(i4)) {
            setTitleTextColor(c0184bJp0y.m550q(i4));
        }
        int i5 = C7397k.qrj.wutb;
        if (c0184bJp0y.mcp(i5)) {
            setSubtitleTextColor(c0184bJp0y.m550q(i5));
        }
        int i6 = C7397k.qrj.c4;
        if (c0184bJp0y.mcp(i6)) {
            mcp(c0184bJp0y.fn3e(i6, 0));
        }
        c0184bJp0y.d3();
    }
}
