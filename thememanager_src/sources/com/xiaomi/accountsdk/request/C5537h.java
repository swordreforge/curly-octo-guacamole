package com.xiaomi.accountsdk.request;

import android.text.TextUtils;
import com.xiaomi.accountsdk.account.C5499n;
import com.xiaomi.accountsdk.request.wvg;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import com.xiaomi.accountsdk.utils.C5581y;
import com.xiaomi.accountsdk.utils.InterfaceC5575p;
import ix.C6099k;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import kx3.C6757k;
import org.json.JSONException;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.request.h */
/* JADX INFO: compiled from: PassportCARequest.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5537h extends t8r {

    /* JADX INFO: renamed from: n */
    private static final String f30935n = "passport_ca_token";

    /* JADX INFO: renamed from: q */
    private static final String f30936q = "com.xiaomi.accountsdk.request.h";

    /* JADX INFO: renamed from: k */
    private final zurt f30937k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final C5499n f72924toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f72925zy = false;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.request.h$q */
    /* JADX INFO: compiled from: PassportCARequest.java */
    private static class q implements zy {
        private q() {
        }

        @Override // com.xiaomi.accountsdk.request.C5537h.zy
        /* JADX INFO: renamed from: k */
        public boolean mo18938k(String str) {
            return (str == null || str.startsWith("_")) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.request.h$toq */
    /* JADX INFO: compiled from: PassportCARequest.java */
    private static class toq implements zy {
        private toq() {
        }

        @Override // com.xiaomi.accountsdk.request.C5537h.zy
        /* JADX INFO: renamed from: k */
        public boolean mo18938k(String str) {
            return (str == null || str.startsWith("__") || str.equals(C5537h.f30935n)) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.request.h$zy */
    /* JADX INFO: compiled from: PassportCARequest.java */
    private interface zy {
        /* JADX INFO: renamed from: k */
        boolean mo18938k(String str);
    }

    public C5537h(zurt zurtVar, C5499n c5499n) {
        this.f30937k = zurtVar;
        this.f72924toq = c5499n;
    }

    /* JADX INFO: renamed from: g */
    private static C6099k m18933g(String str, C5499n c5499n) throws com.xiaomi.accountsdk.request.zy, C6757k {
        try {
            return c5499n.m18774n(str);
        } catch (C5539k e2) {
            throw new C6757k(e2);
        } catch (C5545n e3) {
            throw new C6757k(e3);
        } catch (n7h e4) {
            throw new C6757k(e4);
        } catch (IOException e6) {
            throw new C6757k(e6);
        } catch (InvalidKeyException e7) {
            throw new C6757k(e7);
        } catch (NoSuchAlgorithmException e8) {
            throw new C6757k(e8);
        } catch (CertificateException e9) {
            throw new C6757k(e9);
        } catch (BadPaddingException e10) {
            throw new C6757k(e10);
        } catch (IllegalBlockSizeException e11) {
            throw new C6757k(e11);
        } catch (NoSuchPaddingException e12) {
            throw new C6757k(e12);
        } catch (JSONException e13) {
            throw new C6757k(e13);
        }
    }

    /* JADX INFO: renamed from: s */
    private static wvg.C5555y m18934s(InterfaceC5575p interfaceC5575p, wvg.C5555y c5555y) throws n7h {
        String strM19020s = c5555y.m19020s();
        boolean z2 = true;
        boolean z3 = c5555y.m19024q() == 302;
        if (TextUtils.isEmpty(strM19020s)) {
            throw new n7h("invalid response from server", null, z3);
        }
        try {
            wvg.C5555y c5555y2 = new wvg.C5555y(interfaceC5575p.toq(strM19020s));
            c5555y2.m19025y(c5555y.m19024q());
            Map<String, String> mapZy = c5555y.zy();
            for (String str : c5555y.m19022k()) {
                try {
                    mapZy.put(str, interfaceC5575p.toq(c5555y.toq(str)));
                } catch (C5545n unused) {
                }
            }
            c5555y2.f7l8(mapZy);
            return c5555y2;
        } catch (C5545n e2) {
            boolean zM18935y = m18935y(strM19020s);
            if (!z3 && !zM18935y) {
                z2 = false;
            }
            throw new n7h("failed to decrypt response", e2, z2);
        }
    }

    /* JADX INFO: renamed from: y */
    static boolean m18935y(String str) {
        return str != null && (str.contains("html") || str.contains("http"));
    }

    private static void zy(com.xiaomi.accountsdk.utils.n7h<String, String> n7hVar, InterfaceC5575p interfaceC5575p, zy zyVar) throws C6757k {
        try {
            for (Map.Entry<String, String> entry : n7hVar.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null && zyVar.mo18938k(key)) {
                    n7hVar.put(key, interfaceC5575p.mo19092k(value));
                }
            }
        } catch (C5545n e2) {
            throw new C6757k(e2);
        }
    }

    wvg.C5555y f7l8(com.xiaomi.accountsdk.request.zy zyVar) throws fn3e, IOException {
        Long lValueOf;
        String wwwAuthenticateHeader = zyVar.getWwwAuthenticateHeader();
        if ("passportCA".equals(wwwAuthenticateHeader)) {
            m18936n().m18772g();
            return mo18922k();
        }
        if (!"passportCA-Disabled".equals(wwwAuthenticateHeader)) {
            throw new fn3e(zyVar);
        }
        try {
            lValueOf = Long.valueOf(zyVar.getCaDisableSecondsHeader());
        } catch (NumberFormatException e2) {
            AbstractC5574n.o1t(f30936q, e2);
            lValueOf = null;
        }
        m18936n().m18777y(lValueOf);
        throw new fn3e(new C6757k("PassportCA Disabled"));
    }

    @Override // com.xiaomi.accountsdk.request.t8r
    /* JADX INFO: renamed from: k */
    public wvg.C5555y mo18922k() throws fn3e, IOException {
        if (m18936n() == null || !m18936n().f7l8()) {
            throw new fn3e(new C6757k("null CA Manager"));
        }
        try {
            return m18937q();
        } catch (fn3e e2) {
            if (!(e2.getCause() instanceof com.xiaomi.accountsdk.request.zy) || this.f72925zy) {
                throw e2;
            }
            this.f72925zy = true;
            return f7l8((com.xiaomi.accountsdk.request.zy) e2.getCause());
        } catch (C5539k e3) {
            throw new fn3e(e3);
        } catch (n7h e4) {
            throw new fn3e(e4);
        } catch (com.xiaomi.accountsdk.request.zy e6) {
            if (this.f72925zy) {
                throw new fn3e(e6);
            }
            this.f72925zy = true;
            return f7l8(e6);
        } catch (C6757k e7) {
            throw new fn3e(e7);
        }
    }

    /* JADX INFO: renamed from: n */
    C5499n m18936n() {
        return this.f72924toq;
    }

    /* JADX INFO: renamed from: q */
    wvg.C5555y m18937q() throws n7h, com.xiaomi.accountsdk.request.zy, C5539k, C6757k, fn3e, IOException {
        if (this.f30937k.m19042n()) {
            throw new IllegalStateException("https request should not use PassportCA");
        }
        zurt zurtVarZy = this.f30937k.zy();
        C5538i c5538i = zurtVarZy.f30999k;
        C6099k c6099kM18933g = m18933g(c5538i.f30938g, m18936n());
        if (c6099kM18933g == null || !c6099kM18933g.m22382k()) {
            throw new C6757k("null CA token");
        }
        c5538i.f30939k.put("_nonce", C5581y.m19157s());
        c5538i.f72927toq.put(f30935n, c6099kM18933g.f35787k);
        c5538i.f72928zy.put("caTag", "noSafe");
        com.xiaomi.accountsdk.utils.zy zyVar = new com.xiaomi.accountsdk.utils.zy(c6099kM18933g.f80336toq);
        zy(c5538i.f30939k, zyVar, new q());
        zy(c5538i.f72927toq, zyVar, new toq());
        c5538i.f30939k.put("_caSign", C5581y.x2(zurtVarZy.mo19043q(), c5538i.f30938g, c5538i.f30939k, c6099kM18933g.f80336toq));
        wvg.C5555y c5555yMo18922k = new ni7(zurtVarZy, new ld6(), new C5548q()).mo18922k();
        if (c5555yMo18922k != null) {
            return m18934s(zyVar, c5555yMo18922k);
        }
        throw new IOException("no response from server");
    }
}
