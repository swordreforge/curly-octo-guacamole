package com.google.android.exoplayer2.offline;

import java.io.File;
import java.io.IOException;
import zy.dd;
import zy.y9n;

/* JADX INFO: compiled from: ActionFileUpgradeUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.toq$k */
    /* JADX INFO: compiled from: ActionFileUpgradeUtil.java */
    public interface InterfaceC3543k {
        /* JADX INFO: renamed from: k */
        String m12452k(DownloadRequest downloadRequest);
    }

    private toq() {
    }

    /* JADX INFO: renamed from: k */
    static void m12451k(DownloadRequest downloadRequest, zy zyVar, boolean z2, long j2) throws IOException {
        C3531n c3531n;
        C3531n c3531nF7l8 = zyVar.f7l8(downloadRequest.f20919k);
        if (c3531nF7l8 != null) {
            c3531n = t8r.ki(c3531nF7l8, downloadRequest, c3531nF7l8.f20972g, j2);
        } else {
            c3531n = new C3531n(downloadRequest, z2 ? 3 : 0, j2, j2, -1L, 0, 0);
        }
        zyVar.mo12381y(c3531n);
    }

    @y9n
    public static void toq(File file, @dd InterfaceC3543k interfaceC3543k, zy zyVar, boolean z2, boolean z3) throws IOException {
        C3530k c3530k = new C3530k(file);
        if (c3530k.toq()) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (DownloadRequest downloadRequestM12359k : c3530k.m12389n()) {
                    if (interfaceC3543k != null) {
                        downloadRequestM12359k = downloadRequestM12359k.m12359k(interfaceC3543k.m12452k(downloadRequestM12359k));
                    }
                    m12451k(downloadRequestM12359k, zyVar, z3, jCurrentTimeMillis);
                }
                c3530k.m12388k();
            } catch (Throwable th) {
                if (z2) {
                    c3530k.m12388k();
                }
                throw th;
            }
        }
    }
}
