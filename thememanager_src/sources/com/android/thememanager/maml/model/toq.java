package com.android.thememanager.maml.model;

import android.graphics.Point;
import android.util.Log;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.C1922n;
import com.android.thememanager.maml.model.network.request.C2141k;
import com.android.thememanager.util.C2789j;
import com.android.thememanager.util.d8wk;
import com.android.thememanager.util.g1;
import ek5k.C6002g;
import fnq8.InterfaceC6042k;
import ikck.zy;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import miui.content.res.ThemeNativeUtils;
import miuix.core.util.f7l8;
import tfm.C7674k;
import wo.C7733k;
import zy.lvui;
import zy.y9n;

/* JADX INFO: compiled from: InformationRepository.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq extends zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f60423f7l8 = "information_wallpaper_image_id";

    /* JADX INFO: renamed from: g */
    private static final String f12612g = "information_id";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f60424ld6 = 1;

    /* JADX INFO: renamed from: n */
    private static final String f12613n = ".wallpaperRecommendV2";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static ThreadPoolExecutor f60425n7h = null;

    /* JADX INFO: renamed from: p */
    private static final int f12614p;

    /* JADX INFO: renamed from: q */
    @Deprecated
    private static final String f12615q = ".wallpaperRecommend";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f60426qrj = 30;

    /* JADX INFO: renamed from: s */
    public static final String f12616s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f60427x2;

    /* JADX INFO: renamed from: y */
    @Deprecated
    public static final String f12617y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f60428zy = "toq";

    /* JADX INFO: renamed from: com.android.thememanager.maml.model.toq$k */
    /* JADX INFO: compiled from: InformationRepository.java */
    class RunnableC2144k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ File f12618k;

        RunnableC2144k(final File val$deprecatedFolder) {
            this.f12618k = val$deprecatedFolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                for (String str : this.f12618k.list()) {
                    new File(this.f12618k, str).delete();
                }
                this.f12618k.delete();
            } catch (Exception unused) {
            }
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f12614p = iAvailableProcessors;
        f60427x2 = iAvailableProcessors;
        StringBuilder sb = new StringBuilder();
        String str = C1788k.f10175k;
        sb.append(str);
        sb.append(f12613n);
        String str2 = File.separator;
        sb.append(str2);
        f12616s = sb.toString();
        f12617y = str + str2 + f12615q + str2;
    }

    public toq() {
        f60425n7h = new ThreadPoolExecutor(1, f60427x2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: cdj, reason: merged with bridge method [inline-methods] */
    public void n7h(String imageUrl, String fileName) {
        InputStream inputStream = null;
        try {
            try {
                File file = new File(fileName);
                if (!file.exists()) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(imageUrl).openConnection();
                    httpURLConnection.setConnectTimeout(6000);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setUseCaches(false);
                    inputStream = httpURLConnection.getInputStream();
                    C1821p.f7l8(inputStream, file);
                    ThemeNativeUtils.updateFilePermissionWithThemeContext(fileName);
                }
            } catch (IOException e2) {
                C2789j.x2(f60428zy, "download image failed " + e2, new Object[0]);
                d8wk.x2(fileName);
            }
        } finally {
            f7l8.toq(inputStream);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m8179h(@lvui C7733k informationResponse, @lvui InterfaceC6042k informationDao) {
        tfm.toq toqVar;
        List<C7674k> list;
        List<T> list2 = informationResponse.cards;
        if (list2 == 0 || list2.isEmpty() || (toqVar = (tfm.toq) list2.get(0)) == null || (list = toqVar.informationList) == null) {
            return;
        }
        Iterator<C7674k> it = list.iterator();
        while (it.hasNext()) {
            f7l8(it.next());
        }
        informationDao.mo22267g(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y9n
    private C7733k ld6(int pageNumber) {
        T t2;
        try {
            C2141k c2141k = new C2141k();
            c2141k.cardCount = Integer.valueOf(pageNumber);
            Point pointFn3e = com.android.thememanager.basemodule.utils.y9n.fn3e();
            c2141k.imageWidth = Integer.valueOf(pointFn3e.x);
            c2141k.imageHeight = Integer.valueOf(pointFn3e.y);
            CommonResponse commonResponse = (CommonResponse) com.android.thememanager.library.util.app.toq.zy(C1915g.f7l8(c2141k.getUrl()), CommonResponse.type(CommonResponse.class, C7733k.class));
            if (commonResponse == null || (t2 = commonResponse.apiData) == 0 || commonResponse.apiCode != 0) {
                return null;
            }
            return (C7733k) t2;
        } catch (C1922n e2) {
            e = e2;
            C2789j.qrj(f60428zy, e);
            return null;
        } catch (IOException e3) {
            e = e3;
            C2789j.qrj(f60428zy, e);
            return null;
        } catch (Exception e4) {
            C2789j.qrj(f60428zy, e4);
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m8181s() {
        File file = new File(f12617y);
        if (file.exists()) {
            C6002g.m22240g(new RunnableC2144k(file));
        }
    }

    public void f7l8(@lvui C7674k information) {
        m8182g(information.imageUrl, f12616s + information.imageId);
    }

    /* JADX INFO: renamed from: g */
    public void m8182g(final String onlineUrl, final String localPath) {
        f60425n7h.submit(new Runnable() { // from class: com.android.thememanager.maml.model.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f12605k.n7h(onlineUrl, localPath);
            }
        });
    }

    public void ki(int id) {
        g1.ikck(f12612g, id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tfm.zy kja0(@lvui String imageId, boolean isLike) {
        T t2;
        if (!C1688q.cdj().wvg()) {
            return null;
        }
        try {
            com.android.thememanager.maml.model.network.request.zy zyVar = new com.android.thememanager.maml.model.network.request.zy();
            zyVar.imageId = imageId;
            zyVar.isLike = isLike;
            CommonResponse commonResponse = (CommonResponse) com.android.thememanager.library.util.app.toq.zy(C1915g.f7l8(zyVar.getUrl()), CommonResponse.type(CommonResponse.class, wo.zy.class));
            if (commonResponse != null && (t2 = commonResponse.apiData) != 0 && commonResponse.apiCode == 0) {
                return (tfm.zy) t2;
            }
        } catch (C1922n e2) {
            e = e2;
            C2789j.qrj(f60428zy, e);
        } catch (IOException e3) {
            e = e3;
            C2789j.qrj(f60428zy, e);
        } catch (Exception e4) {
            C2789j.qrj(f60428zy, e4);
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public void m8183p(int pageNumber, @lvui InterfaceC6042k informationDao) {
        C7733k c7733kLd6 = ld6(pageNumber);
        if (c7733kLd6 != null) {
            m8179h(c7733kLd6, informationDao);
        }
    }

    public String qrj() {
        return g1.d3(f60423f7l8, null);
    }

    public void t8r(String imageId) {
        g1.qkj8(f60423f7l8, imageId);
    }

    public int x2() {
        int iKi = g1.ki(f12612g);
        if (iKi <= 0) {
            return 2;
        }
        return iKi;
    }

    /* JADX INFO: renamed from: y */
    public void m8184y() {
        String str = f12616s;
        if (new File(str).exists()) {
            return;
        }
        int iFu4 = com.android.thememanager.basemodule.utils.y9n.fu4();
        if (iFu4 == -1) {
            Log.e(f60428zy, "getThemeUid return -1");
        } else {
            if (C1821p.qrj(new File(str), 509, iFu4, iFu4)) {
                return;
            }
            Log.e(f60428zy, "checkFile mkdir fail");
        }
    }
}
