package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.g */
/* JADX INFO: compiled from: ByteVector.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0808g extends toq {
    public byte f7l8(int i2) {
        return this.f4496q.get(m3987k(i2));
    }

    /* JADX INFO: renamed from: g */
    public C0808g m3879g(int i2, ByteBuffer byteBuffer) {
        toq(i2, 1, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: y */
    public int m3880y(int i2) {
        return f7l8(i2) & 255;
    }
}
