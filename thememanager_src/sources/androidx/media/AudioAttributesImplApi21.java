package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@hyr(21)
@uv6({uv6.EnumC7844k.LIBRARY})
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: k */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public AudioAttributes f5211k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public int f51671toq;

    @uv6({uv6.EnumC7844k.LIBRARY})
    public AudioAttributesImplApi21() {
        this.f51671toq = -1;
    }

    public boolean equals(Object o2) {
        if (o2 instanceof AudioAttributesImplApi21) {
            return this.f5211k.equals(((AudioAttributesImplApi21) o2).f5211k);
        }
        return false;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.f5211k.getContentType();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        return this.f5211k.getFlags();
    }

    public int hashCode() {
        return this.f5211k.hashCode();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int ld6() {
        return this.f5211k.getUsage();
    }

    @Override // androidx.media.AudioAttributesImpl
    /* JADX INFO: renamed from: p */
    public int mo4551p() {
        return this.f51671toq;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int qrj() {
        int i2 = this.f51671toq;
        return i2 != -1 ? i2 : AudioAttributesCompat.toq(false, getFlags(), ld6());
    }

    @Override // androidx.media.AudioAttributesImpl
    @dd
    /* JADX INFO: renamed from: s */
    public Object mo4552s() {
        return this.f5211k;
    }

    @lvui
    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f5211k;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int x2() {
        return AudioAttributesCompat.toq(true, getFlags(), ld6());
    }

    /* JADX INFO: renamed from: androidx.media.AudioAttributesImplApi21$k */
    @hyr(21)
    static class C0966k implements AudioAttributesImpl.InterfaceC0965k {

        /* JADX INFO: renamed from: k */
        final AudioAttributes.Builder f5212k;

        C0966k() {
            this.f5212k = new AudioAttributes.Builder();
        }

        @Override // androidx.media.AudioAttributesImpl.InterfaceC0965k
        @lvui
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi21(this.f5212k.build());
        }

        @Override // androidx.media.AudioAttributesImpl.InterfaceC0965k
        @lvui
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public C0966k mo4553k(int usage) {
            if (usage == 16) {
                usage = 12;
            }
            this.f5212k.setUsage(usage);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.InterfaceC0965k
        @lvui
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0966k toq(int streamType) {
            this.f5212k.setLegacyStreamType(streamType);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.InterfaceC0965k
        @lvui
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public C0966k setFlags(int flags) {
            this.f5212k.setFlags(flags);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.InterfaceC0965k
        @lvui
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C0966k zy(int contentType) {
            this.f5212k.setContentType(contentType);
            return this;
        }

        C0966k(Object aa) {
            this.f5212k = new AudioAttributes.Builder((AudioAttributes) aa);
        }
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int explicitLegacyStream) {
        this.f5211k = audioAttributes;
        this.f51671toq = explicitLegacyStream;
    }
}
