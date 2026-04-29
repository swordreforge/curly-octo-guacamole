package com.xiaomi.settingsdk.backup.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.xiaomi.settingsdk.backup.toq;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class KeyJsonSettingItem extends SettingItem<JSONObject> {
    public static final Parcelable.Creator<KeyJsonSettingItem> CREATOR = new Parcelable.Creator<KeyJsonSettingItem>() { // from class: com.xiaomi.settingsdk.backup.data.KeyJsonSettingItem.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public KeyJsonSettingItem createFromParcel(Parcel parcel) {
            KeyJsonSettingItem keyJsonSettingItem = new KeyJsonSettingItem();
            keyJsonSettingItem.f7l8(parcel);
            return keyJsonSettingItem;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public KeyJsonSettingItem[] newArray(int i2) {
            return new KeyJsonSettingItem[i2];
        }
    };

    /* JADX INFO: renamed from: g */
    public static final String f34358g = "json";

    @Override // com.xiaomi.settingsdk.backup.data.SettingItem
    protected Object ld6() {
        return getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaomi.settingsdk.backup.data.SettingItem
    /* JADX INFO: renamed from: o1t, reason: merged with bridge method [inline-methods] */
    public String fu4(JSONObject jSONObject) {
        return jSONObject.toString();
    }

    @Override // com.xiaomi.settingsdk.backup.data.SettingItem
    protected String x2() {
        return f34358g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaomi.settingsdk.backup.data.SettingItem
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public JSONObject ni7(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e2) {
            Log.e(toq.f34366k, "JSONException occorred when stringToValue()", e2);
            return null;
        }
    }

    @Override // com.xiaomi.settingsdk.backup.data.SettingItem
    protected void zurt(JSONObject jSONObject) {
        m22213h(jSONObject.optJSONObject("value"));
    }
}
