package com.theme.loopwallpaper.utils.diskcache;

import android.util.Log;
import com.theme.loopwallpaper.utils.diskcache.C5442k;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import zy.lvui;

/* JADX INFO: compiled from: DiskLruCacheWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: n */
    private static final Object f30387n = new Object();

    /* JADX INFO: renamed from: q */
    private static final String f30388q = "DiskLruCacheWrapper";

    /* JADX INFO: renamed from: k */
    private C5442k f30389k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f72573toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f72574zy;

    public toq(String path, long size) {
        this.f72573toq = path;
        this.f72574zy = size;
    }

    /* JADX INFO: renamed from: n */
    private static boolean m18551n(C5442k cache) {
        return (cache == null || cache.isClosed()) ? false : true;
    }

    private C5442k toq() {
        if (!m18551n(this.f30389k)) {
            synchronized (f30387n) {
                if (!m18551n(this.f30389k)) {
                    try {
                        File file = new File(this.f72573toq);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        this.f30389k = C5442k.g1(file, 1, 1, this.f72574zy);
                    } catch (IOException e2) {
                        Log.w(f30388q, e2.toString());
                    }
                }
            }
        }
        return this.f30389k;
    }

    /* JADX INFO: renamed from: k */
    public void m18552k() {
        C5442k c5442k = this.f30389k;
        if (c5442k == null || c5442k.isClosed()) {
            return;
        }
        try {
            this.f30389k.close();
            this.f30389k = null;
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: q */
    public InputStream m18553q(@lvui String fileName) {
        C5442k qVar = toq();
        if (qVar == null) {
            return null;
        }
        try {
            C5442k.n nVarI1 = qVar.i1(fileName);
            if (nVarI1 != null) {
                return nVarI1.zy(0);
            }
            return null;
        } catch (IOException e2) {
            Log.w(f30388q, e2.toString());
            return null;
        }
    }

    public C5442k.zy zy(@lvui String fileName) {
        C5442k qVar = toq();
        if (qVar == null) {
            return null;
        }
        try {
            return qVar.yz(fileName);
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
