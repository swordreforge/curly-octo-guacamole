package com.miui.clock.magazine;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.miui.clock.C5049g;
import com.miui.clock.MiuiGalleryBaseClock;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.EnumC5072n;
import gcp.C6062n;
import gcp.C6064q;
import gcp.C6065s;
import java.util.Map;
import miuix.pickerwidget.date.C7230k;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiMagazineABase extends MiuiGalleryBaseClock {
    protected TextView ad;
    protected ViewGroup aj;
    protected TextView am;
    private View ar;
    protected TextView ay;
    private Space bc;
    protected AbstractC5064q bd;
    protected ViewGroup be;
    private View bs;
    private Space bu;
    protected boolean dy;
    private View k0;
    protected Map<String, Integer> sk1t;
    private Typeface tgs;
    private Typeface tlhn;
    private Typeface w97r;
    protected int yl25;
    protected boolean zmmu;

    /* JADX INFO: renamed from: com.miui.clock.magazine.MiuiMagazineABase$k */
    static /* synthetic */ class C5057k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f29157k;

        static {
            int[] iArr = new int[EnumC5072n.values().length];
            f29157k = iArr;
            try {
                iArr[EnumC5072n.FULL_DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29157k[EnumC5072n.FULL_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29157k[EnumC5072n.FULL_WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29157k[EnumC5072n.MAGAZINE_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29157k[EnumC5072n.CLOCK_CONTAINER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MiuiMagazineABase(Context context) {
        super(context);
    }

    @Override // com.miui.clock.zy.n7h
    public void cdj() {
        AbstractC5064q abstractC5064q = this.bd;
        if (abstractC5064q == null) {
            return;
        }
        if (abstractC5064q.cdj() && C6062n.m22317h(this.bl) && !C6062n.x2(this.bl)) {
            return;
        }
        C6065s.toq(this);
        C6065s.zy(this.be);
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        int i2 = C5057k.f29157k[enumC5072n.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? super.f7l8(enumC5072n) : this.be : this.bq : this.ay : this.am : this.ad;
    }

    @Override // com.miui.clock.zy.n7h
    public void fti() {
        this.as.setTimeInMillis(System.currentTimeMillis());
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) this.be.getLayoutParams();
        ConstraintLayout.toq toqVar2 = (ConstraintLayout.toq) this.aj.getLayoutParams();
        ConstraintLayout.toq toqVar3 = (ConstraintLayout.toq) this.bq.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) toqVar).width = hb(C5049g.q.z1r);
        ((ViewGroup.MarginLayoutParams) toqVar).height = hb(C5049g.q.sj);
        ConstraintLayout.toq toqVar4 = (ConstraintLayout.toq) this.am.getLayoutParams();
        ConstraintLayout.toq toqVar5 = (ConstraintLayout.toq) this.ad.getLayoutParams();
        ConstraintLayout.toq toqVar6 = (ConstraintLayout.toq) this.ay.getLayoutParams();
        ConstraintLayout.toq toqVar7 = (ConstraintLayout.toq) this.bs.getLayoutParams();
        ConstraintLayout.toq toqVar8 = (ConstraintLayout.toq) this.k0.getLayoutParams();
        ConstraintLayout.toq toqVar9 = (ConstraintLayout.toq) this.ar.getLayoutParams();
        AbstractC5064q abstractC5064q = this.bd;
        if (abstractC5064q != null) {
            if (abstractC5064q.eqxt() == 2) {
                int i2 = C5049g.q.zxq;
                ((ViewGroup.MarginLayoutParams) toqVar7).topMargin = hb(i2);
                int i3 = C5049g.q.dbf;
                ((ViewGroup.MarginLayoutParams) toqVar8).topMargin = hb(i3);
                ((ViewGroup.MarginLayoutParams) toqVar9).topMargin = hb(C5049g.q.gw);
                ConstraintLayout.toq toqVar10 = (ConstraintLayout.toq) this.bc.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) toqVar10).topMargin = hb(i2);
                toqVar10.setMarginStart(hb(C5049g.q.vg));
                this.bc.setLayoutParams(toqVar10);
                ConstraintLayout.toq toqVar11 = (ConstraintLayout.toq) this.bu.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) toqVar11).topMargin = hb(i3);
                toqVar11.setMarginStart(hb(C5049g.q.izu));
                this.bu.setLayoutParams(toqVar11);
                int i4 = C5049g.q.e4e;
                ((ViewGroup.MarginLayoutParams) toqVar5).width = hb(i4);
                ((ViewGroup.MarginLayoutParams) toqVar5).height = hb(C5049g.q.nc);
                ((ViewGroup.MarginLayoutParams) toqVar4).width = hb(i4);
                ((ViewGroup.MarginLayoutParams) toqVar4).height = hb(C5049g.q.ap23);
                ((ViewGroup.MarginLayoutParams) toqVar6).width = -1;
                ((ViewGroup.MarginLayoutParams) toqVar6).height = hb(C5049g.q.cjaj);
                toqVar5.f48509qrj = C5049g.g.f71065x9kr;
                toqVar4.f48509qrj = C5049g.g.f71069yl;
                toqVar6.f48509qrj = C5049g.g.f70965bap7;
                int i5 = C5049g.g.f71020lvui;
                toqVar5.f2643i = i5;
                int i6 = C5049g.g.f71014ktq;
                toqVar4.f2643i = i6;
                toqVar6.f2643i = 0;
                toqVar5.f48522zurt = i5;
                toqVar4.f48522zurt = i6;
                toqVar6.f48522zurt = 0;
                toqVar5.setMarginStart(0);
                toqVar4.setMarginStart(0);
                toqVar6.setMarginStart(0);
                toqVar5.setMarginEnd(0);
                toqVar4.setMarginEnd(0);
                toqVar6.setMarginEnd(0);
                this.ad.setLayoutParams(toqVar5);
                this.am.setLayoutParams(toqVar4);
                this.ay.setLayoutParams(toqVar6);
                this.ad.setTextSize(0, hb(C5049g.q.nod));
                this.am.setTextSize(0, hb(C5049g.q.es7));
                this.ay.setTextSize(0, hb(C5049g.q.alcv));
                this.ad.setTypeface(this.w97r);
                this.am.setTypeface(this.w97r);
                this.ay.setTypeface(this.tgs);
                this.ad.setLetterSpacing(0.0f);
                this.am.setLetterSpacing(0.0f);
                this.ad.setGravity(1);
                this.am.setGravity(1);
                this.ay.setGravity(1);
                toqVar2.f2643i = 0;
                toqVar2.f48522zurt = 0;
                toqVar3.f2643i = 0;
                toqVar3.f48522zurt = 0;
                toqVar2.f2653s = 0;
                toqVar2.setMarginStart(0);
                toqVar3.setMarginStart(0);
                toqVar2.setMarginEnd(0);
                toqVar3.setMarginEnd(0);
                ((ViewGroup.MarginLayoutParams) toqVar2).topMargin = hb(C5049g.q.d6c);
            } else {
                ((ViewGroup.MarginLayoutParams) toqVar7).topMargin = hb(C5049g.q.m28);
                ((ViewGroup.MarginLayoutParams) toqVar8).topMargin = hb(C5049g.q.vahq);
                ((ViewGroup.MarginLayoutParams) toqVar9).topMargin = hb(C5049g.q.s31);
                ((ViewGroup.MarginLayoutParams) toqVar5).width = -2;
                ((ViewGroup.MarginLayoutParams) toqVar5).height = hb(C5049g.q.zma);
                ((ViewGroup.MarginLayoutParams) toqVar4).width = -2;
                ((ViewGroup.MarginLayoutParams) toqVar4).height = hb(C5049g.q.sb);
                ((ViewGroup.MarginLayoutParams) toqVar6).width = -2;
                ((ViewGroup.MarginLayoutParams) toqVar6).height = hb(C5049g.q.zah1);
                toqVar5.f48509qrj = C5049g.g.f71065x9kr;
                toqVar4.f48509qrj = C5049g.g.f71069yl;
                toqVar6.f48509qrj = C5049g.g.f70965bap7;
                if (this.bd.eqxt() == 1) {
                    toqVar5.f2643i = 0;
                    toqVar4.f2643i = 0;
                    toqVar6.f2643i = 0;
                    toqVar5.f48522zurt = -1;
                    toqVar4.f48522zurt = -1;
                    toqVar6.f48522zurt = -1;
                    toqVar5.setMarginStart(hb(C5049g.q.kjd));
                    toqVar4.setMarginStart(hb(C5049g.q.eklw));
                    toqVar6.setMarginStart(hb(C5049g.q.oei));
                    toqVar5.setMarginEnd(0);
                    toqVar4.setMarginEnd(0);
                    toqVar6.setMarginEnd(0);
                    toqVar2.f2643i = 0;
                    toqVar3.f2643i = 0;
                    toqVar2.f48522zurt = -1;
                    toqVar3.f48522zurt = -1;
                    toqVar2.f2653s = 0;
                    toqVar2.setMarginStart(hb(C5049g.q.uv));
                    ((ViewGroup.MarginLayoutParams) toqVar2).topMargin = hb(C5049g.q.vddr);
                    toqVar3.setMarginStart(hb(C5049g.q.brv));
                    toqVar2.setMarginEnd(0);
                    toqVar3.setMarginEnd(0);
                } else {
                    toqVar5.f48522zurt = 0;
                    toqVar4.f48522zurt = 0;
                    toqVar6.f48522zurt = 0;
                    toqVar5.f2643i = -1;
                    toqVar4.f2643i = -1;
                    toqVar6.f2643i = -1;
                    toqVar5.setMarginStart(0);
                    toqVar4.setMarginStart(0);
                    toqVar6.setMarginStart(0);
                    toqVar5.setMarginEnd(hb(C5049g.q.kjd));
                    toqVar4.setMarginEnd(hb(C5049g.q.eklw));
                    toqVar6.setMarginEnd(hb(C5049g.q.koj));
                    toqVar2.f48522zurt = 0;
                    toqVar3.f48522zurt = 0;
                    toqVar2.f2643i = -1;
                    toqVar3.f2643i = -1;
                    toqVar2.f2653s = 0;
                    toqVar2.setMarginStart(0);
                    ((ViewGroup.MarginLayoutParams) toqVar2).topMargin = hb(C5049g.q.vddr);
                    toqVar3.setMarginStart(0);
                    toqVar2.setMarginEnd(hb(C5049g.q.a8p6));
                    toqVar3.setMarginEnd(hb(C5049g.q.verb));
                }
                this.ad.setLayoutParams(toqVar5);
                this.am.setLayoutParams(toqVar4);
                this.ay.setLayoutParams(toqVar6);
                this.ad.setTextSize(0, hb(C5049g.q.k4jz));
                this.am.setTextSize(0, hb(C5049g.q.vc));
                this.ay.setTextSize(0, hb(C5049g.q.owi));
                this.ad.setTypeface(this.tlhn);
                this.am.setTypeface(this.tlhn);
                this.ay.setTypeface(this.tgs);
                this.ad.setLetterSpacing(0.03f);
                this.am.setLetterSpacing(0.03f);
            }
            this.aj.setLayoutParams(toqVar2);
            this.be.setLayoutParams(toqVar);
            this.bq.setLayoutParams(toqVar3);
            this.am.setTextColor(this.bd.qrj());
            this.ad.setTextColor(this.bd.qrj());
            this.ay.setTextColor(this.bd.qrj());
            if (this.bd.eqxt() == 2) {
                toqVar.f2643i = 0;
                toqVar.f48522zurt = 0;
            } else if (this.bd.eqxt() == 1) {
                toqVar.f2643i = 0;
                toqVar.f48522zurt = -1;
            } else {
                toqVar.f48522zurt = 0;
                toqVar.f2643i = -1;
            }
            this.be.setLayoutParams(toqVar);
        }
        this.am.setText(C6064q.m22334k(this.bl.getString(this.bg ? C5049g.s.f29045b : C5049g.s.f71789y9n)));
        this.ad.setText(C6064q.m22334k(this.bl.getString(C5049g.s.f71765r8s8)).toUpperCase());
        TextView textView = this.ad;
        C7230k c7230k = this.as;
        Context context = this.bl;
        textView.setContentDescription(c7230k.format(context, context.getString(C5049g.s.f71744m4)));
        TextView textView2 = this.ay;
        C7230k c7230k2 = this.as;
        Context context2 = this.bl;
        textView2.setText(c7230k2.format(context2, context2.getString(C5049g.s.f71776v0af)).toUpperCase());
    }

    @Override // com.miui.clock.zy.n7h
    public AbstractC5074q getClockStyleInfo() {
        return this.bd;
    }

    @Override // com.miui.clock.zy.n7h
    public int getGalleryGravity() {
        AbstractC5064q abstractC5064q = this.bd;
        if (abstractC5064q == null || abstractC5064q.eqxt() == 1) {
            return androidx.core.view.qrj.f50865toq;
        }
        if (this.bd.eqxt() == 2) {
            return 1;
        }
        return this.bd.eqxt() == 3 ? androidx.core.view.qrj.f50866zy : androidx.core.view.qrj.f50865toq;
    }

    @Override // com.miui.clock.zy.n7h
    public int getMagazineColor() {
        AbstractC5064q abstractC5064q = this.bd;
        if (abstractC5064q != null) {
            return gcp.toq.m22345k(abstractC5064q.m17726s(), 0.6f);
        }
        return 0;
    }

    @Override // com.miui.clock.zy.n7h
    public int getNotificationClockBottom() {
        return this.ac ? hb(C5049g.q.zalf) : hb(C5049g.q.ebaq);
    }

    @Override // com.miui.clock.zy.n7h
    public int getNotificationRelativePosition() {
        AbstractC5064q abstractC5064q;
        int i2 = getResources().getConfiguration().orientation;
        if (!C6062n.f35046q || i2 != 2 || (abstractC5064q = this.bd) == null) {
            return 1;
        }
        if (abstractC5064q.eqxt() == 1) {
            return 2;
        }
        return this.bd.eqxt() == 3 ? 3 : 1;
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.ad = (TextView) findViewById(C5049g.g.f28948i);
        this.ay = (TextView) findViewById(C5049g.g.f70996gvn7);
        this.am = (TextView) findViewById(C5049g.g.f70991fu4);
        this.bs = findViewById(C5049g.g.f71065x9kr);
        this.k0 = findViewById(C5049g.g.f71069yl);
        this.ar = findViewById(C5049g.g.f70965bap7);
        this.bc = (Space) findViewById(C5049g.g.f71020lvui);
        this.bu = (Space) findViewById(C5049g.g.f71014ktq);
        this.be = (ViewGroup) findViewById(C5049g.g.f28963y);
        this.aj = (ViewGroup) findViewById(C5049g.g.f28958s);
        this.tlhn = Typeface.create("miclock-chamberi-display-semibold", 0);
        this.w97r = Typeface.create("miclock-chamberi-display-semibold-italic", 0);
        this.tgs = Typeface.create("miclock-qinghe-75w", 0);
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockPalette(int i2, boolean z2, Map<String, Integer> map, boolean z3) {
        String str;
        this.yl25 = i2;
        this.zmmu = z2;
        this.sk1t = map;
        this.dy = z3;
        if (map != null) {
            str = "secondary30=" + map.get("secondary30");
        } else {
            str = "null";
        }
        Log.d("ClockPalette", "setClockPalette: type = " + i2 + ", textDark = " + z2 + ", palette = " + str);
        AbstractC5064q abstractC5064q = this.bd;
        if (abstractC5064q == null || !abstractC5064q.cdj() || C6062n.x2(this.bl)) {
            return;
        }
        if (C6062n.m22317h(this.bl)) {
            this.bd.gvn7(-1);
            int iQrj = z2 ? (map == null || map.get("neutral-variant30") == null) ? this.bd.qrj() : map.get("neutral-variant30").intValue() : Color.parseColor("#FFABABAB");
            int iIntValue = z2 ? (map == null || map.get("secondary70") == null) ? iQrj : map.get("secondary70").intValue() : Color.parseColor("#FFBEBEBE");
            this.bd.m17727t(iQrj);
            this.bd.fu4(iIntValue);
            if (AbstractC5074q.m17719h(this.bd.d2ok())) {
                this.bd.gvn7(iIntValue);
            } else {
                if (!this.bd.t8r()) {
                    C6065s.f7l8(this, hb(C5049g.q.mete));
                }
                C6065s.m22341p(this.be, z2, iQrj, this.bd.qrj());
            }
            this.bd.m17728z(iIntValue);
        } else {
            this.bd.gvn7(!z2 ? -1 : (map == null || map.get("secondary30") == null) ? this.bd.qrj() : map.get("secondary30").intValue());
        }
        this.bd.fti(z2 ? (map == null || map.get("secondary30") == null) ? this.bd.qrj() : map.get("secondary30").intValue() : -1);
        fti();
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockStyleInfo(AbstractC5074q abstractC5074q) {
        this.bd = (AbstractC5064q) abstractC5074q;
        cdj();
        fti();
    }

    @Override // com.miui.clock.zy.n7h
    public void t8r(boolean z2) {
        super.t8r(z2);
        if (z2) {
            cdj();
        } else {
            setClockPalette(this.yl25, this.zmmu, this.sk1t, this.dy);
        }
    }

    public MiuiMagazineABase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
