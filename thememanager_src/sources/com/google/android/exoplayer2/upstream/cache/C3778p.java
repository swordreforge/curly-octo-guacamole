package com.google.android.exoplayer2.upstream.cache;

import java.io.IOException;
import java.io.InterruptedIOException;
import zy.dd;
import zy.y9n;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.p */
/* JADX INFO: compiled from: CacheWriter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3778p {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f66777ld6 = 131072;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private long f66778f7l8;

    /* JADX INFO: renamed from: g */
    @dd
    private final k f22924g;

    /* JADX INFO: renamed from: k */
    private final zy f22925k;

    /* JADX INFO: renamed from: n */
    private final byte[] f22926n;

    /* JADX INFO: renamed from: p */
    private volatile boolean f22927p;

    /* JADX INFO: renamed from: q */
    private final String f22928q;

    /* JADX INFO: renamed from: s */
    private long f22929s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final InterfaceC3775k f66779toq;

    /* JADX INFO: renamed from: y */
    private long f22930y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.t8r f66780zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.p$k */
    /* JADX INFO: compiled from: CacheWriter.java */
    public interface k {
        /* JADX INFO: renamed from: k */
        void mo12377k(long j2, long j3, long j4);
    }

    public C3778p(zy zyVar, com.google.android.exoplayer2.upstream.t8r t8rVar, @dd byte[] bArr, @dd k kVar) {
        this.f22925k = zyVar;
        this.f66779toq = zyVar.ni7();
        this.f66780zy = t8rVar;
        this.f22926n = bArr == null ? new byte[131072] : bArr;
        this.f22924g = kVar;
        this.f22928q = zyVar.fu4().mo13368k(t8rVar);
        this.f66778f7l8 = t8rVar.f66911f7l8;
    }

    private void f7l8() throws InterruptedIOException {
        if (this.f22927p) {
            throw new InterruptedIOException();
        }
    }

    /* JADX INFO: renamed from: g */
    private long m13409g(long j2, long j3) throws IOException {
        long jMo7270k;
        boolean z2 = true;
        boolean z3 = j2 + j3 == this.f22930y || j3 == -1;
        if (j3 != -1) {
            try {
                jMo7270k = this.f22925k.mo7270k(this.f66780zy.m13513k().m13523s(j2).m13524y(j3).m13519k());
            } catch (IOException unused) {
                com.google.android.exoplayer2.upstream.ki.m13484k(this.f22925k);
                z2 = false;
                jMo7270k = -1;
            }
        } else {
            z2 = false;
            jMo7270k = -1;
        }
        if (!z2) {
            f7l8();
            try {
                jMo7270k = this.f22925k.mo7270k(this.f66780zy.m13513k().m13523s(j2).m13524y(-1L).m13519k());
            } catch (IOException e2) {
                com.google.android.exoplayer2.upstream.ki.m13484k(this.f22925k);
                throw e2;
            }
        }
        if (z3 && jMo7270k != -1) {
            try {
                m13410n(jMo7270k + j2);
            } catch (IOException e3) {
                com.google.android.exoplayer2.upstream.ki.m13484k(this.f22925k);
                throw e3;
            }
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 != -1) {
            f7l8();
            zy zyVar = this.f22925k;
            byte[] bArr = this.f22926n;
            i2 = zyVar.read(bArr, 0, bArr.length);
            if (i2 != -1) {
                m13411q(i2);
                i3 += i2;
            }
        }
        if (z3) {
            m13410n(j2 + ((long) i3));
        }
        this.f22925k.close();
        return i3;
    }

    /* JADX INFO: renamed from: n */
    private void m13410n(long j2) {
        if (this.f22930y == j2) {
            return;
        }
        this.f22930y = j2;
        k kVar = this.f22924g;
        if (kVar != null) {
            kVar.mo12377k(zy(), this.f22929s, 0L);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m13411q(long j2) {
        this.f22929s += j2;
        k kVar = this.f22924g;
        if (kVar != null) {
            kVar.mo12377k(zy(), this.f22929s, j2);
        }
    }

    private long zy() {
        long j2 = this.f22930y;
        if (j2 == -1) {
            return -1L;
        }
        return j2 - this.f66780zy.f66911f7l8;
    }

    @y9n
    /* JADX INFO: renamed from: k */
    public void m13412k() throws IOException {
        f7l8();
        InterfaceC3775k interfaceC3775k = this.f66779toq;
        String str = this.f22928q;
        com.google.android.exoplayer2.upstream.t8r t8rVar = this.f66780zy;
        this.f22929s = interfaceC3775k.mo13384n(str, t8rVar.f66911f7l8, t8rVar.f23108y);
        com.google.android.exoplayer2.upstream.t8r t8rVar2 = this.f66780zy;
        long j2 = t8rVar2.f23108y;
        if (j2 != -1) {
            this.f22930y = t8rVar2.f66911f7l8 + j2;
        } else {
            long jM13413n = qrj.m13413n(this.f66779toq.zy(this.f22928q));
            if (jM13413n == -1) {
                jM13413n = -1;
            }
            this.f22930y = jM13413n;
        }
        k kVar = this.f22924g;
        if (kVar != null) {
            kVar.mo12377k(zy(), this.f22929s, 0L);
        }
        while (true) {
            long j3 = this.f22930y;
            if (j3 != -1 && this.f66778f7l8 >= j3) {
                return;
            }
            f7l8();
            long j4 = this.f22930y;
            long jF7l8 = this.f66779toq.f7l8(this.f22928q, this.f66778f7l8, j4 == -1 ? Long.MAX_VALUE : j4 - this.f66778f7l8);
            if (jF7l8 > 0) {
                this.f66778f7l8 += jF7l8;
            } else {
                long j5 = -jF7l8;
                if (j5 == Long.MAX_VALUE) {
                    j5 = -1;
                }
                long j6 = this.f66778f7l8;
                this.f66778f7l8 = j6 + m13409g(j6, j5);
            }
        }
    }

    public void toq() {
        this.f22927p = true;
    }
}
