package ra;

/* JADX INFO: renamed from: ra.k */
/* JADX INFO: compiled from: LoginPreference.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7630k {

    /* JADX INFO: renamed from: k */
    public String f44125k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public String f94672toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public k f94673zy;

    /* JADX INFO: renamed from: ra.k$k */
    /* JADX INFO: compiled from: LoginPreference.java */
    public enum k {
        ticket("ticket"),
        password("password");

        private final String value;

        k(String str) {
            this.value = str;
        }
    }

    public C7630k(String str, String str2, k kVar) {
        this.f44125k = str;
        this.f94672toq = str2;
        this.f94673zy = kVar;
    }
}
