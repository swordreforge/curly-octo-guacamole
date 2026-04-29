package kotlin.time;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.time.g */
/* JADX INFO: compiled from: DurationJvm.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nDurationJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationJvm.kt\nkotlin/time/DurationJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public final class C6461g {

    /* JADX INFO: renamed from: k */
    private static final boolean f36735k = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final ThreadLocal<DecimalFormat>[] f81944toq;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i2 = 0; i2 < 4; i2++) {
            threadLocalArr[i2] = new ThreadLocal<>();
        }
        f81944toq = threadLocalArr;
    }

    /* JADX INFO: renamed from: k */
    private static final DecimalFormat m23682k(int i2) {
        DecimalFormat decimalFormat = new DecimalFormat("0");
        if (i2 > 0) {
            decimalFormat.setMinimumFractionDigits(i2);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m23683q() {
        return f36735k;
    }

    @InterfaceC7396q
    public static final String toq(double d2, int i2) {
        DecimalFormat decimalFormatM23682k;
        ThreadLocal<DecimalFormat>[] threadLocalArr = f81944toq;
        if (i2 < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i2];
            DecimalFormat decimalFormatM23682k2 = threadLocal.get();
            if (decimalFormatM23682k2 == null) {
                decimalFormatM23682k2 = m23682k(i2);
                threadLocal.set(decimalFormatM23682k2);
            } else {
                d2ok.kja0(decimalFormatM23682k2, "get() ?: default().also(this::set)");
            }
            decimalFormatM23682k = decimalFormatM23682k2;
        } else {
            decimalFormatM23682k = m23682k(i2);
        }
        String str = decimalFormatM23682k.format(d2);
        d2ok.kja0(str, "format.format(value)");
        return str;
    }

    @InterfaceC7396q
    public static final String zy(double d2, int i2) {
        DecimalFormat decimalFormatM23682k = m23682k(0);
        decimalFormatM23682k.setMaximumFractionDigits(i2);
        String str = decimalFormatM23682k.format(d2);
        d2ok.kja0(str, "createFormatForDecimals(… }\n        .format(value)");
        return str;
    }
}
