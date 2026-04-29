package com.xiaomi.analytics.internal.v1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;
import com.xiaomi.analytics.internal.C5605n;
import com.xiaomi.analytics.internal.util.C5609k;
import dalvik.system.DexClassLoader;

/* JADX INFO: compiled from: DexAnalytics.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq implements InterfaceC5615k {

    /* JADX INFO: renamed from: s */
    private static final String f31220s = "com.miui.analytics.Analytics";

    /* JADX INFO: renamed from: y */
    private static final String f31221y = "DexAnalytics";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private volatile boolean f73068f7l8;

    /* JADX INFO: renamed from: g */
    private String f31222g;

    /* JADX INFO: renamed from: k */
    private Context f31223k;

    /* JADX INFO: renamed from: n */
    private String f31224n;

    /* JADX INFO: renamed from: q */
    private String f31225q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private ClassLoader f73069toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f73070zy;

    public toq(Context context, String str, String str2) {
        this.f31225q = "";
        this.f31223k = com.xiaomi.analytics.internal.util.toq.m19255k(context);
        this.f31224n = str;
        this.f31222g = str2;
        PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 1);
        this.f73070zy = packageArchiveInfo.versionCode;
        this.f31225q = packageArchiveInfo.versionName;
    }

    private void zy() {
        try {
            this.f73069toq.loadClass(f31220s).getDeclaredMethod("initialize", Context.class, Integer.TYPE, String.class).invoke(null, this.f31223k, Integer.valueOf(this.f73070zy), this.f31225q);
        } catch (Throwable th) {
            Log.w(C5609k.m19240k(f31221y), "initAnalytics exception", th);
        }
    }

    @Override // com.xiaomi.analytics.internal.v1.InterfaceC5615k
    public void close() {
    }

    @Override // com.xiaomi.analytics.internal.v1.InterfaceC5615k
    public void deleteAllEvents(String str) {
        try {
            init();
            this.f73069toq.loadClass(f31220s).getDeclaredMethod("deleteAllEvents", String.class).invoke(null, str);
        } catch (Throwable th) {
            Log.w(C5609k.m19240k(f31221y), "deleteAllEvents exception", th);
        }
    }

    @Override // com.xiaomi.analytics.internal.v1.InterfaceC5615k
    public C5605n getVersion() {
        return new C5605n(this.f31225q);
    }

    @Override // com.xiaomi.analytics.internal.v1.InterfaceC5615k
    public void init() {
        try {
            if (this.f73068f7l8) {
                return;
            }
            this.f73069toq = new DexClassLoader(this.f31224n, this.f31223k.getDir("dex", 0).getAbsolutePath(), this.f31222g, ClassLoader.getSystemClassLoader());
            zy();
            this.f73068f7l8 = true;
            C5609k.toq(f31221y, "initialized");
        } catch (Exception e2) {
            Log.e(C5609k.m19240k(f31221y), "init e", e2);
        }
    }

    @Override // com.xiaomi.analytics.internal.v1.InterfaceC5615k
    /* JADX INFO: renamed from: k */
    public boolean mo19266k(String str) {
        try {
            init();
            return ((Boolean) this.f73069toq.loadClass(f31220s).getDeclaredMethod("isPolicyReady", String.class, String.class).invoke(null, this.f31223k.getPackageName(), str)).booleanValue();
        } catch (Throwable th) {
            Log.w(C5609k.m19240k(f31221y), "isPolicyReady exception", th);
            return false;
        }
    }

    @Override // com.xiaomi.analytics.internal.v1.InterfaceC5615k
    public void setDebugOn(boolean z2) {
        try {
            init();
            this.f73069toq.loadClass(f31220s).getDeclaredMethod("setDebugOn", Boolean.TYPE).invoke(null, Boolean.valueOf(z2));
        } catch (Throwable th) {
            Log.w(C5609k.m19240k(f31221y), "setDebugOn exception", th);
        }
    }

    @Override // com.xiaomi.analytics.internal.v1.InterfaceC5615k
    public void setDefaultPolicy(String str, String str2) {
        try {
            init();
            this.f73069toq.loadClass(f31220s).getDeclaredMethod("setDefaultPolicy", String.class, String.class).invoke(null, str, str2);
        } catch (Throwable th) {
            Log.w(C5609k.m19240k(f31221y), "setDefaultPolicy exception", th);
        }
    }

    @Override // com.xiaomi.analytics.internal.v1.InterfaceC5615k
    public String toq(String str) {
        try {
            init();
            return (String) this.f73069toq.loadClass(f31220s).getDeclaredMethod("getClientExtra", String.class, String.class).invoke(null, this.f31223k.getPackageName(), str);
        } catch (Throwable th) {
            Log.w(C5609k.m19240k(f31221y), "getClientExtra exception", th);
            return "";
        }
    }

    @Override // com.xiaomi.analytics.internal.v1.InterfaceC5615k
    public void trackEvent(String str) {
        try {
            init();
            this.f73069toq.loadClass(f31220s).getDeclaredMethod("trackEvent", String.class).invoke(null, str);
        } catch (Throwable th) {
            Log.w(C5609k.m19240k(f31221y), "trackEvent exception", th);
        }
    }

    @Override // com.xiaomi.analytics.internal.v1.InterfaceC5615k
    public void trackEvents(String[] strArr) {
        try {
            init();
            this.f73069toq.loadClass(f31220s).getDeclaredMethod("trackEvents", String[].class).invoke(null, strArr);
        } catch (Throwable th) {
            Log.w(C5609k.m19240k(f31221y), "trackEvents exception", th);
        }
    }
}
