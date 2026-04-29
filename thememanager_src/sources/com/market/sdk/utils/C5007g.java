package com.market.sdk.utils;

import android.os.Bundle;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.market.sdk.utils.g */
/* JADX INFO: compiled from: CollectionUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5007g {
    public static <T> ConcurrentLinkedQueue<T> f7l8() {
        return new ConcurrentLinkedQueue<>();
    }

    /* JADX INFO: renamed from: g */
    public static <T, K> ConcurrentHashMap<T, K> m17425g() {
        return new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: k */
    public static Map<String, String> m17426k(Bundle bundle) {
        ConcurrentHashMap concurrentHashMapM17425g = m17425g();
        for (String str : bundle.keySet()) {
            concurrentHashMapM17425g.put(str, bundle.getString(str));
        }
        return concurrentHashMapM17425g;
    }

    public static <T> LongSparseArray<T> ld6() {
        return new LongSparseArray<>();
    }

    /* JADX INFO: renamed from: n */
    public static <T> ArrayList<T> m17427n() {
        return new ArrayList<>();
    }

    /* JADX INFO: renamed from: p */
    public static <T> HashSet<T> m17428p() {
        return new HashSet<>();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m17429q(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    /* JADX INFO: renamed from: s */
    public static <T, K> HashMap<T, K> m17430s() {
        return new HashMap<>();
    }

    public static Bundle toq(Map<String, String> map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                bundle.putString(str, map.get(str));
            }
        }
        return bundle;
    }

    public static <T> SparseArray<T> x2() {
        return new SparseArray<>();
    }

    /* JADX INFO: renamed from: y */
    public static <T> CopyOnWriteArraySet<T> m17431y() {
        return new CopyOnWriteArraySet<>();
    }

    public static boolean zy(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }
}
