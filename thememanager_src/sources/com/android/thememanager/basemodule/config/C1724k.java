package com.android.thememanager.basemodule.config;

import android.text.TextUtils;
import com.android.thememanager.basemodule.config.model.Config;
import com.android.thememanager.basemodule.network.theme.AbstractC1777n;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.util.d8wk;
import com.google.gson.C4871g;
import com.google.gson.qrj;
import com.google.gson.stream.C4924k;
import com.google.gson.zurt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import miuix.core.util.C7083n;
import yz.C7794k;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.config.k */
/* JADX INFO: compiled from: ConfigManager.java */
/* JADX INFO: loaded from: classes.dex */
public class C1724k {

    /* JADX INFO: renamed from: n */
    private static volatile C1724k f9886n = null;

    /* JADX INFO: renamed from: q */
    private static final String f9887q = bf2.toq.toq().getFilesDir() + "/config.json";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f57510zy = "k";

    /* JADX INFO: renamed from: k */
    private Config f9888k = m6725y();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Config f57511toq;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.config.k$k */
    /* JADX INFO: compiled from: ConfigManager.java */
    class k extends AbstractC1777n<Config> {
        k() {
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onResponse(@lvui Config response) {
            try {
                C7083n.kja0(C1724k.f9887q, new C4871g().o1t(response));
                C1724k c1724k = C1724k.this;
                c1724k.f57511toq = c1724k.m6725y();
                C7794k.m28195n(C1724k.f57510zy, "main_tab_sort: " + C1724k.this.f57511toq.main_tab_sort);
            } catch (IOException e2) {
                C7794k.m28195n(C1724k.f57510zy, "Write config error: " + e2);
            }
        }
    }

    private C1724k() {
    }

    /* JADX INFO: renamed from: p */
    public static C1724k m6723p() {
        if (f9886n == null) {
            synchronized (C1724k.class) {
                if (f9886n == null) {
                    f9886n = new C1724k();
                }
            }
        }
        return f9886n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public Config m6725y() {
        File file = new File(f9887q);
        if (file.exists()) {
            try {
                Config config = (Config) new C4871g().ld6(new C4924k(new FileReader(file)), Config.class);
                if (config != null) {
                    return config;
                }
                p001b.toq.o1t(null, "json convert config failed");
            } catch (qrj | zurt | FileNotFoundException e2) {
                C7794k.m28195n(f57510zy, "Read config error: " + e2);
            }
        }
        return m6727s();
    }

    @Deprecated
    public Config f7l8() {
        return x2();
    }

    /* JADX INFO: renamed from: g */
    public void m6726g() {
        d8wk.x2(f9887q);
        this.f9888k = m6727s();
    }

    public Config ld6() {
        Config config = this.f57511toq;
        return config != null ? config : this.f9888k;
    }

    public void n7h() {
        ((toq) f7l8.m6882h().qrj(toq.class)).m6729k().mo27954p(new k());
    }

    public Map<String, String> qrj(Map<String, String> map) {
        Config config;
        Config.AbTestResult abTestResult;
        if (map != null && (config = this.f9888k) != null && (abTestResult = config.abTest_result) != null && !TextUtils.isEmpty(abTestResult.main_tab_sort)) {
            map.put(com.android.thememanager.basemodule.analysis.toq.y84, com.android.thememanager.basemodule.analysis.toq.yuzy + this.f9888k.abTest_result.main_tab_sort);
        }
        return map;
    }

    /* JADX INFO: renamed from: s */
    public Config m6727s() {
        return new Config();
    }

    public Config x2() {
        return this.f9888k;
    }
}
