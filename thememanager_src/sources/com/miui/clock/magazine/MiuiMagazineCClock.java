package com.miui.clock.magazine;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.miui.clock.C5049g;
import com.miui.clock.MiuiTextGlassView;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.C5069h;
import com.miui.clock.module.EnumC5072n;
import com.miui.clock.utils.BaseLineSpaceView;
import gcp.C6062n;
import gcp.C6064q;
import gcp.C6065s;
import java.util.Locale;
import java.util.Map;
import miuix.pickerwidget.date.C7230k;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiMagazineCClock extends MiuiMagazineCBase {
    private ViewGroup ar;
    private Guideline bc;
    private TextView bd;
    private TextView bu;
    private float cw14;
    private BaseLineSpaceView dy;
    private Typeface hp;
    private MiuiTextGlassView k6e;
    private Typeface mjvl;
    private TextView s8y;
    private BaseLineSpaceView sk1t;
    private Space tgs;
    private MiuiTextGlassView tlhn;
    private ViewGroup vb6;
    private MiuiTextGlassView w97r;
    private MiuiTextGlassView xk5;
    private boolean xy8;
    private Space yl25;
    private BaseLineSpaceView zmmu;

    /* JADX INFO: renamed from: com.miui.clock.magazine.MiuiMagazineCClock$k */
    static /* synthetic */ class C5059k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f29159k;

        static {
            int[] iArr = new int[EnumC5072n.values().length];
            f29159k = iArr;
            try {
                iArr[EnumC5072n.FULL_DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29159k[EnumC5072n.FULL_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29159k[EnumC5072n.CLOCK_CONTAINER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29159k[EnumC5072n.FULL_HOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29159k[EnumC5072n.FULL_MINUTE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MiuiMagazineCClock(Context context) {
        super(context);
        this.cw14 = 1.0f;
        this.xy8 = true;
    }

    /* JADX INFO: renamed from: b */
    private boolean m17696b() {
        AbstractC5063p abstractC5063p = this.ay;
        return abstractC5063p != null && 16 == abstractC5063p.f71878ncyb;
    }

    @Override // com.miui.clock.zy.n7h
    public void cdj() {
        if (this.ay == null) {
            return;
        }
        if (!C6062n.m22317h(this.bl) || C6062n.x2(this.bl)) {
            C6065s.toq(this.ar);
            C6065s.zy(this.bu);
            C6065s.zy(this.bd);
            C6065s.zy(this.tlhn);
            C6065s.zy(this.w97r);
            C6065s.toq(this.vb6);
            C6065s.zy(this.k6e);
            C6065s.zy(this.xk5);
            return;
        }
        if (this.ay.eqxt() == 5) {
            if (!this.ay.cdj() && !this.ay.ki()) {
                C6065s.toq(this.ar);
            }
            if (!this.ay.cdj()) {
                C6065s.zy(this.bu);
                C6065s.zy(this.bd);
                C6065s.zy(this.tlhn);
            }
            if (!this.ay.ki()) {
                C6065s.zy(this.w97r);
            }
            C6065s.toq(this.vb6);
            C6065s.zy(this.k6e);
            C6065s.zy(this.xk5);
            return;
        }
        if (this.ay.eqxt() == 6) {
            if (!this.ay.cdj()) {
                C6065s.toq(this.vb6);
                C6065s.zy(this.k6e);
                C6065s.zy(this.xk5);
            }
            C6065s.toq(this.ar);
            C6065s.zy(this.bu);
            C6065s.zy(this.bd);
            C6065s.zy(this.tlhn);
            C6065s.zy(this.w97r);
            return;
        }
        if (!this.ay.cdj() && !this.ay.ki()) {
            C6065s.toq(this.vb6);
        }
        if (!this.ay.cdj()) {
            C6065s.zy(this.k6e);
        }
        if (!this.ay.ki()) {
            C6065s.zy(this.xk5);
        }
        C6065s.toq(this.ar);
        C6065s.zy(this.bu);
        C6065s.zy(this.bd);
        C6065s.zy(this.tlhn);
        C6065s.zy(this.w97r);
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        int i2 = C5059k.f29159k[enumC5072n.ordinal()];
        if (i2 == 1) {
            if (this.ay.eqxt() == 5) {
                return this.bu;
            }
            return null;
        }
        if (i2 != 2) {
            return i2 != 3 ? i2 != 4 ? i2 != 5 ? super.f7l8(enumC5072n) : this.ay.eqxt() == 5 ? this.w97r : this.xk5 : this.ay.eqxt() == 5 ? this.tlhn : this.k6e : this.ay.eqxt() == 5 ? this.ar : this.vb6;
        }
        if (this.ay.eqxt() == 5) {
            return this.bd;
        }
        return null;
    }

    @Override // com.miui.clock.magazine.MiuiMagazineCBase, com.miui.clock.zy.n7h
    public void fti() {
        super.fti();
        AbstractC5063p abstractC5063p = this.ay;
        if (abstractC5063p == null) {
            return;
        }
        if (abstractC5063p.eqxt() != 5) {
            this.s8y.setVisibility(m17696b() ? 0 : 8);
            this.ar.setVisibility(8);
            this.vb6.setVisibility(0);
            this.k6e.setTextColor(this.ay.qrj());
            if (this.ay.eqxt() == 6) {
                this.xk5.setTextColor(this.ay.qrj());
            } else {
                this.xk5.setTextColor(this.ay.n7h());
            }
            float fHb = hb(C5049g.q.fbr) * 1.0f;
            this.k6e.setTextSize(0, fHb);
            this.xk5.setTextSize(0, fHb);
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.toq) this.dy.getLayoutParams())).topMargin = (int) (hb(C5049g.q.rlj) * 1.0f);
            if (this.ay.eqxt() == 6) {
                this.xk5.setFontFeatureSettings(this.am[this.ad[2]] + "," + this.am[this.ad[3]]);
            } else if (this.ay.eqxt() == 7) {
                this.xk5.setFontFeatureSettings("");
            }
            MiuiTextGlassView miuiTextGlassView = this.k6e;
            Locale locale = Locale.ENGLISH;
            miuiTextGlassView.setText(String.format(locale, "%d%d", Integer.valueOf(this.ad[0]), Integer.valueOf(this.ad[1])));
            this.xk5.setText(String.format(locale, "%d%d", Integer.valueOf(this.ad[2]), Integer.valueOf(this.ad[3])));
            this.vb6.setContentDescription(miuix.pickerwidget.date.zy.m26303k(this.bl, System.currentTimeMillis(), (this.bg ? 32 : 16) | 12 | 64));
            this.k6e.setEnableDiffusion(this.ay.lvui());
            this.xk5.setEnableDiffusion(this.ay.lvui());
            this.s8y.setTextColor(this.ay.qrj());
            TextView textView = this.s8y;
            C7230k c7230k = this.as;
            Context context = this.bl;
            textView.setText(c7230k.format(context, context.getString(C5049g.s.f71726i9jn)));
            TextView textView2 = this.s8y;
            C7230k c7230k2 = this.as;
            Context context2 = this.bl;
            textView2.setContentDescription(c7230k2.format(context2, context2.getString(C5049g.s.f71741ltg8)));
            return;
        }
        this.ar.setVisibility(0);
        this.vb6.setVisibility(8);
        this.bu.setTextColor(this.ay.qrj());
        this.bd.setTextColor(this.ay.qrj());
        this.tlhn.setTextColor(this.ay.qrj());
        this.w97r.setTextColor(this.ay.n7h());
        this.bu.setText(C6064q.m22334k(this.bl.getString(C5049g.s.f71765r8s8)).toUpperCase());
        TextView textView3 = this.bu;
        C7230k c7230k3 = this.as;
        Context context3 = this.bl;
        textView3.setContentDescription(c7230k3.format(context3, context3.getString(C5049g.s.f71744m4)));
        this.ar.setContentDescription(miuix.pickerwidget.date.zy.m26303k(this.bl, System.currentTimeMillis(), (this.bg ? 32 : 16) | 12 | 64));
        C7230k c7230k4 = this.as;
        Context context4 = this.bl;
        String str = c7230k4.format(context4, context4.getString(C5049g.s.f71761py));
        this.bd.setContentDescription(str);
        this.bd.setText(str.toUpperCase());
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) this.zmmu.getLayoutParams();
        ConstraintLayout.toq toqVar2 = (ConstraintLayout.toq) this.sk1t.getLayoutParams();
        ConstraintLayout.toq toqVar3 = (ConstraintLayout.toq) this.bd.getLayoutParams();
        ConstraintLayout.toq toqVar4 = (ConstraintLayout.toq) this.tgs.getLayoutParams();
        ConstraintLayout.toq toqVar5 = (ConstraintLayout.toq) this.yl25.getLayoutParams();
        if (gcp.f7l8.m22298h(str)) {
            this.bd.setTextSize(0, hb(C5049g.q.a7zh) * 1.0f);
            this.bd.setTypeface(this.mjvl);
            if (gcp.f7l8.qrj(str) || !gcp.f7l8.n7h(str)) {
                ((ViewGroup.MarginLayoutParams) toqVar).topMargin = (int) (hb(C5049g.q.cyg) * 1.0f);
                ((ViewGroup.MarginLayoutParams) toqVar2).topMargin = (int) (hb(C5049g.q.xnu) * 1.0f);
            } else {
                ((ViewGroup.MarginLayoutParams) toqVar).topMargin = (int) (hb(C5049g.q.ahb) * 1.0f);
                ((ViewGroup.MarginLayoutParams) toqVar2).topMargin = (int) (hb(C5049g.q.vymi) * 1.0f);
            }
            toqVar3.f48509qrj = C5049g.g.f70998h4b;
            toqVar3.f2653s = -1;
        } else {
            if ("bo".equals(Locale.getDefault().getLanguage())) {
                this.bd.setTextSize(0, hb(C5049g.q.mq) * 1.0f);
                ((ViewGroup.MarginLayoutParams) toqVar5).topMargin = (int) (hb(C5049g.q.wkrb) * 1.0f);
            } else {
                this.bd.setTextSize(0, hb(C5049g.q.b3fl) * 1.0f);
                ((ViewGroup.MarginLayoutParams) toqVar5).topMargin = (int) (hb(C5049g.q.fupf) * 1.0f);
            }
            toqVar3.f48509qrj = -1;
            toqVar3.f2653s = C5049g.g.f71054vep5;
            this.bd.setTypeface(this.hp);
            ((ViewGroup.MarginLayoutParams) toqVar2).topMargin = (int) (hb(C5049g.q.wh) * 1.0f);
        }
        ((ViewGroup.MarginLayoutParams) toqVar4).bottomMargin = hb(C5049g.q.ma8k);
        this.bc.setGuidelineBegin(((ViewGroup.MarginLayoutParams) toqVar2).topMargin + ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.toq) this.ar.getLayoutParams())).topMargin);
        MiuiTextGlassView miuiTextGlassView2 = this.tlhn;
        Locale locale2 = Locale.ENGLISH;
        miuiTextGlassView2.setText(String.format(locale2, "%d%d", Integer.valueOf(this.ad[0]), Integer.valueOf(this.ad[1])));
        this.w97r.setText(String.format(locale2, "%d%d", Integer.valueOf(this.ad[2]), Integer.valueOf(this.ad[3])));
        this.w97r.setEnableDiffusion(this.ay.lvui());
        ConstraintLayout.toq toqVar6 = (ConstraintLayout.toq) this.bq.getLayoutParams();
        toqVar6.f2650p = C5049g.g.f71073zkd;
        toqVar6.f2643i = 0;
        toqVar6.f48522zurt = -1;
        ((ViewGroup.MarginLayoutParams) toqVar6).topMargin = hb(C5049g.q.jre);
        toqVar6.setMarginStart((int) (hb(C5049g.q.drpy) * 1.0f));
    }

    @Override // com.miui.clock.zy.n7h
    public int getGalleryGravity() {
        AbstractC5063p abstractC5063p = this.ay;
        if (abstractC5063p == null || abstractC5063p.eqxt() == 5) {
            return androidx.core.view.qrj.f50865toq;
        }
        return 1;
    }

    @Override // com.miui.clock.zy.n7h
    public int mcp(boolean z2) {
        if (z2) {
            return getMagazineCNotificationMagazineY();
        }
        AbstractC5063p abstractC5063p = this.ay;
        if (!(abstractC5063p == null || abstractC5063p.eqxt() == 5)) {
            return y9n(this.xy8 ? this.cw14 : 1.0f, this.ay.f71879x9kr);
        }
        C7230k c7230k = this.as;
        Context context = this.bl;
        String str = c7230k.format(context, context.getString(C5049g.s.f71761py));
        return ((!C6062n.qrj() || C6062n.m22322s(this.bl)) ? hb(C5049g.q.zxa9) : hb(C5049g.q.p6)) + ((int) ((gcp.f7l8.m22298h(str) ? (gcp.f7l8.qrj(str) || !gcp.f7l8.n7h(str)) ? hb(C5049g.q.xnu) : hb(C5049g.q.vymi) : hb(C5049g.q.wh)) * 1.0f)) + hb(C5049g.q.jre);
    }

    @Override // com.miui.clock.MiuiBaseClock2
    /* JADX INFO: renamed from: o */
    protected void mo17538o() {
        super.mo17538o();
        this.hp = gcp.f7l8.f7l8();
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.mjvl = Typeface.create("miclock-neue-matic-compressed-black", 0);
        this.hp = gcp.f7l8.f7l8();
        this.ar = (ViewGroup) findViewById(C5049g.g.f28955p);
        this.bc = (Guideline) findViewById(C5049g.g.f71073zkd);
        this.bu = (TextView) findViewById(C5049g.g.f71076zurt);
        this.bd = (TextView) findViewById(C5049g.g.f70977d3);
        this.tlhn = (MiuiTextGlassView) findViewById(C5049g.g.f71062wvg);
        this.tgs = (Space) findViewById(C5049g.g.f71049uc);
        this.yl25 = (Space) findViewById(C5049g.g.f71054vep5);
        this.zmmu = (BaseLineSpaceView) findViewById(C5049g.g.f70998h4b);
        this.sk1t = (BaseLineSpaceView) findViewById(C5049g.g.f71028ncyb);
        this.w97r = (MiuiTextGlassView) findViewById(C5049g.g.f70990fti);
        this.vb6 = (ViewGroup) findViewById(C5049g.g.f71015ld6);
        this.k6e = (MiuiTextGlassView) findViewById(C5049g.g.f28959t);
        this.xk5 = (MiuiTextGlassView) findViewById(C5049g.g.f71009jp0y);
        this.dy = (BaseLineSpaceView) findViewById(C5049g.g.f71063wx16);
        this.s8y = (TextView) findViewById(C5049g.g.f71030ni7);
        C5069h c5069h = new C5069h();
        this.k6e.m17573s(c5069h);
        this.xk5.m17573s(c5069h);
        this.w97r.m17573s(c5069h);
        yz();
    }

    @Override // com.miui.clock.zy.n7h
    public void qrj(boolean z2) {
        this.xy8 = !z2;
        yz();
    }

    @Override // com.miui.clock.magazine.MiuiMagazineCBase, com.miui.clock.zy.n7h
    public void setClockPalette(int i2, boolean z2, Map<String, Integer> map, boolean z3) {
        super.setClockPalette(i2, z2, map, z3);
        if (C6062n.x2(this.bl)) {
            return;
        }
        AbstractC5063p abstractC5063p = this.ay;
        if (abstractC5063p != null && !AbstractC5074q.m17719h(abstractC5063p.d2ok()) && C6062n.m22317h(this.bl) && (this.ay.cdj() || this.ay.ki())) {
            int iHb = hb(C5049g.q.jglj);
            if (this.ay.eqxt() == 5) {
                if (!this.ay.t8r()) {
                    C6065s.f7l8(this.ar, iHb);
                }
                if (this.ay.cdj()) {
                    C6065s.m22341p(this.bu, z2, this.ay.m17721g(), this.ay.qrj());
                    C6065s.m22341p(this.bd, z2, this.ay.m17721g(), this.ay.qrj());
                    C6065s.m22341p(this.tlhn, z2, this.ay.m17721g(), this.ay.qrj());
                }
                if (this.ay.ki()) {
                    C6065s.m22341p(this.w97r, z2, this.ay.m17721g(), this.ay.n7h());
                }
            } else if (this.ay.eqxt() == 6) {
                if (!this.ay.t8r()) {
                    C6065s.f7l8(this.vb6, iHb);
                }
                if (this.ay.cdj()) {
                    C6065s.m22341p(this.k6e, z2, this.ay.m17721g(), this.ay.qrj());
                    C6065s.m22341p(this.xk5, z2, this.ay.m17721g(), this.ay.qrj());
                }
            } else {
                if (!this.ay.t8r()) {
                    C6065s.f7l8(this.vb6, iHb);
                }
                if (this.ay.cdj()) {
                    C6065s.m22341p(this.k6e, z2, this.ay.m17721g(), this.ay.qrj());
                }
                if (this.ay.ki()) {
                    C6065s.m22341p(this.xk5, z2, this.ay.m17721g(), this.ay.n7h());
                }
            }
        }
        fti();
    }

    @Override // com.miui.clock.magazine.MiuiMagazineCBase, com.miui.clock.zy.n7h
    public void setClockStyleInfo(AbstractC5074q abstractC5074q) {
        super.setClockStyleInfo(abstractC5074q);
        cdj();
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public void setMagazineInfoVisible(boolean z2) {
        AbstractC5063p abstractC5063p = this.ay;
        if (abstractC5063p == null || abstractC5063p.eqxt() != 5) {
            return;
        }
        super.setMagazineInfoVisible(z2);
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
        if (this.ar != null) {
            this.ar.getLayoutParams().width = (int) (hb(C5049g.q.bb) * 1.0f);
            float fHb = hb(C5049g.q.a7zh) * 1.0f;
            this.bu.setTextSize(0, fHb);
            this.tlhn.setTextSize(0, fHb);
            this.w97r.setTextSize(0, fHb);
            ConstraintLayout.toq toqVar = (ConstraintLayout.toq) this.ar.getLayoutParams();
            if (!C6062n.qrj() || C6062n.m22322s(this.bl)) {
                toqVar.setMarginStart(hb(C5049g.q.drpy));
                ((ViewGroup.MarginLayoutParams) toqVar).topMargin = (int) (hb(C5049g.q.zxa9) * 1.0f);
            } else {
                toqVar.setMarginStart(hb(C5049g.q.je1q));
                ((ViewGroup.MarginLayoutParams) toqVar).topMargin = hb(C5049g.q.p6);
            }
            this.ar.setLayoutParams(toqVar);
        }
        if (this.vb6 != null) {
            this.s8y.setTextSize(0, hb(C5049g.q.mxh));
            this.vb6.getLayoutParams().width = (int) (hb(C5049g.q.j3px) * 1.0f);
            ConstraintLayout.toq toqVar2 = (ConstraintLayout.toq) this.vb6.getLayoutParams();
            if (!C6062n.qrj() || C6062n.m22322s(this.bl)) {
                ((ViewGroup.MarginLayoutParams) toqVar2).topMargin = (int) (hb(C5049g.q.e9s) * 1.0f);
            } else {
                ((ViewGroup.MarginLayoutParams) toqVar2).topMargin = hb(C5049g.q.xh);
            }
            ConstraintLayout.toq toqVar3 = (ConstraintLayout.toq) this.s8y.getLayoutParams();
            if (!C6062n.qrj() || C6062n.m22322s(this.bl)) {
                ((ViewGroup.MarginLayoutParams) toqVar3).topMargin = hb(C5049g.q.pi);
            } else {
                ((ViewGroup.MarginLayoutParams) toqVar3).topMargin = hb(C5049g.q.wen);
            }
        }
    }

    public MiuiMagazineCClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.cw14 = 1.0f;
        this.xy8 = true;
    }
}
