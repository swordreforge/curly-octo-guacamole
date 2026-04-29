package com.miui.clock.classic;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0397q;
import androidx.constraintlayout.widget.Group;
import com.miui.clock.C5049g;
import com.miui.clock.ConstraintLayoutAccessibilityHelper;
import com.miui.clock.MiuiTextGlassView;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.EnumC5072n;
import com.miui.clock.module.fu4;
import gcp.C6061k;
import gcp.C6062n;
import gcp.C6065s;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ClassicPlusClockView extends ClassicClockBaseView {
    private MiuiTextGlassView bc;
    private Group bd;
    private MiuiTextGlassView bu;
    private boolean tgs;
    private boolean tlhn;
    private int w97r;
    private ConstraintLayoutAccessibilityHelper yl25;

    /* JADX INFO: renamed from: com.miui.clock.classic.ClassicPlusClockView$k */
    static /* synthetic */ class C5045k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f28752k;

        static {
            int[] iArr = new int[EnumC5072n.values().length];
            f28752k = iArr;
            try {
                iArr[EnumC5072n.TEXT_AREA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28752k[EnumC5072n.TIME_AREA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28752k[EnumC5072n.TIME_AREA2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ClassicPlusClockView(Context context) {
        super(context);
        this.tgs = true;
    }

    /* JADX INFO: renamed from: a */
    private void m17603a() {
        C0397q c0397q = new C0397q();
        c0397q.gvn7(this);
        c0397q.b3e(C5049g.g.f71010jz5, 3, a98o(C5049g.q.f71597ncyb));
        int i2 = C5049g.g.f28950k;
        c0397q.b3e(i2, 3, a98o(C5049g.q.f71644uv6));
        int i3 = C5049g.g.f71048toq;
        c0397q.b3e(i3, 3, a98o(C5049g.q.f71512d2ok));
        c0397q.b3e(C5049g.g.f71031nmn5, 3, a98o(C5049g.q.f71523eqxt));
        int i4 = C5049g.q.f71582lvui;
        c0397q.x9kr(i2, a98o(i4));
        c0397q.x9kr(i3, a98o(i4));
        c0397q.ki(this);
        this.ad.m17611h();
        fu4 fu4Var = this.ay;
        if (fu4Var != null) {
            C6061k.zurt(this.bc, fu4Var);
            C6061k.zurt(this.bu, this.ay);
        }
    }

    private int a98o(int i2) {
        return hb(i2);
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView
    /* JADX INFO: renamed from: b */
    protected boolean mo17574b() {
        return true;
    }

    @Override // com.miui.clock.zy.n7h
    public void cdj() {
        fu4 fu4Var = this.ay;
        if (fu4Var == null) {
            return;
        }
        if (fu4Var.cdj() && C6062n.m22317h(this.bl) && !C6062n.x2(this.bl)) {
            return;
        }
        C6065s.toq(this);
        C6065s.zy(this.ad);
        C6065s.zy(this.bc);
        C6065s.zy(this.bu);
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        int i2 = C5045k.f28752k[enumC5072n.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? super.f7l8(enumC5072n) : this.bu : this.bc : this.ad;
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView, com.miui.clock.zy.n7h
    public void fti() {
        super.fti();
        int iM22311p = C6061k.m22311p(this.bg, this.as);
        int i2 = this.as.get(20);
        if (this.tlhn) {
            this.bc.setText(C6061k.ki(iM22311p, true));
            this.bu.setText(C6061k.ki(i2, true));
        } else {
            this.bc.setText(this.bl.getString(C5049g.s.f71715fu4, C6061k.ki(iM22311p, this.bg), C6061k.ki(i2, true)));
            this.bu.setText("");
        }
        this.yl25.setContentDescription(miuix.pickerwidget.date.zy.m26303k(getContext(), System.currentTimeMillis(), (this.bg ? 32 : 16) | 12 | 64));
    }

    @Override // com.miui.clock.zy.n7h
    public int getGalleryGravity() {
        return 1;
    }

    @Override // com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public float getTopMargin() {
        return hb(C5049g.q.f71597ncyb);
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView
    public void i1(AbstractC5074q abstractC5074q) {
        super.i1(abstractC5074q);
        if (abstractC5074q == null) {
            return;
        }
        setClockStyleInfo(abstractC5074q);
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView, com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public void jk(boolean z2) {
    }

    @Override // com.miui.clock.zy.n7h
    public int mcp(boolean z2) {
        float fY9n = y9n(C5049g.q.f71597ncyb);
        float fY9n2 = y9n(C5049g.q.f71644uv6);
        return (int) (fY9n + (this.ad != null ? r3.getLineHeight() : y9n(C5049g.q.f71595n5r1)) + fY9n2 + y9n(C5049g.q.f71582lvui) + ((z2 || !this.tlhn) ? y9n(C5049g.q.f71523eqxt) : y9n(C5049g.q.f71610oc)) + 0.5f);
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView, com.miui.clock.MiuiBaseClock2
    /* JADX INFO: renamed from: o */
    protected void mo17538o() {
        super.mo17538o();
        fu4 fu4Var = this.ay;
        if (fu4Var != null) {
            C6061k.zurt(this.bc, fu4Var);
            C6061k.zurt(this.bu, this.ay);
        }
    }

    @Override // com.miui.clock.MiuiBaseClock2, android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int iWidth = C6062n.f7l8(this.bl).width();
        if (this.w97r != iWidth) {
            this.w97r = iWidth;
            m17603a();
        }
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView, com.miui.clock.MiuiGalleryBaseClock, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.w97r = C6062n.f7l8(this.bl).width();
        this.bc = (MiuiTextGlassView) findViewById(C5049g.g.f71006ixz);
        MiuiTextGlassView miuiTextGlassView = (MiuiTextGlassView) findViewById(C5049g.g.f46224do);
        this.bu = miuiTextGlassView;
        miuiTextGlassView.setSameNumberWidth(true);
        this.bd = (Group) findViewById(C5049g.g.f70986etdu);
        this.yl25 = (ConstraintLayoutAccessibilityHelper) findViewById(C5049g.g.f70975cv06);
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView, com.miui.clock.zy.n7h
    public void setClockPalette(int i2, boolean z2, Map<String, Integer> map, boolean z3) {
        fu4 fu4Var;
        super.setClockPalette(i2, z2, map, z3);
        if (!C6062n.x2(this.bl) && (fu4Var = this.ay) != null && fu4Var.cdj() && C6062n.m22317h(this.bl)) {
            if (AbstractC5074q.m17719h(this.ay.dd())) {
                fu4 fu4Var2 = this.ay;
                fu4Var2.m17728z(fu4Var2.toq());
                return;
            }
            int iM17721g = this.ay.m17721g();
            if (!this.ay.t8r()) {
                C6065s.f7l8(this, hb(C5049g.q.f71489b3e));
            }
            C6065s.m22341p(this.ad, z2, iM17721g, this.ay.qrj());
            C6065s.m22341p(this.bc, z2, iM17721g, this.ay.qrj());
            C6065s.m22341p(this.bu, z2, iM17721g, this.ay.qrj());
        }
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView, com.miui.clock.zy.n7h
    public void setClockStyleInfo(AbstractC5074q abstractC5074q) {
        super.setClockStyleInfo(abstractC5074q);
        if (this.tgs) {
            this.tgs = false;
            m17603a();
        }
        cdj();
        boolean z2 = this.ay.lvui() == 72;
        this.tlhn = z2;
        this.bc.setSameNumberWidth(z2);
        if (this.tlhn) {
            this.bd.setVisibility(0);
            bf2(C5049g.g.f71031nmn5, hb(C5049g.q.f71610oc));
        } else {
            this.bd.setVisibility(8);
            bf2(C5049g.g.f71031nmn5, hb(C5049g.q.f71523eqxt));
        }
        C6061k.zurt(this.bc, this.ay);
        C6061k.zurt(this.bu, this.ay);
        fti();
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

    public ClassicPlusClockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tgs = true;
    }

    public ClassicPlusClockView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.tgs = true;
    }
}
