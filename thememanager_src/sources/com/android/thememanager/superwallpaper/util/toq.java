package com.android.thememanager.superwallpaper.util;

import android.os.AsyncTask;
import android.provider.Settings;
import android.util.Log;
import com.android.thememanager.basemodule.utils.C1808h;
import com.android.thememanager.lockscreen.lock.ClockInfo;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.miui.clock.module.ClockBean;
import java.lang.ref.WeakReference;
import zy.y9n;

/* JADX INFO: compiled from: GetCurTemplateConfigInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq extends AsyncTask<Void, Void, TemplateConfig> {

    /* JADX INFO: renamed from: q */
    public static final String f16151q = "constant_lockscreen_info";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f61162toq = "GetCurTemplateConfigInfo";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f61163zy = "doodle";

    /* JADX INFO: renamed from: k */
    private WeakReference<InterfaceC2733k> f16152k;

    public toq(InterfaceC2733k callback) {
        this.f16152k = new WeakReference<>(callback);
    }

    @y9n
    /* JADX INFO: renamed from: g */
    public static void m9511g() {
        String strO1t = C1808h.m7086k().o1t(new TemplateConfig(zy(ClockBean.getClassicDefaultBean(bf2.toq.toq())), null, null, null, null, null));
        Log.d(f61162toq, "writeDefaultLockStyle: " + strO1t);
        Settings.Secure.putString(bf2.toq.toq().getContentResolver(), "constant_lockscreen_info", strO1t);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m9512q(TemplateConfig config) {
        if (config == null || config.getClockInfo() == null) {
            return false;
        }
        return "doodle".equals(config.getClockInfo().getTemplateId());
    }

    @y9n
    public static TemplateConfig toq() {
        return (TemplateConfig) C1808h.m7086k().n7h(Settings.Secure.getString(bf2.toq.toq().getContentResolver(), "constant_lockscreen_info"), TemplateConfig.class);
    }

    public static ClockInfo zy(ClockBean clockBean) {
        return new ClockInfo(clockBean.getTemplateId(), clockBean.getPrimaryColor(), clockBean.getSecondaryColor(), clockBean.getStyle(), clockBean.isEnableDiffusion(), clockBean.getClassicLine1(), clockBean.getClassicLine2(), clockBean.getClassicLine3(), clockBean.getClassicLine4(), clockBean.getClassicLine5(), clockBean.getClassicSignature() == null ? "" : clockBean.getClassicSignature(), clockBean.isAutoPrimaryColor(), clockBean.isAutoSecondaryColor(), clockBean.isDiffHourMinuteColor());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public TemplateConfig doInBackground(Void... voids) {
        try {
            return toq();
        } catch (Exception e2) {
            Log.w(f61162toq, "CheckLockStyleAsyncTask: error" + e2);
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(TemplateConfig ret) {
        super.onPostExecute(ret);
        InterfaceC2733k interfaceC2733k = this.f16152k.get();
        if (interfaceC2733k == null) {
            return;
        }
        if (ret == null) {
            Log.w(f61162toq, "curTemplateConfig is null");
        } else if (ret.getClockInfo() == null) {
            Log.w(f61162toq, "curTemplateConfig clockInfo is null");
        } else if (ret.getClockInfo() != null) {
            Log.d(f61162toq, "clockInfo templateId is" + ret.getClockInfo().getTemplateId());
        }
        interfaceC2733k.mo6384k(ret);
    }
}
