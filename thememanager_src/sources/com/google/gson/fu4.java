package com.google.gson;

import com.google.gson.internal.bind.C4875g;
import com.google.gson.internal.bind.C4878n;
import com.google.gson.stream.C4924k;
import com.google.gson.stream.C4926q;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: compiled from: TypeAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class fu4<T> {

    /* JADX INFO: renamed from: com.google.gson.fu4$k */
    /* JADX INFO: compiled from: TypeAdapter.java */
    class C4870k extends fu4<T> {
        C4870k() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: n */
        public T mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() != com.google.gson.stream.zy.NULL) {
                return (T) fu4.this.mo7087n(c4924k);
            }
            c4924k.a98o();
            return null;
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: s */
        public void mo7089s(C4926q c4926q, T t2) throws IOException {
            if (t2 == null) {
                c4926q.hyr();
            } else {
                fu4.this.mo7089s(c4926q, t2);
            }
        }
    }

    public final void f7l8(Writer writer, T t2) throws IOException {
        mo7089s(new C4926q(writer), t2);
    }

    /* JADX INFO: renamed from: g */
    public final String m17087g(T t2) {
        StringWriter stringWriter = new StringWriter();
        try {
            f7l8(stringWriter, t2);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final T m17088k(Reader reader) throws IOException {
        return mo7087n(new C4924k(reader));
    }

    /* JADX INFO: renamed from: n */
    public abstract T mo7087n(C4924k c4924k) throws IOException;

    /* JADX INFO: renamed from: q */
    public final fu4<T> m17089q() {
        return new C4870k();
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo7089s(C4926q c4926q, T t2) throws IOException;

    public final T toq(String str) throws IOException {
        return m17088k(new StringReader(str));
    }

    /* JADX INFO: renamed from: y */
    public final x2 m17090y(T t2) {
        try {
            C4875g c4875g = new C4875g();
            mo7089s(c4875g, t2);
            return c4875g.ngy();
        } catch (IOException e2) {
            throw new qrj(e2);
        }
    }

    public final T zy(x2 x2Var) {
        try {
            return mo7087n(new C4878n(x2Var));
        } catch (IOException e2) {
            throw new qrj(e2);
        }
    }
}
