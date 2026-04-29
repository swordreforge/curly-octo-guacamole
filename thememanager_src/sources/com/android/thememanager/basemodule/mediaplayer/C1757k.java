package com.android.thememanager.basemodule.mediaplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.mediaplayer.k */
/* JADX INFO: compiled from: AsyncMediaPlayer.java */
/* JADX INFO: loaded from: classes.dex */
public class C1757k {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f57566ld6 = 2;

    /* JADX INFO: renamed from: p */
    private static final int f10039p = 1;

    /* JADX INFO: renamed from: s */
    private static final String f10040s = "AsyncMediaPlayer";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f57567x2 = 3;

    /* JADX INFO: renamed from: y */
    private static final boolean f10041y = false;

    /* JADX INFO: renamed from: g */
    private MediaPlayer.OnPreparedListener f10042g;

    /* JADX INFO: renamed from: n */
    private MediaPlayer.OnCompletionListener f10044n;

    /* JADX INFO: renamed from: q */
    private MediaPlayer.OnErrorListener f10045q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private zy f57569toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private MediaPlayer f57570zy;

    /* JADX INFO: renamed from: k */
    private final LinkedList<toq> f10043k = new LinkedList<>();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f57568f7l8 = 3;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.mediaplayer.k$toq */
    /* JADX INFO: compiled from: AsyncMediaPlayer.java */
    private static final class toq {

        /* JADX INFO: renamed from: k */
        int f10046k;

        /* JADX INFO: renamed from: q */
        int f10047q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        Context f57571toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        Uri f57572zy;

        private toq() {
        }

        public String toString() {
            return "{ code=" + this.f10046k + " stream=" + this.f10047q + " uri=" + this.f57572zy + " }";
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.mediaplayer.k$zy */
    /* JADX INFO: compiled from: AsyncMediaPlayer.java */
    private final class zy extends Thread {
        zy() {
            super("AsyncMediaPlayer-Thread");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            toq toqVar;
            while (true) {
                synchronized (C1757k.this.f10043k) {
                    toqVar = (toq) C1757k.this.f10043k.removeFirst();
                }
                int i2 = toqVar.f10046k;
                if (i2 == 1) {
                    C1757k.this.m6864p(toqVar);
                } else if (i2 == 2) {
                    C1757k.this.m6866y();
                } else if (i2 == 3) {
                    C1757k.this.m6861h();
                }
                synchronized (C1757k.this.f10043k) {
                    if (C1757k.this.f10043k.size() == 0) {
                        C1757k.this.f57569toq = null;
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m6860g(toq cmd) {
        this.f10043k.add(cmd);
        if (this.f57569toq == null) {
            zy zyVar = new zy();
            this.f57569toq = zyVar;
            zyVar.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m6861h() {
        MediaPlayer mediaPlayer = this.f57570zy;
        if (mediaPlayer == null) {
            Log.w(f10040s, "STOP command without a player");
            return;
        }
        mediaPlayer.stop();
        this.f57570zy.release();
        this.f57570zy = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m6864p(toq cmd) {
        try {
            if (this.f57570zy != null) {
                m6861h();
            }
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setOnErrorListener(this.f10045q);
            mediaPlayer.setOnCompletionListener(this.f10044n);
            mediaPlayer.setOnPreparedListener(this.f10042g);
            mediaPlayer.setAudioStreamType(cmd.f10047q);
            mediaPlayer.setDataSource(cmd.f57571toq, cmd.f57572zy);
            mediaPlayer.prepareAsync();
            this.f57570zy = mediaPlayer;
        } catch (Exception e2) {
            Log.w(f10040s, "START error loading sound for " + cmd.f57572zy, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m6866y() {
        MediaPlayer mediaPlayer = this.f57570zy;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    public void f7l8() {
        synchronized (this.f10043k) {
            if (this.f57568f7l8 == 1) {
                toq toqVar = new toq();
                toqVar.f10046k = 2;
                m6860g(toqVar);
                this.f57568f7l8 = 2;
            }
        }
    }

    public void kja0() {
        synchronized (this.f10043k) {
            if (this.f57568f7l8 != 3) {
                toq toqVar = new toq();
                toqVar.f10046k = 3;
                m6860g(toqVar);
                this.f57568f7l8 = 3;
            }
        }
    }

    public void ld6() {
        MediaPlayer mediaPlayer = this.f57570zy;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f57570zy = null;
        }
    }

    public void n7h(MediaPlayer.OnPreparedListener preparedListener) {
        this.f10042g = preparedListener;
    }

    public void qrj(MediaPlayer.OnErrorListener errorListener) {
        this.f10045q = errorListener;
    }

    /* JADX INFO: renamed from: s */
    public void m6867s(Context context, Uri uri, int stream) {
        synchronized (this.f10043k) {
            toq toqVar = new toq();
            toqVar.f10046k = 1;
            toqVar.f57571toq = context;
            toqVar.f57572zy = uri;
            toqVar.f10047q = stream;
            m6860g(toqVar);
            this.f57568f7l8 = 1;
        }
    }

    public void x2(MediaPlayer.OnCompletionListener completionListene) {
        this.f10044n = completionListene;
    }
}
