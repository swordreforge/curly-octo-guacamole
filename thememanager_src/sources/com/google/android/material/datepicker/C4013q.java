package com.google.android.material.datepicker;

import android.text.format.DateUtils;
import androidx.core.util.C0639p;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.material.datepicker.q */
/* JADX INFO: compiled from: DateStrings.java */
/* JADX INFO: loaded from: classes2.dex */
class C4013q {
    private C4013q() {
    }

    static String f7l8(long j2) {
        return m14441y(j2, Locale.getDefault());
    }

    /* JADX INFO: renamed from: g */
    static String m14435g(long j2, Locale locale) {
        return cdj.zy(locale).format(new Date(j2));
    }

    /* JADX INFO: renamed from: k */
    static C0639p<String, String> m14436k(@dd Long l2, @dd Long l3) {
        return toq(l2, l3, null);
    }

    static String ld6(long j2, Locale locale) {
        return cdj.fu4(locale).format(new Date(j2));
    }

    /* JADX INFO: renamed from: n */
    static String m14437n(long j2) {
        return m14435g(j2, Locale.getDefault());
    }

    /* JADX INFO: renamed from: p */
    static String m14438p(long j2) {
        return ld6(j2, Locale.getDefault());
    }

    /* JADX INFO: renamed from: q */
    static String m14439q(long j2, @dd SimpleDateFormat simpleDateFormat) {
        Calendar calendarM14399i = cdj.m14399i();
        Calendar calendarZurt = cdj.zurt();
        calendarZurt.setTimeInMillis(j2);
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j2)) : calendarM14399i.get(1) == calendarZurt.get(1) ? m14437n(j2) : m14438p(j2);
    }

    static String qrj(long j2, Locale locale) {
        return cdj.m14406z(locale).format(new Date(j2));
    }

    /* JADX INFO: renamed from: s */
    static String m14440s(long j2) {
        return DateUtils.formatDateTime(null, j2, 8228);
    }

    static C0639p<String, String> toq(@dd Long l2, @dd Long l3, @dd SimpleDateFormat simpleDateFormat) {
        if (l2 == null && l3 == null) {
            return C0639p.m2981k(null, null);
        }
        if (l2 == null) {
            return C0639p.m2981k(null, m14439q(l3.longValue(), simpleDateFormat));
        }
        if (l3 == null) {
            return C0639p.m2981k(m14439q(l2.longValue(), simpleDateFormat), null);
        }
        Calendar calendarM14399i = cdj.m14399i();
        Calendar calendarZurt = cdj.zurt();
        calendarZurt.setTimeInMillis(l2.longValue());
        Calendar calendarZurt2 = cdj.zurt();
        calendarZurt2.setTimeInMillis(l3.longValue());
        if (simpleDateFormat != null) {
            return C0639p.m2981k(simpleDateFormat.format(new Date(l2.longValue())), simpleDateFormat.format(new Date(l3.longValue())));
        }
        return calendarZurt.get(1) == calendarZurt2.get(1) ? calendarZurt.get(1) == calendarM14399i.get(1) ? C0639p.m2981k(m14435g(l2.longValue(), Locale.getDefault()), m14435g(l3.longValue(), Locale.getDefault())) : C0639p.m2981k(m14435g(l2.longValue(), Locale.getDefault()), ld6(l3.longValue(), Locale.getDefault())) : C0639p.m2981k(ld6(l2.longValue(), Locale.getDefault()), ld6(l3.longValue(), Locale.getDefault()));
    }

    static String x2(long j2) {
        return qrj(j2, Locale.getDefault());
    }

    /* JADX INFO: renamed from: y */
    static String m14441y(long j2, Locale locale) {
        return cdj.m14403q(locale).format(new Date(j2));
    }

    static String zy(long j2) {
        return m14439q(j2, null);
    }
}
