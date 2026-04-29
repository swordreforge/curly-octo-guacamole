package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.offline.InterfaceC3545z;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.upstream.cache.C3778p;
import com.google.android.exoplayer2.upstream.cache.zy;
import com.google.android.exoplayer2.upstream.t8r;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.d2ok;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.oc;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import zy.dd;

/* JADX INFO: compiled from: ProgressiveDownloader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class jk implements InterfaceC3545z {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private volatile d2ok<Void, IOException> f65026f7l8;

    /* JADX INFO: renamed from: g */
    @dd
    private InterfaceC3545z.k f20956g;

    /* JADX INFO: renamed from: k */
    private final Executor f20957k;

    /* JADX INFO: renamed from: n */
    @dd
    private final oc f20958n;

    /* JADX INFO: renamed from: q */
    private final C3778p f20959q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.t8r f65027toq;

    /* JADX INFO: renamed from: y */
    private volatile boolean f20960y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.cache.zy f65028zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.jk$k */
    /* JADX INFO: compiled from: ProgressiveDownloader.java */
    class C3529k extends d2ok<Void, IOException> {
        C3529k() {
        }

        @Override // com.google.android.exoplayer2.util.d2ok
        /* JADX INFO: renamed from: q */
        protected void mo12375q() {
            jk.this.f20959q.toq();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.exoplayer2.util.d2ok
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Void mo12373n() throws IOException {
            jk.this.f20959q.m13412k();
            return null;
        }
    }

    public jk(tfm tfmVar, zy.C3786q c3786q) {
        this(tfmVar, c3786q, new androidx.window.layout.ni7());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public void m12384q(long j2, long j3, long j4) {
        InterfaceC3545z.k kVar = this.f20956g;
        if (kVar == null) {
            return;
        }
        kVar.mo12435k(j2, j3, (j2 == -1 || j2 == 0) ? -1.0f : (j3 * 100.0f) / j2);
    }

    @Override // com.google.android.exoplayer2.offline.InterfaceC3545z
    public void cancel() {
        this.f20960y = true;
        d2ok<Void, IOException> d2okVar = this.f65026f7l8;
        if (d2okVar != null) {
            d2okVar.cancel(true);
        }
    }

    @Override // com.google.android.exoplayer2.offline.InterfaceC3545z
    /* JADX INFO: renamed from: k */
    public void mo12370k(@dd InterfaceC3545z.k kVar) throws InterruptedException, IOException {
        this.f20956g = kVar;
        this.f65026f7l8 = new C3529k();
        oc ocVar = this.f20958n;
        if (ocVar != null) {
            ocVar.m13712k(-1000);
        }
        boolean z2 = false;
        while (!z2) {
            try {
                if (this.f20960y) {
                    break;
                }
                oc ocVar2 = this.f20958n;
                if (ocVar2 != null) {
                    ocVar2.toq(-1000);
                }
                this.f20957k.execute(this.f65026f7l8);
                try {
                    this.f65026f7l8.get();
                    z2 = true;
                } catch (ExecutionException e2) {
                    Throwable th = (Throwable) C3844k.f7l8(e2.getCause());
                    if (!(th instanceof oc.C3851k)) {
                        if (th instanceof IOException) {
                            throw ((IOException) th);
                        }
                        lrht.h7am(th);
                    }
                }
            } finally {
                this.f65026f7l8.m13565k();
                oc ocVar3 = this.f20958n;
                if (ocVar3 != null) {
                    ocVar3.m13713n(-1000);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.offline.InterfaceC3545z
    public void remove() {
        this.f65028zy.ni7().n7h(this.f65028zy.fu4().mo13368k(this.f65027toq));
    }

    public jk(tfm tfmVar, zy.C3786q c3786q, Executor executor) {
        this.f20957k = (Executor) C3844k.f7l8(executor);
        C3844k.f7l8(tfmVar.f22150q);
        com.google.android.exoplayer2.upstream.t8r t8rVarM13519k = new t8r.toq().m13521p(tfmVar.f22150q.f22207k).f7l8(tfmVar.f22150q.f22206g).zy(4).m13519k();
        this.f65027toq = t8rVarM13519k;
        com.google.android.exoplayer2.upstream.cache.zy zyVarM13444q = c3786q.m13444q();
        this.f65028zy = zyVarM13444q;
        this.f20959q = new C3778p(zyVarM13444q, t8rVarM13519k, null, new C3778p.k() { // from class: com.google.android.exoplayer2.offline.mcp
            @Override // com.google.android.exoplayer2.upstream.cache.C3778p.k
            /* JADX INFO: renamed from: k */
            public final void mo12377k(long j2, long j3, long j4) {
                this.f20968k.m12384q(j2, j3, j4);
            }
        });
        this.f20958n = c3786q.m13445s();
    }
}
