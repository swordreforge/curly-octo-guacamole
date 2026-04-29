package com.android.thememanager.basemodule.resource;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.core.content.FileProvider;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.utils.C1821p;
import java.io.File;
import java.util.ArrayList;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.resource.p */
/* JADX INFO: compiled from: ScopedStorageFilesAccess.java */
/* JADX INFO: loaded from: classes.dex */
public class C1793p {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f57693f7l8 = 1;

    /* JADX INFO: renamed from: g */
    private static final int f10229g = 0;

    /* JADX INFO: renamed from: k */
    private static final String f10230k = "ScopedStorageAccess";

    /* JADX INFO: renamed from: n */
    private static final String f10231n = "resultStatus";

    /* JADX INFO: renamed from: p */
    private static final int f10232p = 4;

    /* JADX INFO: renamed from: q */
    private static final String f10233q = "uriList";

    /* JADX INFO: renamed from: s */
    private static final int f10234s = 3;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f57694toq = "grantFilePermission";

    /* JADX INFO: renamed from: y */
    private static final int f10235y = 2;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f57695zy = "modeFlags";

    /* JADX INFO: renamed from: k */
    public static void m6954k(Context context, String packageName) {
        toq(context, packageName, 129);
    }

    /* JADX INFO: renamed from: q */
    private static boolean m6955q(String path) {
        return !p029m.zy.toq(path) && C1788k.m6921k();
    }

    public static void toq(Context context, String packageName, int flag) {
        context.grantUriPermission(packageName, FileProvider.m2162g(context, com.android.thememanager.basemodule.resource.constants.toq.o9qk, new File(C1788k.f10175k, "empty")), flag);
    }

    public static Bundle zy(Context context, @lvui String callPackage, @lvui String path, Bundle extra) {
        Bundle bundle = new Bundle();
        if (p029m.zy.toq(callPackage) || p029m.zy.toq(path)) {
            Log.d(f10230k, "callPackage or path is empty");
            bundle.putInt(f10231n, 1);
            return bundle;
        }
        if (path.startsWith("/")) {
            path = path.substring(1);
        }
        Log.i(f10230k, "grantFiles for " + callPackage + ", path = " + path);
        StringBuilder sb = new StringBuilder();
        sb.append(C1821p.n7h(C1788k.f10175k));
        if (p029m.zy.toq(path)) {
            path = "";
        }
        sb.append(path);
        String string = sb.toString();
        File file = new File(string);
        if (!file.exists()) {
            Log.i(f10230k, "File not exist: " + file.getAbsolutePath());
            try {
                file = new File(Uri.decode(string));
            } catch (IllegalArgumentException unused) {
                Log.w(f10230k, "File path invalid " + string);
            }
            if (!file.exists()) {
                bundle.putInt(f10231n, 3);
                return bundle;
            }
            Log.i(f10230k, "File exist. after decode.");
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length < 1) {
                Log.i(f10230k, "directory is empty: : " + file.getAbsolutePath());
                bundle.putInt(f10231n, 4);
                return null;
            }
            for (File file2 : fileArrListFiles) {
                if (!file2.isDirectory()) {
                    arrayList.add(FileProvider.m2162g(context, com.android.thememanager.basemodule.resource.constants.toq.o9qk, file2));
                }
            }
        } else {
            arrayList.add(FileProvider.m2162g(context, com.android.thememanager.basemodule.resource.constants.toq.o9qk, file));
        }
        if (!arrayList.isEmpty()) {
            if (m6955q(string)) {
                int i2 = ((extra == null || !extra.containsKey(f57695zy)) ? 0 : extra.getInt(f57695zy)) | 1 | 128;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    context.grantUriPermission(callPackage, (Uri) arrayList.get(i3), i2);
                }
            }
            bundle.putParcelableArrayList(f10233q, arrayList);
            bundle.putInt(f10231n, 0);
        }
        return bundle;
    }
}
