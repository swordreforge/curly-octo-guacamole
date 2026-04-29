package miuix.appcompat.internal.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.PopupWindow;
import gb.toq;
import java.util.ArrayList;
import miuix.appcompat.internal.view.menu.ld6;
import miuix.appcompat.internal.view.menu.x2;
import miuix.internal.util.C7169q;
import miuix.internal.widget.C7177g;

/* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.p */
/* JADX INFO: compiled from: MenuPopupHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnKeyListenerC7034p implements AdapterView.OnItemClickListener, View.OnKeyListener, PopupWindow.OnDismissListener, ld6 {

    /* JADX INFO: renamed from: e */
    private static final int f39542e = toq.qrj.f76752tfm;

    /* JADX INFO: renamed from: c */
    private int f39543c;

    /* JADX INFO: renamed from: f */
    private int f39544f;

    /* JADX INFO: renamed from: g */
    private C7177g f39545g;

    /* JADX INFO: renamed from: h */
    private boolean f39546h;

    /* JADX INFO: renamed from: i */
    private k f39547i;

    /* JADX INFO: renamed from: k */
    boolean f39548k;

    /* JADX INFO: renamed from: l */
    private int f39549l;

    /* JADX INFO: renamed from: n */
    private LayoutInflater f39550n;

    /* JADX INFO: renamed from: p */
    private View f39551p;

    /* JADX INFO: renamed from: q */
    private Context f39552q;

    /* JADX INFO: renamed from: r */
    private int f39553r;

    /* JADX INFO: renamed from: s */
    private View f39554s;

    /* JADX INFO: renamed from: t */
    private int f39555t;

    /* JADX INFO: renamed from: y */
    private f7l8 f39556y;

    /* JADX INFO: renamed from: z */
    private ld6.InterfaceC7032k f39557z;

    /* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.p$k */
    /* JADX INFO: compiled from: MenuPopupHelper.java */
    private class k extends BaseAdapter {

        /* JADX INFO: renamed from: k */
        private f7l8 f39558k;

        /* JADX INFO: renamed from: q */
        private int f39560q = -1;

        public k(f7l8 f7l8Var) {
            this.f39558k = f7l8Var;
            toq();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f39560q < 0 ? (ViewOnKeyListenerC7034p.this.f39546h ? this.f39558k.mcp() : this.f39558k.gvn7()).size() : r0.size() - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = ViewOnKeyListenerC7034p.this.f39550n.inflate(ViewOnKeyListenerC7034p.this.f39553r, viewGroup, false);
                C7169q.toq(view);
            }
            miuix.internal.util.ld6.m25946q(view, i2, getCount());
            x2.InterfaceC7037k interfaceC7037k = (x2.InterfaceC7037k) view;
            if (ViewOnKeyListenerC7034p.this.f39548k) {
                ((ListMenuItemView) view).setForceShowIcon(true);
            }
            interfaceC7037k.zy(getItem(i2), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            toq();
            super.notifyDataSetChanged();
        }

        void toq() {
            MenuItemC7036s menuItemC7036sM25351z = ViewOnKeyListenerC7034p.this.f39556y.m25351z();
            if (menuItemC7036sM25351z != null) {
                ArrayList<MenuItemC7036s> arrayListMcp = ViewOnKeyListenerC7034p.this.f39556y.mcp();
                int size = arrayListMcp.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (arrayListMcp.get(i2) == menuItemC7036sM25351z) {
                        this.f39560q = i2;
                        return;
                    }
                }
            }
            this.f39560q = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public MenuItemC7036s getItem(int i2) {
            ArrayList<MenuItemC7036s> arrayListMcp = ViewOnKeyListenerC7034p.this.f39546h ? this.f39558k.mcp() : this.f39558k.gvn7();
            int i3 = this.f39560q;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayListMcp.get(i2);
        }
    }

    public ViewOnKeyListenerC7034p(Context context, f7l8 f7l8Var) {
        this(context, f7l8Var, null, false);
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public void f7l8(f7l8 f7l8Var, boolean z2) {
        if (f7l8Var != this.f39556y) {
            return;
        }
        mo25286g(true);
        ld6.InterfaceC7032k interfaceC7032k = this.f39557z;
        if (interfaceC7032k != null) {
            interfaceC7032k.f7l8(f7l8Var, z2);
        }
    }

    public void fn3e(View view) {
        this.f39554s = view;
    }

    public void fu4(int i2) {
        this.f39543c = i2;
    }

    /* JADX INFO: renamed from: g */
    public void mo25286g(boolean z2) {
        if (isShowing()) {
            this.f39545g.dismiss();
        }
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public int getId() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public void m25363i(int i2) {
        this.f39544f = i2;
    }

    public boolean isShowing() {
        C7177g c7177g = this.f39545g;
        return c7177g != null && c7177g.isShowing();
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    /* JADX INFO: renamed from: k */
    public void mo25175k(Parcelable parcelable) {
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public void ld6(ld6.InterfaceC7032k interfaceC7032k) {
        this.f39557z = interfaceC7032k;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    /* JADX INFO: renamed from: n */
    public boolean mo25176n() {
        return false;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public boolean n7h(qrj qrjVar) {
        boolean z2;
        if (qrjVar.hasVisibleItems()) {
            ViewOnKeyListenerC7034p viewOnKeyListenerC7034p = new ViewOnKeyListenerC7034p(this.f39552q, qrjVar, this.f39551p, this.f39554s, false);
            viewOnKeyListenerC7034p.ld6(this.f39557z);
            int size = qrjVar.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z2 = false;
                    break;
                }
                MenuItem item = qrjVar.getItem(i2);
                if (item.isVisible() && item.getIcon() != null) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            viewOnKeyListenerC7034p.zurt(z2);
            if (viewOnKeyListenerC7034p.m25364y()) {
                ld6.InterfaceC7032k interfaceC7032k = this.f39557z;
                if (interfaceC7032k != null) {
                    interfaceC7032k.mo25076y(qrjVar);
                }
                return true;
            }
        }
        return false;
    }

    public void ni7(int i2) {
        this.f39553r = i2;
    }

    public void o1t() {
        if (!m25364y()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void onDismiss() {
        this.f39545g = null;
        this.f39556y.close();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        k kVar = this.f39547i;
        kVar.f39558k.m25348r(kVar.getItem(i2), 0);
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        mo25286g(false);
        return true;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    /* JADX INFO: renamed from: p */
    public boolean mo25177p(f7l8 f7l8Var, MenuItemC7036s menuItemC7036s) {
        return false;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    /* JADX INFO: renamed from: q */
    public void mo25178q(boolean z2) {
        k kVar = this.f39547i;
        if (kVar != null) {
            kVar.notifyDataSetChanged();
        }
        this.f39555t = this.f39552q.getResources().getDimensionPixelSize(toq.f7l8.mc);
        this.f39549l = this.f39552q.getResources().getDimensionPixelSize(toq.f7l8.w2bz);
        if (isShowing()) {
            this.f39545g.toq(this.f39549l);
            this.f39545g.m26040n(this.f39555t);
            this.f39545g.kja0(this.f39551p, null);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    /* JADX INFO: renamed from: s */
    public void mo25179s(Context context, f7l8 f7l8Var) {
    }

    public void t8r(View view) {
        this.f39551p = view;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public x2 toq(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopupHelpers manage their own views");
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public boolean x2(f7l8 f7l8Var, MenuItemC7036s menuItemC7036s) {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public boolean m25364y() {
        C7177g c7177g = new C7177g(this.f39552q, this.f39554s);
        this.f39545g = c7177g;
        c7177g.m26039m(49);
        this.f39545g.yz(false);
        this.f39545g.setOnDismissListener(this);
        this.f39545g.m26034b(this);
        k kVar = new k(this.f39556y);
        this.f39547i = kVar;
        this.f39545g.x2(kVar);
        this.f39545g.toq(this.f39549l);
        this.f39545g.m26040n(this.f39555t);
        int i2 = this.f39543c;
        if (i2 > 0) {
            this.f39545g.y9n(i2);
        }
        this.f39545g.kja0(this.f39551p, null);
        this.f39545g.dd().setOnKeyListener(this);
        return true;
    }

    /* JADX INFO: renamed from: z */
    public void m25365z(int i2) {
        this.f39555t = i2;
    }

    public void zurt(boolean z2) {
        this.f39548k = z2;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public Parcelable zy() {
        return null;
    }

    public ViewOnKeyListenerC7034p(Context context, f7l8 f7l8Var, View view) {
        this(context, f7l8Var, view, false);
    }

    public ViewOnKeyListenerC7034p(Context context, f7l8 f7l8Var, View view, boolean z2) {
        this(context, f7l8Var, view, null, z2);
    }

    public ViewOnKeyListenerC7034p(Context context, f7l8 f7l8Var, View view, View view2, boolean z2) {
        this.f39553r = f39542e;
        this.f39549l = 0;
        this.f39544f = -1;
        this.f39543c = 0;
        this.f39552q = context;
        this.f39550n = LayoutInflater.from(context);
        this.f39556y = f7l8Var;
        this.f39546h = z2;
        this.f39551p = view;
        this.f39554s = view2;
        f7l8Var.zy(this);
        this.f39555t = context.getResources().getDimensionPixelSize(toq.f7l8.mc);
        this.f39549l = context.getResources().getDimensionPixelSize(toq.f7l8.w2bz);
    }
}
