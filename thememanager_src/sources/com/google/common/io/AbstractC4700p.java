package com.google.common.io;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.common.io.p */
/* JADX INFO: compiled from: CharSink.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public abstract class AbstractC4700p {
    protected AbstractC4700p() {
    }

    /* JADX INFO: renamed from: g */
    public void m16432g(Iterable<? extends CharSequence> iterable, String str) throws Throwable {
        com.google.common.base.jk.a9(iterable);
        com.google.common.base.jk.a9(str);
        try {
            Writer writer = (Writer) n7h.m16425k().zy(m16433k());
            Iterator<? extends CharSequence> it = iterable.iterator();
            while (it.hasNext()) {
                writer.append(it.next()).append((CharSequence) str);
            }
            writer.flush();
        } finally {
        }
    }

    /* JADX INFO: renamed from: k */
    public Writer m16433k() throws IOException {
        Writer qVar = toq();
        return qVar instanceof BufferedWriter ? (BufferedWriter) qVar : new BufferedWriter(qVar);
    }

    /* JADX INFO: renamed from: n */
    public void m16434n(Iterable<? extends CharSequence> iterable) throws Throwable {
        m16432g(iterable, System.getProperty("line.separator"));
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: q */
    public long m16435q(Readable readable) throws Throwable {
        com.google.common.base.jk.a9(readable);
        try {
            Writer writer = (Writer) n7h.m16425k().zy(toq());
            long qVar = x2.toq(readable, writer);
            writer.flush();
            return qVar;
        } finally {
        }
    }

    public abstract Writer toq() throws IOException;

    public void zy(CharSequence charSequence) throws Throwable {
        com.google.common.base.jk.a9(charSequence);
        try {
            Writer writer = (Writer) n7h.m16425k().zy(toq());
            writer.append(charSequence);
            writer.flush();
        } finally {
        }
    }
}
