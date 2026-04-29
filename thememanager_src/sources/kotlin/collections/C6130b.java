package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.collections.b */
/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n205#1:209\n205#1:210\n205#1:211\n1#2:208\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:209\n176#1:210\n189#1:211\n*E\n"})
final class C6130b<T> extends zy<T> implements RandomAccess {

    /* JADX INFO: renamed from: g */
    private int f36109g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final Object[] f36110k;

    /* JADX INFO: renamed from: n */
    private int f36111n;

    /* JADX INFO: renamed from: q */
    private final int f36112q;

    /* JADX INFO: renamed from: kotlin.collections.b$k */
    /* JADX INFO: compiled from: SlidingWindow.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n+ 2 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n1#1,207:1\n205#2:208\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n*L\n121#1:208\n*E\n"})
    public static final class k extends toq<T> {

        /* JADX INFO: renamed from: g */
        private int f36113g;

        /* JADX INFO: renamed from: n */
        private int f36114n;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C6130b<T> f36115y;

        k(C6130b<T> c6130b) {
            this.f36115y = c6130b;
            this.f36114n = c6130b.size();
            this.f36113g = ((C6130b) c6130b).f36111n;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.toq
        /* JADX INFO: renamed from: k */
        protected void mo22435k() {
            if (this.f36114n == 0) {
                toq();
                return;
            }
            zy(((C6130b) this.f36115y).f36110k[this.f36113g]);
            this.f36113g = (this.f36113g + 1) % ((C6130b) this.f36115y).f36112q;
            this.f36114n--;
        }
    }

    public C6130b(@InterfaceC7396q Object[] buffer, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(buffer, "buffer");
        this.f36110k = buffer;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i2).toString());
        }
        if (i2 <= buffer.length) {
            this.f36112q = buffer.length;
            this.f36109g = i2;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i2 + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    /* JADX INFO: renamed from: y */
    private final int m22431y(int i2, int i3) {
        return (i2 + i3) % this.f36112q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public final C6130b<T> f7l8(int i2) {
        Object[] array;
        int i3 = this.f36112q;
        int iM23305t = kotlin.ranges.fn3e.m23305t(i3 + (i3 >> 1) + 1, i2);
        if (this.f36111n == 0) {
            array = Arrays.copyOf(this.f36110k, iM23305t);
            kotlin.jvm.internal.d2ok.kja0(array, "copyOf(this, newSize)");
        } else {
            array = toArray(new Object[iM23305t]);
        }
        return new C6130b<>(array, size());
    }

    /* JADX INFO: renamed from: g */
    public final void m22432g(T t2) {
        if (m22434s()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f36110k[(this.f36111n + size()) % this.f36112q] = t2;
        this.f36109g = size() + 1;
    }

    @Override // kotlin.collections.zy, java.util.List
    public T get(int i2) {
        zy.Companion.toq(i2, size());
        return (T) this.f36110k[(this.f36111n + i2) % this.f36112q];
    }

    @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k
    public int getSize() {
        return this.f36109g;
    }

    @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k, java.util.Collection, java.lang.Iterable, java.util.List
    @InterfaceC7396q
    public Iterator<T> iterator() {
        return new k(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m22433p(int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i2).toString());
        }
        if (!(i2 <= size())) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i2 + ", size = " + size()).toString());
        }
        if (i2 > 0) {
            int i3 = this.f36111n;
            int i4 = (i3 + i2) % this.f36112q;
            if (i3 > i4) {
                kja0.vy(this.f36110k, null, i3, this.f36112q);
                kja0.vy(this.f36110k, null, 0, i4);
            } else {
                kja0.vy(this.f36110k, null, i3, i4);
            }
            this.f36111n = i4;
            this.f36109g = size() - i2;
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m22434s() {
        return size() == this.f36112q;
    }

    @Override // kotlin.collections.AbstractC6147k, java.util.Collection, java.util.List
    @InterfaceC7396q
    public <T> T[] toArray(@InterfaceC7396q T[] array) {
        kotlin.jvm.internal.d2ok.m23075h(array, "array");
        if (array.length < size()) {
            array = (T[]) Arrays.copyOf(array, size());
            kotlin.jvm.internal.d2ok.kja0(array, "copyOf(this, newSize)");
        }
        int size = size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = this.f36111n; i3 < size && i4 < this.f36112q; i4++) {
            array[i3] = this.f36110k[i4];
            i3++;
        }
        while (i3 < size) {
            array[i3] = this.f36110k[i2];
            i3++;
            i2++;
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }

    public C6130b(int i2) {
        this(new Object[i2], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractC6147k, java.util.Collection, java.util.List
    @InterfaceC7396q
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
