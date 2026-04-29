package com.xiaomi.accountsdk.account.stat;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.account.stat.k */
/* JADX INFO: compiled from: AccountStatInterface.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5503k {

    /* JADX INFO: renamed from: k */
    private static AbstractC5503k f30784k = new toq();

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.stat.k$toq */
    /* JADX INFO: compiled from: AccountStatInterface.java */
    private static class toq extends AbstractC5503k {
        private toq() {
        }

        @Override // com.xiaomi.accountsdk.account.stat.AbstractC5503k
        public void f7l8(String str, Exception exc) {
        }

        @Override // com.xiaomi.accountsdk.account.stat.AbstractC5503k
        /* JADX INFO: renamed from: g */
        public void mo18816g(String str, long j2) {
        }

        @Override // com.xiaomi.accountsdk.account.stat.AbstractC5503k
        /* JADX INFO: renamed from: n */
        public void mo18817n(String str, String str2, Map<String, String> map) {
        }

        @Override // com.xiaomi.accountsdk.account.stat.AbstractC5503k
        /* JADX INFO: renamed from: q */
        public void mo18818q(String str, String str2) {
        }

        @Override // com.xiaomi.accountsdk.account.stat.AbstractC5503k
        /* JADX INFO: renamed from: s */
        public void mo18819s(String str) {
        }

        @Override // com.xiaomi.accountsdk.account.stat.AbstractC5503k
        /* JADX INFO: renamed from: y */
        public void mo18820y(String str) {
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m18815k(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("http://dummyurl/")) {
            return str;
        }
        String[] strArrSplit = str.split("\\?");
        return strArrSplit.length >= 1 ? strArrSplit[0] : str;
    }

    public static AbstractC5503k toq() {
        return f30784k;
    }

    public static void zy(AbstractC5503k abstractC5503k) {
        f30784k = abstractC5503k;
    }

    public abstract void f7l8(String str, Exception exc);

    /* JADX INFO: renamed from: g */
    public abstract void mo18816g(String str, long j2);

    /* JADX INFO: renamed from: n */
    public abstract void mo18817n(String str, String str2, Map<String, String> map);

    /* JADX INFO: renamed from: q */
    public abstract void mo18818q(String str, String str2);

    /* JADX INFO: renamed from: s */
    public abstract void mo18819s(String str);

    /* JADX INFO: renamed from: y */
    public abstract void mo18820y(String str);
}
