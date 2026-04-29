package com.xiaomi.onetrack;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.xiaomi.onetrack.p017f.C5756a;
import com.xiaomi.onetrack.util.C5782o;
import com.xiaomi.onetrack.util.oaid.C5783a;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class OneTrackDebugger {

    /* JADX INFO: renamed from: a */
    private static volatile OneTrackDebugger f31525a = null;

    /* JADX INFO: renamed from: b */
    private static String f31526b = "com.xiaomi.onetrack.otdebugger.FloatWindowService";

    /* JADX INFO: renamed from: c */
    private ConcurrentHashMap<Long, Configuration> f31527c = new ConcurrentHashMap<>();

    private OneTrackDebugger() {
    }

    public static OneTrackDebugger getInstance() {
        if (f31525a == null) {
            synchronized (OneTrackDebugger.class) {
                if (f31525a == null) {
                    f31525a = new OneTrackDebugger();
                }
            }
        }
        return f31525a;
    }

    public String getInstanceId() {
        return C5782o.m20286a().m20292b();
    }

    public String getOaid(Context context) {
        return C5783a.m20293a().m20295a(context.getApplicationContext());
    }

    public ConcurrentHashMap<Long, Configuration> getSdkConfig() {
        return this.f31527c;
    }

    public void setSdkConfig(Configuration configuration) {
        this.f31527c.put(Long.valueOf(System.currentTimeMillis()), configuration);
    }

    public void startDebugger() {
        try {
            C5756a.m20053b().startService(new Intent(C5756a.m20053b(), Class.forName(f31526b)));
        } catch (Throwable th) {
            Log.d("startDebugger", th.getMessage());
        }
    }
}
