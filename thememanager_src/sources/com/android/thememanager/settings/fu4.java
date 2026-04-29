package com.android.thememanager.settings;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.C1922n;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.util.g1;
import com.android.thememanager.v9.model.factory.Cover;
import com.android.thememanager.v9.model.factory.WallpaperSetting;
import com.google.gson.C4871g;
import ek5k.C6002g;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONException;

/* JADX INFO: compiled from: WallpaperConfigManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class fu4 implements InterfaceC1925p {

    /* JADX INFO: renamed from: g */
    public static final int f15024g = 0;

    /* JADX INFO: renamed from: h */
    private static final String f15025h = "wallpaper-settings/config";

    /* JADX INFO: renamed from: i */
    private static final String f15026i = "res";

    /* JADX INFO: renamed from: l */
    private static final long f15027l = 3600000;

    /* JADX INFO: renamed from: p */
    private static final String f15028p = "wallpaper-settings/.temp";

    /* JADX INFO: renamed from: r */
    private static final String f15029r = "CONFIG_UDPATE_TIME_STAMP";

    /* JADX INFO: renamed from: s */
    private static final String f15030s = "WallpaperConfigManager";

    /* JADX INFO: renamed from: t */
    private static final String f15031t = "favorite.json";

    /* JADX INFO: renamed from: y */
    public static final int f15032y = 1;

    /* JADX INFO: renamed from: z */
    private static final String f15033z = "config.json";

    /* JADX INFO: renamed from: k */
    private File f15034k;

    /* JADX INFO: renamed from: n */
    private zy f15035n;

    /* JADX INFO: renamed from: q */
    private Context f15036q;

    /* JADX INFO: renamed from: f */
    private static final Object f15023f = new Object();

    /* JADX INFO: renamed from: c */
    private static fu4 f15022c = new fu4(C2082k.zy().toq());

    /* JADX INFO: compiled from: WallpaperConfigManager.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    /* JADX INFO: compiled from: WallpaperConfigManager.java */
    private class zy extends AsyncTask<Void, Void, Integer> {

        /* JADX INFO: renamed from: q */
        private static final int f15037q = 2;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final int f60783toq = 0;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final int f60784zy = 1;

        private zy() {
        }

        /* JADX INFO: renamed from: k */
        private boolean m9014k(Cover item) {
            return (TextUtils.isEmpty(item.uuid) || TextUtils.isEmpty(item.cover) || TextUtils.isEmpty(item.name)) ? false : true;
        }

        /* JADX INFO: renamed from: n */
        private boolean m9015n(CommonResponse<WallpaperSetting> wallpaperResponse, String path) throws Throwable {
            BufferedWriter bufferedWriter;
            File file = new File(path);
            String strO1t = new C4871g().o1t(wallpaperResponse);
            BufferedWriter bufferedWriter2 = null;
            try {
                try {
                    bufferedWriter = new BufferedWriter(new FileWriter(file));
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedWriter.write(strO1t);
                try {
                    bufferedWriter.close();
                } catch (IOException unused) {
                }
                return true;
            } catch (IOException e3) {
                e = e3;
                bufferedWriter2 = bufferedWriter;
                Log.d(fu4.f15030s, "Write file error! path :" + path + "  " + e);
                if (bufferedWriter2 == null) {
                    return false;
                }
                try {
                    bufferedWriter2.close();
                    return false;
                } catch (IOException unused2) {
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        }

        /* JADX INFO: renamed from: q */
        private boolean m9016q(CommonResponse<WallpaperSetting> wallpaperResponse) throws JSONException {
            boolean zRenameTo;
            String strM9008n = fu4.this.m9008n();
            String str = strM9008n + "/res";
            String str2 = strM9008n + "/" + fu4.f15033z;
            String strF7l8 = fu4.this.f7l8();
            String str3 = strF7l8 + "/res";
            ArrayList<Cover> arrayList = new ArrayList();
            for (Cover cover : wallpaperResponse.apiData.covers) {
                if (m9014k(cover)) {
                    arrayList.add(cover);
                }
            }
            if (arrayList.size() > 0) {
                for (Cover cover2 : arrayList) {
                    if (!new com.android.thememanager.controller.online.toq(UUID.randomUUID().toString()).toq(new com.android.thememanager.controller.online.zurt(cover2.cover), str + "/" + cover2.uuid)) {
                        return false;
                    }
                    cover2.cover = com.android.thememanager.h5.f7l8.f12010h + str3 + "/" + cover2.uuid;
                }
                if (m9015n(wallpaperResponse, str2)) {
                    synchronized (fu4.f15023f) {
                        C1821p.ki(strF7l8);
                        zRenameTo = new File(strM9008n).renameTo(new File(strF7l8));
                    }
                    return zRenameTo;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... params) {
            WallpaperSetting wallpaperSetting;
            try {
                int i2 = 0;
                CommonResponse<WallpaperSetting> commonResponse = (CommonResponse) new C4871g().kja0(C1915g.f7l8(com.android.thememanager.controller.online.ld6.ltg8()), CommonResponse.type(CommonResponse.class, WallpaperSetting.class));
                if (commonResponse == null || commonResponse.apiCode != 0 || (wallpaperSetting = commonResponse.apiData) == null || wallpaperSetting.covers == null || wallpaperSetting.covers.isEmpty()) {
                    Log.e(C2755a.f16307g, "get page response fail. error : ");
                    return 2;
                }
                boolean zM9016q = m9016q(commonResponse);
                C1821p.ki(fu4.this.m9008n());
                if (!zM9016q) {
                    i2 = 2;
                }
                return Integer.valueOf(i2);
            } catch (C1922n e2) {
                Log.e(fu4.f15030s, "updateConfig fail : " + e2);
                return 1;
            } catch (com.google.gson.zurt e3) {
                Log.e(fu4.f15030s, "updateConfig fail : " + e3);
                return 2;
            } catch (IOException e4) {
                Log.e(fu4.f15030s, "updateConfig fail : " + e4);
                return 1;
            } catch (JSONException e6) {
                Log.e(fu4.f15030s, "updateConfig fail : " + e6);
                return 2;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer result) {
            if (result.intValue() != 1) {
                g1.m9740d(fu4.f15029r, System.currentTimeMillis());
            }
            fu4.this.f15035n = null;
        }
    }

    private fu4(Context context) {
        this.f15036q = context;
        File filesDir = context.getFilesDir();
        this.f15034k = filesDir;
        if (filesDir.exists()) {
            return;
        }
        try {
            this.f15034k.mkdirs();
        } catch (SecurityException e2) {
            Log.e(C2755a.f16307g, "Error creating file folder" + e2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String f7l8() {
        return this.f15034k.getAbsolutePath() + "/" + f15025h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public String m9008n() {
        return this.f15034k.getAbsolutePath() + "/" + f15028p;
    }

    /* JADX INFO: renamed from: s */
    private boolean m9010s() {
        return System.currentTimeMillis() - g1.ni7(f15029r) > 3600000;
    }

    /* JADX INFO: renamed from: y */
    public static fu4 m9011y() {
        return f15022c;
    }

    @zy.lvui
    /* JADX INFO: renamed from: g */
    public String m9012g() {
        return f7l8() + "/" + f15031t;
    }

    public void ld6() {
        y9n.m7255s();
        if (this.f15035n == null && m9010s()) {
            zy zyVar = new zy();
            this.f15035n = zyVar;
            zyVar.executeOnExecutor(C6002g.x2(), new Void[0]);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(2:(3:53|12|(1:14)(0))|51) */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> com.android.thememanager.basemodule.network.theme.model.CommonResponse<T> m9013p(int r11) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.fu4.m9013p(int):com.android.thememanager.basemodule.network.theme.model.CommonResponse");
    }
}
