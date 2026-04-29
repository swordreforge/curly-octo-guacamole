package kotlin.time;

import kotlin.i9jn;
import kotlin.jvm.internal.lv5;
import kotlin.yz;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes3.dex */
@i9jn(markerClass = {x2.class})
@lv5({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n80#2:201\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n173#1:200\n180#1:201\n*E\n"})
@yz(version = "1.9")
public final class cdj extends toq {

    /* JADX INFO: renamed from: q */
    private long f36732q;

    public cdj() {
        super(EnumC6474y.NANOSECONDS);
        mo23685k();
    }

    private final void f7l8(long j2) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.f36732q + ld6.m23700y(m23764q()) + " is advanced by " + ((Object) C6467n.bo(j2)) + '.');
    }

    @Override // kotlin.time.toq
    /* JADX INFO: renamed from: g */
    protected long mo23659g() {
        return this.f36732q;
    }

    /* JADX INFO: renamed from: y */
    public final void m23660y(long j2) {
        long jLv5 = C6467n.lv5(j2, m23764q());
        if (!(((jLv5 - 1) | 1) == Long.MAX_VALUE)) {
            long j3 = this.f36732q;
            long j4 = j3 + jLv5;
            if ((jLv5 ^ j3) >= 0 && (j3 ^ j4) < 0) {
                f7l8(j2);
            }
            this.f36732q = j4;
            return;
        }
        long jKja0 = C6467n.kja0(j2, 2);
        if ((1 | (C6467n.lv5(jKja0, m23764q()) - 1)) == Long.MAX_VALUE) {
            f7l8(j2);
            return;
        }
        long j5 = this.f36732q;
        try {
            m23660y(jKja0);
            m23660y(C6467n.yz(j2, jKja0));
        } catch (IllegalStateException e2) {
            this.f36732q = j5;
            throw e2;
        }
    }
}
