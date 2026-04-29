package androidx.core.os;

import androidx.core.util.C0642s;
import zy.dd;

/* JADX INFO: compiled from: OperationCanceledException.java */
/* JADX INFO: loaded from: classes.dex */
public class cdj extends RuntimeException {
    public cdj() {
        this(null);
    }

    public cdj(@dd String str) {
        super(C0642s.m2984g(str, "The operation has been canceled."));
    }
}
