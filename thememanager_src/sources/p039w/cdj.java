package p039w;

import com.xiaomi.accountsdk.account.data.MetaLoginData;

/* JADX INFO: compiled from: NeedVerificationException.java */
/* JADX INFO: loaded from: classes3.dex */
public class cdj extends Exception {
    private static final long serialVersionUID = 1;
    private final MetaLoginData mMetaLoginData;
    private final String mStep1Token;
    private final String mUserId;

    public cdj(String str) {
        this(null, null, str);
    }

    public MetaLoginData getMetaLoginData() {
        return this.mMetaLoginData;
    }

    public String getStep1Token() {
        return this.mStep1Token;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public cdj(MetaLoginData metaLoginData, String str, String str2) {
        super("Need verification code");
        this.mMetaLoginData = metaLoginData;
        this.mStep1Token = str;
        this.mUserId = str2;
    }
}
