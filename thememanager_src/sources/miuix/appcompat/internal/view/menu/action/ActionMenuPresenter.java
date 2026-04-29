package miuix.appcompat.internal.view.menu.action;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import gb.toq;
import java.util.ArrayList;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.appcompat.internal.view.C7010k;
import miuix.appcompat.internal.view.menu.AbstractC7031k;
import miuix.appcompat.internal.view.menu.C7030g;
import miuix.appcompat.internal.view.menu.DialogInterfaceOnKeyListenerC7038y;
import miuix.appcompat.internal.view.menu.MenuItemC7036s;
import miuix.appcompat.internal.view.menu.ViewOnKeyListenerC7034p;
import miuix.appcompat.internal.view.menu.action.f7l8;
import miuix.appcompat.internal.view.menu.f7l8;
import miuix.appcompat.internal.view.menu.ld6;
import miuix.appcompat.internal.view.menu.qrj;
import miuix.appcompat.internal.view.menu.x2;
import miuix.internal.util.C7164n;

/* JADX INFO: loaded from: classes3.dex */
public class ActionMenuPresenter extends AbstractC7031k {

    /* JADX INFO: renamed from: a */
    private boolean f39383a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private MenuItemC7036s f86982ab;
    final f7l8 an;

    /* JADX INFO: renamed from: b */
    private boolean f39384b;
    private toq bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private final SparseBooleanArray f86983bo;
    private RunnableC7015q bp;
    protected ActionBarOverlayLayout bv;

    /* JADX INFO: renamed from: c */
    private int f39385c;

    /* JADX INFO: renamed from: d */
    private InterfaceC7014n f39386d;

    /* JADX INFO: renamed from: e */
    private int f39387e;

    /* JADX INFO: renamed from: f */
    private int f39388f;
    int id;
    private View in;

    /* JADX INFO: renamed from: j */
    private int f39389j;

    /* JADX INFO: renamed from: l */
    private boolean f39390l;

    /* JADX INFO: renamed from: m */
    private boolean f39391m;

    /* JADX INFO: renamed from: o */
    private int f39392o;

    /* JADX INFO: renamed from: r */
    private boolean f39393r;

    /* JADX INFO: renamed from: t */
    protected View f39394t;

    /* JADX INFO: renamed from: u */
    private int f39395u;

    /* JADX INFO: renamed from: v */
    private View f39396v;

    /* JADX INFO: renamed from: w */
    private InterfaceC7014n f39397w;

    /* JADX INFO: renamed from: x */
    private boolean f39398x;

    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: miuix.appcompat.internal.view.menu.action.ActionMenuPresenter.SavedState.1
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
        public int f39399k;

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f39399k);
        }

        SavedState(Parcel parcel) {
            this.f39399k = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class f7l8 implements ld6.InterfaceC7032k {
        private f7l8() {
        }

        @Override // miuix.appcompat.internal.view.menu.ld6.InterfaceC7032k
        public void f7l8(miuix.appcompat.internal.view.menu.f7l8 f7l8Var, boolean z2) {
            if (f7l8Var instanceof qrj) {
                AbstractC7031k.qrj(f7l8Var.jp0y(), false);
            }
        }

        @Override // miuix.appcompat.internal.view.menu.ld6.InterfaceC7032k
        /* JADX INFO: renamed from: y */
        public boolean mo25076y(miuix.appcompat.internal.view.menu.f7l8 f7l8Var) {
            if (f7l8Var == null) {
                return false;
            }
            ActionMenuPresenter.this.id = ((qrj) f7l8Var).getItem().getItemId();
            return false;
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.action.ActionMenuPresenter$g */
    private class C7012g extends ViewOnKeyListenerC7034p implements InterfaceC7014n {
        public C7012g(Context context, miuix.appcompat.internal.view.menu.f7l8 f7l8Var, View view, View view2, boolean z2) {
            super(context, f7l8Var, view, view2, z2);
            TypedValue typedValueX2 = C7164n.x2(context, toq.C6055q.mgf);
            int dimensionPixelSize = (typedValueX2 == null || typedValueX2.type != 5) ? 0 : typedValueX2.resourceId > 0 ? context.getResources().getDimensionPixelSize(typedValueX2.resourceId) : TypedValue.complexToDimensionPixelSize(typedValueX2.data, context.getResources().getDisplayMetrics());
            if (dimensionPixelSize > 0) {
                fu4(dimensionPixelSize);
            }
            ld6(ActionMenuPresenter.this.an);
            ni7(toq.qrj.f76744qkj8);
            int iMo25276e = ActionMenuPresenter.this.mo25276e(view);
            if (iMo25276e != -1) {
                m25363i(iMo25276e);
            }
        }

        @Override // miuix.appcompat.internal.view.menu.ViewOnKeyListenerC7034p, miuix.appcompat.internal.view.menu.action.ActionMenuPresenter.InterfaceC7014n
        /* JADX INFO: renamed from: g */
        public void mo25286g(boolean z2) {
            super.mo25286g(z2);
            View view = ActionMenuPresenter.this.f39394t;
            if (view != null) {
                view.setSelected(false);
            }
        }

        @Override // miuix.appcompat.internal.view.menu.ViewOnKeyListenerC7034p, android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            super.onDismiss();
            ((AbstractC7031k) ActionMenuPresenter.this).f39533n.close();
            ActionMenuPresenter.this.f39386d = null;
        }

        @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter.InterfaceC7014n
        public void qrj(miuix.appcompat.internal.view.menu.f7l8 f7l8Var) {
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.action.ActionMenuPresenter$n */
    private interface InterfaceC7014n {
        /* JADX INFO: renamed from: g */
        void mo25286g(boolean z2);

        boolean isShowing();

        void qrj(miuix.appcompat.internal.view.menu.f7l8 f7l8Var);

        /* JADX INFO: renamed from: y */
        boolean mo25287y();
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.action.ActionMenuPresenter$q */
    private class RunnableC7015q implements Runnable {

        /* JADX INFO: renamed from: k */
        private InterfaceC7014n f39402k;

        public RunnableC7015q(InterfaceC7014n interfaceC7014n) {
            this.f39402k = interfaceC7014n;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view = (View) ((AbstractC7031k) ActionMenuPresenter.this).f39531i;
            if (view != null && view.getWindowToken() != null && this.f39402k.mo25287y()) {
                ActionMenuPresenter.this.f39386d = this.f39402k;
            }
            ActionMenuPresenter.this.bp = null;
        }
    }

    private class toq extends DialogInterfaceOnKeyListenerC7038y {
        public toq(qrj qrjVar) {
            super(qrjVar);
            ActionMenuPresenter.this.ld6(ActionMenuPresenter.this.an);
        }

        @Override // miuix.appcompat.internal.view.menu.DialogInterfaceOnKeyListenerC7038y, android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            ActionMenuPresenter.this.bb = null;
            ActionMenuPresenter.this.id = 0;
        }
    }

    private class zy implements InterfaceC7014n {

        /* JADX INFO: renamed from: k */
        private C7030g f39405k;

        private zy() {
        }

        /* JADX INFO: renamed from: k */
        private C7030g m25288k(miuix.appcompat.internal.view.menu.f7l8 f7l8Var) {
            if (this.f39405k == null) {
                this.f39405k = new C7030g(((AbstractC7031k) ActionMenuPresenter.this).f39535q, ActionMenuPresenter.this.f39392o, ActionMenuPresenter.this.f39389j);
            }
            f7l8Var.zy(this.f39405k);
            return this.f39405k;
        }

        @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter.InterfaceC7014n
        /* JADX INFO: renamed from: g */
        public void mo25286g(boolean z2) {
            if (((AbstractC7031k) ActionMenuPresenter.this).f39531i instanceof PhoneActionMenuView) {
                ((PhoneActionMenuView) ((AbstractC7031k) ActionMenuPresenter.this).f39531i).a9(ActionMenuPresenter.this.bv);
            }
        }

        @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter.InterfaceC7014n
        public boolean isShowing() {
            if (((AbstractC7031k) ActionMenuPresenter.this).f39531i instanceof PhoneActionMenuView) {
                return ((PhoneActionMenuView) ((AbstractC7031k) ActionMenuPresenter.this).f39531i).jp0y();
            }
            return false;
        }

        @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter.InterfaceC7014n
        public void qrj(miuix.appcompat.internal.view.menu.f7l8 f7l8Var) {
            if (((AbstractC7031k) ActionMenuPresenter.this).f39531i instanceof PhoneActionMenuView) {
                ((PhoneActionMenuView) ((AbstractC7031k) ActionMenuPresenter.this).f39531i).setOverflowMenuView(toq(f7l8Var));
            }
        }

        public View toq(miuix.appcompat.internal.view.menu.f7l8 f7l8Var) {
            if (f7l8Var == null || f7l8Var.mcp().size() <= 0) {
                return null;
            }
            return (View) m25288k(f7l8Var).toq((ViewGroup) ((AbstractC7031k) ActionMenuPresenter.this).f39531i);
        }

        @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter.InterfaceC7014n
        /* JADX INFO: renamed from: y */
        public boolean mo25287y() {
            if (((AbstractC7031k) ActionMenuPresenter.this).f39531i instanceof PhoneActionMenuView) {
                return ((PhoneActionMenuView) ((AbstractC7031k) ActionMenuPresenter.this).f39531i).gvn7(ActionMenuPresenter.this.bv);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context, ActionBarOverlayLayout actionBarOverlayLayout, int i2, int i3) {
        this(context, actionBarOverlayLayout, i2, i3, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View lrht(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f39531i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof x2.InterfaceC7037k) && ((x2.InterfaceC7037k) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    private InterfaceC7014n vyq() {
        if (nmn5()) {
            return new C7012g(this.f39535q, this.f39533n, this.f39394t, this.bv, true);
        }
        if (this.f39397w == null) {
            this.f39397w = new zy();
        }
        return this.f39397w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void yz() {
        miuix.appcompat.internal.view.menu.f7l8 f7l8Var = this.f39533n;
        if (f7l8Var != null) {
            AbstractC7031k.cdj(f7l8Var, f7l8Var.jp0y(), nn86());
        }
        if (this.f39394t.isSelected()) {
            hb(true);
        } else {
            lv5();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m25273a(boolean z2) {
        this.f39398x = z2;
    }

    public void a98o(View view) {
        ViewGroup viewGroup;
        View view2 = this.in;
        if (view2 != null && view2 != view && (viewGroup = (ViewGroup) view2.getParent()) != null) {
            viewGroup.removeView(this.in);
        }
        this.in = view;
        if (view.getParent() == null) {
            x2 x2Var = this.f39531i;
            if (x2Var instanceof ResponsiveActionMenuView) {
                ((ResponsiveActionMenuView) x2Var).jp0y(view);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m25274b(boolean z2) {
        if (z2) {
            super.n7h(null);
        } else {
            AbstractC7031k.qrj(this.f39533n, false);
        }
    }

    public void bf2() {
        if (this.in != null) {
            x2 x2Var = this.f39531i;
            if (x2Var instanceof ResponsiveActionMenuView) {
                ((ResponsiveActionMenuView) x2Var).ncyb();
            }
            this.in = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m25275c(boolean z2) {
        return hb(z2);
    }

    public void ch(int i2, boolean z2) {
        this.f39388f = i2;
        this.f39384b = z2;
        this.f39383a = true;
    }

    public void dd(int i2) {
        x9kr(i2, 2);
    }

    /* JADX INFO: renamed from: e */
    protected int mo25276e(View view) {
        return -1;
    }

    public boolean ek5k() {
        return this.f39393r;
    }

    /* JADX INFO: renamed from: f */
    protected View mo25277f(Context context) {
        miuix.appcompat.internal.view.menu.action.f7l8 f7l8Var = new miuix.appcompat.internal.view.menu.action.f7l8(context, null, this.f39395u);
        f7l8Var.toq(new f7l8.InterfaceC7019k() { // from class: miuix.appcompat.internal.view.menu.action.q
            @Override // miuix.appcompat.internal.view.menu.action.f7l8.InterfaceC7019k
            /* JADX INFO: renamed from: k */
            public final void mo25310k() {
                this.f39491k.yz();
            }
        });
        return f7l8Var;
    }

    @Override // miuix.appcompat.internal.view.menu.AbstractC7031k, miuix.appcompat.internal.view.menu.ld6
    public void f7l8(miuix.appcompat.internal.view.menu.f7l8 f7l8Var, boolean z2) {
        m25275c(true);
        super.f7l8(f7l8Var, z2);
    }

    @Override // miuix.appcompat.internal.view.menu.AbstractC7031k
    public boolean fn3e(int i2, MenuItemC7036s menuItemC7036s) {
        return menuItemC7036s.ki();
    }

    public boolean hb(boolean z2) {
        if (this.bp != null && this.f39531i != null) {
            this.f39394t.setSelected(false);
            ((View) this.f39531i).removeCallbacks(this.bp);
            this.bp = null;
            return true;
        }
        InterfaceC7014n interfaceC7014n = this.f39386d;
        if (interfaceC7014n == null) {
            return false;
        }
        boolean zIsShowing = interfaceC7014n.isShowing();
        if (zIsShowing) {
            this.f39394t.setSelected(false);
        }
        this.f39386d.mo25286g(z2);
        return zIsShowing;
    }

    public void hyr(MenuItem menuItem) {
        if (menuItem instanceof MenuItemC7036s) {
            MenuItemC7036s menuItemC7036s = (MenuItemC7036s) menuItem;
            menuItemC7036s.zurt(false);
            t8iq(menuItemC7036s);
        }
    }

    public void i1(boolean z2) {
        if (z2) {
            this.f39395u = toq.C6055q.f76613r8s8;
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m25278j() {
        toq toqVar = this.bb;
        if (toqVar == null) {
            return false;
        }
        toqVar.m25377k();
        return true;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    /* JADX INFO: renamed from: k */
    public void mo25175k(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        int i2 = ((SavedState) parcelable).f39399k;
        if (i2 <= 0 || (menuItemFindItem = this.f39533n.findItem(i2)) == null) {
            return;
        }
        n7h((qrj) menuItemFindItem.getSubMenu());
    }

    @Override // miuix.appcompat.internal.view.menu.AbstractC7031k
    public View ki(MenuItemC7036s menuItemC7036s, View view, ViewGroup viewGroup) {
        View actionView = menuItemC7036s.getActionView();
        if (actionView == null || menuItemC7036s.m25370h()) {
            if (!mo25281o(view)) {
                view = null;
            }
            actionView = super.ki(menuItemC7036s, view, viewGroup);
        }
        actionView.setVisibility(menuItemC7036s.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    /* JADX INFO: renamed from: l */
    public void m25279l(MenuItem menuItem, int i2) {
        if (menuItem instanceof MenuItemC7036s) {
            MenuItemC7036s menuItemC7036s = (MenuItemC7036s) menuItem;
            menuItemC7036s.ni7(true, i2);
            t8iq(menuItemC7036s);
        }
    }

    public boolean lv5() {
        if (!this.f39393r || m25280m() || this.f39533n == null || this.f39531i == null || this.bp != null || this.f39394t == null) {
            return false;
        }
        RunnableC7015q runnableC7015q = new RunnableC7015q(vyq());
        this.bp = runnableC7015q;
        ((View) this.f39531i).post(runnableC7015q);
        super.n7h(null);
        this.f39394t.setSelected(true);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public boolean m25280m() {
        InterfaceC7014n interfaceC7014n = this.f39386d;
        return interfaceC7014n != null && interfaceC7014n.isShowing();
    }

    @Override // miuix.appcompat.internal.view.menu.AbstractC7031k, miuix.appcompat.internal.view.menu.ld6
    /* JADX INFO: renamed from: n */
    public boolean mo25176n() {
        ArrayList<MenuItemC7036s> arrayListGvn7 = this.f39533n.gvn7();
        int size = arrayListGvn7.size();
        int i2 = this.f39387e;
        if (i2 < size) {
            i2--;
        }
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i3 >= size || i2 <= 0) {
                break;
            }
            MenuItemC7036s menuItemC7036s = arrayListGvn7.get(i3);
            if (!menuItemC7036s.m25371i() && !menuItemC7036s.toq()) {
                z2 = false;
            }
            menuItemC7036s.wvg(z2);
            if (z2) {
                i2--;
            }
            i3++;
        }
        while (i3 < size) {
            arrayListGvn7.get(i3).wvg(false);
            i3++;
        }
        return true;
    }

    public void n5r1(int i2) {
        hyr(this.f39533n.findItem(i2));
    }

    @Override // miuix.appcompat.internal.view.menu.AbstractC7031k, miuix.appcompat.internal.view.menu.ld6
    public boolean n7h(qrj qrjVar) {
        if (!qrjVar.hasVisibleItems()) {
            return false;
        }
        qrj qrjVar2 = qrjVar;
        while (qrjVar2.m25367x() != this.f39533n) {
            qrjVar2 = (qrj) qrjVar2.m25367x();
        }
        if (lrht(qrjVar2.getItem()) == null && this.f39394t == null) {
            return false;
        }
        this.id = qrjVar.getItem().getItemId();
        toq toqVar = new toq(qrjVar);
        this.bb = toqVar;
        toqVar.zy(null);
        super.n7h(qrjVar);
        return true;
    }

    public void ncyb(MenuItem menuItem) {
        m25279l(menuItem, 2);
    }

    protected boolean nmn5() {
        View view = this.f39394t;
        return (view == null || view.getParent() == null) ? false : true;
    }

    protected MenuItemC7036s nn86() {
        if (this.f86982ab == null) {
            this.f86982ab = AbstractC7031k.m25357h(this.f39533n, 0, toq.C6054p.iz, 0, 0, this.f39535q.getString(toq.C6051h.anw), 0);
        }
        return this.f86982ab;
    }

    /* JADX INFO: renamed from: o */
    protected boolean mo25281o(View view) {
        return view instanceof ActionMenuItemView;
    }

    @Override // miuix.appcompat.internal.view.menu.AbstractC7031k, miuix.appcompat.internal.view.menu.ld6
    /* JADX INFO: renamed from: q */
    public void mo25178q(boolean z2) {
        super.mo25178q(z2);
        if (this.f39531i == null) {
            return;
        }
        miuix.appcompat.internal.view.menu.f7l8 f7l8Var = this.f39533n;
        ArrayList<MenuItemC7036s> arrayListMcp = f7l8Var != null ? f7l8Var.mcp() : null;
        boolean z3 = false;
        if (this.f39393r && arrayListMcp != null) {
            int size = arrayListMcp.size();
            if (size == 1) {
                z3 = !arrayListMcp.get(0).isActionViewExpanded();
            } else if (size > 0) {
                z3 = true;
            }
        }
        if (z3) {
            View view = this.f39394t;
            if (view == null) {
                this.f39394t = mo25277f(this.f39532k);
            } else {
                view.setTranslationY(0.0f);
            }
            ViewGroup viewGroup = (ViewGroup) this.f39394t.getParent();
            if (viewGroup != this.f39531i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f39394t);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f39531i;
                View view2 = this.f39394t;
                actionMenuView.addView(view2, actionMenuView.kja0(view2));
            }
        } else {
            View view3 = this.f39394t;
            if (view3 != null) {
                Object parent = view3.getParent();
                Object obj = this.f39531i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f39394t);
                }
            }
        }
        ((ActionMenuView) this.f39531i).setOverflowReserved(this.f39393r);
        if (nmn5()) {
            return;
        }
        vyq().qrj(this.f39533n);
    }

    @Override // miuix.appcompat.internal.view.menu.AbstractC7031k, miuix.appcompat.internal.view.menu.ld6
    /* JADX INFO: renamed from: s */
    public void mo25179s(Context context, miuix.appcompat.internal.view.menu.f7l8 f7l8Var) {
        super.mo25179s(context, f7l8Var);
        context.getResources();
        C7010k qVar = C7010k.toq(context);
        if (!this.f39390l) {
            this.f39393r = qVar.m25259p();
        }
        if (!this.f39383a) {
            this.f39388f = qVar.zy();
        }
        if (!this.f39391m) {
            this.f39387e = uv6();
        }
        int measuredWidth = this.f39388f;
        if (this.f39393r) {
            if (this.f39394t == null) {
                this.f39394t = mo25277f(this.f39532k);
            }
            if (this.f39394t != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f39394t.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                measuredWidth -= this.f39394t.getMeasuredWidth();
            }
        } else {
            this.f39394t = null;
        }
        this.f39385c = measuredWidth;
        this.f39396v = null;
    }

    public void t8iq(MenuItemC7036s menuItemC7036s) {
        menuItemC7036s.d2ok();
    }

    @Override // miuix.appcompat.internal.view.menu.AbstractC7031k, miuix.appcompat.internal.view.menu.ld6
    public x2 toq(ViewGroup viewGroup) {
        x2 qVar = super.toq(viewGroup);
        ((ActionMenuView) qVar).setPresenter(this);
        View view = this.in;
        if (view != null && view.getParent() == null && (qVar instanceof ResponsiveActionMenuView)) {
            ((ResponsiveActionMenuView) qVar).jp0y(this.in);
        }
        return qVar;
    }

    /* JADX INFO: renamed from: u */
    public void m25282u() {
        for (int i2 = 0; i2 < this.f39533n.size(); i2++) {
            MenuItem item = this.f39533n.getItem(i2);
            if (item instanceof MenuItemC7036s) {
                ((MenuItemC7036s) item).d2ok();
            }
        }
    }

    protected int uv6() {
        Context context = this.f39535q;
        if (context != null) {
            return C7164n.ld6(context, toq.C6055q.f76636vq, 5);
        }
        return 5;
    }

    /* JADX INFO: renamed from: x */
    public void m25283x(boolean z2) {
        this.f39393r = z2;
        this.f39390l = true;
    }

    public void x9kr(int i2, int i3) {
        m25279l(this.f39533n.findItem(i2), i3);
    }

    @Override // miuix.appcompat.internal.view.menu.AbstractC7031k
    /* JADX INFO: renamed from: y */
    public void mo25284y(MenuItemC7036s menuItemC7036s, x2.InterfaceC7037k interfaceC7037k) {
        interfaceC7037k.zy(menuItemC7036s, 0);
        interfaceC7037k.setItemInvoker((f7l8.zy) this.f39531i);
    }

    public void y9n(Configuration configuration) {
        if (!this.f39391m && this.f39535q != null) {
            this.f39387e = uv6();
        }
        miuix.appcompat.internal.view.menu.f7l8 f7l8Var = this.f39533n;
        if (f7l8Var != null) {
            AbstractC7031k.t8r(f7l8Var, true);
        }
    }

    public void zp(int i2) {
        this.f39391m = true;
        int i3 = this.f39387e;
        this.f39387e = i2;
        miuix.appcompat.internal.view.menu.f7l8 f7l8Var = this.f39533n;
        if (f7l8Var == null || i3 == i2) {
            return;
        }
        f7l8Var.zp();
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public Parcelable zy() {
        SavedState savedState = new SavedState();
        savedState.f39399k = this.id;
        return savedState;
    }

    public ActionMenuPresenter(Context context, ActionBarOverlayLayout actionBarOverlayLayout, int i2, int i3, int i4, int i5) {
        super(context, i2, i3);
        this.f39395u = R.attr.actionOverflowButtonStyle;
        this.f86983bo = new SparseBooleanArray();
        this.an = new f7l8();
        this.f39392o = i4;
        this.f39389j = i5;
        this.bv = actionBarOverlayLayout;
    }
}
