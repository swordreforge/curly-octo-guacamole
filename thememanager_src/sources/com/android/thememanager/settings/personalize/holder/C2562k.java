package com.android.thememanager.settings.personalize.holder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.view.View;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.settings.personalize.AodPreviewDataManager;
import i1.C6077k;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.settings.personalize.holder.k */
/* JADX INFO: compiled from: AodPreviewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2562k extends AbstractC2564q implements com.android.thememanager.settings.personalize.zy {

    /* JADX INFO: renamed from: g */
    private AodPreviewDataManager f15247g;

    /* JADX INFO: renamed from: n */
    private ImageView f15248n;

    /* JADX INFO: renamed from: q */
    private ImageView f15249q;

    public C2562k(@lvui Context context, @lvui View itemView, AodPreviewDataManager aodPreviewDataManager) {
        super(context, itemView);
        this.f15248n = (ImageView) itemView.findViewById(R.id.aod_preview_img);
        this.f15249q = (ImageView) itemView.findViewById(R.id.aod_preview_bg_img);
        this.f15247g = aodPreviewDataManager;
        aodPreviewDataManager.x2(this);
    }

    @Override // com.android.thememanager.settings.personalize.zy
    public int getPreviewType() {
        return 0;
    }

    @Override // com.android.thememanager.settings.personalize.zy
    /* JADX INFO: renamed from: k */
    public void mo9066k(Bitmap bitmap) {
        if (this.f15248n != null) {
            if (bitmap == null || bitmap.isRecycled()) {
                this.f15248n.setImageBitmap(null);
            } else {
                this.f15248n.setImageBitmap(bitmap);
                C6077k.d3(this.f15248n);
            }
        }
    }

    @Override // com.android.thememanager.settings.personalize.holder.AbstractC2564q
    public void ki(int position) {
        AodPreviewDataManager aodPreviewDataManager = this.f15247g;
        if (aodPreviewDataManager != null) {
            if (this.f15248n != null) {
                Bitmap bitmapKi = aodPreviewDataManager.ki();
                if (!C1807g.zurt() || bitmapKi == null) {
                    this.f15248n.setImageBitmap(this.f15247g.ki());
                } else {
                    int i2 = y9n.n7h(false).x;
                    if (bitmapKi.getWidth() > i2 && C1807g.m7083t(this.itemView.getContext())) {
                        this.f15248n.setImageBitmap(bitmapKi);
                    } else if (bitmapKi.getWidth() <= i2 && !C1807g.m7083t(this.itemView.getContext())) {
                        this.f15248n.setImageBitmap(bitmapKi);
                    }
                }
            }
            ImageView imageView = this.f15249q;
            if (imageView != null) {
                imageView.setImageIcon(this.f15247g.cdj());
            }
        }
    }

    @Override // com.android.thememanager.settings.personalize.zy
    public void n7h(Icon icon) {
        ImageView imageView = this.f15249q;
        if (imageView != null) {
            if (icon == null) {
                imageView.setImageIcon(null);
                this.f15249q.setBackgroundColor(this.f15251k.getResources().getColor(android.R.color.black));
                return;
            }
            ImageView imageView2 = this.f15248n;
            if (imageView2 != null) {
                imageView2.setImageBitmap(null);
            }
            this.f15249q.setImageIcon(icon);
            this.f15249q.setBackground(null);
        }
    }

    @Override // com.android.thememanager.settings.personalize.zy
    public void release() {
        ImageView imageView = this.f15248n;
        if (imageView != null) {
            imageView.setImageBitmap(null);
            this.f15248n = null;
        }
        ImageView imageView2 = this.f15249q;
        if (imageView2 != null) {
            imageView2.setImageIcon(null);
            this.f15249q = null;
        }
    }
}
