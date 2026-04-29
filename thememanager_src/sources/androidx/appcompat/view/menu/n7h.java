package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: MenuPresenter.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public interface n7h {

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.n7h$k */
    /* JADX INFO: compiled from: MenuPresenter.java */
    public interface InterfaceC0129k {
        void f7l8(@lvui f7l8 f7l8Var, boolean z2);

        /* JADX INFO: renamed from: y */
        boolean mo143y(@lvui f7l8 f7l8Var);
    }

    void f7l8(f7l8 f7l8Var, boolean z2);

    int getId();

    /* JADX INFO: renamed from: k */
    void mo352k(Parcelable parcelable);

    boolean ld6(f7l8 f7l8Var, C0130p c0130p);

    /* JADX INFO: renamed from: n */
    boolean mo353n();

    /* JADX INFO: renamed from: p */
    boolean mo354p(t8r t8rVar);

    /* JADX INFO: renamed from: q */
    void mo355q(boolean z2);

    /* JADX INFO: renamed from: s */
    void mo356s(InterfaceC0129k interfaceC0129k);

    kja0 toq(ViewGroup viewGroup);

    void x2(Context context, f7l8 f7l8Var);

    /* JADX INFO: renamed from: y */
    boolean mo367y(f7l8 f7l8Var, C0130p c0130p);

    Parcelable zy();
}
