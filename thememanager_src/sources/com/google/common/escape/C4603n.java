package com.google.common.escape;

import com.google.common.base.jk;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.Map;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.escape.n */
/* JADX INFO: compiled from: CharEscaperBuilder.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
@InterfaceC7731k
public final class C4603n {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f68247toq = -1;

    /* JADX INFO: renamed from: k */
    private final Map<Character, String> f26831k = new HashMap();

    /* JADX INFO: renamed from: com.google.common.escape.n$k */
    /* JADX INFO: compiled from: CharEscaperBuilder.java */
    private static class k extends AbstractC4605q {

        /* JADX INFO: renamed from: q */
        private final int f26832q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final char[][] f68248zy;

        k(char[][] cArr) {
            this.f68248zy = cArr;
            this.f26832q = cArr.length;
        }

        @Override // com.google.common.escape.AbstractC4605q, com.google.common.escape.AbstractC4601g
        public String toq(String str) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                char[][] cArr = this.f68248zy;
                if (cCharAt < cArr.length && cArr[cCharAt] != null) {
                    return m16154q(str, i2);
                }
            }
            return str;
        }

        @Override // com.google.common.escape.AbstractC4605q
        protected char[] zy(char c2) {
            if (c2 < this.f26832q) {
                return this.f68248zy[c2];
            }
            return null;
        }
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: k */
    public C4603n m16151k(char c2, String str) {
        this.f26831k.put(Character.valueOf(c2), (String) jk.a9(str));
        if (c2 > this.f68247toq) {
            this.f68247toq = c2;
        }
        return this;
    }

    /* JADX INFO: renamed from: q */
    public AbstractC4601g m16152q() {
        return new k(zy());
    }

    @CanIgnoreReturnValue
    public C4603n toq(char[] cArr, String str) {
        jk.a9(str);
        for (char c2 : cArr) {
            m16151k(c2, str);
        }
        return this;
    }

    public char[][] zy() {
        char[][] cArr = new char[this.f68247toq + 1][];
        for (Map.Entry<Character, String> entry : this.f26831k.entrySet()) {
            cArr[entry.getKey().charValue()] = entry.getValue().toCharArray();
        }
        return cArr;
    }
}
