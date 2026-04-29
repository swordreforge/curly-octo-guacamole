package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class was {
    /* JADX INFO: renamed from: k */
    public static ComponentName m21778k(Context context, Intent intent) {
        if (intent == null) {
            return null;
        }
        try {
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity != null) {
                return new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, TextUtils.isEmpty(resolveInfoResolveActivity.activityInfo.targetActivity) ? resolveInfoResolveActivity.activityInfo.name : resolveInfoResolveActivity.activityInfo.targetActivity);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean toq(Context context, ComponentName componentName) {
        try {
            new Intent().setComponent(componentName);
            context.getPackageManager().getActivityInfo(componentName, 128);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
