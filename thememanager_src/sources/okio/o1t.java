package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ForwardingTimeout.kt */
/* JADX INFO: loaded from: classes4.dex */
public class o1t extends C7560j {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private C7560j f43822g;

    public o1t(@InterfaceC7396q C7560j delegate) {
        kotlin.jvm.internal.d2ok.m23075h(delegate, "delegate");
        this.f43822g = delegate;
    }

    @Override // okio.C7560j
    public boolean f7l8() {
        return this.f43822g.f7l8();
    }

    @Override // okio.C7560j
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public C7560j mo27755g(long j2) {
        return this.f43822g.mo27755g(j2);
    }

    public final /* synthetic */ void kja0(C7560j c7560j) {
        kotlin.jvm.internal.d2ok.m23075h(c7560j, "<set-?>");
        this.f43822g = c7560j;
    }

    @Override // okio.C7560j
    public long ld6() {
        return this.f43822g.ld6();
    }

    @Override // okio.C7560j
    /* JADX INFO: renamed from: n */
    public long mo27757n() {
        return this.f43822g.mo27757n();
    }

    @InterfaceC7396q
    public final o1t n7h(@InterfaceC7396q C7560j delegate) {
        kotlin.jvm.internal.d2ok.m23075h(delegate, "delegate");
        this.f43822g = delegate;
        return this;
    }

    @Override // okio.C7560j
    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public C7560j mo27758p(long j2, @InterfaceC7396q TimeUnit unit) {
        kotlin.jvm.internal.d2ok.m23075h(unit, "unit");
        return this.f43822g.mo27758p(j2, unit);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "delegate")
    public final C7560j qrj() {
        return this.f43822g;
    }

    @Override // okio.C7560j
    /* JADX INFO: renamed from: s */
    public void mo27760s() throws IOException {
        this.f43822g.mo27760s();
    }

    @Override // okio.C7560j
    @InterfaceC7396q
    public C7560j toq() {
        return this.f43822g.toq();
    }

    @Override // okio.C7560j
    @InterfaceC7396q
    public C7560j zy() {
        return this.f43822g.zy();
    }
}
