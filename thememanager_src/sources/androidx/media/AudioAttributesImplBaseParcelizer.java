package androidx.media;

import androidx.versionedparcelable.AbstractC1266n;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC1266n parcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f5213k = parcel.lvui(audioAttributesImplBase.f5213k, 1);
        audioAttributesImplBase.f51672toq = parcel.lvui(audioAttributesImplBase.f51672toq, 2);
        audioAttributesImplBase.f51673zy = parcel.lvui(audioAttributesImplBase.f51673zy, 3);
        audioAttributesImplBase.f5214q = parcel.lvui(audioAttributesImplBase.f5214q, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase obj, AbstractC1266n parcel) {
        parcel.bf2(false, false);
        parcel.was(obj.f5213k, 1);
        parcel.was(obj.f51672toq, 2);
        parcel.was(obj.f51673zy, 3);
        parcel.was(obj.f5214q, 4);
    }
}
