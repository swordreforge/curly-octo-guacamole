package com.android.thememanager.detail.video.util;

import android.content.Context;
import android.media.AudioManager;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.activity.lvui;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.video.C1837q;
import com.android.thememanager.basemodule.video.InterfaceC1836n;
import com.android.thememanager.detail.video.model.VideoResource;
import com.android.thememanager.detail.video.view.activity.VideoDetailActivity;
import com.google.android.exoplayer2.audio.C3248g;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.jbh;
import com.google.android.exoplayer2.source.C3578c;
import com.google.android.exoplayer2.source.C3619n;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.trackselection.C3705g;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.C3827z;
import com.google.android.exoplayer2.upstream.a9;
import com.google.android.exoplayer2.upstream.cache.C3774i;
import com.google.android.exoplayer2.upstream.cache.InterfaceC3775k;
import com.google.android.exoplayer2.upstream.cache.zy;
import com.google.android.exoplayer2.upstream.kja0;
import com.google.android.exoplayer2.util.wvg;
import com.google.android.exoplayer2.x2;
import com.google.android.exoplayer2.yqrt;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class VideoDetailPlayer implements InterfaceC2010n, AudioManager.OnAudioFocusChangeListener, gc3c.InterfaceC3434g, gc3c.InterfaceC3440y {

    /* JADX INFO: renamed from: l */
    private static final int f11451l = 500;

    /* JADX INFO: renamed from: r */
    private static final String f11452r = "VDPlayer";

    /* JADX INFO: renamed from: g */
    private final jbh f11453g;

    /* JADX INFO: renamed from: h */
    private InterfaceC2011q f11454h;

    /* JADX INFO: renamed from: n */
    private final Context f11457n;

    /* JADX INFO: renamed from: p */
    private boolean f11458p;

    /* JADX INFO: renamed from: s */
    @dd
    private PlayerView f11460s;

    /* JADX INFO: renamed from: y */
    private final C3705g f11462y;

    /* JADX INFO: renamed from: k */
    private boolean f11456k = false;

    /* JADX INFO: renamed from: q */
    private final InterfaceC1836n f11459q = new lvui.n7h(5000);

    /* JADX INFO: renamed from: i */
    private String f11455i = "video";

    /* JADX INFO: renamed from: z */
    private long f11463z = 0;

    /* JADX INFO: renamed from: t */
    private long f11461t = Long.MIN_VALUE;

    public VideoDetailPlayer(Context context) {
        this.f11457n = context;
        C3705g c3705g = new C3705g(context);
        this.f11462y = c3705g;
        new x2.C3899k().m13916n(50000, 50000, 500, 5000);
        jbh qVar = new jbh.toq(context).fn3e(c3705g).toq();
        this.f11453g = qVar;
        qVar.o1t(new C3248g.toq().m11440n(6).m11439k(), false);
        qVar.setRepeatMode(2);
        Log.w(f11452r, "VideoDetailPlayer init: ");
    }

    private kja0.InterfaceC3804k dd(InterfaceC3775k cache, kja0.InterfaceC3804k upstream) {
        return new zy.C3786q().m13443p(cache).m13441h(upstream).kja0(2);
    }

    /* JADX INFO: renamed from: l */
    private void m7845l(boolean isMute) {
        C3705g.n nVarB3e = this.f11462y.m13091i().b3e(1, isMute);
        if (isMute) {
            toq();
            this.f11462y.lrht(nVarB3e);
        } else if (((AudioManager) this.f11457n.getSystemService(wvg.f67137toq)).requestAudioFocus(this, 3, 1) != 1) {
            Log.w(f11452r, "requestAudioFocus fail. can not unMute.");
        } else {
            this.f11462y.lrht(nVarB3e);
            this.f11458p = false;
        }
    }

    private fti ncyb(VideoResource resource) {
        kja0.InterfaceC3804k interfaceC3804kX9kr;
        if (resource.isDownloaded()) {
            interfaceC3804kX9kr = new a9.toq();
        } else {
            C3774i qVar = com.android.thememanager.basemodule.video.toq.toq(VideoDetailActivity.bg);
            interfaceC3804kX9kr = qVar == null ? x9kr() : dd(qVar, x9kr());
        }
        return new C3578c.toq(interfaceC3804kX9kr).zy(tfm.m13021q(resource.getPreviewUri()));
    }

    private void toq() {
        if (this.f11458p) {
            return;
        }
        ((AudioManager) this.f11457n.getSystemService(wvg.f67137toq)).abandonAudioFocus(this);
        this.f11458p = true;
    }

    private void vyq() {
        jbh jbhVar = this.f11453g;
        if (jbhVar == null || !jbhVar.yqrt()) {
            return;
        }
        this.f11453g.nmn5(false);
        toq();
    }

    private kja0.InterfaceC3804k x9kr() {
        return new C1837q(new C3827z.toq().ld6("ua"), this.f11459q);
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    /* JADX INFO: renamed from: b */
    public void mo7842b(View view) {
        PlayerView playerView = this.f11460s;
        if (playerView != null) {
            playerView.setPlayer(null);
        }
        if (view instanceof PlayerView) {
            PlayerView playerView2 = (PlayerView) view;
            playerView2.setPlayer(this.f11453g);
            this.f11460s = playerView2;
        }
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public void b3e(long endTime) {
        this.f11461t = endTime;
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
    public void cdj(com.google.android.exoplayer2.video.wvg videoSize) {
        this.f11454h.toq(videoSize.f23577k, videoSize.f23579q);
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public void cfr(VideoResource resource) {
        fti ftiVarNcyb = ncyb(resource);
        this.f11453g.nmn5(true);
        this.f11453g.mu(zy(ftiVarNcyb));
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void f7l8(@zy.lvui InterfaceC0954z owner) {
        if (oki()) {
            return;
        }
        this.f11453g.nmn5(true);
        toq();
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public long getDuration() {
        return this.f11453g.getDuration();
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public void hyr() {
        vyq();
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    /* JADX INFO: renamed from: i */
    public InterfaceC2010n mo7843i() {
        return this;
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public void ikck(boolean enable) {
        m7845l(enable);
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public void lrht(String type) {
        this.f11455i = type;
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
    /* JADX INFO: renamed from: m */
    public void mo6500m(boolean playWhenReady, int playbackState) {
        if (playbackState == 1) {
            this.f11454h.mo6437k(0);
        } else {
            if (playbackState != 3) {
                return;
            }
            this.f11454h.mo6437k(1);
        }
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
    public void ni7(yqrt error) {
        Log.w(f11452r, "onPlayerError: " + error.getErrorCodeName() + "--" + error.errorCode);
        InterfaceC2011q interfaceC2011q = this.f11454h;
        if (interfaceC2011q == null) {
            Log.w(f11452r, "mStateListener is null");
            return;
        }
        int i2 = error.errorCode;
        if (i2 == 4003 || i2 == 4001 || i2 == 3003) {
            interfaceC2011q.mo6437k(5);
        }
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public boolean oki() {
        return this.f11456k;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int focusChange) {
        if (focusChange == -3) {
            this.f11453g.toq(0.1f);
        } else {
            if (focusChange != 1) {
                return;
            }
            this.f11453g.toq(0.5f);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@zy.lvui InterfaceC0954z owner) {
        toq();
        PlayerView playerView = this.f11460s;
        if (playerView != null) {
            playerView.setPlayer(null);
        }
        if (this.f11453g == null || oki()) {
            return;
        }
        this.f11453g.release();
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onStop(@zy.lvui InterfaceC0954z owner) {
        vyq();
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public void pjz9(boolean force) {
        this.f11453g.release();
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public void ukdy(long startTime) {
        this.f11463z = startTime;
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public void vy(InterfaceC2011q playStateListener) {
        this.f11454h = playStateListener;
        this.f11453g.ngy(this);
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public void wlev(boolean isPublicPlayer) {
        this.f11456k = isPublicPlayer;
    }

    public fti zy(fti mediaSource) {
        return (C1807g.wvg() && C1807g.zurt() && "sensor".equals(this.f11455i)) ? new C3619n(mediaSource, this.f11463z, this.f11461t) : mediaSource;
    }
}
