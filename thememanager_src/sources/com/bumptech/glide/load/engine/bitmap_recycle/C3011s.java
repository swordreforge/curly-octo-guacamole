package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.s */
/* JADX INFO: compiled from: IntegerArrayAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3011s implements InterfaceC3005k<int[]> {

    /* JADX INFO: renamed from: k */
    private static final String f18284k = "IntegerArrayPool";

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3005k
    public String getTag() {
        return f18284k;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3005k
    /* JADX INFO: renamed from: k */
    public int mo10664k() {
        return 4;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3005k
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public int[] newArray(int i2) {
        return new int[i2];
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3005k
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public int toq(int[] iArr) {
        return iArr.length;
    }
}
