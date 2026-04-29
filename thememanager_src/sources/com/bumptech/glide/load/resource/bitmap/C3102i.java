package com.bumptech.glide.load.resource.bitmap;

import androidx.exifinterface.media.C0846k;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.util.C3201k;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.i */
/* JADX INFO: compiled from: ExifInterfaceImageHeaderParser.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(27)
public final class C3102i implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    @lvui
    /* JADX INFO: renamed from: k */
    public ImageHeaderParser.ImageType mo10628k(@lvui ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: q */
    public int mo10629q(@lvui InputStream inputStream, @lvui com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) throws IOException {
        int iX2 = new C0846k(inputStream).x2(C0846k.f51303mcp, 1);
        if (iX2 == 0) {
            return -1;
        }
        return iX2;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int toq(@lvui ByteBuffer byteBuffer, @lvui com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) throws IOException {
        return mo10629q(C3201k.f7l8(byteBuffer), toqVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @lvui
    public ImageHeaderParser.ImageType zy(@lvui InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
