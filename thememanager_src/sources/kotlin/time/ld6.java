package kotlin.time;

import com.miui.maml.folme.AnimatedProperty;
import kotlin.jvm.internal.d2ok;
import kotlin.yz;
import mub.InterfaceC7396q;
import t8iq.C7672k;
import v5yj.C7704k;

/* JADX INFO: compiled from: DurationUnit.kt */
/* JADX INFO: loaded from: classes3.dex */
class ld6 extends C6468p {

    /* JADX INFO: renamed from: kotlin.time.ld6$k */
    /* JADX INFO: compiled from: DurationUnit.kt */
    public /* synthetic */ class C6466k {

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int[] f36740k;

        static {
            int[] iArr = new int[EnumC6474y.values().length];
            try {
                iArr[EnumC6474y.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6474y.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6474y.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6474y.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC6474y.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC6474y.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC6474y.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f36740k = iArr;
        }
    }

    @InterfaceC7396q
    @yz(version = "1.5")
    public static final EnumC6474y f7l8(@InterfaceC7396q String shortName) {
        d2ok.m23075h(shortName, "shortName");
        int iHashCode = shortName.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && shortName.equals("us")) {
                                    return EnumC6474y.MICROSECONDS;
                                }
                            } else if (shortName.equals("ns")) {
                                return EnumC6474y.NANOSECONDS;
                            }
                        } else if (shortName.equals("ms")) {
                            return EnumC6474y.MILLISECONDS;
                        }
                    } else if (shortName.equals(C7704k.y.toq.f44691k)) {
                        return EnumC6474y.SECONDS;
                    }
                } else if (shortName.equals("m")) {
                    return EnumC6474y.MINUTES;
                }
            } else if (shortName.equals(AnimatedProperty.PROPERTY_NAME_H)) {
                return EnumC6474y.HOURS;
            }
        } else if (shortName.equals(C7672k.f94880zy)) {
            return EnumC6474y.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }

    @InterfaceC7396q
    @yz(version = "1.5")
    /* JADX INFO: renamed from: g */
    public static final EnumC6474y m23699g(char c2, boolean z2) {
        if (!z2) {
            if (c2 == 'D') {
                return EnumC6474y.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c2);
        }
        if (c2 == 'H') {
            return EnumC6474y.HOURS;
        }
        if (c2 == 'M') {
            return EnumC6474y.MINUTES;
        }
        if (c2 == 'S') {
            return EnumC6474y.SECONDS;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c2);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    /* JADX INFO: renamed from: y */
    public static final String m23700y(@InterfaceC7396q EnumC6474y enumC6474y) {
        d2ok.m23075h(enumC6474y, "<this>");
        switch (C6466k.f36740k[enumC6474y.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return C7704k.y.toq.f44691k;
            case 5:
                return "m";
            case 6:
                return AnimatedProperty.PROPERTY_NAME_H;
            case 7:
                return C7672k.f94880zy;
            default:
                throw new IllegalStateException(("Unknown unit: " + enumC6474y).toString());
        }
    }
}
