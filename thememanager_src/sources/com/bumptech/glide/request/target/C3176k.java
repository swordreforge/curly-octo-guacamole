package com.bumptech.glide.request.target;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.bumptech.glide.request.transition.InterfaceC3185g;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.request.target.k */
/* JADX INFO: compiled from: AppWidgetTarget.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3176k extends AbstractC3179n<Bitmap> {

    /* JADX INFO: renamed from: g */
    private final int[] f19005g;

    /* JADX INFO: renamed from: h */
    private final int f19006h;

    /* JADX INFO: renamed from: p */
    private final Context f19007p;

    /* JADX INFO: renamed from: s */
    private final RemoteViews f19008s;

    /* JADX INFO: renamed from: y */
    private final ComponentName f19009y;

    public C3176k(Context context, int i2, int i3, int i4, RemoteViews remoteViews, int... iArr) {
        super(i2, i3);
        if (iArr.length == 0) {
            throw new IllegalArgumentException("WidgetIds must have length > 0");
        }
        this.f19007p = (Context) com.bumptech.glide.util.qrj.m11261n(context, "Context can not be null!");
        this.f19008s = (RemoteViews) com.bumptech.glide.util.qrj.m11261n(remoteViews, "RemoteViews object can not be null!");
        this.f19005g = (int[]) com.bumptech.glide.util.qrj.m11261n(iArr, "WidgetIds can not be null!");
        this.f19006h = i4;
        this.f19009y = null;
    }

    /* JADX INFO: renamed from: n */
    private void m11189n() {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.f19007p);
        ComponentName componentName = this.f19009y;
        if (componentName != null) {
            appWidgetManager.updateAppWidget(componentName, this.f19008s);
        } else {
            appWidgetManager.updateAppWidget(this.f19005g, this.f19008s);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m11190q(@dd Bitmap bitmap) {
        this.f19008s.setImageViewBitmap(this.f19006h, bitmap);
        m11189n();
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    public void x2(@dd Drawable drawable) {
        m11190q(null);
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public void qrj(@lvui Bitmap bitmap, @dd InterfaceC3185g<? super Bitmap> interfaceC3185g) {
        m11190q(bitmap);
    }

    public C3176k(Context context, int i2, RemoteViews remoteViews, int... iArr) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i2, remoteViews, iArr);
    }

    public C3176k(Context context, int i2, int i3, int i4, RemoteViews remoteViews, ComponentName componentName) {
        super(i2, i3);
        this.f19007p = (Context) com.bumptech.glide.util.qrj.m11261n(context, "Context can not be null!");
        this.f19008s = (RemoteViews) com.bumptech.glide.util.qrj.m11261n(remoteViews, "RemoteViews object can not be null!");
        this.f19009y = (ComponentName) com.bumptech.glide.util.qrj.m11261n(componentName, "ComponentName can not be null!");
        this.f19006h = i4;
        this.f19005g = null;
    }

    public C3176k(Context context, int i2, RemoteViews remoteViews, ComponentName componentName) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i2, remoteViews, componentName);
    }
}
