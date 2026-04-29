package com.miui.unifiedAdSdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.LruCache;
import com.xiaomi.ad.internal.common.io.C5601k;
import java.io.File;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.miui.unifiedAdSdk.y */
/* JADX INFO: compiled from: UnifiedAdCache.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5356y extends LruCache<String, com.xiaomi.ad.entity.unified.toq> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72519toq = "_";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f72520zy = 100;

    /* JADX INFO: renamed from: k */
    private String f29890k;

    public C5356y(Context context) {
        super(100);
        if (context == null) {
            throw new IllegalArgumentException("context is null. could not new a UnifiedadCache.");
        }
        this.f29890k = context.getFilesDir().getAbsolutePath() + File.separator + "unified_ad";
    }

    /* JADX INFO: renamed from: g */
    private LongSparseArray<com.xiaomi.ad.entity.unified.toq> m18218g(String str) {
        File[] fileArrListFiles;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        LongSparseArray<com.xiaomi.ad.entity.unified.toq> longSparseArray = new LongSparseArray<>();
        File fileM18223y = m18223y(str);
        if (fileM18223y == null || (fileArrListFiles = fileM18223y.listFiles()) == null || fileArrListFiles.length <= 0) {
            return null;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            if (!TextUtils.isEmpty(name) && TextUtils.isDigitsOnly(name) && file.exists()) {
                com.xiaomi.ad.entity.unified.toq toqVarM18219n = m18219n(str, Long.valueOf(name).longValue());
                if (toqVarM18219n != null) {
                    longSparseArray.put(toqVarM18219n.getId(), toqVarM18219n);
                }
            } else {
                toq(file);
            }
        }
        return longSparseArray;
    }

    /* JADX INFO: renamed from: n */
    private com.xiaomi.ad.entity.unified.toq m18219n(String str, long j2) {
        if (TextUtils.isEmpty(str) || j2 <= 0) {
            return null;
        }
        return (com.xiaomi.ad.entity.unified.toq) super.get(m18221q(str, j2));
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX INFO: renamed from: p */
    private void m18220p(String str, long j2, com.xiaomi.ad.entity.unified.toq toqVar) {
        if (TextUtils.isEmpty(str) || j2 <= 0) {
            return;
        }
        String strM18221q = m18221q(str, j2);
        if (((com.xiaomi.ad.entity.unified.toq) super.put(strM18221q, toqVar)) == null) {
            entryRemoved(false, strM18221q, null, toqVar);
        }
    }

    /* JADX INFO: renamed from: q */
    private String m18221q(String str, long j2) {
        return str + f72519toq + j2;
    }

    private void qrj(Reader reader, Writer writer, C5601k c5601k) {
        if (c5601k == null) {
            throw new IllegalArgumentException("lock is null.");
        }
        if (reader == null || writer == null) {
            return;
        }
        try {
            try {
                char[] cArr = new char[1024];
                c5601k.m19223k();
                while (true) {
                    int i2 = reader.read(cArr);
                    if (i2 == -1) {
                        return;
                    } else {
                        writer.write(cArr, 0, i2);
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        } finally {
            c5601k.toq();
        }
    }

    /* JADX INFO: renamed from: s */
    private File m18222s(String str, String str2) {
        File fileM18223y;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (fileM18223y = m18223y(str)) == null) {
            return null;
        }
        return new File(fileM18223y, str2);
    }

    private void toq(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        C5601k c5601k = new C5601k(file.getAbsolutePath());
        try {
            try {
                c5601k.m19223k();
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception e2) {
                Log.e(f7l8.f72510f7l8, "delete file failed.", e2);
            }
        } finally {
            c5601k.toq();
        }
    }

    private boolean x2(String str) {
        return !TextUtils.isEmpty(str) && str.indexOf(f72519toq) >= 0 && str.indexOf(f72519toq) < str.length();
    }

    /* JADX INFO: renamed from: y */
    private File m18223y(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(this.f29890k + File.separator + str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public List<com.xiaomi.ad.entity.unified.toq> f7l8(String str) {
        LongSparseArray<com.xiaomi.ad.entity.unified.toq> longSparseArrayM18218g = m18218g(str);
        if (longSparseArrayM18218g == null || longSparseArrayM18218g.size() <= 0) {
            return null;
        }
        int size = longSparseArrayM18218g.size();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            com.xiaomi.ad.entity.unified.toq toqVarValueAt = longSparseArrayM18218g.valueAt(i2);
            if (toqVarValueAt != null) {
                arrayList.add(toqVarValueAt);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073 A[Catch: IOException -> 0x0076, TRY_LEAVE, TryCatch #4 {IOException -> 0x0076, blocks: (B:35:0x006e, B:37:0x0073), top: B:46:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.util.LruCache
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xiaomi.ad.entity.unified.toq create(java.lang.String r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.String r0 = "_"
            boolean r1 = r5.x2(r6)
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.String[] r1 = r6.split(r0)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
            r3 = 0
            r1 = r1[r3]     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
            java.lang.String[] r6 = r6.split(r0)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
            r0 = 1
            r6 = r6[r0]     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
            java.io.File r6 = r5.m18222s(r1, r6)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
            if (r6 == 0) goto L51
            boolean r0 = r6.exists()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
            if (r0 != 0) goto L25
            goto L51
        L25:
            java.io.FileReader r0 = new java.io.FileReader     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r1.<init>()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            com.xiaomi.ad.internal.common.io.k r3 = new com.xiaomi.ad.internal.common.io.k     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L6a
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L6a
            r3.<init>(r6)     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L6a
            r5.qrj(r0, r1, r3)     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L6a
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L6a
            com.xiaomi.ad.entity.unified.toq r6 = com.xiaomi.ad.entity.unified.toq.m19205p(r6)     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L6a
            r1.close()     // Catch: java.io.IOException -> L49
            r0.close()     // Catch: java.io.IOException -> L49
        L49:
            return r6
        L4a:
            r6 = move-exception
            goto L58
        L4c:
            r6 = move-exception
            goto L6c
        L4e:
            r6 = move-exception
            r1 = r2
            goto L58
        L51:
            return r2
        L52:
            r6 = move-exception
            r0 = r2
            goto L6c
        L55:
            r6 = move-exception
            r0 = r2
            r1 = r0
        L58:
            java.lang.String r3 = "RemoteUnifiedAdService"
            java.lang.String r4 = "some exceptions occur when creating a unified ad from file."
            android.util.Log.e(r3, r4, r6)     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L64
            r1.close()     // Catch: java.io.IOException -> L69
        L64:
            if (r0 == 0) goto L69
            r0.close()     // Catch: java.io.IOException -> L69
        L69:
            return r2
        L6a:
            r6 = move-exception
            r2 = r1
        L6c:
            if (r2 == 0) goto L71
            r2.close()     // Catch: java.io.IOException -> L76
        L71:
            if (r0 == 0) goto L76
            r0.close()     // Catch: java.io.IOException -> L76
        L76:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.unifiedAdSdk.C5356y.create(java.lang.String):com.xiaomi.ad.entity.unified.toq");
    }

    public void ld6(String str, List<com.xiaomi.ad.entity.unified.toq> list) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LongSparseArray<com.xiaomi.ad.entity.unified.toq> longSparseArrayM18218g = m18218g(str);
        if (list != null) {
            for (com.xiaomi.ad.entity.unified.toq toqVar : list) {
                long id = toqVar.getId();
                m18220p(str, id, toqVar);
                if (longSparseArrayM18218g != null) {
                    longSparseArrayM18218g.remove(id);
                }
            }
        }
        if (longSparseArrayM18218g == null || longSparseArrayM18218g.size() <= 0) {
            return;
        }
        int size = longSparseArrayM18218g.size();
        for (int i2 = 0; i2 < size; i2++) {
            long jKeyAt = longSparseArrayM18218g.keyAt(i2);
            if (remove(m18221q(str, jKeyAt)) == null) {
                toq(m18222s(str, jKeyAt + ""));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6 A[Catch: Exception -> 0x00cc, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00cc, blocks: (B:31:0x00a7, B:32:0x00aa, B:48:0x00c6), top: B:62:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5 A[Catch: Exception -> 0x00d8, TRY_LEAVE, TryCatch #5 {Exception -> 0x00d8, blocks: (B:54:0x00d0, B:56:0x00d5), top: B:64:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.util.LruCache
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void entryRemoved(boolean r7, java.lang.String r8, com.xiaomi.ad.entity.unified.toq r9, com.xiaomi.ad.entity.unified.toq r10) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.unifiedAdSdk.C5356y.entryRemoved(boolean, java.lang.String, com.xiaomi.ad.entity.unified.toq, com.xiaomi.ad.entity.unified.toq):void");
    }
}
