package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.InterfaceC3545z;
import com.google.android.exoplayer2.offline.wvg;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.upstream.cache.C3778p;
import com.google.android.exoplayer2.upstream.cache.InterfaceC3775k;
import com.google.android.exoplayer2.upstream.cache.InterfaceC3783y;
import com.google.android.exoplayer2.upstream.cache.zy;
import com.google.android.exoplayer2.upstream.d2ok;
import com.google.android.exoplayer2.upstream.t8r;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.d2ok;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.oc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import zy.dd;

/* JADX INFO: compiled from: SegmentDownloader.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a9<M extends wvg<M>> implements InterfaceC3545z {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f65018ld6 = 131072;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final long f65019x2 = 20000000;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @dd
    private final oc f65020f7l8;

    /* JADX INFO: renamed from: g */
    private final InterfaceC3783y f20933g;

    /* JADX INFO: renamed from: k */
    private final com.google.android.exoplayer2.upstream.t8r f20934k;

    /* JADX INFO: renamed from: n */
    private final InterfaceC3775k f20935n;

    /* JADX INFO: renamed from: p */
    private volatile boolean f20936p;

    /* JADX INFO: renamed from: q */
    private final zy.C3786q f20937q;

    /* JADX INFO: renamed from: s */
    private final ArrayList<d2ok<?, ?>> f20938s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final d2ok.InterfaceC3789k<M> f65021toq;

    /* JADX INFO: renamed from: y */
    private final Executor f20939y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final ArrayList<StreamKey> f65022zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.a9$k */
    /* JADX INFO: compiled from: SegmentDownloader.java */
    class C3524k extends com.google.android.exoplayer2.util.d2ok<M, IOException> {

        /* JADX INFO: renamed from: h */
        final /* synthetic */ com.google.android.exoplayer2.upstream.kja0 f20940h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ com.google.android.exoplayer2.upstream.t8r f20941i;

        C3524k(com.google.android.exoplayer2.upstream.kja0 kja0Var, com.google.android.exoplayer2.upstream.t8r t8rVar) {
            this.f20940h = kja0Var;
            this.f20941i = t8rVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.exoplayer2.util.d2ok
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public M mo12373n() throws IOException {
            return (M) com.google.android.exoplayer2.upstream.d2ok.m13453y(this.f20940h, a9.this.f65021toq, this.f20941i, 4);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.a9$q */
    /* JADX INFO: compiled from: SegmentDownloader.java */
    private static final class C3525q extends com.google.android.exoplayer2.util.d2ok<Void, IOException> {

        /* JADX INFO: renamed from: h */
        public final zy f20943h;

        /* JADX INFO: renamed from: i */
        public final com.google.android.exoplayer2.upstream.cache.zy f20944i;

        /* JADX INFO: renamed from: r */
        private final C3778p f20945r;

        /* JADX INFO: renamed from: t */
        public final byte[] f20946t;

        /* JADX INFO: renamed from: z */
        @dd
        private final toq f20947z;

        public C3525q(zy zyVar, com.google.android.exoplayer2.upstream.cache.zy zyVar2, @dd toq toqVar, byte[] bArr) {
            this.f20943h = zyVar;
            this.f20944i = zyVar2;
            this.f20947z = toqVar;
            this.f20946t = bArr;
            this.f20945r = new C3778p(zyVar2, zyVar.f20952q, bArr, toqVar);
        }

        @Override // com.google.android.exoplayer2.util.d2ok
        /* JADX INFO: renamed from: q */
        protected void mo12375q() {
            this.f20945r.toq();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.exoplayer2.util.d2ok
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Void mo12373n() throws IOException {
            this.f20945r.m13412k();
            toq toqVar = this.f20947z;
            if (toqVar == null) {
                return null;
            }
            toqVar.zy();
            return null;
        }
    }

    /* JADX INFO: compiled from: SegmentDownloader.java */
    private static final class toq implements C3778p.k {

        /* JADX INFO: renamed from: k */
        private final InterfaceC3545z.k f20948k;

        /* JADX INFO: renamed from: n */
        private int f20949n;

        /* JADX INFO: renamed from: q */
        private long f20950q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final long f65023toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f65024zy;

        public toq(InterfaceC3545z.k kVar, long j2, int i2, long j3, int i3) {
            this.f20948k = kVar;
            this.f65023toq = j2;
            this.f65024zy = i2;
            this.f20950q = j3;
            this.f20949n = i3;
        }

        private float toq() {
            long j2 = this.f65023toq;
            if (j2 != -1 && j2 != 0) {
                return (this.f20950q * 100.0f) / j2;
            }
            int i2 = this.f65024zy;
            if (i2 != 0) {
                return (this.f20949n * 100.0f) / i2;
            }
            return -1.0f;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C3778p.k
        /* JADX INFO: renamed from: k */
        public void mo12377k(long j2, long j3, long j4) {
            long j5 = this.f20950q + j4;
            this.f20950q = j5;
            this.f20948k.mo12435k(this.f65023toq, j5, toq());
        }

        public void zy() {
            this.f20949n++;
            this.f20948k.mo12435k(this.f65023toq, this.f20950q, toq());
        }
    }

    /* JADX INFO: compiled from: SegmentDownloader.java */
    protected static class zy implements Comparable<zy> {

        /* JADX INFO: renamed from: k */
        public final long f20951k;

        /* JADX INFO: renamed from: q */
        public final com.google.android.exoplayer2.upstream.t8r f20952q;

        public zy(long j2, com.google.android.exoplayer2.upstream.t8r t8rVar) {
            this.f20951k = j2;
            this.f20952q = t8rVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public int compareTo(zy zyVar) {
            return lrht.cdj(this.f20951k, zyVar.f20951k);
        }
    }

    public a9(tfm tfmVar, d2ok.InterfaceC3789k<M> interfaceC3789k, zy.C3786q c3786q, Executor executor) {
        C3844k.f7l8(tfmVar.f22150q);
        this.f20934k = m12366g(tfmVar.f22150q.f22207k);
        this.f65021toq = interfaceC3789k;
        this.f65022zy = new ArrayList<>(tfmVar.f22150q.f22208n);
        this.f20937q = c3786q;
        this.f20939y = executor;
        this.f20935n = (InterfaceC3775k) C3844k.f7l8(c3786q.f7l8());
        this.f20933g = c3786q.m13446y();
        this.f65020f7l8 = c3786q.m13445s();
        this.f20938s = new ArrayList<>();
    }

    /* JADX INFO: renamed from: g */
    protected static com.google.android.exoplayer2.upstream.t8r m12366g(Uri uri) {
        return new t8r.toq().m13521p(uri).zy(1).m13519k();
    }

    private void ld6(com.google.android.exoplayer2.util.d2ok<?, ?> d2okVar) {
        synchronized (this.f20938s) {
            this.f20938s.remove(d2okVar);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m12367p(int i2) {
        synchronized (this.f20938s) {
            this.f20938s.remove(i2);
        }
    }

    /* JADX INFO: renamed from: q */
    private static boolean m12368q(com.google.android.exoplayer2.upstream.t8r t8rVar, com.google.android.exoplayer2.upstream.t8r t8rVar2) {
        if (t8rVar.f23103k.equals(t8rVar2.f23103k)) {
            long j2 = t8rVar.f23108y;
            if (j2 != -1 && t8rVar.f66911f7l8 + j2 == t8rVar2.f66911f7l8 && lrht.zy(t8rVar.f23107s, t8rVar2.f23107s) && t8rVar.f23105p == t8rVar2.f23105p && t8rVar.f66914zy == t8rVar2.f66914zy && t8rVar.f23104n.equals(t8rVar2.f23104n)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    private static void m12369s(List<zy> list, InterfaceC3783y interfaceC3783y) {
        HashMap map = new HashMap();
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            zy zyVar = list.get(i3);
            String strMo13368k = interfaceC3783y.mo13368k(zyVar.f20952q);
            Integer num = (Integer) map.get(strMo13368k);
            zy zyVar2 = num == null ? null : list.get(num.intValue());
            if (zyVar2 == null || zyVar.f20951k > zyVar2.f20951k + f65019x2 || !m12368q(zyVar2.f20952q, zyVar.f20952q)) {
                map.put(strMo13368k, Integer.valueOf(i2));
                list.set(i2, zyVar);
                i2++;
            } else {
                long j2 = zyVar.f20952q.f23108y;
                list.set(((Integer) C3844k.f7l8(num)).intValue(), new zy(zyVar2.f20951k, zyVar2.f20952q.m13512g(0L, j2 != -1 ? zyVar2.f20952q.f23108y + j2 : -1L)));
            }
        }
        lrht.uj2j(list, i2, list.size());
    }

    private <T> void zy(com.google.android.exoplayer2.util.d2ok<T, ?> d2okVar) throws InterruptedException {
        synchronized (this.f20938s) {
            if (this.f20936p) {
                throw new InterruptedException();
            }
            this.f20938s.add(d2okVar);
        }
    }

    @Override // com.google.android.exoplayer2.offline.InterfaceC3545z
    public void cancel() {
        synchronized (this.f20938s) {
            this.f20936p = true;
            for (int i2 = 0; i2 < this.f20938s.size(); i2++) {
                this.f20938s.get(i2).cancel(true);
            }
        }
    }

    protected final M f7l8(com.google.android.exoplayer2.upstream.kja0 kja0Var, com.google.android.exoplayer2.upstream.t8r t8rVar, boolean z2) throws InterruptedException, IOException {
        return (M) m12371n(new C3524k(kja0Var, t8rVar), z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6 A[LOOP:1: B:84:0x019e->B:86:0x01a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bf A[LOOP:2: B:88:0x01bd->B:89:0x01bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d4  */
    @Override // com.google.android.exoplayer2.offline.InterfaceC3545z
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo12370k(@zy.dd com.google.android.exoplayer2.offline.InterfaceC3545z.k r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.a9.mo12370k(com.google.android.exoplayer2.offline.z$k):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:23|37|24|(2:27|(2:29|45)(3:44|31|32))(2:26|46)|30) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        r0 = (java.lang.Throwable) com.google.android.exoplayer2.util.C3844k.f7l8(r4.getCause());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if ((r0 instanceof com.google.android.exoplayer2.util.oc.C3851k) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r0 instanceof java.io.IOException) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        com.google.android.exoplayer2.util.lrht.h7am(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        throw ((java.io.IOException) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        r3.m13565k();
        ld6(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        throw r4;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final <T> T m12371n(com.google.android.exoplayer2.util.d2ok<T, ?> r3, boolean r4) throws java.lang.Throwable {
        /*
            r2 = this;
            if (r4 == 0) goto L20
            r3.run()
            java.lang.Object r3 = r3.get()     // Catch: java.util.concurrent.ExecutionException -> La
            return r3
        La:
            r4 = move-exception
            java.lang.Throwable r0 = r4.getCause()
            java.lang.Object r0 = com.google.android.exoplayer2.util.C3844k.f7l8(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r1 = r0 instanceof java.io.IOException
            if (r1 != 0) goto L1d
            com.google.android.exoplayer2.util.lrht.h7am(r4)
            goto L20
        L1d:
            java.io.IOException r0 = (java.io.IOException) r0
            throw r0
        L20:
            boolean r4 = r2.f20936p
            if (r4 != 0) goto L6a
            com.google.android.exoplayer2.util.oc r4 = r2.f65020f7l8
            if (r4 == 0) goto L2d
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            r4.toq(r0)
        L2d:
            r2.zy(r3)
            java.util.concurrent.Executor r4 = r2.f20939y
            r4.execute(r3)
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L42
            r3.m13565k()
            r2.ld6(r3)
            return r4
        L40:
            r4 = move-exception
            goto L63
        L42:
            r4 = move-exception
            java.lang.Throwable r0 = r4.getCause()     // Catch: java.lang.Throwable -> L40
            java.lang.Object r0 = com.google.android.exoplayer2.util.C3844k.f7l8(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L40
            boolean r1 = r0 instanceof com.google.android.exoplayer2.util.oc.C3851k     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L52
            goto L59
        L52:
            boolean r1 = r0 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L60
            com.google.android.exoplayer2.util.lrht.h7am(r4)     // Catch: java.lang.Throwable -> L40
        L59:
            r3.m13565k()
            r2.ld6(r3)
            goto L20
        L60:
            java.io.IOException r0 = (java.io.IOException) r0     // Catch: java.lang.Throwable -> L40
            throw r0     // Catch: java.lang.Throwable -> L40
        L63:
            r3.m13565k()
            r2.ld6(r3)
            throw r4
        L6a:
            java.lang.InterruptedException r3 = new java.lang.InterruptedException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.a9.m12371n(com.google.android.exoplayer2.util.d2ok, boolean):java.lang.Object");
    }

    @Override // com.google.android.exoplayer2.offline.InterfaceC3545z
    public final void remove() {
        com.google.android.exoplayer2.upstream.cache.zy zyVarM13442n = this.f20937q.m13442n();
        try {
            try {
                List<zy> listM12372y = m12372y(zyVarM13442n, f7l8(zyVarM13442n, this.f20934k, true), true);
                for (int i2 = 0; i2 < listM12372y.size(); i2++) {
                    this.f20935n.n7h(this.f20933g.mo13368k(listM12372y.get(i2).f20952q));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
        } finally {
            this.f20935n.n7h(this.f20933g.mo13368k(this.f20934k));
        }
    }

    /* JADX INFO: renamed from: y */
    protected abstract List<zy> m12372y(com.google.android.exoplayer2.upstream.kja0 kja0Var, M m2, boolean z2) throws InterruptedException, IOException;
}
