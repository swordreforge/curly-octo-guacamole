package com.tencent.mm.opensdk.diffdev.p008a;

import com.tencent.mm.opensdk.utils.Log;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C5368e {
    /* JADX INFO: renamed from: b */
    public static byte[] m18245b(String str, int i2) {
        String string;
        StringBuilder sb;
        if (str != null && str.length() != 0) {
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            HttpGet httpGet = new HttpGet(str);
            if (i2 >= 0) {
                try {
                    HttpConnectionParams.setSoTimeout(defaultHttpClient.getParams(), i2);
                } catch (Exception e2) {
                    e = e2;
                    sb = new StringBuilder("httpGet, Exception ex = ");
                    sb.append(e.getMessage());
                    string = sb.toString();
                    Log.m18253e("MicroMsg.SDK.NetUtil", string);
                    return null;
                } catch (IncompatibleClassChangeError e3) {
                    e = e3;
                    sb = new StringBuilder("httpGet, IncompatibleClassChangeError ex = ");
                    sb.append(e.getMessage());
                    string = sb.toString();
                    Log.m18253e("MicroMsg.SDK.NetUtil", string);
                    return null;
                } catch (Throwable th) {
                    e = th;
                    sb = new StringBuilder("httpGet, Throwable ex = ");
                    sb.append(e.getMessage());
                    string = sb.toString();
                    Log.m18253e("MicroMsg.SDK.NetUtil", string);
                    return null;
                }
            }
            HttpResponse httpResponseExecute = defaultHttpClient.execute(httpGet);
            if (httpResponseExecute.getStatusLine().getStatusCode() == 200) {
                return EntityUtils.toByteArray(httpResponseExecute.getEntity());
            }
            Log.m18253e("MicroMsg.SDK.NetUtil", "httpGet fail, status code = " + httpResponseExecute.getStatusLine().getStatusCode());
            return null;
        }
        string = "httpGet, url is null";
        Log.m18253e("MicroMsg.SDK.NetUtil", string);
        return null;
    }
}
