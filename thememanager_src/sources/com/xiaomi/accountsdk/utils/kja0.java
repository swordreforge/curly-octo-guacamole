package com.xiaomi.accountsdk.utils;

import android.util.Base64;
import com.xiaomi.accountsdk.utils.C5578t;
import com.xiaomi.accountsdk.utils.cdj;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: FidNonce.java */
/* JADX INFO: loaded from: classes3.dex */
public class kja0 extends C5567h {

    /* JADX INFO: renamed from: q */
    private static final String f31037q = "FidNonce";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f72972zy = "UTF-8";

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.kja0$k */
    /* JADX INFO: compiled from: FidNonce.java */
    public static class C5571k {
        /* JADX INFO: renamed from: k */
        public kja0 m19097k(toq toqVar) {
            return new C5571k().toq(toqVar, C5578t.toq(), cdj.m19054k());
        }

        /* JADX INFO: renamed from: n */
        String m19098n() {
            return fti.m19075k();
        }

        /* JADX INFO: renamed from: q */
        String m19099q(long j2) {
            return fu4.toq(j2);
        }

        kja0 toq(toq toqVar, C5578t.k kVar, cdj.InterfaceC5563q interfaceC5563q) {
            if (toqVar == null) {
                throw new IllegalArgumentException("type == null");
            }
            if (kVar == null || interfaceC5563q == null) {
                return null;
            }
            try {
                if (!interfaceC5563q.toq()) {
                    return null;
                }
                String strZy = zy(toqVar == toq.NATIVE ? "n" : "wb", m19099q(kVar.toq()), m19098n());
                try {
                    String strEncodeToString = Base64.encodeToString(strZy.getBytes("UTF-8"), 10);
                    try {
                        byte[] bArrMo19055k = interfaceC5563q.mo19055k(strZy.getBytes("UTF-8"));
                        if (bArrMo19055k == null) {
                            return null;
                        }
                        try {
                            return new kja0(strEncodeToString, new String(Base64.encode(bArrMo19055k, 10), "UTF-8"));
                        } catch (UnsupportedEncodingException e2) {
                            AbstractC5574n.o1t(kja0.f31037q, e2);
                            return null;
                        }
                    } catch (cdj.C5562k e3) {
                        AbstractC5574n.o1t(kja0.f31037q, e3);
                        return null;
                    } catch (UnsupportedEncodingException e4) {
                        AbstractC5574n.o1t(kja0.f31037q, e4);
                        return null;
                    }
                } catch (UnsupportedEncodingException e6) {
                    AbstractC5574n.o1t(kja0.f31037q, e6);
                    return null;
                }
            } catch (cdj.C5562k e7) {
                AbstractC5574n.o1t(kja0.f31037q, e7);
                return null;
            }
        }

        String zy(String str, String str2, String str3) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("tp", str);
                jSONObject.put("nonce", str2);
                jSONObject.put("v", str3);
                return jSONObject.toString();
            } catch (JSONException unused) {
                throw new IllegalStateException("should not happen");
            }
        }
    }

    /* JADX INFO: compiled from: FidNonce.java */
    public enum toq {
        NATIVE,
        WEB_VIEW
    }

    public kja0(String str, String str2) {
        super(str, str2);
    }
}
