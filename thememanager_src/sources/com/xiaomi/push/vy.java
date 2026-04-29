package com.xiaomi.push;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public class vy extends Notification.Builder {

    /* JADX INFO: renamed from: k */
    private Context f34053k;

    public vy(Context context) {
        super(context);
        this.f34053k = context;
    }

    @Override // android.app.Notification.Builder
    public Notification build() {
        mo20553y();
        return super.build();
    }

    public vy f7l8(Map<String, String> map) {
        return this;
    }

    /* JADX INFO: renamed from: g */
    public vy m21922g(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                C5892r.m21411n(this, "setColor", Integer.valueOf(Color.parseColor(str)));
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.zy.jk("fail to set color. " + e2);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: k */
    public int m21923k(Resources resources, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return resources.getIdentifier(str, str2, str3);
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public vy setCustomContentView(RemoteViews remoteViews) {
        super.setCustomContentView(remoteViews);
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public vy addExtras(Bundle bundle) {
        super.addExtras(bundle);
        return this;
    }

    public final int toq(String str) {
        return m21923k(zy().getResources(), str, "id", zy().getPackageName());
    }

    /* JADX INFO: renamed from: y */
    protected void mo20553y() {
    }

    protected Context zy() {
        return this.f34053k;
    }
}
