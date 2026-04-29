package androidx.core.util;

import android.util.LongSparseArray;
import androidx.exifinterface.media.C0846k;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.settingssearch.C2690k;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import java.util.Iterator;
import kotlin.collections.hyr;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;
import v5yj.C7704k;

/* JADX INFO: compiled from: LongSparseArray.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u001a0\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087\u0002\u001a!\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a(\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\r\u0010\u000e\u001a0\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a6\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0087\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087\b\u001a\u0019\u0010\u0016\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087\b\u001a/\u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a&\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001aQ\u0010\u001e\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u001aH\u0087\b\u001a\u0018\u0010 \u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\"\"\u0010&\u001a\u00020#\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Ç\u0002¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {C0846k.zaso, "Landroid/util/LongSparseArray;", "", InterfaceC1925p.qn, "", "k", "value", "Lkotlin/was;", "n7h", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)V", C2690k.k.f61039ld6, "ld6", "toq", "zy", "(Landroid/util/LongSparseArray;Ljava/lang/Object;)Z", "defaultValue", "n", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", C7704k.y.toq.f95579toq, "(Landroid/util/LongSparseArray;JLcyoe/k;)Ljava/lang/Object;", AnimatedProperty.PROPERTY_NAME_Y, C7704k.y.toq.f44691k, "qrj", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Z", "x2", "Lkotlin/Function2;", "Lkotlin/c;", "name", "action", "q", "Lkotlin/collections/hyr;", "p", "", "kja0", "", "f7l8", "(Landroid/util/LongSparseArray;)I", "size", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class f7l8 {

    /* JADX INFO: renamed from: androidx.core.util.f7l8$k */
    /* JADX INFO: compiled from: LongSparseArray.kt */
    @d3(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"androidx/core/util/f7l8$k", "Lkotlin/collections/hyr;", "", "hasNext", "", "nextLong", "", "k", com.market.sdk.reflect.toq.f28131g, "()I", "toq", "(I)V", "index", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class C0632k extends hyr {

        /* JADX INFO: renamed from: k */
        private int f3868k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ LongSparseArray f3869q;

        C0632k(LongSparseArray<T> longSparseArray) {
            this.f3869q = longSparseArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3868k < this.f3869q.size();
        }

        /* JADX INFO: renamed from: k */
        public final int m2931k() {
            return this.f3868k;
        }

        @Override // kotlin.collections.hyr
        public long nextLong() {
            LongSparseArray longSparseArray = this.f3869q;
            int i2 = this.f3868k;
            this.f3868k = i2 + 1;
            return longSparseArray.keyAt(i2);
        }

        public final void toq(int i2) {
            this.f3868k = i2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: LongSparseArray.kt */
    @d3(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0018\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/core/util/f7l8$toq", "", "", "hasNext", "kotlin.jvm.PlatformType", "next", "()Ljava/lang/Object;", "", "k", com.market.sdk.reflect.toq.f28131g, "()I", "toq", "(I)V", "index", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class toq<T> implements Iterator<T>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        private int f3870k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ LongSparseArray f3871q;

        toq(LongSparseArray<T> longSparseArray) {
            this.f3871q = longSparseArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3870k < this.f3871q.size();
        }

        /* JADX INFO: renamed from: k */
        public final int m2932k() {
            return this.f3870k;
        }

        @Override // java.util.Iterator
        public T next() {
            LongSparseArray longSparseArray = this.f3871q;
            int i2 = this.f3870k;
            this.f3870k = i2 + 1;
            return (T) longSparseArray.valueAt(i2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void toq(int i2) {
            this.f3870k = i2;
        }
    }

    @zy.hyr(16)
    public static final <T> int f7l8(@InterfaceC7396q LongSparseArray<T> size) {
        d2ok.cdj(size, "$this$size");
        return size.size();
    }

    @zy.hyr(16)
    /* JADX INFO: renamed from: g */
    public static final <T> T m2924g(@InterfaceC7396q LongSparseArray<T> getOrElse, long j2, @InterfaceC7396q InterfaceC5981k<? extends T> defaultValue) {
        d2ok.cdj(getOrElse, "$this$getOrElse");
        d2ok.cdj(defaultValue, "defaultValue");
        T t2 = getOrElse.get(j2);
        return t2 != null ? t2 : defaultValue.invoke();
    }

    @zy.hyr(16)
    /* JADX INFO: renamed from: k */
    public static final <T> boolean m2925k(@InterfaceC7396q LongSparseArray<T> contains, long j2) {
        d2ok.cdj(contains, "$this$contains");
        return contains.indexOfKey(j2) >= 0;
    }

    @InterfaceC7396q
    @zy.hyr(16)
    public static final <T> Iterator<T> kja0(@InterfaceC7396q LongSparseArray<T> valueIterator) {
        d2ok.cdj(valueIterator, "$this$valueIterator");
        return new toq(valueIterator);
    }

    @InterfaceC7396q
    @zy.hyr(16)
    public static final <T> LongSparseArray<T> ld6(@InterfaceC7396q LongSparseArray<T> plus, @InterfaceC7396q LongSparseArray<T> other) {
        d2ok.cdj(plus, "$this$plus");
        d2ok.cdj(other, "other");
        LongSparseArray<T> longSparseArray = new LongSparseArray<>(plus.size() + other.size());
        x2(longSparseArray, plus);
        x2(longSparseArray, other);
        return longSparseArray;
    }

    @zy.hyr(16)
    /* JADX INFO: renamed from: n */
    public static final <T> T m2926n(@InterfaceC7396q LongSparseArray<T> getOrDefault, long j2, T t2) {
        d2ok.cdj(getOrDefault, "$this$getOrDefault");
        T t3 = getOrDefault.get(j2);
        return t3 != null ? t3 : t2;
    }

    @zy.hyr(16)
    public static final <T> void n7h(@InterfaceC7396q LongSparseArray<T> set, long j2, T t2) {
        d2ok.cdj(set, "$this$set");
        set.put(j2, t2);
    }

    @InterfaceC7396q
    @zy.hyr(16)
    /* JADX INFO: renamed from: p */
    public static final <T> hyr m2927p(@InterfaceC7396q LongSparseArray<T> keyIterator) {
        d2ok.cdj(keyIterator, "$this$keyIterator");
        return new C0632k(keyIterator);
    }

    @zy.hyr(16)
    /* JADX INFO: renamed from: q */
    public static final <T> void m2928q(@InterfaceC7396q LongSparseArray<T> forEach, @InterfaceC7396q InterfaceC5979h<? super Long, ? super T, was> action) {
        d2ok.cdj(forEach, "$this$forEach");
        d2ok.cdj(action, "action");
        int size = forEach.size();
        for (int i2 = 0; i2 < size; i2++) {
            action.invoke(Long.valueOf(forEach.keyAt(i2)), forEach.valueAt(i2));
        }
    }

    @zy.hyr(16)
    public static final <T> boolean qrj(@InterfaceC7396q LongSparseArray<T> remove, long j2, T t2) {
        d2ok.cdj(remove, "$this$remove");
        int iIndexOfKey = remove.indexOfKey(j2);
        if (iIndexOfKey == -1 || !d2ok.f7l8(t2, remove.valueAt(iIndexOfKey))) {
            return false;
        }
        remove.removeAt(iIndexOfKey);
        return true;
    }

    @zy.hyr(16)
    /* JADX INFO: renamed from: s */
    public static final <T> boolean m2929s(@InterfaceC7396q LongSparseArray<T> isNotEmpty) {
        d2ok.cdj(isNotEmpty, "$this$isNotEmpty");
        return isNotEmpty.size() != 0;
    }

    @zy.hyr(16)
    public static final <T> boolean toq(@InterfaceC7396q LongSparseArray<T> containsKey, long j2) {
        d2ok.cdj(containsKey, "$this$containsKey");
        return containsKey.indexOfKey(j2) >= 0;
    }

    @zy.hyr(16)
    public static final <T> void x2(@InterfaceC7396q LongSparseArray<T> putAll, @InterfaceC7396q LongSparseArray<T> other) {
        d2ok.cdj(putAll, "$this$putAll");
        d2ok.cdj(other, "other");
        int size = other.size();
        for (int i2 = 0; i2 < size; i2++) {
            putAll.put(other.keyAt(i2), other.valueAt(i2));
        }
    }

    @zy.hyr(16)
    /* JADX INFO: renamed from: y */
    public static final <T> boolean m2930y(@InterfaceC7396q LongSparseArray<T> isEmpty) {
        d2ok.cdj(isEmpty, "$this$isEmpty");
        return isEmpty.size() == 0;
    }

    @zy.hyr(16)
    public static final <T> boolean zy(@InterfaceC7396q LongSparseArray<T> containsValue, T t2) {
        d2ok.cdj(containsValue, "$this$containsValue");
        return containsValue.indexOfValue(t2) != -1;
    }
}
