package androidx.core.util;

import android.util.SparseArray;
import androidx.exifinterface.media.C0846k;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.settingssearch.C2690k;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import java.util.Iterator;
import kotlin.collections.n5r1;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;
import v5yj.C7704k;

/* JADX INFO: compiled from: SparseArray.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n\u001a0\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002\u001a!\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b\u001a(\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a0\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a6\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b\u001a-\u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a$\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aQ\u0010\u001e\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u001aH\u0086\b\u001a\u0016\u0010 \u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\"\"\u0010%\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {C0846k.zaso, "Landroid/util/SparseArray;", "", InterfaceC1925p.qn, "", "k", "value", "Lkotlin/was;", "n7h", "(Landroid/util/SparseArray;ILjava/lang/Object;)V", C2690k.k.f61039ld6, "ld6", "toq", "zy", "(Landroid/util/SparseArray;Ljava/lang/Object;)Z", "defaultValue", "n", "(Landroid/util/SparseArray;ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", C7704k.y.toq.f95579toq, "(Landroid/util/SparseArray;ILcyoe/k;)Ljava/lang/Object;", AnimatedProperty.PROPERTY_NAME_Y, C7704k.y.toq.f44691k, "qrj", "(Landroid/util/SparseArray;ILjava/lang/Object;)Z", "x2", "Lkotlin/Function2;", "Lkotlin/c;", "name", "action", "q", "Lkotlin/collections/n5r1;", "p", "", "kja0", "f7l8", "(Landroid/util/SparseArray;)I", "size", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class t8r {

    /* JADX INFO: renamed from: androidx.core.util.t8r$k */
    /* JADX INFO: compiled from: SparseArray.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/core/util/t8r$k", "Lkotlin/collections/n5r1;", "", "hasNext", "", "nextInt", "k", com.market.sdk.reflect.toq.f28131g, "()I", "toq", "(I)V", "index", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class C0643k extends n5r1 {

        /* JADX INFO: renamed from: k */
        private int f3891k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ SparseArray f3892q;

        C0643k(SparseArray<T> sparseArray) {
            this.f3892q = sparseArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3891k < this.f3892q.size();
        }

        /* JADX INFO: renamed from: k */
        public final int m2996k() {
            return this.f3891k;
        }

        @Override // kotlin.collections.n5r1
        public int nextInt() {
            SparseArray sparseArray = this.f3892q;
            int i2 = this.f3891k;
            this.f3891k = i2 + 1;
            return sparseArray.keyAt(i2);
        }

        public final void toq(int i2) {
            this.f3891k = i2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SparseArray.kt */
    @d3(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0018\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/core/util/t8r$toq", "", "", "hasNext", "kotlin.jvm.PlatformType", "next", "()Ljava/lang/Object;", "", "k", com.market.sdk.reflect.toq.f28131g, "()I", "toq", "(I)V", "index", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class toq<T> implements Iterator<T>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        private int f3893k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ SparseArray f3894q;

        toq(SparseArray<T> sparseArray) {
            this.f3894q = sparseArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3893k < this.f3894q.size();
        }

        /* JADX INFO: renamed from: k */
        public final int m2997k() {
            return this.f3893k;
        }

        @Override // java.util.Iterator
        public T next() {
            SparseArray sparseArray = this.f3894q;
            int i2 = this.f3893k;
            this.f3893k = i2 + 1;
            return (T) sparseArray.valueAt(i2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void toq(int i2) {
            this.f3893k = i2;
        }
    }

    public static final <T> int f7l8(@InterfaceC7396q SparseArray<T> size) {
        d2ok.cdj(size, "$this$size");
        return size.size();
    }

    /* JADX INFO: renamed from: g */
    public static final <T> T m2989g(@InterfaceC7396q SparseArray<T> getOrElse, int i2, @InterfaceC7396q InterfaceC5981k<? extends T> defaultValue) {
        d2ok.cdj(getOrElse, "$this$getOrElse");
        d2ok.cdj(defaultValue, "defaultValue");
        T t2 = getOrElse.get(i2);
        return t2 != null ? t2 : defaultValue.invoke();
    }

    /* JADX INFO: renamed from: k */
    public static final <T> boolean m2990k(@InterfaceC7396q SparseArray<T> contains, int i2) {
        d2ok.cdj(contains, "$this$contains");
        return contains.indexOfKey(i2) >= 0;
    }

    @InterfaceC7396q
    public static final <T> Iterator<T> kja0(@InterfaceC7396q SparseArray<T> valueIterator) {
        d2ok.cdj(valueIterator, "$this$valueIterator");
        return new toq(valueIterator);
    }

    @InterfaceC7396q
    public static final <T> SparseArray<T> ld6(@InterfaceC7396q SparseArray<T> plus, @InterfaceC7396q SparseArray<T> other) {
        d2ok.cdj(plus, "$this$plus");
        d2ok.cdj(other, "other");
        SparseArray<T> sparseArray = new SparseArray<>(plus.size() + other.size());
        x2(sparseArray, plus);
        x2(sparseArray, other);
        return sparseArray;
    }

    /* JADX INFO: renamed from: n */
    public static final <T> T m2991n(@InterfaceC7396q SparseArray<T> getOrDefault, int i2, T t2) {
        d2ok.cdj(getOrDefault, "$this$getOrDefault");
        T t3 = getOrDefault.get(i2);
        return t3 != null ? t3 : t2;
    }

    public static final <T> void n7h(@InterfaceC7396q SparseArray<T> set, int i2, T t2) {
        d2ok.cdj(set, "$this$set");
        set.put(i2, t2);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public static final <T> n5r1 m2992p(@InterfaceC7396q SparseArray<T> keyIterator) {
        d2ok.cdj(keyIterator, "$this$keyIterator");
        return new C0643k(keyIterator);
    }

    /* JADX INFO: renamed from: q */
    public static final <T> void m2993q(@InterfaceC7396q SparseArray<T> forEach, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, was> action) {
        d2ok.cdj(forEach, "$this$forEach");
        d2ok.cdj(action, "action");
        int size = forEach.size();
        for (int i2 = 0; i2 < size; i2++) {
            action.invoke(Integer.valueOf(forEach.keyAt(i2)), forEach.valueAt(i2));
        }
    }

    public static final <T> boolean qrj(@InterfaceC7396q SparseArray<T> remove, int i2, T t2) {
        d2ok.cdj(remove, "$this$remove");
        int iIndexOfKey = remove.indexOfKey(i2);
        if (iIndexOfKey == -1 || !d2ok.f7l8(t2, remove.valueAt(iIndexOfKey))) {
            return false;
        }
        remove.removeAt(iIndexOfKey);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static final <T> boolean m2994s(@InterfaceC7396q SparseArray<T> isNotEmpty) {
        d2ok.cdj(isNotEmpty, "$this$isNotEmpty");
        return isNotEmpty.size() != 0;
    }

    public static final <T> boolean toq(@InterfaceC7396q SparseArray<T> containsKey, int i2) {
        d2ok.cdj(containsKey, "$this$containsKey");
        return containsKey.indexOfKey(i2) >= 0;
    }

    public static final <T> void x2(@InterfaceC7396q SparseArray<T> putAll, @InterfaceC7396q SparseArray<T> other) {
        d2ok.cdj(putAll, "$this$putAll");
        d2ok.cdj(other, "other");
        int size = other.size();
        for (int i2 = 0; i2 < size; i2++) {
            putAll.put(other.keyAt(i2), other.valueAt(i2));
        }
    }

    /* JADX INFO: renamed from: y */
    public static final <T> boolean m2995y(@InterfaceC7396q SparseArray<T> isEmpty) {
        d2ok.cdj(isEmpty, "$this$isEmpty");
        return isEmpty.size() == 0;
    }

    public static final <T> boolean zy(@InterfaceC7396q SparseArray<T> containsValue, T t2) {
        d2ok.cdj(containsValue, "$this$containsValue");
        return containsValue.indexOfValue(t2) != -1;
    }
}
