package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.zurt;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.drawable.g */
/* JADX INFO: compiled from: NonOwnedDrawableResource.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3117g extends AbstractC3120q<Drawable> {
    private C3117g(Drawable drawable) {
        super(drawable);
    }

    @dd
    /* JADX INFO: renamed from: g */
    static zurt<Drawable> m11015g(@dd Drawable drawable) {
        if (drawable != null) {
            return new C3117g(drawable);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.engine.zurt
    @lvui
    /* JADX INFO: renamed from: n */
    public Class<Drawable> mo10765n() {
        return this.f18775k.getClass();
    }

    @Override // com.bumptech.glide.load.engine.zurt
    public void toq() {
    }

    @Override // com.bumptech.glide.load.engine.zurt
    public int zy() {
        return Math.max(1, this.f18775k.getIntrinsicWidth() * this.f18775k.getIntrinsicHeight() * 4);
    }
}
