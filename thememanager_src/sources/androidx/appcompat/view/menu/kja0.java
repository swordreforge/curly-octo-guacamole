package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import zy.uv6;

/* JADX INFO: compiled from: MenuView.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public interface kja0 {

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.kja0$k */
    /* JADX INFO: compiled from: MenuView.java */
    public interface InterfaceC0124k {
        /* JADX INFO: renamed from: g */
        void mo309g(C0130p c0130p, int i2);

        C0130p getItemData();

        /* JADX INFO: renamed from: k */
        boolean mo310k();

        void setCheckable(boolean z2);

        void setChecked(boolean z2);

        void setEnabled(boolean z2);

        void setIcon(Drawable drawable);

        void setShortcut(boolean z2, char c2);

        void setTitle(CharSequence charSequence);

        boolean toq();
    }

    int getWindowAnimations();

    void zy(f7l8 f7l8Var);
}
