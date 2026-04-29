package com.xiaomi.onetrack.util.oaid;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.exoplayer2.C3548p;
import com.xiaomi.onetrack.util.C5781n;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5805q;
import com.xiaomi.onetrack.util.C5811w;
import com.xiaomi.onetrack.util.oaid.helpers.C5792b;
import com.xiaomi.onetrack.util.oaid.helpers.C5797g;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.a */
/* JADX INFO: loaded from: classes3.dex */
public class C5783a {

    /* JADX INFO: renamed from: a */
    private static final String f32335a = "a";

    /* JADX INFO: renamed from: b */
    private static volatile C5783a f32336b;

    /* JADX INFO: renamed from: d */
    private static long f32337d;

    /* JADX INFO: renamed from: c */
    private volatile String f32338c = "";

    /* JADX INFO: renamed from: e */
    private final int f32339e = 3;

    /* JADX INFO: renamed from: f */
    private volatile int f32340f = 0;

    /* JADX INFO: renamed from: g */
    private boolean f32341g = false;

    /* JADX INFO: renamed from: a */
    public static C5783a m20293a() {
        if (f32336b == null) {
            synchronized (C5783a.class) {
                if (f32336b == null) {
                    f32336b = new C5783a();
                }
            }
        }
        return f32336b;
    }

    /* JADX INFO: renamed from: d */
    private boolean m20294d() {
        if (this.f32340f > 3) {
            return true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jAbs = Math.abs(jElapsedRealtime - f32337d);
        if (this.f32340f == 1) {
            if (jAbs < C3548p.f65176gcp) {
                return true;
            }
        } else if (this.f32340f == 2) {
            if (jAbs < 10000) {
                return true;
            }
        } else if (this.f32340f == 3 && jAbs < 60000) {
            return true;
        }
        C5804p.m20342a(f32335a, "get time：" + this.f32340f);
        f32337d = jElapsedRealtime;
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m20297b() {
        this.f32340f = 0;
    }

    /* JADX INFO: renamed from: c */
    public boolean m20298c() {
        return (this.f32338c == null || this.f32338c.equals("")) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public void m20296a(boolean z2) {
        this.f32341g = z2;
        C5804p.m20342a(f32335a, "setCloseOaidDependMsaSDK：" + this.f32341g);
    }

    /* JADX INFO: renamed from: a */
    public String m20295a(Context context) {
        String strM20328a;
        synchronized (this.f32338c) {
            if (C5811w.m20402a()) {
                if (!C5804p.f32410a) {
                    C5804p.m20347b(f32335a, "getOaid() throw exception : Don't use it on the main thread");
                    return "";
                }
                throw new IllegalStateException("Don't use it on the main thread");
            }
            if (this.f32338c != null && !this.f32338c.equals("")) {
                return this.f32338c;
            }
            if (m20294d()) {
                C5804p.m20342a(f32335a, "isNotAllowedGetOaid");
                return this.f32338c;
            }
            if (C5805q.m20359a()) {
                this.f32338c = C5781n.m20283a(context);
                this.f32340f++;
                return this.f32338c;
            }
            if (!this.f32341g && (strM20328a = new C5797g().m20328a(context)) != null && !strM20328a.equals("")) {
                this.f32338c = strM20328a;
                this.f32340f++;
                return strM20328a;
            }
            String strM20317a = new C5792b().m20317a(context);
            if (strM20317a != null && !strM20317a.equals("")) {
                this.f32338c = strM20317a;
                this.f32340f++;
                return strM20317a;
            }
            this.f32340f++;
            return this.f32338c;
        }
    }
}
