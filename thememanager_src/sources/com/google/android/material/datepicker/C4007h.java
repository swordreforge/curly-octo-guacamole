package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.material.datepicker.h */
/* JADX INFO: compiled from: TimeSource.java */
/* JADX INFO: loaded from: classes2.dex */
class C4007h {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final C4007h f67567zy = new C4007h(null, null);

    /* JADX INFO: renamed from: k */
    @dd
    private final Long f24333k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private final TimeZone f67568toq;

    private C4007h(@dd Long l2, @dd TimeZone timeZone) {
        this.f24333k = l2;
        this.f67568toq = timeZone;
    }

    /* JADX INFO: renamed from: k */
    static C4007h m14418k(long j2) {
        return new C4007h(Long.valueOf(j2), null);
    }

    /* JADX INFO: renamed from: n */
    static C4007h m14419n() {
        return f67567zy;
    }

    static C4007h toq(long j2, @dd TimeZone timeZone) {
        return new C4007h(Long.valueOf(j2), timeZone);
    }

    /* JADX INFO: renamed from: q */
    Calendar m14420q(@dd TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l2 = this.f24333k;
        if (l2 != null) {
            calendar.setTimeInMillis(l2.longValue());
        }
        return calendar;
    }

    Calendar zy() {
        return m14420q(this.f67568toq);
    }
}
