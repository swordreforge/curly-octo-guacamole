package com.android.thememanager.maml.widget;

import android.util.Log;
import com.android.thememanager.basemodule.local.ld6;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.o1t;
import com.miui.maml.widget.edit.MamlutilKt;
import java.io.File;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.maml.widget.n */
/* JADX INFO: compiled from: MamlDownloadTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2152n implements ld6.InterfaceC1747n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f60430f7l8 = "MamlDownloadTask";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f60431ld6 = ".zip";

    /* JADX INFO: renamed from: p */
    public static final String f12662p = "com.miui.personalassistant";

    /* JADX INFO: renamed from: s */
    private static String f12663s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static Boolean f60432x2;

    /* JADX INFO: renamed from: y */
    private static String f12664y;

    /* JADX INFO: renamed from: g */
    private final int f12665g;

    /* JADX INFO: renamed from: k */
    private final String f12666k;

    /* JADX INFO: renamed from: n */
    private final String f12667n;

    /* JADX INFO: renamed from: q */
    private final long f12668q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f60433toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final String f60434zy;

    public C2152n(@lvui String id, @lvui String title, @lvui String url, long fileSize, int version, String pkg) {
        this.f12666k = id;
        this.f60433toq = title;
        this.f60434zy = url;
        this.f12668q = fileSize;
        this.f12665g = version;
        this.f12667n = p029m.zy.toq(pkg) ? "com.miui.personalassistant" : pkg;
    }

    @dd
    public static String cdj() {
        if (f12663s == null) {
            File externalFilesDir = bf2.toq.toq().getExternalFilesDir(MamlutilKt.DEFAULT_DIR);
            if (externalFilesDir != null) {
                f12663s = externalFilesDir.getPath();
            } else {
                Log.w(f60430f7l8, "getRightDir -> getExternalFilesDir is null.");
            }
        }
        return f12663s;
    }

    @dd
    public static String kja0() {
        if (f12664y == null) {
            File externalFilesDir = bf2.toq.toq().getExternalFilesDir(MamlutilKt.DEFAULT_DIR);
            if (externalFilesDir != null) {
                f12664y = externalFilesDir.getPath();
            } else {
                Log.w(f60430f7l8, "getDir -> getExternalFilesDir is null.");
            }
        }
        return f12664y;
    }

    @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
    public String f7l8() {
        String strKja0 = kja0();
        if (strKja0 == null) {
            Log.w("mamlDownload", "getSavePath: null");
            return null;
        }
        return strKja0 + "/" + this.f12666k + ".zip";
    }

    @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
    /* JADX INFO: renamed from: g */
    public String mo6831g() {
        return this.f60434zy;
    }

    @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
    public String getTaskId() {
        return this.f12666k;
    }

    @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
    public String getTitle() {
        return this.f60433toq;
    }

    /* JADX INFO: renamed from: h */
    public String m8197h() {
        return this.f12667n;
    }

    @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
    /* JADX INFO: renamed from: k */
    public String mo6832k() {
        return null;
    }

    public int ki() {
        return this.f12665g;
    }

    @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
    public String ld6() {
        return this.f12667n;
    }

    @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
    /* JADX INFO: renamed from: n */
    public int mo6833n() {
        return 0;
    }

    @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
    public boolean n7h() {
        return false;
    }

    @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
    /* JADX INFO: renamed from: p */
    public int mo6834p() {
        return 0;
    }

    @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
    /* JADX INFO: renamed from: q */
    public void mo6835q() {
    }

    @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
    public long qrj() {
        return this.f12668q;
    }

    @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
    /* JADX INFO: renamed from: s */
    public String mo6836s() {
        return null;
    }

    @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
    public boolean toq() {
        return false;
    }

    @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
    public boolean x2() {
        if (o1t.cdj()) {
            return true;
        }
        if (f60432x2 == null) {
            f60432x2 = Boolean.valueOf(a9.m7000y(bf2.toq.toq(), "com.android.providers.downloads") >= 210618002);
        }
        return f60432x2.booleanValue();
    }

    @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
    /* JADX INFO: renamed from: y */
    public String mo6837y() {
        return null;
    }

    @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
    public String zy() {
        return f7l8() + com.android.thememanager.basemodule.local.ld6.f9961b;
    }
}
