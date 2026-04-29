package com.android.thememanager.miuixcompat;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.service.ThemeSchedulerService;
import ek5k.C6002g;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class MiuixCheckProvider extends ContentProvider {

    /* JADX INFO: renamed from: g */
    private static final String f12996g = "result";

    /* JADX INFO: renamed from: k */
    public static final String f12997k = "MiuixCheckProvider";

    /* JADX INFO: renamed from: n */
    private static final String f12998n = "bundle_key_package_name";

    /* JADX INFO: renamed from: q */
    private static final String f12999q = "checkMiuiVersion";

    /* JADX INFO: renamed from: y */
    private static final String f13000y = "on_miui_ota_done";

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m8304q(String str) {
        C2206g.jk(false, "MiuixCheckProvider,check miui version" + a9.m7000y(bf2.toq.toq(), str), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zy() {
        C2206g.m8311q();
        C2206g.jk(false, "MiuixCheckProvider,check miui ota version ", C2206g.kja0().toString());
    }

    @Override // android.content.ContentProvider
    @dd
    public Bundle call(@lvui String method, @dd String arg, @dd Bundle extras) {
        Log.i(f12997k, "check miui version " + method);
        try {
            if (f13000y.equals(method)) {
                C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.miuixcompat.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        MiuixCheckProvider.zy();
                    }
                });
            } else if (f12999q.equals(method) && extras != null) {
                final String string = extras.getString(f12998n, null);
                Log.d(f12997k, "receive from: " + string);
                ThemeSchedulerService.fn3e(getContext(), string);
                C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.miuixcompat.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        MiuixCheckProvider.m8304q(string);
                    }
                });
                extras.putBoolean("result", true);
                return extras;
            }
            return null;
        } catch (Exception unused) {
            Log.e(f12997k, "call: check miui version ");
            return null;
        }
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
