package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.enums.InterfaceC6225k;
import kotlin.i9jn;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kotlin.time.y */
/* JADX INFO: compiled from: DurationUnitJvm.kt */
/* JADX INFO: loaded from: classes3.dex */
@i9jn(markerClass = {x2.class})
@yz(version = "1.6")
public final class EnumC6474y {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ EnumC6474y[] f36753k;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ InterfaceC6225k f36754q;

    @InterfaceC7396q
    private final TimeUnit timeUnit;
    public static final EnumC6474y NANOSECONDS = new EnumC6474y("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final EnumC6474y MICROSECONDS = new EnumC6474y("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final EnumC6474y MILLISECONDS = new EnumC6474y("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final EnumC6474y SECONDS = new EnumC6474y("SECONDS", 3, TimeUnit.SECONDS);
    public static final EnumC6474y MINUTES = new EnumC6474y("MINUTES", 4, TimeUnit.MINUTES);
    public static final EnumC6474y HOURS = new EnumC6474y("HOURS", 5, TimeUnit.HOURS);
    public static final EnumC6474y DAYS = new EnumC6474y("DAYS", 6, TimeUnit.DAYS);

    static {
        EnumC6474y[] qVar = toq();
        f36753k = qVar;
        f36754q = kotlin.enums.toq.toq(qVar);
    }

    private EnumC6474y(String str, int i2, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    @InterfaceC7396q
    public static InterfaceC6225k<EnumC6474y> getEntries() {
        return f36754q;
    }

    private static final /* synthetic */ EnumC6474y[] toq() {
        return new EnumC6474y[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    public static EnumC6474y valueOf(String str) {
        return (EnumC6474y) Enum.valueOf(EnumC6474y.class, str);
    }

    public static EnumC6474y[] values() {
        return (EnumC6474y[]) f36753k.clone();
    }

    @InterfaceC7396q
    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}
