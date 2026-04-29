package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.data.InterfaceC3000q;
import com.bumptech.glide.load.model.kja0;
import com.bumptech.glide.signature.C3197n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import zy.lvui;

/* JADX INFO: compiled from: FileLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8<Data> implements kja0<File, Data> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f62830toq = "FileLoader";

    /* JADX INFO: renamed from: k */
    private final InterfaceC3054q<Data> f18555k;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.f7l8$k */
    /* JADX INFO: compiled from: FileLoader.java */
    public static class C3052k<Data> implements InterfaceC3059h<File, Data> {

        /* JADX INFO: renamed from: k */
        private final InterfaceC3054q<Data> f18556k;

        public C3052k(InterfaceC3054q<Data> interfaceC3054q) {
            this.f18556k = interfaceC3054q;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public final kja0<File, Data> mo10618n(@lvui t8r t8rVar) {
            return new f7l8(this.f18556k);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public final void mo10619q() {
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.f7l8$n */
    /* JADX INFO: compiled from: FileLoader.java */
    public static class C3053n extends C3052k<InputStream> {

        /* JADX INFO: renamed from: com.bumptech.glide.load.model.f7l8$n$k */
        /* JADX INFO: compiled from: FileLoader.java */
        class k implements InterfaceC3054q<InputStream> {
            k() {
            }

            @Override // com.bumptech.glide.load.model.f7l8.InterfaceC3054q
            /* JADX INFO: renamed from: k */
            public Class<InputStream> mo10854k() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.f7l8.InterfaceC3054q
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public InputStream zy(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }

            @Override // com.bumptech.glide.load.model.f7l8.InterfaceC3054q
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public void toq(InputStream inputStream) throws IOException {
                inputStream.close();
            }
        }

        public C3053n() {
            super(new k());
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.f7l8$q */
    /* JADX INFO: compiled from: FileLoader.java */
    public interface InterfaceC3054q<Data> {
        /* JADX INFO: renamed from: k */
        Class<Data> mo10854k();

        void toq(Data data) throws IOException;

        Data zy(File file) throws FileNotFoundException;
    }

    /* JADX INFO: compiled from: FileLoader.java */
    public static class toq extends C3052k<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: com.bumptech.glide.load.model.f7l8$toq$k */
        /* JADX INFO: compiled from: FileLoader.java */
        class C3055k implements InterfaceC3054q<ParcelFileDescriptor> {
            C3055k() {
            }

            @Override // com.bumptech.glide.load.model.f7l8.InterfaceC3054q
            /* JADX INFO: renamed from: k */
            public Class<ParcelFileDescriptor> mo10854k() {
                return ParcelFileDescriptor.class;
            }

            @Override // com.bumptech.glide.load.model.f7l8.InterfaceC3054q
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor zy(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // com.bumptech.glide.load.model.f7l8.InterfaceC3054q
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public void toq(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }
        }

        public toq() {
            super(new C3055k());
        }
    }

    /* JADX INFO: compiled from: FileLoader.java */
    private static final class zy<Data> implements InterfaceC3000q<Data> {

        /* JADX INFO: renamed from: k */
        private final File f18557k;

        /* JADX INFO: renamed from: n */
        private Data f18558n;

        /* JADX INFO: renamed from: q */
        private final InterfaceC3054q<Data> f18559q;

        zy(File file, InterfaceC3054q<Data> interfaceC3054q) {
            this.f18557k = file;
            this.f18559q = interfaceC3054q;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        public void cancel() {
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        /* JADX INFO: renamed from: g */
        public void mo10647g(@lvui EnumC3159p enumC3159p, @lvui InterfaceC3000q.k<? super Data> kVar) {
            try {
                Data dataZy = this.f18559q.zy(this.f18557k);
                this.f18558n = dataZy;
                kVar.mo10657q(dataZy);
            } catch (FileNotFoundException e2) {
                if (Log.isLoggable(f7l8.f62830toq, 3)) {
                    Log.d(f7l8.f62830toq, "Failed to open file", e2);
                }
                kVar.zy(e2);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        @lvui
        /* JADX INFO: renamed from: k */
        public Class<Data> mo10634k() {
            return this.f18559q.mo10854k();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        @lvui
        /* JADX INFO: renamed from: n */
        public EnumC3050k mo10648n() {
            return EnumC3050k.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        public void toq() {
            Data data = this.f18558n;
            if (data != null) {
                try {
                    this.f18559q.toq(data);
                } catch (IOException unused) {
                }
            }
        }
    }

    public f7l8(InterfaceC3054q<Data> interfaceC3054q) {
        this.f18555k = interfaceC3054q;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10615k(@lvui File file) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public kja0.C3063k<Data> toq(@lvui File file, int i2, int i3, @lvui C3087p c3087p) {
        return new kja0.C3063k<>(new C3197n(file), new zy(file, this.f18555k));
    }
}
