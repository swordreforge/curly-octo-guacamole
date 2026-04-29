package com.android.thememanager.basemodule.utils;

import android.content.Context;
import android.media.ExtraRingtoneManager;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import android.util.Log;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import kotlin.was;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: FixBug.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ld6 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final String f10347k = "FixBug";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f57771toq = UserHandle.getUserHandleForUid(Process.myUid()).hashCode();

    /* JADX INFO: renamed from: k */
    public static final void m7115k(int i2) {
        if (Build.VERSION.SDK_INT != 33) {
            return;
        }
        Class cls = Integer.TYPE;
        Method methodM7116g = lrht.m7116g(ExtraRingtoneManager.class, "getCacheForType", cls, cls);
        if (lrht.m7116g(ExtraRingtoneManager.class, "getMiuiRingtoneCacheName", String.class) != null || i2 <= 7 || methodM7116g == null) {
            return;
        }
        Context qVar = bf2.toq.toq();
        try {
            Uri uri = (Uri) methodM7116g.invoke(null, Integer.valueOf(i2), Integer.valueOf(f57771toq));
            if (uri == null) {
                return;
            }
            Log.i(f10347k, "try clear cache ringtone uri " + i2 + " : " + uri);
            OutputStream outputStreamOpenOutputStream = qVar.getContentResolver().openOutputStream(uri, "wt");
            if (outputStreamOpenOutputStream == null) {
                return;
            }
            try {
                Log.i(f10347k, "open out stream do nothing. " + uri);
                kotlin.io.zy.m23032k(outputStreamOpenOutputStream, null);
            } finally {
            }
        } catch (Exception e2) {
            Log.w(f10347k, "clearRingtoneCache " + i2 + ", fail " + e2);
        }
    }

    public static final void toq(int i2) {
        OutputStream outputStreamOpenOutputStream;
        Class cls = Integer.TYPE;
        int iAvailable = 0;
        Method methodM7116g = lrht.m7116g(ExtraRingtoneManager.class, "getCacheForType", cls, cls);
        if (methodM7116g == null) {
            return;
        }
        Context qVar = bf2.toq.toq();
        Uri uri = (Uri) methodM7116g.invoke(null, Integer.valueOf(i2), Integer.valueOf(f57771toq));
        if (uri == null) {
            return;
        }
        try {
            InputStream inputStreamOpenInputStream = qVar.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    iAvailable = inputStreamOpenInputStream.available();
                    was wasVar = was.f36763k;
                    kotlin.io.zy.m23032k(inputStreamOpenInputStream, null);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            Uri actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri(qVar, i2);
            if (actualDefaultRingtoneUri == null) {
                return;
            }
            try {
                inputStreamOpenInputStream = qVar.getContentResolver().openInputStream(actualDefaultRingtoneUri);
                if (inputStreamOpenInputStream == null) {
                    return;
                }
                try {
                    int iAvailable2 = inputStreamOpenInputStream.available();
                    if (iAvailable > 0 && iAvailable > iAvailable2 && (outputStreamOpenOutputStream = qVar.getContentResolver().openOutputStream(uri, "wt")) != null) {
                        try {
                            miuix.core.util.f7l8.m25528g(inputStreamOpenInputStream, outputStreamOpenOutputStream);
                            kotlin.io.zy.m23032k(outputStreamOpenOutputStream, null);
                        } finally {
                        }
                    }
                    was wasVar2 = was.f36763k;
                    kotlin.io.zy.m23032k(inputStreamOpenInputStream, null);
                } finally {
                }
            } catch (Exception unused) {
                Log.i(f10347k, "open " + i2 + " , " + actualDefaultRingtoneUri + " fail, can not auto fix");
            }
        } catch (Exception unused2) {
        }
    }

    public static final int zy() {
        return f57771toq;
    }
}
