package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.view.menu.n7h;
import zy.uv6;

/* JADX INFO: compiled from: DecorContentParent.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public interface gvn7 {
    void f7l8(SparseArray<Parcelable> sparseArray);

    /* JADX INFO: renamed from: g */
    boolean mo418g();

    CharSequence getTitle();

    boolean hideOverflowMenu();

    /* JADX INFO: renamed from: n */
    boolean mo421n();

    /* JADX INFO: renamed from: p */
    void mo422p(SparseArray<Parcelable> sparseArray);

    /* JADX INFO: renamed from: q */
    boolean mo423q();

    /* JADX INFO: renamed from: s */
    void mo424s();

    void setIcon(int i2);

    void setIcon(Drawable drawable);

    void setLogo(int i2);

    void setMenu(Menu menu, n7h.InterfaceC0129k interfaceC0129k);

    void setMenuPrepared();

    void setUiOptions(int i2);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    boolean showOverflowMenu();

    boolean toq();

    /* JADX INFO: renamed from: y */
    void mo425y(int i2);

    boolean zy();
}
