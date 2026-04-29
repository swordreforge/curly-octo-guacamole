package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: BaseVector.java */
/* JADX INFO: loaded from: classes.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private int f4495k;

    /* JADX INFO: renamed from: q */
    protected ByteBuffer f4496q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f51138toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f51139zy;

    /* JADX INFO: renamed from: k */
    protected int m3987k(int i2) {
        return this.f4495k + (i2 * this.f51139zy);
    }

    /* JADX INFO: renamed from: n */
    public void m3988n() {
        toq(0, 0, null);
    }

    /* JADX INFO: renamed from: q */
    public int m3989q() {
        return this.f51138toq;
    }

    protected void toq(int i2, int i3, ByteBuffer byteBuffer) {
        this.f4496q = byteBuffer;
        if (byteBuffer != null) {
            this.f4495k = i2;
            this.f51138toq = byteBuffer.getInt(i2 - 4);
            this.f51139zy = i3;
        } else {
            this.f4495k = 0;
            this.f51138toq = 0;
            this.f51139zy = 0;
        }
    }

    protected int zy() {
        return this.f4495k;
    }
}
