package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.C3164q;
import com.bumptech.glide.gifdecoder.InterfaceC2974k;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.ld6;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import com.bumptech.glide.load.model.C3058g;
import com.bumptech.glide.load.model.C3060i;
import com.bumptech.glide.load.model.C3061k;
import com.bumptech.glide.load.model.C3065n;
import com.bumptech.glide.load.model.C3070q;
import com.bumptech.glide.load.model.C3084y;
import com.bumptech.glide.load.model.C3085z;
import com.bumptech.glide.load.model.InterfaceC3059h;
import com.bumptech.glide.load.model.f7l8;
import com.bumptech.glide.load.model.fn3e;
import com.bumptech.glide.load.model.fu4;
import com.bumptech.glide.load.model.ni7;
import com.bumptech.glide.load.model.o1t;
import com.bumptech.glide.load.model.stream.C3072g;
import com.bumptech.glide.load.model.stream.C3074n;
import com.bumptech.glide.load.model.stream.C3075q;
import com.bumptech.glide.load.model.stream.C3076s;
import com.bumptech.glide.load.model.stream.toq;
import com.bumptech.glide.load.model.toq;
import com.bumptech.glide.load.model.x2;
import com.bumptech.glide.load.model.zurt;
import com.bumptech.glide.load.resource.bitmap.C3102i;
import com.bumptech.glide.load.resource.bitmap.C3105k;
import com.bumptech.glide.load.resource.bitmap.C3110n;
import com.bumptech.glide.load.resource.bitmap.C3111p;
import com.bumptech.glide.load.resource.bitmap.C3116z;
import com.bumptech.glide.load.resource.bitmap.cdj;
import com.bumptech.glide.load.resource.bitmap.eqxt;
import com.bumptech.glide.load.resource.bitmap.fti;
import com.bumptech.glide.load.resource.bitmap.gvn7;
import com.bumptech.glide.load.resource.bitmap.mcp;
import com.bumptech.glide.load.resource.bitmap.wvg;
import com.bumptech.glide.load.resource.drawable.C3118k;
import com.bumptech.glide.load.resource.drawable.C3122y;
import com.bumptech.glide.load.resource.gif.C3126k;
import com.bumptech.glide.load.resource.gif.C3128p;
import com.bumptech.glide.load.resource.gif.C3129q;
import com.bumptech.glide.load.resource.gif.C3131y;
import com.bumptech.glide.load.resource.transcode.C3135k;
import com.bumptech.glide.load.resource.transcode.C3137q;
import com.bumptech.glide.module.AbstractC3154k;
import com.bumptech.glide.util.C3209y;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;
import p043do.C5993k;
import ukdy.C7690k;
import zy.dd;

/* JADX INFO: compiled from: RegistryFactory.java */
/* JADX INFO: loaded from: classes2.dex */
final class qrj {

    /* JADX INFO: renamed from: com.bumptech.glide.qrj$k */
    /* JADX INFO: compiled from: RegistryFactory.java */
    class C3165k implements C3209y.toq<x2> {

        /* JADX INFO: renamed from: k */
        private boolean f18940k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ AbstractC3154k f18941q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ zy f63017toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ List f63018zy;

        C3165k(zy zyVar, List list, AbstractC3154k abstractC3154k) {
            this.f63017toq = zyVar;
            this.f63018zy = list;
            this.f18941q = abstractC3154k;
        }

        @Override // com.bumptech.glide.util.C3209y.toq
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public x2 get() {
            if (this.f18940k) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            androidx.tracing.toq.zy("Glide registry");
            this.f18940k = true;
            try {
                return qrj.m11145k(this.f63017toq, this.f63018zy, this.f18941q);
            } finally {
                this.f18940k = false;
                androidx.tracing.toq.m5290g();
            }
        }
    }

    private qrj() {
    }

    /* JADX INFO: renamed from: k */
    static x2 m11145k(zy zyVar, List<com.bumptech.glide.module.zy> list, @dd AbstractC3154k abstractC3154k) {
        InterfaceC3008n interfaceC3008nM11289y = zyVar.m11289y();
        com.bumptech.glide.load.engine.bitmap_recycle.toq toqVarF7l8 = zyVar.f7l8();
        Context applicationContext = zyVar.ld6().getApplicationContext();
        C2972g c2972gF7l8 = zyVar.ld6().f7l8();
        x2 x2Var = new x2();
        toq(applicationContext, x2Var, interfaceC3008nM11289y, toqVarF7l8, c2972gF7l8);
        zy(applicationContext, zyVar, x2Var, list, abstractC3154k);
        return x2Var;
    }

    /* JADX INFO: renamed from: q */
    static C3209y.toq<x2> m11146q(zy zyVar, List<com.bumptech.glide.module.zy> list, @dd AbstractC3154k abstractC3154k) {
        return new C3165k(zyVar, list, abstractC3154k);
    }

    private static void toq(Context context, x2 x2Var, InterfaceC3008n interfaceC3008n, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar, C2972g c2972g) {
        com.bumptech.glide.load.x2 c3111p;
        com.bumptech.glide.load.x2 ftiVar;
        Object obj;
        int i2;
        x2Var.m11271i(new com.bumptech.glide.load.resource.bitmap.kja0());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 27) {
            x2Var.m11271i(new C3102i());
        }
        Resources resources = context.getResources();
        List<ImageHeaderParser> listF7l8 = x2Var.f7l8();
        C3126k c3126k = new C3126k(context, listF7l8, interfaceC3008n, toqVar);
        com.bumptech.glide.load.x2<ParcelFileDescriptor, Bitmap> x2VarQrj = eqxt.qrj(interfaceC3008n);
        cdj cdjVar = new cdj(x2Var.f7l8(), resources.getDisplayMetrics(), interfaceC3008n, toqVar);
        if (i3 < 28 || !c2972g.toq(C3164q.zy.class)) {
            c3111p = new C3111p(cdjVar);
            ftiVar = new fti(cdjVar, toqVar);
        } else {
            ftiVar = new C3116z();
            c3111p = new com.bumptech.glide.load.resource.bitmap.ld6();
        }
        if (i3 >= 28) {
            i2 = i3;
            obj = Integer.class;
            x2Var.m11273n("Animation", InputStream.class, Drawable.class, C3118k.m11016g(listF7l8, toqVar));
            x2Var.m11273n("Animation", ByteBuffer.class, Drawable.class, C3118k.m11017k(listF7l8, toqVar));
        } else {
            obj = Integer.class;
            i2 = i3;
        }
        com.bumptech.glide.load.resource.drawable.f7l8 f7l8Var = new com.bumptech.glide.load.resource.drawable.f7l8(context);
        C3110n c3110n = new C3110n(toqVar);
        C3135k c3135k = new C3135k();
        C3137q c3137q = new C3137q();
        ContentResolver contentResolver = context.getContentResolver();
        x2Var.m11272k(ByteBuffer.class, new com.bumptech.glide.load.model.zy()).m11272k(InputStream.class, new zurt(toqVar)).m11273n(x2.f63094qrj, ByteBuffer.class, Bitmap.class, c3111p).m11273n(x2.f63094qrj, InputStream.class, Bitmap.class, ftiVar);
        if (ParcelFileDescriptorRewinder.zy()) {
            x2Var.m11273n(x2.f63094qrj, ParcelFileDescriptor.class, Bitmap.class, new wvg(cdjVar));
        }
        x2Var.m11273n(x2.f63094qrj, ParcelFileDescriptor.class, Bitmap.class, x2VarQrj).m11273n(x2.f63094qrj, AssetFileDescriptor.class, Bitmap.class, eqxt.zy(interfaceC3008n)).m11275q(Bitmap.class, Bitmap.class, fu4.C3057k.m10863k()).m11273n(x2.f63094qrj, Bitmap.class, Bitmap.class, new gvn7()).toq(Bitmap.class, c3110n).m11273n(x2.f63093n7h, ByteBuffer.class, BitmapDrawable.class, new C3105k(resources, c3111p)).m11273n(x2.f63093n7h, InputStream.class, BitmapDrawable.class, new C3105k(resources, ftiVar)).m11273n(x2.f63093n7h, ParcelFileDescriptor.class, BitmapDrawable.class, new C3105k(resources, x2VarQrj)).toq(BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.toq(interfaceC3008n, c3110n)).m11273n("Animation", InputStream.class, com.bumptech.glide.load.resource.gif.zy.class, new C3128p(listF7l8, c3126k, toqVar)).m11273n("Animation", ByteBuffer.class, com.bumptech.glide.load.resource.gif.zy.class, c3126k).toq(com.bumptech.glide.load.resource.gif.zy.class, new C3129q()).m11275q(InterfaceC2974k.class, InterfaceC2974k.class, fu4.C3057k.m10863k()).m11273n(x2.f63094qrj, InterfaceC2974k.class, Bitmap.class, new C3131y(interfaceC3008n)).zy(Uri.class, Drawable.class, f7l8Var).zy(Uri.class, Bitmap.class, new mcp(f7l8Var, interfaceC3008n)).fn3e(new C5993k.k()).m11275q(File.class, ByteBuffer.class, new C3070q.toq()).m11275q(File.class, InputStream.class, new f7l8.C3053n()).zy(File.class, File.class, new C7690k()).m11275q(File.class, ParcelFileDescriptor.class, new f7l8.toq()).m11275q(File.class, File.class, fu4.C3057k.m10863k()).fn3e(new ld6.C2993k(toqVar));
        if (ParcelFileDescriptorRewinder.zy()) {
            x2Var.fn3e(new ParcelFileDescriptorRewinder.C2990k());
        }
        InterfaceC3059h<Integer, InputStream> interfaceC3059hF7l8 = C3058g.f7l8(context);
        InterfaceC3059h<Integer, AssetFileDescriptor> interfaceC3059hZy = C3058g.zy(context);
        InterfaceC3059h<Integer, Drawable> interfaceC3059hM10864n = C3058g.m10864n(context);
        Class cls = Integer.TYPE;
        Object obj2 = obj;
        x2Var.m11275q(cls, InputStream.class, interfaceC3059hF7l8).m11275q(obj2, InputStream.class, interfaceC3059hF7l8).m11275q(cls, AssetFileDescriptor.class, interfaceC3059hZy).m11275q(obj2, AssetFileDescriptor.class, interfaceC3059hZy).m11275q(cls, Drawable.class, interfaceC3059hM10864n).m11275q(obj2, Drawable.class, interfaceC3059hM10864n).m11275q(Uri.class, InputStream.class, fn3e.m10859g(context)).m11275q(Uri.class, AssetFileDescriptor.class, fn3e.m10860n(context));
        C3060i.q qVar = new C3060i.q(resources);
        C3060i.k kVar = new C3060i.k(resources);
        C3060i.zy zyVar = new C3060i.zy(resources);
        x2Var.m11275q(obj2, Uri.class, qVar).m11275q(cls, Uri.class, qVar).m11275q(obj2, AssetFileDescriptor.class, kVar).m11275q(cls, AssetFileDescriptor.class, kVar).m11275q(obj2, InputStream.class, zyVar).m11275q(cls, InputStream.class, zyVar);
        x2Var.m11275q(String.class, InputStream.class, new C3065n.zy()).m11275q(Uri.class, InputStream.class, new C3065n.zy()).m11275q(String.class, InputStream.class, new ni7.zy()).m11275q(String.class, ParcelFileDescriptor.class, new ni7.toq()).m11275q(String.class, AssetFileDescriptor.class, new ni7.C3067k()).m11275q(Uri.class, InputStream.class, new C3061k.zy(context.getAssets())).m11275q(Uri.class, AssetFileDescriptor.class, new C3061k.toq(context.getAssets())).m11275q(Uri.class, InputStream.class, new C3075q.k(context)).m11275q(Uri.class, InputStream.class, new C3074n.k(context));
        if (i2 >= 29) {
            x2Var.m11275q(Uri.class, InputStream.class, new C3072g.zy(context));
            x2Var.m11275q(Uri.class, ParcelFileDescriptor.class, new C3072g.toq(context));
        }
        x2Var.m11275q(Uri.class, InputStream.class, new C3085z.q(contentResolver)).m11275q(Uri.class, ParcelFileDescriptor.class, new C3085z.toq(contentResolver)).m11275q(Uri.class, AssetFileDescriptor.class, new C3085z.k(contentResolver)).m11275q(Uri.class, InputStream.class, new o1t.C3068k()).m11275q(URL.class, InputStream.class, new C3076s.k()).m11275q(Uri.class, File.class, new x2.C3083k(context)).m11275q(C3084y.class, InputStream.class, new toq.C3077k()).m11275q(byte[].class, ByteBuffer.class, new toq.C3081k()).m11275q(byte[].class, InputStream.class, new toq.C3082q()).m11275q(Uri.class, Uri.class, fu4.C3057k.m10863k()).m11275q(Drawable.class, Drawable.class, fu4.C3057k.m10863k()).zy(Drawable.class, Drawable.class, new C3122y()).fu4(Bitmap.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.transcode.toq(resources)).fu4(Bitmap.class, byte[].class, c3135k).fu4(Drawable.class, byte[].class, new com.bumptech.glide.load.resource.transcode.zy(interfaceC3008n, c3135k, c3137q)).fu4(com.bumptech.glide.load.resource.gif.zy.class, byte[].class, c3137q);
        com.bumptech.glide.load.x2<ByteBuffer, Bitmap> x2VarM10945q = eqxt.m10945q(interfaceC3008n);
        x2Var.zy(ByteBuffer.class, Bitmap.class, x2VarM10945q);
        x2Var.zy(ByteBuffer.class, BitmapDrawable.class, new C3105k(resources, x2VarM10945q));
    }

    private static void zy(Context context, zy zyVar, x2 x2Var, List<com.bumptech.glide.module.zy> list, @dd AbstractC3154k abstractC3154k) {
        for (com.bumptech.glide.module.zy zyVar2 : list) {
            try {
                zyVar2.toq(context, zyVar, x2Var);
            } catch (AbstractMethodError e2) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + zyVar2.getClass().getName(), e2);
            }
        }
        if (abstractC3154k != null) {
            abstractC3154k.toq(context, zyVar, x2Var);
        }
    }
}
