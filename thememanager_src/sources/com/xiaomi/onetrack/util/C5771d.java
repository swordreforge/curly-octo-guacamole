package com.xiaomi.onetrack.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import com.xiaomi.onetrack.p017f.C5756a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.d */
/* JADX INFO: loaded from: classes3.dex */
public class C5771d {

    /* JADX INFO: renamed from: a */
    private static final String f32291a = "d";

    /* JADX INFO: renamed from: b */
    private static final String f32292b = "com.xiaomi.onetrack.DEBUG";

    /* JADX INFO: renamed from: c */
    private static final String f32293c = "com.xiaomi.onetrack.permissions.DEBUG_MODE";

    /* JADX INFO: renamed from: d */
    private static final String f32294d = "/api/open/device/writeBack";

    /* JADX INFO: renamed from: e */
    private static final String f32295e = "http://";

    /* JADX INFO: renamed from: f */
    private static final String f32296f = "https://";

    /* JADX INFO: renamed from: g */
    private static final String f32297g = ".mi.com";

    /* JADX INFO: renamed from: h */
    private static volatile C5771d f32298h = null;

    /* JADX INFO: renamed from: i */
    private static final int f32299i = 100;

    /* JADX INFO: renamed from: j */
    private final Context f32300j;

    /* JADX INFO: renamed from: k */
    private Handler f32301k = new HandlerC5772e(this, Looper.getMainLooper());

    /* JADX INFO: renamed from: l */
    private BroadcastReceiver f32302l = new C5773f(this);

    private C5771d() {
        Context contextM20053b = C5756a.m20053b();
        this.f32300j = contextM20053b;
        m20245a(contextM20053b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m20255c(String str) {
        Toast.makeText(this.f32300j, str, 1).show();
    }

    /* JADX INFO: renamed from: a */
    public static C5771d m20244a() {
        if (f32298h == null) {
            synchronized (C5771d.class) {
                if (f32298h == null) {
                    f32298h = new C5771d();
                }
            }
        }
        return f32298h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m20252b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("code");
            String strOptString = jSONObject.optString("message");
            String strOptString2 = jSONObject.optString("result");
            boolean zOptBoolean = jSONObject.optBoolean("success");
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            Bundle bundle = new Bundle();
            if (iOptInt == 0 && zOptBoolean) {
                bundle.putString("hint", strOptString2);
            } else {
                bundle.putString("hint", strOptString);
            }
            messageObtain.setData(bundle);
            this.f32301k.sendMessage(messageObtain);
        } catch (JSONException e2) {
            C5804p.m20347b(f32291a, e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m20245a(Context context) {
        if (context == null) {
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(f32292b);
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this.f32302l, intentFilter, f32293c, null, 2);
            } else {
                context.registerReceiver(this.f32302l, intentFilter, f32293c, null);
            }
        } catch (Exception e2) {
            C5804p.m20342a(f32291a, "registerDebugModeReceiver: " + e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m20249a(String str) {
        return !TextUtils.isEmpty(str) && str.endsWith(f32297g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m20248a(String str, String str2, String str3) {
        C5776i.m20256a(new RunnableC5774g(this, str, str2, str3));
    }
}
