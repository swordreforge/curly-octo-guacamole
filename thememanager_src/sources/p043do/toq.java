package p043do;

import com.bumptech.glide.load.engine.zurt;
import com.bumptech.glide.util.qrj;
import zy.lvui;

/* JADX INFO: compiled from: BytesResource.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq implements zurt<byte[]> {

    /* JADX INFO: renamed from: k */
    private final byte[] f34373k;

    public toq(byte[] bArr) {
        this.f34373k = (byte[]) qrj.m11262q(bArr);
    }

    @Override // com.bumptech.glide.load.engine.zurt
    @lvui
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f34373k;
    }

    @Override // com.bumptech.glide.load.engine.zurt
    @lvui
    /* JADX INFO: renamed from: n */
    public Class<byte[]> mo10765n() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.engine.zurt
    public void toq() {
    }

    @Override // com.bumptech.glide.load.engine.zurt
    public int zy() {
        return this.f34373k.length;
    }
}
