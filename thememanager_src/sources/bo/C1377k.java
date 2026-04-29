package bo;

/* JADX INFO: renamed from: bo.k */
/* JADX INFO: compiled from: LogBean.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1377k {

    /* JADX INFO: renamed from: g */
    public static final String f7279g = "timestamp";

    /* JADX INFO: renamed from: n */
    public static final String f7280n = "msg";

    /* JADX INFO: renamed from: q */
    public static final String f7281q = "id";

    /* JADX INFO: renamed from: k */
    private int f7282k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f54018toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f54019zy;

    public C1377k() {
    }

    /* JADX INFO: renamed from: g */
    public void m5822g(long timestamp) {
        this.f54019zy = timestamp;
    }

    /* JADX INFO: renamed from: k */
    public int m5823k() {
        return this.f7282k;
    }

    /* JADX INFO: renamed from: n */
    public void m5824n(String msg) {
        this.f54018toq = msg;
    }

    /* JADX INFO: renamed from: q */
    public void m5825q(int id) {
        this.f7282k = id;
    }

    public String toq() {
        return this.f54018toq;
    }

    public long zy() {
        return this.f54019zy;
    }

    public C1377k(long timestamp, String msg) {
        m5822g(timestamp);
        m5824n(msg);
    }

    public C1377k(int id, long timestamp, String msg) {
        this(timestamp, msg);
        m5825q(id);
    }
}
