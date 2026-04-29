package com.android.thememanager;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.FileProvider;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class AodPreviewProvider extends ContentProvider {

    /* JADX INFO: renamed from: h */
    private static final String f8555h = "thumbnail_width";

    /* JADX INFO: renamed from: i */
    private static final String f8556i = "thumbnail_height";

    /* JADX INFO: renamed from: p */
    private static final String f8557p = "uri";

    /* JADX INFO: renamed from: s */
    private static final String f8558s = "getThumbnail";

    /* JADX INFO: renamed from: y */
    private static final String f8559y = "AodPreviewProvider";

    /* JADX INFO: renamed from: k */
    private Uri f8561k;

    /* JADX INFO: renamed from: q */
    private File f8563q;

    /* JADX INFO: renamed from: n */
    private int f8562n = 825;

    /* JADX INFO: renamed from: g */
    private int f8560g = 990;

    /* JADX INFO: renamed from: k */
    private void m6304k() {
        File file = new File(getContext().getCacheDir(), "images");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "thumbnail.png");
        this.f8563q = file2;
        if (file2.exists()) {
            this.f8563q.delete();
        }
        this.f8561k = FileProvider.m2162g(getContext(), com.android.thememanager.basemodule.resource.constants.toq.o9qk, this.f8563q);
        getContext().grantUriPermission(getCallingPackage(), this.f8561k, 1);
    }

    @Override // android.content.ContentProvider
    public Bundle call(@zy.lvui String method, @zy.dd String arg, @zy.dd Bundle extras) {
        Log.d(f8559y, "call " + method + " " + getCallingPackage());
        if (!f8558s.equals(method)) {
            return null;
        }
        if (extras != null && extras.containsKey(f8555h) && extras.containsKey(f8556i)) {
            this.f8562n = extras.getInt(f8555h);
            this.f8560g = extras.getInt(f8556i);
        }
        m6304k();
        if (this.f8561k == null) {
            return null;
        }
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(f8557p, this.f8561k);
        Log.d(f8559y, "call end " + method);
        return bundle;
    }

    @Override // android.content.ContentProvider
    public int delete(@zy.lvui Uri uri, @zy.dd String selection, @zy.dd String[] selectionArgs) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(@zy.lvui Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(@zy.lvui Uri uri, @zy.dd ContentValues values) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(@zy.lvui Uri uri, @zy.dd String[] projection, @zy.dd String selection, @zy.dd String[] selectionArgs, @zy.dd String sortOrder) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@zy.lvui Uri uri, @zy.dd ContentValues values, @zy.dd String selection, @zy.dd String[] selectionArgs) {
        return 0;
    }
}
