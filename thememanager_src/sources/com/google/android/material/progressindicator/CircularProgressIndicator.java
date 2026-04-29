package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.InterfaceC7828g;
import zy.InterfaceC7833l;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
public final class CircularProgressIndicator extends BaseProgressIndicator<C4082n> {

    /* JADX INFO: renamed from: d */
    public static final int f24785d = 0;

    /* JADX INFO: renamed from: v */
    public static final int f24786v = C6095k.n7h.nt;

    /* JADX INFO: renamed from: w */
    public static final int f24787w = 1;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.CircularProgressIndicator$k */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface InterfaceC4077k {
    }

    public CircularProgressIndicator(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: i */
    private void m14687i() {
        setIndeterminateDrawable(C4083p.ni7(getContext(), (C4082n) this.f24773k));
        setProgressDrawable(C4080g.o1t(getContext(), (C4082n) this.f24773k));
    }

    public int getIndicatorDirection() {
        return ((C4082n) this.f24773k).f24820s;
    }

    @InterfaceC7833l
    public int getIndicatorInset() {
        return ((C4082n) this.f24773k).f24821y;
    }

    @InterfaceC7833l
    public int getIndicatorSize() {
        return ((C4082n) this.f24773k).f67743f7l8;
    }

    public void setIndicatorDirection(int i2) {
        ((C4082n) this.f24773k).f24820s = i2;
        invalidate();
    }

    public void setIndicatorInset(@InterfaceC7833l int i2) {
        S s2 = this.f24773k;
        if (((C4082n) s2).f24821y != i2) {
            ((C4082n) s2).f24821y = i2;
            invalidate();
        }
    }

    public void setIndicatorSize(@InterfaceC7833l int i2) {
        int iMax = Math.max(i2, getTrackThickness() * 2);
        S s2 = this.f24773k;
        if (((C4082n) s2).f67743f7l8 != iMax) {
            ((C4082n) s2).f67743f7l8 = iMax;
            ((C4082n) s2).mo14707n();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i2) {
        super.setTrackThickness(i2);
        ((C4082n) this.f24773k).mo14707n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* JADX INFO: renamed from: t8r, reason: merged with bridge method [inline-methods] */
    public C4082n mo14685s(@lvui Context context, @lvui AttributeSet attributeSet) {
        return new C4082n(context, attributeSet);
    }

    public CircularProgressIndicator(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.f80249nnh);
    }

    public CircularProgressIndicator(@lvui Context context, @dd AttributeSet attributeSet, @InterfaceC7828g int i2) {
        super(context, attributeSet, i2, f24786v);
        m14687i();
    }
}
