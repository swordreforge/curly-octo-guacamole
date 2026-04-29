package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.C3844k;
import com.xiaomi.mipush.sdk.C5658n;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: HttpUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class gvn7 {

    /* JADX INFO: renamed from: k */
    private static final String f23013k = "HttpUtil";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Pattern f66849toq = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final Pattern f66850zy = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    private gvn7() {
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    public static String m13464k(long j2, long j3) {
        if (j2 == 0 && j3 == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        sb.append(j2);
        sb.append(C5658n.f73185t8r);
        if (j3 != -1) {
            sb.append((j2 + j3) - 1);
        }
        return sb.toString();
    }

    public static long toq(@zy.dd String str, @zy.dd String str2) {
        long j2;
        if (TextUtils.isEmpty(str)) {
            j2 = -1;
        } else {
            try {
                j2 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
                sb.append("Unexpected Content-Length [");
                sb.append(str);
                sb.append("]");
                com.google.android.exoplayer2.util.ni7.m13702q(f23013k, sb.toString());
                j2 = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j2;
        }
        Matcher matcher = f66849toq.matcher(str2);
        if (!matcher.matches()) {
            return j2;
        }
        try {
            long j3 = (Long.parseLong((String) C3844k.f7l8(matcher.group(2))) - Long.parseLong((String) C3844k.f7l8(matcher.group(1)))) + 1;
            if (j2 < 0) {
                return j3;
            }
            if (j2 == j3) {
                return j2;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(str2).length());
            sb2.append("Inconsistent headers [");
            sb2.append(str);
            sb2.append("] [");
            sb2.append(str2);
            sb2.append("]");
            com.google.android.exoplayer2.util.ni7.qrj(f23013k, sb2.toString());
            return Math.max(j2, j3);
        } catch (NumberFormatException unused2) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb3.append("Unexpected Content-Range [");
            sb3.append(str2);
            sb3.append("]");
            com.google.android.exoplayer2.util.ni7.m13702q(f23013k, sb3.toString());
            return j2;
        }
    }

    public static long zy(@zy.dd String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f66850zy.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) C3844k.f7l8(matcher.group(1)));
        }
        return -1L;
    }
}
