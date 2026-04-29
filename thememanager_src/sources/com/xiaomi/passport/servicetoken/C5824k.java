package com.xiaomi.passport.servicetoken;

import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.accountsdk.account.data.C5480k;
import com.xiaomi.passport.servicetoken.ServiceTokenResult;
import java.io.IOException;

/* JADX INFO: renamed from: com.xiaomi.passport.servicetoken.k */
/* JADX INFO: compiled from: AMAuthTokenConverter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C5824k {

    /* JADX INFO: renamed from: g */
    public static final String f32538g = "error#";

    /* JADX INFO: renamed from: k */
    private static final String f32539k = ",";

    /* JADX INFO: renamed from: n */
    private static final String f32540n = "errorMessage";

    /* JADX INFO: renamed from: q */
    private static final String f32541q = "errorCode";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f73219toq = "authtoken";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f73220zy = "intent";

    /* JADX INFO: renamed from: com.xiaomi.passport.servicetoken.k$toq */
    /* JADX INFO: compiled from: AMAuthTokenConverter.java */
    public static class toq extends Exception {
        public final ServiceTokenResult.toq errorCode;
        public final String errorMsg;

        private toq(ServiceTokenResult.toq toqVar, String str) {
            this.errorCode = toqVar;
            this.errorMsg = str;
        }
    }

    /* JADX INFO: renamed from: g */
    public static Exception m20458g(ServiceTokenResult serviceTokenResult) {
        String str;
        if (serviceTokenResult == null || serviceTokenResult.f32506g == ServiceTokenResult.toq.ERROR_NONE || (str = serviceTokenResult.f32517y) == null || !str.startsWith(f32538g)) {
            return null;
        }
        String strSubstring = serviceTokenResult.f32517y.substring(6);
        ServiceTokenResult.toq toqVar = serviceTokenResult.f32506g;
        if (toqVar == ServiceTokenResult.toq.ERROR_CANCELLED) {
            return new OperationCanceledException(strSubstring);
        }
        if (toqVar == ServiceTokenResult.toq.ERROR_IOERROR) {
            return new IOException(strSubstring);
        }
        if (toqVar == ServiceTokenResult.toq.ERROR_AUTHENTICATOR_ERROR) {
            return new AuthenticatorException(strSubstring);
        }
        if (toqVar == ServiceTokenResult.toq.ERROR_OLD_MIUI_ACCOUNT_MANAGER_PERMISSION_ISSUE) {
            return new SecurityException(strSubstring);
        }
        return new AuthenticatorException("errorcode:" + serviceTokenResult.f32506g + ";errorMsg");
    }

    /* JADX INFO: renamed from: k */
    static String m20459k(ServiceTokenResult serviceTokenResult) {
        if (serviceTokenResult == null) {
            return null;
        }
        String str = serviceTokenResult.f32511n;
        return str == null ? serviceTokenResult.f32513q : String.format("%s%s%s", serviceTokenResult.f32513q, ",", str);
    }

    /* JADX INFO: renamed from: n */
    public static Bundle m20460n(ServiceTokenResult serviceTokenResult) throws toq {
        String str = serviceTokenResult.f32517y;
        ServiceTokenResult.toq toqVar = serviceTokenResult.f32506g;
        if (toqVar == ServiceTokenResult.toq.ERROR_OLD_MIUI_ACCOUNT_MANAGER_PERMISSION_ISSUE) {
            throw new SecurityException(str + serviceTokenResult.f32515s);
        }
        if (toqVar == ServiceTokenResult.toq.ERROR_NONE) {
            Bundle bundle = new Bundle();
            bundle.putString(f73219toq, m20459k(serviceTokenResult));
            return bundle;
        }
        if (toqVar == ServiceTokenResult.toq.ERROR_USER_INTERACTION_NEEDED) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("intent", serviceTokenResult.f32512p);
            return bundle2;
        }
        if (str != null && str.matches("\\d#.*")) {
            try {
                int iIndexOf = str.indexOf("#");
                int iIntValue = Integer.valueOf(str.substring(0, iIndexOf)).intValue();
                String strSubstring = str.substring(iIndexOf + 1);
                Bundle bundle3 = new Bundle();
                bundle3.putInt(f32541q, iIntValue);
                bundle3.putString(f32540n, strSubstring);
                return bundle3;
            } catch (NumberFormatException unused) {
            }
        }
        throw new toq(toqVar, str);
    }

    /* JADX INFO: renamed from: q */
    static ServiceTokenResult m20461q(String str, String str2, boolean z2) {
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        String[] strArrSplit = str2.split(",");
        if (str != null && str.startsWith(C5480k.f72647ld6)) {
            str3 = strArrSplit[0];
            if (TextUtils.isEmpty(str3)) {
                return null;
            }
        } else {
            if (strArrSplit.length != 2 || TextUtils.isEmpty(strArrSplit[0]) || TextUtils.isEmpty(strArrSplit[1])) {
                return null;
            }
            String str5 = strArrSplit[0];
            str4 = strArrSplit[1];
            str3 = str5;
        }
        return new ServiceTokenResult.C5817k(str).cdj(ServiceTokenResult.toq.ERROR_NONE).fu4(str3).ni7(str4).fn3e(z2).n7h();
    }

    public static ServiceTokenResult toq(Bundle bundle, String str) {
        ServiceTokenResult.toq toqVar;
        if (bundle == null) {
            return new ServiceTokenResult.C5817k(str).cdj(ServiceTokenResult.toq.ERROR_UNKNOWN).n7h();
        }
        if (bundle.containsKey(f73219toq)) {
            ServiceTokenResult serviceTokenResultM20461q = m20461q(str, bundle.getString(f73219toq), false);
            return serviceTokenResultM20461q != null ? serviceTokenResultM20461q : new ServiceTokenResult.C5817k(str).cdj(ServiceTokenResult.toq.ERROR_AUTHENTICATOR_ERROR).ki("invalid auth token").n7h();
        }
        Intent intent = (Intent) bundle.getParcelable("intent");
        if (intent != null) {
            return new ServiceTokenResult.C5817k(str).cdj(ServiceTokenResult.toq.ERROR_USER_INTERACTION_NEEDED).m20444i(intent).n7h();
        }
        if (!bundle.containsKey(f32541q)) {
            return new ServiceTokenResult.C5817k(str).cdj(ServiceTokenResult.toq.ERROR_UNKNOWN).n7h();
        }
        int i2 = bundle.getInt(f32541q);
        String string = bundle.getString(f32540n);
        switch (i2) {
            case 1:
                toqVar = ServiceTokenResult.toq.ERROR_REMOTE_EXCEPTION;
                break;
            case 2:
            default:
                toqVar = ServiceTokenResult.toq.ERROR_UNKNOWN;
                break;
            case 3:
                toqVar = ServiceTokenResult.toq.ERROR_IOERROR;
                break;
            case 4:
                toqVar = ServiceTokenResult.toq.ERROR_CANCELLED;
                break;
            case 5:
                toqVar = ServiceTokenResult.toq.ERROR_AUTHENTICATOR_ERROR;
                break;
            case 6:
                toqVar = ServiceTokenResult.toq.ERROR_AUTHENTICATOR_ERROR;
                break;
            case 7:
                toqVar = ServiceTokenResult.toq.ERROR_AUTHENTICATOR_ERROR;
                break;
            case 8:
                toqVar = ServiceTokenResult.toq.ERROR_AUTHENTICATOR_ERROR;
                break;
            case 9:
                toqVar = ServiceTokenResult.toq.ERROR_AUTHENTICATOR_ERROR;
                break;
        }
        return new ServiceTokenResult.C5817k(str).cdj(toqVar).ki(i2 + "#" + string).n7h();
    }

    public static ServiceTokenResult zy(String str, Exception exc) {
        ServiceTokenResult.C5817k c5817kCdj = new ServiceTokenResult.C5817k(str).cdj(exc instanceof OperationCanceledException ? ServiceTokenResult.toq.ERROR_CANCELLED : exc instanceof IOException ? ServiceTokenResult.toq.ERROR_IOERROR : exc instanceof AuthenticatorException ? ServiceTokenResult.toq.ERROR_AUTHENTICATOR_ERROR : exc instanceof SecurityException ? ServiceTokenResult.toq.ERROR_OLD_MIUI_ACCOUNT_MANAGER_PERMISSION_ISSUE : ServiceTokenResult.toq.ERROR_UNKNOWN);
        StringBuilder sb = new StringBuilder();
        sb.append(f32538g);
        sb.append(exc != null ? exc.getMessage() : "");
        return c5817kCdj.ki(sb.toString()).t8r(Log.getStackTraceString(exc)).n7h();
    }
}
