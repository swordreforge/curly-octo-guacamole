package com.android.thememanager.controller;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.jp0y;
import com.android.thememanager.basemodule.network.theme.AbstractC1777n;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1824r;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.database.C1960k;
import com.android.thememanager.database.C1961q;
import com.android.thememanager.database.ThemeDatabase;
import com.android.thememanager.detail.theme.model.DetailRequestInterface;
import com.android.thememanager.model.LargeIconInfoElement;
import com.xiaomi.mipush.sdk.C5658n;
import ek5k.C6002g;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;
import zy.oc;

/* JADX INFO: renamed from: com.android.thememanager.controller.g */
/* JADX INFO: compiled from: LargeIconInfoManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1900g {

    /* JADX INFO: renamed from: q */
    private static final String f10846q = "key_update_info_time";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f57898toq = "LargeIconInfoManager";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static volatile C1900g f57899zy;

    /* JADX INFO: renamed from: k */
    private boolean f10847k = false;

    /* JADX INFO: renamed from: com.android.thememanager.controller.g$k */
    /* JADX INFO: compiled from: LargeIconInfoManager.java */
    class k extends AbstractC1777n<List<LargeIconInfoElement>> {
        k() {
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onResponse(@lvui List<LargeIconInfoElement> result) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateLargeIconSupport success, support count ");
            sb.append(result == null ? "null" : Integer.valueOf(result.size()));
            Log.d(C1900g.f57898toq, sb.toString());
            C1900g.this.f10847k = false;
            new zy(null).executeOnExecutor(C6002g.ld6(), result);
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        public void onFailure(int httpCode, int apiCode, String message, Exception e2) {
            super.onFailure(httpCode, apiCode, message, e2);
            C1900g.this.f10847k = false;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.controller.g$toq */
    /* JADX INFO: compiled from: LargeIconInfoManager.java */
    public interface toq extends jp0y<C1960k> {
        /* JADX INFO: renamed from: k */
        void mo6350k();
    }

    /* JADX INFO: renamed from: com.android.thememanager.controller.g$zy */
    /* JADX INFO: compiled from: LargeIconInfoManager.java */
    private static class zy extends AsyncTask<List<LargeIconInfoElement>, Void, Void> {
        private zy() {
        }

        private static synchronized boolean toq(List<C1960k> infoList) {
            try {
                ThemeDatabase.wvg(bf2.toq.toq()).mo7698t().mo7707y();
                ThemeDatabase.wvg(bf2.toq.toq()).mo7698t().qrj(infoList);
                Log.i(C1900g.f57898toq, "updateDatabase success " + infoList.size());
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(List<LargeIconInfoElement>... hashMaps) {
            List<LargeIconInfoElement> list = hashMaps[0];
            if (y9n.mcp(list)) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (LargeIconInfoElement largeIconInfoElement : list) {
                String[] qVar = C1961q.toq(largeIconInfoElement.relativePackage);
                arrayList.add(new C1960k(largeIconInfoElement.packageName, largeIconInfoElement.packageTitle, true, jCurrentTimeMillis, largeIconInfoElement.order, qVar, null));
                if (qVar != null && qVar.length > 0) {
                    for (int i2 = 0; i2 < qVar.length; i2++) {
                        String str = qVar[i2];
                        String[] strArr = new String[qVar.length];
                        System.arraycopy(qVar, 0, strArr, 0, qVar.length);
                        String str2 = largeIconInfoElement.packageName;
                        strArr[i2] = str2;
                        arrayList.add(new C1960k(str, largeIconInfoElement.packageTitle, true, jCurrentTimeMillis, largeIconInfoElement.order, strArr, str2));
                    }
                }
            }
            if (!toq(arrayList)) {
                return null;
            }
            C1824r.m7203y().x2(C1900g.f10846q, System.currentTimeMillis()).m7204k();
            return null;
        }

        /* synthetic */ zy(k kVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m7459g(String str, String str2, InterfaceC0954z interfaceC0954z, toq toqVar, List list) {
        if (list == null || list.size() <= 0) {
            Log.i(f57898toq, "supportLargeIconForInit for failed");
            toqVar.mo6350k();
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str + C5658n.f73185t8r + str2;
        }
        ThemeDatabase.wvg(bf2.toq.toq()).mo7698t().zy(str).m4391p(interfaceC0954z, toqVar);
    }

    @zy.y9n
    /* JADX INFO: renamed from: n */
    public static boolean m7461n(String packageName) {
        C1960k c1960kX2 = ThemeDatabase.wvg(bf2.toq.toq()).mo7698t().x2(packageName);
        return c1960kX2 != null && c1960kX2.f11127q;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m7462q() {
        return ThemeDatabase.wvg(bf2.toq.toq()).mo7698t().mo7702k() > 0;
    }

    public static synchronized C1900g zy() {
        if (f57899zy == null) {
            f57899zy = new C1900g();
        }
        return f57899zy;
    }

    @oc
    public LiveData<C1960k> f7l8(String packageName) {
        return ThemeDatabase.wvg(bf2.toq.toq()).mo7698t().zy(packageName);
    }

    /* JADX INFO: renamed from: s */
    public void m7463s(boolean forceUpdate) {
        try {
            if (C1781k.toq(bf2.toq.toq()) && C1807g.m7077l()) {
                if ((!forceUpdate && System.currentTimeMillis() - C1824r.m7203y().m7205n(f10846q, 0L) < 86400000 && m7462q()) || this.f10847k) {
                    Log.d(f57898toq, "not need update");
                    return;
                }
                this.f10847k = true;
                ((DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class)).getLargeIconInfoList().mo27954p(new k());
                return;
            }
            Log.d(f57898toq, "not update, not allow network" + C1781k.toq(bf2.toq.toq()));
        } catch (Exception e2) {
            Log.e(f57898toq, "updateLargeIconSupport: ", e2);
        }
    }

    @oc
    /* JADX INFO: renamed from: y */
    public void m7464y(final InterfaceC0954z lifecycleOwner, final String packageName, final String activityName, final toq observer) {
        LiveData<List<C1960k>> liveDataF7l8 = ThemeDatabase.wvg(bf2.toq.toq()).mo7698t().f7l8();
        liveDataF7l8.m4389h(lifecycleOwner);
        liveDataF7l8.m4391p(lifecycleOwner, new jp0y() { // from class: com.android.thememanager.controller.n
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                C1900g.m7459g(packageName, activityName, lifecycleOwner, observer, (List) obj);
            }
        });
    }
}
