package u38j;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: renamed from: u38j.g */
/* JADX INFO: compiled from: TimeUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7680g {

    /* JADX INFO: renamed from: g */
    public static int f44425g = 1000;

    /* JADX INFO: renamed from: k */
    public static int f44426k = 604800000;

    /* JADX INFO: renamed from: n */
    public static int f44427n = 60000;

    /* JADX INFO: renamed from: q */
    public static int f44428q = 3600000;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static int f94989toq = 86400000;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static int f94990zy = 43200000;

    private C7680g() {
    }

    /* JADX INFO: renamed from: k */
    public static String m28043k() {
        return toq(System.currentTimeMillis());
    }

    public static String toq(long j2) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j2));
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean zy(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        long timeInMillis = calendar.getTimeInMillis();
        return timeInMillis <= j2 && j2 < ((long) f94989toq) + timeInMillis;
    }
}
