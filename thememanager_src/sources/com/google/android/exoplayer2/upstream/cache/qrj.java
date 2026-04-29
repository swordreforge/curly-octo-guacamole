package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import zy.dd;

/* JADX INFO: compiled from: ContentMetadata.java */
/* JADX INFO: loaded from: classes2.dex */
public interface qrj {

    /* JADX INFO: renamed from: k */
    public static final String f22931k = "custom_";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f66781toq = "exo_redir";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f66782zy = "exo_len";

    /* JADX INFO: renamed from: n */
    static long m13413n(qrj qrjVar) {
        return qrjVar.mo13391k(f66782zy, -1L);
    }

    @dd
    static Uri zy(qrj qrjVar) {
        String strMo13392q = qrjVar.mo13392q(f66781toq, null);
        if (strMo13392q == null) {
            return null;
        }
        return Uri.parse(strMo13392q);
    }

    boolean contains(String str);

    /* JADX INFO: renamed from: k */
    long mo13391k(String str, long j2);

    @dd
    /* JADX INFO: renamed from: q */
    String mo13392q(String str, @dd String str2);

    @dd
    byte[] toq(String str, @dd byte[] bArr);
}
