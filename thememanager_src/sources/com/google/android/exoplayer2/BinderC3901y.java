package com.google.android.exoplayer2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.exoplayer2.util.C3844k;
import com.google.common.collect.se;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.exoplayer2.y */
/* JADX INFO: compiled from: BundleListRetriever.java */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC3901y extends Binder {

    /* JADX INFO: renamed from: g */
    private static final int f23702g = 1;

    /* JADX INFO: renamed from: n */
    private static final int f23703n = 0;

    /* JADX INFO: renamed from: q */
    private static final int f23704q;

    /* JADX INFO: renamed from: y */
    private static final int f23705y = 2;

    /* JADX INFO: renamed from: k */
    private final com.google.common.collect.se<Bundle> f23706k;

    static {
        f23704q = com.google.android.exoplayer2.util.lrht.f23230k >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public BinderC3901y(List<Bundle> list) {
        this.f23706k = com.google.common.collect.se.copyOf((Collection) list);
    }

    /* JADX INFO: renamed from: k */
    public static com.google.common.collect.se<Bundle> m13948k(IBinder iBinder) {
        int i2;
        se.C4520k c4520kBuilder = com.google.common.collect.se.builder();
        int i3 = 0;
        int i4 = 1;
        while (i4 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i3);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i2 = parcelObtain2.readInt();
                        if (i2 == 1) {
                            c4520kBuilder.mo15569k((Bundle) C3844k.f7l8(parcelObtain2.readBundle()));
                            i3++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i4 = i2;
                } catch (RemoteException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return c4520kBuilder.mo15570n();
    }

    @Override // android.os.Binder
    protected boolean onTransact(int i2, Parcel parcel, @zy.dd Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return super.onTransact(i2, parcel, parcel2, i3);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.f23706k.size();
        int i4 = parcel.readInt();
        while (i4 < size && parcel2.dataSize() < f23704q) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.f23706k.get(i4));
            i4++;
        }
        parcel2.writeInt(i4 < size ? 2 : 0);
        return true;
    }
}
