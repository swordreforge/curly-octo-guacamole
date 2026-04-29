package com.android.thememanager.service;

import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.SurfaceHolder;
import com.android.thememanager.service.InterfaceC2492g;
import java.io.FileNotFoundException;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: PlayerOriginImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class qrj implements InterfaceC2492g, MediaPlayer.OnVideoSizeChangedListener, Handler.Callback, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: a */
    private static final int f14843a = 9;

    /* JADX INFO: renamed from: b */
    private static final int f14844b = 8;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final int f60772bo = 1;

    /* JADX INFO: renamed from: c */
    private static final int f14845c = 3;

    /* JADX INFO: renamed from: e */
    private static final int f14846e = 4;

    /* JADX INFO: renamed from: f */
    private static final int f14847f = 2;

    /* JADX INFO: renamed from: j */
    private static final int f14848j = 5;

    /* JADX INFO: renamed from: l */
    private static final int f14849l = 1;

    /* JADX INFO: renamed from: m */
    private static final int f14850m = 7;

    /* JADX INFO: renamed from: o */
    private static final int f14851o = 6;

    /* JADX INFO: renamed from: r */
    private static final String f14852r = "PlayerOriginImpl";

    /* JADX INFO: renamed from: u */
    private static final int f14853u = 11;

    /* JADX INFO: renamed from: v */
    private static final long f14854v = 30000;

    /* JADX INFO: renamed from: x */
    private static final int f14855x = 10;

    /* JADX INFO: renamed from: g */
    private SurfaceHolder f14856g;

    /* JADX INFO: renamed from: h */
    private boolean f14857h;

    /* JADX INFO: renamed from: p */
    private boolean f14861p;

    /* JADX INFO: renamed from: q */
    private InterfaceC2492g.toq f14862q;

    /* JADX INFO: renamed from: s */
    private int f14863s;

    /* JADX INFO: renamed from: y */
    private String f14865y;

    /* JADX INFO: renamed from: i */
    boolean f14858i = false;

    /* JADX INFO: renamed from: z */
    private Boolean f14866z = null;

    /* JADX INFO: renamed from: t */
    private int f14864t = 0;

    /* JADX INFO: renamed from: k */
    @dd
    private MediaPlayer f14859k = new MediaPlayer();

    /* JADX INFO: renamed from: n */
    private final Handler f14860n = new Handler(Looper.getMainLooper(), this);

    qrj() {
    }

    /* JADX INFO: renamed from: g */
    private boolean m8953g() {
        int i2 = this.f14863s;
        return i2 == 3 || i2 == 4 || i2 == 5 || i2 == 7 || i2 == 11;
    }

    private void kja0(int s2) {
        this.f14863s = s2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ld6() {
        if (!this.f14861p || zurt() || this.f14865y == null) {
            return;
        }
        x2();
    }

    /* JADX INFO: renamed from: n */
    private boolean m8955n() {
        int i2 = this.f14863s;
        return i2 == 7 || i2 == 5 || i2 == 3 || i2 == 4;
    }

    private void n7h(String reason) {
        Log.i(f14852r, "resetPlayer. reason: " + reason);
        this.f14864t = this.f14864t + 1;
        MediaPlayer mediaPlayer = this.f14859k;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(null);
            this.f14859k.reset();
            this.f14859k.setLooping(this.f14857h);
        }
        m8956p();
        x2();
    }

    /* JADX INFO: renamed from: p */
    private void m8956p() {
        if (this.f14859k == null) {
            this.f14859k = new MediaPlayer();
        }
        this.f14859k.setVolume(0.0f, 0.0f);
        this.f14859k.setLooping(this.f14857h);
        kja0(1);
        this.f14859k.setOnCompletionListener(this);
        this.f14859k.setOnPreparedListener(this);
        this.f14859k.setOnErrorListener(this);
        this.f14859k.setOnVideoSizeChangedListener(this);
    }

    /* JADX INFO: renamed from: q */
    private boolean m8957q() {
        int i2 = this.f14863s;
        return i2 == 4 || i2 == 5;
    }

    private void qrj(String reason) {
        MediaPlayer mediaPlayer = this.f14859k;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f14859k = null;
            kja0(1);
            Log.i(f14852r, "release MediaPlayer,reason : " + reason);
            this.f14860n.removeMessages(1);
        }
    }

    /* JADX INFO: renamed from: s */
    private String m8958s() {
        int i2 = this.f14863s;
        switch (i2) {
            case 1:
                return "idle";
            case 2:
                return "init";
            case 3:
                return "prepared";
            case 4:
                return "started";
            case 5:
                return "paused";
            case 6:
                return "stopped";
            case 7:
                return "complete";
            case 8:
                return "preparing";
            case 9:
                return "ERROR";
            case 10:
                return "END";
            default:
                return "unknown. " + i2;
        }
    }

    private void x2() {
        MediaPlayer mediaPlayer = this.f14859k;
        if (mediaPlayer == null) {
            return;
        }
        try {
            mediaPlayer.setDataSource(this.f14865y);
            kja0(2);
            this.f14859k.prepareAsync();
            kja0(8);
        } catch (Exception e2) {
            if (e2 instanceof FileNotFoundException) {
                Log.i(f14852r, "prepare.File Not ready. waiting for next prepare! ");
                return;
            }
            if (this.f14864t >= 4) {
                Log.w(f14852r, "prepare..fail. " + e2);
                return;
            }
            n7h("prepareInner fail ." + e2);
        }
    }

    /* JADX INFO: renamed from: y */
    private boolean m8959y() {
        int i2 = this.f14863s;
        return i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7;
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void a9(boolean scale) {
        MediaPlayer mediaPlayer;
        int i2 = this.f14863s;
        if (i2 == 1 || i2 == 9 || (mediaPlayer = this.f14859k) == null) {
            this.f14866z = Boolean.valueOf(scale);
            return;
        }
        try {
            mediaPlayer.setVideoScalingMode(scale ? 1 : 2);
            this.f14866z = null;
        } catch (RuntimeException unused) {
            this.f14866z = Boolean.valueOf(scale);
        }
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void d3(InterfaceC2492g.toq listener) {
        this.f14862q = listener;
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void dd(String path) {
        this.f14865y = path;
        this.f14864t = 0;
        n7h("prepare path.");
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void eqxt(SurfaceHolder sh) {
        qrj("surface destroy");
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void f7l8(boolean audioOn) {
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void fti(boolean visible, boolean screenOn, boolean screenOff, boolean lockScreen, boolean isBoth) {
        this.f14861p = visible;
        if (!visible) {
            if (this.f14859k == null) {
                Log.w(f14852r, "inVisible.2 player null");
                return;
            }
            if (screenOff) {
                if (m8955n()) {
                    this.f14859k.seekTo(0);
                }
                if (m8957q()) {
                    this.f14859k.pause();
                    kja0(5);
                }
                if (this.f14863s == 7) {
                    kja0(11);
                }
                Log.i(f14852r, "inVisible.2 screen off set play status");
                this.f14860n.sendEmptyMessageDelayed(1, f14854v);
                return;
            }
            if (this.f14863s == 7) {
                return;
            }
            if (m8957q()) {
                this.f14859k.pause();
                kja0(5);
                this.f14860n.sendEmptyMessageDelayed(1, f14854v);
                return;
            } else {
                Log.w(f14852r, "inVisible.2 can not stop. " + m8958s());
                this.f14860n.sendEmptyMessage(1);
                return;
            }
        }
        this.f14860n.removeMessages(1);
        if (this.f14859k == null) {
            n7h("visible.2.player null.");
        }
        if (m8953g()) {
            if (this.f14863s != 7) {
                if (isBoth) {
                    if (!screenOn) {
                        return;
                    }
                } else if (!lockScreen) {
                    return;
                }
                this.f14859k.start();
                kja0(4);
                return;
            }
            return;
        }
        int i2 = this.f14863s;
        if (i2 == 6 && (screenOn || isBoth)) {
            n7h("visible.2. stopped.");
            return;
        }
        if (i2 == 9) {
            n7h("visible.2. state error");
            return;
        }
        Log.w(f14852r, "visible.2 can not start. state=" + m8958s());
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void gvn7(boolean repeat) {
        this.f14857h = repeat;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@lvui Message msg) {
        if (msg.what == 1) {
            qrj("time out");
        }
        return true;
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    /* JADX INFO: renamed from: i */
    public void mo8932i() {
        Log.i(f14852r, "onConfigChangedPlay :" + this.f14863s + ",visible = " + this.f14861p);
        if (this.f14859k == null || zurt()) {
            return;
        }
        if (this.f14861p) {
            if (m8953g()) {
                this.f14859k.start();
                kja0(4);
                return;
            }
            return;
        }
        this.f14858i = true;
        if (m8955n()) {
            this.f14859k.seekTo(0);
        }
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void jp0y() {
        this.f14860n.post(new Runnable() { // from class: com.android.thememanager.service.x2
            @Override // java.lang.Runnable
            public final void run() {
                this.f14870k.ld6();
            }
        });
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mp) {
        kja0(7);
        if (this.f14857h) {
            mp.start();
            kja0(4);
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mp, int what, int extra) {
        kja0(9);
        Log.w(f14852r, "onError. " + what + ", ex=" + extra);
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mp) {
        this.f14864t = 0;
        kja0(3);
        Boolean bool = this.f14866z;
        if (bool != null) {
            a9(bool.booleanValue());
        }
        SurfaceHolder surfaceHolder = this.f14856g;
        if (surfaceHolder != null) {
            mp.setSurface(surfaceHolder.getSurface());
        } else {
            Log.e(f14852r, "onPrepared . can not setSurface!");
        }
        if (this.f14861p) {
            mp.start();
            kja0(4);
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
        InterfaceC2492g.toq toqVar = this.f14862q;
        if (toqVar != null) {
            toqVar.mo8929k(width, height, 0, 1.0f);
        }
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void t8r(boolean visible) {
        this.f14861p = visible;
        if (!visible) {
            if (this.f14859k == null) {
                Log.w(f14852r, "invisible. player null");
                return;
            }
            if (m8957q()) {
                this.f14859k.pause();
                kja0(5);
                this.f14860n.sendEmptyMessageDelayed(1, f14854v);
                return;
            } else {
                Log.w(f14852r, "inVisible. can not stop. " + m8958s());
                this.f14860n.sendEmptyMessage(1);
                return;
            }
        }
        this.f14860n.removeMessages(1);
        if (this.f14859k == null) {
            n7h("visible. player null");
        }
        if (m8953g()) {
            this.f14859k.start();
            kja0(4);
            return;
        }
        int i2 = this.f14863s;
        if (i2 == 6 || i2 == 9) {
            n7h("visible. stop | error");
            return;
        }
        Log.w(f14852r, "visible. can not start. state=" + m8958s());
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void toq(float volume) {
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public boolean zurt() {
        return this.f14857h;
    }

    @Override // com.android.thememanager.service.InterfaceC2492g
    public void zy(SurfaceHolder surfaceHolder) {
        this.f14856g = surfaceHolder;
    }
}
