package com.xiaomi.accountsdk.utils;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.n */
/* JADX INFO: compiled from: AccountLog.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5574n {

    /* JADX INFO: renamed from: k */
    private static final AbstractC5574n f31046k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static AbstractC5574n f72975toq;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.n$k */
    /* JADX INFO: compiled from: AccountLog.java */
    static class k extends AbstractC5574n {
        k() {
        }

        @Override // com.xiaomi.accountsdk.utils.AbstractC5574n
        public int cdj(String str, String str2, Throwable th) {
            return Log.v(str, str2, th);
        }

        @Override // com.xiaomi.accountsdk.utils.AbstractC5574n
        /* JADX INFO: renamed from: h */
        public int mo19117h(String str, String str2) {
            return Log.v(str, str2);
        }

        @Override // com.xiaomi.accountsdk.utils.AbstractC5574n
        /* JADX INFO: renamed from: i */
        public int mo19118i(String str, Throwable th) {
            return Log.w(str, th);
        }

        @Override // com.xiaomi.accountsdk.utils.AbstractC5574n
        public int ki(String str, String str2) {
            return Log.w(str, str2);
        }

        @Override // com.xiaomi.accountsdk.utils.AbstractC5574n
        public int kja0(String str, String str2, Throwable th) {
            return Log.i(str, str2, th);
        }

        @Override // com.xiaomi.accountsdk.utils.AbstractC5574n
        public int ld6(String str, String str2, Throwable th) {
            return Log.d(str, str2, th);
        }

        @Override // com.xiaomi.accountsdk.utils.AbstractC5574n
        public int n7h(String str, String str2) {
            return Log.i(str, str2);
        }

        @Override // com.xiaomi.accountsdk.utils.AbstractC5574n
        /* JADX INFO: renamed from: p */
        public int mo19119p(String str, String str2) {
            return Log.d(str, str2);
        }

        @Override // com.xiaomi.accountsdk.utils.AbstractC5574n
        public int qrj(String str, String str2, Throwable th) {
            return Log.e(str, str2, th);
        }

        @Override // com.xiaomi.accountsdk.utils.AbstractC5574n
        public int t8r(String str, String str2, Throwable th) {
            return Log.w(str, str2, th);
        }

        @Override // com.xiaomi.accountsdk.utils.AbstractC5574n
        public int x2(String str, String str2) {
            return Log.e(str, str2);
        }
    }

    static {
        k kVar = new k();
        f31046k = kVar;
        f72975toq = kVar;
    }

    private static String f7l8(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void fn3e(AbstractC5574n abstractC5574n) {
        if (abstractC5574n == null) {
            throw new IllegalArgumentException("log == null");
        }
        f72975toq = abstractC5574n;
    }

    public static int fu4(String str, String str2) {
        return m19110g().ki(str, str2);
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC5574n m19110g() {
        return f72975toq;
    }

    /* JADX INFO: renamed from: k */
    public static int m19111k(String str, String str2) {
        return m19110g().mo19119p(str, str2);
    }

    /* JADX INFO: renamed from: n */
    private static String m19112n(Throwable th) {
        return th == null ? "" : t8r.m19138k(f7l8(th));
    }

    public static int ni7(String str, String str2, Throwable th) {
        return m19110g().mo19117h(str, str2 + "\n" + m19112n(th));
    }

    public static int o1t(String str, Throwable th) {
        return m19110g().ki(str, m19112n(th));
    }

    /* JADX INFO: renamed from: q */
    public static int m19113q(String str, String str2, Throwable th) {
        return m19110g().x2(str, str2 + "\n" + m19112n(th));
    }

    /* JADX INFO: renamed from: s */
    public static int m19114s(String str, String str2, Throwable th) {
        return m19110g().n7h(str, str2 + "\n" + m19112n(th));
    }

    public static int toq(String str, String str2, Throwable th) {
        return m19110g().mo19119p(str, str2 + "\n" + m19112n(th));
    }

    /* JADX INFO: renamed from: y */
    public static int m19115y(String str, String str2) {
        return m19110g().n7h(str, str2);
    }

    /* JADX INFO: renamed from: z */
    public static int m19116z(String str, String str2, Throwable th) {
        return m19110g().ki(str, str2 + "\n" + m19112n(th));
    }

    public static int zurt(String str, String str2) {
        return m19110g().mo19117h(str, str2);
    }

    public static int zy(String str, String str2) {
        return m19110g().x2(str, str2);
    }

    protected abstract int cdj(String str, String str2, Throwable th);

    /* JADX INFO: renamed from: h */
    protected abstract int mo19117h(String str, String str2);

    /* JADX INFO: renamed from: i */
    protected abstract int mo19118i(String str, Throwable th);

    protected abstract int ki(String str, String str2);

    protected abstract int kja0(String str, String str2, Throwable th);

    protected abstract int ld6(String str, String str2, Throwable th);

    protected abstract int n7h(String str, String str2);

    /* JADX INFO: renamed from: p */
    protected abstract int mo19119p(String str, String str2);

    protected abstract int qrj(String str, String str2, Throwable th);

    protected abstract int t8r(String str, String str2, Throwable th);

    protected abstract int x2(String str, String str2);
}
