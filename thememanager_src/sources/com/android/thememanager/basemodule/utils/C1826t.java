package com.android.thememanager.basemodule.utils;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.android.thememanager.basemodule.privacy.C1781k;
import ek5k.C6002g;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.t */
/* JADX INFO: compiled from: MsaUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class C1826t {

    /* JADX INFO: renamed from: k */
    private static final String f10406k = "MsaUtils";

    public static void f7l8(final boolean status) {
        C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.basemodule.utils.wvg
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C1826t.m7218n(status);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static void m7216g() {
        f7l8(zy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m7218n(boolean z2) throws Throwable {
        Uri uri;
        ContentValues contentValues;
        ContentProviderClient contentProviderClientAcquireContentProviderClient;
        ContentProviderClient contentProviderClient = null;
        try {
            try {
                uri = Uri.parse("content://com.miui.systemAdSolution.adSwitch/adPrivacySwitch");
                contentValues = new ContentValues();
                contentValues.put("adPackage", bf2.toq.toq().getPackageName());
                contentValues.put("adPrivacyStatus", Boolean.valueOf(z2));
                contentProviderClientAcquireContentProviderClient = bf2.toq.toq().getContentResolver().acquireContentProviderClient(uri);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            contentProviderClientAcquireContentProviderClient.update(uri, contentValues, null, null);
            Log.d(f10406k, "sync privacy status:" + z2 + " to msa success");
            StringBuilder sb = new StringBuilder();
            sb.append("get status from msa :");
            sb.append(m7219q());
            Log.d(f10406k, sb.toString());
            y9n.m7246g(contentProviderClientAcquireContentProviderClient);
        } catch (Exception e3) {
            e = e3;
            contentProviderClient = contentProviderClientAcquireContentProviderClient;
            Log.d(f10406k, "syncPrivacyStatus，" + e.getMessage());
            y9n.m7246g(contentProviderClient);
        } catch (Throwable th2) {
            th = th2;
            contentProviderClient = contentProviderClientAcquireContentProviderClient;
            y9n.m7246g(contentProviderClient);
            throw th;
        }
    }

    /* JADX INFO: renamed from: q */
    private static boolean m7219q() throws Throwable {
        ContentProviderClient contentProviderClientAcquireContentProviderClient;
        Cursor cursorQuery = null;
        try {
            Uri uri = Uri.parse("content://com.miui.systemAdSolution.adSwitch/adPrivacySwitch");
            contentProviderClientAcquireContentProviderClient = bf2.toq.toq().getContentResolver().acquireContentProviderClient(uri);
            try {
                try {
                    cursorQuery = contentProviderClientAcquireContentProviderClient.query(uri, null, bf2.toq.toq().getPackageName(), null, null);
                    boolean z2 = cursorQuery.getExtras().getBoolean("adPrivacyStatus");
                    y9n.m7246g(cursorQuery);
                    y9n.m7246g(contentProviderClientAcquireContentProviderClient);
                    return z2;
                } catch (Exception e2) {
                    e = e2;
                    Log.d(f10406k, "isSuccess," + e.getMessage());
                    y9n.m7246g(cursorQuery);
                    y9n.m7246g(contentProviderClientAcquireContentProviderClient);
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                y9n.m7246g(cursorQuery);
                y9n.m7246g(contentProviderClientAcquireContentProviderClient);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            contentProviderClientAcquireContentProviderClient = null;
        } catch (Throwable th2) {
            th = th2;
            contentProviderClientAcquireContentProviderClient = null;
            y9n.m7246g(cursorQuery);
            y9n.m7246g(contentProviderClientAcquireContentProviderClient);
            throw th;
        }
    }

    private static boolean toq() {
        return bf2.toq.toq().getApplicationInfo().uid % 100000 != y9n.fu4();
    }

    private static boolean zy() {
        if (!toq()) {
            return C1781k.toq(bf2.toq.toq()) && !com.android.thememanager.basemodule.privacy.x2.f7l8();
        }
        Log.d(f10406k, "sync uid changed");
        return false;
    }
}
