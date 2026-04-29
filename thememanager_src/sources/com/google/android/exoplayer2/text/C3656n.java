package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.util.C3844k;
import com.google.common.collect.se;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.n */
/* JADX INFO: compiled from: ExoplayerCuesDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3656n implements InterfaceC3691y {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f65703f7l8 = 1;

    /* JADX INFO: renamed from: g */
    private static final int f21920g = 0;

    /* JADX INFO: renamed from: s */
    private static final int f21921s = 2;

    /* JADX INFO: renamed from: y */
    private static final int f21922y = 2;

    /* JADX INFO: renamed from: n */
    private boolean f21924n;

    /* JADX INFO: renamed from: q */
    private int f21925q;

    /* JADX INFO: renamed from: k */
    private final zy f21923k = new zy();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final x2 f65704toq = new x2();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Deque<qrj> f65705zy = new ArrayDeque();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.n$k */
    /* JADX INFO: compiled from: ExoplayerCuesDecoder.java */
    class k extends qrj {
        k() {
        }

        @Override // com.google.android.exoplayer2.decoder.AbstractC3294p
        public void cdj() {
            C3656n.this.m12911s(this);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.n$toq */
    /* JADX INFO: compiled from: ExoplayerCuesDecoder.java */
    private static final class toq implements f7l8 {

        /* JADX INFO: renamed from: k */
        private final long f21927k;

        /* JADX INFO: renamed from: q */
        private final se<com.google.android.exoplayer2.text.toq> f21928q;

        public toq(long j2, se<com.google.android.exoplayer2.text.toq> seVar) {
            this.f21927k = j2;
            this.f21928q = seVar;
        }

        @Override // com.google.android.exoplayer2.text.f7l8
        /* JADX INFO: renamed from: n */
        public int mo12858n() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.text.f7l8
        /* JADX INFO: renamed from: q */
        public long mo12859q(int i2) {
            C3844k.m13629k(i2 == 0);
            return this.f21927k;
        }

        @Override // com.google.android.exoplayer2.text.f7l8
        public int toq(long j2) {
            return this.f21927k > j2 ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.text.f7l8
        public List<com.google.android.exoplayer2.text.toq> zy(long j2) {
            return j2 >= this.f21927k ? this.f21928q : se.of();
        }
    }

    public C3656n() {
        for (int i2 = 0; i2 < 2; i2++) {
            this.f65705zy.addFirst(new k());
        }
        this.f21925q = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m12911s(qrj qrjVar) {
        C3844k.m13633s(this.f65705zy.size() < 2);
        C3844k.m13629k(!this.f65705zy.contains(qrjVar));
        qrjVar.mo11567s();
        this.f65705zy.addFirst(qrjVar);
    }

    @Override // com.google.android.exoplayer2.decoder.InterfaceC3289g
    @dd
    /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
    public qrj toq() throws C3660s {
        C3844k.m13633s(!this.f21924n);
        if (this.f21925q != 2 || this.f65705zy.isEmpty()) {
            return null;
        }
        qrj qrjVarRemoveFirst = this.f65705zy.removeFirst();
        if (this.f65704toq.n7h()) {
            qrjVarRemoveFirst.f7l8(4);
        } else {
            x2 x2Var = this.f65704toq;
            qrjVarRemoveFirst.ki(this.f65704toq.f19618s, new toq(x2Var.f19618s, this.f21923k.m13017k(((ByteBuffer) C3844k.f7l8(x2Var.f19612g)).array())), 0L);
        }
        this.f65704toq.mo11567s();
        this.f21925q = 0;
        return qrjVarRemoveFirst;
    }

    @Override // com.google.android.exoplayer2.decoder.InterfaceC3289g
    public void flush() {
        C3844k.m13633s(!this.f21924n);
        this.f65704toq.mo11567s();
        this.f21925q = 0;
    }

    @Override // com.google.android.exoplayer2.decoder.InterfaceC3289g
    @dd
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public x2 mo11564q() throws C3660s {
        C3844k.m13633s(!this.f21924n);
        if (this.f21925q != 0) {
            return null;
        }
        this.f21925q = 1;
        return this.f65704toq;
    }

    @Override // com.google.android.exoplayer2.decoder.InterfaceC3289g
    public String getName() {
        return "ExoplayerCuesDecoder";
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC3691y
    /* JADX INFO: renamed from: k */
    public void mo12866k(long j2) {
    }

    @Override // com.google.android.exoplayer2.decoder.InterfaceC3289g
    public void release() {
        this.f21924n = true;
    }

    @Override // com.google.android.exoplayer2.decoder.InterfaceC3289g
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void zy(x2 x2Var) throws C3660s {
        C3844k.m13633s(!this.f21924n);
        C3844k.m13633s(this.f21925q == 1);
        C3844k.m13629k(this.f65704toq == x2Var);
        this.f21925q = 2;
    }
}
