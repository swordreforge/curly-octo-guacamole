package com.tencent.wxop.stat;

import android.content.Context;
import com.market.sdk.utils.C5019y;
import com.tencent.p003a.p004a.p005a.p006a.C5361y;
import com.tencent.p003a.p004a.p005a.p006a.f7l8;
import com.tencent.wxop.stat.common.C5385e;
import com.tencent.wxop.stat.common.C5392l;
import com.tencent.wxop.stat.common.StatLogger;
import com.tencent.wxop.stat.event.AbstractC5405e;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.wxop.stat.i */
/* JADX INFO: loaded from: classes3.dex */
class C5415i {

    /* JADX INFO: renamed from: d */
    private static StatLogger f30219d = C5392l.m18418b();

    /* JADX INFO: renamed from: e */
    private static C5415i f30220e = null;

    /* JADX INFO: renamed from: f */
    private static Context f30221f = null;

    /* JADX INFO: renamed from: a */
    DefaultHttpClient f30222a;

    /* JADX INFO: renamed from: b */
    C5385e f30223b;

    /* JADX INFO: renamed from: c */
    StringBuilder f30224c = new StringBuilder(4096);

    /* JADX INFO: renamed from: g */
    private long f30225g;

    private C5415i(Context context) {
        this.f30222a = null;
        this.f30223b = null;
        this.f30225g = 0L;
        try {
            f30221f = context.getApplicationContext();
            this.f30225g = System.currentTimeMillis() / 1000;
            this.f30223b = new C5385e();
            if (StatConfig.isDebugEnable()) {
                try {
                    Logger logger = Logger.getLogger("org.apache.http.wire");
                    Level level = Level.FINER;
                    logger.setLevel(level);
                    Logger.getLogger("org.apache.http.headers").setLevel(level);
                    System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
                    System.setProperty("org.apache.commons.logging.simplelog.showdatetime", "true");
                    System.setProperty("org.apache.commons.logging.simplelog.log.httpclient.wire", C5019y.f69046ni7);
                    System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.http", C5019y.f69046ni7);
                    System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.http.headers", C5019y.f69046ni7);
                } catch (Throwable unused) {
                }
            }
            BasicHttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, false);
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 10000);
            HttpConnectionParams.setSoTimeout(basicHttpParams, 10000);
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient(basicHttpParams);
            this.f30222a = defaultHttpClient;
            defaultHttpClient.setKeepAliveStrategy(new C5416j(this));
        } catch (Throwable th) {
            f30219d.m18376e(th);
        }
    }

    /* JADX INFO: renamed from: a */
    static Context m18498a() {
        return f30221f;
    }

    /* JADX INFO: renamed from: a */
    static void m18499a(Context context) {
        f30221f = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    private void m18500a(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("mid");
            if (C5361y.f7l8(strOptString)) {
                if (StatConfig.isDebugEnable()) {
                    f30219d.m18377i("update mid:" + strOptString);
                }
                f7l8.m18225k(f30221f).toq(strOptString);
            }
            if (!jSONObject.isNull("cfg")) {
                StatConfig.m18269a(f30221f, jSONObject.getJSONObject("cfg"));
            }
            if (jSONObject.isNull("ncts")) {
                return;
            }
            int i2 = jSONObject.getInt("ncts");
            int iCurrentTimeMillis = (int) (((long) i2) - (System.currentTimeMillis() / 1000));
            if (StatConfig.isDebugEnable()) {
                f30219d.m18377i("server time:" + i2 + ", diff time:" + iCurrentTimeMillis);
            }
            C5392l.m18448x(f30221f);
            C5392l.m18414a(f30221f, iCurrentTimeMillis);
        } catch (Throwable th) {
            f30219d.m18379w(th);
        }
    }

    /* JADX INFO: renamed from: b */
    static C5415i m18501b(Context context) {
        if (f30220e == null) {
            synchronized (C5415i.class) {
                if (f30220e == null) {
                    f30220e = new C5415i(context);
                }
            }
        }
        return f30220e;
    }

    /* JADX INFO: renamed from: a */
    void m18502a(AbstractC5405e abstractC5405e, InterfaceC5414h interfaceC5414h) {
        m18504b(Arrays.asList(abstractC5405e.m18490g()), interfaceC5414h);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c3  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m18503a(java.util.List<?> r17, com.tencent.wxop.stat.InterfaceC5414h r18) {
        /*
            Method dump skipped, instruction units count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.C5415i.m18503a(java.util.List, com.tencent.wxop.stat.h):void");
    }

    /* JADX INFO: renamed from: b */
    void m18504b(List<?> list, InterfaceC5414h interfaceC5414h) {
        C5385e c5385e = this.f30223b;
        if (c5385e != null) {
            c5385e.m18389a(new RunnableC5417k(this, list, interfaceC5414h));
        }
    }
}
