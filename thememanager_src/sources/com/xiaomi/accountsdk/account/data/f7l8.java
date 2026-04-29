package com.xiaomi.accountsdk.account.data;

import android.text.TextUtils;

/* JADX INFO: compiled from: ExtendedAuthToken.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f7l8 {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f72620zy = ",";

    /* JADX INFO: renamed from: k */
    public final String f30588k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final String f72621toq;

    private f7l8(String str, String str2) {
        this.f30588k = str;
        this.f72621toq = str2;
    }

    /* JADX INFO: renamed from: k */
    public static f7l8 m18664k(String str, String str2) {
        return new f7l8(str, str2);
    }

    public static f7l8 toq(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length != 2 || TextUtils.isEmpty(strArrSplit[0]) || TextUtils.isEmpty(strArrSplit[1])) {
            return null;
        }
        return new f7l8(strArrSplit[0], strArrSplit[1]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f7l8.class != obj.getClass()) {
            return false;
        }
        f7l8 f7l8Var = (f7l8) obj;
        String str = this.f30588k;
        if (str == null ? f7l8Var.f30588k != null : !str.equals(f7l8Var.f30588k)) {
            return false;
        }
        String str2 = this.f72621toq;
        String str3 = f7l8Var.f72621toq;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public int hashCode() {
        String str = this.f30588k;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f72621toq;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String zy() {
        return this.f30588k + "," + this.f72621toq;
    }
}
