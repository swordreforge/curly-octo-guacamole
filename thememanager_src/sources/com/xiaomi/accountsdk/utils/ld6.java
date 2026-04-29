package com.xiaomi.accountsdk.utils;

import java.lang.ref.SoftReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: DateUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ld6 {

    /* JADX INFO: renamed from: g */
    public static final TimeZone f31039g;

    /* JADX INFO: renamed from: n */
    private static final Date f31041n;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f72973toq = "EEEE, dd-MMM-yy HH:mm:ss zzz";

    /* JADX INFO: renamed from: k */
    public static final String f31040k = "EEE, dd MMM yyyy HH:mm:ss zzz";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f72974zy = "EEE MMM d HH:mm:ss yyyy";

    /* JADX INFO: renamed from: q */
    private static final String[] f31042q = {f72973toq, f31040k, f72974zy};

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.ld6$k */
    /* JADX INFO: compiled from: DateUtils.java */
    static final class C5572k {

        /* JADX INFO: renamed from: k */
        private static final ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> f31043k = new k();

        /* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.ld6$k$k */
        /* JADX INFO: compiled from: DateUtils.java */
        static class k extends ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> {
            k() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SoftReference<Map<String, SimpleDateFormat>> initialValue() {
                return new SoftReference<>(new HashMap());
            }
        }

        C5572k() {
        }

        /* JADX INFO: renamed from: k */
        public static SimpleDateFormat m19103k(String str) {
            ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> threadLocal = f31043k;
            Map<String, SimpleDateFormat> map = threadLocal.get().get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(new SoftReference<>(map));
            }
            SimpleDateFormat simpleDateFormat = map.get(str);
            if (simpleDateFormat != null) {
                return simpleDateFormat;
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str, Locale.US);
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("GMT"));
            map.put(str, simpleDateFormat2);
            return simpleDateFormat2;
        }
    }

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        f31039g = timeZone;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2000, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        f31041n = calendar.getTime();
    }

    private ld6() {
    }

    /* JADX INFO: renamed from: k */
    public static String m19100k(Date date) {
        return toq(date, f31040k);
    }

    /* JADX INFO: renamed from: n */
    public static Date m19101n(String str, String[] strArr, Date date) throws ParseException {
        if (str == null) {
            throw new IllegalArgumentException("dateValue is null");
        }
        if (strArr == null) {
            strArr = f31042q;
        }
        if (date == null) {
            date = f31041n;
        }
        if (str.length() > 1 && str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1);
        }
        for (String str2 : strArr) {
            SimpleDateFormat simpleDateFormatM19103k = C5572k.m19103k(str2);
            simpleDateFormatM19103k.set2DigitYearStart(date);
            try {
                return simpleDateFormatM19103k.parse(str);
            } catch (ParseException unused) {
            }
        }
        throw new ParseException("Unable to parse the date " + str, 0);
    }

    /* JADX INFO: renamed from: q */
    public static Date m19102q(String str, String[] strArr) throws ParseException {
        return m19101n(str, strArr, null);
    }

    public static String toq(Date date, String str) {
        if (date == null) {
            throw new IllegalArgumentException("date is null");
        }
        if (str != null) {
            return C5572k.m19103k(str).format(date);
        }
        throw new IllegalArgumentException("pattern is null");
    }

    public static Date zy(String str) throws ParseException {
        return m19101n(str, null, null);
    }
}
