package com.android.thememanager.h5;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.C1922n;
import com.android.thememanager.controller.online.C1944y;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.ld6;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.util.ch;
import com.android.thememanager.util.g1;
import com.android.thememanager.util.i1;
import com.android.thememanager.util.o1t;
import ek5k.C6002g;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import miuix.core.util.C7083n;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: WebResourceManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 implements InterfaceC1925p {

    /* JADX INFO: renamed from: a */
    private static final long f12005a = 3600000;

    /* JADX INFO: renamed from: b */
    private static final String f12006b = "TAB_CONFIG_UDPATE_TIME_STAMP";

    /* JADX INFO: renamed from: c */
    private static final String f12007c = "file://h5.theme.com/index.html?apipath=search/npage/index";

    /* JADX INFO: renamed from: e */
    private static final int f12008e = 93;

    /* JADX INFO: renamed from: f */
    private static final String f12009f = "web-res-";

    /* JADX INFO: renamed from: h */
    public static final String f12010h = "file://";

    /* JADX INFO: renamed from: i */
    public static final String f12011i = "h5.theme.com";

    /* JADX INFO: renamed from: j */
    private static final int f12012j = 16;

    /* JADX INFO: renamed from: l */
    private static final String f12013l = "/android_asset/";

    /* JADX INFO: renamed from: m */
    private static final String f12014m = "page.config";

    /* JADX INFO: renamed from: o */
    private static final String f12015o = "md5conf.json";

    /* JADX INFO: renamed from: p */
    private static final String f12016p = "WebResourceManager";

    /* JADX INFO: renamed from: r */
    public static final String f12017r = "/index";

    /* JADX INFO: renamed from: t */
    public static final String f12018t = "file://h5.theme.com/index.html?type=%s&errorLocalEntry=%s";

    /* JADX INFO: renamed from: z */
    public static final String f12019z = "file://h5.theme.com/";

    /* JADX INFO: renamed from: g */
    private List<WeakReference<zy>> f12020g;

    /* JADX INFO: renamed from: k */
    private String f12021k;

    /* JADX INFO: renamed from: n */
    private Context f12022n;

    /* JADX INFO: renamed from: q */
    private File f12023q;

    /* JADX INFO: renamed from: s */
    private com.android.thememanager.h5.toq f12024s;

    /* JADX INFO: renamed from: y */
    private AsyncTaskC2047q f12025y;

    /* JADX INFO: renamed from: com.android.thememanager.h5.f7l8$q */
    /* JADX INFO: compiled from: WebResourceManager.java */
    private static class AsyncTaskC2047q extends AsyncTask<Void, Void, Integer> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final int f60270f7l8 = 3;

        /* JADX INFO: renamed from: g */
        private static final int f12026g = 2;

        /* JADX INFO: renamed from: n */
        private static final int f12027n = 1;

        /* JADX INFO: renamed from: q */
        private static final int f12028q = 0;

        /* JADX INFO: renamed from: y */
        private static final int f12029y = 4;

        /* JADX INFO: renamed from: k */
        private f7l8 f12030k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private com.android.thememanager.h5.toq f60271toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f60272zy;

        public AsyncTaskC2047q(f7l8 manager, com.android.thememanager.h5.toq pageConfig, int curWebResVersion) {
            this.f60271toq = pageConfig;
            this.f60272zy = curWebResVersion;
            this.f12030k = manager;
        }

        private boolean f7l8() {
            String strN7h = this.f12030k.n7h(93);
            new File(strN7h).delete();
            boolean zM7919k = m7919k(this.f12030k.f12022n.getAssets(), "web-res-93", strN7h);
            Log.i(C2755a.f16307g, "[checkAndUpdateWebRes] : preset web res copy done with: " + zM7919k);
            if (!zM7919k || !m7917s(strN7h)) {
                return false;
            }
            g1.ikck(g1.f16461h, 93);
            return true;
        }

        /* JADX INFO: renamed from: n */
        private String m7915n() {
            return C1821p.n7h(i1.toq(this.f12030k.f12022n).getAbsolutePath()) + "web/res/res.tmp";
        }

        /* JADX INFO: renamed from: q */
        private boolean m7916q(JSONObject webResourceJson, String host, int resVersion) throws Throwable {
            String string = webResourceJson.getString(InterfaceC1925p.pstq);
            String string2 = webResourceJson.getString("value");
            zurt zurtVar = new zurt(host + string2, 1, zurt.EnumC1946k.FILE_PROXY);
            String strM7915n = m7915n();
            String strN7h = this.f12030k.n7h(resVersion);
            new File(strM7915n).delete();
            boolean qVar = new com.android.thememanager.controller.online.toq(string2).toq(zurtVar, strM7915n);
            if (qVar) {
                if (TextUtils.equals(string, o1t.ld6(new File(strM7915n)))) {
                    try {
                        ch.ch(strM7915n, strN7h, null);
                        qVar = m7917s(strN7h);
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        new File(strN7h).delete();
                        qVar = false;
                    }
                    new File(strM7915n).delete();
                } else {
                    qVar = false;
                    new File(strM7915n).delete();
                }
            }
            return qVar;
        }

        /* JADX INFO: renamed from: s */
        private boolean m7917s(String path) throws Throwable {
            BufferedReader bufferedReader;
            File file = new File(path);
            if (!file.exists() || !file.isDirectory()) {
                return false;
            }
            File file2 = new File(file.getAbsolutePath() + "/" + f7l8.f12015o);
            if (!file2.exists()) {
                Log.e(f7l8.f12016p, "[verifyWebResMd5] : md5conf.json not exists!");
                return false;
            }
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader(file2));
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                JSONObject jSONObject = new JSONObject(bufferedReader.readLine());
                for (File file3 : file.listFiles()) {
                    if (!TextUtils.equals(file3.getName(), f7l8.f12015o) && !TextUtils.equals(file3.getName(), f7l8.f12014m) && !file3.isDirectory()) {
                        String string = jSONObject.getString(file3.getName());
                        String strLd6 = o1t.ld6(file3);
                        if (!TextUtils.equals(string, strLd6)) {
                            Log.e(f7l8.f12016p, "[verifyWebResMd5] : verify failed : " + file3.getName() + " file md5 " + strLd6 + " not match " + string);
                            y9n.m7246g(bufferedReader);
                            return false;
                        }
                    }
                }
                y9n.m7246g(bufferedReader);
                Log.d(f7l8.f12016p, "[verifyWebResMd5] : verify succeed!");
                return true;
            } catch (Exception e3) {
                e = e3;
                bufferedReader2 = bufferedReader;
                Log.e(f7l8.f12016p, "[verifyWebResMd5] : verify failed", e);
                y9n.m7246g(bufferedReader2);
                return false;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                y9n.m7246g(bufferedReader2);
                throw th;
            }
        }

        private void toq(int currentVersion) {
            for (int i2 = 93; i2 < currentVersion; i2++) {
                C1821p.ki(this.f12030k.n7h(i2));
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer result) {
            super.onPostExecute(result);
            if (result.intValue() == 0) {
                this.f12030k.x2().ki(false);
                g1.ikck(g1.f16461h, this.f60272zy);
                this.f12030k.cdj();
            }
            if (result.intValue() != 1) {
                g1.m9740d(f7l8.f12006b, System.currentTimeMillis());
            }
            this.f12030k.f12025y = null;
        }

        /* JADX INFO: renamed from: k */
        public boolean m7919k(AssetManager assetManager, String folderName, String destFolderPath) {
            if (assetManager != null && !TextUtils.isEmpty(folderName) && !TextUtils.isEmpty(destFolderPath)) {
                File file = new File(destFolderPath);
                if (file.exists()) {
                    m7920y(destFolderPath);
                }
                file.mkdirs();
                try {
                    InputStream inputStreamOpen = null;
                    for (String str : assetManager.list(folderName)) {
                        try {
                            try {
                                inputStreamOpen = assetManager.open(folderName + "/" + str);
                                if (!C7083n.m25589q(inputStreamOpen, new File(file.getAbsoluteFile() + "/" + str))) {
                                    if (inputStreamOpen != null) {
                                        try {
                                            inputStreamOpen.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    return false;
                                }
                                if (inputStreamOpen != null) {
                                    try {
                                        inputStreamOpen.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                            } catch (IOException e2) {
                                Log.i(C2755a.f16307g, "Failed to copy asset file " + str + " : " + e2.toString());
                                if (inputStreamOpen != null) {
                                    try {
                                        inputStreamOpen.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                return false;
                            }
                        } catch (Throwable th) {
                            if (inputStreamOpen != null) {
                                try {
                                    inputStreamOpen.close();
                                } catch (IOException unused4) {
                                }
                            }
                            throw th;
                        }
                    }
                    return true;
                } catch (IOException e3) {
                    Log.i(C2755a.f16307g, "Failed to get asset file list : " + e3.toString());
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: y */
        public boolean m7920y(String path) {
            return C1821p.ki(path);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... params) {
            Object obj;
            boolean z2;
            try {
                Pair<Integer, JSONObject> pairKi = C1944y.ki(C1915g.f7l8(ld6.bf2()));
                if (((Integer) pairKi.first).intValue() == 0 && (obj = pairKi.second) != null) {
                    String string = ((JSONObject) obj).getString("host");
                    JSONObject jSONObject = ((JSONObject) pairKi.second).getJSONObject("resource");
                    JSONObject jSONObject2 = jSONObject.getJSONObject(InterfaceC1925p.bvt);
                    JSONObject jSONObject3 = jSONObject.getJSONObject(InterfaceC1925p.g5n4);
                    int i2 = jSONObject2.getInt("versionCode");
                    int i3 = jSONObject3.getInt("versionCode");
                    if (i2 >= this.f60271toq.f7l8() && i3 >= this.f60272zy && (i2 != this.f60271toq.f7l8() || i3 != this.f60272zy)) {
                        int i4 = this.f60272zy;
                        if (i3 <= i4 && 93 <= i4) {
                            z2 = true;
                            i3 = i4;
                        } else if (i3 > 93) {
                            z2 = m7916q(jSONObject3, string, i3);
                        } else {
                            z2 = f7l8();
                            i3 = 93;
                        }
                        if (i2 > this.f60271toq.f7l8()) {
                            com.android.thememanager.h5.toq toqVarM7912y = f7l8.m7912y(jSONObject2, true);
                            if (toqVarM7912y == null || !toqVarM7912y.ld6()) {
                                z2 = false;
                            } else {
                                this.f60271toq = toqVarM7912y;
                            }
                        }
                        if (z2) {
                            if (C2063g.m7950n(this.f12030k.n7h(i3) + f7l8.f12014m, this.f60271toq)) {
                                toq(this.f60272zy);
                                this.f60272zy = i3;
                                return 0;
                            }
                            C1821p.ki(this.f12030k.n7h(i3));
                            Log.e(C2755a.f16307g, "write config to WebRes version " + i3 + "fail. delete folder");
                        }
                    }
                    return 4;
                }
                Log.e(C2755a.f16307g, "get page config fail. error : " + pairKi.first);
                return 3;
            } catch (C1922n e2) {
                Log.e(f7l8.f12016p, "updatePageConfig fail : " + e2);
                return 1;
            } catch (IOException e3) {
                Log.e(f7l8.f12016p, "updatePageConfig fail : " + e3);
                return 1;
            } catch (JSONException e4) {
                Log.e(f7l8.f12016p, "updatePageConfig fail : " + e4);
                return 2;
            }
        }
    }

    /* JADX INFO: compiled from: WebResourceManager.java */
    private static class toq {

        /* JADX INFO: renamed from: k */
        public static final f7l8 f12031k = new f7l8(C2082k.zy().toq());

        private toq() {
        }
    }

    /* JADX INFO: compiled from: WebResourceManager.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        void mo6362k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cdj() {
        Iterator<WeakReference<zy>> it = this.f12020g.iterator();
        while (it.hasNext()) {
            zy zyVar = it.next().get();
            if (zyVar != null) {
                zyVar.mo6362k();
            } else {
                it.remove();
            }
        }
    }

    private static com.android.thememanager.h5.toq f7l8(String pageJsonStr, boolean verifyMd5) {
        try {
            return m7912y(new JSONObject(pageJsonStr), verifyMd5);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m7907h() {
        return System.currentTimeMillis() - g1.ni7(f12006b) > 3600000;
    }

    public static com.android.thememanager.h5.toq ki(String path) throws Throwable {
        File file = new File(path);
        String str = "";
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new BufferedReader(new FileReader(file)));
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            str = str + line;
                        } catch (Exception e2) {
                            e = e2;
                            bufferedReader = bufferedReader2;
                            Log.d(C2755a.f16307g, "read page json failed : " + e.toString());
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return f7l8(str, false);
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused) {
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                } catch (IOException unused2) {
                }
            } catch (Exception e3) {
                e = e3;
            }
            return f7l8(str, false);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static f7l8 ld6() {
        return toq.f12031k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String n7h(int version) {
        if (version <= 0) {
            return C1821p.n7h("/android_asset/web-res-93");
        }
        return C1821p.n7h(this.f12023q.getAbsolutePath() + "/" + f12009f + version);
    }

    /* JADX INFO: renamed from: s */
    private com.android.thememanager.h5.toq m7911s() {
        com.android.thememanager.h5.toq toqVar = new com.android.thememanager.h5.toq();
        toqVar.ki(true);
        toqVar.kja0(16);
        toqVar.m7966h(false);
        toqVar.cdj(f12007c);
        return toqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static com.android.thememanager.h5.toq m7912y(JSONObject pageJson, boolean verifyMd5) {
        try {
            String string = pageJson.getString("value");
            if (verifyMd5) {
                String string2 = pageJson.getString(InterfaceC1925p.pstq);
                if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string.toString()) || !TextUtils.equals(o1t.x2(string), string2)) {
                    Log.e(C2755a.f16307g, "MD5 match failed for page configuration");
                    return null;
                }
            }
            return new com.android.thememanager.h5.toq(pageJson);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m7913g(zy configListener) {
        this.f12020g.add(new WeakReference<>(configListener));
    }

    public boolean kja0(Uri uri) {
        if (uri == null || uri.getPath() == null) {
            return false;
        }
        if (!f12010h.equals(uri.getScheme())) {
            return true;
        }
        String path = uri.getPath();
        return path.startsWith(this.f12023q.getAbsolutePath()) || path.startsWith("file:///android_asset/");
    }

    /* JADX INFO: renamed from: p */
    public String m7914p(String url) {
        if (url == null || !url.startsWith(f12019z)) {
            return url;
        }
        return this.f12021k + url.substring(20);
    }

    public com.android.thememanager.h5.toq qrj() {
        com.android.thememanager.h5.toq toqVarX2 = x2();
        t8r();
        return toqVarX2;
    }

    public void t8r() {
        y9n.m7255s();
        if (this.f12025y == null && m7907h()) {
            AsyncTaskC2047q asyncTaskC2047q = new AsyncTaskC2047q(this, x2(), g1.ki(g1.f16461h));
            this.f12025y = asyncTaskC2047q;
            asyncTaskC2047q.executeOnExecutor(C6002g.x2(), new Void[0]);
        }
    }

    public synchronized com.android.thememanager.h5.toq x2() {
        com.android.thememanager.h5.toq toqVar = this.f12024s;
        if (toqVar != null && toqVar.ld6()) {
            return this.f12024s;
        }
        this.f12024s = m7911s();
        this.f12021k = C1821p.n7h("file:///android_asset/web-res-93");
        File file = this.f12023q;
        if (file != null && file.exists()) {
            int iKi = g1.ki(g1.f16461h);
            if (C2063g.m7949k() || iKi > 0) {
                String strN7h = n7h(iKi);
                com.android.thememanager.h5.toq toqVarKi = ki(strN7h + f12014m);
                if (toqVarKi != null && toqVarKi.ld6()) {
                    this.f12024s = toqVarKi;
                    this.f12021k = f12010h + strN7h;
                }
            }
            return this.f12024s;
        }
        Log.e(C2755a.f16307g, "read page json failed : file dir not exist");
        return this.f12024s;
    }

    private f7l8(Context context) {
        this.f12020g = new ArrayList();
        this.f12022n = context;
        File fileZy = i1.zy(context);
        this.f12023q = fileZy;
        if (fileZy.exists()) {
            return;
        }
        try {
            this.f12023q.mkdirs();
        } catch (SecurityException e2) {
            Log.e(C2755a.f16307g, "Error creating file folder" + e2.toString());
        }
    }
}
