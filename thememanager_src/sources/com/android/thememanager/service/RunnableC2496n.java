package com.android.thememanager.service;

import android.app.job.JobParameters;
import android.util.Log;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.config.model.Config;
import com.android.thememanager.basemodule.resource.C1796y;
import com.android.thememanager.basemodule.utils.C1821p;
import java.io.File;
import java.io.IOException;
import miui.util.HashUtils;
import okhttp3.jp0y;
import retrofit2.C7639i;
import retrofit2.fn3e;
import xwq3.InterfaceC7765k;

/* JADX INFO: renamed from: com.android.thememanager.service.n */
/* JADX INFO: compiled from: DownloadFontAdRunnable.java */
/* JADX INFO: loaded from: classes2.dex */
public class RunnableC2496n implements Runnable {

    /* JADX INFO: renamed from: n */
    private static final String f14835n = "DownloadFontAdRunnable";

    /* JADX INFO: renamed from: k */
    private ThemeSchedulerService f14836k;

    /* JADX INFO: renamed from: q */
    private final JobParameters f14837q;

    public RunnableC2496n(ThemeSchedulerService service, JobParameters param) {
        this.f14836k = service;
        this.f14837q = param;
    }

    /* JADX INFO: renamed from: k */
    private void m8941k() {
        JobParameters jobParameters;
        ThemeSchedulerService themeSchedulerService = this.f14836k;
        if (themeSchedulerService == null || (jobParameters = this.f14837q) == null) {
            return;
        }
        themeSchedulerService.jobFinished(jobParameters, false);
        this.f14836k = null;
    }

    @Override // java.lang.Runnable
    public void run() {
        int length;
        boolean z2;
        File[] fileArrListFiles;
        String qVar = C1796y.toq();
        if (p029m.zy.toq(qVar)) {
            m8941k();
            Log.d(f14835n, "fontAdPath is null");
            return;
        }
        Config configLd6 = C1724k.m6723p().ld6();
        String str = configLd6.font_file_hash;
        String str2 = configLd6.font_downloadUrl;
        if (p029m.zy.toq(str) || p029m.zy.toq(str2)) {
            m8941k();
            Log.d(f14835n, "fileHash or downloadUrl is null");
            return;
        }
        File file = new File(qVar);
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length <= 0) {
            length = 0;
            z2 = false;
        } else {
            length = fileArrListFiles.length;
            z2 = false;
            for (File file2 : fileArrListFiles) {
                if (p029m.zy.m24738k(str, HashUtils.getSHA1(file2))) {
                    Log.d(f14835n, "font Ad file already exist");
                    z2 = true;
                }
            }
        }
        if (!z2) {
            if (length > 5) {
                for (File file3 : file.listFiles()) {
                    file3.delete();
                }
                Log.d(f14835n, "local font ad file more than six, delete files!");
            }
            String str3 = qVar + "/" + str;
            try {
                C7639i<jp0y> c7639iF7l8 = ((InterfaceC7765k) new fn3e.toq().zy("https://ts.market.mi-img.com/download/").m27965g().f7l8(InterfaceC7765k.class)).m28147k(str2).f7l8();
                if (c7639iF7l8.f7l8()) {
                    File file4 = new File(str3 + com.android.thememanager.basemodule.resource.constants.toq.lb);
                    if (!file4.exists()) {
                        file4.getParentFile().mkdirs();
                        file4.createNewFile();
                    }
                    File file5 = new File(str3);
                    if (C1821p.f7l8(c7639iF7l8.m27986k().m27327k(), file4)) {
                        file4.renameTo(file5);
                        if (p029m.zy.m24738k(str, HashUtils.getSHA1(file5))) {
                            Log.d(f14835n, "download font ad file success");
                        } else {
                            file5.delete();
                            Log.d(f14835n, "download font ad file failed because filehash not match");
                        }
                    }
                } else {
                    Log.d(f14835n, "request font ad file failed! " + c7639iF7l8.m27987n());
                }
            } catch (IOException e2) {
                Log.d(f14835n, "download font ad file failed : " + e2);
            }
        }
        m8941k();
    }
}
