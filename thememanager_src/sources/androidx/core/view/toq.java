package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import zy.uv6;

/* JADX INFO: compiled from: ActionProvider.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class toq {

    /* JADX INFO: renamed from: q */
    private static final String f4154q = "ActionProvider(support)";

    /* JADX INFO: renamed from: k */
    private final Context f4155k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private InterfaceC0730k f50935toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private InterfaceC7873toq f50936zy;

    /* JADX INFO: renamed from: androidx.core.view.toq$k */
    /* JADX INFO: compiled from: ActionProvider.java */
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC0730k {
        /* JADX INFO: renamed from: g */
        void mo428g(boolean z2);
    }

    /* JADX INFO: renamed from: androidx.core.view.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActionProvider.java */
    public interface InterfaceC7873toq {
        void onActionProviderVisibilityChanged(boolean z2);
    }

    public toq(@zy.lvui Context context) {
        this.f4155k = context;
    }

    public void f7l8(@zy.lvui SubMenu subMenu) {
    }

    /* JADX INFO: renamed from: g */
    public boolean mo359g() {
        return false;
    }

    @zy.lvui
    /* JADX INFO: renamed from: k */
    public Context m3510k() {
        return this.f4155k;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void ld6(@zy.dd InterfaceC0730k interfaceC0730k) {
        this.f50935toq = interfaceC0730k;
    }

    @zy.lvui
    /* JADX INFO: renamed from: n */
    public View mo361n(@zy.lvui MenuItem menuItem) {
        return mo360q();
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: p */
    public void m3511p() {
        this.f50936zy = null;
        this.f50935toq = null;
    }

    @zy.lvui
    /* JADX INFO: renamed from: q */
    public abstract View mo360q();

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void qrj(boolean z2) {
        InterfaceC0730k interfaceC0730k = this.f50935toq;
        if (interfaceC0730k != null) {
            interfaceC0730k.mo428g(z2);
        }
    }

    /* JADX INFO: renamed from: s */
    public void mo362s() {
        if (this.f50936zy == null || !mo363y()) {
            return;
        }
        this.f50936zy.onActionProviderVisibilityChanged(zy());
    }

    public boolean toq() {
        return false;
    }

    public void x2(@zy.dd InterfaceC7873toq interfaceC7873toq) {
        if (this.f50936zy != null && interfaceC7873toq != null) {
            Log.w(f4154q, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f50936zy = interfaceC7873toq;
    }

    /* JADX INFO: renamed from: y */
    public boolean mo363y() {
        return false;
    }

    public boolean zy() {
        return true;
    }
}
