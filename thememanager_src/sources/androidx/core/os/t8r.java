package androidx.core.os;

import android.os.Parcel;

/* JADX INFO: compiled from: ParcelableCompatCreatorCallbacks.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface t8r<T> {
    T createFromParcel(Parcel parcel, ClassLoader classLoader);

    T[] newArray(int i2);
}
