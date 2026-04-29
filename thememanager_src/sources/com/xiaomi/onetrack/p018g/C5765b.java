package com.xiaomi.onetrack.p018g;

import android.text.TextUtils;
import com.google.common.net.zy;
import com.xiaomi.onetrack.p015d.C5750d;
import com.xiaomi.onetrack.p015d.C5752f;
import com.xiaomi.onetrack.p017f.C5756a;
import com.xiaomi.onetrack.util.C5780m;
import com.xiaomi.onetrack.util.C5804p;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import m2t.C6794k;

/* JADX INFO: renamed from: com.xiaomi.onetrack.g.b */
/* JADX INFO: loaded from: classes3.dex */
public class C5765b {

    /* JADX INFO: renamed from: a */
    public static final int f32178a = 10000;

    /* JADX INFO: renamed from: b */
    public static final int f32179b = 15000;

    /* JADX INFO: renamed from: c */
    public static final String f32180c = "OT_SID";

    /* JADX INFO: renamed from: d */
    public static final String f32181d = "OT_ts";

    /* JADX INFO: renamed from: e */
    public static final String f32182e = "OT_net";

    /* JADX INFO: renamed from: f */
    public static final String f32183f = "OT_sender";

    /* JADX INFO: renamed from: g */
    public static final String f32184g = "OT_protocol";

    /* JADX INFO: renamed from: h */
    private static String f32185h = "HttpUtil";

    /* JADX INFO: renamed from: i */
    private static final String f32186i = "GET";

    /* JADX INFO: renamed from: j */
    private static final String f32187j = "POST";

    /* JADX INFO: renamed from: k */
    private static final String f32188k = "&";

    /* JADX INFO: renamed from: l */
    private static final String f32189l = "=";

    /* JADX INFO: renamed from: m */
    private static final String f32190m = "UTF-8";

    /* JADX INFO: renamed from: n */
    private static final String f32191n = "miui_sdkconfig_jafej!@#)(*e@!#";

    /* JADX INFO: renamed from: o */
    private static final int f32192o = 3;

    private C5765b() {
    }

    /* JADX INFO: renamed from: a */
    public static String m20103a(String str, byte[] bArr) throws IOException {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        InputStream inputStream;
        C5804p.m20342a(f32185h, "doPost url=" + str + ", len=" + bArr.length);
        InputStream inputStream2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (IOException e2) {
            e = e2;
            httpURLConnection = null;
            outputStream = null;
        } catch (Throwable th) {
            th = th;
            httpURLConnection = null;
            outputStream = null;
        }
        try {
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(f32179b);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod(f32187j);
            httpURLConnection.setRequestProperty(zy.f68571zy, "application/octet-stream");
            String str2 = C5752f.m20039a().m20043b()[1];
            httpURLConnection.setRequestProperty(f32180c, str2);
            httpURLConnection.setRequestProperty(f32181d, Long.toString(System.currentTimeMillis()));
            httpURLConnection.setRequestProperty(f32182e, C5766c.m20109a(C5756a.m20053b()).toString());
            httpURLConnection.setRequestProperty(f32183f, C5756a.m20058e());
            httpURLConnection.setRequestProperty(f32184g, "3.0");
            C5804p.m20342a(f32185h, "sid:" + str2);
            outputStream = httpURLConnection.getOutputStream();
        } catch (IOException e3) {
            e = e3;
            outputStream = null;
            inputStream = outputStream;
            C5804p.m20347b(f32185h, String.format("HttpUtils POST 上传失败, url: %s, error: %s", str, e.getMessage()));
            C5780m.m20278a(inputStream);
            C5780m.m20279a(outputStream);
            C5780m.m20280a(httpURLConnection);
            return null;
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
        try {
            outputStream.write(bArr, 0, bArr.length);
            outputStream.flush();
            int responseCode = httpURLConnection.getResponseCode();
            inputStream = httpURLConnection.getInputStream();
            try {
                try {
                    byte[] bArrM20282b = C5780m.m20282b(inputStream);
                    C5804p.m20342a(f32185h, String.format("HttpUtils POST 上传成功 url: %s, code: %s", str, Integer.valueOf(responseCode)));
                    String str3 = new String(bArrM20282b, "UTF-8");
                    C5780m.m20278a(inputStream);
                    C5780m.m20279a(outputStream);
                    C5780m.m20280a(httpURLConnection);
                    return str3;
                } catch (IOException e4) {
                    e = e4;
                    C5804p.m20347b(f32185h, String.format("HttpUtils POST 上传失败, url: %s, error: %s", str, e.getMessage()));
                    C5780m.m20278a(inputStream);
                    C5780m.m20279a(outputStream);
                    C5780m.m20280a(httpURLConnection);
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream2 = inputStream;
                C5780m.m20278a(inputStream2);
                C5780m.m20279a(outputStream);
                C5780m.m20280a(httpURLConnection);
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            C5780m.m20278a(inputStream2);
            C5780m.m20279a(outputStream);
            C5780m.m20280a(httpURLConnection);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m20106b(String str, Map<String, String> map) throws IOException {
        return m20107b(str, map, true);
    }

    /* JADX INFO: renamed from: b */
    public static String m20107b(String str, Map<String, String> map, boolean z2) throws IOException {
        return m20100a(f32187j, str, map, z2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m20108b(String str) throws Throwable {
        HttpURLConnection httpURLConnection;
        int responseCode;
        if (TextUtils.isEmpty(str)) {
            C5804p.m20342a(f32185h, "doGetAdMonitor dbUrl is null");
            return true;
        }
        HttpURLConnection httpURLConnection2 = null;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 3) {
            try {
                try {
                    try {
                        if (i3 / 100 == 3) {
                            i2++;
                            str = httpURLConnection2.getHeaderField("Location");
                            C5804p.m20342a(f32185h, "redirect url is:" + str);
                        }
                        httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (ProtocolException e2) {
                    e = e2;
                } catch (Exception e3) {
                    e = e3;
                }
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setRequestMethod(f32186i);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(f32179b);
                    responseCode = httpURLConnection.getResponseCode();
                    C5804p.m20342a(f32185h, "AdMonitor get 请求url:" + str + "_ResponseCode：" + responseCode);
                } catch (ProtocolException e4) {
                    e = e4;
                    httpURLConnection2 = httpURLConnection;
                    if (TextUtils.isEmpty(e.getMessage()) && e.getMessage().contains("200 OK")) {
                        C5804p.m20342a(f32185h, "response code is 200, bug status line is invalid.");
                        try {
                            C5780m.m20280a(httpURLConnection2);
                        } catch (Exception unused) {
                        }
                        return true;
                    }
                    C5780m.m20280a(httpURLConnection2);
                } catch (Exception e6) {
                    e = e6;
                    httpURLConnection2 = httpURLConnection;
                    C5804p.m20347b(f32185h, "HttpUtils doGetAdMonitor 上传异常:" + e.getMessage());
                    C5780m.m20280a(httpURLConnection2);
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection2 = httpURLConnection;
                    try {
                        C5780m.m20280a(httpURLConnection2);
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (Exception unused3) {
            }
            if (responseCode / 100 != 5 && responseCode / 100 != 3) {
                try {
                    C5780m.m20280a(httpURLConnection);
                } catch (Exception unused4) {
                }
                return true;
            }
            if (responseCode / 100 != 3) {
                C5780m.m20280a(httpURLConnection);
                return false;
            }
            i3 = responseCode;
            httpURLConnection2 = httpURLConnection;
        }
        C5804p.m20342a(f32185h, "redirectCount >= 3, return true");
        try {
            C5780m.m20280a(httpURLConnection2);
        } catch (Exception unused5) {
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static String m20099a(String str) throws IOException {
        return m20102a(str, null, false);
    }

    /* JADX INFO: renamed from: a */
    public static String m20101a(String str, Map<String, String> map) throws IOException {
        return m20102a(str, map, true);
    }

    /* JADX INFO: renamed from: a */
    public static String m20102a(String str, Map<String, String> map, boolean z2) throws IOException {
        return m20100a(f32186i, str, map, z2);
    }

    /* JADX INFO: renamed from: a */
    private static String m20100a(String str, String str2, Map<String, String> map, boolean z2) throws Throwable {
        String strM20105a;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        String str3;
        InputStream inputStream2 = null;
        if (map == null) {
            strM20105a = null;
        } else {
            try {
                strM20105a = m20105a(map, z2);
            } catch (Exception e2) {
                e = e2;
                outputStream = null;
                httpURLConnection = null;
                inputStream = null;
                C5804p.m20348b(f32185h, "HttpUtils POST 上传异常", e);
                C5780m.m20278a(inputStream);
                C5780m.m20279a(outputStream);
                C5780m.m20280a(httpURLConnection);
                return null;
            } catch (Throwable th) {
                th = th;
                outputStream = null;
                httpURLConnection = null;
                C5780m.m20278a(inputStream2);
                C5780m.m20279a(outputStream);
                C5780m.m20280a(httpURLConnection);
                throw th;
            }
        }
        if (!f32186i.equals(str) || strM20105a == null) {
            str3 = str2;
        } else {
            str3 = str2 + "? " + strM20105a;
        }
        httpURLConnection = (HttpURLConnection) new URL(str3).openConnection();
        try {
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(f32179b);
            try {
                try {
                    if (f32186i.equals(str)) {
                        httpURLConnection.setRequestMethod(f32186i);
                    } else {
                        if (f32187j.equals(str) && strM20105a != null) {
                            httpURLConnection.setRequestMethod(f32187j);
                            httpURLConnection.setRequestProperty(zy.f68571zy, "application/x-www-form-urlencoded");
                            httpURLConnection.setDoOutput(true);
                            byte[] bytes = strM20105a.getBytes("UTF-8");
                            outputStream = httpURLConnection.getOutputStream();
                            try {
                                outputStream.write(bytes, 0, bytes.length);
                                outputStream.flush();
                            } catch (Exception e3) {
                                e = e3;
                                inputStream = null;
                                C5804p.m20348b(f32185h, "HttpUtils POST 上传异常", e);
                                C5780m.m20278a(inputStream);
                                C5780m.m20279a(outputStream);
                                C5780m.m20280a(httpURLConnection);
                                return null;
                            } catch (Throwable th2) {
                                th = th2;
                                C5780m.m20278a(inputStream2);
                                C5780m.m20279a(outputStream);
                                C5780m.m20280a(httpURLConnection);
                                throw th;
                            }
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        inputStream = httpURLConnection.getInputStream();
                        byte[] bArrM20282b = C5780m.m20282b(inputStream);
                        C5804p.m20342a(f32185h, String.format("HttpUtils POST 上传成功 url: %s, code: %s", str2, Integer.valueOf(responseCode)));
                        String str4 = new String(bArrM20282b, "UTF-8");
                        C5780m.m20278a(inputStream);
                        C5780m.m20279a(outputStream);
                        C5780m.m20280a(httpURLConnection);
                        return str4;
                    }
                    byte[] bArrM20282b2 = C5780m.m20282b(inputStream);
                    C5804p.m20342a(f32185h, String.format("HttpUtils POST 上传成功 url: %s, code: %s", str2, Integer.valueOf(responseCode)));
                    String str42 = new String(bArrM20282b2, "UTF-8");
                    C5780m.m20278a(inputStream);
                    C5780m.m20279a(outputStream);
                    C5780m.m20280a(httpURLConnection);
                    return str42;
                } catch (Exception e4) {
                    e = e4;
                    C5804p.m20348b(f32185h, "HttpUtils POST 上传异常", e);
                    C5780m.m20278a(inputStream);
                    C5780m.m20279a(outputStream);
                    C5780m.m20280a(httpURLConnection);
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream2 = inputStream;
                C5780m.m20278a(inputStream2);
                C5780m.m20279a(outputStream);
                C5780m.m20280a(httpURLConnection);
                throw th;
            }
            outputStream = null;
            int responseCode2 = httpURLConnection.getResponseCode();
            inputStream = httpURLConnection.getInputStream();
        } catch (Exception e6) {
            e = e6;
            outputStream = null;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m20105a(Map<String, String> map, boolean z2) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    if (sb.length() > 0) {
                        sb.append(f32188k);
                    }
                    sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                    sb.append(f32189l);
                    sb.append(URLEncoder.encode(entry.getValue() == null ? "null" : entry.getValue(), "UTF-8"));
                }
            } catch (UnsupportedEncodingException unused) {
                C5804p.m20347b(f32185h, "format params failed");
            }
        }
        if (z2) {
            String strM20104a = m20104a(map);
            if (sb.length() > 0) {
                sb.append(f32188k);
            }
            sb.append(URLEncoder.encode(C6794k.f84363ld6, "UTF-8"));
            sb.append(f32189l);
            sb.append(URLEncoder.encode(strM20104a, "UTF-8"));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m20104a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        if (map != null) {
            ArrayList<String> arrayList = new ArrayList(map.keySet());
            Collections.sort(arrayList);
            for (String str : arrayList) {
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    sb.append(map.get(str));
                }
            }
        }
        sb.append(f32191n);
        return C5750d.m20025c(sb.toString());
    }
}
