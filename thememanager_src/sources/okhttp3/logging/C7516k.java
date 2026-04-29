package okhttp3.logging;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C6163t;
import kotlin.collections.a98o;
import kotlin.hb;
import kotlin.jvm.internal.C6311u;
import kotlin.jvm.internal.d2ok;
import kotlin.ld6;
import kotlin.qrj;
import kotlin.text.a9;
import l05.InterfaceC6765n;
import l05.InterfaceC6768s;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;
import okhttp3.InterfaceC7525p;
import okhttp3.fn3e;
import okhttp3.fti;
import okhttp3.fu4;
import okhttp3.internal.http.C7459n;
import okhttp3.internal.platform.C7498p;
import okhttp3.jk;
import okhttp3.jp0y;
import okhttp3.ni7;
import okio.C7576t;
import okio.n7h;
import okio.x2;

/* JADX INFO: renamed from: okhttp3.logging.k */
/* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7516k implements ni7 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final toq f43488k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private volatile k f43489n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private volatile Set<String> f43490q;

    /* JADX INFO: renamed from: okhttp3.logging.k$k */
    /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
    public enum k {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* JADX INFO: renamed from: okhttp3.logging.k$toq */
    /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
    public interface toq {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        public static final k f43492k = k.f43493k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        @InterfaceC6765n
        public static final toq f94066toq = new k.C8128k();

        /* JADX INFO: renamed from: okhttp3.logging.k$toq$k */
        /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
        public static final class k {

            /* JADX INFO: renamed from: k */
            static final /* synthetic */ k f43493k = new k();

            /* JADX INFO: renamed from: okhttp3.logging.k$toq$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
            private static final class C8128k implements toq {
                @Override // okhttp3.logging.C7516k.toq
                /* JADX INFO: renamed from: k */
                public void mo27364k(@InterfaceC7396q String message) {
                    d2ok.m23075h(message, "message");
                    C7498p.n7h(C7498p.f43366k.f7l8(), message, 0, null, 6, null);
                }
            }

            private k() {
            }
        }

        /* JADX INFO: renamed from: k */
        void mo27364k(@InterfaceC7396q String str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6768s
    public C7516k() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @InterfaceC6768s
    public C7516k(@InterfaceC7396q toq logger) {
        d2ok.m23075h(logger, "logger");
        this.f43488k = logger;
        this.f43490q = a98o.ld6();
        this.f43489n = k.NONE;
    }

    /* JADX INFO: renamed from: g */
    private final void m27360g(fn3e fn3eVar, int i2) {
        String strN7h = this.f43490q.contains(fn3eVar.m26864y(i2)) ? "██" : fn3eVar.n7h(i2);
        this.f43488k.mo27364k(fn3eVar.m26864y(i2) + ": " + strN7h);
    }

    private final boolean zy(fn3e fn3eVar) {
        String strZy = fn3eVar.zy(com.google.common.net.zy.f68552uv6);
        return (strZy == null || a9.e5(strZy, "identity", true) || a9.e5(strZy, "gzip", true)) ? false : true;
    }

    public final void f7l8(@InterfaceC7396q String name) {
        d2ok.m23075h(name, "name");
        TreeSet treeSet = new TreeSet(a9.oki(C6311u.f36447k));
        C6163t.zp(treeSet, this.f43490q);
        treeSet.add(name);
        this.f43490q = treeSet;
    }

    @Override // okhttp3.ni7
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public fti mo6886k(@InterfaceC7396q ni7.InterfaceC7521k chain) throws Exception {
        String string;
        String str;
        char c2;
        String string2;
        Charset UTF_8;
        Charset UTF_82;
        d2ok.m23075h(chain, "chain");
        k kVar = this.f43489n;
        jk jkVarZy = chain.zy();
        if (kVar == k.NONE) {
            return chain.mo27071q(jkVarZy);
        }
        boolean z2 = kVar == k.BODY;
        boolean z3 = z2 || kVar == k.HEADERS;
        okhttp3.a9 a9VarM27305g = jkVarZy.m27305g();
        InterfaceC7525p interfaceC7525pF7l8 = chain.f7l8();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(jkVarZy.qrj());
        sb.append(' ');
        sb.append(jkVarZy.cdj());
        if (interfaceC7525pF7l8 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(' ');
            sb2.append(interfaceC7525pF7l8.mo27020k());
            string = sb2.toString();
        } else {
            string = "";
        }
        sb.append(string);
        String string3 = sb.toString();
        if (!z3 && a9VarM27305g != null) {
            string3 = string3 + " (" + a9VarM27305g.mo26833k() + "-byte body)";
        }
        this.f43488k.mo27364k(string3);
        if (z3) {
            fn3e fn3eVarLd6 = jkVarZy.ld6();
            if (a9VarM27305g != null) {
                fu4 qVar = a9VarM27305g.toq();
                if (qVar != null && fn3eVarLd6.zy(com.google.common.net.zy.f68571zy) == null) {
                    this.f43488k.mo27364k("Content-Type: " + qVar);
                }
                if (a9VarM27305g.mo26833k() != -1 && fn3eVarLd6.zy(com.google.common.net.zy.f68551toq) == null) {
                    this.f43488k.mo27364k("Content-Length: " + a9VarM27305g.mo26833k());
                }
            }
            int size = fn3eVarLd6.size();
            for (int i2 = 0; i2 < size; i2++) {
                m27360g(fn3eVarLd6, i2);
            }
            if (!z2 || a9VarM27305g == null) {
                this.f43488k.mo27364k("--> END " + jkVarZy.qrj());
            } else if (zy(jkVarZy.ld6())) {
                this.f43488k.mo27364k("--> END " + jkVarZy.qrj() + " (encoded body omitted)");
            } else if (a9VarM27305g.m26832h()) {
                this.f43488k.mo27364k("--> END " + jkVarZy.qrj() + " (duplex request body omitted)");
            } else if (a9VarM27305g.cdj()) {
                this.f43488k.mo27364k("--> END " + jkVarZy.qrj() + " (one-shot body omitted)");
            } else {
                x2 x2Var = new x2();
                a9VarM27305g.ki(x2Var);
                fu4 qVar2 = a9VarM27305g.toq();
                if (qVar2 == null || (UTF_82 = qVar2.m26904g(StandardCharsets.UTF_8)) == null) {
                    UTF_82 = StandardCharsets.UTF_8;
                    d2ok.kja0(UTF_82, "UTF_8");
                }
                this.f43488k.mo27364k("");
                if (zy.m27365k(x2Var)) {
                    this.f43488k.mo27364k(x2Var.se(UTF_82));
                    this.f43488k.mo27364k("--> END " + jkVarZy.qrj() + " (" + a9VarM27305g.mo26833k() + "-byte body)");
                } else {
                    this.f43488k.mo27364k("--> END " + jkVarZy.qrj() + " (binary " + a9VarM27305g.mo26833k() + "-byte body omitted)");
                }
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            fti ftiVarMo27071q = chain.mo27071q(jkVarZy);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            jp0y jp0yVarHyr = ftiVarMo27071q.hyr();
            d2ok.qrj(jp0yVarHyr);
            long jX2 = jp0yVarHyr.x2();
            String str2 = jX2 != -1 ? jX2 + "-byte" : "unknown-length";
            toq toqVar = this.f43488k;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("<-- ");
            sb3.append(ftiVarMo27071q.i1());
            if (ftiVarMo27071q.bek6().length() == 0) {
                str = "-byte body omitted)";
                string2 = "";
                c2 = ' ';
            } else {
                String strBek6 = ftiVarMo27071q.bek6();
                StringBuilder sb4 = new StringBuilder();
                str = "-byte body omitted)";
                c2 = ' ';
                sb4.append(' ');
                sb4.append(strBek6);
                string2 = sb4.toString();
            }
            sb3.append(string2);
            sb3.append(c2);
            sb3.append(ftiVarMo27071q.wlev().cdj());
            sb3.append(" (");
            sb3.append(millis);
            sb3.append("ms");
            sb3.append(z3 ? "" : ", " + str2 + " body");
            sb3.append(')');
            toqVar.mo27364k(sb3.toString());
            if (z3) {
                fn3e fn3eVarLtg8 = ftiVarMo27071q.ltg8();
                int size2 = fn3eVarLtg8.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    m27360g(fn3eVarLtg8, i3);
                }
                if (!z2 || !C7459n.zy(ftiVarMo27071q)) {
                    this.f43488k.mo27364k("<-- END HTTP");
                } else if (zy(ftiVarMo27071q.ltg8())) {
                    this.f43488k.mo27364k("<-- END HTTP (encoded body omitted)");
                } else {
                    n7h n7hVarY9n = jp0yVarHyr.y9n();
                    n7hVarY9n.bf2(Long.MAX_VALUE);
                    x2 x2VarMo27611g = n7hVarY9n.mo27611g();
                    Long l2 = null;
                    if (a9.e5("gzip", fn3eVarLtg8.zy(com.google.common.net.zy.f68552uv6), true)) {
                        Long lValueOf = Long.valueOf(x2VarMo27611g.size());
                        C7576t c7576t = new C7576t(x2VarMo27611g.clone());
                        try {
                            x2VarMo27611g = new x2();
                            x2VarMo27611g.ek5k(c7576t);
                            kotlin.io.zy.m23032k(c7576t, null);
                            l2 = lValueOf;
                        } finally {
                        }
                    }
                    fu4 fu4VarMo27094h = jp0yVarHyr.mo27094h();
                    if (fu4VarMo27094h == null || (UTF_8 = fu4VarMo27094h.m26904g(StandardCharsets.UTF_8)) == null) {
                        UTF_8 = StandardCharsets.UTF_8;
                        d2ok.kja0(UTF_8, "UTF_8");
                    }
                    if (!zy.m27365k(x2VarMo27611g)) {
                        this.f43488k.mo27364k("");
                        this.f43488k.mo27364k("<-- END HTTP (binary " + x2VarMo27611g.size() + str);
                        return ftiVarMo27071q;
                    }
                    if (jX2 != 0) {
                        this.f43488k.mo27364k("");
                        this.f43488k.mo27364k(x2VarMo27611g.clone().se(UTF_8));
                    }
                    if (l2 != null) {
                        this.f43488k.mo27364k("<-- END HTTP (" + x2VarMo27611g.size() + "-byte, " + l2 + "-gzipped-byte body)");
                    } else {
                        this.f43488k.mo27364k("<-- END HTTP (" + x2VarMo27611g.size() + "-byte body)");
                    }
                }
            }
            return ftiVarMo27071q;
        } catch (Exception e2) {
            this.f43488k.mo27364k("<-- HTTP FAILED: " + e2);
            throw e2;
        }
    }

    @InterfaceC6769y(name = "level")
    /* JADX INFO: renamed from: n */
    public final void m27361n(@InterfaceC7396q k kVar) {
        d2ok.m23075h(kVar, "<set-?>");
        this.f43489n = kVar;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public final k m27362q() {
        return this.f43489n;
    }

    @InterfaceC7396q
    @ld6(level = qrj.ERROR, message = "moved to var", replaceWith = @hb(expression = "level", imports = {}))
    @InterfaceC6769y(name = "-deprecated_level")
    public final k toq() {
        return this.f43489n;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public final C7516k m27363y(@InterfaceC7396q k level) {
        d2ok.m23075h(level, "level");
        this.f43489n = level;
        return this;
    }

    public /* synthetic */ C7516k(toq toqVar, int i2, kotlin.jvm.internal.ni7 ni7Var) {
        this((i2 & 1) != 0 ? toq.f94066toq : toqVar);
    }
}
