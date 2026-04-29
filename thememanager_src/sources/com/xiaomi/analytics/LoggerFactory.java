package com.xiaomi.analytics;

import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.analytics.BaseLogger;
import com.xiaomi.analytics.internal.util.C5609k;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
class LoggerFactory<T extends BaseLogger> {
    private static final String TAG = "LoggerFactory";
    public ConcurrentHashMap<String, T> mMap = new ConcurrentHashMap<>();

    public T getLogger(Class<T> cls, String str) {
        if (TextUtils.isEmpty(str) || cls == null) {
            throw new IllegalArgumentException("Clazz is null or configKey is empty. configKey:" + str);
        }
        T t2 = this.mMap.get(str);
        if (t2 != null) {
            return t2;
        }
        try {
            T tNewInstance = cls.getDeclaredConstructor(String.class).newInstance(str);
            this.mMap.put(str, tNewInstance);
            return tNewInstance;
        } catch (Exception e2) {
            Log.e(C5609k.m19240k(TAG), "getLogger e", e2);
            throw new IllegalStateException("Can not instantiate logger. configKey:" + str);
        }
    }
}
