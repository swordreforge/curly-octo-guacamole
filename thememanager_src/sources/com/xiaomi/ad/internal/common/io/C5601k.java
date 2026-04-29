package com.xiaomi.ad.internal.common.io;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;
import u38j.zy;

/* JADX INFO: renamed from: com.xiaomi.ad.internal.common.io.k */
/* JADX INFO: compiled from: FileLock.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5601k {

    /* JADX INFO: renamed from: k */
    FileOutputStream f31165k = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    FileLock f73031toq = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f73032zy;

    public C5601k(String str) {
        this.f73032zy = str;
    }

    /* JADX INFO: renamed from: k */
    public boolean m19223k() {
        toq();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f73032zy), true);
            this.f31165k = fileOutputStream;
            FileLock fileLockLock = fileOutputStream.getChannel().lock();
            this.f73031toq = fileLockLock;
            return fileLockLock != null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void toq() {
        FileLock fileLock = this.f73031toq;
        if (fileLock != null) {
            try {
                fileLock.release();
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f73031toq = null;
                throw th;
            }
            this.f73031toq = null;
        }
        FileOutputStream fileOutputStream = this.f31165k;
        if (fileOutputStream != null) {
            zy.toq(fileOutputStream);
            this.f31165k = null;
        }
    }
}
