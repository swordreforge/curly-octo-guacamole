package com.google.common.hash;

import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Funnels.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public final class qrj {

    /* JADX INFO: compiled from: Funnels.java */
    private enum f7l8 implements x2<CharSequence> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }

        @Override // com.google.common.hash.x2
        public void funnel(CharSequence charSequence, mcp mcpVar) {
            mcpVar.mo16344p(charSequence);
        }
    }

    /* JADX INFO: renamed from: com.google.common.hash.qrj$g */
    /* JADX INFO: compiled from: Funnels.java */
    private static class C4673g implements x2<CharSequence>, Serializable {
        private final Charset charset;

        /* JADX INFO: renamed from: com.google.common.hash.qrj$g$k */
        /* JADX INFO: compiled from: Funnels.java */
        private static class k implements Serializable {
            private static final long serialVersionUID = 0;
            private final String charsetCanonicalName;

            k(Charset charset) {
                this.charsetCanonicalName = charset.name();
            }

            private Object readResolve() {
                return qrj.m16361g(Charset.forName(this.charsetCanonicalName));
            }
        }

        C4673g(Charset charset) {
            this.charset = (Charset) com.google.common.base.jk.a9(charset);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof C4673g) {
                return this.charset.equals(((C4673g) obj).charset);
            }
            return false;
        }

        public int hashCode() {
            return C4673g.class.hashCode() ^ this.charset.hashCode();
        }

        public String toString() {
            return "Funnels.stringFunnel(" + this.charset.name() + ")";
        }

        Object writeReplace() {
            return new k(this.charset);
        }

        @Override // com.google.common.hash.x2
        public void funnel(CharSequence charSequence, mcp mcpVar) {
            mcpVar.qrj(charSequence, this.charset);
        }
    }

    /* JADX INFO: renamed from: com.google.common.hash.qrj$k */
    /* JADX INFO: compiled from: Funnels.java */
    private enum EnumC4674k implements x2<byte[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.byteArrayFunnel()";
        }

        @Override // com.google.common.hash.x2
        public void funnel(byte[] bArr, mcp mcpVar) {
            mcpVar.f7l8(bArr);
        }
    }

    /* JADX INFO: renamed from: com.google.common.hash.qrj$n */
    /* JADX INFO: compiled from: Funnels.java */
    private static class C4675n extends OutputStream {

        /* JADX INFO: renamed from: k */
        final mcp f27024k;

        C4675n(mcp mcpVar) {
            this.f27024k = (mcp) com.google.common.base.jk.a9(mcpVar);
        }

        public String toString() {
            return "Funnels.asOutputStream(" + this.f27024k + ")";
        }

        @Override // java.io.OutputStream
        public void write(int i2) {
            this.f27024k.mo16341s((byte) i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.f27024k.f7l8(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) {
            this.f27024k.ld6(bArr, i2, i3);
        }
    }

    /* JADX INFO: renamed from: com.google.common.hash.qrj$q */
    /* JADX INFO: compiled from: Funnels.java */
    private static class C4676q<E> implements x2<Iterable<? extends E>>, Serializable {
        private final x2<E> elementFunnel;

        C4676q(x2<E> x2Var) {
            this.elementFunnel = (x2) com.google.common.base.jk.a9(x2Var);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof C4676q) {
                return this.elementFunnel.equals(((C4676q) obj).elementFunnel);
            }
            return false;
        }

        public int hashCode() {
            return C4676q.class.hashCode() ^ this.elementFunnel.hashCode();
        }

        public String toString() {
            return "Funnels.sequentialFunnel(" + this.elementFunnel + ")";
        }

        @Override // com.google.common.hash.x2
        public void funnel(Iterable<? extends E> iterable, mcp mcpVar) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                this.elementFunnel.funnel(it.next(), mcpVar);
            }
        }
    }

    /* JADX INFO: compiled from: Funnels.java */
    private enum toq implements x2<Integer> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.integerFunnel()";
        }

        @Override // com.google.common.hash.x2
        public void funnel(Integer num, mcp mcpVar) {
            mcpVar.mo16340n(num.intValue());
        }
    }

    /* JADX INFO: compiled from: Funnels.java */
    private enum zy implements x2<Long> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.longFunnel()";
        }

        @Override // com.google.common.hash.x2
        public void funnel(Long l2, mcp mcpVar) {
            mcpVar.mo16337g(l2.longValue());
        }
    }

    private qrj() {
    }

    public static x2<CharSequence> f7l8() {
        return f7l8.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static x2<CharSequence> m16361g(Charset charset) {
        return new C4673g(charset);
    }

    /* JADX INFO: renamed from: k */
    public static OutputStream m16362k(mcp mcpVar) {
        return new C4675n(mcpVar);
    }

    /* JADX INFO: renamed from: n */
    public static <E> x2<Iterable<? extends E>> m16363n(x2<E> x2Var) {
        return new C4676q(x2Var);
    }

    /* JADX INFO: renamed from: q */
    public static x2<Long> m16364q() {
        return zy.INSTANCE;
    }

    public static x2<byte[]> toq() {
        return EnumC4674k.INSTANCE;
    }

    public static x2<Integer> zy() {
        return toq.INSTANCE;
    }
}
