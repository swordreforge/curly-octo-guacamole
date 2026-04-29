package com.android.thememanager.service;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import androidx.core.content.FileProvider;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.zy;
import com.android.thememanager.maml.widget.C2150g;
import com.android.thememanager.maml.widget.C2152n;
import com.android.thememanager.maml.widget.C2154q;
import com.miui.maml.widget.edit.MamlDownloadStatusKt;
import com.miui.maml.widget.edit.MamlWidget;
import com.miui.maml.widget.edit.MamlutilKt;
import com.miui.maml.widget.edit.ParseMamlResource;
import ek5k.C6002g;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import miuix.view.C7385p;
import yz.C7794k;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.service.p */
/* JADX INFO: compiled from: MamlWidgetHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2497p {

    /* JADX INFO: renamed from: k */
    private static final String f14839k = "MamlWidgetHelper";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static volatile C2154q f60768toq;

    /* JADX INFO: renamed from: com.android.thememanager.service.p$k */
    /* JADX INFO: compiled from: MamlWidgetHelper.java */
    protected static class k extends AsyncTask<Void, Void, Pair<zy.C7914zy, String>> {

        /* JADX INFO: renamed from: k */
        private int f14840k;

        /* JADX INFO: renamed from: q */
        private String f14841q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f60769toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Bundle f60770zy;

        public k(String productId, int tryCnt, String callPkg, Bundle extra) {
            this.f14841q = productId;
            this.f14840k = tryCnt;
            this.f60769toq = callPkg;
            this.f60770zy = extra;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Pair<zy.C7914zy, String> doInBackground(Void... params) {
            zy.C7914zy c7914zy = new zy.C7914zy(com.android.thememanager.controller.online.zy.f57986kja0);
            if (isCancelled()) {
                return null;
            }
            Pair<zy.C7914zy, String> pair = new Pair<>(c7914zy, "");
            int[] iArr = {0, 1, 3, 5, 7};
            for (int i2 = 0; i2 < 5 && c7914zy.m7664n() != 100000 && c7914zy.m7664n() != 100006 && c7914zy.m7664n() != 100007; i2++) {
                if (i2 > 0) {
                    SystemClock.sleep(iArr[i2] * 1000);
                }
                pair = C2150g.f7l8(this.f14841q, null, null);
                c7914zy = (zy.C7914zy) pair.first;
                Log.i(C2497p.f14839k, "downloadAndCopyRight: " + i2 + ",result = " + (c7914zy == null ? null : "result.ResultType = " + c7914zy.m7664n() + ",ServerResponseCode = " + c7914zy.m7663g() + ",serverResponse = " + c7914zy.f7l8()));
            }
            return pair;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Pair<zy.C7914zy, String> resultPair) {
            if (resultPair == null) {
                C2497p.t8r(this.f14841q, 3, this.f60769toq, "download task maybe cancel");
                return;
            }
            zy.C7914zy c7914zy = (zy.C7914zy) resultPair.first;
            int iM7664n = c7914zy.m7664n();
            C7794k.m28195n(C2497p.f14839k, "DownloadRightsTask resultType:" + iM7664n + "resultCode: " + c7914zy.m7663g() + "resultMessage:" + c7914zy.f7l8());
            if (iM7664n != 100000) {
                if (iM7664n == 100001) {
                    C2497p.t8r(this.f14841q, 6, this.f60769toq, null);
                    return;
                } else {
                    C2497p.t8r(this.f14841q, 4, this.f60769toq, null);
                    return;
                }
            }
            C2497p.t8r(this.f14841q, 5, this.f60769toq, null);
            String str = (String) resultPair.second;
            if (p029m.zy.toq(str)) {
                C2497p.t8r(this.f14841q, 3, this.f60769toq, "no download url");
            } else {
                C2497p.m8949s(str, this.f60769toq, this.f60770zy);
            }
        }
    }

    private static Bundle cdj(Context context, String pkg, Bundle extra) {
        int i2;
        int i3;
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        String strKja0 = C2152n.kja0();
        if (strKja0 == null) {
            Log.w(f14839k, "queryMamlInfo: null path");
            return bundle;
        }
        File file = new File(strKja0);
        String string = "";
        final String string2 = (extra == null || !extra.containsKey("id")) ? "" : extra.getString("id");
        if (extra != null && extra.containsKey("typeTag")) {
            string = extra.getString("typeTag");
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        int i4 = 0;
        if (!p029m.zy.toq(string)) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length >= 1) {
                ArrayList arrayList3 = new ArrayList();
                int length = fileArrListFiles.length;
                int i5 = 0;
                while (i5 < length) {
                    File file2 = fileArrListFiles[i5];
                    if (file2.isDirectory()) {
                        i2 = i5;
                        i3 = length;
                        arrayList = arrayList3;
                        List<MamlWidget> listGenerateMamlWidget = ParseMamlResource.INSTANCE.generateMamlWidget(file2, -1, -1, -1, string);
                        if (listGenerateMamlWidget != null && listGenerateMamlWidget.size() > 0) {
                            arrayList.add(listGenerateMamlWidget.get(0).getInfo().getId() + ".zip");
                        }
                    } else {
                        i2 = i5;
                        i3 = length;
                        arrayList = arrayList3;
                    }
                    i5 = i2 + 1;
                    arrayList3 = arrayList;
                    length = i3;
                }
                final ArrayList arrayList4 = arrayList3;
                File[] fileArrListFiles2 = file.listFiles(new FilenameFilter() { // from class: com.android.thememanager.service.s
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file3, String str) {
                        return C2497p.kja0(arrayList4, file3, str);
                    }
                });
                if (fileArrListFiles2 != null && fileArrListFiles2.length >= 1) {
                    int length2 = fileArrListFiles2.length;
                    while (i4 < length2) {
                        File file3 = fileArrListFiles2[i4];
                        if (file3.isFile()) {
                            arrayList2.add(m8947p(context, file3, pkg).toString());
                        }
                        i4++;
                    }
                }
            }
            return bundle;
        }
        File[] fileArrListFiles3 = file.listFiles(new FilenameFilter() { // from class: com.android.thememanager.service.y
            @Override // java.io.FilenameFilter
            public final boolean accept(File file4, String str) {
                return C2497p.n7h(string2, file4, str);
            }
        });
        if (fileArrListFiles3 == null || fileArrListFiles3.length < 1) {
            return bundle;
        }
        int length3 = fileArrListFiles3.length;
        while (i4 < length3) {
            File file4 = fileArrListFiles3[i4];
            if (file4.getName().endsWith(".zip") && file4.isFile()) {
                arrayList2.add(m8947p(context, file4, pkg).toString());
            }
            i4++;
        }
        bundle.putStringArrayList("list", arrayList2);
        return bundle;
    }

    private static Bundle f7l8(Context context, String callPkg, Bundle extra) {
        Bundle bundle = new Bundle();
        if (!C1781k.toq(context)) {
            bundle.putInt("code", -2);
            return bundle;
        }
        if (((zy.C7914zy) C2150g.f7l8(extra.getString("id"), extra.getString(InterfaceC1925p.g3a), extra.getString(com.android.thememanager.basemodule.analysis.toq.k2b8)).first).m7664n() != 100000) {
            bundle.putInt("code", -1);
            return bundle;
        }
        Bundle bundleKi = ki(context, callPkg, extra);
        bundleKi.putInt("code", 0);
        return bundleKi;
    }

    /* JADX INFO: renamed from: g */
    public static Bundle m8943g(Context context, String callPkg, Bundle extra) {
        Bundle bundle = new Bundle();
        if (C1781k.toq(context)) {
            bundle.putInt("code", qrj().kja0(new C2152n(extra.getString("id"), extra.getString("title"), extra.getString("url"), extra.getInt("fileSizeKb", 0) * 1024, extra.getInt("version"), callPkg)));
        } else {
            bundle.putInt("code", -2);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ boolean m8944h(String str, File file, String str2) {
        return str2.contains(str);
    }

    private static Bundle ki(Context context, String pkg, Bundle extra) {
        Bundle bundle = new Bundle();
        String strCdj = C2152n.cdj();
        if (strCdj == null) {
            Log.w(f14839k, "queryMamlRight: null path");
            return bundle;
        }
        File file = new File(strCdj);
        final String string = (extra == null || !extra.containsKey("id")) ? "" : extra.getString("id");
        ArrayList<String> arrayList = new ArrayList<>();
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.android.thememanager.service.f7l8
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                return C2497p.m8944h(string, file2, str);
            }
        });
        if (fileArrListFiles != null && fileArrListFiles.length >= 1) {
            for (File file2 : fileArrListFiles) {
                if (file2.getName().endsWith(".right") && file2.isFile()) {
                    arrayList.add(m8947p(context, file2, pkg).toString());
                }
            }
            bundle.putStringArrayList("list", arrayList);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean kja0(List list, File file, String str) {
        return list.contains(str);
    }

    public static Bundle ld6(Context context, String method, Bundle extra, String callPkg) {
        if (MamlutilKt.METHOD_START_DOWNLOAD.equals(method)) {
            return m8943g(context, callPkg, extra);
        }
        if (MamlutilKt.METHOD_QUERY_MAML_INFO.equals(method)) {
            return cdj(context, callPkg, extra);
        }
        if (MamlutilKt.METHOD_CTA_ALLOWED.equals(method)) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("ctaAllowed", C1781k.m6905k());
            return bundle;
        }
        if (MamlutilKt.METHOD_START_DOWNLOAD_WITH_RIGHT.equals(method)) {
            return m8950y(context, callPkg, extra);
        }
        if (MamlutilKt.METHOD_DOWNLOAD_AND_COPY_RIGHT.equals(method)) {
            return f7l8(context, callPkg, extra);
        }
        if (MamlutilKt.METHOD_QUERY_MAML_RIGHT.equals(method)) {
            return ki(context, callPkg, extra);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean n7h(String str, File file, String str2) {
        return str2.contains(str);
    }

    /* JADX INFO: renamed from: p */
    private static Uri m8947p(Context context, @lvui File file, @lvui String callPkg) {
        Uri uriM2162g = FileProvider.m2162g(context, com.android.thememanager.basemodule.resource.constants.toq.o9qk, file);
        context.grantUriPermission(callPkg, uriM2162g, C7385p.f92248ni7);
        return uriM2162g;
    }

    private static C2154q qrj() {
        if (f60768toq == null) {
            synchronized (C2497p.class) {
                if (f60768toq == null) {
                    f60768toq = new C2154q();
                }
            }
        }
        return f60768toq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static void m8949s(String url, String callPkg, Bundle extra) {
        qrj().kja0(new C2152n(extra.getString("id"), extra.getString("title"), url, ((long) extra.getInt("fileSizeKb", 0)) * 1024, extra.getInt("version"), callPkg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t8r(String productId, int state, String callPkg, String errorMsg) {
        Context qVar = bf2.toq.toq();
        Intent intent = new Intent(MamlutilKt.DOWNLOAD_ACTION);
        intent.putExtra("onlineId", productId);
        intent.putExtra("state", state);
        if (!p029m.zy.toq(errorMsg)) {
            intent.putExtra(MamlDownloadStatusKt.EXTRA_ERROR_MSG, errorMsg);
        }
        intent.setPackage(callPkg);
        qVar.sendBroadcast(intent);
    }

    public static void x2() {
        qrj().kja0(null);
    }

    /* JADX INFO: renamed from: y */
    private static Bundle m8950y(Context context, String callPkg, Bundle extra) {
        Bundle bundle = new Bundle();
        if (C1781k.toq(context)) {
            new k(extra.getString("id"), 1, callPkg, extra).executeOnExecutor(C6002g.x2(), new Void[0]);
            bundle.putInt("code", 0);
        } else {
            bundle.putInt("code", -2);
        }
        return bundle;
    }
}
