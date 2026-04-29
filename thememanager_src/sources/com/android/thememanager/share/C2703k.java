package com.android.thememanager.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.thememanager.R;
import com.android.thememanager.share.chooser.ShareChooserActivity;
import com.android.thememanager.share.delegate.AbstractC2694g;
import com.android.thememanager.share.delegate.cdj;
import com.android.thememanager.share.wechat.AbstractC2712q;

/* JADX INFO: renamed from: com.android.thememanager.share.k */
/* JADX INFO: compiled from: MiuiShare.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2703k {

    /* JADX INFO: renamed from: k */
    private static final String f16030k = "MiuiShare";

    public static void f7l8(Intent intent) {
        AbstractC2712q.kja0(intent);
    }

    /* JADX INFO: renamed from: g */
    public static void m9441g(toq listener) {
        C2716y.toq(listener);
    }

    /* JADX INFO: renamed from: k */
    public static void m9442k() {
        cdj.m9424s();
    }

    /* JADX INFO: renamed from: n */
    public static void m9443n(int shareFlag, com.android.thememanager.share.delegate.f7l8 factory) {
        cdj.m9426z(shareFlag, factory);
    }

    /* JADX INFO: renamed from: q */
    public static void m9444q(int shareFlag, AbstractC2694g delegate) {
        cdj.fu4(shareFlag, delegate);
    }

    public static void toq(int shareFlag) {
        cdj.m9422p(shareFlag);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m9445y(Context context, Intent shareIntent, Bundle shareConfig) {
        if (context == null) {
            Log.w("MiuiShare", "context is null");
        } else {
            if (!(context instanceof Activity)) {
                Intent intent = new Intent(context, (Class<?>) ShareChooserActivity.class);
                intent.putExtra(C2702g.f61067cdj, shareIntent);
                intent.putExtra(C2702g.f16020h, shareConfig);
                intent.addFlags(268435456);
                context.startActivity(intent);
                return true;
            }
            Activity activity = (Activity) context;
            if (!activity.isFinishing()) {
                Intent intent2 = new Intent(context, (Class<?>) ShareChooserActivity.class);
                intent2.putExtra(C2702g.f61067cdj, shareIntent);
                intent2.putExtra(C2702g.f16020h, shareConfig);
                context.startActivity(intent2);
                activity.overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
                return true;
            }
            Log.w("MiuiShare", "activity is destroy");
        }
        return false;
    }

    public static boolean zy(Activity activity, Intent shareIntent, Bundle shareConfig, int shareFlag) {
        return cdj.n7h(shareFlag, activity, shareConfig, shareIntent);
    }
}
