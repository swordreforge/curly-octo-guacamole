package com.android.thememanager.basemodule.utils;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import miuix.core.util.C7083n;

/* JADX INFO: compiled from: ThemeRuntimeDataHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class vyq implements InterfaceC1789q {

    /* JADX INFO: renamed from: c */
    private static volatile Map<String, String> f10414c = null;

    /* JADX INFO: renamed from: e */
    private static Map<String, String> f10415e = null;

    /* JADX INFO: renamed from: f */
    private static final Object f10416f;

    /* JADX INFO: renamed from: g */
    private static final String f10417g = "-";

    /* JADX INFO: renamed from: h */
    private static final String f10418h = "theme_runtime_local_id-";

    /* JADX INFO: renamed from: i */
    private static final String f10419i = "theme_runtime_online_id-";

    /* JADX INFO: renamed from: j */
    private static zy f10420j = null;

    /* JADX INFO: renamed from: k */
    public static final String f10421k = ".runtime";

    /* JADX INFO: renamed from: l */
    private static final int f10422l = 5000;

    /* JADX INFO: renamed from: n */
    public static final String f10423n;

    /* JADX INFO: renamed from: o */
    private static final String[] f10424o;

    /* JADX INFO: renamed from: p */
    private static final String f10425p = "theme_runtime_rights_path-";

    /* JADX INFO: renamed from: q */
    public static final String f10426q;

    /* JADX INFO: renamed from: r */
    private static final String f10427r = "theme_runtime_update_time-";

    /* JADX INFO: renamed from: s */
    private static final String f10428s = "theme_runtime_meta_path-";

    /* JADX INFO: renamed from: t */
    private static final String f10429t = "theme_runtime_hash-";

    /* JADX INFO: renamed from: y */
    private static final String f10430y = "NULL_PLACE_HOLDER";

    /* JADX INFO: renamed from: z */
    private static final String f10431z = "theme_runtime_name-";

    /* JADX INFO: compiled from: ThemeRuntimeDataHelper.java */
    private static class toq implements Runnable {
        private toq() {
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            Map mapKi = vyq.ki();
            synchronized (vyq.f10416f) {
                Map mapN7h = vyq.n7h();
                mapN7h.clear();
                mapN7h.putAll(mapKi);
                Map mapQrj = vyq.qrj();
                for (String str : mapQrj.keySet()) {
                    String str2 = (String) mapQrj.get(str);
                    if (vyq.f10430y.equals(str2)) {
                        mapN7h.remove(str);
                    } else {
                        mapN7h.put(str, str2);
                    }
                }
                mapQrj.clear();
            }
            vyq.x2();
        }
    }

    /* JADX INFO: compiled from: ThemeRuntimeDataHelper.java */
    private static class zy {

        /* JADX INFO: renamed from: k */
        private ThreadPoolExecutor f10432k;

        /* JADX INFO: renamed from: q */
        private Runnable f10433q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Handler f57815toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Object f57816zy;

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.vyq$zy$k */
        /* JADX INFO: compiled from: ThemeRuntimeDataHelper.java */
        class RejectedExecutionHandlerC1829k implements RejectedExecutionHandler {
            RejectedExecutionHandlerC1829k() {
            }

            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable r2, ThreadPoolExecutor executor) {
            }
        }

        /* JADX INFO: compiled from: ThemeRuntimeDataHelper.java */
        class toq implements Runnable {
            toq() {
            }

            @Override // java.lang.Runnable
            public void run() {
                zy.this.toq(false);
            }
        }

        private zy() {
            this.f10432k = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque(1), new RejectedExecutionHandlerC1829k());
            this.f57815toq = new Handler(Looper.getMainLooper());
            this.f57816zy = new Object();
            this.f10433q = new toq();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void toq(boolean sync) {
            if (sync) {
                this.f10433q.run();
            } else {
                this.f10432k.execute(this.f10433q);
            }
        }

        /* JADX INFO: renamed from: q */
        public void m7237q(long delayMilliseconds) {
            this.f57815toq.postDelayed(new toq(), delayMilliseconds);
        }

        public void zy(boolean sync) {
            toq(sync);
        }
    }

    static {
        String strLd6 = C7083n.ld6(bf2.zy.oaex + f10421k);
        f10426q = strLd6;
        f10423n = strLd6 + InterfaceC1789q.ef;
        f10416f = new Object();
        f10415e = new HashMap();
        f10420j = new zy();
        f10424o = new String[]{f10428s, f10425p, f10418h, f10419i, f10431z, f10429t, f10427r};
    }

    public static void a9() {
        m7226h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void cdj(Map map, Set set, String str, String str2) {
        String str3 = (String) map.get(str2);
        if (str3 != null) {
            set.add(str3);
        } else {
            if (!str2.startsWith(str) || str2.length() <= str.length()) {
                return;
            }
            set.add(str2.substring(str.length()));
        }
    }

    public static void f7l8(String resourceCode) {
        synchronized (f10416f) {
            Map<String, String> mapQrj = qrj();
            for (String str : f10424o) {
                mapQrj.put(str + resourceCode, f10430y);
            }
        }
        fti();
    }

    public static String fn3e(String resourceCode) {
        String str = qrj().get(f10429t + resourceCode);
        if (str == null) {
            str = n7h().get(f10429t + resourceCode);
        }
        if (f10430y.equals(str)) {
            return null;
        }
        return str;
    }

    private static void fti() {
        f10420j.m7237q(5000L);
    }

    public static String fu4(String resourceCode) {
        String str = qrj().get(f10431z + resourceCode);
        if (str == null) {
            str = n7h().get(f10431z + resourceCode);
        }
        if (f10430y.equals(str)) {
            return null;
        }
        return str;
    }

    private static void gvn7(final Map<String, String> runtimeDataMirror) throws Throwable {
        C1831y.zy(runtimeDataMirror, f10423n);
    }

    /* JADX INFO: renamed from: h */
    private static void m7226h() {
        synchronized (f10416f) {
            kja0();
            qrj().clear();
            n7h().clear();
            n7h().putAll(ki());
        }
    }

    /* JADX INFO: renamed from: i */
    private static Set<String> m7227i(@zy.lvui Map<String, String> runtimeData) {
        int i2;
        HashSet hashSet = new HashSet();
        Iterator it = new HashSet(runtimeData.keySet()).iterator();
        while (it.hasNext()) {
            hashSet.add(((String) it.next()).split("-")[1]);
        }
        for (String str : new HashSet(n7h().keySet())) {
            int iIndexOf = str.indexOf("-");
            if (iIndexOf != -1 && (i2 = iIndexOf + 1) < str.length()) {
                hashSet.add(str.substring(i2));
            }
        }
        return hashSet;
    }

    private static void jk(String resourceCode, String metaPath, String runtimeRightsPath, String localId, String name, String hash, String onlineId) {
        synchronized (f10416f) {
            Map<String, String> mapQrj = qrj();
            if (metaPath != null) {
                mapQrj.put(f10428s + resourceCode, metaPath);
            }
            if (runtimeRightsPath != null) {
                mapQrj.put(f10425p + resourceCode, runtimeRightsPath);
            }
            if (localId != null) {
                mapQrj.put(f10418h + resourceCode, localId);
            }
            if (name != null) {
                mapQrj.put(f10431z + resourceCode, name);
            }
            if (hash != null) {
                mapQrj.put(f10429t + resourceCode, hash);
            }
            if (onlineId != null) {
                mapQrj.put(f10419i + resourceCode, onlineId);
            }
            mapQrj.put(f10427r + resourceCode, Long.toString(System.currentTimeMillis()));
        }
    }

    public static void jp0y(String resourceCode, String metaPath, String runtimeRightsPath, String localId, String name, String hash, String onlineId) {
        if (TextUtils.isEmpty(resourceCode)) {
            return;
        }
        n7h();
        Set<String> set = InterfaceC1789q.c1f;
        if (set.contains(resourceCode)) {
            for (String str : set) {
                if (str.equals(resourceCode)) {
                    jk(str, metaPath, runtimeRightsPath, localId, name, hash, onlineId);
                } else {
                    f7l8(str);
                }
            }
        } else {
            jk(resourceCode, metaPath, runtimeRightsPath, localId, name, hash, onlineId);
        }
        ld6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> ki() {
        return C1831y.toq(f10423n, true);
    }

    private static void kja0() {
        File file = new File(f10423n);
        File file2 = new File(InterfaceC1789q.p1);
        File file3 = new File(InterfaceC1789q.uey);
        if (file.exists() || file3.exists() || !file2.exists()) {
            return;
        }
        file.getParentFile().mkdir();
        C7083n.zy(file2, file);
    }

    private static void ld6() {
        f10420j.zy(false);
    }

    private static Set<String> mcp(String[] paths) {
        if (paths == null || paths.length < 1) {
            return null;
        }
        final HashMap map = new HashMap(20);
        map.put(InterfaceC1789q.ioq6, InterfaceC1789q.yb3p);
        map.put(InterfaceC1789q.bt9, "fonts");
        map.put(InterfaceC1789q.mz, "framework");
        map.put(InterfaceC1789q.y3rt, "launcher");
        map.put(InterfaceC1789q.re, InterfaceC1789q.gx2z);
        map.put(InterfaceC1789q.so0v, "mms");
        map.put(InterfaceC1789q.ci1g, com.android.thememanager.basemodule.analysis.toq.mle);
        map.put(InterfaceC1789q.kus, InterfaceC1789q.qwyf);
        final HashSet hashSet = new HashSet(paths.length);
        final String str = bf2.zy.oaex;
        Arrays.stream(paths).forEach(new Consumer() { // from class: com.android.thememanager.basemodule.utils.uv6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                vyq.cdj(map, hashSet, str, (String) obj);
            }
        });
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> n7h() {
        if (f10414c == null) {
            synchronized (f10416f) {
                if (f10414c == null) {
                    f10414c = new HashMap();
                    m7226h();
                }
            }
        }
        return f10414c;
    }

    public static String ni7(String resourceCode) {
        String str = qrj().get(f10428s + resourceCode);
        if (str == null) {
            str = n7h().get(f10428s + resourceCode);
        }
        if (f10430y.equals(str)) {
            return null;
        }
        return str;
    }

    public static String o1t(String resourceCode) {
        String str = qrj().get(f10425p + resourceCode);
        if (str == null) {
            str = n7h().get(f10425p + resourceCode);
        }
        if (f10430y.equals(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: p */
    public static void m7230p() {
        f10420j.zy(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> qrj() {
        return f10415e;
    }

    /* JADX INFO: renamed from: s */
    public static void m7232s(String[] paths) {
        Set<String> setMcp = mcp(paths);
        if (setMcp == null || setMcp.size() == 0) {
            synchronized (f10416f) {
                Map<String, String> mapQrj = qrj();
                Iterator<String> it = mapQrj.keySet().iterator();
                while (it.hasNext()) {
                    mapQrj.put(it.next(), f10430y);
                }
                Iterator<String> it2 = n7h().keySet().iterator();
                while (it2.hasNext()) {
                    mapQrj.put(it2.next(), f10430y);
                }
            }
        } else {
            synchronized (f10416f) {
                Map<String, String> mapQrj2 = qrj();
                for (String str : setMcp) {
                    for (String str2 : f10424o) {
                        mapQrj2.put(str2 + str, f10430y);
                    }
                }
            }
        }
        fti();
    }

    @zy.y9n
    /* JADX INFO: renamed from: t */
    public static void m7233t(@zy.dd String priorRuntimeDataPath, @zy.dd Set<String> includeCodeSet, @zy.dd Set<String> ignoreCodeSet) {
        if (TextUtils.isEmpty(priorRuntimeDataPath)) {
            return;
        }
        Map<String, String> qVar = C1831y.toq(priorRuntimeDataPath, true);
        if (kja0.qrj(includeCodeSet)) {
            includeCodeSet = m7227i(qVar);
        }
        for (String str : includeCodeSet) {
            if (ignoreCodeSet == null || !ignoreCodeSet.contains(str)) {
                jp0y(str, qVar.get(f10428s + str), qVar.get(f10425p + str), qVar.get(f10418h + str), qVar.get(f10431z + str), qVar.get(f10429t + str), qVar.get(f10419i + str));
            }
        }
    }

    public static Set<String> t8r() {
        return m7227i(qrj());
    }

    public static long wvg(String resourceCode) {
        try {
            String str = qrj().get(f10427r + resourceCode);
            if (str == null) {
                str = n7h().get(f10427r + resourceCode);
            }
            if (f10430y.equals(str)) {
                str = null;
            }
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void x2() throws Throwable {
        HashMap map = new HashMap();
        synchronized (f10416f) {
            map.putAll(n7h());
        }
        gvn7(map);
    }

    /* JADX INFO: renamed from: y */
    public static void m7234y(Set<String> excludeCodes) {
        HashSet hashSet = new HashSet();
        if (excludeCodes != null) {
            for (String str : excludeCodes) {
                for (String str2 : f10424o) {
                    hashSet.add(str2 + str);
                }
            }
        }
        synchronized (f10416f) {
            Map<String, String> mapQrj = qrj();
            for (String str3 : mapQrj.keySet()) {
                if (!hashSet.contains(str3)) {
                    mapQrj.put(str3, f10430y);
                }
            }
            for (String str4 : n7h().keySet()) {
                if (!hashSet.contains(str4)) {
                    mapQrj.put(str4, f10430y);
                }
            }
        }
        fti();
    }

    /* JADX INFO: renamed from: z */
    public static String m7235z(String resourceCode) {
        String str = qrj().get(f10419i + resourceCode);
        if (str == null) {
            str = n7h().get(f10419i + resourceCode);
        }
        if (f10430y.equals(str)) {
            return null;
        }
        return str;
    }

    public static String zurt(String resourceCode) {
        String str = qrj().get(f10418h + resourceCode);
        if (str == null) {
            str = n7h().get(f10418h + resourceCode);
        }
        if (f10430y.equals(str)) {
            return null;
        }
        return str;
    }
}
