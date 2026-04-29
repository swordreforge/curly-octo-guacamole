package bqie;

import java.time.Duration;
import kotlin.i9jn;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.time.C6467n;
import kotlin.time.EnumC6474y;
import kotlin.time.f7l8;
import kotlin.time.x2;
import kotlin.yz;
import l05.InterfaceC6769y;

/* JADX INFO: renamed from: bqie.k */
/* JADX INFO: compiled from: DurationConversions.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nDurationConversions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,33:1\n731#2,2:34\n*S KotlinDebug\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n*L\n33#1:34,2\n*E\n"})
@InterfaceC6769y(name = "DurationConversionsJDK8Kt")
public final class C1379k {
    @i9jn(markerClass = {x2.class})
    @InterfaceC6234g
    @yz(version = "1.6")
    /* JADX INFO: renamed from: k */
    private static final Duration m5837k(long j2) {
        Duration durationOfSeconds = Duration.ofSeconds(C6467n.x9kr(j2), C6467n.hyr(j2));
        d2ok.kja0(durationOfSeconds, "toJavaDuration-LRDsOJo");
        return durationOfSeconds;
    }

    @i9jn(markerClass = {x2.class})
    @InterfaceC6234g
    @yz(version = "1.6")
    private static final long toq(Duration duration) {
        d2ok.m23075h(duration, "<this>");
        return C6467n.y9n(f7l8.zp(duration.getSeconds(), EnumC6474y.SECONDS), f7l8.m23661a(duration.getNano(), EnumC6474y.NANOSECONDS));
    }
}
