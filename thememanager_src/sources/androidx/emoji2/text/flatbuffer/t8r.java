package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import kotlin.qo;

/* JADX INFO: compiled from: ShortVector.java */
/* JADX INFO: loaded from: classes.dex */
public final class t8r extends toq {
    public short f7l8(int i2) {
        return this.f4496q.getShort(m3987k(i2));
    }

    /* JADX INFO: renamed from: g */
    public t8r m3985g(int i2, ByteBuffer byteBuffer) {
        toq(i2, 2, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: y */
    public int m3986y(int i2) {
        return f7l8(i2) & qo.f36486g;
    }
}
