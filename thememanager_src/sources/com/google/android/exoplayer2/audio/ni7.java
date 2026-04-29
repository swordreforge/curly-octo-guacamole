package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.google.android.exoplayer2.C3548p;

/* JADX INFO: compiled from: AudioTimestampPoller.java */
/* JADX INFO: loaded from: classes2.dex */
final class ni7 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f63485f7l8 = 0;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f63486kja0 = 500000;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f63487ld6 = 4;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f63488n7h = 500000;

    /* JADX INFO: renamed from: p */
    private static final int f19428p = 3;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f63489qrj = 10000000;

    /* JADX INFO: renamed from: s */
    private static final int f19429s = 2;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f63490x2 = 10000;

    /* JADX INFO: renamed from: y */
    private static final int f19430y = 1;

    /* JADX INFO: renamed from: g */
    private long f19431g;

    /* JADX INFO: renamed from: k */
    @zy.dd
    private final C3261k f19432k;

    /* JADX INFO: renamed from: n */
    private long f19433n;

    /* JADX INFO: renamed from: q */
    private long f19434q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f63491toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f63492zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.ni7$k */
    /* JADX INFO: compiled from: AudioTimestampPoller.java */
    @zy.hyr(19)
    private static final class C3261k {

        /* JADX INFO: renamed from: k */
        private final AudioTrack f19435k;

        /* JADX INFO: renamed from: n */
        private long f19436n;

        /* JADX INFO: renamed from: q */
        private long f19437q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final AudioTimestamp f63493toq = new AudioTimestamp();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private long f63494zy;

        public C3261k(AudioTrack audioTrack) {
            this.f19435k = audioTrack;
        }

        /* JADX INFO: renamed from: k */
        public long m11504k() {
            return this.f19436n;
        }

        public long toq() {
            return this.f63493toq.nanoTime / 1000;
        }

        public boolean zy() {
            boolean timestamp = this.f19435k.getTimestamp(this.f63493toq);
            if (timestamp) {
                long j2 = this.f63493toq.framePosition;
                if (this.f19437q > j2) {
                    this.f63494zy++;
                }
                this.f19437q = j2;
                this.f19436n = j2 + (this.f63494zy << 32);
            }
            return timestamp;
        }
    }

    public ni7(AudioTrack audioTrack) {
        if (com.google.android.exoplayer2.util.lrht.f23230k >= 19) {
            this.f19432k = new C3261k(audioTrack);
            m11503y();
        } else {
            this.f19432k = null;
            m11498s(3);
        }
    }

    /* JADX INFO: renamed from: s */
    private void m11498s(int i2) {
        this.f63491toq = i2;
        if (i2 == 0) {
            this.f19433n = 0L;
            this.f19431g = -1L;
            this.f63492zy = System.nanoTime() / 1000;
            this.f19434q = 10000L;
            return;
        }
        if (i2 == 1) {
            this.f19434q = 10000L;
            return;
        }
        if (i2 == 2 || i2 == 3) {
            this.f19434q = 10000000L;
        } else {
            if (i2 != 4) {
                throw new IllegalStateException();
            }
            this.f19434q = 500000L;
        }
    }

    public void f7l8() {
        m11498s(4);
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: g */
    public boolean m11499g(long j2) {
        C3261k c3261k = this.f19432k;
        if (c3261k == null || j2 - this.f19433n < this.f19434q) {
            return false;
        }
        this.f19433n = j2;
        boolean zZy = c3261k.zy();
        int i2 = this.f63491toq;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zZy) {
                        m11503y();
                    }
                } else if (!zZy) {
                    m11503y();
                }
            } else if (!zZy) {
                m11503y();
            } else if (this.f19432k.m11504k() > this.f19431g) {
                m11498s(2);
            }
        } else if (zZy) {
            if (this.f19432k.toq() < this.f63492zy) {
                return false;
            }
            this.f19431g = this.f19432k.m11504k();
            m11498s(1);
        } else if (j2 - this.f63492zy > 500000) {
            m11498s(3);
        }
        return zZy;
    }

    /* JADX INFO: renamed from: k */
    public void m11500k() {
        if (this.f63491toq == 4) {
            m11503y();
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m11501n() {
        int i2 = this.f63491toq;
        return i2 == 1 || i2 == 2;
    }

    /* JADX INFO: renamed from: q */
    public boolean m11502q() {
        return this.f63491toq == 2;
    }

    @TargetApi(19)
    public long toq() {
        C3261k c3261k = this.f19432k;
        if (c3261k != null) {
            return c3261k.m11504k();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: y */
    public void m11503y() {
        if (this.f19432k != null) {
            m11498s(0);
        }
    }

    @TargetApi(19)
    public long zy() {
        C3261k c3261k = this.f19432k;
        return c3261k != null ? c3261k.toq() : C3548p.f65257toq;
    }
}
