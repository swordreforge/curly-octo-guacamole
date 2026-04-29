package miuix.appcompat.internal.view.menu;

import android.graphics.drawable.Drawable;
import miuix.appcompat.internal.view.menu.f7l8;

/* JADX INFO: compiled from: MenuView.java */
/* JADX INFO: loaded from: classes3.dex */
public interface x2 {

    /* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.x2$k */
    /* JADX INFO: compiled from: MenuView.java */
    public interface InterfaceC7037k {
        MenuItemC7036s getItemData();

        /* JADX INFO: renamed from: k */
        boolean mo25269k();

        void setCheckable(boolean z2);

        void setChecked(boolean z2);

        void setEnabled(boolean z2);

        void setIcon(Drawable drawable);

        void setItemInvoker(f7l8.zy zyVar);

        void setShortcut(boolean z2, char c2);

        void setTitle(CharSequence charSequence);

        boolean toq();

        void zy(MenuItemC7036s menuItemC7036s, int i2);
    }

    void f7l8(f7l8 f7l8Var);

    int getWindowAnimations();

    /* JADX INFO: renamed from: k */
    boolean mo25264k(int i2);

    /* JADX INFO: renamed from: y */
    boolean mo25265y();
}
