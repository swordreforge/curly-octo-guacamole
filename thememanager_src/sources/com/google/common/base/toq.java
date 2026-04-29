package com.google.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: AbstractIterator.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
abstract class toq<T> implements Iterator<T> {

    /* JADX INFO: renamed from: k */
    private EnumC7983toq f25744k = EnumC7983toq.NOT_READY;

    /* JADX INFO: renamed from: q */
    @NullableDecl
    private T f25745q;

    /* JADX INFO: renamed from: com.google.common.base.toq$k */
    /* JADX INFO: compiled from: AbstractIterator.java */
    static /* synthetic */ class C4274k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f25746k;

        static {
            int[] iArr = new int[EnumC7983toq.values().length];
            f25746k = iArr;
            try {
                iArr[EnumC7983toq.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25746k[EnumC7983toq.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractIterator.java */
    private enum EnumC7983toq {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected toq() {
    }

    private boolean zy() {
        this.f25744k = EnumC7983toq.FAILED;
        this.f25745q = mo15311k();
        if (this.f25744k == EnumC7983toq.DONE) {
            return false;
        }
        this.f25744k = EnumC7983toq.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        jk.yz(this.f25744k != EnumC7983toq.FAILED);
        int i2 = C4274k.f25746k[this.f25744k.ordinal()];
        if (i2 == 1) {
            return true;
        }
        if (i2 != 2) {
            return zy();
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    protected abstract T mo15311k();

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f25744k = EnumC7983toq.NOT_READY;
        T t2 = this.f25745q;
        this.f25745q = null;
        return t2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @NullableDecl
    protected final T toq() {
        this.f25744k = EnumC7983toq.DONE;
        return null;
    }
}
