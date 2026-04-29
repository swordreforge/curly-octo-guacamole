package com.xiaomi.settingsdk.backup.data;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class KeyStringSettingItem extends SettingItem<String> {
    public static final Parcelable.Creator<KeyStringSettingItem> CREATOR = new Parcelable.Creator<KeyStringSettingItem>() { // from class: com.xiaomi.settingsdk.backup.data.KeyStringSettingItem.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public KeyStringSettingItem createFromParcel(Parcel parcel) {
            KeyStringSettingItem keyStringSettingItem = new KeyStringSettingItem();
            keyStringSettingItem.f7l8(parcel);
            return keyStringSettingItem;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public KeyStringSettingItem[] newArray(int i2) {
            return new KeyStringSettingItem[i2];
        }
    };

    /* JADX INFO: renamed from: g */
    public static final String f34359g = "string";

    @Override // com.xiaomi.settingsdk.backup.data.SettingItem
    protected Object ld6() {
        return getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaomi.settingsdk.backup.data.SettingItem
    /* JADX INFO: renamed from: o1t, reason: merged with bridge method [inline-methods] */
    public String fu4(String str) {
        return str;
    }

    @Override // com.xiaomi.settingsdk.backup.data.SettingItem
    protected String x2() {
        return "string";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaomi.settingsdk.backup.data.SettingItem
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public String ni7(String str) {
        return str;
    }

    @Override // com.xiaomi.settingsdk.backup.data.SettingItem
    protected void zurt(JSONObject jSONObject) {
        m22213h(jSONObject.optString("value"));
    }
}
