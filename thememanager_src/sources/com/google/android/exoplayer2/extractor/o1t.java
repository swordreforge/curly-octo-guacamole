package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.C3844k;
import zy.dd;

/* JADX INFO: compiled from: SeekMap.java */
/* JADX INFO: loaded from: classes2.dex */
public interface o1t {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.o1t$k */
    /* JADX INFO: compiled from: SeekMap.java */
    public static final class C3388k {

        /* JADX INFO: renamed from: k */
        public final wvg f20107k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final wvg f64331toq;

        public C3388k(wvg wvgVar) {
            this(wvgVar, wvgVar);
        }

        public boolean equals(@dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3388k.class != obj.getClass()) {
                return false;
            }
            C3388k c3388k = (C3388k) obj;
            return this.f20107k.equals(c3388k.f20107k) && this.f64331toq.equals(c3388k.f64331toq);
        }

        public int hashCode() {
            return (this.f20107k.hashCode() * 31) + this.f64331toq.hashCode();
        }

        public String toString() {
            String string;
            String strValueOf = String.valueOf(this.f20107k);
            if (this.f20107k.equals(this.f64331toq)) {
                string = "";
            } else {
                String strValueOf2 = String.valueOf(this.f64331toq);
                StringBuilder sb = new StringBuilder(strValueOf2.length() + 2);
                sb.append(", ");
                sb.append(strValueOf2);
                string = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 2 + String.valueOf(string).length());
            sb2.append("[");
            sb2.append(strValueOf);
            sb2.append(string);
            sb2.append("]");
            return sb2.toString();
        }

        public C3388k(wvg wvgVar, wvg wvgVar2) {
            this.f20107k = (wvg) C3844k.f7l8(wvgVar);
            this.f64331toq = (wvg) C3844k.f7l8(wvgVar2);
        }
    }

    /* JADX INFO: compiled from: SeekMap.java */
    public static class toq implements o1t {

        /* JADX INFO: renamed from: n */
        private final C3388k f20108n;

        /* JADX INFO: renamed from: q */
        private final long f20109q;

        public toq(long j2) {
            this(j2, 0L);
        }

        @Override // com.google.android.exoplayer2.extractor.o1t
        public boolean f7l8() {
            return false;
        }

        @Override // com.google.android.exoplayer2.extractor.o1t
        /* JADX INFO: renamed from: n */
        public C3388k mo11754n(long j2) {
            return this.f20108n;
        }

        @Override // com.google.android.exoplayer2.extractor.o1t
        /* JADX INFO: renamed from: s */
        public long mo11755s() {
            return this.f20109q;
        }

        public toq(long j2, long j3) {
            this.f20109q = j2;
            this.f20108n = new C3388k(j3 == 0 ? wvg.f64718zy : new wvg(0L, j3));
        }
    }

    boolean f7l8();

    /* JADX INFO: renamed from: n */
    C3388k mo11754n(long j2);

    /* JADX INFO: renamed from: s */
    long mo11755s();
}
