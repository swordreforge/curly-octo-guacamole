package ch;

import java.util.Iterator;

/* JADX INFO: renamed from: ch.k */
/* JADX INFO: compiled from: IKVPreference.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1395k {
    void apply();

    void commit();

    boolean contains(String key);

    boolean getBoolean(String key, boolean defValue);

    int getInt(String key, int defValue);

    long getLong(String key, long defValue);

    String getString(String key, String defValue);

    Iterator<String> keySet();

    InterfaceC1395k putBoolean(String key, boolean value);

    InterfaceC1395k putInt(String key, int value);

    InterfaceC1395k putLong(String key, long value);

    InterfaceC1395k putString(String key, String value);

    InterfaceC1395k remove(String key);

    int size();
}
