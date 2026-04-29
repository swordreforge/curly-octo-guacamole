package androidx.core.view;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import p024h.InterfaceMenuC6069k;
import zy.InterfaceC7830i;

/* JADX INFO: renamed from: androidx.core.view.i */
/* JADX INFO: compiled from: MenuCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0691i {

    /* JADX INFO: renamed from: androidx.core.view.i$k */
    /* JADX INFO: compiled from: MenuCompat.java */
    @zy.hyr(28)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m3312k(Menu menu, boolean z2) {
            menu.setGroupDividerEnabled(z2);
        }
    }

    private C0691i() {
    }

    /* JADX INFO: renamed from: k */
    public static void m3311k(@zy.lvui Menu menu, boolean z2) {
        if (menu instanceof InterfaceMenuC6069k) {
            ((InterfaceMenuC6069k) menu).setGroupDividerEnabled(z2);
        } else if (Build.VERSION.SDK_INT >= 28) {
            k.m3312k(menu, z2);
        }
    }

    @Deprecated
    public static void toq(MenuItem menuItem, int i2) {
        menuItem.setShowAsAction(i2);
    }
}
