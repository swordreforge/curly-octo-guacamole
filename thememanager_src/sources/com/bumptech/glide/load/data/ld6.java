package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.InterfaceC2998n;
import com.bumptech.glide.load.resource.bitmap.C3114t;
import java.io.IOException;
import java.io.InputStream;
import zy.lvui;

/* JADX INFO: compiled from: InputStreamRewinder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ld6 implements InterfaceC2998n<InputStream> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f62696toq = 5242880;

    /* JADX INFO: renamed from: k */
    private final C3114t f18214k;

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.ld6$k */
    /* JADX INFO: compiled from: InputStreamRewinder.java */
    public static final class C2993k implements InterfaceC2998n.k<InputStream> {

        /* JADX INFO: renamed from: k */
        private final com.bumptech.glide.load.engine.bitmap_recycle.toq f18215k;

        public C2993k(com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
            this.f18215k = toqVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2998n.k
        @lvui
        /* JADX INFO: renamed from: k */
        public Class<InputStream> mo10632k() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2998n.k
        @lvui
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public InterfaceC2998n<InputStream> toq(InputStream inputStream) {
            return new ld6(inputStream, this.f18215k);
        }
    }

    public ld6(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
        C3114t c3114t = new C3114t(inputStream, toqVar);
        this.f18214k = c3114t;
        c3114t.mark(f62696toq);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2998n
    @lvui
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public InputStream mo10630k() throws IOException {
        this.f18214k.reset();
        return this.f18214k;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2998n
    public void toq() {
        this.f18214k.m11006q();
    }

    public void zy() {
        this.f18214k.zy();
    }
}
