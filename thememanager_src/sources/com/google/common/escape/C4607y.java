package com.google.common.escape;

/* JADX INFO: renamed from: com.google.common.escape.y */
/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
final class C4607y {

    /* JADX INFO: renamed from: k */
    private static final ThreadLocal<char[]> f26834k = new k();

    /* JADX INFO: renamed from: com.google.common.escape.y$k */
    /* JADX INFO: compiled from: Platform.java */
    static class k extends ThreadLocal<char[]> {
        k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public char[] initialValue() {
            return new char[1024];
        }
    }

    private C4607y() {
    }

    /* JADX INFO: renamed from: k */
    static char[] m16158k() {
        return f26834k.get();
    }
}
