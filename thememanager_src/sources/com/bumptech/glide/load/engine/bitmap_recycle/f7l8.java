package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: compiled from: ByteArrayAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f7l8 implements InterfaceC3005k<byte[]> {

    /* JADX INFO: renamed from: k */
    private static final String f18256k = "ByteArrayPool";

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3005k
    public String getTag() {
        return f18256k;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3005k
    /* JADX INFO: renamed from: k */
    public int mo10664k() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3005k
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i2) {
        return new byte[i2];
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3005k
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public int toq(byte[] bArr) {
        return bArr.length;
    }
}
