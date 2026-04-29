package com.android.thememanager.maml.widget;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.miui.maml.widget.edit.MamlDownloadStatusKt;
import com.miui.maml.widget.edit.MamlutilKt;
import com.miui.maml.widget.edit.ParseMamlResource;
import ek5k.C6002g;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import kotlin.io.cdj;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.text.a9;
import kotlin.text.fti;
import mub.InterfaceC7396q;
import zy.y9n;

/* JADX INFO: renamed from: com.android.thememanager.maml.widget.p */
/* JADX INFO: compiled from: MamlZipCheck.kt */
/* JADX INFO: loaded from: classes2.dex */
@lv5({"SMAP\nMamlZipCheck.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MamlZipCheck.kt\ncom/android/thememanager/maml/widget/MamlZipCheck\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,92:1\n13309#2,2:93\n13309#2,2:95\n*S KotlinDebug\n*F\n+ 1 MamlZipCheck.kt\ncom/android/thememanager/maml/widget/MamlZipCheck\n*L\n22#1:93,2\n43#1:95,2\n*E\n"})
public final class C2153p {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C2153p f12669k = new C2153p();

    private C2153p() {
    }

    @l05.qrj
    public static final void f7l8(@InterfaceC7396q final String taskId, @InterfaceC7396q final String downloadPath) {
        d2ok.m23075h(taskId, "taskId");
        d2ok.m23075h(downloadPath, "downloadPath");
        C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.maml.widget.f7l8
            @Override // java.lang.Runnable
            public final void run() {
                C2153p.m8203y(taskId, downloadPath);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final boolean m8198g(File file) {
        return file.isDirectory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final boolean m8200n(File file) {
        String path = file.getPath();
        d2ok.kja0(path, "getPath(...)");
        return a9.ga(path, ".zip", false, 2, null);
    }

    @l05.qrj
    @y9n
    /* JADX INFO: renamed from: q */
    public static final void m8201q(@InterfaceC7396q String dir, @InterfaceC7396q String tag) {
        Context context;
        int i2;
        int i3;
        String str;
        d2ok.m23075h(dir, "dir");
        d2ok.m23075h(tag, "tag");
        Context qVar = bf2.toq.toq();
        File file = new File(dir);
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.android.thememanager.maml.widget.y
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return C2153p.m8200n(file2);
            }
        });
        if (fileArrListFiles == null) {
            return;
        }
        File[] fileArrListFiles2 = file.listFiles(new FileFilter() { // from class: com.android.thememanager.maml.widget.s
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return C2153p.m8198g(file2);
            }
        });
        ArrayList arrayList = new ArrayList();
        String str2 = "getPath(...)";
        if (fileArrListFiles2 != null) {
            int length = fileArrListFiles2.length;
            int i4 = 0;
            while (i4 < length) {
                File file2 = fileArrListFiles2[i4];
                String path = file2.getPath();
                d2ok.kja0(path, str2);
                String path2 = file2.getPath();
                d2ok.kja0(path2, str2);
                String strSubstring = path.substring(fti.x7o(path2, '/', 0, false, 6, null) + 1);
                d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
                try {
                    d2ok.qrj(qVar);
                    Context context2 = qVar;
                    i2 = i4;
                    i3 = length;
                    context = qVar;
                    str = str2;
                    try {
                        if (MamlutilKt.findLocalMamlInfo$default(context2, null, strSubstring, -1, -1, -1, null, 64, null).isEmpty()) {
                            Log.i(tag, "delete empty list " + strSubstring);
                            d2ok.qrj(file2);
                            cdj.m22881c(file2);
                        } else {
                            arrayList.add(strSubstring);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                    }
                } catch (Exception e3) {
                    e = e3;
                    context = qVar;
                    i2 = i4;
                    i3 = length;
                    str = str2;
                }
                i4 = i2 + 1;
                str2 = str;
                length = i3;
                qVar = context;
            }
        }
        String str3 = str2;
        for (File file3 : fileArrListFiles) {
            String path3 = file3.getPath();
            d2ok.kja0(path3, str3);
            String path4 = file3.getPath();
            d2ok.kja0(path4, str3);
            String strSubstring2 = path3.substring(fti.x7o(path4, '/', 0, false, 6, null) + 1, file3.getPath().length() - 4);
            d2ok.kja0(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            if (!arrayList.contains(strSubstring2)) {
                try {
                    if (C2152n.kja0() != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(C2152n.kja0());
                        String str4 = File.separator;
                        sb.append(str4);
                        sb.append(strSubstring2);
                        sb.append(str4);
                        String strImportMamlResource$default = ParseMamlResource.importMamlResource$default(ParseMamlResource.INSTANCE, strSubstring2, file3.getPath(), null, sb.toString(), null, 16, null);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("re-import done. ");
                        sb2.append(strSubstring2);
                        sb2.append(", ");
                        sb2.append(strImportMamlResource$default != null);
                        Log.i(tag, sb2.toString());
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private final void m8202s(boolean z2, String str) {
        Intent intent = new Intent(MamlutilKt.DOWNLOAD_ACTION);
        intent.putExtra("onlineId", str);
        intent.putExtra("version", 1);
        intent.putExtra(MamlDownloadStatusKt.EXTRA_PERCENT, z2 ? 100 : 0);
        intent.putExtra("state", z2 ? 2 : 3);
        intent.setPackage("com.miui.personalassistant");
        bf2.toq.toq().sendBroadcast(intent);
        Intent intent2 = new Intent(intent);
        intent2.setPackage(InterfaceC1789q.k9);
        bf2.toq.toq().sendBroadcast(intent2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m8203y(String taskId, String downloadPath) {
        d2ok.m23075h(taskId, "$taskId");
        d2ok.m23075h(downloadPath, "$downloadPath");
        String strKja0 = C2152n.kja0();
        if (strKja0 == null) {
            Log.w(MamlutilKt.TAG, "parseZip: error path");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strKja0);
        String str = File.separator;
        sb.append(str);
        sb.append(taskId);
        sb.append(str);
        try {
            f12669k.m8202s(ParseMamlResource.importMamlResource$default(ParseMamlResource.INSTANCE, taskId, downloadPath, null, sb.toString(), null, 16, null) != null, taskId);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
