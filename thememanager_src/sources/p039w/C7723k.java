package p039w;

/* JADX INFO: renamed from: w.k */
/* JADX INFO: compiled from: AccountException.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7723k extends Exception {
    public final int code;
    public final String codeDesc;
    public boolean isStsUrlRequestError;
    public String serviceId;

    public C7723k(int i2, String str) {
        this(i2, str, null);
    }

    public void stsUrlRequestError(String str) {
        this.serviceId = str;
        this.isStsUrlRequestError = true;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("server code: ");
        sb.append(this.code);
        sb.append("; desc: ");
        sb.append(this.codeDesc);
        sb.append("\n");
        if (this.isStsUrlRequestError) {
            str = this.serviceId + " sts url request error \n";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString() + super.toString();
    }

    public C7723k(int i2, String str, Throwable th) {
        super(th);
        this.isStsUrlRequestError = false;
        this.code = i2;
        this.codeDesc = str;
    }
}
