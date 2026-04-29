package androidx.core.util;

import android.util.Log;
import java.io.Writer;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.util.g */
/* JADX INFO: compiled from: LogWriter.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C0634g extends Writer {

    /* JADX INFO: renamed from: k */
    private final String f3880k;

    /* JADX INFO: renamed from: q */
    private StringBuilder f3881q = new StringBuilder(128);

    public C0634g(String str) {
        this.f3880k = str;
    }

    /* JADX INFO: renamed from: k */
    private void m2946k() {
        if (this.f3881q.length() > 0) {
            Log.d(this.f3880k, this.f3881q.toString());
            StringBuilder sb = this.f3881q;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m2946k();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m2946k();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                m2946k();
            } else {
                this.f3881q.append(c2);
            }
        }
    }
}
