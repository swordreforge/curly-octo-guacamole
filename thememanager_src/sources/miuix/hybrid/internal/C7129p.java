package miuix.hybrid.internal;

/* JADX INFO: renamed from: miuix.hybrid.internal.p */
/* JADX INFO: compiled from: Permission.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7129p {

    /* JADX INFO: renamed from: k */
    private String f40286k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f87721toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f87722zy;

    /* JADX INFO: renamed from: g */
    public void m25833g(String uri) {
        this.f40286k = uri;
    }

    /* JADX INFO: renamed from: k */
    public String m25834k() {
        return this.f40286k;
    }

    /* JADX INFO: renamed from: n */
    public void m25835n(boolean forbidden) {
        this.f87722zy = forbidden;
    }

    /* JADX INFO: renamed from: q */
    public void m25836q(boolean applySubdomains) {
        this.f87721toq = applySubdomains;
    }

    public boolean toq() {
        return this.f87721toq;
    }

    public boolean zy() {
        return this.f87722zy;
    }
}
