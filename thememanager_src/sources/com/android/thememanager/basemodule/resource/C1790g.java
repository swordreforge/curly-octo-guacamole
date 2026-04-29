package com.android.thememanager.basemodule.resource;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.mediaplayer.toq;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.nn86;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.resource.g */
/* JADX INFO: compiled from: ResourceMusicPlayer.java */
/* JADX INFO: loaded from: classes.dex */
public class C1790g {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f57680f7l8 = 0;

    /* JADX INFO: renamed from: y */
    private static final int f10203y = 50;

    /* JADX INFO: renamed from: g */
    private Handler f10204g = new k();

    /* JADX INFO: renamed from: k */
    private Activity f10205k;

    /* JADX INFO: renamed from: n */
    private zy f10206n;

    /* JADX INFO: renamed from: q */
    private boolean f10207q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected Resource f57681toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private com.android.thememanager.basemodule.mediaplayer.toq f57682zy;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.resource.g$k */
    /* JADX INFO: compiled from: ResourceMusicPlayer.java */
    class k extends Handler {
        k() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            if (msg.what != 0 || C1790g.this.f57682zy == null || C1790g.this.f10206n == null || !C1790g.this.f57682zy.f7l8()) {
                return;
            }
            C1790g.this.f10204g.sendEmptyMessageDelayed(0, 50L);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.resource.g$toq */
    /* JADX INFO: compiled from: ResourceMusicPlayer.java */
    class toq implements toq.InterfaceC1758g {
        toq() {
        }

        @Override // com.android.thememanager.basemodule.mediaplayer.toq.InterfaceC1758g
        /* JADX INFO: renamed from: k */
        public void mo6876k(String ringtonePath, int current, int total) {
            if (C1790g.this.f10206n != null) {
                C1790g.this.f10206n.onStartPlaying();
            }
        }

        @Override // com.android.thememanager.basemodule.mediaplayer.toq.InterfaceC1758g
        public void toq(int whatError) {
            C1790g.this.f10207q = false;
            C1790g c1790g = C1790g.this;
            c1790g.f57681toq = null;
            if (c1790g.f10206n != null) {
                C1790g.this.f10206n.onStopPlaying();
            }
            if (whatError == 2) {
                nn86.m7150k(R.string.resource_ringtone_playing_error, 0);
            } else if (whatError == 1) {
                nn86.m7150k(R.string.resource_ringtone_playing_error, 0);
            } else if (whatError == 3) {
                nn86.m7150k(R.string.theme_on_the_phone_alert, 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.resource.g$zy */
    /* JADX INFO: compiled from: ResourceMusicPlayer.java */
    public interface zy {
        void onProgressUpdate(int playDuration, int totalDuration);

        void onStartPlaying();

        void onStopPlaying();
    }

    public C1790g(Activity activity) {
        this.f10205k = activity;
    }

    private void f7l8() {
        com.android.thememanager.basemodule.mediaplayer.toq toqVar = new com.android.thememanager.basemodule.mediaplayer.toq(this.f10205k);
        this.f57682zy = toqVar;
        toqVar.qrj(new toq());
    }

    /* JADX INFO: renamed from: g */
    protected List<String> m6925g(final Resource resourceItem, C1791k resContext) {
        return C1792n.m6946s(resourceItem, resContext);
    }

    public void kja0() {
        com.android.thememanager.basemodule.mediaplayer.toq toqVar = this.f57682zy;
        if (toqVar != null) {
            toqVar.cdj();
        }
        this.f57681toq = null;
        this.f10207q = false;
    }

    public boolean ld6() {
        return m6929y() && this.f57682zy.f7l8();
    }

    /* JADX INFO: renamed from: n */
    public boolean m6926n(Resource r2, C1791k resContext) {
        return r2 != null && TextUtils.isEmpty(new C1795s(r2, resContext).f7l8()) && (this.f57681toq == null || !TextUtils.equals(r2.getAssemblyId(), this.f57681toq.getAssemblyId()));
    }

    public void n7h() {
        com.android.thememanager.basemodule.mediaplayer.toq toqVar = this.f57682zy;
        if (toqVar != null) {
            toqVar.x2();
            this.f57682zy = null;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m6927p(final Resource r2, C1791k resContext) {
        this.f57681toq = r2;
        if (this.f57682zy == null) {
            f7l8();
        }
        this.f57682zy.n7h(m6925g(r2, resContext));
        this.f57682zy.m6875h();
        this.f10207q = true;
    }

    public void qrj(zy l2) {
        this.f10206n = l2;
    }

    /* JADX INFO: renamed from: s */
    protected void m6928s() {
    }

    public boolean x2(String uuid) {
        Resource resource = this.f57681toq;
        return resource != null && TextUtils.equals(resource.getAssemblyId(), uuid) && ld6();
    }

    /* JADX INFO: renamed from: y */
    public boolean m6929y() {
        return this.f10207q;
    }
}
