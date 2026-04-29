package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.decoder.AbstractC3294p;
import com.google.android.exoplayer2.xwq3;
import java.nio.ByteBuffer;
import zy.dd;

/* JADX INFO: compiled from: VideoDecoderOutputBuffer.java */
/* JADX INFO: loaded from: classes2.dex */
public class kja0 extends AbstractC3294p {

    /* JADX INFO: renamed from: c */
    public static final int f19565c = 0;

    /* JADX INFO: renamed from: e */
    public static final int f19566e = 1;

    /* JADX INFO: renamed from: j */
    public static final int f19567j = 2;

    /* JADX INFO: renamed from: o */
    public static final int f19568o = 3;

    /* JADX INFO: renamed from: f */
    private final AbstractC3294p.k<kja0> f19569f;

    /* JADX INFO: renamed from: g */
    public int f19570g;

    /* JADX INFO: renamed from: h */
    public int f19571h;

    /* JADX INFO: renamed from: i */
    @dd
    public xwq3 f19572i;

    /* JADX INFO: renamed from: l */
    @dd
    public ByteBuffer f19573l;

    /* JADX INFO: renamed from: p */
    public int f19574p;

    /* JADX INFO: renamed from: r */
    public int f19575r;

    /* JADX INFO: renamed from: s */
    @dd
    public ByteBuffer f19576s;

    /* JADX INFO: renamed from: t */
    @dd
    public int[] f19577t;

    /* JADX INFO: renamed from: y */
    public int f19578y;

    /* JADX INFO: renamed from: z */
    @dd
    public ByteBuffer[] f19579z;

    public kja0(AbstractC3294p.k<kja0> kVar) {
        this.f19569f = kVar;
    }

    private static boolean zurt(int i2, int i3) {
        return i2 >= 0 && i3 >= 0 && (i3 <= 0 || i2 < Integer.MAX_VALUE / i3);
    }

    @Override // com.google.android.exoplayer2.decoder.AbstractC3294p
    public void cdj() {
        this.f19569f.mo11571k(this);
    }

    public boolean fn3e(int i2, int i3, int i4, int i5, int i6) {
        this.f19574p = i2;
        this.f19571h = i3;
        this.f19575r = i6;
        int i7 = (int) ((((long) i3) + 1) / 2);
        if (zurt(i4, i3) && zurt(i5, i7)) {
            int i8 = i3 * i4;
            int i9 = i7 * i5;
            int i10 = (i9 * 2) + i8;
            if (zurt(i9, 2) && i10 >= i8) {
                ByteBuffer byteBuffer = this.f19576s;
                if (byteBuffer == null || byteBuffer.capacity() < i10) {
                    this.f19576s = ByteBuffer.allocateDirect(i10);
                } else {
                    this.f19576s.position(0);
                    this.f19576s.limit(i10);
                }
                if (this.f19579z == null) {
                    this.f19579z = new ByteBuffer[3];
                }
                ByteBuffer byteBuffer2 = this.f19576s;
                ByteBuffer[] byteBufferArr = this.f19579z;
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferArr[0] = byteBufferSlice;
                byteBufferSlice.limit(i8);
                byteBuffer2.position(i8);
                ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
                byteBufferArr[1] = byteBufferSlice2;
                byteBufferSlice2.limit(i9);
                byteBuffer2.position(i8 + i9);
                ByteBuffer byteBufferSlice3 = byteBuffer2.slice();
                byteBufferArr[2] = byteBufferSlice3;
                byteBufferSlice3.limit(i9);
                if (this.f19577t == null) {
                    this.f19577t = new int[3];
                }
                int[] iArr = this.f19577t;
                iArr[0] = i4;
                iArr[1] = i5;
                iArr[2] = i5;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m11568i(int i2, int i3) {
        this.f19574p = i2;
        this.f19571h = i3;
    }

    public void ki(long j2, int i2, @dd ByteBuffer byteBuffer) {
        this.f19600q = j2;
        this.f19578y = i2;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            this.f19573l = null;
            return;
        }
        f7l8(268435456);
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.f19573l;
        if (byteBuffer2 == null || byteBuffer2.capacity() < iLimit) {
            this.f19573l = ByteBuffer.allocate(iLimit);
        } else {
            this.f19573l.clear();
        }
        this.f19573l.put(byteBuffer);
        this.f19573l.flip();
        byteBuffer.position(0);
    }
}
