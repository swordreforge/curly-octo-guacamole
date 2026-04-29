package com.bumptech.glide.load.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.data.InterfaceC3000q;
import com.bumptech.glide.load.model.kja0;
import com.bumptech.glide.signature.C3197n;
import java.io.File;
import java.io.FileNotFoundException;
import zy.lvui;

/* JADX INFO: compiled from: MediaStoreFileLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class x2 implements kja0<Uri, File> {

    /* JADX INFO: renamed from: k */
    private final Context f18648k;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.x2$k */
    /* JADX INFO: compiled from: MediaStoreFileLoader.java */
    public static final class C3083k implements InterfaceC3059h<Uri, File> {

        /* JADX INFO: renamed from: k */
        private final Context f18649k;

        public C3083k(Context context) {
            this.f18649k = context;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<Uri, File> mo10618n(t8r t8rVar) {
            return new x2(this.f18649k);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    /* JADX INFO: compiled from: MediaStoreFileLoader.java */
    private static class toq implements InterfaceC3000q<File> {

        /* JADX INFO: renamed from: n */
        private static final String[] f18650n = {"_data"};

        /* JADX INFO: renamed from: k */
        private final Context f18651k;

        /* JADX INFO: renamed from: q */
        private final Uri f18652q;

        toq(Context context, Uri uri) {
            this.f18651k = context;
            this.f18652q = uri;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        /* JADX INFO: renamed from: g */
        public void mo10647g(@lvui EnumC3159p enumC3159p, @lvui InterfaceC3000q.k<? super File> kVar) {
            Cursor cursorQuery = this.f18651k.getContentResolver().query(this.f18652q, f18650n, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    cursorQuery.close();
                }
            }
            if (!TextUtils.isEmpty(string)) {
                kVar.mo10657q(new File(string));
                return;
            }
            kVar.zy(new FileNotFoundException("Failed to find file path for: " + this.f18652q));
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        @lvui
        /* JADX INFO: renamed from: k */
        public Class<File> mo10634k() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        @lvui
        /* JADX INFO: renamed from: n */
        public EnumC3050k mo10648n() {
            return EnumC3050k.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        public void toq() {
        }
    }

    public x2(Context context) {
        this.f18648k = context;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10615k(@lvui Uri uri) {
        return com.bumptech.glide.load.data.mediastore.toq.toq(uri);
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public kja0.C3063k<File> toq(@lvui Uri uri, int i2, int i3, @lvui C3087p c3087p) {
        return new kja0.C3063k<>(new C3197n(uri), new toq(this.f18648k, uri));
    }
}
