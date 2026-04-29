package com.miui.clock.graffiti;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.Guideline;
import com.miui.clock.C5049g;
import com.miui.clock.ConstraintLayoutAccessibilityHelper;
import com.miui.clock.module.AbstractC5074q;
import gcp.C6062n;
import gcp.C6064q;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiGraffitiAodClockView extends ConstraintLayout {
    private ImageView ac;
    private ImageView ad;
    private ImageView aj;
    private ImageView am;
    private ConstraintLayoutAccessibilityHelper ar;
    private boolean as;
    private Guideline ax;
    private ImageView ay;
    protected Calendar az;
    private Space ba;
    private ConstraintLayoutAccessibilityHelper bc;
    private ImageView be;
    private boolean bg;
    private C5051q bl;
    private ImageView bq;
    private ImageView bs;
    private boolean bu;
    private ConstraintLayoutAccessibilityHelper k0;

    public MiuiGraffitiAodClockView(Context context) {
        super(context);
    }

    private int hb(int i2) {
        return (int) (getResources().getDimensionPixelSize(i2) * C6062n.m22318k(getContext()));
    }

    /* JADX INFO: renamed from: j */
    private void m17641j() {
        Constraints.C0392k c0392k = new Constraints.C0392k(0, 0);
        Constraints.C0392k c0392k2 = new Constraints.C0392k(0, 0);
        Constraints.C0392k c0392k3 = new Constraints.C0392k(0, 0);
        this.bs.setVisibility(this.as ? 0 : 8);
        if (this.as) {
            c0392k.f2648n = this.ax.getId();
            c0392k.f2653s = this.ba.getId();
            ((ViewGroup.MarginLayoutParams) c0392k).width = hb(C5049g.q.f71655wlev);
            ((ViewGroup.MarginLayoutParams) c0392k).height = hb(C5049g.q.f71577lh);
            c0392k.setMargins(hb(C5049g.q.f71493bap7), hb(C5049g.q.f71545h4b), 0, 0);
        }
        c0392k2.f2653s = this.ba.getId();
        c0392k2.f2648n = this.ax.getId();
        ((ViewGroup.MarginLayoutParams) c0392k2).width = hb(this.as ? C5049g.q.f71525ew : C5049g.q.f71623r25n);
        ((ViewGroup.MarginLayoutParams) c0392k2).height = hb(this.as ? C5049g.q.f71586m58i : C5049g.q.f71606o05);
        c0392k2.setMargins(hb(this.as ? C5049g.q.f71492b9ub : C5049g.q.f71508cnbm), hb(this.as ? C5049g.q.f71600nme : C5049g.q.f71491b8), 0, 0);
        c0392k3.f2653s = this.ba.getId();
        c0392k3.f2648n = this.ax.getId();
        ((ViewGroup.MarginLayoutParams) c0392k3).width = hb(this.as ? C5049g.q.f71611oki : C5049g.q.f71542gcp);
        ((ViewGroup.MarginLayoutParams) c0392k3).height = hb(this.as ? C5049g.q.f71518e5 : C5049g.q.f71538ga);
        c0392k3.setMargins(hb(this.as ? C5049g.q.f71651vy : C5049g.q.f71517dxef), hb(this.as ? C5049g.q.f71583lw : C5049g.q.f71485a5id), 0, 0);
        this.bs.setLayoutParams(c0392k);
        this.aj.setLayoutParams(c0392k2);
        this.be.setLayoutParams(c0392k3);
    }

    /* JADX INFO: renamed from: m */
    private void m17642m() {
        Constraints.C0392k c0392k = new Constraints.C0392k(0, 0);
        Constraints.C0392k c0392k2 = new Constraints.C0392k(0, 0);
        c0392k.f2653s = this.ba.getId();
        c0392k.f2657y = this.ax.getId();
        ((ViewGroup.MarginLayoutParams) c0392k).width = hb(this.as ? C5049g.q.f71536g0ad : C5049g.q.f71657wt);
        ((ViewGroup.MarginLayoutParams) c0392k).height = hb(this.as ? C5049g.q.f71510cyoe : C5049g.q.f71574l05);
        c0392k.setMargins(0, hb(this.as ? C5049g.q.f71522el : C5049g.q.f71680zff0), hb(this.as ? C5049g.q.f71672yp31 : C5049g.q.f71624r6ty), 0);
        c0392k2.f2653s = this.ba.getId();
        c0392k2.f2657y = this.ax.getId();
        ((ViewGroup.MarginLayoutParams) c0392k2).width = hb(this.as ? C5049g.q.f71627rp : C5049g.q.f71674yw);
        ((ViewGroup.MarginLayoutParams) c0392k2).height = hb(this.as ? C5049g.q.f71566kiv : C5049g.q.f71639uf);
        c0392k2.setMargins(0, hb(this.as ? C5049g.q.f71608o5 : C5049g.q.f71520ec), hb(this.as ? C5049g.q.f71496bih : C5049g.q.f71678z4t), 0);
        this.bq.setLayoutParams(c0392k);
        this.ac.setLayoutParams(c0392k2);
    }

    /* JADX INFO: renamed from: o */
    private void m17643o() {
        Constraints.C0392k c0392k = new Constraints.C0392k(0, 0);
        Constraints.C0392k c0392k2 = new Constraints.C0392k(0, 0);
        Constraints.C0392k c0392k3 = new Constraints.C0392k(0, 0);
        c0392k.f2648n = this.ba.getId();
        c0392k.f2657y = this.ba.getId();
        c0392k.f2653s = this.ba.getId();
        ((ViewGroup.MarginLayoutParams) c0392k).width = hb(C5049g.q.f29040w);
        ((ViewGroup.MarginLayoutParams) c0392k).height = hb(C5049g.q.f71557ix);
        c0392k.setMargins(0, hb(C5049g.q.f71572kx3), 0, 0);
        c0392k2.f2657y = this.ax.getId();
        c0392k2.f2653s = this.ba.getId();
        ((ViewGroup.MarginLayoutParams) c0392k2).width = hb(C5049g.q.f71637u38j);
        ((ViewGroup.MarginLayoutParams) c0392k2).height = hb(C5049g.q.f71584m2t);
        c0392k3.f2648n = this.ad.getId();
        c0392k3.f2653s = this.ba.getId();
        ((ViewGroup.MarginLayoutParams) c0392k3).width = hb(C5049g.q.f71603nnh);
        ((ViewGroup.MarginLayoutParams) c0392k3).height = hb(C5049g.q.f71617ps);
        c0392k3.setMargins(hb(C5049g.q.f71646v5yj), hb(C5049g.q.f71626ra), 0, 0);
        this.ad.setLayoutParams(c0392k);
        this.am.setLayoutParams(c0392k2);
        this.ay.setLayoutParams(c0392k3);
    }

    private void setClockStyle(int i2) {
        this.as = i2 == 1;
        m17642m();
        m17643o();
        m17641j();
    }

    public boolean ek5k() {
        return this.bu;
    }

    public void fn3e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.az = Calendar.getInstance(TimeZone.getTimeZone(str));
        fti();
    }

    public void fti() {
        int i2;
        this.bg = C6064q.zy(getContext());
        this.az.setTimeInMillis(System.currentTimeMillis());
        boolean z2 = true;
        int i3 = this.az.get(2) + 1;
        int i4 = this.az.get(5);
        int i5 = this.az.get(7);
        int i6 = this.az.get(12);
        if (this.bg) {
            i2 = this.az.get(11);
        } else {
            i2 = this.az.get(10);
            if (i2 == 0 && this.az.get(9) == 1) {
                i2 = 12;
            }
        }
        if (!this.bl.ni7() && this.bu) {
            z2 = false;
        }
        int iM22345k = gcp.toq.m22345k(this.bl.qrj(), 0.6f);
        Drawable drawable = getResources().getDrawable(this.as ? C5050k.f29103n[i5] : C5050k.f29101g[i5]);
        drawable.setTint(z2 ? iM22345k : this.bl.qrj());
        this.ac.setImageDrawable(drawable);
        Drawable drawable2 = getResources().getDrawable(C5050k.f71854zy[i2]);
        drawable2.setTint(this.bl.qrj());
        this.am.setImageDrawable(drawable2);
        Drawable drawable3 = getResources().getDrawable(C5050k.f29105q[i6]);
        drawable3.setTint(this.bl.qrj());
        this.ay.setImageDrawable(drawable3);
        Drawable drawable4 = getResources().getDrawable(this.as ? C5050k.f71852f7l8[i3] : C5050k.f29107y[i3]);
        drawable4.setTint(z2 ? iM22345k : this.bl.qrj());
        this.aj.setImageDrawable(drawable4);
        Drawable drawable5 = getResources().getDrawable(this.as ? C5050k.f29106s[i4] : C5050k.f29104p[i4]);
        if (!z2) {
            iM22345k = this.bl.qrj();
        }
        drawable5.setTint(iM22345k);
        this.be.setImageDrawable(drawable5);
        Drawable drawable6 = getResources().getDrawable(C5049g.n.jyr);
        drawable6.setTint(this.bl.qrj());
        this.ad.setImageDrawable(drawable6);
        Drawable drawable7 = getResources().getDrawable(this.as ? C5049g.n.b972 : C5049g.n.jp);
        drawable7.setTint(this.bl.qrj());
        this.bq.setImageDrawable(drawable7);
        this.bq.setVisibility(z2 ? 4 : 0);
        if (this.as) {
            Drawable drawable8 = getResources().getDrawable(C5049g.n.f71210pnt2);
            drawable8.setTint(this.bl.qrj());
            this.bs.setImageDrawable(drawable8);
            this.bs.setVisibility(z2 ? 4 : 0);
        }
        this.k0.setContentDescription(new SimpleDateFormat(getResources().getString(C5049g.s.f71710etdu)).format(this.az.getTime()));
        this.bc.setContentDescription(miuix.pickerwidget.date.zy.m26303k(getContext(), System.currentTimeMillis(), (this.bg ? 32 : 16) | 12 | 64));
        this.ar.setContentDescription(new SimpleDateFormat(getResources().getString(C5049g.s.f71699cfr)).format(this.az.getTime()));
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C5051q c5051q = this.bl;
        if (c5051q != null) {
            setClockStyleInfo(c5051q);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.az = Calendar.getInstance();
        this.ax = (Guideline) findViewById(C5049g.g.f71001hyr);
        this.ba = (Space) findViewById(C5049g.g.f71064x2);
        this.bq = (ImageView) findViewById(C5049g.g.f70993ga);
        this.ac = (ImageView) findViewById(C5049g.g.f71060wlev);
        this.ad = (ImageView) findViewById(C5049g.g.f70999h7am);
        this.am = (ImageView) findViewById(C5049g.g.f71022mbx);
        this.ay = (ImageView) findViewById(C5049g.g.f71007jbh);
        this.be = (ImageView) findViewById(C5049g.g.f71035oc);
        this.aj = (ImageView) findViewById(C5049g.g.f70976d2ok);
        this.bs = (ImageView) findViewById(C5049g.g.f70985eqxt);
        this.k0 = (ConstraintLayoutAccessibilityHelper) findViewById(C5049g.g.f70979dd);
        this.ar = (ConstraintLayoutAccessibilityHelper) findViewById(C5049g.g.f71016lh);
        this.bc = (ConstraintLayoutAccessibilityHelper) findViewById(C5049g.g.f70975cv06);
    }

    public void setClockStyleInfo(AbstractC5074q abstractC5074q) {
        C5051q c5051q = (C5051q) abstractC5074q;
        this.bl = c5051q;
        setClockStyle(c5051q.eqxt());
        fti();
    }

    public void setWallpaperSupportDepth(boolean z2) {
        this.bu = z2;
    }

    public MiuiGraffitiAodClockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MiuiGraffitiAodClockView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
