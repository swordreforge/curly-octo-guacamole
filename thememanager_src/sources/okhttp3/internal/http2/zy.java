package okhttp3.internal.http2;

import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.kja0;

/* JADX INFO: compiled from: Header.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f93980f7l8 = ":method";

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    public static final String f43332g = ":status";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final kja0 f93981kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final kja0 f93982ld6;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final kja0 f43333n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final kja0 f93983n7h;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    public static final String f43334p = ":authority";

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final C7482k f43335q = new C7482k(null);

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final kja0 f93984qrj;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    public static final String f43336s = ":scheme";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final kja0 f93985x2;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    public static final String f43337y = ":path";

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    @InterfaceC6765n
    public final kja0 f43338k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public final kja0 f93986toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC6765n
    public final int f93987zy;

    /* JADX INFO: renamed from: okhttp3.internal.http2.zy$k */
    /* JADX INFO: compiled from: Header.kt */
    public static final class C7482k {
        private C7482k() {
        }

        public /* synthetic */ C7482k(ni7 ni7Var) {
            this();
        }
    }

    static {
        kja0.C7563k c7563k = kja0.Companion;
        f43333n = c7563k.x2(":");
        f93982ld6 = c7563k.x2(f43332g);
        f93985x2 = c7563k.x2(f93980f7l8);
        f93984qrj = c7563k.x2(f43337y);
        f93983n7h = c7563k.x2(f43336s);
        f93981kja0 = c7563k.x2(f43334p);
    }

    public zy(@InterfaceC7396q kja0 name, @InterfaceC7396q kja0 value) {
        d2ok.m23075h(name, "name");
        d2ok.m23075h(value, "value");
        this.f43338k = name;
        this.f93986toq = value;
        this.f93987zy = name.size() + 32 + value.size();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ zy m27205q(zy zyVar, kja0 kja0Var, kja0 kja0Var2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            kja0Var = zyVar.f43338k;
        }
        if ((i2 & 2) != 0) {
            kja0Var2 = zyVar.f93986toq;
        }
        return zyVar.zy(kja0Var, kja0Var2);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy)) {
            return false;
        }
        zy zyVar = (zy) obj;
        return d2ok.f7l8(this.f43338k, zyVar.f43338k) && d2ok.f7l8(this.f93986toq, zyVar.f93986toq);
    }

    public int hashCode() {
        return (this.f43338k.hashCode() * 31) + this.f93986toq.hashCode();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final kja0 m27206k() {
        return this.f43338k;
    }

    @InterfaceC7396q
    public String toString() {
        return this.f43338k.utf8() + ": " + this.f93986toq.utf8();
    }

    @InterfaceC7396q
    public final kja0 toq() {
        return this.f93986toq;
    }

    @InterfaceC7396q
    public final zy zy(@InterfaceC7396q kja0 name, @InterfaceC7396q kja0 value) {
        d2ok.m23075h(name, "name");
        d2ok.m23075h(value, "value");
        return new zy(name, value);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zy(@InterfaceC7396q String name, @InterfaceC7396q String value) {
        d2ok.m23075h(name, "name");
        d2ok.m23075h(value, "value");
        kja0.C7563k c7563k = kja0.Companion;
        this(c7563k.x2(name), c7563k.x2(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zy(@InterfaceC7396q kja0 name, @InterfaceC7396q String value) {
        this(name, kja0.Companion.x2(value));
        d2ok.m23075h(name, "name");
        d2ok.m23075h(value, "value");
    }
}
