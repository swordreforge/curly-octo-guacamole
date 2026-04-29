package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f7l8;
import androidx.appcompat.view.menu.qrj;
import androidx.appcompat.view.menu.t8r;
import androidx.appcompat.view.toq;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.view.n */
/* JADX INFO: compiled from: StandaloneActionMode.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C0135n extends toq implements f7l8.InterfaceC0118k {

    /* JADX INFO: renamed from: g */
    private ActionBarContextView f581g;

    /* JADX INFO: renamed from: h */
    private boolean f582h;

    /* JADX INFO: renamed from: i */
    private androidx.appcompat.view.menu.f7l8 f583i;

    /* JADX INFO: renamed from: n */
    private Context f584n;

    /* JADX INFO: renamed from: p */
    private boolean f585p;

    /* JADX INFO: renamed from: s */
    private WeakReference<View> f586s;

    /* JADX INFO: renamed from: y */
    private toq.InterfaceC0138k f587y;

    public C0135n(Context context, ActionBarContextView actionBarContextView, toq.InterfaceC0138k interfaceC0138k, boolean z2) {
        this.f584n = context;
        this.f581g = actionBarContextView;
        this.f587y = interfaceC0138k;
        androidx.appcompat.view.menu.f7l8 f7l8VarM326e = new androidx.appcompat.view.menu.f7l8(actionBarContextView.getContext()).m326e(1);
        this.f583i = f7l8VarM326e;
        f7l8VarM326e.uv6(this);
        this.f582h = z2;
    }

    @Override // androidx.appcompat.view.toq
    public CharSequence f7l8() {
        return this.f581g.getSubtitle();
    }

    public void fn3e(androidx.appcompat.view.menu.f7l8 f7l8Var, boolean z2) {
    }

    @Override // androidx.appcompat.view.toq
    /* JADX INFO: renamed from: g */
    public MenuInflater mo185g() {
        return new f7l8(this.f581g.getContext());
    }

    @Override // androidx.appcompat.view.toq
    /* JADX INFO: renamed from: h */
    public void mo186h(CharSequence charSequence) {
        this.f581g.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.toq
    /* JADX INFO: renamed from: i */
    public void mo187i(boolean z2) {
        super.mo187i(z2);
        this.f581g.setTitleOptional(z2);
    }

    @Override // androidx.appcompat.view.menu.f7l8.InterfaceC0118k
    /* JADX INFO: renamed from: k */
    public boolean mo117k(@lvui androidx.appcompat.view.menu.f7l8 f7l8Var, @lvui MenuItem menuItem) {
        return this.f587y.zy(this, menuItem);
    }

    @Override // androidx.appcompat.view.toq
    public void ki(int i2) {
        t8r(this.f584n.getString(i2));
    }

    @Override // androidx.appcompat.view.toq
    public void kja0(int i2) {
        mo186h(this.f584n.getString(i2));
    }

    @Override // androidx.appcompat.view.toq
    public void ld6() {
        this.f587y.mo140q(this, this.f583i);
    }

    @Override // androidx.appcompat.view.toq
    /* JADX INFO: renamed from: n */
    public Menu mo188n() {
        return this.f583i;
    }

    @Override // androidx.appcompat.view.toq
    public void n7h(View view) {
        this.f581g.setCustomView(view);
        this.f586s = view != null ? new WeakReference<>(view) : null;
    }

    public boolean ni7(t8r t8rVar) {
        if (!t8rVar.hasVisibleItems()) {
            return true;
        }
        new qrj(this.f581g.getContext(), t8rVar).x2();
        return true;
    }

    @Override // androidx.appcompat.view.toq
    /* JADX INFO: renamed from: q */
    public View mo189q() {
        WeakReference<View> weakReference = this.f586s;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.toq
    public boolean qrj() {
        return this.f582h;
    }

    @Override // androidx.appcompat.view.toq
    /* JADX INFO: renamed from: s */
    public CharSequence mo190s() {
        return this.f581g.getTitle();
    }

    @Override // androidx.appcompat.view.toq
    public void t8r(CharSequence charSequence) {
        this.f581g.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.menu.f7l8.InterfaceC0118k
    public void toq(@lvui androidx.appcompat.view.menu.f7l8 f7l8Var) {
        ld6();
        this.f581g.kja0();
    }

    @Override // androidx.appcompat.view.toq
    public boolean x2() {
        return this.f581g.t8r();
    }

    public void zurt(t8r t8rVar) {
    }

    @Override // androidx.appcompat.view.toq
    public void zy() {
        if (this.f585p) {
            return;
        }
        this.f585p = true;
        this.f587y.mo139k(this);
    }
}
