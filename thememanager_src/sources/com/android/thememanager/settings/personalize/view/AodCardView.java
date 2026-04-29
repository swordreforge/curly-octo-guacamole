package com.android.thememanager.settings.personalize.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.settings.personalize.AodPreviewDataManager;
import i1.C6077k;
import miuix.smooth.SmoothFrameLayout2;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class AodCardView extends SmoothFrameLayout2 implements com.android.thememanager.settings.personalize.zy {

    /* JADX INFO: renamed from: c */
    private AodPreviewDataManager f15310c;

    /* JADX INFO: renamed from: f */
    private ImageView f15311f;

    /* JADX INFO: renamed from: l */
    private ImageView f15312l;

    public AodCardView(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: y */
    private void m9106y() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.personalize_aod_card_view, (ViewGroup) this, true);
        this.f15312l = (ImageView) viewInflate.findViewById(R.id.aod_card_preview_img);
        this.f15311f = (ImageView) viewInflate.findViewById(R.id.aod_card_bg_img);
    }

    @Override // com.android.thememanager.settings.personalize.zy
    public int getPreviewType() {
        return 1;
    }

    @Override // com.android.thememanager.settings.personalize.zy
    /* JADX INFO: renamed from: k */
    public void mo9066k(Bitmap bitmap) {
        if (this.f15312l != null) {
            if (bitmap == null || bitmap.isRecycled()) {
                this.f15312l.setImageBitmap(null);
            } else {
                this.f15312l.setImageBitmap(bitmap);
                C6077k.d3(this.f15312l);
            }
        }
    }

    @Override // com.android.thememanager.settings.personalize.zy
    public void n7h(Icon icon) {
        ImageView imageView = this.f15311f;
        if (imageView != null) {
            if (icon != null) {
                imageView.setBackground(null);
                this.f15311f.setImageIcon(icon);
            } else {
                imageView.setImageIcon(null);
                this.f15311f.setBackgroundColor(getContext().getResources().getColor(android.R.color.black));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1708s.f7l8().ld6().cdj(C1706p.kja0("personalize", "personalize_aod_card", ""));
    }

    @Override // com.android.thememanager.settings.personalize.zy
    public void release() {
        ImageView imageView = this.f15312l;
        if (imageView != null) {
            imageView.setImageBitmap(null);
            this.f15312l = null;
        }
        ImageView imageView2 = this.f15311f;
        if (imageView2 != null) {
            imageView2.setImageIcon(null);
            this.f15311f = null;
        }
    }

    public void setDataManager(AodPreviewDataManager dataManager) {
        if (this.f15310c != dataManager) {
            this.f15310c = dataManager;
            dataManager.ld6(this);
            this.f15311f.setBackground(null);
            this.f15311f.setImageIcon(this.f15310c.cdj());
            this.f15312l.setImageBitmap(this.f15310c.fn3e());
        }
    }

    public AodCardView(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AodCardView(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        m9106y();
    }
}
