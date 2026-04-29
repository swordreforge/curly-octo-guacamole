package com.android.thememanager.service;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.vyq;
import com.android.thememanager.util.y9n;
import java.util.List;
import miui.app.constants.ThemeManagerConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeRuntimeDataProvider extends ContentProvider implements ThemeManagerConstants {

    /* JADX INFO: renamed from: k */
    private final String f14766k = "key_wallpaper_path";

    /* JADX INFO: renamed from: q */
    private final String f14767q = "key_lockscreen_path";

    /* JADX INFO: renamed from: k */
    private String m8898k(Uri uri) {
        List<String> pathSegments;
        if (uri == null) {
            return null;
        }
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("com.android.thememanager.provider", "*", 1);
        if (uriMatcher.match(uri) == 1 && (pathSegments = uri.getPathSegments()) != null && pathSegments.size() == 1) {
            return pathSegments.get(0);
        }
        return null;
    }

    private String toq(Uri uri, String[] projection) {
        if (projection == null || projection.length == 0) {
            return null;
        }
        for (String str : projection) {
            if (!y9n.f16911m.equals(str) && !"resource_name".equals(str) && !"resource_path".equals(str) && !"resource_hash".equals(str) && !"online_id".equals(str)) {
                return null;
            }
        }
        return m8898k(uri);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        String qVar = toq(uri, projection);
        if (qVar == null) {
            throw new IllegalArgumentException();
        }
        MatrixCursor matrixCursor = new MatrixCursor(projection);
        String[] strArr = new String[projection.length];
        for (int i2 = 0; i2 < projection.length; i2++) {
            if (y9n.f16911m.equals(projection[i2])) {
                strArr[i2] = vyq.zurt(qVar);
            } else if ("resource_path".equals(projection[i2])) {
                strArr[i2] = vyq.ni7(qVar);
            } else if ("resource_name".equals(projection[i2])) {
                String strFu4 = vyq.fu4(qVar);
                if (strFu4 == null) {
                    strFu4 = getContext().getString(R.string.theme_description_title_default);
                }
                strArr[i2] = strFu4;
            } else if ("resource_hash".equals(projection[i2])) {
                strArr[i2] = vyq.fn3e(qVar);
            } else if ("online_id".equals(projection[i2])) {
                strArr[i2] = vyq.m7235z(qVar);
            }
        }
        matrixCursor.addRow(strArr);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        String strM8898k = m8898k(uri);
        if ("wallpaper".equals(strM8898k)) {
            String asString = values.getAsString("key_wallpaper_path");
            if (asString == null) {
                return 0;
            }
            vyq.jp0y("wallpaper", asString, null, null, null, null, null);
            return 0;
        }
        if (!"lockscreen".equals(strM8898k)) {
            throw new IllegalArgumentException();
        }
        String asString2 = values.getAsString("key_lockscreen_path");
        if (asString2 == null) {
            return 0;
        }
        vyq.jp0y("lockscreen", asString2, null, null, null, null, null);
        return 0;
    }
}
