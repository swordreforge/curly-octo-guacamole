package com.xiaomi.onetrack;

import android.content.Context;
import android.content.Intent;
import com.android.thememanager.settingssearch.C2690k;
import com.xiaomi.accountsdk.account.C5497k;
import com.xiaomi.onetrack.api.C5699m;
import com.xiaomi.onetrack.p014c.C5735i;
import com.xiaomi.onetrack.p017f.C5756a;
import com.xiaomi.onetrack.util.C5776i;
import com.xiaomi.onetrack.util.C5804p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import miuix.android.content.C6824k;

/* JADX INFO: loaded from: classes3.dex */
public class OneTrack {

    /* JADX INFO: renamed from: a */
    private static boolean f31513a;

    /* JADX INFO: renamed from: b */
    private static volatile int f31514b;

    /* JADX INFO: renamed from: c */
    private static boolean f31515c;

    /* JADX INFO: renamed from: d */
    private static boolean f31516d;

    /* JADX INFO: renamed from: e */
    private C5699m f31517e;

    public interface ICommonPropertyProvider {
        Map<String, Object> getDynamicProperty(String str);
    }

    public interface IEventHook {
        boolean isCustomDauEvent(String str);

        boolean isRecommendEvent(String str);
    }

    public enum Mode {
        APP("app"),
        PLUGIN("plugin"),
        SDK("sdk");


        /* JADX INFO: renamed from: a */
        private String f31520a;

        Mode(String str) {
            this.f31520a = str;
        }

        public String getType() {
            return this.f31520a;
        }
    }

    public enum NetType {
        NOT_CONNECTED("NONE"),
        MOBILE_2G("2G"),
        MOBILE_3G("3G"),
        MOBILE_4G("4G"),
        MOBILE_5G("5G"),
        WIFI(C6824k.f86613r8s8),
        ETHERNET("ETHERNET"),
        UNKNOWN("UNKNOWN"),
        CONNECTED("CONNECTED");


        /* JADX INFO: renamed from: a */
        private String f31522a;

        NetType(String str) {
            this.f31522a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f31522a;
        }
    }

    public enum UserIdType {
        XIAOMI("xiaomi"),
        PHONE_NUMBER("phone_number"),
        WEIXIN(C5497k.f30749q),
        WEIBO("weibo"),
        QQ(C5497k.f72765zy),
        OTHER(C2690k.k.f61039ld6);


        /* JADX INFO: renamed from: a */
        private String f31524a;

        UserIdType(String str) {
            this.f31524a = str;
        }

        public String getUserIdType() {
            return this.f31524a;
        }
    }

    private OneTrack(Context context, Configuration configuration) {
        C5756a.m20050a(context.getApplicationContext());
        this.f31517e = new C5699m(context, configuration);
        setEventHook(new DefaultEventHook());
    }

    /* JADX INFO: renamed from: a */
    private static void m19624a(Context context) {
        if (context == null) {
            throw new IllegalStateException("context is null!");
        }
        C5756a.m20050a(context.getApplicationContext());
    }

    public static OneTrack createInstance(Context context, Configuration configuration) {
        return new OneTrack(context, configuration);
    }

    public static int getGlobalBasicModeEnable() {
        return f31514b;
    }

    public static boolean isDisable() {
        return f31513a;
    }

    public static boolean isRestrictGetNetworkInfo() {
        return f31516d;
    }

    public static boolean isUseSystemNetTrafficOnly() {
        return f31515c;
    }

    public static void registerCrashHook(Context context) {
        CrashAnalysis.m19609a(context);
    }

    public static String sdkVersion() {
        return BuildConfig.SDK_VERSION;
    }

    public static void setAccessNetworkEnable(Context context, final boolean z2) {
        m19624a(context);
        C5776i.m20256a(new Runnable() { // from class: com.xiaomi.onetrack.OneTrack.1
            @Override // java.lang.Runnable
            public void run() {
                C5735i.m19958a(z2);
                C5735i.m19961b(z2);
            }
        });
    }

    public static void setDebugMode(boolean z2) {
        C5804p.m20345a(z2);
    }

    public static void setDisable(boolean z2) {
        f31513a = z2;
    }

    public static void setGlobalBasicModeEnable(boolean z2) {
        if (z2) {
            f31514b = 2;
        } else {
            f31514b = 1;
        }
    }

    public static void setRestrictGetNetworkInfo(boolean z2) {
        f31516d = z2;
    }

    public static void setTestMode(boolean z2) {
        C5804p.m20349b(z2);
    }

    public static void setUseSystemNetTrafficOnly() {
        f31515c = true;
    }

    public void adTrack(String str, Map<String, Object> map) {
        this.f31517e.m19855a(str, map, (List<String>) null);
    }

    public String appActiveBroadcast(Intent intent) throws OnMainThreadException {
        return this.f31517e.m19843a(intent);
    }

    public void clearCommonProperty() {
        this.f31517e.m19844a();
    }

    public String getAndroidId(Context context) throws OnMainThreadException {
        return this.f31517e.m19860b(context);
    }

    public String getInstanceId() throws OnMainThreadException {
        return this.f31517e.m19864c();
    }

    public String getOAID(Context context) throws OnMainThreadException {
        return this.f31517e.m19842a(context);
    }

    public boolean hasMemoryOaid() {
        return this.f31517e.m19870e();
    }

    public void login(String str, UserIdType userIdType, Map<String, Object> map, boolean z2) {
        this.f31517e.m19849a(str, userIdType, map, z2);
    }

    public void logout() {
        logout(null, false);
    }

    public void refreshGetOaidTime() {
        this.f31517e.m19868d();
    }

    public void removeCommonProperty(String str) {
        this.f31517e.m19861b(str);
    }

    public void setBasicModeEnable(boolean z2) {
        this.f31517e.m19867c(z2);
    }

    public void setCloseOaidDependMsaSDK(boolean z2) {
        this.f31517e.m19869d(z2);
    }

    public void setCommonProperty(Map<String, Object> map) {
        this.f31517e.m19866c(map);
    }

    public void setCustomPrivacyPolicyAccepted(boolean z2) {
        this.f31517e.m19863b(z2);
    }

    public void setDynamicCommonProperty(ICommonPropertyProvider iCommonPropertyProvider) {
        this.f31517e.m19845a(iCommonPropertyProvider);
    }

    public void setEventHook(IEventHook iEventHook) {
        this.f31517e.m19846a(iEventHook);
    }

    public void setInstanceId(String str) {
        this.f31517e.m19865c(str);
    }

    public void setUserProfile(Map<String, Object> map) {
        this.f31517e.m19856a(map);
    }

    public void track(String str, Map<String, Object> map) {
        this.f31517e.m19854a(str, map);
    }

    public void trackEventFromH5(String str) {
        this.f31517e.m19848a(str);
    }

    public void trackPluginEvent(String str, String str2, Map<String, Object> map) {
        this.f31517e.m19853a(str, str2, map);
    }

    public void trackServiceQualityEvent(ServiceQualityEvent serviceQualityEvent) {
        this.f31517e.m19847a(serviceQualityEvent);
    }

    public void userProfileIncrement(Map<String, ? extends Number> map) {
        this.f31517e.m19862b(map);
    }

    public void adTrack(String str, Map<String, Object> map, List<String> list) {
        this.f31517e.m19855a(str, map, list);
    }

    public void login(String str, UserIdType userIdType, Map<String, Object> map) {
        login(str, userIdType, map, false);
    }

    public void logout(Map<String, Object> map, boolean z2) {
        this.f31517e.m19857a(map, z2);
    }

    public void setUserProfile(String str, Object obj) {
        this.f31517e.m19851a(str, obj);
    }

    public void track(String str, List<String> list, Map<String, Object> map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        map2.put("exp_id", String.join(",", list));
        this.f31517e.m19854a(str, (Map<String, Object>) map2);
    }

    public void userProfileIncrement(String str, Number number) {
        this.f31517e.m19850a(str, number);
    }
}
