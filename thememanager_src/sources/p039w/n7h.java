package p039w;

import com.xiaomi.accountsdk.account.f7l8;

/* JADX INFO: compiled from: NeedCaptchaException.java */
/* JADX INFO: loaded from: classes3.dex */
public class n7h extends C7723k {
    private static final long serialVersionUID = 1;
    private final String mCaptchaUrl;

    public n7h(String str) {
        this(f7l8.f72736x2, "Need captcha code or wrong captcha code", str);
    }

    public String getCaptchaUrl() {
        return this.mCaptchaUrl;
    }

    public n7h(int i2, String str, String str2) {
        super(i2, str);
        this.mCaptchaUrl = str2;
    }
}
