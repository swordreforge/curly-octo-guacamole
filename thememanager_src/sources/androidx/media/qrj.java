package androidx.media;

import android.media.VolumeProvider;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.uv6;

/* JADX INFO: compiled from: VolumeProviderCompat.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class qrj {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f51732f7l8 = 0;

    /* JADX INFO: renamed from: s */
    public static final int f5363s = 2;

    /* JADX INFO: renamed from: y */
    public static final int f5364y = 1;

    /* JADX INFO: renamed from: g */
    private VolumeProvider f5365g;

    /* JADX INFO: renamed from: k */
    private final int f5366k;

    /* JADX INFO: renamed from: n */
    private AbstractC0978q f5367n;

    /* JADX INFO: renamed from: q */
    private int f5368q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f51733toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final String f51734zy;

    /* JADX INFO: renamed from: androidx.media.qrj$k */
    /* JADX INFO: compiled from: VolumeProviderCompat.java */
    class C0976k extends VolumeProvider {
        C0976k(int volumeControl, int maxVolume, int currentVolume, String volumeControlId) {
            super(volumeControl, maxVolume, currentVolume, volumeControlId);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int direction) {
            qrj.this.m4619g(direction);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int volume) {
            qrj.this.f7l8(volume);
        }
    }

    /* JADX INFO: renamed from: androidx.media.qrj$n */
    /* JADX INFO: compiled from: VolumeProviderCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface InterfaceC0977n {
    }

    /* JADX INFO: renamed from: androidx.media.qrj$q */
    /* JADX INFO: compiled from: VolumeProviderCompat.java */
    public static abstract class AbstractC0978q {
        public abstract void onVolumeChanged(qrj volumeProvider);
    }

    /* JADX INFO: compiled from: VolumeProviderCompat.java */
    class toq extends VolumeProvider {
        toq(int volumeControl, int maxVolume, int currentVolume) {
            super(volumeControl, maxVolume, currentVolume);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int direction) {
            qrj.this.m4619g(direction);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int volume) {
            qrj.this.f7l8(volume);
        }
    }

    /* JADX INFO: compiled from: VolumeProviderCompat.java */
    @hyr(21)
    private static class zy {
        private zy() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m4625k(VolumeProvider volumeProvider, int currentVolume) {
            volumeProvider.setCurrentVolume(currentVolume);
        }
    }

    public qrj(int volumeControl, int maxVolume, int currentVolume) {
        this(volumeControl, maxVolume, currentVolume, null);
    }

    public void f7l8(int volume) {
    }

    /* JADX INFO: renamed from: g */
    public void m4619g(int direction) {
    }

    /* JADX INFO: renamed from: k */
    public final int m4620k() {
        return this.f5368q;
    }

    /* JADX INFO: renamed from: n */
    public Object m4621n() {
        if (this.f5365g == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f5365g = new C0976k(this.f5366k, this.f51733toq, this.f5368q, this.f51734zy);
            } else {
                this.f5365g = new toq(this.f5366k, this.f51733toq, this.f5368q);
            }
        }
        return this.f5365g;
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: q */
    public final String m4622q() {
        return this.f51734zy;
    }

    /* JADX INFO: renamed from: s */
    public final void m4623s(int currentVolume) {
        this.f5368q = currentVolume;
        zy.m4625k((VolumeProvider) m4621n(), currentVolume);
        AbstractC0978q abstractC0978q = this.f5367n;
        if (abstractC0978q != null) {
            abstractC0978q.onVolumeChanged(this);
        }
    }

    public final int toq() {
        return this.f51733toq;
    }

    /* JADX INFO: renamed from: y */
    public void m4624y(AbstractC0978q callback) {
        this.f5367n = callback;
    }

    public final int zy() {
        return this.f5366k;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public qrj(int volumeControl, int maxVolume, int currentVolume, @dd String volumeControlId) {
        this.f5366k = volumeControl;
        this.f51733toq = maxVolume;
        this.f5368q = currentVolume;
        this.f51734zy = volumeControlId;
    }
}
