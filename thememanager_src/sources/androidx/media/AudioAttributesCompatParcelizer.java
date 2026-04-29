package androidx.media;

import androidx.versionedparcelable.AbstractC1266n;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC1266n parcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f5207k = (AudioAttributesImpl) parcel.y9n(audioAttributesCompat.f5207k, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat obj, AbstractC1266n parcel) {
        parcel.bf2(false, false);
        parcel.cv06(obj.f5207k, 1);
    }
}
