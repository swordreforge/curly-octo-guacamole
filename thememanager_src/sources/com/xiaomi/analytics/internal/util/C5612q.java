package com.xiaomi.analytics.internal.util;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: com.xiaomi.analytics.internal.util.q */
/* JADX INFO: compiled from: AssetUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5612q {

    /* JADX INFO: renamed from: k */
    private static final String f31213k = "AssetUtils";

    /* JADX INFO: renamed from: k */
    public static void m19253k(Context context, String str, String str2) throws Throwable {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        InputStream inputStreamOpen;
        byte[] qVar;
        InputStream inputStream = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            try {
                qVar = f7l8.toq(inputStreamOpen);
                File file = new File(str2);
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        String qVar2 = kja0.toq(f7l8.toq(fileInputStream));
                        String qVar3 = kja0.toq(qVar);
                        if (!TextUtils.isEmpty(qVar2) && qVar2.equals(qVar3)) {
                            f7l8.m19236k(inputStreamOpen);
                            f7l8.m19236k(fileInputStream);
                            f7l8.m19236k(null);
                            return;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream = null;
                        inputStream = inputStreamOpen;
                        try {
                            Log.e(C5609k.m19240k(f31213k), "extractAssetFile e", e);
                            f7l8.m19236k(inputStream);
                            f7l8.m19236k(fileInputStream);
                            f7l8.m19236k(fileOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            f7l8.m19236k(inputStream);
                            f7l8.m19236k(fileInputStream);
                            f7l8.m19236k(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                        inputStream = inputStreamOpen;
                        f7l8.m19236k(inputStream);
                        f7l8.m19236k(fileInputStream);
                        f7l8.m19236k(fileOutputStream);
                        throw th;
                    }
                } else {
                    fileInputStream = null;
                }
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception e3) {
                e = e3;
                fileInputStream = null;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                fileOutputStream = null;
            }
        } catch (Exception e4) {
            e = e4;
            fileInputStream = null;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(qVar);
            fileOutputStream.flush();
            f7l8.m19236k(inputStreamOpen);
        } catch (Exception e6) {
            e = e6;
            inputStream = inputStreamOpen;
            Log.e(C5609k.m19240k(f31213k), "extractAssetFile e", e);
            f7l8.m19236k(inputStream);
        } catch (Throwable th5) {
            th = th5;
            inputStream = inputStreamOpen;
            f7l8.m19236k(inputStream);
            f7l8.m19236k(fileInputStream);
            f7l8.m19236k(fileOutputStream);
            throw th;
        }
        f7l8.m19236k(fileInputStream);
        f7l8.m19236k(fileOutputStream);
    }
}
