package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.upstream.d3;
import com.google.android.exoplayer2.upstream.jp0y;
import com.google.android.exoplayer2.upstream.oc;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.t */
/* JADX INFO: compiled from: DefaultLoadErrorHandlingPolicy.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3821t implements d3 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @Deprecated
    public static final long f66903f7l8 = 60000;

    /* JADX INFO: renamed from: g */
    public static final long f23096g = 60000;

    /* JADX INFO: renamed from: n */
    public static final int f23097n = 6;

    /* JADX INFO: renamed from: q */
    public static final int f23098q = 3;

    /* JADX INFO: renamed from: s */
    private static final int f23099s = -1;

    /* JADX INFO: renamed from: y */
    public static final long f23100y = 300000;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f66904zy;

    public C3821t() {
        this(-1);
    }

    @Override // com.google.android.exoplayer2.upstream.d3
    /* JADX INFO: renamed from: k */
    public long mo13457k(d3.C3791q c3791q) {
        IOException iOException = c3791q.f66839zy;
        return ((iOException instanceof sok) || (iOException instanceof FileNotFoundException) || (iOException instanceof jp0y.toq) || (iOException instanceof oc.C3816y) || C3796h.isCausedByPositionOutOfRange(iOException)) ? C3548p.f65257toq : Math.min((c3791q.f23004q - 1) * 1000, 5000);
    }

    /* JADX INFO: renamed from: n */
    protected boolean m13511n(IOException iOException) {
        if (!(iOException instanceof jp0y.C3799g)) {
            return false;
        }
        int i2 = ((jp0y.C3799g) iOException).responseCode;
        return i2 == 403 || i2 == 404 || i2 == 410 || i2 == 416 || i2 == 500 || i2 == 503;
    }

    @Override // com.google.android.exoplayer2.upstream.d3
    public int toq(int i2) {
        int i3 = this.f66904zy;
        return i3 == -1 ? i2 == 7 ? 6 : 3 : i3;
    }

    @Override // com.google.android.exoplayer2.upstream.d3
    @zy.dd
    public d3.toq zy(d3.C3790k c3790k, d3.C3791q c3791q) {
        if (!m13511n(c3791q.f66839zy)) {
            return null;
        }
        if (c3790k.m13459k(1)) {
            return new d3.toq(1, 300000L);
        }
        if (c3790k.m13459k(2)) {
            return new d3.toq(2, 60000L);
        }
        return null;
    }

    public C3821t(int i2) {
        this.f66904zy = i2;
    }
}
