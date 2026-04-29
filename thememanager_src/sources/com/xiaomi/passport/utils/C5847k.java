package com.xiaomi.passport.utils;

import android.text.TextUtils;
import com.xiaomi.accountsdk.account.C5502s;
import com.xiaomi.accountsdk.account.C5504y;
import com.xiaomi.accountsdk.request.C5539k;
import com.xiaomi.accountsdk.request.C5550t;
import com.xiaomi.accountsdk.request.wvg;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.passport.utils.k */
/* JADX INFO: compiled from: AntiSpamIpAddressController.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5847k {

    /* JADX INFO: renamed from: k */
    private static final String f32629k = "AntiSpamIpAddressController";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f73254zy = "ipAddress";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f73253toq = C5504y.f30799n + "/ip/next";

    /* JADX INFO: renamed from: q */
    private static final Map<String, String> f32631q = new HashMap();

    /* JADX INFO: renamed from: n */
    private static final CountDownLatch f32630n = new CountDownLatch(1);

    /* JADX INFO: renamed from: com.xiaomi.passport.utils.k$k */
    /* JADX INFO: compiled from: AntiSpamIpAddressController.java */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5847k.m20544y()) {
                String strM20540g = C5847k.this.m20540g();
                if (!TextUtils.isEmpty(strM20540g)) {
                    AbstractC5574n.m19115y(C5847k.f32629k, "ipAddress not empty");
                    C5847k.f32631q.clear();
                    C5847k.f32631q.put(C5847k.f73254zy, strM20540g);
                }
            }
            C5847k.f32630n.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public String m20540g() {
        wvg.C5555y c5555yM19001s;
        try {
            c5555yM19001s = C5550t.m19001s(f73253toq, null, null, true);
        } catch (C5539k | com.xiaomi.accountsdk.request.zy | IOException | JSONException e2) {
            AbstractC5574n.m19116z(f32629k, "getAntiSpamIPAddress", e2);
        }
        if (c5555yM19001s == null) {
            AbstractC5574n.m19115y(f32629k, "getAntiSpamIPAddress: response content is null");
            return null;
        }
        JSONObject jSONObject = new JSONObject(C5502s.m18811v(c5555yM19001s));
        int i2 = jSONObject.getInt("code");
        AbstractC5574n.m19115y(f32629k, "getAntiSpamIPAddress--code: " + i2 + " ,desc: " + jSONObject.optString("description"));
        if (i2 == 0) {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("data"));
            boolean z2 = jSONObject2.getBoolean("hasNextUrl");
            AbstractC5574n.m19115y(f32629k, "next: " + z2);
            if (z2) {
                return m20542p(jSONObject2.getString("url"));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    private String m20542p(String str) {
        wvg.C5555y c5555yM19001s;
        try {
            c5555yM19001s = C5550t.m19001s(str, null, null, true);
        } catch (C5539k | com.xiaomi.accountsdk.request.zy | IOException | JSONException e2) {
            AbstractC5574n.m19116z(f32629k, "ipv6NextRequest", e2);
        }
        if (c5555yM19001s == null) {
            AbstractC5574n.m19115y(f32629k, "ipv6NextRequest: next url response content is null");
            return null;
        }
        JSONObject jSONObject = new JSONObject(C5502s.m18811v(c5555yM19001s));
        int i2 = jSONObject.getInt("code");
        AbstractC5574n.m19115y(f32629k, "ipv6NextRequest--code: " + i2 + " ,desc: " + jSONObject.getString("description"));
        if (i2 == 0) {
            return c5555yM19001s.toq(f73254zy);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static boolean m20544y() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet6Address) && !inetAddressNextElement.getHostAddress().startsWith("fe80")) {
                        return true;
                    }
                }
            }
            return false;
        } catch (SocketException e2) {
            AbstractC5574n.o1t(f32629k, e2);
            return true;
        }
    }

    public Map<String, String> f7l8() {
        return f32631q;
    }

    /* JADX INFO: renamed from: n */
    public Map<String, String> m20545n() {
        try {
            f32630n.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            AbstractC5574n.m19116z(f32629k, "blockingGetIPAddressCookie", e2);
        }
        return f32631q;
    }

    /* JADX INFO: renamed from: s */
    public void m20546s() {
        Executors.newCachedThreadPool().execute(new k());
    }
}
