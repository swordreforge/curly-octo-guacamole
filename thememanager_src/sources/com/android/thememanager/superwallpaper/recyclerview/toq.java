package com.android.thememanager.superwallpaper.recyclerview;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.android.thememanager.basemodule.imageloader.C1742y;
import com.android.thememanager.superwallpaper.base.AbstractC2721k;
import com.bumptech.glide.request.transition.InterfaceC3185g;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: MamlPositionListViewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq extends com.android.thememanager.superwallpaper.base.zy {

    /* JADX INFO: renamed from: com.android.thememanager.superwallpaper.recyclerview.toq$k */
    /* JADX INFO: compiled from: MamlPositionListViewHolder.java */
    class C2732k extends com.bumptech.glide.request.target.zy {
        C2732k(ImageView view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.AbstractC3180p, com.bumptech.glide.request.target.InterfaceC3175h
        /* JADX INFO: renamed from: o1t, reason: merged with bridge method [inline-methods] */
        public void qrj(@lvui Bitmap resource, @dd InterfaceC3185g<? super Bitmap> transition) {
            ((com.android.thememanager.superwallpaper.base.zy) toq.this).f16137q.setImageBitmap(resource);
        }
    }

    public toq(AbstractC2721k adapter, View itemView) {
        super(adapter, itemView);
    }

    @Override // com.android.thememanager.superwallpaper.base.zy
    @hyr(api = 23)
    public void fu4(vep5.toq data, int position) {
        String strM28112s;
        super.fu4(data, position);
        if (this.f16135k.fn3e()) {
            strM28112s = data.m28109n();
            if (p029m.zy.toq(strM28112s)) {
                strM28112s = data.m28112s();
            }
        } else {
            strM28112s = data.m28112s();
            if (p029m.zy.toq(strM28112s)) {
                strM28112s = data.m28109n();
            }
        }
        if (p029m.zy.toq(strM28112s)) {
            this.f16137q.setImageBitmap(null);
        } else {
            C1742y.m6809p(bf2.toq.toq()).zurt().mo6748i(strM28112s).yl(new C2732k(this.f16137q));
        }
    }
}
