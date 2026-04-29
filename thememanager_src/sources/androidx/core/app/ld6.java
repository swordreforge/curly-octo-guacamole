package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import zy.InterfaceC7830i;

/* JADX INFO: compiled from: AlarmManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class ld6 {

    /* JADX INFO: renamed from: androidx.core.app.ld6$k */
    /* JADX INFO: compiled from: AlarmManagerCompat.java */
    @zy.hyr(19)
    static class C0438k {
        private C0438k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m1925k(AlarmManager alarmManager, int i2, long j2, PendingIntent pendingIntent) {
            alarmManager.setExact(i2, j2, pendingIntent);
        }
    }

    /* JADX INFO: compiled from: AlarmManagerCompat.java */
    @zy.hyr(21)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static AlarmManager.AlarmClockInfo m1926k(long j2, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j2, pendingIntent);
        }

        @InterfaceC7830i
        static void toq(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    /* JADX INFO: compiled from: AlarmManagerCompat.java */
    @zy.hyr(23)
    static class zy {
        private zy() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m1927k(AlarmManager alarmManager, int i2, long j2, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i2, j2, pendingIntent);
        }

        @InterfaceC7830i
        static void toq(AlarmManager alarmManager, int i2, long j2, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i2, j2, pendingIntent);
        }
    }

    private ld6() {
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: k */
    public static void m1923k(@zy.lvui AlarmManager alarmManager, long j2, @zy.lvui PendingIntent pendingIntent, @zy.lvui PendingIntent pendingIntent2) {
        toq.toq(alarmManager, toq.m1926k(j2, pendingIntent), pendingIntent2);
    }

    /* JADX INFO: renamed from: q */
    public static void m1924q(@zy.lvui AlarmManager alarmManager, int i2, long j2, @zy.lvui PendingIntent pendingIntent) {
        zy.toq(alarmManager, i2, j2, pendingIntent);
    }

    public static void toq(@zy.lvui AlarmManager alarmManager, int i2, long j2, @zy.lvui PendingIntent pendingIntent) {
        zy.m1927k(alarmManager, i2, j2, pendingIntent);
    }

    public static void zy(@zy.lvui AlarmManager alarmManager, int i2, long j2, @zy.lvui PendingIntent pendingIntent) {
        C0438k.m1925k(alarmManager, i2, j2, pendingIntent);
    }
}
