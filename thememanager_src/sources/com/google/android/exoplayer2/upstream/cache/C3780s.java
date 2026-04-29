package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.C3548p;
import java.io.File;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.s */
/* JADX INFO: compiled from: CacheSpan.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3780s implements Comparable<C3780s> {

    /* JADX INFO: renamed from: g */
    public final boolean f22932g;

    /* JADX INFO: renamed from: k */
    public final String f22933k;

    /* JADX INFO: renamed from: n */
    public final long f22934n;

    /* JADX INFO: renamed from: q */
    public final long f22935q;

    /* JADX INFO: renamed from: s */
    public final long f22936s;

    /* JADX INFO: renamed from: y */
    @dd
    public final File f22937y;

    public C3780s(String str, long j2, long j3) {
        this(str, j2, j3, C3548p.f65257toq, null);
    }

    /* JADX INFO: renamed from: q */
    public boolean m13414q() {
        return this.f22934n == -1;
    }

    public String toString() {
        long j2 = this.f22935q;
        long j3 = this.f22934n;
        StringBuilder sb = new StringBuilder(44);
        sb.append("[");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public int compareTo(C3780s c3780s) {
        if (!this.f22933k.equals(c3780s.f22933k)) {
            return this.f22933k.compareTo(c3780s.f22933k);
        }
        long j2 = this.f22935q - c3780s.f22935q;
        if (j2 == 0) {
            return 0;
        }
        return j2 < 0 ? -1 : 1;
    }

    public boolean zy() {
        return !this.f22932g;
    }

    public C3780s(String str, long j2, long j3, long j4, @dd File file) {
        this.f22933k = str;
        this.f22935q = j2;
        this.f22934n = j3;
        this.f22932g = file != null;
        this.f22937y = file;
        this.f22936s = j4;
    }
}
