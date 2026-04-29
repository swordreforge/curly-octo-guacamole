package com.miui.clock.rhombus;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0498q;
import com.miui.clock.C5049g;
import com.miui.clock.MiuiClockNumberView;
import com.miui.clock.module.AbstractC5071k;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.EnumC5068g;
import com.miui.clock.module.EnumC5072n;
import com.miui.clock.module.fn3e;
import com.miui.clock.module.zurt;
import gcp.C6062n;
import gcp.C6065s;
import gcp.ld6;
import java.util.Map;
import miuix.pickerwidget.date.C7230k;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiRhombusClock extends MiuiRhombusBase {
    private static final String bq = "MiuiRhombusClock";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private ViewGroup f72016ab;
    private TextView an;
    private float as;
    private boolean ax;
    private boolean az;
    private boolean ba;
    private View bb;
    private boolean bg;
    private zurt bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private TextView f72017bo;
    private View bp;
    private ImageView bv;

    /* JADX INFO: renamed from: d */
    private View f29270d;
    private ViewGroup id;
    private fn3e in;

    /* JADX INFO: renamed from: u */
    private TextView f29271u;

    /* JADX INFO: renamed from: v */
    private ViewGroup f29272v;

    /* JADX INFO: renamed from: w */
    private View f29273w;

    /* JADX INFO: renamed from: com.miui.clock.rhombus.MiuiRhombusClock$k */
    static /* synthetic */ class C5086k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f29274k;

        static {
            int[] iArr = new int[EnumC5072n.values().length];
            f29274k = iArr;
            try {
                iArr[EnumC5072n.COLON1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29274k[EnumC5072n.COLON2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29274k[EnumC5072n.FULL_DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29274k[EnumC5072n.FULL_WEEK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29274k[EnumC5072n.FULL_HOUR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29274k[EnumC5072n.FULL_MINUTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29274k[EnumC5072n.FULL_TIME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29274k[EnumC5072n.FULL_COLON.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29274k[EnumC5072n.MAGAZINE_INFO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f29274k[EnumC5072n.NOTIFICATION_DATE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public MiuiRhombusClock(Context context) {
        super(context);
        this.as = -1.0f;
        this.bg = true;
        this.ax = false;
    }

    @Override // com.miui.clock.zy.n7h
    public void cdj() {
        toq toqVar = this.f29250c;
        if (toqVar == null) {
            return;
        }
        if (toqVar.cdj() && C6062n.m22317h(this.f29257k) && !C6062n.x2(this.f29257k)) {
            return;
        }
        C6065s.toq(this);
        C6065s.zy(this.f29266t);
        C6065s.zy(this.f29264r);
        C6065s.zy(this.f29258l);
        C6065s.zy(this.f29252f);
        C6065s.zy(this.bv);
        C6065s.zy(this.an);
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        switch (C5086k.f29274k[enumC5072n.ordinal()]) {
            case 1:
                return this.bb;
            case 2:
                return this.bp;
            case 3:
                return this.f29271u;
            case 4:
                return this.f72017bo;
            case 5:
                return this.f29270d;
            case 6:
                return this.f29273w;
            case 7:
                return this.f29272v;
            case 8:
                return this.bv;
            case 9:
                return this.id;
            case 10:
                return this.an;
            default:
                return super.f7l8(enumC5072n);
        }
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, com.miui.clock.zy.n7h
    public void fti() {
        super.fti();
        if (this.f29250c == null) {
            return;
        }
        int i2 = this.f29251e ? C5049g.s.f71689a98o : C5049g.s.f71710etdu;
        TextView textView = this.f29271u;
        C7230k c7230k = this.f29260n;
        Context context = this.f29257k;
        textView.setText(c7230k.format(context, context.getString(i2)));
        int i3 = this.f29251e ? C5049g.s.f71767sok : C5049g.s.f71699cfr;
        TextView textView2 = this.f72017bo;
        C7230k c7230k2 = this.f29260n;
        Context context2 = this.f29257k;
        textView2.setText(c7230k2.format(context2, context2.getString(i3)));
        TextView textView3 = this.an;
        C7230k c7230k3 = this.f29260n;
        Context context3 = this.f29257k;
        textView3.setText(c7230k3.format(context3, context3.getString(C5049g.s.f71689a98o)));
        this.an.setTextSize(0, m17737k(C5049g.q.a4ph));
        ((RelativeLayout.LayoutParams) this.an.getLayoutParams()).topMargin = m17737k(C5049g.q.km9o);
        this.f72017bo.setVisibility(this.f29251e ? 8 : 0);
        TextView textView4 = this.f29271u;
        int i4 = C5049g.q.ze;
        textView4.setTextSize(0, m17737k(i4));
        this.f72017bo.setTextSize(0, m17737k(i4));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f72016ab.getLayoutParams();
        int i5 = C5049g.q.g41;
        layoutParams.setMarginStart(m17737k(i5));
        layoutParams.setMarginEnd(m17737k(i5));
        layoutParams.topMargin = this.az ? m17737k(C5049g.q.lm) : m17737k(C5049g.q.u0z);
        this.f72016ab.setLayoutParams(layoutParams);
        this.f29272v.setContentDescription(miuix.pickerwidget.date.zy.m26303k(this.f29257k, System.currentTimeMillis(), (this.f29253g ? 32 : 16) | 12 | 64));
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f29272v.getLayoutParams();
        float f2 = 1.0f;
        int i6 = getResources().getConfiguration().orientation;
        if (C6062n.f35046q && i6 == 1) {
            f2 = 1.2f;
        } else if (C6062n.qrj() && !C6062n.m22322s(this.f29257k)) {
            f2 = 0.8f;
        }
        float f3 = this.as;
        if (f3 > 0.0f) {
            f2 *= f3;
        }
        layoutParams2.width = (int) (m17737k(C5049g.q.j1s) * f2);
        layoutParams2.height = (int) (m17737k(C5049g.q.wr) * f2);
        ViewGroup.LayoutParams layoutParams3 = this.f29270d.getLayoutParams();
        int i7 = C5049g.q.le9;
        layoutParams3.height = (int) (m17737k(i7) * f2);
        this.f29273w.getLayoutParams().height = (int) (m17737k(i7) * f2);
        int[] iArr = this.f29268z;
        int i8 = iArr[0];
        int i9 = iArr[1];
        int i10 = iArr[2];
        int i11 = iArr[3];
        int[] iArr2 = this.f29255i.ld6()[i8][i9];
        int[] iArr3 = this.f29255i.ki()[i10][i11];
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f29266t.getLayoutParams();
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f29264r.getLayoutParams();
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) this.f29258l.getLayoutParams();
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) this.f29252f.getLayoutParams();
        if (this.f29255i.mo17701p() == AbstractC5071k.k.Copperplate) {
            this.f29264r.setVisibility(8);
            this.f29252f.setVisibility(8);
            layoutParams4.width = -1;
            layoutParams4.height = -1;
            layoutParams4.topMargin = 0;
            layoutParams4.setMarginEnd(0);
            layoutParams6.width = -1;
            layoutParams6.height = -1;
            layoutParams6.topMargin = 0;
            layoutParams6.setMarginEnd(0);
            this.f29266t.setLayoutParams(layoutParams4);
            this.f29258l.setLayoutParams(layoutParams6);
            if (this.in == null) {
                this.in = new fn3e();
            }
            if (this.bl == null) {
                this.bl = new zurt();
            }
            this.f29266t.qrj(this.in).n7h((i8 * 10) + i9).kja0(f2).m17546s(0.0f).ld6(0, 0).m17545p(0, 0).x2(this.f29250c.vyq() ? EnumC5068g.BOTH : EnumC5068g.NONE).m17544k();
            this.f29258l.qrj(this.bl).m17546s(0.0f).kja0(f2).ld6(0, 0).m17545p(0, 0).n7h((i10 * 10) + i11).x2(this.f29250c.vyq() ? EnumC5068g.BOTH : EnumC5068g.NONE).m17544k();
        } else if (this.f29255i.mo17710k()) {
            this.f29264r.setVisibility(0);
            this.f29252f.setVisibility(0);
            int i12 = this.f29255i.kja0()[i8];
            int i13 = this.f29255i.n7h()[i8];
            double radians = Math.toRadians(this.f29255i.cdj());
            double d2 = i12;
            double d4 = i13;
            double dCos = (Math.cos(radians) * d2) + (Math.sin(radians) * d4);
            double dSin = (d2 * Math.sin(radians)) + (d4 * Math.cos(radians));
            float f4 = this.f29262p;
            double d5 = f2;
            layoutParams4.width = (int) (((double) f4) * dCos * d5);
            layoutParams4.height = (int) (((double) f4) * dSin * d5);
            layoutParams4.setMarginEnd((int) (iArr2[0] * f4 * f2));
            layoutParams4.topMargin = (int) (iArr2[1] * this.f29262p * f2);
            double d6 = this.f29255i.kja0()[i9];
            double d7 = this.f29255i.n7h()[i9];
            double dCos2 = (Math.cos(radians) * d6) + (Math.sin(radians) * d7);
            double dCos3 = (d7 * Math.cos(radians)) + (d6 * Math.sin(radians));
            float f5 = this.f29262p;
            layoutParams5.width = (int) (((double) f5) * dCos2 * d5);
            layoutParams5.height = (int) (((double) f5) * dCos3 * d5);
            layoutParams5.setMarginStart((int) (iArr2[2] * f5 * f2));
            layoutParams5.topMargin = (int) (iArr2[3] * this.f29262p * f2);
            double d8 = this.f29255i.kja0()[i10];
            double d9 = this.f29255i.n7h()[i10];
            double dCos4 = (Math.cos(radians) * d8) + (Math.sin(radians) * d9);
            double dSin2 = (d8 * Math.sin(radians)) + (d9 * Math.cos(radians));
            float f6 = this.f29262p;
            layoutParams6.width = (int) (((double) f6) * dCos4 * d5);
            layoutParams6.height = (int) (((double) f6) * dSin2 * d5);
            layoutParams6.setMarginEnd((int) (iArr3[0] * f6 * f2));
            layoutParams6.topMargin = (int) (iArr3[1] * this.f29262p * f2);
            double d10 = this.f29255i.kja0()[i11];
            double d11 = this.f29255i.n7h()[i11];
            double dCos5 = (Math.cos(radians) * d10) + (Math.sin(radians) * d11);
            double dCos6 = (d11 * Math.cos(radians)) + (d10 * Math.sin(radians));
            float f7 = this.f29262p;
            layoutParams7.width = (int) (((double) f7) * dCos5 * d5);
            layoutParams7.height = (int) (((double) f7) * dCos6 * d5);
            layoutParams7.setMarginStart((int) (iArr3[2] * f7 * f2));
            layoutParams7.topMargin = (int) (iArr3[3] * this.f29262p * f2);
            this.f29266t.setLayoutParams(layoutParams4);
            this.f29264r.setLayoutParams(layoutParams5);
            this.f29258l.setLayoutParams(layoutParams6);
            this.f29252f.setLayoutParams(layoutParams7);
            float[] fArr = this.f29255i.x2()[i8][i9];
            float[] fArr2 = this.f29255i.t8r()[i10][i11];
            MiuiClockNumberView miuiClockNumberViewM17545p = this.f29266t.qrj(this.f29255i).n7h(i8).m17545p(0, 0);
            float f8 = this.f29262p;
            miuiClockNumberViewM17545p.ld6((int) (dCos * 0.5d * ((double) f8) * d5), (int) (dSin * 0.5d * ((double) f8) * d5)).m17546s(fArr[0]).kja0(f2).x2(this.f29250c.vyq() ? EnumC5068g.LEFT : EnumC5068g.NONE).m17544k();
            MiuiClockNumberView miuiClockNumberViewM17545p2 = this.f29264r.qrj(this.f29255i).n7h(i9).m17545p(0, 0);
            float f9 = this.f29262p;
            miuiClockNumberViewM17545p2.ld6((int) (dCos2 * 0.5d * ((double) f9) * d5), (int) (dCos3 * 0.5d * ((double) f9) * d5)).m17546s(fArr[1]).kja0(f2).x2(this.f29250c.vyq() ? EnumC5068g.RIGHT : EnumC5068g.NONE).m17544k();
            MiuiClockNumberView miuiClockNumberViewM17545p3 = this.f29258l.qrj(this.f29255i).n7h(i10).m17545p(0, 0);
            float f10 = this.f29262p;
            miuiClockNumberViewM17545p3.ld6((int) (dCos4 * 0.5d * ((double) f10) * d5), (int) (dSin2 * 0.5d * ((double) f10) * d5)).m17546s(fArr2[0]).kja0(f2).x2(this.f29250c.vyq() ? EnumC5068g.LEFT : EnumC5068g.NONE).m17544k();
            MiuiClockNumberView miuiClockNumberViewM17545p4 = this.f29252f.qrj(this.f29255i).n7h(i11).m17545p(0, 0);
            float f11 = this.f29262p;
            miuiClockNumberViewM17545p4.ld6((int) (dCos5 * 0.5d * ((double) f11) * d5), (int) (dCos6 * 0.5d * ((double) f11) * d5)).m17546s(fArr2[1]).kja0(f2).x2(this.f29250c.vyq() ? EnumC5068g.RIGHT : EnumC5068g.NONE).m17544k();
        } else {
            this.f29264r.setVisibility(0);
            this.f29252f.setVisibility(0);
            layoutParams4.width = -2;
            float fQrj = this.f29255i.qrj();
            float f12 = this.f29262p;
            layoutParams4.height = (int) (fQrj * f12 * f2);
            layoutParams4.topMargin = (int) (iArr2[1] * f12 * f2);
            layoutParams4.setMarginEnd((int) (iArr2[0] * f12 * f2));
            layoutParams5.width = -2;
            float fQrj2 = this.f29255i.qrj();
            float f13 = this.f29262p;
            layoutParams5.height = (int) (fQrj2 * f13 * f2);
            layoutParams5.setMarginStart((int) (iArr2[2] * f13 * f2));
            layoutParams5.topMargin = (int) (iArr2[3] * this.f29262p * f2);
            layoutParams6.width = -2;
            float fQrj3 = this.f29255i.qrj();
            float f14 = this.f29262p;
            layoutParams6.height = (int) (fQrj3 * f14 * f2);
            layoutParams6.setMarginEnd((int) (iArr3[0] * f14 * f2));
            layoutParams6.topMargin = (int) (iArr3[1] * this.f29262p * f2);
            layoutParams7.width = -2;
            float fQrj4 = this.f29255i.qrj();
            float f15 = this.f29262p;
            layoutParams7.height = (int) (fQrj4 * f15 * f2);
            layoutParams7.setMarginStart((int) (iArr3[2] * f15 * f2));
            layoutParams7.topMargin = (int) (iArr3[3] * this.f29262p * f2);
            this.f29266t.setLayoutParams(layoutParams4);
            this.f29264r.setLayoutParams(layoutParams5);
            this.f29258l.setLayoutParams(layoutParams6);
            this.f29252f.setLayoutParams(layoutParams7);
            this.f29266t.qrj(this.f29255i).ld6(0, 0).m17545p(0, 0).n7h(i8).m17546s(0.0f).kja0(f2).x2(this.f29250c.vyq() ? EnumC5068g.LEFT : EnumC5068g.NONE).m17544k();
            this.f29264r.qrj(this.f29255i).ld6(0, 0).m17545p(0, 0).n7h(i9).m17546s(0.0f).kja0(f2).x2(this.f29250c.vyq() ? EnumC5068g.RIGHT : EnumC5068g.NONE).m17544k();
            this.f29258l.qrj(this.f29255i).ld6(0, 0).m17545p(0, 0).n7h(i10).m17546s(0.0f).kja0(f2).x2(this.f29250c.vyq() ? EnumC5068g.LEFT : EnumC5068g.NONE).m17544k();
            this.f29252f.qrj(this.f29255i).ld6(0, 0).m17545p(0, 0).n7h(i11).m17546s(0.0f).kja0(f2).x2(this.f29250c.vyq() ? EnumC5068g.RIGHT : EnumC5068g.NONE).m17544k();
        }
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) this.bb.getLayoutParams();
        ConstraintLayout.toq toqVar2 = (ConstraintLayout.toq) this.bp.getLayoutParams();
        int iMo17703y = (int) (this.f29255i.mo17703y() * this.f29262p * f2);
        ((ViewGroup.MarginLayoutParams) toqVar).width = iMo17703y;
        ((ViewGroup.MarginLayoutParams) toqVar).height = iMo17703y;
        ((ViewGroup.MarginLayoutParams) toqVar2).width = iMo17703y;
        ((ViewGroup.MarginLayoutParams) toqVar2).height = iMo17703y;
        ((ViewGroup.MarginLayoutParams) toqVar2).topMargin = (int) (this.f29255i.mo17699g() * this.f29262p * f2);
    }

    @Override // com.miui.clock.zy.n7h
    public int getMagazineColor() {
        toq toqVar = this.f29250c;
        if (toqVar != null) {
            return toqVar.f7l8();
        }
        return 0;
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, com.miui.clock.zy.n7h
    public void jk(boolean z2) {
        this.az = z2;
        ViewGroup viewGroup = this.f72016ab;
        if (viewGroup != null) {
            ((RelativeLayout.LayoutParams) viewGroup.getLayoutParams()).topMargin = z2 ? m17737k(C5049g.q.lm) : m17737k(C5049g.q.u0z);
        }
    }

    public void kja0() {
        C6065s.zy(this.f29271u);
        C6065s.zy(this.f72017bo);
    }

    @Override // com.miui.clock.zy.n7h
    public int mcp(boolean z2) {
        if (!z2) {
            return (this.az ? m17737k(C5049g.q.lm) : m17737k(C5049g.q.u0z)) + m17737k(C5049g.q.ze) + (m17737k(C5049g.q.tvn8) * 2);
        }
        float f2 = 1.0f;
        if (C6062n.qrj() && !C6062n.m22322s(this.f29257k)) {
            f2 = 0.8f;
        }
        return m17737k(C5049g.q.km9o) + m17737k(C5049g.q.krto) + m17737k(C5049g.q.li5y) + ((int) (this.f29255i.mo17704z() * this.f29262p * f2)) + m17737k(C5049g.q.zidq);
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f29271u = (TextView) findViewById(C5049g.g.f28948i);
        this.f72017bo = (TextView) findViewById(C5049g.g.f70996gvn7);
        this.id = (ViewGroup) findViewById(C5049g.g.f71031nmn5);
        this.f29272v = (ViewGroup) findViewById(C5049g.g.f70964b3e);
        this.f72016ab = (ViewGroup) findViewById(C5049g.g.f28957r);
        this.bb = findViewById(C5049g.g.f71027n7h);
        this.bp = findViewById(C5049g.g.f71013kja0);
        this.f29270d = findViewById(C5049g.g.f28949j);
        this.f29273w = findViewById(C5049g.g.f70968bo);
        this.bv = (ImageView) findViewById(C5049g.g.f28947h);
        this.an = (TextView) findViewById(C5049g.g.f28961v);
    }

    @Override // com.miui.clock.zy.n7h
    public void qrj(boolean z2) {
        this.bg = !z2;
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, com.miui.clock.zy.n7h
    public void setClockPalette(int i2, boolean z2, Map<String, Integer> map, boolean z3) {
        super.setClockPalette(i2, z2, map, z3);
        if (this.f29250c == null || C6062n.x2(this.f29257k)) {
            return;
        }
        x2();
        if (this.f29250c.cdj() && C6062n.m22317h(this.f29257k)) {
            int iM17721g = this.f29250c.m17721g();
            if (!this.f29250c.t8r()) {
                C6065s.f7l8(this, m17737k(C5049g.q.k2b8));
            }
            MiuiClockNumberView miuiClockNumberView = this.f29266t;
            C6065s.m22341p(miuiClockNumberView, z2, iM17721g, miuiClockNumberView.getTextColor());
            MiuiClockNumberView miuiClockNumberView2 = this.f29264r;
            C6065s.m22341p(miuiClockNumberView2, z2, iM17721g, miuiClockNumberView2.getTextColor());
            MiuiClockNumberView miuiClockNumberView3 = this.f29258l;
            C6065s.m22341p(miuiClockNumberView3, z2, iM17721g, miuiClockNumberView3.getTextColor());
            MiuiClockNumberView miuiClockNumberView4 = this.f29252f;
            C6065s.m22341p(miuiClockNumberView4, z2, iM17721g, miuiClockNumberView4.getTextColor());
            C6065s.m22341p(this.bv, z2, iM17721g, this.f29250c.qrj());
            C6065s.m22341p(this.an, z2, iM17721g, this.f29250c.qrj());
        }
        fti();
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, com.miui.clock.zy.n7h
    public void setClockStyleInfo(AbstractC5074q abstractC5074q) {
        super.setClockStyleInfo(abstractC5074q);
        setClockStyle(this.f29250c.x9kr());
        cdj();
        x2();
        fti();
    }

    @Override // com.miui.clock.zy.n7h
    public void setInfoTextColorDark(boolean z2) {
        if (this.f29250c == null) {
            return;
        }
        int color = !z2 ? Color.parseColor("#99ffffff") : Color.parseColor("#99000000");
        this.f29250c.m17749b(color);
        int iF7l8 = this.f29250c.f7l8();
        if (iF7l8 == 0 || iF7l8 == Color.parseColor("#99ffffff") || iF7l8 == Color.parseColor("#99000000")) {
            this.f29250c.jk(color);
            x2();
        }
    }

    public void setInfoTextPalette() {
        if (this.f29250c == null || C6062n.x2(this.f29257k) || !this.f29250c.cdj() || !C6062n.m22317h(this.f29257k)) {
            return;
        }
        int iM17721g = this.f29250c.m17721g();
        C6065s.m22341p(this.f29271u, this.f29250c.m17722i(), iM17721g, this.f29250c.qrj());
        C6065s.m22341p(this.f72017bo, this.f29250c.m17722i(), iM17721g, this.f29250c.qrj());
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, com.miui.clock.zy.n7h
    public void setMagazineInfoVisible(boolean z2) {
        super.setMagazineInfoVisible(z2);
        this.f29251e = z2;
        this.id.setVisibility(z2 ? 0 : 8);
        fti();
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, com.miui.clock.zy.n7h
    public void setScaleRatio(float f2) {
        super.setScaleRatio(f2);
        this.as = f2;
        fti();
    }

    public void setUserDefineColor(boolean z2) {
        this.ax = z2;
    }

    @Override // com.miui.clock.zy.n7h
    public void t8r(boolean z2) {
        super.t8r(z2);
        if (z2) {
            cdj();
        } else {
            setClockPalette(this.f29256j, this.f29261o, this.f29259m, this.f29249b);
        }
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, com.miui.clock.zy.n7h
    public void x2() {
        super.x2();
        toq toqVar = this.f29250c;
        if (toqVar == null || this.ax) {
            return;
        }
        this.f29271u.setTextColor(toqVar.f7l8());
        this.f72017bo.setTextColor(this.f29250c.f7l8());
        Drawable drawableM2259s = C0498q.m2259s(getContext(), this.f29255i.f7l8());
        this.bb.setBackground(ld6.m22315k(drawableM2259s, this.f29250c.n7h()));
        this.bp.setBackground(ld6.m22315k(drawableM2259s, this.f29250c.n7h()));
        int iQrj = this.f29250c.hyr(this.f29257k)[1];
        int iQrj2 = this.f29250c.hyr(this.f29257k)[0];
        if (iQrj == 0) {
            iQrj = this.f29250c.qrj();
        }
        if (iQrj2 == 0) {
            iQrj2 = this.f29250c.qrj();
        }
        if (this.f29255i.mo17701p() == AbstractC5071k.k.Copperplate) {
            MiuiClockNumberView miuiClockNumberView = this.f29266t;
            if (!this.f29250c.uv6()) {
                iQrj2 = this.f29250c.qrj();
            }
            miuiClockNumberView.m17543h(iQrj2);
            MiuiClockNumberView miuiClockNumberView2 = this.f29258l;
            if (!this.f29250c.uv6()) {
                iQrj = this.f29250c.qrj();
            }
            miuiClockNumberView2.m17543h(iQrj);
        } else {
            this.f29266t.m17543h(this.f29250c.uv6() ? iQrj2 : this.f29250c.qrj());
            MiuiClockNumberView miuiClockNumberView3 = this.f29264r;
            if (!this.f29250c.uv6()) {
                iQrj2 = this.f29250c.qrj();
            }
            miuiClockNumberView3.m17543h(iQrj2);
            this.f29258l.m17543h(this.f29250c.uv6() ? iQrj : this.f29250c.qrj());
            MiuiClockNumberView miuiClockNumberView4 = this.f29252f;
            if (!this.f29250c.uv6()) {
                iQrj = this.f29250c.qrj();
            }
            miuiClockNumberView4.m17543h(iQrj);
        }
        this.an.setTextColor(this.f29250c.qrj());
    }

    public MiuiRhombusClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.as = -1.0f;
        this.bg = true;
        this.ax = false;
    }
}
