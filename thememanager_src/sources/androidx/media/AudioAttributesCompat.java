package androidx.media;

import android.media.AudioAttributes;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi26;
import androidx.media.AudioAttributesImplBase;
import androidx.versionedparcelable.InterfaceC1269y;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC1269y {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    static final int f51639a9 = 2;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f51640cdj = 9;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    static final int f51641d2ok = 256;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    static final int f51642d3 = 32;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    static final int f51643dd = 273;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    static final int f51644eqxt = 128;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f51645f7l8 = 4;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f51646fn3e = 13;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    static final int f51647fti = 4;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f51648fu4 = 16;

    /* JADX INFO: renamed from: g */
    public static final int f5196g = 3;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final int f51649gvn7 = 16;

    /* JADX INFO: renamed from: h */
    public static final int f5197h = 8;

    /* JADX INFO: renamed from: i */
    public static final int f5198i = 12;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final int f51650jk = 1;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    static final int f51651jp0y = 8;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f51652ki = 10;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f51653kja0 = 7;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f51654ld6 = 3;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    static final int f51655lvui = 512;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final int[] f51656mcp;

    /* JADX INFO: renamed from: n */
    public static final int f5199n = 2;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f51657n7h = 6;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    static final int f51658ni7 = 15;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f51659o1t = 2;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    static final int f51660oc = 64;

    /* JADX INFO: renamed from: p */
    public static final int f5200p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f5201q = 1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f51661qrj = 5;

    /* JADX INFO: renamed from: r */
    static final int f5202r = 1023;

    /* JADX INFO: renamed from: s */
    public static final int f5203s = 1;

    /* JADX INFO: renamed from: t */
    static boolean f5204t = false;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f51662t8r = 11;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final String f51663toq = "AudioAttributesCompat";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final SparseIntArray f51664wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f51665x2 = 4;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    static final int f51666x9kr = -1;

    /* JADX INFO: renamed from: y */
    public static final int f5205y = 0;

    /* JADX INFO: renamed from: z */
    private static final int f5206z = 1;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f51667zurt = 14;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f51668zy = 0;

    /* JADX INFO: renamed from: k */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public AudioAttributesImpl f5207k;

    /* JADX INFO: renamed from: androidx.media.AudioAttributesCompat$k */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY})
    public @interface InterfaceC0963k {
    }

    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY})
    public @interface toq {
    }

    static abstract class zy {

        /* JADX INFO: renamed from: k */
        public static final int f5209k = 6;

        /* JADX INFO: renamed from: q */
        public static final int f5210q = 10;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final int f51669toq = 7;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final int f51670zy = 9;

        private zy() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f51664wvg = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f51656mcp = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    public AudioAttributesCompat() {
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: k */
    public static void m4544k(boolean force) {
        f5204t = force;
    }

    @dd
    /* JADX INFO: renamed from: n */
    public static AudioAttributesCompat m4545n(@lvui final Object aa) {
        if (f5204t) {
            return null;
        }
        return new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) aa));
    }

    /* JADX INFO: renamed from: q */
    static String m4546q(int usage) {
        switch (usage) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + usage;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    static int toq(boolean fromGetVolumeControlStream, int flags, int usage) {
        if ((flags & 1) == 1) {
            return fromGetVolumeControlStream ? 1 : 7;
        }
        if ((flags & 4) == 4) {
            return fromGetVolumeControlStream ? 0 : 6;
        }
        switch (usage) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return fromGetVolumeControlStream ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (!fromGetVolumeControlStream) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + usage + " in audio attributes");
        }
    }

    public boolean equals(Object o2) {
        if (!(o2 instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) o2;
        AudioAttributesImpl audioAttributesImpl = this.f5207k;
        return audioAttributesImpl == null ? audioAttributesCompat.f5207k == null : audioAttributesImpl.equals(audioAttributesCompat.f5207k);
    }

    public int getContentType() {
        return this.f5207k.getContentType();
    }

    public int getFlags() {
        return this.f5207k.getFlags();
    }

    public int hashCode() {
        return this.f5207k.hashCode();
    }

    public int ld6() {
        return this.f5207k.ld6();
    }

    /* JADX INFO: renamed from: p */
    int m4547p() {
        return this.f5207k.mo4551p();
    }

    public int qrj() {
        return this.f5207k.qrj();
    }

    public String toString() {
        return this.f5207k.toString();
    }

    public int x2() {
        return this.f5207k.x2();
    }

    @dd
    public Object zy() {
        return this.f5207k.mo4552s();
    }

    AudioAttributesCompat(AudioAttributesImpl impl) {
        this.f5207k = impl;
    }

    /* JADX INFO: renamed from: androidx.media.AudioAttributesCompat$q */
    public static class C0964q {

        /* JADX INFO: renamed from: k */
        final AudioAttributesImpl.InterfaceC0965k f5208k;

        public C0964q() {
            if (AudioAttributesCompat.f5204t) {
                this.f5208k = new AudioAttributesImplBase.C0968k();
            } else {
                this.f5208k = new AudioAttributesImplApi26.C0967k();
            }
        }

        /* JADX INFO: renamed from: k */
        public AudioAttributesCompat m4548k() {
            return new AudioAttributesCompat(this.f5208k.build());
        }

        /* JADX INFO: renamed from: n */
        public C0964q m4549n(int usage) {
            this.f5208k.mo4553k(usage);
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C0964q m4550q(int streamType) {
            this.f5208k.toq(streamType);
            return this;
        }

        public C0964q toq(int contentType) {
            this.f5208k.zy(contentType);
            return this;
        }

        public C0964q zy(int flags) {
            this.f5208k.setFlags(flags);
            return this;
        }

        public C0964q(AudioAttributesCompat aa) {
            if (AudioAttributesCompat.f5204t) {
                this.f5208k = new AudioAttributesImplBase.C0968k(aa);
            } else {
                this.f5208k = new AudioAttributesImplApi26.C0967k(aa.zy());
            }
        }
    }
}
