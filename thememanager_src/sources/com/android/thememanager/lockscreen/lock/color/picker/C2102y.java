package com.android.thememanager.lockscreen.lock.color.picker;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.miui.clock.module.ClockBean;
import com.miui.lockscreeninfo.model.SignatureInfo;
import java.util.Map;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.color.picker.y */
/* JADX INFO: compiled from: MagazineAAutoColorPicker.kt */
/* JADX INFO: loaded from: classes2.dex */
public class C2102y extends AbstractC2097k {

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private final SignatureInfo f12368n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private final ClockBean f12369q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2102y(@InterfaceC7396q Context context, @InterfaceC7395n ClockBean clockBean, @InterfaceC7395n SignatureInfo signatureInfo) {
        super(context);
        d2ok.m23075h(context, "context");
        this.f12369q = clockBean;
        this.f12368n = signatureInfo;
    }

    @Override // com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public String mo8059k() {
        return "magazine_a";
    }

    @Override // com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k
    @InterfaceC7396q
    @hyr(31)
    public ColorData qrj(@InterfaceC7396q Bitmap wallpaper) {
        d2ok.m23075h(wallpaper, "wallpaper");
        int iZy = zy();
        int iMo8064s = mo8064s();
        String strF7l8 = f7l8(x2.CLOCK);
        String strF7l82 = f7l8(x2.MAGAZINE);
        boolean zM8062p = m8062p(wallpaper, strF7l8, iZy, iMo8064s);
        Map<String, Integer> mapM8063q = m8063q(wallpaper, strF7l8, iZy, iMo8064s);
        boolean zM8062p2 = m8062p(wallpaper, strF7l82, iZy, iMo8064s);
        Map<String, Integer> mapM8063q2 = m8063q(wallpaper, strF7l82, iZy, iMo8064s);
        Log.d("MagazineAAutoColorPicker", "pickColor isDarkClockArea=" + zM8062p + " isDarkSignatureArea=" + zM8062p2);
        return new ColorData(0, 0, 0, 0, !zM8062p, false, mapM8063q, !zM8062p2, mapM8063q2, 0, 559, null);
    }

    @Override // com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k
    /* JADX INFO: renamed from: s */
    protected int mo8064s() {
        SignatureInfo signatureInfo;
        if (x2() || (signatureInfo = this.f12368n) == null) {
            return -1;
        }
        return signatureInfo.getAlignment();
    }

    @Override // com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k
    protected int zy() {
        ClockBean clockBean;
        if (x2() || (clockBean = this.f12369q) == null) {
            return -1;
        }
        return clockBean.getStyle();
    }
}
