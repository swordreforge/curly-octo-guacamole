package com.xiaomi.push;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import com.xiaomi.mipush.sdk.C5658n;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
class cv06 {

    /* JADX INFO: renamed from: y */
    private static String f32780y = "/MiPushLog";

    /* JADX INFO: renamed from: n */
    private int f32783n;

    /* JADX INFO: renamed from: q */
    private boolean f32784q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f73296toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f73297zy;

    /* JADX INFO: renamed from: k */
    @SuppressLint({"SimpleDateFormat"})
    private final SimpleDateFormat f32782k = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* JADX INFO: renamed from: g */
    private int f32781g = 2097152;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private ArrayList<File> f73295f7l8 = new ArrayList<>();

    cv06() {
    }

    /* JADX INFO: renamed from: g */
    private void m20699g(File file) throws Throwable {
        BufferedReader bufferedReader;
        Pattern patternCompile = Pattern.compile("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}");
        BufferedWriter bufferedWriter = null;
        bufferedReader = null;
        bufferedReader = null;
        bufferedReader = null;
        BufferedReader bufferedReader2 = null;
        bufferedWriter = null;
        bufferedWriter = null;
        bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
                try {
                    bufferedWriter2.write("model :" + Build.MODEL + "; os :" + Build.VERSION.INCREMENTAL + "; uid :" + com.xiaomi.push.service.nn86.f7l8() + "; lng :" + Locale.getDefault().toString() + "; sdk :48; andver :" + Build.VERSION.SDK_INT + "\n");
                    this.f32783n = 0;
                    Iterator<File> it = this.f73295f7l8.iterator();
                    while (it.hasNext()) {
                        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(it.next())));
                        try {
                            m20700n(bufferedReader, bufferedWriter2, patternCompile);
                            bufferedReader.close();
                            bufferedReader2 = bufferedReader;
                        } catch (FileNotFoundException e2) {
                            e = e2;
                            bufferedWriter = bufferedWriter2;
                            com.xiaomi.channel.commonutils.logger.zy.m19300t("LOG: filter error = " + e.getMessage());
                            f26p.toq(bufferedWriter);
                            f26p.toq(bufferedReader);
                            return;
                        } catch (IOException e3) {
                            e = e3;
                            bufferedWriter = bufferedWriter2;
                            com.xiaomi.channel.commonutils.logger.zy.m19300t("LOG: filter error = " + e.getMessage());
                            f26p.toq(bufferedWriter);
                            f26p.toq(bufferedReader);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bufferedWriter = bufferedWriter2;
                            f26p.toq(bufferedWriter);
                            f26p.toq(bufferedReader);
                            throw th;
                        }
                    }
                    bufferedWriter2.write(tfm.zy().zurt());
                    f26p.toq(bufferedWriter2);
                    f26p.toq(bufferedReader2);
                } catch (FileNotFoundException e4) {
                    e = e4;
                    bufferedReader = bufferedReader2;
                } catch (IOException e6) {
                    e = e6;
                    bufferedReader = bufferedReader2;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (FileNotFoundException e7) {
            e = e7;
            bufferedReader = null;
        } catch (IOException e8) {
            e = e8;
            bufferedReader = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m20700n(BufferedReader bufferedReader, BufferedWriter bufferedWriter, Pattern pattern) throws IOException {
        char[] cArr = new char[4096];
        int i2 = bufferedReader.read(cArr);
        boolean z2 = false;
        while (i2 != -1 && !z2) {
            String str = new String(cArr, 0, i2);
            Matcher matcher = pattern.matcher(str);
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= i2 || !matcher.find(i3)) {
                    break;
                }
                int iStart = matcher.start();
                String strSubstring = str.substring(iStart, this.f73296toq.length() + iStart);
                if (this.f32784q) {
                    if (strSubstring.compareTo(this.f73297zy) > 0) {
                        z2 = true;
                        i2 = iStart;
                        break;
                    }
                } else if (strSubstring.compareTo(this.f73296toq) >= 0) {
                    this.f32784q = true;
                    i4 = iStart;
                }
                int iIndexOf = str.indexOf(10, iStart);
                if (iIndexOf == -1) {
                    iIndexOf = this.f73296toq.length();
                }
                i3 = iStart + iIndexOf;
            }
            if (this.f32784q) {
                int i5 = i2 - i4;
                this.f32783n += i5;
                if (z2) {
                    bufferedWriter.write(cArr, i4, i5);
                    return;
                } else {
                    bufferedWriter.write(cArr, i4, i5);
                    if (this.f32783n > this.f32781g) {
                        return;
                    }
                }
            }
            i2 = bufferedReader.read(cArr);
        }
    }

    /* JADX INFO: renamed from: k */
    cv06 m20701k(File file) {
        if (file.exists()) {
            this.f73295f7l8.add(file);
        }
        return this;
    }

    /* JADX INFO: renamed from: q */
    void m20702q(int i2) {
        if (i2 != 0) {
            this.f32781g = i2;
        }
    }

    cv06 toq(Date date, Date date2) {
        if (date.after(date2)) {
            this.f73296toq = this.f32782k.format(date2);
            this.f73297zy = this.f32782k.format(date);
        } else {
            this.f73296toq = this.f32782k.format(date);
            this.f73297zy = this.f32782k.format(date2);
        }
        return this;
    }

    File zy(Context context, Date date, Date date2, File file) throws Throwable {
        File fileM20642k;
        if ("com.xiaomi.xmsf".equalsIgnoreCase(context.getPackageName())) {
            fileM20642k = bek6.m20642k(context);
            if (fileM20642k == null) {
                return null;
            }
            m20701k(new File(fileM20642k, "xmsf.log.1"));
            m20701k(new File(fileM20642k, "xmsf.log"));
        } else {
            File file2 = new File(context.getFilesDir() + f32780y);
            if (!ydj3.toq(file2)) {
                return null;
            }
            m20701k(new File(file2, "log0.txt"));
            m20701k(new File(file2, "log1.txt"));
            fileM20642k = file2;
        }
        if (!fileM20642k.isDirectory()) {
            return null;
        }
        File file3 = new File(file, date.getTime() + C5658n.f73185t8r + date2.getTime() + ".zip");
        if (file3.exists()) {
            return null;
        }
        toq(date, date2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file4 = new File(file, "log.txt");
        m20699g(file4);
        com.xiaomi.channel.commonutils.logger.zy.m19300t("LOG: filter cost = " + (System.currentTimeMillis() - jCurrentTimeMillis));
        if (file4.exists()) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f26p.zy(file3, file4);
            com.xiaomi.channel.commonutils.logger.zy.m19300t("LOG: zip cost = " + (System.currentTimeMillis() - jCurrentTimeMillis2));
            file4.delete();
            if (file3.exists()) {
                return file3;
            }
        }
        return null;
    }
}
