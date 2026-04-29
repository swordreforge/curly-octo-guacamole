package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import zy.dd;
import zy.lvui;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: MenuPopup.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class x2 implements cdj, n7h, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: k */
    private Rect f576k;

    x2() {
    }

    protected static int cdj(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i3 = 0;
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = listAdapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i5, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i2) {
                return i2;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    protected static boolean o1t(f7l8 f7l8Var) {
        int size = f7l8Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = f7l8Var.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected static C0119g wvg(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0119g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0119g) listAdapter;
    }

    public abstract void fn3e(int i2);

    public abstract void fu4(boolean z2);

    @Override // androidx.appcompat.view.menu.n7h
    public int getId() {
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public Rect m390h() {
        return this.f576k;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo351i(boolean z2);

    public abstract void ki(View view);

    protected boolean kja0() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.n7h
    public boolean ld6(f7l8 f7l8Var, C0130p c0130p) {
        return false;
    }

    public abstract void ni7(PopupWindow.OnDismissListener onDismissListener);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        wvg(listAdapter).f460k.x9kr((MenuItem) listAdapter.getItem(i2), this, kja0() ? 0 : 4);
    }

    public abstract void qrj(f7l8 f7l8Var);

    public void t8r(Rect rect) {
        this.f576k = rect;
    }

    @Override // androidx.appcompat.view.menu.n7h
    public kja0 toq(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    @Override // androidx.appcompat.view.menu.n7h
    public void x2(@lvui Context context, @dd f7l8 f7l8Var) {
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: y */
    public boolean mo367y(f7l8 f7l8Var, C0130p c0130p) {
        return false;
    }

    /* JADX INFO: renamed from: z */
    public abstract void mo357z(int i2);

    public abstract void zurt(int i2);
}
