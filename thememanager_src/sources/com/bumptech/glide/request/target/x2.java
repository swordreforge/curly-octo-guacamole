package com.bumptech.glide.request.target;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.bumptech.glide.request.transition.InterfaceC3185g;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: NotificationTarget.java */
/* JADX INFO: loaded from: classes2.dex */
public class x2 extends AbstractC3179n<Bitmap> {

    /* JADX INFO: renamed from: g */
    private final RemoteViews f19039g;

    /* JADX INFO: renamed from: h */
    private final Notification f19040h;

    /* JADX INFO: renamed from: i */
    private final int f19041i;

    /* JADX INFO: renamed from: p */
    private final String f19042p;

    /* JADX INFO: renamed from: s */
    private final int f19043s;

    /* JADX INFO: renamed from: y */
    private final Context f19044y;

    public x2(Context context, int i2, RemoteViews remoteViews, Notification notification, int i3) {
        this(context, i2, remoteViews, notification, i3, null);
    }

    /* JADX INFO: renamed from: n */
    private void m11207n() {
        ((NotificationManager) com.bumptech.glide.util.qrj.m11262q((NotificationManager) this.f19044y.getSystemService(com.android.thememanager.basemodule.analysis.toq.mle))).notify(this.f19042p, this.f19043s, this.f19040h);
    }

    /* JADX INFO: renamed from: q */
    private void m11208q(@dd Bitmap bitmap) {
        this.f19039g.setImageViewBitmap(this.f19041i, bitmap);
        m11207n();
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    public void x2(@dd Drawable drawable) {
        m11208q(null);
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public void qrj(@lvui Bitmap bitmap, @dd InterfaceC3185g<? super Bitmap> interfaceC3185g) {
        m11208q(bitmap);
    }

    public x2(Context context, int i2, RemoteViews remoteViews, Notification notification, int i3, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i2, remoteViews, notification, i3, str);
    }

    public x2(Context context, int i2, int i3, int i4, RemoteViews remoteViews, Notification notification, int i5, String str) {
        super(i2, i3);
        this.f19044y = (Context) com.bumptech.glide.util.qrj.m11261n(context, "Context must not be null!");
        this.f19040h = (Notification) com.bumptech.glide.util.qrj.m11261n(notification, "Notification object can not be null!");
        this.f19039g = (RemoteViews) com.bumptech.glide.util.qrj.m11261n(remoteViews, "RemoteViews object can not be null!");
        this.f19041i = i4;
        this.f19043s = i5;
        this.f19042p = str;
    }
}
