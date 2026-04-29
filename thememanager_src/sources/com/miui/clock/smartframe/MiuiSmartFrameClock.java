package com.miui.clock.smartframe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.miui.clock.C5049g;
import com.miui.clock.module.EnumC5072n;
import com.miui.clock.utils.BaseLineSpaceView;
import gcp.C6062n;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiSmartFrameClock extends MiuiSmartFrameBase {
    private View bd;
    private BaseLineSpaceView tgs;
    private View tlhn;
    private BaseLineSpaceView w97r;

    public MiuiSmartFrameClock(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    private void m17756b(float f2) {
        float fHb = (int) (hb(C5049g.q.bp) * f2);
        this.am.setTextSize(0, fHb);
        this.ad.setTextSize(0, fHb);
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) this.am.getLayoutParams();
        ConstraintLayout.toq toqVar2 = (ConstraintLayout.toq) this.ad.getLayoutParams();
        int iHb = (int) (hb(C5049g.q.xknm) * f2);
        int iHb2 = (int) (hb(C5049g.q.c7g) * f2);
        ((ViewGroup.MarginLayoutParams) toqVar).bottomMargin = iHb;
        toqVar.setMarginEnd(iHb2);
        if (y9n(this.ad.getText().toString() + this.am.getText().toString())) {
            toqVar2.f48485fn3e = -1;
            toqVar2.f48522zurt = 0;
            toqVar2.f48496ld6 = C5049g.g.f70996gvn7;
            ((ViewGroup.MarginLayoutParams) toqVar2).bottomMargin = (int) (hb(C5049g.q.olj) * f2);
            toqVar2.setMarginEnd(iHb2);
        } else {
            toqVar2.f48485fn3e = C5049g.g.f70996gvn7;
            toqVar2.f48522zurt = -1;
            toqVar2.f48496ld6 = C5049g.g.f71025n2t;
            ((ViewGroup.MarginLayoutParams) toqVar2).bottomMargin = iHb;
            toqVar2.setMarginEnd((int) (hb(C5049g.q.b6i9) * f2));
        }
        this.am.setLayoutParams(toqVar);
        this.ad.setLayoutParams(toqVar2);
    }

    private void bf2() {
        this.ay.setTextColor(this.bu.qrj());
        this.be.setTextColor(this.bu.qrj());
        this.aj.setTextColor(this.bu.qrj());
        this.bs.setTextColor(this.bu.qrj());
        this.bd.setBackgroundColor(this.bu.qrj());
        this.ad.setTextColor(gcp.toq.m22345k(this.bu.qrj(), 0.6f));
        this.am.setTextColor(gcp.toq.m22345k(this.bu.qrj(), 0.6f));
    }

    @Override // com.miui.clock.smartframe.MiuiSmartFrameBase, com.miui.clock.MiuiGalleryBaseClock, com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        return enumC5072n == EnumC5072n.LINE ? this.bd : super.f7l8(enumC5072n);
    }

    @Override // com.miui.clock.smartframe.MiuiSmartFrameBase, com.miui.clock.zy.n7h
    public void fti() {
        super.fti();
        yz();
        int i2 = getResources().getConfiguration().orientation;
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) this.tlhn.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) toqVar).width = hb(C5049g.q.i0);
        ((ViewGroup.MarginLayoutParams) toqVar).height = (int) (hb(C5049g.q.dmw0) * 1.0f);
        if (C6062n.f35046q && i2 == 2) {
            toqVar.f2643i = 0;
            toqVar.f48522zurt = -1;
            toqVar.setMarginStart(hb(C5049g.q.t8o));
        } else {
            toqVar.f2643i = 0;
            toqVar.f48522zurt = 0;
            toqVar.setMarginStart(0);
        }
        ((ViewGroup.MarginLayoutParams) toqVar).topMargin = hb(C5049g.q.ym);
        this.tlhn.setLayoutParams(toqVar);
        m17756b(1.0f);
        bf2();
    }

    @Override // com.miui.clock.zy.n7h
    public int mcp(boolean z2) {
        return ((!C6062n.qrj() || C6062n.m22322s(this.bl)) ? hb(C5049g.q.ym) : hb(C5049g.q.qyk)) + hb(C5049g.q.dmw0) + hb(C5049g.q.s9de);
    }

    @Override // com.miui.clock.smartframe.MiuiSmartFrameBase, com.miui.clock.MiuiGalleryBaseClock, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.bd = findViewById(C5049g.g.f71025n2t);
        this.tlhn = findViewById(C5049g.g.f28963y);
        this.w97r = (BaseLineSpaceView) findViewById(C5049g.g.f28954o);
        this.tgs = (BaseLineSpaceView) findViewById(C5049g.g.f71067y2);
    }

    @Override // com.miui.clock.smartframe.MiuiSmartFrameBase, com.miui.clock.zy.n7h
    public void setClockPalette(int i2, boolean z2, Map<String, Integer> map, boolean z3) {
        super.setClockPalette(i2, z2, map, z3);
        AbstractC5096k abstractC5096k = this.bu;
        if (abstractC5096k == null || !abstractC5096k.cdj()) {
            return;
        }
        fti();
    }

    @Override // com.miui.clock.MiuiBaseClock2
    protected void yz() {
        super.yz();
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.toq) this.w97r.getLayoutParams())).topMargin = (int) (hb(C5049g.q.gg7) * 1.0f);
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.toq) this.tgs.getLayoutParams())).topMargin = (int) (hb(C5049g.q.jp) * 1.0f);
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) this.ay.getLayoutParams();
        ConstraintLayout.toq toqVar2 = (ConstraintLayout.toq) this.be.getLayoutParams();
        ConstraintLayout.toq toqVar3 = (ConstraintLayout.toq) this.aj.getLayoutParams();
        ConstraintLayout.toq toqVar4 = (ConstraintLayout.toq) this.bs.getLayoutParams();
        int iHb = (int) (hb(C5049g.q.x8) * 1.0f);
        int iHb2 = (int) (hb(C5049g.q.b972) * 1.0f);
        if (C6062n.n7h()) {
            toqVar.setMarginStart(iHb2);
            toqVar2.setMarginStart(iHb);
            toqVar3.setMarginStart(iHb2);
            toqVar4.setMarginStart(iHb);
        } else {
            toqVar.setMarginStart(iHb);
            toqVar2.setMarginStart(iHb2);
            toqVar3.setMarginStart(iHb);
            toqVar4.setMarginStart(iHb2);
        }
        this.ay.setLayoutParams(toqVar);
        this.be.setLayoutParams(toqVar2);
        this.aj.setLayoutParams(toqVar3);
        this.bs.setLayoutParams(toqVar4);
        float fHb = (int) (hb(C5049g.q.kho) * 1.0f);
        this.ay.setTextSize(0, fHb);
        this.be.setTextSize(0, fHb);
        this.aj.setTextSize(0, fHb);
        this.bs.setTextSize(0, fHb);
        ConstraintLayout.toq toqVar5 = (ConstraintLayout.toq) this.bd.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) toqVar5).height = (int) (hb(C5049g.q.ff8y) * 1.0f);
        ((ViewGroup.MarginLayoutParams) toqVar5).topMargin = (int) (hb(C5049g.q.te) * 1.0f);
    }

    public MiuiSmartFrameClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
