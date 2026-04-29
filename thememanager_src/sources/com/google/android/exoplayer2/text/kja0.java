package com.google.android.exoplayer2.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.AbstractC3433g;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.C3865v;
import com.google.android.exoplayer2.cv06;
import com.google.android.exoplayer2.decoder.C3298y;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import com.google.android.exoplayer2.util.wvg;
import com.google.android.exoplayer2.xwq3;
import java.util.Collections;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: TextRenderer.java */
/* JADX INFO: loaded from: classes2.dex */
public final class kja0 extends AbstractC3433g implements Handler.Callback {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f65691ab = "TextRenderer";
    private static final int an = 0;
    private static final int bb = 0;
    private static final int bp = 1;
    private static final int bv = 2;

    /* JADX INFO: renamed from: a */
    @dd
    private xwq3 f21898a;

    /* JADX INFO: renamed from: b */
    private int f21899b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    @dd
    private qrj f65692bo;

    /* JADX INFO: renamed from: c */
    private final InterfaceC3657p f21900c;

    /* JADX INFO: renamed from: d */
    private int f21901d;

    /* JADX INFO: renamed from: e */
    private final C3865v f21902e;

    /* JADX INFO: renamed from: f */
    private final n7h f21903f;

    /* JADX INFO: renamed from: j */
    private boolean f21904j;

    /* JADX INFO: renamed from: l */
    @dd
    private final Handler f21905l;

    /* JADX INFO: renamed from: m */
    private boolean f21906m;

    /* JADX INFO: renamed from: o */
    private boolean f21907o;

    /* JADX INFO: renamed from: u */
    @dd
    private x2 f21908u;

    /* JADX INFO: renamed from: v */
    @dd
    private qrj f21909v;

    /* JADX INFO: renamed from: w */
    private long f21910w;

    /* JADX INFO: renamed from: x */
    @dd
    private InterfaceC3691y f21911x;

    public kja0(n7h n7hVar, @dd Looper looper) {
        this(n7hVar, looper, InterfaceC3657p.f21929k);
    }

    /* JADX INFO: renamed from: c */
    private void m12904c() {
        this.f21906m = true;
        this.f21911x = this.f21900c.toq((xwq3) C3844k.f7l8(this.f21898a));
    }

    /* JADX INFO: renamed from: e */
    private void m12905e() {
        vyq();
        m12904c();
    }

    /* JADX INFO: renamed from: f */
    private void m12906f(C3660s c3660s) {
        String strValueOf = String.valueOf(this.f21898a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(strValueOf);
        ni7.m13700n(f65691ab, sb.toString(), c3660s);
        n5r1();
        m12905e();
    }

    private void hb(List<toq> list) {
        Handler handler = this.f21905l;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            lrht(list);
        }
    }

    private long hyr() {
        if (this.f21901d == -1) {
            return Long.MAX_VALUE;
        }
        C3844k.f7l8(this.f65692bo);
        if (this.f21901d >= this.f65692bo.mo12858n()) {
            return Long.MAX_VALUE;
        }
        return this.f65692bo.mo12859q(this.f21901d);
    }

    private void lrht(List<toq> list) {
        this.f21903f.mo12144h(list);
    }

    private void n5r1() {
        hb(Collections.emptyList());
    }

    private void uv6() {
        this.f21908u = null;
        this.f21901d = -1;
        qrj qrjVar = this.f65692bo;
        if (qrjVar != null) {
            qrjVar.cdj();
            this.f65692bo = null;
        }
        qrj qrjVar2 = this.f21909v;
        if (qrjVar2 != null) {
            qrjVar2.cdj();
            this.f21909v = null;
        }
    }

    private void vyq() {
        uv6();
        ((InterfaceC3691y) C3844k.f7l8(this.f21911x)).release();
        this.f21911x = null;
        this.f21899b = 0;
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void d2ok(long j2, boolean z2) {
        n5r1();
        this.f21904j = false;
        this.f21907o = false;
        this.f21910w = C3548p.f65257toq;
        if (this.f21899b != 0) {
            m12905e();
        } else {
            uv6();
            ((InterfaceC3691y) C3844k.f7l8(this.f21911x)).flush();
        }
    }

    @Override // com.google.android.exoplayer2.bek6, com.google.android.exoplayer2.cv06
    public String getName() {
        return f65691ab;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        lrht((List) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.bek6
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.cv06
    /* JADX INFO: renamed from: k */
    public int mo11518k(xwq3 xwq3Var) {
        if (this.f21900c.mo12914k(xwq3Var)) {
            return cv06.m11557p(xwq3Var.bv == 0 ? 4 : 2);
        }
        return wvg.t8r(xwq3Var.f23682r) ? cv06.m11557p(1) : cv06.m11557p(0);
    }

    public void nn86(long j2) {
        C3844k.m13633s(n7h());
        this.f21910w = j2;
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void oc() {
        this.f21898a = null;
        this.f21910w = C3548p.f65257toq;
        n5r1();
        vyq();
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void x9kr(xwq3[] xwq3VarArr, long j2, long j3) {
        this.f21898a = xwq3VarArr[0];
        if (this.f21911x != null) {
            this.f21899b = 1;
        } else {
            m12904c();
        }
    }

    @Override // com.google.android.exoplayer2.bek6
    public void zurt(long j2, long j3) throws C3298y {
        boolean z2;
        if (n7h()) {
            long j4 = this.f21910w;
            if (j4 != C3548p.f65257toq && j2 >= j4) {
                uv6();
                this.f21907o = true;
            }
        }
        if (this.f21907o) {
            return;
        }
        if (this.f21909v == null) {
            ((InterfaceC3691y) C3844k.f7l8(this.f21911x)).mo12866k(j2);
            try {
                this.f21909v = ((InterfaceC3691y) C3844k.f7l8(this.f21911x)).toq();
            } catch (C3660s e2) {
                m12906f(e2);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f65692bo != null) {
            long jHyr = hyr();
            z2 = false;
            while (jHyr <= j2) {
                this.f21901d++;
                jHyr = hyr();
                z2 = true;
            }
        } else {
            z2 = false;
        }
        qrj qrjVar = this.f21909v;
        if (qrjVar != null) {
            if (qrjVar.n7h()) {
                if (!z2 && hyr() == Long.MAX_VALUE) {
                    if (this.f21899b == 2) {
                        m12905e();
                    } else {
                        uv6();
                        this.f21907o = true;
                    }
                }
            } else if (qrjVar.f19600q <= j2) {
                qrj qrjVar2 = this.f65692bo;
                if (qrjVar2 != null) {
                    qrjVar2.cdj();
                }
                this.f21901d = qrjVar.toq(j2);
                this.f65692bo = qrjVar;
                this.f21909v = null;
                z2 = true;
            }
        }
        if (z2) {
            C3844k.f7l8(this.f65692bo);
            hb(this.f65692bo.zy(j2));
        }
        if (this.f21899b == 2) {
            return;
        }
        while (!this.f21904j) {
            try {
                x2 x2VarMo11564q = this.f21908u;
                if (x2VarMo11564q == null) {
                    x2VarMo11564q = ((InterfaceC3691y) C3844k.f7l8(this.f21911x)).mo11564q();
                    if (x2VarMo11564q == null) {
                        return;
                    } else {
                        this.f21908u = x2VarMo11564q;
                    }
                }
                if (this.f21899b == 1) {
                    x2VarMo11564q.m11565h(4);
                    ((InterfaceC3691y) C3844k.f7l8(this.f21911x)).zy(x2VarMo11564q);
                    this.f21908u = null;
                    this.f21899b = 2;
                    return;
                }
                int iNcyb = ncyb(this.f21902e, x2VarMo11564q, 0);
                if (iNcyb == -4) {
                    if (x2VarMo11564q.n7h()) {
                        this.f21904j = true;
                        this.f21906m = false;
                    } else {
                        xwq3 xwq3Var = this.f21902e.f67166toq;
                        if (xwq3Var == null) {
                            return;
                        }
                        x2VarMo11564q.f22137l = xwq3Var.f23669e;
                        x2VarMo11564q.m11579i();
                        this.f21906m &= !x2VarMo11564q.kja0();
                    }
                    if (!this.f21906m) {
                        ((InterfaceC3691y) C3844k.f7l8(this.f21911x)).zy(x2VarMo11564q);
                        this.f21908u = null;
                    }
                } else if (iNcyb == -3) {
                    return;
                }
            } catch (C3660s e3) {
                m12906f(e3);
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.bek6
    public boolean zy() {
        return this.f21907o;
    }

    public kja0(n7h n7hVar, @dd Looper looper, InterfaceC3657p interfaceC3657p) {
        super(3);
        this.f21903f = (n7h) C3844k.f7l8(n7hVar);
        this.f21905l = looper == null ? null : lrht.fu4(looper, this);
        this.f21900c = interfaceC3657p;
        this.f21902e = new C3865v();
        this.f21910w = C3548p.f65257toq;
    }
}
