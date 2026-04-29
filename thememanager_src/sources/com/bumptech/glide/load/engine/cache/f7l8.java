package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.C3019q;
import com.bumptech.glide.load.engine.cache.InterfaceC3016k;
import java.io.File;
import zy.dd;

/* JADX INFO: compiled from: ExternalPreferredCacheDiskCacheFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f7l8 extends C3019q {

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.f7l8$k */
    /* JADX INFO: compiled from: ExternalPreferredCacheDiskCacheFactory.java */
    class C3014k implements C3019q.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Context f18292k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String f62730toq;

        C3014k(Context context, String str) {
            this.f18292k = context;
            this.f62730toq = str;
        }

        @dd
        private File toq() {
            File cacheDir = this.f18292k.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f62730toq != null ? new File(cacheDir, this.f62730toq) : cacheDir;
        }

        @Override // com.bumptech.glide.load.engine.cache.C3019q.zy
        /* JADX INFO: renamed from: k */
        public File mo10710k() {
            File externalCacheDir;
            File qVar = toq();
            return ((qVar == null || !qVar.exists()) && (externalCacheDir = this.f18292k.getExternalCacheDir()) != null && externalCacheDir.canWrite()) ? this.f62730toq != null ? new File(externalCacheDir, this.f62730toq) : externalCacheDir : qVar;
        }
    }

    public f7l8(Context context) {
        this(context, InterfaceC3016k.k.f62732toq, 262144000L);
    }

    public f7l8(Context context, long j2) {
        this(context, InterfaceC3016k.k.f62732toq, j2);
    }

    public f7l8(Context context, String str, long j2) {
        super(new C3014k(context, str), j2);
    }
}
