package com.google.common.escape;

import com.google.common.base.jk;
import java.util.Map;
import kotlin.jvm.internal.ki;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ArrayBasedUnicodeEscaper.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
@InterfaceC7731k
public abstract class zy extends AbstractC4606s {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final char f68252f7l8;

    /* JADX INFO: renamed from: g */
    private final int f26835g;

    /* JADX INFO: renamed from: n */
    private final int f26836n;

    /* JADX INFO: renamed from: q */
    private final int f26837q;

    /* JADX INFO: renamed from: y */
    private final char f26838y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final char[][] f68253zy;

    protected zy(Map<Character, String> map, int i2, int i3, @NullableDecl String str) {
        this(toq.m16157k(map), i2, i3, str);
    }

    @Override // com.google.common.escape.AbstractC4606s
    protected final int f7l8(CharSequence charSequence, int i2, int i3) {
        while (i2 < i3) {
            char cCharAt = charSequence.charAt(i2);
            if ((cCharAt < this.f26837q && this.f68253zy[cCharAt] != null) || cCharAt > this.f26838y || cCharAt < this.f68252f7l8) {
                break;
            }
            i2++;
        }
        return i2;
    }

    @Override // com.google.common.escape.AbstractC4606s
    /* JADX INFO: renamed from: q */
    protected final char[] mo16144q(int i2) {
        char[] cArr;
        if (i2 < this.f26837q && (cArr = this.f68253zy[i2]) != null) {
            return cArr;
        }
        if (i2 < this.f26836n || i2 > this.f26835g) {
            return m16160y(i2);
        }
        return null;
    }

    @Override // com.google.common.escape.AbstractC4606s, com.google.common.escape.AbstractC4601g
    public final String toq(String str) {
        jk.a9(str);
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if ((cCharAt < this.f26837q && this.f68253zy[cCharAt] != null) || cCharAt > this.f26838y || cCharAt < this.f68252f7l8) {
                return m16156n(str, i2);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: y */
    protected abstract char[] m16160y(int i2);

    protected zy(toq toqVar, int i2, int i3, @NullableDecl String str) {
        jk.a9(toqVar);
        char[][] cArrZy = toqVar.zy();
        this.f68253zy = cArrZy;
        this.f26837q = cArrZy.length;
        if (i3 < i2) {
            i3 = -1;
            i2 = Integer.MAX_VALUE;
        }
        this.f26836n = i2;
        this.f26835g = i3;
        if (i2 >= 55296) {
            this.f68252f7l8 = ki.f81842zy;
            this.f26838y = (char) 0;
        } else {
            this.f68252f7l8 = (char) i2;
            this.f26838y = (char) Math.min(i3, 55295);
        }
    }
}
