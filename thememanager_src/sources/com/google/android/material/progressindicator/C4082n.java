package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.cdj;
import ij.C6095k;
import zy.InterfaceC7828g;
import zy.InterfaceC7833l;
import zy.dd;
import zy.hb;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.progressindicator.n */
/* JADX INFO: compiled from: CircularProgressIndicatorSpec.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C4082n extends toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7833l
    public int f67743f7l8;

    /* JADX INFO: renamed from: s */
    public int f24820s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7833l
    public int f24821y;

    public C4082n(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.f80249nnh);
    }

    @Override // com.google.android.material.progressindicator.toq
    /* JADX INFO: renamed from: n */
    void mo14707n() {
    }

    public C4082n(@lvui Context context, @dd AttributeSet attributeSet, @InterfaceC7828g int i2) {
        this(context, attributeSet, i2, CircularProgressIndicator.f24786v);
    }

    public C4082n(@lvui Context context, @dd AttributeSet attributeSet, @InterfaceC7828g int i2, @hb int i3) {
        super(context, attributeSet, i2, i3);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C6095k.g.dgmt);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C6095k.g.ar4);
        TypedArray typedArrayM14534p = cdj.m14534p(context, attributeSet, C6095k.kja0.rb7, i2, i3, new int[0]);
        this.f67743f7l8 = Math.max(com.google.android.material.resources.zy.m14756q(context, typedArrayM14534p, C6095k.kja0.mn, dimensionPixelSize), this.f24847k * 2);
        this.f24821y = com.google.android.material.resources.zy.m14756q(context, typedArrayM14534p, C6095k.kja0.c4, dimensionPixelSize2);
        this.f24820s = typedArrayM14534p.getInt(C6095k.kja0.mqs, 0);
        typedArrayM14534p.recycle();
        mo14707n();
    }
}
