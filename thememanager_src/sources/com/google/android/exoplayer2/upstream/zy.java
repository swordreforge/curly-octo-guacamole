package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.yqrt;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: AssetDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy extends AbstractC3795g {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @zy.dd
    private Uri f66970f7l8;

    /* JADX INFO: renamed from: g */
    private final AssetManager f23153g;

    /* JADX INFO: renamed from: p */
    private boolean f23154p;

    /* JADX INFO: renamed from: s */
    private long f23155s;

    /* JADX INFO: renamed from: y */
    @zy.dd
    private InputStream f23156y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.zy$k */
    /* JADX INFO: compiled from: AssetDataSource.java */
    public static final class C3829k extends C3796h {
        @Deprecated
        public C3829k(IOException iOException) {
            super(iOException, 2000);
        }

        public C3829k(@zy.dd Throwable th, int i2) {
            super(th, i2);
        }
    }

    public zy(Context context) {
        super(false);
        this.f23153g = context.getAssets();
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public void close() throws C3829k {
        this.f66970f7l8 = null;
        try {
            try {
                InputStream inputStream = this.f23156y;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e2) {
                throw new C3829k(e2, 2000);
            }
        } finally {
            this.f23156y = null;
            if (this.f23154p) {
                this.f23154p = false;
                ni7();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    @zy.dd
    public Uri getUri() {
        return this.f66970f7l8;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: k */
    public long mo7270k(t8r t8rVar) throws C3829k {
        try {
            Uri uri = t8rVar.f23103k;
            this.f66970f7l8 = uri;
            String strSubstring = (String) C3844k.f7l8(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            fu4(t8rVar);
            InputStream inputStreamOpen = this.f23153g.open(strSubstring, 1);
            this.f23156y = inputStreamOpen;
            if (inputStreamOpen.skip(t8rVar.f66911f7l8) < t8rVar.f66911f7l8) {
                throw new C3829k(null, 2008);
            }
            long j2 = t8rVar.f23108y;
            if (j2 != -1) {
                this.f23155s = j2;
            } else {
                long jAvailable = this.f23156y.available();
                this.f23155s = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f23155s = -1L;
                }
            }
            this.f23154p = true;
            m13463z(t8rVar);
            return this.f23155s;
        } catch (C3829k e2) {
            throw e2;
        } catch (IOException e3) {
            throw new C3829k(e3, e3 instanceof FileNotFoundException ? yqrt.ERROR_CODE_IO_FILE_NOT_FOUND : 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.x2
    public int read(byte[] bArr, int i2, int i3) throws C3829k {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f23155s;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new C3829k(e2, 2000);
            }
        }
        int i4 = ((InputStream) com.google.android.exoplayer2.util.lrht.ld6(this.f23156y)).read(bArr, i2, i3);
        if (i4 == -1) {
            return -1;
        }
        long j3 = this.f23155s;
        if (j3 != -1) {
            this.f23155s = j3 - ((long) i4);
        }
        zurt(i4);
        return i4;
    }
}
