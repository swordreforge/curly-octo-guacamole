package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: compiled from: BaseMenuWrapper.java */
/* JADX INFO: loaded from: classes.dex */
abstract class zy {

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private androidx.collection.qrj<p024h.zy, SubMenu> f46801n7h;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private androidx.collection.qrj<p024h.toq, MenuItem> f46802qrj;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    final Context f46803x2;

    zy(Context context) {
        this.f46803x2 = context;
    }

    final void f7l8() {
        androidx.collection.qrj<p024h.toq, MenuItem> qrjVar = this.f46802qrj;
        if (qrjVar != null) {
            qrjVar.clear();
        }
        androidx.collection.qrj<p024h.zy, SubMenu> qrjVar2 = this.f46801n7h;
        if (qrjVar2 != null) {
            qrjVar2.clear();
        }
    }

    /* JADX INFO: renamed from: g */
    final SubMenu m392g(SubMenu subMenu) {
        if (!(subMenu instanceof p024h.zy)) {
            return subMenu;
        }
        p024h.zy zyVar = (p024h.zy) subMenu;
        if (this.f46801n7h == null) {
            this.f46801n7h = new androidx.collection.qrj<>();
        }
        SubMenu subMenu2 = this.f46801n7h.get(zyVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC0121i subMenuC0121i = new SubMenuC0121i(this.f46803x2, zyVar);
        this.f46801n7h.put(zyVar, subMenuC0121i);
        return subMenuC0121i;
    }

    /* JADX INFO: renamed from: n */
    final MenuItem m393n(MenuItem menuItem) {
        if (!(menuItem instanceof p024h.toq)) {
            return menuItem;
        }
        p024h.toq toqVar = (p024h.toq) menuItem;
        if (this.f46802qrj == null) {
            this.f46802qrj = new androidx.collection.qrj<>();
        }
        MenuItem menuItem2 = this.f46802qrj.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        ld6 ld6Var = new ld6(this.f46803x2, toqVar);
        this.f46802qrj.put(toqVar, ld6Var);
        return ld6Var;
    }

    /* JADX INFO: renamed from: s */
    final void m394s(int i2) {
        if (this.f46802qrj == null) {
            return;
        }
        for (int i3 = 0; i3 < this.f46802qrj.size(); i3++) {
            if (this.f46802qrj.ld6(i3).getItemId() == i2) {
                this.f46802qrj.n7h(i3);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    final void m395y(int i2) {
        if (this.f46802qrj == null) {
            return;
        }
        int i3 = 0;
        while (i3 < this.f46802qrj.size()) {
            if (this.f46802qrj.ld6(i3).getGroupId() == i2) {
                this.f46802qrj.n7h(i3);
                i3--;
            }
            i3++;
        }
    }
}
