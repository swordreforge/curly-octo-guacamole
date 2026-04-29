package com.xiaomi.accountsdk.utils;

import com.android.thememanager.controller.online.InterfaceC1925p;
import com.xiaomi.accountsdk.request.C5539k;
import com.xiaomi.accountsdk.request.C5545n;
import com.xiaomi.accountsdk.request.wvg;
import java.io.IOException;
import org.json.JSONException;

/* JADX INFO: compiled from: XMPassportApiRequest.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d2ok {

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.d2ok$k */
    /* JADX INFO: compiled from: XMPassportApiRequest.java */
    protected enum EnumC5564k {
        POST,
        GET
    }

    protected abstract String f7l8();

    /* JADX INFO: renamed from: g */
    protected abstract String m19057g();

    /* JADX INFO: renamed from: k */
    protected abstract void m19058k(n7h<String, String> n7hVar);

    /* JADX INFO: renamed from: n */
    protected abstract String m19059n();

    /* JADX INFO: renamed from: p */
    protected abstract void m19060p(String str);

    /* JADX INFO: renamed from: q */
    protected abstract String m19061q();

    /* JADX INFO: renamed from: s */
    protected abstract String m19062s(Object obj) throws JSONException;

    protected abstract boolean toq();

    /* JADX INFO: renamed from: y */
    protected abstract EnumC5564k m19063y();

    public String zy() throws JSONException, com.xiaomi.accountsdk.request.n7h, C5545n, C5539k, IOException {
        String strM19061q;
        com.xiaomi.accountsdk.account.data.f7l8 qVar;
        for (int i2 = 0; i2 < 2 && (qVar = com.xiaomi.accountsdk.account.data.f7l8.toq((strM19061q = m19061q()))) != null; i2++) {
            String str = qVar.f30588k;
            String str2 = qVar.f72621toq;
            if (str == null || str2 == null) {
                return null;
            }
            n7h<String, String> n7hVar = new n7h<>();
            m19058k(n7hVar);
            n7h n7hVar2 = new n7h();
            n7hVar2.easyPut(InterfaceC1925p.du, str);
            String strM19059n = m19059n();
            if (strM19059n != null) {
                n7hVar2.easyPut(InterfaceC1925p.dqjj, strM19059n);
            } else {
                n7hVar2.easyPut("userId", f7l8());
            }
            try {
                wvg.C5553n qVar2 = m19063y() == EnumC5564k.GET ? com.xiaomi.accountsdk.request.o1t.toq(m19057g(), n7hVar, n7hVar2, true, str2, new C5570k(str2)) : com.xiaomi.accountsdk.request.o1t.f7l8(m19057g(), n7hVar, n7hVar2, true, str2, new C5570k(str2));
                if (qVar2 == null) {
                    return null;
                }
                return m19062s(qVar2.m19019s("data"));
            } catch (com.xiaomi.accountsdk.request.zy unused) {
                if (!toq()) {
                    return null;
                }
                m19060p(strM19061q);
            }
        }
        return null;
    }
}
