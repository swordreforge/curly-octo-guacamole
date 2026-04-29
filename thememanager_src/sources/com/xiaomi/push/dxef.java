package com.xiaomi.push;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class dxef extends lw {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private int f73311kja0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private Bitmap f73312n7h;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private Bitmap f73313qrj;

    public dxef(Context context, String str) {
        super(context, str);
        this.f73311kja0 = 16777216;
    }

    @Override // com.xiaomi.push.lw
    protected String cdj() {
        return "notification_banner";
    }

    public dxef d3(Bitmap bitmap) {
        if (m21218z() && bitmap != null) {
            this.f73312n7h = bitmap;
        }
        return this;
    }

    public dxef gvn7(String str) {
        if (m21218z() && !TextUtils.isEmpty(str)) {
            try {
                this.f73311kja0 = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("parse banner notification image text color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.lw
    /* JADX INFO: renamed from: i */
    protected boolean mo20552i() {
        if (!nc.m21315s()) {
            return false;
        }
        Resources resources = zy().getResources();
        String packageName = zy().getPackageName();
        return (m21923k(zy().getResources(), "bg", "id", zy().getPackageName()) == 0 || m21923k(resources, "icon", "id", packageName) == 0 || m21923k(resources, "title", "id", packageName) == 0 || nc.toq(zy()) < 9) ? false : true;
    }

    public dxef jp0y(Bitmap bitmap) {
        if (m21218z() && bitmap != null) {
            if (bitmap.getWidth() != 984 || 184 > bitmap.getHeight() || bitmap.getHeight() > 1678) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("colorful notification banner image resolution error, must belong to [984*184, 984*1678]");
            } else {
                this.f73313qrj = bitmap;
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.lw, android.app.Notification.Builder
    /* JADX INFO: renamed from: kja0 */
    public lw setLargeIcon(Bitmap bitmap) {
        return this;
    }

    @Override // com.xiaomi.push.lw
    protected String ni7() {
        return null;
    }

    @Override // com.xiaomi.push.lw, com.xiaomi.push.vy
    /* JADX INFO: renamed from: y */
    public void mo20553y() {
        if (!m21218z() || this.f73313qrj == null) {
            fu4();
            return;
        }
        super.mo20553y();
        Resources resources = zy().getResources();
        String packageName = zy().getPackageName();
        int iM21923k = m21923k(resources, "bg", "id", packageName);
        if (nc.toq(zy()) >= 10) {
            x2().setImageViewBitmap(iM21923k, ld6(this.f73313qrj, 30.0f));
        } else {
            x2().setImageViewBitmap(iM21923k, this.f73313qrj);
        }
        int iM21923k2 = m21923k(resources, "icon", "id", packageName);
        if (this.f73312n7h != null) {
            x2().setImageViewBitmap(iM21923k2, this.f73312n7h);
        } else {
            ki(iM21923k2);
        }
        int iM21923k3 = m21923k(resources, "title", "id", packageName);
        x2().setTextViewText(iM21923k3, this.f33370n);
        Map<String, String> map = this.f73474f7l8;
        if (map != null && this.f73311kja0 == 16777216) {
            gvn7(map.get("notification_image_text_color"));
        }
        RemoteViews remoteViewsX2 = x2();
        int i2 = this.f73311kja0;
        remoteViewsX2.setTextColor(iM21923k3, (i2 == 16777216 || !fn3e(i2)) ? -1 : -16777216);
        setCustomContentView(x2());
        Bundle bundle = new Bundle();
        bundle.putBoolean("miui.customHeight", true);
        addExtras(bundle);
    }
}
