package okhttp3.internal.cache;

import b7.C1359g;
import cyoe.x2;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.C6480z;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import kotlin.text.a9;
import kotlin.text.eqxt;
import kotlin.text.fti;
import kotlin.text.ki;
import kotlin.was;
import l05.InterfaceC6765n;
import l05.InterfaceC6768s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.internal.concurrent.AbstractC7444k;
import okhttp3.internal.concurrent.C7445q;
import okhttp3.internal.io.InterfaceC7483k;
import okhttp3.internal.platform.C7498p;
import okio.AbstractC7579z;
import okio.n7h;
import okio.nn86;
import okio.qrj;
import okio.vyq;
import r6ty.InterfaceC7627q;

/* JADX INFO: renamed from: okhttp3.internal.cache.q */
/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1065:1\n1#2:1066\n608#3,4:1067\n37#4,2:1071\n37#4,2:1073\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache\n*L\n215#1:1067,4\n672#1:1071,2\n721#1:1073,2\n*E\n"})
public final class C7440q implements Closeable, Flushable {

    /* JADX INFO: renamed from: a */
    @InterfaceC7396q
    private final n f42978a;

    /* JADX INFO: renamed from: b */
    @InterfaceC7396q
    private final okhttp3.internal.concurrent.zy f42979b;

    /* JADX INFO: renamed from: c */
    private boolean f42980c;

    /* JADX INFO: renamed from: e */
    private boolean f42981e;

    /* JADX INFO: renamed from: f */
    private boolean f42982f;

    /* JADX INFO: renamed from: g */
    private final int f42983g;

    /* JADX INFO: renamed from: h */
    @InterfaceC7396q
    private final File f42984h;

    /* JADX INFO: renamed from: i */
    private long f42985i;

    /* JADX INFO: renamed from: j */
    private boolean f42986j;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final InterfaceC7483k f42987k;

    /* JADX INFO: renamed from: l */
    private boolean f42988l;

    /* JADX INFO: renamed from: m */
    private long f42989m;

    /* JADX INFO: renamed from: n */
    private final int f42990n;

    /* JADX INFO: renamed from: o */
    private boolean f42991o;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private final File f42992p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final File f42993q;

    /* JADX INFO: renamed from: r */
    private int f42994r;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final File f42995s;

    /* JADX INFO: renamed from: t */
    @InterfaceC7396q
    private final LinkedHashMap<String, zy> f42996t;

    /* JADX INFO: renamed from: y */
    private long f42997y;

    /* JADX INFO: renamed from: z */
    @InterfaceC7395n
    private qrj f42998z;

    /* JADX INFO: renamed from: x */
    @InterfaceC7396q
    public static final k f42977x = new k(null);

    /* JADX INFO: renamed from: u */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final String f42974u = "journal";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final String f93838bo = "journal.tmp";

    /* JADX INFO: renamed from: v */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final String f42975v = "journal.bkp";

    /* JADX INFO: renamed from: d */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final String f42973d = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: w */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final String f42976w = "1";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    @InterfaceC6765n
    public static final long f93837ab = -1;

    @InterfaceC7396q
    @InterfaceC6765n
    public static final ki bb = new ki("[a-z0-9_-]{1,120}");

    @InterfaceC7396q
    @InterfaceC6765n
    public static final String bp = "CLEAN";

    @InterfaceC7396q
    @InterfaceC6765n
    public static final String bv = "DIRTY";

    @InterfaceC7396q
    @InterfaceC6765n
    public static final String an = "REMOVE";

    @InterfaceC7396q
    @InterfaceC6765n
    public static final String id = "READ";

    /* JADX INFO: renamed from: okhttp3.internal.cache.q$f7l8 */
    /* JADX INFO: compiled from: DiskLruCache.kt */
    @lv5({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$snapshots$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1065:1\n1#2:1066\n*E\n"})
    public static final class f7l8 implements Iterator<q>, InterfaceC7627q {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final Iterator<zy> f43000k;

        /* JADX INFO: renamed from: n */
        @InterfaceC7395n
        private q f43001n;

        /* JADX INFO: renamed from: q */
        @InterfaceC7395n
        private q f43002q;

        f7l8() {
            Iterator<zy> it = new ArrayList(C7440q.this.m26945x().values()).iterator();
            d2ok.kja0(it, "ArrayList(lruEntries.values).iterator()");
            this.f43000k = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            q qVarKi;
            if (this.f43002q != null) {
                return true;
            }
            C7440q c7440q = C7440q.this;
            synchronized (c7440q) {
                if (c7440q.y9n()) {
                    return false;
                }
                while (this.f43000k.hasNext()) {
                    zy next = this.f43000k.next();
                    if (next != null && (qVarKi = next.ki()) != null) {
                        this.f43002q = qVarKi;
                        return true;
                    }
                }
                was wasVar = was.f36763k;
                return false;
            }
        }

        @Override // java.util.Iterator
        @InterfaceC7396q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public q next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            q qVar = this.f43002q;
            this.f43001n = qVar;
            this.f43002q = null;
            d2ok.qrj(qVar);
            return qVar;
        }

        @Override // java.util.Iterator
        public void remove() {
            q qVar = this.f43001n;
            if (qVar == null) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            try {
                C7440q.this.nsb(qVar.m26950y());
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.f43001n = null;
                throw th;
            }
            this.f43001n = null;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.q$g */
    /* JADX INFO: compiled from: DiskLruCache.kt */
    @lv5({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$newJournalWriter$faultHidingSink$1\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1065:1\n608#2,4:1066\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$newJournalWriter$faultHidingSink$1\n*L\n304#1:1066,4\n*E\n"})
    static final class g extends AbstractC6308r implements x2<IOException, was> {
        g() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(IOException iOException) {
            invoke2(iOException);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q IOException it) {
            d2ok.m23075h(it, "it");
            C7440q c7440q = C7440q.this;
            if (!C1359g.f7245y || Thread.holdsLock(c7440q)) {
                C7440q.this.f42988l = true;
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c7440q);
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.q$k */
    /* JADX INFO: compiled from: DiskLruCache.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.q$n */
    /* JADX INFO: compiled from: DiskLruCache.kt */
    public static final class n extends AbstractC7444k {
        n(String str) {
            super(str, false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.AbstractC7444k
        /* JADX INFO: renamed from: g */
        public long mo26947g() {
            C7440q c7440q = C7440q.this;
            synchronized (c7440q) {
                if (!c7440q.f42980c || c7440q.y9n()) {
                    return -1L;
                }
                try {
                    c7440q.e5();
                } catch (IOException unused) {
                    c7440q.f42986j = true;
                }
                try {
                    if (c7440q.was()) {
                        c7440q.ij();
                        c7440q.f42994r = 0;
                    }
                } catch (IOException unused2) {
                    c7440q.f42991o = true;
                    c7440q.f42998z = okio.d2ok.m27594q(okio.d2ok.zy());
                }
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.q$q */
    /* JADX INFO: compiled from: DiskLruCache.kt */
    public final class q implements Closeable {

        /* JADX INFO: renamed from: g */
        @InterfaceC7396q
        private final long[] f43004g;

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final String f43005k;

        /* JADX INFO: renamed from: n */
        @InterfaceC7396q
        private final List<nn86> f43006n;

        /* JADX INFO: renamed from: q */
        private final long f43007q;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C7440q f43008y;

        /* JADX WARN: Multi-variable type inference failed */
        public q(@InterfaceC7396q C7440q c7440q, String key, @InterfaceC7396q long j2, @InterfaceC7396q List<? extends nn86> sources, long[] lengths) {
            d2ok.m23075h(key, "key");
            d2ok.m23075h(sources, "sources");
            d2ok.m23075h(lengths, "lengths");
            this.f43008y = c7440q;
            this.f43005k = key;
            this.f43007q = j2;
            this.f43006n = sources;
            this.f43004g = lengths;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<nn86> it = this.f43006n.iterator();
            while (it.hasNext()) {
                C1359g.kja0(it.next());
            }
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public final toq m26948k() throws IOException {
            return this.f43008y.d2ok(this.f43005k, this.f43007q);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final nn86 m26949q(int i2) {
            return this.f43006n.get(i2);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: y */
        public final String m26950y() {
            return this.f43005k;
        }

        public final long zy(int i2) {
            return this.f43004g[i2];
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.q$toq */
    /* JADX INFO: compiled from: DiskLruCache.kt */
    public final class toq {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final zy f43009k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ C7440q f43010q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7395n
        private final boolean[] f93839toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f93840zy;

        /* JADX INFO: renamed from: okhttp3.internal.cache.q$toq$k */
        /* JADX INFO: compiled from: DiskLruCache.kt */
        static final class k extends AbstractC6308r implements x2<IOException, was> {
            final /* synthetic */ C7440q this$0;
            final /* synthetic */ toq this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(C7440q c7440q, toq toqVar) {
                super(1);
                this.this$0 = c7440q;
                this.this$1 = toqVar;
            }

            @Override // cyoe.x2
            public /* bridge */ /* synthetic */ was invoke(IOException iOException) {
                invoke2(iOException);
                return was.f36763k;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@InterfaceC7396q IOException it) {
                d2ok.m23075h(it, "it");
                C7440q c7440q = this.this$0;
                toq toqVar = this.this$1;
                synchronized (c7440q) {
                    toqVar.zy();
                    was wasVar = was.f36763k;
                }
            }
        }

        public toq(@InterfaceC7396q C7440q c7440q, zy entry) {
            d2ok.m23075h(entry, "entry");
            this.f43010q = c7440q;
            this.f43009k = entry;
            this.f93839toq = entry.f7l8() ? null : new boolean[c7440q.t8iq()];
        }

        @InterfaceC7395n
        public final nn86 f7l8(int i2) {
            C7440q c7440q = this.f43010q;
            synchronized (c7440q) {
                if (!(!this.f93840zy)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                nn86 nn86VarMo27209n = null;
                if (!this.f43009k.f7l8() || !d2ok.f7l8(this.f43009k.toq(), this) || this.f43009k.m26961s()) {
                    return null;
                }
                try {
                    nn86VarMo27209n = c7440q.a98o().mo27209n(this.f43009k.m26958k().get(i2));
                } catch (FileNotFoundException unused) {
                }
                return nn86VarMo27209n;
            }
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: g */
        public final vyq m26951g(int i2) {
            C7440q c7440q = this.f43010q;
            synchronized (c7440q) {
                if (!(!this.f93840zy)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!d2ok.f7l8(this.f43009k.toq(), this)) {
                    return okio.d2ok.zy();
                }
                if (!this.f43009k.f7l8()) {
                    boolean[] zArr = this.f93839toq;
                    d2ok.qrj(zArr);
                    zArr[i2] = true;
                }
                try {
                    return new C7439n(c7440q.a98o().mo27207g(this.f43009k.zy().get(i2)), new k(c7440q, this));
                } catch (FileNotFoundException unused) {
                    return okio.d2ok.zy();
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public final void m26952k() throws IOException {
            C7440q c7440q = this.f43010q;
            synchronized (c7440q) {
                if (!(!this.f93840zy)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (d2ok.f7l8(this.f43009k.toq(), this)) {
                    c7440q.fu4(this, false);
                }
                this.f93840zy = true;
                was wasVar = was.f36763k;
            }
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: n */
        public final boolean[] m26953n() {
            return this.f93839toq;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final zy m26954q() {
            return this.f43009k;
        }

        public final void toq() throws IOException {
            C7440q c7440q = this.f43010q;
            synchronized (c7440q) {
                if (!(!this.f93840zy)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (d2ok.f7l8(this.f43009k.toq(), this)) {
                    c7440q.fu4(this, true);
                }
                this.f93840zy = true;
                was wasVar = was.f36763k;
            }
        }

        public final void zy() throws IOException {
            if (d2ok.f7l8(this.f43009k.toq(), this)) {
                if (this.f43010q.f42982f) {
                    this.f43010q.fu4(this, false);
                } else {
                    this.f43009k.cdj(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.q$zy */
    /* JADX INFO: compiled from: DiskLruCache.kt */
    @lv5({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$Entry\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1065:1\n608#2,4:1066\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$Entry\n*L\n1001#1:1066,4\n*E\n"})
    public final class zy {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @InterfaceC7395n
        private toq f93841f7l8;

        /* JADX INFO: renamed from: g */
        private boolean f43011g;

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final String f43012k;

        /* JADX INFO: renamed from: n */
        private boolean f43013n;

        /* JADX INFO: renamed from: p */
        final /* synthetic */ C7440q f43014p;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        private final List<File> f43015q;

        /* JADX INFO: renamed from: s */
        private long f43016s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private final long[] f93842toq;

        /* JADX INFO: renamed from: y */
        private int f43017y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        private final List<File> f93843zy;

        /* JADX INFO: renamed from: okhttp3.internal.cache.q$zy$k */
        /* JADX INFO: compiled from: DiskLruCache.kt */
        public static final class k extends AbstractC7579z {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ zy f43018g;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ C7440q f43019n;

            /* JADX INFO: renamed from: q */
            private boolean f43020q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(nn86 nn86Var, C7440q c7440q, zy zyVar) {
                super(nn86Var);
                this.f43019n = c7440q;
                this.f43018g = zyVar;
            }

            @Override // okio.AbstractC7579z, okio.nn86, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                super.close();
                if (this.f43020q) {
                    return;
                }
                this.f43020q = true;
                C7440q c7440q = this.f43019n;
                zy zyVar = this.f43018g;
                synchronized (c7440q) {
                    zyVar.n7h(zyVar.m26956g() - 1);
                    if (zyVar.m26956g() == 0 && zyVar.m26961s()) {
                        c7440q.ngy(zyVar);
                    }
                    was wasVar = was.f36763k;
                }
            }
        }

        public zy(@InterfaceC7396q C7440q c7440q, String key) {
            d2ok.m23075h(key, "key");
            this.f43014p = c7440q;
            this.f43012k = key;
            this.f93842toq = new long[c7440q.t8iq()];
            this.f93843zy = new ArrayList();
            this.f43015q = new ArrayList();
            StringBuilder sb = new StringBuilder(key);
            sb.append('.');
            int length = sb.length();
            int iT8iq = c7440q.t8iq();
            for (int i2 = 0; i2 < iT8iq; i2++) {
                sb.append(i2);
                this.f93843zy.add(new File(this.f43014p.i1(), sb.toString()));
                sb.append(".tmp");
                this.f43015q.add(new File(this.f43014p.i1(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final nn86 ld6(int i2) throws FileNotFoundException {
            nn86 nn86VarMo27209n = this.f43014p.a98o().mo27209n(this.f93843zy.get(i2));
            if (this.f43014p.f42982f) {
                return nn86VarMo27209n;
            }
            this.f43017y++;
            return new k(nn86VarMo27209n, this.f43014p, this);
        }

        /* JADX INFO: renamed from: p */
        private final Void m26955p(List<String> list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        public final void cdj(boolean z2) {
            this.f43011g = z2;
        }

        public final boolean f7l8() {
            return this.f43013n;
        }

        /* JADX INFO: renamed from: g */
        public final int m26956g() {
            return this.f43017y;
        }

        /* JADX INFO: renamed from: h */
        public final void m26957h(long j2) {
            this.f43016s = j2;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final List<File> m26958k() {
            return this.f93843zy;
        }

        @InterfaceC7395n
        public final q ki() {
            C7440q c7440q = this.f43014p;
            if (C1359g.f7245y && !Thread.holdsLock(c7440q)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c7440q);
            }
            if (!this.f43013n) {
                return null;
            }
            if (!this.f43014p.f42982f && (this.f93841f7l8 != null || this.f43011g)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f93842toq.clone();
            try {
                int iT8iq = this.f43014p.t8iq();
                for (int i2 = 0; i2 < iT8iq; i2++) {
                    arrayList.add(ld6(i2));
                }
                return new q(this.f43014p, this.f43012k, this.f43016s, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C1359g.kja0((nn86) it.next());
                }
                try {
                    this.f43014p.ngy(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void kja0(boolean z2) {
            this.f43013n = z2;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public final long[] m26959n() {
            return this.f93842toq;
        }

        public final void n7h(int i2) {
            this.f43017y = i2;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final String m26960q() {
            return this.f43012k;
        }

        public final void qrj(@InterfaceC7396q List<String> strings) throws IOException {
            d2ok.m23075h(strings, "strings");
            if (strings.size() != this.f43014p.t8iq()) {
                m26955p(strings);
                throw new C6480z();
            }
            try {
                int size = strings.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f93842toq[i2] = Long.parseLong(strings.get(i2));
                }
            } catch (NumberFormatException unused) {
                m26955p(strings);
                throw new C6480z();
            }
        }

        /* JADX INFO: renamed from: s */
        public final boolean m26961s() {
            return this.f43011g;
        }

        public final void t8r(@InterfaceC7396q qrj writer) throws IOException {
            d2ok.m23075h(writer, "writer");
            for (long j2 : this.f93842toq) {
                writer.writeByte(32).xwq3(j2);
            }
        }

        @InterfaceC7395n
        public final toq toq() {
            return this.f93841f7l8;
        }

        public final void x2(@InterfaceC7395n toq toqVar) {
            this.f93841f7l8 = toqVar;
        }

        /* JADX INFO: renamed from: y */
        public final long m26962y() {
            return this.f43016s;
        }

        @InterfaceC7396q
        public final List<File> zy() {
            return this.f43015q;
        }
    }

    public C7440q(@InterfaceC7396q InterfaceC7483k fileSystem, @InterfaceC7396q File directory, int i2, int i3, long j2, @InterfaceC7396q C7445q taskRunner) {
        d2ok.m23075h(fileSystem, "fileSystem");
        d2ok.m23075h(directory, "directory");
        d2ok.m23075h(taskRunner, "taskRunner");
        this.f42987k = fileSystem;
        this.f42993q = directory;
        this.f42990n = i2;
        this.f42983g = i3;
        this.f42997y = j2;
        this.f42996t = new LinkedHashMap<>(0, 0.75f, true);
        this.f42979b = taskRunner.m26989p();
        this.f42978a = new n(C1359g.f7244s + " Cache");
        if (!(j2 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (!(i3 > 0)) {
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        this.f42995s = new File(directory, f42974u);
        this.f42992p = new File(directory, f93838bo);
        this.f42984h = new File(directory, f42975v);
    }

    private final boolean bap7() throws IOException {
        for (zy toEvict : this.f42996t.values()) {
            if (!toEvict.m26961s()) {
                d2ok.kja0(toEvict, "toEvict");
                ngy(toEvict);
                return true;
            }
        }
        return false;
    }

    private final void bek6() throws IOException {
        n7h n7hVarM27592n = okio.d2ok.m27592n(this.f42987k.mo27209n(this.f42995s));
        try {
            String strZp = n7hVarM27592n.zp();
            String strZp2 = n7hVarM27592n.zp();
            String strZp3 = n7hVarM27592n.zp();
            String strZp4 = n7hVarM27592n.zp();
            String strZp5 = n7hVarM27592n.zp();
            if (d2ok.f7l8(f42973d, strZp) && d2ok.f7l8(f42976w, strZp2) && d2ok.f7l8(String.valueOf(this.f42990n), strZp3) && d2ok.f7l8(String.valueOf(this.f42983g), strZp4)) {
                int i2 = 0;
                if (!(strZp5.length() > 0)) {
                    while (true) {
                        try {
                            h7am(n7hVarM27592n.zp());
                            i2++;
                        } catch (EOFException unused) {
                            this.f42994r = i2 - this.f42996t.size();
                            if (n7hVarM27592n.py()) {
                                this.f42998z = ltg8();
                            } else {
                                ij();
                            }
                            was wasVar = was.f36763k;
                            kotlin.io.zy.m23032k(n7hVarM27592n, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + strZp + ", " + strZp2 + ", " + strZp4 + ", " + strZp5 + ']');
        } finally {
        }
    }

    private final void bwp() throws IOException {
        this.f42987k.mo27211y(this.f42992p);
        Iterator<zy> it = this.f42996t.values().iterator();
        while (it.hasNext()) {
            zy next = it.next();
            d2ok.kja0(next, "i.next()");
            zy zyVar = next;
            int i2 = 0;
            if (zyVar.toq() == null) {
                int i3 = this.f42983g;
                while (i2 < i3) {
                    this.f42985i += zyVar.m26959n()[i2];
                    i2++;
                }
            } else {
                zyVar.x2(null);
                int i4 = this.f42983g;
                while (i2 < i4) {
                    this.f42987k.mo27211y(zyVar.m26958k().get(i2));
                    this.f42987k.mo27211y(zyVar.zy().get(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    private final void dxef(String str) {
        if (bb.matches(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + eqxt.f81913toq).toString());
    }

    private final void h7am(String str) throws IOException {
        String strSubstring;
        int iSc = fti.sc(str, ' ', 0, false, 6, null);
        if (iSc == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i2 = iSc + 1;
        int iSc2 = fti.sc(str, ' ', i2, false, 4, null);
        if (iSc2 == -1) {
            strSubstring = str.substring(i2);
            d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = an;
            if (iSc == str2.length() && a9.r6ty(str, str2, false, 2, null)) {
                this.f42996t.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i2, iSc2);
            d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        zy zyVar = this.f42996t.get(strSubstring);
        if (zyVar == null) {
            zyVar = new zy(this, strSubstring);
            this.f42996t.put(strSubstring, zyVar);
        }
        if (iSc2 != -1) {
            String str3 = bp;
            if (iSc == str3.length() && a9.r6ty(str, str3, false, 2, null)) {
                String strSubstring2 = str.substring(iSc2 + 1);
                d2ok.kja0(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List<String> listQexj = fti.qexj(strSubstring2, new char[]{' '}, false, 0, 6, null);
                zyVar.kja0(true);
                zyVar.x2(null);
                zyVar.qrj(listQexj);
                return;
            }
        }
        if (iSc2 == -1) {
            String str4 = bv;
            if (iSc == str4.length() && a9.r6ty(str, str4, false, 2, null)) {
                zyVar.x2(new toq(this, zyVar));
                return;
            }
        }
        if (iSc2 == -1) {
            String str5 = id;
            if (iSc == str5.length() && a9.r6ty(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public static /* synthetic */ toq hyr(C7440q c7440q, String str, long j2, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            j2 = f93837ab;
        }
        return c7440q.d2ok(str, j2);
    }

    private final synchronized void ki() {
        if (!(!this.f42981e)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    private final qrj ltg8() throws FileNotFoundException {
        return okio.d2ok.m27594q(new C7439n(this.f42987k.zy(this.f42995s), new g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean was() {
        int i2 = this.f42994r;
        return i2 >= 2000 && i2 >= this.f42996t.size();
    }

    @InterfaceC7396q
    public final InterfaceC7483k a98o() {
        return this.f42987k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        toq qVar;
        if (this.f42980c && !this.f42981e) {
            Collection<zy> collectionValues = this.f42996t.values();
            d2ok.kja0(collectionValues, "lruEntries.values");
            for (zy zyVar : (zy[]) collectionValues.toArray(new zy[0])) {
                if (zyVar.toq() != null && (qVar = zyVar.toq()) != null) {
                    qVar.zy();
                }
            }
            e5();
            qrj qrjVar = this.f42998z;
            d2ok.qrj(qrjVar);
            qrjVar.close();
            this.f42998z = null;
            this.f42981e = true;
            return;
        }
        this.f42981e = true;
    }

    @InterfaceC6768s
    @InterfaceC7395n
    public final synchronized toq d2ok(@InterfaceC7396q String key, long j2) throws IOException {
        d2ok.m23075h(key, "key");
        g1();
        ki();
        dxef(key);
        zy zyVar = this.f42996t.get(key);
        if (j2 != f93837ab && (zyVar == null || zyVar.m26962y() != j2)) {
            return null;
        }
        if ((zyVar != null ? zyVar.toq() : null) != null) {
            return null;
        }
        if (zyVar != null && zyVar.m26956g() != 0) {
            return null;
        }
        if (!this.f42986j && !this.f42991o) {
            qrj qrjVar = this.f42998z;
            d2ok.qrj(qrjVar);
            qrjVar.lrht(bv).writeByte(32).lrht(key).writeByte(10);
            qrjVar.flush();
            if (this.f42988l) {
                return null;
            }
            if (zyVar == null) {
                zyVar = new zy(this, key);
                this.f42996t.put(key, zyVar);
            }
            toq toqVar = new toq(this, zyVar);
            zyVar.x2(toqVar);
            return toqVar;
        }
        okhttp3.internal.concurrent.zy.m26999h(this.f42979b, this.f42978a, 0L, 2, null);
        return null;
    }

    public final void e5() throws IOException {
        while (this.f42985i > this.f42997y) {
            if (!bap7()) {
                return;
            }
        }
        this.f42986j = false;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m26943f() throws IOException {
        g1();
        Collection<zy> collectionValues = this.f42996t.values();
        d2ok.kja0(collectionValues, "lruEntries.values");
        for (zy entry : (zy[]) collectionValues.toArray(new zy[0])) {
            d2ok.kja0(entry, "entry");
            ngy(entry);
        }
        this.f42986j = false;
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.f42980c) {
            ki();
            e5();
            qrj qrjVar = this.f42998z;
            d2ok.qrj(qrjVar);
            qrjVar.flush();
        }
    }

    public final synchronized void fu4(@InterfaceC7396q toq editor, boolean z2) throws IOException {
        d2ok.m23075h(editor, "editor");
        zy zyVarM26954q = editor.m26954q();
        if (!d2ok.f7l8(zyVarM26954q.toq(), editor)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (z2 && !zyVarM26954q.f7l8()) {
            int i2 = this.f42983g;
            for (int i3 = 0; i3 < i2; i3++) {
                boolean[] zArrM26953n = editor.m26953n();
                d2ok.qrj(zArrM26953n);
                if (!zArrM26953n[i3]) {
                    editor.m26952k();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i3);
                }
                if (!this.f42987k.toq(zyVarM26954q.zy().get(i3))) {
                    editor.m26952k();
                    return;
                }
            }
        }
        int i4 = this.f42983g;
        for (int i5 = 0; i5 < i4; i5++) {
            File file = zyVarM26954q.zy().get(i5);
            if (!z2 || zyVarM26954q.m26961s()) {
                this.f42987k.mo27211y(file);
            } else if (this.f42987k.toq(file)) {
                File file2 = zyVarM26954q.m26958k().get(i5);
                this.f42987k.f7l8(file, file2);
                long j2 = zyVarM26954q.m26959n()[i5];
                long jMo27210q = this.f42987k.mo27210q(file2);
                zyVarM26954q.m26959n()[i5] = jMo27210q;
                this.f42985i = (this.f42985i - j2) + jMo27210q;
            }
        }
        zyVarM26954q.x2(null);
        if (zyVarM26954q.m26961s()) {
            ngy(zyVarM26954q);
            return;
        }
        this.f42994r++;
        qrj qrjVar = this.f42998z;
        d2ok.qrj(qrjVar);
        if (zyVarM26954q.f7l8() || z2) {
            zyVarM26954q.kja0(true);
            qrjVar.lrht(bp).writeByte(32);
            qrjVar.lrht(zyVarM26954q.m26960q());
            zyVarM26954q.t8r(qrjVar);
            qrjVar.writeByte(10);
            if (z2) {
                long j3 = this.f42989m;
                this.f42989m = 1 + j3;
                zyVarM26954q.m26957h(j3);
            }
        } else {
            this.f42996t.remove(zyVarM26954q.m26960q());
            qrjVar.lrht(an).writeByte(32);
            qrjVar.lrht(zyVarM26954q.m26960q());
            qrjVar.writeByte(10);
        }
        qrjVar.flush();
        if (this.f42985i > this.f42997y || was()) {
            okhttp3.internal.concurrent.zy.m26999h(this.f42979b, this.f42978a, 0L, 2, null);
        }
    }

    public final synchronized void g1() throws IOException {
        if (C1359g.f7245y && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f42980c) {
            return;
        }
        if (this.f42987k.toq(this.f42984h)) {
            if (this.f42987k.toq(this.f42995s)) {
                this.f42987k.mo27211y(this.f42984h);
            } else {
                this.f42987k.f7l8(this.f42984h, this.f42995s);
            }
        }
        this.f42982f = C1359g.lvui(this.f42987k, this.f42984h);
        if (this.f42987k.toq(this.f42995s)) {
            try {
                bek6();
                bwp();
                this.f42980c = true;
                return;
            } catch (IOException e2) {
                C7498p.f43366k.f7l8().qrj("DiskLruCache " + this.f42993q + " is corrupt: " + e2.getMessage() + ", removing", 5, e2);
                try {
                    wvg();
                    this.f42981e = false;
                    ij();
                    this.f42980c = true;
                } catch (Throwable th) {
                    this.f42981e = false;
                    throw th;
                }
            }
        }
        ij();
        this.f42980c = true;
    }

    @InterfaceC7396q
    public final synchronized Iterator<q> ga() throws IOException {
        g1();
        return new f7l8();
    }

    public final void h4b(boolean z2) {
        this.f42981e = z2;
    }

    @InterfaceC7396q
    public final File i1() {
        return this.f42993q;
    }

    public final synchronized void ij() throws IOException {
        qrj qrjVar = this.f42998z;
        if (qrjVar != null) {
            qrjVar.close();
        }
        qrj qrjVarM27594q = okio.d2ok.m27594q(this.f42987k.mo27207g(this.f42992p));
        try {
            qrjVarM27594q.lrht(f42973d).writeByte(10);
            qrjVarM27594q.lrht(f42976w).writeByte(10);
            qrjVarM27594q.xwq3(this.f42990n).writeByte(10);
            qrjVarM27594q.xwq3(this.f42983g).writeByte(10);
            qrjVarM27594q.writeByte(10);
            for (zy zyVar : this.f42996t.values()) {
                if (zyVar.toq() != null) {
                    qrjVarM27594q.lrht(bv).writeByte(32);
                    qrjVarM27594q.lrht(zyVar.m26960q());
                    qrjVarM27594q.writeByte(10);
                } else {
                    qrjVarM27594q.lrht(bp).writeByte(32);
                    qrjVarM27594q.lrht(zyVar.m26960q());
                    zyVar.t8r(qrjVarM27594q);
                    qrjVarM27594q.writeByte(10);
                }
            }
            was wasVar = was.f36763k;
            kotlin.io.zy.m23032k(qrjVarM27594q, null);
            if (this.f42987k.toq(this.f42995s)) {
                this.f42987k.f7l8(this.f42995s, this.f42984h);
            }
            this.f42987k.f7l8(this.f42992p, this.f42995s);
            this.f42987k.mo27211y(this.f42984h);
            this.f42998z = ltg8();
            this.f42988l = false;
            this.f42991o = false;
        } finally {
        }
    }

    public final synchronized boolean isClosed() {
        return this.f42981e;
    }

    public final boolean ngy(@InterfaceC7396q zy entry) throws IOException {
        qrj qrjVar;
        d2ok.m23075h(entry, "entry");
        if (!this.f42982f) {
            if (entry.m26956g() > 0 && (qrjVar = this.f42998z) != null) {
                qrjVar.lrht(bv);
                qrjVar.writeByte(32);
                qrjVar.lrht(entry.m26960q());
                qrjVar.writeByte(10);
                qrjVar.flush();
            }
            if (entry.m26956g() > 0 || entry.toq() != null) {
                entry.cdj(true);
                return true;
            }
        }
        toq qVar = entry.toq();
        if (qVar != null) {
            qVar.zy();
        }
        int i2 = this.f42983g;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f42987k.mo27211y(entry.m26958k().get(i3));
            this.f42985i -= entry.m26959n()[i3];
            entry.m26959n()[i3] = 0;
        }
        this.f42994r++;
        qrj qrjVar2 = this.f42998z;
        if (qrjVar2 != null) {
            qrjVar2.lrht(an);
            qrjVar2.writeByte(32);
            qrjVar2.lrht(entry.m26960q());
            qrjVar2.writeByte(10);
        }
        this.f42996t.remove(entry.m26960q());
        if (was()) {
            okhttp3.internal.concurrent.zy.m26999h(this.f42979b, this.f42978a, 0L, 2, null);
        }
        return true;
    }

    public final synchronized long nmn5() {
        return this.f42997y;
    }

    public final synchronized boolean nsb(@InterfaceC7396q String key) throws IOException {
        d2ok.m23075h(key, "key");
        g1();
        ki();
        dxef(key);
        zy zyVar = this.f42996t.get(key);
        if (zyVar == null) {
            return false;
        }
        boolean zNgy = ngy(zyVar);
        if (zNgy && this.f42985i <= this.f42997y) {
            this.f42986j = false;
        }
        return zNgy;
    }

    public final synchronized long size() throws IOException {
        g1();
        return this.f42985i;
    }

    @InterfaceC6768s
    @InterfaceC7395n
    /* JADX INFO: renamed from: t */
    public final toq m26944t(@InterfaceC7396q String key) throws IOException {
        d2ok.m23075h(key, "key");
        return hyr(this, key, 0L, 2, null);
    }

    public final int t8iq() {
        return this.f42983g;
    }

    public final synchronized void wlev(long j2) {
        this.f42997y = j2;
        if (this.f42980c) {
            okhttp3.internal.concurrent.zy.m26999h(this.f42979b, this.f42978a, 0L, 2, null);
        }
    }

    public final void wvg() throws IOException {
        close();
        this.f42987k.mo27208k(this.f42993q);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: x */
    public final LinkedHashMap<String, zy> m26945x() {
        return this.f42996t;
    }

    public final boolean y9n() {
        return this.f42981e;
    }

    @InterfaceC7395n
    public final synchronized q yz(@InterfaceC7396q String key) throws IOException {
        d2ok.m23075h(key, "key");
        g1();
        ki();
        dxef(key);
        zy zyVar = this.f42996t.get(key);
        if (zyVar == null) {
            return null;
        }
        q qVarKi = zyVar.ki();
        if (qVarKi == null) {
            return null;
        }
        this.f42994r++;
        qrj qrjVar = this.f42998z;
        d2ok.qrj(qrjVar);
        qrjVar.lrht(id).writeByte(32).lrht(key).writeByte(10);
        if (was()) {
            okhttp3.internal.concurrent.zy.m26999h(this.f42979b, this.f42978a, 0L, 2, null);
        }
        return qVarKi;
    }
}
