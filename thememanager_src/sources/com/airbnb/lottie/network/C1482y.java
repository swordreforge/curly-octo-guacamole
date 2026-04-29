package com.airbnb.lottie.network;

import android.util.Pair;
import com.airbnb.lottie.hyr;
import com.airbnb.lottie.ld6;
import com.airbnb.lottie.ni7;
import com.airbnb.lottie.utils.C1510q;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import zy.dd;
import zy.lvui;
import zy.y9n;

/* JADX INFO: renamed from: com.airbnb.lottie.network.y */
/* JADX INFO: compiled from: NetworkFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public class C1482y {

    /* JADX INFO: renamed from: k */
    @lvui
    private final f7l8 f8130k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private final InterfaceC1477g f56150toq;

    public C1482y(@lvui f7l8 f7l8Var, @lvui InterfaceC1477g interfaceC1477g) {
        this.f8130k = f7l8Var;
        this.f56150toq = interfaceC1477g;
    }

    @lvui
    /* JADX INFO: renamed from: g */
    private hyr<ld6> m6118g(@lvui String str, @lvui InputStream inputStream, @dd String str2) throws IOException {
        return str2 == null ? ni7.d2ok(new ZipInputStream(inputStream), null) : ni7.d2ok(new ZipInputStream(new FileInputStream(this.f8130k.f7l8(str, inputStream, zy.ZIP))), str);
    }

    @dd
    @y9n
    /* JADX INFO: renamed from: k */
    private ld6 m6119k(@lvui String str, @dd String str2) {
        Pair<zy, InputStream> qVar;
        if (str2 == null || (qVar = this.f8130k.toq(str)) == null) {
            return null;
        }
        zy zyVar = (zy) qVar.first;
        InputStream inputStream = (InputStream) qVar.second;
        hyr<ld6> hyrVarD2ok = zyVar == zy.ZIP ? ni7.d2ok(new ZipInputStream(inputStream), str) : ni7.fn3e(inputStream, str);
        if (hyrVarD2ok.toq() != null) {
            return hyrVarD2ok.toq();
        }
        return null;
    }

    @lvui
    /* JADX INFO: renamed from: n */
    private hyr<ld6> m6120n(@lvui String str, @lvui InputStream inputStream, @dd String str2) throws IOException {
        return str2 == null ? ni7.fn3e(inputStream, null) : ni7.fn3e(new FileInputStream(this.f8130k.f7l8(str, inputStream, zy.JSON).getAbsolutePath()), str);
    }

    @lvui
    /* JADX INFO: renamed from: q */
    private hyr<ld6> m6121q(@lvui String str, @lvui InputStream inputStream, @dd String str2, @dd String str3) throws IOException {
        zy zyVar;
        hyr<ld6> hyrVarM6118g;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            C1510q.m6254k("Handling zip response.");
            zyVar = zy.ZIP;
            hyrVarM6118g = m6118g(str, inputStream, str3);
        } else {
            C1510q.m6254k("Received json response.");
            zyVar = zy.JSON;
            hyrVarM6118g = m6120n(str, inputStream, str3);
        }
        if (str3 != null && hyrVarM6118g.toq() != null) {
            this.f8130k.m6111g(str, zyVar);
        }
        return hyrVarM6118g;
    }

    @lvui
    @y9n
    private hyr<ld6> toq(@lvui String str, @dd String str2) {
        C1510q.m6254k("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                InterfaceC1480q interfaceC1480qMo6113k = this.f56150toq.mo6113k(str);
                if (!interfaceC1480qMo6113k.mo6117s()) {
                    hyr<ld6> hyrVar = new hyr<>(new IllegalArgumentException(interfaceC1480qMo6113k.yqrt()));
                    try {
                        interfaceC1480qMo6113k.close();
                    } catch (IOException e2) {
                        C1510q.m6253g("LottieFetchResult close failed ", e2);
                    }
                    return hyrVar;
                }
                hyr<ld6> hyrVarM6121q = m6121q(str, interfaceC1480qMo6113k.mo6116o(), interfaceC1480qMo6113k.mo6115c(), str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(hyrVarM6121q.toq() != null);
                C1510q.m6254k(sb.toString());
                try {
                    interfaceC1480qMo6113k.close();
                } catch (IOException e3) {
                    C1510q.m6253g("LottieFetchResult close failed ", e3);
                }
                return hyrVarM6121q;
            } catch (Exception e4) {
                hyr<ld6> hyrVar2 = new hyr<>(e4);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e6) {
                        C1510q.m6253g("LottieFetchResult close failed ", e6);
                    }
                }
                return hyrVar2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e7) {
                    C1510q.m6253g("LottieFetchResult close failed ", e7);
                }
            }
            throw th;
        }
    }

    @lvui
    @y9n
    public hyr<ld6> zy(@lvui String str, @dd String str2) {
        ld6 ld6VarM6119k = m6119k(str, str2);
        if (ld6VarM6119k != null) {
            return new hyr<>(ld6VarM6119k);
        }
        C1510q.m6254k("Animation for " + str + " not found in cache. Fetching from network.");
        return toq(str, str2);
    }
}
