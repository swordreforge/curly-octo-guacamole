package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuC0120h;
import androidx.appcompat.view.menu.ld6;
import androidx.appcompat.view.toq;
import androidx.collection.qrj;
import java.util.ArrayList;
import p024h.InterfaceMenuC6069k;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.view.g */
/* JADX INFO: compiled from: SupportActionModeWrapper.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C0115g extends ActionMode {

    /* JADX INFO: renamed from: k */
    final Context f415k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final toq f46703toq;

    /* JADX INFO: renamed from: androidx.appcompat.view.g$k */
    /* JADX INFO: compiled from: SupportActionModeWrapper.java */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static class k implements toq.InterfaceC0138k {

        /* JADX INFO: renamed from: k */
        final ActionMode.Callback f416k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Context f46704toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final ArrayList<C0115g> f46705zy = new ArrayList<>();

        /* JADX INFO: renamed from: q */
        final qrj<Menu, Menu> f417q = new qrj<>();

        public k(Context context, ActionMode.Callback callback) {
            this.f46704toq = context;
            this.f416k = callback;
        }

        /* JADX INFO: renamed from: g */
        private Menu m300g(Menu menu) {
            Menu menu2 = this.f417q.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC0120h menuC0120h = new MenuC0120h(this.f46704toq, (InterfaceMenuC6069k) menu);
            this.f417q.put(menu, menuC0120h);
            return menuC0120h;
        }

        @Override // androidx.appcompat.view.toq.InterfaceC0138k
        /* JADX INFO: renamed from: k */
        public void mo139k(toq toqVar) {
            this.f416k.onDestroyActionMode(m301n(toqVar));
        }

        /* JADX INFO: renamed from: n */
        public ActionMode m301n(toq toqVar) {
            int size = this.f46705zy.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0115g c0115g = this.f46705zy.get(i2);
                if (c0115g != null && c0115g.f46703toq == toqVar) {
                    return c0115g;
                }
            }
            C0115g c0115g2 = new C0115g(this.f46704toq, toqVar);
            this.f46705zy.add(c0115g2);
            return c0115g2;
        }

        @Override // androidx.appcompat.view.toq.InterfaceC0138k
        /* JADX INFO: renamed from: q */
        public boolean mo140q(toq toqVar, Menu menu) {
            return this.f416k.onPrepareActionMode(m301n(toqVar), m300g(menu));
        }

        @Override // androidx.appcompat.view.toq.InterfaceC0138k
        public boolean toq(toq toqVar, Menu menu) {
            return this.f416k.onCreateActionMode(m301n(toqVar), m300g(menu));
        }

        @Override // androidx.appcompat.view.toq.InterfaceC0138k
        public boolean zy(toq toqVar, MenuItem menuItem) {
            return this.f416k.onActionItemClicked(m301n(toqVar), new ld6(this.f46704toq, (p024h.toq) menuItem));
        }
    }

    public C0115g(Context context, toq toqVar) {
        this.f415k = context;
        this.f46703toq = toqVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f46703toq.zy();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f46703toq.mo189q();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC0120h(this.f415k, (InterfaceMenuC6069k) this.f46703toq.mo188n());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f46703toq.mo185g();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f46703toq.f7l8();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f46703toq.m401y();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f46703toq.mo190s();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f46703toq.m400p();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f46703toq.ld6();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f46703toq.x2();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f46703toq.n7h(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f46703toq.mo186h(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f46703toq.cdj(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f46703toq.t8r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z2) {
        this.f46703toq.mo187i(z2);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i2) {
        this.f46703toq.kja0(i2);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i2) {
        this.f46703toq.ki(i2);
    }
}
