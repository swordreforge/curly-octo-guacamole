package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: AbstractIterator.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class toq<T> implements Iterator<T>, InterfaceC7625k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private ch f36195k = ch.NotReady;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private T f36196q;

    /* JADX INFO: renamed from: kotlin.collections.toq$k */
    /* JADX INFO: compiled from: AbstractIterator.kt */
    public /* synthetic */ class C6164k {

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int[] f36197k;

        static {
            int[] iArr = new int[ch.values().length];
            try {
                iArr[ch.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ch.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36197k = iArr;
        }
    }

    /* JADX INFO: renamed from: g */
    private final boolean m22612g() {
        this.f36195k = ch.Failed;
        mo22435k();
        return this.f36195k == ch.Ready;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ch chVar = this.f36195k;
        if (!(chVar != ch.Failed)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i2 = C6164k.f36197k[chVar.ordinal()];
        if (i2 == 1) {
            return false;
        }
        if (i2 != 2) {
            return m22612g();
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    protected abstract void mo22435k();

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f36195k = ch.NotReady;
        return this.f36196q;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    protected final void toq() {
        this.f36195k = ch.Done;
    }

    protected final void zy(T t2) {
        this.f36196q = t2;
        this.f36195k = ch.Ready;
    }
}
