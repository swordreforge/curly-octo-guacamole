package p039w;

/* JADX INFO: renamed from: w.q */
/* JADX INFO: compiled from: HttpException.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7726q extends Exception {
    public boolean isStsUrlRequestError;
    public final int responseCode;
    public String serviceId;

    public C7726q(int i2, String str) {
        super(str);
        this.isStsUrlRequestError = false;
        this.responseCode = i2;
    }

    public void stsUrlRequestError(String str) {
        this.serviceId = str;
        this.isStsUrlRequestError = true;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("response code: ");
        sb.append(this.responseCode);
        sb.append("\n");
        if (this.isStsUrlRequestError) {
            str = this.serviceId + " sts url request error \n";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString() + super.toString();
    }
}
