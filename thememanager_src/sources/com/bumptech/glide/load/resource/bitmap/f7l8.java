package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: BitmapResource.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 implements com.bumptech.glide.load.engine.zurt<Bitmap>, com.bumptech.glide.load.engine.ki {

    /* JADX INFO: renamed from: k */
    private final Bitmap f18686k;

    /* JADX INFO: renamed from: q */
    private final InterfaceC3008n f18687q;

    public f7l8(@lvui Bitmap bitmap, @lvui InterfaceC3008n interfaceC3008n) {
        this.f18686k = (Bitmap) com.bumptech.glide.util.qrj.m11261n(bitmap, "Bitmap must not be null");
        this.f18687q = (InterfaceC3008n) com.bumptech.glide.util.qrj.m11261n(interfaceC3008n, "BitmapPool must not be null");
    }

    @dd
    /* JADX INFO: renamed from: g */
    public static f7l8 m10956g(@dd Bitmap bitmap, @lvui InterfaceC3008n interfaceC3008n) {
        if (bitmap == null) {
            return null;
        }
        return new f7l8(bitmap, interfaceC3008n);
    }

    @Override // com.bumptech.glide.load.engine.ki
    /* JADX INFO: renamed from: k */
    public void mo10781k() {
        this.f18686k.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.zurt
    @lvui
    /* JADX INFO: renamed from: n */
    public Class<Bitmap> mo10765n() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.zurt
    @lvui
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f18686k;
    }

    @Override // com.bumptech.glide.load.engine.zurt
    public void toq() {
        this.f18687q.mo10669q(this.f18686k);
    }

    @Override // com.bumptech.glide.load.engine.zurt
    public int zy() {
        return com.bumptech.glide.util.kja0.m11233y(this.f18686k);
    }
}
