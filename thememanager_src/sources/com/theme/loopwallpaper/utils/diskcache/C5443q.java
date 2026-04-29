package com.theme.loopwallpaper.utils.diskcache;

import com.google.android.exoplayer2.C3548p;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.theme.loopwallpaper.utils.diskcache.q */
/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes3.dex */
final class C5443q {

    /* JADX INFO: renamed from: k */
    static final Charset f30386k = Charset.forName(C3548p.f65246qrj);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final Charset f72572toq = Charset.forName("UTF-8");

    private C5443q() {
    }

    /* JADX INFO: renamed from: k */
    static void m18550k(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    static void toq(File dir) throws IOException {
        File[] fileArrListFiles = dir.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + dir);
        }
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                toq(file);
            }
            if (!file.delete()) {
                throw new IOException("failed to delete file: " + file);
            }
        }
    }

    static String zy(Reader reader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int i2 = reader.read(cArr);
                if (i2 == -1) {
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, i2);
            }
        } finally {
            reader.close();
        }
    }
}
