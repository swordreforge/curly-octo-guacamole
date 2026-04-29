package com.miui.clock;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.miui.clock.C5049g;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiCenterHorizontalClock extends MiuiBaseClock {

    /* JADX INFO: renamed from: m */
    private TextView f28613m;

    public MiuiCenterHorizontalClock(Context context) {
        this(context, null);
    }

    @Override // com.miui.clock.MiuiBaseClock, com.miui.clock.zy.n7h
    public void fti() {
        super.fti();
        this.f28613m.setText(miuix.pickerwidget.date.zy.m26303k(this.f28603k, System.currentTimeMillis(), (this.f28602i ? 32 : 16) | 12 | 64));
    }

    @Override // com.miui.clock.MiuiBaseClock, com.miui.clock.zy.n7h
    public float getTopMargin() {
        return this.f28603k.getResources().getDimensionPixelSize(C5049g.q.f71562jz5);
    }

    @Override // com.miui.clock.MiuiBaseClock
    /* JADX INFO: renamed from: h */
    protected void mo17533h() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.topMargin = this.f28597c ? (int) (this.f28598e * this.f28607q.getDimensionPixelSize(C5049g.q.f71562jz5)) : 0;
        setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f28609s.getLayoutParams();
        layoutParams2.topMargin = (int) (this.f28598e * this.f28607q.getDimensionPixelSize(C5049g.q.f71647vep5));
        this.f28609s.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f28606p.getLayoutParams();
        layoutParams3.topMargin = (int) (this.f28598e * this.f28607q.getDimensionPixelSize(C5049g.q.f71559jbh));
        this.f28606p.setLayoutParams(layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f28601h.getLayoutParams();
        layoutParams4.topMargin = (int) (this.f28598e * this.f28607q.getDimensionPixelSize(C5049g.q.f71558ixz));
        this.f28601h.setLayoutParams(layoutParams4);
    }

    @Override // com.miui.clock.MiuiBaseClock, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // com.miui.clock.MiuiBaseClock
    protected void ki() {
        super.ki();
        this.f28613m.setTextSize(0, (int) (this.f28598e * this.f28603k.getResources().getDimensionPixelSize(C5049g.q.f71546h7am)));
    }

    @Override // com.miui.clock.MiuiBaseClock, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f28613m = (TextView) findViewById(C5049g.g.f70991fu4);
        fti();
    }

    @Override // com.miui.clock.MiuiBaseClock, com.miui.clock.zy.n7h
    public void setTextColorDark(boolean z2) {
        super.setTextColorDark(z2);
        int color = z2 ? getResources().getColor(C5049g.zy.f29099s) : -1;
        this.f28613m.setTextColor(color);
        setInfoDarkMode(color);
        setTextFontDark(z2);
    }

    @Override // com.miui.clock.MiuiBaseClock
    public void setTextFontDark(boolean z2) {
        super.setTextFontDark(z2);
        m17532g(z2, this.f28613m);
    }

    public MiuiCenterHorizontalClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
