package kotlin.math;

import l05.InterfaceC6765n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.math.k */
/* JADX INFO: compiled from: MathJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
final class C6319k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC6765n
    public static final double f81854f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC6765n
    public static final double f36469g;

    /* JADX INFO: renamed from: n */
    @InterfaceC6765n
    public static final double f36471n;

    /* JADX INFO: renamed from: q */
    @InterfaceC6765n
    public static final double f36472q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC6765n
    public static final double f81856zy;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C6319k f36470k = new C6319k();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC6765n
    public static final double f81855toq = Math.log(2.0d);

    static {
        double dUlp = Math.ulp(1.0d);
        f81856zy = dUlp;
        double dSqrt = Math.sqrt(dUlp);
        f36472q = dSqrt;
        double dSqrt2 = Math.sqrt(dSqrt);
        f36471n = dSqrt2;
        double d2 = 1;
        f36469g = d2 / dSqrt;
        f81854f7l8 = d2 / dSqrt2;
    }

    private C6319k() {
    }
}
