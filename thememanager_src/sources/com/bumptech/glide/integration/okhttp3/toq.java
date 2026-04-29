package com.bumptech.glide.integration.okhttp3;

import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.model.C3084y;
import com.bumptech.glide.load.model.InterfaceC3059h;
import com.bumptech.glide.load.model.kja0;
import com.bumptech.glide.load.model.t8r;
import ixz.C6100k;
import java.io.InputStream;
import okhttp3.C7529t;
import okhttp3.InterfaceC7519n;
import zy.lvui;

/* JADX INFO: compiled from: OkHttpUrlLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq implements kja0<C3084y, InputStream> {

    /* JADX INFO: renamed from: k */
    private final InterfaceC7519n.k f17962k;

    /* JADX INFO: renamed from: com.bumptech.glide.integration.okhttp3.toq$k */
    /* JADX INFO: compiled from: OkHttpUrlLoader.java */
    public static class C2979k implements InterfaceC3059h<C3084y, InputStream> {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static volatile InterfaceC7519n.k f61654toq;

        /* JADX INFO: renamed from: k */
        private final InterfaceC7519n.k f17963k;

        public C2979k() {
            this(m10617k());
        }

        /* JADX INFO: renamed from: k */
        private static InterfaceC7519n.k m10617k() {
            if (f61654toq == null) {
                synchronized (C2979k.class) {
                    if (f61654toq == null) {
                        f61654toq = new C7529t();
                    }
                }
            }
            return f61654toq;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<C3084y, InputStream> mo10618n(t8r t8rVar) {
            return new toq(this.f17963k);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }

        public C2979k(@lvui InterfaceC7519n.k kVar) {
            this.f17963k = kVar;
        }
    }

    public toq(@lvui InterfaceC7519n.k kVar) {
        this.f17962k = kVar;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10615k(@lvui C3084y c3084y) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public kja0.C3063k<InputStream> toq(@lvui C3084y c3084y, int i2, int i3, @lvui C3087p c3087p) {
        return new kja0.C3063k<>(c3084y, new C6100k(this.f17962k, c3084y));
    }
}
