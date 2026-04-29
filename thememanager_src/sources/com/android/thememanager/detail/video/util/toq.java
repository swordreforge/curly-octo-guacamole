package com.android.thememanager.detail.video.util;

import com.android.thememanager.C2320q;
import com.android.thememanager.basemodule.local.InterfaceC1755y;
import com.android.thememanager.basemodule.local.ld6;
import com.android.thememanager.basemodule.local.zy;
import com.android.thememanager.detail.video.model.VideoResource;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: DownloadManagerServiceController.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq implements com.android.thememanager.basemodule.local.zy {

    /* JADX INFO: renamed from: g */
    private static C7918toq f11471g;

    /* JADX INFO: renamed from: k */
    private ld6 f11472k = ld6.t8r();

    /* JADX INFO: renamed from: n */
    private zy.InterfaceC1756k f11473n;

    /* JADX INFO: renamed from: q */
    private final VideoResource f11474q;

    /* JADX INFO: renamed from: com.android.thememanager.detail.video.util.toq$k */
    /* JADX INFO: compiled from: DownloadManagerServiceController.java */
    class C2012k implements ld6.InterfaceC1747n {
        C2012k() {
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        public String f7l8() {
            return com.android.thememanager.basemodule.local.toq.m6855k(toq.this.f11474q.getDownloadFilePath());
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        /* JADX INFO: renamed from: g */
        public String mo6831g() {
            return toq.this.f11474q.getDownloadUrl();
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        public String getTaskId() {
            return toq.this.f11474q.getDownloadTaskId();
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        public String getTitle() {
            return toq.this.f11474q.getDisplayName();
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        /* JADX INFO: renamed from: k */
        public String mo6832k() {
            return null;
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        public String ld6() {
            return "wallpaper";
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        /* JADX INFO: renamed from: n */
        public int mo6833n() {
            return 0;
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        /* JADX INFO: renamed from: p */
        public int mo6834p() {
            return 0;
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        /* JADX INFO: renamed from: q */
        public void mo6835q() {
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        public long qrj() {
            return toq.this.f11474q.getOriginFileSizeBytes();
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        /* JADX INFO: renamed from: s */
        public String mo6836s() {
            return null;
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        /* JADX INFO: renamed from: y */
        public String mo6837y() {
            return null;
        }

        @Override // com.android.thememanager.basemodule.local.ld6.InterfaceC1747n
        public String zy() {
            return f7l8() + ld6.f9961b;
        }
    }

    static {
        C7918toq c7918toq = new C7918toq(null);
        f11471g = c7918toq;
        C2320q.m8478g(c7918toq);
    }

    public toq(VideoResource resource) {
        this.f11474q = resource;
    }

    @Override // com.android.thememanager.basemodule.local.zy
    /* JADX INFO: renamed from: k */
    public void mo6857k() {
        if (this.f11472k.m6824h(this.f11474q.getDownloadTaskId()) == ld6.EnumC1748q.STATUS_NONE) {
            this.f11472k.x2(new C2012k(), true);
        }
    }

    @Override // com.android.thememanager.basemodule.local.zy
    /* JADX INFO: renamed from: n */
    public void mo6858n() {
        this.f11472k.m6825t(this.f11474q.getDownloadTaskId());
    }

    @Override // com.android.thememanager.basemodule.local.zy
    /* JADX INFO: renamed from: q */
    public void mo6859q() {
        this.f11472k.o1t(this.f11474q.getDownloadTaskId());
    }

    @Override // com.android.thememanager.basemodule.local.zy
    public void toq(zy.InterfaceC1756k listener) {
        this.f11473n = listener;
        f11471g.zy(this.f11474q.getDownloadTaskId(), listener);
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.video.util.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DownloadManagerServiceController.java */
    private static class C7918toq implements InterfaceC1755y {

        /* JADX INFO: renamed from: k */
        private final HashMap<String, WeakReference<zy.InterfaceC1756k>> f11476k;

        /* JADX INFO: renamed from: q */
        private ld6 f11477q;

        private C7918toq() {
            this.f11476k = new HashMap<>();
            this.f11477q = ld6.t8r();
        }

        /* JADX INFO: renamed from: k */
        private synchronized void m7847k() {
            Iterator<Map.Entry<String, WeakReference<zy.InterfaceC1756k>>> it = this.f11476k.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().get() == null) {
                    it.remove();
                }
            }
        }

        private synchronized zy.InterfaceC1756k toq(String taskId) {
            WeakReference<zy.InterfaceC1756k> weakReference = this.f11476k.get(taskId);
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
        public void handleDownloadComplete(String downloadPath, String assemblyId, String extraData, boolean downloadSuccess, int downloadFailCode, String... extras) {
            zy.InterfaceC1756k qVar = toq(assemblyId);
            if (qVar != null) {
                qVar.toq(downloadSuccess ? ld6.EnumC1748q.STATUS_SUCCESS : ld6.EnumC1748q.STATUS_FAILED);
            }
            m7847k();
        }

        @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
        public void handleDownloadProgressUpdate(String downloadPath, String assemblyId, String extraData, int currBytes, int totalBytes) {
            zy.InterfaceC1756k qVar = toq(assemblyId);
            if (qVar != null) {
                qVar.mo6442k(totalBytes, currBytes);
            }
        }

        @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
        public void handleDownloadStatusChange(String downloadPath, String assemblyId, String extraData, ld6.EnumC1748q currStatus, int currBytes, int totalBytes) {
            zy.InterfaceC1756k qVar = toq(assemblyId);
            if (qVar != null) {
                qVar.toq(this.f11477q.m6824h(assemblyId));
            }
        }

        synchronized void zy(String taskId, zy.InterfaceC1756k listener) {
            this.f11476k.put(taskId, new WeakReference<>(listener));
        }

        /* synthetic */ C7918toq(C2012k c2012k) {
            this();
        }
    }
}
