package com.miui.clock.magazine;

import android.content.Context;
import android.graphics.Color;
import android.icu.text.SimpleDateFormat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.miui.clock.C5049g;
import com.miui.clock.MiuiGalleryBaseClock;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.EnumC5072n;
import gcp.C6062n;
import gcp.C6064q;
import gcp.C6065s;
import gcp.C6066y;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import miuix.pickerwidget.date.C7230k;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiMagazineBBase extends MiuiGalleryBaseClock {
    private TextView ad;
    private f7l8 aj;
    private TextView am;
    protected Map<String, Integer> ar;
    private TextView ay;
    protected boolean bc;
    protected ViewGroup be;
    protected int bs;
    protected boolean k0;

    /* JADX INFO: renamed from: com.miui.clock.magazine.MiuiMagazineBBase$k */
    static /* synthetic */ class C5058k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f29158k;

        static {
            int[] iArr = new int[EnumC5072n.values().length];
            f29158k = iArr;
            try {
                iArr[EnumC5072n.FULL_DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29158k[EnumC5072n.FULL_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29158k[EnumC5072n.FULL_WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29158k[EnumC5072n.CLOCK_CONTAINER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public MiuiMagazineBBase(Context context) {
        super(context);
    }

    @Override // com.miui.clock.zy.n7h
    public void cdj() {
        f7l8 f7l8Var = this.aj;
        if (f7l8Var == null) {
            return;
        }
        if (f7l8Var.cdj() && C6062n.m22317h(this.bl) && !C6062n.x2(this.bl)) {
            return;
        }
        C6065s.toq(this);
        C6065s.zy(this.be);
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        int i2 = C5058k.f29158k[enumC5072n.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? super.f7l8(enumC5072n) : this.be : this.ay : this.am : this.ad;
    }

    @Override // com.miui.clock.zy.n7h
    public void fti() {
        this.as.setTimeInMillis(System.currentTimeMillis());
        if (this.aj != null) {
            this.am.setText(C6064q.m22334k(this.bl.getString(this.bg ? C5049g.s.f29045b : C5049g.s.f71789y9n)));
            this.ad.setText(C6064q.m22334k(this.bl.getString(C5049g.s.f71765r8s8)).toUpperCase());
            TextView textView = this.ad;
            C7230k c7230k = this.as;
            Context context = this.bl;
            textView.setContentDescription(c7230k.format(context, context.getString(C5049g.s.f71744m4)));
            this.ay.setText(new SimpleDateFormat("EE", Locale.US).format(new Date()).toUpperCase());
            TextView textView2 = this.ay;
            C7230k c7230k2 = this.as;
            Context context2 = this.bl;
            textView2.setContentDescription(c7230k2.format(context2, context2.getString(C5049g.s.f71776v0af)));
            this.ad.setTextColor(this.aj.qrj());
            this.ay.setTextColor(this.aj.qrj());
            this.am.setTextColor(this.aj.qrj());
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.ad.getLayoutParams();
            if (!C6062n.qrj() || C6062n.m22322s(this.bl)) {
                TextView textView3 = this.am;
                int i2 = C5049g.q.ie;
                textView3.setTextSize(0, hb(i2));
                this.ad.setTextSize(0, hb(i2));
                this.ay.setTextSize(0, hb(i2));
                layoutParams.setMarginEnd(hb(C5049g.q.lg4k));
            } else {
                TextView textView4 = this.am;
                int i3 = C5049g.q.jog;
                textView4.setTextSize(0, hb(i3));
                this.ad.setTextSize(0, hb(i3));
                this.ay.setTextSize(0, hb(i3));
                layoutParams.setMarginEnd(hb(C5049g.q.a3dw));
            }
            this.ad.setLayoutParams(layoutParams);
        }
    }

    @Override // com.miui.clock.zy.n7h
    public AbstractC5074q getClockStyleInfo() {
        return this.aj;
    }

    @Override // com.miui.clock.zy.n7h
    public int getMagazineColor() {
        f7l8 f7l8Var = this.aj;
        if (f7l8Var != null) {
            return gcp.toq.m22345k(f7l8Var.m17726s(), 0.6f);
        }
        return 0;
    }

    @Override // com.miui.clock.zy.n7h
    public int getNotificationClockBottom() {
        return this.ac ? hb(C5049g.q.ffy) : hb(C5049g.q.aq2a);
    }

    @Override // com.miui.clock.zy.n7h
    public int mcp(boolean z2) {
        return ((!C6062n.qrj() || C6062n.m22322s(this.bl)) ? hb(C5049g.q.x3b) : hb(C5049g.q.zt)) + hb(C5049g.q.ydj3) + hb(C5049g.q.zi4o);
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.ad = (TextView) findViewById(C5049g.g.f28948i);
        this.ay = (TextView) findViewById(C5049g.g.f70996gvn7);
        this.am = (TextView) findViewById(C5049g.g.f70991fu4);
        this.be = (ViewGroup) findViewById(C5049g.g.f28963y);
        yz();
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockPalette(int i2, boolean z2, Map<String, Integer> map, boolean z3) {
        String str;
        this.bs = i2;
        this.k0 = z2;
        this.ar = map;
        this.bc = z3;
        if (map != null) {
            str = "secondary30=" + map.get("secondary30");
        } else {
            str = "null";
        }
        Log.d("ClockPalette", "setClockPalette: type = " + i2 + ", textDark = " + z2 + ", palette = " + str);
        f7l8 f7l8Var = this.aj;
        if (f7l8Var == null || !f7l8Var.cdj() || C6062n.x2(this.bl)) {
            return;
        }
        if (C6062n.m22317h(this.bl)) {
            this.aj.gvn7(-1);
            int iQrj = z2 ? (map == null || map.get("neutral-variant30") == null) ? this.aj.qrj() : map.get("neutral-variant30").intValue() : Color.parseColor("#FFABABAB");
            int iIntValue = z2 ? (map == null || map.get("secondary70") == null) ? iQrj : map.get("secondary70").intValue() : Color.parseColor("#FFBEBEBE");
            this.aj.m17727t(iQrj);
            this.aj.fu4(iIntValue);
            if (AbstractC5074q.m17719h(this.aj.eqxt())) {
                this.aj.gvn7(iIntValue);
            } else {
                if (!this.aj.t8r()) {
                    C6065s.f7l8(this, hb(C5049g.q.d6od));
                }
                C6065s.m22341p(this.be, z2, iQrj, this.aj.qrj());
            }
            this.aj.m17728z(iIntValue);
        } else {
            int iQrj2 = !z2 ? -1 : (map == null || map.get("secondary30") == null) ? this.aj.qrj() : map.get("secondary30").intValue();
            if (AbstractC5074q.m17719h(this.aj.eqxt())) {
                this.aj.gvn7(C6066y.m22346k(iQrj2));
            } else {
                this.aj.gvn7(iQrj2);
            }
        }
        this.aj.fti(z2 ? (map == null || map.get("secondary30") == null) ? this.aj.qrj() : map.get("secondary30").intValue() : -1);
        fti();
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockStyleInfo(AbstractC5074q abstractC5074q) {
        this.aj = (f7l8) abstractC5074q;
        cdj();
        fti();
    }

    @Override // com.miui.clock.zy.n7h
    public void t8r(boolean z2) {
        super.t8r(z2);
        if (z2) {
            cdj();
        } else {
            setClockPalette(this.bs, this.k0, this.ar, this.bc);
        }
    }

    public MiuiMagazineBBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
