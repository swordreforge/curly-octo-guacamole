package com.xiaomi.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.google.android.exoplayer2.text.ttml.C3678q;
import java.util.Map;
import y9n.C7780k;

/* JADX INFO: loaded from: classes3.dex */
public class a5id extends lw {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f73257cdj;

    /* JADX INFO: renamed from: h */
    private PendingIntent f32639h;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f73258ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private CharSequence f73259kja0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private Bitmap f73260n7h;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f73261qrj;

    public a5id(Context context, int i2, String str) {
        super(context, i2, str);
        this.f73261qrj = 16777216;
        this.f73257cdj = 16777216;
        this.f73258ki = 16777216;
    }

    private void eqxt(RemoteViews remoteViews, int i2, int i3, int i4, boolean z2) {
        int iM21217s = m21217s(6.0f);
        remoteViews.setViewPadding(i2, iM21217s, 0, iM21217s, 0);
        if (z2) {
            remoteViews.setTextColor(i3, -1);
            remoteViews.setTextColor(i4, -1);
        } else {
            remoteViews.setTextColor(i3, -16777216);
            remoteViews.setTextColor(i4, -16777216);
        }
    }

    private Drawable jp0y(int i2, int i3, int i4, float f2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RoundRectShape(new float[]{f2, f2, f2, f2, f2, f2, f2, f2}, null, null));
        shapeDrawable.getPaint().setColor(i2);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setIntrinsicWidth(i3);
        shapeDrawable.setIntrinsicHeight(i4);
        return shapeDrawable;
    }

    @Override // com.xiaomi.push.lw
    protected String cdj() {
        return "notification_colorful";
    }

    public a5id d2ok(String str) {
        if (m21218z() && !TextUtils.isEmpty(str)) {
            try {
                this.f73261qrj = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("parse colorful notification bg color error");
            }
        }
        return this;
    }

    public a5id d3(CharSequence charSequence, PendingIntent pendingIntent) {
        if (m21218z()) {
            super.addAction(0, charSequence, pendingIntent);
            this.f73259kja0 = charSequence;
            this.f32639h = pendingIntent;
        }
        return this;
    }

    public a5id gvn7(Bitmap bitmap) {
        if (m21218z() && bitmap != null) {
            if (bitmap.getWidth() != 984 || bitmap.getHeight() < 177 || bitmap.getHeight() > 207) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("colorful notification bg image resolution error, must [984*177, 984*207]");
            } else {
                this.f73260n7h = bitmap;
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
        return (m21923k(resources, "icon", "id", packageName) == 0 || m21923k(resources, "title", "id", packageName) == 0 || m21923k(resources, "content", "id", packageName) == 0) ? false : true;
    }

    public a5id lvui(String str) {
        if (m21218z() && !TextUtils.isEmpty(str)) {
            try {
                this.f73258ki = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("parse colorful notification image text color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.lw
    protected String ni7() {
        return "notification_colorful_copy";
    }

    public a5id oc(String str) {
        if (m21218z() && !TextUtils.isEmpty(str)) {
            try {
                this.f73257cdj = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("parse colorful notification button bg color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.lw, com.xiaomi.push.vy
    /* JADX INFO: renamed from: y */
    public void mo20553y() {
        if (!m21218z()) {
            fu4();
            return;
        }
        super.mo20553y();
        Resources resources = zy().getResources();
        String packageName = zy().getPackageName();
        int iM21923k = m21923k(resources, "icon", "id", packageName);
        if (this.f33372q == null) {
            ki(iM21923k);
        } else {
            x2().setImageViewBitmap(iM21923k, this.f33372q);
        }
        int iM21923k2 = m21923k(resources, "title", "id", packageName);
        int iM21923k3 = m21923k(resources, "content", "id", packageName);
        x2().setTextViewText(iM21923k2, this.f33370n);
        x2().setTextViewText(iM21923k3, this.f33369g);
        if (!TextUtils.isEmpty(this.f73259kja0)) {
            int iM21923k4 = m21923k(resources, "buttonContainer", "id", packageName);
            int iM21923k5 = m21923k(resources, C7780k.f100596yz, "id", packageName);
            int iM21923k6 = m21923k(resources, "buttonBg", "id", packageName);
            x2().setViewVisibility(iM21923k4, 0);
            x2().setTextViewText(iM21923k5, this.f73259kja0);
            x2().setOnClickPendingIntent(iM21923k4, this.f32639h);
            if (this.f73257cdj != 16777216) {
                int iM21217s = m21217s(70.0f);
                int iM21217s2 = m21217s(29.0f);
                x2().setImageViewBitmap(iM21923k6, com.xiaomi.push.service.kja0.n7h(jp0y(this.f73257cdj, iM21217s, iM21217s2, iM21217s2 / 2.0f)));
                x2().setTextColor(iM21923k5, fn3e(this.f73257cdj) ? -1 : -16777216);
            }
        }
        int iM21923k7 = m21923k(resources, "bg", "id", packageName);
        int iM21923k8 = m21923k(resources, C3678q.f65827lrht, "id", packageName);
        if (this.f73261qrj != 16777216) {
            if (nc.toq(zy()) >= 10) {
                x2().setImageViewBitmap(iM21923k7, com.xiaomi.push.service.kja0.n7h(jp0y(this.f73261qrj, 984, com.google.android.exoplayer2.extractor.ts.wvg.f64653fu4, 30.0f)));
            } else {
                x2().setImageViewBitmap(iM21923k7, com.xiaomi.push.service.kja0.n7h(jp0y(this.f73261qrj, 984, com.google.android.exoplayer2.extractor.ts.wvg.f64653fu4, 0.0f)));
            }
            eqxt(x2(), iM21923k8, iM21923k2, iM21923k3, fn3e(this.f73261qrj));
        } else if (this.f73260n7h != null) {
            if (nc.toq(zy()) >= 10) {
                x2().setImageViewBitmap(iM21923k7, ld6(this.f73260n7h, 30.0f));
            } else {
                x2().setImageViewBitmap(iM21923k7, this.f73260n7h);
            }
            Map<String, String> map = this.f73474f7l8;
            if (map != null && this.f73258ki == 16777216) {
                lvui(map.get("notification_image_text_color"));
            }
            int i2 = this.f73258ki;
            eqxt(x2(), iM21923k8, iM21923k2, iM21923k3, i2 == 16777216 || !fn3e(i2));
        } else {
            x2().setViewVisibility(iM21923k, 8);
            x2().setViewVisibility(iM21923k7, 8);
            try {
                C5892r.m21411n(this, "setStyle", wu.zy(zy(), "android.app.Notification$DecoratedCustomViewStyle").getConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("load class DecoratedCustomViewStyle failed");
            }
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("miui.customHeight", true);
        addExtras(bundle);
        setCustomContentView(x2());
    }
}
