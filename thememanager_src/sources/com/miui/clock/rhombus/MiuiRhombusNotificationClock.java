package com.miui.clock.rhombus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0498q;
import com.miui.clock.C5049g;
import com.miui.clock.module.AbstractC5071k;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.EnumC5072n;
import gcp.C6062n;
import gcp.C6065s;
import gcp.ld6;
import java.util.Map;
import miuix.pickerwidget.date.C7230k;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiRhombusNotificationClock extends MiuiRhombusBase {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private boolean f72018ab;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private ViewGroup f72019bo;

    /* JADX INFO: renamed from: d */
    private ImageView f29275d;

    /* JADX INFO: renamed from: u */
    private TextView f29276u;

    /* JADX INFO: renamed from: v */
    private ViewGroup f29277v;

    /* JADX INFO: renamed from: w */
    private ViewGroup f29278w;

    /* JADX INFO: renamed from: com.miui.clock.rhombus.MiuiRhombusNotificationClock$k */
    static /* synthetic */ class C5087k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f29279k;

        static {
            int[] iArr = new int[EnumC5072n.values().length];
            f29279k = iArr;
            try {
                iArr[EnumC5072n.FULL_COLON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29279k[EnumC5072n.MAGAZINE_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29279k[EnumC5072n.FULL_DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public MiuiRhombusNotificationClock(Context context) {
        super(context);
        this.f72018ab = true;
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
        C6065s.zy(this.f29275d);
        C6065s.zy(this.f29276u);
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        int i2 = C5087k.f29279k[enumC5072n.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? super.f7l8(enumC5072n) : this.f29276u : this.f29278w : this.f29275d;
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, com.miui.clock.zy.n7h
    public void fti() {
        super.fti();
        if (this.f29250c == null) {
            return;
        }
        float f2 = 1.0f;
        if (C6062n.qrj() && !C6062n.m22322s(this.f29257k)) {
            f2 = 0.8f;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f29266t.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f29264r.getLayoutParams();
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f29258l.getLayoutParams();
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f29252f.getLayoutParams();
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.f29275d.getLayoutParams();
        if (this.f29255i.mo17701p() == AbstractC5071k.k.SKPupok) {
            layoutParams.height = (int) (this.f29255i.n7h()[this.f29268z[0]] * this.f29262p * f2 * 0.41f);
            layoutParams2.height = (int) (this.f29255i.n7h()[this.f29268z[1]] * this.f29262p * f2 * 0.41f);
            layoutParams3.height = (int) (this.f29255i.n7h()[this.f29268z[2]] * this.f29262p * f2 * 0.41f);
            layoutParams4.height = (int) (this.f29255i.n7h()[this.f29268z[3]] * this.f29262p * f2 * 0.41f);
            layoutParams5.height = (int) (this.f29255i.a9() * this.f29262p * f2 * 0.41f);
        } else {
            int iMo17704z = (int) (this.f29255i.mo17704z() * this.f29262p * f2);
            layoutParams.height = iMo17704z;
            layoutParams2.height = iMo17704z;
            layoutParams3.height = iMo17704z;
            layoutParams4.height = iMo17704z;
            layoutParams5.height = iMo17704z;
        }
        layoutParams2.setMarginEnd((int) (this.f29255i.mo17709i()[this.f29268z[1]] * this.f29262p * f2));
        layoutParams3.setMarginEnd((int) (this.f29255i.mo17709i()[this.f29268z[2]] * this.f29262p * f2));
        layoutParams2.setMarginStart((int) (this.f29255i.o1t() * this.f29262p * f2));
        layoutParams3.setMarginStart((int) (this.f29255i.o1t() * this.f29262p * f2));
        layoutParams4.setMarginStart((int) (this.f29255i.o1t() * this.f29262p * f2));
        layoutParams5.setMarginStart((int) (this.f29255i.o1t() * this.f29262p * f2));
        this.f29266t.setLayoutParams(layoutParams);
        this.f29264r.setLayoutParams(layoutParams2);
        this.f29258l.setLayoutParams(layoutParams3);
        this.f29252f.setLayoutParams(layoutParams4);
        this.f29275d.setLayoutParams(layoutParams5);
        TextView textView = this.f29276u;
        C7230k c7230k = this.f29260n;
        Context context = this.f29257k;
        textView.setText(c7230k.format(context, context.getString(C5049g.s.f71689a98o)));
        this.f29276u.setTextColor(this.f29250c.qrj());
        this.f29276u.setTextSize(0, m17737k(C5049g.q.a4ph));
        this.f29277v.setContentDescription(miuix.pickerwidget.date.zy.m26303k(this.f29257k, System.currentTimeMillis(), (this.f29253g ? 32 : 16) | 12 | 64));
        if (this.f29253g) {
            this.f29266t.setVisibility(0);
        } else {
            this.f29266t.setVisibility(this.f29268z[0] > 0 ? 0 : 8);
        }
        ((RelativeLayout.LayoutParams) this.f72019bo.getLayoutParams()).topMargin = m17737k(C5049g.q.km9o);
        ((RelativeLayout.LayoutParams) this.f29277v.getLayoutParams()).topMargin = m17737k(C5049g.q.li5y);
        this.f29266t.qrj(this.f29255i).m17546s(0.0f).ld6(0, 0).m17545p(0, 0).m17543h(this.f29250c.qrj()).n7h(this.f29268z[0]).m17544k();
        this.f29264r.qrj(this.f29255i).m17546s(0.0f).ld6(0, 0).m17545p(0, 0).m17543h(this.f29250c.qrj()).n7h(this.f29268z[1]).m17544k();
        this.f29258l.qrj(this.f29255i).m17546s(0.0f).ld6(0, 0).m17545p(0, 0).m17543h(this.f29250c.qrj()).n7h(this.f29268z[2]).m17544k();
        this.f29252f.qrj(this.f29255i).m17546s(0.0f).ld6(0, 0).m17545p(0, 0).m17543h(this.f29250c.qrj()).n7h(this.f29268z[3]).m17544k();
        this.f29275d.setImageDrawable(ld6.m22315k(C0498q.m2259s(getContext(), this.f29255i.jk()), this.f29250c.qrj()));
        ((RelativeLayout.LayoutParams) this.f29278w.getLayoutParams()).topMargin = m17737k(C5049g.q.zidq);
    }

    @Override // com.miui.clock.zy.n7h
    public int getMagazineColor() {
        toq toqVar = this.f29250c;
        if (toqVar != null) {
            return gcp.toq.m22345k(toqVar.qrj(), 0.6f);
        }
        return 0;
    }

    @Override // com.miui.clock.zy.n7h
    public int mcp(boolean z2) {
        return m17737k(C5049g.q.km9o) + m17737k(C5049g.q.krto) + m17737k(C5049g.q.li5y) + ((int) (this.f29255i.mo17704z() * this.f29262p * ((!C6062n.qrj() || C6062n.m22322s(this.f29257k)) ? 1.0f : 0.8f))) + m17737k(C5049g.q.zidq);
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f29276u = (TextView) findViewById(C5049g.g.f28948i);
        this.f72019bo = (ViewGroup) findViewById(C5049g.g.f28957r);
        this.f29277v = (ViewGroup) findViewById(C5049g.g.f70964b3e);
        this.f29275d = (ImageView) findViewById(C5049g.g.f71041qrj);
        this.f29278w = (ViewGroup) findViewById(C5049g.g.f71031nmn5);
        fti();
    }

    @Override // com.miui.clock.zy.n7h
    public void qrj(boolean z2) {
        this.f72018ab = !z2;
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, com.miui.clock.zy.n7h
    public void setClockPalette(int i2, boolean z2, Map<String, Integer> map, boolean z3) {
        super.setClockPalette(i2, z2, map, z3);
        if (this.f29250c == null || C6062n.x2(this.f29257k)) {
            return;
        }
        if (this.f29250c.cdj() && C6062n.m22317h(this.f29257k)) {
            int iM17721g = this.f29250c.m17721g();
            if (!this.f29250c.t8r()) {
                C6065s.f7l8(this, m17737k(C5049g.q.k2b8));
            }
            C6065s.m22341p(this.f29266t, z2, iM17721g, this.f29250c.qrj());
            C6065s.m22341p(this.f29264r, z2, iM17721g, this.f29250c.qrj());
            C6065s.m22341p(this.f29258l, z2, iM17721g, this.f29250c.qrj());
            C6065s.m22341p(this.f29252f, z2, iM17721g, this.f29250c.qrj());
            C6065s.m22341p(this.f29275d, z2, iM17721g, this.f29250c.qrj());
            C6065s.m22341p(this.f29276u, z2, iM17721g, this.f29250c.qrj());
        }
        fti();
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, com.miui.clock.zy.n7h
    public void setClockStyleInfo(AbstractC5074q abstractC5074q) {
        super.setClockStyleInfo(abstractC5074q);
        setClockStyle(this.f29250c.x9kr());
        cdj();
        fti();
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, com.miui.clock.zy.n7h
    public void setMagazineInfoVisible(boolean z2) {
        super.setMagazineInfoVisible(z2);
        this.f29251e = z2;
        this.f29278w.setVisibility(z2 ? 0 : 8);
        fti();
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

    public MiuiRhombusNotificationClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f72018ab = true;
    }
}
