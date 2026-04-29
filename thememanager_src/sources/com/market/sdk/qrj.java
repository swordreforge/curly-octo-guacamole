package com.market.sdk;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.market.sdk.utils.C5007g;
import com.market.sdk.utils.qrj;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import miuix.core.util.SystemProperties;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: EnableStateManager.java */
/* JADX INFO: loaded from: classes3.dex */
class qrj {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static String f68922ld6 = null;

    /* JADX INFO: renamed from: n */
    private static final String f28117n = "com.xiaomi.market.sdk.EnableUpdateReceiver";

    /* JADX INFO: renamed from: p */
    private static qrj f28118p;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private volatile boolean f68924zy;

    /* JADX INFO: renamed from: g */
    private static Map<String, List<String>> f28116g = C5007g.m17430s();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static Map<String, List<String>> f68921f7l8 = C5007g.m17430s();

    /* JADX INFO: renamed from: y */
    private static List<String> f28120y = new ArrayList();

    /* JADX INFO: renamed from: s */
    private static List<String> f28119s = new ArrayList();

    /* JADX INFO: renamed from: k */
    private Map<String, List<String>> f28121k = C5007g.m17425g();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Map<String, List<String>> f68923toq = C5007g.m17425g();

    /* JADX INFO: renamed from: q */
    private Context f28122q = MarketManager.m17271y();

    /* JADX INFO: renamed from: com.market.sdk.qrj$k */
    /* JADX INFO: compiled from: EnableStateManager.java */
    class C4985k extends Thread {
        C4985k() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            MarketManager.m17271y().registerReceiver(new zy(qrj.this, null), new IntentFilter(qrj.f28117n));
            qrj.this.m17347s(System.currentTimeMillis() + 864000000);
        }
    }

    /* JADX INFO: compiled from: EnableStateManager.java */
    class toq extends ni7<Object> {
        toq() {
        }

        @Override // com.market.sdk.ni7
        /* JADX INFO: renamed from: g */
        public Object mo17245g(IMarketService iMarketService) throws Throwable {
            FileOutputStream fileOutputStream;
            String enableSettings;
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    enableSettings = iMarketService.getEnableSettings();
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    com.market.sdk.utils.ki.toq(fileOutputStream2);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                com.market.sdk.utils.ki.toq(fileOutputStream2);
                throw th;
            }
            if (TextUtils.isEmpty(enableSettings)) {
                com.market.sdk.utils.ki.toq(null);
                return null;
            }
            fileOutputStream = new FileOutputStream(qrj.f68922ld6);
            try {
                fileOutputStream.write(enableSettings.getBytes());
                fileOutputStream.flush();
            } catch (Exception e3) {
                e = e3;
                Log.e(MarketManager.f27964n, e.toString(), e);
            }
            com.market.sdk.utils.ki.toq(fileOutputStream);
            return null;
            Log.e(MarketManager.f27964n, e.toString(), e);
            com.market.sdk.utils.ki.toq(fileOutputStream);
            return null;
        }
    }

    /* JADX INFO: compiled from: EnableStateManager.java */
    private class zy extends BroadcastReceiver {
        private zy() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (com.market.sdk.utils.ki.n7h()) {
                qrj.this.n7h(false);
            } else {
                qrj.this.m17347s(System.currentTimeMillis() + 86400000);
            }
        }

        /* synthetic */ zy(qrj qrjVar, C4985k c4985k) {
            this();
        }
    }

    static {
        f28120y.add("com.xiaomi.mipicks");
        f28120y.add("com.miui.virtualsim");
        f28120y.add("com.xiaomi.glgm");
        f28120y.add("com.mi.globalTrendNews");
        f28120y.add("com.mipay.wallet.in");
        f28120y.add("com.micredit.in");
        f28119s.add("com.xiaomi.mipicks");
        ArrayList arrayListM17427n = C5007g.m17427n();
        arrayListM17427n.add(com.market.sdk.utils.kja0.f28213k);
        arrayListM17427n.add(com.market.sdk.utils.kja0.f68999zy);
        arrayListM17427n.add(com.market.sdk.utils.kja0.f68998toq);
        if (com.market.sdk.utils.t8r.toq("V10.2.0.0", "8.9.30").mo17488k() && !com.market.sdk.utils.t8r.toq("V10.3.0.0", "9.3.7").mo17488k()) {
            arrayListM17427n.add(com.market.sdk.utils.kja0.f28214q);
        }
        ArrayList arrayListM17427n2 = C5007g.m17427n();
        arrayListM17427n2.add(com.market.sdk.utils.kja0.f68998toq);
        ArrayList arrayListM17427n3 = C5007g.m17427n();
        arrayListM17427n3.add(com.market.sdk.utils.kja0.f28213k);
        ArrayList arrayListM17427n4 = C5007g.m17427n();
        arrayListM17427n4.add(com.market.sdk.utils.kja0.f28213k);
        f28116g.put("com.xiaomi.mipicks", arrayListM17427n);
        f28116g.put("com.miui.virtualsim", arrayListM17427n2);
        f28116g.put("com.mipay.wallet.in", arrayListM17427n3);
        f28116g.put("com.micredit.in", arrayListM17427n4);
        f28118p = new qrj();
    }

    private qrj() {
        f68922ld6 = this.f28122q.getFilesDir() + "/package_display_region_settings";
    }

    private boolean f7l8(String str) {
        try {
        } catch (Exception e2) {
            Log.e(MarketManager.f27964n, e2.toString());
        }
        return this.f28122q.getPackageManager().getApplicationInfo(str, 0) != null;
    }

    /* JADX INFO: renamed from: g */
    public static qrj m17341g() {
        return f28118p;
    }

    /* JADX INFO: renamed from: h */
    private void m17342h(String str, boolean z2) {
        try {
            String str2 = SystemProperties.get("ro.miui.region", "CN");
            Set<String> setM17346q = m17346q(str);
            if (setM17346q.isEmpty()) {
                String strM17484p = com.market.sdk.utils.qrj.m17484p(C4979n.f68913x2, null, new qrj.EnumC5015k[0]);
                if (!TextUtils.isEmpty(strM17484p) && !TextUtils.equals(strM17484p, str2)) {
                    z2 = false;
                }
                Set<String> setM17344n = m17344n(str, z2);
                Log.d(MarketManager.f27964n, "enable " + str + " in " + setM17344n.toString());
                if (setM17344n.contains(str2) || setM17344n.contains(C3678q.f65828lv5)) {
                    ld6(str);
                } else {
                    m17345p(str);
                }
            } else {
                Log.d(MarketManager.f27964n, "disbale " + str + " in " + setM17346q.toString());
                if (setM17346q.contains(str2) || setM17346q.contains(C3678q.f65828lv5)) {
                    m17345p(str);
                } else {
                    ld6(str);
                }
            }
            com.market.sdk.utils.qrj.m17481i(C4979n.f68913x2, str2, new qrj.EnumC5015k[0]);
        } catch (Throwable th) {
            Log.d(MarketManager.f27964n, th.toString());
        }
    }

    private void kja0() {
        BufferedReader bufferedReader;
        Throwable th;
        StringBuilder sb;
        this.f28121k.clear();
        this.f68923toq.clear();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(f68922ld6)));
            try {
                sb = new StringBuilder();
            } catch (Throwable th2) {
                th = th2;
                try {
                    Log.e(MarketManager.f27964n, th.toString());
                } finally {
                    com.market.sdk.utils.ki.toq(bufferedReader);
                }
            }
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            } else {
                sb.append(line);
            }
        }
        JSONObject jSONObject = new JSONObject(sb.toString());
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("enable_list");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayListM17427n = C5007g.m17427n();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    arrayListM17427n.add(jSONArrayOptJSONArray.getString(i2));
                }
                this.f28121k.put(next, arrayListM17427n);
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("disable_list");
            if (jSONArrayOptJSONArray2 != null) {
                ArrayList arrayListM17427n2 = C5007g.m17427n();
                for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                    arrayListM17427n2.add(jSONArrayOptJSONArray2.getString(i3));
                }
                this.f68923toq.put(next, arrayListM17427n2);
            }
        }
    }

    private void ld6(String str) {
        try {
            PackageManager packageManager = this.f28122q.getPackageManager();
            if (this.f28122q.getPackageManager().getApplicationEnabledSetting(str) == 2) {
                packageManager.setApplicationEnabledSetting(str, 1, 0);
            }
        } catch (Throwable th) {
            Log.d(MarketManager.f27964n, th.toString());
        }
    }

    /* JADX INFO: renamed from: n */
    private Set<String> m17344n(String str, boolean z2) {
        HashSet hashSet = new HashSet();
        List<String> list = this.f28121k.get(str);
        if (list != null) {
            hashSet.addAll(list);
        }
        Log.d(MarketManager.f27964n, "add " + str + " mCloudEnableSettings " + hashSet);
        List<String> list2 = f28116g.get(str);
        if (list2 != null) {
            hashSet.addAll(list2);
        }
        Log.d(MarketManager.f27964n, "add " + str + " defaultRegions " + hashSet);
        String[] strArrM17441n = com.market.sdk.utils.ki.m17441n(str, "enable_regions");
        if (strArrM17441n != null) {
            hashSet.addAll(Arrays.asList(strArrM17441n));
        }
        Log.d(MarketManager.f27964n, "add " + str + " apkPresetRegions " + hashSet);
        if (f28119s.contains(str) && TextUtils.equals(com.market.sdk.utils.kja0.m17446k(), com.market.sdk.utils.kja0.f28214q)) {
            Set<String> setLd6 = com.market.sdk.utils.qrj.ld6(C4979n.f68911qrj + str, null, new qrj.EnumC5015k[0]);
            if (setLd6 != null) {
                hashSet.addAll(setLd6);
            }
            Log.d(MarketManager.f27964n, "shouldKeep: " + z2 + "\n is " + str + " enbale " + com.market.sdk.utils.x2.toq(str));
            if (z2 && com.market.sdk.utils.x2.toq(str)) {
                Log.d(MarketManager.f27964n, "add " + str + " at " + com.market.sdk.utils.kja0.m17446k());
                hashSet.add(com.market.sdk.utils.kja0.m17446k());
            }
            com.market.sdk.utils.qrj.fn3e(C4979n.f68911qrj + str, hashSet, new qrj.EnumC5015k[0]);
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n7h(boolean z2) {
        kja0();
        for (String str : f28120y) {
            if (f7l8(str)) {
                m17342h(str, z2);
            }
        }
        x2();
    }

    /* JADX INFO: renamed from: p */
    private void m17345p(String str) {
        try {
            PackageManager packageManager = this.f28122q.getPackageManager();
            int applicationEnabledSetting = this.f28122q.getPackageManager().getApplicationEnabledSetting(str);
            if (applicationEnabledSetting == 0 || applicationEnabledSetting == 1) {
                packageManager.setApplicationEnabledSetting(str, 2, 0);
            }
        } catch (Throwable th) {
            Log.d(MarketManager.f27964n, th.toString());
        }
    }

    /* JADX INFO: renamed from: q */
    private Set<String> m17346q(String str) {
        HashSet hashSet = new HashSet();
        List<String> list = this.f68923toq.get(str);
        if (list != null) {
            hashSet.addAll(list);
        }
        List<String> list2 = f68921f7l8.get(str);
        if (list2 != null) {
            hashSet.addAll(list2);
        }
        String[] strArrM17441n = com.market.sdk.utils.ki.m17441n(str, "disable_regions");
        if (strArrM17441n != null) {
            hashSet.addAll(Arrays.asList(strArrM17441n));
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m17347s(long j2) {
        AlarmManager alarmManager = (AlarmManager) this.f28122q.getSystemService("alarm");
        Intent intent = new Intent(f28117n);
        intent.setPackage(this.f28122q.getPackageName());
        alarmManager.setExact(1, j2, PendingIntent.getBroadcast(this.f28122q, 0, intent, 134217728));
    }

    private void x2() {
        new toq().m17336p();
    }

    /* JADX INFO: renamed from: y */
    private void m17348y() {
        if (this.f68924zy) {
            return;
        }
        this.f68924zy = true;
        new C4985k().start();
    }

    public void qrj(boolean z2) {
        if (!com.market.sdk.utils.ki.m17442p() || f28116g.isEmpty()) {
            return;
        }
        n7h(z2);
        m17348y();
    }
}
