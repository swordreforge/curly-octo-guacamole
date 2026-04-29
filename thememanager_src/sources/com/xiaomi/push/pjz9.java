package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.C5889p;
import gyi.C6068k;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class pjz9 extends C5889p.k {

    /* JADX INFO: renamed from: k */
    private Context f33561k;

    /* JADX INFO: renamed from: n */
    private com.xiaomi.push.service.a9 f33562n;

    /* JADX INFO: renamed from: q */
    private SharedPreferences f33563q;

    public pjz9(Context context) {
        this.f33561k = context;
        this.f33563q = context.getSharedPreferences("mipush_extra", 0);
        this.f33562n = com.xiaomi.push.service.a9.m21550q(context);
    }

    private boolean f7l8() {
        if (!this.f33562n.qrj(oph.Upload4GSwitch.m21370a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f33563q.getLong("last_upload_data_timestamp", -1L)) > ((long) Math.max(86400, this.f33562n.m21553k(oph.Upload4GFrequency.m21370a(), 259200)));
    }

    /* JADX INFO: renamed from: g */
    private boolean m21379g() {
        if (!this.f33562n.qrj(oph.Upload3GSwitch.m21370a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f33563q.getLong("last_upload_data_timestamp", -1L)) > ((long) Math.max(86400, this.f33562n.m21553k(oph.Upload3GFrequency.m21370a(), 432000)));
    }

    /* JADX INFO: renamed from: n */
    private boolean m21380n() {
        if (oc.m21365z(this.f33561k)) {
            return false;
        }
        if ((oc.wvg(this.f33561k) || oc.o1t(this.f33561k)) && !f7l8()) {
            return true;
        }
        return (oc.m21363t(this.f33561k) && !m21379g()) || oc.mcp(this.f33561k);
    }

    /* JADX INFO: renamed from: q */
    private void m21381q(f7z0 f7z0Var) {
        if (f7z0Var.f32899a != sc.AppInstallList || f7z0Var.f32900a.startsWith("same_")) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f33563q.edit();
        editorEdit.putLong("dc_job_result_time_4", f7z0Var.f32898a);
        editorEdit.putString("dc_job_result_4", n5r1.toq(f7z0Var.f32900a));
        editorEdit.commit();
    }

    private List<f7z0> toq(File file) {
        RandomAccessFile randomAccessFile;
        FileInputStream fileInputStream;
        ixz ixzVarM20726k = Cdo.toq().m20726k();
        String strMo19531a = ixzVarM20726k == null ? "" : ixzVarM20726k.mo19531a();
        FileLock fileLock = null;
        if (TextUtils.isEmpty(strMo19531a)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[4];
        synchronized (pc.f33560k) {
            try {
                File file2 = new File(this.f33561k.getFilesDir(), "push_cdata.lock");
                f26p.m20828g(file2);
                randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    FileLock fileLockLock = randomAccessFile.getChannel().lock();
                    try {
                        fileInputStream = new FileInputStream(file);
                        while (fileInputStream.read(bArr) == 4) {
                            try {
                                int iM21388k = C5890q.m21388k(bArr);
                                byte[] bArr2 = new byte[iM21388k];
                                if (fileInputStream.read(bArr2) != iM21388k) {
                                    break;
                                }
                                byte[] bArrZy = ebn.zy(strMo19531a, bArr2);
                                if (bArrZy != null && bArrZy.length != 0) {
                                    f7z0 f7z0Var = new f7z0();
                                    qla.m21399n(f7z0Var, bArrZy);
                                    arrayList.add(f7z0Var);
                                    m21381q(f7z0Var);
                                }
                            } catch (Exception unused) {
                                fileLock = fileLockLock;
                                if (fileLock != null && fileLock.isValid()) {
                                    try {
                                        fileLock.release();
                                    } catch (IOException unused2) {
                                    }
                                }
                                f26p.toq(fileInputStream);
                            } catch (Throwable th) {
                                th = th;
                                fileLock = fileLockLock;
                                if (fileLock != null && fileLock.isValid()) {
                                    try {
                                        fileLock.release();
                                    } catch (IOException unused3) {
                                    }
                                }
                                f26p.toq(fileInputStream);
                                f26p.toq(randomAccessFile);
                                throw th;
                            }
                        }
                        if (fileLockLock != null && fileLockLock.isValid()) {
                            try {
                                fileLockLock.release();
                            } catch (IOException unused4) {
                            }
                        }
                        f26p.toq(fileInputStream);
                    } catch (Exception unused5) {
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = null;
                    }
                } catch (Exception unused6) {
                    fileInputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = null;
                }
            } catch (Exception unused7) {
                randomAccessFile = null;
                fileInputStream = null;
            } catch (Throwable th4) {
                th = th4;
                randomAccessFile = null;
                fileInputStream = null;
            }
            f26p.toq(randomAccessFile);
        }
        return arrayList;
    }

    private void zy() {
        SharedPreferences.Editor editorEdit = this.f33563q.edit();
        editorEdit.putLong("last_upload_data_timestamp", System.currentTimeMillis() / 1000);
        editorEdit.commit();
    }

    @Override // com.xiaomi.push.C5889p.k
    /* JADX INFO: renamed from: k */
    public String mo19320k() {
        return "1";
    }

    @Override // java.lang.Runnable
    public void run() {
        File file = new File(this.f33561k.getFilesDir(), "push_cdata.data");
        if (!oc.fu4(this.f33561k)) {
            if (file.length() > 1863680) {
                file.delete();
                return;
            }
            return;
        }
        if (!m21380n() && file.exists()) {
            List<f7z0> qVar = toq(file);
            if (!C5883n.m21299k(qVar)) {
                int size = qVar.size();
                if (size > 4000) {
                    qVar = qVar.subList(size - 4000, size);
                }
                mete meteVar = new mete();
                meteVar.m21285a(qVar);
                byte[] bArrM20833y = f26p.m20833y(qla.m21397g(meteVar));
                erbd erbdVar = new erbd(C6068k.f35060p, false);
                erbdVar.m20799c(kq.DataCollection.f33227a);
                erbdVar.m20786a(bArrM20833y);
                ixz ixzVarM20726k = Cdo.toq().m20726k();
                if (ixzVarM20726k != null) {
                    ixzVarM20726k.mo19532k(erbdVar, wwp.Notification, null);
                }
                zy();
            }
            file.delete();
        }
    }
}
