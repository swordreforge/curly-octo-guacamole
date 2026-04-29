package miuix.pickerwidget.date;

import android.content.Context;
import android.text.format.DateFormat;
import java.util.TimeZone;
import miuix.core.util.qrj;
import wtop.toq;

/* JADX INFO: compiled from: DateUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f87982cdj = 8192;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f87983f7l8 = 16;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final qrj.InterfaceC7086g<C7230k> f87984fn3e = qrj.m25614q(new C7232k(), 1);

    /* JADX INFO: renamed from: g */
    public static final int f40815g = 12;

    /* JADX INFO: renamed from: h */
    public static final int f40816h = 4096;

    /* JADX INFO: renamed from: i */
    public static final int f40817i = 32768;

    /* JADX INFO: renamed from: k */
    public static final int f40818k = 1;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f87985ki = 16384;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f87986kja0 = 2048;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f87987ld6 = 256;

    /* JADX INFO: renamed from: n */
    public static final int f40819n = 15;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f87988n7h = 1024;

    /* JADX INFO: renamed from: p */
    public static final int f40820p = 128;

    /* JADX INFO: renamed from: q */
    public static final int f40821q = 8;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f87989qrj = 896;

    /* JADX INFO: renamed from: s */
    public static final int f40822s = 64;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f87990t8r = 28672;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f87991toq = 2;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f87992x2 = 512;

    /* JADX INFO: renamed from: y */
    public static final int f40823y = 32;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f87993zy = 4;

    /* JADX INFO: renamed from: miuix.pickerwidget.date.zy$k */
    /* JADX INFO: compiled from: DateUtils.java */
    class C7232k extends qrj.AbstractC7088n<C7230k> {
        C7232k() {
        }

        @Override // miuix.core.util.qrj.AbstractC7088n
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public C7230k mo25540k() {
            return new C7230k();
        }
    }

    protected zy() throws InstantiationException {
        throw new InstantiationException("Cannot instantiate utility class");
    }

    public static StringBuilder f7l8(Context context, StringBuilder sb, long j2, boolean z2) {
        return m26308y(context, sb, j2, z2, null);
    }

    /* JADX INFO: renamed from: g */
    public static String m26302g(Context context, long j2, boolean z2, TimeZone timeZone) {
        StringBuilder sbMo25617k = qrj.m25613n().mo25617k();
        String string = m26308y(context, sbMo25617k, j2, z2, timeZone).toString();
        qrj.m25613n().toq(sbMo25617k);
        return string;
    }

    /* JADX INFO: renamed from: k */
    public static String m26303k(Context context, long j2, int i2) {
        StringBuilder sbMo25617k = qrj.m25613n().mo25617k();
        String string = m26306q(context, sbMo25617k, j2, i2, null).toString();
        qrj.m25613n().toq(sbMo25617k);
        return string;
    }

    private static int ld6(C7230k c7230k, int i2) {
        if ((i2 & 16384) == 16384 && (((i2 & 1) != 1 || c7230k.get(22) == 0) && (i2 & 14) != 0)) {
            i2 &= -2;
            if (((i2 & 2) != 2 || c7230k.get(21) == 0) && (i2 & 12) != 0) {
                i2 &= -3;
                if (c7230k.get(20) == 0 && (i2 & 8) != 0) {
                    i2 &= -5;
                }
            }
        }
        if ((i2 & 8) == 8) {
            return (i2 & 16) == 16 ? (i2 & 64) == 64 ? (i2 & 4) == 4 ? (i2 & 2) == 2 ? (i2 & 1) == 1 ? toq.kja0.f98116vy : toq.kja0.f97982dxef : toq.kja0.f98003ga : toq.kja0.f98120wlev : (i2 & 4) == 4 ? (i2 & 2) == 2 ? (i2 & 1) == 1 ? toq.kja0.f97950a5id : toq.kja0.f98048lw : toq.kja0.f97983e5 : toq.kja0.f98007gcp : (i2 & 4) == 4 ? (i2 & 2) == 2 ? (i2 & 1) == 1 ? toq.kja0.f97973cnbm : toq.kja0.f98051m58i : toq.kja0.f98071o05 : toq.kja0.f98076oki;
        }
        if ((i2 & 4) == 4) {
            return (i2 & 2) == 2 ? (i2 & 1) == 1 ? toq.kja0.f98088r25n : toq.kja0.f98065nme : toq.kja0.f97956b8;
        }
        if ((i2 & 2) == 2) {
            return (i2 & 1) == 1 ? toq.kja0.f98022ix : toq.kja0.f97990ew;
        }
        if ((i2 & 1) == 1) {
            return toq.kja0.f97957b9ub;
        }
        throw new IllegalArgumentException("no any time date");
    }

    /* JADX INFO: renamed from: n */
    public static String m26304n(Context context, long j2, boolean z2) {
        StringBuilder sbMo25617k = qrj.m25613n().mo25617k();
        String string = m26308y(context, sbMo25617k, j2, z2, null).toString();
        qrj.m25613n().toq(sbMo25617k);
        return string;
    }

    /* JADX INFO: renamed from: p */
    private static int m26305p(int i2) {
        return (i2 & 1024) == 1024 ? (i2 & f87989qrj) != 0 ? (i2 & 15) != 0 ? (i2 & 2048) == 2048 ? toq.kja0.f98111v5yj : toq.kja0.f98082ps : (i2 & 2048) == 2048 ? toq.kja0.f98091ra : toq.kja0.f98102u38j : (i2 & 15) != 0 ? (i2 & 2048) == 2048 ? toq.kja0.f98143z4t : toq.kja0.f98031kiv : (i2 & 2048) == 2048 ? toq.kja0.f97961bih : toq.kja0.f98049m2t : (i2 & f87989qrj) != 0 ? (i2 & 15) != 0 ? (i2 & 2048) == 2048 ? toq.kja0.f98063ngy : toq.kja0.f98080pjz9 : (i2 & 2048) == 2048 ? toq.kja0.f98042lh : toq.kja0.f98011h7am : (i2 & 15) != 0 ? (i2 & 2048) == 2048 ? toq.kja0.f98037kx3 : toq.kja0.f98010h4b : (i2 & 2048) == 2048 ? toq.kja0.f45180w : toq.kja0.f98027jz5;
    }

    /* JADX INFO: renamed from: q */
    public static StringBuilder m26306q(Context context, StringBuilder sb, long j2, int i2, TimeZone timeZone) {
        if ((i2 & 16) == 0 && (i2 & 32) == 0) {
            i2 |= DateFormat.is24HourFormat(context) ? 32 : 16;
        }
        String string = context.getString(m26305p(i2));
        StringBuilder sbMo25617k = qrj.m25613n().mo25617k();
        C7230k c7230kMo25617k = f87984fn3e.mo25617k();
        c7230kMo25617k.setTimeZone(timeZone);
        c7230kMo25617k.setTimeInMillis(j2);
        int length = string.length();
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = string.charAt(i3);
            if (cCharAt == 'D') {
                sbMo25617k.append(context.getString(m26307s(i2)));
            } else if (cCharAt == 'T') {
                sbMo25617k.append(context.getString(ld6(c7230kMo25617k, i2)));
            } else if (cCharAt != 'W') {
                sbMo25617k.append(cCharAt);
            } else {
                sbMo25617k.append(context.getString(x2(i2)));
            }
        }
        c7230kMo25617k.format(context, sb, sbMo25617k);
        qrj.m25613n().toq(sbMo25617k);
        f87984fn3e.toq(c7230kMo25617k);
        return sb;
    }

    /* JADX INFO: renamed from: s */
    private static int m26307s(int i2) {
        if ((i2 & 32768) == 32768) {
            if ((i2 & 512) == 512) {
                return (i2 & 256) == 256 ? (i2 & 128) == 128 ? toq.kja0.f98079pc : toq.kja0.f97984ebn : toq.kja0.f98106ukdy;
            }
            if ((i2 & 256) == 256) {
                return (i2 & 128) == 128 ? toq.kja0.f46328do : toq.kja0.f98023ixz;
            }
            if ((i2 & 128) == 128) {
                return toq.kja0.f98126wx16;
            }
            throw new IllegalArgumentException("no any time date");
        }
        if ((i2 & 4096) == 4096) {
            if ((i2 & 512) == 512) {
                return (i2 & 256) == 256 ? (i2 & 128) == 128 ? toq.kja0.f98059n2t : toq.kja0.f98151zwy : toq.kja0.f97958bap7;
            }
            if ((i2 & 256) == 256) {
                return (i2 & 128) == 128 ? toq.kja0.f98069nsb : toq.kja0.f98019ij;
            }
            if ((i2 & 128) == 128) {
                return toq.kja0.f98112vep5;
            }
            throw new IllegalArgumentException("no any time date");
        }
        if ((i2 & 512) == 512) {
            return (i2 & 256) == 256 ? (i2 & 128) == 128 ? toq.kja0.f98103uc : toq.kja0.f98136yl : toq.kja0.f97958bap7;
        }
        if ((i2 & 256) == 256) {
            return (i2 & 128) == 128 ? toq.kja0.f98024jbh : toq.kja0.f98053mbx;
        }
        if ((i2 & 128) == 128) {
            return toq.kja0.f98112vep5;
        }
        throw new IllegalArgumentException("no any time date");
    }

    public static String toq(Context context, long j2, int i2, TimeZone timeZone) {
        StringBuilder sbMo25617k = qrj.m25613n().mo25617k();
        String string = m26306q(context, sbMo25617k, j2, i2, timeZone).toString();
        qrj.m25613n().toq(sbMo25617k);
        return string;
    }

    private static int x2(int i2) {
        return (i2 & 8192) == 8192 ? toq.kja0.f98104uf : toq.kja0.f98068nnh;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.StringBuilder m26308y(android.content.Context r16, java.lang.StringBuilder r17, long r18, boolean r20, java.util.TimeZone r21) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.pickerwidget.date.zy.m26308y(android.content.Context, java.lang.StringBuilder, long, boolean, java.util.TimeZone):java.lang.StringBuilder");
    }

    public static StringBuilder zy(Context context, StringBuilder sb, long j2, int i2) {
        return m26306q(context, sb, j2, i2, null);
    }
}
