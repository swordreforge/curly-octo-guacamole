package okhttp3.internal.cache;

import b7.C1359g;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlin.text.a9;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.C7526q;
import okhttp3.fn3e;
import okhttp3.fti;
import okhttp3.jk;

/* JADX INFO: compiled from: CacheStrategy.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class zy {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    public static final C7441k f93844zy = new C7441k(null);

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private final jk f43021k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7395n
    private final fti f93845toq;

    /* JADX INFO: renamed from: okhttp3.internal.cache.zy$k */
    /* JADX INFO: compiled from: CacheStrategy.kt */
    public static final class C7441k {
        private C7441k() {
        }

        public /* synthetic */ C7441k(ni7 ni7Var) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean m26965k(@mub.InterfaceC7396q okhttp3.fti r5, @mub.InterfaceC7396q okhttp3.jk r6) {
            /*
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.d2ok.m23075h(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.d2ok.m23075h(r6, r0)
                int r0 = r5.i1()
                r1 = 200(0xc8, float:2.8E-43)
                r2 = 0
                if (r0 == r1) goto L65
                r1 = 410(0x19a, float:5.75E-43)
                if (r0 == r1) goto L65
                r1 = 414(0x19e, float:5.8E-43)
                if (r0 == r1) goto L65
                r1 = 501(0x1f5, float:7.02E-43)
                if (r0 == r1) goto L65
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 == r1) goto L65
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 == r1) goto L65
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L3b
                r1 = 308(0x134, float:4.32E-43)
                if (r0 == r1) goto L65
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L65
                r1 = 405(0x195, float:5.68E-43)
                if (r0 == r1) goto L65
                switch(r0) {
                    case 300: goto L65;
                    case 301: goto L65;
                    case 302: goto L3b;
                    default: goto L3a;
                }
            L3a:
                return r2
            L3b:
                r0 = 2
                java.lang.String r1 = "Expires"
                r3 = 0
                java.lang.String r0 = okhttp3.fti.g1(r5, r1, r3, r0, r3)
                if (r0 != 0) goto L65
                okhttp3.q r0 = r5.m26879f()
                int r0 = r0.n7h()
                r1 = -1
                if (r0 != r1) goto L65
                okhttp3.q r0 = r5.m26879f()
                boolean r0 = r0.qrj()
                if (r0 != 0) goto L65
                okhttp3.q r0 = r5.m26879f()
                boolean r0 = r0.x2()
                if (r0 != 0) goto L65
                return r2
            L65:
                okhttp3.q r5 = r5.m26879f()
                boolean r5 = r5.t8r()
                if (r5 != 0) goto L7a
                okhttp3.q r5 = r6.f7l8()
                boolean r5 = r5.t8r()
                if (r5 != 0) goto L7a
                r2 = 1
            L7a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.zy.C7441k.m26965k(okhttp3.fti, okhttp3.jk):boolean");
        }
    }

    /* JADX INFO: compiled from: CacheStrategy.kt */
    public static final class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @InterfaceC7395n
        private String f93846f7l8;

        /* JADX INFO: renamed from: g */
        @InterfaceC7395n
        private Date f43022g;

        /* JADX INFO: renamed from: k */
        private final long f43023k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        @InterfaceC7395n
        private String f93847ld6;

        /* JADX INFO: renamed from: n */
        @InterfaceC7395n
        private String f43024n;

        /* JADX INFO: renamed from: p */
        private long f43025p;

        /* JADX INFO: renamed from: q */
        @InterfaceC7395n
        private Date f43026q;

        /* JADX INFO: renamed from: s */
        private long f43027s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private final jk f93848toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private int f93849x2;

        /* JADX INFO: renamed from: y */
        @InterfaceC7395n
        private Date f43028y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7395n
        private final fti f93850zy;

        public toq(long j2, @InterfaceC7396q jk request, @InterfaceC7395n fti ftiVar) {
            d2ok.m23075h(request, "request");
            this.f43023k = j2;
            this.f93848toq = request;
            this.f93850zy = ftiVar;
            this.f93849x2 = -1;
            if (ftiVar != null) {
                this.f43027s = ftiVar.ga();
                this.f43025p = ftiVar.h4b();
                fn3e fn3eVarLtg8 = ftiVar.ltg8();
                int size = fn3eVarLtg8.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String strM26864y = fn3eVarLtg8.m26864y(i2);
                    String strN7h = fn3eVarLtg8.n7h(i2);
                    if (a9.e5(strM26864y, com.google.common.net.zy.f27260q, true)) {
                        this.f43026q = okhttp3.internal.http.zy.m27095k(strN7h);
                        this.f43024n = strN7h;
                    } else if (a9.e5(strM26864y, com.google.common.net.zy.f68490bf2, true)) {
                        this.f43028y = okhttp3.internal.http.zy.m27095k(strN7h);
                    } else if (a9.e5(strM26864y, com.google.common.net.zy.f68517i1, true)) {
                        this.f43022g = okhttp3.internal.http.zy.m27095k(strN7h);
                        this.f93846f7l8 = strN7h;
                    } else if (a9.e5(strM26864y, com.google.common.net.zy.f27245b, true)) {
                        this.f93847ld6 = strN7h;
                    } else if (a9.e5(strM26864y, com.google.common.net.zy.f27249f, true)) {
                        this.f93849x2 = C1359g.i1(strN7h, -1);
                    }
                }
            }
        }

        private final boolean f7l8() {
            fti ftiVar = this.f93850zy;
            d2ok.qrj(ftiVar);
            return ftiVar.m26879f().n7h() == -1 && this.f43028y == null;
        }

        /* JADX INFO: renamed from: g */
        private final boolean m26966g(jk jkVar) {
            return (jkVar.m27311s(com.google.common.net.zy.f27268z) == null && jkVar.m27311s(com.google.common.net.zy.f68539o1t) == null) ? false : true;
        }

        /* JADX INFO: renamed from: k */
        private final long m26967k() {
            Date date = this.f43026q;
            long jMax = date != null ? Math.max(0L, this.f43025p - date.getTime()) : 0L;
            int i2 = this.f93849x2;
            if (i2 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i2));
            }
            long j2 = this.f43025p;
            return jMax + (j2 - this.f43027s) + (this.f43023k - j2);
        }

        /* JADX INFO: renamed from: q */
        private final long m26968q() {
            fti ftiVar = this.f93850zy;
            d2ok.qrj(ftiVar);
            if (ftiVar.m26879f().n7h() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.n7h());
            }
            Date date = this.f43028y;
            if (date != null) {
                Date date2 = this.f43026q;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f43025p);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f43022g == null || this.f93850zy.wlev().cdj().dd() != null) {
                return 0L;
            }
            Date date3 = this.f43026q;
            long time2 = date3 != null ? date3.getTime() : this.f43027s;
            Date date4 = this.f43022g;
            d2ok.qrj(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / ((long) 10);
            }
            return 0L;
        }

        private final zy zy() {
            if (this.f93850zy == null) {
                return new zy(this.f93848toq, null);
            }
            if (this.f93848toq.x2() && this.f93850zy.m26886x() == null) {
                return new zy(this.f93848toq, null);
            }
            if (!zy.f93844zy.m26965k(this.f93850zy, this.f93848toq)) {
                return new zy(this.f93848toq, null);
            }
            C7526q c7526qF7l8 = this.f93848toq.f7l8();
            if (c7526qF7l8.ki() || m26966g(this.f93848toq)) {
                return new zy(this.f93848toq, null);
            }
            C7526q c7526qM26879f = this.f93850zy.m26879f();
            long jM26967k = m26967k();
            long jM26968q = m26968q();
            if (c7526qF7l8.n7h() != -1) {
                jM26968q = Math.min(jM26968q, TimeUnit.SECONDS.toMillis(c7526qF7l8.n7h()));
            }
            long millis = 0;
            long millis2 = c7526qF7l8.m27379h() != -1 ? TimeUnit.SECONDS.toMillis(c7526qF7l8.m27379h()) : 0L;
            if (!c7526qM26879f.cdj() && c7526qF7l8.kja0() != -1) {
                millis = TimeUnit.SECONDS.toMillis(c7526qF7l8.kja0());
            }
            if (!c7526qM26879f.ki()) {
                long j2 = millis2 + jM26967k;
                if (j2 < millis + jM26968q) {
                    fti.C7433k c7433kIj = this.f93850zy.ij();
                    if (j2 >= jM26968q) {
                        c7433kIj.m26892k(com.google.common.net.zy.f68505f7l8, "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jM26967k > 86400000 && f7l8()) {
                        c7433kIj.m26892k(com.google.common.net.zy.f68505f7l8, "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new zy(null, c7433kIj.zy());
                }
            }
            String str = this.f93847ld6;
            String str2 = com.google.common.net.zy.f27268z;
            if (str != null) {
                str2 = com.google.common.net.zy.f68539o1t;
            } else if (this.f43022g != null) {
                str = this.f93846f7l8;
            } else {
                if (this.f43026q == null) {
                    return new zy(this.f93848toq, null);
                }
                str = this.f43024n;
            }
            fn3e.C7432k c7432kM26862p = this.f93848toq.ld6().m26862p();
            d2ok.qrj(str);
            c7432kM26862p.f7l8(str2, str);
            return new zy(this.f93848toq.n7h().kja0(c7432kM26862p.m26870s()).toq(), this.f93850zy);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public final jk m26969n() {
            return this.f93848toq;
        }

        @InterfaceC7396q
        public final zy toq() {
            zy zyVarZy = zy();
            return (zyVarZy.toq() == null || !this.f93848toq.f7l8().fn3e()) ? zyVarZy : new zy(null, null);
        }
    }

    public zy(@InterfaceC7395n jk jkVar, @InterfaceC7395n fti ftiVar) {
        this.f43021k = jkVar;
        this.f93845toq = ftiVar;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public final fti m26964k() {
        return this.f93845toq;
    }

    @InterfaceC7395n
    public final jk toq() {
        return this.f43021k;
    }
}
