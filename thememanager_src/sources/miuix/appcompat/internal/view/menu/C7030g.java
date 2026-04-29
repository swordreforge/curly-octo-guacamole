package miuix.appcompat.internal.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import gb.toq;
import java.util.ArrayList;
import miuix.appcompat.internal.view.menu.ld6;
import miuix.appcompat.internal.view.menu.x2;
import miuix.internal.util.C7169q;

/* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.g */
/* JADX INFO: compiled from: ListMenuPresenter.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7030g implements ld6, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: r */
    public static final String f39515r = "miuix:menu:list";

    /* JADX INFO: renamed from: g */
    ExpandedMenuView f39516g;

    /* JADX INFO: renamed from: h */
    int f39517h;

    /* JADX INFO: renamed from: i */
    private ld6.InterfaceC7032k f39518i;

    /* JADX INFO: renamed from: k */
    Context f39519k;

    /* JADX INFO: renamed from: n */
    f7l8 f39520n;

    /* JADX INFO: renamed from: p */
    int f39521p;

    /* JADX INFO: renamed from: q */
    LayoutInflater f39522q;

    /* JADX INFO: renamed from: s */
    int f39523s;

    /* JADX INFO: renamed from: t */
    private int f39524t;

    /* JADX INFO: renamed from: y */
    private int f39525y;

    /* JADX INFO: renamed from: z */
    k f39526z;

    /* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.g$k */
    /* JADX INFO: compiled from: ListMenuPresenter.java */
    private class k extends BaseAdapter {

        /* JADX INFO: renamed from: k */
        private int f39527k = -1;

        public k() {
            m25356k();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C7030g.this.f39520n.mcp().size() - C7030g.this.f39525y;
            return this.f39527k < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                C7030g c7030g = C7030g.this;
                view = c7030g.f39522q.inflate(c7030g.f39521p, viewGroup, false);
                C7169q.m25967n(view);
            }
            ((x2.InterfaceC7037k) view).zy(getItem(i2), 0);
            return view;
        }

        /* JADX INFO: renamed from: k */
        void m25356k() {
            MenuItemC7036s menuItemC7036sM25351z = C7030g.this.f39520n.m25351z();
            if (menuItemC7036sM25351z != null) {
                ArrayList<MenuItemC7036s> arrayListMcp = C7030g.this.f39520n.mcp();
                int size = arrayListMcp.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (arrayListMcp.get(i2) == menuItemC7036sM25351z) {
                        this.f39527k = i2;
                        return;
                    }
                }
            }
            this.f39527k = -1;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m25356k();
            super.notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public MenuItemC7036s getItem(int i2) {
            ArrayList<MenuItemC7036s> arrayListMcp = C7030g.this.f39520n.mcp();
            int i3 = i2 + C7030g.this.f39525y;
            int i4 = this.f39527k;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return arrayListMcp.get(i3);
        }
    }

    public C7030g(Context context, int i2) {
        this(i2, 0);
        this.f39519k = context;
        this.f39522q = LayoutInflater.from(context);
    }

    public void cdj(int i2) {
        this.f39524t = i2;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public void f7l8(f7l8 f7l8Var, boolean z2) {
        ld6.InterfaceC7032k interfaceC7032k = this.f39518i;
        if (interfaceC7032k != null) {
            interfaceC7032k.f7l8(f7l8Var, z2);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public int getId() {
        return this.f39524t;
    }

    /* JADX INFO: renamed from: h */
    public void m25354h(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f39516g;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(f39515r, sparseArray);
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    /* JADX INFO: renamed from: k */
    public void mo25175k(Parcelable parcelable) {
        kja0((Bundle) parcelable);
    }

    public void ki(int i2) {
        this.f39525y = i2;
        if (this.f39516g != null) {
            mo25178q(false);
        }
    }

    public void kja0(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(f39515r);
        if (sparseParcelableArray != null) {
            this.f39516g.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public void ld6(ld6.InterfaceC7032k interfaceC7032k) {
        this.f39518i = interfaceC7032k;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    /* JADX INFO: renamed from: n */
    public boolean mo25176n() {
        return false;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public boolean n7h(qrj qrjVar) {
        if (!qrjVar.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC7038y(qrjVar).zy(null);
        ld6.InterfaceC7032k interfaceC7032k = this.f39518i;
        if (interfaceC7032k == null) {
            return true;
        }
        interfaceC7032k.mo25076y(qrjVar);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f39520n.m25348r(this.f39526z.getItem(i2), 0);
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    /* JADX INFO: renamed from: p */
    public boolean mo25177p(f7l8 f7l8Var, MenuItemC7036s menuItemC7036s) {
        return false;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    /* JADX INFO: renamed from: q */
    public void mo25178q(boolean z2) {
        k kVar = this.f39526z;
        if (kVar != null) {
            kVar.notifyDataSetChanged();
        }
    }

    int qrj() {
        return this.f39525y;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    /* JADX INFO: renamed from: s */
    public void mo25179s(Context context, f7l8 f7l8Var) {
        if (this.f39523s != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f39523s);
            this.f39519k = contextThemeWrapper;
            this.f39522q = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f39519k != null) {
            this.f39519k = context;
            if (this.f39522q == null) {
                this.f39522q = LayoutInflater.from(context);
            }
        }
        f7l8 f7l8Var2 = this.f39520n;
        if (f7l8Var2 != null) {
            f7l8Var2.m25344l(this);
        }
        this.f39520n = f7l8Var;
        k kVar = this.f39526z;
        if (kVar != null) {
            kVar.notifyDataSetChanged();
        }
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public x2 toq(ViewGroup viewGroup) {
        if (this.f39526z == null) {
            this.f39526z = new k();
        }
        if (this.f39526z.isEmpty()) {
            return null;
        }
        if (this.f39516g == null) {
            ExpandedMenuView expandedMenuView = (ExpandedMenuView) this.f39522q.inflate(this.f39517h, viewGroup, false);
            this.f39516g = expandedMenuView;
            expandedMenuView.setAdapter((ListAdapter) this.f39526z);
            this.f39516g.setOnItemClickListener(this);
        }
        return this.f39516g;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public boolean x2(f7l8 f7l8Var, MenuItemC7036s menuItemC7036s) {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public ListAdapter m25355y() {
        if (this.f39526z == null) {
            this.f39526z = new k();
        }
        return this.f39526z;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public Parcelable zy() {
        if (this.f39516g == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        m25354h(bundle);
        return bundle;
    }

    public C7030g(Context context, int i2, int i3) {
        this(i2, i3, 0);
        this.f39519k = context;
        this.f39522q = LayoutInflater.from(context);
    }

    public C7030g(int i2, int i3) {
        this(toq.qrj.f76750t8iq, i2, i3);
    }

    public C7030g(int i2, int i3, int i4) {
        this.f39521p = i3;
        this.f39517h = i2;
        this.f39523s = i4;
    }
}
