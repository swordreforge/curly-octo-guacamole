package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.transition.InterfaceC3185g;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.request.target.p */
/* JADX INFO: compiled from: ImageViewTarget.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3180p<Z> extends ki<ImageView, Z> implements InterfaceC3185g.k {

    /* JADX INFO: renamed from: z */
    @dd
    private Animatable f19029z;

    public AbstractC3180p(ImageView imageView) {
        super(imageView);
    }

    private void fu4(@dd Z z2) {
        ni7(z2);
        zurt(z2);
    }

    private void zurt(@dd Z z2) {
        if (!(z2 instanceof Animatable)) {
            this.f19029z = null;
            return;
        }
        Animatable animatable = (Animatable) z2;
        this.f19029z = animatable;
        animatable.start();
    }

    @Override // com.bumptech.glide.request.target.toq, com.bumptech.glide.request.target.InterfaceC3175h
    /* JADX INFO: renamed from: h */
    public void mo6802h(@dd Drawable drawable) {
        super.mo6802h(drawable);
        fu4(null);
        mo11204q(drawable);
    }

    @Override // com.bumptech.glide.request.target.toq, com.bumptech.glide.manager.qrj
    /* JADX INFO: renamed from: k */
    public void mo10580k() {
        Animatable animatable = this.f19029z;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.request.transition.InterfaceC3185g.k
    @dd
    /* JADX INFO: renamed from: n */
    public Drawable mo11203n() {
        return ((ImageView) this.f19015q).getDrawable();
    }

    protected abstract void ni7(@dd Z z2);

    @Override // com.bumptech.glide.request.target.toq, com.bumptech.glide.manager.qrj
    public void onStop() {
        Animatable animatable = this.f19029z;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // com.bumptech.glide.request.target.ki, com.bumptech.glide.request.target.toq, com.bumptech.glide.request.target.InterfaceC3175h
    /* JADX INFO: renamed from: p */
    public void mo6797p(@dd Drawable drawable) {
        super.mo6797p(drawable);
        fu4(null);
        mo11204q(drawable);
    }

    @Override // com.bumptech.glide.request.transition.InterfaceC3185g.k
    /* JADX INFO: renamed from: q */
    public void mo11204q(Drawable drawable) {
        ((ImageView) this.f19015q).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    public void qrj(@lvui Z z2, @dd InterfaceC3185g<? super Z> interfaceC3185g) {
        if (interfaceC3185g == null || !interfaceC3185g.mo11211k(z2, this)) {
            fu4(z2);
        } else {
            zurt(z2);
        }
    }

    @Override // com.bumptech.glide.request.target.ki, com.bumptech.glide.request.target.toq, com.bumptech.glide.request.target.InterfaceC3175h
    public void x2(@dd Drawable drawable) {
        super.x2(drawable);
        Animatable animatable = this.f19029z;
        if (animatable != null) {
            animatable.stop();
        }
        fu4(null);
        mo11204q(drawable);
    }

    @Deprecated
    public AbstractC3180p(ImageView imageView, boolean z2) {
        super(imageView, z2);
    }
}
