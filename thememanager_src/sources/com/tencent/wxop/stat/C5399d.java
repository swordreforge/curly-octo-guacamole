package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.common.C5392l;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.tencent.wxop.stat.d */
/* JADX INFO: loaded from: classes3.dex */
public class C5399d {

    /* JADX INFO: renamed from: b */
    private static volatile C5399d f30174b;

    /* JADX INFO: renamed from: a */
    private Timer f30175a;

    /* JADX INFO: renamed from: c */
    private Context f30176c;

    private C5399d(Context context) {
        this.f30175a = null;
        this.f30176c = null;
        this.f30176c = context.getApplicationContext();
        this.f30175a = new Timer(false);
    }

    /* JADX INFO: renamed from: a */
    public static C5399d m18475a(Context context) {
        if (f30174b == null) {
            synchronized (C5399d.class) {
                if (f30174b == null) {
                    f30174b = new C5399d(context);
                }
            }
        }
        return f30174b;
    }

    /* JADX INFO: renamed from: a */
    public void m18476a() {
        if (StatConfig.getStatSendStrategy() == StatReportStrategy.PERIOD) {
            long sendPeriodMinutes = StatConfig.getSendPeriodMinutes() * 60 * 1000;
            if (StatConfig.isDebugEnable()) {
                C5392l.m18418b().m18377i("setupPeriodTimer delay:" + sendPeriodMinutes);
            }
            m18477a(new C5400e(this), sendPeriodMinutes);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m18477a(TimerTask timerTask, long j2) {
        if (this.f30175a == null) {
            if (StatConfig.isDebugEnable()) {
                C5392l.m18418b().m18379w("setupPeriodTimer schedule timer == null");
            }
        } else {
            if (StatConfig.isDebugEnable()) {
                C5392l.m18418b().m18377i("setupPeriodTimer schedule delay:" + j2);
            }
            this.f30175a.schedule(timerTask, j2);
        }
    }
}
