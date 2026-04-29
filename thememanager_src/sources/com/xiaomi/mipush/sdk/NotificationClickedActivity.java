package com.xiaomi.mipush.sdk;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.exoplayer2.C3548p;
import com.xiaomi.push.verb;

/* JADX INFO: loaded from: classes3.dex */
public final class NotificationClickedActivity extends Activity {

    /* JADX INFO: renamed from: a */
    private BroadcastReceiver f31305a;

    /* JADX INFO: renamed from: a */
    private Handler f31306a;

    /* JADX INFO: renamed from: a */
    private void m19362a(Intent intent) {
        try {
            if (intent != null) {
                Intent intent2 = (Intent) intent.getParcelableExtra("mipush_serviceIntent");
                if (intent2 != null) {
                    intent2.setComponent(new ComponentName(getPackageName(), "com.xiaomi.mipush.sdk.PushMessageHandler"));
                    intent2.putExtra("is_clicked_activity_call", true);
                    com.xiaomi.channel.commonutils.logger.zy.m19293h("PushClickedActivity", "clicked activity start service.");
                    startService(intent2);
                } else {
                    com.xiaomi.channel.commonutils.logger.zy.mcp("PushClickedActivity", "clicked activity start service, newIntent is null");
                }
            } else {
                com.xiaomi.channel.commonutils.logger.zy.mcp("PushClickedActivity", "clicked activity start service, missing intent");
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = 1;
        attributes.width = 1;
        attributes.gravity = 8388659;
        window.setAttributes(attributes);
        Handler handler = new Handler();
        this.f31306a = handler;
        handler.postDelayed(new RunnableC5667x(this), C3548p.f65176gcp);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_clicked_activity_finish");
        ch chVar = new ch(this);
        this.f31305a = chVar;
        try {
            verb.m21902q(this, chVar, intentFilter, n5r1.m19528k(this), null, 4);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f31306a.removeCallbacksAndMessages(null);
        try {
            unregisterReceiver(this.f31305a);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        m19362a(getIntent());
    }
}
