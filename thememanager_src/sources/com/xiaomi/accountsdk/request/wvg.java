package com.xiaomi.accountsdk.request;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.accountsdk.account.C5500p;
import com.xiaomi.accountsdk.utils.C5578t;
import com.xiaomi.accountsdk.utils.C5582z;
import com.xiaomi.accountsdk.utils.fti;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: SimpleRequest.java */
/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public final class wvg {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f72947f7l8 = "User-Agent";

    /* JADX INFO: renamed from: g */
    public static final String f30979g = "Location";

    /* JADX INFO: renamed from: k */
    private static final boolean f30980k = false;

    /* JADX INFO: renamed from: n */
    private static InterfaceC5536g f30981n = null;

    /* JADX INFO: renamed from: q */
    private static final int f30983q = 30000;

    /* JADX INFO: renamed from: s */
    private static final String f30984s = "=";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f72949toq = "utf-8";

    /* JADX INFO: renamed from: y */
    private static final String f30985y = "&";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final Logger f72950zy = Logger.getLogger(wvg.class.getSimpleName());

    /* JADX INFO: renamed from: p */
    private static InterfaceC5554q f30982p = new C5552k();

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static InterfaceC5551g f72948ld6 = null;

    /* JADX INFO: compiled from: SimpleRequest.java */
    public static class f7l8 extends zy {

        /* JADX INFO: renamed from: q */
        private InputStream f30986q;

        public f7l8(InputStream inputStream) {
            this.f30986q = inputStream;
        }

        /* JADX INFO: renamed from: p */
        public InputStream m19015p() {
            return this.f30986q;
        }

        /* JADX INFO: renamed from: s */
        public void m19016s() {
            com.xiaomi.accountsdk.utils.ki.m19095k(this.f30986q);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.request.wvg$g */
    /* JADX INFO: compiled from: SimpleRequest.java */
    public interface InterfaceC5551g {
        /* JADX INFO: renamed from: k */
        void m19017k(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, boolean z2, Integer num, Map<String, String> map4);
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.request.wvg$k */
    /* JADX INFO: compiled from: SimpleRequest.java */
    static class C5552k implements InterfaceC5554q {
        C5552k() {
        }

        @Override // com.xiaomi.accountsdk.request.wvg.InterfaceC5554q
        /* JADX INFO: renamed from: k */
        public HttpURLConnection mo19018k(URL url) throws IOException {
            if (wvg.f30981n != null) {
                wvg.f30981n.m18932k(url);
            }
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.request.wvg$n */
    /* JADX INFO: compiled from: SimpleRequest.java */
    public static class C5553n extends zy {

        /* JADX INFO: renamed from: q */
        private Map<String, Object> f30987q;

        public C5553n(Map<String, Object> map) {
            this.f30987q = map;
        }

        /* JADX INFO: renamed from: s */
        public Object m19019s(String str) {
            return this.f30987q.get(str);
        }

        @Override // com.xiaomi.accountsdk.request.wvg.zy
        public String toString() {
            return "MapContent{bodies=" + this.f30987q + '}';
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.request.wvg$q */
    /* JADX INFO: compiled from: SimpleRequest.java */
    public interface InterfaceC5554q {
        /* JADX INFO: renamed from: k */
        HttpURLConnection mo19018k(URL url) throws IOException;
    }

    /* JADX INFO: compiled from: SimpleRequest.java */
    static class toq implements CookiePolicy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ HashSet f30988k;

        toq(HashSet hashSet) {
            this.f30988k = hashSet;
        }

        @Override // java.net.CookiePolicy
        public boolean shouldAccept(URI uri, HttpCookie httpCookie) {
            String domain = httpCookie.getDomain();
            Iterator it = this.f30988k.iterator();
            while (it.hasNext()) {
                if (HttpCookie.domainMatches(domain, (String) it.next())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.request.wvg$y */
    /* JADX INFO: compiled from: SimpleRequest.java */
    public static class C5555y extends zy {

        /* JADX INFO: renamed from: q */
        private String f30989q;

        public C5555y(String str) {
            this.f30989q = str;
        }

        /* JADX INFO: renamed from: s */
        public String m19020s() {
            return this.f30989q;
        }

        @Override // com.xiaomi.accountsdk.request.wvg.zy
        public String toString() {
            return "StringContent{body='" + this.f30989q + "'}";
        }
    }

    /* JADX INFO: compiled from: SimpleRequest.java */
    public static class zy {

        /* JADX INFO: renamed from: k */
        private int f30990k = -1;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Set<String> f72951toq = new HashSet();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Map<String, String> f72952zy = new HashMap();

        public void f7l8(Map<String, String> map) {
            this.f72952zy.putAll(map);
        }

        /* JADX INFO: renamed from: g */
        public void m19021g(String str, String str2) {
            this.f72952zy.put(str, str2);
        }

        /* JADX INFO: renamed from: k */
        public Set<String> m19022k() {
            return this.f72951toq;
        }

        /* JADX INFO: renamed from: n */
        public void m19023n(Map<String, String> map) {
            f7l8(map);
            if (map != null) {
                this.f72951toq.addAll(map.keySet());
            }
        }

        /* JADX INFO: renamed from: q */
        public int m19024q() {
            return this.f30990k;
        }

        public String toString() {
            return "HeaderContent{headers=" + this.f72952zy + '}';
        }

        public String toq(String str) {
            return this.f72952zy.get(str);
        }

        /* JADX INFO: renamed from: y */
        public void m19025y(int i2) {
            this.f30990k = i2;
        }

        public Map<String, String> zy() {
            return this.f72952zy;
        }
    }

    protected static HttpURLConnection cdj(String str, Map<String, String> map, Map<String, String> map2, Integer num) {
        URL url;
        try {
            url = new URL(str);
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
            url = null;
        }
        if (url == null) {
            f72950zy.severe("failed to init url");
            return null;
        }
        if (num == null) {
            num = 30000;
        }
        try {
            CookieHandler.setDefault(null);
            HttpURLConnection httpURLConnectionMo19018k = f30982p.mo19018k(url);
            httpURLConnectionMo19018k.setInstanceFollowRedirects(false);
            httpURLConnectionMo19018k.setConnectTimeout(num.intValue());
            httpURLConnectionMo19018k.setReadTimeout(num.intValue());
            httpURLConnectionMo19018k.setUseCaches(false);
            httpURLConnectionMo19018k.setRequestProperty(com.google.common.net.zy.f68571zy, "application/x-www-form-urlencoded");
            if ((map2 == null || TextUtils.isEmpty(map2.get("User-Agent"))) && !TextUtils.isEmpty(C5500p.m18780g())) {
                httpURLConnectionMo19018k.setRequestProperty("User-Agent", C5500p.m18780g());
            }
            if (map == null) {
                map = new com.xiaomi.accountsdk.utils.n7h<>();
            }
            map.put("sdkVersion", fti.m19075k());
            httpURLConnectionMo19018k.setRequestProperty("Cookie", m19006h(map, "; "));
            if (map2 != null) {
                for (String str2 : map2.keySet()) {
                    httpURLConnectionMo19018k.setRequestProperty(str2, map2.get(str2));
                }
            }
            return httpURLConnectionMo19018k;
        } catch (Exception e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static C5553n f7l8(String str, Map<String, String> map, Map<String, String> map2, boolean z2) throws C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        return m19005g(str, map, map2, null, z2);
    }

    public static C5555y fn3e(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, boolean z2) throws C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        return zurt(str, map, map2, map3, map4, z2, null);
    }

    public static C5555y fu4(String str, Map<String, String> map, Map<String, String> map2, boolean z2) throws C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        return zurt(str, map, map2, null, null, z2, null);
    }

    /* JADX INFO: renamed from: g */
    public static C5553n m19005g(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, boolean z2) throws C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        return zy(m19010p(str, map, map3, map2, z2));
    }

    /* JADX INFO: renamed from: h */
    protected static String m19006h(Map<String, String> map, String str) {
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(str);
            }
            String key = entry.getKey();
            String value = entry.getValue();
            sb.append(key);
            sb.append(f30984s);
            sb.append(value);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static C5553n m19007i(String str, Map<String, String> map, Map<String, String> map2, boolean z2) throws C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        return t8r(str, map, map2, null, z2);
    }

    protected static Map<String, String> ki(List<HttpCookie> list) {
        HashMap map = new HashMap();
        for (HttpCookie httpCookie : list) {
            if (!httpCookie.hasExpired()) {
                String name = httpCookie.getName();
                String value = httpCookie.getValue();
                if (name != null) {
                    map.put(name, value);
                }
            }
        }
        return map;
    }

    static void kja0(InterfaceC5554q interfaceC5554q) {
        f30982p = interfaceC5554q;
    }

    public static C5555y ld6(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, boolean z2, Integer num) throws C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        String headerField;
        InterfaceC5551g interfaceC5551g = f72948ld6;
        if (interfaceC5551g != null) {
            interfaceC5551g.m19017k(str, map, map2, map3, z2, num, null);
        }
        String qVar = toq(str, map);
        String qVar2 = qrj().toq(str, map, qVar, map2, map3);
        HttpURLConnection httpURLConnectionCdj = cdj(qVar, map3, map2, num);
        if (httpURLConnectionCdj == null) {
            f72950zy.severe("failed to create URLConnection");
            throw new IOException("failed to create connection");
        }
        try {
            try {
                httpURLConnectionCdj.setDoInput(true);
                httpURLConnectionCdj.setRequestMethod("GET");
                httpURLConnectionCdj.connect();
                int responseCode = httpURLConnectionCdj.getResponseCode();
                qrj().mo19127k(qVar2, responseCode);
                if (C5578t.toq() != null && (headerField = httpURLConnectionCdj.getHeaderField(com.google.common.net.zy.f27260q)) != null) {
                    C5578t.toq().zy(str, headerField);
                }
                if (responseCode != 200 && responseCode != 302) {
                    if (responseCode == 403) {
                        throw new C5539k(responseCode, "access denied, encrypt error or user is forbidden to access the resource");
                    }
                    if (responseCode == 401 || responseCode == 400) {
                        com.xiaomi.accountsdk.request.zy zyVar = new com.xiaomi.accountsdk.request.zy(responseCode, "authentication failure for get, code: " + responseCode);
                        zyVar.setWwwAuthenticateHeader(httpURLConnectionCdj.getHeaderField(com.google.common.net.zy.f68554vq));
                        zyVar.setCaDisableSecondsHeader(httpURLConnectionCdj.getHeaderField("CA-DISABLE-SECONDS"));
                        throw zyVar;
                    }
                    Logger logger = f72950zy;
                    logger.info("http status error when GET: " + responseCode);
                    if (responseCode == 301) {
                        logger.info("unexpected redirect from " + httpURLConnectionCdj.getURL().getHost() + " to " + httpURLConnectionCdj.getHeaderField("Location"));
                    }
                    throw new IOException("unexpected http res code: " + responseCode);
                }
                Map<String, List<String>> headerFields = httpURLConnectionCdj.getHeaderFields();
                CookieManager cookieManager = new CookieManager();
                URI uriCreate = URI.create(qVar);
                cookieManager.put(uriCreate, headerFields);
                Map<String, String> mapKi = ki(cookieManager.getCookieStore().get(uriCreate));
                StringBuilder sb = new StringBuilder();
                if (z2) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnectionCdj.getInputStream()), 1024);
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        } catch (Throwable th) {
                            com.xiaomi.accountsdk.utils.ki.zy(bufferedReader);
                            throw th;
                        }
                    }
                    com.xiaomi.accountsdk.utils.ki.zy(bufferedReader);
                }
                String string = sb.toString();
                C5555y c5555y = new C5555y(string);
                c5555y.m19023n(mapKi);
                c5555y.f7l8(C5582z.m19165y(headerFields));
                c5555y.m19025y(responseCode);
                qrj().mo19128n(qVar2, string, headerFields, mapKi);
                return c5555y;
            } catch (Exception e2) {
                qrj().mo19129q(e2);
                throw e2;
            }
        } finally {
            httpURLConnectionCdj.disconnect();
        }
    }

    /* JADX INFO: renamed from: n */
    private static String m19009n(Map<String, String> map, String str) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(str);
            }
            String strM19011q = m19011q(entry.getKey());
            String strM19011q2 = !TextUtils.isEmpty(entry.getValue()) ? m19011q(entry.getValue()) : "";
            sb.append(strM19011q);
            sb.append(f30984s);
            sb.append(strM19011q2);
        }
        return sb.toString();
    }

    static InterfaceC5554q n7h() {
        return f30982p;
    }

    public static C5555y ni7(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, boolean z2, Integer num) throws C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        return zurt(str, map, map2, map3, null, z2, num);
    }

    public static void o1t(InterfaceC5536g interfaceC5536g) {
        f30981n = interfaceC5536g;
    }

    /* JADX INFO: renamed from: p */
    public static C5555y m19010p(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, boolean z2) throws C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        return ld6(str, map, map2, map3, z2, null);
    }

    /* JADX INFO: renamed from: q */
    private static String m19011q(String str) {
        try {
            return URLEncoder.encode(str, f72949toq);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private static com.xiaomi.accountsdk.utils.qrj qrj() {
        return com.xiaomi.accountsdk.utils.x2.m19149k();
    }

    /* JADX INFO: renamed from: s */
    public static f7l8 m19012s(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) throws com.xiaomi.accountsdk.request.zy, C5539k, IOException {
        String qVar = toq(str, map);
        String qVar2 = qrj().toq(str, map, qVar, map3, map2);
        HttpURLConnection httpURLConnectionCdj = cdj(qVar, map2, map3, null);
        if (httpURLConnectionCdj == null) {
            f72950zy.severe("failed to create URLConnection");
            throw new IOException("failed to create connection");
        }
        try {
            httpURLConnectionCdj.setDoInput(true);
            httpURLConnectionCdj.setRequestMethod("GET");
            httpURLConnectionCdj.setInstanceFollowRedirects(true);
            httpURLConnectionCdj.connect();
            int responseCode = httpURLConnectionCdj.getResponseCode();
            qrj().mo19127k(qVar2, responseCode);
            if (responseCode == 200) {
                Map<String, List<String>> headerFields = httpURLConnectionCdj.getHeaderFields();
                CookieManager cookieManager = new CookieManager();
                URI uriCreate = URI.create(qVar);
                cookieManager.put(uriCreate, headerFields);
                Map<String, String> mapKi = ki(cookieManager.getCookieStore().get(uriCreate));
                mapKi.putAll(C5582z.m19165y(headerFields));
                f7l8 f7l8Var = new f7l8(httpURLConnectionCdj.getInputStream());
                f7l8Var.f7l8(mapKi);
                return f7l8Var;
            }
            if (responseCode == 403) {
                throw new C5539k(responseCode, "access denied, encrypt error or user is forbidden to access the resource");
            }
            if (responseCode == 401 || responseCode == 400) {
                com.xiaomi.accountsdk.request.zy zyVar = new com.xiaomi.accountsdk.request.zy(responseCode, "authentication failure for get, code: " + responseCode);
                zyVar.setWwwAuthenticateHeader(httpURLConnectionCdj.getHeaderField(com.google.common.net.zy.f68554vq));
                zyVar.setCaDisableSecondsHeader(httpURLConnectionCdj.getHeaderField("CA-DISABLE-SECONDS"));
                throw zyVar;
            }
            Logger logger = f72950zy;
            logger.info("http status error when GET: " + responseCode);
            if (responseCode == 301) {
                logger.info("unexpected redirect from " + httpURLConnectionCdj.getURL().getHost() + " to " + httpURLConnectionCdj.getHeaderField("Location"));
            }
            throw new IOException("unexpected http res code: " + responseCode);
        } catch (ProtocolException unused) {
            throw new IOException("protocol error");
        }
    }

    public static C5553n t8r(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, boolean z2) throws C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        return zy(fn3e(str, map, map2, map3, null, z2));
    }

    private static String toq(String str, Map<String, String> map) {
        if (str == null) {
            throw new NullPointerException("origin is not allowed null");
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        return builderBuildUpon.build().toString();
    }

    public static void wvg(InterfaceC5551g interfaceC5551g) {
        f72948ld6 = interfaceC5551g;
    }

    public static C5555y x2(String str, Map<String, String> map, Map<String, String> map2, boolean z2) throws C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        return ld6(str, map, null, map2, z2, null);
    }

    /* JADX INFO: renamed from: y */
    public static f7l8 m19013y(String str, Map<String, String> map, Map<String, String> map2) throws C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        return m19012s(str, map, map2, null);
    }

    /* JADX INFO: renamed from: z */
    public static void m19014z() {
        wvg(null);
    }

    public static C5555y zurt(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, boolean z2, Integer num) throws C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        InterfaceC5551g interfaceC5551g = f72948ld6;
        if (interfaceC5551g != null) {
            interfaceC5551g.m19017k(str, map, map3, map2, z2, num, map4);
        }
        String qVar = map4 != null ? toq(str, map4) : str;
        String strZy = qrj().zy(str, map4, qVar, map, map2, map3);
        HttpURLConnection httpURLConnectionCdj = cdj(qVar, map2, map3, num);
        if (httpURLConnectionCdj == null) {
            f72950zy.severe("failed to create URLConnection");
            throw new IOException("failed to create connection");
        }
        try {
            try {
                httpURLConnectionCdj.setDoInput(true);
                httpURLConnectionCdj.setDoOutput(true);
                httpURLConnectionCdj.setRequestMethod("POST");
                httpURLConnectionCdj.connect();
                if (map != null && !map.isEmpty()) {
                    String strM19009n = m19009n(map, f30985y);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnectionCdj.getOutputStream());
                    try {
                        bufferedOutputStream.write(strM19009n.getBytes(f72949toq));
                        com.xiaomi.accountsdk.utils.ki.toq(bufferedOutputStream);
                    } catch (Throwable th) {
                        com.xiaomi.accountsdk.utils.ki.toq(bufferedOutputStream);
                        throw th;
                    }
                }
                int responseCode = httpURLConnectionCdj.getResponseCode();
                qrj().mo19127k(strZy, responseCode);
                if (responseCode != 200 && responseCode != 302) {
                    if (responseCode == 403) {
                        throw new C5539k(responseCode, "access denied, encrypt error or user is forbidden to access the resource");
                    }
                    if (responseCode == 401 || responseCode == 400) {
                        com.xiaomi.accountsdk.request.zy zyVar = new com.xiaomi.accountsdk.request.zy(responseCode, "authentication failure for post, code: " + responseCode);
                        zyVar.setWwwAuthenticateHeader(httpURLConnectionCdj.getHeaderField(com.google.common.net.zy.f68554vq));
                        zyVar.setCaDisableSecondsHeader(httpURLConnectionCdj.getHeaderField("CA-DISABLE-SECONDS"));
                        throw zyVar;
                    }
                    Logger logger = f72950zy;
                    logger.info("http status error when POST: " + responseCode);
                    if (responseCode == 301) {
                        logger.info("unexpected redirect from " + httpURLConnectionCdj.getURL().getHost() + " to " + httpURLConnectionCdj.getHeaderField("Location"));
                    }
                    throw new IOException("unexpected http res code: " + responseCode);
                }
                Map<String, List<String>> headerFields = httpURLConnectionCdj.getHeaderFields();
                URI uriCreate = URI.create(qVar);
                String host = uriCreate.getHost();
                HashSet hashSet = new HashSet();
                hashSet.add(host);
                if (map3 != null && map3.containsKey("host")) {
                    hashSet.add(map3.get("host"));
                }
                if (hashSet.contains("c.id.mi.com")) {
                    hashSet.add("account.xiaomi.com");
                }
                CookieManager cookieManager = new CookieManager(null, new toq(hashSet));
                cookieManager.put(uriCreate, headerFields);
                HashMap map5 = new HashMap();
                CookieStore cookieStore = cookieManager.getCookieStore();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Map<String, String> mapKi = ki(cookieStore.get(URI.create(qVar.replaceFirst(host, (String) it.next()))));
                    if (mapKi != null) {
                        map5.putAll(mapKi);
                    }
                }
                StringBuilder sb = new StringBuilder();
                if (z2) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnectionCdj.getInputStream()), 1024);
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        } catch (Throwable th2) {
                            com.xiaomi.accountsdk.utils.ki.zy(bufferedReader);
                            throw th2;
                        }
                    }
                    com.xiaomi.accountsdk.utils.ki.zy(bufferedReader);
                }
                String string = sb.toString();
                C5555y c5555y = new C5555y(string);
                c5555y.m19023n(map5);
                c5555y.m19025y(responseCode);
                c5555y.f7l8(C5582z.m19165y(headerFields));
                qrj().mo19128n(strZy, string, headerFields, map5);
                return c5555y;
            } catch (ProtocolException unused) {
                throw new IOException("protocol error");
            }
        } finally {
            httpURLConnectionCdj.disconnect();
        }
    }

    protected static C5553n zy(C5555y c5555y) {
        JSONObject jSONObject;
        if (c5555y == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject(c5555y.m19020s());
        } catch (JSONException e2) {
            e2.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        C5553n c5553n = new C5553n(C5582z.f7l8(jSONObject));
        c5553n.f7l8(c5555y.zy());
        return c5553n;
    }
}
