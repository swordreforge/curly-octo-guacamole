package com.android.thememanager.basemodule.utils;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.util.ArrayMap;
import android.util.Log;
import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import ek5k.C6002g;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class ScreenShotReportManager implements InterfaceC0928g {

    /* JADX INFO: renamed from: g */
    private static final String f10255g = "ScreenShotManger";

    /* JADX INFO: renamed from: k */
    private Context f10256k;

    /* JADX INFO: renamed from: n */
    private C1798k f10257n;

    /* JADX INFO: renamed from: q */
    private C1798k f10258q;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.ScreenShotReportManager$k */
    static class C1798k extends ContentObserver {

        /* JADX INFO: renamed from: g */
        private static final String[] f10259g = {"_data", "date_added"};

        /* JADX INFO: renamed from: k */
        private WeakReference<Context> f10260k;

        /* JADX INFO: renamed from: n */
        private String f10261n;

        /* JADX INFO: renamed from: q */
        private String f10262q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Uri f57707toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private long f57708zy;

        public C1798k(Context context, Handler handler, Uri uri) {
            super(handler);
            this.f10260k = new WeakReference<>(context);
            this.f57707toq = uri;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void toq() {
            Context context = this.f10260k.get();
            try {
                Cursor cursorQuery = context.getContentResolver().query(this.f57707toq, f10259g, null, null, "date_added DESC");
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            int columnIndex = cursorQuery.getColumnIndex("_data");
                            long j2 = cursorQuery.getLong(cursorQuery.getColumnIndex("date_added")) * 1000;
                            if (j2 >= this.f57708zy && System.currentTimeMillis() - j2 <= 10000) {
                                String string = cursorQuery.getString(columnIndex);
                                if (string.startsWith(Environment.getExternalStorageDirectory().getAbsolutePath() + "/DCIM/Screenshots/Screenshot") && string.contains(context.getPackageName())) {
                                    zy();
                                }
                            }
                            Log.d(ScreenShotReportManager.f10255g, "time not match.");
                            cursorQuery.close();
                            return;
                        }
                    } finally {
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e2) {
                Log.e(ScreenShotReportManager.f10255g, e2.getMessage());
            }
        }

        private void zy() {
            ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
            if (!p029m.zy.toq(this.f10261n)) {
                arrayMapM6679k.put("resourceType", this.f10261n);
            }
            if (!p029m.zy.toq(this.f10262q)) {
                arrayMapM6679k.put("pageId", this.f10262q);
            }
            C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.zi4o, C1706p.ki(arrayMapM6679k));
        }

        /* JADX INFO: renamed from: g */
        public void m6990g() {
            this.f57708zy = System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: n */
        public void m6991n(String pageId, String resourceCode) {
            this.f10262q = pageId;
            this.f10261n = resourceCode;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange) {
            super.onChange(selfChange);
            if (this.f10260k.get() != null) {
                C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.basemodule.utils.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10346k.toq();
                    }
                });
            }
        }
    }

    public ScreenShotReportManager(Context context, String pageId, String resourceCode) {
        this.f10256k = context;
        C1798k c1798k = new C1798k(this.f10256k, new Handler(Looper.getMainLooper()), MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        this.f10258q = c1798k;
        c1798k.m6991n(pageId, resourceCode);
        C1798k c1798k2 = new C1798k(this.f10256k, new Handler(Looper.getMainLooper()), MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        this.f10257n = c1798k2;
        c1798k2.m6991n(pageId, resourceCode);
    }

    /* JADX INFO: renamed from: k */
    public void m6987k() {
        Context context = this.f10256k;
        if (context == null) {
            return;
        }
        boolean z2 = Build.VERSION.SDK_INT >= 29;
        context.getContentResolver().registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, z2, this.f10258q);
        this.f10256k.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, z2, this.f10257n);
        this.f10258q.m6990g();
        this.f10257n.m6990g();
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onStart(@zy.lvui InterfaceC0954z owner) {
        m6987k();
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onStop(@zy.lvui InterfaceC0954z owner) {
        toq();
    }

    public void toq() {
        Context context = this.f10256k;
        if (context == null) {
            return;
        }
        if (this.f10258q != null) {
            context.getContentResolver().unregisterContentObserver(this.f10258q);
        }
        if (this.f10257n != null) {
            this.f10256k.getContentResolver().unregisterContentObserver(this.f10257n);
        }
    }
}
