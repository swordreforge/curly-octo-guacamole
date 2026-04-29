package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.kja0;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.yqrt;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import zy.InterfaceC7830i;

/* JADX INFO: compiled from: FileDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a9 extends AbstractC3795g {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @zy.dd
    private Uri f66753f7l8;

    /* JADX INFO: renamed from: g */
    @zy.dd
    private RandomAccessFile f22885g;

    /* JADX INFO: renamed from: s */
    private boolean f22886s;

    /* JADX INFO: renamed from: y */
    private long f22887y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.a9$k */
    /* JADX INFO: compiled from: FileDataSource.java */
    @zy.hyr(21)
    private static final class C3770k {
        private C3770k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC7830i
        public static boolean toq(@zy.dd Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    /* JADX INFO: compiled from: FileDataSource.java */
    public static final class toq implements kja0.InterfaceC3804k {

        /* JADX INFO: renamed from: k */
        @zy.dd
        private uv6 f22888k;

        /* JADX INFO: renamed from: q */
        public toq m13361q(@zy.dd uv6 uv6Var) {
            this.f22888k = uv6Var;
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.kja0.InterfaceC3804k
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public a9 mo7265k() {
            a9 a9Var = new a9();
            uv6 uv6Var = this.f22888k;
            if (uv6Var != null) {
                a9Var.mo7271n(uv6Var);
            }
            return a9Var;
        }
    }

    /* JADX INFO: compiled from: FileDataSource.java */
    public static class zy extends C3796h {
        @Deprecated
        public zy(Exception exc) {
            super(exc, 2000);
        }

        @Deprecated
        public zy(String str, IOException iOException) {
            super(str, iOException, 2000);
        }

        public zy(Throwable th, int i2) {
            super(th, i2);
        }

        public zy(@zy.dd String str, @zy.dd Throwable th, int i2) {
            super(str, th, i2);
        }
    }

    public a9() {
        super(false);
    }

    private static RandomAccessFile o1t(Uri uri) throws zy {
        int i2 = yqrt.ERROR_CODE_IO_NO_PERMISSION;
        try {
            return new RandomAccessFile((String) C3844k.f7l8(uri.getPath()), "r");
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new zy(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
            }
            if (com.google.android.exoplayer2.util.lrht.f23230k < 21 || !C3770k.toq(e2.getCause())) {
                i2 = yqrt.ERROR_CODE_IO_FILE_NOT_FOUND;
            }
            throw new zy(e2, i2);
        } catch (SecurityException e3) {
            throw new zy(e3, yqrt.ERROR_CODE_IO_NO_PERMISSION);
        } catch (RuntimeException e4) {
            throw new zy(e4, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public void close() throws zy {
        this.f66753f7l8 = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f22885g;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e2) {
                throw new zy(e2, 2000);
            }
        } finally {
            this.f22885g = null;
            if (this.f22886s) {
                this.f22886s = false;
                ni7();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    @zy.dd
    public Uri getUri() {
        return this.f66753f7l8;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: k */
    public long mo7270k(t8r t8rVar) throws zy {
        Uri uri = t8rVar.f23103k;
        this.f66753f7l8 = uri;
        fu4(t8rVar);
        RandomAccessFile randomAccessFileO1t = o1t(uri);
        this.f22885g = randomAccessFileO1t;
        try {
            randomAccessFileO1t.seek(t8rVar.f66911f7l8);
            long length = t8rVar.f23108y;
            if (length == -1) {
                length = this.f22885g.length() - t8rVar.f66911f7l8;
            }
            this.f22887y = length;
            if (length < 0) {
                throw new zy(null, null, 2008);
            }
            this.f22886s = true;
            m13463z(t8rVar);
            return this.f22887y;
        } catch (IOException e2) {
            throw new zy(e2, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.x2
    public int read(byte[] bArr, int i2, int i3) throws zy {
        if (i3 == 0) {
            return 0;
        }
        if (this.f22887y == 0) {
            return -1;
        }
        try {
            int i4 = ((RandomAccessFile) com.google.android.exoplayer2.util.lrht.ld6(this.f22885g)).read(bArr, i2, (int) Math.min(this.f22887y, i3));
            if (i4 > 0) {
                this.f22887y -= (long) i4;
                zurt(i4);
            }
            return i4;
        } catch (IOException e2) {
            throw new zy(e2, 2000);
        }
    }
}
