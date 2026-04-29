package com.android.thememanager.push;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.privacy.x2;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.controller.online.ld6;
import com.android.thememanager.util.C2755a;
import com.xiaomi.channel.commonutils.logger.InterfaceC5621k;
import com.xiaomi.mipush.sdk.C5661p;
import com.xiaomi.mipush.sdk.cdj;
import com.xiaomi.mipush.sdk.fn3e;
import ek5k.C6002g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import miui.os.Build;
import miui.theme.ThemeManagerHelper;
import uf.EnumC7687k;

/* JADX INFO: compiled from: ThemePushManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static volatile f7l8 f60605f7l8 = null;

    /* JADX INFO: renamed from: g */
    private static final String f13491g = "_topic";

    /* JADX INFO: renamed from: n */
    private static final String f13492n = "_";

    /* JADX INFO: renamed from: q */
    private static final String f13493q = "t";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f60606toq = "1002505";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f60607zy = "850100253505";

    /* JADX INFO: renamed from: k */
    private final Context f13494k = bf2.toq.toq();

    /* JADX INFO: renamed from: com.android.thememanager.push.f7l8$k */
    /* JADX INFO: compiled from: ThemePushManager.java */
    class C2313k implements Application.ActivityLifecycleCallbacks {
        C2313k() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            String stringExtra = activity.getIntent().getStringExtra(InterfaceC2316n.f13504y);
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            cdj.yz(C2082k.zy().toq(), stringExtra);
            if (bf2.toq.m5812n()) {
                Log.d(C2755a.f16307g, "click push message id: " + stringExtra);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX INFO: compiled from: ThemePushManager.java */
    class toq implements InterfaceC5621k {
        toq() {
        }

        @Override // com.xiaomi.channel.commonutils.logger.InterfaceC5621k
        /* JADX INFO: renamed from: k */
        public void mo8464k(String content) {
        }

        @Override // com.xiaomi.channel.commonutils.logger.InterfaceC5621k
        public void toq(String tag) {
        }

        @Override // com.xiaomi.channel.commonutils.logger.InterfaceC5621k
        public void zy(String content, Throwable t2) {
        }
    }

    /* JADX INFO: compiled from: ThemePushManager.java */
    public enum zy {
        PUSH_USER,
        PUSH_WALLPAPER
    }

    private f7l8() {
        f7l8();
    }

    private void f7l8() {
        C5661p.m19540n(this.f13494k, new toq());
    }

    /* JADX INFO: renamed from: g */
    public static f7l8 m8456g() {
        if (f60605f7l8 == null) {
            synchronized (f7l8.class) {
                if (f60605f7l8 == null) {
                    f60605f7l8 = new f7l8();
                }
            }
        }
        return f60605f7l8;
    }

    /* JADX INFO: renamed from: k */
    private static String m8457k(String origin, boolean needTopicSuffix) {
        if (!needTopicSuffix) {
            return "t" + origin;
        }
        return "t" + origin + f13491g;
    }

    /* JADX INFO: renamed from: n */
    private static int m8458n(Context context, String packageName) {
        if (context == null || packageName == null) {
            return -1;
        }
        try {
            PackageInfo packageInfo = context.getApplicationContext().getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return -1;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: p */
    private static String m8459p(String origin) {
        return m8457k(origin, false);
    }

    /* JADX INFO: renamed from: q */
    public static Application.ActivityLifecycleCallbacks m8460q() {
        return new C2313k();
    }

    private static String qrj(String origin) {
        if (origin.startsWith("t")) {
            origin = origin.substring(1);
        }
        return origin.endsWith(f13491g) ? origin.substring(0, origin.length() - 6) : origin;
    }

    private boolean t8r(String receivedTopic, zy type) {
        String[] strArrSplit;
        List arrayList = new ArrayList();
        String strNi7 = C1688q.cdj().ni7();
        zy zyVar = zy.PUSH_USER;
        if (type == zyVar) {
            arrayList = toq(strNi7, zyVar);
        } else {
            zy zyVar2 = zy.PUSH_WALLPAPER;
            if (type == zyVar2 && (strArrSplit = qrj(receivedTopic).split(f13492n)) != null && strArrSplit.length > 0) {
                arrayList = toq(strArrSplit[strArrSplit.length - 1], zyVar2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (receivedTopic.equals((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private static List<String> toq(String originTopicId, zy type) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m8457k(originTopicId, true));
        if (type == zy.PUSH_WALLPAPER) {
            String strNi7 = C1688q.cdj().ni7();
            if (!TextUtils.isEmpty(strNi7)) {
                arrayList.add(m8457k(strNi7 + f13492n + originTopicId, true));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    private static boolean m8461y() {
        return Build.IS_INTERNATIONAL_BUILD;
    }

    private static String zy(String userId) {
        return m8459p(userId);
    }

    boolean cdj(String pushAlias) {
        return TextUtils.isEmpty(pushAlias) || TextUtils.equals(pushAlias, zy(C1688q.cdj().ni7())) || TextUtils.equals(pushAlias, m8459p(ld6.m7564e()));
    }

    /* JADX INFO: renamed from: h */
    public void m8462h(String topicId, zy type) {
        Iterator<String> it = toq(topicId, type).iterator();
        while (it.hasNext()) {
            cdj.fnq8(this.f13494k, it.next(), null);
        }
    }

    boolean ki(String receivedTopic) {
        return TextUtils.isEmpty(receivedTopic) || t8r(receivedTopic, zy.PUSH_USER) || t8r(receivedTopic, zy.PUSH_WALLPAPER);
    }

    public void kja0() {
        try {
            cdj.mu(this.f13494k);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void ld6() {
        EnumC7687k enumC7687k = (!m8461y() || m8458n(C2082k.zy().toq(), "com.xiaomi.xmsf") < 109) ? EnumC7687k.China : EnumC7687k.Global;
        fn3e fn3eVar = new fn3e();
        fn3eVar.m19454p(enumC7687k);
        cdj.m19395l(this.f13494k, f60606toq, f60607zy, fn3eVar);
    }

    public void n7h(String topicId, zy type) {
        Iterator<String> it = toq(topicId, type).iterator();
        while (it.hasNext()) {
            cdj.bo(this.f13494k, it.next(), null);
        }
    }

    /* JADX INFO: renamed from: s */
    void m8463s(String registerId) {
    }

    public void x2(Application app) {
        if (!x2.zy() || x2.f7l8()) {
            Log.i(C2755a.f16307g, "UserMode not allow , ignore push");
            return;
        }
        if (y9n.vyq() && !a9.m6999s(y9n.f10446p)) {
            Log.i(C2755a.f16307g, "theme store uninstalled");
            kja0();
        } else {
            if (ThemeManagerHelper.needDisableTheme(app) || "lithium".equalsIgnoreCase(Build.DEVICE)) {
                return;
            }
            C6002g.zurt(new Runnable() { // from class: com.android.thememanager.push.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13497k.ld6();
                }
            }, 8000L);
            app.registerActivityLifecycleCallbacks(m8460q());
        }
    }
}
