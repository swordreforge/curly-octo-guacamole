package p039w;

import java.io.IOException;

/* JADX INFO: compiled from: PassportIOException.java */
/* JADX INFO: loaded from: classes3.dex */
public class ki extends IOException {
    public boolean isStsUrlRequestError;
    public final int responseCode;
    public String serviceId;

    public ki(IOException iOException) {
        super(iOException);
        this.isStsUrlRequestError = false;
        this.responseCode = -1;
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

    public ki(int i2, String str) {
        super(str);
        this.isStsUrlRequestError = false;
        this.responseCode = i2;
    }
}
