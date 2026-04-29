package com.xiaomi.ad.feedback;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import m2t.C6794k;

/* JADX INFO: compiled from: DislikeManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    private static final String f31164k = "DislikeManager";

    private zy() {
    }

    /* JADX INFO: renamed from: k */
    private static Intent m19221k() {
        Intent intent = new Intent("miui.intent.action.ad.FEEDBACK_SERVICE");
        intent.setPackage(C6794k.f38036k);
        return intent;
    }

    /* JADX INFO: renamed from: q */
    public static void m19222q(Context context, IAdFeedbackListener iAdFeedbackListener, String str, String str2, List<String> list) {
        if (context.bindService(m19221k(), new toq(iAdFeedbackListener, str, str2, list, context), 1)) {
            return;
        }
        Log.e(f31164k, "bind service fail");
    }

    public static boolean toq(Context context) {
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(m19221k(), 0);
        return (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) ? false : true;
    }

    public static void zy(Context context, IAdFeedbackListener iAdFeedbackListener, String str, String str2, String str3) {
        if (context.bindService(m19221k(), new ServiceConnectionC5598k(iAdFeedbackListener, str, str2, str3, context), 1)) {
            return;
        }
        Log.e(f31164k, "bind service fail");
    }
}
