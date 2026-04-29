package com.android.thememanager.basemodule.imageloader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.manager.ki;
import com.bumptech.glide.request.C3173s;
import com.bumptech.glide.request.InterfaceC3194y;
import java.io.File;
import java.net.URL;
import zy.InterfaceC7839p;
import zy.dd;
import zy.fn3e;
import zy.lvui;
import zy.n5r1;

/* JADX INFO: compiled from: GlideRequests.java */
/* JADX INFO: loaded from: classes.dex */
public class ld6 extends com.bumptech.glide.kja0 {
    public ld6(@lvui com.bumptech.glide.zy glide, @lvui com.bumptech.glide.manager.x2 lifecycle, @lvui ki treeNode, @lvui Context context) {
        super(glide, lifecycle, treeNode, context);
    }

    @Override // com.bumptech.glide.kja0, com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1732p<Drawable> n7h(@dd Bitmap bitmap) {
        return (C1732p) super.n7h(bitmap);
    }

    @Override // com.bumptech.glide.kja0
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: a98o, reason: merged with bridge method [inline-methods] */
    public C1732p<File> mcp() {
        return (C1732p) super.mcp();
    }

    @Override // com.bumptech.glide.kja0
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1732p<File> fu4() {
        return (C1732p) super.fu4();
    }

    @Override // com.bumptech.glide.kja0
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: bf2, reason: merged with bridge method [inline-methods] */
    public C1732p<com.bumptech.glide.load.resource.gif.zy> mo6759z() {
        return (C1732p) super.mo6759z();
    }

    @Override // com.bumptech.glide.kja0
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: bo, reason: merged with bridge method [inline-methods] */
    public C1732p<Drawable> mo6747g(@dd byte[] bytes) {
        return (C1732p) super.mo6747g(bytes);
    }

    @Override // com.bumptech.glide.kja0, com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: ch, reason: merged with bridge method [inline-methods] */
    public C1732p<Drawable> mo6758y(@dd File file) {
        return (C1732p) super.mo6758y(file);
    }

    @Override // com.bumptech.glide.kja0
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: ek5k, reason: merged with bridge method [inline-methods] */
    public <ResourceType> C1732p<ResourceType> fn3e(@lvui Class<ResourceType> resourceClass) {
        return new C1732p<>(this.f17970k, this, resourceClass, this.f17973q);
    }

    @Override // com.bumptech.glide.kja0
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public C1732p<File> mo6755t(@dd Object o2) {
        return (C1732p) super.mo6755t(o2);
    }

    @Override // com.bumptech.glide.kja0
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: lv5, reason: merged with bridge method [inline-methods] */
    public C1732p<Drawable> cdj(@dd Object o2) {
        return (C1732p) super.cdj(o2);
    }

    @Override // com.bumptech.glide.kja0
    @lvui
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public synchronized ld6 f7l8(@lvui C3173s options) {
        return (ld6) super.f7l8(options);
    }

    @Override // com.bumptech.glide.kja0, com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: nmn5, reason: merged with bridge method [inline-methods] */
    public C1732p<Drawable> ki(@dd @fn3e @n5r1 Integer id) {
        return (C1732p) super.ki(id);
    }

    @Override // com.bumptech.glide.kja0
    @lvui
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ld6 zy(InterfaceC3194y<Object> listener) {
        return (ld6) super.zy(listener);
    }

    @Override // com.bumptech.glide.kja0
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: t8iq, reason: merged with bridge method [inline-methods] */
    public C1732p<Drawable> mo6748i(@dd String string) {
        return (C1732p) super.mo6748i(string);
    }

    @Override // com.bumptech.glide.kja0, com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @Deprecated
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public C1732p<Drawable> mo6752q(@dd URL url) {
        return (C1732p) super.mo6752q(url);
    }

    @Override // com.bumptech.glide.kja0
    protected void vyq(@lvui C3173s toSet) {
        if (toSet instanceof C1734s) {
            super.vyq(toSet);
        } else {
            super.vyq(new C1734s().mo6764k(toSet));
        }
    }

    @Override // com.bumptech.glide.kja0
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public C1732p<Drawable> mo6750n(@dd Uri uri) {
        return (C1732p) super.mo6750n(uri);
    }

    @Override // com.bumptech.glide.kja0
    @lvui
    /* JADX INFO: renamed from: y2, reason: merged with bridge method [inline-methods] */
    public synchronized ld6 lrht(@lvui C3173s options) {
        return (ld6) super.lrht(options);
    }

    @Override // com.bumptech.glide.kja0
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: y9n, reason: merged with bridge method [inline-methods] */
    public C1732p<Drawable> ni7() {
        return (C1732p) super.ni7();
    }

    @Override // com.bumptech.glide.kja0
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: yz, reason: merged with bridge method [inline-methods] */
    public C1732p<Bitmap> zurt() {
        return (C1732p) super.zurt();
    }

    @Override // com.bumptech.glide.kja0, com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: zp, reason: merged with bridge method [inline-methods] */
    public C1732p<Drawable> mo6754s(@dd Drawable drawable) {
        return (C1732p) super.mo6754s(drawable);
    }
}
