package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.ni7;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;
import zy.dd;

/* JADX INFO: compiled from: CachedContent.java */
/* JADX INFO: loaded from: classes2.dex */
final class ld6 {

    /* JADX INFO: renamed from: g */
    private static final String f22917g = "CachedContent";

    /* JADX INFO: renamed from: k */
    public final int f22918k;

    /* JADX INFO: renamed from: n */
    private kja0 f22919n;

    /* JADX INFO: renamed from: q */
    private final ArrayList<C3776k> f22920q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final String f66772toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final TreeSet<fn3e> f66773zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.ld6$k */
    /* JADX INFO: compiled from: CachedContent.java */
    private static final class C3776k {

        /* JADX INFO: renamed from: k */
        public final long f22921k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final long f66774toq;

        public C3776k(long j2, long j3) {
            this.f22921k = j2;
            this.f66774toq = j3;
        }

        /* JADX INFO: renamed from: k */
        public boolean m13402k(long j2, long j3) {
            long j4 = this.f66774toq;
            if (j4 == -1) {
                return j2 >= this.f22921k;
            }
            if (j3 == -1) {
                return false;
            }
            long j5 = this.f22921k;
            return j5 <= j2 && j2 + j3 <= j5 + j4;
        }

        public boolean toq(long j2, long j3) {
            long j4 = this.f22921k;
            if (j4 > j2) {
                return j3 == -1 || j2 + j3 > j4;
            }
            long j5 = this.f66774toq;
            return j5 == -1 || j4 + j5 > j2;
        }
    }

    public ld6(int i2, String str) {
        this(i2, str, kja0.f22914g);
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ld6.class != obj.getClass()) {
            return false;
        }
        ld6 ld6Var = (ld6) obj;
        return this.f22918k == ld6Var.f22918k && this.f66772toq.equals(ld6Var.f66772toq) && this.f66773zy.equals(ld6Var.f66773zy) && this.f22919n.equals(ld6Var.f22919n);
    }

    public boolean f7l8() {
        return this.f66773zy.isEmpty();
    }

    /* JADX INFO: renamed from: g */
    public TreeSet<fn3e> m13395g() {
        return this.f66773zy;
    }

    public int hashCode() {
        return (((this.f22918k * 31) + this.f66772toq.hashCode()) * 31) + this.f22919n.hashCode();
    }

    /* JADX INFO: renamed from: k */
    public void m13396k(fn3e fn3eVar) {
        this.f66773zy.add(fn3eVar);
    }

    public boolean ld6(C3780s c3780s) {
        if (!this.f66773zy.remove(c3780s)) {
            return false;
        }
        File file = c3780s.f22937y;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    /* JADX INFO: renamed from: n */
    public fn3e m13397n(long j2, long j3) {
        fn3e fn3eVarLd6 = fn3e.ld6(this.f66772toq, j2);
        fn3e fn3eVarFloor = this.f66773zy.floor(fn3eVarLd6);
        if (fn3eVarFloor != null && fn3eVarFloor.f22935q + fn3eVarFloor.f22934n > j2) {
            return fn3eVarFloor;
        }
        fn3e fn3eVarCeiling = this.f66773zy.ceiling(fn3eVarLd6);
        if (fn3eVarCeiling != null) {
            long j4 = fn3eVarCeiling.f22935q - j2;
            j3 = j3 == -1 ? j4 : Math.min(j4, j3);
        }
        return fn3e.m13369p(this.f66772toq, j2, j3);
    }

    /* JADX INFO: renamed from: p */
    public boolean m13398p(long j2, long j3) {
        for (int i2 = 0; i2 < this.f22920q.size(); i2++) {
            if (this.f22920q.get(i2).toq(j2, j3)) {
                return false;
            }
        }
        this.f22920q.add(new C3776k(j2, j3));
        return true;
    }

    /* JADX INFO: renamed from: q */
    public kja0 m13399q() {
        return this.f22919n;
    }

    public void qrj(long j2) {
        for (int i2 = 0; i2 < this.f22920q.size(); i2++) {
            if (this.f22920q.get(i2).f22921k == j2) {
                this.f22920q.remove(i2);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: s */
    public boolean m13400s() {
        return this.f22920q.isEmpty();
    }

    public boolean toq(n7h n7hVar) {
        this.f22919n = this.f22919n.m13394y(n7hVar);
        return !r2.equals(r0);
    }

    public fn3e x2(fn3e fn3eVar, long j2, boolean z2) {
        C3844k.m13633s(this.f66773zy.remove(fn3eVar));
        File file = (File) C3844k.f7l8(fn3eVar.f22937y);
        if (z2) {
            File fileX2 = fn3e.x2((File) C3844k.f7l8(file.getParentFile()), this.f22918k, fn3eVar.f22935q, j2);
            if (file.renameTo(fileX2)) {
                file = fileX2;
            } else {
                String strValueOf = String.valueOf(file);
                String strValueOf2 = String.valueOf(fileX2);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 21 + strValueOf2.length());
                sb.append("Failed to rename ");
                sb.append(strValueOf);
                sb.append(" to ");
                sb.append(strValueOf2);
                ni7.qrj(f22917g, sb.toString());
            }
        }
        fn3e fn3eVarM13371n = fn3eVar.m13371n(file, j2);
        this.f66773zy.add(fn3eVarM13371n);
        return fn3eVarM13371n;
    }

    /* JADX INFO: renamed from: y */
    public boolean m13401y(long j2, long j3) {
        for (int i2 = 0; i2 < this.f22920q.size(); i2++) {
            if (this.f22920q.get(i2).m13402k(j2, j3)) {
                return true;
            }
        }
        return false;
    }

    public long zy(long j2, long j3) {
        C3844k.m13629k(j2 >= 0);
        C3844k.m13629k(j3 >= 0);
        fn3e fn3eVarM13397n = m13397n(j2, j3);
        if (fn3eVarM13397n.zy()) {
            return -Math.min(fn3eVarM13397n.m13414q() ? Long.MAX_VALUE : fn3eVarM13397n.f22934n, j3);
        }
        long j4 = j2 + j3;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long jMax = fn3eVarM13397n.f22935q + fn3eVarM13397n.f22934n;
        if (jMax < j5) {
            for (fn3e fn3eVar : this.f66773zy.tailSet(fn3eVarM13397n, false)) {
                long j6 = fn3eVar.f22935q;
                if (j6 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j6 + fn3eVar.f22934n);
                if (jMax >= j5) {
                    break;
                }
            }
        }
        return Math.min(jMax - j2, j3);
    }

    public ld6(int i2, String str, kja0 kja0Var) {
        this.f22918k = i2;
        this.f66772toq = str;
        this.f22919n = kja0Var;
        this.f66773zy = new TreeSet<>();
        this.f22920q = new ArrayList<>();
    }
}
