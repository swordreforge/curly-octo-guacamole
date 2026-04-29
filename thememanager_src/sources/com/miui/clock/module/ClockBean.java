package com.miui.clock.module;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.C4871g;
import com.miui.clock.module.toq;
import gcp.C6064q;
import java.util.Objects;
import org.json.JSONObject;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class ClockBean implements Cloneable {
    private int classicLine1;
    private int classicLine2;
    private int classicLine3;
    private int classicLine4;
    private int classicLine5;
    private String classicSignature;
    private boolean disableContainerPassBlur;
    private String dualClockLocalCity;
    private boolean enableDiffusion;
    private int infoAreaColor;
    private boolean isAutoPrimaryColor;
    private boolean isAutoSecondaryColor;
    private boolean isDiffHourMinuteColor;
    private String presetHealthJson;
    private String presetWeatherJson;
    private int primaryColor;
    private int secondaryColor;
    private int style;
    private String templateId;
    private boolean unablePresetData;

    public ClockBean(String str) {
        this.templateId = str;
    }

    public static ClockBean getClassicDefaultBean(Context context) {
        String string;
        int iF7l8 = C6064q.f7l8();
        ClockBean clockBean = null;
        if (C6064q.m22335n(context)) {
            try {
                string = (String) Settings.Secure.class.getMethod("getStringForUser", ContentResolver.class, String.class, Integer.TYPE).invoke(null, context.getContentResolver(), "miui_15_default_lockscreen_info", Integer.valueOf(iF7l8));
            } catch (Exception e2) {
                Log.e("ClockBean", "getStringForUser fail", e2);
                string = "";
            }
        } else {
            string = Settings.Secure.getString(context.getContentResolver(), "miui_15_default_lockscreen_info");
        }
        if (!TextUtils.isEmpty(string)) {
            try {
                clockBean = (ClockBean) new C4871g().n7h(new JSONObject(string).getString("clockInfo"), ClockBean.class);
            } catch (Exception e3) {
                Log.e("ClockBean", "getIntForUser fail", e3);
            }
        }
        if (clockBean == null || TextUtils.isEmpty(clockBean.getTemplateId())) {
            Log.d("ClockBean", "getClassicDefaultBean");
            clockBean = new ClockBean("classic");
            boolean z2 = getShowCarrier(context, iF7l8) == 1;
            boolean z3 = getShowLunarCalendar(context, iF7l8) == 1;
            boolean zQrj = gcp.zy.qrj(context, iF7l8);
            if (!z2 && z3) {
                clockBean.setClassicLine1(101);
            } else if (isDataCapable(context) && z2) {
                clockBean.setClassicLine1(11);
            } else {
                clockBean.setClassicLine1(0);
            }
            clockBean.setClassicLine2(300);
            if (!zQrj) {
                clockBean.setClassicLine3(toq.zy.f72000f7l8);
            } else if (z3 && z2) {
                clockBean.setClassicLine3(toq.zy.f72001ld6);
            } else {
                clockBean.setClassicLine3(202);
            }
            if (zQrj) {
                clockBean.setClassicLine4(400);
            } else if (z3 && z2) {
                clockBean.setClassicLine4(toq.zy.f29237p);
            } else {
                clockBean.setClassicLine4(200);
            }
            clockBean.setClassicLine5(0);
            clockBean.setAutoPrimaryColor(true);
            clockBean.setAutoSecondaryColor(true);
        }
        return clockBean;
    }

    public static int getClassicDefaultLine1(Context context, int i2) {
        return getShowCarrier(context, i2) == 1 ? 11 : 0;
    }

    public static int getShowCarrier(Context context, int i2) {
        if (!C6064q.m22335n(context)) {
            return Settings.System.getInt(context.getContentResolver(), "status_bar_show_carrier_under_keyguard", 1);
        }
        try {
            Class cls = Integer.TYPE;
            return ((Integer) Settings.System.class.getMethod("getIntForUser", ContentResolver.class, String.class, cls, cls).invoke(null, context.getContentResolver(), "status_bar_show_carrier_under_keyguard", 1, Integer.valueOf(i2))).intValue();
        } catch (Exception e2) {
            Log.e("ClockBean", "getIntForUser fail", e2);
            return 1;
        }
    }

    public static int getShowLunarCalendar(Context context, int i2) {
        if (!C6064q.m22335n(context)) {
            return Settings.System.getInt(context.getContentResolver(), "show_lunar_calendar", 0);
        }
        try {
            Class cls = Integer.TYPE;
            return ((Integer) Settings.System.class.getMethod("getIntForUser", ContentResolver.class, String.class, cls, cls).invoke(null, context.getContentResolver(), "show_lunar_calendar", 0, Integer.valueOf(i2))).intValue();
        } catch (Exception e2) {
            Log.e("ClockBean", "getIntForUser fail", e2);
            return 0;
        }
    }

    public static boolean isDataCapable(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (Build.VERSION.SDK_INT >= 31) {
                return telephonyManager.isDataCapable();
            }
            return true;
        } catch (Exception e2) {
            Log.e("ClockBean", "isDataCapable: ", e2);
            return true;
        }
    }

    public Object clone() {
        try {
            return (ClockBean) super.clone();
        } catch (CloneNotSupportedException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClockBean clockBean = (ClockBean) obj;
        return this.infoAreaColor == clockBean.infoAreaColor && this.primaryColor == clockBean.primaryColor && this.secondaryColor == clockBean.secondaryColor && this.style == clockBean.style && this.enableDiffusion == clockBean.enableDiffusion && this.classicLine1 == clockBean.classicLine1 && this.classicLine2 == clockBean.classicLine2 && this.classicLine3 == clockBean.classicLine3 && this.classicLine4 == clockBean.classicLine4 && this.classicLine5 == clockBean.classicLine5 && this.isAutoPrimaryColor == clockBean.isAutoPrimaryColor && this.isAutoSecondaryColor == clockBean.isAutoSecondaryColor && this.isDiffHourMinuteColor == clockBean.isDiffHourMinuteColor && TextUtils.equals(this.templateId, clockBean.templateId) && TextUtils.equals(this.classicSignature, clockBean.classicSignature);
    }

    public int getClassicLine1() {
        return this.classicLine1;
    }

    public int getClassicLine2() {
        return this.classicLine2;
    }

    public int getClassicLine3() {
        return this.classicLine3;
    }

    public int getClassicLine4() {
        return this.classicLine4;
    }

    public int getClassicLine5() {
        return this.classicLine5;
    }

    public String getClassicSignature() {
        return this.classicSignature;
    }

    public String getDualClockLocalCity() {
        return this.dualClockLocalCity;
    }

    public int getInfoAreaColor() {
        return this.infoAreaColor;
    }

    public String getPresetHealthJson() {
        return this.presetHealthJson;
    }

    public String getPresetWeatherJson() {
        return this.presetWeatherJson;
    }

    public int getPrimaryColor() {
        return this.primaryColor;
    }

    public int getSecondaryColor() {
        return this.secondaryColor;
    }

    public int getStyle() {
        return this.style;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public int hashCode() {
        return Objects.hash(this.templateId, Integer.valueOf(this.infoAreaColor), Integer.valueOf(this.primaryColor), Integer.valueOf(this.secondaryColor), Integer.valueOf(this.style), Boolean.valueOf(this.enableDiffusion), Integer.valueOf(this.classicLine1), Integer.valueOf(this.classicLine2), Integer.valueOf(this.classicLine3), Integer.valueOf(this.classicLine4), Integer.valueOf(this.classicLine5), this.classicSignature, Boolean.valueOf(this.isAutoPrimaryColor), Boolean.valueOf(this.isAutoSecondaryColor), Boolean.valueOf(this.isDiffHourMinuteColor));
    }

    public boolean isAutoPrimaryColor() {
        return this.isAutoPrimaryColor;
    }

    public boolean isAutoSecondaryColor() {
        return this.isAutoSecondaryColor;
    }

    public boolean isDiffHourMinuteColor() {
        return this.isDiffHourMinuteColor;
    }

    public boolean isDisableContainerPassBlur() {
        return this.disableContainerPassBlur;
    }

    public boolean isEnableDiffusion() {
        return this.enableDiffusion;
    }

    public boolean isUnablePresetData() {
        return this.unablePresetData;
    }

    public void setAutoPrimaryColor(boolean z2) {
        this.isAutoPrimaryColor = z2;
    }

    public void setAutoSecondaryColor(boolean z2) {
        this.isAutoSecondaryColor = z2;
    }

    public void setClassicLine1(int i2) {
        this.classicLine1 = i2;
    }

    public void setClassicLine2(int i2) {
        this.classicLine2 = i2;
    }

    public void setClassicLine3(int i2) {
        this.classicLine3 = i2;
    }

    public void setClassicLine4(int i2) {
        this.classicLine4 = i2;
    }

    public void setClassicLine5(int i2) {
        this.classicLine5 = i2;
    }

    public void setClassicSignature(String str) {
        this.classicSignature = str;
    }

    public void setDiffHourMinuteColor(boolean z2) {
        this.isDiffHourMinuteColor = z2;
    }

    public void setDisableContainerPassBlur(boolean z2) {
        this.disableContainerPassBlur = z2;
    }

    public void setDualClockLocalCity(String str) {
        this.dualClockLocalCity = str;
    }

    public void setEnableDiffusion(boolean z2) {
        this.enableDiffusion = z2;
    }

    public void setInfoAreaColor(int i2) {
        this.infoAreaColor = i2;
    }

    public void setPresetHealthJson(String str) {
        this.presetHealthJson = str;
    }

    public void setPresetWeatherJson(String str) {
        this.presetWeatherJson = str;
    }

    public void setPrimaryColor(int i2) {
        this.primaryColor = i2;
    }

    public void setSecondaryColor(int i2) {
        this.secondaryColor = i2;
    }

    public void setStyle(int i2) {
        this.style = i2;
    }

    public void setTemplateId(String str) {
        this.templateId = str;
    }

    public void setUnablePresetData(boolean z2) {
        this.unablePresetData = z2;
    }

    @lvui
    public String toString() {
        return "ClockBean{templateId='" + this.templateId + "', infoAreaColor=" + this.infoAreaColor + ", primaryColor=" + this.primaryColor + ", secondaryColor=" + this.secondaryColor + ", style=" + this.style + ", enableDiffusion=" + this.enableDiffusion + ", classicLine1=" + this.classicLine1 + ", classicLine2=" + this.classicLine2 + ", classicLine3=" + this.classicLine3 + ", classicLine4=" + this.classicLine4 + ", classicLine5=" + this.classicLine5 + ", classicSignature='" + this.classicSignature + "', isAutoPrimaryColor=" + this.isAutoPrimaryColor + ", isAutoSecondaryColor=" + this.isAutoSecondaryColor + ", isDiffHourMinuteColor=" + this.isDiffHourMinuteColor + ", presetHealthJson='" + this.presetHealthJson + "', presetWeatherJson='" + this.presetWeatherJson + "'}";
    }

    public ClockBean(String str, int i2) {
        this.templateId = str;
        this.style = i2;
    }
}
