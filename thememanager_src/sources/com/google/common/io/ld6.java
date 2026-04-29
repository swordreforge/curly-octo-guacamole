package com.google.common.io;

import com.google.common.base.d3;
import com.google.common.collect.se;
import com.google.common.collect.wlev;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: CharSource.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public abstract class ld6 {

    /* JADX INFO: renamed from: com.google.common.io.ld6$k */
    /* JADX INFO: compiled from: CharSource.java */
    private final class C4693k extends f7l8 {

        /* JADX INFO: renamed from: k */
        final Charset f27074k;

        C4693k(Charset charset) {
            this.f27074k = (Charset) com.google.common.base.jk.a9(charset);
        }

        @Override // com.google.common.io.f7l8
        /* JADX INFO: renamed from: k */
        public ld6 mo16389k(Charset charset) {
            return charset.equals(this.f27074k) ? ld6.this : super.mo16389k(charset);
        }

        @Override // com.google.common.io.f7l8
        public InputStream qrj() throws IOException {
            return new mcp(ld6.this.qrj(), this.f27074k, 8192);
        }

        public String toString() {
            return ld6.this.toString() + ".asByteSource(" + this.f27074k + ")";
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.ld6$n */
    /* JADX INFO: compiled from: CharSource.java */
    private static class C4694n extends toq {
        protected C4694n(String str) {
            super(str);
        }

        @Override // com.google.common.io.ld6
        /* JADX INFO: renamed from: g */
        public long mo16413g(Appendable appendable) throws IOException {
            appendable.append(this.f27075k);
            return this.f27075k.length();
        }

        @Override // com.google.common.io.ld6
        /* JADX INFO: renamed from: n */
        public long mo16415n(AbstractC4700p abstractC4700p) throws Throwable {
            com.google.common.base.jk.a9(abstractC4700p);
            try {
                ((Writer) n7h.m16425k().zy(abstractC4700p.toq())).write((String) this.f27075k);
                return this.f27075k.length();
            } finally {
            }
        }

        @Override // com.google.common.io.ld6.toq, com.google.common.io.ld6
        public Reader qrj() {
            return new StringReader((String) this.f27075k);
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.ld6$q */
    /* JADX INFO: compiled from: CharSource.java */
    private static final class C4695q extends C4694n {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final C4695q f68333zy = new C4695q();

        private C4695q() {
            super("");
        }

        @Override // com.google.common.io.ld6.toq
        public String toString() {
            return "CharSource.empty()";
        }
    }

    /* JADX INFO: compiled from: CharSource.java */
    private static class toq extends ld6 {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final d3 f68334toq = d3.qrj("\r\n|\n|\r");

        /* JADX INFO: renamed from: k */
        protected final CharSequence f27075k;

        /* JADX INFO: renamed from: com.google.common.io.ld6$toq$k */
        /* JADX INFO: compiled from: CharSource.java */
        class C4696k extends com.google.common.collect.zy<String> {

            /* JADX INFO: renamed from: n */
            Iterator<String> f27077n;

            C4696k() {
                this.f27077n = toq.f68334toq.n7h(toq.this.f27075k).iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public String mo15703k() {
                if (this.f27077n.hasNext()) {
                    String next = this.f27077n.next();
                    if (this.f27077n.hasNext() || !next.isEmpty()) {
                        return next;
                    }
                }
                return toq();
            }
        }

        protected toq(CharSequence charSequence) {
            this.f27075k = (CharSequence) com.google.common.base.jk.a9(charSequence);
        }

        /* JADX INFO: renamed from: i */
        private Iterator<String> m16418i() {
            return new C4696k();
        }

        @Override // com.google.common.io.ld6
        public <T> T cdj(zurt<T> zurtVar) throws IOException {
            Iterator<String> itM16418i = m16418i();
            while (itM16418i.hasNext() && zurtVar.mo16408k(itM16418i.next())) {
            }
            return zurtVar.getResult();
        }

        @Override // com.google.common.io.ld6
        /* JADX INFO: renamed from: h */
        public se<String> mo16414h() {
            return se.copyOf(m16418i());
        }

        @Override // com.google.common.io.ld6
        public String kja0() {
            Iterator<String> itM16418i = m16418i();
            if (itM16418i.hasNext()) {
                return itM16418i.next();
            }
            return null;
        }

        @Override // com.google.common.io.ld6
        public com.google.common.base.o1t<Long> ld6() {
            return com.google.common.base.o1t.of(Long.valueOf(this.f27075k.length()));
        }

        @Override // com.google.common.io.ld6
        public String n7h() {
            return this.f27075k.toString();
        }

        @Override // com.google.common.io.ld6
        /* JADX INFO: renamed from: p */
        public long mo16416p() {
            return this.f27075k.length();
        }

        @Override // com.google.common.io.ld6
        public Reader qrj() {
            return new C4702s(this.f27075k);
        }

        @Override // com.google.common.io.ld6
        /* JADX INFO: renamed from: s */
        public boolean mo16417s() {
            return this.f27075k.length() == 0;
        }

        public String toString() {
            return "CharSource.wrap(" + com.google.common.base.zy.ld6(this.f27075k, 30, "...") + ")";
        }
    }

    /* JADX INFO: compiled from: CharSource.java */
    private static final class zy extends ld6 {

        /* JADX INFO: renamed from: k */
        private final Iterable<? extends ld6> f27078k;

        zy(Iterable<? extends ld6> iterable) {
            this.f27078k = (Iterable) com.google.common.base.jk.a9(iterable);
        }

        @Override // com.google.common.io.ld6
        public com.google.common.base.o1t<Long> ld6() {
            Iterator<? extends ld6> it = this.f27078k.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                com.google.common.base.o1t<Long> o1tVarLd6 = it.next().ld6();
                if (!o1tVarLd6.isPresent()) {
                    return com.google.common.base.o1t.absent();
                }
                jLongValue += o1tVarLd6.get().longValue();
            }
            return com.google.common.base.o1t.of(Long.valueOf(jLongValue));
        }

        @Override // com.google.common.io.ld6
        /* JADX INFO: renamed from: p */
        public long mo16416p() throws IOException {
            Iterator<? extends ld6> it = this.f27078k.iterator();
            long jMo16416p = 0;
            while (it.hasNext()) {
                jMo16416p += it.next().mo16416p();
            }
            return jMo16416p;
        }

        @Override // com.google.common.io.ld6
        public Reader qrj() throws IOException {
            return new wvg(this.f27078k.iterator());
        }

        @Override // com.google.common.io.ld6
        /* JADX INFO: renamed from: s */
        public boolean mo16417s() throws IOException {
            Iterator<? extends ld6> it = this.f27078k.iterator();
            while (it.hasNext()) {
                if (!it.next().mo16417s()) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return "CharSource.concat(" + this.f27078k + ")";
        }
    }

    protected ld6() {
    }

    private long f7l8(Reader reader) throws IOException {
        long j2 = 0;
        while (true) {
            long jSkip = reader.skip(Long.MAX_VALUE);
            if (jSkip == 0) {
                return j2;
            }
            j2 += jSkip;
        }
    }

    public static ld6 ki(CharSequence charSequence) {
        return charSequence instanceof String ? new C4694n((String) charSequence) : new toq(charSequence);
    }

    /* JADX INFO: renamed from: q */
    public static ld6 m16411q(ld6... ld6VarArr) {
        return toq(se.copyOf(ld6VarArr));
    }

    public static ld6 toq(Iterable<? extends ld6> iterable) {
        return new zy(iterable);
    }

    /* JADX INFO: renamed from: y */
    public static ld6 m16412y() {
        return C4695q.f68333zy;
    }

    public static ld6 zy(Iterator<? extends ld6> it) {
        return toq(se.copyOf(it));
    }

    @CanIgnoreReturnValue
    @InterfaceC7731k
    public <T> T cdj(zurt<T> zurtVar) throws Throwable {
        com.google.common.base.jk.a9(zurtVar);
        try {
            return (T) x2.m16479y((Reader) n7h.m16425k().zy(qrj()), zurtVar);
        } finally {
        }
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: g */
    public long mo16413g(Appendable appendable) throws Throwable {
        com.google.common.base.jk.a9(appendable);
        try {
            return x2.toq((Reader) n7h.m16425k().zy(qrj()), appendable);
        } finally {
        }
    }

    /* JADX INFO: renamed from: h */
    public se<String> mo16414h() throws Throwable {
        try {
            BufferedReader bufferedReader = (BufferedReader) n7h.m16425k().zy(x2());
            ArrayList arrayListCdj = wlev.cdj();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return se.copyOf((Collection) arrayListCdj);
                }
                arrayListCdj.add(line);
            }
        } finally {
        }
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: k */
    public f7l8 mo16392k(Charset charset) {
        return new C4693k(charset);
    }

    @NullableDecl
    public String kja0() throws Throwable {
        try {
            return ((BufferedReader) n7h.m16425k().zy(x2())).readLine();
        } finally {
        }
    }

    @InterfaceC7731k
    public com.google.common.base.o1t<Long> ld6() {
        return com.google.common.base.o1t.absent();
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: n */
    public long mo16415n(AbstractC4700p abstractC4700p) throws Throwable {
        com.google.common.base.jk.a9(abstractC4700p);
        n7h n7hVarM16425k = n7h.m16425k();
        try {
            return x2.toq((Reader) n7hVarM16425k.zy(qrj()), (Writer) n7hVarM16425k.zy(abstractC4700p.toq()));
        } finally {
        }
    }

    public String n7h() throws Throwable {
        try {
            return x2.ld6((Reader) n7h.m16425k().zy(qrj()));
        } finally {
        }
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: p */
    public long mo16416p() throws Throwable {
        com.google.common.base.o1t<Long> o1tVarLd6 = ld6();
        if (o1tVarLd6.isPresent()) {
            return o1tVarLd6.get().longValue();
        }
        try {
            return f7l8((Reader) n7h.m16425k().zy(qrj()));
        } finally {
        }
    }

    public abstract Reader qrj() throws IOException;

    /* JADX INFO: renamed from: s */
    public boolean mo16417s() throws Throwable {
        com.google.common.base.o1t<Long> o1tVarLd6 = ld6();
        if (o1tVarLd6.isPresent()) {
            return o1tVarLd6.get().longValue() == 0;
        }
        n7h n7hVarM16425k = n7h.m16425k();
        try {
            return ((Reader) n7hVarM16425k.zy(qrj())).read() == -1;
        } catch (Throwable th) {
            try {
                throw n7hVarM16425k.m16427q(th);
            } finally {
                n7hVarM16425k.close();
            }
        }
    }

    public BufferedReader x2() throws IOException {
        Reader readerQrj = qrj();
        return readerQrj instanceof BufferedReader ? (BufferedReader) readerQrj : new BufferedReader(readerQrj);
    }
}
