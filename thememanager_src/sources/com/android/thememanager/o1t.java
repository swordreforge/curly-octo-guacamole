package com.android.thememanager;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.android.thememanager.basemodule.analysis.zy;
import com.android.thememanager.basemodule.local.C1743g;
import com.android.thememanager.basemodule.local.InterfaceC1755y;
import com.android.thememanager.basemodule.local.ld6;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.ek5k;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.controller.local.C1910p;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.C1922n;
import com.android.thememanager.controller.online.C1944y;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.util.ch;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: ResourceDownloadManager.java */
/* JADX INFO: loaded from: classes.dex */
public class o1t implements com.android.thememanager.basemodule.resource.constants.toq {

    /* JADX INFO: renamed from: g */
    private static final String f13437g = "ResourceDownloadManager";

    /* JADX INFO: renamed from: s */
    private static final String f13438s = "resourceDownload|";

    /* JADX INFO: renamed from: y */
    private static final int f13439y = 2;

    /* JADX INFO: renamed from: n */
    protected final com.android.thememanager.basemodule.local.ld6 f13441n;

    /* JADX INFO: renamed from: k */
    private final List<InterfaceC1755y> f13440k = new ArrayList();

    /* JADX INFO: renamed from: q */
    private final Handler f13442q = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.android.thememanager.o1t$k */
    /* JADX INFO: compiled from: ResourceDownloadManager.java */
    class C2306k implements ld6.f7l8 {

        /* JADX INFO: renamed from: com.android.thememanager.o1t$k$k */
        /* JADX INFO: compiled from: ResourceDownloadManager.java */
        class k implements Runnable {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ String f13444g;

            /* JADX INFO: renamed from: k */
            final /* synthetic */ ld6.EnumC1748q f13445k;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ String f13446n;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ String f13448q;

            /* JADX INFO: renamed from: s */
            final /* synthetic */ String[] f13449s;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ int f13450y;

            k(final ld6.EnumC1748q val$currStatus, final String val$savePath, final String val$taskId, final String val$extraData, final int val$downloadFailCode, final String[] val$extras) {
                this.f13445k = val$currStatus;
                this.f13448q = val$savePath;
                this.f13446n = val$taskId;
                this.f13444g = val$extraData;
                this.f13450y = val$downloadFailCode;
                this.f13449s = val$extras;
            }

            @Override // java.lang.Runnable
            public void run() {
                ld6.EnumC1748q enumC1748q = this.f13445k;
                if (enumC1748q == ld6.EnumC1748q.STATUS_SUCCESS || enumC1748q == ld6.EnumC1748q.STATUS_FAILED) {
                    Iterator it = o1t.this.f13440k.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1755y) it.next()).handleDownloadComplete(this.f13448q, this.f13446n, this.f13444g, this.f13445k == ld6.EnumC1748q.STATUS_SUCCESS, this.f13450y, this.f13449s);
                    }
                } else {
                    Iterator it2 = o1t.this.f13440k.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1755y) it2.next()).handleDownloadStatusChange(this.f13448q, this.f13446n, this.f13444g, this.f13445k, 0, 0);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.o1t$k$toq */
        /* JADX INFO: compiled from: ResourceDownloadManager.java */
        class toq implements Runnable {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ int f13451g;

            /* JADX INFO: renamed from: k */
            final /* synthetic */ String f13452k;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ String f13453n;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ String f13454q;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ int f13456y;

            toq(final String val$savePath, final String val$taskId, final String val$extraData, final int val$currBytes, final int val$totalBytes) {
                this.f13452k = val$savePath;
                this.f13454q = val$taskId;
                this.f13453n = val$extraData;
                this.f13451g = val$currBytes;
                this.f13456y = val$totalBytes;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator it = o1t.this.f13440k.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1755y) it.next()).handleDownloadProgressUpdate(this.f13452k, this.f13454q, this.f13453n, this.f13451g, this.f13456y);
                }
            }
        }

        C2306k() {
        }

        @Override // com.android.thememanager.basemodule.local.ld6.f7l8
        /* JADX INFO: renamed from: k */
        public void mo6826k(final String savePath, final String taskId, final String extraData, final int currBytes, final int totalBytes) {
            o1t.this.f13442q.post(new toq(savePath, taskId, extraData, currBytes, totalBytes));
        }

        @Override // com.android.thememanager.basemodule.local.ld6.f7l8
        public void toq(final String savePath, final String taskId, final String extraData, final ld6.EnumC1748q currStatus, final int downloadFailCode, final String... extras) {
            Log.d(o1t.f13437g, "onDownloadStatusChange: DownloadStatus = " + currStatus + " downloadFailCode = " + downloadFailCode + " taskId = " + taskId);
            o1t.this.f13442q.post(new k(currStatus, savePath, taskId, extraData, downloadFailCode, extras));
        }
    }

    /* JADX INFO: compiled from: ResourceDownloadManager.java */
    private static class zy extends toq {
        public zy(String url, String savePath, String title, String taskId, String extraData) {
            super(url, savePath, title, taskId, extraData);
        }

        @Override // com.android.thememanager.o1t.toq, com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        /* JADX INFO: renamed from: q */
        public void mo6835q() {
            this.f60597toq = this.f13458k;
        }
    }

    protected o1t() {
        com.android.thememanager.basemodule.local.ld6 ld6VarT8r = com.android.thememanager.basemodule.local.ld6.t8r();
        this.f13441n = ld6VarT8r;
        ld6VarT8r.mcp(2);
        ld6VarT8r.wvg(new C2306k());
    }

    public static String f7l8(Resource resource, fu4 context) {
        return resource.getDownloadPath() != null ? resource.getDownloadPath() : m8430y(new ResourceResolver(resource, context).getDownloadFolder(), resource.getTitle(), resource.getOnlineId(), context.getResourceExtension(), context.isSelfDescribing());
    }

    /* JADX INFO: renamed from: s */
    public static String m8429s(Resource resource, fu4 context, zy.C1711k info) {
        if (resource.getOnlinePath() != null) {
            return resource.getOnlinePath();
        }
        if (info == null || !info.f9808n) {
            String onlineId = resource.getOnlineId();
            if (!TextUtils.isEmpty(onlineId)) {
                return new com.android.thememanager.controller.online.ld6(context).a9(onlineId, info).getFinalGetUrl();
            }
            Log.w(f13437g, "onlineId is empty");
            return null;
        }
        Resource resourceKja0 = C1792n.kja0(resource, context.getNewResourceContext());
        if (resourceKja0 != null) {
            resource = resourceKja0;
        }
        String hash = resource.getHash();
        if (TextUtils.isEmpty(hash)) {
            return null;
        }
        return new com.android.thememanager.controller.online.ld6(context).wo(hash, resource.getOnlineId(), info).getFinalGetUrl();
    }

    private String x2(Resource res) {
        String assemblyId = res.getAssemblyId();
        return TextUtils.isEmpty(assemblyId) ? res.getOnlineId() : assemblyId;
    }

    /* JADX INFO: renamed from: y */
    public static String m8430y(String downloadFolder, String title, String onlineId, String extension, boolean isSelfDescribing) {
        if (TextUtils.isEmpty(onlineId)) {
            return null;
        }
        if (isSelfDescribing && !TextUtils.isEmpty(title)) {
            onlineId = ch.m9680q(title, onlineId);
        }
        return downloadFolder + onlineId + extension;
    }

    public boolean cdj(String taskId) {
        return this.f13441n.m6824h(taskId) == ld6.EnumC1748q.STATUS_PAUSED;
    }

    /* JADX INFO: renamed from: g */
    public void m8431g(Resource resource, fu4 resContext, zy.C1711k info, boolean immediateExecute) throws Throwable {
        Resource resourceM28251clone = resource.m28251clone();
        String strM8429s = m8429s(resourceM28251clone, resContext, info);
        String strF7l8 = f7l8(resourceM28251clone, resContext);
        resourceM28251clone.setOnlinePath(strM8429s);
        resourceM28251clone.setDownloadPath(strF7l8);
        if (ek5k.m7044n(strM8429s) == null) {
            return;
        }
        if (!resContext.isSelfDescribing()) {
            File file = new File(resContext.getAsyncImportFolder());
            File file2 = new File(file, resourceM28251clone.getOnlineId() + com.android.thememanager.basemodule.resource.constants.toq.n5);
            File file3 = new File(file, resourceM28251clone.getOnlineId());
            try {
                file.mkdirs();
                C1821p.m7190s(file.getPath());
                new C1910p(resContext).toq(file2, resourceM28251clone);
                new com.android.thememanager.controller.local.zy().toq(file3, resContext);
            } catch (C1743g e2) {
                Log.e(f13437g, "downloadResource throw exception : ", e2);
            }
        }
        if (this.f13441n.m6824h(x2(resourceM28251clone)) == ld6.EnumC1748q.STATUS_NONE) {
            if ("spwallpaper".equals(resContext.getResourceCode())) {
                this.f13441n.x2(new zy(strM8429s, strF7l8, resourceM28251clone.getTitle(), x2(resourceM28251clone), resContext.getResourceCode()), immediateExecute);
            } else {
                this.f13441n.x2(new toq(strM8429s, strF7l8, resourceM28251clone.getTitle(), x2(resourceM28251clone), resContext.getResourceCode(), resource.getOnlineInfo().getTrackId()), immediateExecute);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m8432h(Resource r2) {
        return this.f13441n.m6824h(x2(r2)) == ld6.EnumC1748q.STATUS_PAUSED;
    }

    /* JADX INFO: renamed from: i */
    public void m8433i(Resource resource) {
        this.f13441n.m6825t(x2(resource));
    }

    public void ki(Resource resource) {
        this.f13441n.o1t(x2(resource));
    }

    @Deprecated
    public boolean kja0(Resource r2) {
        ld6.EnumC1748q enumC1748qM6824h = this.f13441n.m6824h(r2.getAssemblyId());
        if (!com.android.thememanager.basemodule.local.ld6.ni7(enumC1748qM6824h)) {
            enumC1748qM6824h = this.f13441n.m6824h(r2.getOnlineId());
        }
        return com.android.thememanager.basemodule.local.ld6.ni7(enumC1748qM6824h);
    }

    public int ld6(Resource r2) {
        ld6.EnumC1748q enumC1748qM6824h = this.f13441n.m6824h(r2.getAssemblyId());
        if (enumC1748qM6824h == ld6.EnumC1748q.STATUS_NONE) {
            enumC1748qM6824h = this.f13441n.m6824h(r2.getOnlineId());
        }
        if (enumC1748qM6824h == ld6.EnumC1748q.STATUS_DOWNLOADING) {
            return R.string.resource_downloading;
        }
        if (enumC1748qM6824h == ld6.EnumC1748q.STATUS_PENDING || enumC1748qM6824h == ld6.EnumC1748q.STATUS_WAITING) {
            return R.string.resource_waiting_download;
        }
        if (enumC1748qM6824h == ld6.EnumC1748q.STATUS_PAUSED) {
            return R.string.resource_waiting_pause;
        }
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public void m8434n(Resource resource, fu4 resContext, zy.C1711k info) {
        m8431g(resource, resContext, info, true);
    }

    public boolean n7h(Resource r2) {
        return com.android.thememanager.basemodule.local.ld6.ni7(this.f13441n.m6824h(x2(r2)));
    }

    /* JADX INFO: renamed from: p */
    public List<ld6.C1749s> m8435p() {
        return this.f13441n.ki();
    }

    /* JADX INFO: renamed from: q */
    public void m8436q(Resource resource, fu4 resContext) {
        zy.C1711k c1711k = new zy.C1711k();
        c1711k.f57496toq = com.android.thememanager.basemodule.analysis.f7l8.m6613s();
        c1711k.f57497zy = com.android.thememanager.basemodule.analysis.f7l8.m6614y();
        c1711k.f9807k = com.android.thememanager.basemodule.analysis.f7l8.m6607g();
        m8434n(resource, resContext, c1711k);
    }

    public boolean qrj() {
        return this.f13441n.cdj() > 0;
    }

    public void t8r(InterfaceC1755y l2) {
        y9n.m7255s();
        this.f13440k.remove(l2);
    }

    public void zy(InterfaceC1755y l2) {
        y9n.m7255s();
        if (this.f13440k.contains(l2)) {
            return;
        }
        this.f13440k.add(l2);
    }

    /* JADX INFO: compiled from: ResourceDownloadManager.java */
    public static class toq implements ld6.InterfaceC1747n {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        protected String f60595f7l8;

        /* JADX INFO: renamed from: g */
        protected String f13457g;

        /* JADX INFO: renamed from: k */
        protected String f13458k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        protected int f60596ld6;

        /* JADX INFO: renamed from: n */
        protected String f13459n;

        /* JADX INFO: renamed from: p */
        protected String f13460p;

        /* JADX INFO: renamed from: q */
        protected String f13461q;

        /* JADX INFO: renamed from: s */
        protected int f13462s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        protected String f60597toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        protected String f60598x2;

        /* JADX INFO: renamed from: y */
        protected long f13463y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        protected String f60599zy;

        public toq(String url, String savePath, String title, String taskId, String extraData) {
            this.f13458k = url;
            this.f60599zy = com.android.thememanager.basemodule.local.toq.m6855k(savePath);
            this.f13461q = title;
            this.f13459n = taskId;
            this.f13457g = extraData;
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        public String f7l8() {
            return this.f60599zy;
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        /* JADX INFO: renamed from: g */
        public String mo6831g() {
            return this.f60597toq;
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        public String getTaskId() {
            return this.f13459n;
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        public String getTitle() {
            return this.f13461q;
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        /* JADX INFO: renamed from: k */
        public String mo6832k() {
            return this.f13460p;
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        public String ld6() {
            return this.f13457g;
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        /* JADX INFO: renamed from: n */
        public int mo6833n() {
            return this.f13462s;
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        /* JADX INFO: renamed from: p */
        public int mo6834p() {
            return this.f60596ld6;
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        /* JADX INFO: renamed from: q */
        public void mo6835q() {
            Object obj;
            y9n.m7257y();
            try {
                com.android.thememanager.controller.online.zurt zurtVar = new com.android.thememanager.controller.online.zurt(this.f13458k);
                zurtVar.setHostProxyType(zurt.EnumC1946k.API_PROXY);
                Pair<Integer, JSONObject> pairKi = C1944y.ki(C1915g.f7l8(zurtVar));
                if (((Integer) pairKi.first).intValue() != 0 || (obj = pairKi.second) == null) {
                    this.f13462s = com.android.thememanager.basemodule.local.ld6.f9969r;
                    this.f60596ld6 = ((Integer) pairKi.first).intValue();
                    this.f13460p = "resourceDownload|SERVER(" + this.f60596ld6 + ")";
                } else {
                    this.f60597toq = ((JSONObject) obj).optString("downloadUrl", "");
                    this.f60595f7l8 = ((JSONObject) pairKi.second).optString(InterfaceC1925p.g3a, "");
                    this.f13463y = ((JSONObject) pairKi.second).optLong(InterfaceC1925p.pkq2);
                }
            } catch (C1922n e2) {
                this.f13462s = com.android.thememanager.basemodule.local.ld6.f9966l;
                this.f60596ld6 = e2.getResponseCode();
                this.f13460p = "resourceDownload|HTTP(" + this.f60596ld6 + "," + e2.getResponseReason() + ")";
            } catch (IOException e3) {
                this.f13462s = com.android.thememanager.basemodule.local.ld6.f9966l;
                this.f13460p = "resourceDownload|HTTP(" + e3.toString() + ")";
            } catch (Exception e4) {
                this.f13462s = com.android.thememanager.basemodule.local.ld6.f9964f;
                this.f13460p = "resourceDownload|RUNTIME(" + e4.toString() + ")";
            }
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        public long qrj() {
            return this.f13463y;
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        /* JADX INFO: renamed from: s */
        public String mo6836s() {
            return this.f60598x2;
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        /* JADX INFO: renamed from: y */
        public String mo6837y() {
            return this.f60595f7l8;
        }

        public toq(String url, String savePath, String title, String taskId, String extraData, String trackId) {
            this.f13458k = url;
            this.f60599zy = com.android.thememanager.basemodule.local.toq.m6855k(savePath);
            this.f13461q = title;
            this.f13459n = taskId;
            this.f13457g = extraData;
            this.f60598x2 = trackId;
        }
    }
}
