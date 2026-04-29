package miuix.appcompat.app;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AbstractC0096k;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import miuix.animation.controller.AnimState;
import xm.C7752g;
import xm.C7756y;
import zy.uv6;

/* JADX INFO: renamed from: miuix.appcompat.app.k */
/* JADX INFO: compiled from: ActionBar.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6946k extends AbstractC0096k {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static final int f86887kja0 = 8192;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f86888ld6 = 1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f86889n7h = 32;

    /* JADX INFO: renamed from: p */
    public static final int f38946p = 0;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f86890qrj = 16384;

    /* JADX INFO: renamed from: s */
    public static final int f38947s = -1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f86891x2 = 32768;

    /* JADX INFO: renamed from: miuix.appcompat.app.k$k */
    /* JADX INFO: compiled from: ActionBar.java */
    public interface k {
        void d3(int i2, float f2, boolean z2, boolean z3);

        /* JADX INFO: renamed from: k */
        void mo6476k(int i2);

        void toq(int i2);
    }

    /* JADX INFO: renamed from: miuix.appcompat.app.k$toq */
    /* JADX INFO: compiled from: ActionBar.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void m25019k();

        /* JADX INFO: renamed from: n */
        void m25020n(float f2, int i2);

        /* JADX INFO: renamed from: q */
        void m25021q(int i2, float f2);

        boolean toq();

        void zy();
    }

    public abstract void a5id(int i2, int i3, int i4);

    public abstract void b3e(View view);

    public abstract void b8(boolean z2);

    public abstract void b9ub(int i2, int i3);

    public abstract void bap7(ActivityC0891q activityC0891q, boolean z2);

    public abstract void bek6(InterfaceC6952n interfaceC6952n);

    public abstract View bwp(int i2);

    public abstract void bz2(boolean z2, AnimState animState);

    public abstract int cfr();

    public abstract void cnbm(int i2, int i3, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4);

    public abstract void cv06();

    public abstract void d8wk(int i2);

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public abstract void mo28298do(btvn.zy zyVar);

    public abstract void dxef(boolean z2);

    public abstract void e5(boolean z2);

    public abstract void ebn(boolean z2);

    public abstract int etdu();

    public abstract void ew(boolean z2);

    public abstract void fnq8(int i2, int i3);

    public abstract int g1(String str, AbstractC0096k.g gVar, int i2, Class<? extends Fragment> cls, Bundle bundle, boolean z2);

    public abstract void ga(boolean z2);

    public abstract void gbni(k kVar);

    public abstract void gc3c(AnimState animState);

    public abstract void gcp(View.OnClickListener onClickListener);

    public abstract void h4b(int i2);

    public abstract void h7am(AbstractC0096k.g gVar);

    public abstract void i9jn();

    public abstract void ij(View view);

    public abstract void ix(int i2);

    public abstract void ixz(AbstractC0096k.g gVar, boolean z2);

    public abstract void jbh(int i2);

    public abstract boolean jz5();

    public abstract View kcsr(int i2);

    public abstract void ktq(View view);

    public abstract void kx3(AnimState animState);

    public abstract void lh(ActivityC0891q activityC0891q);

    public abstract btvn.zy ltg8();

    public abstract void lw(View view);

    public abstract void m2t(boolean z2, AnimState animState);

    public abstract C7752g m4();

    public abstract void m58i(int i2, int i3, int i4, int i5, int i6, int i7);

    public abstract void mbx(String str);

    public abstract void n2t(int i2, boolean z2, boolean z3);

    public abstract void ngy(int i2, boolean z2);

    public abstract void nme(boolean z2);

    public abstract void nsb(int i2);

    public abstract void o05(int i2, boolean z2);

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public abstract void oc();

    public abstract void oki(int i2, boolean z2);

    public abstract void pc(int i2);

    public abstract void pjz9(int i2, int i3);

    public abstract void ps(boolean z2, boolean z3);

    public abstract void py(MenuItem menuItem);

    public abstract void qkj8(int i2);

    public abstract void qo(MenuItem menuItem);

    public abstract void r25n(View view);

    public abstract View r8s8();

    public abstract void ra(View view);

    public abstract int se();

    public abstract C7756y sok();

    public abstract void tfm(MenuItem menuItem, int i2);

    public abstract void u38j(boolean z2);

    public abstract void uc(String str, int i2, Class<? extends Fragment> cls, Bundle bundle, boolean z2);

    public abstract boolean uj2j();

    public abstract void ukdy(int i2);

    public abstract View v0af();

    public abstract void v5yj(View view);

    public abstract void vep5(Fragment fragment);

    public abstract void vq(InterfaceC6952n interfaceC6952n);

    @Deprecated
    public abstract void vy(int i2, int i3);

    /* JADX INFO: renamed from: w */
    public abstract void mo25018w(boolean z2);

    public abstract Fragment w831(int i2);

    public abstract int was(String str, AbstractC0096k.g gVar, Class<? extends Fragment> cls, Bundle bundle, boolean z2);

    public abstract void wlev(boolean z2);

    public abstract void wo();

    public abstract void wx16(View view);

    public abstract void yl(k kVar);

    public abstract View yqrt();

    public abstract int z4();

    public abstract void zkd(boolean z2);

    public abstract void zsr0(int i2);

    public abstract void zwy(int i2, boolean z2);
}
