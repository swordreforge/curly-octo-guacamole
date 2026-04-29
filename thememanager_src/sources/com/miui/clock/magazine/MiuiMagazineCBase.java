package com.miui.clock.magazine;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import com.miui.clock.C5049g;
import com.miui.clock.MiuiGalleryBaseClock;
import com.miui.clock.module.AbstractC5074q;
import gcp.C6062n;
import gcp.C6064q;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MiuiMagazineCBase extends MiuiGalleryBaseClock {
    protected int[] ad;
    protected boolean aj;
    protected final String[] am;
    protected AbstractC5063p ay;
    protected int be;
    protected Map<String, Integer> bs;
    protected boolean k0;

    public MiuiMagazineCBase(Context context) {
        super(context);
        this.ad = new int[4];
        this.am = new String[]{"ss01", "ss02", "ss03", "ss04", "ss05", "ss06", "ss07", "ss08", "ss09", "ss10"};
    }

    @Override // com.miui.clock.zy.n7h
    public void fti() {
        this.as.setTimeInMillis(System.currentTimeMillis());
        String strM22334k = C6064q.m22334k(this.bg ? "HHmm" : "hhmm");
        for (int i2 = 0; i2 < strM22334k.length(); i2++) {
            this.ad[i2] = Integer.parseInt(String.valueOf(strM22334k.charAt(i2)));
        }
    }

    @Override // com.miui.clock.zy.n7h
    public AbstractC5074q getClockStyleInfo() {
        return this.ay;
    }

    protected int getMagazineCNotificationMagazineY() {
        return hb(C5049g.q.cp) + hb(C5049g.q.xo) + hb(C5049g.q.ybb);
    }

    @Override // com.miui.clock.zy.n7h
    public int getMagazineColor() {
        AbstractC5063p abstractC5063p = this.ay;
        if (abstractC5063p != null) {
            return gcp.toq.m22345k(abstractC5063p.m17726s(), 0.6f);
        }
        return 0;
    }

    @Override // com.miui.clock.zy.n7h
    public int getNotificationClockBottom() {
        return this.ac ? hb(C5049g.q.m4ll) : hb(C5049g.q.fjcj);
    }

    @Override // com.miui.clock.zy.n7h
    public int getNotificationRelativePosition() {
        return (C6062n.f35046q && getResources().getConfiguration().orientation == 2) ? 2 : 1;
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockPalette(int i2, boolean z2, Map<String, Integer> map, boolean z3) {
        String str;
        int iIntValue;
        this.be = i2;
        this.aj = z2;
        this.bs = map;
        this.k0 = z3;
        if (map != null) {
            str = "secondary98=" + map.get("secondary98") + ",secondary20=" + map.get("secondary20") + ",secondary85=" + map.get("secondary85") + ",secondary40=" + map.get("secondary40");
        } else {
            str = "null";
        }
        Log.d("ClockPalette", "setClockPalette: type = " + i2 + ", textDark = " + z2 + ", palette = " + str);
        if (this.ay == null || C6062n.x2(this.bl) || map == null) {
            return;
        }
        if (this.ay.cdj()) {
            if (C6062n.m22317h(this.bl)) {
                int iIntValue2 = z2 ? map.get("neutral-variant30") != null ? map.get("neutral-variant30").intValue() : this.ay.qrj() : Color.parseColor("#FFABABAB");
                int iIntValue3 = z2 ? map.get("secondary70") != null ? map.get("secondary70").intValue() : iIntValue2 : Color.parseColor("#FFBEBEBE");
                this.ay.gvn7(-1);
                this.ay.m17727t(iIntValue2);
                this.ay.fu4(iIntValue3);
                if (AbstractC5074q.m17719h(this.ay.d2ok())) {
                    this.ay.gvn7(iIntValue3);
                }
            } else {
                this.ay.gvn7(!z2 ? map.get("secondary98") != null ? map.get("secondary98").intValue() : this.ay.qrj() : map.get("secondary20") != null ? map.get("secondary20").intValue() : this.ay.qrj());
            }
            this.ay.fti(!z2 ? map.get("secondary98") != null ? map.get("secondary98").intValue() : this.ay.qrj() : map.get("secondary20") != null ? map.get("secondary20").intValue() : this.ay.qrj());
        }
        if (this.ay.ki()) {
            if (C6062n.m22317h(this.bl)) {
                iIntValue = -8355712;
                int iIntValue4 = z2 ? map.get("neutral-variant30") != null ? map.get("neutral-variant30").intValue() : this.ay.qrj() : Color.parseColor("#FFABABAB");
                int iIntValue5 = z2 ? map.get("secondary70") != null ? map.get("secondary70").intValue() : iIntValue4 : Color.parseColor("#FFBEBEBE");
                if (iIntValue4 != this.ay.m17721g()) {
                    this.ay.m17727t(iIntValue4);
                    this.ay.fu4(iIntValue5);
                }
            } else {
                iIntValue = !z2 ? map.get("secondary85") != null ? map.get("secondary85").intValue() : this.ay.n7h() : map.get("secondary40") != null ? map.get("secondary40").intValue() : this.ay.n7h();
            }
            this.ay.d3(iIntValue);
        }
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockStyleInfo(AbstractC5074q abstractC5074q) {
        this.ay = (AbstractC5063p) abstractC5074q;
        fti();
    }

    protected int y9n(float f2, boolean z2) {
        return hb(C5049g.q.p996);
    }

    public MiuiMagazineCBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ad = new int[4];
        this.am = new String[]{"ss01", "ss02", "ss03", "ss04", "ss05", "ss06", "ss07", "ss08", "ss09", "ss10"};
    }
}
