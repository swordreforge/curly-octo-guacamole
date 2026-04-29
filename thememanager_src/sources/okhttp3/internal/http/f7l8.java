package okhttp3.internal.http;

import b7.C1359g;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.InterfaceC7519n;
import okhttp3.InterfaceC7525p;
import okhttp3.fti;
import okhttp3.internal.connection.C7450n;
import okhttp3.jk;
import okhttp3.ni7;

/* JADX INFO: compiled from: RealInterceptorChain.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nRealInterceptorChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealInterceptorChain.kt\nokhttp3/internal/http/RealInterceptorChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
public final class f7l8 implements ni7.InterfaceC7521k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final int f93893f7l8;

    /* JADX INFO: renamed from: g */
    private final int f43131g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final C7450n f43132k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final jk f43133n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private final okhttp3.internal.connection.zy f43134q;

    /* JADX INFO: renamed from: s */
    private int f43135s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final List<ni7> f93894toq;

    /* JADX INFO: renamed from: y */
    private final int f43136y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f93895zy;

    /* JADX WARN: Multi-variable type inference failed */
    public f7l8(@InterfaceC7396q C7450n call, @InterfaceC7396q List<? extends ni7> interceptors, int i2, @InterfaceC7395n okhttp3.internal.connection.zy zyVar, @InterfaceC7396q jk request, int i3, int i4, int i5) {
        d2ok.m23075h(call, "call");
        d2ok.m23075h(interceptors, "interceptors");
        d2ok.m23075h(request, "request");
        this.f43132k = call;
        this.f93894toq = interceptors;
        this.f93895zy = i2;
        this.f43134q = zyVar;
        this.f43133n = request;
        this.f43131g = i3;
        this.f93893f7l8 = i4;
        this.f43136y = i5;
    }

    public static /* synthetic */ f7l8 ld6(f7l8 f7l8Var, int i2, okhttp3.internal.connection.zy zyVar, jk jkVar, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = f7l8Var.f93895zy;
        }
        if ((i6 & 2) != 0) {
            zyVar = f7l8Var.f43134q;
        }
        okhttp3.internal.connection.zy zyVar2 = zyVar;
        if ((i6 & 4) != 0) {
            jkVar = f7l8Var.f43133n;
        }
        jk jkVar2 = jkVar;
        if ((i6 & 8) != 0) {
            i3 = f7l8Var.f43131g;
        }
        int i7 = i3;
        if ((i6 & 16) != 0) {
            i4 = f7l8Var.f93893f7l8;
        }
        int i8 = i4;
        if ((i6 & 32) != 0) {
            i5 = f7l8Var.f43136y;
        }
        return f7l8Var.m27070p(i2, zyVar2, jkVar2, i7, i8, i5);
    }

    @Override // okhttp3.ni7.InterfaceC7521k
    @InterfaceC7396q
    public InterfaceC7519n call() {
        return this.f43132k;
    }

    public final int cdj() {
        return this.f43136y;
    }

    @Override // okhttp3.ni7.InterfaceC7521k
    @InterfaceC7395n
    public InterfaceC7525p f7l8() {
        okhttp3.internal.connection.zy zyVar = this.f43134q;
        if (zyVar != null) {
            return zyVar.m27063y();
        }
        return null;
    }

    @Override // okhttp3.ni7.InterfaceC7521k
    /* JADX INFO: renamed from: g */
    public int mo27066g() {
        return this.f43136y;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: h */
    public final jk m27067h() {
        return this.f43133n;
    }

    @Override // okhttp3.ni7.InterfaceC7521k
    /* JADX INFO: renamed from: k */
    public int mo27068k() {
        return this.f93893f7l8;
    }

    public final int kja0() {
        return this.f93893f7l8;
    }

    @Override // okhttp3.ni7.InterfaceC7521k
    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public ni7.InterfaceC7521k mo27069n(int i2, @InterfaceC7396q TimeUnit unit) {
        d2ok.m23075h(unit, "unit");
        if (this.f43134q == null) {
            return ld6(this, 0, null, null, 0, 0, C1359g.qrj("writeTimeout", i2, unit), 31, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @InterfaceC7395n
    public final okhttp3.internal.connection.zy n7h() {
        return this.f43134q;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final f7l8 m27070p(int i2, @InterfaceC7395n okhttp3.internal.connection.zy zyVar, @InterfaceC7396q jk request, int i3, int i4, int i5) {
        d2ok.m23075h(request, "request");
        return new f7l8(this.f43132k, this.f93894toq, i2, zyVar, request, i3, i4, i5);
    }

    @Override // okhttp3.ni7.InterfaceC7521k
    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public fti mo27071q(@InterfaceC7396q jk request) throws IOException {
        d2ok.m23075h(request, "request");
        if (!(this.f93895zy < this.f93894toq.size())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f43135s++;
        okhttp3.internal.connection.zy zyVar = this.f43134q;
        if (zyVar != null) {
            if (!zyVar.m27060p().f7l8(request.cdj())) {
                throw new IllegalStateException(("network interceptor " + this.f93894toq.get(this.f93895zy - 1) + " must retain the same host and port").toString());
            }
            if (!(this.f43135s == 1)) {
                throw new IllegalStateException(("network interceptor " + this.f93894toq.get(this.f93895zy - 1) + " must call proceed() exactly once").toString());
            }
        }
        f7l8 f7l8VarLd6 = ld6(this, this.f93895zy + 1, null, request, 0, 0, 0, 58, null);
        ni7 ni7Var = this.f93894toq.get(this.f93895zy);
        fti ftiVarMo6886k = ni7Var.mo6886k(f7l8VarLd6);
        if (ftiVarMo6886k == null) {
            throw new NullPointerException("interceptor " + ni7Var + " returned null");
        }
        if (this.f43134q != null) {
            if (!(this.f93895zy + 1 >= this.f93894toq.size() || f7l8VarLd6.f43135s == 1)) {
                throw new IllegalStateException(("network interceptor " + ni7Var + " must call proceed() exactly once").toString());
            }
        }
        if (ftiVarMo6886k.hyr() != null) {
            return ftiVarMo6886k;
        }
        throw new IllegalStateException(("interceptor " + ni7Var + " returned a response with no body").toString());
    }

    public final int qrj() {
        return this.f43131g;
    }

    @Override // okhttp3.ni7.InterfaceC7521k
    /* JADX INFO: renamed from: s */
    public int mo27072s() {
        return this.f43131g;
    }

    @Override // okhttp3.ni7.InterfaceC7521k
    @InterfaceC7396q
    public ni7.InterfaceC7521k toq(int i2, @InterfaceC7396q TimeUnit unit) {
        d2ok.m23075h(unit, "unit");
        if (this.f43134q == null) {
            return ld6(this, 0, null, null, C1359g.qrj("connectTimeout", i2, unit), 0, 0, 55, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @InterfaceC7396q
    public final C7450n x2() {
        return this.f43132k;
    }

    @Override // okhttp3.ni7.InterfaceC7521k
    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public ni7.InterfaceC7521k mo27073y(int i2, @InterfaceC7396q TimeUnit unit) {
        d2ok.m23075h(unit, "unit");
        if (this.f43134q == null) {
            return ld6(this, 0, null, null, 0, C1359g.qrj("readTimeout", i2, unit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @Override // okhttp3.ni7.InterfaceC7521k
    @InterfaceC7396q
    public jk zy() {
        return this.f43133n;
    }
}
