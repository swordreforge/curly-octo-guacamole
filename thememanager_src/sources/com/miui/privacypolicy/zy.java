package com.miui.privacypolicy;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* JADX INFO: compiled from: FileUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: g */
    protected static final String f29773g = "privacy_temp_update_version";

    /* JADX INFO: renamed from: k */
    private static final String f29774k = "Privacy_FileUtils";

    /* JADX INFO: renamed from: n */
    protected static final String f29775n = "privacy_agree_error";

    /* JADX INFO: renamed from: q */
    protected static final String f29776q = "privacy_update";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72479toq = "privacypolicy";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected static final String f72480zy = "privacy_version";

    private zy() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    protected static String f7l8(Context context, String str, String str2) throws Throwable {
        FileInputStream fileInputStream;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getPath());
        String str3 = File.separator;
        sb.append(str3);
        sb.append(f72479toq);
        sb.append(str3);
        sb.append((String) str2);
        sb.append(str3);
        sb.append(str);
        String string = sb.toString();
        if (!new File(string).exists()) {
            return "";
        }
        ?? r3 = 0;
        String strM18144y = null;
        try {
            try {
                fileInputStream = new FileInputStream(string);
                try {
                    strM18144y = m18144y(fileInputStream);
                    str2 = fileInputStream;
                } catch (Exception e2) {
                    e = e2;
                    Log.e(f29774k, "readData fail!", e);
                    str2 = fileInputStream;
                }
            } catch (Throwable th) {
                th = th;
                r3 = str2;
                m18140k(r3);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            m18140k(r3);
            throw th;
        }
        m18140k(str2);
        return strM18144y;
    }

    /* JADX INFO: renamed from: g */
    protected static boolean m18139g(Context context, String str) {
        return !TextUtils.isEmpty(f7l8(context, f72480zy, str));
    }

    /* JADX INFO: renamed from: k */
    protected static void m18140k(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                Log.e(f29774k, "closeQuietly InputStream error " + e2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    protected static boolean m18141n(Context context, String str) {
        return !TextUtils.isEmpty(f7l8(context, f29775n, str));
    }

    /* JADX INFO: renamed from: q */
    protected static boolean m18142q(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getPath());
        String str3 = File.separator;
        sb.append(str3);
        sb.append(f72479toq);
        sb.append(str3);
        sb.append(str2);
        sb.append(str3);
        sb.append(str);
        File file = new File(sb.toString());
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX INFO: renamed from: s */
    protected static void m18143s(String str, Context context, String str2, String str3) throws Throwable {
        BufferedWriter bufferedWriter;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getPath());
        String str4 = File.separator;
        sb.append(str4);
        sb.append(f72479toq);
        sb.append(str4);
        sb.append((String) str3);
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                str3 = new FileOutputStream(new File(file, str2));
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(str3));
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e3) {
            e = e3;
            str3 = 0;
        } catch (Throwable th2) {
            th = th2;
            str3 = 0;
        }
        try {
            bufferedWriter.write(str);
            zy(bufferedWriter);
            str3 = str3;
        } catch (Exception e4) {
            e = e4;
            bufferedWriter2 = bufferedWriter;
            Log.e(f29774k, "saveData fail!", e);
            zy(bufferedWriter2);
            str3 = str3;
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            zy(bufferedWriter2);
            toq(str3);
            throw th;
        }
        toq(str3);
    }

    protected static void toq(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.flush();
            } catch (IOException e2) {
                Log.e(f29774k, "closeQuietly OutputStream error " + e2);
            }
            try {
                outputStream.close();
            } catch (IOException e3) {
                Log.e(f29774k, "closeQuietly OutputStream error " + e3);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private static String m18144y(FileInputStream fileInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                try {
                    int i2 = fileInputStream.read(bArr, 0, 1024);
                    if (i2 <= 0) {
                        return byteArrayOutputStream.toString();
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                } catch (Exception e2) {
                    Log.e(f29774k, "readInputStream fail!", e2);
                    toq(byteArrayOutputStream);
                    return null;
                }
            } finally {
                toq(byteArrayOutputStream);
            }
            toq(byteArrayOutputStream);
        }
    }

    protected static void zy(Writer writer) {
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException e2) {
                Log.e(f29774k, "closeQuietly Writer error " + e2);
            }
        }
    }
}
