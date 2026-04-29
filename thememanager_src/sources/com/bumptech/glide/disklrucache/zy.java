package com.bumptech.glide.disklrucache;

import com.google.android.exoplayer2.C3548p;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes2.dex */
final class zy {

    /* JADX INFO: renamed from: k */
    static final Charset f17910k = Charset.forName(C3548p.f65246qrj);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final Charset f61600toq = Charset.forName("UTF-8");

    private zy() {
    }

    /* JADX INFO: renamed from: k */
    static void m10573k(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    static void toq(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                toq(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
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
