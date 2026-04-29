package kotlin.time;

import kotlin.i9jn;
import kotlin.jvm.internal.d2ok;
import kotlin.time.InterfaceC6469q;
import kotlin.yz;
import l05.InterfaceC6761g;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@i9jn(markerClass = {x2.class})
@yz(version = "1.9")
public interface t8r {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C6471k f36747k = C6471k.f36748k;

    /* JADX INFO: renamed from: kotlin.time.t8r$k */
    /* JADX INFO: compiled from: TimeSource.kt */
    public static final class C6471k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ C6471k f36748k = new C6471k();

        private C6471k() {
        }
    }

    /* JADX INFO: compiled from: TimeSource.kt */
    public static final class toq implements zy {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        public static final toq f81949toq = new toq();

        /* JADX INFO: renamed from: kotlin.time.t8r$toq$k */
        /* JADX INFO: compiled from: TimeSource.kt */
        @i9jn(markerClass = {x2.class})
        @InterfaceC6761g
        @yz(version = "1.9")
        public static final class C6472k implements InterfaceC6469q {

            /* JADX INFO: renamed from: k */
            private final long f36749k;

            private /* synthetic */ C6472k(long j2) {
                this.f36749k = j2;
            }

            public static final long cdj(long j2, long j3) {
                return C6462h.f81945toq.zy(j2, j3);
            }

            public static final int f7l8(long j2, long j3) {
                return C6467n.ld6(cdj(j2, j3), C6467n.f36743q.lrht());
            }

            public static long fn3e(long j2, @InterfaceC7396q InterfaceC6469q other) {
                d2ok.m23075h(other, "other");
                if (other instanceof C6472k) {
                    return cdj(j2, ((C6472k) other).m23762z());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) fu4(j2)) + " and " + other);
            }

            public static String fu4(long j2) {
                return "ValueTimeMark(reading=" + j2 + ')';
            }

            /* JADX INFO: renamed from: h */
            public static int m23757h(long j2) {
                return Long.hashCode(j2);
            }

            /* JADX INFO: renamed from: i */
            public static long m23758i(long j2, long j3) {
                return C6462h.f81945toq.toq(j2, C6467n.dr(j3));
            }

            public static boolean kja0(long j2) {
                return !C6467n.m23710m(ld6(j2));
            }

            public static long ld6(long j2) {
                return C6462h.f81945toq.m23687q(j2);
            }

            /* JADX INFO: renamed from: n */
            public static final /* synthetic */ C6472k m23759n(long j2) {
                return new C6472k(j2);
            }

            public static boolean n7h(long j2) {
                return C6467n.m23710m(ld6(j2));
            }

            public static long ni7(long j2, long j3) {
                return C6462h.f81945toq.toq(j2, j3);
            }

            /* JADX INFO: renamed from: p */
            public static long m23760p(long j2) {
                return j2;
            }

            public static final boolean qrj(long j2, long j3) {
                return j2 == j3;
            }

            /* JADX INFO: renamed from: s */
            public static int m23761s(long j2, @InterfaceC7396q InterfaceC6469q other) {
                d2ok.m23075h(other, "other");
                return m23759n(j2).compareTo(other);
            }

            public static boolean x2(long j2, Object obj) {
                return (obj instanceof C6472k) && j2 == ((C6472k) obj).m23762z();
            }

            @Override // kotlin.time.InterfaceC6469q
            public boolean equals(Object obj) {
                return x2(this.f36749k, obj);
            }

            @Override // kotlin.time.InterfaceC6469q, kotlin.time.ki
            /* JADX INFO: renamed from: g */
            public /* bridge */ /* synthetic */ InterfaceC6469q mo23692g(long j2) {
                return m23759n(ki(j2));
            }

            @Override // kotlin.time.InterfaceC6469q
            public int hashCode() {
                return m23757h(this.f36749k);
            }

            @Override // kotlin.time.InterfaceC6469q, kotlin.time.ki
            /* JADX INFO: renamed from: k */
            public /* bridge */ /* synthetic */ InterfaceC6469q mo23693k(long j2) {
                return m23759n(zurt(j2));
            }

            public long ki(long j2) {
                return m23758i(this.f36749k, j2);
            }

            @Override // kotlin.time.ki
            /* JADX INFO: renamed from: q */
            public boolean mo23694q() {
                return n7h(this.f36749k);
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: t8r, reason: merged with bridge method [inline-methods] */
            public int compareTo(@InterfaceC7396q InterfaceC6469q interfaceC6469q) {
                return InterfaceC6469q.k.m23750k(this, interfaceC6469q);
            }

            public String toString() {
                return fu4(this.f36749k);
            }

            @Override // kotlin.time.ki
            public long toq() {
                return ld6(this.f36749k);
            }

            @Override // kotlin.time.InterfaceC6469q
            /* JADX INFO: renamed from: y */
            public long mo23695y(@InterfaceC7396q InterfaceC6469q other) {
                d2ok.m23075h(other, "other");
                return fn3e(this.f36749k, other);
            }

            /* JADX INFO: renamed from: z */
            public final /* synthetic */ long m23762z() {
                return this.f36749k;
            }

            public long zurt(long j2) {
                return ni7(this.f36749k, j2);
            }

            @Override // kotlin.time.ki
            public boolean zy() {
                return kja0(this.f36749k);
            }

            @Override // kotlin.time.ki
            /* JADX INFO: renamed from: g */
            public /* bridge */ /* synthetic */ ki mo23692g(long j2) {
                return m23759n(ki(j2));
            }

            @Override // kotlin.time.ki
            /* JADX INFO: renamed from: k */
            public /* bridge */ /* synthetic */ ki mo23693k(long j2) {
                return m23759n(zurt(j2));
            }
        }

        private toq() {
        }

        @Override // kotlin.time.t8r.zy, kotlin.time.t8r
        /* JADX INFO: renamed from: k */
        public /* bridge */ /* synthetic */ InterfaceC6469q mo23685k() {
            return C6472k.m23759n(toq());
        }

        @InterfaceC7396q
        public String toString() {
            return C6462h.f81945toq.toString();
        }

        public long toq() {
            return C6462h.f81945toq.m23686n();
        }

        @Override // kotlin.time.t8r
        /* JADX INFO: renamed from: k */
        public /* bridge */ /* synthetic */ ki mo23685k() {
            return C6472k.m23759n(toq());
        }
    }

    /* JADX INFO: compiled from: TimeSource.kt */
    @i9jn(markerClass = {x2.class})
    @yz(version = "1.9")
    public interface zy extends t8r {
        @Override // kotlin.time.t8r
        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        InterfaceC6469q mo23685k();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    ki mo23685k();
}
