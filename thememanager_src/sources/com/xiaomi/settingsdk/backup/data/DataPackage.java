package com.xiaomi.settingsdk.backup.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class DataPackage implements Parcelable {
    public static final Parcelable.Creator<DataPackage> CREATOR = new Parcelable.Creator<DataPackage>() { // from class: com.xiaomi.settingsdk.backup.data.DataPackage.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public DataPackage createFromParcel(Parcel parcel) {
            return DataPackage.zurt(parcel.readBundle());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public DataPackage[] newArray(int i2) {
            return new DataPackage[i2];
        }
    };

    /* JADX INFO: renamed from: k */
    public static final String f34355k = "data_package";

    /* JADX INFO: renamed from: q */
    public static final String f34356q = "version";
    private final Map<String, SettingItem<?>> mDataItems = new HashMap();
    private final Map<String, ParcelFileDescriptor> mFileItems = new HashMap();

    /* JADX INFO: renamed from: p */
    public static DataPackage m22201p(Bundle bundle) {
        Bundle bundle2 = (Bundle) bundle.clone();
        bundle2.setClassLoader(SettingItem.class.getClassLoader());
        return zurt(bundle2.getBundle(f34355k));
    }

    public static int t8r(Bundle bundle) {
        return bundle.getInt("version");
    }

    private Bundle x2() {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, SettingItem<?>> entry : this.mDataItems.entrySet()) {
            bundle.putParcelable(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, ParcelFileDescriptor> entry2 : this.mFileItems.entrySet()) {
            bundle.putParcelable(entry2.getKey(), entry2.getValue());
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DataPackage zurt(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(SettingItem.class.getClassLoader());
        DataPackage dataPackage = new DataPackage();
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            if (parcelable instanceof SettingItem) {
                dataPackage.mDataItems.put(str, (SettingItem) parcelable);
            }
            if (parcelable instanceof ParcelFileDescriptor) {
                dataPackage.mFileItems.put(str, (ParcelFileDescriptor) parcelable);
            }
        }
        return dataPackage;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void f7l8(String str, String str2) {
        KeyStringSettingItem keyStringSettingItem = new KeyStringSettingItem();
        keyStringSettingItem.f34362k = str;
        keyStringSettingItem.m22213h(str2);
        this.mDataItems.put(str, keyStringSettingItem);
    }

    /* JADX INFO: renamed from: g */
    public void m22202g(String str, JSONObject jSONObject) {
        KeyJsonSettingItem keyJsonSettingItem = new KeyJsonSettingItem();
        keyJsonSettingItem.f34362k = str;
        keyJsonSettingItem.m22213h(jSONObject);
        this.mDataItems.put(str, keyJsonSettingItem);
    }

    public Map<String, SettingItem<?>> getDataItems() {
        return this.mDataItems;
    }

    public Map<String, ParcelFileDescriptor> getFileItems() {
        return this.mFileItems;
    }

    /* JADX INFO: renamed from: h */
    public ParcelFileDescriptor m22203h(String str) {
        return this.mFileItems.get(str);
    }

    public SettingItem<?> ld6(String str) {
        return this.mDataItems.get(str);
    }

    public void toq(String str, SettingItem<?> settingItem) {
        this.mDataItems.put(str, settingItem);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(x2());
    }

    /* JADX INFO: renamed from: y */
    public void m22204y(Bundle bundle) {
        bundle.putBundle(f34355k, x2());
    }

    public void zy(String str, File file) throws FileNotFoundException {
        this.mFileItems.put(str, ParcelFileDescriptor.open(file, 268435456));
    }
}
