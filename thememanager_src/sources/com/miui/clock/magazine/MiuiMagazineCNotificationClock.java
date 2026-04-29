package com.miui.clock.magazine;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.miui.clock.C5049g;
import com.miui.clock.MiuiTextGlassView;
import com.miui.clock.module.EnumC5072n;
import com.miui.clock.utils.BaseLineSpaceView;
import gcp.C6062n;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiMagazineCNotificationClock extends MiuiMagazineCBase {
    private MiuiTextGlassView ar;
    private MiuiTextGlassView bc;
    private BaseLineSpaceView bd;
    private ViewGroup bu;
    private float tlhn;
    private boolean w97r;

    public MiuiMagazineCNotificationClock(Context context) {
        super(context);
        this.tlhn = 1.0f;
        this.w97r = true;
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        return enumC5072n == EnumC5072n.FULL_TIME ? this.bu : enumC5072n == EnumC5072n.CLOCK_CONTAINER ? this.bu : super.f7l8(enumC5072n);
    }

    @Override // com.miui.clock.magazine.MiuiMagazineCBase, com.miui.clock.zy.n7h
    public void fti() {
        super.fti();
        AbstractC5063p abstractC5063p = this.ay;
        if (abstractC5063p == null) {
            return;
        }
        this.ar.setTextColor(abstractC5063p.qrj());
        if (this.ay.eqxt() == 6) {
            this.bc.setTextColor(this.ay.qrj());
        } else {
            this.bc.setTextColor(this.ay.n7h());
        }
        if (this.ay.eqxt() == 6) {
            this.bc.setFontFeatureSettings(this.am[this.ad[2]] + "," + this.am[this.ad[3]]);
        } else {
            this.bc.setFontFeatureSettings("");
        }
        MiuiTextGlassView miuiTextGlassView = this.ar;
        Locale locale = Locale.ENGLISH;
        miuiTextGlassView.setText(String.format(locale, "%d%d", Integer.valueOf(this.ad[0]), Integer.valueOf(this.ad[1])));
        this.bc.setText(String.format(locale, "%d%d", Integer.valueOf(this.ad[2]), Integer.valueOf(this.ad[3])));
        this.bu.setContentDescription(miuix.pickerwidget.date.zy.m26303k(this.bl, System.currentTimeMillis(), (this.bg ? 32 : 16) | 12 | 64));
        this.bc.setEnableDiffusion(this.ay.lvui());
    }

    @Override // com.miui.clock.zy.n7h
    public int mcp(boolean z2) {
        return ((!C6062n.qrj() || C6062n.m22322s(this.bl)) ? hb(C5049g.q.cp) : hb(C5049g.q.wqp)) + hb(C5049g.q.xo) + hb(C5049g.q.ybb);
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.ar = (MiuiTextGlassView) findViewById(C5049g.g.f71062wvg);
        this.bc = (MiuiTextGlassView) findViewById(C5049g.g.f71023mcp);
        this.bu = (ViewGroup) findViewById(C5049g.g.f28963y);
        this.bd = (BaseLineSpaceView) findViewById(C5049g.g.f71069yl);
        yz();
    }

    @Override // com.miui.clock.zy.n7h
    public void qrj(boolean z2) {
        this.w97r = !z2;
    }

    @Override // com.miui.clock.magazine.MiuiMagazineCBase, com.miui.clock.zy.n7h
    public void setClockPalette(int i2, boolean z2, Map<String, Integer> map, boolean z3) {
        super.setClockPalette(i2, z2, map, z3);
        fti();
    }

    @Override // com.miui.clock.MiuiBaseClock2
    protected void yz() {
        super.yz();
        if (this.bu != null) {
            float fHb = hb(C5049g.q.a7zh) * 1.0f;
            this.ar.setTextSize(0, fHb);
            this.bc.setTextSize(0, fHb);
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.toq) this.bd.getLayoutParams())).topMargin = (int) (hb(C5049g.q.iw) * 1.0f);
            int iHb = hb(C5049g.q.c2);
            int iHb2 = hb(C5049g.q.xo);
            ConstraintLayout.toq toqVar = (ConstraintLayout.toq) this.bu.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) toqVar).width = (int) (iHb * 1.0f);
            ((ViewGroup.MarginLayoutParams) toqVar).height = (int) (iHb2 * 1.0f);
            if (!C6062n.qrj() || C6062n.m22322s(this.bl)) {
                toqVar.setMarginStart(hb(C5049g.q.zaso));
                ((ViewGroup.MarginLayoutParams) toqVar).topMargin = hb(C5049g.q.cp);
            } else {
                toqVar.setMarginStart(hb(C5049g.q.mkmm));
                ((ViewGroup.MarginLayoutParams) toqVar).topMargin = hb(C5049g.q.wqp);
            }
            this.bu.setLayoutParams(toqVar);
        }
    }

    public MiuiMagazineCNotificationClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tlhn = 1.0f;
        this.w97r = true;
    }
}
