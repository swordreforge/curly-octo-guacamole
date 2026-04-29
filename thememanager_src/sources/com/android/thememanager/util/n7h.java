package com.android.thememanager.util;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.android.thememanager.ThemeBugreportDumpReceiver;
import com.android.thememanager.basemodule.resource.model.Resource;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import miui.app.constants.ThemeManagerConstants;
import miui.content.res.ThemeRuntimeManager;
import miui.drm.DrmManager;
import miui.util.HashUtils;

/* JADX INFO: compiled from: ApplyValidateThemeTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class n7h extends AsyncTask<Void, Void, Void> {

    /* JADX INFO: renamed from: n */
    private static final String f16652n = "APP-AVTT";

    /* JADX INFO: renamed from: k */
    private String f16653k;

    /* JADX INFO: renamed from: q */
    private String f16654q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Resource f61365toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Set<String> f61366zy;

    /* JADX INFO: renamed from: g */
    private static Map<String, String> f16651g = new HashMap();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static Set<String> f61364f7l8 = new HashSet();

    static {
        f16651g.put("/data/system/theme/", "/data/system/theme/rights/");
        f16651g.put(ThemeRuntimeManager.RUNTIME_PATH_BOOT_ANIMATION, "/data/system/theme/rights/");
        for (String str : ThemeManagerConstants.DRM_WHITE_LIST) {
            f61364f7l8.add("/data/system/theme/" + str);
        }
    }

    public n7h(String resourceCode, Resource resource, Set<String> applyCodeSet, String rightPath) {
        this.f16653k = resourceCode;
        this.f61365toq = resource;
        this.f61366zy = applyCodeSet;
        this.f16654q = rightPath;
    }

    /* JADX INFO: renamed from: n */
    private Pair<Boolean, DrmManager.DrmResult> m9889n(Context context, String contentPath, String rightsPath) {
        String[] list;
        Log.i(f16652n, "validate theme in " + contentPath);
        File file = new File(contentPath);
        File file2 = new File(rightsPath);
        if (!file.exists()) {
            return new Pair<>(Boolean.TRUE, DrmManager.DrmResult.DRM_SUCCESS);
        }
        if (!f61364f7l8.contains(file.getAbsolutePath())) {
            int i2 = 0;
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                int length = fileArrListFiles.length;
                while (i2 < length) {
                    Pair<Boolean, DrmManager.DrmResult> pairM9889n = m9889n(context, fileArrListFiles[i2].getAbsolutePath(), rightsPath);
                    if (!((Boolean) pairM9889n.first).booleanValue()) {
                        return pairM9889n;
                    }
                    i2++;
                }
            } else {
                Log.i(f16652n, "checking component " + file.getAbsolutePath() + " with " + file2.getAbsolutePath());
                DrmManager.DrmResult drmResultIsLegal = DrmManager.isLegal(context, file, file2);
                if (drmResultIsLegal != DrmManager.DrmResult.DRM_SUCCESS) {
                    DrmManager.exportFatalLog(f16652n, "illegal theme component found: " + file.getAbsolutePath() + " hash:" + HashUtils.getSHA1(file) + " " + drmResultIsLegal);
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("checking rightFolder: ");
                    sb2.append(file2.getAbsolutePath());
                    sb.append(sb2.toString());
                    if (file2.isDirectory() && (list = file2.list()) != null) {
                        int length2 = list.length;
                        while (i2 < length2) {
                            sb.append(" " + list[i2]);
                            i2++;
                        }
                    }
                    DrmManager.exportFatalLog(f16652n, sb.toString());
                    return new Pair<>(Boolean.FALSE, drmResultIsLegal);
                }
            }
        }
        return new Pair<>(Boolean.TRUE, DrmManager.DrmResult.DRM_SUCCESS);
    }

    public static void toq(String tag, String message) throws Throwable {
        BufferedWriter bufferedWriter;
        Log.e(tag, message);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                try {
                    File file = new File(ThemeBugreportDumpReceiver.f57252toq);
                    if (file.length() > 102400) {
                        Log.i(tag, "recreate log file " + file.getAbsolutePath());
                        file.delete();
                    }
                    if (!file.exists()) {
                        Log.i(tag, "create log file " + file.getAbsolutePath());
                        file.createNewFile();
                    }
                    Log.i(tag, "export error message into " + file.getAbsolutePath());
                    bufferedWriter = new BufferedWriter(new FileWriter(file, true));
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.append((CharSequence) (zy() + " " + System.currentTimeMillis() + " " + tag + " " + message));
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e4) {
            e = e4;
            bufferedWriter2 = bufferedWriter;
            e.printStackTrace();
            if (bufferedWriter2 == null) {
            } else {
                bufferedWriter2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }

    private static String zy() {
        return String.format("%s %s_%s %s", Build.DEVICE, Build.VERSION.RELEASE, Build.VERSION.INCREMENTAL, DateFormat.getDateTimeInstance().format(new Date()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        android.util.Log.w(com.android.thememanager.util.n7h.f16652n, "restore default theme in " + r4.getKey());
     */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Void doInBackground(java.lang.Void... r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.util.n7h.doInBackground(java.lang.Void[]):java.lang.Void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
    }
}
