package com.google.common.io;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.miui.maml.elements.MusicLyricParser;
import java.io.IOException;

/* JADX INFO: compiled from: LineBuffer.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
abstract class fn3e {

    /* JADX INFO: renamed from: k */
    private StringBuilder f27063k = new StringBuilder();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f68330toq;

    fn3e() {
    }

    @CanIgnoreReturnValue
    private boolean zy(boolean z2) throws IOException {
        mo16395q(this.f27063k.toString(), this.f68330toq ? z2 ? MusicLyricParser.CRLF : "\r" : z2 ? "\n" : "");
        this.f27063k = new StringBuilder();
        this.f68330toq = false;
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void m16394k(char[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r6.f68330toq
            r1 = 0
            r2 = 10
            r3 = 1
            if (r0 == 0) goto L1a
            if (r9 <= 0) goto L1a
            char r0 = r7[r8]
            if (r0 != r2) goto L10
            r0 = r3
            goto L11
        L10:
            r0 = r1
        L11:
            boolean r0 = r6.zy(r0)
            if (r0 == 0) goto L1a
            int r0 = r8 + 1
            goto L1b
        L1a:
            r0 = r8
        L1b:
            int r8 = r8 + r9
            r9 = r0
        L1d:
            if (r0 >= r8) goto L52
            char r4 = r7[r0]
            if (r4 == r2) goto L44
            r5 = 13
            if (r4 == r5) goto L28
            goto L50
        L28:
            java.lang.StringBuilder r4 = r6.f27063k
            int r5 = r0 - r9
            r4.append(r7, r9, r5)
            r6.f68330toq = r3
            int r9 = r0 + 1
            if (r9 >= r8) goto L4e
            char r4 = r7[r9]
            if (r4 != r2) goto L3b
            r4 = r3
            goto L3c
        L3b:
            r4 = r1
        L3c:
            boolean r4 = r6.zy(r4)
            if (r4 == 0) goto L4e
            r0 = r9
            goto L4e
        L44:
            java.lang.StringBuilder r4 = r6.f27063k
            int r5 = r0 - r9
            r4.append(r7, r9, r5)
            r6.zy(r3)
        L4e:
            int r9 = r0 + 1
        L50:
            int r0 = r0 + r3
            goto L1d
        L52:
            java.lang.StringBuilder r0 = r6.f27063k
            int r8 = r8 - r9
            r0.append(r7, r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.fn3e.m16394k(char[], int, int):void");
    }

    /* JADX INFO: renamed from: q */
    protected abstract void mo16395q(String str, String str2) throws IOException;

    protected void toq() throws IOException {
        if (this.f68330toq || this.f27063k.length() > 0) {
            zy(false);
        }
    }
}
