package kotlin.time;

import kotlin.i9jn;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@i9jn(markerClass = {x2.class})
@yz(version = "1.9")
public interface ki {

    /* JADX INFO: renamed from: kotlin.time.ki$k */
    /* JADX INFO: compiled from: TimeSource.kt */
    public static final class C6465k {
        /* JADX INFO: renamed from: k */
        public static boolean m23696k(@InterfaceC7396q ki kiVar) {
            return C6467n.m23710m(kiVar.toq());
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public static ki m23697q(@InterfaceC7396q ki kiVar, long j2) {
            return new zy(kiVar, j2, null);
        }

        public static boolean toq(@InterfaceC7396q ki kiVar) {
            return !C6467n.m23710m(kiVar.toq());
        }

        @InterfaceC7396q
        public static ki zy(@InterfaceC7396q ki kiVar, long j2) {
            return kiVar.mo23693k(C6467n.dr(j2));
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    ki mo23692g(long j2);

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    ki mo23693k(long j2);

    /* JADX INFO: renamed from: q */
    boolean mo23694q();

    long toq();

    boolean zy();
}
