package com.xiaomi.accountsdk.account;

import com.xiaomi.accountsdk.request.C5538i;
import com.xiaomi.accountsdk.request.C5539k;
import com.xiaomi.accountsdk.request.C5545n;
import com.xiaomi.accountsdk.request.C5547p;
import com.xiaomi.accountsdk.request.C5550t;
import com.xiaomi.accountsdk.request.n7h;
import com.xiaomi.accountsdk.request.zurt;
import ix.C6099k;
import java.io.IOException;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import kx3.C6757k;
import org.json.JSONException;
import org.json.JSONObject;
import p039w.cdj;
import p039w.kja0;
import p039w.x2;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.account.n */
/* JADX INFO: compiled from: PassportCATokenManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5499n {

    /* JADX INFO: renamed from: n */
    private static C5499n f30760n = new C5499n();

    /* JADX INFO: renamed from: q */
    private static final long f30761q = 604800;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72771toq = "PassportCATokenManager";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final long f72772zy = 86400;

    /* JADX INFO: renamed from: k */
    private InterfaceC5501q f30762k = null;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.n$k */
    /* JADX INFO: compiled from: PassportCATokenManager.java */
    static class k extends C5547p {

        /* JADX INFO: renamed from: k */
        private long f30763k = 0;

        k() {
        }

        public void f7l8() {
            this.f30763k = System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: g */
        public void m18778g(C6099k c6099k) {
            m18980q(m18779n(c6099k, Long.valueOf(System.currentTimeMillis() - this.f30763k), Boolean.valueOf(c6099k != null)));
        }

        /* JADX INFO: renamed from: n */
        String m18779n(C6099k c6099k, Object obj, Object obj2) {
            return String.format("http://dummyurl/getTokenDiagnosis?_ver=%s&_time=%s&_result=%s&hdid=%s", zy.f30810k, obj, obj2, new com.xiaomi.accountsdk.hasheddeviceidlib.zy(C5500p.toq()).zy());
        }
    }

    C5499n() {
    }

    public static C5499n zy() {
        return f30760n;
    }

    public boolean f7l8() {
        InterfaceC5501q interfaceC5501q = this.f30762k;
        if (interfaceC5501q == null || C5502s.f30772k) {
            return false;
        }
        return System.currentTimeMillis() >= interfaceC5501q.zy(0L);
    }

    /* JADX INFO: renamed from: g */
    public void m18772g() {
        InterfaceC5501q interfaceC5501q = this.f30762k;
        if (interfaceC5501q == null) {
            throw new IllegalStateException("passportCATokenExternal is null");
        }
        interfaceC5501q.m18788k(C6099k.f80335zy);
    }

    /* JADX INFO: renamed from: k */
    protected C6099k m18773k(String str) throws n7h, IllegalBlockSizeException, IOException, CertificateException, JSONException, BadPaddingException, C5545n, NoSuchPaddingException, C5539k, com.xiaomi.accountsdk.request.zy, NoSuchAlgorithmException, C6757k, InvalidKeyException {
        String str2 = String.format("https://%s/ca/getTokenCA", str);
        com.xiaomi.accountsdk.utils.n7h n7hVar = new com.xiaomi.accountsdk.utils.n7h();
        n7hVar.easyPut(C5550t.f72946zy, C5500p.zy());
        com.xiaomi.accountsdk.utils.n7h n7hVar2 = new com.xiaomi.accountsdk.utils.n7h();
        n7hVar2.put("_ver", zy.f30810k);
        C5538i c5538i = new C5538i();
        c5538i.ld6(str2);
        c5538i.m18941n(n7hVar2);
        c5538i.zy(n7hVar);
        c5538i.m18944s(true);
        try {
            JSONObject jSONObject = new JSONObject(C5502s.m18811v(new zurt.C5558k(c5538i).toq()));
            int i2 = jSONObject.getInt("code");
            if (i2 == 0) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                return new C6099k(jSONObject2.getString("passport_ca_token"), jSONObject2.getString("casecurity"));
            }
            if (i2 != 10008) {
                throw new n7h("error result");
            }
            throw new C6757k("when getting Token server returns code: " + i2);
        } catch (cdj e2) {
            throw new IllegalStateException(e2);
        } catch (p039w.f7l8 e3) {
            throw new IllegalStateException(e3);
        } catch (kja0 e4) {
            throw new IllegalStateException(e4);
        } catch (p039w.n7h e6) {
            throw new IllegalStateException(e6);
        } catch (x2 e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public C6099k m18774n(String str) throws n7h, IllegalBlockSizeException, IOException, CertificateException, BadPaddingException, JSONException, C5545n, NoSuchPaddingException, C5539k, com.xiaomi.accountsdk.request.zy, NoSuchAlgorithmException, C6757k, InvalidKeyException {
        return m18775q();
    }

    /* JADX INFO: renamed from: q */
    public C6099k m18775q() throws n7h, IllegalBlockSizeException, IOException, CertificateException, BadPaddingException, JSONException, C5545n, NoSuchPaddingException, C5539k, com.xiaomi.accountsdk.request.zy, NoSuchAlgorithmException, C6757k, InvalidKeyException {
        InterfaceC5501q interfaceC5501q = this.f30762k;
        if (interfaceC5501q == null) {
            throw new IllegalStateException("passportCATokenExternal is null");
        }
        C6099k qVar = interfaceC5501q.toq();
        if (qVar == null) {
            String host = new URL(C5504y.f30792g).getHost();
            k kVar = new k();
            kVar.f7l8();
            try {
                qVar = m18773k(host);
                if (qVar != null) {
                    this.f30762k.m18788k(qVar);
                }
            } finally {
                kVar.m18778g(qVar);
            }
        }
        return qVar;
    }

    /* JADX INFO: renamed from: s */
    public void m18776s(InterfaceC5501q interfaceC5501q) {
        if (interfaceC5501q == null) {
            throw new IllegalArgumentException("passportCAExternal should not be null");
        }
        this.f30762k = interfaceC5501q;
    }

    public String toq(String str) {
        return C5504y.m18829k(str);
    }

    /* JADX INFO: renamed from: y */
    public void m18777y(Long l2) {
        if (this.f30762k != null) {
            if (l2 == null) {
                l2 = 86400L;
            } else if (l2.longValue() > f30761q) {
                l2 = Long.valueOf(f30761q);
            }
            this.f30762k.m18789q(System.currentTimeMillis() + (l2.longValue() * 1000));
        }
    }
}
