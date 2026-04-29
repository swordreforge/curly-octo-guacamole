package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import zy.InterfaceC7830i;

/* JADX INFO: renamed from: androidx.core.view.z */
/* JADX INFO: compiled from: MenuItemCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0744z {

    /* JADX INFO: renamed from: g */
    @Deprecated
    public static final int f4200g = 8;

    /* JADX INFO: renamed from: k */
    private static final String f4201k = "MenuItemCompat";

    /* JADX INFO: renamed from: n */
    @Deprecated
    public static final int f4202n = 4;

    /* JADX INFO: renamed from: q */
    @Deprecated
    public static final int f4203q = 2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @Deprecated
    public static final int f50966toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @Deprecated
    public static final int f50967zy = 1;

    /* JADX INFO: renamed from: androidx.core.view.z$k */
    /* JADX INFO: compiled from: MenuItemCompat.java */
    class k implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ zy f4204k;

        k(zy zyVar) {
            this.f4204k = zyVar;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f4204k.onMenuItemActionCollapse(menuItem);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f4204k.onMenuItemActionExpand(menuItem);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.z$toq */
    /* JADX INFO: compiled from: MenuItemCompat.java */
    @zy.hyr(26)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        static MenuItem f7l8(MenuItem menuItem, char c2, int i2) {
            return menuItem.setAlphabeticShortcut(c2, i2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        static CharSequence m3590g(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m3591k(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        @InterfaceC7830i
        static MenuItem ld6(MenuItem menuItem, char c2, int i2) {
            return menuItem.setNumericShortcut(c2, i2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static int m3592n(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: p */
        static MenuItem m3593p(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static PorterDuff.Mode m3594q(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        @InterfaceC7830i
        static MenuItem qrj(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: s */
        static MenuItem m3595s(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        @InterfaceC7830i
        static CharSequence toq(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        @InterfaceC7830i
        static MenuItem x2(MenuItem menuItem, char c2, char c3, int i2, int i3) {
            return menuItem.setShortcut(c2, c3, i2, i3);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: y */
        static MenuItem m3596y(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        @InterfaceC7830i
        static ColorStateList zy(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.z$zy */
    /* JADX INFO: compiled from: MenuItemCompat.java */
    @Deprecated
    public interface zy {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    private C0744z() {
    }

    public static void cdj(@zy.lvui MenuItem menuItem, @zy.dd ColorStateList colorStateList) {
        if (menuItem instanceof p024h.toq) {
            ((p024h.toq) menuItem).setIconTintList(colorStateList);
        } else {
            toq.m3595s(menuItem, colorStateList);
        }
    }

    @zy.dd
    public static ColorStateList f7l8(@zy.lvui MenuItem menuItem) {
        return menuItem instanceof p024h.toq ? ((p024h.toq) menuItem).getIconTintList() : toq.zy(menuItem);
    }

    public static void fn3e(@zy.lvui MenuItem menuItem, char c2, char c3, int i2, int i3) {
        if (menuItem instanceof p024h.toq) {
            ((p024h.toq) menuItem).setShortcut(c2, c3, i2, i3);
        } else {
            toq.x2(menuItem, c2, c3, i2, i3);
        }
    }

    @zy.dd
    /* JADX INFO: renamed from: g */
    public static CharSequence m3581g(@zy.lvui MenuItem menuItem) {
        return menuItem instanceof p024h.toq ? ((p024h.toq) menuItem).getContentDescription() : toq.toq(menuItem);
    }

    /* JADX INFO: renamed from: h */
    public static void m3582h(@zy.lvui MenuItem menuItem, @zy.dd CharSequence charSequence) {
        if (menuItem instanceof p024h.toq) {
            ((p024h.toq) menuItem).setContentDescription(charSequence);
        } else {
            toq.m3596y(menuItem, charSequence);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public static MenuItem m3583i(MenuItem menuItem, zy zyVar) {
        return menuItem.setOnActionExpandListener(new k(zyVar));
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public static boolean m3584k(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    public static void ki(@zy.lvui MenuItem menuItem, @zy.dd PorterDuff.Mode mode) {
        if (menuItem instanceof p024h.toq) {
            ((p024h.toq) menuItem).setIconTintMode(mode);
        } else {
            toq.m3593p(menuItem, mode);
        }
    }

    public static void kja0(@zy.lvui MenuItem menuItem, char c2, int i2) {
        if (menuItem instanceof p024h.toq) {
            ((p024h.toq) menuItem).setAlphabeticShortcut(c2, i2);
        } else {
            toq.f7l8(menuItem, c2, i2);
        }
    }

    @Deprecated
    public static boolean ld6(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    /* JADX INFO: renamed from: n */
    public static int m3585n(@zy.lvui MenuItem menuItem) {
        return menuItem instanceof p024h.toq ? ((p024h.toq) menuItem).getAlphabeticModifiers() : toq.m3591k(menuItem);
    }

    @Deprecated
    public static MenuItem n7h(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    public static void ni7(@zy.lvui MenuItem menuItem, @zy.dd CharSequence charSequence) {
        if (menuItem instanceof p024h.toq) {
            ((p024h.toq) menuItem).setTooltipText(charSequence);
        } else {
            toq.qrj(menuItem, charSequence);
        }
    }

    @zy.dd
    /* JADX INFO: renamed from: p */
    public static CharSequence m3586p(@zy.lvui MenuItem menuItem) {
        return menuItem instanceof p024h.toq ? ((p024h.toq) menuItem).getTooltipText() : toq.m3590g(menuItem);
    }

    @Deprecated
    /* JADX INFO: renamed from: q */
    public static View m3587q(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    @Deprecated
    public static MenuItem qrj(MenuItem menuItem, int i2) {
        return menuItem.setActionView(i2);
    }

    /* JADX INFO: renamed from: s */
    public static int m3588s(@zy.lvui MenuItem menuItem) {
        return menuItem instanceof p024h.toq ? ((p024h.toq) menuItem).getNumericModifiers() : toq.m3592n(menuItem);
    }

    public static void t8r(@zy.lvui MenuItem menuItem, char c2, int i2) {
        if (menuItem instanceof p024h.toq) {
            ((p024h.toq) menuItem).setNumericShortcut(c2, i2);
        } else {
            toq.ld6(menuItem, c2, i2);
        }
    }

    @Deprecated
    public static boolean toq(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    @zy.dd
    public static MenuItem x2(@zy.lvui MenuItem menuItem, @zy.dd androidx.core.view.toq toqVar) {
        if (menuItem instanceof p024h.toq) {
            return ((p024h.toq) menuItem).zy(toqVar);
        }
        Log.w(f4201k, "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    @zy.dd
    /* JADX INFO: renamed from: y */
    public static PorterDuff.Mode m3589y(@zy.lvui MenuItem menuItem) {
        return menuItem instanceof p024h.toq ? ((p024h.toq) menuItem).getIconTintMode() : toq.m3594q(menuItem);
    }

    @Deprecated
    public static void zurt(MenuItem menuItem, int i2) {
        menuItem.setShowAsAction(i2);
    }

    @zy.dd
    public static androidx.core.view.toq zy(@zy.lvui MenuItem menuItem) {
        if (menuItem instanceof p024h.toq) {
            return ((p024h.toq) menuItem).mo345k();
        }
        Log.w(f4201k, "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }
}
