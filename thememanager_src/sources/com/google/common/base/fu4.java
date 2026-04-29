package com.google.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: MoreObjects.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class fu4 {

    /* JADX INFO: compiled from: MoreObjects.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        private final String f25659k;

        /* JADX INFO: renamed from: q */
        private boolean f25660q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final C4257k f68098toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private C4257k f68099zy;

        /* JADX INFO: renamed from: com.google.common.base.fu4$toq$k */
        /* JADX INFO: compiled from: MoreObjects.java */
        private static final class C4257k {

            /* JADX INFO: renamed from: k */
            @NullableDecl
            String f25661k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            @NullableDecl
            Object f68100toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            @NullableDecl
            C4257k f68101zy;

            private C4257k() {
            }
        }

        /* JADX INFO: renamed from: p */
        private toq m15353p(String str, @NullableDecl Object obj) {
            C4257k c4257kM15355y = m15355y();
            c4257kM15355y.f68100toq = obj;
            c4257kM15355y.f25661k = (String) jk.a9(str);
            return this;
        }

        /* JADX INFO: renamed from: s */
        private toq m15354s(@NullableDecl Object obj) {
            m15355y().f68100toq = obj;
            return this;
        }

        /* JADX INFO: renamed from: y */
        private C4257k m15355y() {
            C4257k c4257k = new C4257k();
            this.f68099zy.f68101zy = c4257k;
            this.f68099zy = c4257k;
            return c4257k;
        }

        @CanIgnoreReturnValue
        public toq cdj(boolean z2) {
            return m15354s(String.valueOf(z2));
        }

        @CanIgnoreReturnValue
        public toq f7l8(String str, boolean z2) {
            return m15353p(str, String.valueOf(z2));
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: g */
        public toq m15356g(String str, @NullableDecl Object obj) {
            return m15353p(str, obj);
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: h */
        public toq m15357h(@NullableDecl Object obj) {
            return m15354s(obj);
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: k */
        public toq m15358k(String str, char c2) {
            return m15353p(str, String.valueOf(c2));
        }

        @CanIgnoreReturnValue
        public toq ki() {
            this.f25660q = true;
            return this;
        }

        @CanIgnoreReturnValue
        public toq kja0(long j2) {
            return m15354s(String.valueOf(j2));
        }

        @CanIgnoreReturnValue
        public toq ld6(char c2) {
            return m15354s(String.valueOf(c2));
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: n */
        public toq m15359n(String str, long j2) {
            return m15353p(str, String.valueOf(j2));
        }

        @CanIgnoreReturnValue
        public toq n7h(int i2) {
            return m15354s(String.valueOf(i2));
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: q */
        public toq m15360q(String str, int i2) {
            return m15353p(str, String.valueOf(i2));
        }

        @CanIgnoreReturnValue
        public toq qrj(float f2) {
            return m15354s(String.valueOf(f2));
        }

        public String toString() {
            boolean z2 = this.f25660q;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f25659k);
            sb.append('{');
            String str = "";
            for (C4257k c4257k = this.f68098toq.f68101zy; c4257k != null; c4257k = c4257k.f68101zy) {
                Object obj = c4257k.f68100toq;
                if (!z2 || obj != null) {
                    sb.append(str);
                    String str2 = c4257k.f25661k;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        @CanIgnoreReturnValue
        public toq toq(String str, double d2) {
            return m15353p(str, String.valueOf(d2));
        }

        @CanIgnoreReturnValue
        public toq x2(double d2) {
            return m15354s(String.valueOf(d2));
        }

        @CanIgnoreReturnValue
        public toq zy(String str, float f2) {
            return m15353p(str, String.valueOf(f2));
        }

        private toq(String str) {
            C4257k c4257k = new C4257k();
            this.f68098toq = c4257k;
            this.f68099zy = c4257k;
            this.f25660q = false;
            this.f25659k = (String) jk.a9(str);
        }
    }

    private fu4() {
    }

    /* JADX INFO: renamed from: k */
    public static <T> T m15351k(@NullableDecl T t2, @NullableDecl T t3) {
        if (t2 != null) {
            return t2;
        }
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException("Both parameters are null");
    }

    /* JADX INFO: renamed from: q */
    public static toq m15352q(String str) {
        return new toq(str);
    }

    public static toq toq(Class<?> cls) {
        return new toq(cls.getSimpleName());
    }

    public static toq zy(Object obj) {
        return new toq(obj.getClass().getSimpleName());
    }
}
