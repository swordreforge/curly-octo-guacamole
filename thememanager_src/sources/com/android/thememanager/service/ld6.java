package com.android.thememanager.service;

import android.content.Context;
import android.net.Uri;
import android.view.SurfaceHolder;
import com.android.thememanager.service.InterfaceC2492g;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.jbh;
import com.google.android.exoplayer2.source.C3578c;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.trackselection.C3705g;
import com.google.android.exoplayer2.upstream.a9;
import com.google.android.exoplayer2.video.wvg;
import java.io.File;

/* JADX INFO: compiled from: PlayerExoImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ld6 implements InterfaceC2492g, gc3c.InterfaceC3440y {

    /* JADX INFO: renamed from: k */
    private final jbh f14832k;

    /* JADX INFO: renamed from: n */
    private fti f14833n;

    /* JADX INFO: renamed from: q */
    private InterfaceC2492g.toq f14834q;

    ld6(Context context) {
        C3705g c3705g = new C3705g(context);
        c3705g.lrht(new C3705g.n(context).b3e(1, true));
        this.f14832k = new jbh.toq(context).fn3e(c3705g).toq();
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void a9(boolean fit) {
        this.f14832k.mo12125g(fit ? 1 : 2);
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
    public void cdj(wvg videoSize) {
        InterfaceC2492g.toq toqVar = this.f14834q;
        if (toqVar != null) {
            toqVar.mo8929k(videoSize.f23577k, videoSize.f23579q, videoSize.f23578n, videoSize.f23576g);
        }
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void d3(InterfaceC2492g.toq listener) {
        this.f14834q = listener;
        this.f14832k.ngy(this);
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void dd(String path) {
        C3578c c3578cMo12633g = new C3578c.toq(new a9.toq()).mo12633g(Uri.fromFile(new File(path)));
        this.f14833n = c3578cMo12633g;
        this.f14832k.mu(c3578cMo12633g);
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void eqxt(SurfaceHolder sh) {
        this.f14832k.release();
        this.f14832k.fu4(sh);
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void f7l8(boolean audioOn) {
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void fti(boolean visible, boolean screenOn, boolean screenOff, boolean lockScreen, boolean isBoth) {
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void gvn7(boolean repeat) {
        this.f14832k.setRepeatMode(repeat ? 2 : 0);
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    /* JADX INFO: renamed from: i */
    public void mo8932i() {
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void t8r(boolean visible) {
        fti ftiVar;
        if (visible) {
            if (!zurt() && (ftiVar = this.f14833n) != null) {
                this.f14832k.mu(ftiVar);
            }
            this.f14832k.nmn5(true);
            return;
        }
        this.f14832k.nmn5(false);
        if (zurt()) {
            return;
        }
        this.f14832k.bwp(true);
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void toq(float volume) {
        this.f14832k.toq(volume);
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public boolean zurt() {
        return this.f14832k.getRepeatMode() == 2;
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void zy(SurfaceHolder surfaceHolder) {
        this.f14832k.zy(surfaceHolder);
    }
}
