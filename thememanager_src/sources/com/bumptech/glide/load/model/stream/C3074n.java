package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.model.InterfaceC3059h;
import com.bumptech.glide.load.model.kja0;
import com.bumptech.glide.load.model.t8r;
import com.bumptech.glide.load.resource.bitmap.eqxt;
import com.bumptech.glide.signature.C3197n;
import java.io.InputStream;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.model.stream.n */
/* JADX INFO: compiled from: MediaStoreVideoThumbLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3074n implements kja0<Uri, InputStream> {

    /* JADX INFO: renamed from: k */
    private final Context f18631k;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.stream.n$k */
    /* JADX INFO: compiled from: MediaStoreVideoThumbLoader.java */
    public static class k implements InterfaceC3059h<Uri, InputStream> {

        /* JADX INFO: renamed from: k */
        private final Context f18632k;

        public k(Context context) {
            this.f18632k = context;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<Uri, InputStream> mo10618n(t8r t8rVar) {
            return new C3074n(this.f18632k);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    public C3074n(Context context) {
        this.f18631k = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: n */
    private boolean m10901n(C3087p c3087p) {
        Long l2 = (Long) c3087p.zy(eqxt.f62875f7l8);
        return l2 != null && l2.longValue() == -1;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10615k(@lvui Uri uri) {
        return com.bumptech.glide.load.data.mediastore.toq.zy(uri);
    }

    @Override // com.bumptech.glide.load.model.kja0
    @dd
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public kja0.C3063k<InputStream> toq(@lvui Uri uri, int i2, int i3, @lvui C3087p c3087p) {
        if (com.bumptech.glide.load.data.mediastore.toq.m10644q(i2, i3) && m10901n(c3087p)) {
            return new kja0.C3063k<>(new C3197n(uri), com.bumptech.glide.load.data.mediastore.zy.f7l8(this.f18631k, uri));
        }
        return null;
    }
}
