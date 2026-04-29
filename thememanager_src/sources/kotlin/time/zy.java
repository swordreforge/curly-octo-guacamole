package kotlin.time;

import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlin.time.ki;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes3.dex */
final class zy implements ki {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final ki f36755k;

    /* JADX INFO: renamed from: q */
    private final long f36756q;

    private zy(ki mark, long j2) {
        d2ok.m23075h(mark, "mark");
        this.f36755k = mark;
        this.f36756q = j2;
    }

    public /* synthetic */ zy(ki kiVar, long j2, ni7 ni7Var) {
        this(kiVar, j2);
    }

    @InterfaceC7396q
    public final ki f7l8() {
        return this.f36755k;
    }

    @Override // kotlin.time.ki
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public ki mo23692g(long j2) {
        return ki.C6465k.zy(this, j2);
    }

    @Override // kotlin.time.ki
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public ki mo23693k(long j2) {
        return new zy(this.f36755k, C6467n.y9n(this.f36756q, j2), null);
    }

    /* JADX INFO: renamed from: n */
    public final long m23765n() {
        return this.f36756q;
    }

    @Override // kotlin.time.ki
    /* JADX INFO: renamed from: q */
    public boolean mo23694q() {
        return ki.C6465k.m23696k(this);
    }

    @Override // kotlin.time.ki
    public long toq() {
        return C6467n.yz(this.f36755k.toq(), this.f36756q);
    }

    @Override // kotlin.time.ki
    public boolean zy() {
        return ki.C6465k.toq(this);
    }
}
