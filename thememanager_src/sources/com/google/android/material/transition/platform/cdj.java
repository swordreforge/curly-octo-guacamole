package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.InterfaceC7828g;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: MaterialSharedAxis.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(21)
public final class cdj extends ki<ni7> {

    /* JADX INFO: renamed from: h */
    public static final int f25461h = 2;

    /* JADX INFO: renamed from: p */
    public static final int f25463p = 1;

    /* JADX INFO: renamed from: s */
    public static final int f25464s = 0;

    /* JADX INFO: renamed from: g */
    private final int f25466g;

    /* JADX INFO: renamed from: y */
    private final boolean f25467y;

    /* JADX INFO: renamed from: i */
    @InterfaceC7828g
    private static final int f25462i = C6095k.zy.e10;

    /* JADX INFO: renamed from: z */
    @InterfaceC7828g
    private static final int f25465z = C6095k.zy.ia;

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.cdj$k */
    /* JADX INFO: compiled from: MaterialSharedAxis.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface InterfaceC4199k {
    }

    public cdj(int i2, boolean z2) {
        super(m15186i(i2, z2), fn3e());
        this.f25466g = i2;
        this.f25467y = z2;
    }

    private static ni7 fn3e() {
        return new C4205n();
    }

    /* JADX INFO: renamed from: i */
    private static ni7 m15186i(int i2, boolean z2) {
        if (i2 == 0) {
            return new C4203i(z2 ? androidx.core.view.qrj.f50866zy : androidx.core.view.qrj.f50865toq);
        }
        if (i2 == 1) {
            return new C4203i(z2 ? 80 : 48);
        }
        if (i2 == 2) {
            return new t8r(z2);
        }
        throw new IllegalArgumentException("Invalid axis: " + i2);
    }

    @Override // com.google.android.material.transition.platform.ki
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ void mo15187k(@lvui ni7 ni7Var) {
        super.mo15187k(ni7Var);
    }

    @Override // com.google.android.material.transition.platform.ki
    public /* bridge */ /* synthetic */ boolean ki(@lvui ni7 ni7Var) {
        return super.ki(ni7Var);
    }

    @Override // com.google.android.material.transition.platform.ki
    @dd
    public /* bridge */ /* synthetic */ ni7 kja0() {
        return super.kja0();
    }

    @Override // com.google.android.material.transition.platform.ki
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ void mo15188n() {
        super.mo15188n();
    }

    @Override // com.google.android.material.transition.platform.ki
    @lvui
    public /* bridge */ /* synthetic */ ni7 n7h() {
        return super.n7h();
    }

    public boolean ni7() {
        return this.f25467y;
    }

    @Override // com.google.android.material.transition.platform.ki, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.ki, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.ki
    @InterfaceC7828g
    int qrj(boolean z2) {
        return f25465z;
    }

    @Override // com.google.android.material.transition.platform.ki
    @InterfaceC7828g
    /* JADX INFO: renamed from: s */
    int mo15189s(boolean z2) {
        return f25462i;
    }

    @Override // com.google.android.material.transition.platform.ki
    public /* bridge */ /* synthetic */ void t8r(@dd ni7 ni7Var) {
        super.t8r(ni7Var);
    }

    public int zurt() {
        return this.f25466g;
    }
}
