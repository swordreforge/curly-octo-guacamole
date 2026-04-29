package com.android.thememanager.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.android.thememanager.R;
import miuix.appcompat.app.ki;

/* JADX INFO: compiled from: XiaoAiUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class wx16 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f61426f7l8 = "1002505";

    /* JADX INFO: renamed from: g */
    private static final String f16879g = "677730281785";

    /* JADX INFO: renamed from: k */
    private static final String f16880k = "XiaoAi";

    /* JADX INFO: renamed from: n */
    private static final String f16881n = "1002505";

    /* JADX INFO: renamed from: q */
    private static final String f16882q = "market://details?id=com.xiaomi.mibrain.speech&back=true&startDownload=true";

    /* JADX INFO: renamed from: s */
    private static final String f16883s = "Vqq6wnVid0myi_XLPAQMupavlt1e8NHc5dJiKntdq9tXY5ZwY2LFXTlMtquLlp_3iJ7BfBYyVYbXRZh7s7lBYg";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f61427toq = "com.xiaomi.mibrain.action.RECOGNIZE_SPEECH";

    /* JADX INFO: renamed from: y */
    private static final String f16884y = "7f5TTyLnNvVWPGnOqBKkL9ULdH9YTP2zCvyND-X4d1E";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f61428zy = "com.xiaomi.mibrain.speech";

    /* JADX INFO: renamed from: com.android.thememanager.util.wx16$k */
    /* JADX INFO: compiled from: XiaoAiUtil.java */
    class DialogInterfaceOnClickListenerC2816k implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Activity f16885k;

        DialogInterfaceOnClickListenerC2816k(final Activity val$activity) {
            this.f16885k = val$activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            this.f16885k.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(wx16.f16882q)));
        }
    }

    /* JADX INFO: renamed from: k */
    private static void m10068k(@zy.lvui final Activity activity) {
        new ki.C6947k(activity).lrht(R.string.xiaoai_speech_not_installed_title).fu4(R.string.xiaoai_speech_not_installed_message).dd(R.string.xiaoai_speech_not_installed_download, new DialogInterfaceOnClickListenerC2816k(activity)).m25047s(true).hb();
    }

    public static void toq(Activity activity, Fragment fragment, int requestCode) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            Intent intent = new Intent(f61427toq);
            intent.setPackage(f61428zy);
            intent.putExtra("appId", "1002505");
            intent.putExtra("appToken", f16879g);
            intent.putExtra(com.android.thememanager.basemodule.utils.x9kr.f10438g, activity.getPackageName());
            intent.putExtra("client_id", "1002505");
            intent.putExtra("api_key", f16884y);
            intent.putExtra("sign_secret", f16883s);
            if (fragment != null) {
                fragment.startActivityForResult(intent, requestCode);
            } else {
                activity.startActivityForResult(intent, requestCode);
            }
        } catch (ActivityNotFoundException e2) {
            Log.i(f16880k, "Not Found XIAO AI ! : " + e2);
            m10068k(activity);
        } catch (Exception e3) {
            Log.i(f16880k, "Other Exception: " + e3);
        }
    }
}
