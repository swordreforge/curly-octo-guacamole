package com.bumptech.glide.load.engine.executor;

import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: RuntimeCompat.java */
/* JADX INFO: loaded from: classes2.dex */
final class toq {

    /* JADX INFO: renamed from: k */
    private static final String f18355k = "GlideRuntimeCompat";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f62759toq = "cpu[0-9]+";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f62760zy = "/sys/devices/system/cpu/";

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.toq$k */
    /* JADX INFO: compiled from: RuntimeCompat.java */
    class C3028k implements FilenameFilter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Pattern f18356k;

        C3028k(Pattern pattern) {
            this.f18356k = pattern;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.f18356k.matcher(str).matches();
        }
    }

    private toq() {
    }

    /* JADX INFO: renamed from: k */
    static int m10752k() {
        return Runtime.getRuntime().availableProcessors();
    }

    private static int toq() {
        File[] fileArrListFiles;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArrListFiles = new File(f62760zy).listFiles(new C3028k(Pattern.compile(f62759toq)));
        } catch (Throwable th) {
            try {
                if (Log.isLoggable(f18355k, 6)) {
                    Log.e(f18355k, "Failed to calculate accurate cpu count", th);
                }
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                fileArrListFiles = null;
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        }
        return Math.max(1, fileArrListFiles != null ? fileArrListFiles.length : 0);
    }
}
