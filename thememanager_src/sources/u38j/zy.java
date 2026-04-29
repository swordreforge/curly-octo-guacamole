package u38j;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: IOUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    private static final String f44434k = "IOUtil";

    public static byte[] f7l8(InputStream inputStream, int i2) throws IOException {
        if (inputStream == null) {
            return null;
        }
        if (i2 < 1) {
            i2 = 1;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i2];
        while (true) {
            int i3 = inputStream.read(bArr);
            if (i3 == -1) {
                byteArrayOutputStream.close();
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i3);
        }
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m28061g(InputStream inputStream) {
        return f7l8(inputStream, 1024);
    }

    /* JADX INFO: renamed from: k */
    public static String m28062k(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            while (hexString.length() < 2) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m28063n(File file, String str, String str2) throws Throwable {
        ZipFile zipFile = null;
        try {
            if (str != null) {
                try {
                    if (str.endsWith("/")) {
                        Pattern patternCompile = Pattern.compile(str2);
                        ZipFile zipFile2 = new ZipFile(file);
                        try {
                            Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
                            byte[] bArr = new byte[1024];
                            while (enumerationEntries.hasMoreElements()) {
                                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                                C7683q.toq(f44434k, "ze.getName() = " + zipEntryNextElement.getName());
                                Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
                                if (matcher != null && matcher.find()) {
                                    if (zipEntryNextElement.isDirectory()) {
                                        zy(str, zipEntryNextElement.getName());
                                    } else {
                                        m28065q(str, zipEntryNextElement.getName());
                                        FileOutputStream fileOutputStream = new FileOutputStream(str + zipEntryNextElement.getName());
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile2.getInputStream(zipEntryNextElement));
                                        while (true) {
                                            int i2 = bufferedInputStream.read(bArr, 0, 1024);
                                            if (i2 == -1) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr, 0, i2);
                                        }
                                        toq(bufferedInputStream);
                                        toq(fileOutputStream);
                                    }
                                }
                            }
                            try {
                                zipFile2.close();
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            return true;
                        } catch (Exception e3) {
                            e = e3;
                            zipFile = zipFile2;
                            e.printStackTrace();
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (Exception e4) {
                                    e4.printStackTrace();
                                }
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            zipFile = zipFile2;
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (Exception e6) {
                                    e6.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Exception e7) {
                    e = e7;
                }
            }
            throw new IllegalArgumentException("folderPath must be not null and end with /");
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m28064p(InputStream inputStream, String str) throws Throwable {
        ZipInputStream zipInputStream = null;
        if (str != null) {
            try {
                if (str.endsWith("/")) {
                    byte[] bArr = new byte[1024];
                    ZipInputStream zipInputStream2 = new ZipInputStream(inputStream);
                    while (true) {
                        try {
                            ZipEntry nextEntry = zipInputStream2.getNextEntry();
                            if (nextEntry == null) {
                                break;
                            }
                            C7683q.toq(f44434k, "zip entry is " + nextEntry.getName());
                            if (nextEntry.isDirectory()) {
                                zy(str, nextEntry.getName());
                            } else {
                                m28065q(str, nextEntry.getName());
                                FileOutputStream fileOutputStream = new FileOutputStream(str + nextEntry.getName());
                                while (true) {
                                    int i2 = zipInputStream2.read(bArr, 0, 1024);
                                    if (i2 == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i2);
                                }
                                zipInputStream2.closeEntry();
                                fileOutputStream.close();
                            }
                        } catch (Exception unused) {
                            zipInputStream = zipInputStream2;
                            if (zipInputStream != null) {
                                try {
                                    zipInputStream.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            toq(inputStream);
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            zipInputStream = zipInputStream2;
                            if (zipInputStream != null) {
                                try {
                                    zipInputStream.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            toq(inputStream);
                            throw th;
                        }
                    }
                    zipInputStream2.close();
                    try {
                        zipInputStream2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    toq(inputStream);
                    return true;
                }
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw new IllegalArgumentException("folderPath must be not null and end with /");
    }

    /* JADX INFO: renamed from: q */
    private static void m28065q(String str, String str2) {
        int iLastIndexOf;
        if (str2 != null && (iLastIndexOf = str2.lastIndexOf("/")) >= 0) {
            File file = new File(str + "/" + str2.substring(0, iLastIndexOf + 1));
            if (file.isDirectory()) {
                return;
            }
            file.mkdirs();
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m28066s(File file, String str) throws Throwable {
        ZipFile zipFile = null;
        try {
            if (str != null) {
                try {
                    if (str.endsWith("/")) {
                        ZipFile zipFile2 = new ZipFile(file);
                        try {
                            Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
                            byte[] bArr = new byte[1024];
                            while (enumerationEntries.hasMoreElements()) {
                                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                                C7683q.toq(f44434k, "ze.getName() = " + zipEntryNextElement.getName());
                                if (zipEntryNextElement.isDirectory()) {
                                    zy(str, zipEntryNextElement.getName());
                                } else {
                                    m28065q(str, zipEntryNextElement.getName());
                                    FileOutputStream fileOutputStream = new FileOutputStream(str + zipEntryNextElement.getName());
                                    BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile2.getInputStream(zipEntryNextElement));
                                    while (true) {
                                        int i2 = bufferedInputStream.read(bArr, 0, 1024);
                                        if (i2 == -1) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, i2);
                                    }
                                    toq(bufferedInputStream);
                                    toq(fileOutputStream);
                                }
                            }
                            try {
                                zipFile2.close();
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            return true;
                        } catch (Exception e3) {
                            e = e3;
                            zipFile = zipFile2;
                            e.printStackTrace();
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (Exception e4) {
                                    e4.printStackTrace();
                                }
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            zipFile = zipFile2;
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (Exception e6) {
                                    e6.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Exception e7) {
                    e = e7;
                }
            }
            throw new IllegalArgumentException("folderPath must be not null and end with /");
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void toq(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static byte[] m28067y(InputStream inputStream) {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                try {
                    int i2 = inputStream.read(bArr, 0, 8192);
                    if (i2 <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    byteArray = null;
                }
                return byteArray;
            } finally {
                toq(inputStream);
                toq(byteArrayOutputStream);
            }
        }
        byteArray = byteArrayOutputStream.toByteArray();
        return byteArray;
    }

    private static void zy(String str, String str2) {
        File file = new File(str + "/" + str2);
        if (file.isDirectory()) {
            return;
        }
        file.mkdirs();
    }
}
