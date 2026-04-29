package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.ki;
import com.bumptech.glide.load.engine.zurt;
import com.bumptech.glide.util.qrj;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.drawable.q */
/* JADX INFO: compiled from: DrawableResource.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3120q<T extends Drawable> implements zurt<T>, ki {

    /* JADX INFO: renamed from: k */
    protected final T f18775k;

    public AbstractC3120q(T t2) {
        this.f18775k = (T) qrj.m11262q(t2);
    }

    /* JADX INFO: renamed from: k */
    public void mo10781k() {
        T t2 = this.f18775k;
        if (t2 instanceof BitmapDrawable) {
            ((BitmapDrawable) t2).getBitmap().prepareToDraw();
        } else if (t2 instanceof com.bumptech.glide.load.resource.gif.zy) {
            ((com.bumptech.glide.load.resource.gif.zy) t2).f7l8().prepareToDraw();
        }
    }

    @Override // com.bumptech.glide.load.engine.zurt
    @lvui
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f18775k.getConstantState();
        return constantState == null ? this.f18775k : (T) constantState.newDrawable();
    }
}
