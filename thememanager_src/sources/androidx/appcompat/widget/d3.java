package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.f7l8;
import androidx.appcompat.view.menu.n7h;
import androidx.core.view.gyi;
import zy.uv6;

/* JADX INFO: compiled from: DecorToolbar.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public interface d3 {
    void a9(int i2);

    ViewGroup cdj();

    void collapseActionView();

    void d2ok();

    void d3(SparseArray<Parcelable> sparseArray);

    int eqxt();

    boolean f7l8();

    void fn3e();

    void fti(int i2);

    void fu4(int i2);

    /* JADX INFO: renamed from: g */
    boolean mo532g();

    Context getContext();

    View getCustomView();

    CharSequence getTitle();

    int getVisibility();

    void gvn7(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener);

    /* JADX INFO: renamed from: h */
    void mo533h(int i2);

    boolean hideOverflowMenu();

    /* JADX INFO: renamed from: i */
    void mo534i(int i2);

    boolean jk();

    void jp0y(n7h.InterfaceC0129k interfaceC0129k, f7l8.InterfaceC0118k interfaceC0118k);

    /* JADX INFO: renamed from: k */
    int mo535k();

    void ki(boolean z2);

    gyi kja0(int i2, long j2);

    void ld6(CharSequence charSequence);

    void lvui(Drawable drawable);

    void mcp(SparseArray<Parcelable> sparseArray);

    /* JADX INFO: renamed from: n */
    boolean mo536n();

    int n7h();

    void ni7(boolean z2);

    void o1t(ScrollingTabContainerView scrollingTabContainerView);

    CharSequence oc();

    /* JADX INFO: renamed from: p */
    void mo537p(CharSequence charSequence);

    /* JADX INFO: renamed from: q */
    boolean mo538q();

    Menu qrj();

    /* JADX INFO: renamed from: s */
    void mo539s(int i2);

    void setBackgroundDrawable(Drawable drawable);

    void setCustomView(View view);

    void setIcon(int i2);

    void setIcon(Drawable drawable);

    void setLogo(int i2);

    void setMenu(Menu menu, n7h.InterfaceC0129k interfaceC0129k);

    void setMenuPrepared();

    void setTitle(CharSequence charSequence);

    void setVisibility(int i2);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    boolean showOverflowMenu();

    /* JADX INFO: renamed from: t */
    void mo540t(Drawable drawable);

    int t8r();

    boolean toq();

    void wvg(Drawable drawable);

    void x2(int i2);

    /* JADX INFO: renamed from: y */
    boolean mo541y();

    /* JADX INFO: renamed from: z */
    void mo542z();

    int zurt();

    boolean zy();
}
