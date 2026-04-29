package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.C0116k;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0130p;
import androidx.appcompat.view.menu.kja0;
import androidx.appcompat.view.menu.n7h;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.toq;
import java.util.ArrayList;
import p030n.C7397k;

/* JADX INFO: loaded from: classes.dex */
class ActionMenuPresenter extends androidx.appcompat.view.menu.toq implements toq.InterfaceC0730k {
    private static final String bv = "ActionMenuPresenter";

    /* JADX INFO: renamed from: a */
    private boolean f652a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private toq f46812ab;

    /* JADX INFO: renamed from: b */
    private boolean f653b;
    final C0145g bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private final SparseBooleanArray f46813bo;
    int bp;

    /* JADX INFO: renamed from: c */
    private boolean f654c;

    /* JADX INFO: renamed from: d */
    C0146k f655d;

    /* JADX INFO: renamed from: e */
    private int f656e;

    /* JADX INFO: renamed from: f */
    private boolean f657f;

    /* JADX INFO: renamed from: j */
    private int f658j;

    /* JADX INFO: renamed from: l */
    private boolean f659l;

    /* JADX INFO: renamed from: m */
    private boolean f660m;

    /* JADX INFO: renamed from: o */
    private int f661o;

    /* JADX INFO: renamed from: r */
    private Drawable f662r;

    /* JADX INFO: renamed from: t */
    C0148q f663t;

    /* JADX INFO: renamed from: u */
    private int f664u;

    /* JADX INFO: renamed from: v */
    C0147n f665v;

    /* JADX INFO: renamed from: w */
    zy f666w;

    /* JADX INFO: renamed from: x */
    private boolean f667x;

    @SuppressLint({"BanParcelableUsage"})
    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.appcompat.widget.ActionMenuPresenter.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: k */
        public int f668k;

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f668k);
        }

        SavedState(Parcel parcel) {
            this.f668k = parcel.readInt();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$g */
    private class C0145g implements n7h.InterfaceC0129k {
        C0145g() {
        }

        @Override // androidx.appcompat.view.menu.n7h.InterfaceC0129k
        public void f7l8(@zy.lvui androidx.appcompat.view.menu.f7l8 f7l8Var, boolean z2) {
            if (f7l8Var instanceof androidx.appcompat.view.menu.t8r) {
                f7l8Var.jp0y().m328g(false);
            }
            n7h.InterfaceC0129k interfaceC0129kCdj = ActionMenuPresenter.this.cdj();
            if (interfaceC0129kCdj != null) {
                interfaceC0129kCdj.f7l8(f7l8Var, z2);
            }
        }

        @Override // androidx.appcompat.view.menu.n7h.InterfaceC0129k
        /* JADX INFO: renamed from: y */
        public boolean mo143y(@zy.lvui androidx.appcompat.view.menu.f7l8 f7l8Var) {
            if (f7l8Var == ((androidx.appcompat.view.menu.toq) ActionMenuPresenter.this).f570n) {
                return false;
            }
            ActionMenuPresenter.this.bp = ((androidx.appcompat.view.menu.t8r) f7l8Var).getItem().getItemId();
            n7h.InterfaceC0129k interfaceC0129kCdj = ActionMenuPresenter.this.cdj();
            if (interfaceC0129kCdj != null) {
                return interfaceC0129kCdj.mo143y(f7l8Var);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$k */
    private class C0146k extends androidx.appcompat.view.menu.qrj {
        public C0146k(Context context, androidx.appcompat.view.menu.t8r t8rVar, View view) {
            super(context, t8rVar, view, false, C7397k.toq.f92887jp0y);
            if (!((C0130p) t8rVar.getItem()).kja0()) {
                View view2 = ActionMenuPresenter.this.f663t;
                m387y(view2 == null ? (View) ((androidx.appcompat.view.menu.toq) ActionMenuPresenter.this).f568i : view2);
            }
            mo382k(ActionMenuPresenter.this.bb);
        }

        @Override // androidx.appcompat.view.menu.qrj
        protected void f7l8() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f655d = null;
            actionMenuPresenter.bp = 0;
            super.f7l8();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$n */
    private class C0147n extends androidx.appcompat.view.menu.qrj {
        public C0147n(Context context, androidx.appcompat.view.menu.f7l8 f7l8Var, View view, boolean z2) {
            super(context, f7l8Var, view, z2, C7397k.toq.f92887jp0y);
            m384p(androidx.core.view.qrj.f50866zy);
            mo382k(ActionMenuPresenter.this.bb);
        }

        @Override // androidx.appcompat.view.menu.qrj
        protected void f7l8() {
            if (((androidx.appcompat.view.menu.toq) ActionMenuPresenter.this).f570n != null) {
                ((androidx.appcompat.view.menu.toq) ActionMenuPresenter.this).f570n.close();
            }
            ActionMenuPresenter.this.f665v = null;
            super.f7l8();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$q */
    private class C0148q extends AppCompatImageView implements ActionMenuView.InterfaceC0149k {

        /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$q$k */
        class k extends dd {

            /* JADX INFO: renamed from: z */
            final /* synthetic */ ActionMenuPresenter f672z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f672z = actionMenuPresenter;
            }

            @Override // androidx.appcompat.widget.dd
            /* JADX INFO: renamed from: q */
            public boolean mo432q() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f666w != null) {
                    return false;
                }
                actionMenuPresenter.a9();
                return true;
            }

            @Override // androidx.appcompat.widget.dd
            public androidx.appcompat.view.menu.cdj toq() {
                C0147n c0147n = ActionMenuPresenter.this.f665v;
                if (c0147n == null) {
                    return null;
                }
                return c0147n.m383n();
            }

            @Override // androidx.appcompat.widget.dd
            public boolean zy() {
                ActionMenuPresenter.this.ncyb();
                return true;
            }
        }

        public C0148q(Context context) {
            super(context, null, C7397k.toq.f92860fti);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0182a.m528k(this, getContentDescription());
            setOnTouchListener(new k(this, ActionMenuPresenter.this));
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.ncyb();
            return true;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0149k
        /* JADX INFO: renamed from: q */
        public boolean mo311q() {
            return false;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.zy.x2(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0149k
        public boolean zy() {
            return false;
        }
    }

    private class toq extends ActionMenuItemView.toq {
        toq() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.toq
        /* JADX INFO: renamed from: k */
        public androidx.appcompat.view.menu.cdj mo313k() {
            C0146k c0146k = ActionMenuPresenter.this.f655d;
            if (c0146k != null) {
                return c0146k.m383n();
            }
            return null;
        }
    }

    private class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        private C0147n f674k;

        public zy(C0147n c0147n) {
            this.f674k = c0147n;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.toq) ActionMenuPresenter.this).f570n != null) {
                ((androidx.appcompat.view.menu.toq) ActionMenuPresenter.this).f570n.m335q();
            }
            View view = (View) ((androidx.appcompat.view.menu.toq) ActionMenuPresenter.this).f568i;
            if (view != null && view.getWindowToken() != null && this.f674k.kja0()) {
                ActionMenuPresenter.this.f665v = this.f674k;
            }
            ActionMenuPresenter.this.f666w = null;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C7397k.p.f42417q, C7397k.p.f92546zy);
        this.f46813bo = new SparseBooleanArray();
        this.bb = new C0145g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View mcp(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f568i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof kja0.InterfaceC0124k) && ((kja0.InterfaceC0124k) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean a9() {
        Object obj;
        zy zyVar = this.f666w;
        if (zyVar != null && (obj = this.f568i) != null) {
            ((View) obj).removeCallbacks(zyVar);
            this.f666w = null;
            return true;
        }
        C0147n c0147n = this.f665v;
        if (c0147n == null) {
            return false;
        }
        c0147n.dismiss();
        return true;
    }

    public void d2ok(int i2) {
        this.f661o = i2;
        this.f660m = true;
    }

    public boolean d3() {
        return this.f657f;
    }

    public void dd(boolean z2) {
        this.f657f = z2;
        this.f654c = true;
    }

    public void eqxt(boolean z2) {
        this.f667x = z2;
    }

    @Override // androidx.appcompat.view.menu.toq, androidx.appcompat.view.menu.n7h
    public void f7l8(androidx.appcompat.view.menu.f7l8 f7l8Var, boolean z2) {
        m430t();
        super.f7l8(f7l8Var, z2);
    }

    public boolean fti() {
        C0146k c0146k = this.f655d;
        if (c0146k == null) {
            return false;
        }
        c0146k.dismiss();
        return true;
    }

    @Override // androidx.core.view.toq.InterfaceC0730k
    /* JADX INFO: renamed from: g */
    public void mo428g(boolean z2) {
        if (z2) {
            super.mo354p(null);
            return;
        }
        androidx.appcompat.view.menu.f7l8 f7l8Var = this.f570n;
        if (f7l8Var != null) {
            f7l8Var.m328g(false);
        }
    }

    public boolean gvn7() {
        C0147n c0147n = this.f665v;
        return c0147n != null && c0147n.m380g();
    }

    @Override // androidx.appcompat.view.menu.toq
    /* JADX INFO: renamed from: h */
    public boolean mo388h(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.f663t) {
            return false;
        }
        return super.mo388h(viewGroup, i2);
    }

    @Override // androidx.appcompat.view.menu.toq
    /* JADX INFO: renamed from: i */
    public boolean mo389i(int i2, C0130p c0130p) {
        return c0130p.kja0();
    }

    public Drawable jk() {
        C0148q c0148q = this.f663t;
        if (c0148q != null) {
            return c0148q.getDrawable();
        }
        if (this.f659l) {
            return this.f662r;
        }
        return null;
    }

    public boolean jp0y() {
        return this.f666w != null || gvn7();
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: k */
    public void mo352k(Parcelable parcelable) {
        int i2;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i2 = ((SavedState) parcelable).f668k) > 0 && (menuItemFindItem = this.f570n.findItem(i2)) != null) {
            mo354p((androidx.appcompat.view.menu.t8r) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.toq
    public View ki(C0130p c0130p, View view, ViewGroup viewGroup) {
        View actionView = c0130p.getActionView();
        if (actionView == null || c0130p.qrj()) {
            actionView = super.ki(c0130p, view, viewGroup);
        }
        actionView.setVisibility(c0130p.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public void lvui(ActionMenuView actionMenuView) {
        this.f568i = actionMenuView;
        actionMenuView.zy(this.f570n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.ActionMenuPresenter] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.p] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.toq, androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: n */
    public boolean mo353n() {
        ArrayList<C0130p> arrayListGvn7;
        int size;
        int i2;
        int iLvui;
        ?? r0;
        int i3;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.f7l8 f7l8Var = actionMenuPresenter.f570n;
        View view = null;
        ?? r3 = 0;
        if (f7l8Var != null) {
            arrayListGvn7 = f7l8Var.gvn7();
            size = arrayListGvn7.size();
        } else {
            arrayListGvn7 = null;
            size = 0;
        }
        int i4 = actionMenuPresenter.f661o;
        int i5 = actionMenuPresenter.f658j;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f568i;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            C0130p c0130p = arrayListGvn7.get(i8);
            if (c0130p.toq()) {
                i6++;
            } else if (c0130p.cdj()) {
                i7++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.f667x && c0130p.isActionViewExpanded()) {
                i4 = 0;
            }
        }
        if (actionMenuPresenter.f657f && (z2 || i7 + i6 > i4)) {
            i4--;
        }
        int i9 = i4 - i6;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f46813bo;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f653b) {
            int i10 = actionMenuPresenter.f664u;
            iLvui = i5 / i10;
            i2 = i10 + ((i5 % i10) / iLvui);
        } else {
            i2 = 0;
            iLvui = 0;
        }
        int i11 = 0;
        int i12 = 0;
        ?? r02 = actionMenuPresenter;
        while (i11 < size) {
            C0130p c0130p2 = arrayListGvn7.get(i11);
            if (c0130p2.toq()) {
                View viewKi = r02.ki(c0130p2, view, viewGroup);
                if (r02.f653b) {
                    iLvui -= ActionMenuView.lvui(viewKi, i2, iLvui, iMakeMeasureSpec, r3);
                } else {
                    viewKi.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewKi.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                int groupId = c0130p2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c0130p2.fu4(true);
                r0 = r3;
                i3 = size;
            } else if (c0130p2.cdj()) {
                int groupId2 = c0130p2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z5 = (i9 > 0 || z3) && i5 > 0 && (!r02.f653b || iLvui > 0);
                boolean z6 = z5;
                i3 = size;
                if (z5) {
                    View viewKi2 = r02.ki(c0130p2, null, viewGroup);
                    if (r02.f653b) {
                        int iLvui2 = ActionMenuView.lvui(viewKi2, i2, iLvui, iMakeMeasureSpec, 0);
                        iLvui -= iLvui2;
                        if (iLvui2 == 0) {
                            z6 = false;
                        }
                    } else {
                        viewKi2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z7 = z6;
                    int measuredWidth2 = viewKi2.getMeasuredWidth();
                    i5 -= measuredWidth2;
                    if (i12 == 0) {
                        i12 = measuredWidth2;
                    }
                    z5 = z7 & (!r02.f653b ? i5 + i12 <= 0 : i5 < 0);
                }
                if (z5 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i13 = 0; i13 < i11; i13++) {
                        C0130p c0130p3 = arrayListGvn7.get(i13);
                        if (c0130p3.getGroupId() == groupId2) {
                            if (c0130p3.kja0()) {
                                i9++;
                            }
                            c0130p3.fu4(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                c0130p2.fu4(z5);
                r0 = 0;
            } else {
                r0 = r3;
                i3 = size;
                c0130p2.fu4(r0);
            }
            i11++;
            r3 = r0;
            size = i3;
            view = null;
            r02 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.toq
    public void n7h(C0130p c0130p, kja0.InterfaceC0124k interfaceC0124k) {
        interfaceC0124k.mo309g(c0130p, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0124k;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f568i);
        if (this.f46812ab == null) {
            this.f46812ab = new toq();
        }
        actionMenuItemView.setPopupCallback(this.f46812ab);
    }

    public boolean ncyb() {
        androidx.appcompat.view.menu.f7l8 f7l8Var;
        if (!this.f657f || gvn7() || (f7l8Var = this.f570n) == null || this.f568i == null || this.f666w != null || f7l8Var.mcp().isEmpty()) {
            return false;
        }
        zy zyVar = new zy(new C0147n(this.f572q, this.f570n, this.f663t, true));
        this.f666w = zyVar;
        ((View) this.f568i).post(zyVar);
        return true;
    }

    public void oc(Configuration configuration) {
        if (!this.f660m) {
            this.f661o = C0116k.toq(this.f572q).m305q();
        }
        androidx.appcompat.view.menu.f7l8 f7l8Var = this.f570n;
        if (f7l8Var != null) {
            f7l8Var.mo336r(true);
        }
    }

    @Override // androidx.appcompat.view.menu.toq, androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: p */
    public boolean mo354p(androidx.appcompat.view.menu.t8r t8rVar) {
        boolean z2 = false;
        if (!t8rVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.t8r t8rVar2 = t8rVar;
        while (t8rVar2.zp() != this.f570n) {
            t8rVar2 = (androidx.appcompat.view.menu.t8r) t8rVar2.zp();
        }
        View viewMcp = mcp(t8rVar2.getItem());
        if (viewMcp == null) {
            return false;
        }
        this.bp = t8rVar.getItem().getItemId();
        int size = t8rVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = t8rVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        C0146k c0146k = new C0146k(this.f572q, t8rVar, viewMcp);
        this.f655d = c0146k;
        c0146k.m386s(z2);
        this.f655d.x2();
        super.mo354p(t8rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.toq, androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: q */
    public void mo355q(boolean z2) {
        super.mo355q(z2);
        ((View) this.f568i).requestLayout();
        androidx.appcompat.view.menu.f7l8 f7l8Var = this.f570n;
        boolean z3 = false;
        if (f7l8Var != null) {
            ArrayList<C0130p> arrayListZurt = f7l8Var.zurt();
            int size = arrayListZurt.size();
            for (int i2 = 0; i2 < size; i2++) {
                androidx.core.view.toq toqVarMo345k = arrayListZurt.get(i2).mo345k();
                if (toqVarMo345k != null) {
                    toqVarMo345k.ld6(this);
                }
            }
        }
        androidx.appcompat.view.menu.f7l8 f7l8Var2 = this.f570n;
        ArrayList<C0130p> arrayListMcp = f7l8Var2 != null ? f7l8Var2.mcp() : null;
        if (this.f657f && arrayListMcp != null) {
            int size2 = arrayListMcp.size();
            if (size2 == 1) {
                z3 = !arrayListMcp.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f663t == null) {
                this.f663t = new C0148q(this.f569k);
            }
            ViewGroup viewGroup = (ViewGroup) this.f663t.getParent();
            if (viewGroup != this.f568i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f663t);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f568i;
                actionMenuView.addView(this.f663t, actionMenuView.jp0y());
            }
        } else {
            C0148q c0148q = this.f663t;
            if (c0148q != null) {
                Object parent = c0148q.getParent();
                Object obj = this.f568i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f663t);
                }
            }
        }
        ((ActionMenuView) this.f568i).setOverflowReserved(this.f657f);
    }

    /* JADX INFO: renamed from: r */
    public void m429r(Drawable drawable) {
        C0148q c0148q = this.f663t;
        if (c0148q != null) {
            c0148q.setImageDrawable(drawable);
        } else {
            this.f659l = true;
            this.f662r = drawable;
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m430t() {
        return a9() | fti();
    }

    @Override // androidx.appcompat.view.menu.toq, androidx.appcompat.view.menu.n7h
    public androidx.appcompat.view.menu.kja0 toq(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.kja0 kja0Var = this.f568i;
        androidx.appcompat.view.menu.kja0 qVar = super.toq(viewGroup);
        if (kja0Var != qVar) {
            ((ActionMenuView) qVar).setPresenter(this);
        }
        return qVar;
    }

    @Override // androidx.appcompat.view.menu.toq, androidx.appcompat.view.menu.n7h
    public void x2(@zy.lvui Context context, @zy.dd androidx.appcompat.view.menu.f7l8 f7l8Var) {
        super.x2(context, f7l8Var);
        Resources resources = context.getResources();
        C0116k qVar = C0116k.toq(context);
        if (!this.f654c) {
            this.f657f = qVar.m306y();
        }
        if (!this.f652a) {
            this.f656e = qVar.zy();
        }
        if (!this.f660m) {
            this.f661o = qVar.m305q();
        }
        int measuredWidth = this.f656e;
        if (this.f657f) {
            if (this.f663t == null) {
                C0148q c0148q = new C0148q(this.f569k);
                this.f663t = c0148q;
                if (this.f659l) {
                    c0148q.setImageDrawable(this.f662r);
                    this.f662r = null;
                    this.f659l = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f663t.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f663t.getMeasuredWidth();
        } else {
            this.f663t = null;
        }
        this.f658j = measuredWidth;
        this.f664u = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public void x9kr(int i2, boolean z2) {
        this.f656e = i2;
        this.f653b = z2;
        this.f652a = true;
    }

    @Override // androidx.appcompat.view.menu.n7h
    public Parcelable zy() {
        SavedState savedState = new SavedState();
        savedState.f668k = this.bp;
        return savedState;
    }
}
