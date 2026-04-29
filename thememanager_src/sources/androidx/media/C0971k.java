package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.util.C0642s;
import androidx.media.AudioAttributesCompat;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.media.k */
/* JADX INFO: compiled from: AudioFocusRequestCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C0971k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    static final AudioAttributesCompat f51696f7l8 = new AudioAttributesCompat.C0964q().m4549n(1).m4548k();

    /* JADX INFO: renamed from: g */
    private final Object f5335g;

    /* JADX INFO: renamed from: k */
    private final int f5336k;

    /* JADX INFO: renamed from: n */
    private final boolean f5337n;

    /* JADX INFO: renamed from: q */
    private final AudioAttributesCompat f5338q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f51697toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Handler f51698zy;

    /* JADX INFO: renamed from: androidx.media.k$k */
    /* JADX INFO: compiled from: AudioFocusRequestCompat.java */
    @hyr(26)
    private static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static AudioFocusRequest m4611k(int focusGain, AudioAttributes audioAttributes, boolean pauseOnDuck, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler focusChangeHandler) {
            return new AudioFocusRequest.Builder(focusGain).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(pauseOnDuck).setOnAudioFocusChangeListener(onAudioFocusChangeListener, focusChangeHandler).build();
        }
    }

    /* JADX INFO: renamed from: androidx.media.k$zy */
    /* JADX INFO: compiled from: AudioFocusRequestCompat.java */
    private static class zy implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: n */
        private static final int f5342n = 2782386;

        /* JADX INFO: renamed from: k */
        private final Handler f5343k;

        /* JADX INFO: renamed from: q */
        private final AudioManager.OnAudioFocusChangeListener f5344q;

        zy(@lvui AudioManager.OnAudioFocusChangeListener listener, @lvui Handler handler) {
            this.f5344q = listener;
            this.f5343k = new Handler(handler.getLooper(), this);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != f5342n) {
                return false;
            }
            this.f5344q.onAudioFocusChange(message.arg1);
            return true;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int focusChange) {
            Handler handler = this.f5343k;
            handler.sendMessage(Message.obtain(handler, f5342n, focusChange, 0));
        }
    }

    C0971k(int focusGain, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler focusChangeHandler, AudioAttributesCompat audioFocusRequestCompat, boolean pauseOnDuck) {
        this.f5336k = focusGain;
        this.f51698zy = focusChangeHandler;
        this.f5338q = audioFocusRequestCompat;
        this.f5337n = pauseOnDuck;
        this.f51697toq = onAudioFocusChangeListener;
        this.f5335g = k.m4611k(focusGain, m4608k(), pauseOnDuck, onAudioFocusChangeListener, focusChangeHandler);
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (!(o2 instanceof C0971k)) {
            return false;
        }
        C0971k c0971k = (C0971k) o2;
        return this.f5336k == c0971k.f5336k && this.f5337n == c0971k.f5337n && C0642s.m2985k(this.f51697toq, c0971k.f51697toq) && C0642s.m2985k(this.f51698zy, c0971k.f51698zy) && C0642s.m2985k(this.f5338q, c0971k.f5338q);
    }

    public boolean f7l8() {
        return this.f5337n;
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public AudioManager.OnAudioFocusChangeListener m4607g() {
        return this.f51697toq;
    }

    public int hashCode() {
        return C0642s.toq(Integer.valueOf(this.f5336k), this.f51697toq, this.f51698zy, this.f5338q, Boolean.valueOf(this.f5337n));
    }

    @hyr(21)
    /* JADX INFO: renamed from: k */
    AudioAttributes m4608k() {
        AudioAttributesCompat audioAttributesCompat = this.f5338q;
        if (audioAttributesCompat != null) {
            return (AudioAttributes) audioAttributesCompat.zy();
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public int m4609n() {
        return this.f5336k;
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public Handler m4610q() {
        return this.f51698zy;
    }

    @lvui
    public AudioAttributesCompat toq() {
        return this.f5338q;
    }

    @hyr(26)
    AudioFocusRequest zy() {
        return (AudioFocusRequest) this.f5335g;
    }

    /* JADX INFO: renamed from: androidx.media.k$toq */
    /* JADX INFO: compiled from: AudioFocusRequestCompat.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        private int f5339k;

        /* JADX INFO: renamed from: n */
        private boolean f5340n;

        /* JADX INFO: renamed from: q */
        private AudioAttributesCompat f5341q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private AudioManager.OnAudioFocusChangeListener f51699toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Handler f51700zy;

        public toq(int focusGain) {
            this.f5341q = C0971k.f51696f7l8;
            m4615q(focusGain);
        }

        private static boolean toq(int focusGain) {
            return focusGain == 1 || focusGain == 2 || focusGain == 3 || focusGain == 4;
        }

        @lvui
        public toq f7l8(boolean pauseOnDuck) {
            this.f5340n = pauseOnDuck;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: g */
        public toq m4612g(@lvui AudioManager.OnAudioFocusChangeListener listener, @lvui Handler handler) {
            if (listener == null) {
                throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
            }
            if (handler == null) {
                throw new IllegalArgumentException("Handler must not be null");
            }
            this.f51699toq = listener;
            this.f51700zy = handler;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C0971k m4613k() {
            if (this.f51699toq != null) {
                return new C0971k(this.f5339k, this.f51699toq, this.f51700zy, this.f5341q, this.f5340n);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        @lvui
        /* JADX INFO: renamed from: n */
        public toq m4614n(@lvui AudioManager.OnAudioFocusChangeListener listener) {
            return m4612g(listener, new Handler(Looper.getMainLooper()));
        }

        @lvui
        /* JADX INFO: renamed from: q */
        public toq m4615q(int focusGain) {
            if (toq(focusGain)) {
                this.f5339k = focusGain;
                return this;
            }
            throw new IllegalArgumentException("Illegal audio focus gain type " + focusGain);
        }

        @lvui
        public toq zy(@lvui AudioAttributesCompat attributes) {
            if (attributes == null) {
                throw new NullPointerException("Illegal null AudioAttributes");
            }
            this.f5341q = attributes;
            return this;
        }

        public toq(@lvui C0971k requestToCopy) {
            this.f5341q = C0971k.f51696f7l8;
            if (requestToCopy != null) {
                this.f5339k = requestToCopy.m4609n();
                this.f51699toq = requestToCopy.m4607g();
                this.f51700zy = requestToCopy.m4610q();
                this.f5341q = requestToCopy.toq();
                this.f5340n = requestToCopy.f7l8();
                return;
            }
            throw new IllegalArgumentException("AudioFocusRequestCompat to copy must not be null");
        }
    }
}
