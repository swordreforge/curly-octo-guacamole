package okhttp3;

import b7.C1359g;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import kotlin.collections.a98o;
import kotlin.hb;
import kotlin.jvm.internal.C6311u;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.was;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.fn3e;
import okhttp3.fti;
import okhttp3.internal.cache.C7440q;
import okhttp3.internal.concurrent.C7445q;
import okhttp3.internal.http.C7456g;
import okhttp3.internal.io.InterfaceC7483k;
import okhttp3.internal.platform.C7498p;
import okhttp3.jk;
import okio.AbstractC7579z;
import okio.kja0;
import okio.nn86;
import okio.vyq;
import r6ty.InterfaceC7627q;

/* JADX INFO: compiled from: Cache.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class zy implements Closeable, Flushable {

    /* JADX INFO: renamed from: h */
    private static final int f43645h = 201105;

    /* JADX INFO: renamed from: i */
    private static final int f43646i = 0;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    public static final toq f43647p = new toq(null);

    /* JADX INFO: renamed from: t */
    private static final int f43648t = 2;

    /* JADX INFO: renamed from: z */
    private static final int f43649z = 1;

    /* JADX INFO: renamed from: g */
    private int f43650g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final C7440q f43651k;

    /* JADX INFO: renamed from: n */
    private int f43652n;

    /* JADX INFO: renamed from: q */
    private int f43653q;

    /* JADX INFO: renamed from: s */
    private int f43654s;

    /* JADX INFO: renamed from: y */
    private int f43655y;

    /* JADX INFO: renamed from: okhttp3.zy$k */
    /* JADX INFO: compiled from: Cache.kt */
    private static final class C7536k extends jp0y {

        /* JADX INFO: renamed from: g */
        @InterfaceC7395n
        private final String f43656g;

        /* JADX INFO: renamed from: n */
        @InterfaceC7396q
        private final C7440q.q f43657n;

        /* JADX INFO: renamed from: s */
        @InterfaceC7396q
        private final okio.n7h f43658s;

        /* JADX INFO: renamed from: y */
        @InterfaceC7395n
        private final String f43659y;

        /* JADX INFO: renamed from: okhttp3.zy$k$k */
        /* JADX INFO: compiled from: Cache.kt */
        public static final class k extends AbstractC7579z {

            /* JADX INFO: renamed from: q */
            final /* synthetic */ C7536k f43660q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(nn86 nn86Var, C7536k c7536k) {
                super(nn86Var);
                this.f43660q = c7536k;
            }

            @Override // okio.AbstractC7579z, okio.nn86, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f43660q.a98o().close();
                super.close();
            }
        }

        public C7536k(@InterfaceC7396q C7440q.q snapshot, @InterfaceC7395n String str, @InterfaceC7395n String str2) {
            d2ok.m23075h(snapshot, "snapshot");
            this.f43657n = snapshot;
            this.f43656g = str;
            this.f43659y = str2;
            this.f43658s = okio.d2ok.m27592n(new k(snapshot.m26949q(1), this));
        }

        @InterfaceC7396q
        public final C7440q.q a98o() {
            return this.f43657n;
        }

        @Override // okhttp3.jp0y
        @InterfaceC7395n
        /* JADX INFO: renamed from: h */
        public fu4 mo27094h() {
            String str = this.f43656g;
            if (str != null) {
                return fu4.f42952n.m26909q(str);
            }
            return null;
        }

        @Override // okhttp3.jp0y
        public long x2() {
            String str = this.f43659y;
            if (str != null) {
                return C1359g.bf2(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.jp0y
        @InterfaceC7396q
        public okio.n7h y9n() {
            return this.f43658s;
        }
    }

    /* JADX INFO: renamed from: okhttp3.zy$n */
    /* JADX INFO: compiled from: Cache.kt */
    @lv5({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nokhttp3/Cache$urls$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,788:1\n1#2:789\n*E\n"})
    public static final class C7537n implements Iterator<String>, InterfaceC7627q {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final Iterator<C7440q.q> f43661k;

        /* JADX INFO: renamed from: n */
        private boolean f43662n;

        /* JADX INFO: renamed from: q */
        @InterfaceC7395n
        private String f43663q;

        C7537n(zy zyVar) {
            this.f43661k = zyVar.x2().ga();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f43663q != null) {
                return true;
            }
            this.f43662n = false;
            while (this.f43661k.hasNext()) {
                try {
                    C7440q.q next = this.f43661k.next();
                    try {
                        continue;
                        this.f43663q = okio.d2ok.m27592n(next.m26949q(0)).zp();
                        kotlin.io.zy.m23032k(next, null);
                        return true;
                    } finally {
                        try {
                            continue;
                        } catch (Throwable th) {
                        }
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        @InterfaceC7396q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f43663q;
            d2ok.qrj(str);
            this.f43663q = null;
            this.f43662n = true;
            return str;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f43662n) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            this.f43661k.remove();
        }
    }

    /* JADX INFO: renamed from: okhttp3.zy$q */
    /* JADX INFO: compiled from: Cache.kt */
    private final class C7538q implements okhttp3.internal.cache.toq {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final C7440q.toq f43664k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ zy f43665n;

        /* JADX INFO: renamed from: q */
        private boolean f43666q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private final vyq f94252toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        private final vyq f94253zy;

        /* JADX INFO: renamed from: okhttp3.zy$q$k */
        /* JADX INFO: compiled from: Cache.kt */
        public static final class k extends okio.fu4 {

            /* JADX INFO: renamed from: n */
            final /* synthetic */ C7538q f43667n;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ zy f43668q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(zy zyVar, C7538q c7538q, vyq vyqVar) {
                super(vyqVar);
                this.f43668q = zyVar;
                this.f43667n = c7538q;
            }

            @Override // okio.fu4, okio.vyq, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                zy zyVar = this.f43668q;
                C7538q c7538q = this.f43667n;
                synchronized (zyVar) {
                    if (c7538q.zy()) {
                        return;
                    }
                    c7538q.m27562q(true);
                    zyVar.a98o(zyVar.ki() + 1);
                    super.close();
                    this.f43667n.f43664k.toq();
                }
            }
        }

        public C7538q(@InterfaceC7396q zy zyVar, C7440q.toq editor) {
            d2ok.m23075h(editor, "editor");
            this.f43665n = zyVar;
            this.f43664k = editor;
            vyq vyqVarM26951g = editor.m26951g(1);
            this.f94252toq = vyqVarM26951g;
            this.f94253zy = new k(zyVar, this, vyqVarM26951g);
        }

        @Override // okhttp3.internal.cache.toq
        public void abort() {
            zy zyVar = this.f43665n;
            synchronized (zyVar) {
                if (this.f43666q) {
                    return;
                }
                this.f43666q = true;
                zyVar.i1(zyVar.m27555h() + 1);
                C1359g.kja0(this.f94252toq);
                try {
                    this.f43664k.m26952k();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.toq
        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public vyq mo26963k() {
            return this.f94253zy;
        }

        /* JADX INFO: renamed from: q */
        public final void m27562q(boolean z2) {
            this.f43666q = z2;
        }

        public final boolean zy() {
            return this.f43666q;
        }
    }

    /* JADX INFO: compiled from: Cache.kt */
    @lv5({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,788:1\n2624#2,3:789\n*S KotlinDebug\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n*L\n729#1:789,3\n*E\n"})
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: renamed from: n */
        private final fn3e m27563n(fn3e fn3eVar, fn3e fn3eVar2) {
            Set<String> setM27564q = m27564q(fn3eVar2);
            if (setM27564q.isEmpty()) {
                return C1359g.f53992toq;
            }
            fn3e.C7432k c7432k = new fn3e.C7432k();
            int size = fn3eVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                String strM26864y = fn3eVar.m26864y(i2);
                if (setM27564q.contains(strM26864y)) {
                    c7432k.toq(strM26864y, fn3eVar.n7h(i2));
                }
            }
            return c7432k.m26870s();
        }

        /* JADX INFO: renamed from: q */
        private final Set<String> m27564q(fn3e fn3eVar) {
            int size = fn3eVar.size();
            TreeSet treeSet = null;
            for (int i2 = 0; i2 < size; i2++) {
                if (kotlin.text.a9.e5(com.google.common.net.zy.f68532mu, fn3eVar.m26864y(i2), true)) {
                    String strN7h = fn3eVar.n7h(i2);
                    if (treeSet == null) {
                        treeSet = new TreeSet(kotlin.text.a9.oki(C6311u.f36447k));
                    }
                    Iterator it = kotlin.text.fti.qexj(strN7h, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(kotlin.text.fti.l92((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? a98o.ld6() : treeSet;
        }

        public final boolean f7l8(@InterfaceC7396q fti cachedResponse, @InterfaceC7396q fn3e cachedRequest, @InterfaceC7396q jk newRequest) {
            d2ok.m23075h(cachedResponse, "cachedResponse");
            d2ok.m23075h(cachedRequest, "cachedRequest");
            d2ok.m23075h(newRequest, "newRequest");
            Set<String> setM27564q = m27564q(cachedResponse.ltg8());
            if ((setM27564q instanceof Collection) && setM27564q.isEmpty()) {
                return true;
            }
            for (String str : setM27564q) {
                if (!d2ok.f7l8(cachedRequest.kja0(str), newRequest.m27309p(str))) {
                    return false;
                }
            }
            return true;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: g */
        public final fn3e m27565g(@InterfaceC7396q fti ftiVar) {
            d2ok.m23075h(ftiVar, "<this>");
            fti ftiVarH7am = ftiVar.h7am();
            d2ok.qrj(ftiVarH7am);
            return m27563n(ftiVarH7am.wlev().ld6(), ftiVar.ltg8());
        }

        /* JADX INFO: renamed from: k */
        public final boolean m27566k(@InterfaceC7396q fti ftiVar) {
            d2ok.m23075h(ftiVar, "<this>");
            return m27564q(ftiVar.ltg8()).contains("*");
        }

        @InterfaceC7396q
        @l05.qrj
        public final String toq(@InterfaceC7396q zurt url) {
            d2ok.m23075h(url, "url");
            return okio.kja0.Companion.x2(url.toString()).md5().hex();
        }

        public final int zy(@InterfaceC7396q okio.n7h source) throws IOException {
            d2ok.m23075h(source, "source");
            try {
                long jR8s8 = source.r8s8();
                String strZp = source.zp();
                if (jR8s8 >= 0 && jR8s8 <= 2147483647L) {
                    if (!(strZp.length() > 0)) {
                        return (int) jR8s8;
                    }
                }
                throw new IOException("expected an int but was \"" + jR8s8 + strZp + kotlin.text.eqxt.f81913toq);
            } catch (NumberFormatException e2) {
                throw new IOException(e2.getMessage());
            }
        }
    }

    public zy(@InterfaceC7396q File directory, long j2, @InterfaceC7396q InterfaceC7483k fileSystem) {
        d2ok.m23075h(directory, "directory");
        d2ok.m23075h(fileSystem, "fileSystem");
        this.f43651k = new C7440q(fileSystem, directory, f43645h, 2, j2, C7445q.f43045s);
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: t */
    public static final String m27553t(@InterfaceC7396q zurt zurtVar) {
        return f43647p.toq(zurtVar);
    }

    private final void zy(C7440q.toq toqVar) {
        if (toqVar != null) {
            try {
                toqVar.m26952k();
            } catch (IOException unused) {
            }
        }
    }

    public final void a98o(int i2) {
        this.f43653q = i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f43651k.close();
    }

    public final long d2ok() {
        return this.f43651k.nmn5();
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: f */
    public final okhttp3.internal.cache.toq m27554f(@InterfaceC7396q fti response) {
        C7440q.toq toqVarHyr;
        d2ok.m23075h(response, "response");
        String strQrj = response.wlev().qrj();
        if (C7456g.f43137k.m27075k(response.wlev().qrj())) {
            try {
                yz(response.wlev());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!d2ok.f7l8(strQrj, "GET")) {
            return null;
        }
        toq toqVar = f43647p;
        if (toqVar.m27566k(response)) {
            return null;
        }
        C8130zy c8130zy = new C8130zy(response);
        try {
            toqVarHyr = C7440q.hyr(this.f43651k, toqVar.toq(response.wlev().cdj()), 0L, 2, null);
            if (toqVarHyr == null) {
                return null;
            }
            try {
                c8130zy.m27569g(toqVarHyr);
                return new C7538q(this, toqVarHyr);
            } catch (IOException unused2) {
                zy(toqVarHyr);
                return null;
            }
        } catch (IOException unused3) {
            toqVarHyr = null;
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f43651k.flush();
    }

    public final synchronized int fu4() {
        return this.f43655y;
    }

    @InterfaceC7396q
    public final Iterator<String> g1() throws IOException {
        return new C7537n(this);
    }

    /* JADX INFO: renamed from: h */
    public final int m27555h() {
        return this.f43652n;
    }

    public final synchronized int hyr() {
        return this.f43650g;
    }

    public final void i1(int i2) {
        this.f43652n = i2;
    }

    public final boolean isClosed() {
        return this.f43651k.isClosed();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "directory", imports = {}))
    @InterfaceC6769y(name = "-deprecated_directory")
    /* JADX INFO: renamed from: k */
    public final File m27556k() {
        return this.f43651k.i1();
    }

    public final int ki() {
        return this.f43653q;
    }

    @InterfaceC7395n
    public final fti ld6(@InterfaceC7396q jk request) {
        d2ok.m23075h(request, "request");
        try {
            C7440q.q qVarYz = this.f43651k.yz(f43647p.toq(request.cdj()));
            if (qVarYz == null) {
                return null;
            }
            try {
                C8130zy c8130zy = new C8130zy(qVarYz.m26949q(0));
                fti ftiVarM27570q = c8130zy.m27570q(qVarYz);
                if (c8130zy.toq(request, ftiVarM27570q)) {
                    return ftiVarM27570q;
                }
                jp0y jp0yVarHyr = ftiVarM27570q.hyr();
                if (jp0yVarHyr != null) {
                    C1359g.kja0(jp0yVarHyr);
                }
                return null;
            } catch (IOException unused) {
                C1359g.kja0(qVarYz);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final synchronized int ltg8() {
        return this.f43653q;
    }

    public final synchronized void nmn5(@InterfaceC7396q okhttp3.internal.cache.zy cacheStrategy) {
        d2ok.m23075h(cacheStrategy, "cacheStrategy");
        this.f43654s++;
        if (cacheStrategy.toq() != null) {
            this.f43650g++;
        } else if (cacheStrategy.m26964k() != null) {
            this.f43655y++;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m27557p() throws IOException {
        this.f43651k.m26943f();
    }

    /* JADX INFO: renamed from: q */
    public final void m27558q() throws IOException {
        this.f43651k.wvg();
    }

    public final long size() throws IOException {
        return this.f43651k.size();
    }

    public final void t8iq(@InterfaceC7396q fti cached, @InterfaceC7396q fti network) {
        C7440q.toq toqVarM26948k;
        d2ok.m23075h(cached, "cached");
        d2ok.m23075h(network, "network");
        C8130zy c8130zy = new C8130zy(network);
        jp0y jp0yVarHyr = cached.hyr();
        d2ok.n7h(jp0yVarHyr, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            toqVarM26948k = ((C7536k) jp0yVarHyr).a98o().m26948k();
            if (toqVarM26948k == null) {
                return;
            }
            try {
                c8130zy.m27569g(toqVarM26948k);
                toqVarM26948k.toq();
            } catch (IOException unused) {
                zy(toqVarM26948k);
            }
        } catch (IOException unused2) {
            toqVarM26948k = null;
        }
    }

    public final synchronized int was() {
        return this.f43652n;
    }

    public final void wvg() throws IOException {
        this.f43651k.g1();
    }

    /* JADX INFO: renamed from: x */
    public final synchronized void m27559x() {
        this.f43655y++;
    }

    @InterfaceC7396q
    public final C7440q x2() {
        return this.f43651k;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "directory")
    /* JADX INFO: renamed from: y */
    public final File m27560y() {
        return this.f43651k.i1();
    }

    public final synchronized int y9n() {
        return this.f43654s;
    }

    public final void yz(@InterfaceC7396q jk request) throws IOException {
        d2ok.m23075h(request, "request");
        this.f43651k.nsb(f43647p.toq(request.cdj()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zy(@InterfaceC7396q File directory, long j2) {
        this(directory, j2, InterfaceC7483k.f93988toq);
        d2ok.m23075h(directory, "directory");
    }

    /* JADX INFO: renamed from: okhttp3.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Cache.kt */
    private static final class C8130zy {

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        @InterfaceC7396q
        public static final C7539k f94254ld6 = new C7539k(null);

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        @InterfaceC7396q
        private static final String f94255qrj;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        @InterfaceC7396q
        private static final String f94256x2;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @InterfaceC7396q
        private final fn3e f94257f7l8;

        /* JADX INFO: renamed from: g */
        @InterfaceC7396q
        private final String f43669g;

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final zurt f43670k;

        /* JADX INFO: renamed from: n */
        private final int f43671n;

        /* JADX INFO: renamed from: p */
        private final long f43672p;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        private final mcp f43673q;

        /* JADX INFO: renamed from: s */
        private final long f43674s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private final fn3e f94258toq;

        /* JADX INFO: renamed from: y */
        @InterfaceC7395n
        private final C7437i f43675y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        private final String f94259zy;

        /* JADX INFO: renamed from: okhttp3.zy$zy$k */
        /* JADX INFO: compiled from: Cache.kt */
        public static final class C7539k {
            private C7539k() {
            }

            public /* synthetic */ C7539k(kotlin.jvm.internal.ni7 ni7Var) {
                this();
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            C7498p.k kVar = C7498p.f43366k;
            sb.append(kVar.f7l8().m27243s());
            sb.append("-Sent-Millis");
            f94256x2 = sb.toString();
            f94255qrj = kVar.f7l8().m27243s() + "-Received-Millis";
        }

        public C8130zy(@InterfaceC7396q nn86 rawSource) throws IOException {
            d2ok.m23075h(rawSource, "rawSource");
            try {
                okio.n7h n7hVarM27592n = okio.d2ok.m27592n(rawSource);
                String strZp = n7hVarM27592n.zp();
                zurt zurtVarX2 = zurt.f94239ld6.x2(strZp);
                if (zurtVarX2 == null) {
                    IOException iOException = new IOException("Cache corruption for " + strZp);
                    C7498p.f43366k.f7l8().qrj("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.f43670k = zurtVarX2;
                this.f94259zy = n7hVarM27592n.zp();
                fn3e.C7432k c7432k = new fn3e.C7432k();
                int iZy = zy.f43647p.zy(n7hVarM27592n);
                for (int i2 = 0; i2 < iZy; i2++) {
                    c7432k.m26865g(n7hVarM27592n.zp());
                }
                this.f94258toq = c7432k.m26870s();
                okhttp3.internal.http.ld6 qVar = okhttp3.internal.http.ld6.f43141q.toq(n7hVarM27592n.zp());
                this.f43673q = qVar.f43143k;
                this.f43671n = qVar.f93897toq;
                this.f43669g = qVar.f93898zy;
                fn3e.C7432k c7432k2 = new fn3e.C7432k();
                int iZy2 = zy.f43647p.zy(n7hVarM27592n);
                for (int i3 = 0; i3 < iZy2; i3++) {
                    c7432k2.m26865g(n7hVarM27592n.zp());
                }
                String str = f94256x2;
                String strM26868p = c7432k2.m26868p(str);
                String str2 = f94255qrj;
                String strM26868p2 = c7432k2.m26868p(str2);
                c7432k2.x2(str);
                c7432k2.x2(str2);
                this.f43674s = strM26868p != null ? Long.parseLong(strM26868p) : 0L;
                this.f43672p = strM26868p2 != null ? Long.parseLong(strM26868p2) : 0L;
                this.f94257f7l8 = c7432k2.m26870s();
                if (m27567k()) {
                    String strZp2 = n7hVarM27592n.zp();
                    if (strZp2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strZp2 + kotlin.text.eqxt.f81913toq);
                    }
                    this.f43675y = C7437i.f42962n.zy(!n7hVarM27592n.py() ? d3.Companion.m26843k(n7hVarM27592n.zp()) : d3.SSL_3_0, C7528s.f94162toq.toq(n7hVarM27592n.zp()), zy(n7hVarM27592n), zy(n7hVarM27592n));
                } else {
                    this.f43675y = null;
                }
                was wasVar = was.f36763k;
                kotlin.io.zy.m23032k(rawSource, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    kotlin.io.zy.m23032k(rawSource, th);
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: k */
        private final boolean m27567k() {
            return d2ok.f7l8(this.f43670k.uv6(), "https");
        }

        /* JADX INFO: renamed from: n */
        private final void m27568n(okio.qrj qrjVar, List<? extends Certificate> list) throws IOException {
            try {
                qrjVar.xwq3(list.size()).writeByte(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = it.next().getEncoded();
                    kja0.C7563k c7563k = okio.kja0.Companion;
                    d2ok.kja0(bytes, "bytes");
                    qrjVar.lrht(kja0.C7563k.m27776h(c7563k, bytes, 0, 0, 3, null).base64()).writeByte(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        private final List<Certificate> zy(okio.n7h n7hVar) throws IOException {
            int iZy = zy.f43647p.zy(n7hVar);
            if (iZy == -1) {
                return kotlin.collections.ni7.a9();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iZy);
                for (int i2 = 0; i2 < iZy; i2++) {
                    String strZp = n7hVar.zp();
                    okio.x2 x2Var = new okio.x2();
                    okio.kja0 kja0VarM27783y = okio.kja0.Companion.m27783y(strZp);
                    if (kja0VarM27783y == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    x2Var.uc(kja0VarM27783y);
                    arrayList.add(certificateFactory.generateCertificate(x2Var.pjz9()));
                }
                return arrayList;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m27569g(@InterfaceC7396q C7440q.toq editor) throws IOException {
            d2ok.m23075h(editor, "editor");
            okio.qrj qrjVarM27594q = okio.d2ok.m27594q(editor.m26951g(0));
            try {
                qrjVarM27594q.lrht(this.f43670k.toString()).writeByte(10);
                qrjVarM27594q.lrht(this.f94259zy).writeByte(10);
                qrjVarM27594q.xwq3(this.f94258toq.size()).writeByte(10);
                int size = this.f94258toq.size();
                for (int i2 = 0; i2 < size; i2++) {
                    qrjVarM27594q.lrht(this.f94258toq.m26864y(i2)).lrht(": ").lrht(this.f94258toq.n7h(i2)).writeByte(10);
                }
                qrjVarM27594q.lrht(new okhttp3.internal.http.ld6(this.f43673q, this.f43671n, this.f43669g).toString()).writeByte(10);
                qrjVarM27594q.xwq3(this.f94257f7l8.size() + 2).writeByte(10);
                int size2 = this.f94257f7l8.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    qrjVarM27594q.lrht(this.f94257f7l8.m26864y(i3)).lrht(": ").lrht(this.f94257f7l8.n7h(i3)).writeByte(10);
                }
                qrjVarM27594q.lrht(f94256x2).lrht(": ").xwq3(this.f43674s).writeByte(10);
                qrjVarM27594q.lrht(f94255qrj).lrht(": ").xwq3(this.f43672p).writeByte(10);
                if (m27567k()) {
                    qrjVarM27594q.writeByte(10);
                    C7437i c7437i = this.f43675y;
                    d2ok.qrj(c7437i);
                    qrjVarM27594q.lrht(c7437i.f7l8().m27421n()).writeByte(10);
                    m27568n(qrjVarM27594q, this.f43675y.qrj());
                    m27568n(qrjVarM27594q, this.f43675y.ld6());
                    qrjVarM27594q.lrht(this.f43675y.kja0().javaName()).writeByte(10);
                }
                was wasVar = was.f36763k;
                kotlin.io.zy.m23032k(qrjVarM27594q, null);
            } finally {
            }
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final fti m27570q(@InterfaceC7396q C7440q.q snapshot) {
            d2ok.m23075h(snapshot, "snapshot");
            String strZy = this.f94257f7l8.zy(com.google.common.net.zy.f68571zy);
            String strZy2 = this.f94257f7l8.zy(com.google.common.net.zy.f68551toq);
            return new fti.C7433k().a9(new jk.C7511k().jk(this.f43670k).m27314h(this.f94259zy, null).kja0(this.f94258toq).toq()).m26898t(this.f43673q).f7l8(this.f43671n).m26900z(this.f43669g).ni7(this.f94257f7l8).toq(new C7536k(snapshot, strZy, strZy2)).fn3e(this.f43675y).fti(this.f43674s).mcp(this.f43672p).zy();
        }

        public final boolean toq(@InterfaceC7396q jk request, @InterfaceC7396q fti response) {
            d2ok.m23075h(request, "request");
            d2ok.m23075h(response, "response");
            return d2ok.f7l8(this.f43670k, request.cdj()) && d2ok.f7l8(this.f94259zy, request.qrj()) && zy.f43647p.f7l8(response, this.f94258toq, request);
        }

        public C8130zy(@InterfaceC7396q fti response) {
            d2ok.m23075h(response, "response");
            this.f43670k = response.wlev().cdj();
            this.f94258toq = zy.f43647p.m27565g(response);
            this.f94259zy = response.wlev().qrj();
            this.f43673q = response.bap7();
            this.f43671n = response.i1();
            this.f43669g = response.bek6();
            this.f94257f7l8 = response.ltg8();
            this.f43675y = response.m26886x();
            this.f43674s = response.ga();
            this.f43672p = response.h4b();
        }
    }
}
