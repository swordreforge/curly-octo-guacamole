package com.android.thememanager;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Pair;
import com.android.thememanager.basemodule.local.C1743g;
import com.android.thememanager.basemodule.local.InterfaceC1755y;
import com.android.thememanager.basemodule.local.ld6;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.local.C1910p;
import com.android.thememanager.service.C2497p;
import ek5k.C6002g;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.android.thememanager.r */
/* JADX INFO: compiled from: ThemeImportScanManager.java */
/* JADX INFO: loaded from: classes.dex */
public class C2322r implements com.android.thememanager.basemodule.resource.constants.toq {

    /* JADX INFO: renamed from: h */
    protected static Map<String, Integer> f13528h = null;

    /* JADX INFO: renamed from: p */
    private static final String f13529p = "import_new_download_scanner_tag";

    /* JADX INFO: renamed from: g */
    protected lvui f13530g;

    /* JADX INFO: renamed from: n */
    private volatile boolean f13532n;

    /* JADX INFO: renamed from: y */
    protected Context f13535y;

    /* JADX INFO: renamed from: k */
    protected Map<String, zy> f13531k = new HashMap();

    /* JADX INFO: renamed from: q */
    private final Object f13533q = new Object();

    /* JADX INFO: renamed from: s */
    private boolean f13534s = true;

    /* JADX INFO: renamed from: com.android.thememanager.r$k */
    /* JADX INFO: compiled from: ThemeImportScanManager.java */
    class k implements InterfaceC1755y {
        k() {
        }

        @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
        public void handleDownloadComplete(String downloadPath, String assemblyId, String extraData, boolean downloadSuccess, int downloadFailCode, String... extras) {
            if (downloadSuccess) {
                C2322r.this.m8504y(downloadPath, assemblyId, extraData);
            }
        }

        @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
        public void handleDownloadProgressUpdate(String downloadPath, String assemblyId, String extraData, int currBytes, int totalBytes) {
        }

        @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
        public void handleDownloadStatusChange(String downloadPath, String assemblyId, String extraData, ld6.EnumC1748q currStatus, int currBytes, int totalBytes) {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.r$toq */
    /* JADX INFO: compiled from: ThemeImportScanManager.java */
    private class toq extends AsyncTask<Void, Void, Void> {
        private toq() {
        }

        private zy toq() {
            synchronized (C2322r.this.f13531k) {
                int iF7l8 = -1;
                String str = null;
                for (String str2 : C2322r.this.f13531k.keySet()) {
                    if (iF7l8 < C2322r.this.f7l8(str2)) {
                        iF7l8 = C2322r.this.f7l8(str2);
                        str = str2;
                    }
                }
                if (str == null) {
                    return null;
                }
                return C2322r.this.f13531k.get(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... params) {
            zy qVar;
            while (true) {
                synchronized (C2322r.this.f13531k) {
                    qVar = toq();
                    if (qVar == null) {
                        return null;
                    }
                    C2322r.this.f13531k.remove(qVar.m8507k());
                }
                qVar.m8508q();
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            boolean z2;
            if (C2322r.this.f13532n) {
                z2 = false;
            } else {
                synchronized (C2322r.this.f13533q) {
                    z2 = true;
                    if (C2322r.this.f13532n) {
                        z2 = false;
                    } else {
                        C2322r.this.f13532n = true;
                    }
                }
            }
            if (!z2) {
                cancel(false);
            }
            super.onPreExecute();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void result) {
            C2322r.this.f13532n = false;
            super.onPostExecute(result);
        }

        /* synthetic */ toq(C2322r c2322r, k kVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.r$zy */
    /* JADX INFO: compiled from: ThemeImportScanManager.java */
    private class zy {

        /* JADX INFO: renamed from: k */
        protected fu4 f13538k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        protected Map<String, Pair<fu4, Resource>> f60625toq = new HashMap();

        public zy(fu4 resContext) {
            this.f13538k = resContext;
        }

        /* JADX INFO: renamed from: n */
        private void m8506n() {
            File file;
            fu4 fu4VarMo7535k;
            Resource resourceMo6852k;
            String downloadPath;
            C1910p c1910p = new C1910p(this.f13538k);
            com.android.thememanager.controller.local.zy zyVar = new com.android.thememanager.controller.local.zy();
            File file2 = new File(this.f13538k.getAsyncImportFolder());
            if (!file2.exists()) {
                if (file2.isDirectory()) {
                    return;
                }
                file2.delete();
                return;
            }
            File[] fileArrListFiles = file2.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file3 : fileArrListFiles) {
                String name = file3.getName();
                if (!name.equals(com.android.thememanager.basemodule.resource.constants.toq.dmt)) {
                    if (name.endsWith(com.android.thememanager.basemodule.resource.constants.toq.n5)) {
                        file = new File(this.f13538k.getAsyncImportFolder() + name.substring(0, name.indexOf(com.android.thememanager.basemodule.resource.constants.toq.n5)));
                        if (file.exists()) {
                            fu4VarMo7535k = null;
                            try {
                                resourceMo6852k = c1910p.mo6852k(file3);
                            } catch (C1743g unused) {
                                resourceMo6852k = null;
                            }
                            try {
                                fu4VarMo7535k = zyVar.mo7535k(file);
                            } catch (C1743g unused2) {
                                file3.delete();
                                file.delete();
                            }
                            if (resourceMo6852k != null && fu4VarMo7535k != null && !C2082k.zy().m8000g().n7h(resourceMo6852k) && (downloadPath = resourceMo6852k.getDownloadPath()) != null) {
                                if (!new File(downloadPath).exists()) {
                                    file3.delete();
                                    file.delete();
                                } else if (C2322r.this.f13530g.f7l8(resourceMo6852k)) {
                                    continue;
                                } else {
                                    synchronized (this.f60625toq) {
                                        this.f60625toq.put(downloadPath, new Pair<>(fu4VarMo7535k, resourceMo6852k));
                                    }
                                }
                            }
                        } else {
                            file3.delete();
                        }
                    } else {
                        File file4 = new File(this.f13538k.getAsyncImportFolder() + name + com.android.thememanager.basemodule.resource.constants.toq.n5);
                        if (file4.exists()) {
                            file = file3;
                            file3 = file4;
                            fu4VarMo7535k = null;
                            resourceMo6852k = c1910p.mo6852k(file3);
                            fu4VarMo7535k = zyVar.mo7535k(file);
                            if (resourceMo6852k != null) {
                                continue;
                            }
                        } else {
                            file3.delete();
                        }
                    }
                }
            }
        }

        private boolean zy() {
            return true;
        }

        /* JADX INFO: renamed from: k */
        public String m8507k() {
            return C2322r.f13529p;
        }

        /* JADX INFO: renamed from: q */
        public void m8508q() {
            m8506n();
            if (zy()) {
                toq();
            }
        }

        protected void toq() {
            Iterator<String> it = this.f60625toq.keySet().iterator();
            while (it.hasNext()) {
                Pair<fu4, Resource> pair = this.f60625toq.get(it.next());
                C2322r.this.f13530g.m8164n((fu4) pair.first, (Resource) pair.second);
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f13528h = map;
        map.put(f13529p, 1);
    }

    protected C2322r() {
        ThemeApplication qVar = C2082k.zy().toq();
        this.f13535y = qVar;
        this.f13530g = m8502g(qVar);
        C2082k.zy().m8000g().zy(new k());
        C2497p.x2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int f7l8(String ScannerTag) {
        if (f13528h.get(ScannerTag) != null) {
            return f13528h.get(ScannerTag).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: n */
    private toq m8499n() {
        return new toq(this, null);
    }

    /* JADX INFO: renamed from: p */
    private void m8500p() {
        m8499n().executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    /* JADX INFO: renamed from: g */
    protected lvui m8502g(Context context) {
        return new lvui(context);
    }

    /* JADX INFO: renamed from: s */
    public void m8503s(fu4 resContext, boolean forceScan) {
        if (forceScan || this.f13534s) {
            this.f13534s = false;
            zy zyVar = new zy(resContext);
            synchronized (this.f13531k) {
                this.f13531k.put(zyVar.m8507k(), zyVar);
            }
            m8500p();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m8504y(String storedPath, String assemblyId, String extraData) {
        fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g(extraData);
        if (fu4VarM10535g.isSelfDescribing()) {
            return;
        }
        m8503s(fu4VarM10535g, true);
    }
}
