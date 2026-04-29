package okio;

import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okio.l */
/* JADX INFO: compiled from: PeekSource.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nPeekSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeekSource.kt\nokio/PeekSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class C7564l implements nn86 {

    /* JADX INFO: renamed from: g */
    private int f43783g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final n7h f43784k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private C7541c f43785n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final x2 f43786q;

    /* JADX INFO: renamed from: s */
    private long f43787s;

    /* JADX INFO: renamed from: y */
    private boolean f43788y;

    public C7564l(@InterfaceC7396q n7h upstream) {
        kotlin.jvm.internal.d2ok.m23075h(upstream, "upstream");
        this.f43784k = upstream;
        x2 x2VarMo27611g = upstream.mo27611g();
        this.f43786q = x2VarMo27611g;
        C7541c c7541c = x2VarMo27611g.f43846k;
        this.f43785n = c7541c;
        this.f43783g = c7541c != null ? c7541c.f94263toq : -1;
    }

    @Override // okio.nn86, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f43788y = true;
    }

    @Override // okio.nn86
    @InterfaceC7396q
    public C7560j toq() {
        return this.f43784k.toq();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    @Override // okio.nn86
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long wx16(@mub.InterfaceC7396q okio.x2 r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.d2ok.m23075h(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto Lf
            r5 = r4
            goto L10
        Lf:
            r5 = r3
        L10:
            if (r5 == 0) goto L87
            boolean r5 = r8.f43788y
            r5 = r5 ^ r4
            if (r5 == 0) goto L7b
            okio.c r5 = r8.f43785n
            if (r5 == 0) goto L2a
            okio.x2 r6 = r8.f43786q
            okio.c r6 = r6.f43846k
            if (r5 != r6) goto L2b
            int r5 = r8.f43783g
            kotlin.jvm.internal.d2ok.qrj(r6)
            int r6 = r6.f94263toq
            if (r5 != r6) goto L2b
        L2a:
            r3 = r4
        L2b:
            if (r3 == 0) goto L6f
            if (r2 != 0) goto L30
            return r0
        L30:
            okio.n7h r0 = r8.f43784k
            long r1 = r8.f43787s
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.bf2(r1)
            if (r0 != 0) goto L40
            r9 = -1
            return r9
        L40:
            okio.c r0 = r8.f43785n
            if (r0 != 0) goto L53
            okio.x2 r0 = r8.f43786q
            okio.c r0 = r0.f43846k
            if (r0 == 0) goto L53
            r8.f43785n = r0
            kotlin.jvm.internal.d2ok.qrj(r0)
            int r0 = r0.f94263toq
            r8.f43783g = r0
        L53:
            okio.x2 r0 = r8.f43786q
            long r0 = r0.size()
            long r2 = r8.f43787s
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            okio.x2 r2 = r8.f43786q
            long r4 = r8.f43787s
            r3 = r9
            r6 = r10
            r2.yz(r3, r4, r6)
            long r0 = r8.f43787s
            long r0 = r0 + r10
            r8.f43787s = r0
            return r10
        L6f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L87:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C7564l.wx16(okio.x2, long):long");
    }
}
