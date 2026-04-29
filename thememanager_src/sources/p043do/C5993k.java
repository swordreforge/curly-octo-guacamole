package p043do;

import com.bumptech.glide.load.data.InterfaceC2998n;
import java.nio.ByteBuffer;
import zy.lvui;

/* JADX INFO: renamed from: do.k */
/* JADX INFO: compiled from: ByteBufferRewinder.java */
/* JADX INFO: loaded from: classes2.dex */
public class C5993k implements InterfaceC2998n<ByteBuffer> {

    /* JADX INFO: renamed from: k */
    private final ByteBuffer f34372k;

    /* JADX INFO: renamed from: do.k$k */
    /* JADX INFO: compiled from: ByteBufferRewinder.java */
    public static class k implements InterfaceC2998n.k<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.InterfaceC2998n.k
        @lvui
        /* JADX INFO: renamed from: k */
        public Class<ByteBuffer> mo10632k() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2998n.k
        @lvui
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public InterfaceC2998n<ByteBuffer> toq(ByteBuffer byteBuffer) {
            return new C5993k(byteBuffer);
        }
    }

    public C5993k(ByteBuffer byteBuffer) {
        this.f34372k = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2998n
    public void toq() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2998n
    @lvui
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public ByteBuffer mo10630k() {
        this.f34372k.position(0);
        return this.f34372k;
    }
}
