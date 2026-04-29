package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.gifdecoder.C2973g;
import com.bumptech.glide.gifdecoder.C2976q;
import com.bumptech.glide.gifdecoder.InterfaceC2974k;
import com.bumptech.glide.load.C3049g;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import com.bumptech.glide.load.x2;
import com.bumptech.glide.util.C3208s;
import com.bumptech.glide.util.kja0;
import com.miui.maml.folme.AnimatedProperty;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.gif.k */
/* JADX INFO: compiled from: ByteBufferGifDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3126k implements x2<ByteBuffer, zy> {

    /* JADX INFO: renamed from: g */
    private static final String f18797g = "BufferGifDecoder";

    /* JADX INFO: renamed from: k */
    private final Context f18799k;

    /* JADX INFO: renamed from: n */
    private final com.bumptech.glide.load.resource.gif.toq f18800n;

    /* JADX INFO: renamed from: q */
    private final k f18801q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final List<ImageHeaderParser> f62961toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final toq f62962zy;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final k f62960f7l8 = new k();

    /* JADX INFO: renamed from: y */
    private static final toq f18798y = new toq();

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.gif.k$k */
    /* JADX INFO: compiled from: ByteBufferGifDecoder.java */
    @yz
    static class k {
        k() {
        }

        /* JADX INFO: renamed from: k */
        InterfaceC2974k m11051k(InterfaceC2974k.k kVar, com.bumptech.glide.gifdecoder.zy zyVar, ByteBuffer byteBuffer, int i2) {
            return new C2973g(kVar, zyVar, byteBuffer, i2);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.gif.k$toq */
    /* JADX INFO: compiled from: ByteBufferGifDecoder.java */
    @yz
    static class toq {

        /* JADX INFO: renamed from: k */
        private final Queue<C2976q> f18802k = kja0.m11225g(0);

        toq() {
        }

        /* JADX INFO: renamed from: k */
        synchronized C2976q m11052k(ByteBuffer byteBuffer) {
            C2976q c2976qPoll;
            c2976qPoll = this.f18802k.poll();
            if (c2976qPoll == null) {
                c2976qPoll = new C2976q();
            }
            return c2976qPoll.cdj(byteBuffer);
        }

        synchronized void toq(C2976q c2976q) {
            c2976q.m10605k();
            this.f18802k.offer(c2976q);
        }
    }

    public C3126k(Context context) {
        this(context, com.bumptech.glide.zy.m11283n(context).n7h().f7l8(), com.bumptech.glide.zy.m11283n(context).m11289y(), com.bumptech.glide.zy.m11283n(context).f7l8());
    }

    /* JADX INFO: renamed from: n */
    private static int m11048n(com.bumptech.glide.gifdecoder.zy zyVar, int i2, int i3) {
        int iMin = Math.min(zyVar.m10607k() / i3, zyVar.m10608q() / i2);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable(f18797g, 2) && iMax > 1) {
            Log.v(f18797g, "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i2 + AnimatedProperty.PROPERTY_NAME_X + i3 + "], actual dimens: [" + zyVar.m10608q() + AnimatedProperty.PROPERTY_NAME_X + zyVar.m10607k() + "]");
        }
        return iMax;
    }

    @dd
    private C3127n zy(ByteBuffer byteBuffer, int i2, int i3, C2976q c2976q, C3087p c3087p) {
        long qVar = C3208s.toq();
        try {
            com.bumptech.glide.gifdecoder.zy zyVarM10606q = c2976q.m10606q();
            if (zyVarM10606q.toq() > 0 && zyVarM10606q.zy() == 0) {
                Bitmap.Config config = c3087p.zy(C3130s.f18806k) == com.bumptech.glide.load.toq.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                InterfaceC2974k interfaceC2974kM11051k = this.f18801q.m11051k(this.f18800n, zyVarM10606q, byteBuffer, m11048n(zyVarM10606q, i2, i3));
                interfaceC2974kM11051k.mo10586g(config);
                interfaceC2974kM11051k.mo10591q();
                Bitmap bitmapZy = interfaceC2974kM11051k.zy();
                if (bitmapZy == null) {
                    return null;
                }
                C3127n c3127n = new C3127n(new zy(this.f18799k, interfaceC2974kM11051k, com.bumptech.glide.load.resource.zy.zy(), i2, i3, bitmapZy));
                if (Log.isLoggable(f18797g, 2)) {
                    Log.v(f18797g, "Decoded GIF from stream in " + C3208s.m11263k(qVar));
                }
                return c3127n;
            }
            if (Log.isLoggable(f18797g, 2)) {
                Log.v(f18797g, "Decoded GIF from stream in " + C3208s.m11263k(qVar));
            }
            return null;
        } finally {
            if (Log.isLoggable(f18797g, 2)) {
                Log.v(f18797g, "Decoded GIF from stream in " + C3208s.m11263k(qVar));
            }
        }
    }

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean mo10948k(@lvui ByteBuffer byteBuffer, @lvui C3087p c3087p) throws IOException {
        return !((Boolean) c3087p.zy(C3130s.f62965toq)).booleanValue() && C3049g.f7l8(this.f62961toq, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C3127n toq(@lvui ByteBuffer byteBuffer, int i2, int i3, @lvui C3087p c3087p) {
        C2976q c2976qM11052k = this.f62962zy.m11052k(byteBuffer);
        try {
            return zy(byteBuffer, i2, i3, c2976qM11052k, c3087p);
        } finally {
            this.f62962zy.toq(c2976qM11052k);
        }
    }

    public C3126k(Context context, List<ImageHeaderParser> list, InterfaceC3008n interfaceC3008n, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
        this(context, list, interfaceC3008n, toqVar, f18798y, f62960f7l8);
    }

    @yz
    C3126k(Context context, List<ImageHeaderParser> list, InterfaceC3008n interfaceC3008n, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar, toq toqVar2, k kVar) {
        this.f18799k = context.getApplicationContext();
        this.f62961toq = list;
        this.f18801q = kVar;
        this.f18800n = new com.bumptech.glide.load.resource.gif.toq(interfaceC3008n, toqVar);
        this.f62962zy = toqVar2;
    }
}
