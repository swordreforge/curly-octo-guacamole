package com.bumptech.glide.gifdecoder;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.gifdecoder.q */
/* JADX INFO: compiled from: GifHeaderParser.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2976q {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f61623cdj = 128;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f61624f7l8 = 44;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f61625fn3e = 7;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f61626fu4 = 256;

    /* JADX INFO: renamed from: g */
    private static final int f17938g = 255;

    /* JADX INFO: renamed from: h */
    private static final int f17939h = 1;

    /* JADX INFO: renamed from: i */
    private static final int f17940i = 128;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f61627ki = 64;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f61628kja0 = 2;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f61629ld6 = 255;

    /* JADX INFO: renamed from: n */
    private static final String f17941n = "GifHeaderParser";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f61630n7h = 28;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    static final int f61631ni7 = 10;

    /* JADX INFO: renamed from: p */
    private static final int f17942p = 249;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f61632qrj = 1;

    /* JADX INFO: renamed from: s */
    private static final int f17943s = 59;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f61633t8r = 7;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f61634x2 = 254;

    /* JADX INFO: renamed from: y */
    private static final int f17944y = 33;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    static final int f61635zurt = 2;

    /* JADX INFO: renamed from: k */
    private final byte[] f17945k = new byte[256];

    /* JADX INFO: renamed from: q */
    private int f17946q = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private ByteBuffer f61636toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private zy f61637zy;

    private void f7l8() {
        int iM10601n = m10601n();
        this.f17946q = iM10601n;
        if (iM10601n <= 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            try {
                i3 = this.f17946q;
                if (i2 >= i3) {
                    return;
                }
                i3 -= i2;
                this.f61636toq.get(this.f17945k, i2, i3);
                i2 += i3;
            } catch (Exception e2) {
                if (Log.isLoggable(f17941n, 3)) {
                    Log.d(f17941n, "Error Reading Block n: " + i2 + " count: " + i3 + " blockSize: " + this.f17946q, e2);
                }
                this.f61637zy.f61651toq = 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m10598g() {
        this.f61637zy.f17958q.f17948k = kja0();
        this.f61637zy.f17958q.f61644toq = kja0();
        this.f61637zy.f17958q.f61645zy = kja0();
        this.f61637zy.f17958q.f17951q = kja0();
        int iM10601n = m10601n();
        boolean z2 = (iM10601n & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iM10601n & 7) + 1);
        toq toqVar = this.f61637zy.f17958q;
        toqVar.f17949n = (iM10601n & 64) != 0;
        if (z2) {
            toqVar.f61643ld6 = m10604y(iPow);
        } else {
            toqVar.f61643ld6 = null;
        }
        this.f61637zy.f17958q.f17950p = this.f61636toq.position();
        m10600i();
        if (toq()) {
            return;
        }
        zy zyVar = this.f61637zy;
        zyVar.f61653zy++;
        zyVar.f17956n.add(zyVar.f17958q);
    }

    /* JADX INFO: renamed from: h */
    private void m10599h() {
        this.f61636toq = null;
        Arrays.fill(this.f17945k, (byte) 0);
        this.f61637zy = new zy();
        this.f17946q = 0;
    }

    /* JADX INFO: renamed from: i */
    private void m10600i() {
        m10601n();
        t8r();
    }

    private int kja0() {
        return this.f61636toq.getShort();
    }

    private void ld6() {
        m10601n();
        int iM10601n = m10601n();
        toq toqVar = this.f61637zy.f17958q;
        int i2 = (iM10601n & 28) >> 2;
        toqVar.f61642f7l8 = i2;
        if (i2 == 0) {
            toqVar.f61642f7l8 = 1;
        }
        toqVar.f17947g = (iM10601n & 1) != 0;
        int iKja0 = kja0();
        if (iKja0 < 2) {
            iKja0 = 10;
        }
        toq toqVar2 = this.f61637zy.f17958q;
        toqVar2.f17952s = iKja0 * 10;
        toqVar2.f17953y = m10601n();
        m10601n();
    }

    /* JADX INFO: renamed from: n */
    private int m10601n() {
        try {
            return this.f61636toq.get() & 255;
        } catch (Exception unused) {
            this.f61637zy.f61651toq = 1;
            return 0;
        }
    }

    private void n7h() {
        do {
            f7l8();
            byte[] bArr = this.f17945k;
            if (bArr[0] == 1) {
                this.f61637zy.f61650qrj = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f17946q <= 0) {
                return;
            }
        } while (!toq());
    }

    /* JADX INFO: renamed from: p */
    private void m10602p(int i2) {
        boolean z2 = false;
        while (!z2 && !toq() && this.f61637zy.f61653zy <= i2) {
            int iM10601n = m10601n();
            if (iM10601n == 33) {
                int iM10601n2 = m10601n();
                if (iM10601n2 == 1) {
                    t8r();
                } else if (iM10601n2 == f17942p) {
                    this.f61637zy.f17958q = new toq();
                    ld6();
                } else if (iM10601n2 == f61634x2) {
                    t8r();
                } else if (iM10601n2 != 255) {
                    t8r();
                } else {
                    f7l8();
                    StringBuilder sb = new StringBuilder();
                    for (int i3 = 0; i3 < 11; i3++) {
                        sb.append((char) this.f17945k[i3]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        n7h();
                    } else {
                        t8r();
                    }
                }
            } else if (iM10601n == 44) {
                zy zyVar = this.f61637zy;
                if (zyVar.f17958q == null) {
                    zyVar.f17958q = new toq();
                }
                m10598g();
            } else if (iM10601n != 59) {
                this.f61637zy.f61651toq = 1;
            } else {
                z2 = true;
            }
        }
    }

    private void qrj() {
        this.f61637zy.f17954g = kja0();
        this.f61637zy.f61648f7l8 = kja0();
        int iM10601n = m10601n();
        zy zyVar = this.f61637zy;
        zyVar.f17960y = (iM10601n & 128) != 0;
        zyVar.f17959s = (int) Math.pow(2.0d, (iM10601n & 7) + 1);
        this.f61637zy.f17957p = m10601n();
        this.f61637zy.f61649ld6 = m10601n();
    }

    /* JADX INFO: renamed from: s */
    private void m10603s() {
        m10602p(Integer.MAX_VALUE);
    }

    private void t8r() {
        int iM10601n;
        do {
            iM10601n = m10601n();
            this.f61636toq.position(Math.min(this.f61636toq.position() + iM10601n, this.f61636toq.limit()));
        } while (iM10601n > 0);
    }

    private boolean toq() {
        return this.f61637zy.f61651toq != 0;
    }

    private void x2() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 6; i2++) {
            sb.append((char) m10601n());
        }
        if (!sb.toString().startsWith(com.android.thememanager.basemodule.analysis.toq.li)) {
            this.f61637zy.f61651toq = 1;
            return;
        }
        qrj();
        if (!this.f61637zy.f17960y || toq()) {
            return;
        }
        zy zyVar = this.f61637zy;
        zyVar.f17955k = m10604y(zyVar.f17959s);
        zy zyVar2 = this.f61637zy;
        zyVar2.f61652x2 = zyVar2.f17955k[zyVar2.f17957p];
    }

    @dd
    /* JADX INFO: renamed from: y */
    private int[] m10604y(int i2) {
        byte[] bArr = new byte[i2 * 3];
        int[] iArr = null;
        try {
            this.f61636toq.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = i3 + 1;
                iArr[i3] = ((bArr[i4] & 255) << 16) | (-16777216) | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
                i4 = i7;
                i3 = i8;
            }
        } catch (BufferUnderflowException e2) {
            if (Log.isLoggable(f17941n, 3)) {
                Log.d(f17941n, "Format Error Reading Color Table", e2);
            }
            this.f61637zy.f61651toq = 1;
        }
        return iArr;
    }

    public C2976q cdj(@lvui ByteBuffer byteBuffer) {
        m10599h();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f61636toq = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f61636toq.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public void m10605k() {
        this.f61636toq = null;
        this.f61637zy = null;
    }

    public C2976q ki(@dd byte[] bArr) {
        if (bArr != null) {
            cdj(ByteBuffer.wrap(bArr));
        } else {
            this.f61636toq = null;
            this.f61637zy.f61651toq = 2;
        }
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public zy m10606q() {
        if (this.f61636toq == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (toq()) {
            return this.f61637zy;
        }
        x2();
        if (!toq()) {
            m10603s();
            zy zyVar = this.f61637zy;
            if (zyVar.f61653zy < 0) {
                zyVar.f61651toq = 1;
            }
        }
        return this.f61637zy;
    }

    public boolean zy() {
        x2();
        if (!toq()) {
            m10602p(2);
        }
        return this.f61637zy.f61653zy > 1;
    }
}
