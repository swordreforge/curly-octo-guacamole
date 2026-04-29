package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.f26p;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: com.xiaomi.push.service.m */
/* JADX INFO: loaded from: classes3.dex */
public class C5926m {

    /* JADX INFO: renamed from: p */
    private static volatile C5926m f33841p;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private volatile String f73638f7l8;

    /* JADX INFO: renamed from: s */
    private Context f33846s;

    /* JADX INFO: renamed from: y */
    private volatile String f33847y;

    /* JADX INFO: renamed from: k */
    private final Object f33843k = new Object();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Object f73639toq = new Object();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final String f73640zy = "mipush_region";

    /* JADX INFO: renamed from: q */
    private final String f33845q = "mipush_country_code";

    /* JADX INFO: renamed from: n */
    private final String f33844n = "mipush_region.lock";

    /* JADX INFO: renamed from: g */
    private final String f33842g = "mipush_country_code.lock";

    public C5926m(Context context) {
        this.f33846s = context;
    }

    /* JADX INFO: renamed from: k */
    public static C5926m m21688k(Context context) {
        if (f33841p == null) {
            synchronized (C5926m.class) {
                if (f33841p == null) {
                    f33841p = new C5926m(context);
                }
            }
        }
        return f33841p;
    }

    /* JADX INFO: renamed from: q */
    private void m21689q(Context context, String str, String str2, String str3, Object obj) {
        RandomAccessFile randomAccessFile;
        synchronized (obj) {
            FileLock fileLockLock = null;
            try {
                try {
                    File file = new File(context.getFilesDir(), str3);
                    f26p.m20828g(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        try {
                            fileLockLock = randomAccessFile.getChannel().lock();
                            f26p.m20831q(new File(context.getFilesDir(), str2), str);
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

    private String zy(Context context, String str, String str2, Object obj) {
        RandomAccessFile randomAccessFile;
        FileLock fileLockLock;
        File file = new File(context.getFilesDir(), str);
        FileLock fileLock = null;
        if (!file.exists()) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("No ready file to get data from " + str);
            return null;
        }
        synchronized (obj) {
            try {
                File file2 = new File(context.getFilesDir(), str2);
                f26p.m20828g(file2);
                randomAccessFile = new RandomAccessFile(file2, "rw");
            } catch (Exception e2) {
                e = e2;
                randomAccessFile = null;
                fileLockLock = null;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = null;
            }
            try {
                fileLockLock = randomAccessFile.getChannel().lock();
                try {
                    try {
                        String strM20829k = f26p.m20829k(file);
                        if (fileLockLock != null && fileLockLock.isValid()) {
                            try {
                                fileLockLock.release();
                            } catch (IOException e3) {
                                com.xiaomi.channel.commonutils.logger.zy.t8r(e3);
                            }
                        }
                        f26p.toq(randomAccessFile);
                        return strM20829k;
                    } catch (Exception e4) {
                        e = e4;
                        com.xiaomi.channel.commonutils.logger.zy.t8r(e);
                        if (fileLockLock != null && fileLockLock.isValid()) {
                            try {
                                fileLockLock.release();
                            } catch (IOException e6) {
                                com.xiaomi.channel.commonutils.logger.zy.t8r(e6);
                            }
                        }
                        f26p.toq(randomAccessFile);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileLock = fileLockLock;
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException e7) {
                            com.xiaomi.channel.commonutils.logger.zy.t8r(e7);
                        }
                    }
                    f26p.toq(randomAccessFile);
                    throw th;
                }
            } catch (Exception e8) {
                e = e8;
                fileLockLock = null;
            } catch (Throwable th3) {
                th = th3;
                if (fileLock != null) {
                    fileLock.release();
                }
                f26p.toq(randomAccessFile);
                throw th;
            }
        }
    }

    public void f7l8(String str, boolean z2) {
        if (!TextUtils.equals(str, this.f33847y)) {
            this.f33847y = str;
        }
        if (z2) {
            m21689q(this.f33846s, str, "mipush_country_code", "mipush_region.lock", this.f33843k);
        }
    }

    /* JADX INFO: renamed from: g */
    public String m21690g() {
        if (TextUtils.isEmpty(this.f33847y)) {
            this.f33847y = zy(this.f33846s, "mipush_country_code", "mipush_country_code.lock", this.f73639toq);
        }
        return this.f33847y;
    }

    /* JADX INFO: renamed from: n */
    public void m21691n(String str, boolean z2) {
        if (!TextUtils.equals(str, this.f73638f7l8)) {
            this.f73638f7l8 = str;
        }
        if (z2) {
            m21689q(this.f33846s, str, "mipush_region", "mipush_region.lock", this.f33843k);
        }
    }

    public String toq() {
        if (TextUtils.isEmpty(this.f73638f7l8)) {
            this.f73638f7l8 = zy(this.f33846s, "mipush_region", "mipush_region.lock", this.f33843k);
        }
        return this.f73638f7l8;
    }
}
