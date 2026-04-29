package com.tencent.wxop.stat;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.wxop.stat.common.C5385e;
import com.tencent.wxop.stat.common.C5392l;
import com.tencent.wxop.stat.common.C5398r;
import com.tencent.wxop.stat.common.StatConstants;
import com.tencent.wxop.stat.common.StatLogger;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import miuix.android.content.C6824k;
import org.apache.http.HttpHost;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.wxop.stat.a */
/* JADX INFO: loaded from: classes3.dex */
public class C5378a {

    /* JADX INFO: renamed from: g */
    private static C5378a f29992g;

    /* JADX INFO: renamed from: e */
    private C5385e f29997e;

    /* JADX INFO: renamed from: h */
    private Context f29999h;

    /* JADX INFO: renamed from: i */
    private StatLogger f30000i;

    /* JADX INFO: renamed from: a */
    private List<String> f29993a = null;

    /* JADX INFO: renamed from: b */
    private volatile int f29994b = 2;

    /* JADX INFO: renamed from: c */
    private volatile String f29995c = "";

    /* JADX INFO: renamed from: d */
    private volatile HttpHost f29996d = null;

    /* JADX INFO: renamed from: f */
    private int f29998f = 0;

    private C5378a(Context context) {
        this.f29997e = null;
        this.f29999h = null;
        this.f30000i = null;
        this.f29999h = context.getApplicationContext();
        this.f29997e = new C5385e();
        C5415i.m18499a(context);
        this.f30000i = C5392l.m18418b();
        m18313l();
        m18310i();
        m18321g();
    }

    /* JADX INFO: renamed from: a */
    public static C5378a m18307a(Context context) {
        if (f29992g == null) {
            synchronized (C5378a.class) {
                if (f29992g == null) {
                    f29992g = new C5378a(context);
                }
            }
        }
        return f29992g;
    }

    /* JADX INFO: renamed from: b */
    private boolean m18309b(String str) {
        return Pattern.compile("(2[5][0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})").matcher(str).matches();
    }

    /* JADX INFO: renamed from: i */
    private void m18310i() {
        ArrayList arrayList = new ArrayList(10);
        this.f29993a = arrayList;
        arrayList.add("117.135.169.101");
        this.f29993a.add("140.207.54.125");
        this.f29993a.add("180.153.8.53");
        this.f29993a.add("120.198.203.175");
        this.f29993a.add("14.17.43.18");
        this.f29993a.add("163.177.71.186");
        this.f29993a.add("111.30.131.31");
        this.f29993a.add("123.126.121.167");
        this.f29993a.add("123.151.152.111");
        this.f29993a.add("113.142.45.79");
        this.f29993a.add("123.138.162.90");
        this.f29993a.add("103.7.30.94");
    }

    /* JADX INFO: renamed from: j */
    private String m18311j() {
        try {
            return !m18309b(StatConstants.MTA_SERVER_HOST) ? InetAddress.getByName(StatConstants.MTA_SERVER_HOST).getHostAddress() : "";
        } catch (Exception e2) {
            this.f30000i.m18376e((Throwable) e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: k */
    private void m18312k() {
        String strM18311j = m18311j();
        if (StatConfig.isDebugEnable()) {
            this.f30000i.m18377i("remoteIp ip is " + strM18311j);
        }
        if (C5392l.m18422c(strM18311j)) {
            if (!this.f29993a.contains(strM18311j)) {
                String str = this.f29993a.get(this.f29998f);
                if (StatConfig.isDebugEnable()) {
                    this.f30000i.m18379w(strM18311j + " not in ip list, change to:" + str);
                }
                strM18311j = str;
            }
            StatConfig.setStatReportUrl("http://" + strM18311j + ":80/mstat/report");
        }
    }

    /* JADX INFO: renamed from: l */
    private void m18313l() {
        this.f29994b = 0;
        this.f29996d = null;
        this.f29995c = null;
    }

    /* JADX INFO: renamed from: a */
    public HttpHost m18314a() {
        return this.f29996d;
    }

    /* JADX INFO: renamed from: a */
    public void m18315a(String str) {
        if (StatConfig.isDebugEnable()) {
            this.f30000i.m18377i("updateIpList " + str);
        }
        try {
            if (C5392l.m18422c(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.length() > 0) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String string = jSONObject.getString(itKeys.next());
                        if (C5392l.m18422c(string)) {
                            for (String str2 : string.split(";")) {
                                if (C5392l.m18422c(str2)) {
                                    String[] strArrSplit = str2.split(":");
                                    if (strArrSplit.length > 1) {
                                        String str3 = strArrSplit[0];
                                        if (m18309b(str3) && !this.f29993a.contains(str3)) {
                                            if (StatConfig.isDebugEnable()) {
                                                this.f30000i.m18377i("add new ip:" + str3);
                                            }
                                            this.f29993a.add(str3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            this.f30000i.m18376e((Throwable) e2);
        }
        this.f29998f = new Random().nextInt(this.f29993a.size());
    }

    /* JADX INFO: renamed from: b */
    public String m18316b() {
        return this.f29995c;
    }

    /* JADX INFO: renamed from: c */
    public int m18317c() {
        return this.f29994b;
    }

    /* JADX INFO: renamed from: d */
    public void m18318d() {
        this.f29998f = (this.f29998f + 1) % this.f29993a.size();
    }

    /* JADX INFO: renamed from: e */
    public boolean m18319e() {
        return this.f29994b == 1;
    }

    /* JADX INFO: renamed from: f */
    public boolean m18320f() {
        return this.f29994b != 0;
    }

    /* JADX INFO: renamed from: g */
    void m18321g() {
        if (!C5398r.m18473f(this.f29999h)) {
            if (StatConfig.isDebugEnable()) {
                this.f30000i.m18377i("NETWORK TYPE: network is close.");
            }
            m18313l();
            return;
        }
        if (StatConfig.f29942g) {
            m18312k();
        }
        this.f29995c = C5392l.m18434j(this.f29999h);
        if (StatConfig.isDebugEnable()) {
            this.f30000i.m18377i("NETWORK name:" + this.f29995c);
        }
        if (C5392l.m18422c(this.f29995c)) {
            this.f29994b = C6824k.f86613r8s8.equalsIgnoreCase(this.f29995c) ? 1 : 2;
            this.f29996d = C5392l.m18413a(this.f29999h);
        }
        if (StatServiceImpl.m18286a()) {
            StatServiceImpl.m18296d(this.f29999h);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m18322h() {
        this.f29999h.getApplicationContext().registerReceiver(new C5379b(this), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }
}
