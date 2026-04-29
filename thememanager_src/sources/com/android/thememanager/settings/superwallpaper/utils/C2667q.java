package com.android.thememanager.settings.superwallpaper.utils;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.utils.q */
/* JADX INFO: compiled from: ContentProviderUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2667q {

    /* JADX INFO: renamed from: k */
    private static final String f15792k = "ContentProviderUtils";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f60986toq = "content://";

    private C2667q() {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.Bundle m9296k(android.content.Context r1, android.net.Uri r2, java.lang.String r3, java.lang.String r4, android.os.Bundle r5) throws java.lang.Throwable {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            android.content.ContentProviderClient r1 = r1.acquireUnstableContentProviderClient(r2)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            if (r1 != 0) goto L11
            if (r1 == 0) goto L10
            r1.close()
        L10:
            return r0
        L11:
            android.os.Bundle r2 = r1.call(r3, r4, r5)     // Catch: java.lang.Exception -> L19 java.lang.Throwable -> L2c
            r1.close()
            return r2
        L19:
            r2 = move-exception
            goto L1f
        L1b:
            r2 = move-exception
            goto L2e
        L1d:
            r2 = move-exception
            r1 = r0
        L1f:
            java.lang.String r3 = "ContentProviderUtils"
            java.lang.String r4 = "getResultFromProvider"
            android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L2b
            r1.close()
        L2b:
            return r0
        L2c:
            r2 = move-exception
            r0 = r1
        L2e:
            if (r0 == 0) goto L33
            r0.close()
        L33:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.superwallpaper.utils.C2667q.m9296k(android.content.Context, android.net.Uri, java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    /* JADX INFO: renamed from: q */
    public static void m9297q(Context context, Uri uri, ContentValues values) throws Throwable {
        ContentProviderClient contentProviderClient = null;
        try {
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                        return;
                    }
                    return;
                }
                try {
                    contentProviderClientAcquireUnstableContentProviderClient.update(uri, values, null, null);
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                } catch (Exception e2) {
                    e = e2;
                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    Log.e(f15792k, "updateData", e);
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Bundle toq(Context context, String providerUri, String callMethod, String args, Bundle extras) {
        return m9296k(context, Uri.parse(providerUri), callMethod, args, extras);
    }

    public static boolean zy(Context context, Uri uri) {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
            return false;
        }
        contentProviderClientAcquireUnstableContentProviderClient.close();
        return true;
    }
}
