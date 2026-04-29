package com.xiaomi.push;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class f26p {

    /* JADX INFO: renamed from: k */
    public static final String[] f32892k = {"jpg", "png", "bmp", "gif", "webp"};

    public static byte[] f7l8(InputStream inputStream) {
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

    /* JADX INFO: renamed from: g */
    public static boolean m20828g(File file) {
        try {
            if (file.isDirectory()) {
                return false;
            }
            if (file.exists()) {
                return true;
            }
            File parentFile = file.getParentFile();
            if (parentFile.exists() || parentFile.mkdirs()) {
                return file.createNewFile();
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0062: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:99), block:B:22:0x0062 */
    /* JADX INFO: renamed from: k */
    public static String m20829k(File file) throws Throwable {
        InputStreamReader inputStreamReader;
        Closeable closeable;
        StringWriter stringWriter = new StringWriter();
        Closeable closeable2 = null;
        try {
            try {
                inputStreamReader = new InputStreamReader(new BufferedInputStream(new FileInputStream(file)));
                try {
                    char[] cArr = new char[2048];
                    while (true) {
                        int i2 = inputStreamReader.read(cArr);
                        if (i2 == -1) {
                            String string = stringWriter.toString();
                            toq(inputStreamReader);
                            toq(stringWriter);
                            return string;
                        }
                        stringWriter.write(cArr, 0, i2);
                    }
                } catch (IOException e2) {
                    e = e2;
                    com.xiaomi.channel.commonutils.logger.zy.m19300t("read file :" + file.getAbsolutePath() + " failure :" + e.getMessage());
                    toq(inputStreamReader);
                    toq(stringWriter);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                toq(closeable2);
                toq(stringWriter);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            inputStreamReader = null;
        } catch (Throwable th2) {
            th = th2;
            toq(closeable2);
            toq(stringWriter);
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m20830n(ZipOutputStream zipOutputStream, File file, String str, FileFilter fileFilter) throws Throwable {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                if (file.isDirectory()) {
                    File[] fileArrListFiles = fileFilter != null ? file.listFiles(fileFilter) : file.listFiles();
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    String str3 = File.separator;
                    sb.append(str3);
                    zipOutputStream.putNextEntry(new ZipEntry(sb.toString()));
                    if (!TextUtils.isEmpty(str)) {
                        str2 = str + str3;
                    }
                    for (int i2 = 0; i2 < fileArrListFiles.length; i2++) {
                        m20830n(zipOutputStream, fileArrListFiles[i2], str2 + fileArrListFiles[i2].getName(), null);
                    }
                    File[] fileArrListFiles2 = file.listFiles(new qppo());
                    if (fileArrListFiles2 != null) {
                        for (File file2 : fileArrListFiles2) {
                            m20830n(zipOutputStream, file2, str2 + File.separator + file2.getName(), fileFilter);
                        }
                    }
                } else {
                    if (TextUtils.isEmpty(str)) {
                        zipOutputStream.putNextEntry(new ZipEntry(String.valueOf(new Date().getTime()) + ".txt"));
                    } else {
                        zipOutputStream.putNextEntry(new ZipEntry(str));
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i3 = fileInputStream2.read(bArr);
                            if (i3 == -1) {
                                break;
                            } else {
                                zipOutputStream.write(bArr, 0, i3);
                            }
                        }
                        fileInputStream = fileInputStream2;
                    } catch (IOException e2) {
                        e = e2;
                        fileInputStream = fileInputStream2;
                        com.xiaomi.channel.commonutils.logger.zy.jk("zipFiction failed with exception:" + e.toString());
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        toq(fileInputStream);
                        throw th;
                    }
                }
            } catch (IOException e3) {
                e = e3;
            }
            toq(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m20831q(File file, String str) throws Throwable {
        BufferedWriter bufferedWriter;
        if (!file.exists()) {
            com.xiaomi.channel.commonutils.logger.zy.m19300t("mkdir " + file.getAbsolutePath());
            file.getParentFile().mkdirs();
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
        }
        try {
            bufferedWriter.write(str);
            toq(bufferedWriter);
        } catch (IOException e3) {
            e = e3;
            bufferedWriter2 = bufferedWriter;
            com.xiaomi.channel.commonutils.logger.zy.m19300t("write file :" + file.getAbsolutePath() + " failure :" + e.getMessage());
            toq(bufferedWriter2);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            toq(bufferedWriter2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m20832s(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        if (file.getAbsolutePath().equals(file2.getAbsolutePath())) {
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i2 = fileInputStream2.read(bArr);
                        if (i2 < 0) {
                            fileInputStream2.close();
                            fileOutputStream.close();
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i2);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static void toq(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static byte[] m20833y(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.finish();
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception unused) {
            return bArr;
        }
    }

    public static void zy(File file, File file2) throws Throwable {
        ZipOutputStream zipOutputStream;
        ZipOutputStream zipOutputStream2 = null;
        try {
            try {
                zipOutputStream = new ZipOutputStream(new FileOutputStream(file, false));
            } catch (Throwable th) {
                th = th;
            }
            try {
                m20830n(zipOutputStream, file2, null, null);
                toq(zipOutputStream);
            } catch (FileNotFoundException unused) {
                zipOutputStream2 = zipOutputStream;
                toq(zipOutputStream2);
            } catch (IOException e2) {
                e = e2;
                zipOutputStream2 = zipOutputStream;
                com.xiaomi.channel.commonutils.logger.zy.kja0("zip file failure + " + e.getMessage());
                toq(zipOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                zipOutputStream2 = zipOutputStream;
                toq(zipOutputStream2);
                throw th;
            }
        } catch (FileNotFoundException unused2) {
        } catch (IOException e3) {
            e = e3;
        }
    }
}
