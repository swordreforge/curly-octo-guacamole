package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.c8jq;
import com.google.android.exoplayer2.xwq3;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.decoder.s */
/* JADX INFO: compiled from: DecoderInputBuffer.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3297s extends AbstractC3291k {

    /* JADX INFO: renamed from: r */
    public static final int f19609r = 2;

    /* JADX INFO: renamed from: t */
    public static final int f19610t = 1;

    /* JADX INFO: renamed from: z */
    public static final int f19611z = 0;

    /* JADX INFO: renamed from: g */
    @dd
    public ByteBuffer f19612g;

    /* JADX INFO: renamed from: h */
    private final int f19613h;

    /* JADX INFO: renamed from: i */
    private final int f19614i;

    /* JADX INFO: renamed from: n */
    public final C3293n f19615n;

    /* JADX INFO: renamed from: p */
    @dd
    public ByteBuffer f19616p;

    /* JADX INFO: renamed from: q */
    @dd
    public xwq3 f19617q;

    /* JADX INFO: renamed from: s */
    public long f19618s;

    /* JADX INFO: renamed from: y */
    public boolean f19619y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.decoder.s$k */
    /* JADX INFO: compiled from: DecoderInputBuffer.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.decoder.s$toq */
    /* JADX INFO: compiled from: DecoderInputBuffer.java */
    public static final class toq extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public toq(int i2, int i3) {
            StringBuilder sb = new StringBuilder(44);
            sb.append("Buffer too small (");
            sb.append(i2);
            sb.append(" < ");
            sb.append(i3);
            sb.append(")");
            super(sb.toString());
            this.currentCapacity = i2;
            this.requiredCapacity = i3;
        }
    }

    static {
        c8jq.m11556k("goog.exo.decoder");
    }

    public C3297s(int i2) {
        this(i2, 0);
    }

    private ByteBuffer cdj(int i2) {
        int i3 = this.f19613h;
        if (i3 == 1) {
            return ByteBuffer.allocate(i2);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i2);
        }
        ByteBuffer byteBuffer = this.f19612g;
        throw new toq(byteBuffer == null ? 0 : byteBuffer.capacity(), i2);
    }

    public static C3297s zurt() {
        return new C3297s(0);
    }

    public final boolean fn3e() {
        return ld6(1073741824);
    }

    /* JADX INFO: renamed from: i */
    public final void m11579i() {
        ByteBuffer byteBuffer = this.f19612g;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f19616p;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    @EnsuresNonNull({"data"})
    public void ki(int i2) {
        int i3 = i2 + this.f19614i;
        ByteBuffer byteBuffer = this.f19612g;
        if (byteBuffer == null) {
            this.f19612g = cdj(i3);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i4 = i3 + iPosition;
        if (iCapacity >= i4) {
            this.f19612g = byteBuffer;
            return;
        }
        ByteBuffer byteBufferCdj = cdj(i4);
        byteBufferCdj.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferCdj.put(byteBuffer);
        }
        this.f19612g = byteBufferCdj;
    }

    @EnsuresNonNull({"supplementalData"})
    public void ni7(int i2) {
        ByteBuffer byteBuffer = this.f19616p;
        if (byteBuffer == null || byteBuffer.capacity() < i2) {
            this.f19616p = ByteBuffer.allocate(i2);
        } else {
            this.f19616p.clear();
        }
    }

    @Override // com.google.android.exoplayer2.decoder.AbstractC3291k
    /* JADX INFO: renamed from: s */
    public void mo11567s() {
        super.mo11567s();
        ByteBuffer byteBuffer = this.f19612g;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f19616p;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f19619y = false;
    }

    public C3297s(int i2, int i3) {
        this.f19615n = new C3293n();
        this.f19613h = i2;
        this.f19614i = i3;
    }
}
