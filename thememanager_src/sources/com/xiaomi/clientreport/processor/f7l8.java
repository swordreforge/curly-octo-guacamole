package com.xiaomi.clientreport.processor;

import android.text.TextUtils;
import com.xiaomi.clientreport.data.C5625q;
import com.xiaomi.push.f26p;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class f7l8 {
    public static void f7l8(String str, C5625q[] c5625qArr) {
        RandomAccessFile randomAccessFile;
        if (c5625qArr == null || c5625qArr.length <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        FileLock fileLockLock = null;
        try {
            File file = new File(str + ".lock");
            f26p.m20828g(file);
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (Throwable unused) {
            randomAccessFile = null;
        }
        try {
            fileLockLock = randomAccessFile.getChannel().lock();
            HashMap<String, String> mapM19339q = m19339q(str);
            for (C5625q c5625q : c5625qArr) {
                if (c5625q != null) {
                    String strZy = zy((com.xiaomi.clientreport.data.zy) c5625q);
                    long j2 = ((com.xiaomi.clientreport.data.zy) c5625q).f31279s;
                    long j3 = ((com.xiaomi.clientreport.data.zy) c5625q).f31278p;
                    if (!TextUtils.isEmpty(strZy) && j2 > 0 && j3 >= 0) {
                        m19341y(mapM19339q, strZy, j2, j3);
                    }
                }
            }
            m19335g(str, mapM19339q);
            if (fileLockLock != null && fileLockLock.isValid()) {
                try {
                    fileLockLock.release();
                } catch (IOException e2) {
                    e = e2;
                    com.xiaomi.channel.commonutils.logger.zy.t8r(e);
                }
            }
        } catch (Throwable unused2) {
            try {
                com.xiaomi.channel.commonutils.logger.zy.m19300t("failed to write perf to file ");
                if (fileLockLock != null && fileLockLock.isValid()) {
                    try {
                        fileLockLock.release();
                    } catch (IOException e3) {
                        e = e3;
                        com.xiaomi.channel.commonutils.logger.zy.t8r(e);
                    }
                }
                f26p.toq(randomAccessFile);
            } catch (Throwable th) {
                if (fileLockLock != null && fileLockLock.isValid()) {
                    try {
                        fileLockLock.release();
                    } catch (IOException e4) {
                        com.xiaomi.channel.commonutils.logger.zy.t8r(e4);
                    }
                }
                f26p.toq(randomAccessFile);
                throw th;
            }
        }
        f26p.toq(randomAccessFile);
    }

    /* JADX INFO: renamed from: g */
    private static void m19335g(String str, HashMap<String, String> map) throws Throwable {
        BufferedWriter bufferedWriter;
        Throwable th;
        Exception e2;
        if (TextUtils.isEmpty(str) || map == null || map.size() == 0) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                try {
                    for (String str2 : map.keySet()) {
                        bufferedWriter.write(str2 + "%%%" + map.get(str2));
                        bufferedWriter.newLine();
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
                }
            } catch (Throwable th2) {
                th = th2;
                f26p.toq(bufferedWriter);
                throw th;
            }
        } catch (Exception e4) {
            bufferedWriter = null;
            e2 = e4;
        } catch (Throwable th3) {
            bufferedWriter = null;
            th = th3;
            f26p.toq(bufferedWriter);
            throw th;
        }
        f26p.toq(bufferedWriter);
    }

    /* JADX INFO: renamed from: k */
    private static com.xiaomi.clientreport.data.zy m19336k(com.xiaomi.clientreport.data.zy zyVar, String str) {
        long[] jArrM19340s;
        if (zyVar == null || (jArrM19340s = m19340s(str)) == null) {
            return null;
        }
        zyVar.f31279s = jArrM19340s[0];
        zyVar.f31278p = jArrM19340s[1];
        return zyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f4  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.BufferedReader, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.String> m19337n(android.content.Context r7, java.lang.String r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.clientreport.processor.f7l8.m19337n(android.content.Context, java.lang.String):java.util.List");
    }

    /* JADX INFO: renamed from: p */
    private static String[] m19338p(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split("#");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX INFO: renamed from: q */
    private static HashMap<String, String> m19339q(String str) throws Throwable {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return map;
        }
        ?? r1 = 0;
        ?? length = 0;
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        ?? Split = line.split("%%%");
                        length = Split.length;
                        if (length >= 2) {
                            length = 0;
                            length = 0;
                            if (!TextUtils.isEmpty(Split[0]) && !TextUtils.isEmpty(Split[1])) {
                                length = Split[0];
                                map.put(length, Split[1]);
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bufferedReader = bufferedReader2;
                        com.xiaomi.channel.commonutils.logger.zy.t8r(e);
                        f26p.toq(bufferedReader);
                        r1 = bufferedReader;
                    } catch (Throwable th) {
                        th = th;
                        r1 = bufferedReader2;
                        f26p.toq(r1);
                        throw th;
                    }
                }
                f26p.toq(bufferedReader2);
                r1 = length;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
        return map;
    }

    /* JADX INFO: renamed from: s */
    protected static long[] m19340s(String str) {
        long[] jArr = new long[2];
        try {
            String[] strArrSplit = str.split("#");
            if (strArrSplit.length >= 2) {
                jArr[0] = Long.parseLong(strArrSplit[0].trim());
                jArr[1] = Long.parseLong(strArrSplit[1].trim());
            }
            return jArr;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            return null;
        }
    }

    private static com.xiaomi.clientreport.data.zy toq(String str) {
        com.xiaomi.clientreport.data.zy zyVarM19319g = null;
        try {
            String[] strArrM19338p = m19338p(str);
            if (strArrM19338p == null || strArrM19338p.length < 4 || TextUtils.isEmpty(strArrM19338p[0]) || TextUtils.isEmpty(strArrM19338p[1]) || TextUtils.isEmpty(strArrM19338p[2]) || TextUtils.isEmpty(strArrM19338p[3])) {
                return null;
            }
            zyVarM19319g = com.xiaomi.clientreport.data.zy.m19319g();
            zyVarM19319g.f31272k = Integer.parseInt(strArrM19338p[0]);
            zyVarM19319g.f73110toq = strArrM19338p[1];
            zyVarM19319g.f73111zy = Integer.parseInt(strArrM19338p[2]);
            zyVarM19319g.f31280y = Integer.parseInt(strArrM19338p[3]);
            return zyVarM19319g;
        } catch (Exception unused) {
            com.xiaomi.channel.commonutils.logger.zy.m19300t("parse per key error");
            return zyVarM19319g;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m19341y(java.util.HashMap<java.lang.String, java.lang.String> r9, java.lang.String r10, long r11, long r13) {
        /*
            java.lang.Object r0 = r9.get(r10)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "#"
            if (r1 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r2)
            r0.append(r13)
            java.lang.String r11 = r0.toString()
            r9.put(r10, r11)
            goto L65
        L24:
            long[] r0 = m19340s(r0)
            if (r0 == 0) goto L50
            r1 = 0
            r3 = r0[r1]
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L50
            r1 = 1
            r7 = r0[r1]
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L3b
            goto L50
        L3b:
            long r11 = r11 + r3
            long r13 = r13 + r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r2)
            r0.append(r13)
            java.lang.String r11 = r0.toString()
            goto L62
        L50:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r2)
            r0.append(r13)
            java.lang.String r11 = r0.toString()
        L62:
            r9.put(r10, r11)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.clientreport.processor.f7l8.m19341y(java.util.HashMap, java.lang.String, long, long):void");
    }

    public static String zy(com.xiaomi.clientreport.data.zy zyVar) {
        return zyVar.f31272k + "#" + zyVar.f73110toq + "#" + zyVar.f73111zy + "#" + zyVar.f31280y;
    }
}
