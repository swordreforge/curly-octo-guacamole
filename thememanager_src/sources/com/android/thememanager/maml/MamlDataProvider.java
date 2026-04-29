package com.android.thememanager.maml;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.maml.old.C2147q;
import com.android.thememanager.util.C2789j;
import com.android.thememanager.util.g1;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import miui.content.res.ThemeNativeUtils;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class MamlDataProvider extends ContentProvider {

    /* JADX INFO: renamed from: a */
    private static final int f12545a = 6;

    /* JADX INFO: renamed from: b */
    private static final int f12546b = 5;

    /* JADX INFO: renamed from: c */
    private static final String f12547c = "saveConfigFile";

    /* JADX INFO: renamed from: e */
    private static final int f12548e = 1;

    /* JADX INFO: renamed from: f */
    private static final String f12549f = "com.miui.miwallpaper";

    /* JADX INFO: renamed from: i */
    public static final String f12550i = "content://";

    /* JADX INFO: renamed from: j */
    private static final int f12551j = 2;

    /* JADX INFO: renamed from: l */
    private static final String f12552l = "https";

    /* JADX INFO: renamed from: m */
    private static final int f12553m = 4;

    /* JADX INFO: renamed from: o */
    private static final int f12554o = 3;

    /* JADX INFO: renamed from: r */
    private static final String f12555r = "http";

    /* JADX INFO: renamed from: t */
    private static final String f12556t = "*";

    /* JADX INFO: renamed from: x */
    private static final UriMatcher f12557x;

    /* JADX INFO: renamed from: z */
    public static final String f12558z = "com.miui.maml.provider";

    /* JADX INFO: renamed from: g */
    private InterfaceC2148q f12559g;

    /* JADX INFO: renamed from: h */
    private Object f12560h = new Object();

    /* JADX INFO: renamed from: k */
    private InterfaceC2148q f12561k;

    /* JADX INFO: renamed from: n */
    private InterfaceC2148q f12562n;

    /* JADX INFO: renamed from: p */
    private InterfaceC2148q f12563p;

    /* JADX INFO: renamed from: q */
    private InterfaceC2148q f12564q;

    /* JADX INFO: renamed from: s */
    private InterfaceC2148q f12565s;

    /* JADX INFO: renamed from: y */
    private InterfaceC2148q f12566y;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f12557x = uriMatcher;
        StringBuilder sb = new StringBuilder();
        sb.append("get");
        String str = File.separator;
        sb.append(str);
        sb.append(f12556t);
        uriMatcher.addURI(f12558z, sb.toString(), 1);
        uriMatcher.addURI(f12558z, "post" + str + f12556t, 2);
        uriMatcher.addURI(f12558z, "anonymousId", 3);
        uriMatcher.addURI(f12558z, InterfaceC1925p.ru8 + str + f12556t, 4);
        uriMatcher.addURI(f12558z, C2147q.f12636q + str + f12556t, 5);
        uriMatcher.addURI(f12558z, "information" + str + f12556t, 6);
    }

    /* JADX INFO: renamed from: k */
    private boolean m8169k(Uri uri) {
        switch (f12557x.match(uri)) {
            case 1:
                if (this.f12562n == null) {
                    this.f12562n = new zy();
                }
                this.f12563p = this.f12562n;
                return true;
            case 2:
                if (this.f12559g == null) {
                    this.f12559g = new C2149s();
                }
                this.f12563p = this.f12559g;
                return true;
            case 3:
                if (this.f12564q == null) {
                    this.f12564q = new toq();
                }
                this.f12563p = this.f12564q;
                return true;
            case 4:
                if (this.f12561k == null) {
                    this.f12561k = new C2138k();
                }
                this.f12563p = this.f12561k;
                return true;
            case 5:
                if (this.f12566y == null) {
                    this.f12566y = new C2147q();
                }
                this.f12563p = this.f12566y;
                return true;
            case 6:
                if (this.f12565s == null) {
                    this.f12565s = new f7l8();
                }
                this.f12563p = this.f12565s;
                return true;
            default:
                this.f12563p = null;
                return false;
        }
    }

    public static boolean toq(String url) {
        try {
            URI uri = new URI(url);
            if (uri.getHost() == null) {
                return false;
            }
            if (!"http".equalsIgnoreCase(uri.getScheme())) {
                if (!"https".equalsIgnoreCase(uri.getScheme())) {
                    return false;
                }
            }
            return true;
        } catch (URISyntaxException unused) {
            return false;
        }
    }

    @Override // android.content.ContentProvider
    @dd
    public Bundle call(@lvui String method, @dd String arg, @dd Bundle extras) {
        C2789j.m9825g(MamlDataProvider.class.getSimpleName(), "call : " + method, new Object[0]);
        method.hashCode();
        switch (method) {
            case "updateInformationList":
            case "addInformation":
                if (this.f12565s == null) {
                    this.f12565s = new f7l8();
                }
                return this.f12565s.mo8176k(method, arg, extras);
            case "saveConfigFile":
                if (!"com.miui.miwallpaper".equals(getCallingPackage()) || extras == null) {
                    return null;
                }
                synchronized (this.f12560h) {
                    String strM9761z = g1.m9761z();
                    String string = extras.getString("data");
                    File file = new File(strM9761z);
                    try {
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    if (!file.exists()) {
                        break;
                    } else {
                        ThemeNativeUtils.write(strM9761z, string);
                        ThemeNativeUtils.updateFilePermissionWithThemeContext(strM9761z);
                        break;
                    }
                }
                return null;
            default:
                return null;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@lvui Uri uri, @dd String selection, @dd String[] selectionArgs) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // android.content.ContentProvider
    @dd
    public String getType(@lvui Uri uri) {
        if (m8169k(uri)) {
            return this.f12563p.toq(uri);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    @dd
    public Uri insert(@lvui Uri uri, @dd ContentValues values) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        ((com.android.thememanager.maml.model.toq) ikck.zy.m22379k(com.android.thememanager.maml.model.toq.class)).zy();
        com.android.thememanager.maml.model.toq.m8181s();
        return true;
    }

    @Override // android.content.ContentProvider
    @dd
    public Cursor query(@lvui Uri uri, @dd String[] projection, @dd String selection, @dd String[] selectionArgs, @dd String sortOrder) {
        C2789j.m9825g(MamlDataProvider.class.getSimpleName(), uri.toString(), new Object[0]);
        if (m8169k(uri)) {
            return this.f12563p.zy(uri, projection, selection, selectionArgs, sortOrder);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@lvui Uri uri, @dd ContentValues values, @dd String selection, @dd String[] selectionArgs) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
