package com.android.thememanager.controller.local;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.FileProvider;
import androidx.lifecycle.fti;
import androidx.lifecycle.jp0y;
import com.android.thememanager.C2082k;
import com.android.thememanager.C2320q;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.C1795s;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.mine.local.model.LocalFontModel;
import com.android.thememanager.router.app.entity.ThemeStatus;
import com.android.thememanager.util.g1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.controller.local.s */
/* JADX INFO: compiled from: LocalFontProviderManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1912s {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f57937f7l8 = "userAgreement";

    /* JADX INFO: renamed from: g */
    public static final String f10916g = "applyResult";

    /* JADX INFO: renamed from: k */
    private static final String f10917k = "LocalFontProvide";

    /* JADX INFO: renamed from: n */
    public static final String f10918n = "result";

    /* JADX INFO: renamed from: q */
    public static final String f10919q = "fontId";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f57938toq = "getFonts";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f57939zy = "applyFont";

    /* JADX INFO: renamed from: com.android.thememanager.controller.local.s$k */
    /* JADX INFO: compiled from: LocalFontProviderManager.java */
    private static class k implements jp0y<ThemeStatus> {

        /* JADX INFO: renamed from: k */
        private fti<ThemeStatus> f10920k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private CountDownLatch f57940toq;

        public k(fti<ThemeStatus> themeStatusData, CountDownLatch countDownLatch) {
            this.f10920k = themeStatusData;
            this.f57940toq = countDownLatch;
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(ThemeStatus themeStatus) {
            int i2 = themeStatus.status;
            if (99 == i2 || 97 == i2) {
                this.f57940toq.countDown();
                this.f10920k.kja0(this);
                if (99 == themeStatus.status) {
                    C2082k.zy().m8003s().toq();
                    C2082k.zy().m8003s().m9977k(bf2.toq.toq());
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private static LocalFontModel m7531g(Context context, String packageName, C1791k newResourceContext, Resource resource, boolean isUsing) {
        C1795s c1795s = new C1795s(resource, newResourceContext);
        File file = new File(c1795s.f7l8());
        if (!file.exists()) {
            Log.w(f10917k, "parse fail, file is not exist");
            return null;
        }
        String localId = resource.getLocalId();
        String title = resource.getTitle();
        boolean z2 = resource.getFontWeightList() != null && resource.getFontWeightList().size() > 0;
        Uri uriM2162g = FileProvider.m2162g(context, com.android.thememanager.basemodule.resource.constants.toq.o9qk, file);
        context.grantUriPermission(packageName, uriM2162g, 65);
        if (!C1781k.toq(context) && !C1792n.m6933f(resource.getLocalId()) && !C1792n.nn86(resource.getContentPath())) {
            String strM6970s = c1795s.m6970s();
            if (!TextUtils.isEmpty(strM6970s) && !new File(strM6970s).exists()) {
                Log.i(f10917k, "parseFonts rightFile not exit,and cannot download: " + resource.getTitle());
                return new LocalFontModel(localId, title, uriM2162g.toString(), isUsing, z2, resource.getFontWeightList(), true);
            }
        }
        return new LocalFontModel(localId, title, uriM2162g.toString(), isUsing, z2, resource.getFontWeightList());
    }

    /* JADX INFO: renamed from: n */
    public static List<LocalFontModel> m7533n(Context context, String packageName) {
        List<Resource> listFn3e = g1.fn3e("fonts");
        Map<String, Boolean> mapM7579y = null;
        if (listFn3e == null || listFn3e.isEmpty()) {
            Log.d(f10917k, "local resource is empty.");
            return null;
        }
        ArrayList arrayList = new ArrayList(listFn3e.size());
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        C1791k c1791k = C1791k.getInstance("fonts");
        LocalFontModel localFontModelM7531g = null;
        LocalFontModel localFontModel = null;
        for (Resource resource : listFn3e) {
            if (resource == null) {
                Log.e(f10917k, "resource is null.");
            } else {
                boolean zM28221n = zsr0.toq.m28221n(context, resource, "fonts");
                if (C1792n.nn86(resource.getContentPath())) {
                    localFontModel = new LocalFontModel(resource.getLocalId(), resource.getTitle(), null, zM28221n, false, null);
                } else if (zM28221n) {
                    localFontModelM7531g = m7531g(context, packageName, c1791k, resource, true);
                } else if (resource.isProductBought() || resource.getProductPrice() == 0) {
                    arrayList.add(m7531g(context, packageName, c1791k, resource, false));
                } else if (!resource.hasCheckBoughtStatus()) {
                    String onlineId = resource.getOnlineId();
                    if (!TextUtils.isEmpty(onlineId)) {
                        arrayList2.add(onlineId);
                        map.put(onlineId, resource);
                    }
                }
            }
        }
        if (arrayList2.isEmpty() || !C1781k.toq(context) || !mcp.m7139n()) {
            zy(arrayList, localFontModel, localFontModelM7531g);
            return arrayList;
        }
        try {
            mapM7579y = com.android.thememanager.controller.online.ld6.m7579y(p001b.toq.fu4(p001b.toq.m5744q(p001b.toq.n7h("fonts"))), (String[]) arrayList2.toArray(new String[0]));
        } catch (Exception e2) {
            Log.e(f10917k, e2.getMessage());
        }
        if (mapM7579y != null) {
            for (String str : mapM7579y.keySet()) {
                Resource resource2 = (Resource) map.get(str);
                if (resource2 != null) {
                    if (mapM7579y.get(str).booleanValue()) {
                        resource2.setProductBought(true);
                        LocalFontModel localFontModelM7531g2 = m7531g(context, packageName, c1791k, resource2, false);
                        if (localFontModelM7531g2 != null) {
                            arrayList.add(localFontModelM7531g2);
                        }
                    } else {
                        resource2.setProductBought(false);
                    }
                    resource2.setCheckBoughtStatus(true);
                    g1.tfm(c1791k, resource2);
                }
            }
        }
        zy(arrayList, localFontModel, localFontModelM7531g);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m7534q(Resource resource, fti ftiVar, CountDownLatch countDownLatch) {
        ThemeStatus themeStatus = new ThemeStatus(resource.getLocalId());
        themeStatus.status = 96;
        ftiVar.cdj(themeStatus);
        ftiVar.ld6(new k(ftiVar, countDownLatch));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean toq(Context context, String localId, int fontScale, int fontWeight) {
        boolean z2 = false;
        if (localId == null) {
            Log.w(f10917k, "localId == null");
            return false;
        }
        List<Resource> listFn3e = g1.fn3e("fonts");
        if (listFn3e == null || listFn3e.isEmpty()) {
            Log.w(f10917k, "resource is empty.");
            return false;
        }
        String strO1t = C2320q.o1t(context, "fonts");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final fti ftiVar = new fti();
        Iterator<Resource> it = listFn3e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            final Resource next = it.next();
            if (localId.equals(next.getLocalId())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.android.thememanager.controller.local.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1912s.m7534q(next, ftiVar, countDownLatch);
                    }
                });
                Log.d(f10917k, "apply font start.");
                g1.m9743g(null, next, "fonts", strO1t, ftiVar, fontScale, fontWeight);
                try {
                    countDownLatch.await(20L, TimeUnit.SECONDS);
                    break;
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
        if (ftiVar.m4388g() != 0 && ((ThemeStatus) ftiVar.m4388g()).status == 99) {
            z2 = true;
        }
        Log.d(f10917k, "apply font " + z2);
        return z2;
    }

    private static void zy(@lvui List<LocalFontModel> fonts, LocalFontModel defaultFontModel, LocalFontModel usingModel) {
        if (usingModel != null) {
            if (defaultFontModel == null) {
                fonts.add(0, usingModel);
                return;
            } else {
                fonts.add(0, defaultFontModel);
                fonts.add(1, usingModel);
                return;
            }
        }
        if (defaultFontModel != null) {
            defaultFontModel.setUsing(true);
            fonts.add(0, defaultFontModel);
            Log.w(f10917k, "using font is null, set default using.");
        } else if (fonts.size() <= 0) {
            Log.w(f10917k, "cannot load using font because list is emytp.");
        } else {
            fonts.get(0).setUsing(true);
            Log.w(f10917k, "using font is null, set first using.");
        }
    }
}
