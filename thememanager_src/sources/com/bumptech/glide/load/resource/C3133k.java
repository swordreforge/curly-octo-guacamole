package com.bumptech.glide.load.resource;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.C3138s;
import com.bumptech.glide.load.ld6;
import com.bumptech.glide.load.resource.bitmap.AbstractC3101h;
import com.bumptech.glide.load.resource.bitmap.cdj;
import com.bumptech.glide.load.resource.bitmap.ni7;
import com.miui.maml.folme.AnimatedProperty;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.k */
/* JADX INFO: compiled from: DefaultOnHeaderDecodedListener.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(api = 28)
public final class C3133k implements ImageDecoder.OnHeaderDecodedListener {

    /* JADX INFO: renamed from: y */
    private static final String f18824y = "ImageDecoder";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final ld6 f62967f7l8;

    /* JADX INFO: renamed from: g */
    private final boolean f18825g;

    /* JADX INFO: renamed from: k */
    private final ni7 f18826k = ni7.m10992q();

    /* JADX INFO: renamed from: n */
    private final AbstractC3101h f18827n;

    /* JADX INFO: renamed from: q */
    private final com.bumptech.glide.load.toq f18828q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f62968toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f62969zy;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.k$k */
    /* JADX INFO: compiled from: DefaultOnHeaderDecodedListener.java */
    class k implements ImageDecoder.OnPartialImageListener {
        k() {
        }

        public boolean onPartialImage(@lvui ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public C3133k(int i2, int i3, @lvui C3087p c3087p) {
        this.f62968toq = i2;
        this.f62969zy = i3;
        this.f18828q = (com.bumptech.glide.load.toq) c3087p.zy(cdj.f62867f7l8);
        this.f18827n = (AbstractC3101h) c3087p.zy(AbstractC3101h.f18703y);
        C3138s<Boolean> c3138s = cdj.f62869ld6;
        this.f18825g = c3087p.zy(c3138s) != null && ((Boolean) c3087p.zy(c3138s)).booleanValue();
        this.f62967f7l8 = (ld6) c3087p.zy(cdj.f18671y);
    }

    public void onHeaderDecoded(@lvui ImageDecoder imageDecoder, @lvui ImageDecoder.ImageInfo imageInfo, @lvui ImageDecoder.Source source) {
        boolean z2 = false;
        if (this.f18826k.f7l8(this.f62968toq, this.f62969zy, this.f18825g, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f18828q == com.bumptech.glide.load.toq.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new k());
        Size size = imageInfo.getSize();
        int width = this.f62968toq;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f62969zy;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float qVar = this.f18827n.toq(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * qVar);
        int iRound2 = Math.round(size.getHeight() * qVar);
        if (Log.isLoggable(f18824y, 2)) {
            Log.v(f18824y, "Resizing from [" + size.getWidth() + AnimatedProperty.PROPERTY_NAME_X + size.getHeight() + "] to [" + iRound + AnimatedProperty.PROPERTY_NAME_X + iRound2 + "] scaleFactor: " + qVar);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        ld6 ld6Var = this.f62967f7l8;
        if (ld6Var != null) {
            if (Build.VERSION.SDK_INT < 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                return;
            }
            if (ld6Var == ld6.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                z2 = true;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(z2 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
