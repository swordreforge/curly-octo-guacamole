package com.google.android.exoplayer2.ui;

/* JADX INFO: compiled from: TimeBar.java */
/* JADX INFO: loaded from: classes2.dex */
public interface hyr {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.hyr$k */
    /* JADX INFO: compiled from: TimeBar.java */
    public interface InterfaceC3749k {
        void f7l8(hyr hyrVar, long j2);

        void toq(hyr hyrVar, long j2);

        void zy(hyr hyrVar, long j2, boolean z2);
    }

    long getPreferredUpdateDelay();

    /* JADX INFO: renamed from: k */
    void mo13169k(InterfaceC3749k interfaceC3749k);

    void setAdGroupTimesMs(@zy.dd long[] jArr, @zy.dd boolean[] zArr, int i2);

    void setBufferedPosition(long j2);

    void setDuration(long j2);

    void setEnabled(boolean z2);

    void setKeyCountIncrement(int i2);

    void setKeyTimeIncrement(long j2);

    void setPosition(long j2);

    void toq(InterfaceC3749k interfaceC3749k);
}
