package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.toq;
import androidx.fragment.app.o1t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p030n.C7397k;
import zy.dd;
import zy.fn3e;
import zy.lvui;
import zy.nn86;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.app.k */
/* JADX INFO: compiled from: ActionBar.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0096k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f46596f7l8 = 8;

    /* JADX INFO: renamed from: g */
    public static final int f275g = 4;

    /* JADX INFO: renamed from: k */
    @Deprecated
    public static final int f276k = 0;

    /* JADX INFO: renamed from: n */
    public static final int f277n = 2;

    /* JADX INFO: renamed from: q */
    public static final int f278q = 1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @Deprecated
    public static final int f46597toq = 1;

    /* JADX INFO: renamed from: y */
    public static final int f279y = 16;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @Deprecated
    public static final int f46598zy = 2;

    /* JADX INFO: renamed from: androidx.appcompat.app.k$f7l8 */
    /* JADX INFO: compiled from: ActionBar.java */
    @Deprecated
    public interface f7l8 {
        void fn3e(g gVar, o1t o1tVar);

        /* JADX INFO: renamed from: p */
        void mo201p(g gVar, o1t o1tVar);

        /* JADX INFO: renamed from: z */
        void mo202z(g gVar, o1t o1tVar);
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.k$g */
    /* JADX INFO: compiled from: ActionBar.java */
    @Deprecated
    public static abstract class g {

        /* JADX INFO: renamed from: k */
        public static final int f280k = -1;

        public abstract g cdj(CharSequence charSequence);

        public abstract void f7l8();

        /* JADX INFO: renamed from: g */
        public abstract CharSequence mo177g();

        /* JADX INFO: renamed from: h */
        public abstract g mo178h(int i2);

        /* JADX INFO: renamed from: k */
        public abstract CharSequence mo179k();

        public abstract g kja0(Object obj);

        public abstract g ld6(View view);

        /* JADX INFO: renamed from: n */
        public abstract Object mo180n();

        public abstract g n7h(f7l8 f7l8Var);

        /* JADX INFO: renamed from: p */
        public abstract g mo181p(int i2);

        /* JADX INFO: renamed from: q */
        public abstract int mo182q();

        public abstract g qrj(Drawable drawable);

        /* JADX INFO: renamed from: s */
        public abstract g mo183s(CharSequence charSequence);

        public abstract View toq();

        public abstract g x2(@fn3e int i2);

        /* JADX INFO: renamed from: y */
        public abstract g mo184y(@nn86 int i2);

        public abstract Drawable zy();
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.k$k */
    /* JADX INFO: compiled from: ActionBar.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface k {
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.k$n */
    /* JADX INFO: compiled from: ActionBar.java */
    @Deprecated
    public interface n {
        boolean onNavigationItemSelected(int i2, long j2);
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.k$q */
    /* JADX INFO: compiled from: ActionBar.java */
    public interface q {
        void onMenuVisibilityChanged(boolean z2);
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.k$zy */
    /* JADX INFO: compiled from: ActionBar.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface zy {
    }

    /* JADX INFO: renamed from: a */
    public void mo152a(boolean z2) {
    }

    public boolean a9() {
        return false;
    }

    public void a98o(@dd Drawable drawable) {
    }

    /* JADX INFO: renamed from: b */
    public void mo153b(@nn86 int i2) {
    }

    public void bf2(@dd CharSequence charSequence) {
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void bo(boolean z2) {
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo154c(View view);

    public void c8jq(Drawable drawable) {
    }

    public float cdj() {
        return 0.0f;
    }

    @Deprecated
    public abstract void ch(SpinnerAdapter spinnerAdapter, n nVar);

    /* JADX INFO: renamed from: d */
    public abstract void mo155d();

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public boolean d2ok(KeyEvent keyEvent) {
        return false;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void d3(Configuration configuration) {
    }

    public abstract void dd(q qVar);

    public abstract void dr(CharSequence charSequence);

    /* JADX INFO: renamed from: e */
    public abstract void mo156e(int i2);

    public void ek5k(float f2) {
        if (f2 != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public boolean eqxt(int i2, KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo157f(int i2);

    public abstract void f7l8(q qVar);

    @Deprecated
    public abstract int fn3e();

    public abstract boolean fti();

    @dd
    public abstract CharSequence fu4();

    @Deprecated
    public abstract g gvn7();

    public abstract void gyi(int i2);

    /* JADX INFO: renamed from: h */
    public abstract int mo159h();

    public abstract void hb(boolean z2);

    public abstract void hyr(@dd Drawable drawable);

    @Deprecated
    /* JADX INFO: renamed from: i */
    public abstract int mo160i();

    public void i1(@fn3e int i2) {
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void ikck(CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo161j(boolean z2);

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public boolean jk() {
        return false;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public boolean jp0y() {
        return false;
    }

    public abstract int ki();

    public abstract View kja0();

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: l */
    boolean mo163l() {
        return false;
    }

    @Deprecated
    public abstract void ld6(g gVar, boolean z2);

    public abstract void lrht(View view, toq toqVar);

    public abstract void lv5(Drawable drawable);

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public boolean lvui() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo164m(boolean z2);

    public abstract void mcp();

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.view.toq mu(toq.InterfaceC0138k interfaceC0138k) {
        return null;
    }

    @Deprecated
    public abstract void n5r1(g gVar);

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void n7h(boolean z2) {
    }

    @Deprecated
    public abstract void ncyb(int i2);

    @Deprecated
    @dd
    public abstract g ni7();

    public abstract void nmn5(@fn3e int i2);

    public abstract void nn86(int i2, int i3);

    /* JADX INFO: renamed from: o */
    public abstract void mo166o(boolean z2);

    @Deprecated
    public abstract int o1t();

    void oc() {
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public abstract void mo167p(g gVar, int i2, boolean z2);

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public boolean qrj() {
        return false;
    }

    @Deprecated
    /* JADX INFO: renamed from: r */
    public abstract void mo169r();

    @Deprecated
    /* JADX INFO: renamed from: s */
    public abstract void mo170s(g gVar, int i2);

    @dd
    /* JADX INFO: renamed from: t */
    public abstract CharSequence mo171t();

    @Deprecated
    public abstract void t8iq(int i2);

    public int t8r() {
        return 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: u */
    public abstract void mo172u(int i2);

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void uv6(boolean z2) {
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo173v(CharSequence charSequence);

    public abstract void vyq(boolean z2);

    public Context wvg() {
        return null;
    }

    /* JADX INFO: renamed from: x */
    public abstract void mo174x(Drawable drawable);

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public boolean x2() {
        return false;
    }

    @Deprecated
    public abstract void x9kr(g gVar);

    public abstract void xwq3(@nn86 int i2);

    @Deprecated
    /* JADX INFO: renamed from: y */
    public abstract void mo175y(g gVar);

    public void y2(Drawable drawable) {
    }

    public void y9n(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    public void yz(int i2) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: z */
    public abstract g mo176z(int i2);

    public abstract void zp(@fn3e int i2);

    @Deprecated
    public abstract int zurt();

    /* JADX INFO: renamed from: androidx.appcompat.app.k$toq */
    /* JADX INFO: compiled from: ActionBar.java */
    public static class toq extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: k */
        public int f281k;

        public toq(@lvui Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f281k = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7397k.qrj.f92607a98o);
            this.f281k = typedArrayObtainStyledAttributes.getInt(C7397k.qrj.f42447a, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public toq(int i2, int i3) {
            super(i2, i3);
            this.f281k = 8388627;
        }

        public toq(int i2, int i3, int i4) {
            super(i2, i3);
            this.f281k = i4;
        }

        public toq(int i2) {
            this(-2, -1, i2);
        }

        public toq(toq toqVar) {
            super((ViewGroup.MarginLayoutParams) toqVar);
            this.f281k = 0;
            this.f281k = toqVar.f281k;
        }

        public toq(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f281k = 0;
        }
    }
}
