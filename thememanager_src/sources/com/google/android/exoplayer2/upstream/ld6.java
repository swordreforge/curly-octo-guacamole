package com.google.android.exoplayer2.upstream;

import android.annotation.NonNull;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.yqrt;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import zy.InterfaceC7830i;

/* JADX INFO: compiled from: ContentDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ld6 extends AbstractC3795g {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @zy.dd
    private Uri f66866f7l8;

    /* JADX INFO: renamed from: g */
    private final ContentResolver f23032g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f66867ld6;

    /* JADX INFO: renamed from: p */
    private long f23033p;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private FileInputStream f23034s;

    /* JADX INFO: renamed from: y */
    @zy.dd
    private AssetFileDescriptor f23035y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.ld6$k */
    /* JADX INFO: compiled from: ContentDataSource.java */
    @zy.hyr(31)
    private static final class C3806k {
        private C3806k() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.media.ApplicationMediaCapabilities$Builder] */
        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        public static void m13485k(Bundle bundle) {
            bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", new Object() { // from class: android.media.ApplicationMediaCapabilities$Builder
                static {
                    throw new NoClassDefFoundError();
                }

                @NonNull
                public native /* synthetic */ ApplicationMediaCapabilities$Builder addSupportedHdrType(@NonNull String str);

                @NonNull
                public native /* synthetic */ ApplicationMediaCapabilities$Builder addSupportedVideoMimeType(@NonNull String str);

                @NonNull
                public native /* synthetic */ ApplicationMediaCapabilities build();
            }.addSupportedVideoMimeType(com.google.android.exoplayer2.util.wvg.f67117ld6).addSupportedHdrType("android.media.feature.hdr.dolby_vision").addSupportedHdrType("android.media.feature.hdr.hdr10").addSupportedHdrType("android.media.feature.hdr.hdr10_plus").addSupportedHdrType("android.media.feature.hdr.hlg").build());
        }
    }

    /* JADX INFO: compiled from: ContentDataSource.java */
    public static class toq extends C3796h {
        @Deprecated
        public toq(IOException iOException) {
            this(iOException, 2000);
        }

        public toq(@zy.dd IOException iOException, int i2) {
            super(iOException, i2);
        }
    }

    public ld6(Context context) {
        super(false);
        this.f23032g = context.getContentResolver();
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public void close() throws toq {
        this.f66866f7l8 = null;
        try {
            try {
                FileInputStream fileInputStream = this.f23034s;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f23034s = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f23035y;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f23035y = null;
                        if (this.f66867ld6) {
                            this.f66867ld6 = false;
                            ni7();
                        }
                    }
                } catch (IOException e2) {
                    throw new toq(e2, 2000);
                }
            } catch (IOException e3) {
                throw new toq(e3, 2000);
            }
        } catch (Throwable th) {
            this.f23034s = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f23035y;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f23035y = null;
                    if (this.f66867ld6) {
                        this.f66867ld6 = false;
                        ni7();
                    }
                    throw th;
                } catch (IOException e4) {
                    throw new toq(e4, 2000);
                }
            } finally {
                this.f23035y = null;
                if (this.f66867ld6) {
                    this.f66867ld6 = false;
                    ni7();
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    @zy.dd
    public Uri getUri() {
        return this.f66866f7l8;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: k */
    public long mo7270k(t8r t8rVar) throws toq {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uri = t8rVar.f23103k;
            this.f66866f7l8 = uri;
            fu4(t8rVar);
            if ("content".equals(t8rVar.f23103k.getScheme())) {
                Bundle bundle = new Bundle();
                if (com.google.android.exoplayer2.util.lrht.f23230k >= 31) {
                    C3806k.m13485k(bundle);
                }
                assetFileDescriptorOpenAssetFileDescriptor = this.f23032g.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f23032g.openAssetFileDescriptor(uri, "r");
            }
            this.f23035y = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                String strValueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
                sb.append("Could not open file descriptor for: ");
                sb.append(strValueOf);
                throw new toq(new IOException(sb.toString()), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f23034s = fileInputStream;
            if (length != -1 && t8rVar.f66911f7l8 > length) {
                throw new toq(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(t8rVar.f66911f7l8 + startOffset) - startOffset;
            if (jSkip != t8rVar.f66911f7l8) {
                throw new toq(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f23033p = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f23033p = jPosition;
                    if (jPosition < 0) {
                        throw new toq(null, 2008);
                    }
                }
            } else {
                long j2 = length - jSkip;
                this.f23033p = j2;
                if (j2 < 0) {
                    throw new toq(null, 2008);
                }
            }
            long jMin = t8rVar.f23108y;
            if (jMin != -1) {
                long j3 = this.f23033p;
                if (j3 != -1) {
                    jMin = Math.min(j3, jMin);
                }
                this.f23033p = jMin;
            }
            this.f66867ld6 = true;
            m13463z(t8rVar);
            long j4 = t8rVar.f23108y;
            return j4 != -1 ? j4 : this.f23033p;
        } catch (toq e2) {
            throw e2;
        } catch (IOException e3) {
            throw new toq(e3, e3 instanceof FileNotFoundException ? yqrt.ERROR_CODE_IO_FILE_NOT_FOUND : 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.x2
    public int read(byte[] bArr, int i2, int i3) throws toq {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f23033p;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new toq(e2, 2000);
            }
        }
        int i4 = ((FileInputStream) com.google.android.exoplayer2.util.lrht.ld6(this.f23034s)).read(bArr, i2, i3);
        if (i4 == -1) {
            return -1;
        }
        long j3 = this.f23033p;
        if (j3 != -1) {
            this.f23033p = j3 - ((long) i4);
        }
        zurt(i4);
        return i4;
    }
}
