package miuix.io;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: miuix.io.k */
/* JADX INFO: compiled from: ResettableInputStream.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7184k extends InputStream {

    /* JADX INFO: renamed from: g */
    private final Uri f40510g;

    /* JADX INFO: renamed from: h */
    private final byte[] f40511h;

    /* JADX INFO: renamed from: i */
    private volatile InputStream f40512i;

    /* JADX INFO: renamed from: k */
    private final Object f40513k;

    /* JADX INFO: renamed from: n */
    private final Context f40514n;

    /* JADX INFO: renamed from: p */
    private final String f40515p;

    /* JADX INFO: renamed from: q */
    private final zy f40516q;

    /* JADX INFO: renamed from: s */
    private final AssetManager f40517s;

    /* JADX INFO: renamed from: t */
    private Throwable f40518t;

    /* JADX INFO: renamed from: y */
    private final String f40519y;

    /* JADX INFO: renamed from: z */
    private IOException f40520z;

    /* JADX INFO: renamed from: miuix.io.k$k */
    /* JADX INFO: compiled from: ResettableInputStream.java */
    class k {
        k() {
        }

        protected void finalize() throws Throwable {
            try {
                if (C7184k.this.f40518t != null) {
                    Log.e("ResettableInputStream", "InputStream is opened but never closed here", C7184k.this.f40518t);
                }
                C7184k.this.close();
            } finally {
                super.finalize();
            }
        }
    }

    /* JADX INFO: renamed from: miuix.io.k$toq */
    /* JADX INFO: compiled from: ResettableInputStream.java */
    static /* synthetic */ class toq {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f40522k;

        static {
            int[] iArr = new int[zy.values().length];
            f40522k = iArr;
            try {
                iArr[zy.Uri.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40522k[zy.File.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40522k[zy.Asset.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40522k[zy.ByteArray.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: miuix.io.k$zy */
    /* JADX INFO: compiled from: ResettableInputStream.java */
    private enum zy {
        File,
        Uri,
        Asset,
        ByteArray
    }

    public C7184k(String str) {
        this.f40513k = new k();
        this.f40516q = zy.File;
        this.f40519y = str;
        this.f40514n = null;
        this.f40510g = null;
        this.f40517s = null;
        this.f40515p = null;
        this.f40511h = null;
    }

    private void zy() throws IOException {
        IOException iOException = this.f40520z;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f40512i != null) {
            return;
        }
        synchronized (this.f40513k) {
            if (this.f40512i != null) {
                return;
            }
            int i2 = toq.f40522k[this.f40516q.ordinal()];
            if (i2 == 1) {
                this.f40512i = this.f40514n.getContentResolver().openInputStream(this.f40510g);
            } else if (i2 == 2) {
                this.f40512i = new FileInputStream(this.f40519y);
            } else if (i2 == 3) {
                this.f40512i = this.f40517s.open(this.f40515p);
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("Unkown type " + this.f40516q);
                }
                this.f40512i = new ByteArrayInputStream(this.f40511h);
            }
            this.f40518t = new Throwable();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        zy();
        return this.f40512i.available();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f40512i == null) {
            return;
        }
        synchronized (this.f40513k) {
            if (this.f40512i == null) {
                return;
            }
            try {
                this.f40512i.close();
            } finally {
                this.f40518t = null;
                this.f40512i = null;
                this.f40520z = null;
            }
        }
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        try {
            zy();
            this.f40512i.mark(i2);
        } catch (IOException e2) {
            this.f40520z = e2;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        try {
            zy();
            return this.f40512i.markSupported();
        } catch (IOException e2) {
            this.f40520z = e2;
            return super.markSupported();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        zy();
        return this.f40512i.read();
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f40512i != null) {
            if (this.f40512i instanceof FileInputStream) {
                ((FileInputStream) this.f40512i).getChannel().position(0L);
                return;
            }
            if (!(this.f40512i instanceof AssetManager.AssetInputStream) && !(this.f40512i instanceof ByteArrayInputStream)) {
                close();
            }
            this.f40512i.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j2) throws IOException {
        zy();
        return this.f40512i.skip(j2);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        zy();
        return this.f40512i.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        zy();
        return this.f40512i.read(bArr, i2, i3);
    }

    public C7184k(Context context, Uri uri) {
        this.f40513k = new k();
        if ("file".equals(uri.getScheme())) {
            this.f40516q = zy.File;
            this.f40519y = uri.getPath();
            this.f40514n = null;
            this.f40510g = null;
            this.f40517s = null;
            this.f40515p = null;
            this.f40511h = null;
            return;
        }
        this.f40516q = zy.Uri;
        this.f40514n = context;
        this.f40510g = uri;
        this.f40519y = null;
        this.f40517s = null;
        this.f40515p = null;
        this.f40511h = null;
    }

    public C7184k(AssetManager assetManager, String str) {
        this.f40513k = new k();
        this.f40516q = zy.Asset;
        this.f40517s = assetManager;
        this.f40515p = str;
        this.f40519y = null;
        this.f40514n = null;
        this.f40510g = null;
        this.f40511h = null;
    }

    public C7184k(byte[] bArr) {
        this.f40513k = new k();
        this.f40516q = zy.ByteArray;
        this.f40511h = bArr;
        this.f40519y = null;
        this.f40514n = null;
        this.f40510g = null;
        this.f40517s = null;
        this.f40515p = null;
    }
}
