package com.google.android.exoplayer2.text;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.exoplayer2.util.C3853q;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.q */
/* JADX INFO: compiled from: CueEncoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3659q {
    /* JADX INFO: renamed from: k */
    public byte[] m12921k(List<toq> list) {
        ArrayList<Bundle> arrayListF7l8 = C3853q.f7l8(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListF7l8);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
