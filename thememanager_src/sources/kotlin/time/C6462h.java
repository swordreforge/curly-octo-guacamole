package kotlin.time;

import kotlin.time.t8r;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.time.h */
/* JADX INFO: compiled from: MonoTimeSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.3")
public final class C6462h implements t8r.zy {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    public static final C6462h f81945toq = new C6462h();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final long f81946zy = System.nanoTime();

    private C6462h() {
    }

    /* JADX INFO: renamed from: g */
    private final long m23684g() {
        return System.nanoTime() - f81946zy;
    }

    @Override // kotlin.time.t8r.zy, kotlin.time.t8r
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ InterfaceC6469q mo23685k() {
        return t8r.toq.C6472k.m23759n(m23686n());
    }

    /* JADX INFO: renamed from: n */
    public long m23686n() {
        return t8r.toq.C6472k.m23760p(m23684g());
    }

    /* JADX INFO: renamed from: q */
    public final long m23687q(long j2) {
        return qrj.m23752g(m23684g(), j2, EnumC6474y.NANOSECONDS);
    }

    @InterfaceC7396q
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    public final long toq(long j2, long j3) {
        return t8r.toq.C6472k.m23760p(qrj.m23755q(j2, EnumC6474y.NANOSECONDS, j3));
    }

    public final long zy(long j2, long j3) {
        return qrj.m23756y(j2, j3, EnumC6474y.NANOSECONDS);
    }

    @Override // kotlin.time.t8r
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ ki mo23685k() {
        return t8r.toq.C6472k.m23759n(m23686n());
    }
}
