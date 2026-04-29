package com.market.sdk.utils;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Connection.java */
/* JADX INFO: loaded from: classes3.dex */
public class f7l8 {

    /* JADX INFO: renamed from: h */
    private static final int f28193h = 30000;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f68987kja0 = 10000;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f68988ld6 = "MarketConnection";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f68989n7h = 10000;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    protected static final String f68990qrj = "https";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    protected static final String f68991x2 = "http";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    protected boolean f68992f7l8;

    /* JADX INFO: renamed from: g */
    protected boolean f28194g;

    /* JADX INFO: renamed from: k */
    protected JSONObject f28195k;

    /* JADX INFO: renamed from: n */
    protected boolean f28196n;

    /* JADX INFO: renamed from: p */
    protected boolean f28197p;

    /* JADX INFO: renamed from: q */
    protected String f28198q;

    /* JADX INFO: renamed from: s */
    protected boolean f28199s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected URL f68993toq;

    /* JADX INFO: renamed from: y */
    protected boolean f28200y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected C5005n f68994zy;

    /* JADX INFO: renamed from: com.market.sdk.utils.f7l8$g */
    /* JADX INFO: compiled from: Connection.java */
    protected abstract class AbstractC5003g extends OutputStream {

        /* JADX INFO: renamed from: k */
        protected OutputStream f28201k;

        public AbstractC5003g(OutputStream outputStream) {
            if (outputStream == null) {
                throw new IllegalArgumentException("outputstream is null");
            }
            this.f28201k = outputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f28201k.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f28201k.flush();
        }

        /* JADX INFO: renamed from: k */
        public abstract void mo17421k();

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f28201k.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            this.f28201k.write(bArr, i2, i3);
        }

        @Override // java.io.OutputStream
        public void write(int i2) throws IOException {
            this.f28201k.write(i2);
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.utils.f7l8$k */
    /* JADX INFO: compiled from: Connection.java */
    protected class C5004k extends Exception {
        private static final long serialVersionUID = 1;
        protected EnumC5006q mError;

        public C5004k(EnumC5006q enumC5006q) {
            this.mError = enumC5006q;
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.utils.f7l8$n */
    /* JADX INFO: compiled from: Connection.java */
    public class C5005n {

        /* JADX INFO: renamed from: k */
        private TreeMap<String, String> f28203k;

        public C5005n(f7l8 f7l8Var) {
            this(true);
        }

        /* JADX INFO: renamed from: k */
        public C5005n m17422k(String str, String str2) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                this.f28203k.put(str, str2);
            }
            return this;
        }

        /* JADX INFO: renamed from: n */
        public boolean m17423n() {
            return this.f28203k.isEmpty();
        }

        /* JADX INFO: renamed from: q */
        public TreeMap<String, String> m17424q() {
            return this.f28203k;
        }

        public String toString() {
            if (this.f28203k.isEmpty()) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (String str : this.f28203k.keySet()) {
                sb.append(str);
                sb.append("=");
                try {
                    sb.append(URLEncoder.encode(this.f28203k.get(str), "UTF-8"));
                } catch (UnsupportedEncodingException unused) {
                }
                sb.append("&");
            }
            return sb.deleteCharAt(sb.length() - 1).toString();
        }

        public C5005n toq(String str, boolean z2) {
            if (z2) {
                this.f28203k.put(str, "true");
            } else {
                this.f28203k.put(str, "false");
            }
            return this;
        }

        public String zy(String str) {
            return this.f28203k.get(str);
        }

        public C5005n(boolean z2) {
            this.f28203k = new TreeMap<>();
            if (z2) {
                f7l8.this.f68994zy = this;
            }
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.utils.f7l8$q */
    /* JADX INFO: compiled from: Connection.java */
    public enum EnumC5006q {
        OK,
        URL_ERROR,
        NETWORK_ERROR,
        AUTH_ERROR,
        CLIENT_ERROR,
        SERVER_ERROR,
        RESULT_ERROR,
        UNKNOWN_ERROR
    }

    /* JADX INFO: compiled from: Connection.java */
    protected class toq extends AbstractC5003g {

        /* JADX INFO: renamed from: n */
        private File f28206n;

        public toq(File file) throws FileNotFoundException {
            super(new FileOutputStream(file));
            this.f28206n = file;
        }

        @Override // com.market.sdk.utils.f7l8.AbstractC5003g
        /* JADX INFO: renamed from: k */
        public void mo17421k() {
            try {
                this.f28201k.close();
            } catch (IOException unused) {
            }
            this.f28206n.delete();
            try {
                this.f28201k = new FileOutputStream(this.f28206n);
            } catch (FileNotFoundException unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: Connection.java */
    protected class zy extends AbstractC5003g {
        public zy(ByteArrayOutputStream byteArrayOutputStream) {
            super(byteArrayOutputStream);
        }

        @Override // com.market.sdk.utils.f7l8.AbstractC5003g
        /* JADX INFO: renamed from: k */
        public void mo17421k() {
            ((ByteArrayOutputStream) this.f28201k).reset();
        }
    }

    public f7l8(String str) {
        this(str, false);
    }

    private void f7l8(URL url) {
        this.f28196n = true;
        this.f28194g = false;
        this.f68992f7l8 = true;
        this.f28200y = true;
        this.f28199s = true;
        if (m17416k(url)) {
            this.f68993toq = url;
        }
    }

    /* JADX INFO: renamed from: g */
    private EnumC5006q m17412g(int i2) {
        if (i2 == 200) {
            return EnumC5006q.OK;
        }
        C5013p.m17465q(f68988ld6, "Network Error : " + i2);
        return EnumC5006q.SERVER_ERROR;
    }

    public static String toq(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        if (str.charAt(str.length() - 1) == '/') {
            str = str.substring(0, str.length() - 1);
        }
        if (str2.charAt(0) == '/') {
            str2 = str2.substring(1);
        }
        return str + "/" + str2;
    }

    /* JADX INFO: renamed from: y */
    private EnumC5006q m17413y(String str, String str2, boolean z2, boolean z3, AbstractC5003g abstractC5003g) throws Throwable {
        HttpURLConnection httpURLConnectionM17420s;
        Exception e2;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        Exception e3;
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(str);
        for (String str3 : arrayList) {
            if (ki.f68996toq) {
                C5013p.toq(f68988ld6, "hosted connection url: " + str3);
            }
            try {
                URL url = new URL(str3);
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnectionM17420s = (HttpURLConnection) url.openConnection();
                    try {
                        try {
                            httpURLConnectionM17420s.setConnectTimeout(10000);
                            if (ki.kja0(C5010k.toq())) {
                                httpURLConnectionM17420s.setReadTimeout(10000);
                            } else {
                                httpURLConnectionM17420s.setReadTimeout(30000);
                            }
                            if (z2) {
                                httpURLConnectionM17420s.setRequestMethod("GET");
                                httpURLConnectionM17420s.setDoOutput(false);
                            } else {
                                httpURLConnectionM17420s.setRequestMethod("POST");
                                httpURLConnectionM17420s.setDoOutput(true);
                            }
                            try {
                                httpURLConnectionM17420s = m17420s(httpURLConnectionM17420s);
                                httpURLConnectionM17420s.connect();
                                if (!z2 && !TextUtils.isEmpty(str2)) {
                                    OutputStream outputStream = httpURLConnectionM17420s.getOutputStream();
                                    outputStream.write(str2.getBytes());
                                    if (ki.f68996toq) {
                                        C5013p.toq(f68988ld6, "[post]" + str2);
                                    }
                                    outputStream.close();
                                }
                                EnumC5006q enumC5006qM17412g = m17412g(httpURLConnectionM17420s.getResponseCode());
                                if (enumC5006qM17412g == EnumC5006q.OK && abstractC5003g != null) {
                                    try {
                                        bufferedInputStream = new BufferedInputStream(httpURLConnectionM17420s.getInputStream(), 8192);
                                        try {
                                            try {
                                                byte[] bArr = new byte[1024];
                                                while (true) {
                                                    int i2 = bufferedInputStream.read(bArr, 0, 1024);
                                                    if (i2 <= 0) {
                                                        break;
                                                    }
                                                    abstractC5003g.write(bArr, 0, i2);
                                                }
                                                abstractC5003g.flush();
                                                bufferedInputStream.close();
                                            } catch (Exception e4) {
                                                e3 = e4;
                                                C5013p.m17465q(f68988ld6, "Connection Exception for " + url.getHost() + " : read file stream error " + e3);
                                                abstractC5003g.mo17421k();
                                                if (bufferedInputStream != null) {
                                                    bufferedInputStream.close();
                                                }
                                                httpURLConnectionM17420s.disconnect();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (bufferedInputStream != null) {
                                                bufferedInputStream.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e6) {
                                        bufferedInputStream = null;
                                        e3 = e6;
                                    } catch (Throwable th3) {
                                        bufferedInputStream = null;
                                        th = th3;
                                    }
                                }
                                httpURLConnectionM17420s.disconnect();
                                return enumC5006qM17412g;
                            } catch (C5004k e7) {
                                EnumC5006q enumC5006q = e7.mError;
                                httpURLConnectionM17420s.disconnect();
                                return enumC5006q;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            httpURLConnection = httpURLConnectionM17420s;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    } catch (Exception e8) {
                        e2 = e8;
                        C5013p.m17465q(f68988ld6, "Connection Exception for " + url.getHost() + " :" + e2);
                        if (httpURLConnectionM17420s != null) {
                            httpURLConnectionM17420s.disconnect();
                        }
                    }
                } catch (Exception e9) {
                    httpURLConnectionM17420s = null;
                    e2 = e9;
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (MalformedURLException e10) {
                C5013p.m17465q(f68988ld6, " URL error :" + e10);
            }
        }
        return EnumC5006q.NETWORK_ERROR;
    }

    public void cdj(boolean z2) {
        this.f68992f7l8 = z2;
    }

    /* JADX INFO: renamed from: h */
    public void m17414h(boolean z2) {
        this.f28196n = z2;
    }

    /* JADX INFO: renamed from: i */
    public void m17415i(boolean z2) {
        this.f28194g = z2;
    }

    /* JADX INFO: renamed from: k */
    protected boolean m17416k(URL url) {
        if (url == null) {
            return false;
        }
        String protocol = url.getProtocol();
        return TextUtils.equals(protocol, "http") || TextUtils.equals(protocol, "https");
    }

    public void ki(boolean z2) {
        this.f28200y = z2;
    }

    public EnumC5006q kja0() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        EnumC5006q enumC5006qX2 = x2(new zy(byteArrayOutputStream));
        if (enumC5006qX2 == EnumC5006q.OK) {
            this.f28198q = byteArrayOutputStream.toString();
        } else {
            C5013p.m17465q(f68988ld6, "Connection failed : " + enumC5006qX2);
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused) {
        }
        return enumC5006qX2;
    }

    protected String ld6(String str, C5005n c5005n) throws C5004k {
        return str;
    }

    /* JADX INFO: renamed from: n */
    public String m17417n() {
        return this.f28198q;
    }

    public EnumC5006q n7h() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        EnumC5006q enumC5006qX2 = x2(new zy(byteArrayOutputStream));
        try {
            try {
                if (enumC5006qX2 == EnumC5006q.OK) {
                    this.f28195k = new JSONObject(byteArrayOutputStream.toString());
                } else {
                    C5013p.m17465q(f68988ld6, "Connection failed : " + enumC5006qX2);
                }
                return enumC5006qX2;
            } catch (JSONException e2) {
                C5013p.m17465q(f68988ld6, "JSON error: " + e2);
                EnumC5006q enumC5006q = EnumC5006q.RESULT_ERROR;
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                return enumC5006q;
            }
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: p */
    protected C5005n m17418p(C5005n c5005n) throws C5004k {
        return c5005n;
    }

    /* JADX INFO: renamed from: q */
    public JSONObject m17419q() {
        return this.f28195k;
    }

    public EnumC5006q qrj(File file) throws Throwable {
        if (file == null) {
            throw new IllegalArgumentException();
        }
        try {
            toq toqVar = new toq(file);
            EnumC5006q enumC5006qX2 = x2(toqVar);
            try {
                toqVar.close();
                if (enumC5006qX2 != EnumC5006q.OK) {
                    C5013p.m17465q(f68988ld6, "Connection failed : " + enumC5006qX2);
                    file.delete();
                }
            } catch (IOException unused) {
            }
            return enumC5006qX2;
        } catch (FileNotFoundException e2) {
            C5013p.m17465q(f68988ld6, "File not found: " + e2);
            throw e2;
        }
    }

    /* JADX INFO: renamed from: s */
    protected HttpURLConnection m17420s(HttpURLConnection httpURLConnection) throws C5004k {
        return httpURLConnection;
    }

    public void t8r(boolean z2) {
        this.f28199s = z2;
    }

    protected EnumC5006q x2(AbstractC5003g abstractC5003g) throws Throwable {
        if (this.f68993toq == null) {
            return EnumC5006q.URL_ERROR;
        }
        if (!ki.m17445y(C5010k.toq())) {
            return EnumC5006q.NETWORK_ERROR;
        }
        if (this.f68994zy == null) {
            this.f68994zy = new C5005n(this);
        }
        try {
            C5005n c5005nM17418p = m17418p(this.f68994zy);
            String string = this.f68993toq.toString();
            if (this.f28194g && !c5005nM17418p.m17423n()) {
                String query = this.f68993toq.getQuery();
                String string2 = this.f68993toq.toString();
                if (TextUtils.isEmpty(query)) {
                    string = string2 + "?" + c5005nM17418p.toString();
                } else {
                    string = string2 + "&" + c5005nM17418p.toString();
                }
            }
            try {
                String strLd6 = ld6(string, c5005nM17418p);
                if (ki.f68996toq) {
                    C5013p.toq(f68988ld6, "connection url: " + strLd6);
                }
                String string3 = !this.f28194g ? c5005nM17418p.toString() : "";
                long jCurrentTimeMillis = System.currentTimeMillis();
                EnumC5006q enumC5006qM17413y = m17413y(strLd6, string3, this.f28194g, false, abstractC5003g);
                if (ki.f68996toq) {
                    C5013p.toq(f68988ld6, "Time(ms) spent in request: " + (System.currentTimeMillis() - jCurrentTimeMillis) + ", " + strLd6);
                }
                return enumC5006qM17413y;
            } catch (C5004k e2) {
                return e2.mError;
            }
        } catch (C5004k e3) {
            return e3.mError;
        }
    }

    public C5005n zy() {
        return this.f68994zy;
    }

    public f7l8(String str, String str2) {
        this(toq(str, str2), false);
    }

    public f7l8(String str, boolean z2) {
        URL url;
        try {
            url = new URL(str);
        } catch (MalformedURLException e2) {
            C5013p.m17465q(f68988ld6, "URL error: " + e2);
            url = null;
        }
        f7l8(url);
        this.f28197p = z2;
    }
}
