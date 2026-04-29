package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3847l;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: TsPayloadReader.java */
/* JADX INFO: loaded from: classes2.dex */
public interface d3 {

    /* JADX INFO: renamed from: k */
    public static final int f20197k = 1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f64430toq = 2;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f64431zy = 4;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.d3$k */
    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class C3405k {

        /* JADX INFO: renamed from: k */
        public final String f20198k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f64432toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final byte[] f64433zy;

        public C3405k(String str, int i2, byte[] bArr) {
            this.f20198k = str;
            this.f64432toq = i2;
            this.f64433zy = bArr;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.d3$n */
    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class C3406n {

        /* JADX INFO: renamed from: g */
        private static final int f20199g = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: k */
        private final String f20200k;

        /* JADX INFO: renamed from: n */
        private String f20201n;

        /* JADX INFO: renamed from: q */
        private int f20202q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f64434toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f64435zy;

        public C3406n(int i2, int i3) {
            this(Integer.MIN_VALUE, i2, i3);
        }

        /* JADX INFO: renamed from: q */
        private void m11951q() {
            if (this.f20202q == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        /* JADX INFO: renamed from: k */
        public void m11952k() {
            int i2 = this.f20202q;
            int i3 = i2 == Integer.MIN_VALUE ? this.f64434toq : i2 + this.f64435zy;
            this.f20202q = i3;
            String str = this.f20200k;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
            sb.append(str);
            sb.append(i3);
            this.f20201n = sb.toString();
        }

        public String toq() {
            m11951q();
            return this.f20201n;
        }

        public int zy() {
            m11951q();
            return this.f20202q;
        }

        public C3406n(int i2, int i3, int i4) {
            String string;
            if (i2 != Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(12);
                sb.append(i2);
                sb.append("/");
                string = sb.toString();
            } else {
                string = "";
            }
            this.f20200k = string;
            this.f64434toq = i3;
            this.f64435zy = i4;
            this.f20202q = Integer.MIN_VALUE;
            this.f20201n = "";
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.d3$q */
    /* JADX INFO: compiled from: TsPayloadReader.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3407q {
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        public final int f20203k;

        /* JADX INFO: renamed from: q */
        public final byte[] f20204q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @dd
        public final String f64436toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final List<C3405k> f64437zy;

        public toq(int i2, @dd String str, @dd List<C3405k> list, byte[] bArr) {
            this.f20203k = i2;
            this.f64436toq = str;
            this.f64437zy = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f20204q = bArr;
        }
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        SparseArray<d3> mo11953k();

        @dd
        d3 toq(int i2, toq toqVar);
    }

    /* JADX INFO: renamed from: k */
    void mo11950k(C3847l c3847l, com.google.android.exoplayer2.extractor.x2 x2Var, C3406n c3406n);

    void toq(com.google.android.exoplayer2.util.gvn7 gvn7Var, int i2) throws sok;

    void zy();
}
