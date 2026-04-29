package com.bumptech.glide.load.resource.gif;

import com.bumptech.glide.load.engine.ki;
import com.bumptech.glide.load.resource.drawable.AbstractC3120q;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.gif.n */
/* JADX INFO: compiled from: GifDrawableResource.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3127n extends AbstractC3120q<zy> implements ki {
    public C3127n(zy zyVar) {
        super(zyVar);
    }

    @Override // com.bumptech.glide.load.resource.drawable.AbstractC3120q, com.bumptech.glide.load.engine.ki
    /* JADX INFO: renamed from: k */
    public void mo10781k() {
        ((zy) this.f18775k).f7l8().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.zurt
    @lvui
    /* JADX INFO: renamed from: n */
    public Class<zy> mo10765n() {
        return zy.class;
    }

    @Override // com.bumptech.glide.load.engine.zurt
    public void toq() {
        ((zy) this.f18775k).stop();
        ((zy) this.f18775k).kja0();
    }

    @Override // com.bumptech.glide.load.engine.zurt
    public int zy() {
        return ((zy) this.f18775k).x2();
    }
}
