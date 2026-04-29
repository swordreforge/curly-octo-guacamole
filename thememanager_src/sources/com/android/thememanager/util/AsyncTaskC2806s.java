package com.android.thememanager.util;

import android.app.Activity;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.R;
import com.android.thememanager.activity.LargeIconPickerActivity;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1795s;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.database.C1960k;
import com.android.thememanager.database.ThemeDatabase;
import com.android.thememanager.detail.theme.model.OnlineResourceDetail;
import com.android.thememanager.model.LargeIconElement;
import com.android.thememanager.model.LargeIconElementRuntime;
import com.android.thememanager.module.detail.presenter.C2225g;
import com.android.thememanager.module.detail.util.C2247q;
import com.android.thememanager.module.detail.util.InterfaceC2245k;
import com.android.thememanager.router.app.entity.ThemeStatus;
import com.android.thememanager.view.C2938r;
import com.xiaomi.mipush.sdk.C5658n;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import miui.drm.DrmManager;

/* JADX INFO: renamed from: com.android.thememanager.util.s */
/* JADX INFO: compiled from: ApplyLargeIconTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class AsyncTaskC2806s extends AsyncTask<Void, Integer, k> {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f61399cdj = 800;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f61400f7l8 = "ApplyLargeIconTask";

    /* JADX INFO: renamed from: h */
    private static final int f16784h = 8;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f61401kja0 = 4;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f61402ld6 = 8;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f61403n7h = 2;

    /* JADX INFO: renamed from: p */
    private static final int f16785p = 4;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f61404qrj = 1;

    /* JADX INFO: renamed from: s */
    private static final int f16786s = 2;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f61405x2 = 16;

    /* JADX INFO: renamed from: y */
    private static final int f16787y = 1;

    /* JADX INFO: renamed from: g */
    private androidx.lifecycle.fti<ThemeStatus> f16788g;

    /* JADX INFO: renamed from: k */
    private Resource f16789k;

    /* JADX INFO: renamed from: n */
    private boolean f16790n;

    /* JADX INFO: renamed from: q */
    private androidx.lifecycle.fti<C1723y<Integer>> f16791q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private WeakReference<Activity> f61406toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private C2247q f61407zy;

    /* JADX INFO: renamed from: com.android.thememanager.util.s$k */
    /* JADX INFO: compiled from: ApplyLargeIconTask.java */
    public static class k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f61408f7l8;

        /* JADX INFO: renamed from: g */
        private boolean f16792g;

        /* JADX INFO: renamed from: k */
        private String f16793k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private boolean f61409ld6;

        /* JADX INFO: renamed from: n */
        private String f16794n;

        /* JADX INFO: renamed from: p */
        private int f16795p;

        /* JADX INFO: renamed from: q */
        private String f16796q;

        /* JADX INFO: renamed from: s */
        private String f16797s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f61410toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private ArrayList<String> f61411x2;

        /* JADX INFO: renamed from: y */
        private String f16798y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public boolean f61412zy;

        public String toString() {
            return "ApplyResult{packageName='" + this.f16793k + "', activityName='" + this.f61410toq + "', result=" + this.f61412zy + ", iconSize='" + this.f16796q + "', source='" + this.f16794n + "', isDualApp=" + this.f16792g + ", isDefault=" + this.f61408f7l8 + ", mode='" + this.f16798y + "', productId='" + this.f16797s + "', checkResult=" + this.f16795p + ", launcherResult=" + this.f61409ld6 + ", relativePackageList=" + this.f61411x2 + '}';
        }
    }

    public AsyncTaskC2806s(Resource resource, Activity activity, C2247q param, boolean withProcess, androidx.lifecycle.fti<ThemeStatus> status) {
        this.f16789k = resource;
        this.f61406toq = new WeakReference<>(activity);
        this.f61407zy = param;
        this.f16790n = withProcess;
        this.f16788g = status;
    }

    private void f7l8(int process) {
        publishProgress(Integer.valueOf(process), 100);
    }

    /* JADX INFO: renamed from: k */
    private int m9981k(ArrayList<String> packages, HashMap<String, Boolean> resultMap) {
        int i2 = 0;
        boolean z2 = packages.size() == 1;
        try {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("relativePackageList", packages);
            HashMap map = (HashMap) bf2.toq.toq().getContentResolver().call(Uri.parse("content://com.miui.home.launcher.bigicon.iconsize"), "getIconLocation", (String) null, bundle).getSerializable("allIconLocation");
            if (map == null) {
                return 0;
            }
            Iterator<String> it = packages.iterator();
            int i3 = 0;
            while (true) {
                try {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    int iIntValue = ((Integer) map.get(next)).intValue();
                    Log.d(f61400f7l8, "checkLauncherSupportApply: " + next + "," + iIntValue);
                    if ((iIntValue & 1) != 0 && !z2) {
                        i3 = 0;
                        break;
                    }
                    if ((iIntValue & 2) != 0) {
                        i3 |= 1;
                        break;
                    }
                    if ((iIntValue & 4) != 0) {
                        i3 |= 8;
                    } else {
                        if ((iIntValue & 8) != 0) {
                            i3 |= 2;
                            break;
                        }
                        if ((iIntValue & 16) != 0) {
                            i3 |= 4;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    i2 = i3;
                }
            }
            for (String str : packages) {
                resultMap.put(str, Boolean.valueOf(((Integer) map.get(str)).intValue() == 1));
            }
            return i3;
        } catch (Exception e3) {
            e = e3;
        }
        e.printStackTrace();
        return i2;
    }

    @zy.y9n
    /* JADX INFO: renamed from: q */
    private boolean m9982q(k result) {
        Bundle bundle = new Bundle();
        bundle.putString("packageName", result.f16793k);
        bundle.putString(LargeIconPickerActivity.ay, result.f61410toq);
        bundle.putBoolean(LargeIconPickerActivity.be, result.f16792g);
        bundle.putString("iconSize", result.f16796q);
        bundle.putString("source", result.f16794n);
        bundle.putBoolean(LargeIconPickerActivity.aj, result.f61408f7l8);
        bundle.putString("mode", result.f16798y);
        bundle.putString("productId", result.f16797s);
        bundle.putStringArrayList("relativePackageList", result.f61411x2);
        try {
            bf2.toq.toq().getContentResolver().call(Uri.parse("content://com.miui.home.maml_provider"), "changeLargeIcon", (String) null, bundle);
            boolean z2 = bf2.toq.toq().getContentResolver().call(Uri.parse("content://com.miui.home.launcher.bigicon.iconsize"), "convertIconSize", (String) null, bundle).getBoolean("conversionSucceeded");
            Log.d(f61400f7l8, "notifyApplySuccess() called with: result = [" + result + "],call result " + z2);
            return z2;
        } catch (Exception e2) {
            Log.e(f61400f7l8, "callProvider error:" + e2);
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Integer... values) {
        androidx.lifecycle.fti<C1723y<Integer>> ftiVar = this.f16791q;
        if (ftiVar == null) {
            return;
        }
        ftiVar.cdj(new C1723y<>(Integer.valueOf((int) ((values[0].intValue() * 100.0f) / values[1].intValue()))));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(k result) {
        super.onPostExecute(result);
        int i2 = R.string.apply_failed;
        if (result == null) {
            Log.d(f61400f7l8, "onPostExecute: ApplyResult is null");
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.apply_failed, 0);
            return;
        }
        Log.d(f61400f7l8, "onPostExecute: result info : " + result.toString());
        boolean z2 = result.f61412zy && result.f61409ld6;
        if (!z2 || result.f16795p > 0) {
            f7l8(100);
            if ((1 & result.f16795p) != 0) {
                i2 = R.string.large_icon_apply_fail_for_in_oldmode;
            } else if ((result.f16795p & 2) != 0) {
                i2 = R.string.large_icon_apply_fail_for_in_folder;
            } else if ((result.f16795p & 4) != 0) {
                i2 = R.string.large_icon_apply_fail_for_in_dock;
            } else if ((result.f16795p & 8) != 0) {
                i2 = R.string.large_icon_apply_fail_for_not_in_launcher;
            }
        } else {
            i2 = R.string.apply_succeed;
        }
        com.android.thememanager.basemodule.utils.nn86.m7150k(i2, 0);
        androidx.lifecycle.fti<ThemeStatus> ftiVar = this.f61407zy.f60529zy;
        if (ftiVar != null) {
            ThemeStatus themeStatusM4388g = ftiVar.m4388g();
            if (themeStatusM4388g == null) {
                themeStatusM4388g = new ThemeStatus(this.f61407zy.f60526f7l8);
            }
            themeStatusM4388g.status = z2 ? 98 : 97;
            this.f61407zy.f60529zy.cdj(themeStatusM4388g);
        }
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
        if ((this.f61406toq.get() instanceof InterfaceC2245k) && this.f16790n) {
            this.f16791q = ((InterfaceC2245k) this.f61406toq.get()).mo6346h();
            ((InterfaceC2245k) this.f61406toq.get()).ki(bf2.toq.toq().getResources().getString(R.string.theme_changing_dialog_title));
            f7l8(TextUtils.equals(C2225g.zm, this.f61407zy.f60527ld6) ? 30 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public k doInBackground(Void... voids) throws Throwable {
        int iM9981k;
        RelatedResource subResource;
        String[] strArr;
        if (!C1807g.m7077l() || this.f61407zy.f13157s == null) {
            return null;
        }
        try {
            Resource resource = new Resource();
            OnlineResourceDetail onlineResourceDetail = new OnlineResourceDetail();
            int qVar = com.android.thememanager.basemodule.network.theme.toq.toq();
            if (qVar == 0) {
                qVar++;
            }
            resource.setProductPrice(qVar);
            resource.setProductBought(false);
            onlineResourceDetail.bought = false;
            DrmManager.DrmResult drmResultIsLegal = DrmManager.isLegal(bf2.toq.toq(), resource.getHash(), new File(new C1795s(resource, C1791k.getInstance("largeicons")).m6970s()));
            if (resource.getProductPrice() != qVar || resource.isProductBought() || drmResultIsLegal == DrmManager.DrmResult.DRM_SUCCESS || onlineResourceDetail.toResource().isProductBought()) {
                Log.i(f61400f7l8, "apply failed");
                f7l8(100);
                return null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file = new File(p001b.f7l8.f53812ula6);
        if (!file.exists()) {
            file.mkdir();
        }
        C1821p.zy(p001b.f7l8.f53812ula6, 511);
        String[] strArrSplit = this.f61407zy.f13157s.split(C5658n.f73185t8r);
        k kVar = new k();
        kVar.f61412zy = false;
        kVar.f16794n = this.f61407zy.f60527ld6;
        kVar.f16793k = strArrSplit[0];
        if (strArrSplit.length > 1) {
            kVar.f61410toq = strArrSplit[1];
        }
        kVar.f16792g = this.f61407zy.f13155p;
        kVar.f16797s = this.f61407zy.f60526f7l8;
        ArrayList<String> arrayList = new ArrayList();
        kVar.f61411x2 = new ArrayList();
        arrayList.add(this.f61407zy.f13157s);
        C1960k c1960kX2 = ThemeDatabase.wvg(bf2.toq.toq()).mo7698t().x2(this.f61407zy.f13157s);
        if (c1960kX2 != null && (strArr = c1960kX2.f58002f7l8) != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        for (String str : arrayList) {
            if (com.android.thememanager.basemodule.utils.a9.m6999s(str.split(C5658n.f73185t8r)[0])) {
                kVar.f61411x2.add(str);
            }
        }
        String qVar2 = com.android.thememanager.basemodule.utils.fn3e.toq(true);
        if (qVar2 == null) {
            return kVar;
        }
        kVar.f16798y = qVar2;
        f7l8(40);
        try {
            HashMap<String, Boolean> map = new HashMap<>(kVar.f61411x2.size());
            iM9981k = m9981k(kVar.f61411x2, map);
            for (String str2 : map.keySet()) {
                if (map.get(str2) != null && !map.get(str2).booleanValue()) {
                    kVar.f61411x2.remove(str2);
                }
            }
            kVar.f16795p = iM9981k;
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        if (kVar.f61411x2 != null && kVar.f61411x2.size() != 0) {
            if (LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID.equals(this.f61407zy.f60526f7l8) && this.f61407zy.f13158y == 1) {
                kVar.f61408f7l8 = true;
                kVar.f61412zy = true;
                nn86.m9915q(qVar2).m9923y().m9921q(arrayList).qrj();
                kVar.f61409ld6 = m9982q(kVar);
                f7l8(100);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (jCurrentTimeMillis2 - jCurrentTimeMillis < 800) {
                    SystemClock.sleep((800 - jCurrentTimeMillis2) + jCurrentTimeMillis);
                }
                return kVar;
            }
            int i2 = com.android.thememanager.basemodule.utils.o1t.fu4() ? 511 : 493;
            Resource resource2 = this.f16789k;
            String strF7l8 = resource2 == null ? null : new C1795s(resource2, C1791k.getInstance("largeicons")).f7l8();
            Resource resource3 = this.f16789k;
            String strM6970s = resource3 == null ? null : new C1795s(resource3, C1791k.getInstance("largeicons")).m6970s();
            if (strM6970s != null && new File(strM6970s).exists()) {
                g1.m9752p(strM6970s, InterfaceC1789q.g45 + zy("largeicons", C1821p.ld6(strM6970s)));
                String str3 = nn86.m9914n(qVar2) + this.f61407zy.f13157s;
                if ((strF7l8 == null || !new File(strF7l8).exists()) && (subResource = this.f16789k.getSubResource("largeicons")) != null) {
                    strF7l8 = subResource.getContentPath();
                }
                if (strF7l8 == null || !new File(strF7l8).exists()) {
                    kVar.f61412zy = false;
                    Log.i(f61400f7l8, "Apply Failed for contentPath = " + strF7l8);
                    return kVar;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(bf2.toq.toq().getCacheDir());
                String str4 = File.separator;
                sb.append(str4);
                sb.append("largeicons");
                sb.append(str4);
                String string = sb.toString();
                C1821p.ki(string);
                ch.ch(strF7l8, string, null);
                File[] fileArrListFiles = new File(string).listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length == 1 && fileArrListFiles[0].isFile()) {
                    ch.ch(fileArrListFiles[0].getAbsolutePath(), string + "largeicons" + str4, null);
                }
                f7l8(50);
                File fileT8r = C1821p.t8r(new File(string), "transform_config.xml");
                if (fileT8r != null) {
                    if (!new File(str3).exists()) {
                        C1821p.qrj(new File(str3), i2, -1, -1);
                    }
                    if (!d8wk.zy(fileT8r.getParentFile(), new File(str3))) {
                        kVar.f61412zy = false;
                        Log.i(f61400f7l8, "Apply Failed for copy failed = " + fileT8r);
                        return kVar;
                    }
                }
                f7l8(60);
                C1821p.m7187n(new File(str3).getParentFile().getAbsolutePath(), i2);
                LargeIconElementRuntime largeIconElementRuntime = new LargeIconElementRuntime();
                largeIconElementRuntime.packageName = this.f61407zy.f13157s;
                largeIconElementRuntime.isPairApp = false;
                largeIconElementRuntime.path = str3;
                largeIconElementRuntime.version = 1;
                largeIconElementRuntime.updateTime = System.currentTimeMillis();
                Resource resource4 = this.f16789k;
                largeIconElementRuntime.localId = resource4 == null ? null : resource4.getLocalId();
                largeIconElementRuntime.isOfficialResource = TextUtils.equals(LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID, this.f61407zy.f60526f7l8);
                String onlineId = this.f61407zy.f60526f7l8;
                if (onlineId == null) {
                    Resource resource5 = this.f16789k;
                    onlineId = resource5 == null ? null : resource5.getOnlineId();
                }
                largeIconElementRuntime.uuid = onlineId;
                largeIconElementRuntime.size = C2938r.toq(this.f61407zy.f13158y);
                Resource resource6 = this.f16789k;
                largeIconElementRuntime.hash = resource6 == null ? null : resource6.getHash();
                Resource resource7 = this.f16789k;
                largeIconElementRuntime.resourceName = resource7 != null ? resource7.getTitle() : null;
                f7l8(80);
                nn86.m9915q(qVar2).m9923y().x2(kVar.f61411x2, largeIconElementRuntime).qrj();
                kVar.f16795p = iM9981k;
                kVar.f61408f7l8 = false;
                kVar.f16796q = largeIconElementRuntime.size;
                kVar.f61412zy = true;
                kVar.f61409ld6 = m9982q(kVar);
                f7l8(100);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                if (jCurrentTimeMillis3 - jCurrentTimeMillis < 800) {
                    SystemClock.sleep((800 - jCurrentTimeMillis3) + jCurrentTimeMillis);
                }
                return kVar;
            }
            Log.d(f61400f7l8, "Apply Failed for rightPath is null or rightPath file not exist");
            kVar.f61412zy = false;
            f7l8(100);
            return kVar;
        }
        kVar.f61412zy = false;
        Log.i(f61400f7l8, "relativePackageList is empty");
        f7l8(100);
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        if (jCurrentTimeMillis4 - jCurrentTimeMillis < 800) {
            SystemClock.sleep((800 - jCurrentTimeMillis4) + jCurrentTimeMillis);
        }
        return kVar;
    }

    public String zy(String resourceCode, String originalName) {
        return resourceCode + "_" + originalName;
    }
}
