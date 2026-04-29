package com.xiaomi.push;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.xiaomi.push.service.C5939t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lw extends vy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    protected Map<String, String> f73474f7l8;

    /* JADX INFO: renamed from: g */
    protected CharSequence f33369g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private ArrayList<Notification.Action> f73475ld6;

    /* JADX INFO: renamed from: n */
    protected CharSequence f33370n;

    /* JADX INFO: renamed from: p */
    private boolean f33371p;

    /* JADX INFO: renamed from: q */
    protected Bitmap f33372q;

    /* JADX INFO: renamed from: s */
    private String f33373s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private RemoteViews f73476toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f73477x2;

    /* JADX INFO: renamed from: y */
    private int f33374y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f73478zy;

    public lw(Context context, String str) {
        this(context, 0, str);
    }

    private boolean a9() {
        return jk() && fti();
    }

    private boolean fti() {
        List<StatusBarNotification> listO1t = com.xiaomi.push.service.wvg.m21784n(zy(), this.f33373s).o1t();
        if (listO1t != null && !listO1t.isEmpty()) {
            for (StatusBarNotification statusBarNotification : listO1t) {
                if (statusBarNotification.getId() == this.f33374y) {
                    if (statusBarNotification.getNotification() == null) {
                        return false;
                    }
                    return !r0.extras.getBoolean("mipush.customCopyLayout", true);
                }
            }
        }
        return false;
    }

    private boolean jk() {
        return (TextUtils.isEmpty(ni7()) || TextUtils.isEmpty(this.f33373s)) ? false : true;
    }

    private void mcp() {
        super.setContentTitle(this.f33370n);
        super.setContentText(this.f33369g);
    }

    private String o1t() {
        boolean zA9 = a9();
        this.f33371p = zA9;
        return zA9 ? ni7() : cdj();
    }

    /* JADX INFO: renamed from: p */
    private Bitmap m21214p() {
        return com.xiaomi.push.service.kja0.n7h(uf.m21863q(zy(), this.f33373s));
    }

    /* JADX INFO: renamed from: t */
    private boolean m21215t() {
        Map<String, String> map = this.f73474f7l8;
        return map != null && Boolean.parseBoolean(map.get("custom_builder_set_title"));
    }

    private void wvg() {
        int iM21923k = m21923k(zy().getResources(), o1t(), C3678q.f65834ni7, zy().getPackageName());
        if (iM21923k == 0) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("create RemoteViews failed, no such layout resource was found");
        } else {
            this.f73476toq = new RemoteViews(zy().getPackageName(), iM21923k);
            this.f73478zy = mo20552i();
        }
    }

    protected abstract String cdj();

    @Override // com.xiaomi.push.vy
    public vy f7l8(Map<String, String> map) {
        this.f73474f7l8 = map;
        return this;
    }

    protected final boolean fn3e(int i2) {
        return ((((double) Color.red(i2)) * 0.299d) + (((double) Color.green(i2)) * 0.587d)) + (((double) Color.blue(i2)) * 0.114d) < 192.0d;
    }

    protected final void fu4() {
        super.setContentTitle(this.f33370n);
        super.setContentText(this.f33369g);
        Bitmap bitmap = this.f33372q;
        if (bitmap != null) {
            super.setLargeIcon(bitmap);
        }
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public lw setContentTitle(CharSequence charSequence) {
        this.f33370n = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: i */
    protected abstract boolean mo20552i();

    protected void ki(int i2) {
        Bitmap bitmapM21214p = m21214p();
        if (bitmapM21214p != null) {
            x2().setImageViewBitmap(i2, bitmapM21214p);
            return;
        }
        int iQrj = uf.qrj(zy(), this.f33373s);
        if (iQrj != 0) {
            x2().setImageViewResource(i2, iQrj);
        }
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public lw setLargeIcon(Bitmap bitmap) {
        this.f33372q = bitmap;
        return this;
    }

    protected Bitmap ld6(Bitmap bitmap, float f2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawRoundRect(new RectF(rect), f2, f2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: n7h, reason: merged with bridge method [inline-methods] */
    public lw addAction(Notification.Action action) {
        if (action != null) {
            this.f73475ld6.add(action);
        }
        int i2 = this.f73477x2;
        this.f73477x2 = i2 + 1;
        t8r(i2, action);
        return this;
    }

    protected abstract String ni7();

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
    public lw addAction(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
        addAction(new Notification.Action(i2, charSequence, pendingIntent));
        return this;
    }

    /* JADX INFO: renamed from: s */
    protected int m21217s(float f2) {
        return (int) ((f2 * zy().getResources().getDisplayMetrics().density) + 0.5f);
    }

    protected void t8r(int i2, Notification.Action action) {
    }

    public final RemoteViews x2() {
        return this.f73476toq;
    }

    @Override // com.xiaomi.push.vy
    /* JADX INFO: renamed from: y */
    protected void mo20553y() {
        super.mo20553y();
        Bundle bundle = new Bundle();
        if (jk()) {
            bundle.putBoolean("mipush.customCopyLayout", this.f33371p);
        } else {
            bundle.putBoolean("mipush.customCopyLayout", false);
        }
        bundle.putBoolean("miui.customHeight", false);
        bundle.putBoolean("mipush.customNotification", true);
        bundle.putInt("mipush.customLargeIconId", toq("large_icon"));
        if (this.f73475ld6.size() > 0) {
            Notification.Action[] actionArr = new Notification.Action[this.f73475ld6.size()];
            this.f73475ld6.toArray(actionArr);
            bundle.putParcelableArray("mipush.customActions", actionArr);
        }
        if (m21215t() || !C5939t.ki(zy().getContentResolver())) {
            mcp();
        } else {
            bundle.putCharSequence("mipush.customTitle", this.f33370n);
            bundle.putCharSequence("mipush.customContent", this.f33369g);
        }
        addExtras(bundle);
    }

    /* JADX INFO: renamed from: z */
    protected final boolean m21218z() {
        return this.f73478zy;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: zurt, reason: merged with bridge method [inline-methods] */
    public lw setContentText(CharSequence charSequence) {
        this.f33369g = charSequence;
        return this;
    }

    public lw(Context context, int i2, String str) {
        super(context);
        this.f73475ld6 = new ArrayList<>();
        this.f73477x2 = 0;
        this.f33373s = str;
        this.f33374y = i2;
        wvg();
    }
}
