package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.upstream.InterfaceC3808n;
import com.google.android.exoplayer2.util.C3844k;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.n */
/* JADX INFO: compiled from: BandwidthMeter.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3808n {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.n$k */
    /* JADX INFO: compiled from: BandwidthMeter.java */
    public interface k {

        /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.n$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BandwidthMeter.java */
        public static final class C7968k {

            /* JADX INFO: renamed from: k */
            private final CopyOnWriteArrayList<C7969k> f23038k = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.n$k$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: BandwidthMeter.java */
            static final class C7969k {

                /* JADX INFO: renamed from: k */
                private final Handler f23039k;

                /* JADX INFO: renamed from: toq, reason: collision with root package name */
                private final k f66872toq;

                /* JADX INFO: renamed from: zy, reason: collision with root package name */
                private boolean f66873zy;

                public C7969k(Handler handler, k kVar) {
                    this.f23039k = handler;
                    this.f66872toq = kVar;
                }

                /* JADX INFO: renamed from: q */
                public void m13492q() {
                    this.f66873zy = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: q */
            public static /* synthetic */ void m13489q(C7969k c7969k, int i2, long j2, long j3) {
                c7969k.f66872toq.fti(i2, j2, j3);
            }

            /* JADX INFO: renamed from: n */
            public void m13490n(k kVar) {
                for (C7969k c7969k : this.f23038k) {
                    if (c7969k.f66872toq == kVar) {
                        c7969k.m13492q();
                        this.f23038k.remove(c7969k);
                    }
                }
            }

            public void toq(Handler handler, k kVar) {
                C3844k.f7l8(handler);
                C3844k.f7l8(kVar);
                m13490n(kVar);
                this.f23038k.add(new C7969k(handler, kVar));
            }

            public void zy(final int i2, final long j2, final long j3) {
                for (final C7969k c7969k : this.f23038k) {
                    if (!c7969k.f66873zy) {
                        c7969k.f23039k.post(new Runnable() { // from class: com.google.android.exoplayer2.upstream.q
                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC3808n.k.C7968k.m13489q(c7969k, i2, j2, j3);
                            }
                        });
                    }
                }
            }
        }

        void fti(int i2, long j2, long j3);
    }

    void f7l8(Handler handler, k kVar);

    /* JADX INFO: renamed from: k */
    default long m13487k() {
        return C3548p.f65257toq;
    }

    /* JADX INFO: renamed from: n */
    long mo12412n();

    /* JADX INFO: renamed from: q */
    void mo12413q(k kVar);

    @zy.dd
    uv6 zy();
}
