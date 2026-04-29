package com.android.thememanager.recommend.player;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import bf2.toq;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.jbh;
import com.google.android.exoplayer2.source.C3578c;
import com.google.android.exoplayer2.trackselection.C3705g;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.kja0;
import com.google.android.exoplayer2.x2;
import ek5k.C6002g;
import p001b.InterfaceC1355k;
import p029m.zy;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class AdAutoPlayer implements InterfaceC0928g {

    /* JADX INFO: renamed from: g */
    @lvui
    private final InterfaceC0954z f13577g;

    /* JADX INFO: renamed from: k */
    @dd
    private jbh f13578k;

    /* JADX INFO: renamed from: n */
    @dd
    private String f13579n;

    /* JADX INFO: renamed from: q */
    @dd
    private kja0.InterfaceC3804k f13580q;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.player.AdAutoPlayer$k */
    public interface InterfaceC2345k {
        /* JADX INFO: renamed from: i */
        AdAutoPlayer mo6321i();
    }

    public AdAutoPlayer(@lvui InterfaceC0954z owner) {
        this.f13577g = owner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m8515n(final String str, final boolean z2, final gc3c.InterfaceC3440y interfaceC3440y, final PlayerView playerView) {
        if (this.f13578k == null) {
            synchronized (this) {
                if (this.f13578k == null) {
                    this.f13578k = zy();
                }
            }
        }
        C6002g.fn3e(new Runnable() { // from class: kcsr.toq
            @Override // java.lang.Runnable
            public final void run() {
                this.f36087k.m8516q(str, z2, interfaceC3440y, playerView);
            }
        });
    }

    private jbh zy() {
        Context qVar = toq.toq();
        this.f13580q = com.android.thememanager.basemodule.video.toq.m7269q(InterfaceC1355k.f53834qrj);
        C3705g c3705g = new C3705g();
        c3705g.lrht(new C3705g.n(qVar).b3e(1, true));
        new x2.C3899k().m13916n(50000, 50000, 0, 5000);
        return new jbh.toq(qVar).x2(Looper.getMainLooper()).fn3e(c3705g).toq();
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void m8516q(@lvui final String url, final boolean playWhenReady, final gc3c.InterfaceC3440y videoListener, final PlayerView view) {
        if (this.f13578k == null) {
            this.f13577g.getLifecycle().mo4451k(this);
            C6002g.m22240g(new Runnable() { // from class: kcsr.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36082k.m8515n(url, playWhenReady, videoListener, view);
                }
            });
        } else {
            if (zy.toq(url)) {
                return;
            }
            this.f13578k.setRepeatMode(2);
            this.f13578k.nmn5(playWhenReady);
            this.f13578k.ngy(videoListener);
            this.f13578k.mu(new C3578c.toq(this.f13580q).mo12633g(Uri.parse(url)));
            this.f13579n = url;
            view.setPlayer(this.f13578k);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
        jbh jbhVar = this.f13578k;
        if (jbhVar != null) {
            jbhVar.release();
            this.f13578k = null;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onStart(@lvui InterfaceC0954z owner) {
        jbh jbhVar = this.f13578k;
        if (jbhVar != null) {
            jbhVar.nmn5(true);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onStop(@lvui InterfaceC0954z owner) {
        jbh jbhVar = this.f13578k;
        if (jbhVar != null) {
            jbhVar.nmn5(false);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m8518s(String url) {
        jbh jbhVar;
        if (url == null || !url.equals(this.f13579n) || (jbhVar = this.f13578k) == null) {
            return;
        }
        jbhVar.nmn5(false);
    }

    /* JADX INFO: renamed from: y */
    public void m8519y(gc3c.InterfaceC3440y listener) {
        jbh jbhVar = this.f13578k;
        if (jbhVar != null) {
            jbhVar.mo12081e(listener);
        }
    }
}
