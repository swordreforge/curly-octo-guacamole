package com.android.thememanager.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Environment;
import android.os.IBinder;
import android.os.MiuiServiceManager;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.fu4;
import com.android.thememanager.lvui;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.o1t;
import com.android.thememanager.service.IThemePCService;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.util.bwp;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import miuix.core.util.C7083n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ThemePCService extends Service {

    /* JADX INFO: renamed from: b */
    private static final int f14715b = 700;

    /* JADX INFO: renamed from: c */
    private static final String f14716c = "unknowError";

    /* JADX INFO: renamed from: e */
    private static final String f14717e = "invalidPath";

    /* JADX INFO: renamed from: f */
    private static final String f14718f = "thumbnails";

    /* JADX INFO: renamed from: g */
    private static final String f14719g = "code";

    /* JADX INFO: renamed from: h */
    private static final String f14720h = "moduleId";

    /* JADX INFO: renamed from: i */
    private static final String f14721i = "assemblyId";

    /* JADX INFO: renamed from: j */
    private static final String f14722j = "invalidComponentStamp";

    /* JADX INFO: renamed from: l */
    private static final String f14723l = "name";

    /* JADX INFO: renamed from: m */
    private static final String f14724m = "unknowExecption";

    /* JADX INFO: renamed from: n */
    private static final String f14725n = "1";

    /* JADX INFO: renamed from: o */
    private static final String f14726o = "invalidId";

    /* JADX INFO: renamed from: p */
    private static final String f14727p = "localResources";

    /* JADX INFO: renamed from: q */
    private static final String f14728q = "IThemePCService";

    /* JADX INFO: renamed from: r */
    private static final String f14729r = "parentHash";

    /* JADX INFO: renamed from: s */
    private static final String f14730s = "pcServiceVersion";

    /* JADX INFO: renamed from: t */
    private static final String f14731t = "hash";

    /* JADX INFO: renamed from: y */
    private static final String f14732y = "value";

    /* JADX INFO: renamed from: z */
    private static final String f14733z = "localId";

    /* JADX INFO: renamed from: k */
    private Binder f14734k = new IThemePCService.Stub() { // from class: com.android.thememanager.service.ThemePCService.1
        @Override // com.android.thememanager.service.IThemePCService
        public String deleteResources(String componentStamp, String localIds) {
            return ThemePCService.this.m8890g(componentStamp, localIds);
        }

        @Override // com.android.thememanager.service.IThemePCService
        public String getEnvironment() {
            return ThemePCService.this.m8893p();
        }

        @Override // com.android.thememanager.service.IThemePCService
        public String getLocalResources(String componentStamp) {
            return ThemePCService.this.ld6(componentStamp);
        }

        @Override // com.android.thememanager.service.IThemePCService
        public String importBareResource(String path, String name, String moduleId) {
            return ThemePCService.this.x2(path, name, moduleId);
        }

        @Override // com.android.thememanager.service.IThemePCService
        public String importResource(String path) {
            return ThemePCService.this.qrj(path, InterfaceC1789q.q68, null);
        }

        @Override // com.android.thememanager.service.IThemePCService
        public String updateResource(String path, String componentStamp, String localId) {
            return ThemePCService.this.qrj(path, componentStamp, localId);
        }
    };

    /* JADX INFO: renamed from: com.android.thememanager.service.ThemePCService$k */
    private static class C2487k extends lvui {

        /* JADX INFO: renamed from: s */
        private boolean f14735s;

        /* JADX INFO: renamed from: y */
        private boolean f14736y;

        /* JADX INFO: renamed from: com.android.thememanager.service.ThemePCService$k$k */
        class k implements lvui.toq {
            k() {
            }

            @Override // com.android.thememanager.lvui.toq
            /* JADX INFO: renamed from: n */
            public void mo6395n(Resource resource) {
                C2487k.this.n7h(true);
            }

            @Override // com.android.thememanager.lvui.toq
            /* JADX INFO: renamed from: p */
            public void mo6396p(Resource resource) {
                C2487k.this.n7h(false);
            }

            @Override // com.android.thememanager.lvui.toq
            /* JADX INFO: renamed from: q */
            public void mo6397q(Resource resource) {
            }

            @Override // com.android.thememanager.lvui.toq
            public void toq(Resource resource, int downloadBytes, int totalBytes) {
            }
        }

        public C2487k(Context context) {
            super(context);
            m8165p(new k());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean kja0(fu4 resContext, Resource resource) {
            String str;
            m8168y();
            this.f14735s = false;
            this.f14736y = false;
            m8164n(resContext, resource);
            try {
                synchronized (this) {
                    if (!this.f14736y) {
                        wait(600000L);
                    }
                }
            } catch (InterruptedException unused) {
            }
            ld6();
            if (TextUtils.isEmpty(resource.getLocalId())) {
                str = "";
            } else {
                str = "updateInfo=" + resource.getLocalId() + ":" + resContext.getResourceCode();
            }
            Log.i(C2755a.f16307g, "ThemePCService import file=" + resource.getDownloadPath() + str + " result=" + this.f14735s);
            return this.f14735s;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n7h(boolean result) {
            this.f14736y = true;
            this.f14735s = result;
            synchronized (this) {
                notify();
            }
        }
    }

    private String f7l8(boolean code, Object value) {
        if (!code && value == null) {
            value = f14716c;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", code ? "1" : "0");
            jSONObject.put("value", value);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public String m8890g(String componentStamp, String localIds) {
        String strM5744q = p001b.toq.m5744q(componentStamp);
        if (TextUtils.isEmpty(strM5744q)) {
            Log.i(C2755a.f16307g, "ThemePCService fail to delete resources because of invalid componentStamp: " + componentStamp);
            return f7l8(false, f14722j);
        }
        com.android.thememanager.controller.ld6 ld6VarM7690k = new com.android.thememanager.controller.x2(C2082k.zy().m8001n().m10535g(strM5744q)).m7690k();
        ArrayList arrayList = new ArrayList();
        Resource resourceQrj = ld6VarM7690k.qrj(localIds);
        if (resourceQrj != null) {
            arrayList.add(resourceQrj);
        }
        if (!arrayList.isEmpty()) {
            return f7l8(ld6VarM7690k.jp0y(arrayList), null);
        }
        Log.i(C2755a.f16307g, "ThemePCService fail to delete resources because of invalid ids: " + localIds);
        return f7l8(false, f14726o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String ld6(String componentStamp) {
        JSONObject jSONObject = new JSONObject();
        try {
            String strM5744q = p001b.toq.m5744q(componentStamp);
            if (TextUtils.isEmpty(strM5744q)) {
                Log.i(C2755a.f16307g, "ThemePCService fail to get local resources because of invalid componentStamp: " + componentStamp);
                return f7l8(false, f14722j);
            }
            fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g(strM5744q);
            List<Resource> listKja0 = new com.android.thememanager.controller.x2(fu4VarM10535g).m7690k().kja0();
            JSONArray jSONArray = new JSONArray();
            int iMin = Math.min(listKja0.size(), 700);
            for (int i2 = 0; i2 < iMin; i2++) {
                Resource resource = listKja0.get(i2);
                ResourceResolver resourceResolver = new ResourceResolver(resource, fu4VarM10535g);
                String metaPath = resourceResolver.getMetaPath();
                if (!TextUtils.isEmpty(metaPath) && !metaPath.startsWith("/system")) {
                    List<String> buildInThumbnails = resourceResolver.getBuildInThumbnails();
                    String strN7h = (buildInThumbnails == null || buildInThumbnails.size() <= 0) ? null : n7h(buildInThumbnails.get(0));
                    Resource resourceKja0 = C1792n.kja0(resource, fu4VarM10535g.getNewResourceContext());
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("moduleId", resource.getOnlineId());
                    jSONObject2.put("assemblyId", resource.getAssemblyId());
                    jSONObject2.put(f14733z, resource.getLocalId());
                    jSONObject2.put("hash", resource.getHash());
                    jSONObject2.put("name", resource.getTitle());
                    jSONObject2.put(f14718f, strN7h);
                    jSONArray.put(jSONObject2);
                    if (resourceKja0 != null) {
                        jSONObject2.put(f14729r, resourceKja0.getHash());
                    }
                }
            }
            jSONObject.put(f14727p, jSONArray);
            return f7l8(true, jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return f7l8(false, f14724m);
        }
    }

    private String n7h(String path) {
        return path.replaceFirst(Environment.getExternalStorageDirectory().getAbsolutePath(), "/sdcard");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public String m8893p() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : com.android.thememanager.controller.online.ld6.was(0).entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put(f14730s, "1");
            return f7l8(true, jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return f7l8(false, f14724m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String qrj(String path, String componentStamp, String localId) {
        Resource resource;
        if (TextUtils.isEmpty(path) || !new File(path).exists()) {
            Log.i(C2755a.f16307g, "ThemePCService fail to import resource because of invalid path: " + path);
            return f7l8(false, f14717e);
        }
        String strM5744q = p001b.toq.m5744q(componentStamp);
        if (TextUtils.isEmpty(strM5744q)) {
            Log.i(C2755a.f16307g, "ThemePCService fail to import resource because of invalid componentStamp: " + componentStamp);
            return f7l8(false, f14722j);
        }
        fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g(strM5744q);
        if (localId != null) {
            resource = new com.android.thememanager.controller.x2(fu4VarM10535g).m7690k().qrj(localId);
            if (resource == null) {
                Log.i(C2755a.f16307g, "ThemePCService fail to import resource because of invalid id: " + localId);
                return f7l8(false, f14726o);
            }
        } else {
            resource = new Resource();
        }
        resource.setDownloadPath(path);
        return f7l8(new C2487k(this).kja0(fu4VarM10535g, resource), null);
    }

    /* JADX INFO: renamed from: s */
    private String m8895s(String title, String onlineId, String componentCode) {
        return o1t.m8430y("wallpaper".equals(componentCode) ? C1788k.f10190z : "ringtone".equals(componentCode) ? C1788k.f10182r : "", title, onlineId, bwp.kja0(componentCode), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String x2(String path, String title, String onlineId) {
        if (TextUtils.isEmpty(path) || !new File(path).exists()) {
            Log.i(C2755a.f16307g, "ThemePCService fail to import bare resource because of invalid path: " + path);
            return f7l8(false, f14717e);
        }
        String strM8896y = m8896y(path);
        if (TextUtils.isEmpty(strM8896y)) {
            Log.i(C2755a.f16307g, "ThemePCService fail to import bare resource because of invalid path: " + path);
            return f7l8(false, f14722j);
        }
        File file = new File(path);
        File file2 = new File(m8895s(title, onlineId, strM8896y));
        file2.getParentFile().mkdirs();
        boolean zRenameTo = file.renameTo(file2);
        if (!zRenameTo) {
            zRenameTo = C7083n.zy(file, file2);
            file.delete();
        }
        return f7l8(zRenameTo, null);
    }

    /* JADX INFO: renamed from: y */
    private String m8896y(String path) {
        if (path.endsWith(com.android.thememanager.basemodule.resource.constants.toq.pm14)) {
            return "ringtone";
        }
        if (path.endsWith(com.android.thememanager.basemodule.resource.constants.toq.ybu) || path.endsWith(".png")) {
            return "wallpaper";
        }
        return null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        MiuiServiceManager.addService(f14728q, this.f14734k);
        Log.i(C2755a.f16307g, "ThemePCService.onStartCommand()");
        return 1;
    }
}
