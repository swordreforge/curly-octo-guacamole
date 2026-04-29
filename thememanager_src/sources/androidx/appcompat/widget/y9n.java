package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: TintResources.java */
/* JADX INFO: loaded from: classes.dex */
class y9n extends uv6 {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final WeakReference<Context> f46976toq;

    public y9n(@zy.lvui Context context, @zy.lvui Resources resources) {
        super(resources);
        this.f46976toq = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.uv6, android.content.res.Resources
    public Drawable getDrawable(int i2) throws Resources.NotFoundException {
        Drawable drawableM729k = m729k(i2);
        Context context = this.f46976toq.get();
        if (drawableM729k != null && context != null) {
            lrht.m648y().fu4(context, i2, drawableM729k);
        }
        return drawableM729k;
    }
}
