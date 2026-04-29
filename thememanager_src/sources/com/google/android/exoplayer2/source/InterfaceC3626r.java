package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.upstream.jp0y;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.r */
/* JADX INFO: compiled from: MediaSourceFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3626r {

    /* JADX INFO: renamed from: k */
    public static final InterfaceC3626r f21690k = new k();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.r$k */
    /* JADX INFO: compiled from: MediaSourceFactory.java */
    class k implements InterfaceC3626r {
        k() {
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3626r
        public InterfaceC3626r f7l8(@zy.dd com.google.android.exoplayer2.upstream.d3 d3Var) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3626r
        @Deprecated
        /* JADX INFO: renamed from: k */
        public InterfaceC3626r mo12635k(@zy.dd String str) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3626r
        /* JADX INFO: renamed from: n */
        public InterfaceC3626r mo12636n(@zy.dd com.google.android.exoplayer2.drm.ni7 ni7Var) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3626r
        /* JADX INFO: renamed from: q */
        public int[] mo12637q() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3626r
        @Deprecated
        /* JADX INFO: renamed from: s */
        public InterfaceC3626r mo12638s(@zy.dd com.google.android.exoplayer2.drm.fn3e fn3eVar) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3626r
        @Deprecated
        /* JADX INFO: renamed from: y */
        public InterfaceC3626r mo12639y(@zy.dd jp0y.zy zyVar) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3626r
        public fti zy(tfm tfmVar) {
            throw new UnsupportedOperationException();
        }
    }

    InterfaceC3626r f7l8(@zy.dd com.google.android.exoplayer2.upstream.d3 d3Var);

    @Deprecated
    /* JADX INFO: renamed from: g */
    default fti mo12633g(Uri uri) {
        return zy(tfm.m13021q(uri));
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    InterfaceC3626r mo12635k(@zy.dd String str);

    /* JADX INFO: renamed from: n */
    InterfaceC3626r mo12636n(@zy.dd com.google.android.exoplayer2.drm.ni7 ni7Var);

    /* JADX INFO: renamed from: q */
    int[] mo12637q();

    @Deprecated
    /* JADX INFO: renamed from: s */
    InterfaceC3626r mo12638s(@zy.dd com.google.android.exoplayer2.drm.fn3e fn3eVar);

    @Deprecated
    default InterfaceC3626r toq(@zy.dd List<StreamKey> list) {
        return this;
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    InterfaceC3626r mo12639y(@zy.dd jp0y.zy zyVar);

    fti zy(tfm tfmVar);
}
