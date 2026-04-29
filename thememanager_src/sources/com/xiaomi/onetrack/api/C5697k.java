package com.xiaomi.onetrack.api;

import android.os.Process;
import android.util.Log;
import com.xiaomi.onetrack.p017f.C5756a;
import com.xiaomi.onetrack.util.C5769b;
import com.xiaomi.onetrack.util.C5776i;
import com.xiaomi.onetrack.util.C5804p;
import java.lang.Thread;
import java.util.Date;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.k */
/* JADX INFO: loaded from: classes3.dex */
public class C5697k implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    private static final String f31832a = "OneTrackExceptionHandler";

    /* JADX INFO: renamed from: c */
    private static final String f31833c = "tombstone";

    /* JADX INFO: renamed from: d */
    private static final String f31834d = ".java.xcrash";

    /* JADX INFO: renamed from: e */
    private static final String f31835e = "backtrace feature id:\n\t";

    /* JADX INFO: renamed from: f */
    private static final String f31836f = "error reason:\n\t";

    /* JADX INFO: renamed from: h */
    private static final long f31837h = 2;

    /* JADX INFO: renamed from: b */
    private Thread.UncaughtExceptionHandler f31838b;

    /* JADX INFO: renamed from: i */
    private C5699m f31840i;

    /* JADX INFO: renamed from: g */
    private final Date f31839g = new Date();

    /* JADX INFO: renamed from: j */
    private int f31841j = 50;

    /* JADX INFO: renamed from: k */
    private int f31842k = 50;

    /* JADX INFO: renamed from: l */
    private int f31843l = 200;

    /* JADX INFO: renamed from: m */
    private boolean f31844m = true;

    /* JADX INFO: renamed from: n */
    private boolean f31845n = true;

    public C5697k(C5699m c5699m) {
        this.f31840i = c5699m;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Log.d(C5804p.m20340a(f31832a), "crash happened->stacktrace: " + th.getStackTrace());
        FutureTask futureTask = new FutureTask(new RunnableC5698l(this, thread, th), null);
        C5776i.m20256a(futureTask);
        try {
            futureTask.get(2L, TimeUnit.SECONDS);
        } catch (Exception e2) {
            Log.e(C5804p.m20340a(f31832a), "handleException error :" + e2.getMessage());
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f31838b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m19805a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof C5697k) {
            return;
        }
        this.f31838b = defaultUncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0181 -> B:75:0x0192). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m19804a(java.lang.Thread r17, java.lang.Throwable r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.onetrack.api.C5697k.m19804a(java.lang.Thread, java.lang.Throwable):void");
    }

    /* JADX INFO: renamed from: a */
    private String m19802a(Date date, Thread thread, String str) {
        return C5769b.m20233a(this.f31839g, date, "java", C5756a.m20058e(), C5769b.m20230a(C5756a.m20053b())) + "pid: " + Process.myPid() + ", tid: " + Process.myTid() + ", name: " + thread.getName() + "  >>> " + C5756a.m20058e() + " <<<\n\njava stacktrace:\n" + str + "\n";
    }
}
