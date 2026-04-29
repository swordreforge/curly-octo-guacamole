package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zy.dd;

/* JADX INFO: compiled from: SimpleCacheSpan.java */
/* JADX INFO: loaded from: classes2.dex */
final class fn3e extends C3780s {

    /* JADX INFO: renamed from: h */
    private static final String f22892h = ".v3.exo";

    /* JADX INFO: renamed from: p */
    static final String f22894p = ".exo";

    /* JADX INFO: renamed from: i */
    private static final Pattern f22893i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: z */
    private static final Pattern f22896z = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: t */
    private static final Pattern f22895t = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private fn3e(String str, long j2, long j3, long j4, @dd File file) {
        super(str, j2, j3, j4, file);
    }

    @dd
    public static fn3e f7l8(File file, long j2, long j3, x2 x2Var) {
        File file2;
        String strX2;
        String name = file.getName();
        if (name.endsWith(f22892h)) {
            file2 = file;
        } else {
            File fileQrj = qrj(file, x2Var);
            if (fileQrj == null) {
                return null;
            }
            file2 = fileQrj;
            name = fileQrj.getName();
        }
        Matcher matcher = f22895t.matcher(name);
        if (!matcher.matches() || (strX2 = x2Var.x2(Integer.parseInt((String) C3844k.f7l8(matcher.group(1))))) == null) {
            return null;
        }
        long length = j2 == -1 ? file2.length() : j2;
        if (length == 0) {
            return null;
        }
        return new fn3e(strX2, Long.parseLong((String) C3844k.f7l8(matcher.group(2))), length, j3 == C3548p.f65257toq ? Long.parseLong((String) C3844k.f7l8(matcher.group(3))) : j3, file2);
    }

    public static fn3e ld6(String str, long j2) {
        return new fn3e(str, j2, -1L, C3548p.f65257toq, null);
    }

    /* JADX INFO: renamed from: p */
    public static fn3e m13369p(String str, long j2, long j3) {
        return new fn3e(str, j2, j3, C3548p.f65257toq, null);
    }

    @dd
    private static File qrj(File file, x2 x2Var) {
        String strNsb;
        String name = file.getName();
        Matcher matcher = f22896z.matcher(name);
        if (matcher.matches()) {
            strNsb = lrht.nsb((String) C3844k.f7l8(matcher.group(1)));
        } else {
            matcher = f22893i.matcher(name);
            strNsb = matcher.matches() ? (String) C3844k.f7l8(matcher.group(1)) : null;
        }
        if (strNsb == null) {
            return null;
        }
        File fileX2 = x2((File) C3844k.ld6(file.getParentFile()), x2Var.m13422g(strNsb), Long.parseLong((String) C3844k.f7l8(matcher.group(2))), Long.parseLong((String) C3844k.f7l8(matcher.group(3))));
        if (file.renameTo(fileX2)) {
            return fileX2;
        }
        return null;
    }

    @dd
    /* JADX INFO: renamed from: s */
    public static fn3e m13370s(File file, long j2, x2 x2Var) {
        return f7l8(file, j2, C3548p.f65257toq, x2Var);
    }

    public static File x2(File file, int i2, long j2, long j3) {
        StringBuilder sb = new StringBuilder(60);
        sb.append(i2);
        sb.append(".");
        sb.append(j2);
        sb.append(".");
        sb.append(j3);
        sb.append(f22892h);
        return new File(file, sb.toString());
    }

    /* JADX INFO: renamed from: n */
    public fn3e m13371n(File file, long j2) {
        C3844k.m13633s(this.f22932g);
        return new fn3e(this.f22933k, this.f22935q, this.f22934n, j2, file);
    }
}
