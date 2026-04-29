package com.miui.privacypolicy;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.xiaomi.onetrack.p018g.C5765b;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import kotlin.text.eqxt;
import m2t.C6794k;
import miuix.security.C7323k;
import org.json.JSONObject;
import y9n.InterfaceC7782q;

/* JADX INFO: renamed from: com.miui.privacypolicy.q */
/* JADX INFO: compiled from: NetUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5321q {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f72471f7l8 = "2dcd9s0c-ad3f-2fas-0l3a-abzo301jd0s9";

    /* JADX INFO: renamed from: k */
    private static final String f29756k = "Privacy_NetUtil";

    /* JADX INFO: renamed from: n */
    private static final String f29757n = "unknown";

    /* JADX INFO: renamed from: q */
    private static final String f29758q = "UTF-8";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final boolean f72472toq = false;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f72473zy = "https://data.sec.miui.com";

    /* JADX INFO: renamed from: g */
    protected static final String f29755g = m18123g("ro.miui.ui.version.name", "unknown");

    /* JADX INFO: renamed from: y */
    protected static final boolean f29759y = m18123g("ro.product.mod_device", "").contains("_global");

    /* JADX INFO: renamed from: com.miui.privacypolicy.q$k */
    /* JADX INFO: compiled from: NetUtils.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f29760k;

        static {
            int[] iArr = new int[toq.values().length];
            f29760k = iArr;
            try {
                iArr[toq.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29760k[toq.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29760k[toq.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29760k[toq.PUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.miui.privacypolicy.q$toq */
    /* JADX INFO: compiled from: NetUtils.java */
    protected enum toq {
        GET,
        POST,
        PUT,
        DELETE
    }

    /* JADX INFO: renamed from: com.miui.privacypolicy.q$zy */
    /* JADX INFO: compiled from: NetUtils.java */
    protected static class zy implements Comparable<zy> {

        /* JADX INFO: renamed from: k */
        private String f29762k;

        /* JADX INFO: renamed from: q */
        private String f29763q;

        zy(String str, String str2) {
            this.f29762k = str;
            this.f29763q = str2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public int compareTo(zy zyVar) {
            return this.f29762k.compareTo(zyVar.f29762k);
        }
    }

    private C5321q() {
    }

    private static HttpURLConnection f7l8(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(C5765b.f32179b);
        httpURLConnection.setReadTimeout(C5765b.f32179b);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: g */
    protected static String m18123g(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e2) {
            Log.e(f29756k, "getSystemProperty error, ", e2);
            return str2;
        }
    }

    /* JADX INFO: renamed from: k */
    private static void m18124k(HttpURLConnection httpURLConnection, JSONObject jSONObject) throws IOException {
        String string = jSONObject.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.addRequestProperty(com.google.common.net.zy.f68571zy, "application/json; charset=UTF-8");
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.writeBytes(string);
        dataOutputStream.flush();
        dataOutputStream.close();
    }

    /* JADX INFO: renamed from: n */
    private static String m18125n(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new zy(entry.getKey(), entry.getValue()));
        }
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zy zyVar = (zy) arrayList.get(i2);
            sb.append(zyVar.f29762k);
            sb.append("=");
            sb.append(zyVar.f29763q);
        }
        sb.append(str);
        return m18126q(new String(Base64.encodeToString(zy(sb.toString()), 2))).toUpperCase();
    }

    /* JADX INFO: renamed from: q */
    private static String m18126q(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C7323k.f90061toq);
            messageDigest.update(zy(str));
            return String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: s */
    private static void m18127s(HttpURLConnection httpURLConnection, toq toqVar, Map<String, String> map, JSONObject jSONObject) throws IOException {
        httpURLConnection.addRequestProperty(C6794k.f84363ld6, m18125n(map, f72471f7l8));
        httpURLConnection.addRequestProperty("timestamp", map.get("timestamp"));
        httpURLConnection.addRequestProperty("source", "sdk");
        int i2 = k.f29760k[toqVar.ordinal()];
        if (i2 == 1) {
            httpURLConnection.setRequestMethod("GET");
            return;
        }
        if (i2 == 2) {
            httpURLConnection.setRequestMethod(InterfaceC7782q.f100601fu4);
            return;
        }
        if (i2 == 3) {
            httpURLConnection.setRequestMethod("POST");
            m18124k(httpURLConnection, jSONObject);
        } else {
            if (i2 != 4) {
                throw new IllegalStateException("Unknown method type.");
            }
            httpURLConnection.setRequestMethod("PUT");
        }
    }

    private static String toq(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!z2) {
                    sb.append(eqxt.f36674q);
                }
                sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                z2 = false;
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("Encoding not supported: " + ((Object) sb), e2);
        }
    }

    /* JADX INFO: renamed from: y */
    protected static String m18128y(Map<String, String> map, String str, toq toqVar, JSONObject jSONObject) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream = null;
        try {
            if (toqVar == toq.GET && map != null) {
                String qVar = toq(map);
                str = str.contains("?") ? str.concat(qVar) : str.concat("?").concat(qVar);
            }
            HttpURLConnection httpURLConnectionF7l8 = f7l8(new URL(str));
            m18127s(httpURLConnectionF7l8, toqVar, map, jSONObject);
            if (httpURLConnectionF7l8.getResponseCode() != 200) {
                com.miui.privacypolicy.zy.m18140k(null);
                com.miui.privacypolicy.zy.toq(null);
                return "";
            }
            InputStream inputStream2 = httpURLConnectionF7l8.getInputStream();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e2) {
                inputStream = inputStream2;
                e = e2;
                byteArrayOutputStream = null;
            } catch (Throwable th) {
                inputStream = inputStream2;
                th = th;
                byteArrayOutputStream = null;
            }
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i2 = inputStream2.read(bArr);
                    if (i2 == -1) {
                        String string = byteArrayOutputStream.toString();
                        com.miui.privacypolicy.zy.m18140k(inputStream2);
                        com.miui.privacypolicy.zy.toq(byteArrayOutputStream);
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                }
            } catch (Exception e3) {
                inputStream = inputStream2;
                e = e3;
            } catch (Throwable th2) {
                inputStream = inputStream2;
                th = th2;
                com.miui.privacypolicy.zy.m18140k(inputStream);
                com.miui.privacypolicy.zy.toq(byteArrayOutputStream);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        try {
            e.printStackTrace();
            com.miui.privacypolicy.zy.m18140k(inputStream);
            com.miui.privacypolicy.zy.toq(byteArrayOutputStream);
            return "";
        } catch (Throwable th4) {
            th = th4;
            com.miui.privacypolicy.zy.m18140k(inputStream);
            com.miui.privacypolicy.zy.toq(byteArrayOutputStream);
            throw th;
        }
    }

    private static byte[] zy(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }
}
