package okhttp3.internal.http;

import b7.C1359g;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: dates.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class zy {

    /* JADX INFO: renamed from: k */
    public static final long f43155k = 253402300799999L;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final DateFormat[] f43156q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final C7464k f93902toq = new C7464k();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final String[] f93903zy;

    /* JADX INFO: renamed from: okhttp3.internal.http.zy$k */
    /* JADX INFO: compiled from: dates.kt */
    public static final class C7464k extends ThreadLocal<DateFormat> {
        C7464k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        @InterfaceC7396q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C1359g.f7239g);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {com.xiaomi.accountsdk.utils.ld6.f31040k, com.xiaomi.accountsdk.utils.ld6.f72973toq, com.xiaomi.accountsdk.utils.ld6.f72974zy, "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f93903zy = strArr;
        f43156q = new DateFormat[strArr.length];
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public static final Date m27095k(@InterfaceC7396q String str) {
        d2ok.m23075h(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = f93902toq.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f93903zy;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                DateFormat[] dateFormatArr = f43156q;
                DateFormat simpleDateFormat = dateFormatArr[i2];
                if (simpleDateFormat == null) {
                    simpleDateFormat = new SimpleDateFormat(f93903zy[i2], Locale.US);
                    simpleDateFormat.setTimeZone(C1359g.f7239g);
                    dateFormatArr[i2] = simpleDateFormat;
                }
                parsePosition.setIndex(0);
                Date date2 = simpleDateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return date2;
                }
            }
            was wasVar = was.f36763k;
            return null;
        }
    }

    @InterfaceC7396q
    public static final String toq(@InterfaceC7396q Date date) {
        d2ok.m23075h(date, "<this>");
        String str = f93902toq.get().format(date);
        d2ok.kja0(str, "STANDARD_DATE_FORMAT.get().format(this)");
        return str;
    }
}
