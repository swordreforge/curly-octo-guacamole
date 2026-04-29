package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: IntVector.java */
/* JADX INFO: loaded from: classes.dex */
public final class qrj extends toq {
    public int f7l8(int i2) {
        return this.f4496q.getInt(m3987k(i2));
    }

    /* JADX INFO: renamed from: g */
    public qrj m3963g(int i2, ByteBuffer byteBuffer) {
        toq(i2, 4, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: y */
    public long m3964y(int i2) {
        return ((long) f7l8(i2)) & 4294967295L;
    }
}
