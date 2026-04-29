package miuix.core.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: miuix.core.util.g */
/* JADX INFO: compiled from: GZIPCodec.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C7078g {
    protected C7078g() throws InstantiationException {
        throw new InstantiationException("Cannot instantiate utility class");
    }

    /* JADX INFO: renamed from: k */
    public static byte[] m25547k(byte[] bArr) throws Throwable {
        GZIPInputStream gZIPInputStream;
        Throwable th;
        try {
            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
            try {
                byte[] bArrCdj = f7l8.cdj(gZIPInputStream);
                f7l8.toq(gZIPInputStream);
                return bArrCdj;
            } catch (Throwable th2) {
                th = th2;
                f7l8.toq(gZIPInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            gZIPInputStream = null;
            th = th3;
        }
    }

    public static byte[] toq(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream2.write(bArr);
                f7l8.zy(gZIPOutputStream2);
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = gZIPOutputStream2;
                f7l8.zy(gZIPOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String zy() {
        return "gzip";
    }
}
