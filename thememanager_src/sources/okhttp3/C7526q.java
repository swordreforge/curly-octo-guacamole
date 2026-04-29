package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.hb;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6765n;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okhttp3.q */
/* JADX INFO: compiled from: CacheControl.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7526q {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final boolean f94071f7l8;

    /* JADX INFO: renamed from: g */
    private final boolean f43516g;

    /* JADX INFO: renamed from: k */
    private final boolean f43517k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final boolean f94072ld6;

    /* JADX INFO: renamed from: n */
    private final boolean f43518n;

    /* JADX INFO: renamed from: p */
    private final boolean f43519p;

    /* JADX INFO: renamed from: q */
    private final int f43520q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @InterfaceC7395n
    private String f94073qrj;

    /* JADX INFO: renamed from: s */
    private final int f43521s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f94074toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final boolean f94075x2;

    /* JADX INFO: renamed from: y */
    private final int f43522y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f94076zy;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @InterfaceC7396q
    public static final toq f94070n7h = new toq(null);

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final C7526q f94069kja0 = new k().f7l8().m27388k();

    /* JADX INFO: renamed from: h */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final C7526q f43515h = new k().m27390p().m27389n(Integer.MAX_VALUE, TimeUnit.SECONDS).m27388k();

    /* JADX INFO: renamed from: okhttp3.q$k */
    /* JADX INFO: compiled from: CacheControl.kt */
    @lv5({"SMAP\nCacheControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheControl.kt\nokhttp3/CacheControl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
    public static final class k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f94077f7l8;

        /* JADX INFO: renamed from: g */
        private boolean f43523g;

        /* JADX INFO: renamed from: k */
        private boolean f43524k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f94078toq;

        /* JADX INFO: renamed from: y */
        private boolean f43527y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f94079zy = -1;

        /* JADX INFO: renamed from: q */
        private int f43526q = -1;

        /* JADX INFO: renamed from: n */
        private int f43525n = -1;

        private final int toq(long j2) {
            if (j2 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j2;
        }

        @InterfaceC7396q
        public final k f7l8() {
            this.f43524k = true;
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: g */
        public final k m27387g(int i2, @InterfaceC7396q TimeUnit timeUnit) {
            d2ok.m23075h(timeUnit, "timeUnit");
            if (i2 >= 0) {
                this.f43525n = toq(timeUnit.toSeconds(i2));
                return this;
            }
            throw new IllegalArgumentException(("minFresh < 0: " + i2).toString());
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final C7526q m27388k() {
            return new C7526q(this.f43524k, this.f94078toq, this.f94079zy, -1, false, false, false, this.f43526q, this.f43525n, this.f43523g, this.f94077f7l8, this.f43527y, null, null);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public final k m27389n(int i2, @InterfaceC7396q TimeUnit timeUnit) {
            d2ok.m23075h(timeUnit, "timeUnit");
            if (i2 >= 0) {
                this.f43526q = toq(timeUnit.toSeconds(i2));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i2).toString());
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: p */
        public final k m27390p() {
            this.f43523g = true;
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final k m27391q(int i2, @InterfaceC7396q TimeUnit timeUnit) {
            d2ok.m23075h(timeUnit, "timeUnit");
            if (i2 >= 0) {
                this.f94079zy = toq(timeUnit.toSeconds(i2));
                return this;
            }
            throw new IllegalArgumentException(("maxAge < 0: " + i2).toString());
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: s */
        public final k m27392s() {
            this.f94077f7l8 = true;
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: y */
        public final k m27393y() {
            this.f94078toq = true;
            return this;
        }

        @InterfaceC7396q
        public final k zy() {
            this.f43527y = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: okhttp3.q$toq */
    /* JADX INFO: compiled from: CacheControl.kt */
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: renamed from: k */
        private final int m27394k(String str, String str2, int i2) {
            int length = str.length();
            while (i2 < length) {
                if (kotlin.text.fti.vwb(str2, str.charAt(i2), false, 2, null)) {
                    return i2;
                }
                i2++;
            }
            return str.length();
        }

        static /* synthetic */ int toq(toq toqVar, String str, String str2, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return toqVar.m27394k(str, str2, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
        @mub.InterfaceC7396q
        @l05.qrj
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.C7526q zy(@mub.InterfaceC7396q okhttp3.fn3e r31) {
            /*
                Method dump skipped, instruction units count: 402
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C7526q.toq.zy(okhttp3.fn3e):okhttp3.q");
        }
    }

    private C7526q(boolean z2, boolean z3, int i2, int i3, boolean z5, boolean z6, boolean z7, int i4, int i5, boolean z8, boolean z9, boolean z10, String str) {
        this.f43517k = z2;
        this.f94074toq = z3;
        this.f94076zy = i2;
        this.f43520q = i3;
        this.f43518n = z5;
        this.f43516g = z6;
        this.f94071f7l8 = z7;
        this.f43522y = i4;
        this.f43521s = i5;
        this.f43519p = z8;
        this.f94072ld6 = z9;
        this.f94075x2 = z10;
        this.f94073qrj = str;
    }

    public /* synthetic */ C7526q(boolean z2, boolean z3, int i2, int i3, boolean z5, boolean z6, boolean z7, int i4, int i5, boolean z8, boolean z9, boolean z10, String str, kotlin.jvm.internal.ni7 ni7Var) {
        this(z2, z3, i2, i3, z5, z6, z7, i4, i5, z8, z9, z10, str);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final C7526q zurt(@InterfaceC7396q fn3e fn3eVar) {
        return f94070n7h.zy(fn3eVar);
    }

    @InterfaceC6769y(name = "mustRevalidate")
    public final boolean cdj() {
        return this.f94071f7l8;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "noStore", imports = {}))
    @InterfaceC6769y(name = "-deprecated_noStore")
    public final boolean f7l8() {
        return this.f94074toq;
    }

    @InterfaceC6769y(name = "onlyIfCached")
    public final boolean fn3e() {
        return this.f43519p;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "noCache", imports = {}))
    @InterfaceC6769y(name = "-deprecated_noCache")
    /* JADX INFO: renamed from: g */
    public final boolean m27378g() {
        return this.f43517k;
    }

    @InterfaceC6769y(name = "minFreshSeconds")
    /* JADX INFO: renamed from: h */
    public final int m27379h() {
        return this.f43521s;
    }

    @InterfaceC6769y(name = "noTransform")
    /* JADX INFO: renamed from: i */
    public final boolean m27380i() {
        return this.f94072ld6;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "immutable", imports = {}))
    @InterfaceC6769y(name = "-deprecated_immutable")
    /* JADX INFO: renamed from: k */
    public final boolean m27381k() {
        return this.f94075x2;
    }

    @InterfaceC6769y(name = "noCache")
    public final boolean ki() {
        return this.f43517k;
    }

    @InterfaceC6769y(name = "maxStaleSeconds")
    public final int kja0() {
        return this.f43522y;
    }

    @InterfaceC6769y(name = "immutable")
    public final boolean ld6() {
        return this.f94075x2;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "mustRevalidate", imports = {}))
    @InterfaceC6769y(name = "-deprecated_mustRevalidate")
    /* JADX INFO: renamed from: n */
    public final boolean m27382n() {
        return this.f94071f7l8;
    }

    @InterfaceC6769y(name = "maxAgeSeconds")
    public final int n7h() {
        return this.f94076zy;
    }

    @InterfaceC6769y(name = "sMaxAgeSeconds")
    public final int ni7() {
        return this.f43520q;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "sMaxAgeSeconds", imports = {}))
    @InterfaceC6769y(name = "-deprecated_sMaxAgeSeconds")
    /* JADX INFO: renamed from: p */
    public final int m27383p() {
        return this.f43520q;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "minFreshSeconds", imports = {}))
    @InterfaceC6769y(name = "-deprecated_minFreshSeconds")
    /* JADX INFO: renamed from: q */
    public final int m27384q() {
        return this.f43521s;
    }

    public final boolean qrj() {
        return this.f43516g;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "onlyIfCached", imports = {}))
    @InterfaceC6769y(name = "-deprecated_onlyIfCached")
    /* JADX INFO: renamed from: s */
    public final boolean m27385s() {
        return this.f43519p;
    }

    @InterfaceC6769y(name = "noStore")
    public final boolean t8r() {
        return this.f94074toq;
    }

    @InterfaceC7396q
    public String toString() {
        String str = this.f94073qrj;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f43517k) {
            sb.append("no-cache, ");
        }
        if (this.f94074toq) {
            sb.append("no-store, ");
        }
        if (this.f94076zy != -1) {
            sb.append("max-age=");
            sb.append(this.f94076zy);
            sb.append(", ");
        }
        if (this.f43520q != -1) {
            sb.append("s-maxage=");
            sb.append(this.f43520q);
            sb.append(", ");
        }
        if (this.f43518n) {
            sb.append("private, ");
        }
        if (this.f43516g) {
            sb.append("public, ");
        }
        if (this.f94071f7l8) {
            sb.append("must-revalidate, ");
        }
        if (this.f43522y != -1) {
            sb.append("max-stale=");
            sb.append(this.f43522y);
            sb.append(", ");
        }
        if (this.f43521s != -1) {
            sb.append("min-fresh=");
            sb.append(this.f43521s);
            sb.append(", ");
        }
        if (this.f43519p) {
            sb.append("only-if-cached, ");
        }
        if (this.f94072ld6) {
            sb.append("no-transform, ");
        }
        if (this.f94075x2) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
        this.f94073qrj = string;
        return string;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "maxAgeSeconds", imports = {}))
    @InterfaceC6769y(name = "-deprecated_maxAgeSeconds")
    public final int toq() {
        return this.f94076zy;
    }

    public final boolean x2() {
        return this.f43518n;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "noTransform", imports = {}))
    @InterfaceC6769y(name = "-deprecated_noTransform")
    /* JADX INFO: renamed from: y */
    public final boolean m27386y() {
        return this.f94072ld6;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "maxStaleSeconds", imports = {}))
    @InterfaceC6769y(name = "-deprecated_maxStaleSeconds")
    public final int zy() {
        return this.f43522y;
    }
}
