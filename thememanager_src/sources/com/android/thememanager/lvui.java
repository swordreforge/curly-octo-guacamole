package com.android.thememanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.android.thememanager.basemodule.resource.model.Resource;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: ThemeImportHandlerOld.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class lvui implements com.android.thememanager.basemodule.resource.constants.toq {

    /* JADX INFO: renamed from: k */
    private WeakReference<Context> f12541k;

    /* JADX INFO: renamed from: q */
    private toq f12543q;

    /* JADX INFO: renamed from: n */
    private boolean f12542n = false;

    /* JADX INFO: renamed from: g */
    private BroadcastReceiver f12540g = new C2134k();

    /* JADX INFO: renamed from: com.android.thememanager.lvui$k */
    /* JADX INFO: compiled from: ThemeImportHandlerOld.java */
    class C2134k extends BroadcastReceiver {
        C2134k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Resource resource = (Resource) intent.getSerializableExtra("extra_resource");
            if (action.equals("action_resource_import_complete")) {
                lvui.this.m8166q(resource);
                return;
            }
            if (action.equals("action_resource_import_fail")) {
                lvui.this.m8163k(resource);
                return;
            }
            if (action.equals("action_resource_import_start")) {
                lvui.this.zy(resource);
            } else if (action.equals("action_resource_import_udpate")) {
                lvui.this.toq(resource, (int) intent.getLongExtra("extra_import_current_bytes", 0L), (int) intent.getLongExtra("extra_import_total_bytes", 1L));
            }
        }
    }

    /* JADX INFO: compiled from: ThemeImportHandlerOld.java */
    public interface toq {
        /* JADX INFO: renamed from: n */
        void mo6395n(Resource resource);

        /* JADX INFO: renamed from: p */
        void mo6396p(Resource resource);

        /* JADX INFO: renamed from: q */
        void mo6397q(Resource resource);

        void toq(Resource resource, int downloadBytes, int totalBytes);
    }

    public lvui(Context context) {
        this.f12541k = new WeakReference<>(context);
    }

    public boolean f7l8(Resource resource) {
        return C2082k.zy().f7l8().jk(resource);
    }

    /* JADX INFO: renamed from: g */
    public boolean m8162g() {
        return C2082k.zy().f7l8().mcp();
    }

    /* JADX INFO: renamed from: k */
    public void m8163k(Resource resource) {
        toq toqVar = this.f12543q;
        if (toqVar != null) {
            toqVar.mo6396p(resource);
        }
    }

    public void ld6() {
        Context context;
        if (!this.f12542n || (context = this.f12541k.get()) == null) {
            return;
        }
        context.unregisterReceiver(this.f12540g);
        this.f12542n = false;
    }

    /* JADX INFO: renamed from: n */
    public void m8164n(fu4 resContext, Resource resource) {
        C2082k.zy().f7l8().m9771t(resContext, resource);
    }

    /* JADX INFO: renamed from: p */
    public void m8165p(toq listener) {
        this.f12543q = listener;
    }

    /* JADX INFO: renamed from: q */
    public void m8166q(Resource resource) {
        toq toqVar = this.f12543q;
        if (toqVar != null) {
            toqVar.mo6395n(resource);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m8167s(boolean listenDownloadProgress) {
        if (this.f12542n) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_resource_import_complete");
        intentFilter.addAction("action_resource_import_fail");
        intentFilter.addAction("action_resource_import_start");
        if (listenDownloadProgress) {
            intentFilter.addAction("action_resource_import_udpate");
        }
        Context context = this.f12541k.get();
        if (context != null) {
            context.registerReceiver(this.f12540g, intentFilter);
            this.f12542n = true;
        }
    }

    public void toq(Resource resource, int importBytes, int totalBytes) {
        toq toqVar = this.f12543q;
        if (toqVar != null) {
            toqVar.toq(resource, importBytes, totalBytes);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m8168y() {
        m8167s(false);
    }

    public void zy(Resource resource) {
        toq toqVar = this.f12543q;
        if (toqVar != null) {
            toqVar.mo6397q(resource);
        }
    }
}
