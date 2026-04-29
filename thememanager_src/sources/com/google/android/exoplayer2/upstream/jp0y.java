package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.kja0;
import com.google.android.exoplayer2.yqrt;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: HttpDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public interface jp0y extends kja0 {

    /* JADX INFO: renamed from: k */
    public static final com.google.common.base.a9<String> f23028k = new com.google.common.base.a9() { // from class: com.google.android.exoplayer2.upstream.fti
        @Override // com.google.common.base.a9
        public final boolean apply(Object obj) {
            return jp0y.ld6((String) obj);
        }
    };

    /* JADX INFO: compiled from: HttpDataSource.java */
    public static final class f7l8 {

        /* JADX INFO: renamed from: k */
        private final Map<String, String> f23029k = new HashMap();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.dd
        private Map<String, String> f66864toq;

        /* JADX INFO: renamed from: g */
        public synchronized void m13479g(Map<String, String> map) {
            this.f66864toq = null;
            this.f23029k.putAll(map);
        }

        /* JADX INFO: renamed from: k */
        public synchronized void m13480k() {
            this.f66864toq = null;
            this.f23029k.clear();
        }

        /* JADX INFO: renamed from: n */
        public synchronized void m13481n(String str, String str2) {
            this.f66864toq = null;
            this.f23029k.put(str, str2);
        }

        /* JADX INFO: renamed from: q */
        public synchronized void m13482q(String str) {
            this.f66864toq = null;
            this.f23029k.remove(str);
        }

        public synchronized void toq(Map<String, String> map) {
            this.f66864toq = null;
            this.f23029k.clear();
            this.f23029k.putAll(map);
        }

        public synchronized Map<String, String> zy() {
            if (this.f66864toq == null) {
                this.f66864toq = Collections.unmodifiableMap(new HashMap(this.f23029k));
            }
            return this.f66864toq;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.jp0y$g */
    /* JADX INFO: compiled from: HttpDataSource.java */
    public static final class C3799g extends C3802q {
        public final Map<String, List<String>> headerFields;
        public final byte[] responseBody;
        public final int responseCode;

        @zy.dd
        public final String responseMessage;

        @Deprecated
        public C3799g(int i2, Map<String, List<String>> map, t8r t8rVar) {
            this(i2, null, null, map, t8rVar, com.google.android.exoplayer2.util.lrht.f23228g);
        }

        @Deprecated
        public C3799g(int i2, @zy.dd String str, Map<String, List<String>> map, t8r t8rVar) {
            this(i2, str, null, map, t8rVar, com.google.android.exoplayer2.util.lrht.f23228g);
        }

        public C3799g(int i2, @zy.dd String str, @zy.dd IOException iOException, Map<String, List<String>> map, t8r t8rVar, byte[] bArr) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response code: ");
            sb.append(i2);
            super(sb.toString(), iOException, t8rVar, yqrt.ERROR_CODE_IO_BAD_HTTP_STATUS, 1);
            this.responseCode = i2;
            this.responseMessage = str;
            this.headerFields = map;
            this.responseBody = bArr;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.jp0y$k */
    /* JADX INFO: compiled from: HttpDataSource.java */
    public static abstract class AbstractC3800k implements zy {

        /* JADX INFO: renamed from: k */
        private final f7l8 f23030k = new f7l8();

        @Override // com.google.android.exoplayer2.upstream.jp0y.zy
        public final zy toq(Map<String, String> map) {
            this.f23030k.toq(map);
            return this;
        }

        protected abstract jp0y zy(f7l8 f7l8Var);

        @Override // com.google.android.exoplayer2.upstream.jp0y.zy, com.google.android.exoplayer2.upstream.kja0.InterfaceC3804k
        /* JADX INFO: renamed from: k */
        public final jp0y mo7265k() {
            return zy(this.f23030k);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.jp0y$n */
    /* JADX INFO: compiled from: HttpDataSource.java */
    public static final class C3801n extends C3802q {
        public final String contentType;

        /* JADX WARN: Illegal instructions before constructor call */
        public C3801n(String str, t8r t8rVar) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "Invalid content type: ".concat(strValueOf) : new String("Invalid content type: "), t8rVar, 2003, 1);
            this.contentType = str;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.jp0y$q */
    /* JADX INFO: compiled from: HttpDataSource.java */
    public static class C3802q extends C3796h {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;
        public final t8r dataSpec;
        public final int type;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.jp0y$q$k */
        /* JADX INFO: compiled from: HttpDataSource.java */
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface k {
        }

        @Deprecated
        public C3802q(t8r t8rVar, int i2) {
            this(t8rVar, 2000, i2);
        }

        public static C3802q createForIOException(IOException iOException, t8r t8rVar, int i2) {
            String message = iOException.getMessage();
            int i3 = iOException instanceof SocketTimeoutException ? yqrt.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT : iOException instanceof InterruptedIOException ? 1004 : (message == null || !com.google.common.base.zy.f7l8(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            return i3 == 2007 ? new toq(iOException, t8rVar) : new C3802q(iOException, t8rVar, i3, i2);
        }

        /* JADX INFO: renamed from: k */
        private static int m13483k(int i2, int i3) {
            if (i2 == 2000 && i3 == 1) {
                return 2001;
            }
            return i2;
        }

        public C3802q(t8r t8rVar, int i2, int i3) {
            super(m13483k(i2, i3));
            this.dataSpec = t8rVar;
            this.type = i3;
        }

        @Deprecated
        public C3802q(String str, t8r t8rVar, int i2) {
            this(str, t8rVar, 2000, i2);
        }

        public C3802q(String str, t8r t8rVar, int i2, int i3) {
            super(str, m13483k(i2, i3));
            this.dataSpec = t8rVar;
            this.type = i3;
        }

        @Deprecated
        public C3802q(IOException iOException, t8r t8rVar, int i2) {
            this(iOException, t8rVar, 2000, i2);
        }

        public C3802q(IOException iOException, t8r t8rVar, int i2, int i3) {
            super(iOException, m13483k(i2, i3));
            this.dataSpec = t8rVar;
            this.type = i3;
        }

        @Deprecated
        public C3802q(String str, IOException iOException, t8r t8rVar, int i2) {
            this(str, iOException, t8rVar, 2000, i2);
        }

        public C3802q(String str, @zy.dd IOException iOException, t8r t8rVar, int i2, int i3) {
            super(str, iOException, m13483k(i2, i3));
            this.dataSpec = t8rVar;
            this.type = i3;
        }
    }

    /* JADX INFO: compiled from: HttpDataSource.java */
    public static final class toq extends C3802q {
        public toq(IOException iOException, t8r t8rVar) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, t8rVar, yqrt.ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED, 1);
        }
    }

    /* JADX INFO: compiled from: HttpDataSource.java */
    public interface zy extends kja0.InterfaceC3804k {
        @Override // com.google.android.exoplayer2.upstream.kja0.InterfaceC3804k
        /* JADX INFO: renamed from: k */
        jp0y mo7265k();

        zy toq(Map<String, String> map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean ld6(String str) {
        if (str == null) {
            return false;
        }
        String strF7l8 = com.google.common.base.zy.f7l8(str);
        if (TextUtils.isEmpty(strF7l8)) {
            return false;
        }
        return ((strF7l8.contains("text") && !strF7l8.contains(com.google.android.exoplayer2.util.wvg.f67099ek5k)) || strF7l8.contains("html") || strF7l8.contains("xml")) ? false : true;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    void close() throws C3802q;

    /* JADX INFO: renamed from: i */
    void mo13477i(String str);

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: k */
    long mo7270k(t8r t8rVar) throws C3802q;

    void ki();

    int n7h();

    /* JADX INFO: renamed from: q */
    void mo13478q(String str, String str2);

    @Override // com.google.android.exoplayer2.upstream.x2
    int read(byte[] bArr, int i2, int i3) throws C3802q;

    @Override // com.google.android.exoplayer2.upstream.kja0
    Map<String, List<String>> toq();
}
