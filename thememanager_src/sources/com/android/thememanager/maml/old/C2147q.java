package com.android.thememanager.maml.old;

import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Point;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.C1922n;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.ld6;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.maml.InterfaceC2148q;
import com.android.thememanager.maml.model.db.C2139k;
import com.android.thememanager.util.d8wk;
import com.android.thememanager.util.g1;
import com.miui.maml.folme.AnimatedProperty;
import d8wk.C5991k;
import ek5k.C6002g;
import g1.C6047k;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import miui.content.res.ThemeNativeUtils;
import miuix.core.util.f7l8;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.maml.old.q */
/* JADX INFO: compiled from: WallpaperRecommendDataProducer.java */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C2147q implements InterfaceC2148q, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: c */
    private static final int f12624c;

    /* JADX INFO: renamed from: e */
    private static final int f12625e = 1;

    /* JADX INFO: renamed from: f */
    private static final ThreadPoolExecutor f12626f;

    /* JADX INFO: renamed from: g */
    private static final String f12627g = "WallpaperRecommend";

    /* JADX INFO: renamed from: h */
    private static final String f12628h = "click_like";

    /* JADX INFO: renamed from: i */
    private static final String f12629i = "action";

    /* JADX INFO: renamed from: j */
    private static final int f12630j;

    /* JADX INFO: renamed from: l */
    private static final String f12631l = "time";

    /* JADX INFO: renamed from: m */
    private static final int f12632m = 15;

    /* JADX INFO: renamed from: n */
    private static final String f12633n = ".wallpaperRecommend";

    /* JADX INFO: renamed from: o */
    private static final int f12634o = 30;

    /* JADX INFO: renamed from: p */
    private static final String f12635p = "click";

    /* JADX INFO: renamed from: q */
    public static final String f12636q = "wallpaperRecommend";

    /* JADX INFO: renamed from: r */
    private static final String f12637r = "show_type";

    /* JADX INFO: renamed from: s */
    private static final String f12638s = "news_info_id";

    /* JADX INFO: renamed from: t */
    private static final String f12639t = "duration";

    /* JADX INFO: renamed from: y */
    private static final String f12640y;

    /* JADX INFO: renamed from: z */
    private static final String f12641z = "exposure_id";

    /* JADX INFO: renamed from: k */
    private C2139k f12642k = C2139k.m8177k();

    /* JADX INFO: renamed from: com.android.thememanager.maml.old.q$k */
    /* JADX INFO: compiled from: WallpaperRecommendDataProducer.java */
    class k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f12643k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f12645q;

        k(final String val$imageOnlineUrl, final String val$imagePath) {
            this.f12643k = val$imageOnlineUrl;
            this.f12645q = val$imagePath;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2147q.this.m8187i(this.f12643k, this.f12645q);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.maml.old.q$toq */
    /* JADX INFO: compiled from: WallpaperRecommendDataProducer.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f12646k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f12648q;

        toq(final String val$imageOnlineUrl, final String val$imagePath) {
            this.f12646k = val$imageOnlineUrl;
            this.f12648q = val$imagePath;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2147q.this.m8187i(this.f12646k, this.f12648q);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f12624c = iAvailableProcessors;
        f12630j = iAvailableProcessors;
        f12640y = C1788k.f10175k + f12633n + File.separator;
        f12626f = new ThreadPoolExecutor(1, iAvailableProcessors, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m8186h(int i2, Uri uri) throws Throwable {
        kja0(i2, null, uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m8187i(String imageUrl, String fileName) {
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
                Log.e(f12627g, "download image failed " + e2);
                d8wk.x2(fileName);
            }
        } finally {
            f7l8.toq(inputStream);
        }
    }

    private void ki(C5991k news) {
        String str = f12640y + news.ImgId;
        String strQrj = qrj(news);
        f12626f.submit(new toq(strQrj, str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("_title", news.Title);
        contentValues.put("_content", news.Content);
        contentValues.put("_image", str);
        contentValues.put("_imgId", news.ImgId);
        contentValues.put("_detail", news.UrlDetailName);
        contentValues.put("_url", news.UrlClick);
        contentValues.put("_cmUrl", news.CmUrl);
        contentValues.put("_tvmUrl", news.TvmUrl);
        contentValues.put("_likeUrl", news.LikeUrl);
        contentValues.put("_dislikeUrl", news.DislikeUrl);
        contentValues.put(C6047k.FAVORITE_URL, news.FavoriteUrl);
        contentValues.put(C6047k.SHARE_URL, news.ShareUrl);
        contentValues.put("_version", (Long) 2L);
        contentValues.put("_image_online_url", strQrj);
        this.f12642k.getWritableDatabase().insert(C2139k.f12599g, null, contentValues);
    }

    private Cursor ld6(int id) {
        return this.f12642k.getWritableDatabase().query(C2139k.f12599g, null, "_id = ?", new String[]{String.valueOf(id)}, null, null, "_id");
    }

    private static String n7h() {
        Point pointFn3e = y9n.fn3e();
        int i2 = pointFn3e.x;
        int i3 = pointFn3e.y;
        return (i2 != 1080 || i3 <= 2040 || i3 > 2280) ? (i2 != 1080 || i3 <= 2280) ? String.format("%s*%s", String.valueOf(i2), String.valueOf(i3)) : "1080*2340" : "1080*2160";
    }

    /* JADX INFO: renamed from: p */
    private static String m8189p() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) C2082k.m7998k().getSystemService("window");
        if (windowManager == null) {
            return "xxh";
        }
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.densityDpi;
        return i2 != 240 ? i2 != 320 ? i2 != 640 ? "xxh" : "xxxh" : "xh" : AnimatedProperty.PROPERTY_NAME_H;
    }

    private String qrj(C5991k news) {
        String strN7h = n7h();
        for (C5991k.k kVar : news.ImgUrlList) {
            if (kVar.size.equals(strN7h)) {
                return kVar.url;
            }
        }
        return news.ImgUrl;
    }

    /* JADX INFO: renamed from: s */
    private void m8191s(Cursor cursor) {
        if (cursor != null) {
            while (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndex("_image"));
                if (!TextUtils.isEmpty(string) && !new File(string).exists()) {
                    f12626f.submit(new k(cursor.getString(cursor.getColumnIndex("_image_online_url")), string));
                }
            }
            cursor.moveToFirst();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t8r, reason: merged with bridge method [inline-methods] */
    public void cdj() {
        try {
            d8wk.zy zyVar = (d8wk.zy) com.android.thememanager.library.util.app.toq.toq(C1915g.f7l8(new zurt(String.format(Locale.getDefault(), InterfaceC1925p.xkj, "xiaomi_theme_v2", ld6.m7564e(), String.valueOf(System.currentTimeMillis()), m8189p(), "imei", 15))), d8wk.zy.class);
            if (zyVar == null) {
                Log.w(f12627g, "toutiao response is null");
                return;
            }
            List<C5991k> list = zyVar.NewsInfo;
            if (list != null) {
                Iterator<C5991k> it = list.iterator();
                while (it.hasNext()) {
                    ki(it.next());
                }
            } else {
                Log.w(f12627g, "newsList is null Status = " + zyVar.Status + " NewsNum = " + zyVar.NewsNum);
            }
        } catch (C1922n | IOException e2) {
            Log.e(f12627g, "requestData error " + e2);
        }
    }

    private Cursor x2(int id) {
        Cursor cursorQuery = this.f12642k.getWritableDatabase().query(C2139k.f12599g, null, "_id = ? OR _id = ? OR _id = ?", new String[]{String.valueOf(id - 1), String.valueOf(id), String.valueOf(id + 1)}, null, null, "_id");
        m8191s(cursorQuery);
        return cursorQuery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void kja0(int id, String action, Uri uri) throws Throwable {
        Cursor cursorLd6;
        try {
            cursorLd6 = ld6(id);
            try {
                if (cursorLd6.moveToNext()) {
                    String str = "_tvmUrl";
                    if (f12628h.equals(action)) {
                        str = "_likeUrl";
                    } else if (f12635p.equals(action)) {
                        str = "_cmUrl";
                    }
                    String string = cursorLd6.getString(cursorLd6.getColumnIndex(str));
                    if (!TextUtils.isEmpty(string)) {
                        zurt zurtVar = new zurt(string);
                        zurtVar.addParameter("time", String.valueOf((int) (System.currentTimeMillis() / 1000)));
                        if (!f12628h.equals(action)) {
                            if (!f12635p.equals(action)) {
                                if (uri != null) {
                                    String queryParameter = uri.getQueryParameter("duration");
                                    String queryParameter2 = uri.getQueryParameter(f12637r);
                                    zurtVar.addParameter("duration", queryParameter);
                                    zurtVar.addParameter(f12637r, queryParameter2);
                                }
                                zurtVar.addParameter("category", com.android.thememanager.basemodule.analysis.toq.c3sl);
                            } else if (uri != null) {
                                zurtVar.addParameter("duration", uri.getQueryParameter("duration"));
                            }
                        }
                        try {
                            C1915g.f7l8(zurtVar);
                        } catch (C1922n | IOException e2) {
                            Log.e(f12627g, "requestData error " + e2);
                        }
                    }
                }
                f7l8.m25531k(cursorLd6);
            } catch (Throwable th) {
                th = th;
                f7l8.m25531k(cursorLd6);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cursorLd6 = null;
        }
    }

    @Override // com.android.thememanager.maml.InterfaceC2148q
    public String toq(@lvui Uri uri) {
        return "vnd.android.cursor.dir/api-wallpaper-recommend";
    }

    @Override // com.android.thememanager.maml.InterfaceC2148q
    public Cursor zy(@lvui Uri uri, @dd String[] projection, @dd String selection, @dd String[] selectionArgs, @dd String sortOrder) throws Throwable {
        String path = uri.getPath();
        String str = f12636q + File.separator;
        String strSubstring = path.substring(path.indexOf(str) + str.length());
        String str2 = f12640y;
        if (!new File(str2).exists()) {
            int iFu4 = y9n.fu4();
            if (iFu4 == -1) {
                Log.e(f12627g, "getThemeUid return -1");
            } else if (!C1821p.qrj(new File(str2), 509, iFu4, iFu4)) {
                Log.e(f12627g, "query mkdir fail");
            }
        }
        final int iIntValue = Integer.valueOf(strSubstring.replace('?', '/').split("/")[0]).intValue();
        final Uri uri2 = Uri.parse(strSubstring);
        final String queryParameter = uri2.getQueryParameter("action");
        Cursor cursor = null;
        try {
            Cursor cursorQuery = this.f12642k.getWritableDatabase().query(C2139k.f12599g, null, null, null, null, null, null);
            try {
                if (!f12628h.equals(queryParameter) && !f12635p.equals(queryParameter)) {
                    String queryParameter2 = uri2.getQueryParameter(f12641z);
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        final int iIntValue2 = Integer.valueOf(queryParameter2).intValue();
                        C6002g.x2().execute(new Runnable() { // from class: com.android.thememanager.maml.old.toq
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                this.f12649k.m8186h(iIntValue2, uri2);
                            }
                        });
                    }
                    int count = cursorQuery.getCount();
                    if (iIntValue == 0) {
                        iIntValue = g1.ki(f12638s);
                    } else {
                        g1.ikck(f12638s, iIntValue);
                    }
                    if (count - iIntValue < 6) {
                        if (count == 0) {
                            cdj();
                        } else {
                            C6002g.x2().execute(new Runnable() { // from class: com.android.thememanager.maml.old.zy
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f12652k.cdj();
                                }
                            });
                        }
                    }
                    Cursor cursorX2 = x2(iIntValue);
                    f7l8.m25531k(cursorQuery);
                    return cursorX2;
                }
                C6002g.x2().execute(new Runnable() { // from class: com.android.thememanager.maml.old.k
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f12621k.kja0(iIntValue, queryParameter, uri2);
                    }
                });
                f7l8.m25531k(cursorQuery);
                return null;
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                f7l8.m25531k(cursor);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
