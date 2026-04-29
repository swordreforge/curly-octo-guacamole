package com.android.thememanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.util.yz;
import ek5k.C6002g;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class ThemeOtaUpdateReceiver extends BroadcastReceiver {
    private static final String KEY_SWITCH_FLAG = "switchFlag";
    private static final String KEY_SWITCH_STATE = "switchState";
    private static final String SWITCH_ACTION = "com.miui.miservice.action.SWITCH_UPDATE";
    private static final String TAG = "ThemeOtaUpdateReceiver";
    private static final String VALUE_OPEN_SWITCH_STATE = "1";
    private static final String VALUE_SWITCH_FLAG = "miservice_flag_themeOtaUpdate";
    private com.android.thememanager.util.cdj mBackupThemeForOtaUpdateTask;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "Receive:" + intent.getAction());
        if (TextUtils.equals(intent.getAction(), SWITCH_ACTION)) {
            String stringExtra = intent.getStringExtra(KEY_SWITCH_STATE);
            if (TextUtils.equals(intent.getStringExtra(KEY_SWITCH_FLAG), VALUE_SWITCH_FLAG)) {
                if (!TextUtils.equals(stringExtra, "1")) {
                    yz yzVar = new yz();
                    yzVar.jp0y();
                    yzVar.ncyb(null);
                    return;
                }
                File file = new File(yz.w97r);
                if (!file.exists() || file.list().length == 0) {
                    com.android.thememanager.util.cdj cdjVar = new com.android.thememanager.util.cdj(context);
                    this.mBackupThemeForOtaUpdateTask = cdjVar;
                    cdjVar.executeOnExecutor(C6002g.ld6(), new Void[0]);
                }
            }
        }
    }
}
