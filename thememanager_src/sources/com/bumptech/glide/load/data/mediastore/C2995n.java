package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C3049g;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.mediastore.n */
/* JADX INFO: compiled from: ThumbnailStreamOpener.java */
/* JADX INFO: loaded from: classes2.dex */
class C2995n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final C2994k f62697f7l8 = new C2994k();

    /* JADX INFO: renamed from: g */
    private static final String f18216g = "ThumbStreamOpener";

    /* JADX INFO: renamed from: k */
    private final C2994k f18217k;

    /* JADX INFO: renamed from: n */
    private final List<ImageHeaderParser> f18218n;

    /* JADX INFO: renamed from: q */
    private final ContentResolver f18219q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final InterfaceC2996q f62698toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.toq f62699zy;

    C2995n(List<ImageHeaderParser> list, InterfaceC2996q interfaceC2996q, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar, ContentResolver contentResolver) {
        this(list, f62697f7l8, interfaceC2996q, toqVar, contentResolver);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0048: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:73), block:B:27:0x0048 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    @zy.dd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String toq(@zy.lvui android.net.Uri r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            com.bumptech.glide.load.data.mediastore.q r2 = r6.f62698toq     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24
            android.database.Cursor r2 = r2.mo10641k(r7)     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24
            if (r2 == 0) goto L1c
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.SecurityException -> L1a java.lang.Throwable -> L47
            if (r3 == 0) goto L1c
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch: java.lang.SecurityException -> L1a java.lang.Throwable -> L47
            r2.close()
            return r7
        L1a:
            r3 = move-exception
            goto L26
        L1c:
            if (r2 == 0) goto L21
            r2.close()
        L21:
            return r1
        L22:
            r7 = move-exception
            goto L49
        L24:
            r3 = move-exception
            r2 = r1
        L26:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r4.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L47
            r4.append(r7)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L47
            android.util.Log.d(r0, r7, r3)     // Catch: java.lang.Throwable -> L47
        L41:
            if (r2 == 0) goto L46
            r2.close()
        L46:
            return r1
        L47:
            r7 = move-exception
            r1 = r2
        L49:
            if (r1 == 0) goto L4e
            r1.close()
        L4e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.mediastore.C2995n.toq(android.net.Uri):java.lang.String");
    }

    private boolean zy(File file) {
        return this.f18217k.m10638k(file) && 0 < this.f18217k.zy(file);
    }

    /* JADX INFO: renamed from: k */
    int m10639k(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f18219q.openInputStream(uri);
                int qVar = C3049g.toq(this.f18218n, inputStreamOpenInputStream, this.f62699zy);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return qVar;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException | NullPointerException e2) {
            if (Log.isLoggable(f18216g, 3)) {
                Log.d(f18216g, "Failed to open uri: " + uri, e2);
            }
            if (inputStreamOpenInputStream == null) {
                return -1;
            }
            try {
                inputStreamOpenInputStream.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public InputStream m10640q(Uri uri) throws Throwable {
        String qVar = toq(uri);
        if (TextUtils.isEmpty(qVar)) {
            return null;
        }
        File qVar2 = this.f18217k.toq(qVar);
        if (!zy(qVar2)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(qVar2);
        try {
            return this.f18219q.openInputStream(uriFromFile);
        } catch (NullPointerException e2) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e2));
        }
    }

    C2995n(List<ImageHeaderParser> list, C2994k c2994k, InterfaceC2996q interfaceC2996q, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar, ContentResolver contentResolver) {
        this.f18217k = c2994k;
        this.f62698toq = interfaceC2996q;
        this.f62699zy = toqVar;
        this.f18219q = contentResolver;
        this.f18218n = list;
    }
}
