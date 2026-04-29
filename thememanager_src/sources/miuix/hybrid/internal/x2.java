package miuix.hybrid.internal;

/* JADX INFO: compiled from: Security.java */
/* JADX INFO: loaded from: classes3.dex */
public class x2 {

    /* JADX INFO: renamed from: k */
    private String f40330k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f87741toq;

    /* JADX INFO: renamed from: k */
    public String m25900k() {
        return this.f40330k;
    }

    /* JADX INFO: renamed from: q */
    public void m25901q(long timestamp) {
        this.f87741toq = timestamp;
    }

    public long toq() {
        return this.f87741toq;
    }

    public void zy(String signature) {
        this.f40330k = signature;
    }
}
