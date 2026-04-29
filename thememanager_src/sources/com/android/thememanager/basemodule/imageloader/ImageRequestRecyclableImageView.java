package com.android.thememanager.basemodule.imageloader;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.fn3e;
import zy.dd;

/* JADX INFO: loaded from: classes.dex */
public class ImageRequestRecyclableImageView extends ImageView implements x2.InterfaceC7907x2 {

    /* JADX INFO: renamed from: k */
    private x2.ld6 f9915k;

    /* JADX INFO: renamed from: q */
    private boolean f9916q;

    public ImageRequestRecyclableImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        x2.ld6 ld6Var;
        super.onAttachedToWindow();
        if (!this.f9916q || (ld6Var = this.f9915k) == null) {
            return;
        }
        ld6Var.zy();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        x2.ld6 ld6Var;
        super.onDetachedFromWindow();
        if (!this.f9916q || (ld6Var = this.f9915k) == null) {
            return;
        }
        ld6Var.m6799q();
    }

    public void setAutoRecycle(boolean autoRecycle) {
        this.f9916q = autoRecycle;
    }

    @Override // com.android.thememanager.basemodule.imageloader.x2.InterfaceC7907x2
    public void setRecyclerImageLoader(x2.ld6 recyclerImageLoader) {
        this.f9915k = recyclerImageLoader;
    }

    public ImageRequestRecyclableImageView(Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ImageRequestRecyclableImageView(Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f9916q = true;
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, fn3e.C2036i.i0z, 0, 0);
            try {
                this.f9916q = typedArrayObtainStyledAttributes.getBoolean(0, true);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }
}
