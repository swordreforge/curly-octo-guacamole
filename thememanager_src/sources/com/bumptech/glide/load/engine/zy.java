package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.data.InterfaceC3000q;
import com.bumptech.glide.load.engine.InterfaceC3030g;
import com.bumptech.glide.load.model.kja0;
import java.io.File;
import java.util.List;
import zy.lvui;

/* JADX INFO: compiled from: DataCacheGenerator.java */
/* JADX INFO: loaded from: classes2.dex */
class zy implements InterfaceC3030g, InterfaceC3000q.k<Object> {

    /* JADX INFO: renamed from: g */
    private int f18533g;

    /* JADX INFO: renamed from: h */
    private volatile kja0.C3063k<?> f18534h;

    /* JADX INFO: renamed from: i */
    private File f18535i;

    /* JADX INFO: renamed from: k */
    private final List<com.bumptech.glide.load.f7l8> f18536k;

    /* JADX INFO: renamed from: n */
    private final InterfaceC3030g.k f18537n;

    /* JADX INFO: renamed from: p */
    private int f18538p;

    /* JADX INFO: renamed from: q */
    private final f7l8<?> f18539q;

    /* JADX INFO: renamed from: s */
    private List<com.bumptech.glide.load.model.kja0<File, ?>> f18540s;

    /* JADX INFO: renamed from: y */
    private com.bumptech.glide.load.f7l8 f18541y;

    zy(f7l8<?> f7l8Var, InterfaceC3030g.k kVar) {
        this(f7l8Var.zy(), f7l8Var, kVar);
    }

    private boolean toq() {
        return this.f18538p < this.f18540s.size();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3030g
    public void cancel() {
        kja0.C3063k<?> c3063k = this.f18534h;
        if (c3063k != null) {
            c3063k.f62840zy.cancel();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (toq() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r0 = r7.f18540s;
        r3 = r7.f18538p;
        r7.f18538p = r3 + 1;
        r7.f18534h = r0.get(r3).toq(r7.f18535i, r7.f18539q.m10755i(), r7.f18539q.m10753g(), r7.f18539q.ld6());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r7.f18534h == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.f18539q.fn3e(r7.f18534h.f62840zy.mo10634k()) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r7.f18534h.f62840zy.mo10647g(r7.f18539q.x2(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        r7.f18534h = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r1 != false) goto L39;
     */
    @Override // com.bumptech.glide.load.engine.InterfaceC3030g
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo10767k() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            com.bumptech.glide.util.pool.toq.m11251k(r0)
        L5:
            java.util.List<com.bumptech.glide.load.model.kja0<java.io.File, ?>> r0 = r7.f18540s     // Catch: java.lang.Throwable -> Lae
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L6c
            boolean r0 = r7.toq()     // Catch: java.lang.Throwable -> Lae
            if (r0 != 0) goto L12
            goto L6c
        L12:
            r0 = 0
            r7.f18534h = r0     // Catch: java.lang.Throwable -> Lae
        L15:
            if (r1 != 0) goto L68
            boolean r0 = r7.toq()     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L68
            java.util.List<com.bumptech.glide.load.model.kja0<java.io.File, ?>> r0 = r7.f18540s     // Catch: java.lang.Throwable -> Lae
            int r3 = r7.f18538p     // Catch: java.lang.Throwable -> Lae
            int r4 = r3 + 1
            r7.f18538p = r4     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.model.kja0 r0 = (com.bumptech.glide.load.model.kja0) r0     // Catch: java.lang.Throwable -> Lae
            java.io.File r3 = r7.f18535i     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.engine.f7l8<?> r4 = r7.f18539q     // Catch: java.lang.Throwable -> Lae
            int r4 = r4.m10755i()     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.engine.f7l8<?> r5 = r7.f18539q     // Catch: java.lang.Throwable -> Lae
            int r5 = r5.m10753g()     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.engine.f7l8<?> r6 = r7.f18539q     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.p r6 = r6.ld6()     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.model.kja0$k r0 = r0.toq(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lae
            r7.f18534h = r0     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.model.kja0$k<?> r0 = r7.f18534h     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L15
            com.bumptech.glide.load.engine.f7l8<?> r0 = r7.f18539q     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.model.kja0$k<?> r3 = r7.f18534h     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.data.q<Data> r3 = r3.f62840zy     // Catch: java.lang.Throwable -> Lae
            java.lang.Class r3 = r3.mo10634k()     // Catch: java.lang.Throwable -> Lae
            boolean r0 = r0.fn3e(r3)     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L15
            com.bumptech.glide.load.model.kja0$k<?> r0 = r7.f18534h     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.data.q<Data> r0 = r0.f62840zy     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.engine.f7l8<?> r1 = r7.f18539q     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.p r1 = r1.x2()     // Catch: java.lang.Throwable -> Lae
            r0.mo10647g(r1, r7)     // Catch: java.lang.Throwable -> Lae
            r1 = r2
            goto L15
        L68:
            com.bumptech.glide.util.pool.toq.m11250g()
            return r1
        L6c:
            int r0 = r7.f18533g     // Catch: java.lang.Throwable -> Lae
            int r0 = r0 + r2
            r7.f18533g = r0     // Catch: java.lang.Throwable -> Lae
            java.util.List<com.bumptech.glide.load.f7l8> r2 = r7.f18536k     // Catch: java.lang.Throwable -> Lae
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lae
            if (r0 < r2) goto L7d
            com.bumptech.glide.util.pool.toq.m11250g()
            return r1
        L7d:
            java.util.List<com.bumptech.glide.load.f7l8> r0 = r7.f18536k     // Catch: java.lang.Throwable -> Lae
            int r2 = r7.f18533g     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.f7l8 r0 = (com.bumptech.glide.load.f7l8) r0     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.engine.q r2 = new com.bumptech.glide.load.engine.q     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.engine.f7l8<?> r3 = r7.f18539q     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.f7l8 r3 = r3.m10754h()     // Catch: java.lang.Throwable -> Lae
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.engine.f7l8<?> r3 = r7.f18539q     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.engine.cache.k r3 = r3.m10759q()     // Catch: java.lang.Throwable -> Lae
            java.io.File r2 = r3.toq(r2)     // Catch: java.lang.Throwable -> Lae
            r7.f18535i = r2     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L5
            r7.f18541y = r0     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.engine.f7l8<?> r0 = r7.f18539q     // Catch: java.lang.Throwable -> Lae
            java.util.List r0 = r0.m10758p(r2)     // Catch: java.lang.Throwable -> Lae
            r7.f18540s = r0     // Catch: java.lang.Throwable -> Lae
            r7.f18538p = r1     // Catch: java.lang.Throwable -> Lae
            goto L5
        Lae:
            r0 = move-exception
            com.bumptech.glide.util.pool.toq.m11250g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.zy.mo10767k():boolean");
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q.k
    /* JADX INFO: renamed from: q */
    public void mo10657q(Object obj) {
        this.f18537n.mo10768n(this.f18541y, obj, this.f18534h.f62840zy, EnumC3050k.DATA_DISK_CACHE, this.f18541y);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q.k
    public void zy(@lvui Exception exc) {
        this.f18537n.toq(this.f18541y, exc, this.f18534h.f62840zy, EnumC3050k.DATA_DISK_CACHE);
    }

    zy(List<com.bumptech.glide.load.f7l8> list, f7l8<?> f7l8Var, InterfaceC3030g.k kVar) {
        this.f18533g = -1;
        this.f18536k = list;
        this.f18539q = f7l8Var;
        this.f18537n = kVar;
    }
}
