package com.google.common.escape;

import com.google.common.base.jk;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.ki;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Escapers.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
@InterfaceC7731k
public final class f7l8 {

    /* JADX INFO: renamed from: k */
    private static final AbstractC4601g f26822k = new C4599k();

    /* JADX INFO: renamed from: com.google.common.escape.f7l8$k */
    /* JADX INFO: compiled from: Escapers.java */
    static class C4599k extends AbstractC4605q {
        C4599k() {
        }

        @Override // com.google.common.escape.AbstractC4605q, com.google.common.escape.AbstractC4601g
        public String toq(String str) {
            return (String) jk.a9(str);
        }

        @Override // com.google.common.escape.AbstractC4605q
        protected char[] zy(char c2) {
            return null;
        }
    }

    /* JADX INFO: compiled from: Escapers.java */
    static class toq extends AbstractC4606s {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ AbstractC4605q f68242zy;

        toq(AbstractC4605q abstractC4605q) {
            this.f68242zy = abstractC4605q;
        }

        @Override // com.google.common.escape.AbstractC4606s
        /* JADX INFO: renamed from: q */
        protected char[] mo16144q(int i2) {
            if (i2 < 65536) {
                return this.f68242zy.zy((char) i2);
            }
            char[] cArr = new char[2];
            Character.toChars(i2, cArr, 0);
            char[] cArrZy = this.f68242zy.zy(cArr[0]);
            char[] cArrZy2 = this.f68242zy.zy(cArr[1]);
            if (cArrZy == null && cArrZy2 == null) {
                return null;
            }
            int length = cArrZy != null ? cArrZy.length : 1;
            char[] cArr2 = new char[(cArrZy2 != null ? cArrZy2.length : 1) + length];
            if (cArrZy != null) {
                for (int i3 = 0; i3 < cArrZy.length; i3++) {
                    cArr2[i3] = cArrZy[i3];
                }
            } else {
                cArr2[0] = cArr[0];
            }
            if (cArrZy2 != null) {
                for (int i4 = 0; i4 < cArrZy2.length; i4++) {
                    cArr2[length + i4] = cArrZy2[i4];
                }
            } else {
                cArr2[length] = cArr[1];
            }
            return cArr2;
        }
    }

    /* JADX INFO: compiled from: Escapers.java */
    @InterfaceC7731k
    public static final class zy {

        /* JADX INFO: renamed from: k */
        private final Map<Character, String> f26823k;

        /* JADX INFO: renamed from: q */
        private String f26824q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private char f68243toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private char f68244zy;

        /* JADX INFO: renamed from: com.google.common.escape.f7l8$zy$k */
        /* JADX INFO: compiled from: Escapers.java */
        class C4600k extends AbstractC4602k {

            /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
            private final char[] f68245f7l8;

            C4600k(Map map, char c2, char c3) {
                super((Map<Character, String>) map, c2, c3);
                this.f68245f7l8 = zy.this.f26824q != null ? zy.this.f26824q.toCharArray() : null;
            }

            @Override // com.google.common.escape.AbstractC4602k
            /* JADX INFO: renamed from: g */
            protected char[] mo16148g(char c2) {
                return this.f68245f7l8;
            }
        }

        /* synthetic */ zy(C4599k c4599k) {
            this();
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: n */
        public zy m16146n(@NullableDecl String str) {
            this.f26824q = str;
            return this;
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: q */
        public zy m16147q(char c2, char c3) {
            this.f68243toq = c2;
            this.f68244zy = c3;
            return this;
        }

        @CanIgnoreReturnValue
        public zy toq(char c2, String str) {
            jk.a9(str);
            this.f26823k.put(Character.valueOf(c2), str);
            return this;
        }

        public AbstractC4601g zy() {
            return new C4600k(this.f26823k, this.f68243toq, this.f68244zy);
        }

        private zy() {
            this.f26823k = new HashMap();
            this.f68243toq = (char) 0;
            this.f68244zy = ki.f81842zy;
            this.f26824q = null;
        }
    }

    private f7l8() {
    }

    private static AbstractC4606s f7l8(AbstractC4605q abstractC4605q) {
        return new toq(abstractC4605q);
    }

    /* JADX INFO: renamed from: g */
    private static String m16140g(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: k */
    static AbstractC4606s m16141k(AbstractC4601g abstractC4601g) {
        jk.a9(abstractC4601g);
        if (abstractC4601g instanceof AbstractC4606s) {
            return (AbstractC4606s) abstractC4601g;
        }
        if (abstractC4601g instanceof AbstractC4605q) {
            return f7l8((AbstractC4605q) abstractC4601g);
        }
        throw new IllegalArgumentException("Cannot create a UnicodeEscaper from: " + abstractC4601g.getClass().getName());
    }

    /* JADX INFO: renamed from: n */
    public static AbstractC4601g m16142n() {
        return f26822k;
    }

    /* JADX INFO: renamed from: q */
    public static String m16143q(AbstractC4606s abstractC4606s, int i2) {
        return m16140g(abstractC4606s.mo16144q(i2));
    }

    public static zy toq() {
        return new zy(null);
    }

    public static String zy(AbstractC4605q abstractC4605q, char c2) {
        return m16140g(abstractC4605q.zy(c2));
    }
}
