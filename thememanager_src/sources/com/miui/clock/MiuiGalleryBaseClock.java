package com.miui.clock;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.miui.clock.C5049g;
import com.miui.clock.module.EnumC5072n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MiuiGalleryBaseClock extends MiuiBaseClock2 {
    protected boolean ac;
    protected ViewGroup bq;

    public MiuiGalleryBaseClock(Context context) {
        super(context);
    }

    @Override // com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        return enumC5072n == EnumC5072n.MAGAZINE_INFO ? this.bq : super.f7l8(enumC5072n);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.bq = (ViewGroup) findViewById(C5049g.g.f71031nmn5);
    }

    @Override // com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public void setMagazineInfoVisible(boolean z2) {
        this.ac = z2;
        this.bq.setVisibility(z2 ? 0 : 8);
        fti();
    }

    public MiuiGalleryBaseClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MiuiGalleryBaseClock(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
