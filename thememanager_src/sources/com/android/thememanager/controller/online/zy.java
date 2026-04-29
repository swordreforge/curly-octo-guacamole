package com.android.thememanager.controller.online;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.android.thememanager.C2082k;
import com.android.thememanager.ThemeApplication;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.C1794q;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.util.C2807t;
import com.android.thememanager.util.ch;
import com.android.thememanager.util.d8wk;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import miui.drm.DrmManager;
import org.json.JSONObject;

/* JADX INFO: compiled from: DrmService.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f57984cdj = 408;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f57985f7l8 = 100001;

    /* JADX INFO: renamed from: g */
    public static final int f11053g = 100000;

    /* JADX INFO: renamed from: h */
    public static final int f11054h = 100010;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f57986kja0 = 100009;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f57987ld6 = 100005;

    /* JADX INFO: renamed from: n */
    public static final int f11055n = 2;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f57988n7h = 100008;

    /* JADX INFO: renamed from: p */
    public static final int f11056p = 100004;

    /* JADX INFO: renamed from: q */
    public static final int f11057q = 1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f57989qrj = 100007;

    /* JADX INFO: renamed from: s */
    public static final int f11058s = 100003;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f57990x2 = 100006;

    /* JADX INFO: renamed from: y */
    public static final int f11059y = 100002;

    /* JADX INFO: renamed from: k */
    private com.android.thememanager.fu4 f11060k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private ld6 f57991toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Set<String> f57992zy;

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.zy$k */
    /* JADX INFO: compiled from: DrmService.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1947k {
    }

    /* JADX INFO: compiled from: DrmService.java */
    @Retention(RetentionPolicy.SOURCE)
    @interface toq {
    }

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DrmService.java */
    public static class C7914zy {

        /* JADX INFO: renamed from: k */
        private int f11061k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f57993toq = -99;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f57994zy;

        public C7914zy(int code) {
            this.f11061k = code;
        }

        public String f7l8() {
            return this.f57994zy;
        }

        /* JADX INFO: renamed from: g */
        public int m7663g() {
            return this.f57993toq;
        }

        /* JADX INFO: renamed from: n */
        public int m7664n() {
            return this.f11061k;
        }

        /* JADX INFO: renamed from: p */
        public void m7665p(String serverResponseContent) {
            this.f57994zy = serverResponseContent;
        }

        /* JADX INFO: renamed from: s */
        public void m7666s(int serverResponseCode) {
            this.f57993toq = serverResponseCode;
        }

        /* JADX INFO: renamed from: y */
        public void m7667y(int getRightsResult) {
            this.f11061k = getRightsResult;
        }
    }

    public zy(com.android.thememanager.fu4 resContext) {
        this.f11060k = resContext;
        this.f57991toq = new ld6(resContext);
    }

    private Pair<String, String> toq(Resource resource) {
        Map<String, String> mapZy = zy(resource);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (mapZy == null || mapZy.size() <= 0) {
            return null;
        }
        for (Map.Entry<String, String> entry : mapZy.entrySet()) {
            sb.append(entry.getValue());
            sb.append(",");
            sb2.append(entry.getKey() + "--" + entry.getValue());
            sb2.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb2.deleteCharAt(sb2.length() - 1);
        return new Pair<>(sb.toString(), sb2.toString());
    }

    private Map<String, String> zy(Resource resource) {
        HashMap map = new HashMap();
        List<RelatedResource> subResources = resource.getSubResources();
        if (subResources != null) {
            for (RelatedResource relatedResource : subResources) {
                String strM6956k = new C1794q(relatedResource, C1791k.getInstance(this.f11060k.getResourceCode())).m6956k();
                if (!C2807t.toq(relatedResource.getResourceCode())) {
                    map.put(relatedResource.getResourceCode(), ch.toq(strM6956k));
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: k */
    public C7914zy m7658k(Resource resource, int applyType, String productType, boolean hasGetServiceToken) {
        FileInputStream fileInputStream;
        zurt zurtVarY2;
        Resource resource2 = resource;
        C7914zy c7914zy = new C7914zy(f57986kja0);
        if (com.android.thememanager.basemodule.utils.o1t.cdj() && ch.hyr(resource.getLocalId())) {
            String rightsPath = new ResourceResolver(resource2, C2082k.zy().m8001n().m10535g("fonts")).getRightsPath();
            try {
                Log.i(C2755a.f16307g, "copy MILanPro rights");
                ch.zy();
                ch.m9685x(InterfaceC1789q.ogyu, rightsPath);
            } catch (IOException e2) {
                Log.e(C2755a.f16307g, e2.getMessage());
            }
            if (new File(rightsPath).exists()) {
                Log.i(C2755a.f16307g, "copy MILanPro rights succeed");
                c7914zy.f11061k = 100000;
            } else {
                Log.i(C2755a.f16307g, "copy MILanPro rights failed");
                c7914zy.f11061k = f57986kja0;
            }
            return c7914zy;
        }
        Resource resourceKja0 = C1792n.kja0(resource2, this.f11060k.getNewResourceContext());
        if (resourceKja0 != null) {
            resource2 = resourceKja0;
        }
        ResourceResolver resourceResolver = new ResourceResolver(resource2, this.f11060k);
        String str = resourceResolver.getRightsPath() + ".temp";
        FileInputStream fileInputStream2 = null;
        try {
            zurtVarY2 = this.f57991toq.y2(resource2.getProductId(), resource2.getHash(), toq(resource2), resource2.getTitle(), applyType, productType, hasGetServiceToken, resource2.getOriginPrice() <= 0);
            Log.i(C2755a.f16307g, "downloadRights: id =" + resource2.getProductId() + ",applyType =" + applyType + "，productType=" + productType + ",hasGetServiceToken=" + hasGetServiceToken);
        } catch (C1922n e3) {
            c7914zy.f11061k = f11059y;
            c7914zy.f57993toq = e3.getResponseCode();
            c7914zy.f57994zy = e3.getResponseReason();
            e3.printStackTrace();
        } catch (IOException unused) {
            c7914zy.f11061k = f11058s;
        } catch (Exception e4) {
            c7914zy.f11061k = f57987ld6;
            e4.printStackTrace();
        }
        if (zurtVarY2 == null) {
            c7914zy.f11061k = f11054h;
            return c7914zy;
        }
        Pair<Integer, JSONObject> pairKi = C1944y.ki(C1915g.f7l8(zurtVarY2));
        int iIntValue = ((Integer) pairKi.first).intValue();
        if (iIntValue != 0 || pairKi.second == null) {
            c7914zy.f57993toq = iIntValue;
            Log.d(C2755a.f16307g, "downloadRights failed, serverResponseCode=" + iIntValue);
            if (iIntValue == 407 || iIntValue == 410) {
                c7914zy.f11061k = f57990x2;
            } else if (iIntValue == 9999) {
                c7914zy.f11061k = f57989qrj;
            } else {
                c7914zy.f11061k = f11056p;
            }
            c7914zy.f57994zy = ((JSONObject) pairKi.second).optString(InterfaceC1925p.zvz, null);
        } else {
            com.android.thememanager.controller.online.toq toqVar = new com.android.thememanager.controller.online.toq("rights-" + resource2.getOnlineId());
            String strOptString = ((JSONObject) pairKi.second).optString(InterfaceC1925p.f517);
            d8wk.m9698n();
            if (toqVar.toq(this.f57991toq.c8jq(strOptString), str)) {
                c7914zy.f11061k = 100000;
            } else {
                c7914zy.f11061k = f57988n7h;
            }
        }
        if (c7914zy.f11061k == 100000) {
            File file = new File(str);
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (IOException e6) {
                    e = e6;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                C1821p.f7l8(fileInputStream, new File(resourceResolver.getRightsPath()));
                y9n.m7246g(fileInputStream);
            } catch (IOException e7) {
                e = e7;
                fileInputStream2 = fileInputStream;
                c7914zy.f11061k = f57988n7h;
                e.printStackTrace();
                y9n.m7246g(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                y9n.m7246g(fileInputStream2);
                file.delete();
                throw th;
            }
            file.delete();
        }
        return c7914zy;
    }

    /* JADX INFO: renamed from: n */
    public void m7659n(Set<String> whiteList) {
        this.f57992zy = whiteList;
    }

    /* JADX INFO: renamed from: q */
    public DrmManager.DrmResult m7660q(Resource origin) {
        Resource resourceM28251clone = origin.m28251clone();
        Log.i("theme", "check rights isLegal: " + origin.getTitle() + "," + origin.getHash() + "," + origin.getProductId());
        ResourceResolver resourceResolver = new ResourceResolver(resourceM28251clone, this.f11060k);
        if (TextUtils.isEmpty(resourceResolver.getContentPath())) {
            return DrmManager.DrmResult.DRM_SUCCESS;
        }
        if (new File(resourceResolver.getContentPath()).getAbsolutePath().startsWith("/system")) {
            return DrmManager.DrmResult.DRM_SUCCESS;
        }
        if (resourceResolver.getRightsPath() == null) {
            return DrmManager.DrmResult.DRM_SUCCESS;
        }
        File file = new File(resourceResolver.getRightsPath());
        Log.i(C2755a.f16307g, "   check rights file: " + file.getName());
        ThemeApplication qVar = C2082k.zy().toq();
        List<RelatedResource> subResources = resourceM28251clone.getSubResources();
        if (subResources == null || subResources.size() <= 0) {
            return DrmManager.isLegal(qVar, ch.toq(resourceResolver.getContentPath()), file);
        }
        for (RelatedResource relatedResource : subResources) {
            Set<String> set = this.f57992zy;
            if (set == null || !set.contains(relatedResource.getResourceCode())) {
                if (C2807t.toq(relatedResource.getResourceCode())) {
                    continue;
                } else {
                    C1794q c1794q = new C1794q(relatedResource, C1791k.getInstance(this.f11060k.getResourceCode()));
                    String strM6956k = c1794q.m6956k();
                    if (TextUtils.isEmpty(strM6956k) || !new File(strM6956k).exists()) {
                        return DrmManager.DrmResult.DRM_ERROR_UNKNOWN;
                    }
                    String qVar2 = ch.toq(strM6956k);
                    if (com.android.thememanager.basemodule.resource.constants.toq.em44.equals(qVar2)) {
                        continue;
                    } else {
                        File file2 = new File(c1794q.zy());
                        DrmManager.DrmResult morePreciseDrmResult = DrmManager.DrmResult.DRM_ERROR_UNKNOWN;
                        if (file2.exists()) {
                            morePreciseDrmResult = DrmManager.getMorePreciseDrmResult(morePreciseDrmResult, DrmManager.isLegal(qVar, qVar2, file2));
                        }
                        if (morePreciseDrmResult != DrmManager.DrmResult.DRM_SUCCESS) {
                            morePreciseDrmResult = DrmManager.getMorePreciseDrmResult(morePreciseDrmResult, DrmManager.isLegal(qVar, qVar2, file));
                        }
                        if (morePreciseDrmResult != DrmManager.DrmResult.DRM_SUCCESS) {
                            return morePreciseDrmResult;
                        }
                    }
                }
            }
        }
        return DrmManager.DrmResult.DRM_SUCCESS;
    }
}
