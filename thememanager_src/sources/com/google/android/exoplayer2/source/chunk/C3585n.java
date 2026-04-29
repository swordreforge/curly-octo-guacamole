package com.google.android.exoplayer2.source.chunk;

import android.util.SparseArray;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.C3398q;
import com.google.android.exoplayer2.extractor.C3400s;
import com.google.android.exoplayer2.extractor.InterfaceC3397p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.fu4;
import com.google.android.exoplayer2.extractor.mkv.C3358n;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.rawcc.C3399k;
import com.google.android.exoplayer2.source.chunk.f7l8;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.wvg;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;
import java.util.List;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.chunk.n */
/* JADX INFO: compiled from: BundledChunkExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3585n implements com.google.android.exoplayer2.extractor.x2, f7l8 {

    /* JADX INFO: renamed from: g */
    private final SparseArray<k> f21377g = new SparseArray<>();

    /* JADX INFO: renamed from: h */
    private o1t f21378h;

    /* JADX INFO: renamed from: i */
    private xwq3[] f21379i;

    /* JADX INFO: renamed from: k */
    private final InterfaceC3397p f21380k;

    /* JADX INFO: renamed from: n */
    private final xwq3 f21381n;

    /* JADX INFO: renamed from: p */
    private long f21382p;

    /* JADX INFO: renamed from: q */
    private final int f21383q;

    /* JADX INFO: renamed from: s */
    @dd
    private f7l8.toq f21384s;

    /* JADX INFO: renamed from: y */
    private boolean f21385y;

    /* JADX INFO: renamed from: z */
    public static final f7l8.InterfaceC3580k f21376z = new f7l8.InterfaceC3580k() { // from class: com.google.android.exoplayer2.source.chunk.q
        @Override // com.google.android.exoplayer2.source.chunk.f7l8.InterfaceC3580k
        /* JADX INFO: renamed from: k */
        public final f7l8 mo12648k(int i2, xwq3 xwq3Var, boolean z2, List list, InterfaceC3401t interfaceC3401t) {
            return C3585n.f7l8(i2, xwq3Var, z2, list, interfaceC3401t);
        }
    };

    /* JADX INFO: renamed from: t */
    private static final fu4 f21375t = new fu4();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.chunk.n$k */
    /* JADX INFO: compiled from: BundledChunkExtractor.java */
    private static final class k implements InterfaceC3401t {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final C3400s f65351f7l8 = new C3400s();

        /* JADX INFO: renamed from: g */
        @dd
        private final xwq3 f21386g;

        /* JADX INFO: renamed from: n */
        private final int f21387n;

        /* JADX INFO: renamed from: p */
        private long f21388p;

        /* JADX INFO: renamed from: q */
        private final int f21389q;

        /* JADX INFO: renamed from: s */
        private InterfaceC3401t f21390s;

        /* JADX INFO: renamed from: y */
        public xwq3 f21391y;

        public k(int i2, int i3, @dd xwq3 xwq3Var) {
            this.f21389q = i2;
            this.f21387n = i3;
            this.f21386g = xwq3Var;
        }

        public void f7l8(@dd f7l8.toq toqVar, long j2) {
            if (toqVar == null) {
                this.f21390s = this.f65351f7l8;
                return;
            }
            this.f21388p = j2;
            InterfaceC3401t qVar = toqVar.toq(this.f21389q, this.f21387n);
            this.f21390s = qVar;
            xwq3 xwq3Var = this.f21391y;
            if (xwq3Var != null) {
                qVar.mo11931q(xwq3Var);
            }
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC3401t
        /* JADX INFO: renamed from: g */
        public void mo11928g(gvn7 gvn7Var, int i2, int i3) {
            ((InterfaceC3401t) lrht.ld6(this.f21390s)).zy(gvn7Var, i2);
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC3401t
        /* JADX INFO: renamed from: k */
        public int mo11929k(com.google.android.exoplayer2.upstream.x2 x2Var, int i2, boolean z2, int i3) throws IOException {
            return ((InterfaceC3401t) lrht.ld6(this.f21390s)).toq(x2Var, i2, z2);
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC3401t
        /* JADX INFO: renamed from: n */
        public void mo11930n(long j2, int i2, int i3, int i4, @dd InterfaceC3401t.k kVar) {
            long j3 = this.f21388p;
            if (j3 != C3548p.f65257toq && j2 >= j3) {
                this.f21390s = this.f65351f7l8;
            }
            ((InterfaceC3401t) lrht.ld6(this.f21390s)).mo11930n(j2, i2, i3, i4, kVar);
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC3401t
        /* JADX INFO: renamed from: q */
        public void mo11931q(xwq3 xwq3Var) {
            xwq3 xwq3Var2 = this.f21386g;
            if (xwq3Var2 != null) {
                xwq3Var = xwq3Var.wvg(xwq3Var2);
            }
            this.f21391y = xwq3Var;
            ((InterfaceC3401t) lrht.ld6(this.f21390s)).mo11931q(this.f21391y);
        }
    }

    public C3585n(InterfaceC3397p interfaceC3397p, int i2, xwq3 xwq3Var) {
        this.f21380k = interfaceC3397p;
        this.f21383q = i2;
        this.f21381n = xwq3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f7l8 f7l8(int i2, xwq3 xwq3Var, boolean z2, List list, InterfaceC3401t interfaceC3401t) {
        InterfaceC3397p f7l8Var;
        String str = xwq3Var.f23684t;
        if (wvg.t8r(str)) {
            if (!wvg.f67108gyi.equals(str)) {
                return null;
            }
            f7l8Var = new C3399k(xwq3Var);
        } else if (wvg.ki(str)) {
            f7l8Var = new C3358n(1);
        } else {
            f7l8Var = new com.google.android.exoplayer2.extractor.mp4.f7l8(z2 ? 4 : 0, null, null, list, interfaceC3401t);
        }
        return new C3585n(f7l8Var, i2, xwq3Var);
    }

    @Override // com.google.android.exoplayer2.extractor.x2
    public void cdj(o1t o1tVar) {
        this.f21378h = o1tVar;
    }

    @Override // com.google.android.exoplayer2.extractor.x2
    /* JADX INFO: renamed from: i */
    public void mo11753i() {
        xwq3[] xwq3VarArr = new xwq3[this.f21377g.size()];
        for (int i2 = 0; i2 < this.f21377g.size(); i2++) {
            xwq3VarArr[i2] = (xwq3) C3844k.ld6(this.f21377g.valueAt(i2).f21391y);
        }
        this.f21379i = xwq3VarArr;
    }

    @Override // com.google.android.exoplayer2.source.chunk.f7l8
    /* JADX INFO: renamed from: k */
    public boolean mo12645k(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        int iZy = this.f21380k.zy(ld6Var, f21375t);
        C3844k.m13633s(iZy != 1);
        return iZy == 0;
    }

    @Override // com.google.android.exoplayer2.source.chunk.f7l8
    @dd
    /* JADX INFO: renamed from: n */
    public xwq3[] mo12646n() {
        return this.f21379i;
    }

    @Override // com.google.android.exoplayer2.source.chunk.f7l8
    @dd
    /* JADX INFO: renamed from: q */
    public C3398q mo12647q() {
        o1t o1tVar = this.f21378h;
        if (o1tVar instanceof C3398q) {
            return (C3398q) o1tVar;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.chunk.f7l8
    public void release() {
        this.f21380k.release();
    }

    @Override // com.google.android.exoplayer2.extractor.x2
    public InterfaceC3401t toq(int i2, int i3) {
        k kVar = this.f21377g.get(i2);
        if (kVar == null) {
            C3844k.m13633s(this.f21379i == null);
            kVar = new k(i2, i3, i3 == this.f21383q ? this.f21381n : null);
            kVar.f7l8(this.f21384s, this.f21382p);
            this.f21377g.put(i2, kVar);
        }
        return kVar;
    }

    @Override // com.google.android.exoplayer2.source.chunk.f7l8
    public void zy(@dd f7l8.toq toqVar, long j2, long j3) {
        this.f21384s = toqVar;
        this.f21382p = j3;
        if (!this.f21385y) {
            this.f21380k.mo11689q(this);
            if (j2 != C3548p.f65257toq) {
                this.f21380k.mo11688k(0L, j2);
            }
            this.f21385y = true;
            return;
        }
        InterfaceC3397p interfaceC3397p = this.f21380k;
        if (j2 == C3548p.f65257toq) {
            j2 = 0;
        }
        interfaceC3397p.mo11688k(0L, j2);
        for (int i2 = 0; i2 < this.f21377g.size(); i2++) {
            this.f21377g.valueAt(i2).f7l8(toqVar, j3);
        }
    }
}
