package androidx.appcompat.app;

/* JADX INFO: compiled from: TwilightCalculator.java */
/* JADX INFO: loaded from: classes.dex */
class kja0 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final float f46599f7l8 = 0.017453292f;

    /* JADX INFO: renamed from: g */
    public static final int f282g = 1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final float f46600ld6 = 3.49066E-4f;

    /* JADX INFO: renamed from: n */
    public static final int f283n = 0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final long f46601n7h = 946728000000L;

    /* JADX INFO: renamed from: p */
    private static final float f284p = 0.0334196f;

    /* JADX INFO: renamed from: q */
    private static kja0 f285q = null;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final float f46602qrj = 0.4092797f;

    /* JADX INFO: renamed from: s */
    private static final float f286s = -0.10471976f;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final float f46603x2 = 5.236E-6f;

    /* JADX INFO: renamed from: y */
    private static final float f287y = 9.0E-4f;

    /* JADX INFO: renamed from: k */
    public long f288k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public long f46604toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public int f46605zy;

    kja0() {
    }

    static kja0 toq() {
        if (f285q == null) {
            f285q = new kja0();
        }
        return f285q;
    }

    /* JADX INFO: renamed from: k */
    public void m203k(long j2, double d2, double d4) {
        double d5 = (0.01720197f * ((j2 - f46601n7h) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d5) * 0.03341960161924362d) + d5 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = ((double) (Math.round(((double) (r3 - f287y)) - r9) + f287y)) + ((-d4) / 360.0d) + (Math.sin(d5) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d6 = 0.01745329238474369d * d2;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d6) * Math.sin(dAsin))) / (Math.cos(d6) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f46605zy = 1;
            this.f288k = -1L;
            this.f46604toq = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.f46605zy = 0;
                this.f288k = -1L;
                this.f46604toq = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.f288k = Math.round((dRound + dAcos) * 8.64E7d) + f46601n7h;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + f46601n7h;
            this.f46604toq = jRound;
            if (jRound >= j2 || this.f288k <= j2) {
                this.f46605zy = 1;
            } else {
                this.f46605zy = 0;
            }
        }
    }
}
