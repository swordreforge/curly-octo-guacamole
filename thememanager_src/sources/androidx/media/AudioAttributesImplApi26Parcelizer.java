package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.AbstractC1266n;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC1266n parcel) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f5211k = (AudioAttributes) parcel.lrht(audioAttributesImplApi26.f5211k, 1);
        audioAttributesImplApi26.f51671toq = parcel.lvui(audioAttributesImplApi26.f51671toq, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 obj, AbstractC1266n parcel) {
        parcel.bf2(false, false);
        parcel.cfr(obj.f5211k, 1);
        parcel.was(obj.f51671toq, 2);
    }
}
