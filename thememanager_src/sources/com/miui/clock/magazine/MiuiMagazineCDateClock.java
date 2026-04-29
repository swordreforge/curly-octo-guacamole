package com.miui.clock.magazine;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.miui.clock.C5049g;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.EnumC5072n;
import com.miui.clock.utils.BaseLineSpaceView;
import gcp.C6062n;
import gcp.C6065s;
import java.util.Map;
import miuix.pickerwidget.date.C7230k;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiMagazineCDateClock extends MiuiMagazineCBase {
    private TextView ar;
    private ViewGroup bc;
    private float bd;
    private BaseLineSpaceView bu;
    private boolean tlhn;

    public MiuiMagazineCDateClock(Context context) {
        super(context);
        this.bd = 1.0f;
        this.tlhn = true;
    }

    @Override // com.miui.clock.zy.n7h
    public void cdj() {
        AbstractC5063p abstractC5063p = this.ay;
        if (abstractC5063p == null) {
            return;
        }
        if (abstractC5063p.cdj() && C6062n.m22317h(this.bl) && !C6062n.x2(this.bl)) {
            return;
        }
        C6065s.toq(this.bc);
        C6065s.zy(this.bc);
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        return enumC5072n == EnumC5072n.FULL_DATE ? this.ar : enumC5072n == EnumC5072n.CLOCK_CONTAINER ? this.bc : super.f7l8(enumC5072n);
    }

    @Override // com.miui.clock.magazine.MiuiMagazineCBase, com.miui.clock.zy.n7h
    public void fti() {
        super.fti();
        if (this.ay == null) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.toq) this.bu.getLayoutParams())).topMargin = (int) (hb(C5049g.q.rlj) * 1.0f);
        this.as.setTimeInMillis(System.currentTimeMillis());
        this.ar.setTextColor(this.ay.qrj());
        TextView textView = this.ar;
        C7230k c7230k = this.as;
        Context context = this.bl;
        textView.setText(c7230k.format(context, context.getString(C5049g.s.f71726i9jn)));
        TextView textView2 = this.ar;
        C7230k c7230k2 = this.as;
        Context context2 = this.bl;
        textView2.setContentDescription(c7230k2.format(context2, context2.getString(C5049g.s.f71741ltg8)));
    }

    @Override // com.miui.clock.zy.n7h
    public int mcp(boolean z2) {
        if (z2) {
            return getMagazineCNotificationMagazineY();
        }
        return y9n(this.tlhn ? this.bd : 1.0f, this.ay.f71879x9kr);
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.ar = (TextView) findViewById(C5049g.g.f71030ni7);
        this.bc = (ViewGroup) findViewById(C5049g.g.f28963y);
        this.bu = (BaseLineSpaceView) findViewById(C5049g.g.f71063wx16);
        yz();
    }

    @Override // com.miui.clock.zy.n7h
    public void qrj(boolean z2) {
        this.tlhn = !z2;
    }

    @Override // com.miui.clock.magazine.MiuiMagazineCBase, com.miui.clock.zy.n7h
    public void setClockPalette(int i2, boolean z2, Map<String, Integer> map, boolean z3) {
        super.setClockPalette(i2, z2, map, z3);
        if (C6062n.x2(this.bl)) {
            return;
        }
        AbstractC5063p abstractC5063p = this.ay;
        if (abstractC5063p != null && !AbstractC5074q.m17719h(abstractC5063p.d2ok()) && C6062n.m22317h(this.bl) && this.ay.cdj()) {
            if (!this.ay.t8r()) {
                C6065s.f7l8(this.bc, hb(C5049g.q.jglj));
            }
            C6065s.m22341p(this.bc, z2, this.ay.m17721g(), this.ay.qrj());
        }
        fti();
    }

    @Override // com.miui.clock.magazine.MiuiMagazineCBase, com.miui.clock.zy.n7h
    public void setClockStyleInfo(AbstractC5074q abstractC5074q) {
        super.setClockStyleInfo(abstractC5074q);
        cdj();
    }

    @Override // com.miui.clock.zy.n7h
    public void t8r(boolean z2) {
        super.t8r(z2);
        if (z2) {
            cdj();
        } else {
            setClockPalette(this.be, this.aj, this.bs, this.k0);
        }
    }

    @Override // com.miui.clock.MiuiBaseClock2
    protected void yz() {
        super.yz();
        if (this.bc != null) {
            this.ar.setTextSize(0, hb(C5049g.q.mxh));
            int iHb = hb(C5049g.q.j3px);
            ConstraintLayout.toq toqVar = (ConstraintLayout.toq) this.bc.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) toqVar).width = (int) (iHb * 1.0f);
            if (!C6062n.qrj() || C6062n.m22322s(this.bl)) {
                ((ViewGroup.MarginLayoutParams) toqVar).topMargin = hb(C5049g.q.e9s);
            } else {
                ((ViewGroup.MarginLayoutParams) toqVar).topMargin = hb(C5049g.q.xh);
            }
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.toq) this.bu.getLayoutParams())).topMargin = (int) (hb(C5049g.q.rlj) * 1.0f);
            ConstraintLayout.toq toqVar2 = (ConstraintLayout.toq) this.ar.getLayoutParams();
            if (!C6062n.qrj() || C6062n.m22322s(this.bl)) {
                ((ViewGroup.MarginLayoutParams) toqVar2).topMargin = hb(C5049g.q.pi);
            } else {
                ((ViewGroup.MarginLayoutParams) toqVar2).topMargin = hb(C5049g.q.wen);
            }
        }
    }

    public MiuiMagazineCDateClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.bd = 1.0f;
        this.tlhn = true;
    }
}
