package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.AbstractC1266n;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC1266n parcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f5211k = (AudioAttributes) parcel.lrht(audioAttributesImplApi21.f5211k, 1);
        audioAttributesImplApi21.f51671toq = parcel.lvui(audioAttributesImplApi21.f51671toq, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 obj, AbstractC1266n parcel) {
        parcel.bf2(false, false);
        parcel.cfr(obj.f5211k, 1);
        parcel.was(obj.f51671toq, 2);
    }
}
