package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import com.xiaomi.push.nc;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class mu {

    /* JADX INFO: renamed from: k */
    private static List<C5927k> f33852k = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: com.xiaomi.push.service.mu$k */
    private static class C5927k {

        /* JADX INFO: renamed from: k */
        public final String f33853k;

        /* JADX INFO: renamed from: q */
        public final Notification.Action[] f33854q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final long f73641toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f73642zy;

        C5927k(String str, long j2, int i2, Notification.Action[] actionArr) {
            this.f33853k = str;
            this.f73641toq = j2;
            this.f73642zy = i2;
            this.f33854q = actionArr;
        }
    }

    /* JADX INFO: renamed from: k */
    private static void m21692k() {
        for (int size = f33852k.size() - 1; size >= 0; size--) {
            C5927k c5927k = f33852k.get(size);
            if (SystemClock.elapsedRealtime() - c5927k.f73641toq > 5000) {
                f33852k.remove(c5927k);
            }
        }
        if (f33852k.size() > 10) {
            f33852k.remove(0);
        }
    }

    protected static void toq(Context context, StatusBarNotification statusBarNotification, int i2) {
        if (!nc.m21313p(context) || i2 <= 0 || statusBarNotification == null) {
            return;
        }
        zy(new C5927k(statusBarNotification.getKey(), SystemClock.elapsedRealtime(), i2, C5939t.fn3e(statusBarNotification.getNotification())));
    }

    private static void zy(C5927k c5927k) {
        f33852k.add(c5927k);
        m21692k();
    }
}
