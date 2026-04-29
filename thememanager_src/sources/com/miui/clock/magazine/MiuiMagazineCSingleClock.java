package com.miui.clock.magazine;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.miui.clock.C5049g;
import com.miui.clock.module.EnumC5072n;
import com.miui.clock.utils.BaseLineSpaceView;
import gcp.C6062n;
import gcp.C6066y;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiMagazineCSingleClock extends MiuiMagazineCBase {
    private TextView ar;
    private TextView bc;
    private LinearLayout bd;
    private ViewGroup bu;
    private boolean tgs;
    private BaseLineSpaceView tlhn;
    private float w97r;

    public MiuiMagazineCSingleClock(Context context) {
        super(context);
        this.w97r = 1.0f;
        this.tgs = true;
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
        if (abstractC5063p.eqxt() == 5) {
            this.bd.setGravity(androidx.core.view.qrj.f50865toq);
        } else {
            this.bd.setGravity(1);
        }
        this.ar.setTextColor(this.ay.qrj());
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
        TextView textView = this.ar;
        Locale locale = Locale.ENGLISH;
        textView.setText(String.format(locale, "%d%d", Integer.valueOf(this.ad[0]), Integer.valueOf(this.ad[1])));
        this.bc.setText(String.format(locale, "%d%d", Integer.valueOf(this.ad[2]), Integer.valueOf(this.ad[3])));
        this.bu.setContentDescription(miuix.pickerwidget.date.zy.m26303k(this.bl, System.currentTimeMillis(), (this.bg ? 32 : 16) | 12 | 64));
    }

    public int getNormalMarginOffset() {
        AbstractC5063p abstractC5063p = this.ay;
        return (abstractC5063p == null || abstractC5063p.eqxt() != 5) ? hb(C5049g.q.e9s) : hb(C5049g.q.zxa9);
    }

    @Override // com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public float getTopMargin() {
        return hb(C5049g.q.zxa9);
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.ar = (TextView) findViewById(C5049g.g.f71062wvg);
        this.bc = (TextView) findViewById(C5049g.g.f71023mcp);
        this.bu = (ViewGroup) findViewById(C5049g.g.f28963y);
        this.bd = (LinearLayout) findViewById(C5049g.g.f70964b3e);
        this.tlhn = (BaseLineSpaceView) findViewById(C5049g.g.f71069yl);
        yz();
    }

    @Override // com.miui.clock.zy.n7h
    public void qrj(boolean z2) {
        this.tgs = !z2;
    }

    @Override // com.miui.clock.magazine.MiuiMagazineCBase, com.miui.clock.zy.n7h
    public void setClockPalette(int i2, boolean z2, Map<String, Integer> map, boolean z3) {
        super.setClockPalette(i2, z2, map, z3);
        AbstractC5063p abstractC5063p = this.ay;
        if (abstractC5063p == null || !abstractC5063p.cdj()) {
            return;
        }
        if (C6062n.m22317h(this.bl)) {
            int qVar = this.ay.toq();
            int iN7h = this.ay.n7h();
            this.ay.gvn7(qVar);
            this.ay.d3(iN7h);
        } else {
            int iQrj = this.ay.qrj();
            int iN7h2 = this.ay.n7h();
            this.ay.gvn7(C6066y.m22346k(iQrj));
            this.ay.d3(C6066y.m22346k(iN7h2));
        }
        fti();
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public void setMagazineInfoVisible(boolean z2) {
    }

    @Override // com.miui.clock.MiuiBaseClock2
    protected void yz() {
        super.yz();
        if (this.bu != null) {
            float fHb = hb(C5049g.q.a7zh) * 1.0f;
            this.ar.setTextSize(0, fHb);
            this.bc.setTextSize(0, fHb);
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.toq) this.tlhn.getLayoutParams())).topMargin = (int) (hb(C5049g.q.iw) * 1.0f);
            int iHb = hb(C5049g.q.xo);
            ConstraintLayout.toq toqVar = (ConstraintLayout.toq) this.bu.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) toqVar).width = -1;
            ((ViewGroup.MarginLayoutParams) toqVar).height = (int) (iHb * 1.0f);
            toqVar.setMarginStart(hb(C5049g.q.sm));
            if (!C6062n.qrj() || C6062n.m22322s(this.bl)) {
                ((ViewGroup.MarginLayoutParams) toqVar).topMargin = hb(C5049g.q.cp);
            } else {
                ((ViewGroup.MarginLayoutParams) toqVar).topMargin = hb(C5049g.q.wqp);
            }
            this.bu.setLayoutParams(toqVar);
        }
    }

    public MiuiMagazineCSingleClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w97r = 1.0f;
        this.tgs = true;
    }
}
