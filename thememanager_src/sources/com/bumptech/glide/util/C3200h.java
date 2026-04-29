package com.bumptech.glide.util;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.f7l8;
import com.bumptech.glide.request.target.AbstractC3174g;
import com.bumptech.glide.request.transition.InterfaceC3185g;
import java.util.Arrays;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.util.h */
/* JADX INFO: compiled from: ViewPreloadSizeProvider.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3200h<T> implements f7l8.toq<T>, com.bumptech.glide.request.target.kja0 {

    /* JADX INFO: renamed from: k */
    private int[] f19071k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private k f63071toq;

    /* JADX INFO: renamed from: com.bumptech.glide.util.h$k */
    /* JADX INFO: compiled from: ViewPreloadSizeProvider.java */
    static final class k extends AbstractC3174g<View, Object> {
        k(@lvui View view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3175h
        /* JADX INFO: renamed from: h */
        public void mo6802h(@dd Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3175h
        public void qrj(@lvui Object obj, @dd InterfaceC3185g<? super Object> interfaceC3185g) {
        }

        @Override // com.bumptech.glide.request.target.AbstractC3174g
        /* JADX INFO: renamed from: y */
        protected void mo10626y(@dd Drawable drawable) {
        }
    }

    public C3200h() {
    }

    @Override // com.bumptech.glide.f7l8.toq
    @dd
    /* JADX INFO: renamed from: k */
    public int[] mo10579k(@lvui T t2, int i2, int i3) {
        int[] iArr = this.f19071k;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    @Override // com.bumptech.glide.request.target.kja0
    /* JADX INFO: renamed from: q */
    public void mo11172q(int i2, int i3) {
        this.f19071k = new int[]{i2, i3};
        this.f63071toq = null;
    }

    public void toq(@lvui View view) {
        if (this.f19071k == null && this.f63071toq == null) {
            k kVar = new k(view);
            this.f63071toq = kVar;
            kVar.t8r(this);
        }
    }

    public C3200h(@lvui View view) {
        k kVar = new k(view);
        this.f63071toq = kVar;
        kVar.t8r(this);
    }
}
