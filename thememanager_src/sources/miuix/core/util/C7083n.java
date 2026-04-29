package miuix.core.util;

import android.system.ErrnoException;
import android.system.Os;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import zy.hyr;

/* JADX INFO: renamed from: miuix.core.util.n */
/* JADX INFO: compiled from: FileUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7083n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f87352f7l8 = 16;

    /* JADX INFO: renamed from: g */
    public static final int f39872g = 32;

    /* JADX INFO: renamed from: k */
    public static final int f39873k = 448;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f87353ld6 = 2;

    /* JADX INFO: renamed from: n */
    public static final int f39874n = 56;

    /* JADX INFO: renamed from: p */
    public static final int f39875p = 4;

    /* JADX INFO: renamed from: q */
    public static final int f39876q = 64;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final Pattern f87354qrj = Pattern.compile("[\\w%+,./=_-]+");

    /* JADX INFO: renamed from: s */
    public static final int f39877s = 7;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f87355toq = 256;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f87356x2 = 1;

    /* JADX INFO: renamed from: y */
    public static final int f39878y = 8;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f87357zy = 128;

    protected C7083n() throws InstantiationException {
        throw new InstantiationException("Cannot instantiate utility class");
    }

    public static long f7l8(File file) {
        long jF7l8 = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jF7l8 += f7l8(file2);
            }
        }
        return jF7l8;
    }

    /* JADX INFO: renamed from: g */
    public static String m25584g(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(File.separatorChar);
        return iLastIndexOf > -1 ? str.substring(iLastIndexOf + 1) : str;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m25585h(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return true;
        }
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m25586k(String str) {
        File file = new File(str);
        if (!file.isDirectory()) {
            return false;
        }
        try {
            return new File(file, ".nomedia").createNewFile();
        } catch (IOException unused) {
            return false;
        }
    }

    public static void kja0(String str, String str2) throws IOException {
        FileWriter fileWriter = new FileWriter(str);
        try {
            fileWriter.write(str2);
        } finally {
            fileWriter.close();
        }
    }

    public static String ld6(String str) {
        if (str.charAt(str.length() - 1) == File.separatorChar) {
            return str;
        }
        return str + File.separator;
    }

    /* JADX INFO: renamed from: n */
    public static String m25587n(String str) {
        int iLastIndexOf;
        return (str == null || str.length() == 0 || (iLastIndexOf = str.lastIndexOf(46)) <= -1) ? "" : str.substring(iLastIndexOf + 1);
    }

    public static String n7h(File file, int i2, String str) throws IOException {
        int i3;
        boolean z2;
        int i4;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (i2 > 0 || (length > 0 && i2 == 0)) {
                if (length > 0 && (i2 == 0 || length < i2)) {
                    i2 = (int) length;
                }
                byte[] bArr = new byte[i2 + 1];
                int i5 = fileInputStream.read(bArr);
                if (i5 <= 0) {
                    return "";
                }
                if (i5 <= i2) {
                    return new String(bArr, 0, i5);
                }
                if (str == null) {
                    return new String(bArr, 0, i2);
                }
                return new String(bArr, 0, i2) + str;
            }
            if (i2 >= 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[1024];
                do {
                    i3 = fileInputStream.read(bArr2);
                    if (i3 > 0) {
                        byteArrayOutputStream.write(bArr2, 0, i3);
                    }
                } while (i3 == 1024);
                return byteArrayOutputStream.toString();
            }
            byte[] bArr3 = null;
            byte[] bArr4 = null;
            boolean z3 = false;
            while (true) {
                z2 = true;
                if (bArr3 != null) {
                    z3 = true;
                }
                if (bArr3 == null) {
                    bArr3 = new byte[-i2];
                }
                i4 = fileInputStream.read(bArr3);
                if (i4 != bArr3.length) {
                    break;
                }
                byte[] bArr5 = bArr4;
                bArr4 = bArr3;
                bArr3 = bArr5;
            }
            if (bArr4 == null && i4 <= 0) {
                return "";
            }
            if (bArr4 == null) {
                return new String(bArr3, 0, i4);
            }
            if (i4 > 0) {
                System.arraycopy(bArr4, i4, bArr4, 0, bArr4.length - i4);
                System.arraycopy(bArr3, 0, bArr4, bArr4.length - i4, i4);
            } else {
                z2 = z3;
            }
            if (str != null && z2) {
                return str + new String(bArr4);
            }
            return new String(bArr4);
        } finally {
            fileInputStream.close();
        }
    }

    @hyr(api = 21)
    /* JADX INFO: renamed from: p */
    public static boolean m25588p(File file, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        if (file.exists()) {
            return file.isDirectory();
        }
        if (!m25588p(file.getParentFile(), i2, i3, i4)) {
            return false;
        }
        boolean zMkdir = file.mkdir();
        try {
            Os.chmod(file.getPath(), i2);
        } catch (ErrnoException e2) {
            e = e2;
            z2 = false;
        }
        try {
            Os.chown(file.getPath(), i3, i4);
            z3 = true;
            z2 = true;
        } catch (ErrnoException e3) {
            e = e3;
            z2 = true;
            e.printStackTrace();
            z3 = false;
        }
        return zMkdir && z2 && z3;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: q */
    public static boolean m25589q(InputStream inputStream, File file) {
        try {
            if (file.exists() && !file.delete()) {
                return false;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i2 = inputStream.read(bArr);
                    if (i2 < 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i2);
                }
                fileOutputStream.flush();
                try {
                    fileOutputStream.getFD().sync();
                } catch (IOException unused) {
                }
                fileOutputStream.close();
                return true;
            } catch (Throwable th) {
                fileOutputStream.flush();
                try {
                    fileOutputStream.getFD().sync();
                } catch (IOException unused2) {
                }
                fileOutputStream.close();
                throw th;
            }
        } catch (IOException unused3) {
            return false;
        }
    }

    public static String qrj(String str) throws IOException {
        return new String(x2(str), Charset.forName("UTF-8"));
    }

    /* JADX INFO: renamed from: s */
    public static boolean m25590s(File file) {
        return f87354qrj.matcher(file.getPath()).matches();
    }

    public static long toq(File file) throws Throwable {
        CRC32 crc32 = new CRC32();
        CheckedInputStream checkedInputStream = null;
        try {
            CheckedInputStream checkedInputStream2 = new CheckedInputStream(new FileInputStream(file), crc32);
            try {
                while (checkedInputStream2.read(new byte[128]) >= 0) {
                }
                long value = crc32.getValue();
                try {
                    checkedInputStream2.close();
                } catch (IOException unused) {
                }
                return value;
            } catch (Throwable th) {
                th = th;
                checkedInputStream = checkedInputStream2;
                if (checkedInputStream != null) {
                    try {
                        checkedInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static byte[] x2(String str) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) randomAccessFile2.length());
                byte[] bArr = new byte[8192];
                while (true) {
                    int i2 = randomAccessFile2.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    randomAccessFile2.close();
                } catch (IOException unused) {
                }
                return byteArray;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: y */
    public static String m25591y(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(File.separatorChar);
        if (iLastIndexOf < 0) {
            iLastIndexOf = -1;
        }
        int iLastIndexOf2 = str.lastIndexOf(".");
        return iLastIndexOf2 < 0 ? str.substring(iLastIndexOf + 1) : str.substring(iLastIndexOf + 1, iLastIndexOf2);
    }

    public static boolean zy(File file, File file2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                boolean zM25589q = m25589q(fileInputStream, file2);
                fileInputStream.close();
                return zM25589q;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (IOException unused) {
            return false;
        }
    }
}
