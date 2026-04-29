package com.miui.maml.util;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class SharedPreferenceHelper {
    private static final int MODE = 0;
    private static HashMap<String, SharedPreferenceHelper> sInstanceMap;
    private final SharedPreferences mSharedPreferences;

    private SharedPreferenceHelper(Context context, String str) {
        this.mSharedPreferences = context.getSharedPreferences(str, 0);
    }

    public static synchronized SharedPreferenceHelper getInstance(Context context, String str) {
        SharedPreferenceHelper sharedPreferenceHelper;
        if (sInstanceMap == null) {
            sInstanceMap = new HashMap<>();
        }
        sharedPreferenceHelper = sInstanceMap.get(str);
        if (sharedPreferenceHelper == null) {
            sharedPreferenceHelper = new SharedPreferenceHelper(context, str);
            sInstanceMap.put(str, sharedPreferenceHelper);
        }
        return sharedPreferenceHelper;
    }

    public void clearSharePreference() {
        SharedPreferences.Editor editorEdit = this.mSharedPreferences.edit();
        editorEdit.clear();
        editorEdit.commit();
    }

    public boolean containsKey(String str) {
        return this.mSharedPreferences.contains(str);
    }

    public void deleteKey(String str) {
        SharedPreferences.Editor editorEdit = this.mSharedPreferences.edit();
        editorEdit.remove(str);
        editorEdit.commit();
    }

    public long load(String str, long j2) {
        return this.mSharedPreferences.getLong(str, j2);
    }

    public Set<String> loadStringSet(String str) {
        return this.mSharedPreferences.getStringSet(str, new HashSet());
    }

    public boolean save(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.mSharedPreferences.edit();
        try {
            editorEdit.putString(str, str2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return editorEdit.commit();
    }

    public boolean load(String str, boolean z2) {
        return this.mSharedPreferences.getBoolean(str, z2);
    }

    public float load(String str, float f2) {
        return this.mSharedPreferences.getFloat(str, f2);
    }

    public int load(String str, int i2) {
        return this.mSharedPreferences.getInt(str, i2);
    }

    public String load(String str, String str2) {
        return this.mSharedPreferences.getString(str, str2);
    }

    public boolean save(String str, int i2) {
        SharedPreferences.Editor editorEdit = this.mSharedPreferences.edit();
        try {
            editorEdit.putInt(str, i2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return editorEdit.commit();
    }

    public boolean save(String str, long j2) {
        SharedPreferences.Editor editorEdit = this.mSharedPreferences.edit();
        try {
            editorEdit.putLong(str, j2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return editorEdit.commit();
    }

    public boolean save(String str, boolean z2) {
        SharedPreferences.Editor editorEdit = this.mSharedPreferences.edit();
        editorEdit.putBoolean(str, z2);
        return editorEdit.commit();
    }

    public boolean save(String str, float f2) {
        SharedPreferences.Editor editorEdit = this.mSharedPreferences.edit();
        try {
            editorEdit.putFloat(str, f2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return editorEdit.commit();
    }
}
