package com.xiaomi.onetrack.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class ac {

    /* JADX INFO: renamed from: a */
    public static final long f32265a = 604800000;

    /* JADX INFO: renamed from: b */
    public static final int f32266b = 86400000;

    /* JADX INFO: renamed from: c */
    public static final int f32267c = 43200000;

    /* JADX INFO: renamed from: d */
    public static final int f32268d = 3600000;

    /* JADX INFO: renamed from: e */
    public static final int f32269e = 60000;

    /* JADX INFO: renamed from: f */
    public static final int f32270f = 1000;

    /* JADX INFO: renamed from: g */
    private static final String f32271g = "TimeUtil";

    /* JADX INFO: renamed from: h */
    private static final long f32272h = 300000;

    /* JADX INFO: renamed from: i */
    private static long f32273i;

    /* JADX INFO: renamed from: j */
    private static long f32274j;

    /* JADX INFO: renamed from: k */
    private static long f32275k;

    /* JADX INFO: renamed from: a */
    public static long m20220a() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m20225b(long j2) {
        C5804p.m20342a(f32271g, "inTodayClientTime,current ts :" + System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        long j3 = timeInMillis + 86400000;
        C5804p.m20342a(f32271g, "[start]:" + timeInMillis + "\n[end]:" + j3 + "duration" + ((j3 - timeInMillis) - 86400000));
        StringBuilder sb = new StringBuilder();
        sb.append("is in today:");
        sb.append(timeInMillis <= j2 && j2 < j3);
        C5804p.m20342a(f32271g, sb.toString());
        return timeInMillis <= j2 && j2 < j3;
    }

    /* JADX INFO: renamed from: c */
    public static String m20226c(long j2) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j2);
            return new SimpleDateFormat("HH:mm:ss yy-MM-dd").format(calendar.getTime());
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m20227d(long j2) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        calendar2.setTimeInMillis(j2);
        return calendar2.get(1) == calendar.get(1) && calendar2.get(2) == calendar.get(2) && calendar2.get(5) == calendar.get(5);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m20223a(long j2, long j3) {
        return Math.abs(System.currentTimeMillis() - j2) >= j3;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m20221a(long j2) {
        C5804p.m20342a(f32271g, "inToday,current ts :" + m20220a());
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(m20220a());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        long j3 = timeInMillis + 86400000;
        C5804p.m20342a(f32271g, "[start]:" + timeInMillis + "\n[end]:" + j3 + "duration" + ((j3 - timeInMillis) - 86400000));
        StringBuilder sb = new StringBuilder();
        sb.append("is in today:");
        sb.append(timeInMillis <= j2 && j2 < j3);
        C5804p.m20342a(f32271g, sb.toString());
        return timeInMillis <= j2 && j2 < j3;
    }

    /* JADX INFO: renamed from: b */
    public static long m20224b() {
        Calendar calendar;
        try {
            calendar = Calendar.getInstance(TimeZone.getTimeZone(C5805q.m20362b()));
        } catch (Exception unused) {
            calendar = Calendar.getInstance();
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m20222a(long j2, int i2) {
        return Math.abs(System.currentTimeMillis() - j2) >= ((long) (i2 + new Random().nextInt(i2 / 2)));
    }
}
