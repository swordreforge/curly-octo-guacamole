package com.miui.clock.smartframe;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0498q;
import com.miui.clock.C5049g;
import com.miui.clock.module.EnumC5072n;
import com.miui.clock.utils.BaseLineSpaceView;
import gcp.C6062n;
import gcp.C6066y;
import gcp.ld6;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiSmartFrameSingleClock extends MiuiSmartFrameBase {
    private ImageView bd;
    private BaseLineSpaceView tgs;
    private FrameLayout tlhn;
    private View w97r;
    private BaseLineSpaceView yl25;

    public MiuiSmartFrameSingleClock(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    private void m17757b() {
        float fHb = hb(C5049g.q.twzk);
        this.am.setTextSize(0, fHb);
        this.ad.setTextSize(0, fHb);
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) this.am.getLayoutParams();
        ConstraintLayout.toq toqVar2 = (ConstraintLayout.toq) this.ad.getLayoutParams();
        toqVar2.setMarginStart(hb(C5049g.q.ex76));
        int i2 = C5049g.q.hczd;
        ((ViewGroup.MarginLayoutParams) toqVar2).topMargin = hb(i2);
        toqVar.setMarginStart(hb(C5049g.q.w0));
        ((ViewGroup.MarginLayoutParams) toqVar).topMargin = hb(i2);
        this.am.setLayoutParams(toqVar);
        this.ad.setLayoutParams(toqVar2);
    }

    private void bf2() {
        AbstractC5096k abstractC5096k = this.bu;
        if (abstractC5096k != null) {
            int iEqxt = abstractC5096k.eqxt();
            int i2 = C5049g.n.wtm;
            switch (iEqxt) {
                case 2:
                    i2 = C5049g.n.ex76;
                    break;
                case 3:
                    i2 = C5049g.n.hczd;
                    break;
                case 4:
                    i2 = C5049g.n.twzk;
                    break;
                case 5:
                    i2 = C5049g.n.y84;
                    break;
                case 6:
                    i2 = C5049g.n.fq;
                    break;
            }
            int qVar = C6066y.toq(this.bu.n7h());
            this.bd.setImageDrawable(ld6.m22315k(C0498q.m2259s(getContext(), i2), qVar));
        }
    }

    private void i1() {
        int color = Color.parseColor("#D7D7D7");
        this.ay.setTextColor(color);
        this.be.setTextColor(color);
        this.aj.setTextColor(color);
        this.bs.setTextColor(color);
        this.ad.setTextColor(color);
        this.am.setTextColor(color);
    }

    @Override // com.miui.clock.smartframe.MiuiSmartFrameBase, com.miui.clock.MiuiGalleryBaseClock, com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        return enumC5072n == EnumC5072n.BATTERY_CONTAINER ? this.tlhn : enumC5072n == EnumC5072n.LINE ? this.bd : super.f7l8(enumC5072n);
    }

    @Override // com.miui.clock.smartframe.MiuiSmartFrameBase, com.miui.clock.zy.n7h
    public void fti() {
        super.fti();
        yz();
        if (this.bu != null) {
            i1();
            bf2();
        }
    }

    @Override // com.miui.clock.smartframe.MiuiSmartFrameBase, com.miui.clock.MiuiGalleryBaseClock, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.w97r = findViewById(C5049g.g.f28963y);
        this.bd = (ImageView) findViewById(C5049g.g.f71071yz);
        this.tlhn = (FrameLayout) findViewById(C5049g.g.f70987f7l8);
        this.tgs = (BaseLineSpaceView) findViewById(C5049g.g.f28954o);
        this.yl25 = (BaseLineSpaceView) findViewById(C5049g.g.f71067y2);
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

    @Override // com.miui.clock.MiuiGalleryBaseClock, com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public void setMagazineInfoVisible(boolean z2) {
    }

    @Override // com.miui.clock.MiuiBaseClock2
    protected void yz() {
        super.yz();
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) this.w97r.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) toqVar).width = hb(C5049g.q.td);
        ((ViewGroup.MarginLayoutParams) toqVar).height = hb(C5049g.q.y84);
        if (C6062n.f77040zy && C6062n.m22323y(this.bl)) {
            toqVar.f2643i = 0;
            toqVar.f48522zurt = -1;
            toqVar.f2653s = 0;
            toqVar.setMarginStart(hb(C5049g.q.yh8z));
        } else {
            toqVar.f2643i = 0;
            toqVar.f48522zurt = 0;
            toqVar.f2653s = 0;
            toqVar.setMarginStart(0);
        }
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.toq) this.tgs.getLayoutParams())).topMargin = hb(C5049g.q.fq);
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.toq) this.yl25.getLayoutParams())).topMargin = hb(C5049g.q.wqg);
        ConstraintLayout.toq toqVar2 = (ConstraintLayout.toq) this.ay.getLayoutParams();
        ConstraintLayout.toq toqVar3 = (ConstraintLayout.toq) this.be.getLayoutParams();
        ConstraintLayout.toq toqVar4 = (ConstraintLayout.toq) this.aj.getLayoutParams();
        ConstraintLayout.toq toqVar5 = (ConstraintLayout.toq) this.bs.getLayoutParams();
        int iHb = hb(C5049g.q.vf);
        int iHb2 = hb(C5049g.q.bv);
        int iHb3 = hb(C5049g.q.lm5);
        int iHb4 = hb(C5049g.q.g8);
        if (C6062n.n7h()) {
            toqVar2.setMarginStart(iHb2);
            toqVar3.setMarginStart(iHb);
            toqVar4.setMarginStart(iHb4);
            toqVar5.setMarginStart(iHb3);
        } else {
            toqVar2.setMarginStart(iHb);
            toqVar3.setMarginStart(iHb2);
            toqVar4.setMarginStart(iHb3);
            toqVar5.setMarginStart(iHb4);
        }
        this.ay.setLayoutParams(toqVar2);
        this.be.setLayoutParams(toqVar3);
        this.aj.setLayoutParams(toqVar4);
        this.bs.setLayoutParams(toqVar5);
        float fHb = hb(C5049g.q.xx);
        this.ay.setTextSize(0, fHb);
        this.be.setTextSize(0, fHb);
        this.aj.setTextSize(0, fHb);
        this.bs.setTextSize(0, fHb);
        m17757b();
        ConstraintLayout.toq toqVar6 = (ConstraintLayout.toq) this.tlhn.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) toqVar6).topMargin = hb(C5049g.q.wtm);
        toqVar6.setMarginEnd(hb(C5049g.q.cc1));
        this.tlhn.setLayoutParams(toqVar6);
        this.w97r.setLayoutParams(toqVar);
    }

    public MiuiSmartFrameSingleClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
