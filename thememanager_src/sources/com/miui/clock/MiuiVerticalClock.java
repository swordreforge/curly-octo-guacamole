package com.miui.clock;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.miui.clock.C5049g;
import miuix.pickerwidget.date.C7230k;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiVerticalClock extends MiuiBaseClock {

    /* JADX INFO: renamed from: m */
    private TextView f28713m;

    public MiuiVerticalClock(Context context) {
        this(context, null);
    }

    @Override // com.miui.clock.MiuiBaseClock, com.miui.clock.zy.n7h
    public void fti() {
        super.fti();
        boolean z2 = this.f28602i;
        int i2 = z2 ? C5049g.s.f71734kcsr : C5049g.s.f71791yqrt;
        this.f28713m.setContentDescription(miuix.pickerwidget.date.zy.m26303k(this.f28603k, System.currentTimeMillis(), (z2 ? 32 : 16) | 12 | 64));
        TextView textView = this.f28713m;
        C7230k c7230k = this.f28605n;
        Context context = this.f28603k;
        textView.setText(c7230k.format(context, context.getString(i2)));
    }

    @Override // com.miui.clock.zy.n7h
    public TextView getTimeView() {
        return this.f28713m;
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
        layoutParams2.topMargin = (int) (this.f28598e * this.f28607q.getDimensionPixelSize(C5049g.q.w2bz));
        this.f28609s.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f28606p.getLayoutParams();
        layoutParams3.topMargin = (int) (this.f28598e * this.f28607q.getDimensionPixelSize(C5049g.q.f71559jbh));
        this.f28606p.setLayoutParams(layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f28601h.getLayoutParams();
        layoutParams4.topMargin = (int) (this.f28598e * this.f28607q.getDimensionPixelSize(C5049g.q.f71558ixz));
        this.f28601h.setLayoutParams(layoutParams4);
    }

    @Override // com.miui.clock.MiuiBaseClock
    protected void ki() {
        super.ki();
        this.f28713m.setTextSize(0, (int) (this.f28598e * this.f28603k.getResources().getDimensionPixelSize(C5049g.q.f71546h7am)));
    }

    @Override // com.miui.clock.MiuiBaseClock, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f28713m = (TextView) findViewById(C5049g.g.f70991fu4);
        fti();
    }

    @Override // com.miui.clock.MiuiBaseClock, com.miui.clock.zy.n7h
    public void setTextColorDark(boolean z2) {
        super.setTextColorDark(z2);
        int color = z2 ? getResources().getColor(C5049g.zy.f29099s) : -1;
        this.f28713m.setTextColor(color);
        setInfoDarkMode(color);
        setTextFontDark(z2);
    }

    @Override // com.miui.clock.MiuiBaseClock
    public void setTextFontDark(boolean z2) {
        super.setTextFontDark(z2);
        m17532g(z2, this.f28713m);
    }

    public MiuiVerticalClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
