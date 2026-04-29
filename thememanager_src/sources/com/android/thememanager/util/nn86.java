package com.android.thememanager.util;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.model.LargeIconElementRuntime;
import com.google.gson.C4871g;
import com.google.gson.reflect.C4922k;
import com.xiaomi.mipush.sdk.C5658n;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import miui.os.UserHandle;

/* JADX INFO: compiled from: LargeIconRuntimeManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class nn86 {

    /* JADX INFO: renamed from: k */
    private static final String f16670k = "LargeIconRuntime";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static volatile nn86 f61377toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static volatile HashMap<String, zy> f61378zy;

    /* JADX INFO: renamed from: com.android.thememanager.util.nn86$q */
    /* JADX INFO: compiled from: LargeIconRuntimeManager.java */
    public interface InterfaceC2798q<T> {
        /* JADX INFO: renamed from: k */
        void mo8403k(T e2, boolean isUsing);
    }

    /* JADX INFO: compiled from: LargeIconRuntimeManager.java */
    public static class toq<T> extends AsyncTask<Void, Void, Boolean> {

        /* JADX INFO: renamed from: k */
        private WeakReference<T> f16671k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private WeakReference<InterfaceC2798q> f61379toq;

        public toq(T t2, InterfaceC2798q callback) {
            this.f16671k = new WeakReference<>(t2);
            if (callback != null) {
                this.f61379toq = new WeakReference<>(callback);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voids) {
            HashMap map;
            nn86.zy();
            HashMap map2 = nn86.f61378zy;
            Iterator it = map2.keySet().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                zy zyVar = (zy) map2.get((String) it.next());
                if (zyVar != null && (map = zyVar.f16673k) != null && map.size() != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : map.keySet()) {
                        if (com.android.thememanager.basemodule.utils.a9.m6999s(str.split(C5658n.f73185t8r)[0])) {
                            z2 = true;
                        } else {
                            arrayList.add(str);
                        }
                    }
                    Log.d(nn86.f16670k, "CheckLargeIconTask toDelete: " + arrayList);
                    zyVar.m9921q(arrayList).qrj();
                }
            }
            return Boolean.valueOf(z2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);
            WeakReference<InterfaceC2798q> weakReference = this.f61379toq;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f61379toq.get().mo8403k(this.f16671k.get(), aBoolean.booleanValue());
        }
    }

    /* JADX INFO: compiled from: LargeIconRuntimeManager.java */
    public static class zy {

        /* JADX INFO: renamed from: q */
        private static final String f16672q = "runtime_largeicon.config";

        /* JADX INFO: renamed from: k */
        private HashMap<String, LargeIconElementRuntime> f16673k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final String f61380toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final String f61381zy;

        /* JADX INFO: renamed from: com.android.thememanager.util.nn86$zy$k */
        /* JADX INFO: compiled from: LargeIconRuntimeManager.java */
        class C2799k extends C4922k<HashMap<String, LargeIconElementRuntime>> {
            C2799k() {
            }
        }

        public static String f7l8(String mode) {
            return nn86.m9914n(mode) + "runtime_largeicon.config";
        }

        private zy ld6(String packageName, LargeIconElementRuntime element) {
            this.f16673k.put(packageName, element);
            Log.d(nn86.f16670k, "putElement: " + element.packageName);
            return this;
        }

        private zy zy(String packageName) {
            LargeIconElementRuntime largeIconElementRuntimeRemove = this.f16673k.remove(packageName);
            Log.d(nn86.f16670k, "clearElement: " + packageName);
            if (largeIconElementRuntimeRemove != null) {
                try {
                    d8wk.x2(largeIconElementRuntimeRemove.path);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: g */
        public HashMap<String, LargeIconElementRuntime> m9918g() {
            return this.f16673k;
        }

        /* JADX INFO: renamed from: n */
        public LargeIconElementRuntime m9919n(String packageName) {
            if (packageName == null) {
                throw new NullPointerException("error param");
            }
            HashMap<String, LargeIconElementRuntime> map = this.f16673k;
            if (map != null) {
                return map.get(packageName);
            }
            throw new NullPointerException("have you init ?");
        }

        /* JADX INFO: renamed from: p */
        public boolean m9920p(String localId, String packageName, boolean isOfficial) {
            LargeIconElementRuntime largeIconElementRuntimeM9919n = m9919n(packageName);
            return largeIconElementRuntimeM9919n != null ? TextUtils.equals(localId, largeIconElementRuntimeM9919n.localId) : isOfficial;
        }

        /* JADX INFO: renamed from: q */
        public zy m9921q(List<String> packageNames) {
            Iterator<String> it = packageNames.iterator();
            while (it.hasNext()) {
                zy(it.next());
            }
            return this;
        }

        @zy.y9n
        public synchronized boolean qrj() {
            try {
                HashMap<String, LargeIconElementRuntime> map = this.f16673k;
                if (map != null && map.size() > 0) {
                    File file = new File(this.f61380toq);
                    String strO1t = new C4871g().o1t(this.f16673k);
                    int i2 = com.android.thememanager.basemodule.utils.o1t.fu4() ? 511 : 493;
                    if (!file.getParentFile().exists()) {
                        C1821p.qrj(file.getParentFile(), i2, -1, -1);
                    }
                    if (!file.exists()) {
                        file.createNewFile();
                        C1821p.zy(this.f61380toq, i2);
                    }
                    C1821p.m7185i(this.f61380toq, strO1t);
                    return true;
                }
                d8wk.x2(this.f61380toq);
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        }

        /* JADX INFO: renamed from: s */
        public boolean m9922s(String packageName) {
            LargeIconElementRuntime largeIconElementRuntimeM9919n = m9919n(packageName);
            return (largeIconElementRuntimeM9919n == null || largeIconElementRuntimeM9919n.uuid == null) ? false : true;
        }

        public zy toq() {
            try {
                Log.i(nn86.f16670k, "clear All data, mode = " + this.f61381zy);
                d8wk.x2(nn86.m9914n(this.f61381zy));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.f16673k.clear();
            return this;
        }

        public zy x2(List<String> packageNames, LargeIconElementRuntime element) {
            for (String str : packageNames) {
                LargeIconElementRuntime largeIconElementRuntimeM28254clone = element.m28254clone();
                largeIconElementRuntimeM28254clone.packageName = element.packageName;
                ld6(str, largeIconElementRuntimeM28254clone);
            }
            return this;
        }

        @zy.y9n
        /* JADX INFO: renamed from: y */
        public synchronized zy m9923y() {
            if (this.f16673k == null) {
                try {
                    File file = new File(this.f61380toq);
                    this.f16673k = new HashMap<>(0);
                    if (!file.exists()) {
                        return this;
                    }
                    HashMap map = (HashMap) new C4871g().kja0(ek5k.toq(file), new C2799k().getType());
                    for (String str : map.keySet()) {
                        this.f16673k.put(str, (LargeIconElementRuntime) map.get(str));
                    }
                } catch (Exception e2) {
                    Log.e("largeIcon", "initData: ", e2);
                }
            }
            return this;
        }

        private zy(String mode) {
            if (mode == null) {
                throw new NullPointerException("init LargeIconModeRuntimeManager error, mode is null");
            }
            this.f61381zy = mode;
            this.f61380toq = f7l8(mode);
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m9912g() {
        return new File(zy.f7l8("desktop")).exists() || new File(zy.f7l8("drawer")).exists();
    }

    /* JADX INFO: renamed from: n */
    public static String m9914n(String mode) {
        StringBuilder sb = new StringBuilder();
        sb.append(p001b.f7l8.f53812ula6);
        sb.append(UserHandle.myUserId());
        String str = File.separator;
        sb.append(str);
        sb.append("apps");
        sb.append(str);
        String string = sb.toString();
        if (TextUtils.isEmpty(mode)) {
            return string;
        }
        return string + mode + str;
    }

    /* JADX INFO: renamed from: q */
    public static synchronized zy m9915q(String mode) {
        zy zyVar;
        if (f61378zy == null) {
            f61378zy = new HashMap<>(3);
        }
        String str = UserHandle.myUserId() + "_" + mode;
        zyVar = f61378zy.get(str);
        if (zyVar == null) {
            zyVar = new zy(mode);
            f61378zy.put(str, zyVar);
        }
        return zyVar;
    }

    public static synchronized boolean toq() {
        d8wk.x2(p001b.f7l8.f53812ula6);
        if (f61378zy != null && f61378zy.size() > 0) {
            Iterator<String> it = f61378zy.keySet().iterator();
            while (it.hasNext()) {
                zy zyVar = f61378zy.get(it.next());
                if (zyVar != null) {
                    zyVar.toq().qrj();
                }
            }
            f61378zy.clear();
            return true;
        }
        return false;
    }

    public static synchronized nn86 zy() {
        if (f61377toq == null) {
            f61377toq = new nn86();
            String[] list = new File(m9914n(null)).list();
            if (list != null) {
                for (String str : list) {
                    m9915q(str).m9923y();
                }
            }
        }
        return f61377toq;
    }

    public boolean f7l8(String localId, String packageName, boolean isOfficial) {
        if (f61378zy == null || f61378zy.size() <= 0) {
            return isOfficial;
        }
        Iterator<String> it = f61378zy.keySet().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            zy zyVar = f61378zy.get(it.next());
            z2 = zyVar != null && zyVar.m9923y().m9920p(localId, packageName, isOfficial);
            if (z2) {
                break;
            }
        }
        return z2;
    }
}
