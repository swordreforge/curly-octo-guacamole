package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.fti;
import okhttp3.jk;
import okhttp3.jp0y;
import okhttp3.mcp;
import retrofit2.n7h;

/* JADX INFO: renamed from: retrofit2.i */
/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes4.dex */
public final class C7639i<T> {

    /* JADX INFO: renamed from: k */
    private final fti f44173k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @Nullable
    private final T f94713toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @Nullable
    private final jp0y f94714zy;

    private C7639i(fti ftiVar, @Nullable T t2, @Nullable jp0y jp0yVar) {
        this.f44173k = ftiVar;
        this.f94713toq = t2;
        this.f94714zy = jp0yVar;
    }

    public static <T> C7639i<T> ld6(@Nullable T t2) {
        return qrj(t2, new fti.C7433k().f7l8(200).m26900z("OK").m26898t(mcp.HTTP_1_1).a9(new jk.C7511k().m27321t("http://localhost/").toq()).zy());
    }

    /* JADX INFO: renamed from: p */
    public static <T> C7639i<T> m27983p(int i2, @Nullable T t2) {
        if (i2 >= 200 && i2 < 300) {
            return qrj(t2, new fti.C7433k().f7l8(i2).m26900z("Response.success()").m26898t(mcp.HTTP_1_1).a9(new jk.C7511k().m27321t("http://localhost/").toq()).zy());
        }
        throw new IllegalArgumentException("code < 200 or >= 300: " + i2);
    }

    /* JADX INFO: renamed from: q */
    public static <T> C7639i<T> m27984q(jp0y jp0yVar, fti ftiVar) {
        Objects.requireNonNull(jp0yVar, "body == null");
        Objects.requireNonNull(ftiVar, "rawResponse == null");
        if (ftiVar.m26884s()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new C7639i<>(ftiVar, null, jp0yVar);
    }

    public static <T> C7639i<T> qrj(@Nullable T t2, fti ftiVar) {
        Objects.requireNonNull(ftiVar, "rawResponse == null");
        if (ftiVar.m26884s()) {
            return new C7639i<>(ftiVar, t2, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public static <T> C7639i<T> x2(@Nullable T t2, okhttp3.fn3e fn3eVar) {
        Objects.requireNonNull(fn3eVar, "headers == null");
        return qrj(t2, new fti.C7433k().f7l8(200).m26900z("OK").m26898t(mcp.HTTP_1_1).ni7(fn3eVar).a9(new jk.C7511k().m27321t("http://localhost/").toq()).zy());
    }

    public static <T> C7639i<T> zy(int i2, jp0y jp0yVar) {
        Objects.requireNonNull(jp0yVar, "body == null");
        if (i2 >= 400) {
            return m27984q(jp0yVar, new fti.C7433k().toq(new n7h.zy(jp0yVar.mo27094h(), jp0yVar.x2())).f7l8(i2).m26900z("Response.error()").m26898t(mcp.HTTP_1_1).a9(new jk.C7511k().m27321t("http://localhost/").toq()).zy());
        }
        throw new IllegalArgumentException("code < 400: " + i2);
    }

    public boolean f7l8() {
        return this.f44173k.m26884s();
    }

    /* JADX INFO: renamed from: g */
    public okhttp3.fn3e m27985g() {
        return this.f44173k.ltg8();
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public T m27986k() {
        return this.f94713toq;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public jp0y m27987n() {
        return this.f94714zy;
    }

    /* JADX INFO: renamed from: s */
    public fti m27988s() {
        return this.f44173k;
    }

    public String toString() {
        return this.f44173k.toString();
    }

    public int toq() {
        return this.f44173k.i1();
    }

    /* JADX INFO: renamed from: y */
    public String m27989y() {
        return this.f44173k.bek6();
    }
}
