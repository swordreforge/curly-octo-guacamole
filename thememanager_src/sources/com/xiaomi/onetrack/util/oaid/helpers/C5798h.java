package com.xiaomi.onetrack.util.oaid.helpers;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.xiaomi.onetrack.util.C5804p;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.helpers.h */
/* JADX INFO: loaded from: classes3.dex */
public class C5798h {

    /* JADX INFO: renamed from: a */
    private static final String f32391a = "NubiaDeviceIDHelper";

    /* JADX INFO: renamed from: a */
    public String m20329a(Context context) {
        try {
            ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(Uri.parse("content://cn.nubia.identity/identity"));
            Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call("getOAID", null, null);
            contentProviderClientAcquireContentProviderClient.close();
            return bundleCall.getInt("code", -1) == 0 ? bundleCall.getString("id") : "";
        } catch (Exception e2) {
            C5804p.m20342a(f32391a, e2.getMessage());
            return "";
        }
    }
}
