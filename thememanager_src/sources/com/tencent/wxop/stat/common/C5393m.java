package com.tencent.wxop.stat.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.tencent.wxop.stat.common.m */
/* JADX INFO: loaded from: classes3.dex */
class C5393m {
    /* JADX INFO: renamed from: a */
    static int m18451a() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new C5394n()).length;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 1;
        }
    }

    /* JADX INFO: renamed from: b */
    static int m18452b() {
        int iIntValue = 0;
        try {
            String str = "";
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            while (inputStream.read(bArr) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
            String strTrim = str.trim();
            if (strTrim.length() > 0) {
                iIntValue = Integer.valueOf(strTrim).intValue();
            }
        } catch (Exception e2) {
            C5392l.f30157k.m18376e((Throwable) e2);
        }
        return iIntValue * 1000;
    }

    /* JADX INFO: renamed from: c */
    static int m18453c() {
        int iIntValue = 0;
        try {
            String str = "";
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            while (inputStream.read(bArr) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
            String strTrim = str.trim();
            if (strTrim.length() > 0) {
                iIntValue = Integer.valueOf(strTrim).intValue();
            }
        } catch (Throwable th) {
            C5392l.f30157k.m18376e(th);
        }
        return iIntValue * 1000;
    }

    /* JADX INFO: renamed from: d */
    static String m18454d() {
        String[] strArr = {"", ""};
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"), 8192);
            String[] strArrSplit = bufferedReader.readLine().split("\\s+");
            for (int i2 = 2; i2 < strArrSplit.length; i2++) {
                strArr[0] = strArr[0] + strArrSplit[i2] + " ";
            }
            bufferedReader.close();
        } catch (IOException unused) {
        }
        return strArr[0];
    }
}
