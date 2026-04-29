package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.f26p;
import com.xiaomi.push.kl7m;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes3.dex */
class y9n implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Context f33936k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ kl7m f33937q;

    y9n(Context context, kl7m kl7mVar) {
        this.f33936k = context;
        this.f33937q = kl7mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        RandomAccessFile randomAccessFile;
        synchronized (yz.f33938k) {
            FileLock fileLockLock = null;
            try {
                try {
                    File file = new File(this.f33936k.getFilesDir(), "tiny_data.lock");
                    f26p.m20828g(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        try {
                            fileLockLock = randomAccessFile.getChannel().lock();
                            yz.m21803n(this.f33936k, this.f33937q);
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e2) {
                                    com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            com.xiaomi.channel.commonutils.logger.zy.t8r(e);
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e4) {
                                    com.xiaomi.channel.commonutils.logger.zy.t8r(e4);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (fileLockLock != null && fileLockLock.isValid()) {
                            try {
                                fileLockLock.release();
                            } catch (IOException e6) {
                                com.xiaomi.channel.commonutils.logger.zy.t8r(e6);
                            }
                        }
                        f26p.toq(randomAccessFile);
                        throw th;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Exception e7) {
                e = e7;
                randomAccessFile = null;
            } catch (Throwable th3) {
                th = th3;
                randomAccessFile = null;
                if (fileLockLock != null) {
                    fileLockLock.release();
                }
                f26p.toq(randomAccessFile);
                throw th;
            }
            f26p.toq(randomAccessFile);
        }
    }
}
