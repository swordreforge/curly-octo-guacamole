package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.g */
/* JADX INFO: compiled from: BitmapPoolAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3003g implements InterfaceC3008n {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n
    @lvui
    public Bitmap f7l8(int i2, int i3, Bitmap.Config config) {
        return mo10666g(i2, i3, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n
    @lvui
    /* JADX INFO: renamed from: g */
    public Bitmap mo10666g(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n
    /* JADX INFO: renamed from: k */
    public void mo10667k(int i2) {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n
    /* JADX INFO: renamed from: n */
    public long mo10668n() {
        return 0L;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n
    /* JADX INFO: renamed from: q */
    public void mo10669q(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n
    public void toq() {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n
    public void zy(float f2) {
    }
}
