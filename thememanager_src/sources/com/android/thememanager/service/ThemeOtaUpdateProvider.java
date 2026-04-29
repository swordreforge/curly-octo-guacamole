package com.android.thememanager.service;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.android.thememanager.util.yz;
import ek5k.C6002g;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeOtaUpdateProvider extends ContentProvider {

    /* JADX INFO: renamed from: k */
    private static final String f14713k = "ThemeOtaUpdateProvider";

    /* JADX INFO: renamed from: q */
    private static final String f14714q = "getCurrentThemeState";

    @Override // android.content.ContentProvider
    @dd
    public Bundle call(@lvui String method, @dd String arg, @dd Bundle extras) {
        Bundle bundle = new Bundle();
        if (f14714q.equals(method)) {
            Log.d(f14713k, "getCurrentThemeState is called");
            new yz.AsyncTaskC2822k().executeOnExecutor(C6002g.ld6(), new Void[0]);
        }
        return bundle;
    }

    @Override // android.content.ContentProvider
    public int delete(@lvui Uri uri, @dd String selection, @dd String[] selectionArgs) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @dd
    public String getType(@lvui Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @dd
    public Uri insert(@lvui Uri uri, @dd ContentValues values) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    @dd
    public Cursor query(@lvui Uri uri, @dd String[] projection, @dd String selection, @dd String[] selectionArgs, @dd String sortOrder) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@lvui Uri uri, @dd ContentValues values, @dd String selection, @dd String[] selectionArgs) {
        return 0;
    }
}
