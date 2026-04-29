package com.market.sdk;

import android.annotation.SuppressLint;
import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.Settings;
import com.market.sdk.EnumC4976i;
import com.market.sdk.utils.C5010k;
import com.market.sdk.utils.C5013p;

/* JADX INFO: compiled from: DiscoverUpdateManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class ld6 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f68893cdj = "isMeteredUpdateConfirmNeededByRegion";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f68894f7l8 = "com.xiaomi.discover.auto_update_enabled";

    /* JADX INFO: renamed from: g */
    public static final int f28068g = 2;

    /* JADX INFO: renamed from: h */
    private static final String f28069h = "isMeteredUpdateAnswered";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static ld6 f68895ki = new ld6();

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f68896kja0 = "autoUpdate";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f68897ld6 = "setAutoUpdate";

    /* JADX INFO: renamed from: n */
    public static final int f28070n = 1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f68898n7h = "isMeteredUpdateConfirmNeededByRegion";

    /* JADX INFO: renamed from: p */
    private static final String f28071p = "getAutoUpdate";

    /* JADX INFO: renamed from: q */
    public static final int f28072q = 0;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f68899qrj = "setMeteredUpdateAnswered";

    /* JADX INFO: renamed from: s */
    private static final String f28073s = "com.xiaomi.discover.metered_update_confirm_needed_by_region";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f68900x2 = "isMeteredUpdateAnswered";

    /* JADX INFO: renamed from: y */
    private static final String f28074y = "com.xiaomi.discover.metered_update_answered";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f68901zy = -1;

    /* JADX INFO: renamed from: k */
    private final Uri f28075k = Uri.parse("content://com.xiaomi.discover.preferences");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Context f68902toq = C5010k.toq();

    /* JADX INFO: renamed from: k */
    public static ld6 m17323k() {
        return f68895ki;
    }

    /* JADX INFO: renamed from: g */
    public void m17324g(boolean z2) throws EnumC4976i.toq, RemoteException {
        EnumC4976i.DISCOVER_METERED_UPDATE_CONFIRM.throwExceptionIfNotSupported();
        try {
            C5013p.toq(MarketManager.f27964n, Settings.System.putInt(this.f68902toq.getContentResolver(), "com.xiaomi.discover.auto_update_enabled", z2 ? 1 : 0) + "");
        } catch (Exception e2) {
            C5013p.toq(MarketManager.f27964n, e2.toString() + "");
            ContentProviderClient contentProviderClientAcquireContentProviderClient = this.f68902toq.getContentResolver().acquireContentProviderClient(this.f28075k);
            contentProviderClientAcquireContentProviderClient.call(f68899qrj, String.valueOf(z2), null);
            contentProviderClientAcquireContentProviderClient.release();
            C5013p.toq(MarketManager.f27964n, "finish");
        }
    }

    /* JADX INFO: renamed from: n */
    public void m17325n(int i2) throws EnumC4976i.toq, RemoteException {
        EnumC4976i.DISCOVER_METERED_UPDATE_CONFIRM.throwExceptionIfNotSupported();
        try {
            Settings.System.putInt(this.f68902toq.getContentResolver(), "com.xiaomi.discover.auto_update_enabled", i2);
        } catch (Exception unused) {
            ContentProviderClient contentProviderClientAcquireContentProviderClient = this.f68902toq.getContentResolver().acquireContentProviderClient(this.f28075k);
            contentProviderClientAcquireContentProviderClient.call(f68897ld6, String.valueOf(i2), null);
            contentProviderClientAcquireContentProviderClient.release();
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m17326q() throws EnumC4976i.toq, RemoteException {
        int i2;
        EnumC4976i.DISCOVER_METERED_UPDATE_CONFIRM.throwExceptionIfNotSupported();
        try {
            i2 = Settings.System.getInt(this.f68902toq.getContentResolver(), "com.xiaomi.discover.metered_update_confirm_needed_by_region");
        } catch (Exception unused) {
            i2 = -1;
        }
        if (i2 < 0) {
            ContentProviderClient contentProviderClientAcquireContentProviderClient = this.f68902toq.getContentResolver().acquireContentProviderClient(this.f28075k);
            int i3 = contentProviderClientAcquireContentProviderClient.call("isMeteredUpdateConfirmNeededByRegion", null, null).getInt("isMeteredUpdateConfirmNeededByRegion", -1);
            contentProviderClientAcquireContentProviderClient.release();
            i2 = i3;
        }
        return i2 > 0;
    }

    public int toq() throws EnumC4976i.toq, RemoteException {
        int i2;
        EnumC4976i.DISCOVER_METERED_UPDATE_CONFIRM.throwExceptionIfNotSupported();
        try {
            i2 = Settings.System.getInt(this.f68902toq.getContentResolver(), "com.xiaomi.discover.auto_update_enabled");
        } catch (Exception unused) {
            i2 = -1;
        }
        if (i2 >= 0) {
            return i2;
        }
        ContentProviderClient contentProviderClientAcquireContentProviderClient = this.f68902toq.getContentResolver().acquireContentProviderClient(this.f28075k);
        int i3 = contentProviderClientAcquireContentProviderClient.call(f28071p, null, null).getInt(f68896kja0, -1);
        contentProviderClientAcquireContentProviderClient.release();
        return i3;
    }

    public boolean zy() throws EnumC4976i.toq, RemoteException {
        int i2;
        EnumC4976i.DISCOVER_METERED_UPDATE_CONFIRM.throwExceptionIfNotSupported();
        try {
            i2 = Settings.System.getInt(this.f68902toq.getContentResolver(), "com.xiaomi.discover.metered_update_answered");
        } catch (Exception unused) {
            i2 = -1;
        }
        if (i2 < 0) {
            ContentProviderClient contentProviderClientAcquireContentProviderClient = this.f68902toq.getContentResolver().acquireContentProviderClient(this.f28075k);
            int i3 = contentProviderClientAcquireContentProviderClient.call("isMeteredUpdateAnswered", null, null).getInt("isMeteredUpdateAnswered", -1);
            contentProviderClientAcquireContentProviderClient.release();
            i2 = i3;
        }
        return i2 > 0;
    }
}
