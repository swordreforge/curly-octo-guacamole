package androidx.appcompat.view.menu;

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
import androidx.appcompat.view.menu.kja0;
import androidx.appcompat.view.menu.n7h;
import java.util.ArrayList;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.n */
/* JADX INFO: compiled from: ListMenuPresenter.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C0128n implements n7h, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: r */
    public static final String f501r = "android:menu:list";

    /* JADX INFO: renamed from: t */
    private static final String f502t = "ListMenuPresenter";

    /* JADX INFO: renamed from: g */
    ExpandedMenuView f503g;

    /* JADX INFO: renamed from: h */
    private n7h.InterfaceC0129k f504h;

    /* JADX INFO: renamed from: i */
    k f505i;

    /* JADX INFO: renamed from: k */
    Context f506k;

    /* JADX INFO: renamed from: n */
    f7l8 f507n;

    /* JADX INFO: renamed from: p */
    int f508p;

    /* JADX INFO: renamed from: q */
    LayoutInflater f509q;

    /* JADX INFO: renamed from: s */
    int f510s;

    /* JADX INFO: renamed from: y */
    int f511y;

    /* JADX INFO: renamed from: z */
    private int f512z;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.n$k */
    /* JADX INFO: compiled from: ListMenuPresenter.java */
    private class k extends BaseAdapter {

        /* JADX INFO: renamed from: k */
        private int f513k = -1;

        public k() {
            m368k();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0128n.this.f507n.mcp().size() - C0128n.this.f511y;
            return this.f513k < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0128n c0128n = C0128n.this;
                view = c0128n.f509q.inflate(c0128n.f508p, viewGroup, false);
            }
            ((kja0.InterfaceC0124k) view).mo309g(getItem(i2), 0);
            return view;
        }

        /* JADX INFO: renamed from: k */
        void m368k() {
            C0130p c0130pM339z = C0128n.this.f507n.m339z();
            if (c0130pM339z != null) {
                ArrayList<C0130p> arrayListMcp = C0128n.this.f507n.mcp();
                int size = arrayListMcp.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (arrayListMcp.get(i2) == c0130pM339z) {
                        this.f513k = i2;
                        return;
                    }
                }
            }
            this.f513k = -1;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m368k();
            super.notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public C0130p getItem(int i2) {
            ArrayList<C0130p> arrayListMcp = C0128n.this.f507n.mcp();
            int i3 = i2 + C0128n.this.f511y;
            int i4 = this.f513k;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return arrayListMcp.get(i3);
        }
    }

    public C0128n(Context context, int i2) {
        this(i2, 0);
        this.f506k = context;
        this.f509q = LayoutInflater.from(context);
    }

    public void cdj(int i2) {
        this.f511y = i2;
        if (this.f503g != null) {
            mo355q(false);
        }
    }

    @Override // androidx.appcompat.view.menu.n7h
    public void f7l8(f7l8 f7l8Var, boolean z2) {
        n7h.InterfaceC0129k interfaceC0129k = this.f504h;
        if (interfaceC0129k != null) {
            interfaceC0129k.f7l8(f7l8Var, z2);
        }
    }

    /* JADX INFO: renamed from: g */
    public ListAdapter m365g() {
        if (this.f505i == null) {
            this.f505i = new k();
        }
        return this.f505i;
    }

    @Override // androidx.appcompat.view.menu.n7h
    public int getId() {
        return this.f512z;
    }

    /* JADX INFO: renamed from: h */
    public void m366h(int i2) {
        this.f512z = i2;
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: k */
    public void mo352k(Parcelable parcelable) {
        n7h((Bundle) parcelable);
    }

    public void kja0(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f503g;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(f501r, sparseArray);
    }

    @Override // androidx.appcompat.view.menu.n7h
    public boolean ld6(f7l8 f7l8Var, C0130p c0130p) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: n */
    public boolean mo353n() {
        return false;
    }

    public void n7h(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(f501r);
        if (sparseParcelableArray != null) {
            this.f503g.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f507n.x9kr(this.f505i.getItem(i2), this, 0);
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: p */
    public boolean mo354p(t8r t8rVar) {
        if (!t8rVar.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC0134y(t8rVar).zy(null);
        n7h.InterfaceC0129k interfaceC0129k = this.f504h;
        if (interfaceC0129k == null) {
            return true;
        }
        interfaceC0129k.mo143y(t8rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: q */
    public void mo355q(boolean z2) {
        k kVar = this.f505i;
        if (kVar != null) {
            kVar.notifyDataSetChanged();
        }
    }

    int qrj() {
        return this.f511y;
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: s */
    public void mo356s(n7h.InterfaceC0129k interfaceC0129k) {
        this.f504h = interfaceC0129k;
    }

    @Override // androidx.appcompat.view.menu.n7h
    public kja0 toq(ViewGroup viewGroup) {
        if (this.f503g == null) {
            this.f503g = (ExpandedMenuView) this.f509q.inflate(C7397k.p.f92537n7h, viewGroup, false);
            if (this.f505i == null) {
                this.f505i = new k();
            }
            this.f503g.setAdapter((ListAdapter) this.f505i);
            this.f503g.setOnItemClickListener(this);
        }
        return this.f503g;
    }

    @Override // androidx.appcompat.view.menu.n7h
    public void x2(Context context, f7l8 f7l8Var) {
        if (this.f510s != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f510s);
            this.f506k = contextThemeWrapper;
            this.f509q = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f506k != null) {
            this.f506k = context;
            if (this.f509q == null) {
                this.f509q = LayoutInflater.from(context);
            }
        }
        this.f507n = f7l8Var;
        k kVar = this.f505i;
        if (kVar != null) {
            kVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: y */
    public boolean mo367y(f7l8 f7l8Var, C0130p c0130p) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n7h
    public Parcelable zy() {
        if (this.f503g == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        kja0(bundle);
        return bundle;
    }

    public C0128n(int i2, int i3) {
        this.f508p = i2;
        this.f510s = i3;
    }
}
