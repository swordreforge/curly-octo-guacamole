package android.app;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class WallpaperColors implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ WallpaperColors(@NonNull Color color, @Nullable Color color2, @Nullable Color color3, int i2) {
    }

    public static native /* synthetic */ WallpaperColors fromBitmap(@NonNull Bitmap bitmap);

    @NonNull
    public native /* synthetic */ Color getPrimaryColor();

    @Nullable
    public native /* synthetic */ Color getSecondaryColor();

    @Nullable
    public native /* synthetic */ Color getTertiaryColor();

    @Override // android.os.Parcelable
    public native /* synthetic */ void writeToParcel(Parcel parcel, int i2);
}
