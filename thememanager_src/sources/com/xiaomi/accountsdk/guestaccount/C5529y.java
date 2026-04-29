package com.xiaomi.accountsdk.guestaccount;

import com.xiaomi.accountsdk.guestaccount.f7l8;
import com.xiaomi.onetrack.p018g.C5765b;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.guestaccount.y */
/* JADX INFO: compiled from: GuestAccountHttpRequesterImplDefault.java */
/* JADX INFO: loaded from: classes3.dex */
final class C5529y implements f7l8 {

    /* JADX INFO: renamed from: n */
    private static final String f30903n = "&";

    /* JADX INFO: renamed from: q */
    private static final String f30904q = "; ";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f72913toq = 15000;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f72914zy = 15000;

    C5529y() {
    }

    static String toq(Map<String, String> map, String str) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null && value != null) {
                if (z2) {
                    z2 = false;
                } else {
                    sb.append(str);
                }
                sb.append(key);
                sb.append("=");
                sb.append(value);
            }
        }
        return sb.toString();
    }

    @Override // com.xiaomi.accountsdk.guestaccount.f7l8
    /* JADX INFO: renamed from: k */
    public f7l8.C5517k mo18869k(String str, Map<String, String> map, Map<String, String> map2) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("url == null");
        }
        if (map == null) {
            throw new IllegalArgumentException("params == null");
        }
        if (map2 == null) {
            throw new IllegalArgumentException("cookies == null");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        try {
            httpURLConnection.setConnectTimeout(C5765b.f32179b);
            httpURLConnection.setReadTimeout(C5765b.f32179b);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Cookie", toq(map2, f30904q));
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            bufferedWriter.write(toq(map, f30903n));
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            BufferedReader bufferedReader = null;
            if (responseCode != 200) {
                return new f7l8.C5517k(responseCode, null, null, map2);
            }
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()), 1024);
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            f7l8.C5517k c5517k = new f7l8.C5517k(responseCode, sb.toString(), httpURLConnection.getHeaderField(f7l8.f30852k), map2);
                            bufferedReader2.close();
                            return c5517k;
                        }
                        sb.append(line);
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } finally {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.xiaomi.accountsdk.guestaccount.f7l8
    /* JADX INFO: renamed from: q */
    public f7l8.C5517k mo18870q(String str) throws IOException {
        BufferedReader bufferedReader;
        if (str == null) {
            throw new IllegalArgumentException("url == null");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        try {
            httpURLConnection.setConnectTimeout(C5765b.f32179b);
            httpURLConnection.setReadTimeout(C5765b.f32179b);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            BufferedReader bufferedReader2 = null;
            if (responseCode != 200) {
                return new f7l8.C5517k(responseCode, null, null, null);
            }
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()), 1024);
            } catch (Throwable th) {
                th = th;
            }
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                }
                HashMap map = new HashMap();
                CookieManager cookieManager = new CookieManager();
                URI uriCreate = URI.create(str);
                cookieManager.put(uriCreate, httpURLConnection.getHeaderFields());
                for (HttpCookie httpCookie : cookieManager.getCookieStore().get(uriCreate)) {
                    map.put(httpCookie.getName(), httpCookie.getValue());
                }
                f7l8.C5517k c5517k = new f7l8.C5517k(responseCode, sb.toString(), httpURLConnection.getHeaderField(f7l8.f30852k), map);
                bufferedReader.close();
                return c5517k;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    bufferedReader2.close();
                }
                throw th;
            }
        } finally {
            httpURLConnection.disconnect();
        }
    }
}
