package p039w;

import com.xiaomi.accountsdk.account.data.MetaLoginData;

/* JADX INFO: compiled from: InvalidCredentialException.java */
/* JADX INFO: loaded from: classes3.dex */
public class f7l8 extends C7723k {
    private static final long serialVersionUID = 1;
    public String captchaUrl;
    public final boolean hasPwd;
    public MetaLoginData metaLoginData;

    public f7l8(boolean z2) {
        super(z2 ? com.xiaomi.accountsdk.account.f7l8.f72737zy : com.xiaomi.accountsdk.account.f7l8.f72735toq, z2 ? "password error or passToken invalid" : "no password");
        this.hasPwd = z2;
    }

    public f7l8 captchaUrl(String str) {
        this.captchaUrl = str;
        return this;
    }

    public String getCaptchaUrl() {
        return this.captchaUrl;
    }

    public boolean getHasPwd() {
        return this.hasPwd;
    }

    public MetaLoginData getMetaLoginData() {
        return this.metaLoginData;
    }

    public f7l8 metaLoginData(MetaLoginData metaLoginData) {
        this.metaLoginData = metaLoginData;
        return this;
    }

    public f7l8(int i2, String str, boolean z2) {
        super(i2, str);
        this.hasPwd = z2;
    }
}
