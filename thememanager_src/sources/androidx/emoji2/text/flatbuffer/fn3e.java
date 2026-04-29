package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Struct.java */
/* JADX INFO: loaded from: classes.dex */
public class fn3e {

    /* JADX INFO: renamed from: k */
    protected int f4442k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected ByteBuffer f51089toq;

    /* JADX INFO: renamed from: k */
    public void m3868k() {
        toq(0, null);
    }

    protected void toq(int i2, ByteBuffer byteBuffer) {
        this.f51089toq = byteBuffer;
        if (byteBuffer != null) {
            this.f4442k = i2;
        } else {
            this.f4442k = 0;
        }
    }
}
