package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.C5889p;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zwy extends C5889p.k {

    /* JADX INFO: renamed from: k */
    protected int f34303k;

    /* JADX INFO: renamed from: q */
    protected Context f34304q;

    public zwy(Context context, int i2) {
        this.f34303k = i2;
        this.f34304q = context;
    }

    /* JADX INFO: renamed from: p */
    private String m22132p() {
        return "dc_job_result_" + mo19320k();
    }

    /* JADX INFO: renamed from: q */
    private static void m22133q(Context context, f7z0 f7z0Var, String str) {
        BufferedOutputStream bufferedOutputStream;
        RandomAccessFile randomAccessFile;
        byte[] bArrM20771q = ebn.m20771q(str, qla.m21397g(f7z0Var));
        if (bArrM20771q == null || bArrM20771q.length == 0) {
            return;
        }
        synchronized (pc.f33560k) {
            FileLock fileLock = null;
            BufferedOutputStream bufferedOutputStream2 = null;
            fileLock = null;
            fileLock = null;
            fileLock = null;
            try {
                try {
                    File file = new File(context.getFilesDir(), "push_cdata.lock");
                    f26p.m20828g(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        FileLock fileLockLock = randomAccessFile.getChannel().lock();
                        try {
                            File file2 = new File(context.getFilesDir(), "push_cdata.data");
                            if (ydj3.toq(file2)) {
                                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2, true));
                                try {
                                    bufferedOutputStream.write(C5890q.toq(bArrM20771q.length));
                                    bufferedOutputStream.write(bArrM20771q);
                                    bufferedOutputStream.flush();
                                    file2.setLastModified(0L);
                                    bufferedOutputStream2 = bufferedOutputStream;
                                } catch (IOException e2) {
                                    e = e2;
                                    fileLock = fileLockLock;
                                    try {
                                        e.printStackTrace();
                                        if (fileLock != null && fileLock.isValid()) {
                                            try {
                                                fileLock.release();
                                            } catch (IOException unused) {
                                            }
                                        }
                                        f26p.toq(bufferedOutputStream);
                                    } catch (Throwable th) {
                                        th = th;
                                        if (fileLock != null && fileLock.isValid()) {
                                            try {
                                                fileLock.release();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        f26p.toq(bufferedOutputStream);
                                        f26p.toq(randomAccessFile);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileLock = fileLockLock;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    f26p.toq(bufferedOutputStream);
                                    f26p.toq(randomAccessFile);
                                    throw th;
                                }
                            }
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException unused3) {
                                }
                            }
                            f26p.toq(bufferedOutputStream2);
                        } catch (IOException e3) {
                            e = e3;
                            bufferedOutputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedOutputStream = null;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        bufferedOutputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedOutputStream = null;
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            } catch (IOException e6) {
                e = e6;
                bufferedOutputStream = null;
                randomAccessFile = null;
            } catch (Throwable th6) {
                th = th6;
                bufferedOutputStream = null;
                randomAccessFile = null;
            }
            f26p.toq(randomAccessFile);
        }
    }

    /* JADX INFO: renamed from: y */
    private String m22134y() {
        return "dc_job_result_time_" + mo19320k();
    }

    public static void zy(Context context, f7z0 f7z0Var) {
        ixz ixzVarM20726k = Cdo.toq().m20726k();
        String strMo19531a = ixzVarM20726k == null ? "" : ixzVarM20726k.mo19531a();
        if (TextUtils.isEmpty(strMo19531a) || TextUtils.isEmpty(f7z0Var.m20840a())) {
            return;
        }
        m22133q(context, f7z0Var, strMo19531a);
    }

    protected boolean f7l8() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public abstract String mo21300g();

    /* JADX INFO: renamed from: n */
    protected boolean m22135n() {
        return ebn.toq(this.f34304q, String.valueOf(mo19320k()), this.f34303k);
    }

    @Override // java.lang.Runnable
    public void run() {
        String strMo21300g = mo21300g();
        if (TextUtils.isEmpty(strMo21300g)) {
            return;
        }
        if (m22135n()) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("DC run job mutual: " + mo19320k());
            return;
        }
        ixz ixzVarM20726k = Cdo.toq().m20726k();
        String strMo19531a = ixzVarM20726k == null ? "" : ixzVarM20726k.mo19531a();
        if (!TextUtils.isEmpty(strMo19531a) && f7l8()) {
            if (m22136s()) {
                SharedPreferences sharedPreferences = this.f34304q.getSharedPreferences("mipush_extra", 0);
                if (n5r1.toq(strMo21300g).equals(sharedPreferences.getString(m22132p(), null))) {
                    long j2 = sharedPreferences.getLong(m22134y(), 0L);
                    int iM21553k = com.xiaomi.push.service.a9.m21550q(this.f34304q).m21553k(oph.DCJobUploadRepeatedInterval.m21370a(), 604800);
                    if ((System.currentTimeMillis() - j2) / 1000 < this.f34303k) {
                        return;
                    }
                    if ((System.currentTimeMillis() - j2) / 1000 < iM21553k) {
                        strMo21300g = "same_" + j2;
                    }
                }
            }
            f7z0 f7z0Var = new f7z0();
            f7z0Var.m20839a(strMo21300g);
            f7z0Var.m20837a(System.currentTimeMillis());
            f7z0Var.m20838a(toq());
            m22133q(this.f34304q, f7z0Var, strMo19531a);
        }
    }

    /* JADX INFO: renamed from: s */
    protected boolean m22136s() {
        return false;
    }

    public abstract sc toq();
}
