package com.xiaomi.analytics.internal.util;

import java.io.File;

/* JADX INFO: renamed from: com.xiaomi.analytics.internal.util.g */
/* JADX INFO: compiled from: FileUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5608g {
    /* JADX INFO: renamed from: k */
    public static void m19237k(File file) {
        try {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    if (file2.isDirectory()) {
                        zy(file2.getAbsolutePath());
                    } else {
                        m19238q(file2);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m19238q(File file) {
        try {
            file.delete();
        } catch (Exception unused) {
        }
    }

    public static void toq(String str) {
        m19237k(new File(str));
    }

    public static void zy(String str) {
        try {
            File file = new File(str);
            toq(str);
            file.delete();
        } catch (Exception unused) {
        }
    }
}
