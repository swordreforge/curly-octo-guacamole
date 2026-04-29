package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: compiled from: LogWriter.java */
/* JADX INFO: loaded from: classes.dex */
final class gvn7 extends Writer {

    /* JADX INFO: renamed from: k */
    private final String f4789k;

    /* JADX INFO: renamed from: q */
    private StringBuilder f4790q = new StringBuilder(128);

    gvn7(String str) {
        this.f4789k = str;
    }

    /* JADX INFO: renamed from: k */
    private void m4278k() {
        if (this.f4790q.length() > 0) {
            Log.d(this.f4789k, this.f4790q.toString());
            StringBuilder sb = this.f4790q;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m4278k();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m4278k();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                m4278k();
            } else {
                this.f4790q.append(c2);
            }
        }
    }
}
