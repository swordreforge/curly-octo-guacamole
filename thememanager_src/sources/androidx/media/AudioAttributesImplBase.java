package androidx.media;

import android.util.Log;
import androidx.media.AudioAttributesImpl;
import com.google.android.exoplayer2.analytics.InterfaceC3239x;
import java.util.Arrays;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: k */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public int f5213k;

    /* JADX INFO: renamed from: q */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public int f5214q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public int f51672toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public int f51673zy;

    @uv6({uv6.EnumC7844k.LIBRARY})
    public AudioAttributesImplBase() {
        this.f5213k = 0;
        this.f51672toq = 0;
        this.f51673zy = 0;
        this.f5214q = -1;
    }

    /* JADX INFO: renamed from: k */
    static int m4558k(int streamType) {
        switch (streamType) {
        }
        return 2;
    }

    public boolean equals(Object o2) {
        if (!(o2 instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) o2;
        return this.f51672toq == audioAttributesImplBase.getContentType() && this.f51673zy == audioAttributesImplBase.getFlags() && this.f5213k == audioAttributesImplBase.ld6() && this.f5214q == audioAttributesImplBase.f5214q;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.f51672toq;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        int i2 = this.f51673zy;
        int iQrj = qrj();
        if (iQrj == 6) {
            i2 |= 4;
        } else if (iQrj == 7) {
            i2 |= 1;
        }
        return i2 & 273;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f51672toq), Integer.valueOf(this.f51673zy), Integer.valueOf(this.f5213k), Integer.valueOf(this.f5214q)});
    }

    @Override // androidx.media.AudioAttributesImpl
    public int ld6() {
        return this.f5213k;
    }

    @Override // androidx.media.AudioAttributesImpl
    /* JADX INFO: renamed from: p */
    public int mo4551p() {
        return this.f5214q;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int qrj() {
        int i2 = this.f5214q;
        return i2 != -1 ? i2 : AudioAttributesCompat.toq(false, this.f51673zy, this.f5213k);
    }

    @Override // androidx.media.AudioAttributesImpl
    @dd
    /* JADX INFO: renamed from: s */
    public Object mo4552s() {
        return null;
    }

    @lvui
    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f5214q != -1) {
            sb.append(" stream=");
            sb.append(this.f5214q);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m4546q(this.f5213k));
        sb.append(" content=");
        sb.append(this.f51672toq);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f51673zy).toUpperCase());
        return sb.toString();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int x2() {
        return AudioAttributesCompat.toq(true, this.f51673zy, this.f5213k);
    }

    /* JADX INFO: renamed from: androidx.media.AudioAttributesImplBase$k */
    static class C0968k implements AudioAttributesImpl.InterfaceC0965k {

        /* JADX INFO: renamed from: k */
        private int f5215k;

        /* JADX INFO: renamed from: q */
        private int f5216q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f51674toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f51675zy;

        C0968k() {
            this.f5215k = 0;
            this.f51674toq = 0;
            this.f51675zy = 0;
            this.f5216q = -1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX INFO: renamed from: g */
        private C0968k m4559g(int streamType) {
            switch (streamType) {
                case 0:
                    this.f51674toq = 1;
                    break;
                case 1:
                    this.f51674toq = 4;
                    break;
                case 2:
                    this.f51674toq = 4;
                    break;
                case 3:
                    this.f51674toq = 2;
                    break;
                case 4:
                    this.f51674toq = 4;
                    break;
                case 5:
                    this.f51674toq = 4;
                    break;
                case 6:
                    this.f51674toq = 1;
                    this.f51675zy |= 4;
                    break;
                case 7:
                    this.f51675zy = 1 | this.f51675zy;
                    this.f51674toq = 4;
                    break;
                case 8:
                    this.f51674toq = 4;
                    break;
                case 9:
                    this.f51674toq = 4;
                    break;
                case 10:
                    this.f51674toq = 1;
                    break;
                default:
                    Log.e("AudioAttributesCompat", "Invalid stream type " + streamType + " for AudioAttributesCompat");
                    break;
            }
            this.f5215k = AudioAttributesImplBase.m4558k(streamType);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.InterfaceC0965k
        @lvui
        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.f51674toq, this.f51675zy, this.f5215k, this.f5216q);
        }

        @Override // androidx.media.AudioAttributesImpl.InterfaceC0965k
        @lvui
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public C0968k toq(int streamType) {
            if (streamType == 10) {
                throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
            }
            this.f5216q = streamType;
            return m4559g(streamType);
        }

        @Override // androidx.media.AudioAttributesImpl.InterfaceC0965k
        @lvui
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public C0968k setFlags(int flags) {
            this.f51675zy = (flags & InterfaceC3239x.f63281ncyb) | this.f51675zy;
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.InterfaceC0965k
        @lvui
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C0968k zy(int contentType) {
            if (contentType == 0 || contentType == 1 || contentType == 2 || contentType == 3 || contentType == 4) {
                this.f51674toq = contentType;
            } else {
                this.f51674toq = 0;
            }
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.InterfaceC0965k
        @lvui
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public C0968k mo4553k(int usage) {
            switch (usage) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.f5215k = usage;
                    return this;
                case 16:
                    this.f5215k = 12;
                    return this;
                default:
                    this.f5215k = 0;
                    return this;
            }
        }

        C0968k(AudioAttributesCompat aa) {
            this.f5215k = 0;
            this.f51674toq = 0;
            this.f51675zy = 0;
            this.f5216q = -1;
            this.f5215k = aa.ld6();
            this.f51674toq = aa.getContentType();
            this.f51675zy = aa.getFlags();
            this.f5216q = aa.m4547p();
        }
    }

    AudioAttributesImplBase(int contentType, int flags, int usage, int legacyStream) {
        this.f51672toq = contentType;
        this.f51673zy = flags;
        this.f5213k = usage;
        this.f5214q = legacyStream;
    }
}
