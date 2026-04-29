package com.android.thememanager.ad.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.basemodule.views.InterfaceC1852k;
import ek5k.C6002g;
import hb.C6072k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: AdDownloadManager.java */
/* JADX INFO: loaded from: classes.dex */
public class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f57379f7l8 = "errorCode";

    /* JADX INFO: renamed from: g */
    private static toq f9512g = null;

    /* JADX INFO: renamed from: h */
    private static final String f9513h = "progress";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f57380kja0 = -5;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f57381ld6 = -1;

    /* JADX INFO: renamed from: n */
    private static final String f9514n = "AdDownloadManager";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f57382n7h = -4;

    /* JADX INFO: renamed from: p */
    private static final int f9515p = 0;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f57383qrj = -3;

    /* JADX INFO: renamed from: s */
    private static final String f9516s = "status";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f57384x2 = -2;

    /* JADX INFO: renamed from: y */
    private static final String f9517y = "packageName";

    /* JADX INFO: renamed from: k */
    private final ArrayList<WeakReference<InterfaceC1852k>> f9518k = new ArrayList<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final ArrayList<WeakReference<zy>> f57385toq = new ArrayList<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Map<String, Integer> f57386zy = new HashMap();

    /* JADX INFO: renamed from: q */
    private final Map<String, C6072k> f9519q = new HashMap();

    /* JADX INFO: renamed from: com.android.thememanager.ad.download.toq$k */
    /* JADX INFO: compiled from: AdDownloadManager.java */
    public class C1649k extends BroadcastReceiver {
        public C1649k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            toq.this.ld6(intent);
        }
    }

    public toq() {
        qrj();
    }

    /* JADX INFO: renamed from: g */
    private void m6514g(String packageName) {
        Iterator<WeakReference<zy>> it = this.f57385toq.iterator();
        while (it.hasNext()) {
            zy zyVar = it.next().get();
            C6072k c6072k = this.f9519q.get(packageName);
            if (zyVar != null && c6072k != null) {
                zyVar.mo6522k(packageName, c6072k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ld6(final Intent intent) {
        C6002g.fn3e(new Runnable() { // from class: com.android.thememanager.ad.download.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f9510k.m6517p(intent);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    private String m6516n(hb.toq downLoadRequest) {
        if (!TextUtils.isEmpty(downLoadRequest.f35096y)) {
            return downLoadRequest.f35096y;
        }
        return "market://details/detailfloat?packageName=" + downLoadRequest.f35091k + "&ref=" + downLoadRequest.f77071toq + "&appClientId=" + downLoadRequest.f77073zy + "&senderPackageName=" + downLoadRequest.f35094q + "&appSignature=" + downLoadRequest.f35092n + "&nonce=" + downLoadRequest.f35090g + "&extra_query_params=" + downLoadRequest.f77069f7l8 + "&show_cta=" + downLoadRequest.f35095s + "&overlayPosition=" + downLoadRequest.f35093p + "&startDownload=" + downLoadRequest.f77070ld6 + "&launchWhenInstalled=" + downLoadRequest.f77072x2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m6517p(android.content.Intent r13) {
        /*
            r12 = this;
            java.lang.String r0 = "errorCode"
            r1 = 0
            int r0 = r13.getIntExtra(r0, r1)
            java.lang.String r2 = "packageName"
            java.lang.String r2 = r13.getStringExtra(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L1b
            java.lang.String r13 = "AdDownloadManager"
            java.lang.String r0 = "pkgName is empty."
            android.util.Log.d(r13, r0)
            return
        L1b:
            java.util.Map<java.lang.String, hb.k> r3 = r12.f9519q
            java.lang.Object r3 = r3.get(r2)
            hb.k r3 = (hb.C6072k) r3
            if (r3 != 0) goto L31
            hb.k r3 = new hb.k
            r3.<init>()
            r3.f77067toq = r2
            java.util.Map<java.lang.String, hb.k> r4 = r12.f9519q
            r4.put(r2, r3)
        L31:
            r3.f35087k = r0
            r4 = -8
            r5 = 5
            r6 = 1
            if (r0 == r4) goto L8c
            r4 = -6
            if (r0 == r4) goto L8c
            r4 = -5
            if (r0 == r4) goto L8c
            r7 = -4
            if (r0 == r7) goto L8c
            r8 = -3
            if (r0 == r8) goto L8c
            r9 = -2
            if (r0 == r9) goto L8c
            if (r0 == r6) goto L86
            r10 = 2
            if (r0 == r10) goto L81
            r11 = 4
            if (r0 == r11) goto L7e
            if (r0 == r5) goto L58
            int r13 = r3.f35089q
            if (r13 != 0) goto L8a
            r3.f35089q = r5
            goto L8e
        L58:
            java.lang.String r5 = "progress"
            int r5 = r13.getIntExtra(r5, r1)
            java.lang.String r11 = "status"
            int r13 = r13.getIntExtra(r11, r1)
            r3.f77068zy = r13
            if (r13 == r4) goto L79
            if (r13 == r7) goto L75
            if (r13 == r8) goto L72
            if (r13 == r9) goto L79
            r4 = -1
            if (r13 == r4) goto L79
            goto L7b
        L72:
            r3.f35089q = r10
            goto L7b
        L75:
            r13 = 3
            r3.f35089q = r13
            goto L7b
        L79:
            r3.f35089q = r6
        L7b:
            r3.f35088n = r5
            goto L8a
        L7e:
            r3.f35089q = r11
            goto L8e
        L81:
            r13 = 100
            r3.f35088n = r13
            goto L8a
        L86:
            r3.f35089q = r6
            r3.f35088n = r1
        L8a:
            r6 = r1
            goto L8e
        L8c:
            r3.f35089q = r5
        L8e:
            r12.m6514g(r2)
            if (r0 == 0) goto Lb6
            java.util.Map<java.lang.String, java.lang.Integer> r13 = r12.f57386zy
            java.lang.Object r13 = r13.get(r2)
            if (r13 != 0) goto L9c
            goto La8
        L9c:
            java.util.Map<java.lang.String, java.lang.Integer> r13 = r12.f57386zy
            java.lang.Object r13 = r13.get(r2)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r1 = r13.intValue()
        La8:
            if (r1 == r0) goto Lb3
            java.util.Map<java.lang.String, java.lang.Integer> r13 = r12.f57386zy
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r13.put(r2, r1)
        Lb3:
            r12.f7l8(r2, r0)
        Lb6:
            if (r6 == 0) goto Lc2
            java.util.Map<java.lang.String, hb.k> r13 = r12.f9519q
            r13.remove(r2)
            java.util.Map<java.lang.String, java.lang.Integer> r13 = r12.f57386zy
            r13.remove(r2)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.ad.download.toq.m6517p(android.content.Intent):void");
    }

    private void qrj() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
        bf2.toq.toq().registerReceiver(new C1649k(), intentFilter);
    }

    /* JADX INFO: renamed from: s */
    public static toq m6518s() {
        if (f9512g == null) {
            synchronized (toq.class) {
                if (f9512g == null) {
                    f9512g = new toq();
                }
            }
        }
        return f9512g;
    }

    public void cdj(hb.toq downloadRequest) {
        com.android.thememanager.basemodule.ad.zy.zy().toq(m6516n(downloadRequest));
    }

    public void f7l8(String packageName, int state) {
        Iterator<WeakReference<InterfaceC1852k>> it = this.f9518k.iterator();
        while (it.hasNext()) {
            InterfaceC1852k interfaceC1852k = it.next().get();
            if (interfaceC1852k != null) {
                interfaceC1852k.mo6499q(packageName, state);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m6519h(hb.toq downloadRequest) {
        com.android.thememanager.basemodule.ad.zy.zy().m6602g(m6516n(downloadRequest));
    }

    public void kja0(zy listener) {
        if (listener == null) {
            Log.d(f9514n, "removeDownloadStateListener is null.");
            return;
        }
        Iterator<WeakReference<zy>> it = this.f57385toq.iterator();
        while (it.hasNext()) {
            WeakReference<zy> next = it.next();
            if (next.get() == null || next.get() == listener) {
                it.remove();
            }
        }
    }

    public void n7h(InterfaceC1852k listener) {
        if (listener == null) {
            Log.d(f9514n, "removeDownloadStateCodeListener is null.");
            return;
        }
        Iterator<WeakReference<InterfaceC1852k>> it = this.f9518k.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC1852k> next = it.next();
            if (next.get() == null || next.get() == listener) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m6520q(zy listener) {
        if (listener == null) {
            Log.d(f9514n, "addDownloadStatusListener is null.");
            return;
        }
        for (int i2 = 0; i2 < this.f57385toq.size(); i2++) {
            if (listener == this.f57385toq.get(i2).get()) {
                return;
            }
        }
        this.f57385toq.add(new WeakReference<>(listener));
    }

    public void x2(hb.toq downloadRequest) {
        com.android.thememanager.basemodule.ad.zy.zy().m6604n(m6516n(downloadRequest));
    }

    /* JADX INFO: renamed from: y */
    public C6072k m6521y(String pkgName) {
        if (TextUtils.isEmpty(pkgName)) {
            return null;
        }
        return this.f9519q.get(pkgName);
    }

    public void zy(InterfaceC1852k listener) {
        if (listener == null) {
            Log.d(f9514n, "addDownloadStateCodeListener is null.");
            return;
        }
        for (int i2 = 0; i2 < this.f9518k.size(); i2++) {
            if (listener == this.f9518k.get(i2).get()) {
                return;
            }
        }
        this.f9518k.add(new WeakReference<>(listener));
    }
}
