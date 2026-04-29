package miuix.hybrid;

/* JADX INFO: compiled from: PageContext.java */
/* JADX INFO: loaded from: classes3.dex */
public class fu4 {

    /* JADX INFO: renamed from: k */
    private String f40226k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f87696toq;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fu4 fu4Var = (fu4) obj;
        String str = this.f40226k;
        return str != null && str.equals(fu4Var.f40226k);
    }

    public int hashCode() {
        String str = this.f40226k;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: k */
    public String m25789k() {
        return this.f40226k;
    }

    /* JADX INFO: renamed from: q */
    public void m25790q(String url) {
        this.f87696toq = url;
    }

    public String toq() {
        return this.f87696toq;
    }

    public void zy(String id) {
        this.f40226k = id;
    }
}
