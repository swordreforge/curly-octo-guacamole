package kotlin.text;

import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class qrj {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final String f36717k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final kotlin.ranges.x2 f81939toq;

    public qrj(@InterfaceC7396q String value, @InterfaceC7396q kotlin.ranges.x2 range) {
        kotlin.jvm.internal.d2ok.m23075h(value, "value");
        kotlin.jvm.internal.d2ok.m23075h(range, "range");
        this.f36717k = value;
        this.f81939toq = range;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ qrj m23612q(qrj qrjVar, String str, kotlin.ranges.x2 x2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = qrjVar.f36717k;
        }
        if ((i2 & 2) != 0) {
            x2Var = qrjVar.f81939toq;
        }
        return qrjVar.zy(str, x2Var);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrj)) {
            return false;
        }
        qrj qrjVar = (qrj) obj;
        return kotlin.jvm.internal.d2ok.f7l8(this.f36717k, qrjVar.f36717k) && kotlin.jvm.internal.d2ok.f7l8(this.f81939toq, qrjVar.f81939toq);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public final String m23613g() {
        return this.f36717k;
    }

    public int hashCode() {
        return (this.f36717k.hashCode() * 31) + this.f81939toq.hashCode();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final String m23614k() {
        return this.f36717k;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public final kotlin.ranges.x2 m23615n() {
        return this.f81939toq;
    }

    @InterfaceC7396q
    public String toString() {
        return "MatchGroup(value=" + this.f36717k + ", range=" + this.f81939toq + ')';
    }

    @InterfaceC7396q
    public final kotlin.ranges.x2 toq() {
        return this.f81939toq;
    }

    @InterfaceC7396q
    public final qrj zy(@InterfaceC7396q String value, @InterfaceC7396q kotlin.ranges.x2 range) {
        kotlin.jvm.internal.d2ok.m23075h(value, "value");
        kotlin.jvm.internal.d2ok.m23075h(range, "range");
        return new qrj(value, range);
    }
}
