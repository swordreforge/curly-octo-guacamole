package com.android.thememanager.clockmessage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class ClockMessageProvider extends ContentProvider {

    /* JADX INFO: renamed from: g */
    public static final String f10637g = "updateTriggerStatus";

    /* JADX INFO: renamed from: n */
    public static final Uri f10638n = Uri.parse("content://com.android.thememanager.community");

    /* JADX INFO: renamed from: q */
    public static final String f10639q = "com.android.thememanager.community";

    /* JADX INFO: renamed from: y */
    private static final String f10640y = "/getMessage";

    /* JADX INFO: renamed from: k */
    private C1875q f10641k;

    @Override // android.content.ContentProvider
    @dd
    public Bundle call(@lvui String method, @dd String arg, @dd Bundle extras) {
        if (f10637g.equals(method) && extras != null) {
            C1875q.m7391g().d3(extras.getBoolean(C1875q.f57861n7h), extras.getBoolean(C1875q.f57859kja0));
        }
        return super.call(method, arg, extras);
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

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        C1875q c1875q = this.f10641k;
        if (c1875q != null) {
            c1875q.gvn7(false);
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f10641k = C1875q.m7391g();
        return true;
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
