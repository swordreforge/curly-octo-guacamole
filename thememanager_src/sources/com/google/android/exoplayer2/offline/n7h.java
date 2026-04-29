package com.google.android.exoplayer2.offline;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.bek6;
import com.google.android.exoplayer2.cv06;
import com.google.android.exoplayer2.metadata.InterfaceC3508q;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.C3564a;
import com.google.android.exoplayer2.source.C3629x;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.source.jk;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.trackselection.C3705g;
import com.google.android.exoplayer2.trackselection.InterfaceC3715s;
import com.google.android.exoplayer2.trackselection.ld6;
import com.google.android.exoplayer2.trackselection.zurt;
import com.google.android.exoplayer2.upstream.C3798i;
import com.google.android.exoplayer2.upstream.InterfaceC3808n;
import com.google.android.exoplayer2.upstream.kja0;
import com.google.android.exoplayer2.upstream.uv6;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.vep5;
import com.google.android.exoplayer2.video.InterfaceC3894z;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import zy.dd;

/* JADX INFO: compiled from: DownloadHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public final class n7h {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    @Deprecated
    public static final C3705g.q f65041cdj;

    /* JADX INFO: renamed from: h */
    @Deprecated
    public static final C3705g.q f20977h;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final C3705g.q f65042kja0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final pc.C3550q f65043f7l8;

    /* JADX INFO: renamed from: g */
    private final Handler f20978g;

    /* JADX INFO: renamed from: k */
    private final tfm.C3701y f20979k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private C3629x[] f65044ld6;

    /* JADX INFO: renamed from: n */
    private final SparseIntArray f20980n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private List<InterfaceC3715s>[][] f65045n7h;

    /* JADX INFO: renamed from: p */
    private f7l8 f20981p;

    /* JADX INFO: renamed from: q */
    private final cv06[] f20982q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private List<InterfaceC3715s>[][] f65046qrj;

    /* JADX INFO: renamed from: s */
    private zy f20983s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private final com.google.android.exoplayer2.source.fti f65047toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private ld6.C3709k[] f65048x2;

    /* JADX INFO: renamed from: y */
    private boolean f20984y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final C3705g f65049zy;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DownloadHelper.java */
    static final class f7l8 implements fti.toq, jk.InterfaceC3604k, Handler.Callback {

        /* JADX INFO: renamed from: c */
        private static final int f20985c = 0;

        /* JADX INFO: renamed from: e */
        private static final int f20986e = 1;

        /* JADX INFO: renamed from: f */
        private static final int f20987f = 3;

        /* JADX INFO: renamed from: l */
        private static final int f20988l = 2;

        /* JADX INFO: renamed from: r */
        private static final int f20989r = 1;

        /* JADX INFO: renamed from: t */
        private static final int f20990t = 0;

        /* JADX INFO: renamed from: h */
        public pc f20992h;

        /* JADX INFO: renamed from: i */
        public com.google.android.exoplayer2.source.jk[] f20993i;

        /* JADX INFO: renamed from: k */
        private final com.google.android.exoplayer2.source.fti f20994k;

        /* JADX INFO: renamed from: p */
        private final Handler f20996p;

        /* JADX INFO: renamed from: q */
        private final n7h f20997q;

        /* JADX INFO: renamed from: s */
        private final HandlerThread f20998s;

        /* JADX INFO: renamed from: z */
        private boolean f21000z;

        /* JADX INFO: renamed from: n */
        private final com.google.android.exoplayer2.upstream.toq f20995n = new C3798i(true, 65536);

        /* JADX INFO: renamed from: g */
        private final ArrayList<com.google.android.exoplayer2.source.jk> f20991g = new ArrayList<>();

        /* JADX INFO: renamed from: y */
        private final Handler f20999y = lrht.m13671t(new Handler.Callback() { // from class: com.google.android.exoplayer2.offline.kja0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f20967k.toq(message);
            }
        });

        public f7l8(com.google.android.exoplayer2.source.fti ftiVar, n7h n7hVar) {
            this.f20994k = ftiVar;
            this.f20997q = n7hVar;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
            this.f20998s = handlerThread;
            handlerThread.start();
            Handler handlerFu4 = lrht.fu4(handlerThread.getLooper(), this);
            this.f20996p = handlerFu4;
            handlerFu4.sendEmptyMessage(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean toq(Message message) {
            if (this.f21000z) {
                return false;
            }
            int i2 = message.what;
            if (i2 == 0) {
                this.f20997q.m12392c();
                return true;
            }
            if (i2 != 1) {
                return false;
            }
            m12409q();
            this.f20997q.m12394f((IOException) lrht.ld6(message.obj));
            return true;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                this.f20994k.f7l8(this, null);
                this.f20996p.sendEmptyMessage(1);
                return true;
            }
            int i3 = 0;
            if (i2 == 1) {
                try {
                    if (this.f20993i == null) {
                        this.f20994k.n7h();
                    } else {
                        while (i3 < this.f20991g.size()) {
                            this.f20991g.get(i3).t8r();
                            i3++;
                        }
                    }
                    this.f20996p.sendEmptyMessageDelayed(1, 100L);
                } catch (IOException e2) {
                    this.f20999y.obtainMessage(1, e2).sendToTarget();
                }
                return true;
            }
            if (i2 == 2) {
                com.google.android.exoplayer2.source.jk jkVar = (com.google.android.exoplayer2.source.jk) message.obj;
                if (this.f20991g.contains(jkVar)) {
                    jkVar.mo12597n(0L);
                }
                return true;
            }
            if (i2 != 3) {
                return false;
            }
            com.google.android.exoplayer2.source.jk[] jkVarArr = this.f20993i;
            if (jkVarArr != null) {
                int length = jkVarArr.length;
                while (i3 < length) {
                    this.f20994k.mo12564g(jkVarArr[i3]);
                    i3++;
                }
            }
            this.f20994k.toq(this);
            this.f20996p.removeCallbacksAndMessages(null);
            this.f20998s.quit();
            return true;
        }

        @Override // com.google.android.exoplayer2.source.jk.InterfaceC3604k
        public void ld6(com.google.android.exoplayer2.source.jk jkVar) {
            this.f20991g.remove(jkVar);
            if (this.f20991g.isEmpty()) {
                this.f20996p.removeMessages(1);
                this.f20999y.sendEmptyMessage(0);
            }
        }

        /* JADX INFO: renamed from: q */
        public void m12409q() {
            if (this.f21000z) {
                return;
            }
            this.f21000z = true;
            this.f20996p.sendEmptyMessage(3);
        }

        @Override // com.google.android.exoplayer2.source.fti.toq
        /* JADX INFO: renamed from: s */
        public void mo12410s(com.google.android.exoplayer2.source.fti ftiVar, pc pcVar) {
            com.google.android.exoplayer2.source.jk[] jkVarArr;
            if (this.f20992h != null) {
                return;
            }
            if (pcVar.m12484i(0, new pc.C3550q()).ld6()) {
                this.f20999y.obtainMessage(1, new C3532g()).sendToTarget();
                return;
            }
            this.f20992h = pcVar;
            this.f20993i = new com.google.android.exoplayer2.source.jk[pcVar.qrj()];
            int i2 = 0;
            while (true) {
                jkVarArr = this.f20993i;
                if (i2 >= jkVarArr.length) {
                    break;
                }
                com.google.android.exoplayer2.source.jk jkVarMo12565k = this.f20994k.mo12565k(new fti.C3596k(pcVar.t8r(i2)), this.f20995n, 0L);
                this.f20993i[i2] = jkVarMo12565k;
                this.f20991g.add(jkVarMo12565k);
                i2++;
            }
            for (com.google.android.exoplayer2.source.jk jkVar : jkVarArr) {
                jkVar.n7h(this, 0L);
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3622o.k
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void mo12411y(com.google.android.exoplayer2.source.jk jkVar) {
            if (this.f20991g.contains(jkVar)) {
                this.f20996p.obtainMessage(2, jkVar).sendToTarget();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.n7h$g */
    /* JADX INFO: compiled from: DownloadHelper.java */
    public static class C3532g extends IOException {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.n7h$k */
    /* JADX INFO: compiled from: DownloadHelper.java */
    class C3533k implements InterfaceC3894z {
        C3533k() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.n7h$n */
    /* JADX INFO: compiled from: DownloadHelper.java */
    private static final class C3534n implements InterfaceC3808n {
        private C3534n() {
        }

        @Override // com.google.android.exoplayer2.upstream.InterfaceC3808n
        public void f7l8(Handler handler, InterfaceC3808n.k kVar) {
        }

        @Override // com.google.android.exoplayer2.upstream.InterfaceC3808n
        /* JADX INFO: renamed from: n */
        public long mo12412n() {
            return 0L;
        }

        @Override // com.google.android.exoplayer2.upstream.InterfaceC3808n
        /* JADX INFO: renamed from: q */
        public void mo12413q(InterfaceC3808n.k kVar) {
        }

        @Override // com.google.android.exoplayer2.upstream.InterfaceC3808n
        @dd
        public uv6 zy() {
            return null;
        }

        /* synthetic */ C3534n(C3533k c3533k) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.n7h$q */
    /* JADX INFO: compiled from: DownloadHelper.java */
    private static final class C3535q extends com.google.android.exoplayer2.trackselection.zy {

        /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.n7h$q$k */
        /* JADX INFO: compiled from: DownloadHelper.java */
        private static final class k implements InterfaceC3715s.toq {
            private k() {
            }

            @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s.toq
            /* JADX INFO: renamed from: k */
            public InterfaceC3715s[] mo12416k(InterfaceC3715s.k[] kVarArr, InterfaceC3808n interfaceC3808n, fti.C3596k c3596k, pc pcVar) {
                InterfaceC3715s[] interfaceC3715sArr = new InterfaceC3715s[kVarArr.length];
                for (int i2 = 0; i2 < kVarArr.length; i2++) {
                    InterfaceC3715s.k kVar = kVarArr[i2];
                    interfaceC3715sArr[i2] = kVar == null ? null : new C3535q(kVar.f22341k, kVar.f66064toq);
                }
                return interfaceC3715sArr;
            }

            /* synthetic */ k(C3533k c3533k) {
                this();
            }
        }

        public C3535q(C3564a c3564a, int[] iArr) {
            super(c3564a, iArr);
        }

        @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
        public int fn3e() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
        /* JADX INFO: renamed from: k */
        public int mo12414k() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
        public void ki(long j2, long j3, long j4, List<? extends com.google.android.exoplayer2.source.chunk.n7h> list, com.google.android.exoplayer2.source.chunk.kja0[] kja0VarArr) {
        }

        @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
        @dd
        /* JADX INFO: renamed from: p */
        public Object mo12415p() {
            return null;
        }
    }

    /* JADX INFO: compiled from: DownloadHelper.java */
    class toq implements com.google.android.exoplayer2.audio.fn3e {
        toq() {
        }
    }

    /* JADX INFO: compiled from: DownloadHelper.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        void m12417k(n7h n7hVar);

        void toq(n7h n7hVar, IOException iOException);
    }

    static {
        C3705g.q qVarMo13111z = C3705g.q.hp.zy().fti(true).mo13111z();
        f65042kja0 = qVarMo13111z;
        f20977h = qVarMo13111z;
        f65041cdj = qVarMo13111z;
    }

    public n7h(tfm tfmVar, @dd com.google.android.exoplayer2.source.fti ftiVar, C3705g.q qVar, cv06[] cv06VarArr) {
        this.f20979k = (tfm.C3701y) C3844k.f7l8(tfmVar.f22150q);
        this.f65047toq = ftiVar;
        C3533k c3533k = null;
        C3705g c3705g = new C3705g(qVar, new C3535q.k(c3533k));
        this.f65049zy = c3705g;
        this.f20982q = cv06VarArr;
        this.f20980n = new SparseIntArray();
        c3705g.zy(new zurt.InterfaceC3717k() { // from class: com.google.android.exoplayer2.offline.y
            @Override // com.google.android.exoplayer2.trackselection.zurt.InterfaceC3717k
            /* JADX INFO: renamed from: k */
            public final void mo12454k() {
                n7h.ncyb();
            }
        }, new C3534n(c3533k));
        this.f20978g = lrht.wvg();
        this.f65043f7l8 = new pc.C3550q();
    }

    public static C3705g.q a9(Context context) {
        return C3705g.q.kja0(context).zy().fti(true).mo13111z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m12392c() {
        C3844k.f7l8(this.f20981p);
        C3844k.f7l8(this.f20981p.f20993i);
        C3844k.f7l8(this.f20981p.f20992h);
        int length = this.f20981p.f20993i.length;
        int length2 = this.f20982q.length;
        this.f65046qrj = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
        this.f65045n7h = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
        for (int i2 = 0; i2 < length; i2++) {
            for (int i3 = 0; i3 < length2; i3++) {
                this.f65046qrj[i2][i3] = new ArrayList();
                this.f65045n7h[i2][i3] = Collections.unmodifiableList(this.f65046qrj[i2][i3]);
            }
        }
        this.f65044ld6 = new C3629x[length];
        this.f65048x2 = new ld6.C3709k[length];
        for (int i4 = 0; i4 < length; i4++) {
            this.f65044ld6[i4] = this.f20981p.f20993i[i4].fn3e();
            this.f65049zy.mo13140g(m12393e(i4).f22336n);
            this.f65048x2[i4] = (ld6.C3709k) C3844k.f7l8(this.f65049zy.ld6());
        }
        nn86();
        ((Handler) C3844k.f7l8(this.f20978g)).post(new Runnable() { // from class: com.google.android.exoplayer2.offline.x2
            @Override // java.lang.Runnable
            public final void run() {
                this.f21038k.n5r1();
            }
        });
    }

    private static com.google.android.exoplayer2.source.fti cdj(tfm tfmVar, kja0.InterfaceC3804k interfaceC3804k, @dd com.google.android.exoplayer2.drm.fn3e fn3eVar) {
        return new com.google.android.exoplayer2.source.n7h(interfaceC3804k, com.google.android.exoplayer2.extractor.kja0.f19867k).mo12638s(fn3eVar).zy(tfmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void dd(List list) {
    }

    @RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    /* JADX INFO: renamed from: e */
    private com.google.android.exoplayer2.trackselection.ni7 m12393e(int i2) {
        boolean z2;
        try {
            com.google.android.exoplayer2.trackselection.ni7 ni7VarF7l8 = this.f65049zy.f7l8(this.f20982q, this.f65044ld6[i2], new fti.C3596k(this.f20981p.f20992h.t8r(i2)), this.f20981p.f20992h);
            for (int i3 = 0; i3 < ni7VarF7l8.f22335k; i3++) {
                InterfaceC3715s interfaceC3715s = ni7VarF7l8.f66061zy[i3];
                if (interfaceC3715s != null) {
                    List<InterfaceC3715s> list = this.f65046qrj[i2][i3];
                    int i4 = 0;
                    while (true) {
                        if (i4 >= list.size()) {
                            z2 = false;
                            break;
                        }
                        InterfaceC3715s interfaceC3715s2 = list.get(i4);
                        if (interfaceC3715s2.qrj() == interfaceC3715s.qrj()) {
                            this.f20980n.clear();
                            for (int i5 = 0; i5 < interfaceC3715s2.length(); i5++) {
                                this.f20980n.put(interfaceC3715s2.mo13148y(i5), 0);
                            }
                            for (int i6 = 0; i6 < interfaceC3715s.length(); i6++) {
                                this.f20980n.put(interfaceC3715s.mo13148y(i6), 0);
                            }
                            int[] iArr = new int[this.f20980n.size()];
                            for (int i7 = 0; i7 < this.f20980n.size(); i7++) {
                                iArr[i7] = this.f20980n.keyAt(i7);
                            }
                            list.set(i4, new C3535q(interfaceC3715s2.qrj(), iArr));
                            z2 = true;
                        } else {
                            i4++;
                        }
                    }
                    if (!z2) {
                        list.add(interfaceC3715s);
                    }
                }
            }
            return ni7VarF7l8;
        } catch (com.google.android.exoplayer2.ki e2) {
            throw new UnsupportedOperationException(e2);
        }
    }

    public static cv06[] eqxt(vep5 vep5Var) {
        bek6[] bek6VarArrMo12352k = vep5Var.mo12352k(lrht.wvg(), new C3533k(), new toq(), new com.google.android.exoplayer2.text.n7h() { // from class: com.google.android.exoplayer2.offline.p
            @Override // com.google.android.exoplayer2.text.n7h
            /* JADX INFO: renamed from: h */
            public final void mo12144h(List list) {
                n7h.dd(list);
            }
        }, new InterfaceC3508q() { // from class: com.google.android.exoplayer2.offline.ld6
            @Override // com.google.android.exoplayer2.metadata.InterfaceC3508q
            public final void n7h(Metadata metadata) {
                n7h.x9kr(metadata);
            }
        });
        cv06[] cv06VarArr = new cv06[bek6VarArrMo12352k.length];
        for (int i2 = 0; i2 < bek6VarArrMo12352k.length; i2++) {
            cv06VarArr[i2] = bek6VarArrMo12352k[i2].mo11549h();
        }
        return cv06VarArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m12394f(final IOException iOException) {
        ((Handler) C3844k.f7l8(this.f20978g)).post(new Runnable() { // from class: com.google.android.exoplayer2.offline.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f21006k.m12399l(iOException);
            }
        });
    }

    @Deprecated
    public static n7h fn3e(Uri uri, kja0.InterfaceC3804k interfaceC3804k, vep5 vep5Var, @dd com.google.android.exoplayer2.drm.fn3e fn3eVar, C3705g.q qVar) {
        return m12405z(new tfm.zy().eqxt(uri).fti(com.google.android.exoplayer2.util.wvg.f67149zp).m13065k(), qVar, vep5Var, interfaceC3804k, fn3eVar);
    }

    public static n7h fu4(tfm tfmVar, C3705g.q qVar, @dd vep5 vep5Var, @dd kja0.InterfaceC3804k interfaceC3804k) {
        return m12405z(tfmVar, qVar, vep5Var, interfaceC3804k, null);
    }

    /* JADX INFO: renamed from: h */
    public static com.google.android.exoplayer2.source.fti m12396h(DownloadRequest downloadRequest, kja0.InterfaceC3804k interfaceC3804k, @dd com.google.android.exoplayer2.drm.fn3e fn3eVar) {
        return cdj(downloadRequest.toMediaItem(), interfaceC3804k, fn3eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void hyr(zy zyVar) {
        zyVar.m12417k(this);
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public static n7h m12397i(Context context, Uri uri, kja0.InterfaceC3804k interfaceC3804k, vep5 vep5Var) {
        return fn3e(uri, interfaceC3804k, vep5Var, null, a9(context));
    }

    @Deprecated
    public static n7h jk(Uri uri, kja0.InterfaceC3804k interfaceC3804k, vep5 vep5Var, @dd com.google.android.exoplayer2.drm.fn3e fn3eVar, C3705g.q qVar) {
        return m12405z(new tfm.zy().eqxt(uri).fti(com.google.android.exoplayer2.util.wvg.f23317x).m13065k(), qVar, vep5Var, interfaceC3804k, fn3eVar);
    }

    @Deprecated
    public static n7h ki(Context context, Uri uri, kja0.InterfaceC3804k interfaceC3804k, vep5 vep5Var) {
        return t8r(uri, interfaceC3804k, vep5Var, null, a9(context));
    }

    public static com.google.android.exoplayer2.source.fti kja0(DownloadRequest downloadRequest, kja0.InterfaceC3804k interfaceC3804k) {
        return m12396h(downloadRequest, interfaceC3804k, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m12399l(IOException iOException) {
        ((zy) C3844k.f7l8(this.f20983s)).toq(this, iOException);
    }

    @Deprecated
    public static n7h mcp(Uri uri, kja0.InterfaceC3804k interfaceC3804k, vep5 vep5Var) {
        return jk(uri, interfaceC3804k, vep5Var, null, f65042kja0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n5r1() {
        ((zy) C3844k.f7l8(this.f20983s)).m12417k(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void ncyb() {
    }

    public static n7h ni7(Context context, tfm tfmVar, @dd vep5 vep5Var, @dd kja0.InterfaceC3804k interfaceC3804k) {
        return m12405z(tfmVar, a9(context), vep5Var, interfaceC3804k, null);
    }

    @RequiresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void nn86() {
        this.f20984y = true;
    }

    @Deprecated
    public static n7h o1t(Context context, Uri uri) {
        return zurt(context, new tfm.zy().eqxt(uri).m13065k());
    }

    @EnsuresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void qrj() {
        C3844k.m13633s(this.f20984y);
    }

    /* JADX INFO: renamed from: r */
    private static boolean m12402r(tfm.C3701y c3701y) {
        return lrht.mu(c3701y.f22207k, c3701y.f65991toq) == 4;
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public static n7h m12403t(Context context, Uri uri, kja0.InterfaceC3804k interfaceC3804k, vep5 vep5Var) {
        return jk(uri, interfaceC3804k, vep5Var, null, a9(context));
    }

    @Deprecated
    public static n7h t8r(Uri uri, kja0.InterfaceC3804k interfaceC3804k, vep5 vep5Var, @dd com.google.android.exoplayer2.drm.fn3e fn3eVar, C3705g.q qVar) {
        return m12405z(new tfm.zy().eqxt(uri).fti(com.google.android.exoplayer2.util.wvg.f23295a).m13065k(), qVar, vep5Var, interfaceC3804k, fn3eVar);
    }

    @Deprecated
    public static n7h wvg(Context context, Uri uri, @dd String str) {
        return zurt(context, new tfm.zy().eqxt(uri).x2(str).m13065k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x9kr(Metadata metadata) {
    }

    /* JADX INFO: renamed from: z */
    public static n7h m12405z(tfm tfmVar, C3705g.q qVar, @dd vep5 vep5Var, @dd kja0.InterfaceC3804k interfaceC3804k, @dd com.google.android.exoplayer2.drm.fn3e fn3eVar) {
        boolean zM12402r = m12402r((tfm.C3701y) C3844k.f7l8(tfmVar.f22150q));
        C3844k.m13629k(zM12402r || interfaceC3804k != null);
        return new n7h(tfmVar, zM12402r ? null : cdj(tfmVar, (kja0.InterfaceC3804k) lrht.ld6(interfaceC3804k), fn3eVar), qVar, vep5Var != null ? eqxt(vep5Var) : new cv06[0]);
    }

    public static n7h zurt(Context context, tfm tfmVar) {
        C3844k.m13629k(m12402r((tfm.C3701y) C3844k.f7l8(tfmVar.f22150q)));
        return m12405z(tfmVar, a9(context), null, null, null);
    }

    public C3629x d2ok(int i2) {
        qrj();
        return this.f65044ld6[i2];
    }

    public ld6.C3709k d3(int i2) {
        qrj();
        return this.f65048x2[i2];
    }

    public DownloadRequest fti(String str, @dd byte[] bArr) {
        DownloadRequest.C3522k c3522kM12363n = new DownloadRequest.C3522k(str, this.f20979k.f22207k).m12363n(this.f20979k.f65991toq);
        tfm.C3693g c3693g = this.f20979k.f65992zy;
        DownloadRequest.C3522k c3522kZy = c3522kM12363n.m12364q(c3693g != null ? c3693g.zy() : null).toq(this.f20979k.f22206g).zy(bArr);
        if (this.f65047toq == null) {
            return c3522kZy.m12362k();
        }
        qrj();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = this.f65046qrj.length;
        for (int i2 = 0; i2 < length; i2++) {
            arrayList2.clear();
            int length2 = this.f65046qrj[i2].length;
            for (int i3 = 0; i3 < length2; i3++) {
                arrayList2.addAll(this.f65046qrj[i2][i3]);
            }
            arrayList.addAll(this.f20981p.f20993i[i2].mo12598p(arrayList2));
        }
        return c3522kZy.m12361g(arrayList).m12362k();
    }

    @dd
    public Object gvn7() {
        if (this.f65047toq == null) {
            return null;
        }
        qrj();
        if (this.f20981p.f20992h.zurt() > 0) {
            return this.f20981p.f20992h.m12484i(0, this.f65043f7l8).f21129g;
        }
        return null;
    }

    public DownloadRequest jp0y(@dd byte[] bArr) {
        return fti(this.f20979k.f22207k.toString(), bArr);
    }

    public void ld6(int i2, C3705g.q qVar) {
        qrj();
        this.f65049zy.mo13094y(qVar);
        m12393e(i2);
    }

    public void lrht(final zy zyVar) {
        C3844k.m13633s(this.f20983s == null);
        this.f20983s = zyVar;
        com.google.android.exoplayer2.source.fti ftiVar = this.f65047toq;
        if (ftiVar != null) {
            this.f20981p = new f7l8(ftiVar, this);
        } else {
            this.f20978g.post(new Runnable() { // from class: com.google.android.exoplayer2.offline.qrj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21004k.hyr(zyVar);
                }
            });
        }
    }

    public List<InterfaceC3715s> lvui(int i2, int i3) {
        qrj();
        return this.f65045n7h[i2][i3];
    }

    public void n7h(int i2) {
        qrj();
        for (int i3 = 0; i3 < this.f20982q.length; i3++) {
            this.f65046qrj[i2][i3].clear();
        }
    }

    public int oc() {
        if (this.f65047toq == null) {
            return 0;
        }
        qrj();
        return this.f65044ld6.length;
    }

    /* JADX INFO: renamed from: p */
    public void m12406p(boolean z2, String... strArr) {
        qrj();
        for (int i2 = 0; i2 < this.f65048x2.length; i2++) {
            C3705g.n nVarZy = f65042kja0.zy();
            ld6.C3709k c3709k = this.f65048x2[i2];
            int iZy = c3709k.zy();
            for (int i3 = 0; i3 < iZy; i3++) {
                if (c3709k.m13141g(i3) != 3) {
                    nVarZy.b3e(i3, true);
                }
            }
            nVarZy.mo13105j(z2);
            for (String str : strArr) {
                nVarZy.mo13101c(str);
                ld6(i2, nVarZy.mo13111z());
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m12407s(String... strArr) {
        qrj();
        for (int i2 = 0; i2 < this.f65048x2.length; i2++) {
            C3705g.n nVarZy = f65042kja0.zy();
            ld6.C3709k c3709k = this.f65048x2[i2];
            int iZy = c3709k.zy();
            for (int i3 = 0; i3 < iZy; i3++) {
                if (c3709k.m13141g(i3) != 1) {
                    nVarZy.b3e(i3, true);
                }
            }
            for (String str : strArr) {
                nVarZy.ncyb(str);
                ld6(i2, nVarZy.mo13111z());
            }
        }
    }

    public void uv6() {
        f7l8 f7l8Var = this.f20981p;
        if (f7l8Var != null) {
            f7l8Var.m12409q();
        }
    }

    public void vyq(int i2, C3705g.q qVar) {
        n7h(i2);
        ld6(i2, qVar);
    }

    public void x2(int i2, int i3, C3705g.q qVar, List<C3705g.g> list) {
        qrj();
        C3705g.n nVarZy = qVar.zy();
        int i4 = 0;
        while (i4 < this.f65048x2[i2].zy()) {
            nVarZy.b3e(i4, i4 != i3);
            i4++;
        }
        if (list.isEmpty()) {
            ld6(i2, nVarZy.mo13111z());
            return;
        }
        C3629x c3629xF7l8 = this.f65048x2[i2].f7l8(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            nVarZy.cv06(i3, c3629xF7l8, list.get(i5));
            ld6(i2, nVarZy.mo13111z());
        }
    }
}
