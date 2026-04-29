package com.google.gson;

import com.google.gson.stream.C4924k;
import com.google.gson.stream.C4925n;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* JADX INFO: compiled from: JsonParser.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cdj {
    @Deprecated
    public cdj() {
    }

    /* JADX INFO: renamed from: g */
    public static x2 m17072g(String str) throws zurt {
        return m17073n(new StringReader(str));
    }

    /* JADX INFO: renamed from: n */
    public static x2 m17073n(Reader reader) throws qrj, zurt {
        try {
            C4924k c4924k = new C4924k(reader);
            x2 x2VarM17074q = m17074q(c4924k);
            if (!x2VarM17074q.m17235i() && c4924k.g1() != com.google.gson.stream.zy.END_DOCUMENT) {
                throw new zurt("Did not consume the entire document.");
            }
            return x2VarM17074q;
        } catch (C4925n e2) {
            throw new zurt(e2);
        } catch (IOException e3) {
            throw new qrj(e3);
        } catch (NumberFormatException e4) {
            throw new zurt(e4);
        }
    }

    /* JADX INFO: renamed from: q */
    public static x2 m17074q(C4924k c4924k) throws qrj, zurt {
        boolean zFu4 = c4924k.fu4();
        c4924k.h7am(true);
        try {
            try {
                return com.google.gson.internal.n7h.m17168k(c4924k);
            } catch (OutOfMemoryError e2) {
                throw new C4872h("Failed parsing JSON source: " + c4924k + " to Json", e2);
            } catch (StackOverflowError e3) {
                throw new C4872h("Failed parsing JSON source: " + c4924k + " to Json", e3);
            }
        } finally {
            c4924k.h7am(zFu4);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public x2 m17075k(C4924k c4924k) throws qrj, zurt {
        return m17074q(c4924k);
    }

    @Deprecated
    public x2 toq(Reader reader) throws qrj, zurt {
        return m17073n(reader);
    }

    @Deprecated
    public x2 zy(String str) throws zurt {
        return m17072g(str);
    }
}
