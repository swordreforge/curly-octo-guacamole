package com.google.android.exoplayer2.text.cea;

import com.google.android.exoplayer2.decoder.AbstractC3294p;
import com.google.android.exoplayer2.text.C3660s;
import com.google.android.exoplayer2.text.InterfaceC3691y;
import com.google.android.exoplayer2.text.cea.AbstractC3643n;
import com.google.android.exoplayer2.text.qrj;
import com.google.android.exoplayer2.text.x2;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.cea.n */
/* JADX INFO: compiled from: CeaDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3643n implements InterfaceC3691y {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f65539f7l8 = 10;

    /* JADX INFO: renamed from: y */
    private static final int f21809y = 2;

    /* JADX INFO: renamed from: g */
    private long f21810g;

    /* JADX INFO: renamed from: k */
    private final ArrayDeque<toq> f21811k = new ArrayDeque<>();

    /* JADX INFO: renamed from: n */
    private long f21812n;

    /* JADX INFO: renamed from: q */
    @dd
    private toq f21813q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final ArrayDeque<qrj> f65540toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final PriorityQueue<toq> f65541zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.cea.n$toq */
    /* JADX INFO: compiled from: CeaDecoder.java */
    private static final class toq extends x2 implements Comparable<toq> {

        /* JADX INFO: renamed from: f */
        private long f21814f;

        private toq() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public int compareTo(toq toqVar) {
            if (n7h() != toqVar.n7h()) {
                return n7h() ? 1 : -1;
            }
            long j2 = this.f19618s - toqVar.f19618s;
            if (j2 == 0) {
                j2 = this.f21814f - toqVar.f21814f;
                if (j2 == 0) {
                    return 0;
                }
            }
            return j2 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.cea.n$zy */
    /* JADX INFO: compiled from: CeaDecoder.java */
    static final class zy extends qrj {

        /* JADX INFO: renamed from: s */
        private AbstractC3294p.k<zy> f21815s;

        public zy(AbstractC3294p.k<zy> kVar) {
            this.f21815s = kVar;
        }

        @Override // com.google.android.exoplayer2.decoder.AbstractC3294p
        public final void cdj() {
            this.f21815s.mo11571k(this);
        }
    }

    public AbstractC3643n() {
        for (int i2 = 0; i2 < 10; i2++) {
            this.f21811k.add(new toq());
        }
        this.f65540toq = new ArrayDeque<>();
        for (int i3 = 0; i3 < 2; i3++) {
            this.f65540toq.add(new zy(new AbstractC3294p.k() { // from class: com.google.android.exoplayer2.text.cea.q
                @Override // com.google.android.exoplayer2.decoder.AbstractC3294p.k
                /* JADX INFO: renamed from: k */
                public final void mo11571k(AbstractC3294p abstractC3294p) {
                    this.f21816k.n7h((AbstractC3643n.zy) abstractC3294p);
                }
            }));
        }
        this.f65541zy = new PriorityQueue<>();
    }

    private void qrj(toq toqVar) {
        toqVar.mo11567s();
        this.f21811k.add(toqVar);
    }

    @Override // com.google.android.exoplayer2.decoder.InterfaceC3289g
    @dd
    /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
    public x2 mo11564q() throws C3660s {
        C3844k.m13633s(this.f21813q == null);
        if (this.f21811k.isEmpty()) {
            return null;
        }
        toq toqVarPollFirst = this.f21811k.pollFirst();
        this.f21813q = toqVarPollFirst;
        return toqVarPollFirst;
    }

    @Override // com.google.android.exoplayer2.decoder.InterfaceC3289g
    public void flush() {
        this.f21810g = 0L;
        this.f21812n = 0L;
        while (!this.f65541zy.isEmpty()) {
            qrj((toq) lrht.ld6(this.f65541zy.poll()));
        }
        toq toqVar = this.f21813q;
        if (toqVar != null) {
            qrj(toqVar);
            this.f21813q = null;
        }
    }

    /* JADX INFO: renamed from: g */
    protected abstract void mo12865g(x2 x2Var);

    @Override // com.google.android.exoplayer2.decoder.InterfaceC3289g
    public abstract String getName();

    @Override // com.google.android.exoplayer2.text.InterfaceC3691y
    /* JADX INFO: renamed from: k */
    public void mo12866k(long j2) {
        this.f21812n = j2;
    }

    protected abstract boolean ld6();

    /* JADX INFO: renamed from: n */
    protected abstract com.google.android.exoplayer2.text.f7l8 mo12867n();

    protected void n7h(qrj qrjVar) {
        qrjVar.mo11567s();
        this.f65540toq.add(qrjVar);
    }

    /* JADX INFO: renamed from: p */
    protected final long m12877p() {
        return this.f21812n;
    }

    @Override // com.google.android.exoplayer2.decoder.InterfaceC3289g
    public void release() {
    }

    @dd
    /* JADX INFO: renamed from: s */
    protected final qrj m12878s() {
        return this.f65540toq.pollFirst();
    }

    @Override // com.google.android.exoplayer2.decoder.InterfaceC3289g
    /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
    public void zy(x2 x2Var) throws C3660s {
        C3844k.m13629k(x2Var == this.f21813q);
        toq toqVar = (toq) x2Var;
        if (toqVar.qrj()) {
            qrj(toqVar);
        } else {
            long j2 = this.f21810g;
            this.f21810g = 1 + j2;
            toqVar.f21814f = j2;
            this.f65541zy.add(toqVar);
        }
        this.f21813q = null;
    }

    @Override // com.google.android.exoplayer2.decoder.InterfaceC3289g
    @dd
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public qrj toq() throws C3660s {
        if (this.f65540toq.isEmpty()) {
            return null;
        }
        while (!this.f65541zy.isEmpty() && ((toq) lrht.ld6(this.f65541zy.peek())).f19618s <= this.f21812n) {
            toq toqVar = (toq) lrht.ld6(this.f65541zy.poll());
            if (toqVar.n7h()) {
                qrj qrjVar = (qrj) lrht.ld6(this.f65540toq.pollFirst());
                qrjVar.f7l8(4);
                qrj(toqVar);
                return qrjVar;
            }
            mo12865g(toqVar);
            if (ld6()) {
                com.google.android.exoplayer2.text.f7l8 f7l8VarMo12867n = mo12867n();
                qrj qrjVar2 = (qrj) lrht.ld6(this.f65540toq.pollFirst());
                qrjVar2.ki(toqVar.f19618s, f7l8VarMo12867n, Long.MAX_VALUE);
                qrj(toqVar);
                return qrjVar2;
            }
            qrj(toqVar);
        }
        return null;
    }
}
