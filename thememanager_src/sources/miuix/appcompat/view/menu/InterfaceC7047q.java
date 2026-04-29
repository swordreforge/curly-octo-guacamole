package miuix.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import zy.uv6;

/* JADX INFO: renamed from: miuix.appcompat.view.menu.q */
/* JADX INFO: compiled from: MenuView.java */
/* JADX INFO: loaded from: classes3.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public interface InterfaceC7047q {

    /* JADX INFO: renamed from: miuix.appcompat.view.menu.q$k */
    /* JADX INFO: compiled from: MenuView.java */
    public interface k {
        toq getItemData();

        /* JADX INFO: renamed from: k */
        boolean m25432k();

        void setCheckable(boolean z2);

        void setChecked(boolean z2);

        void setEnabled(boolean z2);

        void setIcon(Drawable drawable);

        void setShortcut(boolean z2, char c2);

        void setTitle(CharSequence charSequence);

        boolean toq();

        void zy(toq toqVar, int i2);
    }

    int getWindowAnimations();

    /* JADX INFO: renamed from: k */
    void m25431k(C7045k c7045k);
}
