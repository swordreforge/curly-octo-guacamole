package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import android.util.Log;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import zy.InterfaceC7830i;
import zy.hyr;

/* JADX INFO: compiled from: ExifInterfaceUtils.java */
/* JADX INFO: loaded from: classes.dex */
class toq {

    /* JADX INFO: renamed from: k */
    private static final String f4643k = "ExifInterfaceUtils";

    /* JADX INFO: renamed from: androidx.exifinterface.media.toq$k */
    /* JADX INFO: compiled from: ExifInterfaceUtils.java */
    @hyr(21)
    static class C0847k {
        private C0847k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m4172k(FileDescriptor fileDescriptor) throws ErrnoException {
            Os.close(fileDescriptor);
        }

        @InterfaceC7830i
        static FileDescriptor toq(FileDescriptor fileDescriptor) throws ErrnoException {
            return Os.dup(fileDescriptor);
        }

        @InterfaceC7830i
        static long zy(FileDescriptor fileDescriptor, long j2, int i2) throws ErrnoException {
            return Os.lseek(fileDescriptor, j2, i2);
        }
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ExifInterfaceUtils.java */
    @hyr(23)
    static class C7879toq {
        private C7879toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m4173k(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    private toq() {
    }

    static long f7l8(String str) {
        try {
            int iMin = Math.min(str.length(), 3);
            long j2 = Long.parseLong(str.substring(0, iMin));
            while (iMin < 3) {
                j2 *= 10;
                iMin++;
            }
            return j2;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: g */
    static void m4167g(InputStream inputStream, OutputStream outputStream, int i2) throws IOException {
        byte[] bArr = new byte[8192];
        while (i2 > 0) {
            int iMin = Math.min(i2, 8192);
            int i3 = inputStream.read(bArr, 0, iMin);
            if (i3 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i2 -= i3;
            outputStream.write(bArr, 0, i3);
        }
    }

    /* JADX INFO: renamed from: k */
    static String m4168k(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    static int m4169n(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i2 = 0;
        while (true) {
            int i3 = inputStream.read(bArr);
            if (i3 == -1) {
                return i2;
            }
            i2 += i3;
            outputStream.write(bArr, 0, i3);
        }
    }

    /* JADX INFO: renamed from: q */
    static long[] m4170q(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    static void toq(FileDescriptor fileDescriptor) {
        try {
            C0847k.m4172k(fileDescriptor);
        } catch (Exception unused) {
            Log.e(f4643k, "Error closing fd.");
        }
    }

    /* JADX INFO: renamed from: y */
    static boolean m4171y(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    static void zy(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }
}
