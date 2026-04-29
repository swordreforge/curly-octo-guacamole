package com.google.android.exoplayer2.offline;

import android.util.SparseArray;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.upstream.cache.zy;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.exoplayer2.offline.q */
/* JADX INFO: compiled from: DefaultDownloaderFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3537q implements o1t {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final SparseArray<Constructor<? extends InterfaceC3545z>> f65050zy = zy();

    /* JADX INFO: renamed from: k */
    private final zy.C3786q f21003k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Executor f65051toq;

    @Deprecated
    public C3537q(zy.C3786q c3786q) {
        this(c3786q, new androidx.window.layout.ni7());
    }

    /* JADX INFO: renamed from: q */
    private static Constructor<? extends InterfaceC3545z> m12419q(Class<?> cls) {
        try {
            return cls.asSubclass(InterfaceC3545z.class).getConstructor(tfm.class, zy.C3786q.class, Executor.class);
        } catch (NoSuchMethodException e2) {
            throw new IllegalStateException("Downloader constructor missing", e2);
        }
    }

    private InterfaceC3545z toq(DownloadRequest downloadRequest, int i2) {
        Constructor<? extends InterfaceC3545z> constructor = f65050zy.get(i2);
        if (constructor == null) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Module missing for content type ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
        try {
            return constructor.newInstance(new tfm.zy().eqxt(downloadRequest.f20922q).jp0y(downloadRequest.f20918g).x2(downloadRequest.f20923s).m13065k(), this.f21003k, this.f65051toq);
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder(61);
            sb2.append("Failed to instantiate downloader for content type ");
            sb2.append(i2);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private static SparseArray<Constructor<? extends InterfaceC3545z>> zy() {
        SparseArray<Constructor<? extends InterfaceC3545z>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, m12419q(Class.forName("com.google.android.exoplayer2.source.dash.offline.DashDownloader")));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, m12419q(Class.forName("com.google.android.exoplayer2.source.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, m12419q(Class.forName("com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        return sparseArray;
    }

    @Override // com.google.android.exoplayer2.offline.o1t
    /* JADX INFO: renamed from: k */
    public InterfaceC3545z mo12418k(DownloadRequest downloadRequest) {
        int iMu = lrht.mu(downloadRequest.f20922q, downloadRequest.f20920n);
        if (iMu == 0 || iMu == 1 || iMu == 2) {
            return toq(downloadRequest, iMu);
        }
        if (iMu == 4) {
            return new jk(new tfm.zy().eqxt(downloadRequest.f20922q).x2(downloadRequest.f20923s).m13065k(), this.f21003k, this.f65051toq);
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Unsupported type: ");
        sb.append(iMu);
        throw new IllegalArgumentException(sb.toString());
    }

    public C3537q(zy.C3786q c3786q, Executor executor) {
        this.f21003k = (zy.C3786q) C3844k.f7l8(c3786q);
        this.f65051toq = (Executor) C3844k.f7l8(executor);
    }
}
