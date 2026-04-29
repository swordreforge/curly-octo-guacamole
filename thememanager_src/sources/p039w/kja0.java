package p039w;

import com.xiaomi.accountsdk.request.wvg;

/* JADX INFO: compiled from: NeedNotificationException.java */
/* JADX INFO: loaded from: classes3.dex */
public class kja0 extends Exception {
    private static final long serialVersionUID = 1;
    private final wvg.C5555y loginContent;
    private final String notificationUrl;
    private final String userId;

    public kja0(String str, String str2) {
        this(str, str2, null);
    }

    public wvg.C5555y getLoginContent() {
        return this.loginContent;
    }

    public String getNotificationUrl() {
        return this.notificationUrl;
    }

    public String getUserId() {
        return this.userId;
    }

    public kja0(String str, String str2, wvg.C5555y c5555y) {
        this.userId = str;
        this.notificationUrl = str2;
        this.loginContent = c5555y;
    }
}
