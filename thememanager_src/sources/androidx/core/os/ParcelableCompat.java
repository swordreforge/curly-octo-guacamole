package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class ParcelableCompat {

    static class ParcelableCompatCreatorHoneycombMR2<T> implements Parcelable.ClassLoaderCreator<T> {

        /* JADX INFO: renamed from: k */
        private final t8r<T> f3700k;

        ParcelableCompatCreatorHoneycombMR2(t8r<T> t8rVar) {
            this.f3700k = t8rVar;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.f3700k.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i2) {
            return this.f3700k.newArray(i2);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f3700k.createFromParcel(parcel, classLoader);
        }
    }

    private ParcelableCompat() {
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public static <T> Parcelable.Creator<T> m2714k(t8r<T> t8rVar) {
        return new ParcelableCompatCreatorHoneycombMR2(t8rVar);
    }
}
