package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* JADX INFO: renamed from: k */
    public final String f20804k;

    public Id3Frame(String str) {
        this.f20804k = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f20804k;
    }
}
