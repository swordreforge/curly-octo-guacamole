package com.tencent.wxop.stat;

import org.apache.http.HttpResponse;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: renamed from: com.tencent.wxop.stat.j */
/* JADX INFO: loaded from: classes3.dex */
class C5416j extends DefaultConnectionKeepAliveStrategy {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C5415i f30226a;

    C5416j(C5415i c5415i) {
        this.f30226a = c5415i;
    }

    @Override // org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy, org.apache.http.conn.ConnectionKeepAliveStrategy
    public long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
        long keepAliveDuration = super.getKeepAliveDuration(httpResponse, httpContext);
        if (keepAliveDuration == -1) {
            return 30000L;
        }
        return keepAliveDuration;
    }
}
