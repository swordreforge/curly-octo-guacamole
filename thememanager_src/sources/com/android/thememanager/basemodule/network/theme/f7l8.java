package com.android.thememanager.basemodule.network.theme;

import android.net.Uri;
import android.text.TextUtils;
import com.android.thememanager.baselib.network.AbstractC1683k;
import com.android.thememanager.basemodule.network.theme.interceptors.C1771g;
import com.android.thememanager.basemodule.network.theme.interceptors.C1772k;
import com.android.thememanager.basemodule.network.theme.interceptors.C1773n;
import com.android.thememanager.basemodule.network.theme.interceptors.C1774q;
import com.android.thememanager.basemodule.utils.C1808h;
import com.xiaomi.onetrack.api.C5693g;
import ek5k.C6002g;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import okhttp3.C7529t;
import okhttp3.logging.C7516k;
import retrofit2.converter.gson.C7632k;
import yz.C7794k;
import zy.dd;

/* JADX INFO: compiled from: ThemeNetworkManager.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 extends AbstractC1683k {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final String f57582cdj = "Cache-Control: no-store";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f57583f7l8 = 820;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final String f57584fn3e = "request_flag:17";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final String f57585fu4 = "request_analytics_flag:";

    /* JADX INFO: renamed from: g */
    public static final int f10065g = 821;

    /* JADX INFO: renamed from: h */
    public static final String f10066h = "Cache-Control: public, max-age=86400";

    /* JADX INFO: renamed from: i */
    public static final String f10067i = "request_flag:31";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final String f57586ki = "request_flag";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f57587kja0 = "Cache-Control: public, max-age=3600";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f57588ld6 = 8;

    /* JADX INFO: renamed from: n */
    private static volatile f7l8 f10068n = null;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final String f57589n7h = "Cache-Control: public, max-age=60";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final String f57590ni7 = "request_analytics_flag";

    /* JADX INFO: renamed from: p */
    public static final int f10069p = 4;

    /* JADX INFO: renamed from: q */
    private static final String f10070q = "ThemeNetworkManager";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f57591qrj = 0;

    /* JADX INFO: renamed from: s */
    public static final int f10071s = 2;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final String f57592t8r = "request_flag:15";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f57593x2 = 16;

    /* JADX INFO: renamed from: y */
    public static final int f10072y = 1;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final String f57594zurt = "request_flag:1";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private okhttp3.zy f57595zy;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.network.theme.f7l8$k */
    /* JADX INFO: compiled from: ThemeNetworkManager.java */
    class RunnableC1769k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Uri f10073k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ boolean f10075q;

        RunnableC1769k(final Uri val$callUri, final boolean val$ignoreParam) {
            this.f10073k = val$callUri;
            this.f10075q = val$ignoreParam;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Iterator<String> itG1 = f7l8.this.f57595zy.g1();
                while (itG1.hasNext()) {
                    Uri uri = Uri.parse(itG1.next());
                    if (f7l8.this.kja0(this.f10073k.getScheme(), uri.getScheme()) && f7l8.this.kja0(this.f10073k.getHost(), uri.getHost()) && f7l8.this.kja0(this.f10073k.getPath(), uri.getPath())) {
                        Set<String> queryParameterNames = this.f10073k.getQueryParameterNames();
                        boolean z2 = false;
                        if (!this.f10075q && queryParameterNames != null && queryParameterNames.size() > 0) {
                            Iterator<String> it = queryParameterNames.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (!f7l8.this.kja0(this.f10073k.getQueryParameter(next), uri.getQueryParameter(next))) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        if (!z2) {
                            C7794k.m28194k(f7l8.f10070q, "removeCache bingo");
                            itG1.remove();
                        }
                    }
                }
            } catch (Exception e2) {
                C7794k.zy(f7l8.f10070q, "removeCache", e2);
            }
        }
    }

    public static String cdj() {
        return bf2.toq.zy() == 1 ? "http://dev.market.n.xiaomi.com/thm/" : bf2.toq.zy() == 2 ? "http://preview.market.n.xiaomi.com/thm/" : bf2.toq.zy() == 3 ? "http://staging4qa.market.n.xiaomi.com/thm/" : "https://thm.market.xiaomi.com/thm/";
    }

    /* JADX INFO: renamed from: h */
    public static f7l8 m6882h() {
        if (f10068n == null) {
            synchronized (f7l8.class) {
                if (f10068n == null) {
                    f10068n = new f7l8();
                }
            }
        }
        return f10068n;
    }

    public static String ki() {
        return bf2.toq.zy() == 1 ? "http://dev.api.zhuti.n.xiaomi.com/app/v9/" : bf2.toq.zy() == 2 ? "http://preview.api.zhuti.n.xiaomi.com/app/v9/" : bf2.toq.zy() == 3 ? "http://staging4qa.api.zhuti.n.xiaomi.com/app/v9/" : "https://api.zhuti.xiaomi.com/app/v9/";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean kja0(String call, String cache) {
        if (TextUtils.isEmpty(call) && TextUtils.isEmpty(cache)) {
            return true;
        }
        return !TextUtils.isEmpty(call) && call.equals(cache);
    }

    @Override // com.android.thememanager.baselib.network.AbstractC1683k
    /* JADX INFO: renamed from: g */
    protected String mo6569g() {
        return cdj();
    }

    @Override // com.android.thememanager.baselib.network.AbstractC1683k
    /* JADX INFO: renamed from: k */
    protected C7529t mo6570k() {
        new C7516k().m27363y(C7516k.k.BODY);
        this.f57595zy = new okhttp3.zy(new File(bf2.toq.toq().getCacheDir(), C5693g.f31766H), 10485760L);
        C7529t.k kVar = new C7529t.k();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return kVar.ld6(10L, timeUnit).bf2(30L, timeUnit).ltg8(30L, timeUnit).zy(new com.android.thememanager.basemodule.network.theme.interceptors.f7l8()).zy(new C1771g()).zy(new com.android.thememanager.basemodule.network.theme.interceptors.toq()).zy(new C1774q()).m27460q(new C1772k()).m27460q(new com.android.thememanager.basemodule.network.theme.interceptors.zy()).f7l8(this.f57595zy).m27460q(new C1773n()).m27450g();
    }

    public void ld6(Uri callUri, boolean ignoreParam) {
        C7794k.m28194k(f10070q, "removeCache cur call= " + callUri);
        C6002g.m22240g(new RunnableC1769k(callUri, ignoreParam));
    }

    public <T> T n7h(Class<T> cls, Executor executor) {
        return (T) m6572q(cls, ki(), executor);
    }

    public <T> T qrj(Class<T> cls) {
        return (T) zy(cls, ki());
    }

    public void x2(@dd retrofit2.toq call, boolean ignoreParam) {
        if (call == null || call.zy() == null || call.zy().cdj() == null) {
            return;
        }
        ld6(Uri.parse(call.zy().cdj().toString()), ignoreParam);
    }

    @Override // com.android.thememanager.baselib.network.AbstractC1683k
    /* JADX INFO: renamed from: y */
    protected C7632k mo6573y() {
        return C7632k.f7l8(C1808h.m7086k());
    }
}
