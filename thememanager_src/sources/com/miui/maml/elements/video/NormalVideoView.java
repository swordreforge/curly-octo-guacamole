package com.miui.maml.elements.video;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
class NormalVideoView extends BaseVideoView {
    public NormalVideoView(Context context) {
        super(context);
    }

    @Override // com.miui.maml.elements.video.BaseVideoView
    protected void addSurfaceHolderCallback() {
        getHolder().addCallback(this.mSHCallback);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        if (this.mScaleMode != 3) {
            super.onMeasure(i2, i3);
            return;
        }
        int defaultSize = View.getDefaultSize(this.mVideoWidth, i2);
        int defaultSize2 = View.getDefaultSize(this.mVideoHeight, i3);
        if (this.mVideoWidth > 0 && this.mVideoHeight > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size2 = View.MeasureSpec.getSize(i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i5 = this.mVideoWidth;
                int i6 = i5 * size2;
                int i7 = this.mVideoHeight;
                if (i6 < size * i7) {
                    defaultSize = (i5 * size2) / i7;
                    defaultSize2 = size2;
                } else {
                    if (i5 * size2 > size * i7) {
                        defaultSize2 = (i7 * size) / i5;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                }
            } else if (mode == 1073741824) {
                int i8 = (this.mVideoHeight * size) / this.mVideoWidth;
                if (mode2 != Integer.MIN_VALUE || i8 <= size2) {
                    defaultSize2 = i8;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i4 = (this.mVideoWidth * size2) / this.mVideoHeight;
                    if (mode == Integer.MIN_VALUE && i4 > size) {
                        defaultSize = size;
                    }
                    defaultSize2 = size2;
                } else {
                    int i9 = this.mVideoWidth;
                    int i10 = this.mVideoHeight;
                    if (mode2 != Integer.MIN_VALUE || i10 <= size2) {
                        i4 = i9;
                        size2 = i10;
                    } else {
                        i4 = (size2 * i9) / i10;
                    }
                    if (mode == Integer.MIN_VALUE && i4 > size) {
                        defaultSize2 = (i10 * size) / i9;
                        defaultSize = size;
                    }
                }
                defaultSize = i4;
                defaultSize2 = size2;
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    @Override // com.miui.maml.elements.video.BaseVideoView
    protected void onSurfaceCreated(SurfaceHolder surfaceHolder) {
        this.mSurface = surfaceHolder.getSurface();
    }

    @Override // com.miui.maml.elements.video.BaseVideoView
    protected void onSurfaceDestroyed() {
        this.mSurface = null;
    }

    @Override // com.miui.maml.elements.video.BaseVideoView
    protected void setFormat(int i2) {
        getHolder().setFormat(i2);
    }

    @Override // com.miui.maml.elements.video.BaseVideoView
    protected void updateVideoSize() {
        requestLayout();
    }
}
