package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.util.TimeZone;
import com.miui.maml.folme.AnimatedProperty;
import ij.C6095k;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import t8iq.C7672k;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: UtcDates.java */
/* JADX INFO: loaded from: classes2.dex */
class cdj {

    /* JADX INFO: renamed from: k */
    static final String f24287k = "UTC";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static AtomicReference<C4007h> f67553toq = new AtomicReference<>();

    private cdj() {
    }

    static String cdj(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(C6095k.qrj.f79807gc3c);
        String string2 = resources.getString(C6095k.qrj.f79846se);
        String string3 = resources.getString(C6095k.qrj.f79785bwp);
        if (pattern.replaceAll("[^y]", "").length() == 1) {
            pattern = pattern.replace(AnimatedProperty.PROPERTY_NAME_Y, "yyyy");
        }
        return pattern.replace(C7672k.f94880zy, string3).replace("M", string2).replace(AnimatedProperty.PROPERTY_NAME_Y, string);
    }

    private static DateFormat f7l8(int i2, Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(i2, locale);
        dateInstance.setTimeZone(t8r());
        return dateInstance;
    }

    @TargetApi(24)
    private static TimeZone fn3e() {
        return TimeZone.getTimeZone(f24287k);
    }

    @TargetApi(24)
    static android.icu.text.DateFormat fu4(Locale locale) {
        return m14401n("yMMMd", locale);
    }

    /* JADX INFO: renamed from: g */
    static Calendar m14397g(Calendar calendar) {
        Calendar calendarNi7 = ni7(calendar);
        Calendar calendarZurt = zurt();
        calendarZurt.set(calendarNi7.get(1), calendarNi7.get(2), calendarNi7.get(5));
        return calendarZurt;
    }

    /* JADX INFO: renamed from: h */
    static SimpleDateFormat m14398h() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(t8r());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* JADX INFO: renamed from: i */
    static Calendar m14399i() {
        Calendar calendarZy = ki().zy();
        calendarZy.set(11, 0);
        calendarZy.set(12, 0);
        calendarZy.set(13, 0);
        calendarZy.set(14, 0);
        calendarZy.setTimeZone(t8r());
        return calendarZy;
    }

    /* JADX INFO: renamed from: k */
    static long m14400k(long j2) {
        Calendar calendarZurt = zurt();
        calendarZurt.setTimeInMillis(j2);
        return m14397g(calendarZurt).getTimeInMillis();
    }

    static C4007h ki() {
        C4007h c4007h = f67553toq.get();
        return c4007h == null ? C4007h.m14419n() : c4007h;
    }

    private static SimpleDateFormat kja0(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(t8r());
        return simpleDateFormat;
    }

    static DateFormat ld6(Locale locale) {
        return f7l8(2, locale);
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: n */
    private static android.icu.text.DateFormat m14401n(String str, Locale locale) {
        android.icu.text.DateFormat instanceForSkeleton = android.icu.text.DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(fn3e());
        return instanceForSkeleton;
    }

    static SimpleDateFormat n7h(String str) {
        return kja0(str, Locale.getDefault());
    }

    static Calendar ni7(@dd Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(t8r());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @lvui
    private static String o1t(@lvui String str) {
        int qVar = toq(str, "yY", 1, 0);
        if (qVar >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int qVar2 = toq(str, "EMd", 1, qVar);
        if (qVar2 < str.length()) {
            str2 = "EMd,";
        }
        return str.replace(str.substring(toq(str, str2, -1, qVar) + 1, qVar2), " ").trim();
    }

    /* JADX INFO: renamed from: p */
    static DateFormat m14402p() {
        return ld6(Locale.getDefault());
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: q */
    static android.icu.text.DateFormat m14403q(Locale locale) {
        return m14401n("MMMEd", locale);
    }

    static DateFormat qrj(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) ld6(locale);
        simpleDateFormat.applyPattern(o1t(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    /* JADX INFO: renamed from: s */
    static DateFormat m14404s(Locale locale) {
        return f7l8(0, locale);
    }

    private static java.util.TimeZone t8r() {
        return java.util.TimeZone.getTimeZone(f24287k);
    }

    private static int toq(@lvui String str, @lvui String str2, int i2, int i3) {
        while (i3 >= 0 && i3 < str.length() && str2.indexOf(str.charAt(i3)) == -1) {
            if (str.charAt(i3) == '\'') {
                do {
                    i3 += i2;
                    if (i3 < 0 || i3 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i3) != '\'');
            }
            i3 += i2;
        }
        return i3;
    }

    static void wvg(@dd C4007h c4007h) {
        f67553toq.set(c4007h);
    }

    static DateFormat x2() {
        return qrj(Locale.getDefault());
    }

    /* JADX INFO: renamed from: y */
    static DateFormat m14405y() {
        return m14404s(Locale.getDefault());
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: z */
    static android.icu.text.DateFormat m14406z(Locale locale) {
        return m14401n("yMMMEd", locale);
    }

    static Calendar zurt() {
        return ni7(null);
    }

    @TargetApi(24)
    static android.icu.text.DateFormat zy(Locale locale) {
        return m14401n("MMMd", locale);
    }
}
