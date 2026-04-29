package miuix.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: MenuPresenter.java */
/* JADX INFO: loaded from: classes3.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public interface zy {

    /* JADX INFO: renamed from: miuix.appcompat.view.menu.zy$k */
    /* JADX INFO: compiled from: MenuPresenter.java */
    public interface InterfaceC7049k {
        boolean f7l8(@lvui C7045k c7045k);

        /* JADX INFO: renamed from: g */
        void m25449g(@lvui C7045k c7045k, boolean z2);
    }

    boolean f7l8(C7045k c7045k, toq toqVar);

    /* JADX INFO: renamed from: g */
    void m25442g(C7045k c7045k, boolean z2);

    int getId();

    /* JADX INFO: renamed from: k */
    void m25443k(Parcelable parcelable);

    boolean ld6(C7045k c7045k, toq toqVar);

    /* JADX INFO: renamed from: n */
    boolean m25444n();

    /* JADX INFO: renamed from: p */
    void m25445p(InterfaceC7049k interfaceC7049k);

    /* JADX INFO: renamed from: q */
    void m25446q(boolean z2);

    /* JADX INFO: renamed from: s */
    void m25447s(Context context, C7045k c7045k);

    InterfaceC7047q toq(ViewGroup viewGroup);

    /* JADX INFO: renamed from: y */
    boolean m25448y(SubMenuC7046n subMenuC7046n);

    Parcelable zy();
}
