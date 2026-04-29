package com.xiaomi.accountsdk.utils;

import android.text.TextUtils;

/* JADX INFO: compiled from: AESStringDef.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: n */
    private static final String f31056n = ":";

    /* JADX INFO: renamed from: q */
    private static final String f31057q = "%s:%s:%s";

    /* JADX INFO: renamed from: k */
    private String f31058k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f72979toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f72980zy;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.toq$k */
    /* JADX INFO: compiled from: AESStringDef.java */
    static class C5579k extends Exception {
        C5579k(String str) {
            super(str);
        }
    }

    private toq() {
    }

    /* JADX INFO: renamed from: q */
    public static toq m19139q(String str, String str2, String str3) throws C5579k {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            throw new C5579k("invalid AES data");
        }
        toq toqVar = new toq();
        toqVar.f31058k = str;
        toqVar.f72979toq = str2;
        toqVar.f72980zy = str3;
        return toqVar;
    }

    public static toq zy(String str) throws C5579k {
        String[] strArrSplit = TextUtils.split(str, ":");
        if (strArrSplit == null || strArrSplit.length != 3) {
            throw new C5579k("invalid encrypt string format,the correct format is version:iv:content but original string is:" + str);
        }
        toq toqVar = new toq();
        toqVar.f31058k = strArrSplit[0];
        toqVar.f72979toq = strArrSplit[1];
        toqVar.f72980zy = strArrSplit[2];
        return toqVar;
    }

    /* JADX INFO: renamed from: k */
    public String m19140k() {
        return this.f72980zy;
    }

    /* JADX INFO: renamed from: n */
    public String m19141n() {
        return this.f31058k;
    }

    public String toString() {
        return String.format(f31057q, this.f31058k, this.f72979toq, this.f72980zy);
    }

    public String toq() {
        return this.f72979toq;
    }
}
