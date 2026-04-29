package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.C3019q;
import com.bumptech.glide.load.engine.cache.InterfaceC3016k;
import java.io.File;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.y */
/* JADX INFO: compiled from: InternalCacheDiskCacheFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3024y extends C3019q {

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.y$k */
    /* JADX INFO: compiled from: InternalCacheDiskCacheFactory.java */
    class k implements C3019q.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Context f18322k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String f62748toq;

        k(Context context, String str) {
            this.f18322k = context;
            this.f62748toq = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.C3019q.zy
        /* JADX INFO: renamed from: k */
        public File mo10710k() {
            File cacheDir = this.f18322k.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f62748toq != null ? new File(cacheDir, this.f62748toq) : cacheDir;
        }
    }

    public C3024y(Context context) {
        this(context, InterfaceC3016k.k.f62732toq, 262144000L);
    }

    public C3024y(Context context, long j2) {
        this(context, InterfaceC3016k.k.f62732toq, j2);
    }

    public C3024y(Context context, String str, long j2) {
        super(new k(context, str), j2);
    }
}
