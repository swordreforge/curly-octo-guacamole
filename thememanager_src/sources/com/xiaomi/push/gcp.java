package com.xiaomi.push;

import android.util.Pair;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class gcp {

    /* JADX INFO: renamed from: k */
    private static Vector<Pair<String, Long>> f32964k = new Vector<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static ConcurrentHashMap<String, Long> f73343toq = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: k */
    public static String m20898k() {
        StringBuilder sb = new StringBuilder();
        synchronized (f32964k) {
            for (int i2 = 0; i2 < f32964k.size(); i2++) {
                Pair<String, Long> pairElementAt = f32964k.elementAt(i2);
                sb.append((String) pairElementAt.first);
                sb.append(":");
                sb.append(pairElementAt.second);
                if (i2 < f32964k.size() - 1) {
                    sb.append(";");
                }
            }
            f32964k.clear();
        }
        return sb.toString();
    }
}
