package com.android.thememanager.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: OnlineUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class ek5k {

    /* JADX INFO: renamed from: k */
    private static final int f16410k = 1024;

    /* JADX INFO: renamed from: k */
    public static JSONArray m9706k(File file) throws JSONException, IOException {
        return new JSONArray(toq(file));
    }

    public static String toq(File file) throws Throwable {
        BufferedReader bufferedReader;
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)), 1024);
        } catch (Throwable th) {
            th = th;
        }
        try {
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                stringBuffer.append(line);
            }
            bufferedReader.close();
            return stringBuffer.toString();
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            throw th;
        }
    }

    public static JSONObject zy(File file) throws JSONException, IOException {
        return new JSONObject(toq(file));
    }
}
