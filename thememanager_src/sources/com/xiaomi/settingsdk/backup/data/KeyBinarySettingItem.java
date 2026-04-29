package com.xiaomi.settingsdk.backup.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class KeyBinarySettingItem extends SettingItem<byte[]> {
    public static final Parcelable.Creator<KeyBinarySettingItem> CREATOR = new Parcelable.Creator<KeyBinarySettingItem>() { // from class: com.xiaomi.settingsdk.backup.data.KeyBinarySettingItem.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public KeyBinarySettingItem createFromParcel(Parcel parcel) {
            KeyBinarySettingItem keyBinarySettingItem = new KeyBinarySettingItem();
            keyBinarySettingItem.f7l8(parcel);
            return keyBinarySettingItem;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public KeyBinarySettingItem[] newArray(int i2) {
            return new KeyBinarySettingItem[i2];
        }
    };

    /* JADX INFO: renamed from: g */
    public static final String f34357g = "binary";

    @Override // com.xiaomi.settingsdk.backup.data.SettingItem
    protected Object ld6() {
        return fu4(getValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaomi.settingsdk.backup.data.SettingItem
    /* JADX INFO: renamed from: o1t, reason: merged with bridge method [inline-methods] */
    public String fu4(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    @Override // com.xiaomi.settingsdk.backup.data.SettingItem
    protected String x2() {
        return f34357g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaomi.settingsdk.backup.data.SettingItem
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public byte[] ni7(String str) {
        return Base64.decode(str, 2);
    }

    @Override // com.xiaomi.settingsdk.backup.data.SettingItem
    protected void zurt(JSONObject jSONObject) {
        m22213h(ni7(jSONObject.optString("value")));
    }
}
