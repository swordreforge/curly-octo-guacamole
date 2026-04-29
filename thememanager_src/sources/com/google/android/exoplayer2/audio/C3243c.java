package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.InterfaceC3262p;
import com.google.android.exoplayer2.util.C3844k;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.c */
/* JADX INFO: compiled from: TeeAudioProcessor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3243c extends o1t {

    /* JADX INFO: renamed from: s */
    private final k f19293s;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.c$k */
    /* JADX INFO: compiled from: TeeAudioProcessor.java */
    public interface k {
        /* JADX INFO: renamed from: k */
        void mo11390k(ByteBuffer byteBuffer);

        void toq(int i2, int i3, int i4);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.c$toq */
    /* JADX INFO: compiled from: TeeAudioProcessor.java */
    public static final class toq implements k {

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private static final int f63313ld6 = 4;

        /* JADX INFO: renamed from: p */
        private static final String f19294p = "WaveFileAudioBufferSink";

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private static final int f63314qrj = 44;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private static final int f63315x2 = 40;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @zy.dd
        private RandomAccessFile f63316f7l8;

        /* JADX INFO: renamed from: g */
        private int f19295g;

        /* JADX INFO: renamed from: k */
        private final String f19296k;

        /* JADX INFO: renamed from: n */
        private int f19297n;

        /* JADX INFO: renamed from: q */
        private int f19298q;

        /* JADX INFO: renamed from: s */
        private int f19299s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final byte[] f63317toq;

        /* JADX INFO: renamed from: y */
        private int f19300y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final ByteBuffer f63318zy;

        public toq(String str) {
            this.f19296k = str;
            byte[] bArr = new byte[1024];
            this.f63317toq = bArr;
            this.f63318zy = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        }

        private void f7l8(RandomAccessFile randomAccessFile) throws IOException {
            randomAccessFile.writeInt(uv6.f19487k);
            randomAccessFile.writeInt(-1);
            randomAccessFile.writeInt(uv6.f63518toq);
            randomAccessFile.writeInt(uv6.f63520zy);
            this.f63318zy.clear();
            this.f63318zy.putInt(16);
            this.f63318zy.putShort((short) uv6.toq(this.f19295g));
            this.f63318zy.putShort((short) this.f19297n);
            this.f63318zy.putInt(this.f19298q);
            int iM13674x = com.google.android.exoplayer2.util.lrht.m13674x(this.f19295g, this.f19297n);
            this.f63318zy.putInt(this.f19298q * iM13674x);
            this.f63318zy.putShort((short) iM13674x);
            this.f63318zy.putShort((short) ((iM13674x * 8) / this.f19297n));
            randomAccessFile.write(this.f63317toq, 0, this.f63318zy.position());
            randomAccessFile.writeInt(1684108385);
            randomAccessFile.writeInt(-1);
        }

        /* JADX INFO: renamed from: g */
        private void m11391g(ByteBuffer byteBuffer) throws IOException {
            RandomAccessFile randomAccessFile = (RandomAccessFile) C3844k.f7l8(this.f63316f7l8);
            while (byteBuffer.hasRemaining()) {
                int iMin = Math.min(byteBuffer.remaining(), this.f63317toq.length);
                byteBuffer.get(this.f63317toq, 0, iMin);
                randomAccessFile.write(this.f63317toq, 0, iMin);
                this.f19299s += iMin;
            }
        }

        /* JADX INFO: renamed from: n */
        private void m11392n() throws IOException {
            RandomAccessFile randomAccessFile = this.f63316f7l8;
            if (randomAccessFile == null) {
                return;
            }
            try {
                this.f63318zy.clear();
                this.f63318zy.putInt(this.f19299s - 8);
                randomAccessFile.seek(4L);
                randomAccessFile.write(this.f63317toq, 0, 4);
                this.f63318zy.clear();
                this.f63318zy.putInt(this.f19299s - 44);
                randomAccessFile.seek(40L);
                randomAccessFile.write(this.f63317toq, 0, 4);
            } catch (IOException e2) {
                com.google.android.exoplayer2.util.ni7.n7h(f19294p, "Error updating file size", e2);
            }
            try {
                randomAccessFile.close();
            } finally {
                this.f63316f7l8 = null;
            }
        }

        /* JADX INFO: renamed from: q */
        private void m11393q() throws IOException {
            if (this.f63316f7l8 != null) {
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(zy(), "rw");
            f7l8(randomAccessFile);
            this.f63316f7l8 = randomAccessFile;
            this.f19299s = 44;
        }

        private String zy() {
            int i2 = this.f19300y;
            this.f19300y = i2 + 1;
            return com.google.android.exoplayer2.util.lrht.gvn7("%s-%04d.wav", this.f19296k, Integer.valueOf(i2));
        }

        @Override // com.google.android.exoplayer2.audio.C3243c.k
        /* JADX INFO: renamed from: k */
        public void mo11390k(ByteBuffer byteBuffer) {
            try {
                m11393q();
                m11391g(byteBuffer);
            } catch (IOException e2) {
                com.google.android.exoplayer2.util.ni7.m13700n(f19294p, "Error writing data", e2);
            }
        }

        @Override // com.google.android.exoplayer2.audio.C3243c.k
        public void toq(int i2, int i3, int i4) {
            try {
                m11392n();
            } catch (IOException e2) {
                com.google.android.exoplayer2.util.ni7.m13700n(f19294p, "Error resetting", e2);
            }
            this.f19298q = i2;
            this.f19297n = i3;
            this.f19295g = i4;
        }
    }

    public C3243c(k kVar) {
        this.f19293s = (k) C3844k.f7l8(kVar);
    }

    private void x2() {
        if (isActive()) {
            k kVar = this.f19293s;
            InterfaceC3262p.k kVar2 = this.f63496toq;
            kVar.toq(kVar2.f19444k, kVar2.f63498toq, kVar2.f63499zy);
        }
    }

    @Override // com.google.android.exoplayer2.audio.o1t
    public InterfaceC3262p.k f7l8(InterfaceC3262p.k kVar) {
        return kVar;
    }

    @Override // com.google.android.exoplayer2.audio.o1t
    /* JADX INFO: renamed from: p */
    protected void mo11387p() {
        x2();
    }

    @Override // com.google.android.exoplayer2.audio.o1t
    /* JADX INFO: renamed from: s */
    protected void mo11388s() {
        x2();
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    public void toq(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            return;
        }
        this.f19293s.mo11390k(byteBuffer.asReadOnlyBuffer());
        ld6(iRemaining).put(byteBuffer).flip();
    }

    @Override // com.google.android.exoplayer2.audio.o1t
    /* JADX INFO: renamed from: y */
    protected void mo11389y() {
        x2();
    }
}
