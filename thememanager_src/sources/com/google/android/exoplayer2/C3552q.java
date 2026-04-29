package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.audio.C3248g;
import com.google.android.exoplayer2.util.C3844k;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: com.google.android.exoplayer2.q */
/* JADX INFO: compiled from: AudioFocusManager.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3552q {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f65306cdj = "AudioFocusManager";

    /* JADX INFO: renamed from: h */
    private static final int f21176h = 3;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final float f65307ki = 0.2f;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f65308kja0 = 2;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f65309ld6 = 0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f65310n7h = 1;

    /* JADX INFO: renamed from: p */
    public static final int f21177p = -1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f65311qrj = 0;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final float f65312t8r = 1.0f;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f65313x2 = 1;

    /* JADX INFO: renamed from: g */
    private int f21178g;

    /* JADX INFO: renamed from: k */
    private final AudioManager f21179k;

    /* JADX INFO: renamed from: q */
    @zy.dd
    private C3248g f21181q;

    /* JADX INFO: renamed from: s */
    private boolean f21182s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final k f65315toq;

    /* JADX INFO: renamed from: y */
    private AudioFocusRequest f21183y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.dd
    private zy f65316zy;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private float f65314f7l8 = 1.0f;

    /* JADX INFO: renamed from: n */
    private int f21180n = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.google.android.exoplayer2.q$k */
    /* JADX INFO: compiled from: AudioFocusManager.java */
    class k implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: k */
        private final Handler f21184k;

        public k(Handler handler) {
            this.f21184k = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void toq(int i2) {
            C3552q.this.m12519s(i2);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i2) {
            this.f21184k.post(new Runnable() { // from class: com.google.android.exoplayer2.zy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23767k.toq(i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.q$toq */
    /* JADX INFO: compiled from: AudioFocusManager.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.q$zy */
    /* JADX INFO: compiled from: AudioFocusManager.java */
    public interface zy {
        void nn86(int i2);

        void vyq(float f2);
    }

    public C3552q(Context context, Handler handler, zy zyVar) {
        this.f21179k = (AudioManager) C3844k.f7l8((AudioManager) context.getApplicationContext().getSystemService(com.google.android.exoplayer2.util.wvg.f67137toq));
        this.f65316zy = zyVar;
        this.f65315toq = new k(handler);
    }

    /* JADX INFO: renamed from: g */
    private void m12514g(int i2) {
        zy zyVar = this.f65316zy;
        if (zyVar != null) {
            zyVar.nn86(i2);
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m12515h(int i2) {
        return i2 == 1 || this.f21178g != 1;
    }

    /* JADX INFO: renamed from: k */
    private void m12516k() {
        this.f21179k.abandonAudioFocus(this.f65315toq);
    }

    private boolean ki() {
        C3248g c3248g = this.f21181q;
        return c3248g != null && c3248g.f19340k == 1;
    }

    private void kja0(int i2) {
        if (this.f21180n == i2) {
            return;
        }
        this.f21180n = i2;
        float f2 = i2 == 3 ? 0.2f : 1.0f;
        if (this.f65314f7l8 == f2) {
            return;
        }
        this.f65314f7l8 = f2;
        zy zyVar = this.f65316zy;
        if (zyVar != null) {
            zyVar.vyq(f2);
        }
    }

    private int ld6() {
        if (this.f21180n == 1) {
            return 1;
        }
        if ((com.google.android.exoplayer2.util.lrht.f23230k >= 26 ? qrj() : x2()) == 1) {
            kja0(1);
            return 1;
        }
        kja0(0);
        return -1;
    }

    /* JADX INFO: renamed from: n */
    private static int m12517n(@zy.dd C3248g c3248g) {
        if (c3248g == null) {
            return 0;
        }
        int i2 = c3248g.f19341n;
        switch (i2) {
            case 0:
                com.google.android.exoplayer2.util.ni7.qrj(f65306cdj, "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (c3248g.f19340k == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unidentified audio usage: ");
                sb.append(i2);
                com.google.android.exoplayer2.util.ni7.qrj(f65306cdj, sb.toString());
                return 0;
            case 16:
                return com.google.android.exoplayer2.util.lrht.f23230k >= 19 ? 4 : 2;
        }
    }

    @zy.hyr(26)
    private int qrj() {
        AudioFocusRequest audioFocusRequest = this.f21183y;
        if (audioFocusRequest == null || this.f21182s) {
            this.f21183y = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f21178g) : new AudioFocusRequest.Builder(this.f21183y)).setAudioAttributes(((C3248g) C3844k.f7l8(this.f21181q)).toq()).setWillPauseWhenDucked(ki()).setOnAudioFocusChangeListener(this.f65315toq).build();
            this.f21182s = false;
        }
        return this.f21179k.requestAudioFocus(this.f21183y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m12519s(int i2) {
        if (i2 == -3 || i2 == -2) {
            if (i2 != -2 && !ki()) {
                kja0(3);
                return;
            } else {
                m12514g(0);
                kja0(2);
                return;
            }
        }
        if (i2 == -1) {
            m12514g(-1);
            toq();
        } else if (i2 == 1) {
            kja0(1);
            m12514g(1);
        } else {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown focus change type: ");
            sb.append(i2);
            com.google.android.exoplayer2.util.ni7.qrj(f65306cdj, sb.toString());
        }
    }

    private void toq() {
        if (this.f21180n == 0) {
            return;
        }
        if (com.google.android.exoplayer2.util.lrht.f23230k >= 26) {
            zy();
        } else {
            m12516k();
        }
        kja0(0);
    }

    private int x2() {
        return this.f21179k.requestAudioFocus(this.f65315toq, com.google.android.exoplayer2.util.lrht.nmn5(((C3248g) C3844k.f7l8(this.f21181q)).f19341n), this.f21178g);
    }

    @zy.hyr(26)
    private void zy() {
        AudioFocusRequest audioFocusRequest = this.f21183y;
        if (audioFocusRequest != null) {
            this.f21179k.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    public int cdj(boolean z2, int i2) {
        if (m12515h(i2)) {
            toq();
            return z2 ? 1 : -1;
        }
        if (z2) {
            return ld6();
        }
        return -1;
    }

    @zy.yz
    AudioManager.OnAudioFocusChangeListener f7l8() {
        return this.f65315toq;
    }

    public void n7h(@zy.dd C3248g c3248g) {
        if (com.google.android.exoplayer2.util.lrht.zy(this.f21181q, c3248g)) {
            return;
        }
        this.f21181q = c3248g;
        int iM12517n = m12517n(c3248g);
        this.f21178g = iM12517n;
        boolean z2 = true;
        if (iM12517n != 1 && iM12517n != 0) {
            z2 = false;
        }
        C3844k.toq(z2, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    /* JADX INFO: renamed from: p */
    public void m12520p() {
        this.f65316zy = null;
        toq();
    }

    /* JADX INFO: renamed from: y */
    public float m12521y() {
        return this.f65314f7l8;
    }
}
