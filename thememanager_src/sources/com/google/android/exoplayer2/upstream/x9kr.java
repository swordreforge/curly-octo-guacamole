package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.yqrt;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: RawResourceDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class x9kr extends AbstractC3795g {

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final String f66925qrj = "rawresource";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final String f66926f7l8;

    /* JADX INFO: renamed from: g */
    private final Resources f23121g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private long f66927ld6;

    /* JADX INFO: renamed from: p */
    @zy.dd
    private InputStream f23122p;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private AssetFileDescriptor f23123s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f66928x2;

    /* JADX INFO: renamed from: y */
    @zy.dd
    private Uri f23124y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.x9kr$k */
    /* JADX INFO: compiled from: RawResourceDataSource.java */
    public static class C3825k extends C3796h {
        @Deprecated
        public C3825k(String str) {
            super(str, null, 2000);
        }

        @Deprecated
        public C3825k(Throwable th) {
            super(th, 2000);
        }

        public C3825k(@zy.dd String str, @zy.dd Throwable th, int i2) {
            super(str, th, i2);
        }
    }

    public x9kr(Context context) {
        super(false);
        this.f23121g = context.getResources();
        this.f66926f7l8 = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i2) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("rawresource:///");
        sb.append(i2);
        return Uri.parse(sb.toString());
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public void close() throws C3825k {
        this.f23124y = null;
        try {
            try {
                InputStream inputStream = this.f23122p;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f23122p = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f23123s;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f23123s = null;
                        if (this.f66928x2) {
                            this.f66928x2 = false;
                            ni7();
                        }
                    }
                } catch (IOException e2) {
                    throw new C3825k(null, e2, 2000);
                }
            } catch (IOException e3) {
                throw new C3825k(null, e3, 2000);
            }
        } catch (Throwable th) {
            this.f23122p = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f23123s;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f23123s = null;
                    if (this.f66928x2) {
                        this.f66928x2 = false;
                        ni7();
                    }
                    throw th;
                } catch (IOException e4) {
                    throw new C3825k(null, e4, 2000);
                }
            } finally {
                this.f23123s = null;
                if (this.f66928x2) {
                    this.f66928x2 = false;
                    ni7();
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    @zy.dd
    public Uri getUri() {
        return this.f23124y;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: k */
    public long mo7270k(t8r t8rVar) throws C3825k {
        int identifier;
        Uri uri = t8rVar.f23103k;
        this.f23124y = uri;
        if (TextUtils.equals(f66925qrj, uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) C3844k.f7l8(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                identifier = Integer.parseInt((String) C3844k.f7l8(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new C3825k("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new C3825k("URI must either use scheme rawresource or android.resource", null, 1004);
            }
            String strSubstring = (String) C3844k.f7l8(uri.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String host = uri.getHost();
            String strValueOf = String.valueOf(TextUtils.isEmpty(host) ? "" : String.valueOf(host).concat(":"));
            String strValueOf2 = String.valueOf(strSubstring);
            identifier = this.f23121g.getIdentifier(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf), "raw", this.f66926f7l8);
            if (identifier == 0) {
                throw new C3825k("Resource not found.", null, yqrt.ERROR_CODE_IO_FILE_NOT_FOUND);
            }
        }
        fu4(t8rVar);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f23121g.openRawResourceFd(identifier);
            this.f23123s = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                String strValueOf3 = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(strValueOf3.length() + 24);
                sb.append("Resource is compressed: ");
                sb.append(strValueOf3);
                throw new C3825k(sb.toString(), null, 2000);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f23122p = fileInputStream;
            if (length != -1) {
                try {
                    if (t8rVar.f66911f7l8 > length) {
                        throw new C3825k(null, null, 2008);
                    }
                } catch (C3825k e2) {
                    throw e2;
                } catch (IOException e3) {
                    throw new C3825k(null, e3, 2000);
                }
            }
            long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
            long jSkip = fileInputStream.skip(t8rVar.f66911f7l8 + startOffset) - startOffset;
            if (jSkip != t8rVar.f66911f7l8) {
                throw new C3825k(null, null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f66927ld6 = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f66927ld6 = size;
                    if (size < 0) {
                        throw new C3825k(null, null, 2008);
                    }
                }
            } else {
                long j2 = length - jSkip;
                this.f66927ld6 = j2;
                if (j2 < 0) {
                    throw new C3796h(2008);
                }
            }
            long jMin = t8rVar.f23108y;
            if (jMin != -1) {
                long j3 = this.f66927ld6;
                if (j3 != -1) {
                    jMin = Math.min(j3, jMin);
                }
                this.f66927ld6 = jMin;
            }
            this.f66928x2 = true;
            m13463z(t8rVar);
            long j4 = t8rVar.f23108y;
            return j4 != -1 ? j4 : this.f66927ld6;
        } catch (Resources.NotFoundException e4) {
            throw new C3825k(null, e4, yqrt.ERROR_CODE_IO_FILE_NOT_FOUND);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.x2
    public int read(byte[] bArr, int i2, int i3) throws C3825k {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f66927ld6;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new C3825k(null, e2, 2000);
            }
        }
        int i4 = ((InputStream) com.google.android.exoplayer2.util.lrht.ld6(this.f23122p)).read(bArr, i2, i3);
        if (i4 == -1) {
            if (this.f66927ld6 == -1) {
                return -1;
            }
            throw new C3825k("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j3 = this.f66927ld6;
        if (j3 != -1) {
            this.f66927ld6 = j3 - ((long) i4);
        }
        zurt(i4);
        return i4;
    }
}
