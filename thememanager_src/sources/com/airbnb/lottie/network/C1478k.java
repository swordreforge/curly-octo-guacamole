package com.airbnb.lottie.network;

import com.airbnb.lottie.utils.C1510q;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.airbnb.lottie.network.k */
/* JADX INFO: compiled from: DefaultLottieFetchResult.java */
/* JADX INFO: loaded from: classes.dex */
public class C1478k implements InterfaceC1480q {

    /* JADX INFO: renamed from: k */
    @lvui
    private final HttpURLConnection f8129k;

    public C1478k(@lvui HttpURLConnection httpURLConnection) {
        this.f8129k = httpURLConnection;
    }

    /* JADX INFO: renamed from: k */
    private String m6114k(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    @Override // com.airbnb.lottie.network.InterfaceC1480q
    @dd
    /* JADX INFO: renamed from: c */
    public String mo6115c() {
        return this.f8129k.getContentType();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8129k.disconnect();
    }

    @Override // com.airbnb.lottie.network.InterfaceC1480q
    @lvui
    /* JADX INFO: renamed from: o */
    public InputStream mo6116o() throws IOException {
        return this.f8129k.getInputStream();
    }

    @Override // com.airbnb.lottie.network.InterfaceC1480q
    /* JADX INFO: renamed from: s */
    public boolean mo6117s() {
        try {
            return this.f8129k.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.airbnb.lottie.network.InterfaceC1480q
    @dd
    public String yqrt() {
        try {
            if (mo6117s()) {
                return null;
            }
            return "Unable to fetch " + this.f8129k.getURL() + ". Failed with " + this.f8129k.getResponseCode() + "\n" + m6114k(this.f8129k);
        } catch (IOException e2) {
            C1510q.m6253g("get error failed ", e2);
            return e2.getMessage();
        }
    }
}
