package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import zy.dd;

/* JADX INFO: compiled from: LruPoolStrategy.java */
/* JADX INFO: loaded from: classes2.dex */
interface x2 {
    @dd
    /* JADX INFO: renamed from: g */
    Bitmap mo10672g(int i2, int i3, Bitmap.Config config);

    /* JADX INFO: renamed from: k */
    String mo10673k(Bitmap bitmap);

    /* JADX INFO: renamed from: q */
    void mo10674q(Bitmap bitmap);

    @dd
    Bitmap removeLast();

    String toq(int i2, int i3, Bitmap.Config config);

    int zy(Bitmap bitmap);
}
