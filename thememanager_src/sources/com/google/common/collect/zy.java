package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: AbstractIterator.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class zy<T> extends ab<T> {

    /* JADX INFO: renamed from: k */
    private toq f26818k = toq.NOT_READY;

    /* JADX INFO: renamed from: q */
    @NullableDecl
    private T f26819q;

    /* JADX INFO: renamed from: com.google.common.collect.zy$k */
    /* JADX INFO: compiled from: AbstractIterator.java */
    static /* synthetic */ class C4598k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f26820k;

        static {
            int[] iArr = new int[toq.values().length];
            f26820k = iArr;
            try {
                iArr[toq.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26820k[toq.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: AbstractIterator.java */
    private enum toq {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected zy() {
    }

    private boolean zy() {
        this.f26818k = toq.FAILED;
        this.f26819q = mo15703k();
        if (this.f26818k == toq.DONE) {
            return false;
        }
        this.f26818k = toq.READY;
        return true;
    }

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final boolean hasNext() {
        com.google.common.base.jk.yz(this.f26818k != toq.FAILED);
        int i2 = C4598k.f26820k[this.f26818k.ordinal()];
        if (i2 == 1) {
            return false;
        }
        if (i2 != 2) {
            return zy();
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    protected abstract T mo15703k();

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f26818k = toq.NOT_READY;
        T t2 = this.f26819q;
        this.f26819q = null;
        return t2;
    }

    public final T peek() {
        if (hasNext()) {
            return this.f26819q;
        }
        throw new NoSuchElementException();
    }

    @CanIgnoreReturnValue
    protected final T toq() {
        this.f26818k = toq.DONE;
        return null;
    }
}
