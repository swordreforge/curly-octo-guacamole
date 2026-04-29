package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import com.bumptech.glide.load.resource.drawable.AbstractC3120q;
import zy.lvui;

/* JADX INFO: compiled from: BitmapDrawableResource.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends AbstractC3120q<BitmapDrawable> implements com.bumptech.glide.load.engine.ki {

    /* JADX INFO: renamed from: q */
    private final InterfaceC3008n f18763q;

    public zy(BitmapDrawable bitmapDrawable, InterfaceC3008n interfaceC3008n) {
        super(bitmapDrawable);
        this.f18763q = interfaceC3008n;
    }

    @Override // com.bumptech.glide.load.resource.drawable.AbstractC3120q, com.bumptech.glide.load.engine.ki
    /* JADX INFO: renamed from: k */
    public void mo10781k() {
        ((BitmapDrawable) this.f18775k).getBitmap().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.zurt
    @lvui
    /* JADX INFO: renamed from: n */
    public Class<BitmapDrawable> mo10765n() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.zurt
    public void toq() {
        this.f18763q.mo10669q(((BitmapDrawable) this.f18775k).getBitmap());
    }

    @Override // com.bumptech.glide.load.engine.zurt
    public int zy() {
        return com.bumptech.glide.util.kja0.m11233y(((BitmapDrawable) this.f18775k).getBitmap());
    }
}
