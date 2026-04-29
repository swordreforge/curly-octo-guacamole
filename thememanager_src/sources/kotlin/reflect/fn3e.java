package kotlin.reflect;

import kotlin.jvm.internal.d2ok;
import kotlin.nn86;
import kotlin.oc;
import kotlin.yz;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: KTypeProjection.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.1")
public final class fn3e {

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private final zurt f36567k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7395n
    private final t8r f81861toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    public static final C6361k f81860zy = new C6361k(null);

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final fn3e f36566q = new fn3e(null, null);

    /* JADX INFO: renamed from: kotlin.reflect.fn3e$k */
    /* JADX INFO: compiled from: KTypeProjection.kt */
    public static final class C6361k {
        private C6361k() {
        }

        public /* synthetic */ C6361k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @nn86
        /* JADX INFO: renamed from: q */
        public static /* synthetic */ void m23383q() {
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: k */
        public final fn3e m23384k(@InterfaceC7396q t8r type) {
            d2ok.m23075h(type, "type");
            return new fn3e(zurt.IN, type);
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: n */
        public final fn3e m23385n(@InterfaceC7396q t8r type) {
            d2ok.m23075h(type, "type");
            return new fn3e(zurt.INVARIANT, type);
        }

        @InterfaceC7396q
        @l05.qrj
        public final fn3e toq(@InterfaceC7396q t8r type) {
            d2ok.m23075h(type, "type");
            return new fn3e(zurt.OUT, type);
        }

        @InterfaceC7396q
        public final fn3e zy() {
            return fn3e.f36566q;
        }
    }

    /* JADX INFO: compiled from: KTypeProjection.kt */
    public /* synthetic */ class toq {

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int[] f36568k;

        static {
            int[] iArr = new int[zurt.values().length];
            try {
                iArr[zurt.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zurt.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zurt.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36568k = iArr;
        }
    }

    public fn3e(@InterfaceC7395n zurt zurtVar, @InterfaceC7395n t8r t8rVar) {
        String str;
        this.f36567k = zurtVar;
        this.f81861toq = t8rVar;
        if ((zurtVar == null) == (t8rVar == null)) {
            return;
        }
        if (zurtVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + zurtVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: g */
    public static final fn3e m23377g(@InterfaceC7396q t8r t8rVar) {
        return f81860zy.toq(t8rVar);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ fn3e m23378n(fn3e fn3eVar, zurt zurtVar, t8r t8rVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            zurtVar = fn3eVar.f36567k;
        }
        if ((i2 & 2) != 0) {
            t8rVar = fn3eVar.f81861toq;
        }
        return fn3eVar.m23381q(zurtVar, t8rVar);
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: s */
    public static final fn3e m23379s(@InterfaceC7396q t8r t8rVar) {
        return f81860zy.m23385n(t8rVar);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final fn3e zy(@InterfaceC7396q t8r t8rVar) {
        return f81860zy.m23384k(t8rVar);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn3e)) {
            return false;
        }
        fn3e fn3eVar = (fn3e) obj;
        return this.f36567k == fn3eVar.f36567k && d2ok.f7l8(this.f81861toq, fn3eVar.f81861toq);
    }

    @InterfaceC7395n
    public final t8r f7l8() {
        return this.f81861toq;
    }

    public int hashCode() {
        zurt zurtVar = this.f36567k;
        int iHashCode = (zurtVar == null ? 0 : zurtVar.hashCode()) * 31;
        t8r t8rVar = this.f81861toq;
        return iHashCode + (t8rVar != null ? t8rVar.hashCode() : 0);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public final zurt m23380k() {
        return this.f36567k;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public final fn3e m23381q(@InterfaceC7395n zurt zurtVar, @InterfaceC7395n t8r t8rVar) {
        return new fn3e(zurtVar, t8rVar);
    }

    @InterfaceC7396q
    public String toString() {
        zurt zurtVar = this.f36567k;
        int i2 = zurtVar == null ? -1 : toq.f36568k[zurtVar.ordinal()];
        if (i2 == -1) {
            return "*";
        }
        if (i2 == 1) {
            return String.valueOf(this.f81861toq);
        }
        if (i2 == 2) {
            return "in " + this.f81861toq;
        }
        if (i2 != 3) {
            throw new oc();
        }
        return "out " + this.f81861toq;
    }

    @InterfaceC7395n
    public final t8r toq() {
        return this.f81861toq;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public final zurt m23382y() {
        return this.f36567k;
    }
}
