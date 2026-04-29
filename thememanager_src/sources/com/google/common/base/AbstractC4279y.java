package com.google.common.base;

/* JADX INFO: renamed from: com.google.common.base.y */
/* JADX INFO: compiled from: CommonPattern.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
abstract class AbstractC4279y {
    AbstractC4279y() {
    }

    public static AbstractC4279y compile(String str) {
        return mcp.m15407k(str);
    }

    public static boolean isPcreLike() {
        return mcp.m15412y();
    }

    public abstract int flags();

    public abstract f7l8 matcher(CharSequence charSequence);

    public abstract String pattern();

    public abstract String toString();
}
