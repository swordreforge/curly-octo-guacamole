package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.c8jq;
import com.google.android.exoplayer2.util.C3844k;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: DataSpec.java */
/* JADX INFO: loaded from: classes2.dex */
public final class t8r {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f66905cdj = 2;

    /* JADX INFO: renamed from: h */
    public static final int f23101h = 1;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f66906ki = 3;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f66907kja0 = 8;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f66908n7h = 4;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f66909qrj = 2;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f66910x2 = 1;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final long f66911f7l8;

    /* JADX INFO: renamed from: g */
    @Deprecated
    public final long f23102g;

    /* JADX INFO: renamed from: k */
    public final Uri f23103k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @zy.dd
    public final Object f66912ld6;

    /* JADX INFO: renamed from: n */
    public final Map<String, String> f23104n;

    /* JADX INFO: renamed from: p */
    public final int f23105p;

    /* JADX INFO: renamed from: q */
    @zy.dd
    public final byte[] f23106q;

    /* JADX INFO: renamed from: s */
    @zy.dd
    public final String f23107s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final long f66913toq;

    /* JADX INFO: renamed from: y */
    public final long f23108y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final int f66914zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.t8r$q */
    /* JADX INFO: compiled from: DataSpec.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3823q {
    }

    /* JADX INFO: compiled from: DataSpec.java */
    public static final class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private long f66915f7l8;

        /* JADX INFO: renamed from: g */
        private long f23109g;

        /* JADX INFO: renamed from: k */
        @zy.dd
        private Uri f23110k;

        /* JADX INFO: renamed from: n */
        private Map<String, String> f23111n;

        /* JADX INFO: renamed from: p */
        @zy.dd
        private Object f23112p;

        /* JADX INFO: renamed from: q */
        @zy.dd
        private byte[] f23113q;

        /* JADX INFO: renamed from: s */
        private int f23114s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private long f66916toq;

        /* JADX INFO: renamed from: y */
        @zy.dd
        private String f23115y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f66917zy;

        public toq f7l8(@zy.dd String str) {
            this.f23115y = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public toq m13518g(Map<String, String> map) {
            this.f23111n = map;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public t8r m13519k() {
            C3844k.x2(this.f23110k, "The uri must be set.");
            return new t8r(this.f23110k, this.f66916toq, this.f66917zy, this.f23113q, this.f23111n, this.f23109g, this.f66915f7l8, this.f23115y, this.f23114s, this.f23112p);
        }

        public toq ld6(String str) {
            this.f23110k = Uri.parse(str);
            return this;
        }

        /* JADX INFO: renamed from: n */
        public toq m13520n(int i2) {
            this.f66917zy = i2;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public toq m13521p(Uri uri) {
            this.f23110k = uri;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public toq m13522q(@zy.dd byte[] bArr) {
            this.f23113q = bArr;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public toq m13523s(long j2) {
            this.f23109g = j2;
            return this;
        }

        public toq toq(@zy.dd Object obj) {
            this.f23112p = obj;
            return this;
        }

        public toq x2(long j2) {
            this.f66916toq = j2;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public toq m13524y(long j2) {
            this.f66915f7l8 = j2;
            return this;
        }

        public toq zy(int i2) {
            this.f23114s = i2;
            return this;
        }

        public toq() {
            this.f66917zy = 1;
            this.f23111n = Collections.emptyMap();
            this.f66915f7l8 = -1L;
        }

        private toq(t8r t8rVar) {
            this.f23110k = t8rVar.f23103k;
            this.f66916toq = t8rVar.f66913toq;
            this.f66917zy = t8rVar.f66914zy;
            this.f23113q = t8rVar.f23106q;
            this.f23111n = t8rVar.f23104n;
            this.f23109g = t8rVar.f66911f7l8;
            this.f66915f7l8 = t8rVar.f23108y;
            this.f23115y = t8rVar.f23107s;
            this.f23114s = t8rVar.f23105p;
            this.f23112p = t8rVar.f66912ld6;
        }
    }

    /* JADX INFO: compiled from: DataSpec.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface zy {
    }

    static {
        c8jq.m11556k("goog.exo.datasource");
    }

    public static String zy(int i2) {
        if (i2 == 1) {
            return "GET";
        }
        if (i2 == 2) {
            return "POST";
        }
        if (i2 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public t8r f7l8(Map<String, String> map) {
        HashMap map2 = new HashMap(this.f23104n);
        map2.putAll(map);
        return new t8r(this.f23103k, this.f66913toq, this.f66914zy, this.f23106q, map2, this.f66911f7l8, this.f23108y, this.f23107s, this.f23105p, this.f66912ld6);
    }

    /* JADX INFO: renamed from: g */
    public t8r m13512g(long j2, long j3) {
        return (j2 == 0 && this.f23108y == j3) ? this : new t8r(this.f23103k, this.f66913toq, this.f66914zy, this.f23106q, this.f23104n, this.f66911f7l8 + j2, j3, this.f23107s, this.f23105p, this.f66912ld6);
    }

    /* JADX INFO: renamed from: k */
    public toq m13513k() {
        return new toq();
    }

    /* JADX INFO: renamed from: n */
    public t8r m13514n(long j2) {
        long j3 = this.f23108y;
        return m13512g(j2, j3 != -1 ? j3 - j2 : -1L);
    }

    /* JADX INFO: renamed from: q */
    public boolean m13515q(int i2) {
        return (this.f23105p & i2) == i2;
    }

    /* JADX INFO: renamed from: s */
    public t8r m13516s(Uri uri) {
        return new t8r(uri, this.f66913toq, this.f66914zy, this.f23106q, this.f23104n, this.f66911f7l8, this.f23108y, this.f23107s, this.f23105p, this.f66912ld6);
    }

    public String toString() {
        String qVar = toq();
        String strValueOf = String.valueOf(this.f23103k);
        long j2 = this.f66911f7l8;
        long j3 = this.f23108y;
        String str = this.f23107s;
        int i2 = this.f23105p;
        StringBuilder sb = new StringBuilder(String.valueOf(qVar).length() + 70 + strValueOf.length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(qVar);
        sb.append(" ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    public final String toq() {
        return zy(this.f66914zy);
    }

    /* JADX INFO: renamed from: y */
    public t8r m13517y(Map<String, String> map) {
        return new t8r(this.f23103k, this.f66913toq, this.f66914zy, this.f23106q, map, this.f66911f7l8, this.f23108y, this.f23107s, this.f23105p, this.f66912ld6);
    }

    public t8r(Uri uri) {
        this(uri, 0L, -1L);
    }

    public t8r(Uri uri, long j2, long j3) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j2, j3, null, 0, null);
    }

    @Deprecated
    public t8r(Uri uri, int i2) {
        this(uri, 0L, -1L, null, i2);
    }

    @Deprecated
    public t8r(Uri uri, long j2, long j3, @zy.dd String str) {
        this(uri, j2, j2, j3, str, 0);
    }

    @Deprecated
    public t8r(Uri uri, long j2, long j3, @zy.dd String str, int i2) {
        this(uri, j2, j2, j3, str, i2);
    }

    @Deprecated
    public t8r(Uri uri, long j2, long j3, @zy.dd String str, int i2, Map<String, String> map) {
        this(uri, 1, null, j2, j2, j3, str, i2, map);
    }

    @Deprecated
    public t8r(Uri uri, long j2, long j3, long j4, @zy.dd String str, int i2) {
        this(uri, null, j2, j3, j4, str, i2);
    }

    @Deprecated
    public t8r(Uri uri, @zy.dd byte[] bArr, long j2, long j3, long j4, @zy.dd String str, int i2) {
        this(uri, bArr != null ? 2 : 1, bArr, j2, j3, j4, str, i2);
    }

    @Deprecated
    public t8r(Uri uri, int i2, @zy.dd byte[] bArr, long j2, long j3, long j4, @zy.dd String str, int i3) {
        this(uri, i2, bArr, j2, j3, j4, str, i3, Collections.emptyMap());
    }

    @Deprecated
    public t8r(Uri uri, int i2, @zy.dd byte[] bArr, long j2, long j3, long j4, @zy.dd String str, int i3, Map<String, String> map) {
        this(uri, j2 - j3, i2, bArr, map, j3, j4, str, i3, null);
    }

    private t8r(Uri uri, long j2, int i2, @zy.dd byte[] bArr, Map<String, String> map, long j3, long j4, @zy.dd String str, int i3, @zy.dd Object obj) {
        byte[] bArr2 = bArr;
        long j5 = j2 + j3;
        boolean z2 = true;
        C3844k.m13629k(j5 >= 0);
        C3844k.m13629k(j3 >= 0);
        if (j4 <= 0 && j4 != -1) {
            z2 = false;
        }
        C3844k.m13629k(z2);
        this.f23103k = uri;
        this.f66913toq = j2;
        this.f66914zy = i2;
        this.f23106q = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f23104n = Collections.unmodifiableMap(new HashMap(map));
        this.f66911f7l8 = j3;
        this.f23102g = j5;
        this.f23108y = j4;
        this.f23107s = str;
        this.f23105p = i3;
        this.f66912ld6 = obj;
    }
}
