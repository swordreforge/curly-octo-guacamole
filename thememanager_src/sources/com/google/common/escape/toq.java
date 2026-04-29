package com.google.common.escape;

import com.google.common.base.jk;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: ArrayBasedEscaperMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
@InterfaceC7731k
public final class toq {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final char[][] f68251toq = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 0, 0);

    /* JADX INFO: renamed from: k */
    private final char[][] f26833k;

    private toq(char[][] cArr) {
        this.f26833k = cArr;
    }

    /* JADX INFO: renamed from: k */
    public static toq m16157k(Map<Character, String> map) {
        return new toq(toq(map));
    }

    @InterfaceC7732q
    static char[][] toq(Map<Character, String> map) {
        jk.a9(map);
        if (map.isEmpty()) {
            return f68251toq;
        }
        char[][] cArr = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
        Iterator<Character> it = map.keySet().iterator();
        while (it.hasNext()) {
            char cCharValue = it.next().charValue();
            cArr[cCharValue] = map.get(Character.valueOf(cCharValue)).toCharArray();
        }
        return cArr;
    }

    char[][] zy() {
        return this.f26833k;
    }
}
