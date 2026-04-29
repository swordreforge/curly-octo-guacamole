package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.data.InterfaceC3000q;
import com.bumptech.glide.load.data.f7l8;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import zy.lvui;
import zy.yz;

/* JADX INFO: compiled from: ThumbFetcher.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy implements InterfaceC3000q<InputStream> {

    /* JADX INFO: renamed from: g */
    private static final String f18221g = "MediaStoreThumbFetcher";

    /* JADX INFO: renamed from: k */
    private final Uri f18222k;

    /* JADX INFO: renamed from: n */
    private InputStream f18223n;

    /* JADX INFO: renamed from: q */
    private final C2995n f18224q;

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.mediastore.zy$k */
    /* JADX INFO: compiled from: ThumbFetcher.java */
    static class C2997k implements InterfaceC2996q {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final String[] f62701toq = {"_data"};

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final String f62702zy = "kind = 1 AND image_id = ?";

        /* JADX INFO: renamed from: k */
        private final ContentResolver f18225k;

        C2997k(ContentResolver contentResolver) {
            this.f18225k = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.InterfaceC2996q
        /* JADX INFO: renamed from: k */
        public Cursor mo10641k(Uri uri) {
            return this.f18225k.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f62701toq, f62702zy, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* JADX INFO: compiled from: ThumbFetcher.java */
    static class toq implements InterfaceC2996q {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final String[] f62703toq = {"_data"};

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final String f62704zy = "kind = 1 AND video_id = ?";

        /* JADX INFO: renamed from: k */
        private final ContentResolver f18226k;

        toq(ContentResolver contentResolver) {
            this.f18226k = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.InterfaceC2996q
        /* JADX INFO: renamed from: k */
        public Cursor mo10641k(Uri uri) {
            return this.f18226k.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f62703toq, f62704zy, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @yz
    zy(Uri uri, C2995n c2995n) {
        this.f18222k = uri;
        this.f18224q = c2995n;
    }

    public static zy f7l8(Context context, Uri uri) {
        return zy(context, uri, new toq(context.getContentResolver()));
    }

    /* JADX INFO: renamed from: q */
    public static zy m10645q(Context context, Uri uri) {
        return zy(context, uri, new C2997k(context.getContentResolver()));
    }

    /* JADX INFO: renamed from: y */
    private InputStream m10646y() throws Throwable {
        InputStream inputStreamM10640q = this.f18224q.m10640q(this.f18222k);
        int iM10639k = inputStreamM10640q != null ? this.f18224q.m10639k(this.f18222k) : -1;
        return iM10639k != -1 ? new f7l8(inputStreamM10640q, iM10639k) : inputStreamM10640q;
    }

    private static zy zy(Context context, Uri uri, InterfaceC2996q interfaceC2996q) {
        return new zy(uri, new C2995n(com.bumptech.glide.zy.m11283n(context).n7h().f7l8(), interfaceC2996q, com.bumptech.glide.zy.m11283n(context).f7l8(), context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    /* JADX INFO: renamed from: g */
    public void mo10647g(@lvui EnumC3159p enumC3159p, @lvui InterfaceC3000q.k<? super InputStream> kVar) throws Throwable {
        try {
            InputStream inputStreamM10646y = m10646y();
            this.f18223n = inputStreamM10646y;
            kVar.mo10657q(inputStreamM10646y);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable(f18221g, 3)) {
                Log.d(f18221g, "Failed to find thumbnail file", e2);
            }
            kVar.zy(e2);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    @lvui
    /* JADX INFO: renamed from: k */
    public Class<InputStream> mo10634k() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    @lvui
    /* JADX INFO: renamed from: n */
    public EnumC3050k mo10648n() {
        return EnumC3050k.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    public void toq() {
        InputStream inputStream = this.f18223n;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
