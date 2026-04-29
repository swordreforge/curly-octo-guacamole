package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.oc;
import com.google.android.exoplayer2.upstream.t8r;
import com.google.android.exoplayer2.util.C3844k;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ParsingLoadable.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d2ok<T> implements oc.InterfaceC3814n {

    /* JADX INFO: renamed from: g */
    @zy.dd
    private volatile T f22996g;

    /* JADX INFO: renamed from: k */
    public final long f22997k;

    /* JADX INFO: renamed from: n */
    private final InterfaceC3789k<? extends T> f22998n;

    /* JADX INFO: renamed from: q */
    private final C3794f f22999q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final t8r f66833toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final int f66834zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.d2ok$k */
    /* JADX INFO: compiled from: ParsingLoadable.java */
    public interface InterfaceC3789k<T> {
        /* JADX INFO: renamed from: k */
        T mo12420k(Uri uri, InputStream inputStream) throws IOException;
    }

    public d2ok(kja0 kja0Var, Uri uri, int i2, InterfaceC3789k<? extends T> interfaceC3789k) {
        this(kja0Var, new t8r.toq().m13521p(uri).zy(1).m13519k(), i2, interfaceC3789k);
    }

    public static <T> T f7l8(kja0 kja0Var, InterfaceC3789k<? extends T> interfaceC3789k, Uri uri, int i2) throws IOException {
        d2ok d2okVar = new d2ok(kja0Var, uri, i2, interfaceC3789k);
        d2okVar.mo12654k();
        return (T) C3844k.f7l8(d2okVar.m13455n());
    }

    /* JADX INFO: renamed from: y */
    public static <T> T m13453y(kja0 kja0Var, InterfaceC3789k<? extends T> interfaceC3789k, t8r t8rVar, int i2) throws IOException {
        d2ok d2okVar = new d2ok(kja0Var, t8rVar, i2, interfaceC3789k);
        d2okVar.mo12654k();
        return (T) C3844k.f7l8(d2okVar.m13455n());
    }

    /* JADX INFO: renamed from: g */
    public Uri m13454g() {
        return this.f22999q.ni7();
    }

    @Override // com.google.android.exoplayer2.upstream.oc.InterfaceC3814n
    /* JADX INFO: renamed from: k */
    public final void mo12654k() throws IOException {
        this.f22999q.m13461z();
        cdj cdjVar = new cdj(this.f22999q, this.f66833toq);
        try {
            cdjVar.m13449q();
            this.f22996g = this.f22998n.mo12420k((Uri) C3844k.f7l8(this.f22999q.getUri()), cdjVar);
        } finally {
            com.google.android.exoplayer2.util.lrht.m13659h(cdjVar);
        }
    }

    @zy.dd
    /* JADX INFO: renamed from: n */
    public final T m13455n() {
        return this.f22996g;
    }

    /* JADX INFO: renamed from: q */
    public Map<String, List<String>> m13456q() {
        return this.f22999q.fu4();
    }

    public long toq() {
        return this.f22999q.zurt();
    }

    @Override // com.google.android.exoplayer2.upstream.oc.InterfaceC3814n
    public final void zy() {
    }

    public d2ok(kja0 kja0Var, t8r t8rVar, int i2, InterfaceC3789k<? extends T> interfaceC3789k) {
        this.f22999q = new C3794f(kja0Var);
        this.f66833toq = t8rVar;
        this.f66834zy = i2;
        this.f22998n = interfaceC3789k;
        this.f22997k = com.google.android.exoplayer2.source.ni7.m12808k();
    }
}
