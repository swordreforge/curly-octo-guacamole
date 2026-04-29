package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public final class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(@lvui Uri uri, @dd String str, @dd String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @dd
    public String getType(@lvui Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @dd
    public Uri insert(@lvui Uri uri, @dd ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new C1179q("Context cannot be null");
        }
        C1177k.zy(context).m5285k();
        return true;
    }

    @Override // android.content.ContentProvider
    @dd
    public Cursor query(@lvui Uri uri, @dd String[] strArr, @dd String str, @dd String[] strArr2, @dd String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public int update(@lvui Uri uri, @dd ContentValues contentValues, @dd String str, @dd String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
