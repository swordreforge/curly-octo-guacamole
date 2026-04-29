package kotlin.time;

import kotlin.i9jn;
import kotlin.jvm.internal.d2ok;
import kotlin.time.ki;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.time.q */
/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@i9jn(markerClass = {x2.class})
@yz(version = "1.9")
public interface InterfaceC6469q extends ki, Comparable<InterfaceC6469q> {

    /* JADX INFO: renamed from: kotlin.time.q$k */
    /* JADX INFO: compiled from: TimeSource.kt */
    public static final class k {
        /* JADX INFO: renamed from: k */
        public static int m23750k(@InterfaceC7396q InterfaceC6469q interfaceC6469q, @InterfaceC7396q InterfaceC6469q other) {
            d2ok.m23075h(other, "other");
            return C6467n.ld6(interfaceC6469q.mo23695y(other), C6467n.f36743q.lrht());
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public static InterfaceC6469q m23751q(@InterfaceC7396q InterfaceC6469q interfaceC6469q, long j2) {
            return interfaceC6469q.mo23693k(C6467n.dr(j2));
        }

        public static boolean toq(@InterfaceC7396q InterfaceC6469q interfaceC6469q) {
            return ki.C6465k.m23696k(interfaceC6469q);
        }

        public static boolean zy(@InterfaceC7396q InterfaceC6469q interfaceC6469q) {
            return ki.C6465k.toq(interfaceC6469q);
        }
    }

    boolean equals(@InterfaceC7395n Object obj);

    @Override // kotlin.time.ki
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    InterfaceC6469q mo23692g(long j2);

    int hashCode();

    @Override // kotlin.time.ki
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    InterfaceC6469q mo23693k(long j2);

    int t8r(@InterfaceC7396q InterfaceC6469q interfaceC6469q);

    /* JADX INFO: renamed from: y */
    long mo23695y(@InterfaceC7396q InterfaceC6469q interfaceC6469q);
}
