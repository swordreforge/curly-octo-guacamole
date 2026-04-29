package com.google.android.exoplayer2.text.ttml;

import android.text.TextUtils;
import com.google.common.collect.vep5;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;
import zy.dd;

/* JADX INFO: compiled from: TextEmphasis.java */
/* JADX INFO: loaded from: classes2.dex */
final class toq {

    /* JADX INFO: renamed from: n */
    public static final int f22061n = -2;

    /* JADX INFO: renamed from: q */
    public static final int f22063q = -1;

    /* JADX INFO: renamed from: k */
    public final int f22066k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final int f65858toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final int f65859zy;

    /* JADX INFO: renamed from: g */
    private static final Pattern f22060g = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final vep5<String> f65857f7l8 = vep5.of("auto", "none");

    /* JADX INFO: renamed from: y */
    private static final vep5<String> f22065y = vep5.of("dot", C3678q.f65811dr, C3678q.f65845xwq3);

    /* JADX INFO: renamed from: s */
    private static final vep5<String> f22064s = vep5.of(C3678q.f22050v, C3678q.f65822ikck);

    /* JADX INFO: renamed from: p */
    private static final vep5<String> f22062p = vep5.of(C3678q.f22046o, C3678q.f22043j, C3678q.f22045m);

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.ttml.toq$k */
    /* JADX INFO: compiled from: TextEmphasis.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3680k {
    }

    private toq(int i2, int i3, int i4) {
        this.f22066k = i2;
        this.f65858toq = i3;
        this.f65859zy = i4;
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static toq m12969k(@dd String str) {
        if (str == null) {
            return null;
        }
        String strF7l8 = com.google.common.base.zy.f7l8(str.trim());
        if (strF7l8.isEmpty()) {
            return null;
        }
        return toq(vep5.copyOf(TextUtils.split(strF7l8, f22060g)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.exoplayer2.text.ttml.toq toq(com.google.common.collect.vep5<java.lang.String> r9) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.toq.toq(com.google.common.collect.vep5):com.google.android.exoplayer2.text.ttml.toq");
    }
}
