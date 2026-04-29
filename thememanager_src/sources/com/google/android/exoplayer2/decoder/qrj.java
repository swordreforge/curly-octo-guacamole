package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.decoder.AbstractC3294p;
import com.google.android.exoplayer2.decoder.C3297s;
import com.google.android.exoplayer2.decoder.C3298y;
import com.google.android.exoplayer2.util.C3844k;
import java.util.ArrayDeque;
import zy.InterfaceC7842s;
import zy.dd;

/* JADX INFO: compiled from: SimpleDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class qrj<I extends C3297s, O extends AbstractC3294p, E extends C3298y> implements InterfaceC3289g<I, O, E> {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f63575f7l8;

    /* JADX INFO: renamed from: g */
    private final O[] f19601g;

    /* JADX INFO: renamed from: k */
    private final Thread f19602k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f63576ld6;

    /* JADX INFO: renamed from: n */
    private final I[] f19603n;

    /* JADX INFO: renamed from: p */
    @dd
    private E f19604p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f63577qrj;

    /* JADX INFO: renamed from: s */
    @dd
    private I f19606s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f63579x2;

    /* JADX INFO: renamed from: y */
    private int f19607y;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Object f63578toq = new Object();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final ArrayDeque<I> f63580zy = new ArrayDeque<>();

    /* JADX INFO: renamed from: q */
    private final ArrayDeque<O> f19605q = new ArrayDeque<>();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.decoder.qrj$k */
    /* JADX INFO: compiled from: SimpleDecoder.java */
    class C3296k extends Thread {
        C3296k(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            qrj.this.m11573i();
        }
    }

    protected qrj(I[] iArr, O[] oArr) {
        this.f19603n = iArr;
        this.f63575f7l8 = iArr.length;
        for (int i2 = 0; i2 < this.f63575f7l8; i2++) {
            ((I[]) this.f19603n)[i2] = f7l8();
        }
        this.f19601g = oArr;
        this.f19607y = oArr.length;
        for (int i3 = 0; i3 < this.f19607y; i3++) {
            ((O[]) this.f19601g)[i3] = mo11578y();
        }
        C3296k c3296k = new C3296k("ExoPlayer:SimpleDecoder");
        this.f19602k = c3296k;
        c3296k.start();
    }

    private void cdj(I i2) {
        i2.mo11567s();
        I[] iArr = this.f19603n;
        int i3 = this.f63575f7l8;
        this.f63575f7l8 = i3 + 1;
        iArr[i3] = i2;
    }

    /* JADX INFO: renamed from: g */
    private boolean m11572g() {
        return !this.f63580zy.isEmpty() && this.f19607y > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m11573i() {
        do {
            try {
            } catch (InterruptedException e2) {
                throw new IllegalStateException(e2);
            }
        } while (ld6());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends com.google.android.exoplayer2.decoder.y */
    private void kja0() throws C3298y, E {
        E e2 = this.f19604p;
        if (e2 != null) {
            throw e2;
        }
    }

    private boolean ld6() throws InterruptedException {
        E e2;
        synchronized (this.f63578toq) {
            while (!this.f63579x2 && !m11572g()) {
                this.f63578toq.wait();
            }
            if (this.f63579x2) {
                return false;
            }
            I iRemoveFirst = this.f63580zy.removeFirst();
            O[] oArr = this.f19601g;
            int i2 = this.f19607y - 1;
            this.f19607y = i2;
            O o2 = oArr[i2];
            boolean z2 = this.f63576ld6;
            this.f63576ld6 = false;
            if (iRemoveFirst.n7h()) {
                o2.f7l8(4);
            } else {
                if (iRemoveFirst.qrj()) {
                    o2.f7l8(Integer.MIN_VALUE);
                }
                try {
                    e2 = (E) mo11576p(iRemoveFirst, o2, z2);
                } catch (OutOfMemoryError e3) {
                    e2 = (E) mo11577s(e3);
                } catch (RuntimeException e4) {
                    e2 = (E) mo11577s(e4);
                }
                if (e2 != null) {
                    synchronized (this.f63578toq) {
                        this.f19604p = e2;
                    }
                    return false;
                }
            }
            synchronized (this.f63578toq) {
                if (this.f63576ld6) {
                    o2.cdj();
                } else if (o2.qrj()) {
                    this.f63577qrj++;
                    o2.cdj();
                } else {
                    o2.f19599n = this.f63577qrj;
                    this.f63577qrj = 0;
                    this.f19605q.addLast(o2);
                }
                cdj(iRemoveFirst);
            }
            return true;
        }
    }

    private void n7h() {
        if (m11572g()) {
            this.f63578toq.notify();
        }
    }

    private void t8r(O o2) {
        o2.mo11567s();
        O[] oArr = this.f19601g;
        int i2 = this.f19607y;
        this.f19607y = i2 + 1;
        oArr[i2] = o2;
    }

    protected abstract I f7l8();

    @Override // com.google.android.exoplayer2.decoder.InterfaceC3289g
    public final void flush() {
        synchronized (this.f63578toq) {
            this.f63576ld6 = true;
            this.f63577qrj = 0;
            I i2 = this.f19606s;
            if (i2 != null) {
                cdj(i2);
                this.f19606s = null;
            }
            while (!this.f63580zy.isEmpty()) {
                cdj(this.f63580zy.removeFirst());
            }
            while (!this.f19605q.isEmpty()) {
                this.f19605q.removeFirst().cdj();
            }
        }
    }

    protected final void fn3e(int i2) {
        C3844k.m13633s(this.f63575f7l8 == this.f19603n.length);
        for (I i3 : this.f19603n) {
            i3.ki(i2);
        }
    }

    @Override // com.google.android.exoplayer2.decoder.InterfaceC3289g
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void zy(I i2) throws C3298y {
        synchronized (this.f63578toq) {
            kja0();
            C3844k.m13629k(i2 == this.f19606s);
            this.f63580zy.addLast(i2);
            n7h();
            this.f19606s = null;
        }
    }

    @InterfaceC7842s
    protected void ki(O o2) {
        synchronized (this.f63578toq) {
            t8r(o2);
            n7h();
        }
    }

    @dd
    /* JADX INFO: renamed from: p */
    protected abstract E mo11576p(I i2, O o2, boolean z2);

    @Override // com.google.android.exoplayer2.decoder.InterfaceC3289g
    @dd
    /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
    public final O toq() throws C3298y {
        synchronized (this.f63578toq) {
            kja0();
            if (this.f19605q.isEmpty()) {
                return null;
            }
            return this.f19605q.removeFirst();
        }
    }

    @Override // com.google.android.exoplayer2.decoder.InterfaceC3289g
    @InterfaceC7842s
    public void release() {
        synchronized (this.f63578toq) {
            this.f63579x2 = true;
            this.f63578toq.notify();
        }
        try {
            this.f19602k.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: s */
    protected abstract E mo11577s(Throwable th);

    @Override // com.google.android.exoplayer2.decoder.InterfaceC3289g
    @dd
    /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
    public final I mo11564q() throws C3298y {
        I i2;
        synchronized (this.f63578toq) {
            kja0();
            C3844k.m13633s(this.f19606s == null);
            int i3 = this.f63575f7l8;
            if (i3 == 0) {
                i2 = null;
            } else {
                I[] iArr = this.f19603n;
                int i4 = i3 - 1;
                this.f63575f7l8 = i4;
                i2 = iArr[i4];
            }
            this.f19606s = i2;
        }
        return i2;
    }

    /* JADX INFO: renamed from: y */
    protected abstract O mo11578y();
}
