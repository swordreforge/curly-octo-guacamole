package com.miui.maml;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.miui.maml.util.LargeIconsHelper;
import com.miui.maml.util.MamlLog;
import java.util.ArrayList;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class MamlProvider extends ContentProvider {
    private static final String METHOD_CHANGE_LARGE_ICON = "changeLargeIcon";

    @Override // android.content.ContentProvider
    @dd
    public Bundle call(@lvui String str, @dd String str2, @dd Bundle bundle) {
        String str3;
        ArrayList<String> arrayList = null;
        if (!METHOD_CHANGE_LARGE_ICON.equals(str)) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        MamlLog.m17853i("LargeIconsConfigManager", "Large icon config file changed");
        if (bundle != null) {
            String string = bundle.getString("mode");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("relativePackageList");
            str3 = string;
            arrayList = stringArrayList;
        } else {
            str3 = null;
        }
        LargeIconsHelper.clearCache(arrayList);
        LargeIconsHelper.getLargeIconConfigFile(str3, true);
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public int delete(@lvui Uri uri, @dd String str, @dd String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @dd
    public String getType(@lvui Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @dd
    public Uri insert(@lvui Uri uri, @dd ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    @dd
    public Cursor query(@lvui Uri uri, @dd String[] strArr, @dd String str, @dd String[] strArr2, @dd String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@lvui Uri uri, @dd ContentValues contentValues, @dd String str, @dd String[] strArr) {
        return 0;
    }
}
