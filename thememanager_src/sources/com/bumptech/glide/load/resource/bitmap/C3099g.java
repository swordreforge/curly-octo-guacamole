package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.engine.bitmap_recycle.C3003g;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import com.bumptech.glide.load.resource.C3133k;
import com.miui.maml.folme.AnimatedProperty;
import java.io.IOException;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.g */
/* JADX INFO: compiled from: BitmapImageDecoderResourceDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(api = 28)
public final class C3099g implements com.bumptech.glide.load.x2<ImageDecoder.Source, Bitmap> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f62892toq = "BitmapImageDecoder";

    /* JADX INFO: renamed from: k */
    private final InterfaceC3008n f18696k = new C3003g();

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10948k(@lvui ImageDecoder.Source source, @lvui C3087p c3087p) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.zurt<Bitmap> toq(@lvui ImageDecoder.Source source, int i2, int i3, @lvui C3087p c3087p) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C3133k(i2, i3, c3087p));
        if (Log.isLoggable(f62892toq, 2)) {
            Log.v(f62892toq, "Decoded [" + bitmapDecodeBitmap.getWidth() + AnimatedProperty.PROPERTY_NAME_X + bitmapDecodeBitmap.getHeight() + "] for [" + i2 + AnimatedProperty.PROPERTY_NAME_X + i3 + "]");
        }
        return new f7l8(bitmapDecodeBitmap, this.f18696k);
    }
}
