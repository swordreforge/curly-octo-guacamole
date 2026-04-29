package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.engine.cache.InterfaceC3016k;
import java.io.File;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.q */
/* JADX INFO: compiled from: DiskLruCacheFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3019q implements InterfaceC3016k.k {

    /* JADX INFO: renamed from: q */
    private final zy f18302q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final long f62736zy;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.q$k */
    /* JADX INFO: compiled from: DiskLruCacheFactory.java */
    class k implements zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f18303k;

        k(String str) {
            this.f18303k = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.C3019q.zy
        /* JADX INFO: renamed from: k */
        public File mo10710k() {
            return new File(this.f18303k);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.q$toq */
    /* JADX INFO: compiled from: DiskLruCacheFactory.java */
    class toq implements zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f18304k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String f62737toq;

        toq(String str, String str2) {
            this.f18304k = str;
            this.f62737toq = str2;
        }

        @Override // com.bumptech.glide.load.engine.cache.C3019q.zy
        /* JADX INFO: renamed from: k */
        public File mo10710k() {
            return new File(this.f18304k, this.f62737toq);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.q$zy */
    /* JADX INFO: compiled from: DiskLruCacheFactory.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        File mo10710k();
    }

    public C3019q(String str, long j2) {
        this(new k(str), j2);
    }

    @Override // com.bumptech.glide.load.engine.cache.InterfaceC3016k.k
    public InterfaceC3016k build() {
        File fileMo10710k = this.f18302q.mo10710k();
        if (fileMo10710k == null) {
            return null;
        }
        if (fileMo10710k.isDirectory() || fileMo10710k.mkdirs()) {
            return C3017n.m10720q(fileMo10710k, this.f62736zy);
        }
        return null;
    }

    public C3019q(String str, String str2, long j2) {
        this(new toq(str, str2), j2);
    }

    public C3019q(zy zyVar, long j2) {
        this.f62736zy = j2;
        this.f18302q = zyVar;
    }
}
