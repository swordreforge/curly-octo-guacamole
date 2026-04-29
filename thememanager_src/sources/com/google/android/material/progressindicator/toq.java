package com.google.android.material.progressindicator;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.color.kja0;
import com.google.android.material.internal.cdj;
import ij.C6095k;
import zy.InterfaceC7828g;
import zy.InterfaceC7833l;
import zy.dd;
import zy.hb;
import zy.lvui;

/* JADX INFO: compiled from: BaseProgressIndicatorSpec.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class toq {

    /* JADX INFO: renamed from: g */
    public int f24846g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7833l
    public int f24847k;

    /* JADX INFO: renamed from: n */
    public int f24848n;

    /* JADX INFO: renamed from: q */
    @zy.x2
    public int f24849q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7833l
    public int f67766toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @lvui
    public int[] f67767zy = new int[0];

    protected toq(@lvui Context context, @dd AttributeSet attributeSet, @InterfaceC7828g int i2, @hb int i3) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C6095k.g.l5o);
        TypedArray typedArrayM14534p = cdj.m14534p(context, attributeSet, C6095k.kja0.ybb, i2, i3, new int[0]);
        this.f24847k = com.google.android.material.resources.zy.m14756q(context, typedArrayM14534p, C6095k.kja0.xnu, dimensionPixelSize);
        this.f67766toq = Math.min(com.google.android.material.resources.zy.m14756q(context, typedArrayM14534p, C6095k.kja0.mq, 0), this.f24847k / 2);
        this.f24848n = typedArrayM14534p.getInt(C6095k.kja0.wqp, 0);
        this.f24846g = typedArrayM14534p.getInt(C6095k.kja0.zaso, 0);
        zy(context, typedArrayM14534p);
        m14725q(context, typedArrayM14534p);
        typedArrayM14534p.recycle();
    }

    /* JADX INFO: renamed from: q */
    private void m14725q(@lvui Context context, @lvui TypedArray typedArray) {
        int i2 = C6095k.kja0.bmt3;
        if (typedArray.hasValue(i2)) {
            this.f24849q = typedArray.getColor(i2, -1);
            return;
        }
        this.f24849q = this.f67767zy[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f2 = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.f24849q = kja0.m14282k(this.f24849q, (int) (f2 * 255.0f));
    }

    private void zy(@lvui Context context, @lvui TypedArray typedArray) {
        int i2 = C6095k.kja0.mkmm;
        if (!typedArray.hasValue(i2)) {
            this.f67767zy = new int[]{kja0.toq(context, C6095k.zy.f80219kz28, -1)};
            return;
        }
        if (typedArray.peekValue(i2).type != 1) {
            this.f67767zy = new int[]{typedArray.getColor(i2, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i2, -1));
        this.f67767zy = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean m14726k() {
        return this.f24846g != 0;
    }

    /* JADX INFO: renamed from: n */
    abstract void mo14707n();

    public boolean toq() {
        return this.f24848n != 0;
    }
}
