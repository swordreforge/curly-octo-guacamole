package com.google.common.escape;

import com.google.common.base.jk;
import java.util.Map;
import kotlin.jvm.internal.ki;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.escape.k */
/* JADX INFO: compiled from: ArrayBasedCharEscaper.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
@InterfaceC7731k
public abstract class AbstractC4602k extends AbstractC4605q {

    /* JADX INFO: renamed from: g */
    private final char f26828g;

    /* JADX INFO: renamed from: n */
    private final char f26829n;

    /* JADX INFO: renamed from: q */
    private final int f26830q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final char[][] f68246zy;

    protected AbstractC4602k(Map<Character, String> map, char c2, char c3) {
        this(toq.m16157k(map), c2, c3);
    }

    /* JADX INFO: renamed from: g */
    protected abstract char[] mo16148g(char c2);

    @Override // com.google.common.escape.AbstractC4605q, com.google.common.escape.AbstractC4601g
    public final String toq(String str) {
        jk.a9(str);
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if ((cCharAt < this.f26830q && this.f68246zy[cCharAt] != null) || cCharAt > this.f26828g || cCharAt < this.f26829n) {
                return m16154q(str, i2);
            }
        }
        return str;
    }

    @Override // com.google.common.escape.AbstractC4605q
    protected final char[] zy(char c2) {
        char[] cArr;
        if (c2 < this.f26830q && (cArr = this.f68246zy[c2]) != null) {
            return cArr;
        }
        if (c2 < this.f26829n || c2 > this.f26828g) {
            return mo16148g(c2);
        }
        return null;
    }

    protected AbstractC4602k(toq toqVar, char c2, char c3) {
        jk.a9(toqVar);
        char[][] cArrZy = toqVar.zy();
        this.f68246zy = cArrZy;
        this.f26830q = cArrZy.length;
        if (c3 < c2) {
            c3 = 0;
            c2 = ki.f81842zy;
        }
        this.f26829n = c2;
        this.f26828g = c3;
    }
}
