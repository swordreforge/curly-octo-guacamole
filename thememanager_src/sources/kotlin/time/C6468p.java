package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.i9jn;
import kotlin.jvm.internal.d2ok;
import kotlin.oc;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.time.p */
/* JADX INFO: compiled from: DurationUnitJvm.kt */
/* JADX INFO: loaded from: classes3.dex */
class C6468p {

    /* JADX INFO: renamed from: kotlin.time.p$k */
    /* JADX INFO: compiled from: DurationUnitJvm.kt */
    public /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int[] f36746k;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f36746k = iArr;
        }
    }

    @yz(version = "1.3")
    /* JADX INFO: renamed from: k */
    public static final double m23747k(double d2, @InterfaceC7396q EnumC6474y sourceUnit, @InterfaceC7396q EnumC6474y targetUnit) {
        d2ok.m23075h(sourceUnit, "sourceUnit");
        d2ok.m23075h(targetUnit, "targetUnit");
        long jConvert = targetUnit.getTimeUnit$kotlin_stdlib().convert(1L, sourceUnit.getTimeUnit$kotlin_stdlib());
        return jConvert > 0 ? d2 * jConvert : d2 / sourceUnit.getTimeUnit$kotlin_stdlib().convert(1L, targetUnit.getTimeUnit$kotlin_stdlib());
    }

    @i9jn(markerClass = {x2.class})
    @InterfaceC7396q
    @yz(version = "1.8")
    /* JADX INFO: renamed from: n */
    public static final TimeUnit m23748n(@InterfaceC7396q EnumC6474y enumC6474y) {
        d2ok.m23075h(enumC6474y, "<this>");
        return enumC6474y.getTimeUnit$kotlin_stdlib();
    }

    @i9jn(markerClass = {x2.class})
    @InterfaceC7396q
    @yz(version = "1.8")
    /* JADX INFO: renamed from: q */
    public static final EnumC6474y m23749q(@InterfaceC7396q TimeUnit timeUnit) {
        d2ok.m23075h(timeUnit, "<this>");
        switch (k.f36746k[timeUnit.ordinal()]) {
            case 1:
                return EnumC6474y.NANOSECONDS;
            case 2:
                return EnumC6474y.MICROSECONDS;
            case 3:
                return EnumC6474y.MILLISECONDS;
            case 4:
                return EnumC6474y.SECONDS;
            case 5:
                return EnumC6474y.MINUTES;
            case 6:
                return EnumC6474y.HOURS;
            case 7:
                return EnumC6474y.DAYS;
            default:
                throw new oc();
        }
    }

    @yz(version = "1.5")
    public static final long toq(long j2, @InterfaceC7396q EnumC6474y sourceUnit, @InterfaceC7396q EnumC6474y targetUnit) {
        d2ok.m23075h(sourceUnit, "sourceUnit");
        d2ok.m23075h(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j2, sourceUnit.getTimeUnit$kotlin_stdlib());
    }

    @yz(version = "1.5")
    public static final long zy(long j2, @InterfaceC7396q EnumC6474y sourceUnit, @InterfaceC7396q EnumC6474y targetUnit) {
        d2ok.m23075h(sourceUnit, "sourceUnit");
        d2ok.m23075h(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j2, sourceUnit.getTimeUnit$kotlin_stdlib());
    }
}
