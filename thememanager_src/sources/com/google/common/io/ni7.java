package com.google.common.io;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.LinkedList;
import java.util.Queue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: LineReader.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class ni7 {

    /* JADX INFO: renamed from: g */
    private final fn3e f27093g;

    /* JADX INFO: renamed from: k */
    private final Readable f27094k;

    /* JADX INFO: renamed from: n */
    private final Queue<String> f27095n;

    /* JADX INFO: renamed from: q */
    private final char[] f27096q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @NullableDecl
    private final Reader f68336toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final CharBuffer f68337zy;

    /* JADX INFO: renamed from: com.google.common.io.ni7$k */
    /* JADX INFO: compiled from: LineReader.java */
    class C4699k extends fn3e {
        C4699k() {
        }

        @Override // com.google.common.io.fn3e
        /* JADX INFO: renamed from: q */
        protected void mo16395q(String str, String str2) {
            ni7.this.f27095n.add(str);
        }
    }

    public ni7(Readable readable) {
        CharBuffer charBufferM16475n = x2.m16475n();
        this.f68337zy = charBufferM16475n;
        this.f27096q = charBufferM16475n.array();
        this.f27095n = new LinkedList();
        this.f27093g = new C4699k();
        this.f27094k = (Readable) com.google.common.base.jk.a9(readable);
        this.f68336toq = readable instanceof Reader ? (Reader) readable : null;
    }

    @CanIgnoreReturnValue
    public String toq() throws IOException {
        int i2;
        while (true) {
            if (this.f27095n.peek() != null) {
                break;
            }
            this.f68337zy.clear();
            Reader reader = this.f68336toq;
            if (reader != null) {
                char[] cArr = this.f27096q;
                i2 = reader.read(cArr, 0, cArr.length);
            } else {
                i2 = this.f27094k.read(this.f68337zy);
            }
            if (i2 == -1) {
                this.f27093g.toq();
                break;
            }
            this.f27093g.m16394k(this.f27096q, 0, i2);
        }
        return this.f27095n.poll();
    }
}
