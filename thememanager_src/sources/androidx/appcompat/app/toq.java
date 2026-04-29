package androidx.appcompat.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.zy;
import androidx.appcompat.graphics.drawable.C0111q;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import zy.dd;
import zy.lvui;
import zy.nn86;

/* JADX INFO: compiled from: ActionBarDrawerToggle.java */
/* JADX INFO: loaded from: classes.dex */
public class toq implements DrawerLayout.InterfaceC0787n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f46619f7l8;

    /* JADX INFO: renamed from: g */
    boolean f324g;

    /* JADX INFO: renamed from: k */
    private final InterfaceC7850toq f325k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f46620ld6;

    /* JADX INFO: renamed from: n */
    private Drawable f326n;

    /* JADX INFO: renamed from: p */
    View.OnClickListener f327p;

    /* JADX INFO: renamed from: q */
    private boolean f328q;

    /* JADX INFO: renamed from: s */
    private final int f329s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final DrawerLayout f46621toq;

    /* JADX INFO: renamed from: y */
    private final int f330y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private C0111q f46622zy;

    /* JADX INFO: renamed from: androidx.appcompat.app.toq$k */
    /* JADX INFO: compiled from: ActionBarDrawerToggle.java */
    class ViewOnClickListenerC0104k implements View.OnClickListener {
        ViewOnClickListenerC0104k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            toq toqVar = toq.this;
            if (toqVar.f324g) {
                toqVar.zurt();
                return;
            }
            View.OnClickListener onClickListener = toqVar.f327p;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.toq$n */
    /* JADX INFO: compiled from: ActionBarDrawerToggle.java */
    static class C0105n implements InterfaceC7850toq {

        /* JADX INFO: renamed from: k */
        final Toolbar f332k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Drawable f46623toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final CharSequence f46624zy;

        C0105n(Toolbar toolbar) {
            this.f332k = toolbar;
            this.f46623toq = toolbar.getNavigationIcon();
            this.f46624zy = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.toq.InterfaceC7850toq
        /* JADX INFO: renamed from: k */
        public Context mo148k() {
            return this.f332k.getContext();
        }

        @Override // androidx.appcompat.app.toq.InterfaceC7850toq
        /* JADX INFO: renamed from: n */
        public void mo149n(@nn86 int i2) {
            if (i2 == 0) {
                this.f332k.setNavigationContentDescription(this.f46624zy);
            } else {
                this.f332k.setNavigationContentDescription(i2);
            }
        }

        @Override // androidx.appcompat.app.toq.InterfaceC7850toq
        /* JADX INFO: renamed from: q */
        public Drawable mo150q() {
            return this.f46623toq;
        }

        @Override // androidx.appcompat.app.toq.InterfaceC7850toq
        public boolean toq() {
            return true;
        }

        @Override // androidx.appcompat.app.toq.InterfaceC7850toq
        public void zy(Drawable drawable, @nn86 int i2) {
            this.f332k.setNavigationIcon(drawable);
            mo149n(i2);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.toq$q */
    /* JADX INFO: compiled from: ActionBarDrawerToggle.java */
    private static class C0106q implements InterfaceC7850toq {

        /* JADX INFO: renamed from: k */
        private final Activity f333k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private zy.C0108k f46625toq;

        C0106q(Activity activity) {
            this.f333k = activity;
        }

        @Override // androidx.appcompat.app.toq.InterfaceC7850toq
        /* JADX INFO: renamed from: k */
        public Context mo148k() {
            ActionBar actionBar = this.f333k.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f333k;
        }

        @Override // androidx.appcompat.app.toq.InterfaceC7850toq
        /* JADX INFO: renamed from: n */
        public void mo149n(int i2) {
            ActionBar actionBar = this.f333k.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i2);
            }
        }

        @Override // androidx.appcompat.app.toq.InterfaceC7850toq
        /* JADX INFO: renamed from: q */
        public Drawable mo150q() {
            TypedArray typedArrayObtainStyledAttributes = mo148k().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.toq.InterfaceC7850toq
        public boolean toq() {
            ActionBar actionBar = this.f333k.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.toq.InterfaceC7850toq
        public void zy(Drawable drawable, int i2) {
            ActionBar actionBar = this.f333k.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActionBarDrawerToggle.java */
    public interface InterfaceC7850toq {
        /* JADX INFO: renamed from: k */
        Context mo148k();

        /* JADX INFO: renamed from: n */
        void mo149n(@nn86 int i2);

        /* JADX INFO: renamed from: q */
        Drawable mo150q();

        boolean toq();

        void zy(Drawable drawable, @nn86 int i2);
    }

    /* JADX INFO: compiled from: ActionBarDrawerToggle.java */
    public interface zy {
        @dd
        InterfaceC7850toq a9();
    }

    public toq(Activity activity, DrawerLayout drawerLayout, @nn86 int i2, @nn86 int i3) {
        this(activity, null, drawerLayout, null, i2, i3);
    }

    private void t8r(float f2) {
        if (f2 == 1.0f) {
            this.f46622zy.fn3e(true);
        } else if (f2 == 0.0f) {
            this.f46622zy.fn3e(false);
        }
        this.f46622zy.t8r(f2);
    }

    public void cdj(int i2) {
        ki(i2 != 0 ? this.f46621toq.getResources().getDrawable(i2) : null);
    }

    public View.OnClickListener f7l8() {
        return this.f327p;
    }

    public void fn3e() {
        if (this.f46621toq.mcp(androidx.core.view.qrj.f50865toq)) {
            t8r(1.0f);
        } else {
            t8r(0.0f);
        }
        if (this.f324g) {
            qrj(this.f46622zy, this.f46621toq.mcp(androidx.core.view.qrj.f50865toq) ? this.f329s : this.f330y);
        }
    }

    /* JADX INFO: renamed from: g */
    Drawable m243g() {
        return this.f325k.mo150q();
    }

    /* JADX INFO: renamed from: h */
    public void m244h(boolean z2) {
        this.f328q = z2;
        if (z2) {
            return;
        }
        t8r(0.0f);
    }

    /* JADX INFO: renamed from: i */
    public void m245i(View.OnClickListener onClickListener) {
        this.f327p = onClickListener;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0787n
    /* JADX INFO: renamed from: k */
    public void mo246k(View view) {
        t8r(1.0f);
        if (this.f324g) {
            x2(this.f329s);
        }
    }

    public void ki(Drawable drawable) {
        if (drawable == null) {
            this.f326n = m243g();
            this.f46619f7l8 = false;
        } else {
            this.f326n = drawable;
            this.f46619f7l8 = true;
        }
        if (this.f324g) {
            return;
        }
        qrj(this.f326n, 0);
    }

    public void kja0(boolean z2) {
        if (z2 != this.f324g) {
            if (z2) {
                qrj(this.f46622zy, this.f46621toq.mcp(androidx.core.view.qrj.f50865toq) ? this.f329s : this.f330y);
            } else {
                qrj(this.f326n, 0);
            }
            this.f324g = z2;
        }
    }

    public boolean ld6(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f324g) {
            return false;
        }
        zurt();
        return true;
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public C0111q m247n() {
        return this.f46622zy;
    }

    public void n7h(@lvui C0111q c0111q) {
        this.f46622zy = c0111q;
        fn3e();
    }

    /* JADX INFO: renamed from: p */
    public void m248p(Configuration configuration) {
        if (!this.f46619f7l8) {
            this.f326n = m243g();
        }
        fn3e();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0787n
    /* JADX INFO: renamed from: q */
    public void mo249q(View view, float f2) {
        if (this.f328q) {
            t8r(Math.min(1.0f, Math.max(0.0f, f2)));
        } else {
            t8r(0.0f);
        }
    }

    void qrj(Drawable drawable, int i2) {
        if (!this.f46620ld6 && !this.f325k.toq()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f46620ld6 = true;
        }
        this.f325k.zy(drawable, i2);
    }

    /* JADX INFO: renamed from: s */
    public boolean m250s() {
        return this.f328q;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0787n
    public void toq(View view) {
        t8r(0.0f);
        if (this.f324g) {
            x2(this.f330y);
        }
    }

    void x2(int i2) {
        this.f325k.mo149n(i2);
    }

    /* JADX INFO: renamed from: y */
    public boolean m251y() {
        return this.f324g;
    }

    void zurt() {
        int iCdj = this.f46621toq.cdj(androidx.core.view.qrj.f50865toq);
        if (this.f46621toq.fti(androidx.core.view.qrj.f50865toq) && iCdj != 2) {
            this.f46621toq.m3791q(androidx.core.view.qrj.f50865toq);
        } else if (iCdj != 1) {
            this.f46621toq.eqxt(androidx.core.view.qrj.f50865toq);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0787n
    public void zy(int i2) {
    }

    public toq(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, @nn86 int i2, @nn86 int i3) {
        this(activity, toolbar, drawerLayout, null, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    toq(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, C0111q c0111q, @nn86 int i2, @nn86 int i3) {
        this.f328q = true;
        this.f324g = true;
        this.f46620ld6 = false;
        if (toolbar != null) {
            this.f325k = new C0105n(toolbar);
            toolbar.setNavigationOnClickListener(new ViewOnClickListenerC0104k());
        } else if (activity instanceof zy) {
            this.f325k = ((zy) activity).a9();
        } else {
            this.f325k = new C0106q(activity);
        }
        this.f46621toq = drawerLayout;
        this.f330y = i2;
        this.f329s = i3;
        if (c0111q == null) {
            this.f46622zy = new C0111q(this.f325k.mo148k());
        } else {
            this.f46622zy = c0111q;
        }
        this.f326n = m243g();
    }
}
