package com.google.android.exoplayer2.text;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3853q;
import com.google.common.collect.se;
import java.util.ArrayList;

/* JADX INFO: compiled from: CueDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy {

    /* JADX INFO: renamed from: k */
    static final String f22138k = "c";

    /* JADX INFO: renamed from: k */
    public se<toq> m13017k(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return C3853q.toq(toq.bs, (ArrayList) C3844k.f7l8(bundle.getParcelableArrayList(f22138k)));
    }
}
