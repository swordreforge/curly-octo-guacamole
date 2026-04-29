package com.xiaomi.push;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: com.xiaomi.push.y */
/* JADX INFO: loaded from: classes3.dex */
public class C5961y {
    /* JADX INFO: renamed from: k */
    public static boolean m22034k(Context context, String str, long j2) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileLock fileLockLock = null;
        try {
            File file = new File(context.getFilesDir(), "/.vdevdir/");
            if (!ydj3.toq(file)) {
                f26p.toq(null);
                return true;
            }
            File file2 = new File(file, "lcfp.lock");
            f26p.m20828g(file2);
            randomAccessFile = new RandomAccessFile(file2, "rw");
            try {
                try {
                    fileLockLock = randomAccessFile.getChannel().lock();
                    boolean qVar = toq(context, str, j2);
                    if (fileLockLock != null && fileLockLock.isValid()) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    f26p.toq(randomAccessFile);
                    return qVar;
                } catch (IOException e2) {
                    e = e2;
                    e.printStackTrace();
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    f26p.toq(randomAccessFile);
                    return true;
                }
            } catch (Throwable th) {
                th = th;
                if (fileLockLock != null && fileLockLock.isValid()) {
                    try {
                        fileLockLock.release();
                    } catch (IOException unused3) {
                    }
                }
                f26p.toq(randomAccessFile);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            randomAccessFile = null;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
            if (fileLockLock != null) {
                fileLockLock.release();
            }
            f26p.toq(randomAccessFile);
            throw th;
        }
        e.printStackTrace();
        if (fileLockLock != null && fileLockLock.isValid()) {
            fileLockLock.release();
        }
        f26p.toq(randomAccessFile);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8 A[Catch: all -> 0x00ec, IOException -> 0x00ef, LOOP:0: B:42:0x00d2->B:44:0x00d8, LOOP_END, TRY_LEAVE, TryCatch #7 {IOException -> 0x00ef, all -> 0x00ec, blocks: (B:41:0x00ce, B:42:0x00d2, B:44:0x00d8), top: B:71:0x00ce }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean toq(android.content.Context r16, java.lang.String r17, long r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C5961y.toq(android.content.Context, java.lang.String, long):boolean");
    }
}
