package com.android.thememanager.basemodule.mediaplayer;

import android.app.Activity;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.MiuiSettings;
import android.util.Log;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.cdj;
import com.android.thememanager.basemodule.utils.ek5k;
import com.google.android.exoplayer2.util.wvg;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: BatchMediaPlayer.java */
/* JADX INFO: loaded from: classes.dex */
public class toq {

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f57573qrj = "BatchMediaPlayer";

    /* JADX INFO: renamed from: k */
    private WeakReference<Activity> f10050k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private C1757k f57576toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private AudioManager f57578zy = null;

    /* JADX INFO: renamed from: q */
    private Vibrator f10053q = null;

    /* JADX INFO: renamed from: n */
    private AudioAttributes f10051n = null;

    /* JADX INFO: renamed from: g */
    private InterfaceC1758g f10049g = null;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private ArrayList<String> f57574f7l8 = new ArrayList<>();

    /* JADX INFO: renamed from: y */
    private int f10055y = -1;

    /* JADX INFO: renamed from: s */
    private f7l8 f10054s = f7l8.UNDEFINED;

    /* JADX INFO: renamed from: p */
    private Handler f10052p = new Handler();

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final Runnable f57575ld6 = new RunnableC1759k();

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    AudioManager.OnAudioFocusChangeListener f57577x2 = new C7908toq();

    /* JADX INFO: compiled from: BatchMediaPlayer.java */
    private enum f7l8 {
        UNDEFINED,
        PLAYING
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.mediaplayer.toq$g */
    /* JADX INFO: compiled from: BatchMediaPlayer.java */
    public interface InterfaceC1758g {

        /* JADX INFO: renamed from: k */
        public static final int f10057k = 0;

        /* JADX INFO: renamed from: q */
        public static final int f10058q = 3;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final int f57579toq = 1;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final int f57580zy = 2;

        /* JADX INFO: renamed from: k */
        void mo6876k(String ringtonePath, int current, int total);

        void toq(int whatError);
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.mediaplayer.toq$k */
    /* JADX INFO: compiled from: BatchMediaPlayer.java */
    class RunnableC1759k implements Runnable {
        RunnableC1759k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            toq.this.m6870p();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.mediaplayer.toq$n */
    /* JADX INFO: compiled from: BatchMediaPlayer.java */
    class C1760n implements MediaPlayer.OnPreparedListener {
        C1760n() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mp) {
            Activity activity = (Activity) toq.this.f10050k.get();
            if (C1819o.eqxt(activity) && activity.getWindow().getDecorView().isShown()) {
                toq.this.ld6();
            } else {
                toq.this.ki(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.mediaplayer.toq$q */
    /* JADX INFO: compiled from: BatchMediaPlayer.java */
    class C1761q implements MediaPlayer.OnCompletionListener {
        C1761q() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mp) {
            long jMax = Math.max(Math.min(1000, 2000 - mp.getDuration()), 500L);
            toq.this.f10052p.removeCallbacks(toq.this.f57575ld6);
            toq.this.f10052p.postDelayed(toq.this.f57575ld6, jMax);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.mediaplayer.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BatchMediaPlayer.java */
    class C7908toq implements AudioManager.OnAudioFocusChangeListener {
        C7908toq() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == -2 || focusChange == -1) {
                toq.this.cdj();
            }
        }
    }

    /* JADX INFO: compiled from: BatchMediaPlayer.java */
    class zy implements MediaPlayer.OnErrorListener {
        zy() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mp, int what, int extra) {
            if (what == 1) {
                toq.this.ki(1);
            } else if (what == 100) {
                toq.this.ki(2);
            } else {
                toq.this.ki(0);
            }
            return true;
        }
    }

    public toq(Activity activity) {
        this.f10050k = null;
        this.f57576toq = null;
        if (activity == null) {
            throw new IllegalArgumentException("activity cann't be null");
        }
        this.f10050k = new WeakReference<>(activity);
        C1757k c1757k = new C1757k();
        this.f57576toq = c1757k;
        c1757k.qrj(new zy());
        this.f57576toq.x2(new C1761q());
        this.f57576toq.n7h(new C1760n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ld6() {
        if (this.f10055y < 0) {
            return;
        }
        Activity activity = this.f10050k.get();
        if (this.f57578zy == null && activity != null) {
            this.f57578zy = (AudioManager) activity.getSystemService(wvg.f67137toq);
        }
        if (this.f57578zy.requestAudioFocus(this.f57577x2, activity.getVolumeControlStream(), 2) == 0) {
            ki(3);
            return;
        }
        this.f10054s = f7l8.PLAYING;
        InterfaceC1758g interfaceC1758g = this.f10049g;
        if (interfaceC1758g != null) {
            interfaceC1758g.mo6876k(this.f57574f7l8.get(this.f10055y), this.f10055y, kja0());
        }
        m6872s(ek5k.m7045q(this.f57574f7l8.get(this.f10055y)));
        this.f57576toq.f7l8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m6870p() {
        try {
            Activity activity = this.f10050k.get();
            int i2 = this.f10055y + 1;
            this.f10055y = i2;
            if (i2 < this.f57574f7l8.size()) {
                this.f57576toq.m6867s(activity, ek5k.m7045q(this.f57574f7l8.get(this.f10055y)), activity.getVolumeControlStream());
            } else {
                ki(0);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: s */
    private void m6872s(Uri playUri) {
        if (m6873y()) {
            Log.d(f57573qrj, "try to play vibration for : " + playUri);
            VibrationEffect vibrationEffectKi = cdj.ki(playUri, bf2.toq.toq());
            if (vibrationEffectKi == null) {
                Log.d(f57573qrj, "getting vibration fail.");
                return;
            }
            if (this.f10053q == null) {
                this.f10053q = (Vibrator) bf2.toq.toq().getSystemService("vibrator");
            }
            if (this.f10053q != null) {
                Log.d(f57573qrj, "play vibration.");
                if (this.f10051n == null) {
                    this.f10051n = new AudioAttributes.Builder().setUsage(6).build();
                }
                this.f10053q.vibrate(vibrationEffectKi, this.f10051n);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private boolean m6873y() {
        if (this.f57578zy == null) {
            this.f57578zy = (AudioManager) bf2.toq.toq().getSystemService(wvg.f67137toq);
        }
        return this.f57578zy.getRingerMode() != 2 ? MiuiSettings.System.getBoolean(bf2.toq.toq().getContentResolver(), "vibrate_in_silent", true) : MiuiSettings.System.getBoolean(bf2.toq.toq().getContentResolver(), "vibrate_in_normal", true);
    }

    public void cdj() {
        ki(0);
    }

    public boolean f7l8() {
        return this.f10054s == f7l8.PLAYING;
    }

    /* JADX INFO: renamed from: g */
    public void m6874g(String uriPath) {
        this.f57574f7l8.add(uriPath);
    }

    /* JADX INFO: renamed from: h */
    public void m6875h() {
        m6870p();
    }

    public void ki(int whatError) {
        this.f10055y = -1;
        this.f57574f7l8.clear();
        this.f10052p.removeCallbacks(this.f57575ld6);
        this.f10054s = f7l8.UNDEFINED;
        AudioManager audioManager = this.f57578zy;
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.f57577x2);
        }
        C1757k c1757k = this.f57576toq;
        if (c1757k != null) {
            c1757k.kja0();
        }
        if (this.f10053q == null) {
            this.f10053q = (Vibrator) bf2.toq.toq().getSystemService("vibrator");
        }
        if (this.f10053q != null) {
            Log.d(f57573qrj, "stop vibration.");
            this.f10053q.cancel();
        }
        InterfaceC1758g interfaceC1758g = this.f10049g;
        if (interfaceC1758g != null) {
            interfaceC1758g.toq(whatError);
        }
    }

    public int kja0() {
        return this.f57574f7l8.size();
    }

    public void n7h(List<String> list) {
        this.f57574f7l8.clear();
        if (list != null) {
            this.f57574f7l8.addAll(list);
        }
    }

    public void qrj(InterfaceC1758g l2) {
        this.f10049g = l2;
    }

    public void x2() {
        C1757k c1757k = this.f57576toq;
        if (c1757k != null) {
            c1757k.ld6();
            this.f57576toq = null;
        }
    }
}
