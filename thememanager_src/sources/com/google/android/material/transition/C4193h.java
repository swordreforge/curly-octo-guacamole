package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C1225l;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.InterfaceC7828g;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: com.google.android.material.transition.h */
/* JADX INFO: compiled from: MaterialSharedAxis.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C4193h extends cdj<zurt> {
    public static final int dy = 0;
    public static final int k6e = 2;
    public static final int vb6 = 1;
    private final boolean sk1t;
    private final int zmmu;

    @InterfaceC7828g
    private static final int xk5 = C6095k.zy.e10;

    @InterfaceC7828g
    private static final int s8y = C6095k.zy.ia;

    /* JADX INFO: renamed from: com.google.android.material.transition.h$k */
    /* JADX INFO: compiled from: MaterialSharedAxis.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface k {
    }

    public C4193h(int i2, boolean z2) {
        super(kcsr(i2, z2), bwp());
        this.zmmu = i2;
        this.sk1t = z2;
    }

    private static zurt bwp() {
        return new C4197n();
    }

    private static zurt kcsr(int i2, boolean z2) {
        if (i2 == 0) {
            return new t8r(z2 ? androidx.core.view.qrj.f50866zy : androidx.core.view.qrj.f50865toq);
        }
        if (i2 == 1) {
            return new t8r(z2 ? 80 : 48);
        }
        if (i2 == 2) {
            return new ki(z2);
        }
        throw new IllegalArgumentException("Invalid axis: " + i2);
    }

    @Override // com.google.android.material.transition.cdj
    @dd
    public /* bridge */ /* synthetic */ zurt cfr() {
        return super.cfr();
    }

    @Override // com.google.android.material.transition.cdj, androidx.transition.t8iq
    public /* bridge */ /* synthetic */ Animator d8wk(ViewGroup viewGroup, View view, C1225l c1225l, C1225l c1225l2) {
        return super.d8wk(viewGroup, view, c1225l, c1225l2);
    }

    @Override // com.google.android.material.transition.cdj
    @InterfaceC7828g
    int etdu(boolean z2) {
        return s8y;
    }

    public boolean gc3c() {
        return this.sk1t;
    }

    @Override // com.google.android.material.transition.cdj
    public /* bridge */ /* synthetic */ void ltg8() {
        super.ltg8();
    }

    @Override // com.google.android.material.transition.cdj
    public /* bridge */ /* synthetic */ void py(@lvui zurt zurtVar) {
        super.py(zurtVar);
    }

    public int se() {
        return this.zmmu;
    }

    @Override // com.google.android.material.transition.cdj
    @lvui
    public /* bridge */ /* synthetic */ zurt sok() {
        return super.sok();
    }

    @Override // com.google.android.material.transition.cdj
    @InterfaceC7828g
    int v0af(boolean z2) {
        return xk5;
    }

    @Override // com.google.android.material.transition.cdj, androidx.transition.t8iq
    public /* bridge */ /* synthetic */ Animator was(ViewGroup viewGroup, View view, C1225l c1225l, C1225l c1225l2) {
        return super.was(viewGroup, view, c1225l, c1225l2);
    }

    @Override // com.google.android.material.transition.cdj
    public /* bridge */ /* synthetic */ void yqrt(@dd zurt zurtVar) {
        super.yqrt(zurtVar);
    }

    @Override // com.google.android.material.transition.cdj
    public /* bridge */ /* synthetic */ boolean z4(@lvui zurt zurtVar) {
        return super.z4(zurtVar);
    }
}
