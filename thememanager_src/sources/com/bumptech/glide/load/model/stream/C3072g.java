package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.data.InterfaceC3000q;
import com.bumptech.glide.load.model.InterfaceC3059h;
import com.bumptech.glide.load.model.kja0;
import com.bumptech.glide.load.model.t8r;
import com.bumptech.glide.signature.C3197n;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.model.stream.g */
/* JADX INFO: compiled from: QMediaStoreUriLoader.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(29)
public final class C3072g<DataT> implements kja0<Uri, DataT> {

    /* JADX INFO: renamed from: k */
    private final Context f18616k;

    /* JADX INFO: renamed from: q */
    private final Class<DataT> f18617q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final kja0<File, DataT> f62851toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final kja0<Uri, DataT> f62852zy;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.stream.g$k */
    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    private static abstract class k<DataT> implements InterfaceC3059h<Uri, DataT> {

        /* JADX INFO: renamed from: k */
        private final Context f18618k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Class<DataT> f62853toq;

        k(Context context, Class<DataT> cls) {
            this.f18618k = context;
            this.f62853toq = cls;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public final kja0<Uri, DataT> mo10618n(@lvui t8r t8rVar) {
            return new C3072g(this.f18618k, t8rVar.m10912q(File.class, this.f62853toq), t8rVar.m10912q(Uri.class, this.f62853toq), this.f62853toq);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public final void mo10619q() {
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.stream.g$q */
    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    private static final class q<DataT> implements InterfaceC3000q<DataT> {

        /* JADX INFO: renamed from: t */
        private static final String[] f18619t = {"_data"};

        /* JADX INFO: renamed from: g */
        private final Uri f18620g;

        /* JADX INFO: renamed from: h */
        private final Class<DataT> f18621h;

        /* JADX INFO: renamed from: i */
        private volatile boolean f18622i;

        /* JADX INFO: renamed from: k */
        private final Context f18623k;

        /* JADX INFO: renamed from: n */
        private final kja0<Uri, DataT> f18624n;

        /* JADX INFO: renamed from: p */
        private final C3087p f18625p;

        /* JADX INFO: renamed from: q */
        private final kja0<File, DataT> f18626q;

        /* JADX INFO: renamed from: s */
        private final int f18627s;

        /* JADX INFO: renamed from: y */
        private final int f18628y;

        /* JADX INFO: renamed from: z */
        @dd
        private volatile InterfaceC3000q<DataT> f18629z;

        q(Context context, kja0<File, DataT> kja0Var, kja0<Uri, DataT> kja0Var2, Uri uri, int i2, int i3, C3087p c3087p, Class<DataT> cls) {
            this.f18623k = context.getApplicationContext();
            this.f18626q = kja0Var;
            this.f18624n = kja0Var2;
            this.f18620g = uri;
            this.f18628y = i2;
            this.f18627s = i3;
            this.f18625p = c3087p;
            this.f18621h = cls;
        }

        private boolean f7l8() {
            return this.f18623k.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        @dd
        /* JADX INFO: renamed from: q */
        private InterfaceC3000q<DataT> m10896q() throws FileNotFoundException {
            kja0.C3063k<DataT> c3063kZy = zy();
            if (c3063kZy != null) {
                return c3063kZy.f62840zy;
            }
            return null;
        }

        @lvui
        /* JADX INFO: renamed from: y */
        private File m10897y(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f18623k.getContentResolver().query(uri, f18619t, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @dd
        private kja0.C3063k<DataT> zy() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.f18626q.toq(m10897y(this.f18620g), this.f18628y, this.f18627s, this.f18625p);
            }
            return this.f18624n.toq(f7l8() ? MediaStore.setRequireOriginal(this.f18620g) : this.f18620g, this.f18628y, this.f18627s, this.f18625p);
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        public void cancel() {
            this.f18622i = true;
            InterfaceC3000q<DataT> interfaceC3000q = this.f18629z;
            if (interfaceC3000q != null) {
                interfaceC3000q.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        /* JADX INFO: renamed from: g */
        public void mo10647g(@lvui EnumC3159p enumC3159p, @lvui InterfaceC3000q.k<? super DataT> kVar) {
            try {
                InterfaceC3000q<DataT> interfaceC3000qM10896q = m10896q();
                if (interfaceC3000qM10896q == null) {
                    kVar.zy(new IllegalArgumentException("Failed to build fetcher for: " + this.f18620g));
                    return;
                }
                this.f18629z = interfaceC3000qM10896q;
                if (this.f18622i) {
                    cancel();
                } else {
                    interfaceC3000qM10896q.mo10647g(enumC3159p, kVar);
                }
            } catch (FileNotFoundException e2) {
                kVar.zy(e2);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        @lvui
        /* JADX INFO: renamed from: k */
        public Class<DataT> mo10634k() {
            return this.f18621h;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        @lvui
        /* JADX INFO: renamed from: n */
        public EnumC3050k mo10648n() {
            return EnumC3050k.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        public void toq() {
            InterfaceC3000q<DataT> interfaceC3000q = this.f18629z;
            if (interfaceC3000q != null) {
                interfaceC3000q.toq();
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.stream.g$toq */
    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    @hyr(29)
    public static final class toq extends k<ParcelFileDescriptor> {
        public toq(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.stream.g$zy */
    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    @hyr(29)
    public static final class zy extends k<InputStream> {
        public zy(Context context) {
            super(context, InputStream.class);
        }
    }

    C3072g(Context context, kja0<File, DataT> kja0Var, kja0<Uri, DataT> kja0Var2, Class<DataT> cls) {
        this.f18616k = context.getApplicationContext();
        this.f62851toq = kja0Var;
        this.f62852zy = kja0Var2;
        this.f18617q = cls;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10615k(@lvui Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && com.bumptech.glide.load.data.mediastore.toq.toq(uri);
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public kja0.C3063k<DataT> toq(@lvui Uri uri, int i2, int i3, @lvui C3087p c3087p) {
        return new kja0.C3063k<>(new C3197n(uri), new q(this.f18616k, this.f62851toq, this.f62852zy, uri, i2, i3, c3087p, this.f18617q));
    }
}
