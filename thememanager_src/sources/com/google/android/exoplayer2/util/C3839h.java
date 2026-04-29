package com.google.android.exoplayer2.util;

import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: com.google.android.exoplayer2.util.h */
/* JADX INFO: compiled from: FlagSet.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3839h {

    /* JADX INFO: renamed from: k */
    private final SparseBooleanArray f23196k;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.h$toq */
    /* JADX INFO: compiled from: FlagSet.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        private final SparseBooleanArray f23197k = new SparseBooleanArray();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f66992toq;

        public toq f7l8(int... iArr) {
            for (int i2 : iArr) {
                m13606g(i2);
            }
            return this;
        }

        /* JADX INFO: renamed from: g */
        public toq m13606g(int i2) {
            C3844k.m13633s(!this.f66992toq);
            this.f23197k.delete(i2);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public toq m13607k(int i2) {
            C3844k.m13633s(!this.f66992toq);
            this.f23197k.append(i2, true);
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C3839h m13608n() {
            C3844k.m13633s(!this.f66992toq);
            this.f66992toq = true;
            return new C3839h(this.f23197k);
        }

        /* JADX INFO: renamed from: q */
        public toq m13609q(int i2, boolean z2) {
            return z2 ? m13607k(i2) : this;
        }

        public toq toq(C3839h c3839h) {
            for (int i2 = 0; i2 < c3839h.m13605q(); i2++) {
                m13607k(c3839h.zy(i2));
            }
            return this;
        }

        /* JADX INFO: renamed from: y */
        public toq m13610y(int i2, boolean z2) {
            return z2 ? m13606g(i2) : this;
        }

        public toq zy(int... iArr) {
            for (int i2 : iArr) {
                m13607k(i2);
            }
            return this;
        }
    }

    public boolean equals(@zy.dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3839h)) {
            return false;
        }
        C3839h c3839h = (C3839h) obj;
        if (lrht.f23230k >= 24) {
            return this.f23196k.equals(c3839h.f23196k);
        }
        if (m13605q() != c3839h.m13605q()) {
            return false;
        }
        for (int i2 = 0; i2 < m13605q(); i2++) {
            if (zy(i2) != c3839h.zy(i2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (lrht.f23230k >= 24) {
            return this.f23196k.hashCode();
        }
        int iM13605q = m13605q();
        for (int i2 = 0; i2 < m13605q(); i2++) {
            iM13605q = (iM13605q * 31) + zy(i2);
        }
        return iM13605q;
    }

    /* JADX INFO: renamed from: k */
    public boolean m13604k(int i2) {
        return this.f23196k.get(i2);
    }

    /* JADX INFO: renamed from: q */
    public int m13605q() {
        return this.f23196k.size();
    }

    public boolean toq(int... iArr) {
        for (int i2 : iArr) {
            if (m13604k(i2)) {
                return true;
            }
        }
        return false;
    }

    public int zy(int i2) {
        C3844k.zy(i2, 0, m13605q());
        return this.f23196k.keyAt(i2);
    }

    private C3839h(SparseBooleanArray sparseBooleanArray) {
        this.f23196k = sparseBooleanArray;
    }
}
