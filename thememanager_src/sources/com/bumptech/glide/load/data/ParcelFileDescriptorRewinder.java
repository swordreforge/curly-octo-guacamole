package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.InterfaceC2998n;
import java.io.IOException;
import zy.hyr;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public final class ParcelFileDescriptorRewinder implements InterfaceC2998n<ParcelFileDescriptor> {

    /* JADX INFO: renamed from: k */
    private final InternalRewinder f18204k;

    @hyr(21)
    private static final class InternalRewinder {

        /* JADX INFO: renamed from: k */
        private final ParcelFileDescriptor f18205k;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f18205k = parcelFileDescriptor;
        }

        ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f18205k.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f18205k;
            } catch (ErrnoException e2) {
                throw new IOException(e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$k */
    @hyr(21)
    public static final class C2990k implements InterfaceC2998n.k<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.InterfaceC2998n.k
        @lvui
        /* JADX INFO: renamed from: k */
        public Class<ParcelFileDescriptor> mo10632k() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2998n.k
        @lvui
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public InterfaceC2998n<ParcelFileDescriptor> toq(@lvui ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    @hyr(21)
    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f18204k = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean zy() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2998n
    @hyr(21)
    @lvui
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo10630k() throws IOException {
        return this.f18204k.rewind();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2998n
    public void toq() {
    }
}
