package com.xiaomi.push;

import android.util.Log;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ydj3 {

    /* JADX INFO: renamed from: k */
    private static final HashMap<String, String> f34212k;

    static {
        HashMap<String, String> map = new HashMap<>();
        f34212k = map;
        map.put("FFD8FF", "jpg");
        map.put("89504E47", "png");
        map.put("47494638", "gif");
        map.put("474946", "gif");
        map.put("424D", "bmp");
    }

    /* JADX INFO: renamed from: k */
    public static long m22051k(File file) {
        long jM22051k = 0;
        try {
            File[] fileArrListFiles = file.listFiles();
            for (int i2 = 0; i2 < fileArrListFiles.length; i2++) {
                jM22051k += fileArrListFiles[i2].isDirectory() ? m22051k(fileArrListFiles[i2]) : fileArrListFiles[i2].length();
            }
        } catch (Exception e2) {
            Log.e("FileUtils", "Get folder size error: " + e2.getMessage());
        }
        return jM22051k;
    }

    public static boolean toq(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.exists()) {
                return (file.isDirectory() ? m22051k(file) : file.length()) < 104857600;
            }
            return true;
        } catch (Exception e2) {
            Log.e("FileUtils", "Check if internal file can be written error :" + e2.getMessage());
            return false;
        }
    }
}
