package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImplApi21;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@hyr(26)
@uv6({uv6.EnumC7844k.LIBRARY})
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    /* JADX INFO: renamed from: androidx.media.AudioAttributesImplApi26$k */
    @hyr(26)
    static class C0967k extends AudioAttributesImplApi21.C0966k {
        C0967k() {
        }

        @Override // androidx.media.AudioAttributesImplApi21.C0966k, androidx.media.AudioAttributesImpl.InterfaceC0965k
        @lvui
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi26(this.f5212k.build());
        }

        @Override // androidx.media.AudioAttributesImplApi21.C0966k, androidx.media.AudioAttributesImpl.InterfaceC0965k
        @lvui
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public C0967k mo4553k(int usage) {
            this.f5212k.setUsage(usage);
            return this;
        }

        C0967k(Object aa) {
            super(aa);
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    public AudioAttributesImplApi26() {
    }

    @Override // androidx.media.AudioAttributesImplApi21, androidx.media.AudioAttributesImpl
    public int x2() {
        return this.f5211k.getVolumeControlStream();
    }

    AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
}
