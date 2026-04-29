package androidx.core.os;

import android.os.Parcel;
import zy.lvui;

/* JADX INFO: compiled from: ParcelCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class ki {
    private ki() {
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2732k(@lvui Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void toq(@lvui Parcel parcel, boolean z2) {
        parcel.writeInt(z2 ? 1 : 0);
    }
}
