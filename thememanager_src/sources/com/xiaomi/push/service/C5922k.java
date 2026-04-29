package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.C5658n;
import com.xiaomi.push.gcp;
import com.xiaomi.push.hyow;
import com.xiaomi.push.i3x9;
import com.xiaomi.push.nc;
import com.xiaomi.push.pnt2;
import com.xiaomi.push.vwb;
import com.xiaomi.push.xblq;
import com.xiaomi.push.xouc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;

/* JADX INFO: renamed from: com.xiaomi.push.service.k */
/* JADX INFO: loaded from: classes3.dex */
public class C5922k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static C5922k f73626f7l8;

    /* JADX INFO: renamed from: y */
    private static String f33824y;

    /* JADX INFO: renamed from: g */
    private Messenger f33825g;

    /* JADX INFO: renamed from: k */
    private Context f33826k;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f73628zy;

    /* JADX INFO: renamed from: s */
    private static String f33823s = i3x9.m20969k(5) + C5658n.f73185t8r;

    /* JADX INFO: renamed from: p */
    private static long f33822p = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Messenger f73627toq = null;

    /* JADX INFO: renamed from: q */
    private List<Message> f33828q = new ArrayList();

    /* JADX INFO: renamed from: n */
    private boolean f33827n = false;

    private C5922k(Context context) {
        this.f73628zy = false;
        this.f33826k = context.getApplicationContext();
        if (x2()) {
            com.xiaomi.channel.commonutils.logger.zy.m19300t("use miui push service");
            this.f73628zy = true;
        }
    }

    public static void d3(String str) {
        f33824y = str;
    }

    /* JADX INFO: renamed from: g */
    private String m21646g(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        int i2 = 1;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(":");
            sb.append(entry.getValue());
            if (i2 < map.size()) {
                sb.append(",");
            }
            i2++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    private Intent m21647k() {
        if (!fu4()) {
            Intent intent = new Intent(this.f33826k, (Class<?>) XMPushService.class);
            intent.putExtra(dd.f73567fti, this.f33826k.getPackageName());
            n7h();
            return intent;
        }
        Intent intent2 = new Intent();
        intent2.setPackage("com.xiaomi.xmsf");
        intent2.setClassName("com.xiaomi.xmsf", m21648n());
        intent2.putExtra(dd.f73567fti, this.f33826k.getPackageName());
        m21651s();
        return intent2;
    }

    private void ld6(Intent intent, String str, String str2, String str3, String str4, String str5, boolean z2, Map<String, String> map, Map<String, String> map2) {
        intent.putExtra(dd.f73583t8r, str);
        intent.putExtra(dd.f73588zurt, str2);
        intent.putExtra(dd.f73580o1t, str3);
        intent.putExtra(dd.f33751t, str5);
        intent.putExtra(dd.f73585wvg, str4);
        intent.putExtra(dd.f73576mcp, z2);
        intent.putExtra(dd.f73581oc, f33824y);
        intent.putExtra(dd.f33749r, this.f73627toq);
        if (map != null && map.size() > 0) {
            String strM21646g = m21646g(map);
            if (!TextUtils.isEmpty(strM21646g)) {
                intent.putExtra(dd.f73570jk, strM21646g);
            }
        }
        if (map2 == null || map2.size() <= 0) {
            return;
        }
        String strM21646g2 = m21646g(map2);
        if (TextUtils.isEmpty(strM21646g2)) {
            return;
        }
        intent.putExtra(dd.f73559a9, strM21646g2);
    }

    /* JADX INFO: renamed from: n */
    private String m21648n() {
        try {
            return this.f33826k.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106 ? "com.xiaomi.push.service.XMPushService" : "com.xiaomi.xmsf.push.service.XMPushService";
        } catch (Exception unused) {
            return "com.xiaomi.xmsf.push.service.XMPushService";
        }
    }

    private void n7h() {
        this.f33826k.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f33826k, (Class<?>) XMPushService.class), 1, 1);
    }

    public static String ni7() {
        return f33824y;
    }

    /* JADX INFO: renamed from: p */
    private synchronized void m21649p(Intent intent) {
        if (this.f33827n) {
            Message qVar = toq(intent);
            if (this.f33828q.size() >= 50) {
                this.f33828q.remove(0);
            }
            this.f33828q.add(qVar);
            return;
        }
        if (this.f33825g == null) {
            this.f33826k.bindService(intent, new ServiceConnectionC5910e(this), 1);
            this.f33827n = true;
            this.f33828q.clear();
            this.f33828q.add(toq(intent));
        } else {
            try {
                this.f33825g.send(toq(intent));
            } catch (RemoteException unused) {
                this.f33825g = null;
                this.f33827n = false;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private void m21651s() {
        this.f33826k.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f33826k, (Class<?>) XMPushService.class), 2, 1);
    }

    private Message toq(Intent intent) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 17;
        messageObtain.obj = intent;
        return messageObtain;
    }

    private boolean x2() {
        if (xouc.f73731toq) {
            return false;
        }
        try {
            PackageInfo packageInfo = this.f33826k.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            if (packageInfo == null) {
                return false;
            }
            return packageInfo.versionCode >= 104;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    private Map<String, String> m21652y(List<NameValuePair> list) {
        HashMap map = new HashMap();
        if (list != null && list.size() > 0) {
            for (NameValuePair nameValuePair : list) {
                if (nameValuePair != null) {
                    map.put(nameValuePair.getName(), nameValuePair.getValue());
                }
            }
        }
        return map;
    }

    public static C5922k zurt(Context context) {
        if (f73626f7l8 == null) {
            f73626f7l8 = new C5922k(context);
        }
        return f73626f7l8;
    }

    public boolean a9(pnt2 pnt2Var, boolean z2) {
        if (!com.xiaomi.push.oc.zurt(this.f33826k)) {
            return false;
        }
        Intent intentM21647k = m21647k();
        String strM20898k = gcp.m20898k();
        if (!TextUtils.isEmpty(strM20898k)) {
            hyow hyowVar = new hyow("pf", null, null, null);
            hyow hyowVar2 = new hyow("sent", null, null, null);
            hyowVar2.m20963y(strM20898k);
            hyowVar.f7l8(hyowVar2);
            pnt2Var.m22032y(hyowVar);
        }
        Bundle bundleMo21383k = pnt2Var.mo21383k();
        if (bundleMo21383k == null) {
            return false;
        }
        com.xiaomi.channel.commonutils.logger.zy.m19300t("SEND:" + pnt2Var.mo21382g());
        intentM21647k.setAction(dd.f33746n);
        intentM21647k.putExtra(dd.f73581oc, f33824y);
        intentM21647k.putExtra("ext_packet", bundleMo21383k);
        intentM21647k.putExtra("ext_encrypt", z2);
        return oc(intentM21647k);
    }

    public boolean cdj() {
        Intent intentM21647k = m21647k();
        intentM21647k.setAction(dd.f33750s);
        return oc(intentM21647k);
    }

    public void d2ok(String str, Map<String, String> map, Map<String, String> map2) {
        Intent intentM21647k = m21647k();
        intentM21647k.setAction(dd.f73586x2);
        if (map != null) {
            String strM21646g = m21646g(map);
            if (!TextUtils.isEmpty(strM21646g)) {
                intentM21647k.putExtra(dd.f73570jk, strM21646g);
            }
        }
        if (map2 != null) {
            String strM21646g2 = m21646g(map2);
            if (!TextUtils.isEmpty(strM21646g2)) {
                intentM21647k.putExtra(dd.f73559a9, strM21646g2);
            }
        }
        intentM21647k.putExtra(dd.f73588zurt, str);
        oc(intentM21647k);
    }

    @Deprecated
    public void eqxt(String str, List<NameValuePair> list, List<NameValuePair> list2) {
        d2ok(str, m21652y(list), m21652y(list2));
    }

    public boolean fn3e(String str, String str2, String str3, String str4, String str5, boolean z2, Map<String, String> map, Map<String, String> map2) {
        Intent intentM21647k = m21647k();
        intentM21647k.setAction(dd.f33747p);
        ld6(intentM21647k, str, str2, str3, str4, str5, z2, map, map2);
        return oc(intentM21647k);
    }

    public boolean fti(byte[] bArr, String str, String str2) {
        String strSubstring;
        if (!com.xiaomi.push.oc.zurt(this.f33826k) || bArr == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("Failed to send message: message|userId|chid may be empty, or the network is unavailable.");
            return false;
        }
        Intent intentM21647k = m21647k();
        intentM21647k.setAction(dd.f33746n);
        intentM21647k.putExtra(dd.f73581oc, f33824y);
        intentM21647k.putExtra("ext_raw_packet", bArr);
        int iIndexOf = str.indexOf("@");
        String strSubstring2 = null;
        String strSubstring3 = iIndexOf != -1 ? str.substring(0, iIndexOf) : null;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            strSubstring2 = str.substring(iIndexOf + 1, iLastIndexOf);
            strSubstring = str.substring(iLastIndexOf + 1);
        } else {
            strSubstring = null;
        }
        intentM21647k.putExtra(dd.f73583t8r, strSubstring3);
        intentM21647k.putExtra(dd.f33743i, strSubstring2);
        intentM21647k.putExtra(dd.f73566fn3e, strSubstring);
        StringBuilder sb = new StringBuilder();
        sb.append(f33823s);
        long j2 = f33822p;
        f33822p = 1 + j2;
        sb.append(j2);
        String string = sb.toString();
        intentM21647k.putExtra("ext_pkt_id", string);
        intentM21647k.putExtra("ext_chid", str2);
        com.xiaomi.channel.commonutils.logger.zy.a9("SEND: chid=" + str2 + ", packetId=" + string);
        return oc(intentM21647k);
    }

    public boolean fu4() {
        return this.f73628zy;
    }

    public void gvn7(Messenger messenger) {
        this.f73627toq = messenger;
    }

    /* JADX INFO: renamed from: h */
    public void m21653h() {
        Intent intentM21647k = m21647k();
        intentM21647k.setAction("com.xiaomi.push.check_alive");
        oc(intentM21647k);
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public boolean m21654i(String str, String str2, String str3, String str4, String str5, boolean z2, List<NameValuePair> list, List<NameValuePair> list2) {
        return fn3e(str, str2, str3, str4, str5, z2, m21652y(list), m21652y(list2));
    }

    public boolean jk(xblq xblqVar) {
        if (!com.xiaomi.push.oc.zurt(this.f33826k)) {
            return false;
        }
        Intent intentM21647k = m21647k();
        Bundle bundleMo21383k = xblqVar.mo21383k();
        if (bundleMo21383k == null) {
            return false;
        }
        com.xiaomi.channel.commonutils.logger.zy.m19300t("SEND:" + xblqVar.mo21382g());
        intentM21647k.setAction(dd.f33741g);
        intentM21647k.putExtra(dd.f73581oc, f33824y);
        intentM21647k.putExtra("ext_packet", bundleMo21383k);
        return oc(intentM21647k);
    }

    public boolean jp0y(vwb vwbVar) {
        if (!com.xiaomi.push.oc.zurt(this.f33826k)) {
            return false;
        }
        Intent intentM21647k = m21647k();
        Bundle bundleMo21383k = vwbVar.mo21383k();
        if (bundleMo21383k == null) {
            return false;
        }
        com.xiaomi.channel.commonutils.logger.zy.m19300t("SEND:" + vwbVar.mo21382g());
        intentM21647k.setAction(dd.f33752y);
        intentM21647k.putExtra(dd.f73581oc, f33824y);
        intentM21647k.putExtra("ext_packet", bundleMo21383k);
        return oc(intentM21647k);
    }

    public boolean ki(String str) {
        Intent intentM21647k = m21647k();
        intentM21647k.setAction(dd.f33750s);
        intentM21647k.putExtra(dd.f73588zurt, str);
        return oc(intentM21647k);
    }

    public boolean kja0(pnt2[] pnt2VarArr, boolean z2) {
        if (!com.xiaomi.push.oc.zurt(this.f33826k)) {
            return false;
        }
        Intent intentM21647k = m21647k();
        int length = pnt2VarArr.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i2 = 0; i2 < pnt2VarArr.length; i2++) {
            String strM20898k = gcp.m20898k();
            if (!TextUtils.isEmpty(strM20898k)) {
                hyow hyowVar = new hyow("pf", null, null, null);
                hyow hyowVar2 = new hyow("sent", null, null, null);
                hyowVar2.m20963y(strM20898k);
                hyowVar.f7l8(hyowVar2);
                pnt2VarArr[i2].m22032y(hyowVar);
            }
            com.xiaomi.channel.commonutils.logger.zy.m19300t("SEND:" + pnt2VarArr[i2].mo21382g());
            bundleArr[i2] = pnt2VarArr[i2].mo21383k();
        }
        if (length <= 0) {
            return false;
        }
        intentM21647k.setAction(dd.f73565f7l8);
        intentM21647k.putExtra(dd.f73581oc, f33824y);
        intentM21647k.putExtra("ext_packets", bundleArr);
        intentM21647k.putExtra("ext_encrypt", z2);
        return oc(intentM21647k);
    }

    public void mcp(String str, String str2, String str3, String str4, String str5, boolean z2, Map<String, String> map, Map<String, String> map2) {
        Intent intentM21647k = m21647k();
        intentM21647k.setAction(dd.f73574ld6);
        ld6(intentM21647k, str, str2, str3, str4, str5, z2, map, map2);
        oc(intentM21647k);
    }

    public int o1t(String str, String str2, String str3, String str4, String str5, Map<String, String> map, Map<String, String> map2, boolean z2) {
        Intent intentM21647k = m21647k();
        intentM21647k.setAction(dd.f33748q);
        ld6(intentM21647k, str, str2, str3, str4, str5, z2, map, map2);
        oc(intentM21647k);
        return 0;
    }

    public boolean oc(Intent intent) {
        try {
            if (nc.m21315s()) {
                this.f33826k.startService(intent);
                return true;
            }
            m21649p(intent);
            return true;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            return false;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public void m21655t(String str, String str2, String str3, String str4, String str5, boolean z2, List<NameValuePair> list, List<NameValuePair> list2) {
        mcp(str, str2, str3, str4, str5, z2, m21652y(list), m21652y(list2));
    }

    public boolean t8r(String str, String str2) {
        Intent intentM21647k = m21647k();
        intentM21647k.setAction(dd.f33750s);
        intentM21647k.putExtra(dd.f73588zurt, str);
        intentM21647k.putExtra(dd.f73583t8r, str2);
        return oc(intentM21647k);
    }

    @Deprecated
    public int wvg(String str, String str2, String str3, String str4, String str5, boolean z2, List<NameValuePair> list, List<NameValuePair> list2) {
        return o1t(str, str2, str3, str4, str5, m21652y(list), m21652y(list2), z2);
    }

    /* JADX INFO: renamed from: z */
    public boolean m21656z(Bundle bundle, String str, String str2) {
        if (bundle == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("Failed to notify message: bundle|userId|chid may be empty");
            return false;
        }
        Intent intentM21647k = m21647k();
        intentM21647k.setAction(dd.f73573kja0);
        intentM21647k.putExtras(bundle);
        com.xiaomi.channel.commonutils.logger.zy.a9("notify: chid=" + str2 + " bundle:" + bundle);
        return oc(intentM21647k);
    }
}
