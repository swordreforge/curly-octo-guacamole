package com.xiaomi.accountsdk.utils;

import java.util.HashMap;

/* JADX INFO: compiled from: EasyMap.java */
/* JADX INFO: loaded from: classes3.dex */
public class n7h<K, V> extends HashMap<K, V> {
    private static final long serialVersionUID = -7846033686833655451L;

    public n7h() {
    }

    public n7h<K, V> easyPut(K k2, V v2) {
        put(k2, v2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n7h<K, V> easyPutOpt(K k2, V v2) {
        boolean zIsEmpty = true;
        if (k2 == null || v2 == 0) {
            zIsEmpty = false;
        } else if (v2 instanceof String) {
            zIsEmpty = true ^ ((String) v2).isEmpty();
        }
        if (zIsEmpty) {
            put(k2, v2);
        }
        return this;
    }

    public n7h(K k2, V v2) {
        put(k2, v2);
    }
}
