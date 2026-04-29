package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import com.bumptech.glide.load.C3049g;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.zurt;
import com.bumptech.glide.load.x2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.gif.p */
/* JADX INFO: compiled from: StreamGifDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3128p implements x2<InputStream, zy> {

    /* JADX INFO: renamed from: q */
    private static final String f18803q = "StreamGifDecoder";

    /* JADX INFO: renamed from: k */
    private final List<ImageHeaderParser> f18804k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final x2<ByteBuffer, zy> f62963toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.toq f62964zy;

    public C3128p(List<ImageHeaderParser> list, x2<ByteBuffer, zy> x2Var, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
        this.f18804k = list;
        this.f62963toq = x2Var;
        this.f62964zy = toqVar;
    }

    /* JADX INFO: renamed from: n */
    private static byte[] m11053n(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        } catch (IOException e2) {
            if (!Log.isLoggable(f18803q, 5)) {
                return null;
            }
            Log.w(f18803q, "Error reading data from stream", e2);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10948k(@lvui InputStream inputStream, @lvui C3087p c3087p) throws IOException {
        return !((Boolean) c3087p.zy(C3130s.f62965toq)).booleanValue() && C3049g.m10838g(this.f18804k, inputStream, this.f62964zy) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public zurt<zy> toq(@lvui InputStream inputStream, int i2, int i3, @lvui C3087p c3087p) throws IOException {
        byte[] bArrM11053n = m11053n(inputStream);
        if (bArrM11053n == null) {
            return null;
        }
        return this.f62963toq.toq(ByteBuffer.wrap(bArrM11053n), i2, i3, c3087p);
    }
}
