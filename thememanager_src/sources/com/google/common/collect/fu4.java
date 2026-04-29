package com.google.common.collect;

/* JADX INFO: compiled from: BoundType.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public enum fu4 {
    OPEN(false),
    CLOSED(true);

    final boolean inclusive;

    fu4(boolean z2) {
        this.inclusive = z2;
    }

    static fu4 forBoolean(boolean z2) {
        return z2 ? CLOSED : OPEN;
    }

    fu4 flip() {
        return forBoolean(!this.inclusive);
    }
}
