package com.xiaomi.push;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.miui.maml.elements.MusicLyricParser;
import com.xiaomi.mipush.sdk.C5658n;
import com.xiaomi.onetrack.p018g.C5765b;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class oc {

    /* JADX INFO: renamed from: k */
    private static final AtomicReference<C5886k<lvui>> f33492k = new AtomicReference<>(m21361q());

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final Pattern f73513toq = Pattern.compile("([^\\s;]+)(.*)");

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final Pattern f73514zy = Pattern.compile("(.*?charset\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    /* JADX INFO: renamed from: q */
    public static final Pattern f33493q = Pattern.compile("(\\<\\?xml\\s+.*?encoding\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    /* JADX INFO: renamed from: com.xiaomi.push.oc$k */
    private static class C5886k<T> extends FutureTask<T> {

        /* JADX INFO: renamed from: k */
        private long f33494k;

        public C5886k(Callable<T> callable) {
            super(callable);
        }

        /* JADX INFO: renamed from: k */
        public boolean m21366k() {
            return nc.m21313p(wu.toq()) || (isDone() && Math.abs(SystemClock.elapsedRealtime() - this.f33494k) > 1800000);
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            this.f33494k = SystemClock.elapsedRealtime();
            super.run();
        }
    }

    public static final class toq extends FilterInputStream {

        /* JADX INFO: renamed from: k */
        private boolean f33495k;

        public toq(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            int i4;
            if (!this.f33495k && (i4 = super.read(bArr, i2, i3)) != -1) {
                return i4;
            }
            this.f33495k = true;
            return -1;
        }
    }

    public static class zy {

        /* JADX INFO: renamed from: k */
        public int f33496k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public Map<String, String> f73515toq;

        public String toString() {
            return String.format("resCode = %1$d, headers = %2$s", Integer.valueOf(this.f33496k), this.f73515toq.toString());
        }
    }

    private static URL cdj(String str) {
        return new URL(str);
    }

    public static InputStream f7l8(Context context, URL url, boolean z2, String str, String str2) {
        return m21364y(context, url, z2, str, str2, null, null);
    }

    public static void fn3e() {
        f33492k.set(m21361q());
    }

    public static boolean fu4(Context context) {
        lvui lvuiVarM21359n = m21359n();
        return lvuiVarM21359n != null && lvuiVarM21359n.m21209g();
    }

    /* JADX INFO: renamed from: g */
    public static lvui m21355g(Context context) {
        return m21359n();
    }

    /* JADX INFO: renamed from: h */
    public static HttpURLConnection m21356h(Context context, URL url) {
        return !"http".equals(url.getProtocol()) ? (HttpURLConnection) url.openConnection() : m21357i(context) ? (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.200", 80))) : (HttpURLConnection) url.openConnection();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m21357i(Context context) {
        lvui lvuiVarM21359n;
        if (!"CN".equalsIgnoreCase(((TelephonyManager) context.getSystemService("phone")).getSimCountryIso()) || (lvuiVarM21359n = m21359n()) == null) {
            return false;
        }
        String strM21212s = lvuiVarM21359n.m21212s();
        return !TextUtils.isEmpty(strM21212s) && strM21212s.length() >= 3 && strM21212s.contains("ctwap");
    }

    /* JADX INFO: renamed from: k */
    public static int m21358k(Context context) {
        lvui lvuiVarM21359n = m21359n();
        if (lvuiVarM21359n == null) {
            return -1;
        }
        return lvuiVarM21359n.m21210k();
    }

    public static void ki() {
        fn3e();
    }

    public static String kja0(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                try {
                    stringBuffer.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                    stringBuffer.append("=");
                    stringBuffer.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                    stringBuffer.append("&");
                } catch (UnsupportedEncodingException e2) {
                    com.xiaomi.channel.commonutils.logger.zy.kja0("Failed to convert from params map to string: " + e2);
                    com.xiaomi.channel.commonutils.logger.zy.kja0("map: " + map.toString());
                    return null;
                }
            }
        }
        if (stringBuffer.length() > 0) {
            stringBuffer = stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    public static String ld6(Context context, URL url) {
        return x2(context, url, false, null, "UTF-8", null);
    }

    public static boolean mcp(Context context) {
        lvui lvuiVarM21355g = m21355g(context);
        if (lvuiVarM21355g == null || lvuiVarM21355g.m21210k() != 0) {
            return false;
        }
        int iF7l8 = lvuiVarM21355g.f7l8();
        return iF7l8 == 1 || iF7l8 == 2 || iF7l8 == 4 || iF7l8 == 7 || iF7l8 == 11;
    }

    /* JADX INFO: renamed from: n */
    public static lvui m21359n() {
        AtomicReference<C5886k<lvui>> atomicReference = f33492k;
        C5886k<lvui> c5886kM21361q = atomicReference.get();
        if (c5886kM21361q != null) {
            try {
                if (c5886kM21361q.m21366k()) {
                    c5886kM21361q = m21361q();
                    atomicReference.set(c5886kM21361q);
                }
                if (!c5886kM21361q.isDone()) {
                    c5886kM21361q.run();
                }
                return c5886kM21361q.get();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String n7h(String str, Map<String, String> map, File file, String str2) {
        HttpURLConnection httpURLConnection;
        DataOutputStream dataOutputStream;
        FileInputStream fileInputStream;
        byte[] bArr;
        if (!file.exists()) {
            return null;
        }
        String name = file.getName();
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setReadTimeout(C5765b.f32179b);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty(com.google.common.net.zy.f68524kja0, "Keep-Alive");
                httpURLConnection.setRequestProperty(com.google.common.net.zy.f68571zy, "multipart/form-data;boundary=*****");
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.setFixedLengthStreamingMode(name.length() + 77 + ((int) file.length()) + str2.length());
                dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.writeBytes("--*****\r\n");
                dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + str2 + "\";filename=\"" + file.getName() + "\"" + MusicLyricParser.CRLF);
                dataOutputStream.writeBytes(MusicLyricParser.CRLF);
                fileInputStream = new FileInputStream(file);
                try {
                    bArr = new byte[1024];
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                f26p.toq(null);
                f26p.toq(file);
                throw th2;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th3) {
            th = th3;
        }
        while (true) {
            int i2 = fileInputStream.read(bArr);
            if (i2 == -1) {
                break;
            }
            dataOutputStream.write(bArr, 0, i2);
            dataOutputStream.flush();
            throw new IOException("IOException:" + e.getClass().getSimpleName());
        }
        dataOutputStream.writeBytes(MusicLyricParser.CRLF);
        dataOutputStream.writeBytes("--");
        dataOutputStream.writeBytes("*****");
        dataOutputStream.writeBytes("--");
        dataOutputStream.writeBytes(MusicLyricParser.CRLF);
        dataOutputStream.flush();
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new toq(httpURLConnection.getInputStream())));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = stringBuffer.toString();
                    f26p.toq(fileInputStream);
                    f26p.toq(bufferedReader);
                    return string;
                }
                stringBuffer.append(line);
            } catch (IOException e4) {
                e = e4;
            } catch (Throwable th4) {
                th = th4;
                throw new IOException(th.getMessage());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean ni7(android.content.Context r3) {
        /*
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r3.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            r1 = 0
            if (r0 == 0) goto L1c
            android.net.Network r2 = r0.getActiveNetwork()     // Catch: java.lang.Exception -> L1c
            android.net.NetworkCapabilities r0 = r0.getNetworkCapabilities(r2)     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L1c
            r2 = 16
            boolean r0 = r0.hasCapability(r2)     // Catch: java.lang.Exception -> L1c
            goto L1d
        L1c:
            r0 = r1
        L1d:
            if (r0 == 0) goto L26
            boolean r3 = fu4(r3)
            if (r3 == 0) goto L26
            r1 = 1
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.oc.ni7(android.content.Context):boolean");
    }

    public static boolean o1t(Context context) {
        lvui lvuiVarM21355g = m21355g(context);
        return lvuiVarM21355g != null && lvuiVarM21355g.m21210k() == 0 && 20 == lvuiVarM21355g.f7l8();
    }

    /* JADX INFO: renamed from: p */
    public static String m21360p(Context context) {
        if (m21365z(context)) {
            return "wifi";
        }
        lvui lvuiVarM21359n = m21359n();
        if (lvuiVarM21359n == null) {
            return "";
        }
        return (lvuiVarM21359n.m21211n() + C5658n.f73185t8r + lvuiVarM21359n.m21213y() + C5658n.f73185t8r + lvuiVarM21359n.m21212s()).toLowerCase();
    }

    /* JADX INFO: renamed from: q */
    private static C5886k<lvui> m21361q() {
        return new C5886k<>(new d2ok());
    }

    public static String qrj(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new String();
        return String.format("%s&key=%s", str, C5874l.toq(String.format("%sbe988a6134bc8254465424e5a70ef037", str)));
    }

    /* JADX INFO: renamed from: s */
    public static Object m21362s(Context context) {
        if (context == null) {
            context = wu.toq();
        }
        eqxt eqxtVar = null;
        if (context == null || nc.m21313p(context)) {
            return null;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
            eqxt eqxtVar2 = new eqxt();
            try {
                connectivityManager.registerNetworkCallback(networkRequestBuild, eqxtVar2);
                return eqxtVar2;
            } catch (Throwable th) {
                th = th;
                eqxtVar = eqxtVar2;
                com.xiaomi.channel.commonutils.logger.zy.kja0("exception occurred in adding network callback :" + th);
                return eqxtVar;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: t */
    public static boolean m21363t(Context context) {
        lvui lvuiVarM21355g = m21355g(context);
        if (lvuiVarM21355g == null || lvuiVarM21355g.m21210k() != 0) {
            return false;
        }
        String strM21213y = lvuiVarM21355g.m21213y();
        if (!"TD-SCDMA".equalsIgnoreCase(strM21213y) && !"CDMA2000".equalsIgnoreCase(strM21213y) && !"WCDMA".equalsIgnoreCase(strM21213y)) {
            switch (lvuiVarM21355g.f7l8()) {
            }
            return false;
        }
        return true;
    }

    public static void t8r(Context context, Object obj) {
        if (context == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof ConnectivityManager.NetworkCallback) {
                ((ConnectivityManager) context.getSystemService("connectivity")).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) obj);
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("exception occurred in removing network callback :" + th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static gvn7 toq(Context context, String str, String str2, Map<String, String> map, String str3) {
        HttpURLConnection httpURLConnectionM21356h;
        int i2;
        boolean zEqualsIgnoreCase;
        BufferedReader bufferedReader;
        gvn7 gvn7Var = new gvn7();
        try {
            try {
                try {
                    httpURLConnectionM21356h = m21356h(context, cdj(str));
                    httpURLConnectionM21356h.setConnectTimeout(10000);
                    httpURLConnectionM21356h.setReadTimeout(C5765b.f32179b);
                    String str4 = str2;
                    if (str2 == 0) {
                        str4 = "GET";
                    }
                    httpURLConnectionM21356h.setRequestMethod(str4);
                    i2 = 0;
                    if (map != null) {
                        zEqualsIgnoreCase = "gzip".equalsIgnoreCase(map.get(com.google.common.net.zy.f68552uv6));
                        for (String str5 : map.keySet()) {
                            httpURLConnectionM21356h.setRequestProperty(str5, map.get(str5));
                        }
                    } else {
                        zEqualsIgnoreCase = false;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        httpURLConnectionM21356h.setDoOutput(true);
                        byte[] bytes = str3.getBytes();
                        OutputStream gZIPOutputStream = zEqualsIgnoreCase ? new GZIPOutputStream(httpURLConnectionM21356h.getOutputStream()) : httpURLConnectionM21356h.getOutputStream();
                        try {
                            gZIPOutputStream.write(bytes, 0, bytes.length);
                            gZIPOutputStream.flush();
                            gZIPOutputStream.close();
                        } catch (IOException e2) {
                            e = e2;
                        } catch (Throwable th) {
                            th = th;
                            throw new IOException(th.getMessage());
                        }
                    }
                    gvn7Var.f32993k = httpURLConnectionM21356h.getResponseCode();
                    com.xiaomi.channel.commonutils.logger.zy.kja0("Http POST Response Code: " + gvn7Var.f32993k);
                } catch (IOException e3) {
                    e = e3;
                }
                while (true) {
                    String headerFieldKey = httpURLConnectionM21356h.getHeaderFieldKey(i2);
                    String headerField = httpURLConnectionM21356h.getHeaderField(i2);
                    if (headerFieldKey == null && headerField == null) {
                        try {
                            break;
                        } catch (IOException unused) {
                            bufferedReader = new BufferedReader(new InputStreamReader(new toq(httpURLConnectionM21356h.getErrorStream())));
                        }
                    } else {
                        gvn7Var.f73344toq.put(headerFieldKey, headerField);
                        i2 = i2 + 1 + 1;
                    }
                    throw new IOException("err while request " + str + ":" + e.getClass().getSimpleName());
                }
                bufferedReader = new BufferedReader(new InputStreamReader(new toq(httpURLConnectionM21356h.getInputStream())));
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                StringBuffer stringBuffer = new StringBuffer();
                String property = System.getProperty("line.separator");
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    stringBuffer.append(line);
                    stringBuffer.append(property);
                }
                gvn7Var.f73345zy = stringBuffer.toString();
                bufferedReader.close();
                f26p.toq(null);
                f26p.toq(null);
                return gvn7Var;
            } catch (IOException e4) {
                e = e4;
            } catch (Throwable th3) {
                th = th3;
                throw new IOException(th.getMessage());
            }
        } catch (Throwable th4) {
            f26p.toq(null);
            f26p.toq(str2);
            throw th4;
        }
    }

    public static boolean wvg(Context context) {
        lvui lvuiVarM21355g = m21355g(context);
        return lvuiVarM21355g != null && lvuiVarM21355g.m21210k() == 0 && 13 == lvuiVarM21355g.f7l8();
    }

    public static String x2(Context context, URL url, boolean z2, String str, String str2, String str3) throws Throwable {
        InputStream inputStreamF7l8;
        try {
            inputStreamF7l8 = f7l8(context, url, z2, str, str3);
            try {
                StringBuilder sb = new StringBuilder(1024);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamF7l8, str2));
                char[] cArr = new char[4096];
                while (true) {
                    int i2 = bufferedReader.read(cArr);
                    if (-1 == i2) {
                        f26p.toq(inputStreamF7l8);
                        return sb.toString();
                    }
                    sb.append(cArr, 0, i2);
                }
            } catch (Throwable th) {
                th = th;
                f26p.toq(inputStreamF7l8);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamF7l8 = null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static InputStream m21364y(Context context, URL url, boolean z2, String str, String str2, Map<String, String> map, zy zyVar) throws IOException {
        if (context == null) {
            throw new IllegalArgumentException("context");
        }
        if (url == null) {
            throw new IllegalArgumentException("url");
        }
        URL url2 = !z2 ? new URL(qrj(url.toString())) : url;
        try {
            HttpURLConnection.setFollowRedirects(true);
            HttpURLConnection httpURLConnectionM21356h = m21356h(context, url2);
            httpURLConnectionM21356h.setConnectTimeout(10000);
            httpURLConnectionM21356h.setReadTimeout(C5765b.f32179b);
            if (!TextUtils.isEmpty(str)) {
                httpURLConnectionM21356h.setRequestProperty("User-Agent", str);
            }
            if (str2 != null) {
                httpURLConnectionM21356h.setRequestProperty("Cookie", str2);
            }
            if (map != null) {
                for (String str3 : map.keySet()) {
                    httpURLConnectionM21356h.setRequestProperty(str3, map.get(str3));
                }
            }
            if (zyVar != null && (url.getProtocol().equals("http") || url.getProtocol().equals("https"))) {
                zyVar.f33496k = httpURLConnectionM21356h.getResponseCode();
                if (zyVar.f73515toq == null) {
                    zyVar.f73515toq = new HashMap();
                }
                int i2 = 0;
                while (true) {
                    String headerFieldKey = httpURLConnectionM21356h.getHeaderFieldKey(i2);
                    String headerField = httpURLConnectionM21356h.getHeaderField(i2);
                    if (headerFieldKey == null && headerField == null) {
                        break;
                    }
                    if (!TextUtils.isEmpty(headerFieldKey) && !TextUtils.isEmpty(headerField)) {
                        zyVar.f73515toq.put(headerFieldKey, headerField);
                    }
                    i2++;
                }
            }
            return new toq(httpURLConnectionM21356h.getInputStream());
        } catch (IOException e2) {
            throw new IOException("IOException:" + e2.getClass().getSimpleName());
        } catch (Throwable th) {
            throw new IOException(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: z */
    public static boolean m21365z(Context context) {
        lvui lvuiVarM21359n = m21359n();
        return lvuiVarM21359n != null && 1 == lvuiVarM21359n.m21210k();
    }

    public static boolean zurt(Context context) {
        return m21358k(context) >= 0;
    }

    public static gvn7 zy(Context context, String str, Map<String, String> map) {
        return toq(context, str, "POST", null, kja0(map));
    }
}
