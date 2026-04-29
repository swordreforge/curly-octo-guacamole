package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.exoplayer2.source.C3629x;
import com.google.android.exoplayer2.source.InterfaceC3626r;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.source.jk;
import com.google.android.exoplayer2.upstream.C3798i;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.InterfaceC3850n;
import com.google.common.util.concurrent.InterfaceFutureC4792c;

/* JADX INFO: compiled from: MetadataRetriever.java */
/* JADX INFO: loaded from: classes2.dex */
public final class v0af {

    /* JADX INFO: compiled from: MetadataRetriever.java */
    private static final class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final int f67167f7l8 = 2;

        /* JADX INFO: renamed from: g */
        private static final int f23349g = 1;

        /* JADX INFO: renamed from: n */
        private static final int f23350n = 0;

        /* JADX INFO: renamed from: y */
        private static final int f23351y = 3;

        /* JADX INFO: renamed from: k */
        private final InterfaceC3626r f23352k;

        /* JADX INFO: renamed from: q */
        private final com.google.common.util.concurrent.i1<C3629x> f23353q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final HandlerThread f67168toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.ki f67169zy;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.v0af$toq$k */
        /* JADX INFO: compiled from: MetadataRetriever.java */
        private final class C3867k implements Handler.Callback {

            /* JADX INFO: renamed from: y */
            private static final int f23354y = 100;

            /* JADX INFO: renamed from: k */
            private final k f23356k = new k();

            /* JADX INFO: renamed from: n */
            private com.google.android.exoplayer2.source.jk f23357n;

            /* JADX INFO: renamed from: q */
            private com.google.android.exoplayer2.source.fti f23358q;

            /* JADX INFO: renamed from: com.google.android.exoplayer2.v0af$toq$k$k */
            /* JADX INFO: compiled from: MetadataRetriever.java */
            private final class k implements fti.toq {

                /* JADX INFO: renamed from: n */
                private boolean f23361n;

                /* JADX INFO: renamed from: k */
                private final C7970k f23360k = new C7970k();

                /* JADX INFO: renamed from: q */
                private final com.google.android.exoplayer2.upstream.toq f23362q = new C3798i(true, 65536);

                /* JADX INFO: renamed from: com.google.android.exoplayer2.v0af$toq$k$k$k, reason: collision with other inner class name */
                /* JADX INFO: compiled from: MetadataRetriever.java */
                private final class C7970k implements jk.InterfaceC3604k {
                    private C7970k() {
                    }

                    @Override // com.google.android.exoplayer2.source.InterfaceC3622o.k
                    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                    public void mo12411y(com.google.android.exoplayer2.source.jk jkVar) {
                        toq.this.f67169zy.zy(2).mo13642k();
                    }

                    @Override // com.google.android.exoplayer2.source.jk.InterfaceC3604k
                    public void ld6(com.google.android.exoplayer2.source.jk jkVar) {
                        toq.this.f23353q.mcp(jkVar.fn3e());
                        toq.this.f67169zy.zy(3).mo13642k();
                    }
                }

                public k() {
                }

                @Override // com.google.android.exoplayer2.source.fti.toq
                /* JADX INFO: renamed from: s */
                public void mo12410s(com.google.android.exoplayer2.source.fti ftiVar, pc pcVar) {
                    if (this.f23361n) {
                        return;
                    }
                    this.f23361n = true;
                    C3867k.this.f23357n = ftiVar.mo12565k(new fti.C3596k(pcVar.t8r(0)), this.f23362q, 0L);
                    C3867k.this.f23357n.n7h(this.f23360k, 0L);
                }
            }

            public C3867k() {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 0) {
                    com.google.android.exoplayer2.source.fti ftiVarZy = toq.this.f23352k.zy((tfm) message.obj);
                    this.f23358q = ftiVarZy;
                    ftiVarZy.f7l8(this.f23356k, null);
                    toq.this.f67169zy.qrj(1);
                    return true;
                }
                if (i2 == 1) {
                    try {
                        com.google.android.exoplayer2.source.jk jkVar = this.f23357n;
                        if (jkVar == null) {
                            ((com.google.android.exoplayer2.source.fti) C3844k.f7l8(this.f23358q)).n7h();
                        } else {
                            jkVar.t8r();
                        }
                        toq.this.f67169zy.mo13636k(1, 100);
                    } catch (Exception e2) {
                        toq.this.f23353q.jk(e2);
                        toq.this.f67169zy.zy(3).mo13642k();
                    }
                    return true;
                }
                if (i2 == 2) {
                    ((com.google.android.exoplayer2.source.jk) C3844k.f7l8(this.f23357n)).mo12597n(0L);
                    return true;
                }
                if (i2 != 3) {
                    return false;
                }
                if (this.f23357n != null) {
                    ((com.google.android.exoplayer2.source.fti) C3844k.f7l8(this.f23358q)).mo12564g(this.f23357n);
                }
                ((com.google.android.exoplayer2.source.fti) C3844k.f7l8(this.f23358q)).toq(this.f23356k);
                toq.this.f67169zy.mo13641y(null);
                toq.this.f67168toq.quit();
                return true;
            }
        }

        public toq(InterfaceC3626r interfaceC3626r, InterfaceC3850n interfaceC3850n) {
            this.f23352k = interfaceC3626r;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:MetadataRetriever");
            this.f67168toq = handlerThread;
            handlerThread.start();
            this.f67169zy = interfaceC3850n.zy(handlerThread.getLooper(), new C3867k());
            this.f23353q = com.google.common.util.concurrent.i1.gvn7();
        }

        /* JADX INFO: renamed from: n */
        public InterfaceFutureC4792c<C3629x> m13781n(tfm tfmVar) {
            this.f67169zy.f7l8(0, tfmVar).mo13642k();
            return this.f23353q;
        }
    }

    private v0af() {
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceFutureC4792c<C3629x> m13777k(Context context, tfm tfmVar) {
        return toq(context, tfmVar, InterfaceC3850n.f23248k);
    }

    /* JADX INFO: renamed from: q */
    private static InterfaceFutureC4792c<C3629x> m13778q(InterfaceC3626r interfaceC3626r, tfm tfmVar, InterfaceC3850n interfaceC3850n) {
        return new toq(interfaceC3626r, interfaceC3850n).m13781n(tfmVar);
    }

    @zy.yz
    static InterfaceFutureC4792c<C3629x> toq(Context context, tfm tfmVar, InterfaceC3850n interfaceC3850n) {
        return m13778q(new com.google.android.exoplayer2.source.n7h(context, new com.google.android.exoplayer2.extractor.f7l8().n7h(6)), tfmVar, interfaceC3850n);
    }

    public static InterfaceFutureC4792c<C3629x> zy(InterfaceC3626r interfaceC3626r, tfm tfmVar) {
        return m13778q(interfaceC3626r, tfmVar, InterfaceC3850n.f23248k);
    }
}
