package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.AbstractC0096k;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.f7l8;
import androidx.appcompat.view.menu.n7h;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.a98o;
import androidx.appcompat.widget.d3;
import androidx.core.view.C0683f;
import java.util.ArrayList;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: ToolbarActionBar.java */
/* JADX INFO: loaded from: classes.dex */
class n7h extends AbstractC0096k {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private final Toolbar.InterfaceC0177g f46606cdj;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    final AppCompatDelegateImpl.InterfaceC0088s f46608ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f46609n7h;

    /* JADX INFO: renamed from: p */
    final Window.Callback f296p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private boolean f46610qrj;

    /* JADX INFO: renamed from: s */
    final d3 f297s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    boolean f46611x2;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private ArrayList<AbstractC0096k.q> f46607kja0 = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    private final Runnable f295h = new RunnableC0098k();

    /* JADX INFO: renamed from: androidx.appcompat.app.n7h$k */
    /* JADX INFO: compiled from: ToolbarActionBar.java */
    class RunnableC0098k implements Runnable {
        RunnableC0098k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n7h.this.qkj8();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.n7h$n */
    /* JADX INFO: compiled from: ToolbarActionBar.java */
    private class C0099n implements AppCompatDelegateImpl.InterfaceC0088s {
        C0099n() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.InterfaceC0088s
        /* JADX INFO: renamed from: k */
        public boolean mo146k(int i2) {
            if (i2 != 0) {
                return false;
            }
            n7h n7hVar = n7h.this;
            if (n7hVar.f46611x2) {
                return false;
            }
            n7hVar.f297s.setMenuPrepared();
            n7h.this.f46611x2 = true;
            return false;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.InterfaceC0088s
        public View onCreatePanelView(int i2) {
            if (i2 == 0) {
                return new View(n7h.this.f297s.getContext());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.n7h$q */
    /* JADX INFO: compiled from: ToolbarActionBar.java */
    private final class C0100q implements f7l8.InterfaceC0118k {
        C0100q() {
        }

        @Override // androidx.appcompat.view.menu.f7l8.InterfaceC0118k
        /* JADX INFO: renamed from: k */
        public boolean mo117k(@lvui androidx.appcompat.view.menu.f7l8 f7l8Var, @lvui MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.f7l8.InterfaceC0118k
        public void toq(@lvui androidx.appcompat.view.menu.f7l8 f7l8Var) {
            if (n7h.this.f297s.mo538q()) {
                n7h.this.f296p.onPanelClosed(108, f7l8Var);
            } else if (n7h.this.f296p.onPreparePanel(0, null, f7l8Var)) {
                n7h.this.f296p.onMenuOpened(108, f7l8Var);
            }
        }
    }

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    class toq implements Toolbar.InterfaceC0177g {
        toq() {
        }

        @Override // androidx.appcompat.widget.Toolbar.InterfaceC0177g
        public boolean onMenuItemClick(MenuItem menuItem) {
            return n7h.this.f296p.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    private final class zy implements n7h.InterfaceC0129k {

        /* JADX INFO: renamed from: k */
        private boolean f302k;

        zy() {
        }

        @Override // androidx.appcompat.view.menu.n7h.InterfaceC0129k
        public void f7l8(@lvui androidx.appcompat.view.menu.f7l8 f7l8Var, boolean z2) {
            if (this.f302k) {
                return;
            }
            this.f302k = true;
            n7h.this.f297s.mo542z();
            n7h.this.f296p.onPanelClosed(108, f7l8Var);
            this.f302k = false;
        }

        @Override // androidx.appcompat.view.menu.n7h.InterfaceC0129k
        /* JADX INFO: renamed from: y */
        public boolean mo143y(@lvui androidx.appcompat.view.menu.f7l8 f7l8Var) {
            n7h.this.f296p.onMenuOpened(108, f7l8Var);
            return true;
        }
    }

    n7h(@lvui Toolbar toolbar, @dd CharSequence charSequence, @lvui Window.Callback callback) {
        toq toqVar = new toq();
        this.f46606cdj = toqVar;
        androidx.core.util.n7h.x2(toolbar);
        a98o a98oVar = new a98o(toolbar, false);
        this.f297s = a98oVar;
        this.f296p = (Window.Callback) androidx.core.util.n7h.x2(callback);
        a98oVar.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(toqVar);
        a98oVar.setWindowTitle(charSequence);
        this.f46608ld6 = new C0099n();
    }

    private Menu vq() {
        if (!this.f46610qrj) {
            this.f297s.jp0y(new zy(), new C0100q());
            this.f46610qrj = true;
        }
        return this.f297s.qrj();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: a */
    public void mo152a(boolean z2) {
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void a98o(Drawable drawable) {
        this.f297s.lvui(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: b */
    public void mo153b(int i2) {
        this.f297s.mo534i(i2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void bf2(CharSequence charSequence) {
        this.f297s.mo537p(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void bo(boolean z2) {
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: c */
    public void mo154c(View view) {
        lrht(view, new AbstractC0096k.toq(-2, -2));
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void c8jq(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public float cdj() {
        return C0683f.m3166l(this.f297s.cdj());
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void ch(SpinnerAdapter spinnerAdapter, AbstractC0096k.n nVar) {
        this.f297s.gvn7(spinnerAdapter, new x2(nVar));
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: d */
    public void mo155d() {
        this.f297s.setVisibility(0);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public boolean d2ok(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            lvui();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void d3(Configuration configuration) {
        super.d3(configuration);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void dd(AbstractC0096k.q qVar) {
        this.f46607kja0.remove(qVar);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void dr(CharSequence charSequence) {
        this.f297s.ld6(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: e */
    public void mo156e(int i2) {
        nn86(i2, -1);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void ek5k(float f2) {
        C0683f.a5id(this.f297s.cdj(), f2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public boolean eqxt(int i2, KeyEvent keyEvent) {
        Menu menuVq = vq();
        if (menuVq == null) {
            return false;
        }
        menuVq.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuVq.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: f */
    public void mo157f(int i2) {
        mo154c(LayoutInflater.from(this.f297s.getContext()).inflate(i2, this.f297s.cdj(), false));
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void f7l8(AbstractC0096k.q qVar) {
        this.f46607kja0.add(qVar);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public int fn3e() {
        return 0;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public boolean fti() {
        return this.f297s.getVisibility() == 0;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public CharSequence fu4() {
        return this.f297s.oc();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public AbstractC0096k.g gvn7() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void gyi(int i2) {
        d3 d3Var = this.f297s;
        d3Var.ld6(i2 != 0 ? d3Var.getContext().getText(i2) : null);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: h */
    public int mo159h() {
        return this.f297s.eqxt();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void hb(boolean z2) {
        nn86(z2 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void hyr(@dd Drawable drawable) {
        this.f297s.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: i */
    public int mo160i() {
        return 0;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void i1(int i2) {
        this.f297s.fti(i2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void ikck(CharSequence charSequence) {
        this.f297s.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: j */
    public void mo161j(boolean z2) {
        nn86(z2 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public boolean jk() {
        this.f297s.cdj().removeCallbacks(this.f295h);
        C0683f.mbx(this.f297s.cdj(), this.f295h);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public boolean jp0y() {
        return super.jp0y();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public int ki() {
        return this.f297s.mo535k();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public View kja0() {
        return this.f297s.getCustomView();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: l */
    public boolean mo163l() {
        ViewGroup viewGroupCdj = this.f297s.cdj();
        if (viewGroupCdj == null || viewGroupCdj.hasFocus()) {
            return false;
        }
        viewGroupCdj.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void ld6(AbstractC0096k.g gVar, boolean z2) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void lrht(View view, AbstractC0096k.toq toqVar) {
        if (view != null) {
            view.setLayoutParams(toqVar);
        }
        this.f297s.setCustomView(view);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void lv5(Drawable drawable) {
        this.f297s.wvg(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public boolean lvui() {
        return this.f297s.showOverflowMenu();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: m */
    public void mo164m(boolean z2) {
        nn86(z2 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void mcp() {
        this.f297s.setVisibility(8);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void n5r1(AbstractC0096k.g gVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void n7h(boolean z2) {
        if (z2 == this.f46609n7h) {
            return;
        }
        this.f46609n7h = z2;
        int size = this.f46607kja0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f46607kja0.get(i2).onMenuVisibilityChanged(z2);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void ncyb(int i2) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public AbstractC0096k.g ni7() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void nmn5(int i2) {
        this.f297s.setLogo(i2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void nn86(int i2, int i3) {
        this.f297s.mo539s((i2 & i3) | ((~i3) & this.f297s.eqxt()));
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: o */
    public void mo166o(boolean z2) {
        nn86(z2 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public int o1t() {
        return 0;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    void oc() {
        this.f297s.cdj().removeCallbacks(this.f295h);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: p */
    public void mo167p(AbstractC0096k.g gVar, int i2, boolean z2) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    void qkj8() {
        Menu menuVq = vq();
        androidx.appcompat.view.menu.f7l8 f7l8Var = menuVq instanceof androidx.appcompat.view.menu.f7l8 ? (androidx.appcompat.view.menu.f7l8) menuVq : null;
        if (f7l8Var != null) {
            f7l8Var.m323a();
        }
        try {
            menuVq.clear();
            if (!this.f296p.onCreatePanelMenu(0, menuVq) || !this.f296p.onPreparePanel(0, null, menuVq)) {
                menuVq.clear();
            }
        } finally {
            if (f7l8Var != null) {
                f7l8Var.a98o();
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public boolean qrj() {
        if (!this.f297s.f7l8()) {
            return false;
        }
        this.f297s.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: r */
    public void mo169r() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: s */
    public void mo170s(AbstractC0096k.g gVar, int i2) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: t */
    public CharSequence mo171t() {
        return this.f297s.getTitle();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void t8iq(int i2) {
        if (i2 == 2) {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        }
        this.f297s.mo533h(i2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: u */
    public void mo172u(int i2) {
        if (this.f297s.n7h() != 1) {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
        this.f297s.x2(i2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void uv6(boolean z2) {
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: v */
    public void mo173v(CharSequence charSequence) {
        this.f297s.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void vyq(boolean z2) {
        nn86(z2 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public Context wvg() {
        return this.f297s.getContext();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: x */
    public void mo174x(Drawable drawable) {
        this.f297s.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public boolean x2() {
        return this.f297s.hideOverflowMenu();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void x9kr(AbstractC0096k.g gVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void xwq3(int i2) {
        d3 d3Var = this.f297s;
        d3Var.setTitle(i2 != 0 ? d3Var.getContext().getText(i2) : null);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: y */
    public void mo175y(AbstractC0096k.g gVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void y2(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: z */
    public AbstractC0096k.g mo176z(int i2) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void zp(int i2) {
        this.f297s.setIcon(i2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public int zurt() {
        return -1;
    }
}
