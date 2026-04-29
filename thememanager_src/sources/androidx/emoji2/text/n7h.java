package androidx.emoji2.text;

import android.content.res.AssetManager;
import androidx.emoji2.text.flatbuffer.C0809h;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.qo;
import zy.InterfaceC7840q;
import zy.a9;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: MetadataListReader.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(19)
@InterfaceC7840q
@uv6({uv6.EnumC7844k.LIBRARY})
class n7h {

    /* JADX INFO: renamed from: k */
    private static final int f4547k = 1164798569;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f51175toq = 1701669481;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f51176zy = 1835365473;

    /* JADX INFO: renamed from: androidx.emoji2.text.n7h$k */
    /* JADX INFO: compiled from: MetadataListReader.java */
    private static class C0831k implements InterfaceC0832q {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @lvui
        private final ByteBuffer f51177zy;

        C0831k(@lvui ByteBuffer byteBuffer) {
            this.f51177zy = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.n7h.InterfaceC0832q
        public long getPosition() {
            return this.f51177zy.position();
        }

        @Override // androidx.emoji2.text.n7h.InterfaceC0832q
        /* JADX INFO: renamed from: n */
        public long mo4057n() throws IOException {
            return n7h.m4055n(this.f51177zy.getInt());
        }

        @Override // androidx.emoji2.text.n7h.InterfaceC0832q
        /* JADX INFO: renamed from: q */
        public int mo4058q() throws IOException {
            return this.f51177zy.getInt();
        }

        @Override // androidx.emoji2.text.n7h.InterfaceC0832q
        public int readUnsignedShort() throws IOException {
            return n7h.m4053g(this.f51177zy.getShort());
        }

        @Override // androidx.emoji2.text.n7h.InterfaceC0832q
        public void zy(int i2) throws IOException {
            ByteBuffer byteBuffer = this.f51177zy;
            byteBuffer.position(byteBuffer.position() + i2);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.n7h$q */
    /* JADX INFO: compiled from: MetadataListReader.java */
    private interface InterfaceC0832q {

        /* JADX INFO: renamed from: k */
        public static final int f4548k = 2;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final int f51178toq = 4;

        long getPosition();

        /* JADX INFO: renamed from: n */
        long mo4057n() throws IOException;

        /* JADX INFO: renamed from: q */
        int mo4058q() throws IOException;

        int readUnsignedShort() throws IOException;

        void zy(int i2) throws IOException;
    }

    /* JADX INFO: compiled from: MetadataListReader.java */
    private static class toq implements InterfaceC0832q {

        /* JADX INFO: renamed from: g */
        private long f4549g = 0;

        /* JADX INFO: renamed from: n */
        @lvui
        private final InputStream f4550n;

        /* JADX INFO: renamed from: q */
        @lvui
        private final ByteBuffer f4551q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @lvui
        private final byte[] f51179zy;

        toq(@lvui InputStream inputStream) {
            this.f4550n = inputStream;
            byte[] bArr = new byte[4];
            this.f51179zy = bArr;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            this.f4551q = byteBufferWrap;
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        }

        /* JADX INFO: renamed from: k */
        private void m4059k(@a9(from = 0, to = 4) int i2) throws IOException {
            if (this.f4550n.read(this.f51179zy, 0, i2) != i2) {
                throw new IOException("read failed");
            }
            this.f4549g += (long) i2;
        }

        @Override // androidx.emoji2.text.n7h.InterfaceC0832q
        public long getPosition() {
            return this.f4549g;
        }

        @Override // androidx.emoji2.text.n7h.InterfaceC0832q
        /* JADX INFO: renamed from: n */
        public long mo4057n() throws IOException {
            this.f4551q.position(0);
            m4059k(4);
            return n7h.m4055n(this.f4551q.getInt());
        }

        @Override // androidx.emoji2.text.n7h.InterfaceC0832q
        /* JADX INFO: renamed from: q */
        public int mo4058q() throws IOException {
            this.f4551q.position(0);
            m4059k(4);
            return this.f4551q.getInt();
        }

        @Override // androidx.emoji2.text.n7h.InterfaceC0832q
        public int readUnsignedShort() throws IOException {
            this.f4551q.position(0);
            m4059k(2);
            return n7h.m4053g(this.f4551q.getShort());
        }

        @Override // androidx.emoji2.text.n7h.InterfaceC0832q
        public void zy(int i2) throws IOException {
            while (i2 > 0) {
                int iSkip = (int) this.f4550n.skip(i2);
                if (iSkip < 1) {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
                i2 -= iSkip;
                this.f4549g += (long) iSkip;
            }
        }
    }

    /* JADX INFO: compiled from: MetadataListReader.java */
    private static class zy {

        /* JADX INFO: renamed from: k */
        private final long f4552k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final long f51180toq;

        zy(long j2, long j3) {
            this.f4552k = j2;
            this.f51180toq = j3;
        }

        /* JADX INFO: renamed from: k */
        long m4060k() {
            return this.f51180toq;
        }

        long toq() {
            return this.f4552k;
        }
    }

    private n7h() {
    }

    /* JADX INFO: renamed from: g */
    static int m4053g(short s2) {
        return s2 & qo.f36486g;
    }

    /* JADX INFO: renamed from: k */
    private static zy m4054k(InterfaceC0832q interfaceC0832q) throws IOException {
        long jMo4057n;
        interfaceC0832q.zy(4);
        int unsignedShort = interfaceC0832q.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        interfaceC0832q.zy(6);
        int i2 = 0;
        while (true) {
            if (i2 >= unsignedShort) {
                jMo4057n = -1;
                break;
            }
            int iMo4058q = interfaceC0832q.mo4058q();
            interfaceC0832q.zy(4);
            jMo4057n = interfaceC0832q.mo4057n();
            interfaceC0832q.zy(4);
            if (1835365473 == iMo4058q) {
                break;
            }
            i2++;
        }
        if (jMo4057n != -1) {
            interfaceC0832q.zy((int) (jMo4057n - interfaceC0832q.getPosition()));
            interfaceC0832q.zy(12);
            long jMo4057n2 = interfaceC0832q.mo4057n();
            for (int i3 = 0; i3 < jMo4057n2; i3++) {
                int iMo4058q2 = interfaceC0832q.mo4058q();
                long jMo4057n3 = interfaceC0832q.mo4057n();
                long jMo4057n4 = interfaceC0832q.mo4057n();
                if (f4547k == iMo4058q2 || f51175toq == iMo4058q2) {
                    return new zy(jMo4057n3 + jMo4057n, jMo4057n4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: renamed from: n */
    static long m4055n(int i2) {
        return ((long) i2) & 4294967295L;
    }

    /* JADX INFO: renamed from: q */
    static C0809h m4056q(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) m4054k(new C0831k(byteBufferDuplicate)).toq());
        return C0809h.jp0y(byteBufferDuplicate);
    }

    static C0809h toq(AssetManager assetManager, String str) throws IOException {
        InputStream inputStreamOpen = assetManager.open(str);
        try {
            C0809h c0809hZy = zy(inputStreamOpen);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return c0809hZy;
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static C0809h zy(InputStream inputStream) throws IOException {
        toq toqVar = new toq(inputStream);
        zy zyVarM4054k = m4054k(toqVar);
        toqVar.zy((int) (zyVarM4054k.toq() - toqVar.getPosition()));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) zyVarM4054k.m4060k());
        int i2 = inputStream.read(byteBufferAllocate.array());
        if (i2 == zyVarM4054k.m4060k()) {
            return C0809h.jp0y(byteBufferAllocate);
        }
        throw new IOException("Needed " + zyVarM4054k.m4060k() + " bytes, got " + i2);
    }
}
