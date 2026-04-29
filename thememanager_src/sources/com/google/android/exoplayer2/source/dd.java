package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.C3865v;
import com.google.android.exoplayer2.decoder.C3297s;
import com.google.android.exoplayer2.mbx;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.jk;
import com.google.android.exoplayer2.trackselection.InterfaceC3715s;
import com.google.android.exoplayer2.util.C3844k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: compiled from: MergingMediaPeriod.java */
/* JADX INFO: loaded from: classes2.dex */
final class dd implements jk, jk.InterfaceC3604k {

    /* JADX INFO: renamed from: h */
    private InterfaceC3622o f21437h;

    /* JADX INFO: renamed from: k */
    private final jk[] f21438k;

    /* JADX INFO: renamed from: n */
    private final InterfaceC3627s f21439n;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private C3629x f21442s;

    /* JADX INFO: renamed from: y */
    @zy.dd
    private jk.InterfaceC3604k f21443y;

    /* JADX INFO: renamed from: g */
    private final ArrayList<jk> f21436g = new ArrayList<>();

    /* JADX INFO: renamed from: q */
    private final IdentityHashMap<InterfaceC3603j, Integer> f21441q = new IdentityHashMap<>();

    /* JADX INFO: renamed from: p */
    private jk[] f21440p = new jk[0];

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dd$k */
    /* JADX INFO: compiled from: MergingMediaPeriod.java */
    private static final class C3590k implements jk, jk.InterfaceC3604k {

        /* JADX INFO: renamed from: k */
        private final jk f21444k;

        /* JADX INFO: renamed from: n */
        private jk.InterfaceC3604k f21445n;

        /* JADX INFO: renamed from: q */
        private final long f21446q;

        public C3590k(jk jkVar, long j2) {
            this.f21444k = jkVar;
            this.f21446q = j2;
        }

        @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
        public void f7l8(long j2) {
            this.f21444k.f7l8(j2 - this.f21446q);
        }

        @Override // com.google.android.exoplayer2.source.jk
        public C3629x fn3e() {
            return this.f21444k.fn3e();
        }

        @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
        /* JADX INFO: renamed from: g */
        public long mo12595g() {
            long jMo12595g = this.f21444k.mo12595g();
            if (jMo12595g == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f21446q + jMo12595g;
        }

        @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
        /* JADX INFO: renamed from: k */
        public boolean mo12596k() {
            return this.f21444k.mo12596k();
        }

        @Override // com.google.android.exoplayer2.source.jk
        public long kja0(InterfaceC3715s[] interfaceC3715sArr, boolean[] zArr, InterfaceC3603j[] interfaceC3603jArr, boolean[] zArr2, long j2) {
            InterfaceC3603j[] interfaceC3603jArr2 = new InterfaceC3603j[interfaceC3603jArr.length];
            int i2 = 0;
            while (true) {
                InterfaceC3603j interfaceC3603jM12681k = null;
                if (i2 >= interfaceC3603jArr.length) {
                    break;
                }
                toq toqVar = (toq) interfaceC3603jArr[i2];
                if (toqVar != null) {
                    interfaceC3603jM12681k = toqVar.m12681k();
                }
                interfaceC3603jArr2[i2] = interfaceC3603jM12681k;
                i2++;
            }
            long jKja0 = this.f21444k.kja0(interfaceC3715sArr, zArr, interfaceC3603jArr2, zArr2, j2 - this.f21446q);
            for (int i3 = 0; i3 < interfaceC3603jArr.length; i3++) {
                InterfaceC3603j interfaceC3603j = interfaceC3603jArr2[i3];
                if (interfaceC3603j == null) {
                    interfaceC3603jArr[i3] = null;
                } else {
                    InterfaceC3603j interfaceC3603j2 = interfaceC3603jArr[i3];
                    if (interfaceC3603j2 == null || ((toq) interfaceC3603j2).m12681k() != interfaceC3603j) {
                        interfaceC3603jArr[i3] = new toq(interfaceC3603j, this.f21446q);
                    }
                }
            }
            return jKja0 + this.f21446q;
        }

        @Override // com.google.android.exoplayer2.source.jk.InterfaceC3604k
        public void ld6(jk jkVar) {
            ((jk.InterfaceC3604k) C3844k.f7l8(this.f21445n)).ld6(this);
        }

        @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
        /* JADX INFO: renamed from: n */
        public boolean mo12597n(long j2) {
            return this.f21444k.mo12597n(j2 - this.f21446q);
        }

        @Override // com.google.android.exoplayer2.source.jk
        public void n7h(jk.InterfaceC3604k interfaceC3604k, long j2) {
            this.f21445n = interfaceC3604k;
            this.f21444k.n7h(this, j2 - this.f21446q);
        }

        @Override // com.google.android.exoplayer2.source.jk
        /* JADX INFO: renamed from: p */
        public List<StreamKey> mo12598p(List<InterfaceC3715s> list) {
            return this.f21444k.mo12598p(list);
        }

        @Override // com.google.android.exoplayer2.source.jk
        /* JADX INFO: renamed from: q */
        public long mo12599q(long j2, mbx mbxVar) {
            return this.f21444k.mo12599q(j2 - this.f21446q, mbxVar) + this.f21446q;
        }

        @Override // com.google.android.exoplayer2.source.jk
        public long qrj() {
            long jQrj = this.f21444k.qrj();
            return jQrj == C3548p.f65257toq ? C3548p.f65257toq : this.f21446q + jQrj;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3622o.k
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo12411y(jk jkVar) {
            ((jk.InterfaceC3604k) C3844k.f7l8(this.f21445n)).mo12411y(this);
        }

        @Override // com.google.android.exoplayer2.source.jk
        public void t8r() throws IOException {
            this.f21444k.t8r();
        }

        @Override // com.google.android.exoplayer2.source.jk
        public long x2(long j2) {
            return this.f21444k.x2(j2 - this.f21446q) + this.f21446q;
        }

        @Override // com.google.android.exoplayer2.source.jk
        public void zurt(long j2, boolean z2) {
            this.f21444k.zurt(j2 - this.f21446q, z2);
        }

        @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
        public long zy() {
            long jZy = this.f21444k.zy();
            if (jZy == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f21446q + jZy;
        }
    }

    /* JADX INFO: compiled from: MergingMediaPeriod.java */
    private static final class toq implements InterfaceC3603j {

        /* JADX INFO: renamed from: k */
        private final InterfaceC3603j f21447k;

        /* JADX INFO: renamed from: q */
        private final long f21448q;

        public toq(InterfaceC3603j interfaceC3603j, long j2) {
            this.f21447k = interfaceC3603j;
            this.f21448q = j2;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public int cdj(long j2) {
            return this.f21447k.cdj(j2 - this.f21448q);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public boolean isReady() {
            return this.f21447k.isReady();
        }

        /* JADX INFO: renamed from: k */
        public InterfaceC3603j m12681k() {
            return this.f21447k;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        /* JADX INFO: renamed from: s */
        public int mo12610s(C3865v c3865v, C3297s c3297s, int i2) {
            int iMo12610s = this.f21447k.mo12610s(c3865v, c3297s, i2);
            if (iMo12610s == -4) {
                c3297s.f19618s = Math.max(0L, c3297s.f19618s + this.f21448q);
            }
            return iMo12610s;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public void toq() throws IOException {
            this.f21447k.toq();
        }
    }

    public dd(InterfaceC3627s interfaceC3627s, long[] jArr, jk... jkVarArr) {
        this.f21439n = interfaceC3627s;
        this.f21438k = jkVarArr;
        this.f21437h = interfaceC3627s.mo12817k(new InterfaceC3622o[0]);
        for (int i2 = 0; i2 < jkVarArr.length; i2++) {
            long j2 = jArr[i2];
            if (j2 != 0) {
                this.f21438k[i2] = new C3590k(jkVarArr[i2], j2);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    public void f7l8(long j2) {
        this.f21437h.f7l8(j2);
    }

    @Override // com.google.android.exoplayer2.source.jk
    public C3629x fn3e() {
        return (C3629x) C3844k.f7l8(this.f21442s);
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: g */
    public long mo12595g() {
        return this.f21437h.mo12595g();
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: k */
    public boolean mo12596k() {
        return this.f21437h.mo12596k();
    }

    @Override // com.google.android.exoplayer2.source.jk
    public long kja0(InterfaceC3715s[] interfaceC3715sArr, boolean[] zArr, InterfaceC3603j[] interfaceC3603jArr, boolean[] zArr2, long j2) {
        int[] iArr = new int[interfaceC3715sArr.length];
        int[] iArr2 = new int[interfaceC3715sArr.length];
        for (int i2 = 0; i2 < interfaceC3715sArr.length; i2++) {
            InterfaceC3603j interfaceC3603j = interfaceC3603jArr[i2];
            Integer num = interfaceC3603j == null ? null : this.f21441q.get(interfaceC3603j);
            iArr[i2] = num == null ? -1 : num.intValue();
            iArr2[i2] = -1;
            InterfaceC3715s interfaceC3715s = interfaceC3715sArr[i2];
            if (interfaceC3715s != null) {
                C3564a c3564aQrj = interfaceC3715s.qrj();
                int i3 = 0;
                while (true) {
                    jk[] jkVarArr = this.f21438k;
                    if (i3 >= jkVarArr.length) {
                        break;
                    }
                    if (jkVarArr[i3].fn3e().zy(c3564aQrj) != -1) {
                        iArr2[i2] = i3;
                        break;
                    }
                    i3++;
                }
            }
        }
        this.f21441q.clear();
        int length = interfaceC3715sArr.length;
        InterfaceC3603j[] interfaceC3603jArr2 = new InterfaceC3603j[length];
        InterfaceC3603j[] interfaceC3603jArr3 = new InterfaceC3603j[interfaceC3715sArr.length];
        InterfaceC3715s[] interfaceC3715sArr2 = new InterfaceC3715s[interfaceC3715sArr.length];
        ArrayList arrayList = new ArrayList(this.f21438k.length);
        long j3 = j2;
        int i4 = 0;
        while (i4 < this.f21438k.length) {
            for (int i5 = 0; i5 < interfaceC3715sArr.length; i5++) {
                interfaceC3603jArr3[i5] = iArr[i5] == i4 ? interfaceC3603jArr[i5] : null;
                interfaceC3715sArr2[i5] = iArr2[i5] == i4 ? interfaceC3715sArr[i5] : null;
            }
            int i6 = i4;
            ArrayList arrayList2 = arrayList;
            InterfaceC3715s[] interfaceC3715sArr3 = interfaceC3715sArr2;
            long jKja0 = this.f21438k[i4].kja0(interfaceC3715sArr2, zArr, interfaceC3603jArr3, zArr2, j3);
            if (i6 == 0) {
                j3 = jKja0;
            } else if (jKja0 != j3) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z2 = false;
            for (int i7 = 0; i7 < interfaceC3715sArr.length; i7++) {
                if (iArr2[i7] == i6) {
                    InterfaceC3603j interfaceC3603j2 = (InterfaceC3603j) C3844k.f7l8(interfaceC3603jArr3[i7]);
                    interfaceC3603jArr2[i7] = interfaceC3603jArr3[i7];
                    this.f21441q.put(interfaceC3603j2, Integer.valueOf(i6));
                    z2 = true;
                } else if (iArr[i7] == i6) {
                    C3844k.m13633s(interfaceC3603jArr3[i7] == null);
                }
            }
            if (z2) {
                arrayList2.add(this.f21438k[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            interfaceC3715sArr2 = interfaceC3715sArr3;
        }
        System.arraycopy(interfaceC3603jArr2, 0, interfaceC3603jArr, 0, length);
        jk[] jkVarArr2 = (jk[]) arrayList.toArray(new jk[0]);
        this.f21440p = jkVarArr2;
        this.f21437h = this.f21439n.mo12817k(jkVarArr2);
        return j3;
    }

    @Override // com.google.android.exoplayer2.source.jk.InterfaceC3604k
    public void ld6(jk jkVar) {
        this.f21436g.remove(jkVar);
        if (this.f21436g.isEmpty()) {
            int i2 = 0;
            for (jk jkVar2 : this.f21438k) {
                i2 += jkVar2.fn3e().f21701k;
            }
            C3564a[] c3564aArr = new C3564a[i2];
            int i3 = 0;
            for (jk jkVar3 : this.f21438k) {
                C3629x c3629xFn3e = jkVar3.fn3e();
                int i4 = c3629xFn3e.f21701k;
                int i5 = 0;
                while (i5 < i4) {
                    c3564aArr[i3] = c3629xFn3e.toq(i5);
                    i5++;
                    i3++;
                }
            }
            this.f21442s = new C3629x(c3564aArr);
            ((jk.InterfaceC3604k) C3844k.f7l8(this.f21443y)).ld6(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: n */
    public boolean mo12597n(long j2) {
        if (this.f21436g.isEmpty()) {
            return this.f21437h.mo12597n(j2);
        }
        int size = this.f21436g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f21436g.get(i2).mo12597n(j2);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.jk
    public void n7h(jk.InterfaceC3604k interfaceC3604k, long j2) {
        this.f21443y = interfaceC3604k;
        Collections.addAll(this.f21436g, this.f21438k);
        for (jk jkVar : this.f21438k) {
            jkVar.n7h(this, j2);
        }
    }

    @Override // com.google.android.exoplayer2.source.jk
    /* JADX INFO: renamed from: q */
    public long mo12599q(long j2, mbx mbxVar) {
        jk[] jkVarArr = this.f21440p;
        return (jkVarArr.length > 0 ? jkVarArr[0] : this.f21438k[0]).mo12599q(j2, mbxVar);
    }

    @Override // com.google.android.exoplayer2.source.jk
    public long qrj() {
        long j2 = -9223372036854775807L;
        for (jk jkVar : this.f21440p) {
            long jQrj = jkVar.qrj();
            if (jQrj == C3548p.f65257toq) {
                if (j2 != C3548p.f65257toq && jkVar.x2(j2) != j2) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j2 == C3548p.f65257toq) {
                for (jk jkVar2 : this.f21440p) {
                    if (jkVar2 == jkVar) {
                        break;
                    }
                    if (jkVar2.x2(jQrj) != jQrj) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j2 = jQrj;
            } else if (jQrj != j2) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3622o.k
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo12411y(jk jkVar) {
        ((jk.InterfaceC3604k) C3844k.f7l8(this.f21443y)).mo12411y(this);
    }

    @Override // com.google.android.exoplayer2.source.jk
    public void t8r() throws IOException {
        for (jk jkVar : this.f21438k) {
            jkVar.t8r();
        }
    }

    public jk toq(int i2) {
        jk jkVar = this.f21438k[i2];
        return jkVar instanceof C3590k ? ((C3590k) jkVar).f21444k : jkVar;
    }

    @Override // com.google.android.exoplayer2.source.jk
    public long x2(long j2) {
        long jX2 = this.f21440p[0].x2(j2);
        int i2 = 1;
        while (true) {
            jk[] jkVarArr = this.f21440p;
            if (i2 >= jkVarArr.length) {
                return jX2;
            }
            if (jkVarArr[i2].x2(jX2) != jX2) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i2++;
        }
    }

    @Override // com.google.android.exoplayer2.source.jk
    public void zurt(long j2, boolean z2) {
        for (jk jkVar : this.f21440p) {
            jkVar.zurt(j2, z2);
        }
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    public long zy() {
        return this.f21437h.zy();
    }
}
