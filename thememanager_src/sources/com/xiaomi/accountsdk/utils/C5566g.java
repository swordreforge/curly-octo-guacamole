package com.xiaomi.accountsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.xiaomi.accountsdk.account.C5504y;
import com.xiaomi.accountsdk.utils.C5578t;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.g */
/* JADX INFO: compiled from: AccountServerTimeComputer.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5566g implements C5578t.k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final Set<String> f72962f7l8 = new HashSet();

    /* JADX INFO: renamed from: g */
    private static final String f31020g = "AccountServerTimeCompu";

    /* JADX INFO: renamed from: n */
    private static final String f31021n = "accountsdk_servertime";

    /* JADX INFO: renamed from: q */
    private static final String f31022q = "system_time_diff";

    /* JADX INFO: renamed from: k */
    private volatile long f31023k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final AtomicBoolean f72963toq = new AtomicBoolean(false);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Context f72964zy;

    static {
        String[] strArr = {C5504y.f72850toq, C5504y.f72860zy};
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                f72962f7l8.add(new URL(strArr[i2]).getHost().toLowerCase());
            } catch (MalformedURLException unused) {
            }
        }
    }

    public C5566g(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        this.f72964zy = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: y */
    static boolean m19077y(String str) {
        try {
            return f72962f7l8.contains(new URL(str).getHost().toLowerCase());
        } catch (MalformedURLException e2) {
            AbstractC5574n.o1t(f31020g, e2);
            return false;
        }
    }

    long f7l8() {
        return m19078g().getLong(f31022q, 0L);
    }

    /* JADX INFO: renamed from: g */
    SharedPreferences m19078g() {
        return this.f72964zy.getSharedPreferences(f31021n, 0);
    }

    @Override // com.xiaomi.accountsdk.utils.C5578t.k
    /* JADX INFO: renamed from: k */
    public void mo19079k(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("serverDate == null");
        }
        if (this.f72963toq.get()) {
            return;
        }
        m19082q(date);
        this.f72963toq.set(true);
    }

    void ld6(long j2) {
        this.f31023k = j2;
    }

    /* JADX INFO: renamed from: n */
    long m19080n() {
        return this.f31023k;
    }

    /* JADX INFO: renamed from: p */
    void m19081p(long j2) {
        m19078g().edit().putLong(f31022q, j2).apply();
    }

    /* JADX INFO: renamed from: q */
    void m19082q(Date date) {
        long time = date.getTime();
        this.f31023k = time - SystemClock.elapsedRealtime();
        m19081p(time - System.currentTimeMillis());
        C5578t.zy();
        jk.zy().m19089n(date);
    }

    /* JADX INFO: renamed from: s */
    void m19083s(boolean z2) {
        this.f72963toq.set(z2);
    }

    @Override // com.xiaomi.accountsdk.utils.C5578t.k
    public long toq() {
        if (this.f72963toq.get()) {
            return SystemClock.elapsedRealtime() + this.f31023k;
        }
        return System.currentTimeMillis() + f7l8();
    }

    @Override // com.xiaomi.accountsdk.utils.C5578t.k
    public void zy(String str, String str2) {
        if (!this.f72963toq.get() && m19077y(str)) {
            try {
                mo19079k(ld6.zy(str2));
            } catch (ParseException e2) {
                AbstractC5574n.o1t(f31020g, e2);
            }
        }
    }
}
