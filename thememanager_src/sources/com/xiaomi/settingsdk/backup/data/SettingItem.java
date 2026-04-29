package com.xiaomi.settingsdk.backup.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SettingItem<T> implements Parcelable, Comparable<SettingItem<?>> {
    private static final String KEY_KEY = "key";
    private static final String KEY_TYPE = "type";

    /* JADX INFO: renamed from: n */
    protected static final String f34360n = "value";

    /* JADX INFO: renamed from: q */
    protected static final String f34361q = "SettingsBackup";

    /* JADX INFO: renamed from: k */
    public String f34362k;
    private T value;

    /* JADX INFO: renamed from: p */
    public static SettingItem<?> m22212p(JSONObject jSONObject) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("json cannot be null");
        }
        SettingItem<?> settingItemZy = zy(jSONObject.optString("type"));
        if (settingItemZy == null) {
            return null;
        }
        settingItemZy.f34362k = jSONObject.optString("key");
        settingItemZy.zurt(jSONObject);
        return settingItemZy;
    }

    private static SettingItem<?> zy(String str) {
        if ("string".equals(str)) {
            return new KeyStringSettingItem();
        }
        if (KeyBinarySettingItem.f34357g.equals(str)) {
            return new KeyBinarySettingItem();
        }
        if (KeyJsonSettingItem.f34358g.equals(str)) {
            return new KeyJsonSettingItem();
        }
        Log.w("SettingsBackup", "type: " + str + " are not handled!");
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected void f7l8(Parcel parcel) {
        String string = parcel.readString();
        String string2 = parcel.readString();
        this.f34362k = string;
        m22213h(ni7(string2));
    }

    protected abstract String fu4(T t2);

    public T getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: h */
    public void m22213h(T t2) {
        this.value = t2;
    }

    protected abstract Object ld6();

    protected abstract T ni7(String str);

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", this.f34362k);
            jSONObject.put("type", x2());
            jSONObject.put("value", ld6());
        } catch (JSONException e2) {
            Log.e("SettingsBackup", "JSONException occorred when toJson()", e2);
        }
        return jSONObject;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public int compareTo(SettingItem<?> settingItem) {
        if (settingItem == null) {
            return 1;
        }
        String str = this.f34362k;
        if (str != null || settingItem.f34362k == null) {
            return str.compareTo(settingItem.f34362k);
        }
        return -1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        String strFu4 = fu4(getValue());
        parcel.writeString(this.f34362k);
        parcel.writeString(strFu4);
    }

    protected abstract String x2();

    protected abstract void zurt(JSONObject jSONObject);
}
