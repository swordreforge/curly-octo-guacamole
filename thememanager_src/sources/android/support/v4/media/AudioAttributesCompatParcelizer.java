package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.AbstractC1266n;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC1266n parcel) {
        return androidx.media.AudioAttributesCompatParcelizer.read(parcel);
    }

    public static void write(AudioAttributesCompat obj, AbstractC1266n parcel) {
        androidx.media.AudioAttributesCompatParcelizer.write(obj, parcel);
    }
}
