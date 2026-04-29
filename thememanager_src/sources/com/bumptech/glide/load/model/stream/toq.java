package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.C3138s;
import com.bumptech.glide.load.data.C2999p;
import com.bumptech.glide.load.model.C3084y;
import com.bumptech.glide.load.model.InterfaceC3059h;
import com.bumptech.glide.load.model.kja0;
import com.bumptech.glide.load.model.n7h;
import com.bumptech.glide.load.model.t8r;
import com.google.android.exoplayer2.x2;
import java.io.InputStream;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: HttpGlideUrlLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq implements kja0<C3084y, InputStream> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final C3138s<Integer> f62855toq = C3138s.f7l8("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(x2.f67258n7h));

    /* JADX INFO: renamed from: k */
    @dd
    private final n7h<C3084y, C3084y> f18636k;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.stream.toq$k */
    /* JADX INFO: compiled from: HttpGlideUrlLoader.java */
    public static class C3077k implements InterfaceC3059h<C3084y, InputStream> {

        /* JADX INFO: renamed from: k */
        private final n7h<C3084y, C3084y> f18637k = new n7h<>(500);

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<C3084y, InputStream> mo10618n(t8r t8rVar) {
            return new toq(this.f18637k);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    public toq() {
        this(null);
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10615k(@lvui C3084y c3084y) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public kja0.C3063k<InputStream> toq(@lvui C3084y c3084y, int i2, int i3, @lvui C3087p c3087p) {
        n7h<C3084y, C3084y> n7hVar = this.f18636k;
        if (n7hVar != null) {
            C3084y qVar = n7hVar.toq(c3084y, 0, 0);
            if (qVar == null) {
                this.f18636k.zy(c3084y, 0, 0, c3084y);
            } else {
                c3084y = qVar;
            }
        }
        return new kja0.C3063k<>(c3084y, new C2999p(c3084y, ((Integer) c3087p.zy(f62855toq)).intValue()));
    }

    public toq(@dd n7h<C3084y, C3084y> n7hVar) {
        this.f18636k = n7hVar;
    }
}
