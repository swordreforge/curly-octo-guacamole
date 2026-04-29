package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import com.market.sdk.utils.C5019y;
import java.io.IOException;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: compiled from: ImageDecoder.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aR\u0010\f\u001a\u00020\u000b*\u00020\u00002C\b\u0004\u0010\n\u001a=\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\b\tH\u0087\b\u001aR\u0010\u000e\u001a\u00020\r*\u00020\u00002C\b\u0004\u0010\n\u001a=\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\b\tH\u0087\b¨\u0006\u000f"}, d2 = {"Landroid/graphics/ImageDecoder$Source;", "Lkotlin/Function3;", "Landroid/graphics/ImageDecoder;", "Landroid/graphics/ImageDecoder$ImageInfo;", "Lkotlin/c;", "name", C5019y.f69035jk, "source", "Lkotlin/was;", "Lkotlin/fn3e;", "action", "Landroid/graphics/Bitmap;", "k", "Landroid/graphics/drawable/Drawable;", "toq", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class ld6 {

    /* JADX INFO: renamed from: androidx.core.graphics.ld6$k */
    /* JADX INFO: compiled from: ImageDecoder.kt */
    @d3(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/graphics/ImageDecoder;", "decoder", "Landroid/graphics/ImageDecoder$ImageInfo;", C5019y.f69035jk, "Landroid/graphics/ImageDecoder$Source;", "source", "Lkotlin/was;", "onHeaderDecoded", "(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class C0537k implements ImageDecoder.OnHeaderDecodedListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.cdj f3574k;

        public C0537k(cyoe.cdj cdjVar) {
            this.f3574k = cdjVar;
        }

        public final void onHeaderDecoded(@InterfaceC7396q ImageDecoder decoder, @InterfaceC7396q ImageDecoder.ImageInfo info, @InterfaceC7396q ImageDecoder.Source source) {
            d2ok.cdj(decoder, "decoder");
            d2ok.cdj(info, "info");
            d2ok.cdj(source, "source");
            this.f3574k.invoke(decoder, info, source);
        }
    }

    /* JADX INFO: compiled from: ImageDecoder.kt */
    @d3(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/graphics/ImageDecoder;", "decoder", "Landroid/graphics/ImageDecoder$ImageInfo;", C5019y.f69035jk, "Landroid/graphics/ImageDecoder$Source;", "source", "Lkotlin/was;", "onHeaderDecoded", "(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class toq implements ImageDecoder.OnHeaderDecodedListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.cdj f3575k;

        public toq(cyoe.cdj cdjVar) {
            this.f3575k = cdjVar;
        }

        public final void onHeaderDecoded(@InterfaceC7396q ImageDecoder decoder, @InterfaceC7396q ImageDecoder.ImageInfo info, @InterfaceC7396q ImageDecoder.Source source) {
            d2ok.cdj(decoder, "decoder");
            d2ok.cdj(info, "info");
            d2ok.cdj(source, "source");
            this.f3575k.invoke(decoder, info, source);
        }
    }

    @InterfaceC7396q
    @hyr(28)
    /* JADX INFO: renamed from: k */
    public static final Bitmap m2506k(@InterfaceC7396q ImageDecoder.Source decodeBitmap, @InterfaceC7396q cyoe.cdj<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, was> action) throws IOException {
        d2ok.cdj(decodeBitmap, "$this$decodeBitmap");
        d2ok.cdj(action, "action");
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(decodeBitmap, new C0537k(action));
        d2ok.m23085y(bitmapDecodeBitmap, "ImageDecoder.decodeBitma…ction(info, source)\n    }");
        return bitmapDecodeBitmap;
    }

    @InterfaceC7396q
    @hyr(28)
    public static final Drawable toq(@InterfaceC7396q ImageDecoder.Source decodeDrawable, @InterfaceC7396q cyoe.cdj<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, was> action) throws IOException {
        d2ok.cdj(decodeDrawable, "$this$decodeDrawable");
        d2ok.cdj(action, "action");
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(decodeDrawable, new toq(action));
        d2ok.m23085y(drawableDecodeDrawable, "ImageDecoder.decodeDrawa…ction(info, source)\n    }");
        return drawableDecodeDrawable;
    }
}
