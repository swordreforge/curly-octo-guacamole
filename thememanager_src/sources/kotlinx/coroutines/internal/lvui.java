package kotlinx.coroutines.internal;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import java.util.concurrent.atomic.AtomicReferenceArray;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ResizableAtomicArray.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0004\u001a\u00020\u0003J\u001a\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/internal/lvui;", C0846k.zaso, "", "", "k", "index", "toq", "(I)Ljava/lang/Object;", "value", "Lkotlin/was;", "zy", "(ILjava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "array", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "initialLength", C4991s.f28129n, "(I)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class lvui<T> {

    @InterfaceC7396q
    private volatile AtomicReferenceArray<T> array;

    public lvui(int i2) {
        this.array = new AtomicReferenceArray<>(i2);
    }

    /* JADX INFO: renamed from: k */
    public final int m24366k() {
        return this.array.length();
    }

    @InterfaceC7395n
    public final T toq(int i2) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i2 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i2);
        }
        return null;
    }

    public final void zy(int i2, @InterfaceC7395n T t2) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i2 < length) {
            atomicReferenceArray.set(i2, t2);
            return;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(kotlin.ranges.fn3e.fn3e(i2 + 1, length * 2));
        for (int i3 = 0; i3 < length; i3++) {
            atomicReferenceArray2.set(i3, atomicReferenceArray.get(i3));
        }
        atomicReferenceArray2.set(i2, t2);
        this.array = atomicReferenceArray2;
    }
}
