package com.android.thememanager.detail.theme.util;

import android.text.TextUtils;
import ch.zy;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.local.InterfaceC1755y;
import com.android.thememanager.basemodule.local.ld6;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.detail.theme.model.AnonymousConfig;
import com.google.gson.C4871g;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.detail.theme.util.k */
/* JADX INFO: compiled from: AnonymousUseManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1976k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static C1976k f58014f7l8 = null;

    /* JADX INFO: renamed from: g */
    private static final String f11183g = "anonymous_use_resources";

    /* JADX INFO: renamed from: n */
    public static final int f11184n = 10;

    /* JADX INFO: renamed from: q */
    public static final Map<String, Integer> f11185q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final List<String> f58015toq = Arrays.asList("THEME", "FONT", "AOD", InterfaceC1789q.e1v);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final List<String> f58016zy = Arrays.asList("com.miui.personalassistant", InterfaceC1789q.k9);

    /* JADX INFO: renamed from: k */
    private zy f11186k;

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.util.k$k */
    /* JADX INFO: compiled from: AnonymousUseManager.java */
    class k implements InterfaceC1755y {
        k() {
        }

        @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
        public void handleDownloadComplete(String downloadPath, String taskId, String extraData, boolean downloadSuccess, int downloadFailCode, String... extras) {
            if (TextUtils.isEmpty(taskId) || TextUtils.isEmpty(extraData) || C1976k.f58016zy.contains(extraData)) {
                return;
            }
            String strFu4 = p001b.toq.fu4(extraData);
            if (downloadSuccess || !C1976k.f58015toq.contains(strFu4) || C1688q.cdj().o1t()) {
                return;
            }
            C1976k.this.qrj(taskId);
        }

        @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
        public void handleDownloadProgressUpdate(String downloadPath, String taskId, String extraData, int currBytes, int totalBytes) {
        }

        @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
        public void handleDownloadStatusChange(String downloadPath, String taskId, String extraData, ld6.EnumC1748q currStatus, int currBytes, int totalBytes) {
            if (TextUtils.isEmpty(taskId) || TextUtils.isEmpty(extraData) || C1976k.f58016zy.contains(extraData)) {
                return;
            }
            String strFu4 = p001b.toq.fu4(extraData);
            if (C1976k.f58015toq.contains(strFu4) && !C1688q.cdj().o1t() && ld6.EnumC1748q.STATUS_WAITING.equals(ld6.t8r().m6824h(taskId))) {
                C1976k.this.m7739n(taskId, strFu4);
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f11185q = map;
        map.put("THEME", Integer.valueOf(R.plurals.anonymous_resource_count_theme));
        map.put("FONT", Integer.valueOf(R.plurals.anonymous_resource_count_font));
        map.put("AOD", Integer.valueOf(R.plurals.anonymous_resource_count_aod));
        map.put(InterfaceC1789q.e1v, Integer.valueOf(R.plurals.anonymous_resource_count_icon));
    }

    private C1976k() {
        C2320q.m8478g(new k());
    }

    @lvui
    private zy f7l8() {
        if (this.f11186k == null) {
            synchronized (this) {
                if (this.f11186k == null) {
                    this.f11186k = new zy(bf2.toq.toq().getFilesDir() + File.separator + f11183g);
                }
            }
        }
        return this.f11186k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m7739n(@dd String productId, @dd String productType) {
        m7740q(productId, new AnonymousConfig(productType, true));
    }

    /* JADX INFO: renamed from: q */
    private void m7740q(@dd String productId, @dd AnonymousConfig config) {
        if (TextUtils.isEmpty(productId) || config == null || !f58015toq.contains(config.productType)) {
            return;
        }
        f7l8().putString(productId, new C4871g().o1t(config)).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qrj(@dd String productId) {
        if (TextUtils.isEmpty(productId)) {
            return;
        }
        f7l8().remove(productId).apply();
    }

    /* JADX INFO: renamed from: y */
    public static C1976k m7741y() {
        if (f58014f7l8 == null) {
            synchronized (C1976k.class) {
                if (f58014f7l8 == null) {
                    f58014f7l8 = new C1976k();
                }
            }
        }
        return f58014f7l8;
    }

    /* JADX INFO: renamed from: g */
    public void m7742g(@dd List<String> excludeIds) {
        if (kja0.qrj(excludeIds)) {
            new File(bf2.toq.toq().getFilesDir() + File.separator + f11183g).delete();
            this.f11186k = null;
            return;
        }
        Iterator<String> itKeySet = f7l8().keySet();
        if (itKeySet == null) {
            return;
        }
        while (itKeySet.hasNext()) {
            if (!excludeIds.contains(itKeySet.next())) {
                itKeySet.remove();
            }
        }
    }

    @lvui
    public Map<String, String> ld6() {
        zy zyVarF7l8 = f7l8();
        HashMap map = new HashMap();
        Iterator<String> itKeySet = zyVarF7l8.keySet();
        if (itKeySet == null) {
            return map;
        }
        while (itKeySet.hasNext()) {
            String next = itKeySet.next();
            String string = zyVarF7l8.getString(next, null);
            if (TextUtils.isEmpty(string)) {
                zyVarF7l8.remove(next).apply();
            } else {
                AnonymousConfig anonymousConfig = (AnonymousConfig) new C4871g().n7h(string, AnonymousConfig.class);
                if (anonymousConfig.replenish) {
                    map.put(next, anonymousConfig.productType);
                }
            }
        }
        return map;
    }

    public void n7h(@dd String productId, boolean replenish) {
        if (TextUtils.isEmpty(productId)) {
            return;
        }
        zy zyVarF7l8 = f7l8();
        if (zyVarF7l8.contains(productId)) {
            String string = zyVarF7l8.getString(productId, null);
            if (TextUtils.isEmpty(string)) {
                zyVarF7l8.remove(productId).apply();
                return;
            }
            AnonymousConfig anonymousConfig = (AnonymousConfig) new C4871g().n7h(string, AnonymousConfig.class);
            anonymousConfig.replenish = replenish;
            m7740q(productId, anonymousConfig);
        }
    }

    @lvui
    /* JADX INFO: renamed from: p */
    public Map<String, Integer> m7743p() {
        zy zyVarF7l8 = f7l8();
        HashMap map = new HashMap();
        Iterator<String> itKeySet = zyVarF7l8.keySet();
        if (itKeySet == null) {
            return map;
        }
        while (itKeySet.hasNext()) {
            AnonymousConfig anonymousConfig = (AnonymousConfig) new C4871g().n7h(zyVarF7l8.getString(itKeySet.next(), null), AnonymousConfig.class);
            if (anonymousConfig.replenish) {
                if (map.containsKey(anonymousConfig.productType)) {
                    String str = anonymousConfig.productType;
                    map.put(str, Integer.valueOf(((Integer) map.get(str)).intValue() + 1));
                } else {
                    map.put(anonymousConfig.productType, 1);
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: s */
    public int m7744s() {
        zy zyVarF7l8 = f7l8();
        Iterator<String> itKeySet = zyVarF7l8.keySet();
        int i2 = 0;
        if (itKeySet == null) {
            return 0;
        }
        while (itKeySet.hasNext()) {
            if (((AnonymousConfig) new C4871g().n7h(zyVarF7l8.getString(itKeySet.next(), null), AnonymousConfig.class)).replenish) {
                i2++;
            }
        }
        return i2;
    }

    public int x2() {
        return f7l8().size();
    }
}
