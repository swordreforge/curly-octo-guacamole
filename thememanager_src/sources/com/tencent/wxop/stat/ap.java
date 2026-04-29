package com.tencent.wxop.stat;

import android.content.Context;
import com.android.thememanager.lockscreen.lock.wallpaper.kja0;
import com.tencent.wxop.stat.common.StatLogger;
import com.tencent.wxop.stat.event.C5409i;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
class ap implements Runnable {

    /* JADX INFO: renamed from: a */
    private Context f30033a;

    /* JADX INFO: renamed from: b */
    private Map<String, Integer> f30034b;

    /* JADX INFO: renamed from: c */
    private StatSpecifyReportedInfo f30035c;

    public ap(Context context, Map<String, Integer> map, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f30034b = null;
        this.f30033a = context;
        this.f30035c = statSpecifyReportedInfo;
        if (map != null) {
            this.f30034b = map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX INFO: renamed from: a */
    private NetworkMonitor m18323a(String str, int i2) {
        ?? r1;
        int i3;
        NetworkMonitor networkMonitor = new NetworkMonitor();
        Socket socket = new Socket();
        try {
            try {
                networkMonitor.setDomain(str);
                networkMonitor.setPort(i2);
                long jCurrentTimeMillis = System.currentTimeMillis();
                InetSocketAddress inetSocketAddress = new InetSocketAddress(str, i2);
                socket.connect(inetSocketAddress, kja0.f12502h);
                networkMonitor.setMillisecondsConsume(System.currentTimeMillis() - jCurrentTimeMillis);
                networkMonitor.setRemoteIp(inetSocketAddress.getAddress().getHostAddress());
                socket.close();
                try {
                    socket.close();
                } catch (Throwable th) {
                    StatServiceImpl.f29983q.m18376e(th);
                }
                i3 = 0;
                socket = socket;
            } catch (IOException e2) {
                StatServiceImpl.f29983q.m18376e((Throwable) e2);
                i3 = -1;
                socket = r1;
            }
            networkMonitor.setStatusCode(i3);
            return networkMonitor;
        } finally {
            try {
                socket.close();
            } catch (Throwable th2) {
                StatServiceImpl.f29983q.m18376e(th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private Map<String, Integer> m18324a() {
        String str;
        HashMap map = new HashMap();
        String strM18264a = StatConfig.m18264a("__MTA_TEST_SPEED__", (String) null);
        if (strM18264a != null && strM18264a.trim().length() != 0) {
            for (String str2 : strM18264a.split(";")) {
                String[] strArrSplit = str2.split(",");
                if (strArrSplit != null && strArrSplit.length == 2 && (str = strArrSplit[0]) != null && str.trim().length() != 0) {
                    try {
                        map.put(str, Integer.valueOf(Integer.valueOf(strArrSplit[1]).intValue()));
                    } catch (NumberFormatException e2) {
                        StatServiceImpl.f29983q.m18376e((Throwable) e2);
                    }
                }
            }
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        StatLogger statLogger;
        String str;
        try {
            if (this.f30034b == null) {
                this.f30034b = m18324a();
            }
            Map<String, Integer> map = this.f30034b;
            if (map != null && map.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (Map.Entry<String, Integer> entry : this.f30034b.entrySet()) {
                    String key = entry.getKey();
                    if (key == null || key.length() == 0) {
                        statLogger = StatServiceImpl.f29983q;
                        str = "empty domain name.";
                    } else if (entry.getValue() == null) {
                        statLogger = StatServiceImpl.f29983q;
                        str = "port is null for " + key;
                    } else {
                        jSONArray.put(m18323a(entry.getKey(), entry.getValue().intValue()).toJSONObject());
                    }
                    statLogger.m18379w(str);
                }
                if (jSONArray.length() == 0) {
                    return;
                }
                Context context = this.f30033a;
                C5409i c5409i = new C5409i(context, StatServiceImpl.m18279a(context, false, this.f30035c), this.f30035c);
                c5409i.m18491a(jSONArray.toString());
                new aq(c5409i).m18332a();
                return;
            }
            StatServiceImpl.f29983q.m18377i("empty domain list.");
        } catch (Throwable th) {
            StatServiceImpl.f29983q.m18376e(th);
        }
    }
}
