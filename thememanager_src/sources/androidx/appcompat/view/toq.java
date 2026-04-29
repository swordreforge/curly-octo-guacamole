package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import zy.uv6;

/* JADX INFO: compiled from: ActionMode.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class toq {

    /* JADX INFO: renamed from: k */
    private Object f592k;

    /* JADX INFO: renamed from: q */
    private boolean f593q;

    /* JADX INFO: renamed from: androidx.appcompat.view.toq$k */
    /* JADX INFO: compiled from: ActionMode.java */
    public interface InterfaceC0138k {
        /* JADX INFO: renamed from: k */
        void mo139k(toq toqVar);

        /* JADX INFO: renamed from: q */
        boolean mo140q(toq toqVar, Menu menu);

        boolean toq(toq toqVar, Menu menu);

        boolean zy(toq toqVar, MenuItem menuItem);
    }

    public void cdj(Object obj) {
        this.f592k = obj;
    }

    public abstract CharSequence f7l8();

    /* JADX INFO: renamed from: g */
    public abstract MenuInflater mo185g();

    /* JADX INFO: renamed from: h */
    public abstract void mo186h(CharSequence charSequence);

    /* JADX INFO: renamed from: i */
    public void mo187i(boolean z2) {
        this.f593q = z2;
    }

    public abstract void ki(int i2);

    public abstract void kja0(int i2);

    public abstract void ld6();

    /* JADX INFO: renamed from: n */
    public abstract Menu mo188n();

    public abstract void n7h(View view);

    /* JADX INFO: renamed from: p */
    public boolean m400p() {
        return this.f593q;
    }

    /* JADX INFO: renamed from: q */
    public abstract View mo189q();

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public boolean qrj() {
        return true;
    }

    /* JADX INFO: renamed from: s */
    public abstract CharSequence mo190s();

    public abstract void t8r(CharSequence charSequence);

    public boolean x2() {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public Object m401y() {
        return this.f592k;
    }

    public abstract void zy();
}
