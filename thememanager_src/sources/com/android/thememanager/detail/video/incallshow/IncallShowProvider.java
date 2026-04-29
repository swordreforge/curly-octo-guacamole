package com.android.thememanager.detail.video.incallshow;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import gyi.C6068k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class IncallShowProvider extends ContentProvider {

    /* JADX INFO: renamed from: k */
    public static final String f11417k = "com.android.thememanager.incall";

    /* JADX INFO: renamed from: q */
    public static final String f11418q = "phone";

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
        new C6068k(getContext()).zy();
        return true;
    }

    @Override // android.content.ContentProvider
    @dd
    public Cursor query(@lvui Uri uri, @dd String[] projection, @dd String selection, @dd String[] selectionArgs, @dd String sortOrder) {
        if (uri.getAuthority() == null || !uri.getAuthority().startsWith(f11417k)) {
            return null;
        }
        return C6068k.m22355p(getContext(), uri.getQueryParameter("phone"), getCallingPackage());
    }

    @Override // android.content.ContentProvider
    public int update(@lvui Uri uri, @dd ContentValues values, @dd String selection, @dd String[] selectionArgs) {
        return 0;
    }
}
