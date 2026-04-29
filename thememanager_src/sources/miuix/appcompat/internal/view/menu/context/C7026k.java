package miuix.appcompat.internal.view.menu.context;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import miuix.internal.widget.C7183y;

/* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.context.k */
/* JADX INFO: compiled from: ContextMenuAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
class C7026k extends C7183y {

    /* JADX INFO: renamed from: g */
    private MenuItem f39500g;

    protected C7026k(Context context, Menu menu) {
        super(context, menu);
    }

    /* JADX INFO: renamed from: n */
    MenuItem m25324n() {
        return this.f39500g;
    }

    @Override // miuix.internal.widget.C7183y
    protected boolean toq(MenuItem menuItem) {
        boolean qVar = super.toq(menuItem);
        if (!qVar || menuItem.getOrder() != 131072) {
            return qVar;
        }
        if (this.f39500g != null) {
            throw new IllegalStateException("Only one menu item is allowed to have CATEGORY_SYSTEM order!");
        }
        this.f39500g = menuItem;
        return false;
    }
}
