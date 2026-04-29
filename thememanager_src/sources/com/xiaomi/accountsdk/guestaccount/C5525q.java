package com.xiaomi.accountsdk.guestaccount;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.guestaccount.q */
/* JADX INFO: compiled from: GuestAccountErrorCodeUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5525q {
    /* JADX INFO: renamed from: k */
    public static String m18887k(int i2, String str) {
        if (i2 >= 100) {
            return i2 < 1000 ? toq(i2, "http_error") : i2 < 100000 ? toq(i2, "unknown_error") : i2 < 101000 ? toq(i2, "server_fatal_error") : i2 < 102000 ? toq(i2, "server_argument_error") : i2 < 103000 ? toq(i2, "server_database_error") : i2 < 104000 ? toq(i2, "server_error") : i2 < 105000 ? toq(i2, "server_coder_error") : i2 < 106000 ? toq(i2, "server_domain_error") : i2 < 107000 ? toq(i2, "server_token_error") : i2 < 108000 ? toq(i2, "server_json_error") : toq(i2, "unknown_error");
        }
        switch (i2) {
            case -1:
                return toq(i2, "UNKNOWN_ERROR");
            case 0:
                return toq(i2, "NO_ERROR");
            case 1:
                return toq(i2, "CANNOT_JUDGE_APP_PERMISSION_ERROR");
            case 2:
                return toq(i2, "NO_PERMISSION_ERROR");
            case 3:
                return toq(i2, "LOCAL_INTERRUPTED");
            case 4:
                return toq(i2, "LOCAL_CTA_ERROR");
            case 5:
                return toq(i2, "SERVER_UNKNOWN_ERROR");
            case 6:
                return toq(i2, "IO_ERROR");
            case 7:
                return toq(i2, "Local parameter error:" + str);
            default:
                return toq(i2, "unknown_error");
        }
    }

    private static String toq(int i2, String str) {
        return String.format("code:%d(%s)", Integer.valueOf(i2), str);
    }
}
