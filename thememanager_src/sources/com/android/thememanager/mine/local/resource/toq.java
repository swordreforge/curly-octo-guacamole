package com.android.thememanager.mine.local.resource;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.android.thememanager.C2320q;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.model.Resource;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: ThemeImportHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq implements com.android.thememanager.basemodule.resource.constants.toq {

    /* JADX INFO: renamed from: k */
    private WeakReference<Context> f12734k;

    /* JADX INFO: renamed from: q */
    private zy f12736q;

    /* JADX INFO: renamed from: n */
    private boolean f12735n = false;

    /* JADX INFO: renamed from: g */
    private BroadcastReceiver f12733g = new C2163k();

    /* JADX INFO: renamed from: com.android.thememanager.mine.local.resource.toq$k */
    /* JADX INFO: compiled from: ThemeImportHandler.java */
    class C2163k extends BroadcastReceiver {
        C2163k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Resource resource = (Resource) intent.getSerializableExtra("extra_resource");
            if (action.equals("action_resource_import_complete")) {
                toq.this.m8233q(resource);
                return;
            }
            if (action.equals("action_resource_import_fail")) {
                toq.this.m8230k(resource);
                return;
            }
            if (action.equals("action_resource_import_start")) {
                toq.this.zy(resource);
            } else if (action.equals("action_resource_import_udpate")) {
                toq.this.toq(resource, (int) intent.getLongExtra("extra_import_current_bytes", 0L), (int) intent.getLongExtra("extra_import_total_bytes", 1L));
            }
        }
    }

    public toq(Context context) {
        this.f12734k = new WeakReference<>(context);
    }

    public boolean f7l8(Resource resource) {
        return C2320q.uv6(resource);
    }

    /* JADX INFO: renamed from: g */
    public boolean m8229g() {
        return C2320q.lrht();
    }

    /* JADX INFO: renamed from: k */
    public void m8230k(Resource resource) {
        zy zyVar = this.f12736q;
        if (zyVar != null) {
            zyVar.mo6340p(resource);
        }
    }

    public void ld6() {
        Context context;
        if (!this.f12735n || (context = this.f12734k.get()) == null) {
            return;
        }
        context.unregisterReceiver(this.f12733g);
        this.f12735n = false;
    }

    /* JADX INFO: renamed from: n */
    public void m8231n(C1791k resContext, Resource resource) {
        C2320q.eqxt(resContext, resource);
    }

    /* JADX INFO: renamed from: p */
    public void m8232p(zy listener) {
        this.f12736q = listener;
    }

    /* JADX INFO: renamed from: q */
    public void m8233q(Resource resource) {
        zy zyVar = this.f12736q;
        if (zyVar != null) {
            zyVar.mo6339n(resource);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m8234s(boolean listenDownloadProgress) {
        if (this.f12735n) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_resource_import_complete");
        intentFilter.addAction("action_resource_import_fail");
        intentFilter.addAction("action_resource_import_start");
        if (listenDownloadProgress) {
            intentFilter.addAction("action_resource_import_udpate");
        }
        Context context = this.f12734k.get();
        if (context != null) {
            context.registerReceiver(this.f12733g, intentFilter);
            this.f12735n = true;
        }
    }

    public void toq(Resource resource, int importBytes, int totalBytes) {
        zy zyVar = this.f12736q;
        if (zyVar != null) {
            zyVar.toq(resource, importBytes, totalBytes);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m8235y() {
        m8234s(false);
    }

    public void zy(Resource resource) {
        zy zyVar = this.f12736q;
        if (zyVar != null) {
            zyVar.mo6341q(resource);
        }
    }
}
