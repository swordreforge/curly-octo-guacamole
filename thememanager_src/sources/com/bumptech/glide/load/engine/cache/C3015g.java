package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.C3019q;
import com.bumptech.glide.load.engine.cache.InterfaceC3016k;
import java.io.File;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.g */
/* JADX INFO: compiled from: ExternalCacheDiskCacheFactory.java */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C3015g extends C3019q {

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.g$k */
    /* JADX INFO: compiled from: ExternalCacheDiskCacheFactory.java */
    class k implements C3019q.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Context f18293k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String f62731toq;

        k(Context context, String str) {
            this.f18293k = context;
            this.f62731toq = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.C3019q.zy
        /* JADX INFO: renamed from: k */
        public File mo10710k() {
            File externalCacheDir = this.f18293k.getExternalCacheDir();
            if (externalCacheDir == null) {
                return null;
            }
            return this.f62731toq != null ? new File(externalCacheDir, this.f62731toq) : externalCacheDir;
        }
    }

    public C3015g(Context context) {
        this(context, InterfaceC3016k.k.f62732toq, InterfaceC3016k.k.f18294k);
    }

    public C3015g(Context context, int i2) {
        this(context, InterfaceC3016k.k.f62732toq, i2);
    }

    public C3015g(Context context, String str, int i2) {
        super(new k(context, str), i2);
    }
}
