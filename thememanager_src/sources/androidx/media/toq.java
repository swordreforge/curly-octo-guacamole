package androidx.media;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import zy.InterfaceC7830i;
import zy.a9;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: AudioManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class toq {

    /* JADX INFO: renamed from: k */
    private static final String f5374k = "AudioManCompat";

    /* JADX INFO: renamed from: n */
    public static final int f5375n = 4;

    /* JADX INFO: renamed from: q */
    public static final int f5376q = 3;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f51737toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f51738zy = 2;

    /* JADX INFO: renamed from: androidx.media.toq$k */
    /* JADX INFO: compiled from: AudioManagerCompat.java */
    @hyr(26)
    private static class C0981k {
        private C0981k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m4633k(AudioManager audioManager, AudioFocusRequest focusRequest) {
            return audioManager.abandonAudioFocusRequest(focusRequest);
        }

        @InterfaceC7830i
        static int toq(AudioManager audioManager, AudioFocusRequest focusRequest) {
            return audioManager.requestAudioFocus(focusRequest);
        }
    }

    /* JADX INFO: renamed from: androidx.media.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AudioManagerCompat.java */
    @hyr(28)
    private static class C7889toq {
        private C7889toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m4634k(AudioManager audioManager, int streamType) {
            return audioManager.getStreamMinVolume(streamType);
        }
    }

    private toq() {
    }

    /* JADX INFO: renamed from: k */
    public static int m4631k(@lvui AudioManager audioManager, @lvui C0971k focusRequest) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (focusRequest != null) {
            return C0981k.m4633k(audioManager, focusRequest.zy());
        }
        throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }

    /* JADX INFO: renamed from: q */
    public static int m4632q(@lvui AudioManager audioManager, @lvui C0971k focusRequest) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (focusRequest != null) {
            return C0981k.toq(audioManager, focusRequest.zy());
        }
        throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }

    @a9(from = 0)
    public static int toq(@lvui AudioManager audioManager, int streamType) {
        return audioManager.getStreamMaxVolume(streamType);
    }

    @a9(from = 0)
    public static int zy(@lvui AudioManager audioManager, int streamType) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C7889toq.m4634k(audioManager, streamType);
        }
        return 0;
    }
}
