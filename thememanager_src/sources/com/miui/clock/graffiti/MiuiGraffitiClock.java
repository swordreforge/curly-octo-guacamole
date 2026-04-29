package com.miui.clock.graffiti;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.miui.clock.C5049g;
import com.miui.clock.MiuiGalleryBaseClock;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.EnumC5072n;
import gcp.C6062n;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiGraffitiClock extends MiuiGalleryBaseClock {
    private C5051q ad;
    private Map<String, Integer> aj;
    private MiuiGraffitiClockView am;
    private int ay;
    private boolean be;
    private boolean bs;

    public MiuiGraffitiClock(Context context) {
        super(context);
    }

    private void y9n() {
        ((Guideline) this.am.findViewById(C5049g.g.f71001hyr)).setGuidelinePercent(0.5f);
        ConstraintLayout.toq toqVar = new ConstraintLayout.toq(-1, -2);
        toqVar.setMargins(0, (int) (getResources().getDimensionPixelSize(C5049g.q.f71556imd) * C6062n.m22318k(getContext())), 0, 0);
        toqVar.f2653s = 0;
        this.am.setLayoutParams(toqVar);
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        return enumC5072n == EnumC5072n.ALL_VIEW ? this.am : enumC5072n == EnumC5072n.CLOCK_CONTAINER ? this.am : super.f7l8(enumC5072n);
    }

    @Override // com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public void fn3e(String str) {
        this.am.fn3e(str);
    }

    @Override // com.miui.clock.zy.n7h
    public void fti() {
        this.am.fti();
    }

    @Override // com.miui.clock.zy.n7h
    public AbstractC5074q getClockStyleInfo() {
        return this.ad;
    }

    @Override // com.miui.clock.zy.n7h
    public int getGalleryGravity() {
        return 1;
    }

    @Override // com.miui.clock.zy.n7h
    public int getMagazineColor() {
        C5051q c5051q = this.ad;
        if (c5051q != null) {
            return gcp.toq.m22345k(c5051q.qrj(), 0.6f);
        }
        return 0;
    }

    @Override // com.miui.clock.zy.n7h
    public int getNotificationClockBottom() {
        return this.ac ? hb(C5049g.q.w6w4) : hb(C5049g.q.p68f);
    }

    @Override // com.miui.clock.zy.n7h
    public int mcp(boolean z2) {
        return hb(C5049g.q.f71526exv8);
    }

    @Override // com.miui.clock.MiuiBaseClock2, android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        y9n();
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.am = (MiuiGraffitiClockView) findViewById(C5049g.g.f71046t8r);
        y9n();
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockPalette(int i2, boolean z2, Map<String, Integer> map, boolean z3) {
        String str;
        int iQrj;
        this.ay = i2;
        this.be = z2;
        this.aj = map;
        this.bs = z3;
        if (map != null) {
            str = "primary7=" + map.get("primary7") + ",primary18=" + map.get("primary18") + ",secondary60=" + map.get("secondary60");
        } else {
            str = "null";
        }
        Log.d("MiuiGraffitiClock ClockPalette", "setClockPalette: type = " + i2 + ", textDark = " + z2 + ", palette = " + str + ", mWallpaperSupportDepth = " + this.bs);
        C5051q c5051q = this.ad;
        if (c5051q != null) {
            if (c5051q.cdj()) {
                if (this.bs) {
                    iQrj = i2 == 1 ? (map == null || map.get("primary7") == null) ? this.ad.qrj() : map.get("primary7").intValue() : i2 == 2 ? (map == null || map.get("primary18") == null) ? this.ad.qrj() : map.get("primary18").intValue() : (map == null || map.get("secondary60") == null) ? this.ad.qrj() : map.get("secondary60").intValue();
                    this.ad.fti(iQrj);
                } else {
                    int iQrj2 = !z2 ? (map == null || map.get("primary98") == null) ? this.ad.qrj() : map.get("primary98").intValue() : (map == null || map.get("primary20") == null) ? this.ad.qrj() : map.get("primary20").intValue();
                    this.ad.fti(i2 == 1 ? (map == null || map.get("primary7") == null) ? this.ad.qrj() : map.get("primary7").intValue() : i2 == 2 ? (map == null || map.get("primary18") == null) ? this.ad.qrj() : map.get("primary18").intValue() : (map == null || map.get("secondary60") == null) ? this.ad.qrj() : map.get("secondary60").intValue());
                    iQrj = iQrj2;
                }
                this.ad.gvn7(iQrj);
            }
            this.am.setWallpaperSupportDepth(z3);
            this.am.setClockStyleInfo(this.ad);
        }
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockStyleInfo(AbstractC5074q abstractC5074q) {
        C5051q c5051q = (C5051q) abstractC5074q;
        this.ad = c5051q;
        this.am.setClockStyleInfo(c5051q);
    }

    @Override // com.miui.clock.zy.n7h
    public void setWallpaperSupportDepth(boolean z2) {
        super.setWallpaperSupportDepth(z2);
        setClockPalette(this.ay, this.be, this.aj, z2);
    }

    public MiuiGraffitiClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MiuiGraffitiClock(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
