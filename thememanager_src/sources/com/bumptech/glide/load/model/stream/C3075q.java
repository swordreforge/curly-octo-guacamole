package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.model.InterfaceC3059h;
import com.bumptech.glide.load.model.kja0;
import com.bumptech.glide.load.model.t8r;
import com.bumptech.glide.signature.C3197n;
import java.io.InputStream;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.model.stream.q */
/* JADX INFO: compiled from: MediaStoreImageThumbLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3075q implements kja0<Uri, InputStream> {

    /* JADX INFO: renamed from: k */
    private final Context f18633k;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.stream.q$k */
    /* JADX INFO: compiled from: MediaStoreImageThumbLoader.java */
    public static class k implements InterfaceC3059h<Uri, InputStream> {

        /* JADX INFO: renamed from: k */
        private final Context f18634k;

        public k(Context context) {
            this.f18634k = context;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<Uri, InputStream> mo10618n(t8r t8rVar) {
            return new C3075q(this.f18634k);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    public C3075q(Context context) {
        this.f18633k = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10615k(@lvui Uri uri) {
        return com.bumptech.glide.load.data.mediastore.toq.m10642k(uri);
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public kja0.C3063k<InputStream> toq(@lvui Uri uri, int i2, int i3, @lvui C3087p c3087p) {
        if (com.bumptech.glide.load.data.mediastore.toq.m10644q(i2, i3)) {
            return new kja0.C3063k<>(new C3197n(uri), com.bumptech.glide.load.data.mediastore.zy.m10645q(this.f18633k, uri));
        }
        return null;
    }
}
