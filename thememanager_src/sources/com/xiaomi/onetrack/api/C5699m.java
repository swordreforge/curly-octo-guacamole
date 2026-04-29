package com.xiaomi.onetrack.api;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.onetrack.Configuration;
import com.xiaomi.onetrack.OnMainThreadException;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.ServiceQualityEvent;
import com.xiaomi.onetrack.p014c.C5735i;
import com.xiaomi.onetrack.p017f.C5756a;
import com.xiaomi.onetrack.util.C5776i;
import com.xiaomi.onetrack.util.C5778k;
import com.xiaomi.onetrack.util.C5782o;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5805q;
import com.xiaomi.onetrack.util.C5806r;
import com.xiaomi.onetrack.util.C5810v;
import com.xiaomi.onetrack.util.C5811w;
import com.xiaomi.onetrack.util.DeviceUtil;
import com.xiaomi.onetrack.util.oaid.C5783a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.m */
/* JADX INFO: loaded from: classes3.dex */
public class C5699m {

    /* JADX INFO: renamed from: a */
    private static final String f31849a = "OneTrackImp";

    /* JADX INFO: renamed from: c */
    private static ExecutorService f31850c;

    /* JADX INFO: renamed from: b */
    private InterfaceC5696j f31851b;

    /* JADX INFO: renamed from: d */
    private Context f31852d;

    /* JADX INFO: renamed from: e */
    private C5697k f31853e;

    /* JADX INFO: renamed from: f */
    private Configuration f31854f;

    /* JADX INFO: renamed from: g */
    private OneTrack.ICommonPropertyProvider f31855g;

    /* JADX INFO: renamed from: h */
    private OneTrack.IEventHook f31856h;

    /* JADX INFO: renamed from: i */
    private C5810v f31857i;

    /* JADX INFO: renamed from: j */
    private boolean f31858j = false;

    public C5699m(Context context, Configuration configuration) {
        Context applicationContext = context.getApplicationContext();
        this.f31852d = applicationContext;
        this.f31854f = configuration;
        m19819c(applicationContext);
        Log.d(f31849a, "OneTrackImp init : " + configuration.toString());
        Log.d(f31849a, "OneTrackImp sdk ver : 2.1.4");
        C5804p.m20342a(f31849a, "BuildConfig.NoImei:false");
    }

    /* JADX INFO: renamed from: j */
    private boolean m19836j() {
        try {
            int componentEnabledSetting = C5756a.m20053b().getPackageManager().getComponentEnabledSetting(new ComponentName("com.miui.analytics", as.f31692b));
            return componentEnabledSetting == 1 || componentEnabledSetting == 0;
        } catch (Exception e2) {
            C5804p.m20347b(f31849a, "enable error:" + e2.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    private static boolean m19837k() {
        try {
            int i2 = C5756a.m20053b().getPackageManager().getPackageInfo("com.miui.analytics", 0).versionCode;
            if (i2 >= 2020062900) {
                return true;
            }
            C5804p.m20342a(f31849a, "system analytics version: " + i2);
        } catch (Throwable th) {
            C5804p.m20347b(f31849a, "isSupportEmptyEvent error:" + th.getMessage());
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    private boolean m19838l() {
        try {
            if (TextUtils.isEmpty(this.f31854f.getAdEventAppId()) || OneTrack.isUseSystemNetTrafficOnly()) {
                return true;
            }
            int i2 = C5756a.m20053b().getPackageManager().getPackageInfo("com.miui.analytics", 0).versionCode;
            C5804p.m20342a(f31849a, "system analytics version: " + i2);
            return i2 >= 2022042900;
        } catch (Throwable th) {
            C5804p.m20347b(f31849a, "isSupportAdMonitor error:" + th.getMessage());
            return true;
        }
    }

    /* JADX INFO: renamed from: m */
    private void m19839m() {
        f31850c.execute(new ad(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m19840n() {
        if (C5735i.m19966d()) {
            f31850c.execute(new ae(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public void m19841o() {
        try {
            if (!m19871f() && this.f31854f.getMode() == OneTrack.Mode.APP) {
                long jM20057d = C5756a.m20057d();
                String strM19808a = m19808a(jM20057d, C5756a.m20055c());
                String strM20146A = com.xiaomi.onetrack.util.aa.m20146A();
                if (TextUtils.isEmpty(strM20146A)) {
                    com.xiaomi.onetrack.util.aa.m20193j(strM19808a);
                    return;
                }
                JSONObject jSONObject = new JSONObject(strM20146A);
                long jOptLong = jSONObject.optLong(C5693g.f31781W);
                String strOptString = jSONObject.optString(C5693g.f31782X);
                if (jOptLong != jM20057d) {
                    com.xiaomi.onetrack.util.aa.m20193j(strM19808a);
                    this.f31851b.mo19705a(C5693g.f31794j, C5694h.m19780a(jOptLong, strOptString, jM20057d, C5756a.m20059f(), this.f31854f, this.f31856h, this.f31857i, this.f31858j));
                }
            }
        } catch (Exception e2) {
            C5804p.m20347b(f31849a, "trackUpgradeEvent error: " + e2.toString());
        }
    }

    /* JADX INFO: renamed from: d */
    private void m19822d(Context context) {
        ((Application) context).registerActivityLifecycleCallbacks(new C5705s(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m19826e(boolean z2) {
        f31850c.execute(new RunnableC5709w(this, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public JSONObject m19829f(String str) throws Throwable {
        try {
            OneTrack.ICommonPropertyProvider iCommonPropertyProvider = this.f31855g;
            JSONObject jSONObjectM20378a = C5806r.m20378a(iCommonPropertyProvider != null ? iCommonPropertyProvider.getDynamicProperty(str) : null, false);
            String strM20266a = C5778k.m20266a(C5806r.m20374a(this.f31854f));
            return C5806r.m20379a(jSONObjectM20378a, !TextUtils.isEmpty(strM20266a) ? new JSONObject(strM20266a) : null);
        } catch (Exception e2) {
            C5804p.m20347b(f31849a, "getCommonProperty failed, e: " + e2.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private boolean m19830g() {
        if (this.f31854f.isOverrideMiuiRegionSetting()) {
            return TextUtils.equals(C5805q.m20371j(), this.f31854f.getRegion());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m19832h() {
        f31850c.execute(new RunnableC5706t(this));
    }

    /* JADX INFO: renamed from: i */
    private boolean m19835i() {
        if (C5804p.f32410a) {
            C5804p.m20342a(f31849a, "enable:" + m19836j() + " isSupportEmptyEvent: " + m19837k() + "_isSupportAdMonitor():" + m19838l());
        }
        return m19836j() && m19837k() && m19838l();
    }

    /* JADX INFO: renamed from: c */
    private void m19819c(Context context) {
        C5804p.m20341a();
        C5805q.m20358a(this.f31854f.isInternational(), this.f31854f.getRegion(), this.f31854f.getMode());
        if (f31850c == null) {
            f31850c = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        this.f31857i = new C5810v(this.f31854f);
        if (C5805q.m20359a() && m19835i() && m19830g()) {
            C5782o.m20286a().m20290a(Boolean.TRUE);
            this.f31851b = new ap(this.f31854f, this.f31857i);
        } else {
            C5782o.m20286a().m20290a(Boolean.FALSE);
            this.f31851b = new an(context, this.f31854f, this.f31857i);
        }
        if (this.f31854f.getMode() == OneTrack.Mode.APP) {
            C5805q.m20357a(this.f31854f.isOverrideMiuiRegionSetting());
            m19822d(context);
            if (this.f31854f.isExceptionCatcherEnable()) {
                C5776i.m20256a(new RunnableC5700n(this, context));
            }
        }
        f31850c.execute(new RunnableC5711y(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public boolean m19824d(String str) {
        boolean zM20382a = C5806r.m20382a(str);
        if (!zM20382a) {
            C5804p.m20347b(f31849a, String.format("Invalid eventname: %s. Eventname can only consist of numbers, letters, underscores ,and can not start with a number or \"onetrack_\" or \"ot_\"", str));
        }
        return !zM20382a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public boolean m19827e(String str) {
        if ("onetrack_dau".equals(str) || C5693g.ae.equals(str) || "ot_login".equals(str) || "ot_logout".equals(str)) {
            return false;
        }
        boolean zM20382a = C5806r.m20382a(str);
        if (!zM20382a) {
            C5804p.m20347b(f31849a, String.format("Invalid eventname: %s. Eventname can only consist of numbers, letters, underscores ,and can not start with a number or \"onetrack_\" or \"ot_\"", str));
        }
        return !zM20382a;
    }

    /* JADX INFO: renamed from: b */
    public void m19862b(Map<String, ? extends Number> map) {
        f31850c.execute(new RunnableC5702p(this, map));
    }

    /* JADX INFO: renamed from: b */
    public void m19861b(String str) {
        f31850c.execute(new aa(this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public JSONObject m19821d(Map<String, Object> map) throws Throwable {
        try {
            JSONObject jSONObjectM20378a = C5806r.m20378a(map, false);
            String strM20266a = C5778k.m20266a(C5806r.m20374a(this.f31854f));
            return C5806r.m20379a(jSONObjectM20378a, !TextUtils.isEmpty(strM20266a) ? new JSONObject(strM20266a) : null);
        } catch (Exception e2) {
            C5804p.m20347b(f31849a, "getCommonPropertyForException failed, e: " + e2.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public OneTrack.ICommonPropertyProvider m19859b() {
        return this.f31855g;
    }

    /* JADX INFO: renamed from: b */
    public String m19860b(Context context) throws OnMainThreadException {
        if (!C5811w.m20402a()) {
            return DeviceUtil.m20137k(context);
        }
        throw new OnMainThreadException("Can't call this method on main thread");
    }

    /* JADX INFO: renamed from: e */
    public boolean m19870e() {
        return DeviceUtil.m20129f();
    }

    /* JADX INFO: renamed from: a */
    public void m19853a(String str, String str2, Map<String, Object> map) {
        f31850c.execute(new ag(this, str2, map, str));
    }

    /* JADX INFO: renamed from: a */
    public void m19854a(String str, Map<String, Object> map) {
        f31850c.execute(new ah(this, str, map));
    }

    /* JADX INFO: renamed from: b */
    public void m19863b(boolean z2) {
        if (this.f31854f.isUseCustomPrivacyPolicy()) {
            f31850c.execute(new af(this, z2));
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m19871f() {
        if (!OneTrack.isDisable()) {
            return false;
        }
        C5804p.m20342a(f31849a, "isDisable is true,Not allowed Track");
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m19855a(String str, Map<String, Object> map, List<String> list) {
        f31850c.execute(new ai(this, str, map, list));
    }

    /* JADX INFO: renamed from: a */
    public void m19848a(String str) {
        f31850c.execute(new aj(this, str));
    }

    /* JADX INFO: renamed from: d */
    public void m19868d() {
        DeviceUtil.m20127e();
    }

    /* JADX INFO: renamed from: a */
    public void m19852a(String str, String str2, String str3, String str4, String str5, long j2, Map<String, Object> map) {
        f31850c.execute(new ak(this, map, str, str2, str3, str5, str4, j2));
    }

    /* JADX INFO: renamed from: d */
    public void m19869d(boolean z2) {
        C5783a.m20293a().m20296a(z2);
    }

    /* JADX INFO: renamed from: a */
    public void m19856a(Map<String, Object> map) {
        f31850c.execute(new al(this, map));
    }

    /* JADX INFO: renamed from: a */
    public void m19851a(String str, Object obj) {
        f31850c.execute(new am(this, obj, str));
    }

    /* JADX INFO: renamed from: a */
    public void m19849a(String str, OneTrack.UserIdType userIdType, Map<String, Object> map, boolean z2) {
        f31850c.execute(new RunnableC5701o(this, str, userIdType, z2, map));
    }

    /* JADX INFO: renamed from: a */
    public void m19850a(String str, Number number) {
        f31850c.execute(new RunnableC5703q(this, str, number));
    }

    /* JADX INFO: renamed from: a */
    public void m19857a(Map<String, Object> map, boolean z2) {
        f31850c.execute(new RunnableC5704r(this, z2, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m19814a(String str, boolean z2) {
        f31850c.execute(new RunnableC5707u(this, str, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m19813a(String str, long j2) {
        f31850c.execute(new RunnableC5708v(this, str, j2));
    }

    /* JADX INFO: renamed from: c */
    public void m19866c(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        f31850c.execute(new RunnableC5710x(this, map));
    }

    /* JADX INFO: renamed from: a */
    public void m19844a() {
        f31850c.execute(new RunnableC5712z(this));
    }

    /* JADX INFO: renamed from: c */
    public void m19865c(String str) {
        f31850c.execute(new ab(this, str));
    }

    /* JADX INFO: renamed from: a */
    public void m19845a(OneTrack.ICommonPropertyProvider iCommonPropertyProvider) {
        this.f31855g = iCommonPropertyProvider;
    }

    /* JADX INFO: renamed from: c */
    public String m19864c() throws OnMainThreadException {
        if (!C5811w.m20402a()) {
            return C5782o.m20286a().m20292b();
        }
        throw new OnMainThreadException("Can't call this method on main thread");
    }

    /* JADX INFO: renamed from: a */
    public String m19842a(Context context) throws OnMainThreadException {
        if (!C5811w.m20402a()) {
            return DeviceUtil.m20136j(context);
        }
        throw new OnMainThreadException("Can't call this method on main thread");
    }

    /* JADX INFO: renamed from: c */
    public void m19867c(boolean z2) {
        this.f31858j = z2;
    }

    /* JADX INFO: renamed from: a */
    public void m19847a(ServiceQualityEvent serviceQualityEvent) {
        if (serviceQualityEvent == null) {
            return;
        }
        f31850c.execute(new ac(this, serviceQualityEvent));
    }

    /* JADX INFO: renamed from: a */
    public void m19858a(boolean z2) {
        C5804p.f32410a = z2;
    }

    /* JADX INFO: renamed from: a */
    private String m19808a(long j2, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C5693g.f31782X, str);
        jSONObject.put(C5693g.f31781W, j2);
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m19846a(OneTrack.IEventHook iEventHook) {
        this.f31856h = iEventHook;
        this.f31857i.m20399a(iEventHook);
    }

    /* JADX INFO: renamed from: a */
    public String m19843a(Intent intent) throws OnMainThreadException {
        if (!C5811w.m20402a()) {
            if (intent != null && C5684a.m19690a().m19696c()) {
                return C5684a.m19690a().m19695a(intent);
            }
            C5804p.m20347b(f31849a, "Not allowed to call,intent is null or Not specify the package name");
            return "";
        }
        throw new OnMainThreadException("Can't call this method on main thread");
    }
}
