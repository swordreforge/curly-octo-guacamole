package com.xiaomi.accountsdk.request;

import android.os.SystemClock;
import com.xiaomi.accountsdk.request.fu4;
import com.xiaomi.accountsdk.request.wvg;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: RequestWithIP.java */
/* JADX INFO: loaded from: classes3.dex */
public class ni7 extends t8r {

    /* JADX INFO: renamed from: q */
    private static final String f30966q = "RequestWithIP";

    /* JADX INFO: renamed from: k */
    private final zurt f30967k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final ld6 f72936toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final fu4 f72937zy;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.request.ni7$k */
    /* JADX INFO: compiled from: RequestWithIP.java */
    static class C5546k {

        /* JADX INFO: renamed from: k */
        wvg.C5555y f30968k = null;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        long f72938toq = 0;

        C5546k() {
        }
    }

    public ni7(zurt zurtVar, ld6 ld6Var, fu4 fu4Var) {
        if (zurtVar == null || ld6Var == null) {
            throw new IllegalArgumentException();
        }
        this.f30967k = zurtVar;
        this.f72936toq = ld6Var;
        this.f72937zy = new fu4.C5535k(new f7l8(), fu4Var);
    }

    /* JADX INFO: renamed from: n */
    static boolean m18972n(zurt zurtVar, String str, String str2, C5546k c5546k) throws fn3e {
        if (zurtVar == null || str == null || str2 == null || c5546k == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            try {
                zurt zurtVarZy = zurtVar.zy();
                C5538i c5538i = zurtVarZy.f30999k;
                c5538i.f72928zy.put("host", str);
                c5538i.f30938g = c5538i.f30938g.replaceFirst(str, str2);
                wvg.C5555y c5555yMo18922k = zurtVarZy.mo18922k();
                c5546k.f30968k = c5555yMo18922k;
                boolean z2 = c5555yMo18922k != null;
                String strValueOf = String.valueOf(z2);
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                c5546k.f72938toq = jElapsedRealtime2;
                AbstractC5574n.m19111k(f30966q, String.format("visit with ip, host=%s, ip=%s, time=%s, result=%s", str, str2, Long.valueOf(jElapsedRealtime2), strValueOf));
                return z2;
            } catch (IOException e2) {
                String str3 = String.format("IOError,%s", e2.getMessage());
                long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                c5546k.f72938toq = jElapsedRealtime3;
                AbstractC5574n.m19111k(f30966q, String.format("visit with ip, host=%s, ip=%s, time=%s, result=%s", str, str2, Long.valueOf(jElapsedRealtime3), str3));
                return false;
            }
        } catch (Throwable th) {
            long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            c5546k.f72938toq = jElapsedRealtime4;
            AbstractC5574n.m19111k(f30966q, String.format("visit with ip, host=%s, ip=%s, time=%s, result=%s", str, str2, Long.valueOf(jElapsedRealtime4), null));
            throw th;
        }
    }

    /* JADX INFO: renamed from: q */
    private wvg.C5555y m18973q() throws MalformedURLException, fn3e {
        boolean z2;
        List<String> qVar;
        String host = new URL(this.f30967k.f30999k.f30938g).getHost();
        C5546k c5546k = new C5546k();
        this.f72937zy.zurt();
        HashSet hashSet = new HashSet();
        try {
            String strM18961q = this.f72936toq.m18961q(host);
            this.f72937zy.mo18928p(strM18961q);
            boolean z3 = true;
            if (m18972n(this.f30967k, host, strM18961q, c5546k)) {
                this.f72936toq.zurt(host, strM18961q, c5546k.f72938toq);
                this.f72937zy.ld6();
                z2 = true;
            } else {
                this.f72937zy.mo18929s();
                z2 = false;
            }
            hashSet.add(strM18961q);
            if (!z2) {
                this.f72937zy.kja0();
                String strM18959n = this.f72936toq.m18959n(host, strM18961q);
                this.f72937zy.n7h(strM18959n);
                this.f72937zy.mo18926h(strM18959n);
                if (hashSet.contains(strM18959n) || !m18972n(this.f30967k, host, strM18959n, c5546k)) {
                    this.f72937zy.x2();
                } else {
                    this.f72936toq.fn3e(host, strM18959n);
                    this.f72937zy.qrj();
                    z2 = true;
                }
                hashSet.add(strM18959n);
            }
            if (z2 || (qVar = this.f72936toq.toq(host)) == null) {
                z3 = z2;
            } else {
                for (int i2 = 0; i2 < qVar.size(); i2++) {
                    String str = qVar.get(i2);
                    if (hashSet.contains(str)) {
                        this.f72937zy.mo18925g(i2);
                    } else {
                        hashSet.add(str);
                        zurt zurtVarZy = this.f30967k.zy();
                        zurtVarZy.f30999k.m18942p(10000);
                        this.f72937zy.f7l8(i2, str);
                        if (m18972n(zurtVarZy, host, str, c5546k)) {
                            this.f72936toq.fn3e(host, str);
                            this.f72937zy.mo18930y(i2);
                            break;
                        }
                        this.f72937zy.mo18925g(i2);
                    }
                }
                z3 = z2;
            }
            if (z3) {
                this.f72937zy.t8r();
            } else {
                this.f72937zy.mo18927i();
            }
            if (!z3) {
                return null;
            }
            this.f72936toq.ki(host);
            return c5546k.f30968k;
        } catch (fn3e e2) {
            this.f72937zy.fn3e();
            this.f72936toq.ki(host);
            throw e2;
        }
    }

    private wvg.C5555y zy() throws Throwable {
        this.f72937zy.ki();
        boolean z2 = true;
        try {
            wvg.C5555y c5555yMo18922k = this.f30967k.mo18922k();
            this.f72937zy.cdj(true);
            return c5555yMo18922k;
        } catch (IOException e2) {
            try {
                throw e2;
            } catch (Throwable th) {
                th = th;
                z2 = false;
                this.f72937zy.cdj(z2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            this.f72937zy.cdj(z2);
            throw th;
        }
    }

    @Override // com.xiaomi.accountsdk.request.t8r
    /* JADX INFO: renamed from: k */
    public wvg.C5555y mo18922k() throws fn3e, IOException {
        wvg.C5555y c5555yZy;
        this.f72937zy.ni7();
        try {
            if (this.f30967k.m19042n() || (c5555yZy = m18973q()) == null) {
                c5555yZy = zy();
            }
            return c5555yZy;
        } finally {
            this.f72937zy.mo18931n();
        }
    }
}
