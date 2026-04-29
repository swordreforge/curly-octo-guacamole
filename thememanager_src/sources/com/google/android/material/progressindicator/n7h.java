package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.cdj;
import ij.C6095k;
import zy.InterfaceC7828g;
import zy.dd;
import zy.hb;
import zy.lvui;

/* JADX INFO: compiled from: LinearProgressIndicatorSpec.java */
/* JADX INFO: loaded from: classes2.dex */
public final class n7h extends toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public int f67744f7l8;

    /* JADX INFO: renamed from: s */
    boolean f24822s;

    /* JADX INFO: renamed from: y */
    public int f24823y;

    public n7h(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.mjed);
    }

    @Override // com.google.android.material.progressindicator.toq
    /* JADX INFO: renamed from: n */
    void mo14707n() {
        if (this.f67744f7l8 == 0) {
            if (this.f67766toq > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (this.f67767zy.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public n7h(@lvui Context context, @dd AttributeSet attributeSet, @InterfaceC7828g int i2) {
        this(context, attributeSet, i2, LinearProgressIndicator.f24789v);
    }

    public n7h(@lvui Context context, @dd AttributeSet attributeSet, @InterfaceC7828g int i2, @hb int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray typedArrayM14534p = cdj.m14534p(context, attributeSet, C6095k.kja0.q0, C6095k.zy.mjed, LinearProgressIndicator.f24789v, new int[0]);
        this.f67744f7l8 = typedArrayM14534p.getInt(C6095k.kja0.vllq, 1);
        this.f24823y = typedArrayM14534p.getInt(C6095k.kja0.avdu, 0);
        typedArrayM14534p.recycle();
        mo14707n();
        this.f24822s = this.f24823y == 1;
    }
}
